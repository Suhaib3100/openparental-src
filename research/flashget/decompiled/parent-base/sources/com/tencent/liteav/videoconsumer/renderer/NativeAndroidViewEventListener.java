package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.rtmp.ui.AndroidViewEventListener;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class NativeAndroidViewEventListener implements AndroidViewEventListener {
    private long mNativeHandler;

    public NativeAndroidViewEventListener(long j4) {
        this.mNativeHandler = j4;
    }

    private static native void nativeOnTap(long j4, int i4, int i5, int i6, int i7);

    private static native void nativeOnZoom(long j4, float f4);

    private static native void nativeonSizeChanged(long j4, int i4, int i5, int i6, int i7);

    @Override // com.tencent.rtmp.ui.AndroidViewEventListener
    public synchronized void onSizeChanged(int i4, int i5, int i6, int i7) {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeonSizeChanged(j4, i4, i5, i6, i7);
        }
    }

    @Override // com.tencent.rtmp.ui.AndroidViewEventListener
    public synchronized void onTap(int i4, int i5, int i6, int i7) {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnTap(j4, i4, i5, i6, i7);
        }
    }

    @Override // com.tencent.rtmp.ui.AndroidViewEventListener
    public synchronized void onZoom(float f4) {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnZoom(j4, f4);
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandler = 0L;
    }
}
