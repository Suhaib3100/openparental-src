package com.google.zxing.qrcode.detector;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.g;
import com.google.zxing.common.i;
import com.google.zxing.common.k;
import com.google.zxing.p;
import com.google.zxing.q;
import com.google.zxing.qrcode.decoder.j;
import java.util.Map;

/* compiled from: Detector.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f63321a;

    /* renamed from: b, reason: collision with root package name */
    private q f63322b;

    public c(com.google.zxing.common.b bVar) {
        this.f63321a = bVar;
    }

    private float b(p pVar, p pVar2) {
        float m4 = m((int) pVar.c(), (int) pVar.d(), (int) pVar2.c(), (int) pVar2.d());
        float m5 = m((int) pVar2.c(), (int) pVar2.d(), (int) pVar.c(), (int) pVar.d());
        return Float.isNaN(m4) ? m5 / 7.0f : Float.isNaN(m5) ? m4 / 7.0f : (m4 + m5) / 14.0f;
    }

    private static int c(p pVar, p pVar2, p pVar3, float f4) throws NotFoundException {
        int c5 = (pa.a.c(p.b(pVar, pVar3) / f4) + pa.a.c(p.b(pVar, pVar2) / f4)) / 2;
        int i4 = c5 + 7;
        int i5 = i4 & 3;
        if (i5 == 0) {
            return c5 + 8;
        }
        if (i5 == 2) {
            return c5 + 6;
        }
        if (i5 != 3) {
            return i4;
        }
        throw NotFoundException.a();
    }

    private static k d(p pVar, p pVar2, p pVar3, p pVar4, int i4) {
        float c5;
        float d5;
        float f4;
        float f5 = i4 - 3.5f;
        if (pVar4 != null) {
            c5 = pVar4.c();
            d5 = pVar4.d();
            f4 = f5 - 3.0f;
        } else {
            c5 = pVar3.c() + (pVar2.c() - pVar.c());
            d5 = pVar3.d() + (pVar2.d() - pVar.d());
            f4 = f5;
        }
        return k.b(3.5f, 3.5f, f5, 3.5f, f4, f4, 3.5f, f5, pVar.c(), pVar.d(), pVar2.c(), pVar2.d(), c5, d5, pVar3.c(), pVar3.d());
    }

    private static com.google.zxing.common.b k(com.google.zxing.common.b bVar, k kVar, int i4) throws NotFoundException {
        return i.b().d(bVar, i4, i4, kVar);
    }

    private float l(int i4, int i5, int i6, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        c cVar;
        boolean z4;
        int i16;
        int i17 = 1;
        boolean z5 = Math.abs(i7 - i5) > Math.abs(i6 - i4);
        if (z5) {
            i11 = i4;
            i10 = i5;
            i13 = i6;
            i12 = i7;
        } else {
            i10 = i4;
            i11 = i5;
            i12 = i6;
            i13 = i7;
        }
        int abs = Math.abs(i12 - i10);
        int abs2 = Math.abs(i13 - i11);
        int i18 = 2;
        int i19 = (-abs) / 2;
        int i20 = i10 < i12 ? 1 : -1;
        int i21 = i11 < i13 ? 1 : -1;
        int i22 = i12 + i20;
        int i23 = i10;
        int i24 = i11;
        int i25 = 0;
        while (true) {
            if (i23 == i22) {
                i14 = i22;
                i15 = i18;
                break;
            }
            int i26 = z5 ? i24 : i23;
            int i27 = z5 ? i23 : i24;
            if (i25 == i17) {
                z4 = z5;
                i16 = i17;
                i14 = i22;
                cVar = this;
            } else {
                cVar = this;
                z4 = z5;
                i14 = i22;
                i16 = 0;
            }
            if (i16 == cVar.f63321a.f(i26, i27)) {
                if (i25 == 2) {
                    return pa.a.b(i23, i24, i10, i11);
                }
                i25++;
            }
            i19 += abs2;
            if (i19 > 0) {
                if (i24 == i13) {
                    i15 = 2;
                    break;
                }
                i24 += i21;
                i19 -= abs;
            }
            i23 += i20;
            i22 = i14;
            z5 = z4;
            i17 = 1;
            i18 = 2;
        }
        if (i25 == i15) {
            return pa.a.b(i14, i13, i10, i11);
        }
        return Float.NaN;
    }

    private float m(int i4, int i5, int i6, int i7) {
        float f4;
        float f5;
        float l4 = l(i4, i5, i6, i7);
        int i10 = i4 - (i6 - i4);
        int i11 = 0;
        if (i10 < 0) {
            f4 = i4 / (i4 - i10);
            i10 = 0;
        } else if (i10 >= this.f63321a.o()) {
            f4 = ((this.f63321a.o() - 1) - i4) / (i10 - i4);
            i10 = this.f63321a.o() - 1;
        } else {
            f4 = 1.0f;
        }
        float f6 = i5;
        int i12 = (int) (f6 - ((i7 - i5) * f4));
        if (i12 < 0) {
            f5 = f6 / (i5 - i12);
        } else if (i12 >= this.f63321a.k()) {
            f5 = ((this.f63321a.k() - 1) - i5) / (i12 - i5);
            i11 = this.f63321a.k() - 1;
        } else {
            i11 = i12;
            f5 = 1.0f;
        }
        return (l4 + l(i4, i5, (int) (((i10 - i4) * f5) + i4), i11)) - 1.0f;
    }

    protected final float a(p pVar, p pVar2, p pVar3) {
        return (b(pVar, pVar2) + b(pVar, pVar3)) / 2.0f;
    }

    public g e() throws NotFoundException, FormatException {
        return f(null);
    }

    public final g f(Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException {
        this.f63322b = map == null ? null : (q) map.get(com.google.zxing.d.NEED_RESULT_POINT_CALLBACK);
        return j(new e(this.f63321a, this.f63322b).h(map));
    }

    protected final a g(float f4, int i4, int i5, float f5) throws NotFoundException {
        int i6 = (int) (f5 * f4);
        int max = Math.max(0, i4 - i6);
        int min = Math.min(this.f63321a.o() - 1, i4 + i6) - max;
        float f6 = 3.0f * f4;
        if (min < f6) {
            throw NotFoundException.a();
        }
        int max2 = Math.max(0, i5 - i6);
        int min2 = Math.min(this.f63321a.k() - 1, i5 + i6) - max2;
        if (min2 >= f6) {
            return new b(this.f63321a, max, max2, min, min2, f4, this.f63322b).c();
        }
        throw NotFoundException.a();
    }

    protected final com.google.zxing.common.b h() {
        return this.f63321a;
    }

    protected final q i() {
        return this.f63322b;
    }

    protected final g j(f fVar) throws NotFoundException, FormatException {
        a aVar;
        d b5 = fVar.b();
        d c5 = fVar.c();
        d a5 = fVar.a();
        float a6 = a(b5, c5, a5);
        if (a6 < 1.0f) {
            throw NotFoundException.a();
        }
        int c6 = c(b5, c5, a5, a6);
        j g4 = j.g(c6);
        int e4 = g4.e() - 7;
        if (g4.d().length > 0) {
            float c7 = a5.c() + (c5.c() - b5.c());
            float d5 = a5.d() + (c5.d() - b5.d());
            float f4 = 1.0f - (3.0f / e4);
            int c10 = (int) (((c7 - b5.c()) * f4) + b5.c());
            int d6 = (int) (((d5 - b5.d()) * f4) + b5.d());
            for (int i4 = 4; i4 <= 16; i4 <<= 1) {
                try {
                    aVar = g(a6, c10, d6, i4);
                    break;
                } catch (NotFoundException unused) {
                }
            }
        }
        aVar = null;
        return new g(k(this.f63321a, d(b5, c5, a5, aVar, c6), c6), aVar == null ? new p[]{a5, b5, c5} : new p[]{a5, b5, c5, aVar});
    }
}
