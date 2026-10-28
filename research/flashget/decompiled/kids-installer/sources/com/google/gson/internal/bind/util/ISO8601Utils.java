package com.google.gson.internal.bind.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.io.k;

/* loaded from: classes5.dex */
public class ISO8601Utils {
    private static final String UTC_ID = ProtectedSandApp.s("㒔");
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(ProtectedSandApp.s("㒕"));

    private static boolean checkOffset(String str, int i5, char c6) {
        return i5 < str.length() && str.charAt(i5) == c6;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i5) {
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            if (charAt < '0' || charAt > '9') {
                return i5;
            }
            i5++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i5, int i6) {
        String num = Integer.toString(i5);
        for (int length = i6 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6 A[Catch: IllegalArgumentException -> 0x01d7, NumberFormatException -> 0x01d9, IndexOutOfBoundsException -> 0x01db, TRY_LEAVE, TryCatch #3 {IllegalArgumentException -> 0x01d7, IndexOutOfBoundsException -> 0x01db, NumberFormatException -> 0x01d9, blocks: (B:3:0x001c, B:5:0x002e, B:6:0x0030, B:8:0x003c, B:9:0x003e, B:11:0x004d, B:13:0x0053, B:18:0x0067, B:20:0x0077, B:21:0x0079, B:23:0x0085, B:24:0x0087, B:26:0x008d, B:30:0x0097, B:35:0x00a7, B:37:0x00af, B:43:0x00e0, B:45:0x00e6, B:52:0x01c3, B:95:0x01cb, B:96:0x01d6, B:97:0x00c9, B:98:0x00cc), top: B:2:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cb A[Catch: IllegalArgumentException -> 0x01d7, NumberFormatException -> 0x01d9, IndexOutOfBoundsException -> 0x01db, TryCatch #3 {IllegalArgumentException -> 0x01d7, IndexOutOfBoundsException -> 0x01db, NumberFormatException -> 0x01d9, blocks: (B:3:0x001c, B:5:0x002e, B:6:0x0030, B:8:0x003c, B:9:0x003e, B:11:0x004d, B:13:0x0053, B:18:0x0067, B:20:0x0077, B:21:0x0079, B:23:0x0085, B:24:0x0087, B:26:0x008d, B:30:0x0097, B:35:0x00a7, B:37:0x00af, B:43:0x00e0, B:45:0x00e6, B:52:0x01c3, B:95:0x01cb, B:96:0x01d6, B:97:0x00c9, B:98:0x00cc), top: B:2:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i5, int i6) throws NumberFormatException {
        int i7;
        int i8;
        if (i5 < 0 || i6 > str.length() || i5 > i6) {
            throw new NumberFormatException(str);
        }
        String s5 = ProtectedSandApp.s("㒥");
        if (i5 < i6) {
            i8 = i5 + 1;
            int digit = Character.digit(str.charAt(i5), 10);
            if (digit < 0) {
                throw new NumberFormatException(s5 + str.substring(i5, i6));
            }
            i7 = -digit;
        } else {
            i7 = 0;
            i8 = i5;
        }
        while (i8 < i6) {
            int i9 = i8 + 1;
            int digit2 = Character.digit(str.charAt(i8), 10);
            if (digit2 < 0) {
                throw new NumberFormatException(s5 + str.substring(i5, i6));
            }
            i7 = (i7 * 10) - digit2;
            i8 = i9;
        }
        return -i7;
    }

    public static String format(Date date, boolean z5) {
        return format(date, z5, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z5, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z5 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
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
        if (z5) {
            sb.append(k.f32026a);
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i5 = offset / 60000;
            int abs = Math.abs(i5 / 60);
            int abs2 = Math.abs(i5 % 60);
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
