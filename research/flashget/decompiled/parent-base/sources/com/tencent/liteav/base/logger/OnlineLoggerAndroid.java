package com.tencent.liteav.base.logger;

import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class OnlineLoggerAndroid {
    private static final int INVALID_INSTANCE = -1;
    private long mNativeOnlineLoggerAndroid;

    public enum a {
        f71885a(0),
        f71886b(1),
        f71887c(2);

        int value;

        a(int i4) {
            this.value = i4;
        }
    }

    public enum b {
        f71889a(1),
        f71890b(2),
        f71891c(3),
        f71892d(4);

        int level;

        b(int i4) {
            this.level = i4;
        }
    }

    public OnlineLoggerAndroid(a aVar, int i4, String str, String str2) {
        this.mNativeOnlineLoggerAndroid = -1L;
        this.mNativeOnlineLoggerAndroid = nativeCreate(aVar.value, i4, str, str2);
    }

    private static native long nativeCreate(int i4, int i5, String str, String str2);

    private static native void nativeDestroy(long j4);

    private static native void nativeLog(long j4, int i4, String str);

    public synchronized void destroy() {
        long j4 = this.mNativeOnlineLoggerAndroid;
        if (j4 == -1) {
            return;
        }
        nativeDestroy(j4);
        this.mNativeOnlineLoggerAndroid = -1L;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        destroy();
    }

    public synchronized void log(b bVar, String str) {
        long j4 = this.mNativeOnlineLoggerAndroid;
        if (j4 == -1) {
            return;
        }
        nativeLog(j4, bVar.level, str);
    }
}
