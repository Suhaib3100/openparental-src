package org.apache.commons.lang3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: LocaleUtils.java */
/* loaded from: classes6.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<String, List<Locale>> f86067a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, List<Locale>> f86068b = new ConcurrentHashMap();

    /* compiled from: LocaleUtils.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final List<Locale> f86069a;

        /* renamed from: b, reason: collision with root package name */
        private static final Set<Locale> f86070b;

        static {
            ArrayList arrayList = new ArrayList(Arrays.asList(Locale.getAvailableLocales()));
            f86069a = Collections.unmodifiableList(arrayList);
            f86070b = Collections.unmodifiableSet(new HashSet(arrayList));
        }

        a() {
        }
    }

    public static List<Locale> a() {
        return a.f86069a;
    }

    public static Set<Locale> b() {
        return a.f86070b;
    }

    public static List<Locale> c(String str) {
        if (str == null) {
            return Collections.emptyList();
        }
        List<Locale> list = f86068b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Locale locale : a.f86069a) {
            if (str.equals(locale.getLanguage()) && !locale.getCountry().isEmpty() && locale.getVariant().isEmpty()) {
                arrayList.add(locale);
            }
        }
        List<Locale> unmodifiableList = Collections.unmodifiableList(arrayList);
        ConcurrentMap<String, List<Locale>> concurrentMap = f86068b;
        concurrentMap.putIfAbsent(str, unmodifiableList);
        return concurrentMap.get(str);
    }

    public static boolean d(Locale locale) {
        return a.f86069a.contains(locale);
    }

    private static boolean e(String str) {
        return b1.x0(str) && str.length() == 2;
    }

    private static boolean f(String str) {
        return b1.w0(str) && (str.length() == 2 || str.length() == 3);
    }

    private static boolean g(String str) {
        return b1.M0(str) && str.length() == 3;
    }

    public static List<Locale> h(String str) {
        if (str == null) {
            return Collections.emptyList();
        }
        List<Locale> list = f86067a.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Locale locale : a.f86069a) {
            if (str.equals(locale.getCountry()) && locale.getVariant().isEmpty()) {
                arrayList.add(locale);
            }
        }
        List<Locale> unmodifiableList = Collections.unmodifiableList(arrayList);
        ConcurrentMap<String, List<Locale>> concurrentMap = f86067a;
        concurrentMap.putIfAbsent(str, unmodifiableList);
        return concurrentMap.get(str);
    }

    public static List<Locale> i(Locale locale) {
        return j(locale, locale);
    }

    public static List<Locale> j(Locale locale, Locale locale2) {
        ArrayList arrayList = new ArrayList(4);
        if (locale != null) {
            arrayList.add(locale);
            if (!locale.getVariant().isEmpty()) {
                arrayList.add(new Locale(locale.getLanguage(), locale.getCountry()));
            }
            if (!locale.getCountry().isEmpty()) {
                arrayList.add(new Locale(locale.getLanguage(), ""));
            }
            if (!arrayList.contains(locale2)) {
                arrayList.add(locale2);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static Locale k(String str) {
        if (f(str)) {
            return new Locale(str);
        }
        String[] split = str.split("_", -1);
        String str2 = split[0];
        if (split.length == 2) {
            String str3 = split[1];
            if ((f(str2) && e(str3)) || g(str3)) {
                return new Locale(str2, str3);
            }
        } else if (split.length == 3) {
            String str4 = split[1];
            String str5 = split[2];
            if (f(str2) && ((str4.isEmpty() || e(str4) || g(str4)) && !str5.isEmpty())) {
                return new Locale(str2, str4, str5);
            }
        }
        throw new IllegalArgumentException("Invalid locale format: ".concat(str));
    }

    public static Locale l(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new Locale("", "");
        }
        if (str.contains("#")) {
            throw new IllegalArgumentException("Invalid locale format: ".concat(str));
        }
        int length = str.length();
        if (length < 2) {
            throw new IllegalArgumentException("Invalid locale format: ".concat(str));
        }
        if (str.charAt(0) != '_') {
            return k(str);
        }
        if (length < 3) {
            throw new IllegalArgumentException("Invalid locale format: ".concat(str));
        }
        char charAt = str.charAt(1);
        char charAt2 = str.charAt(2);
        if (!Character.isUpperCase(charAt) || !Character.isUpperCase(charAt2)) {
            throw new IllegalArgumentException("Invalid locale format: ".concat(str));
        }
        if (length == 3) {
            return new Locale("", str.substring(1, 3));
        }
        if (length < 5) {
            throw new IllegalArgumentException("Invalid locale format: ".concat(str));
        }
        if (str.charAt(3) == '_') {
            return new Locale("", str.substring(1, 3), str.substring(4));
        }
        throw new IllegalArgumentException("Invalid locale format: ".concat(str));
    }
}
