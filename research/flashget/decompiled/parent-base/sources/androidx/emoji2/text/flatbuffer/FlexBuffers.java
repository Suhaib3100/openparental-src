package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.g2;
import kotlin.text.m0;

/* loaded from: classes3.dex */
public class FlexBuffers {
    public static final int A = 26;
    public static final int B = 36;
    private static final p C = new androidx.emoji2.text.flatbuffer.a(new byte[]{0}, 1);
    static final /* synthetic */ boolean D = false;

    /* renamed from: a, reason: collision with root package name */
    public static final int f29280a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f29281b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f29282c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f29283d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f29284e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f29285f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f29286g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f29287h = 7;

    /* renamed from: i, reason: collision with root package name */
    public static final int f29288i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f29289j = 9;

    /* renamed from: k, reason: collision with root package name */
    public static final int f29290k = 10;

    /* renamed from: l, reason: collision with root package name */
    public static final int f29291l = 11;

    /* renamed from: m, reason: collision with root package name */
    public static final int f29292m = 12;

    /* renamed from: n, reason: collision with root package name */
    public static final int f29293n = 13;

    /* renamed from: o, reason: collision with root package name */
    public static final int f29294o = 14;

    /* renamed from: p, reason: collision with root package name */
    public static final int f29295p = 15;

    /* renamed from: q, reason: collision with root package name */
    public static final int f29296q = 16;

    /* renamed from: r, reason: collision with root package name */
    public static final int f29297r = 17;

    /* renamed from: s, reason: collision with root package name */
    public static final int f29298s = 18;

    /* renamed from: t, reason: collision with root package name */
    public static final int f29299t = 19;

    /* renamed from: u, reason: collision with root package name */
    public static final int f29300u = 20;

    /* renamed from: v, reason: collision with root package name */
    public static final int f29301v = 21;

    /* renamed from: w, reason: collision with root package name */
    public static final int f29302w = 22;

    /* renamed from: x, reason: collision with root package name */
    public static final int f29303x = 23;

    /* renamed from: y, reason: collision with root package name */
    public static final int f29304y = 24;

    /* renamed from: z, reason: collision with root package name */
    public static final int f29305z = 25;

    public static class FlexBufferException extends RuntimeException {
        FlexBufferException(String str) {
            super(str);
        }
    }

    public static class a extends g {

        /* renamed from: e, reason: collision with root package name */
        static final a f29306e = new a(FlexBuffers.C, 1, 1);

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f29307f = false;

        a(p pVar, int i4, int i5) {
            super(pVar, i4, i5);
        }

        public static a d() {
            return f29306e;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb) {
            sb.append(m0.quote);
            sb.append(this.f29311a.d(this.f29312b, b()));
            sb.append(m0.quote);
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.g
        public int b() {
            return this.f29320d;
        }

        public ByteBuffer c() {
            ByteBuffer wrap = ByteBuffer.wrap(this.f29311a.a());
            wrap.position(this.f29312b);
            wrap.limit(b() + this.f29312b);
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte e(int i4) {
            return this.f29311a.get(this.f29312b + i4);
        }

        public byte[] f() {
            int b5 = b();
            byte[] bArr = new byte[b5];
            for (int i4 = 0; i4 < b5; i4++) {
                bArr[i4] = this.f29311a.get(this.f29312b + i4);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public String toString() {
            return this.f29311a.d(this.f29312b, b());
        }
    }

    public static class b extends e {

        /* renamed from: d, reason: collision with root package name */
        private static final b f29308d = new b(FlexBuffers.C, 0, 0);

        b(p pVar, int i4, int i5) {
            super(pVar, i4, i5);
        }

        public static b d() {
            return f29308d;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        int c(byte[] bArr) {
            byte b5;
            byte b6;
            int i4 = this.f29312b;
            int i5 = 0;
            do {
                b5 = this.f29311a.get(i4);
                b6 = bArr[i5];
                if (b5 == 0) {
                    return b5 - b6;
                }
                i4++;
                i5++;
                if (i5 == bArr.length) {
                    return b5 - b6;
                }
            } while (b5 == b6);
            return b5 - b6;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f29312b == this.f29312b && bVar.f29313c == this.f29313c;
        }

        public int hashCode() {
            return this.f29312b ^ this.f29313c;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public String toString() {
            int i4 = this.f29312b;
            while (this.f29311a.get(i4) != 0) {
                i4++;
            }
            int i5 = this.f29312b;
            return this.f29311a.d(i5, i4 - i5);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final h f29309a;

        c(h hVar) {
            this.f29309a = hVar;
        }

        public b a(int i4) {
            if (i4 >= b()) {
                return b.f29308d;
            }
            h hVar = this.f29309a;
            int i5 = (i4 * hVar.f29313c) + hVar.f29312b;
            h hVar2 = this.f29309a;
            p pVar = hVar2.f29311a;
            return new b(pVar, FlexBuffers.i(pVar, i5, hVar2.f29313c), 1);
        }

        public int b() {
            return this.f29309a.b();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i4 = 0; i4 < this.f29309a.b(); i4++) {
                this.f29309a.d(i4).z(sb);
                if (i4 != this.f29309a.b() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static class d extends j {

        /* renamed from: f, reason: collision with root package name */
        private static final d f29310f = new d(FlexBuffers.C, 1, 1);

        d(p pVar, int i4, int i5) {
            super(pVar, i4, i5);
        }

        private int f(c cVar, byte[] bArr) {
            int b5 = cVar.b() - 1;
            int i4 = 0;
            while (i4 <= b5) {
                int i5 = (i4 + b5) >>> 1;
                int c5 = cVar.a(i5).c(bArr);
                if (c5 < 0) {
                    i4 = i5 + 1;
                } else {
                    if (c5 <= 0) {
                        return i5;
                    }
                    b5 = i5 - 1;
                }
            }
            return -(i4 + 1);
        }

        public static d g() {
            return f29310f;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.j, androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb) {
            sb.append("{ ");
            c j4 = j();
            int b5 = b();
            j k4 = k();
            for (int i4 = 0; i4 < b5; i4++) {
                sb.append(m0.quote);
                sb.append(j4.a(i4).toString());
                sb.append("\" : ");
                sb.append(k4.d(i4).toString());
                if (i4 != b5 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public f h(String str) {
            return i(str.getBytes(StandardCharsets.UTF_8));
        }

        public f i(byte[] bArr) {
            c j4 = j();
            int b5 = j4.b();
            int f4 = f(j4, bArr);
            return (f4 < 0 || f4 >= b5) ? f.f29314f : d(f4);
        }

        public c j() {
            int i4 = this.f29312b - (this.f29313c * 3);
            p pVar = this.f29311a;
            int i5 = FlexBuffers.i(pVar, i4, this.f29313c);
            p pVar2 = this.f29311a;
            int i6 = this.f29313c;
            return new c(new h(pVar, i5, FlexBuffers.b(pVar2, i4 + i6, i6), 4));
        }

        public j k() {
            return new j(this.f29311a, this.f29312b, this.f29313c);
        }
    }

    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        p f29311a;

        /* renamed from: b, reason: collision with root package name */
        int f29312b;

        /* renamed from: c, reason: collision with root package name */
        int f29313c;

        e(p pVar, int i4, int i5) {
            this.f29311a = pVar;
            this.f29312b = i4;
            this.f29313c = i5;
        }

        public abstract StringBuilder a(StringBuilder sb);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    public static class f {

        /* renamed from: f, reason: collision with root package name */
        private static final f f29314f = new f(FlexBuffers.C, 0, 1, 0);

        /* renamed from: a, reason: collision with root package name */
        private p f29315a;

        /* renamed from: b, reason: collision with root package name */
        private int f29316b;

        /* renamed from: c, reason: collision with root package name */
        private int f29317c;

        /* renamed from: d, reason: collision with root package name */
        private int f29318d;

        /* renamed from: e, reason: collision with root package name */
        private int f29319e;

        f(p pVar, int i4, int i5, int i6) {
            this(pVar, i4, i5, 1 << (i6 & 3), i6 >> 2);
        }

        public a b() {
            if (!m() && !v()) {
                return a.d();
            }
            p pVar = this.f29315a;
            return new a(pVar, FlexBuffers.i(pVar, this.f29316b, this.f29317c), this.f29318d);
        }

        public boolean c() {
            return n() ? this.f29315a.get(this.f29316b) != 0 : j() != 0;
        }

        public double d() {
            int i4 = this.f29319e;
            if (i4 == 3) {
                return FlexBuffers.m(this.f29315a, this.f29316b, this.f29317c);
            }
            if (i4 == 1) {
                return FlexBuffers.b(this.f29315a, this.f29316b, this.f29317c);
            }
            if (i4 != 2) {
                if (i4 == 5) {
                    return Double.parseDouble(i());
                }
                if (i4 == 6) {
                    p pVar = this.f29315a;
                    return FlexBuffers.b(pVar, FlexBuffers.i(pVar, this.f29316b, this.f29317c), this.f29318d);
                }
                if (i4 == 7) {
                    p pVar2 = this.f29315a;
                    return FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f29316b, this.f29317c), this.f29318d);
                }
                if (i4 == 8) {
                    p pVar3 = this.f29315a;
                    return FlexBuffers.m(pVar3, FlexBuffers.i(pVar3, this.f29316b, this.f29317c), this.f29318d);
                }
                if (i4 == 10) {
                    return k().b();
                }
                if (i4 != 26) {
                    return com.google.firebase.remoteconfig.p.f60679p;
                }
            }
            return FlexBuffers.p(this.f29315a, this.f29316b, this.f29317c);
        }

        public int e() {
            int i4 = this.f29319e;
            if (i4 == 1) {
                return FlexBuffers.b(this.f29315a, this.f29316b, this.f29317c);
            }
            if (i4 == 2) {
                return (int) FlexBuffers.p(this.f29315a, this.f29316b, this.f29317c);
            }
            if (i4 == 3) {
                return (int) FlexBuffers.m(this.f29315a, this.f29316b, this.f29317c);
            }
            if (i4 == 5) {
                return Integer.parseInt(i());
            }
            if (i4 == 6) {
                p pVar = this.f29315a;
                return FlexBuffers.b(pVar, FlexBuffers.i(pVar, this.f29316b, this.f29317c), this.f29318d);
            }
            if (i4 == 7) {
                p pVar2 = this.f29315a;
                return (int) FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f29316b, this.f29317c), this.f29317c);
            }
            if (i4 == 8) {
                p pVar3 = this.f29315a;
                return (int) FlexBuffers.m(pVar3, FlexBuffers.i(pVar3, this.f29316b, this.f29317c), this.f29318d);
            }
            if (i4 == 10) {
                return k().b();
            }
            if (i4 != 26) {
                return 0;
            }
            return FlexBuffers.b(this.f29315a, this.f29316b, this.f29317c);
        }

        public b f() {
            if (!r()) {
                return b.d();
            }
            p pVar = this.f29315a;
            return new b(pVar, FlexBuffers.i(pVar, this.f29316b, this.f29317c), this.f29318d);
        }

        public long g() {
            int i4 = this.f29319e;
            if (i4 == 1) {
                return FlexBuffers.o(this.f29315a, this.f29316b, this.f29317c);
            }
            if (i4 == 2) {
                return FlexBuffers.p(this.f29315a, this.f29316b, this.f29317c);
            }
            if (i4 == 3) {
                return (long) FlexBuffers.m(this.f29315a, this.f29316b, this.f29317c);
            }
            if (i4 == 5) {
                try {
                    return Long.parseLong(i());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i4 == 6) {
                p pVar = this.f29315a;
                return FlexBuffers.o(pVar, FlexBuffers.i(pVar, this.f29316b, this.f29317c), this.f29318d);
            }
            if (i4 == 7) {
                p pVar2 = this.f29315a;
                return FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f29316b, this.f29317c), this.f29317c);
            }
            if (i4 == 8) {
                p pVar3 = this.f29315a;
                return (long) FlexBuffers.m(pVar3, FlexBuffers.i(pVar3, this.f29316b, this.f29317c), this.f29318d);
            }
            if (i4 == 10) {
                return k().b();
            }
            if (i4 != 26) {
                return 0L;
            }
            return FlexBuffers.b(this.f29315a, this.f29316b, this.f29317c);
        }

        public d h() {
            if (!s()) {
                return d.g();
            }
            p pVar = this.f29315a;
            return new d(pVar, FlexBuffers.i(pVar, this.f29316b, this.f29317c), this.f29318d);
        }

        public String i() {
            if (v()) {
                int i4 = FlexBuffers.i(this.f29315a, this.f29316b, this.f29317c);
                p pVar = this.f29315a;
                int i5 = this.f29318d;
                return this.f29315a.d(i4, (int) FlexBuffers.p(pVar, i4 - i5, i5));
            }
            if (!r()) {
                return "";
            }
            int i6 = FlexBuffers.i(this.f29315a, this.f29316b, this.f29318d);
            int i7 = i6;
            while (this.f29315a.get(i7) != 0) {
                i7++;
            }
            return this.f29315a.d(i6, i7 - i6);
        }

        public long j() {
            int i4 = this.f29319e;
            if (i4 == 2) {
                return FlexBuffers.p(this.f29315a, this.f29316b, this.f29317c);
            }
            if (i4 == 1) {
                return FlexBuffers.o(this.f29315a, this.f29316b, this.f29317c);
            }
            if (i4 == 3) {
                return (long) FlexBuffers.m(this.f29315a, this.f29316b, this.f29317c);
            }
            if (i4 == 10) {
                return k().b();
            }
            if (i4 == 26) {
                return FlexBuffers.b(this.f29315a, this.f29316b, this.f29317c);
            }
            if (i4 == 5) {
                return Long.parseLong(i());
            }
            if (i4 == 6) {
                p pVar = this.f29315a;
                return FlexBuffers.o(pVar, FlexBuffers.i(pVar, this.f29316b, this.f29317c), this.f29318d);
            }
            if (i4 == 7) {
                p pVar2 = this.f29315a;
                return FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f29316b, this.f29317c), this.f29318d);
            }
            if (i4 != 8) {
                return 0L;
            }
            p pVar3 = this.f29315a;
            return (long) FlexBuffers.m(pVar3, FlexBuffers.i(pVar3, this.f29316b, this.f29317c), this.f29317c);
        }

        public j k() {
            if (y()) {
                p pVar = this.f29315a;
                return new j(pVar, FlexBuffers.i(pVar, this.f29316b, this.f29317c), this.f29318d);
            }
            int i4 = this.f29319e;
            if (i4 == 15) {
                p pVar2 = this.f29315a;
                return new h(pVar2, FlexBuffers.i(pVar2, this.f29316b, this.f29317c), this.f29318d, 4);
            }
            if (!FlexBuffers.k(i4)) {
                return j.c();
            }
            p pVar3 = this.f29315a;
            return new h(pVar3, FlexBuffers.i(pVar3, this.f29316b, this.f29317c), this.f29318d, this.f29319e - 10);
        }

        public int l() {
            return this.f29319e;
        }

        public boolean m() {
            return this.f29319e == 25;
        }

        public boolean n() {
            return this.f29319e == 26;
        }

        public boolean o() {
            int i4 = this.f29319e;
            return i4 == 3 || i4 == 8;
        }

        public boolean p() {
            int i4 = this.f29319e;
            return i4 == 1 || i4 == 6;
        }

        public boolean q() {
            return p() || x();
        }

        public boolean r() {
            return this.f29319e == 4;
        }

        public boolean s() {
            return this.f29319e == 9;
        }

        public boolean t() {
            return this.f29319e == 0;
        }

        public String toString() {
            return z(new StringBuilder(128)).toString();
        }

        public boolean u() {
            return q() || o();
        }

        public boolean v() {
            return this.f29319e == 5;
        }

        public boolean w() {
            return FlexBuffers.k(this.f29319e);
        }

        public boolean x() {
            int i4 = this.f29319e;
            return i4 == 2 || i4 == 7;
        }

        public boolean y() {
            int i4 = this.f29319e;
            return i4 == 10 || i4 == 9;
        }

        StringBuilder z(StringBuilder sb) {
            int i4 = this.f29319e;
            if (i4 != 36) {
                switch (i4) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(g());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(j());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(d());
                        return sb;
                    case 4:
                        b f4 = f();
                        sb.append(m0.quote);
                        StringBuilder a5 = f4.a(sb);
                        a5.append(m0.quote);
                        return a5;
                    case 5:
                        sb.append(m0.quote);
                        sb.append(i());
                        sb.append(m0.quote);
                        return sb;
                    case 9:
                        return h().a(sb);
                    case 10:
                        return k().a(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.f29319e);
                    case 25:
                        return b().a(sb);
                    case 26:
                        sb.append(c());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(k());
            return sb;
        }

        f(p pVar, int i4, int i5, int i6, int i7) {
            this.f29315a = pVar;
            this.f29316b = i4;
            this.f29317c = i5;
            this.f29318d = i6;
            this.f29319e = i7;
        }
    }

    private static abstract class g extends e {

        /* renamed from: d, reason: collision with root package name */
        protected final int f29320d;

        g(p pVar, int i4, int i5) {
            super(pVar, i4, i5);
            this.f29320d = FlexBuffers.b(this.f29311a, i4 - i5, i5);
        }

        public int b() {
            return this.f29320d;
        }
    }

    public static class h extends j {

        /* renamed from: g, reason: collision with root package name */
        private static final h f29321g = new h(FlexBuffers.C, 1, 1, 1);

        /* renamed from: f, reason: collision with root package name */
        private final int f29322f;

        h(p pVar, int i4, int i5, int i6) {
            super(pVar, i4, i5);
            this.f29322f = i6;
        }

        public static h f() {
            return f29321g;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.j
        public f d(int i4) {
            if (i4 >= b()) {
                return f.f29314f;
            }
            return new f(this.f29311a, (i4 * this.f29313c) + this.f29312b, this.f29313c, 1, this.f29322f);
        }

        public int g() {
            return this.f29322f;
        }

        public boolean h() {
            return this == f29321g;
        }
    }

    static class i {
        i() {
        }

        static int a(byte b5) {
            return b5 & 255;
        }

        static long b(int i4) {
            return i4 & 4294967295L;
        }

        static int c(short s4) {
            return s4 & g2.f75095e;
        }
    }

    public static class j extends g {

        /* renamed from: e, reason: collision with root package name */
        private static final j f29323e = new j(FlexBuffers.C, 1, 1);

        j(p pVar, int i4, int i5) {
            super(pVar, i4, i5);
        }

        public static j c() {
            return f29323e;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb) {
            sb.append("[ ");
            int b5 = b();
            for (int i4 = 0; i4 < b5; i4++) {
                d(i4).z(sb);
                if (i4 != b5 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.g
        public int b() {
            return this.f29320d;
        }

        public f d(int i4) {
            long b5 = b();
            long j4 = i4;
            if (j4 >= b5) {
                return f.f29314f;
            }
            return new f(this.f29311a, (i4 * this.f29313c) + this.f29312b, this.f29313c, this.f29311a.get((int) ((b5 * this.f29313c) + this.f29312b + j4)) & 255);
        }

        public boolean e() {
            return this == f29323e;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    static int b(p pVar, int i4, int i5) {
        return (int) o(pVar, i4, i5);
    }

    public static f g(p pVar) {
        int limit = pVar.limit();
        byte b5 = pVar.get(limit - 1);
        int i4 = limit - 2;
        return new f(pVar, i4 - b5, b5, pVar.get(i4) & 255);
    }

    @Deprecated
    public static f h(ByteBuffer byteBuffer) {
        return g(byteBuffer.hasArray() ? new androidx.emoji2.text.flatbuffer.a(byteBuffer.array(), byteBuffer.limit()) : new androidx.emoji2.text.flatbuffer.d(byteBuffer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(p pVar, int i4, int i5) {
        return (int) (i4 - p(pVar, i4, i5));
    }

    static boolean j(int i4) {
        return i4 <= 3 || i4 == 26;
    }

    static boolean k(int i4) {
        return (i4 >= 11 && i4 <= 15) || i4 == 36;
    }

    static boolean l(int i4) {
        return (i4 >= 1 && i4 <= 4) || i4 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double m(p pVar, int i4, int i5) {
        if (i5 == 4) {
            return pVar.getFloat(i4);
        }
        if (i5 != 8) {
            return -1.0d;
        }
        return pVar.getDouble(i4);
    }

    private static int n(p pVar, int i4, int i5) {
        return (int) o(pVar, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long o(p pVar, int i4, int i5) {
        int i6;
        if (i5 == 1) {
            i6 = pVar.get(i4);
        } else if (i5 == 2) {
            i6 = pVar.getShort(i4);
        } else {
            if (i5 != 4) {
                if (i5 != 8) {
                    return -1L;
                }
                return pVar.getLong(i4);
            }
            i6 = pVar.getInt(i4);
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long p(p pVar, int i4, int i5) {
        if (i5 == 1) {
            return pVar.get(i4) & 255;
        }
        if (i5 == 2) {
            return pVar.getShort(i4) & g2.f75095e;
        }
        if (i5 == 4) {
            return pVar.getInt(i4) & 4294967295L;
        }
        if (i5 != 8) {
            return -1L;
        }
        return pVar.getLong(i4);
    }

    static int q(int i4, int i5) {
        if (i5 == 0) {
            return i4 + 10;
        }
        if (i5 == 2) {
            return i4 + 15;
        }
        if (i5 == 3) {
            return i4 + 18;
        }
        if (i5 != 4) {
            return 0;
        }
        return i4 + 21;
    }

    static int r(int i4) {
        return i4 - 10;
    }
}
