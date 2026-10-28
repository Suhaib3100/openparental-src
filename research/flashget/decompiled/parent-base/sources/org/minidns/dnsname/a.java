package org.minidns.dnsname;

import hg.c;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.minidns.dnslabel.DnsLabel;
import org.minidns.dnsname.InvalidDnsNameException;

/* compiled from: DnsName.java */
/* loaded from: classes4.dex */
public final class a implements CharSequence, Serializable, Comparable<a> {

    /* renamed from: m, reason: collision with root package name */
    private static final long f87218m = 1;

    /* renamed from: o, reason: collision with root package name */
    static final int f87220o = 255;

    /* renamed from: p, reason: collision with root package name */
    public static final int f87221p = 128;

    /* renamed from: u, reason: collision with root package name */
    static final /* synthetic */ boolean f87226u = false;

    /* renamed from: b, reason: collision with root package name */
    public final String f87227b;

    /* renamed from: c, reason: collision with root package name */
    private final String f87228c;

    /* renamed from: d, reason: collision with root package name */
    private transient byte[] f87229d;

    /* renamed from: e, reason: collision with root package name */
    private transient byte[] f87230e;

    /* renamed from: f, reason: collision with root package name */
    private transient String f87231f;

    /* renamed from: g, reason: collision with root package name */
    private transient String f87232g;

    /* renamed from: h, reason: collision with root package name */
    private transient String f87233h;

    /* renamed from: i, reason: collision with root package name */
    private transient DnsLabel[] f87234i;

    /* renamed from: j, reason: collision with root package name */
    private transient DnsLabel[] f87235j;

    /* renamed from: k, reason: collision with root package name */
    private transient int f87236k;

    /* renamed from: l, reason: collision with root package name */
    private int f87237l;

    /* renamed from: n, reason: collision with root package name */
    private static final String f87219n = "[.。．｡]";

    /* renamed from: q, reason: collision with root package name */
    public static final a f87222q = new a(".", true);

    /* renamed from: r, reason: collision with root package name */
    public static final a f87223r = new a("in-addr.arpa", true);

    /* renamed from: s, reason: collision with root package name */
    public static final a f87224s = new a("ip6.arpa", true);

    /* renamed from: t, reason: collision with root package name */
    public static boolean f87225t = true;

    private a(String str) {
        this(str, true);
    }

    private static String C(DnsLabel[] dnsLabelArr, int i4) {
        StringBuilder sb = new StringBuilder(i4);
        for (int length = dnsLabelArr.length - 1; length >= 0; length--) {
            sb.append((CharSequence) dnsLabelArr[length]);
            sb.append('.');
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static a E(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte & 192) == 192) {
            int readUnsignedByte2 = dataInputStream.readUnsignedByte() + ((readUnsignedByte & 63) << 8);
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(readUnsignedByte2));
            return G(bArr, readUnsignedByte2, hashSet);
        }
        if (readUnsignedByte == 0) {
            return f87222q;
        }
        byte[] bArr2 = new byte[readUnsignedByte];
        dataInputStream.readFully(bArr2);
        return k(new a(new String(bArr2, StandardCharsets.US_ASCII), true), E(dataInputStream, bArr));
    }

    private static a G(byte[] bArr, int i4, HashSet<Integer> hashSet) throws IllegalStateException {
        int i5 = bArr[i4];
        int i6 = i5 & 255;
        if ((i5 & 192) != 192) {
            if (i6 == 0) {
                return f87222q;
            }
            int i7 = i4 + 1;
            return k(new a(new String(bArr, i7, i6, StandardCharsets.US_ASCII), true), G(bArr, i7 + i6, hashSet));
        }
        int i10 = ((i5 & 63) << 8) + (bArr[i4 + 1] & 255);
        if (hashSet.contains(Integer.valueOf(i10))) {
            throw new IllegalStateException("Cyclic offsets detected.");
        }
        hashSet.add(Integer.valueOf(i10));
        return G(bArr, i10, hashSet);
    }

    private void J() {
        if (this.f87229d != null) {
            return;
        }
        L();
        this.f87229d = P(this.f87234i);
    }

    private void K() {
        if (this.f87233h != null) {
            return;
        }
        String[] split = this.f87227b.split("[.。．｡]", 2);
        this.f87233h = split[0];
        if (split.length > 1) {
            this.f87232g = split[1];
        } else {
            this.f87232g = "";
        }
    }

    private void L() {
        if (this.f87234i == null || this.f87235j == null) {
            if (!B()) {
                this.f87234i = u(this.f87227b);
                this.f87235j = u(this.f87228c);
            } else {
                DnsLabel[] dnsLabelArr = new DnsLabel[0];
                this.f87234i = dnsLabelArr;
                this.f87235j = dnsLabelArr;
            }
        }
    }

    private static byte[] P(DnsLabel[] dnsLabelArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        for (int length = dnsLabelArr.length - 1; length >= 0; length--) {
            dnsLabelArr[length].m(byteArrayOutputStream);
        }
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }

    private void Q() {
        J();
        if (this.f87229d.length > 255) {
            throw new InvalidDnsNameException.DNSNameTooLongException(this.f87227b, this.f87229d);
        }
    }

    public static a f(CharSequence charSequence) {
        return h(charSequence.toString());
    }

    public static a g(CharSequence charSequence, a aVar) {
        return j(DnsLabel.f(charSequence.toString()), aVar);
    }

    public static a h(String str) {
        return new a(str, false);
    }

    public static a i(DnsLabel dnsLabel, DnsLabel dnsLabel2, a aVar) {
        aVar.J();
        DnsLabel[] dnsLabelArr = aVar.f87235j;
        DnsLabel[] dnsLabelArr2 = new DnsLabel[dnsLabelArr.length + 2];
        System.arraycopy(dnsLabelArr, 0, dnsLabelArr2, 0, dnsLabelArr.length);
        DnsLabel[] dnsLabelArr3 = aVar.f87235j;
        dnsLabelArr2[dnsLabelArr3.length] = dnsLabel2;
        dnsLabelArr2[dnsLabelArr3.length + 1] = dnsLabel;
        return new a(dnsLabelArr2, true);
    }

    public static a j(DnsLabel dnsLabel, a aVar) {
        aVar.L();
        DnsLabel[] dnsLabelArr = aVar.f87235j;
        DnsLabel[] dnsLabelArr2 = new DnsLabel[dnsLabelArr.length + 1];
        System.arraycopy(dnsLabelArr, 0, dnsLabelArr2, 0, dnsLabelArr.length);
        dnsLabelArr2[aVar.f87235j.length] = dnsLabel;
        return new a(dnsLabelArr2, true);
    }

    public static a k(a aVar, a aVar2) {
        aVar.L();
        aVar2.L();
        int length = aVar.f87235j.length;
        DnsLabel[] dnsLabelArr = aVar2.f87235j;
        DnsLabel[] dnsLabelArr2 = new DnsLabel[length + dnsLabelArr.length];
        System.arraycopy(dnsLabelArr, 0, dnsLabelArr2, 0, dnsLabelArr.length);
        DnsLabel[] dnsLabelArr3 = aVar.f87235j;
        System.arraycopy(dnsLabelArr3, 0, dnsLabelArr2, aVar2.f87235j.length, dnsLabelArr3.length);
        return new a(dnsLabelArr2, true);
    }

    public static a l(String[] strArr) {
        return new a(DnsLabel.g(strArr), true);
    }

    public static a m(a... aVarArr) {
        int i4 = 0;
        for (a aVar : aVarArr) {
            aVar.L();
            i4 += aVar.f87235j.length;
        }
        DnsLabel[] dnsLabelArr = new DnsLabel[i4];
        int i5 = 0;
        for (int length = aVarArr.length - 1; length >= 0; length--) {
            a aVar2 = aVarArr[length];
            DnsLabel[] dnsLabelArr2 = aVar2.f87235j;
            System.arraycopy(dnsLabelArr2, 0, dnsLabelArr, i5, dnsLabelArr2.length);
            i5 += aVar2.f87235j.length;
        }
        return new a(dnsLabelArr, true);
    }

    private static DnsLabel[] u(String str) {
        String[] split = str.split("[.。．｡]", 128);
        for (int i4 = 0; i4 < split.length / 2; i4++) {
            String str2 = split[i4];
            int length = (split.length - i4) - 1;
            split[i4] = split[length];
            split[length] = str2;
        }
        try {
            return DnsLabel.g(split);
        } catch (DnsLabel.LabelToLongException e4) {
            throw new InvalidDnsNameException.LabelTooLongException(str, e4.f87160b);
        }
    }

    public boolean A(a aVar) {
        L();
        aVar.L();
        if (this.f87234i.length - 1 != aVar.f87234i.length) {
            return false;
        }
        int i4 = 0;
        while (true) {
            DnsLabel[] dnsLabelArr = aVar.f87234i;
            if (i4 >= dnsLabelArr.length) {
                return true;
            }
            if (!this.f87234i[i4].equals(dnsLabelArr[i4])) {
                return false;
            }
            i4++;
        }
    }

    public boolean B() {
        return this.f87227b.isEmpty() || this.f87227b.equals(".");
    }

    public int M() {
        if (this.f87237l < 0) {
            if (B()) {
                this.f87237l = 1;
            } else {
                this.f87237l = this.f87227b.length() + 2;
            }
        }
        return this.f87237l;
    }

    public a N(int i4) {
        L();
        DnsLabel[] dnsLabelArr = this.f87234i;
        if (i4 <= dnsLabelArr.length) {
            return i4 == dnsLabelArr.length ? this : i4 == 0 ? f87222q : new a((DnsLabel[]) Arrays.copyOfRange(this.f87235j, 0, i4), false);
        }
        throw new IllegalArgumentException();
    }

    public void R(OutputStream outputStream) throws IOException {
        J();
        outputStream.write(this.f87229d);
    }

    public String a() {
        String str = this.f87231f;
        if (str != null) {
            return str;
        }
        String c5 = c.c(this.f87227b);
        this.f87231f = c5;
        return c5;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i4) {
        return this.f87227b.charAt(i4);
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return this.f87227b.compareTo(aVar.f87227b);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        J();
        aVar.J();
        return Arrays.equals(this.f87229d, aVar.f87229d);
    }

    public int hashCode() {
        if (this.f87236k == 0 && !B()) {
            J();
            this.f87236k = Arrays.hashCode(this.f87229d);
        }
        return this.f87236k;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f87227b.length();
    }

    public byte[] n() {
        J();
        return (byte[]) this.f87229d.clone();
    }

    public String o() {
        K();
        return this.f87232g;
    }

    public String p() {
        K();
        return this.f87233h;
    }

    public DnsLabel q() {
        L();
        return this.f87234i[r0.length - 1];
    }

    public DnsLabel r(int i4) {
        L();
        return this.f87234i[i4];
    }

    public int s() {
        L();
        return this.f87234i.length;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i4, int i5) {
        return this.f87227b.subSequence(i4, i5);
    }

    public DnsLabel[] t() {
        L();
        return (DnsLabel[]) this.f87234i.clone();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f87227b;
    }

    public a v() {
        return B() ? f87222q : N(s() - 1);
    }

    public String w() {
        return this.f87228c;
    }

    public byte[] x() {
        if (this.f87230e == null) {
            L();
            this.f87230e = P(this.f87235j);
        }
        return (byte[]) this.f87230e.clone();
    }

    public DnsLabel[] y() {
        L();
        return (DnsLabel[]) this.f87235j.clone();
    }

    public boolean z(a aVar) {
        L();
        aVar.L();
        if (this.f87234i.length < aVar.f87234i.length) {
            return false;
        }
        int i4 = 0;
        while (true) {
            DnsLabel[] dnsLabelArr = aVar.f87234i;
            if (i4 >= dnsLabelArr.length) {
                return true;
            }
            if (!this.f87234i[i4].equals(dnsLabelArr[i4])) {
                return false;
            }
            i4++;
        }
    }

    private a(String str, boolean z4) {
        this.f87237l = -1;
        if (str.isEmpty()) {
            this.f87228c = f87222q.f87228c;
        } else {
            int length = str.length();
            int i4 = length - 1;
            if (length >= 2 && str.charAt(i4) == '.') {
                str = str.subSequence(0, i4).toString();
            }
            if (z4) {
                this.f87228c = str;
            } else {
                this.f87228c = c.b(str);
            }
        }
        this.f87227b = this.f87228c.toLowerCase(Locale.US);
        if (f87225t) {
            Q();
        }
    }

    private a(DnsLabel[] dnsLabelArr, boolean z4) {
        this.f87237l = -1;
        this.f87235j = dnsLabelArr;
        this.f87234i = new DnsLabel[dnsLabelArr.length];
        int i4 = 0;
        for (int i5 = 0; i5 < dnsLabelArr.length; i5++) {
            i4 = com.google.android.gms.common.stats.a.a(dnsLabelArr[i5].f87155b, 1, i4);
            this.f87234i[i5] = dnsLabelArr[i5].a();
        }
        this.f87228c = C(dnsLabelArr, i4);
        this.f87227b = C(this.f87234i, i4);
        if (z4 && f87225t) {
            Q();
        }
    }
}
