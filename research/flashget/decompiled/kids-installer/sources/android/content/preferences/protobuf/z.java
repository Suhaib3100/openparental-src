package android.content.preferences.protobuf;

import android.content.preferences.protobuf.h2;
import androidx.appcompat.view.menu.s;
import androidx.constraintlayout.solver.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: CodedInputStream.java */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: f, reason: collision with root package name */
    private static final int f7615f = 4096;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7616g = 100;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7617h = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    int f7618a;

    /* renamed from: b, reason: collision with root package name */
    int f7619b;

    /* renamed from: c, reason: collision with root package name */
    int f7620c;

    /* renamed from: d, reason: collision with root package name */
    a0 f7621d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7622e;

    /* compiled from: CodedInputStream.java */
    /* loaded from: classes3.dex */
    private static final class b extends z {

        /* renamed from: i, reason: collision with root package name */
        private final byte[] f7623i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f7624j;

        /* renamed from: k, reason: collision with root package name */
        private int f7625k;

        /* renamed from: l, reason: collision with root package name */
        private int f7626l;

        /* renamed from: m, reason: collision with root package name */
        private int f7627m;

        /* renamed from: n, reason: collision with root package name */
        private int f7628n;

        /* renamed from: o, reason: collision with root package name */
        private int f7629o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f7630p;

        /* renamed from: q, reason: collision with root package name */
        private int f7631q;

        private void m0() {
            int i5 = this.f7625k + this.f7626l;
            this.f7625k = i5;
            int i6 = i5 - this.f7628n;
            int i7 = this.f7631q;
            if (i6 <= i7) {
                this.f7626l = 0;
                return;
            }
            int i8 = i6 - i7;
            this.f7626l = i8;
            this.f7625k = i5 - i8;
        }

        private void n0() throws IOException {
            if (this.f7625k - this.f7627m >= 10) {
                o0();
            } else {
                p0();
            }
        }

        private void o0() throws IOException {
            for (int i5 = 0; i5 < 10; i5++) {
                byte[] bArr = this.f7623i;
                int i6 = this.f7627m;
                this.f7627m = i6 + 1;
                if (bArr[i6] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void p0() throws IOException {
            for (int i5 = 0; i5 < 10; i5++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // android.content.preferences.protobuf.z
        public int A() throws IOException {
            return L();
        }

        @Override // android.content.preferences.protobuf.z
        public long B() throws IOException {
            return M();
        }

        @Override // android.content.preferences.protobuf.z
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // android.content.preferences.protobuf.z
        public <T extends h2> T D(int i5, z2<T> z2Var, s0 s0Var) throws IOException {
            int i6 = this.f7618a;
            if (i6 >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f7618a = i6 + 1;
            T y5 = z2Var.y(this, s0Var);
            a(q4.c(i5, 4));
            this.f7618a--;
            return y5;
        }

        @Override // android.content.preferences.protobuf.z
        public void E(int i5, h2.a aVar, s0 s0Var) throws IOException {
            int i6 = this.f7618a;
            if (i6 >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f7618a = i6 + 1;
            aVar.T0(this, s0Var);
            a(q4.c(i5, 4));
            this.f7618a--;
        }

        @Override // android.content.preferences.protobuf.z
        public int F() throws IOException {
            return N();
        }

        @Override // android.content.preferences.protobuf.z
        public long G() throws IOException {
            return Q();
        }

        @Override // android.content.preferences.protobuf.z
        public <T extends h2> T H(z2<T> z2Var, s0 s0Var) throws IOException {
            int N = N();
            if (this.f7618a >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            int t5 = t(N);
            this.f7618a++;
            T y5 = z2Var.y(this, s0Var);
            a(0);
            this.f7618a--;
            s(t5);
            return y5;
        }

        @Override // android.content.preferences.protobuf.z
        public void I(h2.a aVar, s0 s0Var) throws IOException {
            int N = N();
            if (this.f7618a >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            int t5 = t(N);
            this.f7618a++;
            aVar.T0(this, s0Var);
            a(0);
            this.f7618a--;
            s(t5);
        }

        @Override // android.content.preferences.protobuf.z
        public byte J() throws IOException {
            int i5 = this.f7627m;
            if (i5 == this.f7625k) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f7623i;
            this.f7627m = i5 + 1;
            return bArr[i5];
        }

        @Override // android.content.preferences.protobuf.z
        public byte[] K(int i5) throws IOException {
            if (i5 > 0) {
                int i6 = this.f7625k;
                int i7 = this.f7627m;
                if (i5 <= i6 - i7) {
                    int i8 = i5 + i7;
                    this.f7627m = i8;
                    return Arrays.copyOfRange(this.f7623i, i7, i8);
                }
            }
            if (i5 > 0) {
                throw InvalidProtocolBufferException.l();
            }
            if (i5 == 0) {
                return o1.f7442d;
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // android.content.preferences.protobuf.z
        public int L() throws IOException {
            int i5 = this.f7627m;
            if (this.f7625k - i5 < 4) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f7623i;
            this.f7627m = i5 + 4;
            return ((bArr[i5 + 3] & UByte.f27220r) << 24) | (bArr[i5] & UByte.f27220r) | ((bArr[i5 + 1] & UByte.f27220r) << 8) | ((bArr[i5 + 2] & UByte.f27220r) << 16);
        }

        @Override // android.content.preferences.protobuf.z
        public long M() throws IOException {
            int i5 = this.f7627m;
            if (this.f7625k - i5 < 8) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f7623i;
            this.f7627m = i5 + 8;
            return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        @Override // android.content.preferences.protobuf.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f7627m
                int r1 = r5.f7625k
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f7623i
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f7627m = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.R()
                int r0 = (int) r0
                return r0
            L70:
                r5.f7627m = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.b.N():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        @Override // android.content.preferences.protobuf.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long Q() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.b.Q():long");
        }

        @Override // android.content.preferences.protobuf.z
        long R() throws IOException {
            long j5 = 0;
            for (int i5 = 0; i5 < 64; i5 += 7) {
                j5 |= (r3 & ByteCompanionObject.f23585c) << i5;
                if ((J() & ByteCompanionObject.f23584b) == 0) {
                    return j5;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // android.content.preferences.protobuf.z
        public int S() throws IOException {
            return L();
        }

        @Override // android.content.preferences.protobuf.z
        public long T() throws IOException {
            return M();
        }

        @Override // android.content.preferences.protobuf.z
        public int U() throws IOException {
            return z.b(N());
        }

        @Override // android.content.preferences.protobuf.z
        public long V() throws IOException {
            return z.c(Q());
        }

        @Override // android.content.preferences.protobuf.z
        public String W() throws IOException {
            int N = N();
            if (N > 0) {
                int i5 = this.f7625k;
                int i6 = this.f7627m;
                if (N <= i5 - i6) {
                    String str = new String(this.f7623i, i6, N, o1.f7439a);
                    this.f7627m += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // android.content.preferences.protobuf.z
        public String X() throws IOException {
            int N = N();
            if (N > 0) {
                int i5 = this.f7625k;
                int i6 = this.f7627m;
                if (N <= i5 - i6) {
                    String h5 = n4.h(this.f7623i, i6, N);
                    this.f7627m += N;
                    return h5;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // android.content.preferences.protobuf.z
        public int Y() throws IOException {
            if (i()) {
                this.f7629o = 0;
                return 0;
            }
            int N = N();
            this.f7629o = N;
            if (q4.a(N) != 0) {
                return this.f7629o;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // android.content.preferences.protobuf.z
        public int Z() throws IOException {
            return N();
        }

        @Override // android.content.preferences.protobuf.z
        public void a(int i5) throws InvalidProtocolBufferException {
            if (this.f7629o != i5) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // android.content.preferences.protobuf.z
        public long a0() throws IOException {
            return Q();
        }

        @Override // android.content.preferences.protobuf.z
        @Deprecated
        public void b0(int i5, h2.a aVar) throws IOException {
            E(i5, aVar, s0.d());
        }

        @Override // android.content.preferences.protobuf.z
        public void c0() {
            this.f7628n = this.f7627m;
        }

        @Override // android.content.preferences.protobuf.z
        public void e(boolean z5) {
            this.f7630p = z5;
        }

        @Override // android.content.preferences.protobuf.z
        public int f() {
            int i5 = this.f7631q;
            if (i5 == Integer.MAX_VALUE) {
                return -1;
            }
            return i5 - (this.f7627m - this.f7628n);
        }

        @Override // android.content.preferences.protobuf.z
        public int g() {
            return this.f7629o;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean g0(int i5) throws IOException {
            int b6 = q4.b(i5);
            if (b6 == 0) {
                n0();
                return true;
            }
            if (b6 == 1) {
                k0(8);
                return true;
            }
            if (b6 == 2) {
                k0(N());
                return true;
            }
            if (b6 == 3) {
                i0();
                a(((i5 >>> 3) << 3) | 4);
                return true;
            }
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            k0(4);
            return true;
        }

        @Override // android.content.preferences.protobuf.z
        public int h() {
            return this.f7627m - this.f7628n;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean h0(int i5, CodedOutputStream codedOutputStream) throws IOException {
            int b6 = q4.b(i5);
            if (b6 == 0) {
                long Q = Q();
                codedOutputStream.Z1(i5);
                codedOutputStream.i2(Q);
                return true;
            }
            if (b6 == 1) {
                long M = M();
                codedOutputStream.Z1(i5);
                codedOutputStream.D1(M);
                return true;
            }
            if (b6 == 2) {
                w x5 = x();
                codedOutputStream.Z1(i5);
                codedOutputStream.z1(x5);
                return true;
            }
            if (b6 == 3) {
                codedOutputStream.Z1(i5);
                j0(codedOutputStream);
                int i6 = ((i5 >>> 3) << 3) | 4;
                a(i6);
                codedOutputStream.Z1(i6);
                return true;
            }
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            int L = L();
            codedOutputStream.Z1(i5);
            codedOutputStream.C1(L);
            return true;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean i() throws IOException {
            return this.f7627m == this.f7625k;
        }

        @Override // android.content.preferences.protobuf.z
        public void i0() throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (g0(Y));
        }

        @Override // android.content.preferences.protobuf.z
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (h0(Y, codedOutputStream));
        }

        @Override // android.content.preferences.protobuf.z
        public void k0(int i5) throws IOException {
            if (i5 >= 0) {
                int i6 = this.f7625k;
                int i7 = this.f7627m;
                if (i5 <= i6 - i7) {
                    this.f7627m = i7 + i5;
                    return;
                }
            }
            if (i5 >= 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // android.content.preferences.protobuf.z
        public void s(int i5) {
            this.f7631q = i5;
            m0();
        }

        @Override // android.content.preferences.protobuf.z
        public int t(int i5) throws InvalidProtocolBufferException {
            if (i5 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i6 = (this.f7627m - this.f7628n) + i5;
            int i7 = this.f7631q;
            if (i6 > i7) {
                throw InvalidProtocolBufferException.l();
            }
            this.f7631q = i6;
            m0();
            return i7;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // android.content.preferences.protobuf.z
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // android.content.preferences.protobuf.z
        public ByteBuffer w() throws IOException {
            int N = N();
            if (N > 0) {
                int i5 = this.f7625k;
                int i6 = this.f7627m;
                if (N <= i5 - i6) {
                    ByteBuffer wrap = (this.f7624j || !this.f7630p) ? ByteBuffer.wrap(Arrays.copyOfRange(this.f7623i, i6, i6 + N)) : ByteBuffer.wrap(this.f7623i, i6, N).slice();
                    this.f7627m += N;
                    return wrap;
                }
            }
            if (N == 0) {
                return o1.f7443e;
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // android.content.preferences.protobuf.z
        public w x() throws IOException {
            int N = N();
            if (N > 0) {
                int i5 = this.f7625k;
                int i6 = this.f7627m;
                if (N <= i5 - i6) {
                    w t02 = (this.f7624j && this.f7630p) ? w.t0(this.f7623i, i6, N) : w.y(this.f7623i, i6, N);
                    this.f7627m += N;
                    return t02;
                }
            }
            return N == 0 ? w.f7553s : w.s0(K(N));
        }

        @Override // android.content.preferences.protobuf.z
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // android.content.preferences.protobuf.z
        public int z() throws IOException {
            return N();
        }

        private b(byte[] bArr, int i5, int i6, boolean z5) {
            super();
            this.f7631q = Integer.MAX_VALUE;
            this.f7623i = bArr;
            this.f7625k = i6 + i5;
            this.f7627m = i5;
            this.f7628n = i5;
            this.f7624j = z5;
        }
    }

    /* compiled from: CodedInputStream.java */
    /* loaded from: classes3.dex */
    private static final class c extends z {

        /* renamed from: i, reason: collision with root package name */
        private Iterable<ByteBuffer> f7632i;

        /* renamed from: j, reason: collision with root package name */
        private Iterator<ByteBuffer> f7633j;

        /* renamed from: k, reason: collision with root package name */
        private ByteBuffer f7634k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f7635l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f7636m;

        /* renamed from: n, reason: collision with root package name */
        private int f7637n;

        /* renamed from: o, reason: collision with root package name */
        private int f7638o;

        /* renamed from: p, reason: collision with root package name */
        private int f7639p;

        /* renamed from: q, reason: collision with root package name */
        private int f7640q;

        /* renamed from: r, reason: collision with root package name */
        private int f7641r;

        /* renamed from: s, reason: collision with root package name */
        private int f7642s;

        /* renamed from: t, reason: collision with root package name */
        private long f7643t;

        /* renamed from: u, reason: collision with root package name */
        private long f7644u;

        /* renamed from: v, reason: collision with root package name */
        private long f7645v;

        /* renamed from: w, reason: collision with root package name */
        private long f7646w;

        private long m0() {
            return this.f7646w - this.f7643t;
        }

        private void n0() throws InvalidProtocolBufferException {
            if (!this.f7633j.hasNext()) {
                throw InvalidProtocolBufferException.l();
            }
            t0();
        }

        private void o0(byte[] bArr, int i5, int i6) throws IOException {
            if (i6 < 0 || i6 > q0()) {
                if (i6 > 0) {
                    throw InvalidProtocolBufferException.l();
                }
                if (i6 != 0) {
                    throw InvalidProtocolBufferException.g();
                }
                return;
            }
            int i7 = i6;
            while (i7 > 0) {
                if (this.f7646w - this.f7643t == 0) {
                    n0();
                }
                int min = Math.min(i7, (int) (this.f7646w - this.f7643t));
                long j5 = min;
                m4.n(this.f7643t, bArr, (i6 - i7) + i5, j5);
                i7 -= min;
                this.f7643t += j5;
            }
        }

        private void p0() {
            int i5 = this.f7637n + this.f7638o;
            this.f7637n = i5;
            int i6 = i5 - this.f7642s;
            int i7 = this.f7639p;
            if (i6 <= i7) {
                this.f7638o = 0;
                return;
            }
            int i8 = i6 - i7;
            this.f7638o = i8;
            this.f7637n = i5 - i8;
        }

        private int q0() {
            return (int) (((this.f7637n - this.f7641r) - this.f7643t) + this.f7644u);
        }

        private void r0() throws IOException {
            for (int i5 = 0; i5 < 10; i5++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private ByteBuffer s0(int i5, int i6) throws IOException {
            int position = this.f7634k.position();
            int limit = this.f7634k.limit();
            try {
                try {
                    this.f7634k.position(i5);
                    this.f7634k.limit(i6);
                    return this.f7634k.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.l();
                }
            } finally {
                this.f7634k.position(position);
                this.f7634k.limit(limit);
            }
        }

        private void t0() {
            ByteBuffer next = this.f7633j.next();
            this.f7634k = next;
            this.f7641r += (int) (this.f7643t - this.f7644u);
            long position = next.position();
            this.f7643t = position;
            this.f7644u = position;
            this.f7646w = this.f7634k.limit();
            long i5 = m4.i(this.f7634k);
            this.f7645v = i5;
            this.f7643t += i5;
            this.f7644u += i5;
            this.f7646w += i5;
        }

        @Override // android.content.preferences.protobuf.z
        public int A() throws IOException {
            return L();
        }

        @Override // android.content.preferences.protobuf.z
        public long B() throws IOException {
            return M();
        }

        @Override // android.content.preferences.protobuf.z
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // android.content.preferences.protobuf.z
        public <T extends h2> T D(int i5, z2<T> z2Var, s0 s0Var) throws IOException {
            int i6 = this.f7618a;
            if (i6 >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f7618a = i6 + 1;
            T y5 = z2Var.y(this, s0Var);
            a(q4.c(i5, 4));
            this.f7618a--;
            return y5;
        }

        @Override // android.content.preferences.protobuf.z
        public void E(int i5, h2.a aVar, s0 s0Var) throws IOException {
            int i6 = this.f7618a;
            if (i6 >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f7618a = i6 + 1;
            aVar.T0(this, s0Var);
            a(q4.c(i5, 4));
            this.f7618a--;
        }

        @Override // android.content.preferences.protobuf.z
        public int F() throws IOException {
            return N();
        }

        @Override // android.content.preferences.protobuf.z
        public long G() throws IOException {
            return Q();
        }

        @Override // android.content.preferences.protobuf.z
        public <T extends h2> T H(z2<T> z2Var, s0 s0Var) throws IOException {
            int N = N();
            if (this.f7618a >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            int t5 = t(N);
            this.f7618a++;
            T y5 = z2Var.y(this, s0Var);
            a(0);
            this.f7618a--;
            s(t5);
            return y5;
        }

        @Override // android.content.preferences.protobuf.z
        public void I(h2.a aVar, s0 s0Var) throws IOException {
            int N = N();
            if (this.f7618a >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            int t5 = t(N);
            this.f7618a++;
            aVar.T0(this, s0Var);
            a(0);
            this.f7618a--;
            s(t5);
        }

        @Override // android.content.preferences.protobuf.z
        public byte J() throws IOException {
            if (this.f7646w - this.f7643t == 0) {
                n0();
            }
            long j5 = this.f7643t;
            this.f7643t = 1 + j5;
            return m4.y(j5);
        }

        @Override // android.content.preferences.protobuf.z
        public byte[] K(int i5) throws IOException {
            if (i5 >= 0) {
                long j5 = i5;
                long j6 = this.f7646w;
                long j7 = this.f7643t;
                if (j5 <= j6 - j7) {
                    byte[] bArr = new byte[i5];
                    m4.n(j7, bArr, 0L, j5);
                    this.f7643t += j5;
                    return bArr;
                }
            }
            if (i5 >= 0 && i5 <= q0()) {
                byte[] bArr2 = new byte[i5];
                o0(bArr2, 0, i5);
                return bArr2;
            }
            if (i5 > 0) {
                throw InvalidProtocolBufferException.l();
            }
            if (i5 == 0) {
                return o1.f7442d;
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // android.content.preferences.protobuf.z
        public int L() throws IOException {
            int J;
            byte J2;
            long j5 = this.f7646w;
            long j6 = this.f7643t;
            if (j5 - j6 >= 4) {
                this.f7643t = 4 + j6;
                J = (m4.y(j6) & UByte.f27220r) | ((m4.y(1 + j6) & UByte.f27220r) << 8) | ((m4.y(2 + j6) & UByte.f27220r) << 16);
                J2 = m4.y(j6 + 3);
            } else {
                J = (J() & UByte.f27220r) | ((J() & UByte.f27220r) << 8) | ((J() & UByte.f27220r) << 16);
                J2 = J();
            }
            return J | ((J2 & UByte.f27220r) << 24);
        }

        @Override // android.content.preferences.protobuf.z
        public long M() throws IOException {
            long j5 = this.f7646w;
            long j6 = this.f7643t;
            if (j5 - j6 < 8) {
                return ((J() & 255) << 56) | (J() & 255) | ((J() & 255) << 8) | ((J() & 255) << 16) | ((J() & 255) << 24) | ((J() & 255) << 32) | ((J() & 255) << 40) | ((J() & 255) << 48);
            }
            this.f7643t = 8 + j6;
            return ((m4.y(j6 + 7) & 255) << 56) | (m4.y(j6) & 255) | ((m4.y(1 + j6) & 255) << 8) | ((m4.y(2 + j6) & 255) << 16) | ((m4.y(3 + j6) & 255) << 24) | ((m4.y(4 + j6) & 255) << 32) | ((m4.y(5 + j6) & 255) << 40) | ((m4.y(6 + j6) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        
            if (android.content.preferences.protobuf.m4.y(r4) < 0) goto L34;
         */
        @Override // android.content.preferences.protobuf.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f7643t
                long r2 = r10.f7646w
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8a
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = android.content.preferences.protobuf.m4.y(r0)
                if (r0 < 0) goto L1a
                long r4 = r10.f7643t
                long r4 = r4 + r2
                r10.f7643t = r4
                return r0
            L1a:
                long r6 = r10.f7646w
                long r8 = r10.f7643t
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L26
                goto L8a
            L26:
                long r6 = r4 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L34
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L90
            L34:
                long r4 = r6 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L43
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r4
                goto L90
            L43:
                long r6 = r4 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L53
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L90
            L53:
                long r4 = r6 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r4)
                if (r1 >= 0) goto L90
            L8a:
                long r0 = r10.R()
                int r0 = (int) r0
                return r0
            L90:
                r10.f7643t = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.c.N():int");
        }

        @Override // android.content.preferences.protobuf.z
        public long Q() throws IOException {
            long y5;
            long j5;
            long j6;
            int i5;
            long j7 = this.f7643t;
            if (this.f7646w != j7) {
                long j8 = j7 + 1;
                byte y6 = m4.y(j7);
                if (y6 >= 0) {
                    this.f7643t++;
                    return y6;
                }
                if (this.f7646w - this.f7643t >= 10) {
                    long j9 = j8 + 1;
                    int y7 = y6 ^ (m4.y(j8) << 7);
                    if (y7 >= 0) {
                        long j10 = j9 + 1;
                        int y8 = y7 ^ (m4.y(j9) << 14);
                        if (y8 >= 0) {
                            y5 = y8 ^ 16256;
                        } else {
                            j9 = j10 + 1;
                            int y9 = y8 ^ (m4.y(j10) << 21);
                            if (y9 < 0) {
                                i5 = y9 ^ (-2080896);
                            } else {
                                j10 = j9 + 1;
                                long y10 = y9 ^ (m4.y(j9) << 28);
                                if (y10 < 0) {
                                    long j11 = j10 + 1;
                                    long y11 = y10 ^ (m4.y(j10) << 35);
                                    if (y11 < 0) {
                                        j5 = -34093383808L;
                                    } else {
                                        j10 = j11 + 1;
                                        y10 = y11 ^ (m4.y(j11) << 42);
                                        if (y10 >= 0) {
                                            j6 = 4363953127296L;
                                        } else {
                                            j11 = j10 + 1;
                                            y11 = y10 ^ (m4.y(j10) << 49);
                                            if (y11 < 0) {
                                                j5 = -558586000294016L;
                                            } else {
                                                j10 = j11 + 1;
                                                y5 = (y11 ^ (m4.y(j11) << 56)) ^ 71499008037633920L;
                                                if (y5 < 0) {
                                                    long j12 = 1 + j10;
                                                    if (m4.y(j10) >= 0) {
                                                        j9 = j12;
                                                        this.f7643t = j9;
                                                        return y5;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    y5 = y11 ^ j5;
                                    j9 = j11;
                                    this.f7643t = j9;
                                    return y5;
                                }
                                j6 = 266354560;
                                y5 = y10 ^ j6;
                            }
                        }
                        j9 = j10;
                        this.f7643t = j9;
                        return y5;
                    }
                    i5 = y7 ^ (-128);
                    y5 = i5;
                    this.f7643t = j9;
                    return y5;
                }
            }
            return R();
        }

        @Override // android.content.preferences.protobuf.z
        long R() throws IOException {
            long j5 = 0;
            for (int i5 = 0; i5 < 64; i5 += 7) {
                j5 |= (r3 & ByteCompanionObject.f23585c) << i5;
                if ((J() & ByteCompanionObject.f23584b) == 0) {
                    return j5;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // android.content.preferences.protobuf.z
        public int S() throws IOException {
            return L();
        }

        @Override // android.content.preferences.protobuf.z
        public long T() throws IOException {
            return M();
        }

        @Override // android.content.preferences.protobuf.z
        public int U() throws IOException {
            return z.b(N());
        }

        @Override // android.content.preferences.protobuf.z
        public long V() throws IOException {
            return z.c(Q());
        }

        @Override // android.content.preferences.protobuf.z
        public String W() throws IOException {
            int N = N();
            if (N > 0) {
                long j5 = N;
                long j6 = this.f7646w;
                long j7 = this.f7643t;
                if (j5 <= j6 - j7) {
                    byte[] bArr = new byte[N];
                    m4.n(j7, bArr, 0L, j5);
                    String str = new String(bArr, o1.f7439a);
                    this.f7643t += j5;
                    return str;
                }
            }
            if (N > 0 && N <= q0()) {
                byte[] bArr2 = new byte[N];
                o0(bArr2, 0, N);
                return new String(bArr2, o1.f7439a);
            }
            if (N == 0) {
                return "";
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // android.content.preferences.protobuf.z
        public String X() throws IOException {
            int N = N();
            if (N > 0) {
                long j5 = N;
                long j6 = this.f7646w;
                long j7 = this.f7643t;
                if (j5 <= j6 - j7) {
                    String g5 = n4.g(this.f7634k, (int) (j7 - this.f7644u), N);
                    this.f7643t += j5;
                    return g5;
                }
            }
            if (N >= 0 && N <= q0()) {
                byte[] bArr = new byte[N];
                o0(bArr, 0, N);
                return n4.h(bArr, 0, N);
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // android.content.preferences.protobuf.z
        public int Y() throws IOException {
            if (i()) {
                this.f7640q = 0;
                return 0;
            }
            int N = N();
            this.f7640q = N;
            if (q4.a(N) != 0) {
                return this.f7640q;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // android.content.preferences.protobuf.z
        public int Z() throws IOException {
            return N();
        }

        @Override // android.content.preferences.protobuf.z
        public void a(int i5) throws InvalidProtocolBufferException {
            if (this.f7640q != i5) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // android.content.preferences.protobuf.z
        public long a0() throws IOException {
            return Q();
        }

        @Override // android.content.preferences.protobuf.z
        @Deprecated
        public void b0(int i5, h2.a aVar) throws IOException {
            E(i5, aVar, s0.d());
        }

        @Override // android.content.preferences.protobuf.z
        public void c0() {
            this.f7642s = (int) ((this.f7641r + this.f7643t) - this.f7644u);
        }

        @Override // android.content.preferences.protobuf.z
        public void e(boolean z5) {
            this.f7636m = z5;
        }

        @Override // android.content.preferences.protobuf.z
        public int f() {
            int i5 = this.f7639p;
            if (i5 == Integer.MAX_VALUE) {
                return -1;
            }
            return i5 - h();
        }

        @Override // android.content.preferences.protobuf.z
        public int g() {
            return this.f7640q;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean g0(int i5) throws IOException {
            int b6 = q4.b(i5);
            if (b6 == 0) {
                r0();
                return true;
            }
            if (b6 == 1) {
                k0(8);
                return true;
            }
            if (b6 == 2) {
                k0(N());
                return true;
            }
            if (b6 == 3) {
                i0();
                a(((i5 >>> 3) << 3) | 4);
                return true;
            }
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            k0(4);
            return true;
        }

        @Override // android.content.preferences.protobuf.z
        public int h() {
            return (int) (((this.f7641r - this.f7642s) + this.f7643t) - this.f7644u);
        }

        @Override // android.content.preferences.protobuf.z
        public boolean h0(int i5, CodedOutputStream codedOutputStream) throws IOException {
            int b6 = q4.b(i5);
            if (b6 == 0) {
                long Q = Q();
                codedOutputStream.Z1(i5);
                codedOutputStream.i2(Q);
                return true;
            }
            if (b6 == 1) {
                long M = M();
                codedOutputStream.Z1(i5);
                codedOutputStream.D1(M);
                return true;
            }
            if (b6 == 2) {
                w x5 = x();
                codedOutputStream.Z1(i5);
                codedOutputStream.z1(x5);
                return true;
            }
            if (b6 == 3) {
                codedOutputStream.Z1(i5);
                j0(codedOutputStream);
                int i6 = ((i5 >>> 3) << 3) | 4;
                a(i6);
                codedOutputStream.Z1(i6);
                return true;
            }
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            int L = L();
            codedOutputStream.Z1(i5);
            codedOutputStream.C1(L);
            return true;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean i() throws IOException {
            return (((long) this.f7641r) + this.f7643t) - this.f7644u == ((long) this.f7637n);
        }

        @Override // android.content.preferences.protobuf.z
        public void i0() throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (g0(Y));
        }

        @Override // android.content.preferences.protobuf.z
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (h0(Y, codedOutputStream));
        }

        @Override // android.content.preferences.protobuf.z
        public void k0(int i5) throws IOException {
            if (i5 < 0 || i5 > ((this.f7637n - this.f7641r) - this.f7643t) + this.f7644u) {
                if (i5 >= 0) {
                    throw InvalidProtocolBufferException.l();
                }
                throw InvalidProtocolBufferException.g();
            }
            while (i5 > 0) {
                if (this.f7646w - this.f7643t == 0) {
                    n0();
                }
                int min = Math.min(i5, (int) (this.f7646w - this.f7643t));
                i5 -= min;
                this.f7643t += min;
            }
        }

        @Override // android.content.preferences.protobuf.z
        public void s(int i5) {
            this.f7639p = i5;
            p0();
        }

        @Override // android.content.preferences.protobuf.z
        public int t(int i5) throws InvalidProtocolBufferException {
            if (i5 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int h5 = i5 + h();
            int i6 = this.f7639p;
            if (h5 > i6) {
                throw InvalidProtocolBufferException.l();
            }
            this.f7639p = h5;
            p0();
            return i6;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // android.content.preferences.protobuf.z
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // android.content.preferences.protobuf.z
        public ByteBuffer w() throws IOException {
            int N = N();
            if (N > 0) {
                long j5 = N;
                long j6 = this.f7646w;
                long j7 = this.f7643t;
                if (j5 <= j6 - j7) {
                    if (this.f7635l || !this.f7636m) {
                        byte[] bArr = new byte[N];
                        m4.n(j7, bArr, 0L, j5);
                        this.f7643t += j5;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j8 = j7 + j5;
                    this.f7643t = j8;
                    long j9 = this.f7645v;
                    return s0((int) ((j8 - j9) - j5), (int) (j8 - j9));
                }
            }
            if (N > 0 && N <= q0()) {
                byte[] bArr2 = new byte[N];
                o0(bArr2, 0, N);
                return ByteBuffer.wrap(bArr2);
            }
            if (N == 0) {
                return o1.f7443e;
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // android.content.preferences.protobuf.z
        public w x() throws IOException {
            int N = N();
            if (N > 0) {
                long j5 = N;
                long j6 = this.f7646w;
                long j7 = this.f7643t;
                if (j5 <= j6 - j7) {
                    if (this.f7635l && this.f7636m) {
                        int i5 = (int) (j7 - this.f7645v);
                        w r02 = w.r0(s0(i5, N + i5));
                        this.f7643t += j5;
                        return r02;
                    }
                    byte[] bArr = new byte[N];
                    m4.n(j7, bArr, 0L, j5);
                    this.f7643t += j5;
                    return w.s0(bArr);
                }
            }
            if (N > 0 && N <= q0()) {
                byte[] bArr2 = new byte[N];
                o0(bArr2, 0, N);
                return w.s0(bArr2);
            }
            if (N == 0) {
                return w.f7553s;
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // android.content.preferences.protobuf.z
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // android.content.preferences.protobuf.z
        public int z() throws IOException {
            return N();
        }

        private c(Iterable<ByteBuffer> iterable, int i5, boolean z5) {
            super();
            this.f7639p = Integer.MAX_VALUE;
            this.f7637n = i5;
            this.f7632i = iterable;
            this.f7633j = iterable.iterator();
            this.f7635l = z5;
            this.f7641r = 0;
            this.f7642s = 0;
            if (i5 != 0) {
                t0();
                return;
            }
            this.f7634k = o1.f7443e;
            this.f7643t = 0L;
            this.f7644u = 0L;
            this.f7646w = 0L;
            this.f7645v = 0L;
        }
    }

    /* compiled from: CodedInputStream.java */
    /* loaded from: classes3.dex */
    private static final class d extends z {

        /* renamed from: i, reason: collision with root package name */
        private final InputStream f7647i;

        /* renamed from: j, reason: collision with root package name */
        private final byte[] f7648j;

        /* renamed from: k, reason: collision with root package name */
        private int f7649k;

        /* renamed from: l, reason: collision with root package name */
        private int f7650l;

        /* renamed from: m, reason: collision with root package name */
        private int f7651m;

        /* renamed from: n, reason: collision with root package name */
        private int f7652n;

        /* renamed from: o, reason: collision with root package name */
        private int f7653o;

        /* renamed from: p, reason: collision with root package name */
        private int f7654p;

        /* renamed from: q, reason: collision with root package name */
        private a f7655q;

        /* compiled from: CodedInputStream.java */
        /* loaded from: classes.dex */
        private interface a {
            void a();
        }

        /* compiled from: CodedInputStream.java */
        private class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private int f7656a;

            /* renamed from: b, reason: collision with root package name */
            private ByteArrayOutputStream f7657b;

            private b() {
                this.f7656a = d.this.f7651m;
            }

            @Override // androidx.datastore.preferences.protobuf.z.d.a
            public void a() {
                if (this.f7657b == null) {
                    this.f7657b = new ByteArrayOutputStream();
                }
                this.f7657b.write(d.this.f7648j, this.f7656a, d.this.f7651m - this.f7656a);
                this.f7656a = 0;
            }

            ByteBuffer b() {
                ByteArrayOutputStream byteArrayOutputStream = this.f7657b;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(d.this.f7648j, this.f7656a, d.this.f7651m - this.f7656a);
                }
                byteArrayOutputStream.write(d.this.f7648j, this.f7656a, d.this.f7651m);
                return ByteBuffer.wrap(this.f7657b.toByteArray());
            }
        }

        private w o0(int i5) throws IOException {
            byte[] q02 = q0(i5);
            if (q02 != null) {
                return w.x(q02);
            }
            int i6 = this.f7651m;
            int i7 = this.f7649k;
            int i8 = i7 - i6;
            this.f7653o += i7;
            this.f7651m = 0;
            this.f7649k = 0;
            List<byte[]> r02 = r0(i5 - i8);
            byte[] bArr = new byte[i5];
            System.arraycopy(this.f7648j, i6, bArr, 0, i8);
            for (byte[] bArr2 : r02) {
                System.arraycopy(bArr2, 0, bArr, i8, bArr2.length);
                i8 += bArr2.length;
            }
            return w.s0(bArr);
        }

        private byte[] p0(int i5, boolean z5) throws IOException {
            byte[] q02 = q0(i5);
            if (q02 != null) {
                return z5 ? (byte[]) q02.clone() : q02;
            }
            int i6 = this.f7651m;
            int i7 = this.f7649k;
            int i8 = i7 - i6;
            this.f7653o += i7;
            this.f7651m = 0;
            this.f7649k = 0;
            List<byte[]> r02 = r0(i5 - i8);
            byte[] bArr = new byte[i5];
            System.arraycopy(this.f7648j, i6, bArr, 0, i8);
            for (byte[] bArr2 : r02) {
                System.arraycopy(bArr2, 0, bArr, i8, bArr2.length);
                i8 += bArr2.length;
            }
            return bArr;
        }

        private byte[] q0(int i5) throws IOException {
            if (i5 == 0) {
                return o1.f7442d;
            }
            if (i5 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i6 = this.f7653o;
            int i7 = this.f7651m;
            int i8 = i6 + i7 + i5;
            if (i8 - this.f7620c > 0) {
                throw InvalidProtocolBufferException.k();
            }
            int i9 = this.f7654p;
            if (i8 > i9) {
                k0((i9 - i6) - i7);
                throw InvalidProtocolBufferException.l();
            }
            int i10 = this.f7649k - i7;
            int i11 = i5 - i10;
            if (i11 >= 4096 && i11 > this.f7647i.available()) {
                return null;
            }
            byte[] bArr = new byte[i5];
            System.arraycopy(this.f7648j, this.f7651m, bArr, 0, i10);
            this.f7653o += this.f7649k;
            this.f7651m = 0;
            this.f7649k = 0;
            while (i10 < i5) {
                int read = this.f7647i.read(bArr, i10, i5 - i10);
                if (read == -1) {
                    throw InvalidProtocolBufferException.l();
                }
                this.f7653o += read;
                i10 += read;
            }
            return bArr;
        }

        private List<byte[]> r0(int i5) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i5 > 0) {
                int min = Math.min(i5, 4096);
                byte[] bArr = new byte[min];
                int i6 = 0;
                while (i6 < min) {
                    int read = this.f7647i.read(bArr, i6, min - i6);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.l();
                    }
                    this.f7653o += read;
                    i6 += read;
                }
                i5 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void s0() {
            int i5 = this.f7649k + this.f7650l;
            this.f7649k = i5;
            int i6 = this.f7653o + i5;
            int i7 = this.f7654p;
            if (i6 <= i7) {
                this.f7650l = 0;
                return;
            }
            int i8 = i6 - i7;
            this.f7650l = i8;
            this.f7649k = i5 - i8;
        }

        private void t0(int i5) throws IOException {
            if (y0(i5)) {
                return;
            }
            if (i5 <= (this.f7620c - this.f7653o) - this.f7651m) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.k();
        }

        private void u0(int i5) throws IOException {
            if (i5 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i6 = this.f7653o;
            int i7 = this.f7651m;
            int i8 = i6 + i7;
            int i9 = i8 + i5;
            int i10 = this.f7654p;
            if (i9 > i10) {
                k0((i10 - i6) - i7);
                throw InvalidProtocolBufferException.l();
            }
            int i11 = 0;
            if (this.f7655q == null) {
                this.f7653o = i8;
                int i12 = this.f7649k - i7;
                this.f7649k = 0;
                this.f7651m = 0;
                i11 = i12;
                while (i11 < i5) {
                    try {
                        long j5 = i5 - i11;
                        long skip = this.f7647i.skip(j5);
                        if (skip < 0 || skip > j5) {
                            throw new IllegalStateException(this.f7647i.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                        if (skip == 0) {
                            break;
                        } else {
                            i11 += (int) skip;
                        }
                    } finally {
                        this.f7653o += i11;
                        s0();
                    }
                }
            }
            if (i11 >= i5) {
                return;
            }
            int i13 = this.f7649k;
            int i14 = i13 - this.f7651m;
            this.f7651m = i13;
            t0(1);
            while (true) {
                int i15 = i5 - i14;
                int i16 = this.f7649k;
                if (i15 <= i16) {
                    this.f7651m = i15;
                    return;
                } else {
                    i14 += i16;
                    this.f7651m = i16;
                    t0(1);
                }
            }
        }

        private void v0() throws IOException {
            if (this.f7649k - this.f7651m >= 10) {
                w0();
            } else {
                x0();
            }
        }

        private void w0() throws IOException {
            for (int i5 = 0; i5 < 10; i5++) {
                byte[] bArr = this.f7648j;
                int i6 = this.f7651m;
                this.f7651m = i6 + 1;
                if (bArr[i6] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void x0() throws IOException {
            for (int i5 = 0; i5 < 10; i5++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private boolean y0(int i5) throws IOException {
            int i6 = this.f7651m;
            if (i6 + i5 <= this.f7649k) {
                throw new IllegalStateException(f.a("refillBuffer() called when ", i5, " bytes were already available in buffer"));
            }
            int i7 = this.f7620c;
            int i8 = this.f7653o;
            if (i5 > (i7 - i8) - i6 || i8 + i6 + i5 > this.f7654p) {
                return false;
            }
            a aVar = this.f7655q;
            if (aVar != null) {
                aVar.a();
            }
            int i9 = this.f7651m;
            if (i9 > 0) {
                int i10 = this.f7649k;
                if (i10 > i9) {
                    byte[] bArr = this.f7648j;
                    System.arraycopy(bArr, i9, bArr, 0, i10 - i9);
                }
                this.f7653o += i9;
                this.f7649k -= i9;
                this.f7651m = 0;
            }
            InputStream inputStream = this.f7647i;
            byte[] bArr2 = this.f7648j;
            int i11 = this.f7649k;
            int read = inputStream.read(bArr2, i11, Math.min(bArr2.length - i11, (this.f7620c - this.f7653o) - i11));
            if (read == 0 || read < -1 || read > this.f7648j.length) {
                throw new IllegalStateException(this.f7647i.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f7649k += read;
            s0();
            if (this.f7649k >= i5) {
                return true;
            }
            return y0(i5);
        }

        @Override // android.content.preferences.protobuf.z
        public int A() throws IOException {
            return L();
        }

        @Override // android.content.preferences.protobuf.z
        public long B() throws IOException {
            return M();
        }

        @Override // android.content.preferences.protobuf.z
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // android.content.preferences.protobuf.z
        public <T extends h2> T D(int i5, z2<T> z2Var, s0 s0Var) throws IOException {
            int i6 = this.f7618a;
            if (i6 >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f7618a = i6 + 1;
            T y5 = z2Var.y(this, s0Var);
            a(q4.c(i5, 4));
            this.f7618a--;
            return y5;
        }

        @Override // android.content.preferences.protobuf.z
        public void E(int i5, h2.a aVar, s0 s0Var) throws IOException {
            int i6 = this.f7618a;
            if (i6 >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f7618a = i6 + 1;
            aVar.T0(this, s0Var);
            a(q4.c(i5, 4));
            this.f7618a--;
        }

        @Override // android.content.preferences.protobuf.z
        public int F() throws IOException {
            return N();
        }

        @Override // android.content.preferences.protobuf.z
        public long G() throws IOException {
            return Q();
        }

        @Override // android.content.preferences.protobuf.z
        public <T extends h2> T H(z2<T> z2Var, s0 s0Var) throws IOException {
            int N = N();
            if (this.f7618a >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            int t5 = t(N);
            this.f7618a++;
            T y5 = z2Var.y(this, s0Var);
            a(0);
            this.f7618a--;
            s(t5);
            return y5;
        }

        @Override // android.content.preferences.protobuf.z
        public void I(h2.a aVar, s0 s0Var) throws IOException {
            int N = N();
            if (this.f7618a >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            int t5 = t(N);
            this.f7618a++;
            aVar.T0(this, s0Var);
            a(0);
            this.f7618a--;
            s(t5);
        }

        @Override // android.content.preferences.protobuf.z
        public byte J() throws IOException {
            if (this.f7651m == this.f7649k) {
                t0(1);
            }
            byte[] bArr = this.f7648j;
            int i5 = this.f7651m;
            this.f7651m = i5 + 1;
            return bArr[i5];
        }

        @Override // android.content.preferences.protobuf.z
        public byte[] K(int i5) throws IOException {
            int i6 = this.f7651m;
            if (i5 > this.f7649k - i6 || i5 <= 0) {
                return p0(i5, false);
            }
            int i7 = i5 + i6;
            this.f7651m = i7;
            return Arrays.copyOfRange(this.f7648j, i6, i7);
        }

        @Override // android.content.preferences.protobuf.z
        public int L() throws IOException {
            int i5 = this.f7651m;
            if (this.f7649k - i5 < 4) {
                t0(4);
                i5 = this.f7651m;
            }
            byte[] bArr = this.f7648j;
            this.f7651m = i5 + 4;
            return ((bArr[i5 + 3] & UByte.f27220r) << 24) | (bArr[i5] & UByte.f27220r) | ((bArr[i5 + 1] & UByte.f27220r) << 8) | ((bArr[i5 + 2] & UByte.f27220r) << 16);
        }

        @Override // android.content.preferences.protobuf.z
        public long M() throws IOException {
            int i5 = this.f7651m;
            if (this.f7649k - i5 < 8) {
                t0(8);
                i5 = this.f7651m;
            }
            byte[] bArr = this.f7648j;
            this.f7651m = i5 + 8;
            return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        @Override // android.content.preferences.protobuf.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f7651m
                int r1 = r5.f7649k
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f7648j
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f7651m = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.R()
                int r0 = (int) r0
                return r0
            L70:
                r5.f7651m = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.d.N():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        @Override // android.content.preferences.protobuf.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long Q() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.d.Q():long");
        }

        @Override // android.content.preferences.protobuf.z
        long R() throws IOException {
            long j5 = 0;
            for (int i5 = 0; i5 < 64; i5 += 7) {
                j5 |= (r3 & ByteCompanionObject.f23585c) << i5;
                if ((J() & ByteCompanionObject.f23584b) == 0) {
                    return j5;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // android.content.preferences.protobuf.z
        public int S() throws IOException {
            return L();
        }

        @Override // android.content.preferences.protobuf.z
        public long T() throws IOException {
            return M();
        }

        @Override // android.content.preferences.protobuf.z
        public int U() throws IOException {
            return z.b(N());
        }

        @Override // android.content.preferences.protobuf.z
        public long V() throws IOException {
            return z.c(Q());
        }

        @Override // android.content.preferences.protobuf.z
        public String W() throws IOException {
            int N = N();
            if (N > 0) {
                int i5 = this.f7649k;
                int i6 = this.f7651m;
                if (N <= i5 - i6) {
                    String str = new String(this.f7648j, i6, N, o1.f7439a);
                    this.f7651m += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N > this.f7649k) {
                return new String(p0(N, false), o1.f7439a);
            }
            t0(N);
            String str2 = new String(this.f7648j, this.f7651m, N, o1.f7439a);
            this.f7651m += N;
            return str2;
        }

        @Override // android.content.preferences.protobuf.z
        public String X() throws IOException {
            byte[] p02;
            int N = N();
            int i5 = this.f7651m;
            int i6 = this.f7649k;
            if (N <= i6 - i5 && N > 0) {
                p02 = this.f7648j;
                this.f7651m = i5 + N;
            } else {
                if (N == 0) {
                    return "";
                }
                i5 = 0;
                if (N <= i6) {
                    t0(N);
                    p02 = this.f7648j;
                    this.f7651m = N + 0;
                } else {
                    p02 = p0(N, false);
                }
            }
            return n4.h(p02, i5, N);
        }

        @Override // android.content.preferences.protobuf.z
        public int Y() throws IOException {
            if (i()) {
                this.f7652n = 0;
                return 0;
            }
            int N = N();
            this.f7652n = N;
            if (q4.a(N) != 0) {
                return this.f7652n;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // android.content.preferences.protobuf.z
        public int Z() throws IOException {
            return N();
        }

        @Override // android.content.preferences.protobuf.z
        public void a(int i5) throws InvalidProtocolBufferException {
            if (this.f7652n != i5) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // android.content.preferences.protobuf.z
        public long a0() throws IOException {
            return Q();
        }

        @Override // android.content.preferences.protobuf.z
        @Deprecated
        public void b0(int i5, h2.a aVar) throws IOException {
            E(i5, aVar, s0.d());
        }

        @Override // android.content.preferences.protobuf.z
        public void c0() {
            this.f7653o = -this.f7651m;
        }

        @Override // android.content.preferences.protobuf.z
        public void e(boolean z5) {
        }

        @Override // android.content.preferences.protobuf.z
        public int f() {
            int i5 = this.f7654p;
            if (i5 == Integer.MAX_VALUE) {
                return -1;
            }
            return i5 - (this.f7653o + this.f7651m);
        }

        @Override // android.content.preferences.protobuf.z
        public int g() {
            return this.f7652n;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean g0(int i5) throws IOException {
            int b6 = q4.b(i5);
            if (b6 == 0) {
                v0();
                return true;
            }
            if (b6 == 1) {
                k0(8);
                return true;
            }
            if (b6 == 2) {
                k0(N());
                return true;
            }
            if (b6 == 3) {
                i0();
                a(((i5 >>> 3) << 3) | 4);
                return true;
            }
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            k0(4);
            return true;
        }

        @Override // android.content.preferences.protobuf.z
        public int h() {
            return this.f7653o + this.f7651m;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean h0(int i5, CodedOutputStream codedOutputStream) throws IOException {
            int b6 = q4.b(i5);
            if (b6 == 0) {
                long Q = Q();
                codedOutputStream.Z1(i5);
                codedOutputStream.i2(Q);
                return true;
            }
            if (b6 == 1) {
                long M = M();
                codedOutputStream.Z1(i5);
                codedOutputStream.D1(M);
                return true;
            }
            if (b6 == 2) {
                w x5 = x();
                codedOutputStream.Z1(i5);
                codedOutputStream.z1(x5);
                return true;
            }
            if (b6 == 3) {
                codedOutputStream.Z1(i5);
                j0(codedOutputStream);
                int i6 = ((i5 >>> 3) << 3) | 4;
                a(i6);
                codedOutputStream.Z1(i6);
                return true;
            }
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            int L = L();
            codedOutputStream.Z1(i5);
            codedOutputStream.C1(L);
            return true;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean i() throws IOException {
            return this.f7651m == this.f7649k && !y0(1);
        }

        @Override // android.content.preferences.protobuf.z
        public void i0() throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (g0(Y));
        }

        @Override // android.content.preferences.protobuf.z
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (h0(Y, codedOutputStream));
        }

        @Override // android.content.preferences.protobuf.z
        public void k0(int i5) throws IOException {
            int i6 = this.f7649k;
            int i7 = this.f7651m;
            if (i5 > i6 - i7 || i5 < 0) {
                u0(i5);
            } else {
                this.f7651m = i7 + i5;
            }
        }

        @Override // android.content.preferences.protobuf.z
        public void s(int i5) {
            this.f7654p = i5;
            s0();
        }

        @Override // android.content.preferences.protobuf.z
        public int t(int i5) throws InvalidProtocolBufferException {
            if (i5 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i6 = this.f7653o + this.f7651m + i5;
            int i7 = this.f7654p;
            if (i6 > i7) {
                throw InvalidProtocolBufferException.l();
            }
            this.f7654p = i6;
            s0();
            return i7;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // android.content.preferences.protobuf.z
        public byte[] v() throws IOException {
            int N = N();
            int i5 = this.f7649k;
            int i6 = this.f7651m;
            if (N > i5 - i6 || N <= 0) {
                return p0(N, false);
            }
            byte[] copyOfRange = Arrays.copyOfRange(this.f7648j, i6, i6 + N);
            this.f7651m += N;
            return copyOfRange;
        }

        @Override // android.content.preferences.protobuf.z
        public ByteBuffer w() throws IOException {
            int N = N();
            int i5 = this.f7649k;
            int i6 = this.f7651m;
            if (N > i5 - i6 || N <= 0) {
                return N == 0 ? o1.f7443e : ByteBuffer.wrap(p0(N, true));
            }
            ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f7648j, i6, i6 + N));
            this.f7651m += N;
            return wrap;
        }

        @Override // android.content.preferences.protobuf.z
        public w x() throws IOException {
            int N = N();
            int i5 = this.f7649k;
            int i6 = this.f7651m;
            if (N > i5 - i6 || N <= 0) {
                return N == 0 ? w.f7553s : o0(N);
            }
            w y5 = w.y(this.f7648j, i6, N);
            this.f7651m += N;
            return y5;
        }

        @Override // android.content.preferences.protobuf.z
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // android.content.preferences.protobuf.z
        public int z() throws IOException {
            return N();
        }

        private d(InputStream inputStream, int i5) {
            super();
            this.f7654p = Integer.MAX_VALUE;
            this.f7655q = null;
            o1.e(inputStream, "input");
            this.f7647i = inputStream;
            this.f7648j = new byte[i5];
            this.f7649k = 0;
            this.f7651m = 0;
            this.f7653o = 0;
        }
    }

    /* compiled from: CodedInputStream.java */
    /* loaded from: classes3.dex */
    private static final class e extends z {

        /* renamed from: i, reason: collision with root package name */
        private final ByteBuffer f7659i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f7660j;

        /* renamed from: k, reason: collision with root package name */
        private final long f7661k;

        /* renamed from: l, reason: collision with root package name */
        private long f7662l;

        /* renamed from: m, reason: collision with root package name */
        private long f7663m;

        /* renamed from: n, reason: collision with root package name */
        private long f7664n;

        /* renamed from: o, reason: collision with root package name */
        private int f7665o;

        /* renamed from: p, reason: collision with root package name */
        private int f7666p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f7667q;

        /* renamed from: r, reason: collision with root package name */
        private int f7668r;

        private int m0(long j5) {
            return (int) (j5 - this.f7661k);
        }

        static boolean n0() {
            return m4.T();
        }

        private void o0() {
            long j5 = this.f7662l + this.f7665o;
            this.f7662l = j5;
            int i5 = (int) (j5 - this.f7664n);
            int i6 = this.f7668r;
            if (i5 <= i6) {
                this.f7665o = 0;
                return;
            }
            int i7 = i5 - i6;
            this.f7665o = i7;
            this.f7662l = j5 - i7;
        }

        private int p0() {
            return (int) (this.f7662l - this.f7663m);
        }

        private void q0() throws IOException {
            if (p0() >= 10) {
                r0();
            } else {
                s0();
            }
        }

        private void r0() throws IOException {
            for (int i5 = 0; i5 < 10; i5++) {
                long j5 = this.f7663m;
                this.f7663m = 1 + j5;
                if (m4.y(j5) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void s0() throws IOException {
            for (int i5 = 0; i5 < 10; i5++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private ByteBuffer t0(long j5, long j6) throws IOException {
            int position = this.f7659i.position();
            int limit = this.f7659i.limit();
            try {
                try {
                    this.f7659i.position((int) (j5 - this.f7661k));
                    this.f7659i.limit((int) (j6 - this.f7661k));
                    return this.f7659i.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.l();
                }
            } finally {
                this.f7659i.position(position);
                this.f7659i.limit(limit);
            }
        }

        @Override // android.content.preferences.protobuf.z
        public int A() throws IOException {
            return L();
        }

        @Override // android.content.preferences.protobuf.z
        public long B() throws IOException {
            return M();
        }

        @Override // android.content.preferences.protobuf.z
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // android.content.preferences.protobuf.z
        public <T extends h2> T D(int i5, z2<T> z2Var, s0 s0Var) throws IOException {
            int i6 = this.f7618a;
            if (i6 >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f7618a = i6 + 1;
            T y5 = z2Var.y(this, s0Var);
            a(q4.c(i5, 4));
            this.f7618a--;
            return y5;
        }

        @Override // android.content.preferences.protobuf.z
        public void E(int i5, h2.a aVar, s0 s0Var) throws IOException {
            int i6 = this.f7618a;
            if (i6 >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f7618a = i6 + 1;
            aVar.T0(this, s0Var);
            a(q4.c(i5, 4));
            this.f7618a--;
        }

        @Override // android.content.preferences.protobuf.z
        public int F() throws IOException {
            return N();
        }

        @Override // android.content.preferences.protobuf.z
        public long G() throws IOException {
            return Q();
        }

        @Override // android.content.preferences.protobuf.z
        public <T extends h2> T H(z2<T> z2Var, s0 s0Var) throws IOException {
            int N = N();
            if (this.f7618a >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            int t5 = t(N);
            this.f7618a++;
            T y5 = z2Var.y(this, s0Var);
            a(0);
            this.f7618a--;
            s(t5);
            return y5;
        }

        @Override // android.content.preferences.protobuf.z
        public void I(h2.a aVar, s0 s0Var) throws IOException {
            int N = N();
            if (this.f7618a >= this.f7619b) {
                throw InvalidProtocolBufferException.i();
            }
            int t5 = t(N);
            this.f7618a++;
            aVar.T0(this, s0Var);
            a(0);
            this.f7618a--;
            s(t5);
        }

        @Override // android.content.preferences.protobuf.z
        public byte J() throws IOException {
            long j5 = this.f7663m;
            if (j5 == this.f7662l) {
                throw InvalidProtocolBufferException.l();
            }
            this.f7663m = 1 + j5;
            return m4.y(j5);
        }

        @Override // android.content.preferences.protobuf.z
        public byte[] K(int i5) throws IOException {
            if (i5 < 0 || i5 > p0()) {
                if (i5 > 0) {
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 0) {
                    return o1.f7442d;
                }
                throw InvalidProtocolBufferException.g();
            }
            byte[] bArr = new byte[i5];
            long j5 = this.f7663m;
            long j6 = i5;
            t0(j5, j5 + j6).get(bArr);
            this.f7663m += j6;
            return bArr;
        }

        @Override // android.content.preferences.protobuf.z
        public int L() throws IOException {
            long j5 = this.f7663m;
            if (this.f7662l - j5 < 4) {
                throw InvalidProtocolBufferException.l();
            }
            this.f7663m = 4 + j5;
            return ((m4.y(j5 + 3) & UByte.f27220r) << 24) | (m4.y(j5) & UByte.f27220r) | ((m4.y(1 + j5) & UByte.f27220r) << 8) | ((m4.y(2 + j5) & UByte.f27220r) << 16);
        }

        @Override // android.content.preferences.protobuf.z
        public long M() throws IOException {
            long j5 = this.f7663m;
            if (this.f7662l - j5 < 8) {
                throw InvalidProtocolBufferException.l();
            }
            this.f7663m = 8 + j5;
            return ((m4.y(j5 + 7) & 255) << 56) | (m4.y(j5) & 255) | ((m4.y(1 + j5) & 255) << 8) | ((m4.y(2 + j5) & 255) << 16) | ((m4.y(3 + j5) & 255) << 24) | ((m4.y(4 + j5) & 255) << 32) | ((m4.y(5 + j5) & 255) << 40) | ((m4.y(6 + j5) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        
            if (android.content.preferences.protobuf.m4.y(r4) < 0) goto L34;
         */
        @Override // android.content.preferences.protobuf.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f7663m
                long r2 = r10.f7662l
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L85
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = android.content.preferences.protobuf.m4.y(r0)
                if (r0 < 0) goto L17
                r10.f7663m = r4
                return r0
            L17:
                long r6 = r10.f7662l
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L21
                goto L85
            L21:
                long r6 = r4 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L2f
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L8b
            L2f:
                long r4 = r6 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L3c:
                r6 = r4
                goto L8b
            L3e:
                long r6 = r4 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L4e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L8b
            L4e:
                long r4 = r6 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r4)
                if (r1 >= 0) goto L8b
            L85:
                long r0 = r10.R()
                int r0 = (int) r0
                return r0
            L8b:
                r10.f7663m = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.e.N():int");
        }

        @Override // android.content.preferences.protobuf.z
        public long Q() throws IOException {
            long y5;
            long j5;
            long j6;
            int i5;
            long j7 = this.f7663m;
            if (this.f7662l != j7) {
                long j8 = j7 + 1;
                byte y6 = m4.y(j7);
                if (y6 >= 0) {
                    this.f7663m = j8;
                    return y6;
                }
                if (this.f7662l - j8 >= 9) {
                    long j9 = j8 + 1;
                    int y7 = y6 ^ (m4.y(j8) << 7);
                    if (y7 >= 0) {
                        long j10 = j9 + 1;
                        int y8 = y7 ^ (m4.y(j9) << 14);
                        if (y8 >= 0) {
                            y5 = y8 ^ 16256;
                        } else {
                            j9 = j10 + 1;
                            int y9 = y8 ^ (m4.y(j10) << 21);
                            if (y9 < 0) {
                                i5 = y9 ^ (-2080896);
                            } else {
                                j10 = j9 + 1;
                                long y10 = y9 ^ (m4.y(j9) << 28);
                                if (y10 < 0) {
                                    long j11 = j10 + 1;
                                    long y11 = y10 ^ (m4.y(j10) << 35);
                                    if (y11 < 0) {
                                        j5 = -34093383808L;
                                    } else {
                                        j10 = j11 + 1;
                                        y10 = y11 ^ (m4.y(j11) << 42);
                                        if (y10 >= 0) {
                                            j6 = 4363953127296L;
                                        } else {
                                            j11 = j10 + 1;
                                            y11 = y10 ^ (m4.y(j10) << 49);
                                            if (y11 < 0) {
                                                j5 = -558586000294016L;
                                            } else {
                                                j10 = j11 + 1;
                                                y5 = (y11 ^ (m4.y(j11) << 56)) ^ 71499008037633920L;
                                                if (y5 < 0) {
                                                    long j12 = 1 + j10;
                                                    if (m4.y(j10) >= 0) {
                                                        j9 = j12;
                                                        this.f7663m = j9;
                                                        return y5;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    y5 = y11 ^ j5;
                                    j9 = j11;
                                    this.f7663m = j9;
                                    return y5;
                                }
                                j6 = 266354560;
                                y5 = y10 ^ j6;
                            }
                        }
                        j9 = j10;
                        this.f7663m = j9;
                        return y5;
                    }
                    i5 = y7 ^ (-128);
                    y5 = i5;
                    this.f7663m = j9;
                    return y5;
                }
            }
            return R();
        }

        @Override // android.content.preferences.protobuf.z
        long R() throws IOException {
            long j5 = 0;
            for (int i5 = 0; i5 < 64; i5 += 7) {
                j5 |= (r3 & ByteCompanionObject.f23585c) << i5;
                if ((J() & ByteCompanionObject.f23584b) == 0) {
                    return j5;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // android.content.preferences.protobuf.z
        public int S() throws IOException {
            return L();
        }

        @Override // android.content.preferences.protobuf.z
        public long T() throws IOException {
            return M();
        }

        @Override // android.content.preferences.protobuf.z
        public int U() throws IOException {
            return z.b(N());
        }

        @Override // android.content.preferences.protobuf.z
        public long V() throws IOException {
            return z.c(Q());
        }

        @Override // android.content.preferences.protobuf.z
        public String W() throws IOException {
            int N = N();
            if (N <= 0 || N > p0()) {
                if (N == 0) {
                    return "";
                }
                if (N < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = new byte[N];
            long j5 = N;
            m4.n(this.f7663m, bArr, 0L, j5);
            String str = new String(bArr, o1.f7439a);
            this.f7663m += j5;
            return str;
        }

        @Override // android.content.preferences.protobuf.z
        public String X() throws IOException {
            int N = N();
            if (N > 0 && N <= p0()) {
                String g5 = n4.g(this.f7659i, (int) (this.f7663m - this.f7661k), N);
                this.f7663m += N;
                return g5;
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // android.content.preferences.protobuf.z
        public int Y() throws IOException {
            if (i()) {
                this.f7666p = 0;
                return 0;
            }
            int N = N();
            this.f7666p = N;
            if (q4.a(N) != 0) {
                return this.f7666p;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // android.content.preferences.protobuf.z
        public int Z() throws IOException {
            return N();
        }

        @Override // android.content.preferences.protobuf.z
        public void a(int i5) throws InvalidProtocolBufferException {
            if (this.f7666p != i5) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // android.content.preferences.protobuf.z
        public long a0() throws IOException {
            return Q();
        }

        @Override // android.content.preferences.protobuf.z
        @Deprecated
        public void b0(int i5, h2.a aVar) throws IOException {
            E(i5, aVar, s0.d());
        }

        @Override // android.content.preferences.protobuf.z
        public void c0() {
            this.f7664n = this.f7663m;
        }

        @Override // android.content.preferences.protobuf.z
        public void e(boolean z5) {
            this.f7667q = z5;
        }

        @Override // android.content.preferences.protobuf.z
        public int f() {
            int i5 = this.f7668r;
            if (i5 == Integer.MAX_VALUE) {
                return -1;
            }
            return i5 - h();
        }

        @Override // android.content.preferences.protobuf.z
        public int g() {
            return this.f7666p;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean g0(int i5) throws IOException {
            int b6 = q4.b(i5);
            if (b6 == 0) {
                q0();
                return true;
            }
            if (b6 == 1) {
                k0(8);
                return true;
            }
            if (b6 == 2) {
                k0(N());
                return true;
            }
            if (b6 == 3) {
                i0();
                a(((i5 >>> 3) << 3) | 4);
                return true;
            }
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            k0(4);
            return true;
        }

        @Override // android.content.preferences.protobuf.z
        public int h() {
            return (int) (this.f7663m - this.f7664n);
        }

        @Override // android.content.preferences.protobuf.z
        public boolean h0(int i5, CodedOutputStream codedOutputStream) throws IOException {
            int b6 = q4.b(i5);
            if (b6 == 0) {
                long Q = Q();
                codedOutputStream.Z1(i5);
                codedOutputStream.i2(Q);
                return true;
            }
            if (b6 == 1) {
                long M = M();
                codedOutputStream.Z1(i5);
                codedOutputStream.D1(M);
                return true;
            }
            if (b6 == 2) {
                w x5 = x();
                codedOutputStream.Z1(i5);
                codedOutputStream.z1(x5);
                return true;
            }
            if (b6 == 3) {
                codedOutputStream.Z1(i5);
                j0(codedOutputStream);
                int i6 = ((i5 >>> 3) << 3) | 4;
                a(i6);
                codedOutputStream.Z1(i6);
                return true;
            }
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            int L = L();
            codedOutputStream.Z1(i5);
            codedOutputStream.C1(L);
            return true;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean i() throws IOException {
            return this.f7663m == this.f7662l;
        }

        @Override // android.content.preferences.protobuf.z
        public void i0() throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (g0(Y));
        }

        @Override // android.content.preferences.protobuf.z
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (h0(Y, codedOutputStream));
        }

        @Override // android.content.preferences.protobuf.z
        public void k0(int i5) throws IOException {
            if (i5 >= 0 && i5 <= p0()) {
                this.f7663m += i5;
            } else {
                if (i5 >= 0) {
                    throw InvalidProtocolBufferException.l();
                }
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // android.content.preferences.protobuf.z
        public void s(int i5) {
            this.f7668r = i5;
            o0();
        }

        @Override // android.content.preferences.protobuf.z
        public int t(int i5) throws InvalidProtocolBufferException {
            if (i5 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int h5 = i5 + h();
            int i6 = this.f7668r;
            if (h5 > i6) {
                throw InvalidProtocolBufferException.l();
            }
            this.f7668r = h5;
            o0();
            return i6;
        }

        @Override // android.content.preferences.protobuf.z
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // android.content.preferences.protobuf.z
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // android.content.preferences.protobuf.z
        public ByteBuffer w() throws IOException {
            int N = N();
            if (N <= 0 || N > p0()) {
                if (N == 0) {
                    return o1.f7443e;
                }
                if (N < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.l();
            }
            if (this.f7660j || !this.f7667q) {
                byte[] bArr = new byte[N];
                long j5 = N;
                m4.n(this.f7663m, bArr, 0L, j5);
                this.f7663m += j5;
                return ByteBuffer.wrap(bArr);
            }
            long j6 = this.f7663m;
            long j7 = N;
            ByteBuffer t02 = t0(j6, j6 + j7);
            this.f7663m += j7;
            return t02;
        }

        @Override // android.content.preferences.protobuf.z
        public w x() throws IOException {
            int N = N();
            if (N <= 0 || N > p0()) {
                if (N == 0) {
                    return w.f7553s;
                }
                if (N < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.l();
            }
            if (this.f7660j && this.f7667q) {
                long j5 = this.f7663m;
                long j6 = N;
                ByteBuffer t02 = t0(j5, j5 + j6);
                this.f7663m += j6;
                return w.r0(t02);
            }
            byte[] bArr = new byte[N];
            long j7 = N;
            m4.n(this.f7663m, bArr, 0L, j7);
            this.f7663m += j7;
            return w.s0(bArr);
        }

        @Override // android.content.preferences.protobuf.z
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // android.content.preferences.protobuf.z
        public int z() throws IOException {
            return N();
        }

        private e(ByteBuffer byteBuffer, boolean z5) {
            super();
            this.f7668r = Integer.MAX_VALUE;
            this.f7659i = byteBuffer;
            long i5 = m4.i(byteBuffer);
            this.f7661k = i5;
            this.f7662l = byteBuffer.limit() + i5;
            long position = i5 + byteBuffer.position();
            this.f7663m = position;
            this.f7664n = position;
            this.f7660j = z5;
        }
    }

    public static int O(int i5, InputStream inputStream) throws IOException {
        if ((i5 & 128) == 0) {
            return i5;
        }
        int i6 = i5 & 127;
        int i7 = 7;
        while (i7 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.l();
            }
            i6 |= (read & 127) << i7;
            if ((read & 128) == 0) {
                return i6;
            }
            i7 += 7;
        }
        while (i7 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.l();
            }
            if ((read2 & 128) == 0) {
                return i6;
            }
            i7 += 7;
        }
        throw InvalidProtocolBufferException.f();
    }

    static int P(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return O(read, inputStream);
        }
        throw InvalidProtocolBufferException.l();
    }

    public static int b(int i5) {
        return (-(i5 & 1)) ^ (i5 >>> 1);
    }

    public static long c(long j5) {
        return (-(j5 & 1)) ^ (j5 >>> 1);
    }

    public static z j(InputStream inputStream) {
        return k(inputStream, 4096);
    }

    public static z k(InputStream inputStream, int i5) {
        if (i5 > 0) {
            return inputStream == null ? p(o1.f7442d) : new d(inputStream, i5);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static z l(Iterable<ByteBuffer> iterable) {
        return !m4.T() ? j(new p1(iterable)) : m(iterable, false);
    }

    static z m(Iterable<ByteBuffer> iterable, boolean z5) {
        int i5 = 0;
        int i6 = 0;
        for (ByteBuffer byteBuffer : iterable) {
            i6 += byteBuffer.remaining();
            i5 = byteBuffer.hasArray() ? i5 | 1 : byteBuffer.isDirect() ? i5 | 2 : i5 | 4;
        }
        return i5 == 2 ? new c(iterable, i6, z5) : j(new p1(iterable));
    }

    public static z n(ByteBuffer byteBuffer) {
        return o(byteBuffer, false);
    }

    static z o(ByteBuffer byteBuffer, boolean z5) {
        if (byteBuffer.hasArray()) {
            return r(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z5);
        }
        if (byteBuffer.isDirect() && m4.T()) {
            return new e(byteBuffer, z5);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return r(bArr, 0, remaining, true);
    }

    public static z p(byte[] bArr) {
        return r(bArr, 0, bArr.length, false);
    }

    public static z q(byte[] bArr, int i5, int i6) {
        return r(bArr, i5, i6, false);
    }

    static z r(byte[] bArr, int i5, int i6, boolean z5) {
        b bVar = new b(bArr, i5, i6, z5);
        try {
            bVar.t(i6);
            return bVar;
        } catch (InvalidProtocolBufferException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public abstract int A() throws IOException;

    public abstract long B() throws IOException;

    public abstract float C() throws IOException;

    public abstract <T extends h2> T D(int i5, z2<T> z2Var, s0 s0Var) throws IOException;

    public abstract void E(int i5, h2.a aVar, s0 s0Var) throws IOException;

    public abstract int F() throws IOException;

    public abstract long G() throws IOException;

    public abstract <T extends h2> T H(z2<T> z2Var, s0 s0Var) throws IOException;

    public abstract void I(h2.a aVar, s0 s0Var) throws IOException;

    public abstract byte J() throws IOException;

    public abstract byte[] K(int i5) throws IOException;

    public abstract int L() throws IOException;

    public abstract long M() throws IOException;

    public abstract int N() throws IOException;

    public abstract long Q() throws IOException;

    abstract long R() throws IOException;

    public abstract int S() throws IOException;

    public abstract long T() throws IOException;

    public abstract int U() throws IOException;

    public abstract long V() throws IOException;

    public abstract String W() throws IOException;

    public abstract String X() throws IOException;

    public abstract int Y() throws IOException;

    public abstract int Z() throws IOException;

    public abstract void a(int i5) throws InvalidProtocolBufferException;

    public abstract long a0() throws IOException;

    @Deprecated
    public abstract void b0(int i5, h2.a aVar) throws IOException;

    public abstract void c0();

    final void d() {
        this.f7622e = true;
    }

    public final int d0(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(s.a("Recursion limit cannot be negative: ", i5));
        }
        int i6 = this.f7619b;
        this.f7619b = i5;
        return i6;
    }

    public abstract void e(boolean z5);

    public final int e0(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(s.a("Size limit cannot be negative: ", i5));
        }
        int i6 = this.f7620c;
        this.f7620c = i5;
        return i6;
    }

    public abstract int f();

    final boolean f0() {
        return this.f7622e;
    }

    public abstract int g();

    public abstract boolean g0(int i5) throws IOException;

    public abstract int h();

    @Deprecated
    public abstract boolean h0(int i5, CodedOutputStream codedOutputStream) throws IOException;

    public abstract boolean i() throws IOException;

    public abstract void i0() throws IOException;

    public abstract void j0(CodedOutputStream codedOutputStream) throws IOException;

    public abstract void k0(int i5) throws IOException;

    final void l0() {
        this.f7622e = false;
    }

    public abstract void s(int i5);

    public abstract int t(int i5) throws InvalidProtocolBufferException;

    public abstract boolean u() throws IOException;

    public abstract byte[] v() throws IOException;

    public abstract ByteBuffer w() throws IOException;

    public abstract w x() throws IOException;

    public abstract double y() throws IOException;

    public abstract int z() throws IOException;

    private z() {
        this.f7619b = 100;
        this.f7620c = Integer.MAX_VALUE;
        this.f7622e = false;
    }
}
