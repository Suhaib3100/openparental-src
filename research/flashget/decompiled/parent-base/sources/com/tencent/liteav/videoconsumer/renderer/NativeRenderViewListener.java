package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
class NativeRenderViewListener implements RenderViewHelperInterface.RenderViewListener {
    private long mNativeHandler;

    public NativeRenderViewListener(long j4) {
        this.mNativeHandler = j4;
    }

    private static native void nativeOnRequestRedraw(long j4, Bitmap bitmap);

    private static native void nativeOnSurfaceChanged(long j4, Surface surface, boolean z4);

    private static native void nativeOnSurfaceDestroy(long j4);

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public synchronized void onRequestRedraw(Bitmap bitmap) {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnRequestRedraw(j4, bitmap);
        }
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public synchronized void onSurfaceChanged(Surface surface, boolean z4) {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnSurfaceChanged(j4, surface, z4);
        }
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public synchronized void onSurfaceDestroy() {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnSurfaceDestroy(j4);
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandler = 0L;
    }
}
