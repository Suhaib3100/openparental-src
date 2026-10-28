package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CustomHandler;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class NativeScreenCaptureListener implements SurfaceTexture.OnFrameAvailableListener {
    private final CustomHandler mCallbackHandler = new CustomHandler(Looper.myLooper());
    private long mNativeHandle;

    public NativeScreenCaptureListener(long j4) {
        this.mNativeHandle = j4;
    }

    private static native void nativeOnCaptureError(long j4);

    private static native void nativeOnClassNotFound(long j4);

    private static native void nativeOnFrameAvailable(long j4, SurfaceTexture surfaceTexture);

    private static native void nativeOnStartFinish(long j4, boolean z4, boolean z5);

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyCaptureError() {
        long j4 = this.mNativeHandle;
        if (j4 != 0) {
            nativeOnCaptureError(j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyClassNotFound() {
        long j4 = this.mNativeHandle;
        if (j4 != 0) {
            nativeOnClassNotFound(j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyFrameAvailable(SurfaceTexture surfaceTexture) {
        long j4 = this.mNativeHandle;
        if (j4 != 0) {
            nativeOnFrameAvailable(j4, surfaceTexture);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyStartFinish(boolean z4, boolean z5) {
        long j4 = this.mNativeHandle;
        if (j4 != 0) {
            nativeOnStartFinish(j4, z4, z5);
        }
    }

    public Handler getCallbackHandler() {
        return this.mCallbackHandler;
    }

    public void onCaptureError() {
        this.mCallbackHandler.runOrPost(h.a(this));
    }

    public void onClassNotFound() {
        this.mCallbackHandler.runOrPost(i.a(this));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mCallbackHandler.runOrPost(f.a(this, surfaceTexture));
    }

    public void onStartFinish(boolean z4, boolean z5) {
        this.mCallbackHandler.runOrPost(g.a(this, z4, z5));
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandle = 0L;
    }
}
