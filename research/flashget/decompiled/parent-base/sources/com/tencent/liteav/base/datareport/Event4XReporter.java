package com.tencent.liteav.base.datareport;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class Event4XReporter {
    private static final int INVALID_INSTANCE = 0;
    public static final int REPORT_EVENT = 1;
    public static final int REPORT_STATUS = 2;
    private static final String TAG = ProtectedSandApp.s("办\u0001");
    private long mNativeEvent4XReporterAndroid;

    public Event4XReporter(int i4, int i5, String str, boolean z4, int i6) {
        this.mNativeEvent4XReporterAndroid = 0L;
        this.mNativeEvent4XReporterAndroid = nativeCreate(i4, i5, str, z4, i6);
    }

    private static native long nativeCreate(int i4, int i5, String str, boolean z4, int i6);

    private static native void nativeDestroy(long j4);

    private static native int nativeGetColdDownTime(long j4);

    private static native void nativeSendReport(long j4);

    private static native void nativeSetCommonIntValue(long j4, String str, long j5);

    private static native void nativeSetCommonStringValue(long j4, String str, String str2);

    private static native void nativeSetEventIntValue(long j4, String str, long j5);

    private static native void nativeSetEventStringValue(long j4, String str, String str2);

    public synchronized void destroy() {
        long j4 = this.mNativeEvent4XReporterAndroid;
        if (j4 == 0) {
            return;
        }
        nativeDestroy(j4);
        this.mNativeEvent4XReporterAndroid = 0L;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        destroy();
    }

    public int getColdDownTime() {
        long j4 = this.mNativeEvent4XReporterAndroid;
        if (j4 == 0) {
            return 10000;
        }
        return nativeGetColdDownTime(j4);
    }

    public synchronized void reportDau(int i4, int i5, String str) {
        long j4 = this.mNativeEvent4XReporterAndroid;
        if (j4 == 0) {
            return;
        }
        nativeSetEventStringValue(j4, ProtectedSandApp.s("力\u0001"), String.valueOf(i4));
        nativeSetEventStringValue(this.mNativeEvent4XReporterAndroid, ProtectedSandApp.s("劜\u0001"), String.valueOf(i5));
        nativeSetEventStringValue(this.mNativeEvent4XReporterAndroid, ProtectedSandApp.s("劝\u0001"), str);
        nativeSendReport(this.mNativeEvent4XReporterAndroid);
    }

    public synchronized void sendReport() {
        long j4 = this.mNativeEvent4XReporterAndroid;
        if (j4 == 0) {
            return;
        }
        nativeSendReport(j4);
    }

    public synchronized void setCommonIntValue(String str, long j4) {
        long j5 = this.mNativeEvent4XReporterAndroid;
        if (j5 != 0 && str != null) {
            nativeSetCommonIntValue(j5, str, j4);
        }
    }

    public synchronized void setCommonStringValue(String str, String str2) {
        long j4 = this.mNativeEvent4XReporterAndroid;
        if (j4 != 0 && str != null && str2 != null) {
            nativeSetCommonStringValue(j4, str, str2);
        }
    }

    public synchronized void setEventIntValue(String str, long j4) {
        long j5 = this.mNativeEvent4XReporterAndroid;
        if (j5 != 0 && str != null) {
            nativeSetEventIntValue(j5, str, j4);
        }
    }

    public synchronized void setEventStringValue(String str, String str2) {
        long j4 = this.mNativeEvent4XReporterAndroid;
        if (j4 != 0 && str != null && str2 != null) {
            nativeSetEventStringValue(j4, str, str2);
        }
    }
}
