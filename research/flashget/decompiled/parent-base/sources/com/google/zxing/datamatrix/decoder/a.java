package com.google.zxing.datamatrix.decoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;

/* compiled from: BitMatrixParser.java */
/* loaded from: classes6.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f62831a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.zxing.common.b f62832b;

    /* renamed from: c, reason: collision with root package name */
    private final e f62833c;

    a(com.google.zxing.common.b bVar) throws FormatException {
        int k4 = bVar.k();
        if (k4 < 8 || k4 > 144 || (k4 & 1) != 0) {
            throw FormatException.a();
        }
        this.f62833c = j(bVar);
        com.google.zxing.common.b a5 = a(bVar);
        this.f62831a = a5;
        this.f62832b = new com.google.zxing.common.b(a5.o(), a5.k());
    }

    private com.google.zxing.common.b a(com.google.zxing.common.b bVar) {
        int f4 = this.f62833c.f();
        int e4 = this.f62833c.e();
        if (bVar.k() != f4) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0a7f\u0001"));
        }
        int c5 = this.f62833c.c();
        int b5 = this.f62833c.b();
        int i4 = f4 / c5;
        int i5 = e4 / b5;
        com.google.zxing.common.b bVar2 = new com.google.zxing.common.b(i5 * b5, i4 * c5);
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = i6 * c5;
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = i10 * b5;
                for (int i12 = 0; i12 < c5; i12++) {
                    int i13 = ((c5 + 2) * i6) + 1 + i12;
                    int i14 = i7 + i12;
                    for (int i15 = 0; i15 < b5; i15++) {
                        if (bVar.f(((b5 + 2) * i10) + 1 + i15, i13)) {
                            bVar2.s(i11 + i15, i14);
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    private int d(int i4, int i5) {
        int i6 = i4 - 1;
        int i7 = (h(i6, 0, i4, i5) ? 1 : 0) << 1;
        if (h(i6, 1, i4, i5)) {
            i7 |= 1;
        }
        int i10 = i7 << 1;
        if (h(i6, 2, i4, i5)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (h(0, i5 - 2, i4, i5)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        int i13 = i5 - 1;
        if (h(0, i13, i4, i5)) {
            i12 |= 1;
        }
        int i14 = i12 << 1;
        if (h(1, i13, i4, i5)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(2, i13, i4, i5)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        return h(3, i13, i4, i5) ? i16 | 1 : i16;
    }

    private int e(int i4, int i5) {
        int i6 = (h(i4 + (-3), 0, i4, i5) ? 1 : 0) << 1;
        if (h(i4 - 2, 0, i4, i5)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (h(i4 - 1, 0, i4, i5)) {
            i7 |= 1;
        }
        int i10 = i7 << 1;
        if (h(0, i5 - 4, i4, i5)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (h(0, i5 - 3, i4, i5)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(0, i5 - 2, i4, i5)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        int i14 = i5 - 1;
        if (h(0, i14, i4, i5)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        return h(1, i14, i4, i5) ? i15 | 1 : i15;
    }

    private int f(int i4, int i5) {
        int i6 = i4 - 1;
        int i7 = (h(i6, 0, i4, i5) ? 1 : 0) << 1;
        int i10 = i5 - 1;
        if (h(i6, i10, i4, i5)) {
            i7 |= 1;
        }
        int i11 = i7 << 1;
        int i12 = i5 - 3;
        if (h(0, i12, i4, i5)) {
            i11 |= 1;
        }
        int i13 = i11 << 1;
        int i14 = i5 - 2;
        if (h(0, i14, i4, i5)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        if (h(0, i10, i4, i5)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (h(1, i12, i4, i5)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        if (h(1, i14, i4, i5)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        return h(1, i10, i4, i5) ? i18 | 1 : i18;
    }

    private int g(int i4, int i5) {
        int i6 = (h(i4 + (-3), 0, i4, i5) ? 1 : 0) << 1;
        if (h(i4 - 2, 0, i4, i5)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (h(i4 - 1, 0, i4, i5)) {
            i7 |= 1;
        }
        int i10 = i7 << 1;
        if (h(0, i5 - 2, i4, i5)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        int i12 = i5 - 1;
        if (h(0, i12, i4, i5)) {
            i11 |= 1;
        }
        int i13 = i11 << 1;
        if (h(1, i12, i4, i5)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(2, i12, i4, i5)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return h(3, i12, i4, i5) ? i15 | 1 : i15;
    }

    private boolean h(int i4, int i5, int i6, int i7) {
        if (i4 < 0) {
            i4 += i6;
            i5 += 4 - ((i6 + 4) & 7);
        }
        if (i5 < 0) {
            i5 += i7;
            i4 += 4 - ((i7 + 4) & 7);
        }
        this.f62832b.s(i5, i4);
        return this.f62831a.f(i5, i4);
    }

    private int i(int i4, int i5, int i6, int i7) {
        int i10 = i4 - 2;
        int i11 = i5 - 2;
        int i12 = (h(i10, i11, i6, i7) ? 1 : 0) << 1;
        int i13 = i5 - 1;
        if (h(i10, i13, i6, i7)) {
            i12 |= 1;
        }
        int i14 = i12 << 1;
        int i15 = i4 - 1;
        if (h(i15, i11, i6, i7)) {
            i14 |= 1;
        }
        int i16 = i14 << 1;
        if (h(i15, i13, i6, i7)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        if (h(i15, i5, i6, i7)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (h(i4, i11, i6, i7)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (h(i4, i13, i6, i7)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        return h(i4, i5, i6, i7) ? i20 | 1 : i20;
    }

    private static e j(com.google.zxing.common.b bVar) throws FormatException {
        return e.h(bVar.k(), bVar.o());
    }

    e b() {
        return this.f62833c;
    }

    byte[] c() throws FormatException {
        byte[] bArr = new byte[this.f62833c.g()];
        int k4 = this.f62831a.k();
        int o4 = this.f62831a.o();
        int i4 = 0;
        boolean z4 = false;
        int i5 = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i6 = 4;
        while (true) {
            if (i6 == k4 && i4 == 0 && !z4) {
                bArr[i5] = (byte) d(k4, o4);
                i6 -= 2;
                i4 += 2;
                i5++;
                z4 = true;
            } else {
                int i7 = k4 - 2;
                if (i6 == i7 && i4 == 0 && (o4 & 3) != 0 && !z5) {
                    bArr[i5] = (byte) e(k4, o4);
                    i6 -= 2;
                    i4 += 2;
                    i5++;
                    z5 = true;
                } else if (i6 == k4 + 4 && i4 == 2 && (o4 & 7) == 0 && !z6) {
                    bArr[i5] = (byte) f(k4, o4);
                    i6 -= 2;
                    i4 += 2;
                    i5++;
                    z6 = true;
                } else if (i6 == i7 && i4 == 0 && (o4 & 7) == 4 && !z7) {
                    bArr[i5] = (byte) g(k4, o4);
                    i6 -= 2;
                    i4 += 2;
                    i5++;
                    z7 = true;
                } else {
                    while (true) {
                        if (i6 < k4 && i4 >= 0 && !this.f62832b.f(i4, i6)) {
                            bArr[i5] = (byte) i(i6, i4, k4, o4);
                            i5++;
                        }
                        int i10 = i6 - 2;
                        int i11 = i4 + 2;
                        if (i10 < 0 || i11 >= o4) {
                            break;
                        }
                        i6 = i10;
                        i4 = i11;
                    }
                    int i12 = i6 - 1;
                    int i13 = i4 + 5;
                    while (true) {
                        if (i12 >= 0 && i13 < o4 && !this.f62832b.f(i13, i12)) {
                            bArr[i5] = (byte) i(i12, i13, k4, o4);
                            i5++;
                        }
                        int i14 = i12 + 2;
                        int i15 = i13 - 2;
                        if (i14 >= k4 || i15 < 0) {
                            break;
                        }
                        i12 = i14;
                        i13 = i15;
                    }
                    i6 = i12 + 5;
                    i4 = i13 - 1;
                }
            }
            if (i6 >= k4 && i4 >= o4) {
                break;
            }
        }
        if (i5 == this.f62833c.g()) {
            return bArr;
        }
        throw FormatException.a();
    }
}
