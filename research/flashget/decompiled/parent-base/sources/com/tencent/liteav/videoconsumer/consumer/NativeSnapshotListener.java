package com.tencent.liteav.videoconsumer.consumer;

import android.graphics.Bitmap;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class NativeSnapshotListener {
    private long mNativeVideoSnapListener;

    private NativeSnapshotListener(long j4) {
        this.mNativeVideoSnapListener = j4;
    }

    private native void nativeDestroy(long j4);

    private native void nativeOnComplete(long j4, Bitmap bitmap);

    protected void finalize() throws Throwable {
        long j4 = this.mNativeVideoSnapListener;
        if (j4 != 0) {
            nativeDestroy(j4);
            this.mNativeVideoSnapListener = 0L;
        }
        super.finalize();
    }

    public void onComplete(Bitmap bitmap) {
        long j4 = this.mNativeVideoSnapListener;
        if (j4 != 0) {
            nativeOnComplete(j4, bitmap);
            this.mNativeVideoSnapListener = 0L;
        }
    }
}
