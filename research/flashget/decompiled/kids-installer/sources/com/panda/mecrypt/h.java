package com.panda.mecrypt;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.UByte;

/* compiled from: ConvertUtils.java */
/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final DecimalFormat f21492a = new DecimalFormat(ProtectedSandApp.s("㗱"), new DecimalFormatSymbols(Locale.ENGLISH));

    private h() {
    }

    public static String A(String str) {
        try {
            return B(str, ProtectedSandApp.s("㗲"));
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException(ProtectedSandApp.s("㗳"));
        }
    }

    public static String B(String str, String str2) throws UnsupportedEncodingException {
        if (str != null) {
            return G(str.getBytes(str2));
        }
        return null;
    }

    public static Locale C(String str) {
        String trim = str != null ? str.trim() : "";
        if (trim.equals("")) {
            return new Locale("", "", "");
        }
        int indexOf = trim.indexOf(95);
        if (indexOf == -1) {
            return new Locale(trim, "", "");
        }
        String substring = trim.substring(0, indexOf);
        String substring2 = trim.substring(indexOf + 1);
        int indexOf2 = substring2.indexOf(95);
        return indexOf2 == -1 ? new Locale(substring, substring2, "") : new Locale(substring, substring2.substring(0, indexOf2), substring2.substring(indexOf2 + 1));
    }

    public static TimeZone D(String str) {
        if (str == null) {
            str = "";
        }
        return TimeZone.getTimeZone(str);
    }

    public static String E(TimeZone timeZone) {
        return F(timeZone);
    }

    public static String F(TimeZone timeZone) {
        return timeZone != null ? timeZone.getID() : "";
    }

    public static String G(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b6 : bArr) {
            int i5 = b6 & UByte.f27220r;
            if (i5 < 16) {
                stringBuffer.append(ProtectedSandApp.s("㗴"));
            }
            stringBuffer.append(Integer.toString(i5, 16));
        }
        return stringBuffer.toString();
    }

    public static String a(byte[] bArr) {
        return G(bArr);
    }

    public static Locale b(String str) {
        return C(str);
    }

    public static TimeZone c(String str) {
        return D(str);
    }

    public static Date d(java.util.Date date) {
        if (date != null) {
            return new Date(date.getTime());
        }
        return null;
    }

    public static Time e(java.util.Date date) {
        if (date != null) {
            return new Time(date.getTime());
        }
        return null;
    }

    public static Timestamp f(java.util.Date date) {
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    public static byte[] g(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 + 1;
            bArr[i5] = (byte) Integer.parseInt(str.substring(i5 * 2, i6 * 2), 16);
            i5 = i6;
        }
        return bArr;
    }

    public static Timestamp h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        Timestamp timestamp = new Timestamp(calendar.getTime().getTime());
        timestamp.setNanos(0);
        return timestamp;
    }

    public static java.util.Date i(int i5, int i6, int i7, boolean z5) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        if (calendar.getActualMinimum(1) > i5 || i5 > calendar.getActualMaximum(1)) {
            return null;
        }
        calendar.set(1, i5);
        if (calendar.getActualMinimum(2) <= i6 && i6 <= calendar.getActualMaximum(2)) {
            calendar.set(2, i6);
            if (calendar.getActualMinimum(5) <= i7 && i7 <= calendar.getActualMaximum(5)) {
                calendar.set(5, i7);
            }
        }
        if (z5) {
            calendar.add(5, 1);
            calendar.add(14, -1);
        }
        return calendar.getTime();
    }

    public static java.util.Date j(java.util.Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        calendar.set(5, calendar2.get(5));
        calendar.set(2, calendar2.get(2));
        calendar.set(1, calendar2.get(1));
        calendar.add(5, 1);
        calendar.add(14, -1);
        return calendar.getTime();
    }

    public static java.util.Date k(java.util.Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.clear();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTime(date);
        gregorianCalendar.set(5, gregorianCalendar2.get(5));
        gregorianCalendar.set(2, gregorianCalendar2.get(2));
        gregorianCalendar.set(1, gregorianCalendar2.get(1));
        return gregorianCalendar.getTime();
    }

    public static Object l(String str, String str2) throws Exception {
        String lowerCase = str.toLowerCase();
        if (ProtectedSandApp.s("㗵").equals(lowerCase)) {
            return Boolean.valueOf(str2);
        }
        if (ProtectedSandApp.s("㗶").equals(lowerCase)) {
            return Byte.valueOf(str2);
        }
        if (ProtectedSandApp.s("㗷").equals(lowerCase)) {
            return Short.valueOf(str2);
        }
        if (!ProtectedSandApp.s("㗸").equals(lowerCase)) {
            return ProtectedSandApp.s("㗺").equals(lowerCase) ? Integer.valueOf(str2) : ProtectedSandApp.s("㗻").equals(lowerCase) ? Long.valueOf(str2) : ProtectedSandApp.s("㗼").equals(lowerCase) ? Float.valueOf(str2) : ProtectedSandApp.s("㗽").equals(lowerCase) ? Double.valueOf(str2) : ProtectedSandApp.s("㗾").equals(lowerCase) ? str2 : Class.forName(lowerCase).getConstructor(String.class).newInstance(str2);
        }
        if (str2.length() == 1) {
            return Character.valueOf(str2.toCharArray()[0]);
        }
        throw new NumberFormatException(ProtectedSandApp.s("㗹"));
    }

    public static final Object m(String str) {
        try {
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(str);
            }
        } catch (NumberFormatException unused2) {
            return str;
        }
    }

    public static String n(String str) {
        try {
            return o(str, ProtectedSandApp.s("㗿"));
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException(ProtectedSandApp.s("㘀"));
        }
    }

    public static String o(String str, String str2) throws UnsupportedEncodingException {
        if (str != null) {
            return new String(g(str), str2);
        }
        return null;
    }

    public static String p(Locale locale) {
        return q(locale);
    }

    public static String q(Locale locale) {
        return locale != null ? locale.toString() : "";
    }

    public static String r(long j5) {
        return f21492a.format(j5);
    }

    public static final boolean s(Object obj) {
        if (obj != null) {
            return Boolean.valueOf(obj.toString()).booleanValue();
        }
        return false;
    }

    public static final double t(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj == null) {
            return -1.0d;
        }
        try {
            return Double.parseDouble(obj.toString());
        } catch (NumberFormatException unused) {
            return -1.0d;
        }
    }

    public static final int u(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj == null) {
            return -1;
        }
        try {
            return Integer.parseInt(obj.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static final long v(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj == null) {
            return -1L;
        }
        try {
            return Long.parseLong(obj.toString());
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final short w(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).shortValue();
        }
        if (obj == null) {
            return (short) -1;
        }
        try {
            return Short.parseShort(obj.toString());
        } catch (NumberFormatException unused) {
            return (short) -1;
        }
    }

    public static final String x(Object obj, DecimalFormat decimalFormat) {
        decimalFormat.setDecimalSeparatorAlwaysShown(false);
        return obj instanceof Double ? decimalFormat.format(((Double) obj).doubleValue()) : obj instanceof Long ? decimalFormat.format(((Long) obj).longValue()) : obj.toString();
    }

    public static double y(double d6, int i5) {
        return Math.round(d6 * r0) / Math.pow(10.0d, i5);
    }

    public static java.util.Date z(Timestamp timestamp) {
        if (timestamp == null) {
            return null;
        }
        return new java.util.Date(Math.round((timestamp.getNanos() / 1000000.0d) + timestamp.getTime()));
    }
}
