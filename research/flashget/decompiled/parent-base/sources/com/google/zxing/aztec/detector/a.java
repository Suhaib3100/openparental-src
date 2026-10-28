package com.google.zxing.aztec.detector;

import androidx.view.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.b;
import com.google.zxing.common.i;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.c;
import com.google.zxing.p;
import com.tencent.rtmp.TXLiveConstants;
import kotlin.text.m0;

/* compiled from: Detector.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f62604g = {3808, 476, TXLiveConstants.PLAY_WARNING_VIDEO_DISCONTINUITY, 1799};

    /* renamed from: a, reason: collision with root package name */
    private final b f62605a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f62606b;

    /* renamed from: c, reason: collision with root package name */
    private int f62607c;

    /* renamed from: d, reason: collision with root package name */
    private int f62608d;

    /* renamed from: e, reason: collision with root package name */
    private int f62609e;

    /* renamed from: f, reason: collision with root package name */
    private int f62610f;

    /* compiled from: Detector.java */
    /* renamed from: com.google.zxing.aztec.detector.a$a, reason: collision with other inner class name */
    static final class C0956a {

        /* renamed from: a, reason: collision with root package name */
        private final int f62611a;

        /* renamed from: b, reason: collision with root package name */
        private final int f62612b;

        C0956a(int i4, int i5) {
            this.f62611a = i4;
            this.f62612b = i5;
        }

        int a() {
            return this.f62611a;
        }

        int b() {
            return this.f62612b;
        }

        p c() {
            return new p(this.f62611a, this.f62612b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ऴ\u0001"));
            sb.append(this.f62611a);
            sb.append(' ');
            return e.a(sb, this.f62612b, m0.greater);
        }
    }

    public a(b bVar) {
        this.f62605a = bVar;
    }

    private static float c(p pVar, p pVar2) {
        return pa.a.a(pVar.c(), pVar.d(), pVar2.c(), pVar2.d());
    }

    private static float d(C0956a c0956a, C0956a c0956a2) {
        return pa.a.b(c0956a.a(), c0956a.b(), c0956a2.a(), c0956a2.b());
    }

    private static p[] e(p[] pVarArr, int i4, int i5) {
        float f4 = i5 / (i4 * 2.0f);
        float c5 = pVarArr[0].c() - pVarArr[2].c();
        float d5 = pVarArr[0].d() - pVarArr[2].d();
        float c6 = (pVarArr[2].c() + pVarArr[0].c()) / 2.0f;
        float d6 = (pVarArr[2].d() + pVarArr[0].d()) / 2.0f;
        float f5 = c5 * f4;
        float f6 = d5 * f4;
        p pVar = new p(c6 + f5, d6 + f6);
        p pVar2 = new p(c6 - f5, d6 - f6);
        float c7 = pVarArr[1].c() - pVarArr[3].c();
        float d7 = pVarArr[1].d() - pVarArr[3].d();
        float c10 = (pVarArr[3].c() + pVarArr[1].c()) / 2.0f;
        float d10 = (pVarArr[3].d() + pVarArr[1].d()) / 2.0f;
        float f7 = c7 * f4;
        float f10 = f4 * d7;
        return new p[]{pVar, new p(c10 + f7, d10 + f10), pVar2, new p(c10 - f7, d10 - f10)};
    }

    private void f(p[] pVarArr) throws NotFoundException {
        long j4;
        long j5;
        if (!p(pVarArr[0]) || !p(pVarArr[1]) || !p(pVarArr[2]) || !p(pVarArr[3])) {
            throw NotFoundException.a();
        }
        int i4 = this.f62609e * 2;
        int[] iArr = {s(pVarArr[0], pVarArr[1], i4), s(pVarArr[1], pVarArr[2], i4), s(pVarArr[2], pVarArr[3], i4), s(pVarArr[3], pVarArr[0], i4)};
        this.f62610f = n(iArr, i4);
        long j6 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = iArr[(this.f62610f + i5) % 4];
            if (this.f62606b) {
                j4 = j6 << 7;
                j5 = (i6 >> 1) & 127;
            } else {
                j4 = j6 << 10;
                j5 = ((i6 >> 2) & 992) + ((i6 >> 1) & 31);
            }
            j6 = j4 + j5;
        }
        int i7 = i(j6, this.f62606b);
        if (this.f62606b) {
            this.f62607c = (i7 >> 6) + 1;
            this.f62608d = (i7 & 63) + 1;
        } else {
            this.f62607c = (i7 >> 11) + 1;
            this.f62608d = (i7 & 2047) + 1;
        }
    }

    private p[] g(C0956a c0956a) throws NotFoundException {
        this.f62609e = 1;
        C0956a c0956a2 = c0956a;
        C0956a c0956a3 = c0956a2;
        C0956a c0956a4 = c0956a3;
        boolean z4 = true;
        while (this.f62609e < 9) {
            C0956a k4 = k(c0956a, z4, 1, -1);
            C0956a k5 = k(c0956a2, z4, 1, 1);
            C0956a k6 = k(c0956a3, z4, -1, 1);
            C0956a k7 = k(c0956a4, z4, -1, -1);
            if (this.f62609e > 2) {
                double d5 = (d(k7, k4) * this.f62609e) / (d(c0956a4, c0956a) * (this.f62609e + 2));
                if (d5 < 0.75d || d5 > 1.25d || !q(k4, k5, k6, k7)) {
                    break;
                }
            }
            z4 = !z4;
            this.f62609e++;
            c0956a4 = k7;
            c0956a = k4;
            c0956a2 = k5;
            c0956a3 = k6;
        }
        int i4 = this.f62609e;
        if (i4 != 5 && i4 != 7) {
            throw NotFoundException.a();
        }
        this.f62606b = i4 == 5;
        return e(new p[]{new p(c0956a.a() + 0.5f, c0956a.b() - 0.5f), new p(c0956a2.a() + 0.5f, c0956a2.b() + 0.5f), new p(c0956a3.a() - 0.5f, c0956a3.b() + 0.5f), new p(c0956a4.a() - 0.5f, c0956a4.b() - 0.5f)}, (r0 * 2) - 3, this.f62609e * 2);
    }

    private int h(C0956a c0956a, C0956a c0956a2) {
        float d5 = d(c0956a, c0956a2);
        float a5 = (c0956a2.a() - c0956a.a()) / d5;
        float b5 = (c0956a2.b() - c0956a.b()) / d5;
        float a6 = c0956a.a();
        float b6 = c0956a.b();
        boolean f4 = this.f62605a.f(c0956a.a(), c0956a.b());
        int ceil = (int) Math.ceil(d5);
        int i4 = 0;
        for (int i5 = 0; i5 < ceil; i5++) {
            a6 += a5;
            b6 += b5;
            if (this.f62605a.f(pa.a.c(a6), pa.a.c(b6)) != f4) {
                i4++;
            }
        }
        float f5 = i4 / d5;
        if (f5 <= 0.1f || f5 >= 0.9f) {
            return (f5 <= 0.1f) == f4 ? 1 : -1;
        }
        return 0;
    }

    private static int i(long j4, boolean z4) throws NotFoundException {
        int i4;
        int i5;
        if (z4) {
            i4 = 7;
            i5 = 2;
        } else {
            i4 = 10;
            i5 = 4;
        }
        int i6 = i4 - i5;
        int[] iArr = new int[i4];
        for (int i7 = i4 - 1; i7 >= 0; i7--) {
            iArr[i7] = ((int) j4) & 15;
            j4 >>= 4;
        }
        try {
            new c(com.google.zxing.common.reedsolomon.a.f62814k).a(iArr, i6);
            int i10 = 0;
            for (int i11 = 0; i11 < i5; i11++) {
                i10 = (i10 << 4) + iArr[i11];
            }
            return i10;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.a();
        }
    }

    private int j() {
        if (this.f62606b) {
            return (this.f62607c * 4) + 11;
        }
        int i4 = this.f62607c;
        if (i4 <= 4) {
            return (i4 * 4) + 15;
        }
        return ((((i4 - 4) / 8) + 1) * 2) + (i4 * 4) + 15;
    }

    private C0956a k(C0956a c0956a, boolean z4, int i4, int i5) {
        int a5 = c0956a.a() + i4;
        int b5 = c0956a.b();
        while (true) {
            b5 += i5;
            if (!o(a5, b5) || this.f62605a.f(a5, b5) != z4) {
                break;
            }
            a5 += i4;
        }
        int i6 = a5 - i4;
        int i7 = b5 - i5;
        while (o(i6, i7) && this.f62605a.f(i6, i7) == z4) {
            i6 += i4;
        }
        int i10 = i6 - i4;
        while (o(i10, i7) && this.f62605a.f(i10, i7) == z4) {
            i7 += i5;
        }
        return new C0956a(i10, i7 - i5);
    }

    private C0956a l() {
        p c5;
        p pVar;
        p pVar2;
        p pVar3;
        p c6;
        p c7;
        p c10;
        p c11;
        try {
            p[] c12 = new pa.c(this.f62605a).c();
            pVar2 = c12[0];
            pVar3 = c12[1];
            pVar = c12[2];
            c5 = c12[3];
        } catch (NotFoundException unused) {
            int o4 = this.f62605a.o() / 2;
            int k4 = this.f62605a.k() / 2;
            int i4 = o4 + 7;
            int i5 = k4 - 7;
            p c13 = k(new C0956a(i4, i5), false, 1, -1).c();
            int i6 = k4 + 7;
            p c14 = k(new C0956a(i4, i6), false, 1, 1).c();
            int i7 = o4 - 7;
            p c15 = k(new C0956a(i7, i6), false, -1, 1).c();
            c5 = k(new C0956a(i7, i5), false, -1, -1).c();
            pVar = c15;
            pVar2 = c13;
            pVar3 = c14;
        }
        int c16 = pa.a.c((pVar.c() + (pVar3.c() + (c5.c() + pVar2.c()))) / 4.0f);
        int c17 = pa.a.c((pVar.d() + (pVar3.d() + (c5.d() + pVar2.d()))) / 4.0f);
        try {
            p[] c18 = new pa.c(this.f62605a, 15, c16, c17).c();
            c6 = c18[0];
            c7 = c18[1];
            c10 = c18[2];
            c11 = c18[3];
        } catch (NotFoundException unused2) {
            int i10 = c16 + 7;
            int i11 = c17 - 7;
            c6 = k(new C0956a(i10, i11), false, 1, -1).c();
            int i12 = c17 + 7;
            c7 = k(new C0956a(i10, i12), false, 1, 1).c();
            int i13 = c16 - 7;
            c10 = k(new C0956a(i13, i12), false, -1, 1).c();
            c11 = k(new C0956a(i13, i11), false, -1, -1).c();
        }
        return new C0956a(pa.a.c((c10.c() + (c7.c() + (c11.c() + c6.c()))) / 4.0f), pa.a.c((c10.d() + (c7.d() + (c11.d() + c6.d()))) / 4.0f));
    }

    private p[] m(p[] pVarArr) {
        return e(pVarArr, this.f62609e * 2, j());
    }

    private static int n(int[] iArr, int i4) throws NotFoundException {
        int i5 = 0;
        for (int i6 : iArr) {
            i5 = (i5 << 3) + ((i6 >> (i4 - 2)) << 1) + (i6 & 1);
        }
        int i7 = ((i5 & 1) << 11) + (i5 >> 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (Integer.bitCount(f62604g[i10] ^ i7) <= 2) {
                return i10;
            }
        }
        throw NotFoundException.a();
    }

    private boolean o(int i4, int i5) {
        return i4 >= 0 && i4 < this.f62605a.o() && i5 > 0 && i5 < this.f62605a.k();
    }

    private boolean p(p pVar) {
        return o(pa.a.c(pVar.c()), pa.a.c(pVar.d()));
    }

    private boolean q(C0956a c0956a, C0956a c0956a2, C0956a c0956a3, C0956a c0956a4) {
        C0956a c0956a5 = new C0956a(c0956a.a() - 3, c0956a.b() + 3);
        C0956a c0956a6 = new C0956a(c0956a2.a() - 3, c0956a2.b() - 3);
        C0956a c0956a7 = new C0956a(c0956a3.a() + 3, c0956a3.b() - 3);
        C0956a c0956a8 = new C0956a(c0956a4.a() + 3, c0956a4.b() + 3);
        int h4 = h(c0956a8, c0956a5);
        return h4 != 0 && h(c0956a5, c0956a6) == h4 && h(c0956a6, c0956a7) == h4 && h(c0956a7, c0956a8) == h4;
    }

    private b r(b bVar, p pVar, p pVar2, p pVar3, p pVar4) throws NotFoundException {
        i b5 = i.b();
        int j4 = j();
        float f4 = j4 / 2.0f;
        int i4 = this.f62609e;
        float f5 = f4 - i4;
        float f6 = f4 + i4;
        return b5.c(bVar, j4, j4, f5, f5, f6, f5, f6, f6, f5, f6, pVar.c(), pVar.d(), pVar2.c(), pVar2.d(), pVar3.c(), pVar3.d(), pVar4.c(), pVar4.d());
    }

    private int s(p pVar, p pVar2, int i4) {
        float c5 = c(pVar, pVar2);
        float f4 = c5 / i4;
        float c6 = pVar.c();
        float d5 = pVar.d();
        float c7 = ((pVar2.c() - pVar.c()) * f4) / c5;
        float d6 = ((pVar2.d() - pVar.d()) * f4) / c5;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            float f5 = i6;
            if (this.f62605a.f(pa.a.c((f5 * c7) + c6), pa.a.c((f5 * d6) + d5))) {
                i5 |= 1 << ((i4 - i6) - 1);
            }
        }
        return i5;
    }

    public oa.a a() throws NotFoundException {
        return b(false);
    }

    public oa.a b(boolean z4) throws NotFoundException {
        p[] g4 = g(l());
        if (z4) {
            p pVar = g4[0];
            g4[0] = g4[2];
            g4[2] = pVar;
        }
        f(g4);
        b bVar = this.f62605a;
        int i4 = this.f62610f;
        return new oa.a(r(bVar, g4[i4 % 4], g4[(i4 + 1) % 4], g4[(i4 + 2) % 4], g4[(i4 + 3) % 4]), m(g4), this.f62606b, this.f62608d, this.f62607c);
    }
}
