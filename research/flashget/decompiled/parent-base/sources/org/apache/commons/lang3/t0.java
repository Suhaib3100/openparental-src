package org.apache.commons.lang3;

import java.util.regex.Pattern;

/* compiled from: RegExUtils.java */
/* loaded from: classes6.dex */
public class t0 {
    public static String a(String str, String str2) {
        return f(str, str2, "");
    }

    public static String b(String str, Pattern pattern) {
        return g(str, pattern, "");
    }

    public static String c(String str, String str2) {
        return h(str, str2, "");
    }

    public static String d(String str, Pattern pattern) {
        return i(str, pattern, "");
    }

    public static String e(String str, String str2) {
        return j(str, str2, "");
    }

    public static String f(String str, String str2, String str3) {
        return (str == null || str2 == null || str3 == null) ? str : str.replaceAll(str2, str3);
    }

    public static String g(String str, Pattern pattern, String str2) {
        return (str == null || pattern == null || str2 == null) ? str : pattern.matcher(str).replaceAll(str2);
    }

    public static String h(String str, String str2, String str3) {
        return (str == null || str2 == null || str3 == null) ? str : str.replaceFirst(str2, str3);
    }

    public static String i(String str, Pattern pattern, String str2) {
        return (str == null || pattern == null || str2 == null) ? str : pattern.matcher(str).replaceFirst(str2);
    }

    public static String j(String str, String str2, String str3) {
        return (str == null || str2 == null || str3 == null) ? str : Pattern.compile(str2, 32).matcher(str).replaceAll(str3);
    }
}
