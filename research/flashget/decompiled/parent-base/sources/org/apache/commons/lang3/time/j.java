package org.apache.commons.lang3.time;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: FastTimeZone.java */
/* loaded from: classes6.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f86358a = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");

    /* renamed from: b, reason: collision with root package name */
    private static final TimeZone f86359b = new l(false, 0, 0);

    private j() {
    }

    public static TimeZone a() {
        return f86359b;
    }

    public static TimeZone b(String str) {
        if ("Z".equals(str) || "UTC".equals(str)) {
            return f86359b;
        }
        Matcher matcher = f86358a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        int d5 = d(matcher.group(2));
        int d6 = d(matcher.group(4));
        return (d5 == 0 && d6 == 0) ? f86359b : new l(e(matcher.group(1)), d5, d6);
    }

    public static TimeZone c(String str) {
        TimeZone b5 = b(str);
        return b5 != null ? b5 : TimeZone.getTimeZone(str);
    }

    private static int d(String str) {
        if (str != null) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    private static boolean e(String str) {
        return str != null && str.charAt(0) == '-';
    }
}
