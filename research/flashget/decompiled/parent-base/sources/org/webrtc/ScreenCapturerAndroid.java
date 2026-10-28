package org.webrtc;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Environment;
import android.view.PixelCopy;
import android.view.Surface;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@TargetApi(21)
/* loaded from: classes9.dex */
public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    private static final int DISPLAY_FLAGS = 3;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private static int height;
    private static String mPath;
    private static Surface mSurface;

    @androidx.annotation.q0
    private static SurfaceTextureHelper surfaceTextureHelper;
    private static int width;

    @androidx.annotation.q0
    private CapturerObserver capturerObserver;
    private boolean isDisposed;
    private boolean mIsPasue;

    @androidx.annotation.q0
    private MediaProjection mediaProjection;
    private final MediaProjection.Callback mediaProjectionCallback;

    @androidx.annotation.q0
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;

    @androidx.annotation.q0
    private VirtualDisplay virtualDisplay;

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createVirtualDisplay() {
        surfaceTextureHelper.setTextureSize(width, height);
        Surface surface = new Surface(surfaceTextureHelper.getSurfaceTexture());
        mSurface = surface;
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", width, height, 400, 3, surface, null, null);
    }

    private static String getPathByFileNameInSdcard(String str) {
        File file = new File(getSdcardPath(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private static String getSdcardPath() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String newSaveScreenshotFile() {
        return getPathByFileNameInSdcard("DCIM/Screenshots") + "/" + System.currentTimeMillis() + ".jpg";
    }

    @androidx.annotation.x0(api = 24)
    public static String saveToFile() {
        String str;
        if (mSurface == null) {
            return null;
        }
        mPath = null;
        final Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        PixelCopy.request(mSurface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: org.webrtc.ScreenCapturerAndroid.3
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public void onPixelCopyFinished(int i4) {
                if (i4 == 0) {
                    ScreenCapturerAndroid.mPath = ScreenCapturerAndroid.newSaveScreenshotFile();
                    File file = new File(ScreenCapturerAndroid.mPath);
                    try {
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                        fileOutputStream.write(byteArrayOutputStream.toByteArray());
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    ScreenCapturerAndroid.mPath = file.getAbsolutePath();
                }
            }
        }, surfaceTextureHelper.getHandler());
        int i4 = 0;
        while (true) {
            str = mPath;
            if (str != null || (i4 = i4 + 1) > 30) {
                break;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
        }
        return str;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i4, int i5, int i6) {
        checkNotDisposed();
        width = i4;
        height = i5;
        if (this.virtualDisplay == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(surfaceTextureHelper.getHandler(), new Runnable() { // from class: org.webrtc.ScreenCapturerAndroid.2
            @Override // java.lang.Runnable
            public void run() {
                ScreenCapturerAndroid.this.virtualDisplay.release();
                ScreenCapturerAndroid.this.createVirtualDisplay();
            }
        });
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        this.isDisposed = true;
    }

    @androidx.annotation.q0
    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper2, Context context, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new RuntimeException("capturerObserver not set.");
        }
        this.capturerObserver = capturerObserver;
        if (surfaceTextureHelper2 == null) {
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
        surfaceTextureHelper = surfaceTextureHelper2;
        this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.numCapturedFrames++;
        if (this.mIsPasue) {
            return;
        }
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    @Override // org.webrtc.VideoCapturer
    public void pauseCapture(boolean z4) {
        this.mIsPasue = z4;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized boolean startCapture(int i4, int i5, int i6) {
        checkNotDisposed();
        width = i4;
        height = i5;
        MediaProjection mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
        this.mediaProjection = mediaProjection;
        mediaProjection.registerCallback(this.mediaProjectionCallback, surfaceTextureHelper.getHandler());
        createVirtualDisplay();
        this.capturerObserver.onCapturerStarted(true);
        surfaceTextureHelper.startListening(this);
        return true;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(surfaceTextureHelper.getHandler(), new Runnable() { // from class: org.webrtc.ScreenCapturerAndroid.1
            @Override // java.lang.Runnable
            public void run() {
                ScreenCapturerAndroid.surfaceTextureHelper.stopListening();
                ScreenCapturerAndroid.this.capturerObserver.onCapturerStopped();
                if (ScreenCapturerAndroid.this.virtualDisplay != null) {
                    ScreenCapturerAndroid.this.virtualDisplay.release();
                    ScreenCapturerAndroid.this.virtualDisplay = null;
                }
                if (ScreenCapturerAndroid.this.mediaProjection != null) {
                    ScreenCapturerAndroid.this.mediaProjection.unregisterCallback(ScreenCapturerAndroid.this.mediaProjectionCallback);
                    ScreenCapturerAndroid.this.mediaProjection.stop();
                    ScreenCapturerAndroid.this.mediaProjection = null;
                }
            }
        });
    }
}
