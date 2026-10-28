package org.threeten.bp.format;

import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: DecimalStyle.java */
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f88212e = new h('0', '+', '-', '.');

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap<Locale, h> f88213f = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: a, reason: collision with root package name */
    private final char f88214a;

    /* renamed from: b, reason: collision with root package name */
    private final char f88215b;

    /* renamed from: c, reason: collision with root package name */
    private final char f88216c;

    /* renamed from: d, reason: collision with root package name */
    private final char f88217d;

    private h(char c5, char c6, char c7, char c10) {
        this.f88214a = c5;
        this.f88215b = c6;
        this.f88216c = c7;
        this.f88217d = c10;
    }

    private static h c(Locale locale) {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        return (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') ? f88212e : new h(zeroDigit, '+', minusSign, decimalSeparator);
    }

    public static Set<Locale> d() {
        return new HashSet(Arrays.asList(DecimalFormatSymbols.getAvailableLocales()));
    }

    public static h i(Locale locale) {
        ng.d.j(locale, "locale");
        ConcurrentMap<Locale, h> concurrentMap = f88213f;
        h hVar = concurrentMap.get(locale);
        if (hVar != null) {
            return hVar;
        }
        concurrentMap.putIfAbsent(locale, c(locale));
        return concurrentMap.get(locale);
    }

    public static h j() {
        return i(Locale.getDefault());
    }

    String a(String str) {
        char c5 = this.f88214a;
        if (c5 == '0') {
            return str;
        }
        int i4 = c5 - '0';
        char[] charArray = str.toCharArray();
        for (int i5 = 0; i5 < charArray.length; i5++) {
            charArray[i5] = (char) (charArray[i5] + i4);
        }
        return new String(charArray);
    }

    int b(char c5) {
        int i4 = c5 - this.f88214a;
        if (i4 < 0 || i4 > 9) {
            return -1;
        }
        return i4;
    }

    public char e() {
        return this.f88217d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f88214a == hVar.f88214a && this.f88215b == hVar.f88215b && this.f88216c == hVar.f88216c && this.f88217d == hVar.f88217d;
    }

    public char f() {
        return this.f88216c;
    }

    public char g() {
        return this.f88215b;
    }

    public char h() {
        return this.f88214a;
    }

    public int hashCode() {
        return this.f88214a + this.f88215b + this.f88216c + this.f88217d;
    }

    public h k(char c5) {
        return c5 == this.f88217d ? this : new h(this.f88214a, this.f88215b, this.f88216c, c5);
    }

    public h l(char c5) {
        return c5 == this.f88216c ? this : new h(this.f88214a, this.f88215b, c5, this.f88217d);
    }

    public h m(char c5) {
        return c5 == this.f88215b ? this : new h(this.f88214a, c5, this.f88216c, this.f88217d);
    }

    public h n(char c5) {
        return c5 == this.f88214a ? this : new h(c5, this.f88215b, this.f88216c, this.f88217d);
    }

    public String toString() {
        return "DecimalStyle[" + this.f88214a + this.f88215b + this.f88216c + this.f88217d + "]";
    }
}
