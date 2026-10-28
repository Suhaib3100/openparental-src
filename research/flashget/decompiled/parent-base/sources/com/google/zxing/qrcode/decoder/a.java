package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;

/* compiled from: BitMatrixParser.java */
/* loaded from: classes6.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f63286a;

    /* renamed from: b, reason: collision with root package name */
    private j f63287b;

    /* renamed from: c, reason: collision with root package name */
    private g f63288c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f63289d;

    a(com.google.zxing.common.b bVar) throws FormatException {
        int k4 = bVar.k();
        if (k4 < 21 || (k4 & 3) != 1) {
            throw FormatException.a();
        }
        this.f63286a = bVar;
    }

    private int a(int i4, int i5, int i6) {
        return this.f63289d ? this.f63286a.f(i5, i4) : this.f63286a.f(i4, i5) ? (i6 << 1) | 1 : i6 << 1;
    }

    void b() {
        int i4 = 0;
        while (i4 < this.f63286a.o()) {
            int i5 = i4 + 1;
            for (int i6 = i5; i6 < this.f63286a.k(); i6++) {
                if (this.f63286a.f(i4, i6) != this.f63286a.f(i6, i4)) {
                    this.f63286a.e(i6, i4);
                    this.f63286a.e(i4, i6);
                }
            }
            i4 = i5;
        }
    }

    byte[] c() throws FormatException {
        g d5 = d();
        j e4 = e();
        c cVar = c.values()[d5.c()];
        int k4 = this.f63286a.k();
        cVar.unmaskBitMatrix(this.f63286a, k4);
        com.google.zxing.common.b a5 = e4.a();
        byte[] bArr = new byte[e4.h()];
        int i4 = k4 - 1;
        boolean z4 = true;
        int i5 = i4;
        int i6 = 0;
        int i7 = 0;
        int i10 = 0;
        while (i5 > 0) {
            if (i5 == 6) {
                i5--;
            }
            for (int i11 = 0; i11 < k4; i11++) {
                int i12 = z4 ? i4 - i11 : i11;
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = i5 - i13;
                    if (!a5.f(i14, i12)) {
                        i7++;
                        i10 <<= 1;
                        if (this.f63286a.f(i14, i12)) {
                            i10 |= 1;
                        }
                        if (i7 == 8) {
                            bArr[i6] = (byte) i10;
                            i6++;
                            i7 = 0;
                            i10 = 0;
                        }
                    }
                }
            }
            z4 = !z4;
            i5 -= 2;
        }
        if (i6 == e4.h()) {
            return bArr;
        }
        throw FormatException.a();
    }

    g d() throws FormatException {
        g gVar = this.f63288c;
        if (gVar != null) {
            return gVar;
        }
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 6; i6++) {
            i5 = a(i6, 8, i5);
        }
        int a5 = a(8, 7, a(8, 8, a(7, 8, i5)));
        for (int i7 = 5; i7 >= 0; i7--) {
            a5 = a(8, i7, a5);
        }
        int k4 = this.f63286a.k();
        int i10 = k4 - 7;
        for (int i11 = k4 - 1; i11 >= i10; i11--) {
            i4 = a(8, i11, i4);
        }
        for (int i12 = k4 - 8; i12 < k4; i12++) {
            i4 = a(i12, 8, i4);
        }
        g a6 = g.a(a5, i4);
        this.f63288c = a6;
        if (a6 != null) {
            return a6;
        }
        throw FormatException.a();
    }

    j e() throws FormatException {
        j jVar = this.f63287b;
        if (jVar != null) {
            return jVar;
        }
        int k4 = this.f63286a.k();
        int i4 = (k4 - 17) / 4;
        if (i4 <= 6) {
            return j.i(i4);
        }
        int i5 = k4 - 11;
        int i6 = 0;
        int i7 = 0;
        for (int i10 = 5; i10 >= 0; i10--) {
            for (int i11 = k4 - 9; i11 >= i5; i11--) {
                i7 = a(i11, i10, i7);
            }
        }
        j c5 = j.c(i7);
        if (c5 != null && c5.e() == k4) {
            this.f63287b = c5;
            return c5;
        }
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = k4 - 9; i13 >= i5; i13--) {
                i6 = a(i12, i13, i6);
            }
        }
        j c6 = j.c(i6);
        if (c6 == null || c6.e() != k4) {
            throw FormatException.a();
        }
        this.f63287b = c6;
        return c6;
    }

    void f() {
        if (this.f63288c == null) {
            return;
        }
        c.values()[this.f63288c.c()].unmaskBitMatrix(this.f63286a, this.f63286a.k());
    }

    void g(boolean z4) {
        this.f63287b = null;
        this.f63288c = null;
        this.f63289d = z4;
    }
}
