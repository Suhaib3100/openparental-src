package com.google.zxing.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;

/* compiled from: BitMatrix.java */
/* loaded from: classes6.dex */
public final class b implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    private final int f62763b;

    /* renamed from: c, reason: collision with root package name */
    private final int f62764c;

    /* renamed from: d, reason: collision with root package name */
    private final int f62765d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f62766e;

    public b(int i4) {
        this(i4, i4);
    }

    private String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder((this.f62763b + 1) * this.f62764c);
        for (int i4 = 0; i4 < this.f62764c; i4++) {
            for (int i5 = 0; i5 < this.f62763b; i5++) {
                sb.append(f(i5, i4) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public static b p(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        boolean[] zArr = new boolean[str.length()];
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            int length = str.length();
            String s4 = ProtectedSandApp.s("ਟ\u0001");
            if (i5 >= length) {
                if (i6 > i7) {
                    if (i4 == -1) {
                        i4 = i6 - i7;
                    } else if (i6 - i7 != i4) {
                        throw new IllegalArgumentException(s4);
                    }
                    i10++;
                }
                b bVar = new b(i4, i10);
                for (int i11 = 0; i11 < i6; i11++) {
                    if (zArr[i11]) {
                        bVar.s(i11 % i4, i11 / i4);
                    }
                }
                return bVar;
            }
            if (str.charAt(i5) == '\n' || str.charAt(i5) == '\r') {
                if (i6 > i7) {
                    if (i4 == -1) {
                        i4 = i6 - i7;
                    } else if (i6 - i7 != i4) {
                        throw new IllegalArgumentException(s4);
                    }
                    i10++;
                    i7 = i6;
                }
                i5++;
            } else {
                if (str.startsWith(str2, i5)) {
                    i5 += str2.length();
                    zArr[i6] = true;
                } else {
                    if (!str.startsWith(str3, i5)) {
                        throw new IllegalArgumentException(ProtectedSandApp.s("ਠ\u0001") + str.substring(i5));
                    }
                    i5 += str3.length();
                    zArr[i6] = false;
                }
                i6++;
            }
        }
    }

    public static b q(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        b bVar = new b(length2, length);
        for (int i4 = 0; i4 < length; i4++) {
            boolean[] zArr2 = zArr[i4];
            for (int i5 = 0; i5 < length2; i5++) {
                if (zArr2[i5]) {
                    bVar.s(i5, i4);
                }
            }
        }
        return bVar;
    }

    public void c() {
        int length = this.f62766e.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f62766e[i4] = 0;
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f62763b, this.f62764c, this.f62765d, (int[]) this.f62766e.clone());
    }

    public void e(int i4, int i5) {
        int i6 = (i4 / 32) + (i5 * this.f62765d);
        int[] iArr = this.f62766e;
        iArr[i6] = (1 << (i4 & 31)) ^ iArr[i6];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f62763b == bVar.f62763b && this.f62764c == bVar.f62764c && this.f62765d == bVar.f62765d && Arrays.equals(this.f62766e, bVar.f62766e);
    }

    public boolean f(int i4, int i5) {
        return ((this.f62766e[(i4 / 32) + (i5 * this.f62765d)] >>> (i4 & 31)) & 1) != 0;
    }

    public int[] g() {
        int length = this.f62766e.length - 1;
        while (length >= 0 && this.f62766e[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i4 = this.f62765d;
        int i5 = length / i4;
        int i6 = (length % i4) << 5;
        int i7 = 31;
        while ((this.f62766e[length] >>> i7) == 0) {
            i7--;
        }
        return new int[]{i6 + i7, i5};
    }

    public int hashCode() {
        int i4 = this.f62763b;
        return Arrays.hashCode(this.f62766e) + (((((((i4 * 31) + i4) * 31) + this.f62764c) * 31) + this.f62765d) * 31);
    }

    public int[] i() {
        int i4 = this.f62763b;
        int i5 = this.f62764c;
        int i6 = -1;
        int i7 = -1;
        for (int i10 = 0; i10 < this.f62764c; i10++) {
            int i11 = 0;
            while (true) {
                int i12 = this.f62765d;
                if (i11 < i12) {
                    int i13 = this.f62766e[(i12 * i10) + i11];
                    if (i13 != 0) {
                        if (i10 < i5) {
                            i5 = i10;
                        }
                        if (i10 > i7) {
                            i7 = i10;
                        }
                        int i14 = i11 << 5;
                        if (i14 < i4) {
                            int i15 = 0;
                            while ((i13 << (31 - i15)) == 0) {
                                i15++;
                            }
                            int i16 = i15 + i14;
                            if (i16 < i4) {
                                i4 = i16;
                            }
                        }
                        if (i14 + 31 > i6) {
                            int i17 = 31;
                            while ((i13 >>> i17) == 0) {
                                i17--;
                            }
                            int i18 = i14 + i17;
                            if (i18 > i6) {
                                i6 = i18;
                            }
                        }
                    }
                    i11++;
                }
            }
        }
        if (i6 < i4 || i7 < i5) {
            return null;
        }
        return new int[]{i4, i5, (i6 - i4) + 1, (i7 - i5) + 1};
    }

    public int k() {
        return this.f62764c;
    }

    public a l(int i4, a aVar) {
        if (aVar == null || aVar.o() < this.f62763b) {
            aVar = new a(this.f62763b);
        } else {
            aVar.e();
        }
        int i5 = i4 * this.f62765d;
        for (int i6 = 0; i6 < this.f62765d; i6++) {
            aVar.u(i6 << 5, this.f62766e[i5 + i6]);
        }
        return aVar;
    }

    public int m() {
        return this.f62765d;
    }

    public int[] n() {
        int[] iArr;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            iArr = this.f62766e;
            if (i5 >= iArr.length || iArr[i5] != 0) {
                break;
            }
            i5++;
        }
        if (i5 == iArr.length) {
            return null;
        }
        int i6 = this.f62765d;
        int i7 = i5 / i6;
        int i10 = (i5 % i6) << 5;
        while ((iArr[i5] << (31 - i4)) == 0) {
            i4++;
        }
        return new int[]{i10 + i4, i7};
    }

    public int o() {
        return this.f62763b;
    }

    public void r() {
        a aVar = new a(this.f62763b);
        a aVar2 = new a(this.f62763b);
        int i4 = (this.f62764c + 1) / 2;
        for (int i5 = 0; i5 < i4; i5++) {
            aVar = l(i5, aVar);
            int i6 = (this.f62764c - 1) - i5;
            aVar2 = l(i6, aVar2);
            aVar.s();
            aVar2.s();
            u(i5, aVar2);
            u(i6, aVar);
        }
    }

    public void s(int i4, int i5) {
        int i6 = (i4 / 32) + (i5 * this.f62765d);
        int[] iArr = this.f62766e;
        iArr[i6] = (1 << (i4 & 31)) | iArr[i6];
    }

    public void t(int i4, int i5, int i6, int i7) {
        if (i5 < 0 || i4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਣ\u0001"));
        }
        if (i7 <= 0 || i6 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਢ\u0001"));
        }
        int i10 = i6 + i4;
        int i11 = i7 + i5;
        if (i11 > this.f62764c || i10 > this.f62763b) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਡ\u0001"));
        }
        while (i5 < i11) {
            int i12 = this.f62765d * i5;
            for (int i13 = i4; i13 < i10; i13++) {
                int[] iArr = this.f62766e;
                int i14 = (i13 / 32) + i12;
                iArr[i14] = iArr[i14] | (1 << (i13 & 31));
            }
            i5++;
        }
    }

    public String toString() {
        return b(ProtectedSandApp.s("ਥ\u0001"), ProtectedSandApp.s("ਦ\u0001"), ProtectedSandApp.s("ਤ\u0001"));
    }

    public void u(int i4, a aVar) {
        int[] l4 = aVar.l();
        int[] iArr = this.f62766e;
        int i5 = this.f62765d;
        System.arraycopy(l4, 0, iArr, i4 * i5, i5);
    }

    public String v(String str, String str2) {
        return b(str, str2, ProtectedSandApp.s("ਤ\u0001"));
    }

    @Deprecated
    public String w(String str, String str2, String str3) {
        return b(str, str2, str3);
    }

    public void y(int i4, int i5) {
        int i6 = (i4 / 32) + (i5 * this.f62765d);
        int[] iArr = this.f62766e;
        iArr[i6] = (~(1 << (i4 & 31))) & iArr[i6];
    }

    public void z(b bVar) {
        int i4 = this.f62763b;
        if (i4 != bVar.f62763b || this.f62764c != bVar.f62764c || this.f62765d != bVar.f62765d) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਧ\u0001"));
        }
        a aVar = new a(i4);
        for (int i5 = 0; i5 < this.f62764c; i5++) {
            int i6 = this.f62765d * i5;
            int[] l4 = bVar.l(i5, aVar).l();
            for (int i7 = 0; i7 < this.f62765d; i7++) {
                int[] iArr = this.f62766e;
                int i10 = i6 + i7;
                iArr[i10] = iArr[i10] ^ l4[i7];
            }
        }
    }

    public b(int i4, int i5) {
        if (i4 <= 0 || i5 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਞ\u0001"));
        }
        this.f62763b = i4;
        this.f62764c = i5;
        int i6 = (i4 + 31) / 32;
        this.f62765d = i6;
        this.f62766e = new int[i6 * i5];
    }

    private b(int i4, int i5, int i6, int[] iArr) {
        this.f62763b = i4;
        this.f62764c = i5;
        this.f62765d = i6;
        this.f62766e = iArr;
    }
}
