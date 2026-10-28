package com.luck.picture.lib.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.material3.j4;
import com.flashget.kid.common.configs.log.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes6.dex */
public class DateUtils {

    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat SF = new SimpleDateFormat(ProtectedSandApp.s("ᛔ\u0001"));

    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat SDF = new SimpleDateFormat(ProtectedSandApp.s("ᛕ\u0001"));

    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat SDF_YEAR = new SimpleDateFormat(ProtectedSandApp.s("ᛖ\u0001"));

    public static String cdTime(long j4, long j5) {
        long j6 = j5 - j4;
        return j6 > 1000 ? android.support.v4.media.session.b.a(new StringBuilder(), j6 / 1000, ProtectedSandApp.s("ᛗ\u0001")) : o.a(j6, ProtectedSandApp.s("ᛘ\u0001"));
    }

    public static int dateDiffer(long j4) {
        try {
            return (int) Math.abs(getCurrentTimeMillis() - j4);
        } catch (Exception e4) {
            e4.printStackTrace();
            return -1;
        }
    }

    public static String formatDurationTime(long j4) {
        String s4 = j4 < 0 ? ProtectedSandApp.s("ᛙ\u0001") : "";
        long abs = Math.abs(j4) / 1000;
        long j5 = abs % 60;
        long j6 = (abs / 60) % 60;
        long j7 = abs / 3600;
        if (j7 > 0) {
            return String.format(Locale.getDefault(), ProtectedSandApp.s("ᛚ\u0001"), s4, Long.valueOf(j7), Long.valueOf(j6), Long.valueOf(j5));
        }
        return String.format(Locale.getDefault(), ProtectedSandApp.s("ᛛ\u0001"), s4, Long.valueOf(j6), Long.valueOf(j5));
    }

    public static String getCreateFileName(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder a5 = j4.a(str);
        a5.append(SF.format(Long.valueOf(currentTimeMillis)));
        return a5.toString();
    }

    public static long getCurrentTimeMillis() {
        String valueOf = ValueOf.toString(Long.valueOf(System.currentTimeMillis()));
        if (valueOf.length() > 10) {
            valueOf = valueOf.substring(0, 10);
        }
        return ValueOf.toLong(valueOf);
    }

    public static String getDataFormat(Context context, long j4) {
        if (String.valueOf(j4).length() <= 10) {
            j4 *= 1000;
        }
        return isThisWeek(j4) ? context.getString(R.string.ps_current_week) : isThisMonth(j4) ? context.getString(R.string.ps_current_month) : SDF.format(Long.valueOf(j4));
    }

    public static String getYearDataFormat(long j4) {
        if (String.valueOf(j4).length() <= 10) {
            j4 *= 1000;
        }
        return SDF_YEAR.format(Long.valueOf(j4));
    }

    public static boolean isThisMonth(long j4) {
        Date date = new Date(j4);
        SimpleDateFormat simpleDateFormat = SDF;
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(new Date()));
    }

    private static boolean isThisWeek(long j4) {
        Calendar calendar = Calendar.getInstance();
        int i4 = calendar.get(3);
        calendar.setTime(new Date(j4));
        return calendar.get(3) == i4;
    }

    public static long millisecondToSecond(long j4) {
        return (j4 / 1000) * 1000;
    }

    public static String getCreateFileName() {
        return SF.format(Long.valueOf(System.currentTimeMillis()));
    }
}
