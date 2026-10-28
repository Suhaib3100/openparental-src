package com.tencent.cos.xml.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class TimeUtils {
    private static final String TAG = ProtectedSandApp.s("儁\u0001");

    public static long getTookTime(long j4) {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime() - j4, TimeUnit.NANOSECONDS);
    }
}
