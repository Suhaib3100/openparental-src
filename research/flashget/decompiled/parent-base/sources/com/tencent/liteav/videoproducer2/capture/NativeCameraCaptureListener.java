package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.videoproducer.capture.CameraControllerInterface;
import com.tencent.liteav.videoproducer.capture.CameraEventCallback;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class NativeCameraCaptureListener implements SurfaceTexture.OnFrameAvailableListener, CameraEventCallback {
    private final CustomHandler mCallbackHandler = new CustomHandler(Looper.myLooper());
    private long mNativeHandle;

    public NativeCameraCaptureListener(long j4) {
        this.mNativeHandle = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnCameraError(long j4, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnFrameAvailable(long j4, SurfaceTexture surfaceTexture);

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void runInNative(Runnable runnable) {
        if (this.mNativeHandle != 0) {
            runnable.run();
        }
    }

    public Handler getCallbackHandler() {
        return this.mCallbackHandler;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraEventCallback
    public void onCameraError(CameraControllerInterface cameraControllerInterface, int i4) {
        this.mCallbackHandler.runOrPost(b.a(this, i4));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mCallbackHandler.runOrPost(c.a(this, surfaceTexture));
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandle = 0L;
    }
}
