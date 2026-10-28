package com.tencent.qcloud.core.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.logger.COSLogger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public class HttpConfiguration {
    private static final String RFC822_DATE_PATTERN = ProtectedSandApp.s("奒\u0001");
    private static final AtomicLong GLOBAL_TIME_OFFSET = new AtomicLong(0);
    private static final TimeZone GMT_TIMEZONE = TimeZone.getTimeZone(ProtectedSandApp.s("奓\u0001"));
    private static ThreadLocal<SimpleDateFormat> gmtFormatters = new ThreadLocal<>();

    public static long calculateGlobalTimeOffset(String str, Date date) {
        AtomicLong atomicLong = GLOBAL_TIME_OFFSET;
        long j4 = atomicLong.get();
        calculateGlobalTimeOffset(str, date, 0);
        return Math.abs(j4 - atomicLong.get());
    }

    public static long getDeviceTimeWithOffset() {
        return System.currentTimeMillis() / 1000;
    }

    private static SimpleDateFormat getFormatter() {
        SimpleDateFormat simpleDateFormat = gmtFormatters.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(ProtectedSandApp.s("奒\u0001"), Locale.US);
        simpleDateFormat2.setTimeZone(GMT_TIMEZONE);
        simpleDateFormat2.setLenient(false);
        gmtFormatters.set(simpleDateFormat2);
        return simpleDateFormat2;
    }

    public static String getGMTDate(Date date) {
        return getFormatter().format(date);
    }

    public static Date getGMTDate(String str) {
        try {
            return getFormatter().parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static void calculateGlobalTimeOffset(String str, Date date, int i4) {
        String s4 = ProtectedSandApp.s("奔\u0001");
        try {
            long time = (getFormatter().parse(str).getTime() - date.getTime()) / 1000;
            if (Math.abs(time) >= i4) {
                GLOBAL_TIME_OFFSET.set(time);
                COSLogger.iNetwork(ProtectedSandApp.s("奕\u0001"), s4 + time + ProtectedSandApp.s("奖\u0001"));
            }
        } catch (ParseException unused) {
        }
    }
}
