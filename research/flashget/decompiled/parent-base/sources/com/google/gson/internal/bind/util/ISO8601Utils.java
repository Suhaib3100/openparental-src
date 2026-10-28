package com.google.gson.internal.bind.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public class ISO8601Utils {
    private static final String UTC_ID = ProtectedSandApp.s("و\u0001");
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(ProtectedSandApp.s("و\u0001"));

    private static boolean checkOffset(String str, int i4, char c5) {
        return i4 < str.length() && str.charAt(i4) == c5;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i4) {
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            if (charAt < '0' || charAt > '9') {
                return i4;
            }
            i4++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i4, int i5) {
        String num = Integer.toString(i4);
        for (int length = i5 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i4, int i5) throws NumberFormatException {
        int i6;
        int i7;
        if (i4 < 0 || i5 > str.length() || i4 > i5) {
            throw new NumberFormatException(str);
        }
        String s4 = ProtectedSandApp.s("٘\u0001");
        if (i4 < i5) {
            i7 = i4 + 1;
            int digit = Character.digit(str.charAt(i4), 10);
            if (digit < 0) {
                throw new NumberFormatException(s4 + str.substring(i4, i5));
            }
            i6 = -digit;
        } else {
            i6 = 0;
            i7 = i4;
        }
        while (i7 < i5) {
            int i10 = i7 + 1;
            int digit2 = Character.digit(str.charAt(i7), 10);
            if (digit2 < 0) {
                throw new NumberFormatException(s4 + str.substring(i4, i5));
            }
            i6 = (i6 * 10) - digit2;
            i7 = i10;
        }
        return -i6;
    }

    public static String format(Date date, boolean z4) {
        return format(date, z4, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z4, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z4 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z4) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i4 = offset / 60000;
            int abs = Math.abs(i4 / 60);
            int abs2 = Math.abs(i4 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, abs, 2);
            sb.append(':');
            padInt(sb, abs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}
