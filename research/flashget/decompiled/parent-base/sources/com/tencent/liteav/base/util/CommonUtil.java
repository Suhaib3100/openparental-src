package com.tencent.liteav.base.util;

import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class CommonUtil {
    private static long mNativeNtpTimeManagerListener;
    private static a sCallback;

    public interface a {
        void a(int i4, String str);
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String getFileExtension(String str) {
        int lastIndexOf;
        if (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf >= str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static long getNetworkTimestamp() {
        if (nativeNtpTimeManagerListenerHasBeenCreated()) {
            return nativeGetNetworkTimestamp(mNativeNtpTimeManagerListener);
        }
        return 0L;
    }

    public static String getSDKVersionStr() {
        return nativeGetSDKVersion();
    }

    private static native long nativeCreate();

    private static native long nativeGetNetworkTimestamp(long j4);

    public static native String nativeGetSDKVersion();

    private static boolean nativeNtpTimeManagerListenerHasBeenCreated() {
        return sCallback != null;
    }

    private static native int nativeSetGlobalEnv(String str);

    private static native boolean nativeSetSocks5Proxy(String str, int i4, String str2, String str3, boolean z4, boolean z5, boolean z6);

    private static native int nativeUpdateNetworkTime(long j4);

    public static void onUpdateNetworkTime(int i4, String str) {
        a aVar = sCallback;
        if (aVar != null) {
            aVar.a(i4, str);
        }
    }

    public static int setGlobalEnv(String str) {
        return nativeSetGlobalEnv(str);
    }

    public static boolean setSocks5Proxy(String str, int i4, String str2, String str3, boolean z4, boolean z5, boolean z6) {
        return nativeSetSocks5Proxy(str, i4, str2, str3, z4, z5, z6);
    }

    public static void setUpdateNetworkTimeCallback(a aVar) {
        if (nativeNtpTimeManagerListenerHasBeenCreated()) {
            return;
        }
        mNativeNtpTimeManagerListener = nativeCreate();
        sCallback = aVar;
    }

    public static int updateNetworkTime() {
        if (nativeNtpTimeManagerListenerHasBeenCreated()) {
            return nativeUpdateNetworkTime(mNativeNtpTimeManagerListener);
        }
        return -1;
    }
}
