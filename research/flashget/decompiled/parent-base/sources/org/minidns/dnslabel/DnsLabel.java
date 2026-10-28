package org.minidns.dnslabel;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class DnsLabel implements CharSequence, Comparable<DnsLabel> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f87152f = 63;

    /* renamed from: g, reason: collision with root package name */
    public static final DnsLabel f87153g = f("*");

    /* renamed from: h, reason: collision with root package name */
    public static boolean f87154h = true;

    /* renamed from: b, reason: collision with root package name */
    public final String f87155b;

    /* renamed from: c, reason: collision with root package name */
    private transient String f87156c;

    /* renamed from: d, reason: collision with root package name */
    private transient DnsLabel f87157d;

    /* renamed from: e, reason: collision with root package name */
    private transient byte[] f87158e;

    public static class LabelToLongException extends IllegalArgumentException {

        /* renamed from: c, reason: collision with root package name */
        private static final long f87159c = 1;

        /* renamed from: b, reason: collision with root package name */
        public final String f87160b;

        LabelToLongException(String str) {
            this.f87160b = str;
        }
    }

    protected DnsLabel(String str) {
        this.f87155b = str;
        if (f87154h) {
            l();
            if (this.f87158e.length > 63) {
                throw new LabelToLongException(str);
            }
        }
    }

    public static DnsLabel f(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Label is null or empty");
        }
        return c.o(str) ? c.n(str) : e.n(str);
    }

    public static DnsLabel[] g(String[] strArr) {
        DnsLabel[] dnsLabelArr = new DnsLabel[strArr.length];
        for (int i4 = 0; i4 < strArr.length; i4++) {
            dnsLabelArr[i4] = f(strArr[i4]);
        }
        return dnsLabelArr;
    }

    public static boolean k(String str) {
        return str.toLowerCase(Locale.US).startsWith("xn--");
    }

    private void l() {
        if (this.f87158e == null) {
            this.f87158e = this.f87155b.getBytes(StandardCharsets.US_ASCII);
        }
    }

    public final DnsLabel a() {
        if (this.f87157d == null) {
            this.f87157d = f(this.f87155b.toLowerCase(Locale.US));
        }
        return this.f87157d;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.f87155b.charAt(i4);
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(DnsLabel dnsLabel) {
        return a().f87155b.compareTo(dnsLabel.a().f87155b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DnsLabel) {
            return this.f87155b.equals(((DnsLabel) obj).f87155b);
        }
        return false;
    }

    public final String h() {
        if (this.f87156c == null) {
            this.f87156c = i();
        }
        return this.f87156c;
    }

    public final int hashCode() {
        return this.f87155b.hashCode();
    }

    protected String i() {
        return this.f87155b;
    }

    public final String j() {
        return getClass().getSimpleName();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f87155b.length();
    }

    public final void m(ByteArrayOutputStream byteArrayOutputStream) {
        l();
        byteArrayOutputStream.write(this.f87158e.length);
        byte[] bArr = this.f87158e;
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i5) {
        return this.f87155b.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f87155b;
    }
}
