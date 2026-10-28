package com.tencent.qcloud.network.sonar.utils;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* loaded from: classes7.dex */
public final class LogTime {
    private static final double MILLIS_MULTIPLIER = 1.0d / Math.pow(10.0d, 6.0d);

    private LogTime() {
    }

    public static int getElapsedMillis(long j4) {
        return (int) ((getLogTime() - j4) * MILLIS_MULTIPLIER);
    }

    @TargetApi(17)
    public static long getLogTime() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
