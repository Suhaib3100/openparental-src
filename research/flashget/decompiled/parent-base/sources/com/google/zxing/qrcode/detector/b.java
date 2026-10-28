package com.google.zxing.qrcode.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AlignmentPatternFinder.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f63312a;

    /* renamed from: c, reason: collision with root package name */
    private final int f63314c;

    /* renamed from: d, reason: collision with root package name */
    private final int f63315d;

    /* renamed from: e, reason: collision with root package name */
    private final int f63316e;

    /* renamed from: f, reason: collision with root package name */
    private final int f63317f;

    /* renamed from: g, reason: collision with root package name */
    private final float f63318g;

    /* renamed from: i, reason: collision with root package name */
    private final q f63320i;

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f63313b = new ArrayList(5);

    /* renamed from: h, reason: collision with root package name */
    private final int[] f63319h = new int[3];

    b(com.google.zxing.common.b bVar, int i4, int i5, int i6, int i7, float f4, q qVar) {
        this.f63312a = bVar;
        this.f63314c = i4;
        this.f63315d = i5;
        this.f63316e = i6;
        this.f63317f = i7;
        this.f63318g = f4;
        this.f63320i = qVar;
    }

    private static float a(int[] iArr, int i4) {
        return (i4 - iArr[2]) - (iArr[1] / 2.0f);
    }

    private float b(int i4, int i5, int i6, int i7) {
        com.google.zxing.common.b bVar = this.f63312a;
        int k4 = bVar.k();
        int[] iArr = this.f63319h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i10 = i4;
        while (i10 >= 0 && bVar.f(i5, i10)) {
            int i11 = iArr[1];
            if (i11 > i6) {
                break;
            }
            iArr[1] = i11 + 1;
            i10--;
        }
        if (i10 >= 0 && iArr[1] <= i6) {
            while (i10 >= 0 && !bVar.f(i5, i10)) {
                int i12 = iArr[0];
                if (i12 > i6) {
                    break;
                }
                iArr[0] = i12 + 1;
                i10--;
            }
            if (iArr[0] > i6) {
                return Float.NaN;
            }
            int i13 = i4 + 1;
            while (i13 < k4 && bVar.f(i5, i13)) {
                int i14 = iArr[1];
                if (i14 > i6) {
                    break;
                }
                iArr[1] = i14 + 1;
                i13++;
            }
            if (i13 != k4 && iArr[1] <= i6) {
                while (i13 < k4 && !bVar.f(i5, i13)) {
                    int i15 = iArr[2];
                    if (i15 > i6) {
                        break;
                    }
                    iArr[2] = i15 + 1;
                    i13++;
                }
                int i16 = iArr[2];
                if (i16 <= i6 && Math.abs(((iArr[0] + iArr[1]) + i16) - i7) * 5 < i7 * 2 && d(iArr)) {
                    return a(iArr, i13);
                }
            }
        }
        return Float.NaN;
    }

    private boolean d(int[] iArr) {
        float f4 = this.f63318g;
        float f5 = f4 / 2.0f;
        for (int i4 = 0; i4 < 3; i4++) {
            if (Math.abs(f4 - iArr[i4]) >= f5) {
                return false;
            }
        }
        return true;
    }

    private a e(int[] iArr, int i4, int i5) {
        int i6 = iArr[0] + iArr[1] + iArr[2];
        float a5 = a(iArr, i5);
        float b5 = b(i4, (int) a5, iArr[1] * 2, i6);
        if (Float.isNaN(b5)) {
            return null;
        }
        float f4 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (a aVar : this.f63313b) {
            if (aVar.f(f4, b5, a5)) {
                return aVar.g(b5, a5, f4);
            }
        }
        a aVar2 = new a(a5, b5, f4);
        this.f63313b.add(aVar2);
        q qVar = this.f63320i;
        if (qVar == null) {
            return null;
        }
        qVar.a(aVar2);
        return null;
    }

    a c() throws NotFoundException {
        a e4;
        a e5;
        int i4 = this.f63314c;
        int i5 = this.f63317f;
        int i6 = this.f63316e + i4;
        int i7 = (i5 / 2) + this.f63315d;
        int[] iArr = new int[3];
        for (int i10 = 0; i10 < i5; i10++) {
            int i11 = ((i10 & 1) == 0 ? (i10 + 1) / 2 : -((i10 + 1) / 2)) + i7;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i12 = i4;
            while (i12 < i6 && !this.f63312a.f(i12, i11)) {
                i12++;
            }
            int i13 = 0;
            while (i12 < i6) {
                if (!this.f63312a.f(i12, i11)) {
                    if (i13 == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i13 != 2) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else {
                    if (d(iArr) && (e5 = e(iArr, i11, i12)) != null) {
                        return e5;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i13 = 1;
                }
                i12++;
            }
            if (d(iArr) && (e4 = e(iArr, i11, i6)) != null) {
                return e4;
            }
        }
        if (this.f63313b.isEmpty()) {
            throw NotFoundException.a();
        }
        return this.f63313b.get(0);
    }
}
