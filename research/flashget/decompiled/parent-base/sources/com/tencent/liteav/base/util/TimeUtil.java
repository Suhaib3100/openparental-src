package com.tencent.liteav.base.util;

/* loaded from: classes7.dex */
public class TimeUtil {
    public static long a() {
        return nativeGetTimestamp();
    }

    private static native long nativeGetTimestamp();
}
