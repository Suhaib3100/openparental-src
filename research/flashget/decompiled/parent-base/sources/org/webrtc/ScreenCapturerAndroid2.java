package org.webrtc;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Environment;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.sand.airdroid.common.jni.YuvUtils;
import com.sand.common.f2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.webrtc.VideoFrame;

@TargetApi(21)
@Deprecated
/* loaded from: classes9.dex */
public class ScreenCapturerAndroid2 implements VideoCapturer {
    private static final int CHECK_LISTENER_TIME = 3000;
    private static final int DEFAULT_LUM = 2560;
    private static final int DISPLAY_FLAGS = 3;
    private static final int MAX_FRAME_COUNT = 360;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private static int height;
    private static final Logger logger = Logger.getLogger(ProtectedSandApp.s("ꓧ\u0001"));
    private static int mBlockColor;
    private static String mBlockText;
    private static int mBlockTextColor;
    private static float mBlockTextSizeSp;
    private static boolean mIsBlockOn;
    private static boolean mIsIncreaseBrightNess;
    private static byte[] mLastByteData;
    private static int width;
    private Context applicationContext;

    @androidx.annotation.q0
    private CapturerObserver capturerObserver;
    private boolean isDisposed;
    private Handler mCallBackHandler;
    private Object mCaptureFormatLock;
    private CaptureMODE mCaptureMODE;
    private String mCaptureName;
    private int mDpi;
    int mFrameCount;
    private Runnable mGetImageRunnable;
    private ImageReader mImageReader;
    private int mInitOri;
    private boolean mIsCapturerObserverStart;
    private boolean mIsNeedAppendRotation;
    private boolean mIsPasue;
    private int mLastOri;
    private VideoFrame.VideoQualityMode mMode;
    View mTransparentView;
    private WindowManager mWindowManager;

    @androidx.annotation.q0
    private MediaProjection mediaProjection;
    private final MediaProjection.Callback mediaProjectionCallback;

    @androidx.annotation.q0
    private MediaProjectionManager mediaProjectionManager;
    private Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;

    @androidx.annotation.q0
    private SurfaceTextureHelper surfaceTextureHelper;

    @androidx.annotation.q0
    private VirtualDisplay virtualDisplay;

    public enum CaptureMODE {
        LISTENER_MODE,
        MANUALLY_MODE,
        MIX_MODE,
        SNAPSHOT_MODE
    }

    public ScreenCapturerAndroid2(Intent intent, MediaProjection.Callback callback) {
        this.mIsNeedAppendRotation = true;
        this.numCapturedFrames = 0L;
        this.isDisposed = false;
        this.mIsPasue = false;
        this.mCaptureFormatLock = new Object();
        this.mGetImageRunnable = new Runnable() { // from class: org.webrtc.ScreenCapturerAndroid2.3
            @Override // java.lang.Runnable
            public void run() {
                if (ScreenCapturerAndroid2.this.mImageReader == null || !ScreenCapturerAndroid2.this.mIsCapturerObserverStart) {
                    return;
                }
                ScreenCapturerAndroid2.this.surfaceTextureHelper.getHandler().removeCallbacks(ScreenCapturerAndroid2.this.mGetImageRunnable);
                try {
                    ScreenCapturerAndroid2.this.processGetImage();
                    ScreenCapturerAndroid2 screenCapturerAndroid2 = ScreenCapturerAndroid2.this;
                    if (screenCapturerAndroid2.mFrameCount >= ScreenCapturerAndroid2.MAX_FRAME_COUNT) {
                        ScreenCapturerAndroid2.logger.debug("image listener");
                        ScreenCapturerAndroid2.this.initImageReaderListener();
                    } else {
                        if (screenCapturerAndroid2.mCaptureMODE == CaptureMODE.MIX_MODE) {
                            ScreenCapturerAndroid2.this.mFrameCount++;
                        }
                        ScreenCapturerAndroid2.this.surfaceTextureHelper.getHandler().postDelayed(ScreenCapturerAndroid2.this.mGetImageRunnable, 10L);
                    }
                } catch (Throwable th) {
                    ScreenCapturerAndroid2 screenCapturerAndroid22 = ScreenCapturerAndroid2.this;
                    if (screenCapturerAndroid22.mFrameCount < ScreenCapturerAndroid2.MAX_FRAME_COUNT) {
                        if (screenCapturerAndroid22.mCaptureMODE == CaptureMODE.MIX_MODE) {
                            ScreenCapturerAndroid2.this.mFrameCount++;
                        }
                        ScreenCapturerAndroid2.this.surfaceTextureHelper.getHandler().postDelayed(ScreenCapturerAndroid2.this.mGetImageRunnable, 10L);
                    } else {
                        ScreenCapturerAndroid2.logger.debug("image listener");
                        ScreenCapturerAndroid2.this.initImageReaderListener();
                    }
                    throw th;
                }
            }
        };
        logger.debug(ProtectedSandApp.s("ꓨ\u0001"));
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
        this.mFrameCount = 0;
        this.mMode = VideoFrame.VideoQualityMode.MODE_AUTO_LIMIT_MIN_LEN;
        this.mCaptureMODE = CaptureMODE.MIX_MODE;
    }

    private boolean checkBufferIsEnoughForBitmap(Buffer buffer, Bitmap bitmap) {
        char c5;
        if (bitmap == null) {
            return false;
        }
        int remaining = buffer.remaining();
        if (buffer instanceof ByteBuffer) {
            c5 = 0;
        } else if (buffer instanceof ShortBuffer) {
            c5 = 1;
        } else {
            if (!(buffer instanceof IntBuffer)) {
                throw new RuntimeException(ProtectedSandApp.s("ꓪ\u0001"));
            }
            c5 = 2;
        }
        if ((remaining << c5) >= bitmap.getByteCount()) {
            return true;
        }
        logger.error(ProtectedSandApp.s("ꓩ\u0001"));
        return false;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException(ProtectedSandApp.s("ꓫ\u0001"));
        }
    }

    private boolean checkOrientation() {
        int frameOrientation = getFrameOrientation();
        int i4 = this.mLastOri;
        return (i4 == frameOrientation || i4 + frameOrientation == 180 || i4 + frameOrientation == MAX_FRAME_COUNT) ? false : true;
    }

    public static Bitmap createSolidColorBitmap(Bitmap bitmap, int i4, String str, int i5, float f4) {
        bitmap.eraseColor(i4);
        float min = (f4 * Math.min(bitmap.getWidth(), bitmap.getHeight())) / 320.0f;
        if (str != null && !str.isEmpty()) {
            Canvas canvas = new Canvas(bitmap);
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(min);
            textPaint.setColor(i5);
            textPaint.setAntiAlias(true);
            textPaint.setStyle(Paint.Style.FILL);
            StaticLayout staticLayout = new StaticLayout(str, textPaint, canvas.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            canvas.translate(0.0f, (canvas.getHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(canvas);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createVirtualDisplay() {
        if (this.mImageReader != null) {
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.mGetImageRunnable);
            this.mImageReader.setOnImageAvailableListener(null, this.surfaceTextureHelper.getHandler());
            try {
                logger.debug(ProtectedSandApp.s("ꓬ\u0001"));
                this.mImageReader.close();
            } catch (Exception e4) {
                com.flashget.kid.common.servers.forward.data.a.a(e4, new StringBuilder(ProtectedSandApp.s("ꓭ\u0001")), logger);
            }
        }
        this.mImageReader = ImageReader.newInstance(width, height, 1, 2);
        if (TextUtils.isEmpty(this.mCaptureName)) {
            this.mCaptureName = ProtectedSandApp.s("ꓮ\u0001");
        }
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay(this.mCaptureName, width, height, 400, 16, this.mImageReader.getSurface(), null, null);
        this.mFrameCount = 0;
        mLastByteData = null;
        startGetImage();
    }

    private static String getPathByFileNameInSdcard(String str) {
        File file = new File(getSdcardPath(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private byte[] getScreenshot2() throws IOException {
        byte[] bArr;
        Bitmap bitmap;
        Bitmap bitmap2;
        Logger logger2 = logger;
        logger2.debug(ProtectedSandApp.s("ꓯ\u0001"));
        ImageReader imageReader = this.mImageReader;
        if (imageReader == null) {
            logger2.error(ProtectedSandApp.s("ꓰ\u0001"));
            return null;
        }
        try {
            Image acquireLatestImage = imageReader.acquireLatestImage();
            String s4 = ProtectedSandApp.s("ꓱ\u0001");
            String s5 = ProtectedSandApp.s("ꓲ\u0001");
            if (acquireLatestImage == null) {
                if (!this.mIsPasue && (bArr = mLastByteData) != null && bArr.length > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(mLastByteData));
                    if (mIsBlockOn) {
                        createBitmap = createSolidColorBitmap(createBitmap, mBlockColor, mBlockText, mBlockTextColor, mBlockTextSizeSp);
                    } else if (mIsIncreaseBrightNess) {
                        createBitmap = f2.a(createBitmap, DEFAULT_LUM);
                        StringBuilder sb = new StringBuilder(s5);
                        sb.append(width);
                        sb.append(s4);
                        com.flashget.kid.common.requests.uploadfile.a.a(sb, height, logger2);
                    }
                    sendFrame(processBitmapToJavaI420Buffer(createBitmap));
                    createBitmap.recycle();
                }
                logger2.warn(ProtectedSandApp.s("ꓶ\u0001"));
                return null;
            }
            Image.Plane[] planes = acquireLatestImage.getPlanes();
            Buffer buffer = planes[0].getBuffer();
            int pixelStride = planes[0].getPixelStride();
            int rowStride = planes[0].getRowStride() - (width * pixelStride);
            acquireLatestImage.close();
            if (buffer == null) {
                logger2.warn(ProtectedSandApp.s("ꓳ\u0001"));
                return null;
            }
            if (mIsBlockOn) {
                bitmap2 = createSolidColorBitmap(Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444), mBlockColor, mBlockText, mBlockTextColor, mBlockTextSizeSp);
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap((rowStride / pixelStride) + width, height, Bitmap.Config.ARGB_8888);
                if (!checkBufferIsEnoughForBitmap(buffer, createBitmap2)) {
                    if (createBitmap2 != null) {
                        createBitmap2.recycle();
                    }
                    return null;
                }
                createBitmap2.copyPixelsFromBuffer(buffer);
                Bitmap createBitmap3 = Bitmap.createBitmap(createBitmap2, 0, 0, width, height);
                if (mIsIncreaseBrightNess) {
                    bitmap = f2.a(createBitmap3, DEFAULT_LUM);
                    StringBuilder sb2 = new StringBuilder(s5);
                    sb2.append(width);
                    sb2.append(s4);
                    com.flashget.kid.common.requests.uploadfile.a.a(sb2, height, logger2);
                } else {
                    bitmap = createBitmap3;
                }
                createBitmap2.recycle();
                bitmap2 = bitmap;
            }
            if (this.mIsPasue || bitmap2 == null) {
                logger2.debug(ProtectedSandApp.s("ꓵ\u0001"));
            } else {
                if (this.mCaptureMODE == CaptureMODE.SNAPSHOT_MODE) {
                    logger2.debug(ProtectedSandApp.s("ꓴ\u0001"));
                    this.capturerObserver.onBitmapCaptured(bitmap2);
                    return null;
                }
                sendFrame(processBitmapToJavaI420Buffer(bitmap2));
            }
            ByteBuffer allocate = ByteBuffer.allocate(bitmap2.getByteCount());
            bitmap2.copyPixelsToBuffer(allocate);
            mLastByteData = allocate.array();
            bitmap2.recycle();
            return null;
        } catch (Exception e4) {
            com.flashget.kid.common.servers.forward.data.a.a(e4, new StringBuilder(ProtectedSandApp.s("ꓷ\u0001")), logger);
            return null;
        }
    }

    private static String getSdcardPath() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    private void handleErrorOfImage() {
        ImageReader imageReader = this.mImageReader;
        if (imageReader != null) {
            try {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                if (acquireLatestImage != null) {
                    acquireLatestImage.close();
                }
            } catch (Exception e4) {
                logger.error(ProtectedSandApp.s("ꓸ\u0001") + Log.getStackTraceString(e4));
            }
        }
    }

    private void handleRotateChanged() {
        releaseResource();
        renewResource();
    }

    public static void increaseBrightNess(boolean z4) {
        mIsIncreaseBrightNess = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initImageReaderListener() {
        try {
            Image acquireLatestImage = this.mImageReader.acquireLatestImage();
            if (acquireLatestImage != null) {
                logger.error(ProtectedSandApp.s("ꓹ\u0001"));
                acquireLatestImage.close();
            }
        } catch (Exception e4) {
            com.flashget.kid.common.servers.forward.data.a.a(e4, new StringBuilder(ProtectedSandApp.s("ꓺ\u0001")), logger);
        }
        this.mImageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: org.webrtc.ScreenCapturerAndroid2.4
            @Override // android.media.ImageReader.OnImageAvailableListener
            public void onImageAvailable(ImageReader imageReader) {
                ScreenCapturerAndroid2.this.surfaceTextureHelper.getHandler().removeCallbacks(ScreenCapturerAndroid2.this.mGetImageRunnable);
                ThreadUtils.invokeAtFrontUninterruptibly(ScreenCapturerAndroid2.this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: org.webrtc.ScreenCapturerAndroid2.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ScreenCapturerAndroid2.this.mImageReader == null || !ScreenCapturerAndroid2.this.mIsCapturerObserverStart) {
                            return;
                        }
                        ScreenCapturerAndroid2.this.processGetImage();
                    }
                });
            }
        }, this.surfaceTextureHelper.getHandler());
    }

    private static String newSaveScreenshotFile() {
        return getPathByFileNameInSdcard(ProtectedSandApp.s("ꓻ\u0001")) + ProtectedSandApp.s("ꓼ\u0001") + System.currentTimeMillis() + ProtectedSandApp.s("ꓽ\u0001");
    }

    private JavaI420Buffer processBitmapToJavaI420Buffer(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int i4 = width;
        int i5 = height;
        int i6 = i4 * i5;
        int i7 = (i6 * 3) / 2;
        int i10 = i6 / 4;
        YuvUtils.allocateMemo(i7, i6 * 4, i7);
        byte[] bArr = new byte[i7];
        YuvUtils.rgbToYuvBylibyuv(bitmap, bArr);
        YuvUtils.releaseMemo();
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i4, i5);
        allocate.getDataY().put(bArr, 0, i6).flip();
        allocate.getDataU().put(bArr, i6, i10).flip();
        allocate.getDataV().put(bArr, i6 + i10, i10).flip();
        return allocate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processGetImage() {
        try {
            if (checkOrientation()) {
                this.mLastOri = getFrameOrientation();
                handleRotateChanged();
                return;
            }
            synchronized (this.mCaptureFormatLock) {
                try {
                    byte[] screenshot2 = getScreenshot2();
                    if (screenshot2 == null) {
                        return;
                    }
                    if (screenshot2.length < 1) {
                    }
                } finally {
                }
            }
        } catch (IOException e4) {
            logger.error(ProtectedSandApp.s("꓿\u0001") + e4.getMessage());
            handleErrorOfImage();
        } catch (Exception e5) {
            com.flashget.kid.common.servers.forward.data.a.a(e5, new StringBuilder(ProtectedSandApp.s("꓾\u0001")), logger);
            handleErrorOfImage();
        }
    }

    private void releaseResource() {
        ImageReader imageReader = this.mImageReader;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(null, null);
            this.mImageReader.close();
            this.mImageReader = null;
        }
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.virtualDisplay = null;
        }
    }

    private void renewResource() {
        if (this.mediaProjectionPermissionResultData == null) {
            return;
        }
        logger.debug(ProtectedSandApp.s("ꔀ\u0001"));
        this.mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
        int i4 = width;
        width = height;
        height = i4;
        createVirtualDisplay();
    }

    public static String saveToFile() {
        byte[] bArr = mLastByteData;
        if (bArr == null) {
            return null;
        }
        File file = new File(newSaveScreenshotFile());
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e4) {
            logger.error(ProtectedSandApp.s("ꔁ\u0001") + Log.getStackTraceString(e4));
        }
        return file.getAbsolutePath();
    }

    private void sendFrame(JavaI420Buffer javaI420Buffer) {
        if (javaI420Buffer == null) {
            return;
        }
        int frameOrientation = getFrameOrientation();
        VideoFrame videoFrame = new VideoFrame(javaI420Buffer, this.mIsNeedAppendRotation ? frameOrientation : 0, TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
        videoFrame.setIsScreenShare(true);
        videoFrame.setVideoQualityMode(this.mMode);
        videoFrame.setDPI(this.mDpi);
        Logger logger2 = logger;
        StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("ꔂ\u0001"), frameOrientation, ProtectedSandApp.s("ꔃ\u0001"));
        a5.append(width);
        a5.append(ProtectedSandApp.s("ꔄ\u0001"));
        a5.append(height);
        a5.append(ProtectedSandApp.s("ꔅ\u0001"));
        com.flashget.kid.common.requests.uploadfile.a.a(a5, this.mInitOri, logger2);
        this.capturerObserver.onFrameCaptured(videoFrame);
        videoFrame.release();
    }

    public static void setBlock(boolean z4, int i4, String str, int i5, float f4) {
        mIsBlockOn = z4;
        mBlockColor = i4;
        mBlockText = str;
        mBlockTextColor = i5;
        mBlockTextSizeSp = f4;
    }

    private void startGetImage() {
        this.surfaceTextureHelper.getHandler().removeCallbacks(this.mGetImageRunnable);
        CaptureMODE captureMODE = this.mCaptureMODE;
        if (captureMODE == CaptureMODE.LISTENER_MODE) {
            initImageReaderListener();
        } else if (captureMODE == CaptureMODE.MANUALLY_MODE || captureMODE == CaptureMODE.MIX_MODE || captureMODE == CaptureMODE.SNAPSHOT_MODE) {
            this.surfaceTextureHelper.getHandler().post(this.mGetImageRunnable);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i4, int i5, int i6) {
        String s4 = ProtectedSandApp.s("ꔆ\u0001");
        synchronized (this) {
            checkNotDisposed();
            logger.debug(s4 + i4 + ProtectedSandApp.s("ꔄ\u0001") + i5);
            synchronized (this.mCaptureFormatLock) {
                width = i4;
                height = i5;
            }
            if (this.virtualDisplay == null) {
                return;
            }
            ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: org.webrtc.ScreenCapturerAndroid2.2
                @Override // java.lang.Runnable
                public void run() {
                    ScreenCapturerAndroid2.this.virtualDisplay.release();
                    ScreenCapturerAndroid2.this.createVirtualDisplay();
                }
            });
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        this.isDisposed = true;
    }

    public CaptureMODE getCaptureMode() {
        return this.mCaptureMODE;
    }

    int getFrameOrientation() {
        WindowManager windowManager = this.mWindowManager;
        if (windowManager == null) {
            return 0;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    @androidx.annotation.q0
    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    public VideoFrame.VideoQualityMode getVideoMode() {
        return this.mMode;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new RuntimeException(ProtectedSandApp.s("ꔊ\u0001"));
        }
        this.capturerObserver = capturerObserver;
        if (surfaceTextureHelper == null) {
            throw new RuntimeException(ProtectedSandApp.s("ꔉ\u0001"));
        }
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService(ProtectedSandApp.s("ꔇ\u0001"));
        this.applicationContext = context;
        this.mWindowManager = (WindowManager) context.getSystemService(ProtectedSandApp.s("ꔈ\u0001"));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.mWindowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.mDpi = displayMetrics.densityDpi;
        this.mLastOri = getFrameOrientation();
        this.mInitOri = getFrameOrientation();
        this.mTransparentView = new View(context);
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // org.webrtc.VideoCapturer
    public void pauseCapture(boolean z4) {
        com.flashget.commonx.billing.s.a(ProtectedSandApp.s("ꔋ\u0001"), z4, logger);
        this.mIsPasue = z4;
    }

    public void setCallBackHandler(Handler handler) {
        this.mCallBackHandler = handler;
    }

    public void setCaptureMode(CaptureMODE captureMODE) {
        this.mCaptureMODE = captureMODE;
    }

    public void setCaptureName(String str) {
        this.mCaptureName = str;
    }

    public void setIsNeedAppendRotation(boolean z4) {
        this.mIsNeedAppendRotation = z4;
    }

    public void setNewResultData(Intent intent) {
        logger.debug(ProtectedSandApp.s("ꔌ\u0001"));
        this.mediaProjectionPermissionResultData = intent;
    }

    public void setVideoQualityMode(VideoFrame.VideoQualityMode videoQualityMode) {
        this.mMode = videoQualityMode;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[Catch: all -> 0x0049, TRY_ENTER, TryCatch #0 {all -> 0x0049, blocks: (B:4:0x000d, B:9:0x0044, B:10:0x004f, B:15:0x0056, B:17:0x0063, B:19:0x0069, B:20:0x0075, B:23:0x007f, B:25:0x0098, B:26:0x009f, B:31:0x004b), top: B:3:0x000d }] */
    @Override // org.webrtc.VideoCapturer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean startCapture(int r4, int r5, int r6) {
        /*
            r3 = this;
            java.lang.String r6 = "ꔍ\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            java.lang.String r0 = "ꔎ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            monitor-enter(r3)
            r3.checkNotDisposed()     // Catch: java.lang.Throwable -> L49
            org.apache.log4j.Logger r1 = org.webrtc.ScreenCapturerAndroid2.logger     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L49
            int r0 = r3.mLastOri     // Catch: java.lang.Throwable -> L49
            r2.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "ꔏ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L49
            r2.append(r0)     // Catch: java.lang.Throwable -> L49
            r2.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "ꓱ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L49
            r2.append(r0)     // Catch: java.lang.Throwable -> L49
            r2.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L49
            r1.debug(r0)     // Catch: java.lang.Throwable -> L49
            int r0 = r3.mLastOri     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            r2 = 180(0xb4, float:2.52E-43)
            if (r0 != r2) goto L44
            goto L4b
        L44:
            org.webrtc.ScreenCapturerAndroid2.width = r4     // Catch: java.lang.Throwable -> L49
            org.webrtc.ScreenCapturerAndroid2.height = r5     // Catch: java.lang.Throwable -> L49
            goto L4f
        L49:
            r4 = move-exception
            goto Lad
        L4b:
            org.webrtc.ScreenCapturerAndroid2.width = r4     // Catch: java.lang.Throwable -> L49
            org.webrtc.ScreenCapturerAndroid2.height = r5     // Catch: java.lang.Throwable -> L49
        L4f:
            android.content.Intent r4 = r3.mediaProjectionPermissionResultData     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L56
            monitor-exit(r3)
            r4 = 0
            return r4
        L56:
            android.media.projection.MediaProjectionManager r5 = r3.mediaProjectionManager     // Catch: java.lang.Throwable -> L49
            r0 = -1
            android.media.projection.MediaProjection r4 = r5.getMediaProjection(r0, r4)     // Catch: java.lang.Throwable -> L49
            r3.mediaProjection = r4     // Catch: java.lang.Throwable -> L49
            android.os.Handler r4 = r3.mCallBackHandler     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L75
            android.os.Looper r4 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L75
            java.lang.String r4 = "ꔐ\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L49
            r1.info(r4)     // Catch: java.lang.Throwable -> L49
            android.os.Looper.prepare()     // Catch: java.lang.Throwable -> L49
        L75:
            android.media.projection.MediaProjection r4 = r3.mediaProjection     // Catch: java.lang.Throwable -> L49
            android.media.projection.MediaProjection$Callback r5 = r3.mediaProjectionCallback     // Catch: java.lang.Throwable -> L49
            android.os.Handler r0 = r3.mCallBackHandler     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L7e
            goto L7f
        L7e:
            r0 = 0
        L7f:
            r4.registerCallback(r5, r0)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L49
            boolean r5 = r3.mIsCapturerObserverStart     // Catch: java.lang.Throwable -> L49
            r4.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49
            r1.debug(r4)     // Catch: java.lang.Throwable -> L49
            boolean r4 = r3.mIsCapturerObserverStart     // Catch: java.lang.Throwable -> L49
            r5 = 1
            if (r4 != 0) goto L9f
            org.webrtc.CapturerObserver r4 = r3.capturerObserver     // Catch: java.lang.Throwable -> L49
            r4.onCapturerStarted(r5)     // Catch: java.lang.Throwable -> L49
            r3.mIsCapturerObserverStart = r5     // Catch: java.lang.Throwable -> L49
        L9f:
            r3.createVirtualDisplay()     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "ꔑ\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L49
            r1.debug(r4)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)
            return r5
        Lad:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.ScreenCapturerAndroid2.startCapture(int, int, int):boolean");
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        String s4 = ProtectedSandApp.s("ꔁ\u0001");
        synchronized (this) {
            try {
                checkNotDisposed();
                this.mIsCapturerObserverStart = false;
                ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: org.webrtc.ScreenCapturerAndroid2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ScreenCapturerAndroid2.this.surfaceTextureHelper.getHandler().removeCallbacks(ScreenCapturerAndroid2.this.mGetImageRunnable);
                        ScreenCapturerAndroid2.this.surfaceTextureHelper.stopListening();
                        ScreenCapturerAndroid2.this.capturerObserver.onCapturerStopped();
                        if (ScreenCapturerAndroid2.this.mImageReader != null) {
                            ScreenCapturerAndroid2.this.mImageReader.setOnImageAvailableListener(null, null);
                            ScreenCapturerAndroid2.this.mImageReader.close();
                            ScreenCapturerAndroid2.this.mImageReader = null;
                        }
                        if (ScreenCapturerAndroid2.this.virtualDisplay != null) {
                            ScreenCapturerAndroid2.this.virtualDisplay.release();
                            ScreenCapturerAndroid2.this.virtualDisplay = null;
                        }
                        if (ScreenCapturerAndroid2.this.mediaProjection != null) {
                            ScreenCapturerAndroid2.this.mediaProjection.unregisterCallback(ScreenCapturerAndroid2.this.mediaProjectionCallback);
                            ScreenCapturerAndroid2.this.mediaProjection.stop();
                            ScreenCapturerAndroid2.this.mediaProjection = null;
                        }
                        ScreenCapturerAndroid2.this.mediaProjectionPermissionResultData = null;
                        ScreenCapturerAndroid2.logger.debug("stopCapture");
                    }
                });
            } catch (Exception e4) {
                logger.error(s4 + e4.getMessage());
            }
        }
    }

    public ScreenCapturerAndroid2(Intent intent, MediaProjection.Callback callback, CaptureMODE captureMODE) {
        this(intent, callback);
        this.mCaptureMODE = captureMODE;
    }
}
