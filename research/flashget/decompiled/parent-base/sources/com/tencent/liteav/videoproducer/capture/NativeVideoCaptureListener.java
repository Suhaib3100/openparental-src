package com.tencent.liteav.videoproducer.capture;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.k;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.e;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
class NativeVideoCaptureListener implements com.tencent.liteav.videobase.videobase.c, CaptureSourceInterface.CaptureSourceListener {
    private static final String TAG = ProtectedSandApp.s("嚌\u0001");
    private long mNativeHandler;

    public NativeVideoCaptureListener(long j4) {
        this.mNativeHandler = j4;
    }

    private static native void nativeOnAutoFocusEnabled(long j4, boolean z4);

    private static native void nativeOnCaptureError(long j4, int i4, String str);

    private static native void nativeOnCaptureFirstFrame(long j4);

    private static native void nativeOnCapturePaused(long j4);

    private static native void nativeOnCaptureResumed(long j4);

    private static native void nativeOnCaptureStopped(long j4);

    private static native void nativeOnFrameAvailable(long j4, PixelFrame pixelFrame);

    private static native void nativeOnScreenDisplayOrientationChanged(long j4, int i4);

    private static native void nativeOnStartFinish(long j4, boolean z4);

    private static native void nativeOnZoomEnabled(long j4, boolean z4);

    public synchronized void notifyError(e.a aVar, String str) {
        if (this.mNativeHandler == 0) {
            return;
        }
        int a5 = com.tencent.liteav.videobase.videobase.e.a(aVar);
        if (a5 != 0) {
            nativeOnCaptureError(this.mNativeHandler, a5, str);
            return;
        }
        LiteavLog.i(ProtectedSandApp.s("嚌\u0001"), ProtectedSandApp.s("嚍\u0001") + aVar + ProtectedSandApp.s("嚎\u0001") + a5);
    }

    public void notifyEvent(e.b bVar, int i4, String str) {
    }

    @Override // com.tencent.liteav.videobase.videobase.c
    public synchronized void notifyWarning(e.c cVar, String str) {
    }

    public synchronized void onCameraTouchEnable(boolean z4) {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnAutoFocusEnabled(j4, !z4);
        }
    }

    public synchronized void onCameraZoomEnable(boolean z4) {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnZoomEnabled(j4, z4);
        }
    }

    public synchronized void onCaptureError() {
    }

    public synchronized void onCaptureFirstFrame() {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnCaptureFirstFrame(j4);
        }
    }

    public synchronized void onFrameAvailable(CaptureSourceInterface captureSourceInterface, PixelFrame pixelFrame) {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnFrameAvailable(j4, pixelFrame);
        }
    }

    public synchronized void onScreenDisplayOrientationChanged(k kVar) {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnScreenDisplayOrientationChanged(j4, k.a(kVar));
        }
    }

    public synchronized void onStartFinish(boolean z4) {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnStartFinish(j4, z4);
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandler = 0L;
    }

    public synchronized void updateStatus(com.tencent.liteav.videobase.videobase.f fVar, Object obj) {
    }

    public synchronized void notifyEvent(e.b bVar, Object obj, String str) {
        long j4 = this.mNativeHandler;
        if (j4 == 0) {
            return;
        }
        if (bVar == e.b.f72356k) {
            nativeOnCaptureFirstFrame(j4);
            return;
        }
        if (bVar == e.b.f72360o) {
            nativeOnCapturePaused(j4);
        } else if (bVar == e.b.f72361p) {
            nativeOnCaptureResumed(j4);
        } else {
            if (bVar == e.b.f72359n) {
                nativeOnCaptureStopped(j4);
            }
        }
    }

    @Override // com.tencent.liteav.videobase.videobase.c
    public synchronized void updateStatus(com.tencent.liteav.videobase.videobase.f fVar, int i4, Object obj) {
    }
}
