package com.tencent.beacon.base.net.b.a.b;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: Encoder.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    static byte[] f71232a;
    boolean A;
    int E;
    long N;
    boolean O;
    InputStream P;
    int V;

    /* renamed from: ba, reason: collision with root package name */
    int f71235ba;

    /* renamed from: c, reason: collision with root package name */
    byte f71236c;

    /* renamed from: v, reason: collision with root package name */
    int f71255v;

    /* renamed from: w, reason: collision with root package name */
    int f71256w;

    /* renamed from: x, reason: collision with root package name */
    int f71257x;

    /* renamed from: y, reason: collision with root package name */
    int f71258y;

    /* renamed from: z, reason: collision with root package name */
    int f71259z;

    /* renamed from: b, reason: collision with root package name */
    int f71234b = com.tencent.beacon.base.net.b.a.b.a.a();

    /* renamed from: d, reason: collision with root package name */
    int[] f71237d = new int[4];

    /* renamed from: e, reason: collision with root package name */
    d[] f71238e = new d[4096];

    /* renamed from: f, reason: collision with root package name */
    com.tencent.beacon.base.net.b.a.a.a f71239f = null;

    /* renamed from: g, reason: collision with root package name */
    com.tencent.beacon.base.net.b.a.c.d f71240g = new com.tencent.beacon.base.net.b.a.c.d();

    /* renamed from: h, reason: collision with root package name */
    short[] f71241h = new short[192];

    /* renamed from: i, reason: collision with root package name */
    short[] f71242i = new short[12];

    /* renamed from: j, reason: collision with root package name */
    short[] f71243j = new short[12];

    /* renamed from: k, reason: collision with root package name */
    short[] f71244k = new short[12];

    /* renamed from: l, reason: collision with root package name */
    short[] f71245l = new short[12];

    /* renamed from: m, reason: collision with root package name */
    short[] f71246m = new short[192];

    /* renamed from: n, reason: collision with root package name */
    com.tencent.beacon.base.net.b.a.c.b[] f71247n = new com.tencent.beacon.base.net.b.a.c.b[4];

    /* renamed from: o, reason: collision with root package name */
    short[] f71248o = new short[114];

    /* renamed from: p, reason: collision with root package name */
    com.tencent.beacon.base.net.b.a.c.b f71249p = new com.tencent.beacon.base.net.b.a.c.b(4);

    /* renamed from: q, reason: collision with root package name */
    b f71250q = new b();

    /* renamed from: r, reason: collision with root package name */
    b f71251r = new b();

    /* renamed from: s, reason: collision with root package name */
    C0999c f71252s = new C0999c();

    /* renamed from: t, reason: collision with root package name */
    int[] f71253t = new int[548];

    /* renamed from: u, reason: collision with root package name */
    int f71254u = 32;
    int[] B = new int[256];
    int[] C = new int[512];
    int[] D = new int[16];
    int F = 44;
    int G = 2;
    int H = 3;
    int I = 0;
    int J = 3;
    int K = 4194304;
    int L = -1;
    int M = -1;
    int Q = 1;
    boolean R = false;
    boolean S = false;
    int[] T = new int[4];
    int[] U = new int[4];
    long[] W = new long[1];
    long[] X = new long[1];
    boolean[] Y = new boolean[1];
    byte[] Z = new byte[5];

    /* renamed from: aa, reason: collision with root package name */
    int[] f71233aa = new int[128];

    /* compiled from: Encoder.java */
    class b extends a {

        /* renamed from: f, reason: collision with root package name */
        int[] f71265f;

        /* renamed from: g, reason: collision with root package name */
        int f71266g;

        /* renamed from: h, reason: collision with root package name */
        int[] f71267h;

        b() {
            super();
            this.f71265f = new int[4352];
            this.f71267h = new int[16];
        }

        public int a(int i4, int i5) {
            return this.f71265f[(i5 * 272) + i4];
        }

        public void b(int i4) {
            this.f71266g = i4;
        }

        void c(int i4) {
            a(i4, this.f71266g, this.f71265f, i4 * 272);
            this.f71267h[i4] = this.f71266g;
        }

        public void d(int i4) {
            for (int i5 = 0; i5 < i4; i5++) {
                c(i5);
            }
        }

        @Override // com.tencent.beacon.base.net.b.a.b.c.a
        public void a(com.tencent.beacon.base.net.b.a.c.d dVar, int i4, int i5) throws IOException {
            super.a(dVar, i4, i5);
            int[] iArr = this.f71267h;
            int i6 = iArr[i5] - 1;
            iArr[i5] = i6;
            if (i6 == 0) {
                c(i5);
            }
        }
    }

    /* compiled from: Encoder.java */
    class d {

        /* renamed from: a, reason: collision with root package name */
        public int f71276a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f71277b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f71278c;

        /* renamed from: d, reason: collision with root package name */
        public int f71279d;

        /* renamed from: e, reason: collision with root package name */
        public int f71280e;

        /* renamed from: f, reason: collision with root package name */
        public int f71281f;

        /* renamed from: g, reason: collision with root package name */
        public int f71282g;

        /* renamed from: h, reason: collision with root package name */
        public int f71283h;

        /* renamed from: i, reason: collision with root package name */
        public int f71284i;

        /* renamed from: j, reason: collision with root package name */
        public int f71285j;

        /* renamed from: k, reason: collision with root package name */
        public int f71286k;

        /* renamed from: l, reason: collision with root package name */
        public int f71287l;

        d() {
        }

        public boolean a() {
            return this.f71283h == 0;
        }

        public void b() {
            this.f71283h = -1;
            this.f71277b = false;
        }

        public void c() {
            this.f71283h = 0;
            this.f71277b = false;
        }
    }

    static {
        byte[] bArr = new byte[2048];
        f71232a = bArr;
        bArr[0] = 0;
        bArr[1] = 1;
        int i4 = 2;
        for (int i5 = 2; i5 < 22; i5++) {
            int i6 = 1 << ((i5 >> 1) - 1);
            int i7 = 0;
            while (i7 < i6) {
                f71232a[i4] = (byte) i5;
                i7++;
                i4++;
            }
        }
    }

    public c() {
        for (int i4 = 0; i4 < 4096; i4++) {
            this.f71238e[i4] = new d();
        }
        for (int i5 = 0; i5 < 4; i5++) {
            this.f71247n[i5] = new com.tencent.beacon.base.net.b.a.c.b(6);
        }
    }

    static int d(int i4) {
        return i4 < 2048 ? f71232a[i4] : i4 < 2097152 ? f71232a[i4 >> 10] + com.google.common.base.c.f54878x : f71232a[i4 >> 20] + 40;
    }

    static int e(int i4) {
        return i4 < 131072 ? f71232a[i4 >> 6] + 12 : i4 < 134217728 ? f71232a[i4 >> 16] + 32 : f71232a[i4 >> 26] + 52;
    }

    void a() {
        this.f71234b = com.tencent.beacon.base.net.b.a.b.a.a();
        this.f71236c = (byte) 0;
        for (int i4 = 0; i4 < 4; i4++) {
            this.f71237d[i4] = 0;
        }
    }

    void b() {
        if (this.f71239f == null) {
            com.tencent.beacon.base.net.b.a.a.a aVar = new com.tencent.beacon.base.net.b.a.a.a();
            aVar.c(this.Q == 0 ? 2 : 4);
            this.f71239f = aVar;
        }
        this.f71252s.a(this.I, this.J);
        int i4 = this.K;
        if (i4 == this.L && this.M == this.f71254u) {
            return;
        }
        this.f71239f.a(i4, 4096, this.f71254u, 274);
        this.L = this.K;
        this.M = this.f71254u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0659 A[EDGE_INSN: B:215:0x0659->B:216:0x0659 BREAK  A[LOOP:14: B:195:0x0567->B:221:0x066d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x066d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x053e  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int c(int r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.base.net.b.a.b.c.c(int):int");
    }

    int f() throws IOException {
        int i4;
        int a5 = this.f71239f.a(this.f71253t);
        this.f71256w = a5;
        if (a5 > 0) {
            int[] iArr = this.f71253t;
            i4 = iArr[a5 - 2];
            if (i4 == this.f71254u) {
                i4 += this.f71239f.b(i4 - 1, iArr[a5 - 1], 273 - i4);
            }
        } else {
            i4 = 0;
        }
        this.f71257x++;
        return i4;
    }

    public boolean g(int i4) {
        return true;
    }

    void h() {
        this.f71240g.e();
    }

    void i() {
        g();
        h();
    }

    public boolean j(int i4) {
        if (i4 < 5 || i4 > 273) {
            return false;
        }
        this.f71254u = i4;
        return true;
    }

    void k(int i4) throws IOException {
        if (this.R) {
            this.f71240g.a(this.f71241h, (this.f71234b << 4) + i4, 1);
            this.f71240g.a(this.f71242i, this.f71234b, 0);
            this.f71234b = com.tencent.beacon.base.net.b.a.b.a.d(this.f71234b);
            this.f71250q.a(this.f71240g, 0, i4);
            this.f71247n[com.tencent.beacon.base.net.b.a.b.a.a(2)].a(this.f71240g, 63);
            this.f71240g.a(67108863, 26);
            this.f71249p.b(this.f71240g, 15);
        }
    }

    void g() {
        com.tencent.beacon.base.net.b.a.a.a aVar = this.f71239f;
        if (aVar == null || !this.S) {
            return;
        }
        aVar.g();
        this.S = false;
    }

    public boolean h(int i4) {
        int i5 = 0;
        if (i4 < 1 || i4 > 536870912) {
            return false;
        }
        this.K = i4;
        while (i4 > (1 << i5)) {
            i5++;
        }
        this.F = i5 * 2;
        return true;
    }

    public boolean i(int i4) {
        if (i4 < 0 || i4 > 2) {
            return false;
        }
        int i5 = this.Q;
        this.Q = i4;
        if (this.f71239f == null || i5 == i4) {
            return true;
        }
        this.L = -1;
        this.f71239f = null;
        return true;
    }

    /* compiled from: Encoder.java */
    class a {

        /* renamed from: a, reason: collision with root package name */
        short[] f71260a = new short[2];

        /* renamed from: b, reason: collision with root package name */
        com.tencent.beacon.base.net.b.a.c.b[] f71261b = new com.tencent.beacon.base.net.b.a.c.b[16];

        /* renamed from: c, reason: collision with root package name */
        com.tencent.beacon.base.net.b.a.c.b[] f71262c = new com.tencent.beacon.base.net.b.a.c.b[16];

        /* renamed from: d, reason: collision with root package name */
        com.tencent.beacon.base.net.b.a.c.b f71263d = new com.tencent.beacon.base.net.b.a.c.b(8);

        public a() {
            for (int i4 = 0; i4 < 16; i4++) {
                this.f71261b[i4] = new com.tencent.beacon.base.net.b.a.c.b(3);
                this.f71262c[i4] = new com.tencent.beacon.base.net.b.a.c.b(3);
            }
        }

        public void a(int i4) {
            com.tencent.beacon.base.net.b.a.c.d.a(this.f71260a);
            for (int i5 = 0; i5 < i4; i5++) {
                this.f71261b[i5].a();
                this.f71262c[i5].a();
            }
            this.f71263d.a();
        }

        public void a(com.tencent.beacon.base.net.b.a.c.d dVar, int i4, int i5) throws IOException {
            if (i4 < 8) {
                dVar.a(this.f71260a, 0, 0);
                this.f71261b[i5].a(dVar, i4);
                return;
            }
            int i6 = i4 - 8;
            dVar.a(this.f71260a, 0, 1);
            if (i6 < 8) {
                dVar.a(this.f71260a, 1, 0);
                this.f71262c[i5].a(dVar, i6);
            } else {
                dVar.a(this.f71260a, 1, 1);
                this.f71263d.a(dVar, i4 - 16);
            }
        }

        public void a(int i4, int i5, int[] iArr, int i6) {
            int i7 = 0;
            int a5 = com.tencent.beacon.base.net.b.a.c.d.a(this.f71260a[0]);
            int b5 = com.tencent.beacon.base.net.b.a.c.d.b(this.f71260a[0]);
            int a6 = com.tencent.beacon.base.net.b.a.c.d.a(this.f71260a[1]) + b5;
            int b6 = com.tencent.beacon.base.net.b.a.c.d.b(this.f71260a[1]) + b5;
            while (i7 < 8) {
                if (i7 >= i5) {
                    return;
                }
                iArr[i6 + i7] = this.f71261b[i4].a(i7) + a5;
                i7++;
            }
            while (i7 < 16) {
                if (i7 >= i5) {
                    return;
                }
                iArr[i6 + i7] = this.f71262c[i4].a(i7 - 8) + a6;
                i7++;
            }
            while (i7 < i5) {
                iArr[i6 + i7] = this.f71263d.a(i7 - 16) + b6;
                i7++;
            }
        }
    }

    int a(int i4, int i5) {
        return com.tencent.beacon.base.net.b.a.c.d.a(this.f71246m[(i4 << 4) + i5]) + com.tencent.beacon.base.net.b.a.c.d.a(this.f71243j[i4]);
    }

    void d() {
        for (int i4 = 4; i4 < 128; i4++) {
            int d5 = d(i4);
            int i5 = (d5 >> 1) - 1;
            this.f71233aa[i4] = com.tencent.beacon.base.net.b.a.c.b.a(this.f71248o, (r4 - d5) - 1, i5, i4 - (((d5 & 1) | 2) << i5));
        }
        for (int i6 = 0; i6 < 4; i6++) {
            com.tencent.beacon.base.net.b.a.c.b bVar = this.f71247n[i6];
            int i7 = i6 << 6;
            for (int i10 = 0; i10 < this.F; i10++) {
                this.B[i7 + i10] = bVar.a(i10);
            }
            for (int i11 = 14; i11 < this.F; i11++) {
                int[] iArr = this.B;
                int i12 = i7 + i11;
                iArr[i12] = iArr[i12] + (((i11 >> 1) - 5) << 6);
            }
            int i13 = i6 * 128;
            int i14 = 0;
            while (i14 < 4) {
                this.C[i13 + i14] = this.B[i7 + i14];
                i14++;
            }
            while (i14 < 128) {
                this.C[i13 + i14] = this.B[d(i14) + i7] + this.f71233aa[i14];
                i14++;
            }
        }
        this.f71235ba = 0;
    }

    void e() {
        a();
        this.f71240g.d();
        com.tencent.beacon.base.net.b.a.c.d.a(this.f71241h);
        com.tencent.beacon.base.net.b.a.c.d.a(this.f71246m);
        com.tencent.beacon.base.net.b.a.c.d.a(this.f71242i);
        com.tencent.beacon.base.net.b.a.c.d.a(this.f71243j);
        com.tencent.beacon.base.net.b.a.c.d.a(this.f71244k);
        com.tencent.beacon.base.net.b.a.c.d.a(this.f71245l);
        com.tencent.beacon.base.net.b.a.c.d.a(this.f71248o);
        this.f71252s.a();
        for (int i4 = 0; i4 < 4; i4++) {
            this.f71247n[i4].a();
        }
        this.f71250q.a(1 << this.G);
        this.f71251r.a(1 << this.G);
        this.f71249p.a();
        this.A = false;
        this.f71258y = 0;
        this.f71259z = 0;
        this.f71257x = 0;
    }

    /* compiled from: Encoder.java */
    /* renamed from: com.tencent.beacon.base.net.b.a.b.c$c, reason: collision with other inner class name */
    class C0999c {

        /* renamed from: a, reason: collision with root package name */
        a[] f71269a;

        /* renamed from: b, reason: collision with root package name */
        int f71270b;

        /* renamed from: c, reason: collision with root package name */
        int f71271c;

        /* renamed from: d, reason: collision with root package name */
        int f71272d;

        /* compiled from: Encoder.java */
        /* renamed from: com.tencent.beacon.base.net.b.a.b.c$c$a */
        class a {

            /* renamed from: a, reason: collision with root package name */
            short[] f71274a = new short[768];

            a() {
            }

            public void a() {
                com.tencent.beacon.base.net.b.a.c.d.a(this.f71274a);
            }

            public void a(com.tencent.beacon.base.net.b.a.c.d dVar, byte b5) throws IOException {
                int i4 = 1;
                for (int i5 = 7; i5 >= 0; i5--) {
                    int i6 = (b5 >> i5) & 1;
                    dVar.a(this.f71274a, i4, i6);
                    i4 = (i4 << 1) | i6;
                }
            }

            public void a(com.tencent.beacon.base.net.b.a.c.d dVar, byte b5, byte b6) throws IOException {
                int i4;
                boolean z4 = true;
                int i5 = 1;
                for (int i6 = 7; i6 >= 0; i6--) {
                    int i7 = (b6 >> i6) & 1;
                    if (z4) {
                        int i10 = (b5 >> i6) & 1;
                        i4 = ((i10 + 1) << 8) + i5;
                        z4 = i10 == i7;
                    } else {
                        i4 = i5;
                    }
                    dVar.a(this.f71274a, i4, i7);
                    i5 = (i5 << 1) | i7;
                }
            }

            public int a(boolean z4, byte b5, byte b6) {
                int i4;
                int i5 = 0;
                int i6 = 7;
                if (z4) {
                    i4 = 1;
                    while (i6 >= 0) {
                        int i7 = (b5 >> i6) & 1;
                        int i10 = (b6 >> i6) & 1;
                        i5 += com.tencent.beacon.base.net.b.a.c.d.b(this.f71274a[((i7 + 1) << 8) + i4], i10);
                        i4 = (i4 << 1) | i10;
                        i6--;
                        if (i7 != i10) {
                            break;
                        }
                    }
                } else {
                    i4 = 1;
                }
                while (i6 >= 0) {
                    int i11 = (b6 >> i6) & 1;
                    i5 += com.tencent.beacon.base.net.b.a.c.d.b(this.f71274a[i4], i11);
                    i4 = (i4 << 1) | i11;
                    i6--;
                }
                return i5;
            }
        }

        C0999c() {
        }

        public void a(int i4, int i5) {
            if (this.f71269a != null && this.f71270b == i5 && this.f71271c == i4) {
                return;
            }
            this.f71271c = i4;
            this.f71272d = (1 << i4) - 1;
            this.f71270b = i5;
            int i6 = 1 << (i5 + i4);
            this.f71269a = new a[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                this.f71269a[i7] = new a();
            }
        }

        public void a() {
            int i4 = 1 << (this.f71270b + this.f71271c);
            for (int i5 = 0; i5 < i4; i5++) {
                this.f71269a[i5].a();
            }
        }

        public a a(int i4, byte b5) {
            a[] aVarArr = this.f71269a;
            int i5 = i4 & this.f71272d;
            int i6 = this.f71270b;
            return aVarArr[(i5 << i6) + ((b5 & 255) >>> (8 - i6))];
        }
    }

    int a(int i4, int i5, int i6, int i7) {
        return this.f71251r.a(i5 - 2, i7) + b(i4, i6, i7);
    }

    void f(int i4) throws IOException {
        if (i4 > 0) {
            this.f71239f.d(i4);
            this.f71257x += i4;
        }
    }

    int a(int i4, int i5, int i6) {
        int i7;
        int a5 = com.tencent.beacon.base.net.b.a.b.a.a(i5);
        if (i4 < 128) {
            i7 = this.C[(a5 * 128) + i4];
        } else {
            i7 = this.D[i4 & 15] + this.B[(a5 << 6) + e(i4)];
        }
        return i7 + this.f71250q.a(i5 - 2, i6);
    }

    int b(int i4, int i5, int i6) {
        if (i4 == 0) {
            return com.tencent.beacon.base.net.b.a.c.d.b(this.f71246m[(i5 << 4) + i6]) + com.tencent.beacon.base.net.b.a.c.d.a(this.f71243j[i5]);
        }
        int b5 = com.tencent.beacon.base.net.b.a.c.d.b(this.f71243j[i5]);
        if (i4 == 1) {
            return com.tencent.beacon.base.net.b.a.c.d.a(this.f71244k[i5]) + b5;
        }
        return com.tencent.beacon.base.net.b.a.c.d.b(this.f71245l[i5], i4 - 2) + com.tencent.beacon.base.net.b.a.c.d.b(this.f71244k[i5]) + b5;
    }

    int a(int i4) {
        this.f71258y = i4;
        d dVar = this.f71238e[i4];
        int i5 = dVar.f71282g;
        int i6 = dVar.f71283h;
        while (true) {
            d[] dVarArr = this.f71238e;
            if (dVarArr[i4].f71277b) {
                dVarArr[i5].b();
                d[] dVarArr2 = this.f71238e;
                int i7 = i5 - 1;
                dVarArr2[i5].f71282g = i7;
                d dVar2 = dVarArr2[i4];
                if (dVar2.f71278c) {
                    d dVar3 = dVarArr2[i7];
                    dVar3.f71277b = false;
                    dVar3.f71282g = dVar2.f71279d;
                    dVar3.f71283h = dVar2.f71280e;
                }
            }
            d[] dVarArr3 = this.f71238e;
            d dVar4 = dVarArr3[i5];
            int i10 = dVar4.f71283h;
            int i11 = dVar4.f71282g;
            dVar4.f71283h = i6;
            dVar4.f71282g = i4;
            if (i5 <= 0) {
                d dVar5 = dVarArr3[0];
                this.V = dVar5.f71283h;
                int i12 = dVar5.f71282g;
                this.f71259z = i12;
                return i12;
            }
            i4 = i5;
            i6 = i10;
            i5 = i11;
        }
    }

    void b(int i4) throws IOException {
        g();
        k(i4 & this.H);
        this.f71240g.a();
        this.f71240g.b();
    }

    public void b(OutputStream outputStream) throws IOException {
        this.Z[0] = (byte) ((((this.G * 5) + this.I) * 9) + this.J);
        int i4 = 0;
        while (i4 < 4) {
            int i5 = i4 + 1;
            this.Z[i5] = (byte) (this.K >> (i4 * 8));
            i4 = i5;
        }
        outputStream.write(this.Z, 0, 5);
    }

    public void a(long[] jArr, long[] jArr2, boolean[] zArr) throws IOException {
        jArr[0] = 0;
        jArr2[0] = 0;
        zArr[0] = true;
        InputStream inputStream = this.P;
        if (inputStream != null) {
            this.f71239f.a(inputStream);
            this.f71239f.c();
            this.S = true;
            this.P = null;
        }
        if (this.O) {
            return;
        }
        this.O = true;
        long j4 = this.N;
        if (j4 == 0) {
            if (this.f71239f.b() == 0) {
                b((int) this.N);
                return;
            }
            f();
            this.f71240g.a(this.f71241h, (this.f71234b << 4) + (((int) this.N) & this.H), 0);
            this.f71234b = com.tencent.beacon.base.net.b.a.b.a.c(this.f71234b);
            byte a5 = this.f71239f.a(0 - this.f71257x);
            this.f71252s.a((int) this.N, this.f71236c).a(this.f71240g, a5);
            this.f71236c = a5;
            this.f71257x--;
            this.N++;
        }
        if (this.f71239f.b() == 0) {
            b((int) this.N);
            return;
        }
        while (true) {
            int c5 = c((int) this.N);
            int i4 = this.V;
            int i5 = ((int) this.N) & this.H;
            int i6 = (this.f71234b << 4) + i5;
            if (c5 == 1 && i4 == -1) {
                this.f71240g.a(this.f71241h, i6, 0);
                byte a6 = this.f71239f.a(0 - this.f71257x);
                C0999c.a a7 = this.f71252s.a((int) this.N, this.f71236c);
                if (!com.tencent.beacon.base.net.b.a.b.a.b(this.f71234b)) {
                    a7.a(this.f71240g, this.f71239f.a(((-1) - this.f71237d[0]) - this.f71257x), a6);
                } else {
                    a7.a(this.f71240g, a6);
                }
                this.f71236c = a6;
                this.f71234b = com.tencent.beacon.base.net.b.a.b.a.c(this.f71234b);
            } else {
                this.f71240g.a(this.f71241h, i6, 1);
                if (i4 < 4) {
                    this.f71240g.a(this.f71242i, this.f71234b, 1);
                    if (i4 == 0) {
                        this.f71240g.a(this.f71243j, this.f71234b, 0);
                        if (c5 == 1) {
                            this.f71240g.a(this.f71246m, i6, 0);
                        } else {
                            this.f71240g.a(this.f71246m, i6, 1);
                        }
                    } else {
                        this.f71240g.a(this.f71243j, this.f71234b, 1);
                        if (i4 == 1) {
                            this.f71240g.a(this.f71244k, this.f71234b, 0);
                        } else {
                            this.f71240g.a(this.f71244k, this.f71234b, 1);
                            this.f71240g.a(this.f71245l, this.f71234b, i4 - 2);
                        }
                    }
                    if (c5 == 1) {
                        this.f71234b = com.tencent.beacon.base.net.b.a.b.a.f(this.f71234b);
                    } else {
                        this.f71251r.a(this.f71240g, c5 - 2, i5);
                        this.f71234b = com.tencent.beacon.base.net.b.a.b.a.e(this.f71234b);
                    }
                    int i7 = this.f71237d[i4];
                    if (i4 != 0) {
                        while (i4 >= 1) {
                            int[] iArr = this.f71237d;
                            iArr[i4] = iArr[i4 - 1];
                            i4--;
                        }
                        this.f71237d[0] = i7;
                    }
                } else {
                    this.f71240g.a(this.f71242i, this.f71234b, 0);
                    this.f71234b = com.tencent.beacon.base.net.b.a.b.a.d(this.f71234b);
                    this.f71250q.a(this.f71240g, c5 - 2, i5);
                    int i10 = i4 - 4;
                    int d5 = d(i10);
                    this.f71247n[com.tencent.beacon.base.net.b.a.b.a.a(c5)].a(this.f71240g, d5);
                    if (d5 >= 4) {
                        int i11 = d5 >> 1;
                        int i12 = i11 - 1;
                        int i13 = ((d5 & 1) | 2) << i12;
                        int i14 = i10 - i13;
                        if (d5 < 14) {
                            com.tencent.beacon.base.net.b.a.c.b.a(this.f71248o, (i13 - d5) - 1, this.f71240g, i12, i14);
                        } else {
                            this.f71240g.a(i14 >> 4, i11 - 5);
                            this.f71249p.b(this.f71240g, i14 & 15);
                            this.E++;
                        }
                    }
                    for (int i15 = 3; i15 >= 1; i15--) {
                        int[] iArr2 = this.f71237d;
                        iArr2[i15] = iArr2[i15 - 1];
                    }
                    this.f71237d[0] = i10;
                    this.f71235ba++;
                }
                this.f71236c = this.f71239f.a((c5 - 1) - this.f71257x);
            }
            int i16 = this.f71257x - c5;
            this.f71257x = i16;
            this.N += c5;
            if (i16 == 0) {
                if (this.f71235ba >= 128) {
                    d();
                }
                if (this.E >= 16) {
                    c();
                }
                jArr[0] = this.N;
                jArr2[0] = this.f71240g.c();
                if (this.f71239f.b() == 0) {
                    b((int) this.N);
                    return;
                } else if (this.N - j4 >= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
                    this.O = false;
                    zArr[0] = false;
                    return;
                }
            }
        }
    }

    void a(OutputStream outputStream) {
        this.f71240g.a(outputStream);
    }

    void a(InputStream inputStream, OutputStream outputStream, long j4, long j5) {
        this.P = inputStream;
        this.O = false;
        b();
        a(outputStream);
        e();
        d();
        c();
        this.f71250q.b(this.f71254u - 1);
        this.f71250q.d(1 << this.G);
        this.f71251r.b(this.f71254u - 1);
        this.f71251r.d(1 << this.G);
        this.N = 0L;
    }

    public void a(InputStream inputStream, OutputStream outputStream, long j4, long j5, com.tencent.beacon.base.net.b.a.a aVar) throws IOException {
        this.S = false;
        try {
            a(inputStream, outputStream, j4, j5);
            while (true) {
                a(this.W, this.X, this.Y);
                if (this.Y[0]) {
                    return;
                }
                if (aVar != null) {
                    aVar.a(this.W[0], this.X[0]);
                }
            }
        } finally {
            i();
        }
    }

    public void a(boolean z4) {
        this.R = z4;
    }

    void c() {
        for (int i4 = 0; i4 < 16; i4++) {
            this.D[i4] = this.f71249p.b(i4);
        }
        this.E = 0;
    }

    public boolean c(int i4, int i5, int i6) {
        if (i5 < 0 || i5 > 4 || i4 < 0 || i4 > 8 || i6 < 0 || i6 > 4) {
            return false;
        }
        this.I = i5;
        this.J = i4;
        this.G = i6;
        this.H = (1 << i6) - 1;
        return true;
    }
}
