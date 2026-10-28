package com.tencent.liteav.base.dispatcher;

import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
class PlatformDispatcherTask implements Runnable {
    private long mNativePlatformDispatcherTask = 0;

    private void destroyTask(long j4) {
        if (j4 != 0) {
            nativeDestroyTask(j4);
        }
    }

    public static Handler getMainHandler() {
        return new Handler(Looper.getMainLooper());
    }

    private static native void nativeDestroyTask(long j4);

    private static native void nativeOnTaskFineshed(long j4, PlatformDispatcherTask platformDispatcherTask);

    private static native void nativeRunTask(long j4);

    protected void finalize() throws Throwable {
        destroyTask(this.mNativePlatformDispatcherTask);
        this.mNativePlatformDispatcherTask = 0L;
        super.finalize();
    }

    public void resetTask(long j4) {
        this.mNativePlatformDispatcherTask = j4;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j4 = this.mNativePlatformDispatcherTask;
        this.mNativePlatformDispatcherTask = 0L;
        if (j4 != 0) {
            nativeRunTask(j4);
            nativeOnTaskFineshed(j4, this);
            destroyTask(j4);
        }
    }
}
