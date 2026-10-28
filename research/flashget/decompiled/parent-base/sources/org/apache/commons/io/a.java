package org.apache.commons.io;

import java.io.Serializable;

/* compiled from: ByteOrderMark.java */
/* loaded from: classes4.dex */
public class a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final long f85306d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final a f85307e = new a("UTF-8", 239, 187, 191);

    /* renamed from: f, reason: collision with root package name */
    public static final a f85308f = new a("UTF-16BE", 254, 255);

    /* renamed from: g, reason: collision with root package name */
    public static final a f85309g = new a("UTF-16LE", 255, 254);

    /* renamed from: h, reason: collision with root package name */
    public static final a f85310h = new a("UTF-32BE", 0, 0, 254, 255);

    /* renamed from: i, reason: collision with root package name */
    public static final a f85311i = new a("UTF-32LE", 255, 254, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private final String f85312b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f85313c;

    public a(String str, int... iArr) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("No charsetName specified");
        }
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("No bytes specified");
        }
        this.f85312b = str;
        int[] iArr2 = new int[iArr.length];
        this.f85313c = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
    }

    public int a(int i4) {
        return this.f85313c[i4];
    }

    public byte[] b() {
        byte[] bArr = new byte[this.f85313c.length];
        int i4 = 0;
        while (true) {
            int[] iArr = this.f85313c;
            if (i4 >= iArr.length) {
                return bArr;
            }
            bArr[i4] = (byte) iArr[i4];
            i4++;
        }
    }

    public String c() {
        return this.f85312b;
    }

    public int d() {
        return this.f85313c.length;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f85313c.length != aVar.d()) {
            return false;
        }
        int i4 = 0;
        while (true) {
            int[] iArr = this.f85313c;
            if (i4 >= iArr.length) {
                return true;
            }
            if (iArr[i4] != aVar.a(i4)) {
                return false;
            }
            i4++;
        }
    }

    public int hashCode() {
        int hashCode = getClass().hashCode();
        for (int i4 : this.f85313c) {
            hashCode += i4;
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(this.f85312b);
        sb.append(": ");
        for (int i4 = 0; i4 < this.f85313c.length; i4++) {
            if (i4 > 0) {
                sb.append(",");
            }
            sb.append("0x");
            sb.append(Integer.toHexString(this.f85313c[i4] & 255).toUpperCase());
        }
        sb.append(']');
        return sb.toString();
    }
}
