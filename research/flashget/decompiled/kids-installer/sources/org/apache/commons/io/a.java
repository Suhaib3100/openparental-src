package org.apache.commons.io;

import java.io.Serializable;

/* compiled from: ByteOrderMark.java */
/* loaded from: classes5.dex */
public class a implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    private static final long f31806q = 1;

    /* renamed from: r, reason: collision with root package name */
    public static final a f31807r = new a("UTF-8", 239, 187, 191);

    /* renamed from: s, reason: collision with root package name */
    public static final a f31808s = new a("UTF-16BE", 254, 255);

    /* renamed from: t, reason: collision with root package name */
    public static final a f31809t = new a("UTF-16LE", 255, 254);

    /* renamed from: u, reason: collision with root package name */
    public static final a f31810u = new a("UTF-32BE", 0, 0, 254, 255);

    /* renamed from: v, reason: collision with root package name */
    public static final a f31811v = new a("UTF-32LE", 255, 254, 0, 0);

    /* renamed from: o, reason: collision with root package name */
    private final String f31812o;

    /* renamed from: p, reason: collision with root package name */
    private final int[] f31813p;

    public a(String str, int... iArr) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("No charsetName specified");
        }
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("No bytes specified");
        }
        this.f31812o = str;
        int[] iArr2 = new int[iArr.length];
        this.f31813p = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
    }

    public int a(int i5) {
        return this.f31813p[i5];
    }

    public byte[] b() {
        byte[] bArr = new byte[this.f31813p.length];
        int i5 = 0;
        while (true) {
            int[] iArr = this.f31813p;
            if (i5 >= iArr.length) {
                return bArr;
            }
            bArr[i5] = (byte) iArr[i5];
            i5++;
        }
    }

    public String c() {
        return this.f31812o;
    }

    public int d() {
        return this.f31813p.length;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f31813p.length != aVar.d()) {
            return false;
        }
        int i5 = 0;
        while (true) {
            int[] iArr = this.f31813p;
            if (i5 >= iArr.length) {
                return true;
            }
            if (iArr[i5] != aVar.a(i5)) {
                return false;
            }
            i5++;
        }
    }

    public int hashCode() {
        int hashCode = getClass().hashCode();
        for (int i5 : this.f31813p) {
            hashCode += i5;
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(this.f31812o);
        sb.append(": ");
        for (int i5 = 0; i5 < this.f31813p.length; i5++) {
            if (i5 > 0) {
                sb.append(",");
            }
            sb.append("0x");
            sb.append(Integer.toHexString(this.f31813p[i5] & 255).toUpperCase());
        }
        sb.append(']');
        return sb.toString();
    }
}
