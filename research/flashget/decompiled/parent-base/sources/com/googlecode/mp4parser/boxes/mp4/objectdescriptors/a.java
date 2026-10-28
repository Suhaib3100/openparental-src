package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.ugc.TXRecordCommon;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.helpers.UtilLoggingLevel;

/* compiled from: AudioSpecificConfig.java */
@g(objectTypeIndication = 64, tags = {5})
/* loaded from: classes6.dex */
public class a extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b {

    /* renamed from: b0, reason: collision with root package name */
    public static Map<Integer, Integer> f63908b0 = new HashMap();

    /* renamed from: c0, reason: collision with root package name */
    public static Map<Integer, String> f63909c0 = new HashMap();
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    byte[] Z;

    /* renamed from: e, reason: collision with root package name */
    public C0969a f63911e;

    /* renamed from: f, reason: collision with root package name */
    public int f63912f;

    /* renamed from: g, reason: collision with root package name */
    public int f63913g;

    /* renamed from: h, reason: collision with root package name */
    public int f63914h;

    /* renamed from: i, reason: collision with root package name */
    public int f63915i;

    /* renamed from: j, reason: collision with root package name */
    public int f63916j;

    /* renamed from: k, reason: collision with root package name */
    public int f63917k;

    /* renamed from: l, reason: collision with root package name */
    public int f63918l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f63919m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f63920n;

    /* renamed from: p, reason: collision with root package name */
    public int f63922p;

    /* renamed from: q, reason: collision with root package name */
    public int f63923q;

    /* renamed from: r, reason: collision with root package name */
    public int f63924r;

    /* renamed from: s, reason: collision with root package name */
    public int f63925s;

    /* renamed from: t, reason: collision with root package name */
    public int f63926t;

    /* renamed from: u, reason: collision with root package name */
    public int f63927u;

    /* renamed from: y, reason: collision with root package name */
    public int f63931y;

    /* renamed from: z, reason: collision with root package name */
    public int f63932z;

    /* renamed from: o, reason: collision with root package name */
    public int f63921o = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f63928v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f63929w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f63930x = -1;

    /* renamed from: a0, reason: collision with root package name */
    boolean f63910a0 = false;

    /* compiled from: AudioSpecificConfig.java */
    /* renamed from: com.googlecode.mp4parser.boxes.mp4.objectdescriptors.a$a, reason: collision with other inner class name */
    public class C0969a {

        /* renamed from: i, reason: collision with root package name */
        private static final int f63933i = 0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f63934a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f63935b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f63936c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f63937d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f63938e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f63939f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f63940g;

        public C0969a(int i4, c cVar) {
            int i5;
            this.f63934a = cVar.d();
            this.f63935b = cVar.d();
            this.f63936c = cVar.d();
            this.f63937d = cVar.d();
            boolean d5 = cVar.d();
            this.f63938e = d5;
            if (d5) {
                this.f63939f = cVar.d();
                this.f63940g = cVar.d();
                a(i4, cVar);
            }
            while (cVar.c(4) != 0) {
                int c5 = cVar.c(4);
                if (c5 == 15) {
                    i5 = cVar.c(8);
                    c5 += i5;
                } else {
                    i5 = 0;
                }
                if (i5 == 255) {
                    c5 += cVar.c(16);
                }
                for (int i6 = 0; i6 < c5; i6++) {
                    cVar.c(8);
                }
            }
        }

        public void a(int i4, c cVar) {
            int i5;
            switch (i4) {
                case 1:
                case 2:
                    i5 = 1;
                    break;
                case 3:
                    i5 = 2;
                    break;
                case 4:
                case 5:
                case 6:
                    i5 = 3;
                    break;
                case 7:
                    i5 = 4;
                    break;
                default:
                    i5 = 0;
                    break;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                a.this.new b(cVar);
            }
        }
    }

    /* compiled from: AudioSpecificConfig.java */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f63942a;

        /* renamed from: b, reason: collision with root package name */
        public int f63943b;

        /* renamed from: c, reason: collision with root package name */
        public int f63944c;

        /* renamed from: d, reason: collision with root package name */
        public int f63945d;

        /* renamed from: e, reason: collision with root package name */
        public int f63946e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f63947f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f63948g;

        /* renamed from: h, reason: collision with root package name */
        public int f63949h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f63950i;

        /* renamed from: j, reason: collision with root package name */
        public int f63951j;

        /* renamed from: k, reason: collision with root package name */
        public int f63952k;

        /* renamed from: l, reason: collision with root package name */
        public int f63953l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f63954m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f63955n;

        public b(c cVar) {
            this.f63942a = cVar.d();
            this.f63943b = cVar.c(4);
            this.f63944c = cVar.c(4);
            this.f63945d = cVar.c(3);
            this.f63946e = cVar.c(2);
            this.f63947f = cVar.d();
            this.f63948g = cVar.d();
            if (this.f63947f) {
                this.f63949h = cVar.c(2);
                this.f63950i = cVar.d();
                this.f63951j = cVar.c(2);
            }
            if (this.f63948g) {
                this.f63952k = cVar.c(2);
                this.f63953l = cVar.c(2);
                this.f63954m = cVar.d();
            }
            this.f63955n = cVar.d();
        }
    }

    static {
        f63908b0.put(0, 96000);
        f63908b0.put(1, 88200);
        f63908b0.put(2, 64000);
        f63908b0.put(3, 48000);
        f63908b0.put(4, 44100);
        f63908b0.put(5, 32000);
        f63908b0.put(6, 24000);
        f63908b0.put(7, 22050);
        f63908b0.put(8, 16000);
        f63908b0.put(9, Integer.valueOf(UtilLoggingLevel.FINER_INT));
        f63908b0.put(10, 11025);
        f63908b0.put(11, Integer.valueOf(TXRecordCommon.AUDIO_SAMPLERATE_8000));
        f63909c0.put(1, ProtectedSandApp.s("ኾ\u0001"));
        f63909c0.put(2, ProtectedSandApp.s("\u12bf\u0001"));
        f63909c0.put(3, ProtectedSandApp.s("ዀ\u0001"));
        f63909c0.put(4, ProtectedSandApp.s("\u12c1\u0001"));
        f63909c0.put(5, ProtectedSandApp.s("ዂ\u0001"));
        f63909c0.put(6, ProtectedSandApp.s("ዃ\u0001"));
        f63909c0.put(7, ProtectedSandApp.s("ዄ\u0001"));
        f63909c0.put(8, ProtectedSandApp.s("ዅ\u0001"));
        f63909c0.put(9, ProtectedSandApp.s("\u12c6\u0001"));
        Map<Integer, String> map = f63909c0;
        String s4 = ProtectedSandApp.s("\u12c7\u0001");
        map.put(10, s4);
        f63909c0.put(11, s4);
        f63909c0.put(12, ProtectedSandApp.s("ወ\u0001"));
        f63909c0.put(13, ProtectedSandApp.s("ዉ\u0001"));
        f63909c0.put(14, ProtectedSandApp.s("ዊ\u0001"));
        f63909c0.put(15, ProtectedSandApp.s("ዋ\u0001"));
        f63909c0.put(16, ProtectedSandApp.s("ዌ\u0001"));
        f63909c0.put(17, ProtectedSandApp.s("ው\u0001"));
        f63909c0.put(18, s4);
        f63909c0.put(19, ProtectedSandApp.s("ዎ\u0001"));
        f63909c0.put(20, ProtectedSandApp.s("ዏ\u0001"));
        f63909c0.put(21, ProtectedSandApp.s("ዐ\u0001"));
        f63909c0.put(22, ProtectedSandApp.s("ዑ\u0001"));
        f63909c0.put(23, ProtectedSandApp.s("ዒ\u0001"));
        f63909c0.put(24, ProtectedSandApp.s("ዓ\u0001"));
        f63909c0.put(25, ProtectedSandApp.s("ዔ\u0001"));
        f63909c0.put(26, ProtectedSandApp.s("ዕ\u0001"));
        f63909c0.put(27, ProtectedSandApp.s("ዖ\u0001"));
        f63909c0.put(28, ProtectedSandApp.s("\u12d7\u0001"));
        f63909c0.put(29, ProtectedSandApp.s("ዘ\u0001"));
        f63909c0.put(30, ProtectedSandApp.s("ዙ\u0001"));
        f63909c0.put(31, ProtectedSandApp.s("ዚ\u0001"));
        f63909c0.put(32, ProtectedSandApp.s("ዛ\u0001"));
        f63909c0.put(33, ProtectedSandApp.s("ዜ\u0001"));
        f63909c0.put(34, ProtectedSandApp.s("ዝ\u0001"));
        f63909c0.put(35, ProtectedSandApp.s("ዞ\u0001"));
        f63909c0.put(36, ProtectedSandApp.s("ዟ\u0001"));
        f63909c0.put(37, ProtectedSandApp.s("ዠ\u0001"));
        f63909c0.put(38, ProtectedSandApp.s("ዡ\u0001"));
        f63909c0.put(39, ProtectedSandApp.s("ዢ\u0001"));
        f63909c0.put(40, ProtectedSandApp.s("ዣ\u0001"));
        f63909c0.put(41, ProtectedSandApp.s("ዤ\u0001"));
    }

    public a() {
        this.f63958a = 5;
    }

    private void C(int i4, d dVar) {
        if (i4 < 32) {
            dVar.a(i4, 5);
        } else {
            dVar.a(31, 5);
            dVar.a(i4 - 32, 6);
        }
    }

    private void D(d dVar) {
        dVar.a(this.f63931y, 1);
        dVar.a(this.f63932z, 1);
        if (this.f63932z == 1) {
            dVar.a(this.A, 14);
        }
        dVar.a(this.B, 1);
        if (this.f63916j == 0) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ዦ\u0001"));
        }
        int i4 = this.f63912f;
        if (i4 == 6 || i4 == 20) {
            dVar.a(this.C, 3);
        }
        if (this.B == 1) {
            if (this.f63912f == 22) {
                dVar.a(this.D, 5);
                dVar.a(this.E, 11);
            }
            int i5 = this.f63912f;
            if (i5 == 17 || i5 == 19 || i5 == 20 || i5 == 23) {
                dVar.b(this.F);
                dVar.b(this.G);
                dVar.b(this.H);
            }
            dVar.a(this.I, 1);
            if (this.I == 1) {
                throw new RuntimeException(ProtectedSandApp.s("ዥ\u0001"));
            }
        }
    }

    private int i() {
        int i4 = this.f63932z == 1 ? 16 : 2;
        int i5 = i4 + 1;
        if (this.f63916j == 0) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ዦ\u0001"));
        }
        int i6 = this.f63912f;
        if (i6 == 6 || i6 == 20) {
            i5 = i4 + 4;
        }
        if (this.B == 1) {
            if (i6 == 22) {
                i5 += 16;
            }
            if (i6 == 17 || i6 == 19 || i6 == 20 || i6 == 23) {
                i5 += 3;
            }
            i5++;
            if (this.I == 1) {
                throw new RuntimeException(ProtectedSandApp.s("ዧ\u0001"));
            }
        }
        return i5;
    }

    private int k(c cVar) throws IOException {
        int c5 = cVar.c(5);
        return c5 == 31 ? cVar.c(6) + 32 : c5;
    }

    private void q(int i4, int i5, int i6, c cVar) throws IOException {
        this.N = cVar.c(1);
        this.O = cVar.c(2);
        int c5 = cVar.c(1);
        this.P = c5;
        if (c5 == 1) {
            this.Q = cVar.c(1);
        }
    }

    private void r(int i4, int i5, int i6, c cVar) throws IOException {
        this.f63931y = cVar.c(1);
        int c5 = cVar.c(1);
        this.f63932z = c5;
        if (c5 == 1) {
            this.A = cVar.c(14);
        }
        this.B = cVar.c(1);
        if (i5 == 0) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ዦ\u0001"));
        }
        if (i6 == 6 || i6 == 20) {
            this.C = cVar.c(3);
        }
        if (this.B == 1) {
            if (i6 == 22) {
                this.D = cVar.c(5);
                this.E = cVar.c(11);
            }
            if (i6 == 17 || i6 == 19 || i6 == 20 || i6 == 23) {
                this.F = cVar.d();
                this.G = cVar.d();
                this.H = cVar.d();
            }
            int c6 = cVar.c(1);
            this.I = c6;
            if (c6 == 1) {
                throw new RuntimeException(ProtectedSandApp.s("ዥ\u0001"));
            }
        }
        this.J = true;
    }

    private void s(int i4, int i5, int i6, c cVar) throws IOException {
        this.R = cVar.c(1);
        this.S = cVar.c(8);
        this.T = cVar.c(4);
        this.U = cVar.c(12);
        this.V = cVar.c(2);
    }

    private void t(int i4, int i5, int i6, c cVar) throws IOException {
        int c5 = cVar.c(1);
        this.W = c5;
        if (c5 == 1) {
            this.X = cVar.c(2);
        }
    }

    private void u(int i4, int i5, int i6, c cVar) throws IOException {
        int c5 = cVar.c(2);
        this.L = c5;
        if (c5 != 1) {
            q(i4, i5, i6, cVar);
        }
        if (this.L != 0) {
            s(i4, i5, i6, cVar);
        }
        this.M = cVar.c(1);
        this.Y = true;
    }

    private void v(int i4, int i5, int i6, c cVar) throws IOException {
        int c5 = cVar.c(1);
        this.K = c5;
        if (c5 == 1) {
            u(i4, i5, i6, cVar);
        } else {
            t(i4, i5, i6, cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.nio.ByteBuffer w() {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.boxes.mp4.objectdescriptors.a.w():java.nio.ByteBuffer");
    }

    public void A(int i4) {
        this.f63915i = i4;
    }

    public void B(int i4) {
        this.f63914h = i4;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    int a() {
        int i4 = this.f63913g > 30 ? 11 : 5;
        int i5 = i4 + 4;
        if (this.f63914h == 15) {
            i5 = i4 + 28;
        }
        int i6 = i5 + 4;
        int i7 = this.f63912f;
        if (i7 == 5 || i7 == 29) {
            i6 = i5 + 8;
            if (this.f63921o == 15) {
                i6 = i5 + 32;
            }
        }
        if (i7 == 22) {
            i6 += 4;
        }
        if (this.J) {
            i6 += i();
        }
        int i10 = this.f63930x;
        if (i10 >= 0) {
            int i11 = i6 + 11;
            if (i10 == 695) {
                int i12 = i6 + 16;
                int i13 = this.f63917k;
                if (i13 > 30) {
                    i12 = i6 + 22;
                }
                if (i13 == 5) {
                    i6 = i12 + 1;
                    if (this.f63919m) {
                        i6 = i12 + 5;
                        if (this.f63921o == 15) {
                            i6 = i12 + 29;
                        }
                        int i14 = this.f63929w;
                        if (i14 >= 0) {
                            i6 = i14 == 1352 ? i6 + 12 : i6 + 11;
                        }
                    }
                } else {
                    i6 = i12;
                }
                if (i13 == 22) {
                    int i15 = i6 + 1;
                    if (this.f63919m) {
                        i15 = i6 + 5;
                        if (this.f63921o == 15) {
                            i15 = i6 + 29;
                        }
                    }
                    i6 = i15 + 4;
                }
            } else {
                i6 = i11;
            }
        }
        return (int) Math.ceil(i6 / 8.0d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.G == aVar.G && this.F == aVar.F && this.H == aVar.H && this.f63912f == aVar.f63912f && this.f63916j == aVar.f63916j && this.A == aVar.A && this.f63932z == aVar.f63932z && this.f63927u == aVar.f63927u && this.f63926t == aVar.f63926t && this.P == aVar.P && this.f63917k == aVar.f63917k && this.f63923q == aVar.f63923q && this.B == aVar.B && this.I == aVar.I && this.f63922p == aVar.f63922p && this.f63921o == aVar.f63921o && this.f63925s == aVar.f63925s && this.f63931y == aVar.f63931y && this.J == aVar.J && this.V == aVar.V && this.W == aVar.W && this.X == aVar.X && this.U == aVar.U && this.S == aVar.S && this.R == aVar.R && this.T == aVar.T && this.O == aVar.O && this.N == aVar.N && this.K == aVar.K && this.C == aVar.C && this.E == aVar.E && this.D == aVar.D && this.M == aVar.M && this.L == aVar.L && this.Y == aVar.Y && this.f63920n == aVar.f63920n && this.f63924r == aVar.f63924r && this.f63915i == aVar.f63915i && this.f63914h == aVar.f63914h && this.f63919m == aVar.f63919m && this.f63928v == aVar.f63928v && this.Q == aVar.Q && Arrays.equals(this.Z, aVar.Z);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        this.f63910a0 = true;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f63959b);
        byteBuffer.position(byteBuffer.position() + this.f63959b);
        byte[] bArr = new byte[this.f63959b];
        this.Z = bArr;
        slice.get(bArr);
        slice.rewind();
        c cVar = new c(slice);
        int k4 = k(cVar);
        this.f63912f = k4;
        this.f63913g = k4;
        int c5 = cVar.c(4);
        this.f63914h = c5;
        if (c5 == 15) {
            this.f63915i = cVar.c(24);
        }
        this.f63916j = cVar.c(4);
        int i4 = this.f63912f;
        if (i4 == 5 || i4 == 29) {
            this.f63917k = 5;
            this.f63919m = true;
            if (i4 == 29) {
                this.f63920n = true;
            }
            int c6 = cVar.c(4);
            this.f63921o = c6;
            if (c6 == 15) {
                this.f63922p = cVar.c(24);
            }
            int k5 = k(cVar);
            this.f63912f = k5;
            if (k5 == 22) {
                this.f63923q = cVar.c(4);
            }
        } else {
            this.f63917k = 0;
        }
        int i5 = this.f63912f;
        switch (i5) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                r(this.f63914h, this.f63916j, i5, cVar);
                break;
            case 8:
                throw new UnsupportedOperationException(ProtectedSandApp.s("ጄ\u0001"));
            case 9:
                throw new UnsupportedOperationException(ProtectedSandApp.s("ጃ\u0001"));
            case 12:
                throw new UnsupportedOperationException(ProtectedSandApp.s("ጂ\u0001"));
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException(ProtectedSandApp.s("ጁ\u0001"));
            case 24:
                throw new UnsupportedOperationException(ProtectedSandApp.s("ጀ\u0001"));
            case 25:
                throw new UnsupportedOperationException(ProtectedSandApp.s("ዿ\u0001"));
            case 26:
            case 27:
                v(this.f63914h, this.f63916j, i5, cVar);
                break;
            case 28:
                throw new UnsupportedOperationException(ProtectedSandApp.s("ዾ\u0001"));
            case 30:
                this.f63924r = cVar.c(1);
                throw new UnsupportedOperationException(ProtectedSandApp.s("ዽ\u0001"));
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException(ProtectedSandApp.s("ዼ\u0001"));
            case 35:
                throw new UnsupportedOperationException(ProtectedSandApp.s("ዻ\u0001"));
            case 36:
                this.f63925s = cVar.c(5);
                throw new UnsupportedOperationException(ProtectedSandApp.s("ዺ\u0001"));
            case 37:
            case 38:
                throw new UnsupportedOperationException(ProtectedSandApp.s("ዹ\u0001"));
            case 39:
                this.f63911e = new C0969a(this.f63916j, cVar);
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException(ProtectedSandApp.s("የ\u0001"));
        }
        int i6 = this.f63912f;
        if (i6 != 17 && i6 != 39) {
            switch (i6) {
            }
            if (this.f63917k != 5 || cVar.e() < 16) {
            }
            int c7 = cVar.c(11);
            this.f63928v = c7;
            this.f63930x = c7;
            if (c7 == 695) {
                int k6 = k(cVar);
                this.f63917k = k6;
                if (k6 == 5) {
                    boolean d5 = cVar.d();
                    this.f63919m = d5;
                    if (d5) {
                        int c10 = cVar.c(4);
                        this.f63921o = c10;
                        if (c10 == 15) {
                            this.f63922p = cVar.c(24);
                        }
                        if (cVar.e() >= 12) {
                            int c11 = cVar.c(11);
                            this.f63928v = c11;
                            this.f63929w = c11;
                            if (c11 == 1352) {
                                this.f63920n = cVar.d();
                            }
                        }
                    }
                }
                if (this.f63917k == 22) {
                    boolean d6 = cVar.d();
                    this.f63919m = d6;
                    if (d6) {
                        int c12 = cVar.c(4);
                        this.f63921o = c12;
                        if (c12 == 15) {
                            this.f63922p = cVar.c(24);
                        }
                    }
                    this.f63923q = cVar.c(4);
                    return;
                }
                return;
            }
            return;
        }
        int c13 = cVar.c(2);
        this.f63926t = c13;
        if (c13 == 2 || c13 == 3) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ዸ\u0001"));
        }
        if (c13 == 3) {
            int c14 = cVar.c(1);
            this.f63927u = c14;
            if (c14 == 0) {
                throw new RuntimeException(ProtectedSandApp.s("ዷ\u0001"));
            }
        }
        if (this.f63917k != 5) {
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public ByteBuffer g() {
        ByteBuffer allocate = ByteBuffer.allocate(b());
        com.coremedia.iso.i.m(allocate, this.f63958a);
        h(allocate, a());
        allocate.put(w());
        return (ByteBuffer) allocate.rewind();
    }

    public int hashCode() {
        byte[] bArr = this.Z;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f63912f) * 31) + this.f63914h) * 31) + this.f63915i) * 31) + this.f63916j) * 31) + this.f63917k) * 31) + (this.f63919m ? 1 : 0)) * 31) + (this.f63920n ? 1 : 0)) * 31) + this.f63921o) * 31) + this.f63922p) * 31) + this.f63923q) * 31) + this.f63924r) * 31) + this.f63925s) * 31) + this.f63926t) * 31) + this.f63927u) * 31) + this.f63928v) * 31) + this.f63931y) * 31) + this.f63932z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + this.I) * 31) + (this.J ? 1 : 0)) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + this.W) * 31) + this.X) * 31) + (this.Y ? 1 : 0);
    }

    public int j() {
        return this.f63912f;
    }

    public int l() {
        return this.f63916j;
    }

    public byte[] m() {
        return w().array();
    }

    public int n() {
        return this.f63917k;
    }

    public int o() {
        int i4 = this.f63921o;
        return i4 == 15 ? this.f63922p : f63908b0.get(Integer.valueOf(i4)).intValue();
    }

    public int p() {
        int i4 = this.f63914h;
        return i4 == 15 ? this.f63915i : f63908b0.get(Integer.valueOf(i4)).intValue();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ጅ\u0001"));
        sb.append(com.coremedia.iso.e.b(this.Z));
        sb.append(ProtectedSandApp.s("ጆ\u0001"));
        sb.append(this.f63912f);
        String s4 = ProtectedSandApp.s("ጇ\u0001");
        sb.append(s4);
        sb.append(f63909c0.get(Integer.valueOf(this.f63912f)));
        sb.append(ProtectedSandApp.s("ገ\u0001"));
        sb.append(this.f63914h);
        sb.append(s4);
        sb.append(f63908b0.get(Integer.valueOf(this.f63914h)));
        sb.append(ProtectedSandApp.s("ጉ\u0001"));
        sb.append(this.f63915i);
        sb.append(ProtectedSandApp.s("ጊ\u0001"));
        sb.append(this.f63916j);
        if (this.f63917k > 0) {
            sb.append(ProtectedSandApp.s("ጋ\u0001"));
            sb.append(this.f63917k);
            sb.append(s4);
            sb.append(f63909c0.get(Integer.valueOf(this.f63917k)));
            sb.append(ProtectedSandApp.s("ጌ\u0001"));
            sb.append(this.f63919m);
            sb.append(ProtectedSandApp.s("ግ\u0001"));
            sb.append(this.f63920n);
            sb.append(ProtectedSandApp.s("ጎ\u0001"));
            sb.append(this.f63921o);
            sb.append(s4);
            sb.append(f63908b0.get(Integer.valueOf(this.f63921o)));
            sb.append(ProtectedSandApp.s("ጏ\u0001"));
            sb.append(this.f63922p);
            sb.append(ProtectedSandApp.s("ጐ\u0001"));
            sb.append(this.f63923q);
        }
        sb.append(ProtectedSandApp.s("\u1311\u0001"));
        sb.append(this.f63928v);
        if (this.J) {
            sb.append(ProtectedSandApp.s("ጒ\u0001"));
            sb.append(this.f63931y);
            sb.append(ProtectedSandApp.s("ጓ\u0001"));
            sb.append(this.f63932z);
            sb.append(ProtectedSandApp.s("ጔ\u0001"));
            sb.append(this.A);
            sb.append(ProtectedSandApp.s("ጕ\u0001"));
            sb.append(this.B);
            sb.append(ProtectedSandApp.s("\u1316\u0001"));
            sb.append(this.C);
            sb.append(ProtectedSandApp.s("\u1317\u0001"));
            sb.append(this.D);
            sb.append(ProtectedSandApp.s("ጘ\u0001"));
            sb.append(this.E);
            sb.append(ProtectedSandApp.s("ጙ\u0001"));
            sb.append(this.F);
            sb.append(ProtectedSandApp.s("ጚ\u0001"));
            sb.append(this.G);
            sb.append(ProtectedSandApp.s("ጛ\u0001"));
            sb.append(this.H);
            sb.append(ProtectedSandApp.s("ጜ\u0001"));
            sb.append(this.I);
        }
        if (this.Y) {
            sb.append(ProtectedSandApp.s("ጝ\u0001"));
            sb.append(this.K);
            sb.append(ProtectedSandApp.s("ጞ\u0001"));
            sb.append(this.L);
            sb.append(ProtectedSandApp.s("ጟ\u0001"));
            sb.append(this.M);
            sb.append(ProtectedSandApp.s("ጠ\u0001"));
            sb.append(this.N);
            sb.append(ProtectedSandApp.s("ጡ\u0001"));
            sb.append(this.O);
            sb.append(ProtectedSandApp.s("ጢ\u0001"));
            sb.append(this.P);
            sb.append(ProtectedSandApp.s("ጣ\u0001"));
            sb.append(this.Q);
            sb.append(ProtectedSandApp.s("ጤ\u0001"));
            sb.append(this.R);
            sb.append(ProtectedSandApp.s("ጥ\u0001"));
            sb.append(this.S);
            sb.append(ProtectedSandApp.s("ጦ\u0001"));
            sb.append(this.T);
            sb.append(ProtectedSandApp.s("ጧ\u0001"));
            sb.append(this.U);
            sb.append(ProtectedSandApp.s("ጨ\u0001"));
            sb.append(this.V);
            sb.append(ProtectedSandApp.s("ጩ\u0001"));
            sb.append(this.W);
            sb.append(ProtectedSandApp.s("ጪ\u0001"));
            sb.append(this.X);
        }
        sb.append('}');
        return sb.toString();
    }

    public void x(int i4) {
        this.f63912f = i4;
    }

    public void y(int i4) {
        this.f63916j = i4;
    }

    public void z(int i4) {
        this.f63913g = i4;
    }
}
