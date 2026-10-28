package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* compiled from: DefaultPlacement.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f62855a;

    /* renamed from: b, reason: collision with root package name */
    private final int f62856b;

    /* renamed from: c, reason: collision with root package name */
    private final int f62857c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f62858d;

    public e(CharSequence charSequence, int i4, int i5) {
        this.f62855a = charSequence;
        this.f62857c = i4;
        this.f62856b = i5;
        byte[] bArr = new byte[i4 * i5];
        this.f62858d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void a(int i4) {
        i(this.f62856b - 1, 0, i4, 1);
        i(this.f62856b - 1, 1, i4, 2);
        i(this.f62856b - 1, 2, i4, 3);
        i(0, this.f62857c - 2, i4, 4);
        i(0, this.f62857c - 1, i4, 5);
        i(1, this.f62857c - 1, i4, 6);
        i(2, this.f62857c - 1, i4, 7);
        i(3, this.f62857c - 1, i4, 8);
    }

    private void b(int i4) {
        i(this.f62856b - 3, 0, i4, 1);
        i(this.f62856b - 2, 0, i4, 2);
        i(this.f62856b - 1, 0, i4, 3);
        i(0, this.f62857c - 4, i4, 4);
        i(0, this.f62857c - 3, i4, 5);
        i(0, this.f62857c - 2, i4, 6);
        i(0, this.f62857c - 1, i4, 7);
        i(1, this.f62857c - 1, i4, 8);
    }

    private void c(int i4) {
        i(this.f62856b - 3, 0, i4, 1);
        i(this.f62856b - 2, 0, i4, 2);
        i(this.f62856b - 1, 0, i4, 3);
        i(0, this.f62857c - 2, i4, 4);
        i(0, this.f62857c - 1, i4, 5);
        i(1, this.f62857c - 1, i4, 6);
        i(2, this.f62857c - 1, i4, 7);
        i(3, this.f62857c - 1, i4, 8);
    }

    private void d(int i4) {
        i(this.f62856b - 1, 0, i4, 1);
        i(this.f62856b - 1, this.f62857c - 1, i4, 2);
        i(0, this.f62857c - 3, i4, 3);
        i(0, this.f62857c - 2, i4, 4);
        i(0, this.f62857c - 1, i4, 5);
        i(1, this.f62857c - 3, i4, 6);
        i(1, this.f62857c - 2, i4, 7);
        i(1, this.f62857c - 1, i4, 8);
    }

    private void i(int i4, int i5, int i6, int i7) {
        if (i4 < 0) {
            int i10 = this.f62856b;
            i4 += i10;
            i5 += 4 - ((i10 + 4) % 8);
        }
        if (i5 < 0) {
            int i11 = this.f62857c;
            i5 += i11;
            i4 += 4 - ((i11 + 4) % 8);
        }
        l(i5, i4, (this.f62855a.charAt(i6) & (1 << (8 - i7))) != 0);
    }

    private boolean j(int i4, int i5) {
        return this.f62858d[(i5 * this.f62857c) + i4] < 0;
    }

    private void l(int i4, int i5, boolean z4) {
        this.f62858d[(i5 * this.f62857c) + i4] = z4 ? (byte) 1 : (byte) 0;
    }

    private void m(int i4, int i5, int i6) {
        int i7 = i4 - 2;
        int i10 = i5 - 2;
        i(i7, i10, i6, 1);
        int i11 = i5 - 1;
        i(i7, i11, i6, 2);
        int i12 = i4 - 1;
        i(i12, i10, i6, 3);
        i(i12, i11, i6, 4);
        i(i12, i5, i6, 5);
        i(i4, i10, i6, 6);
        i(i4, i11, i6, 7);
        i(i4, i5, i6, 8);
    }

    public final boolean e(int i4, int i5) {
        return this.f62858d[(i5 * this.f62857c) + i4] == 1;
    }

    final byte[] f() {
        return this.f62858d;
    }

    final int g() {
        return this.f62857c;
    }

    final int h() {
        return this.f62856b;
    }

    public final void k() {
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        int i10 = 4;
        while (true) {
            if (i10 == this.f62856b && i6 == 0) {
                a(i7);
                i7++;
            }
            if (i10 == this.f62856b - 2 && i6 == 0 && this.f62857c % 4 != 0) {
                b(i7);
                i7++;
            }
            if (i10 == this.f62856b - 2 && i6 == 0 && this.f62857c % 8 == 4) {
                c(i7);
                i7++;
            }
            if (i10 == this.f62856b + 4 && i6 == 2 && this.f62857c % 8 == 0) {
                d(i7);
                i7++;
            }
            while (true) {
                if (i10 < this.f62856b && i6 >= 0 && j(i6, i10)) {
                    m(i10, i6, i7);
                    i7++;
                }
                int i11 = i10 - 2;
                int i12 = i6 + 2;
                if (i11 < 0 || i12 >= this.f62857c) {
                    break;
                }
                i10 = i11;
                i6 = i12;
            }
            int i13 = i10 - 1;
            int i14 = i6 + 5;
            while (true) {
                if (i13 >= 0 && i14 < this.f62857c && j(i14, i13)) {
                    m(i13, i14, i7);
                    i7++;
                }
                int i15 = i13 + 2;
                int i16 = i14 - 2;
                i4 = this.f62856b;
                if (i15 >= i4 || i16 < 0) {
                    break;
                }
                i13 = i15;
                i14 = i16;
            }
            i10 = i13 + 5;
            i6 = i14 - 1;
            if (i10 >= i4 && i6 >= (i5 = this.f62857c)) {
                break;
            }
        }
        if (j(i5 - 1, i4 - 1)) {
            l(this.f62857c - 1, this.f62856b - 1, true);
            l(this.f62857c - 2, this.f62856b - 2, true);
        }
    }
}
