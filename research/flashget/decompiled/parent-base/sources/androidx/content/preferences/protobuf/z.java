package androidx.content.preferences.protobuf;

import androidx.collection.r2;
import androidx.content.preferences.protobuf.i2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: CodedInputStream.java */
/* loaded from: classes3.dex */
public abstract class z {

    /* renamed from: f, reason: collision with root package name */
    private static final int f29071f = 4096;

    /* renamed from: g, reason: collision with root package name */
    private static final int f29072g = 100;

    /* renamed from: h, reason: collision with root package name */
    private static final int f29073h = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    int f29074a;

    /* renamed from: b, reason: collision with root package name */
    int f29075b;

    /* renamed from: c, reason: collision with root package name */
    int f29076c;

    /* renamed from: d, reason: collision with root package name */
    a0 f29077d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29078e;

    /* compiled from: CodedInputStream.java */
    private static final class b extends z {

        /* renamed from: i, reason: collision with root package name */
        private final byte[] f29079i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f29080j;

        /* renamed from: k, reason: collision with root package name */
        private int f29081k;

        /* renamed from: l, reason: collision with root package name */
        private int f29082l;

        /* renamed from: m, reason: collision with root package name */
        private int f29083m;

        /* renamed from: n, reason: collision with root package name */
        private int f29084n;

        /* renamed from: o, reason: collision with root package name */
        private int f29085o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f29086p;

        /* renamed from: q, reason: collision with root package name */
        private int f29087q;

        private void m0() {
            int i4 = this.f29081k + this.f29082l;
            this.f29081k = i4;
            int i5 = i4 - this.f29084n;
            int i6 = this.f29087q;
            if (i5 <= i6) {
                this.f29082l = 0;
                return;
            }
            int i7 = i5 - i6;
            this.f29082l = i7;
            this.f29081k = i4 - i7;
        }

        private void n0() throws IOException {
            if (this.f29081k - this.f29083m >= 10) {
                o0();
            } else {
                p0();
            }
        }

        private void o0() throws IOException {
            for (int i4 = 0; i4 < 10; i4++) {
                byte[] bArr = this.f29079i;
                int i5 = this.f29083m;
                this.f29083m = i5 + 1;
                if (bArr[i5] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void p0() throws IOException {
            for (int i4 = 0; i4 < 10; i4++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int A() throws IOException {
            return L();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long B() throws IOException {
            return M();
        }

        @Override // androidx.content.preferences.protobuf.z
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.content.preferences.protobuf.z
        public <T extends i2> T D(int i4, c3<T> c3Var, s0 s0Var) throws IOException {
            int i5 = this.f29074a;
            if (i5 >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f29074a = i5 + 1;
            T z4 = c3Var.z(this, s0Var);
            a(t4.c(i4, 4));
            this.f29074a--;
            return z4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void E(int i4, i2.a aVar, s0 s0Var) throws IOException {
            int i5 = this.f29074a;
            if (i5 >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f29074a = i5 + 1;
            aVar.n1(this, s0Var);
            a(t4.c(i4, 4));
            this.f29074a--;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int F() throws IOException {
            return N();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long G() throws IOException {
            return Q();
        }

        @Override // androidx.content.preferences.protobuf.z
        public <T extends i2> T H(c3<T> c3Var, s0 s0Var) throws IOException {
            int N = N();
            if (this.f29074a >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            int t4 = t(N);
            this.f29074a++;
            T z4 = c3Var.z(this, s0Var);
            a(0);
            this.f29074a--;
            s(t4);
            return z4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void I(i2.a aVar, s0 s0Var) throws IOException {
            int N = N();
            if (this.f29074a >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            int t4 = t(N);
            this.f29074a++;
            aVar.n1(this, s0Var);
            a(0);
            this.f29074a--;
            s(t4);
        }

        @Override // androidx.content.preferences.protobuf.z
        public byte J() throws IOException {
            int i4 = this.f29083m;
            if (i4 == this.f29081k) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f29079i;
            this.f29083m = i4 + 1;
            return bArr[i4];
        }

        @Override // androidx.content.preferences.protobuf.z
        public byte[] K(int i4) throws IOException {
            if (i4 > 0) {
                int i5 = this.f29081k;
                int i6 = this.f29083m;
                if (i4 <= i5 - i6) {
                    int i7 = i4 + i6;
                    this.f29083m = i7;
                    return Arrays.copyOfRange(this.f29079i, i6, i7);
                }
            }
            if (i4 > 0) {
                throw InvalidProtocolBufferException.l();
            }
            if (i4 == 0) {
                return p1.f28850d;
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int L() throws IOException {
            int i4 = this.f29083m;
            if (this.f29081k - i4 < 4) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f29079i;
            this.f29083m = i4 + 4;
            return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
        }

        @Override // androidx.content.preferences.protobuf.z
        public long M() throws IOException {
            int i4 = this.f29083m;
            if (this.f29081k - i4 < 8) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f29079i;
            this.f29083m = i4 + 8;
            return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
        }

        @Override // androidx.content.preferences.protobuf.z
        public int N() throws IOException {
            int i4;
            int i5 = this.f29083m;
            int i6 = this.f29081k;
            if (i6 != i5) {
                byte[] bArr = this.f29079i;
                int i7 = i5 + 1;
                byte b5 = bArr[i5];
                if (b5 >= 0) {
                    this.f29083m = i7;
                    return b5;
                }
                if (i6 - i7 >= 9) {
                    int i10 = i5 + 2;
                    int i11 = (bArr[i7] << 7) ^ b5;
                    if (i11 < 0) {
                        i4 = i11 ^ (-128);
                    } else {
                        int i12 = i5 + 3;
                        int i13 = (bArr[i10] << 14) ^ i11;
                        if (i13 >= 0) {
                            i4 = i13 ^ 16256;
                        } else {
                            int i14 = i5 + 4;
                            int i15 = i13 ^ (bArr[i12] << com.google.common.base.c.f54879y);
                            if (i15 < 0) {
                                i4 = (-2080896) ^ i15;
                            } else {
                                i12 = i5 + 5;
                                byte b6 = bArr[i14];
                                int i16 = (i15 ^ (b6 << com.google.common.base.c.F)) ^ 266354560;
                                if (b6 < 0) {
                                    i14 = i5 + 6;
                                    if (bArr[i12] < 0) {
                                        i12 = i5 + 7;
                                        if (bArr[i14] < 0) {
                                            i14 = i5 + 8;
                                            if (bArr[i12] < 0) {
                                                i12 = i5 + 9;
                                                if (bArr[i14] < 0) {
                                                    int i17 = i5 + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i10 = i17;
                                                        i4 = i16;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i4 = i16;
                                }
                                i4 = i16;
                            }
                            i10 = i14;
                        }
                        i10 = i12;
                    }
                    this.f29083m = i10;
                    return i4;
                }
            }
            return (int) R();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long Q() throws IOException {
            long j4;
            long j5;
            long j6;
            int i4 = this.f29083m;
            int i5 = this.f29081k;
            if (i5 != i4) {
                byte[] bArr = this.f29079i;
                int i6 = i4 + 1;
                byte b5 = bArr[i4];
                if (b5 >= 0) {
                    this.f29083m = i6;
                    return b5;
                }
                if (i5 - i6 >= 9) {
                    int i7 = i4 + 2;
                    int i10 = (bArr[i6] << 7) ^ b5;
                    if (i10 < 0) {
                        j4 = i10 ^ (-128);
                    } else {
                        int i11 = i4 + 3;
                        int i12 = (bArr[i7] << 14) ^ i10;
                        if (i12 >= 0) {
                            j4 = i12 ^ 16256;
                            i7 = i11;
                        } else {
                            int i13 = i4 + 4;
                            int i14 = i12 ^ (bArr[i11] << com.google.common.base.c.f54879y);
                            if (i14 < 0) {
                                long j7 = (-2080896) ^ i14;
                                i7 = i13;
                                j4 = j7;
                            } else {
                                long j10 = i14;
                                i7 = i4 + 5;
                                long j11 = j10 ^ (bArr[i13] << 28);
                                if (j11 >= 0) {
                                    j6 = 266354560;
                                } else {
                                    int i15 = i4 + 6;
                                    long j12 = j11 ^ (bArr[i7] << 35);
                                    if (j12 < 0) {
                                        j5 = -34093383808L;
                                    } else {
                                        i7 = i4 + 7;
                                        j11 = j12 ^ (bArr[i15] << 42);
                                        if (j11 >= 0) {
                                            j6 = 4363953127296L;
                                        } else {
                                            i15 = i4 + 8;
                                            j12 = j11 ^ (bArr[i7] << 49);
                                            if (j12 < 0) {
                                                j5 = -558586000294016L;
                                            } else {
                                                i7 = i4 + 9;
                                                long j13 = (j12 ^ (bArr[i15] << 56)) ^ 71499008037633920L;
                                                if (j13 < 0) {
                                                    int i16 = i4 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i7 = i16;
                                                    }
                                                }
                                                j4 = j13;
                                            }
                                        }
                                    }
                                    j4 = j12 ^ j5;
                                    i7 = i15;
                                }
                                j4 = j11 ^ j6;
                            }
                        }
                    }
                    this.f29083m = i7;
                    return j4;
                }
            }
            return R();
        }

        @Override // androidx.content.preferences.protobuf.z
        long R() throws IOException {
            long j4 = 0;
            for (int i4 = 0; i4 < 64; i4 += 7) {
                j4 |= (r3 & Byte.MAX_VALUE) << i4;
                if ((J() & 128) == 0) {
                    return j4;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int S() throws IOException {
            return L();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long T() throws IOException {
            return M();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int U() throws IOException {
            return z.b(N());
        }

        @Override // androidx.content.preferences.protobuf.z
        public long V() throws IOException {
            return z.c(Q());
        }

        @Override // androidx.content.preferences.protobuf.z
        public String W() throws IOException {
            int N = N();
            if (N > 0) {
                int i4 = this.f29081k;
                int i5 = this.f29083m;
                if (N <= i4 - i5) {
                    String str = new String(this.f29079i, i5, N, p1.f28847a);
                    this.f29083m += N;
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

        @Override // androidx.content.preferences.protobuf.z
        public String X() throws IOException {
            int N = N();
            if (N > 0) {
                int i4 = this.f29081k;
                int i5 = this.f29083m;
                if (N <= i4 - i5) {
                    String h4 = q4.h(this.f29079i, i5, N);
                    this.f29083m += N;
                    return h4;
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

        @Override // androidx.content.preferences.protobuf.z
        public int Y() throws IOException {
            if (i()) {
                this.f29085o = 0;
                return 0;
            }
            int N = N();
            this.f29085o = N;
            if (t4.a(N) != 0) {
                return this.f29085o;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int Z() throws IOException {
            return N();
        }

        @Override // androidx.content.preferences.protobuf.z
        public void a(int i4) throws InvalidProtocolBufferException {
            if (this.f29085o != i4) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.content.preferences.protobuf.z
        public long a0() throws IOException {
            return Q();
        }

        @Override // androidx.content.preferences.protobuf.z
        @Deprecated
        public void b0(int i4, i2.a aVar) throws IOException {
            E(i4, aVar, s0.d());
        }

        @Override // androidx.content.preferences.protobuf.z
        public void c0() {
            this.f29084n = this.f29083m;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void e(boolean z4) {
            this.f29086p = z4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int f() {
            int i4 = this.f29087q;
            if (i4 == Integer.MAX_VALUE) {
                return -1;
            }
            return i4 - h();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int g() {
            return this.f29085o;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean g0(int i4) throws IOException {
            int b5 = t4.b(i4);
            if (b5 == 0) {
                n0();
                return true;
            }
            if (b5 == 1) {
                k0(8);
                return true;
            }
            if (b5 == 2) {
                k0(N());
                return true;
            }
            if (b5 == 3) {
                i0();
                a(((i4 >>> 3) << 3) | 4);
                return true;
            }
            if (b5 == 4) {
                return false;
            }
            if (b5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            k0(4);
            return true;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int h() {
            return this.f29083m - this.f29084n;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean h0(int i4, CodedOutputStream codedOutputStream) throws IOException {
            int b5 = t4.b(i4);
            if (b5 == 0) {
                long Q = Q();
                codedOutputStream.h2(i4);
                codedOutputStream.i2(Q);
                return true;
            }
            if (b5 == 1) {
                long M = M();
                codedOutputStream.h2(i4);
                codedOutputStream.D1(M);
                return true;
            }
            if (b5 == 2) {
                w x4 = x();
                codedOutputStream.h2(i4);
                codedOutputStream.z1(x4);
                return true;
            }
            if (b5 == 3) {
                codedOutputStream.h2(i4);
                j0(codedOutputStream);
                int i5 = ((i4 >>> 3) << 3) | 4;
                a(i5);
                codedOutputStream.h2(i5);
                return true;
            }
            if (b5 == 4) {
                return false;
            }
            if (b5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            int L = L();
            codedOutputStream.h2(i4);
            codedOutputStream.C1(L);
            return true;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean i() throws IOException {
            return this.f29083m == this.f29081k;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void i0() throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (g0(Y));
        }

        @Override // androidx.content.preferences.protobuf.z
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (h0(Y, codedOutputStream));
        }

        @Override // androidx.content.preferences.protobuf.z
        public void k0(int i4) throws IOException {
            if (i4 >= 0) {
                int i5 = this.f29081k;
                int i6 = this.f29083m;
                if (i4 <= i5 - i6) {
                    this.f29083m = i6 + i4;
                    return;
                }
            }
            if (i4 >= 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.content.preferences.protobuf.z
        public void s(int i4) {
            this.f29087q = i4;
            m0();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int t(int i4) throws InvalidProtocolBufferException {
            if (i4 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int h4 = i4 + h();
            int i5 = this.f29087q;
            if (h4 > i5) {
                throw InvalidProtocolBufferException.l();
            }
            this.f29087q = h4;
            m0();
            return i5;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // androidx.content.preferences.protobuf.z
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // androidx.content.preferences.protobuf.z
        public ByteBuffer w() throws IOException {
            int N = N();
            if (N > 0) {
                int i4 = this.f29081k;
                int i5 = this.f29083m;
                if (N <= i4 - i5) {
                    ByteBuffer wrap = (this.f29080j || !this.f29086p) ? ByteBuffer.wrap(Arrays.copyOfRange(this.f29079i, i5, i5 + N)) : ByteBuffer.wrap(this.f29079i, i5, N).slice();
                    this.f29083m += N;
                    return wrap;
                }
            }
            if (N == 0) {
                return p1.f28851e;
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.content.preferences.protobuf.z
        public w x() throws IOException {
            int N = N();
            if (N > 0) {
                int i4 = this.f29081k;
                int i5 = this.f29083m;
                if (N <= i4 - i5) {
                    w s02 = (this.f29080j && this.f29086p) ? w.s0(this.f29079i, i5, N) : w.x(this.f29079i, i5, N);
                    this.f29083m += N;
                    return s02;
                }
            }
            return N == 0 ? w.f28998f : w.r0(K(N));
        }

        @Override // androidx.content.preferences.protobuf.z
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.content.preferences.protobuf.z
        public int z() throws IOException {
            return N();
        }

        private b(byte[] bArr, int i4, int i5, boolean z4) {
            super();
            this.f29087q = Integer.MAX_VALUE;
            this.f29079i = bArr;
            this.f29081k = i5 + i4;
            this.f29083m = i4;
            this.f29084n = i4;
            this.f29080j = z4;
        }
    }

    /* compiled from: CodedInputStream.java */
    private static final class c extends z {

        /* renamed from: i, reason: collision with root package name */
        private Iterable<ByteBuffer> f29088i;

        /* renamed from: j, reason: collision with root package name */
        private Iterator<ByteBuffer> f29089j;

        /* renamed from: k, reason: collision with root package name */
        private ByteBuffer f29090k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f29091l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f29092m;

        /* renamed from: n, reason: collision with root package name */
        private int f29093n;

        /* renamed from: o, reason: collision with root package name */
        private int f29094o;

        /* renamed from: p, reason: collision with root package name */
        private int f29095p;

        /* renamed from: q, reason: collision with root package name */
        private int f29096q;

        /* renamed from: r, reason: collision with root package name */
        private int f29097r;

        /* renamed from: s, reason: collision with root package name */
        private int f29098s;

        /* renamed from: t, reason: collision with root package name */
        private long f29099t;

        /* renamed from: u, reason: collision with root package name */
        private long f29100u;

        /* renamed from: v, reason: collision with root package name */
        private long f29101v;

        /* renamed from: w, reason: collision with root package name */
        private long f29102w;

        private long m0() {
            return this.f29102w - this.f29099t;
        }

        private void n0() throws InvalidProtocolBufferException {
            if (!this.f29089j.hasNext()) {
                throw InvalidProtocolBufferException.l();
            }
            t0();
        }

        private void o0(byte[] bArr, int i4, int i5) throws IOException {
            if (i5 < 0 || i5 > q0()) {
                if (i5 > 0) {
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 != 0) {
                    throw InvalidProtocolBufferException.g();
                }
                return;
            }
            int i6 = i5;
            while (i6 > 0) {
                if (m0() == 0) {
                    n0();
                }
                int min = Math.min(i6, (int) m0());
                long j4 = min;
                p4.n(this.f29099t, bArr, (i5 - i6) + i4, j4);
                i6 -= min;
                this.f29099t += j4;
            }
        }

        private void p0() {
            int i4 = this.f29093n + this.f29094o;
            this.f29093n = i4;
            int i5 = i4 - this.f29098s;
            int i6 = this.f29095p;
            if (i5 <= i6) {
                this.f29094o = 0;
                return;
            }
            int i7 = i5 - i6;
            this.f29094o = i7;
            this.f29093n = i4 - i7;
        }

        private int q0() {
            return (int) (((this.f29093n - this.f29097r) - this.f29099t) + this.f29100u);
        }

        private void r0() throws IOException {
            for (int i4 = 0; i4 < 10; i4++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private ByteBuffer s0(int i4, int i5) throws IOException {
            int position = this.f29090k.position();
            int limit = this.f29090k.limit();
            try {
                try {
                    this.f29090k.position(i4);
                    this.f29090k.limit(i5);
                    return this.f29090k.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.l();
                }
            } finally {
                this.f29090k.position(position);
                this.f29090k.limit(limit);
            }
        }

        private void t0() {
            ByteBuffer next = this.f29089j.next();
            this.f29090k = next;
            this.f29097r += (int) (this.f29099t - this.f29100u);
            long position = next.position();
            this.f29099t = position;
            this.f29100u = position;
            this.f29102w = this.f29090k.limit();
            long i4 = p4.i(this.f29090k);
            this.f29101v = i4;
            this.f29099t += i4;
            this.f29100u += i4;
            this.f29102w += i4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int A() throws IOException {
            return L();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long B() throws IOException {
            return M();
        }

        @Override // androidx.content.preferences.protobuf.z
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.content.preferences.protobuf.z
        public <T extends i2> T D(int i4, c3<T> c3Var, s0 s0Var) throws IOException {
            int i5 = this.f29074a;
            if (i5 >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f29074a = i5 + 1;
            T z4 = c3Var.z(this, s0Var);
            a(t4.c(i4, 4));
            this.f29074a--;
            return z4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void E(int i4, i2.a aVar, s0 s0Var) throws IOException {
            int i5 = this.f29074a;
            if (i5 >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f29074a = i5 + 1;
            aVar.n1(this, s0Var);
            a(t4.c(i4, 4));
            this.f29074a--;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int F() throws IOException {
            return N();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long G() throws IOException {
            return Q();
        }

        @Override // androidx.content.preferences.protobuf.z
        public <T extends i2> T H(c3<T> c3Var, s0 s0Var) throws IOException {
            int N = N();
            if (this.f29074a >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            int t4 = t(N);
            this.f29074a++;
            T z4 = c3Var.z(this, s0Var);
            a(0);
            this.f29074a--;
            s(t4);
            return z4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void I(i2.a aVar, s0 s0Var) throws IOException {
            int N = N();
            if (this.f29074a >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            int t4 = t(N);
            this.f29074a++;
            aVar.n1(this, s0Var);
            a(0);
            this.f29074a--;
            s(t4);
        }

        @Override // androidx.content.preferences.protobuf.z
        public byte J() throws IOException {
            if (m0() == 0) {
                n0();
            }
            long j4 = this.f29099t;
            this.f29099t = 1 + j4;
            return p4.y(j4);
        }

        @Override // androidx.content.preferences.protobuf.z
        public byte[] K(int i4) throws IOException {
            if (i4 >= 0) {
                long j4 = i4;
                if (j4 <= m0()) {
                    byte[] bArr = new byte[i4];
                    p4.n(this.f29099t, bArr, 0L, j4);
                    this.f29099t += j4;
                    return bArr;
                }
            }
            if (i4 >= 0 && i4 <= q0()) {
                byte[] bArr2 = new byte[i4];
                o0(bArr2, 0, i4);
                return bArr2;
            }
            if (i4 > 0) {
                throw InvalidProtocolBufferException.l();
            }
            if (i4 == 0) {
                return p1.f28850d;
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int L() throws IOException {
            if (m0() < 4) {
                return (J() & 255) | ((J() & 255) << 8) | ((J() & 255) << 16) | ((J() & 255) << 24);
            }
            long j4 = this.f29099t;
            this.f29099t = 4 + j4;
            return ((p4.y(j4 + 3) & 255) << 24) | (p4.y(j4) & 255) | ((p4.y(1 + j4) & 255) << 8) | ((p4.y(2 + j4) & 255) << 16);
        }

        @Override // androidx.content.preferences.protobuf.z
        public long M() throws IOException {
            long J;
            byte J2;
            if (m0() >= 8) {
                long j4 = this.f29099t;
                this.f29099t = 8 + j4;
                J = (p4.y(j4) & 255) | ((p4.y(1 + j4) & 255) << 8) | ((p4.y(2 + j4) & 255) << 16) | ((p4.y(3 + j4) & 255) << 24) | ((p4.y(4 + j4) & 255) << 32) | ((p4.y(5 + j4) & 255) << 40) | ((p4.y(6 + j4) & 255) << 48);
                J2 = p4.y(j4 + 7);
            } else {
                J = (J() & 255) | ((J() & 255) << 8) | ((J() & 255) << 16) | ((J() & 255) << 24) | ((J() & 255) << 32) | ((J() & 255) << 40) | ((J() & 255) << 48);
                J2 = J();
            }
            return ((J2 & 255) << 56) | J;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int N() throws IOException {
            int i4;
            long j4 = this.f29099t;
            if (this.f29102w != j4) {
                long j5 = j4 + 1;
                byte y4 = p4.y(j4);
                if (y4 >= 0) {
                    this.f29099t++;
                    return y4;
                }
                if (this.f29102w - this.f29099t >= 10) {
                    long j6 = 2 + j4;
                    int y5 = (p4.y(j5) << 7) ^ y4;
                    if (y5 < 0) {
                        i4 = y5 ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int y6 = (p4.y(j6) << 14) ^ y5;
                        if (y6 >= 0) {
                            i4 = y6 ^ 16256;
                        } else {
                            long j10 = 4 + j4;
                            int y7 = y6 ^ (p4.y(j7) << com.google.common.base.c.f54879y);
                            if (y7 < 0) {
                                i4 = (-2080896) ^ y7;
                            } else {
                                j7 = 5 + j4;
                                byte y10 = p4.y(j10);
                                int i5 = (y7 ^ (y10 << com.google.common.base.c.F)) ^ 266354560;
                                if (y10 < 0) {
                                    j10 = 6 + j4;
                                    if (p4.y(j7) < 0) {
                                        j7 = 7 + j4;
                                        if (p4.y(j10) < 0) {
                                            j10 = 8 + j4;
                                            if (p4.y(j7) < 0) {
                                                j7 = 9 + j4;
                                                if (p4.y(j10) < 0) {
                                                    long j11 = j4 + 10;
                                                    if (p4.y(j7) >= 0) {
                                                        i4 = i5;
                                                        j6 = j11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i4 = i5;
                                }
                                i4 = i5;
                            }
                            j6 = j10;
                        }
                        j6 = j7;
                    }
                    this.f29099t = j6;
                    return i4;
                }
            }
            return (int) R();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long Q() throws IOException {
            long j4;
            long j5;
            long j6;
            long j7 = this.f29099t;
            if (this.f29102w != j7) {
                long j10 = j7 + 1;
                byte y4 = p4.y(j7);
                if (y4 >= 0) {
                    this.f29099t++;
                    return y4;
                }
                if (this.f29102w - this.f29099t >= 10) {
                    long j11 = 2 + j7;
                    int y5 = (p4.y(j10) << 7) ^ y4;
                    if (y5 < 0) {
                        j4 = y5 ^ (-128);
                    } else {
                        long j12 = 3 + j7;
                        int y6 = (p4.y(j11) << 14) ^ y5;
                        if (y6 >= 0) {
                            j4 = y6 ^ 16256;
                            j11 = j12;
                        } else {
                            long j13 = 4 + j7;
                            int y7 = y6 ^ (p4.y(j12) << com.google.common.base.c.f54879y);
                            if (y7 < 0) {
                                j4 = (-2080896) ^ y7;
                                j11 = j13;
                            } else {
                                long j14 = 5 + j7;
                                long y10 = (p4.y(j13) << 28) ^ y7;
                                if (y10 >= 0) {
                                    j6 = 266354560;
                                } else {
                                    long j15 = 6 + j7;
                                    long y11 = y10 ^ (p4.y(j14) << 35);
                                    if (y11 < 0) {
                                        j5 = -34093383808L;
                                    } else {
                                        j14 = 7 + j7;
                                        y10 = y11 ^ (p4.y(j15) << 42);
                                        if (y10 >= 0) {
                                            j6 = 4363953127296L;
                                        } else {
                                            j15 = 8 + j7;
                                            y11 = y10 ^ (p4.y(j14) << 49);
                                            if (y11 < 0) {
                                                j5 = -558586000294016L;
                                            } else {
                                                j14 = 9 + j7;
                                                long y12 = (y11 ^ (p4.y(j15) << 56)) ^ 71499008037633920L;
                                                if (y12 < 0) {
                                                    long j16 = j7 + 10;
                                                    if (p4.y(j14) >= 0) {
                                                        j4 = y12;
                                                        j11 = j16;
                                                    }
                                                } else {
                                                    j4 = y12;
                                                    j11 = j14;
                                                }
                                            }
                                        }
                                    }
                                    j4 = j5 ^ y11;
                                    j11 = j15;
                                }
                                j4 = j6 ^ y10;
                                j11 = j14;
                            }
                        }
                    }
                    this.f29099t = j11;
                    return j4;
                }
            }
            return R();
        }

        @Override // androidx.content.preferences.protobuf.z
        long R() throws IOException {
            long j4 = 0;
            for (int i4 = 0; i4 < 64; i4 += 7) {
                j4 |= (r3 & Byte.MAX_VALUE) << i4;
                if ((J() & 128) == 0) {
                    return j4;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int S() throws IOException {
            return L();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long T() throws IOException {
            return M();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int U() throws IOException {
            return z.b(N());
        }

        @Override // androidx.content.preferences.protobuf.z
        public long V() throws IOException {
            return z.c(Q());
        }

        @Override // androidx.content.preferences.protobuf.z
        public String W() throws IOException {
            int N = N();
            if (N > 0) {
                long j4 = N;
                long j5 = this.f29102w;
                long j6 = this.f29099t;
                if (j4 <= j5 - j6) {
                    byte[] bArr = new byte[N];
                    p4.n(j6, bArr, 0L, j4);
                    String str = new String(bArr, p1.f28847a);
                    this.f29099t += j4;
                    return str;
                }
            }
            if (N > 0 && N <= q0()) {
                byte[] bArr2 = new byte[N];
                o0(bArr2, 0, N);
                return new String(bArr2, p1.f28847a);
            }
            if (N == 0) {
                return "";
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.content.preferences.protobuf.z
        public String X() throws IOException {
            int N = N();
            if (N > 0) {
                long j4 = N;
                long j5 = this.f29102w;
                long j6 = this.f29099t;
                if (j4 <= j5 - j6) {
                    String g4 = q4.g(this.f29090k, (int) (j6 - this.f29100u), N);
                    this.f29099t += j4;
                    return g4;
                }
            }
            if (N >= 0 && N <= q0()) {
                byte[] bArr = new byte[N];
                o0(bArr, 0, N);
                return q4.h(bArr, 0, N);
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int Y() throws IOException {
            if (i()) {
                this.f29096q = 0;
                return 0;
            }
            int N = N();
            this.f29096q = N;
            if (t4.a(N) != 0) {
                return this.f29096q;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int Z() throws IOException {
            return N();
        }

        @Override // androidx.content.preferences.protobuf.z
        public void a(int i4) throws InvalidProtocolBufferException {
            if (this.f29096q != i4) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.content.preferences.protobuf.z
        public long a0() throws IOException {
            return Q();
        }

        @Override // androidx.content.preferences.protobuf.z
        @Deprecated
        public void b0(int i4, i2.a aVar) throws IOException {
            E(i4, aVar, s0.d());
        }

        @Override // androidx.content.preferences.protobuf.z
        public void c0() {
            this.f29098s = (int) ((this.f29097r + this.f29099t) - this.f29100u);
        }

        @Override // androidx.content.preferences.protobuf.z
        public void e(boolean z4) {
            this.f29092m = z4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int f() {
            int i4 = this.f29095p;
            if (i4 == Integer.MAX_VALUE) {
                return -1;
            }
            return i4 - h();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int g() {
            return this.f29096q;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean g0(int i4) throws IOException {
            int b5 = t4.b(i4);
            if (b5 == 0) {
                r0();
                return true;
            }
            if (b5 == 1) {
                k0(8);
                return true;
            }
            if (b5 == 2) {
                k0(N());
                return true;
            }
            if (b5 == 3) {
                i0();
                a(((i4 >>> 3) << 3) | 4);
                return true;
            }
            if (b5 == 4) {
                return false;
            }
            if (b5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            k0(4);
            return true;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int h() {
            return (int) (((this.f29097r - this.f29098s) + this.f29099t) - this.f29100u);
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean h0(int i4, CodedOutputStream codedOutputStream) throws IOException {
            int b5 = t4.b(i4);
            if (b5 == 0) {
                long Q = Q();
                codedOutputStream.h2(i4);
                codedOutputStream.i2(Q);
                return true;
            }
            if (b5 == 1) {
                long M = M();
                codedOutputStream.h2(i4);
                codedOutputStream.D1(M);
                return true;
            }
            if (b5 == 2) {
                w x4 = x();
                codedOutputStream.h2(i4);
                codedOutputStream.z1(x4);
                return true;
            }
            if (b5 == 3) {
                codedOutputStream.h2(i4);
                j0(codedOutputStream);
                int i5 = ((i4 >>> 3) << 3) | 4;
                a(i5);
                codedOutputStream.h2(i5);
                return true;
            }
            if (b5 == 4) {
                return false;
            }
            if (b5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            int L = L();
            codedOutputStream.h2(i4);
            codedOutputStream.C1(L);
            return true;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean i() throws IOException {
            return (((long) this.f29097r) + this.f29099t) - this.f29100u == ((long) this.f29093n);
        }

        @Override // androidx.content.preferences.protobuf.z
        public void i0() throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (g0(Y));
        }

        @Override // androidx.content.preferences.protobuf.z
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (h0(Y, codedOutputStream));
        }

        @Override // androidx.content.preferences.protobuf.z
        public void k0(int i4) throws IOException {
            if (i4 < 0 || i4 > ((this.f29093n - this.f29097r) - this.f29099t) + this.f29100u) {
                if (i4 >= 0) {
                    throw InvalidProtocolBufferException.l();
                }
                throw InvalidProtocolBufferException.g();
            }
            while (i4 > 0) {
                if (m0() == 0) {
                    n0();
                }
                int min = Math.min(i4, (int) m0());
                i4 -= min;
                this.f29099t += min;
            }
        }

        @Override // androidx.content.preferences.protobuf.z
        public void s(int i4) {
            this.f29095p = i4;
            p0();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int t(int i4) throws InvalidProtocolBufferException {
            if (i4 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int h4 = i4 + h();
            int i5 = this.f29095p;
            if (h4 > i5) {
                throw InvalidProtocolBufferException.l();
            }
            this.f29095p = h4;
            p0();
            return i5;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // androidx.content.preferences.protobuf.z
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // androidx.content.preferences.protobuf.z
        public ByteBuffer w() throws IOException {
            int N = N();
            if (N > 0) {
                long j4 = N;
                if (j4 <= m0()) {
                    if (this.f29091l || !this.f29092m) {
                        byte[] bArr = new byte[N];
                        p4.n(this.f29099t, bArr, 0L, j4);
                        this.f29099t += j4;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j5 = this.f29099t + j4;
                    this.f29099t = j5;
                    long j6 = this.f29101v;
                    return s0((int) ((j5 - j6) - j4), (int) (j5 - j6));
                }
            }
            if (N > 0 && N <= q0()) {
                byte[] bArr2 = new byte[N];
                o0(bArr2, 0, N);
                return ByteBuffer.wrap(bArr2);
            }
            if (N == 0) {
                return p1.f28851e;
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.content.preferences.protobuf.z
        public w x() throws IOException {
            int N = N();
            if (N > 0) {
                long j4 = N;
                long j5 = this.f29102w;
                long j6 = this.f29099t;
                if (j4 <= j5 - j6) {
                    if (this.f29091l && this.f29092m) {
                        int i4 = (int) (j6 - this.f29101v);
                        w q02 = w.q0(s0(i4, N + i4));
                        this.f29099t += j4;
                        return q02;
                    }
                    byte[] bArr = new byte[N];
                    p4.n(j6, bArr, 0L, j4);
                    this.f29099t += j4;
                    return w.r0(bArr);
                }
            }
            if (N > 0 && N <= q0()) {
                byte[] bArr2 = new byte[N];
                o0(bArr2, 0, N);
                return w.r0(bArr2);
            }
            if (N == 0) {
                return w.f28998f;
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.content.preferences.protobuf.z
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.content.preferences.protobuf.z
        public int z() throws IOException {
            return N();
        }

        private c(Iterable<ByteBuffer> iterable, int i4, boolean z4) {
            super();
            this.f29095p = Integer.MAX_VALUE;
            this.f29093n = i4;
            this.f29088i = iterable;
            this.f29089j = iterable.iterator();
            this.f29091l = z4;
            this.f29097r = 0;
            this.f29098s = 0;
            if (i4 != 0) {
                t0();
                return;
            }
            this.f29090k = p1.f28851e;
            this.f29099t = 0L;
            this.f29100u = 0L;
            this.f29102w = 0L;
            this.f29101v = 0L;
        }
    }

    /* compiled from: CodedInputStream.java */
    private static final class d extends z {

        /* renamed from: i, reason: collision with root package name */
        private final InputStream f29103i;

        /* renamed from: j, reason: collision with root package name */
        private final byte[] f29104j;

        /* renamed from: k, reason: collision with root package name */
        private int f29105k;

        /* renamed from: l, reason: collision with root package name */
        private int f29106l;

        /* renamed from: m, reason: collision with root package name */
        private int f29107m;

        /* renamed from: n, reason: collision with root package name */
        private int f29108n;

        /* renamed from: o, reason: collision with root package name */
        private int f29109o;

        /* renamed from: p, reason: collision with root package name */
        private int f29110p;

        /* renamed from: q, reason: collision with root package name */
        private a f29111q;

        /* compiled from: CodedInputStream.java */
        private interface a {
            void a();
        }

        /* compiled from: CodedInputStream.java */
        private class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private int f29112a;

            /* renamed from: b, reason: collision with root package name */
            private ByteArrayOutputStream f29113b;

            private b() {
                this.f29112a = d.this.f29107m;
            }

            @Override // androidx.datastore.preferences.protobuf.z.d.a
            public void a() {
                if (this.f29113b == null) {
                    this.f29113b = new ByteArrayOutputStream();
                }
                this.f29113b.write(d.this.f29104j, this.f29112a, d.this.f29107m - this.f29112a);
                this.f29112a = 0;
            }

            ByteBuffer b() {
                ByteArrayOutputStream byteArrayOutputStream = this.f29113b;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(d.this.f29104j, this.f29112a, d.this.f29107m - this.f29112a);
                }
                byteArrayOutputStream.write(d.this.f29104j, this.f29112a, d.this.f29107m);
                return ByteBuffer.wrap(this.f29113b.toByteArray());
            }
        }

        private w o0(int i4) throws IOException {
            byte[] q02 = q0(i4);
            if (q02 != null) {
                return w.w(q02);
            }
            int i5 = this.f29107m;
            int i6 = this.f29105k;
            int i7 = i6 - i5;
            this.f29109o += i6;
            this.f29107m = 0;
            this.f29105k = 0;
            List<byte[]> r02 = r0(i4 - i7);
            byte[] bArr = new byte[i4];
            System.arraycopy(this.f29104j, i5, bArr, 0, i7);
            for (byte[] bArr2 : r02) {
                System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
                i7 += bArr2.length;
            }
            return w.r0(bArr);
        }

        private byte[] p0(int i4, boolean z4) throws IOException {
            byte[] q02 = q0(i4);
            if (q02 != null) {
                return z4 ? (byte[]) q02.clone() : q02;
            }
            int i5 = this.f29107m;
            int i6 = this.f29105k;
            int i7 = i6 - i5;
            this.f29109o += i6;
            this.f29107m = 0;
            this.f29105k = 0;
            List<byte[]> r02 = r0(i4 - i7);
            byte[] bArr = new byte[i4];
            System.arraycopy(this.f29104j, i5, bArr, 0, i7);
            for (byte[] bArr2 : r02) {
                System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
                i7 += bArr2.length;
            }
            return bArr;
        }

        private byte[] q0(int i4) throws IOException {
            if (i4 == 0) {
                return p1.f28850d;
            }
            if (i4 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i5 = this.f29109o;
            int i6 = this.f29107m;
            int i7 = i5 + i6 + i4;
            if (i7 - this.f29076c > 0) {
                throw InvalidProtocolBufferException.k();
            }
            int i10 = this.f29110p;
            if (i7 > i10) {
                k0((i10 - i5) - i6);
                throw InvalidProtocolBufferException.l();
            }
            int i11 = this.f29105k - i6;
            int i12 = i4 - i11;
            if (i12 >= 4096 && i12 > this.f29103i.available()) {
                return null;
            }
            byte[] bArr = new byte[i4];
            System.arraycopy(this.f29104j, this.f29107m, bArr, 0, i11);
            this.f29109o += this.f29105k;
            this.f29107m = 0;
            this.f29105k = 0;
            while (i11 < i4) {
                int read = this.f29103i.read(bArr, i11, i4 - i11);
                if (read == -1) {
                    throw InvalidProtocolBufferException.l();
                }
                this.f29109o += read;
                i11 += read;
            }
            return bArr;
        }

        private List<byte[]> r0(int i4) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i4 > 0) {
                int min = Math.min(i4, 4096);
                byte[] bArr = new byte[min];
                int i5 = 0;
                while (i5 < min) {
                    int read = this.f29103i.read(bArr, i5, min - i5);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.l();
                    }
                    this.f29109o += read;
                    i5 += read;
                }
                i4 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void s0() {
            int i4 = this.f29105k + this.f29106l;
            this.f29105k = i4;
            int i5 = this.f29109o + i4;
            int i6 = this.f29110p;
            if (i5 <= i6) {
                this.f29106l = 0;
                return;
            }
            int i7 = i5 - i6;
            this.f29106l = i7;
            this.f29105k = i4 - i7;
        }

        private void t0(int i4) throws IOException {
            if (y0(i4)) {
                return;
            }
            if (i4 <= (this.f29076c - this.f29109o) - this.f29107m) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.k();
        }

        private void u0(int i4) throws IOException {
            if (i4 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i5 = this.f29109o;
            int i6 = this.f29107m;
            int i7 = i5 + i6 + i4;
            int i10 = this.f29110p;
            if (i7 > i10) {
                k0((i10 - i5) - i6);
                throw InvalidProtocolBufferException.l();
            }
            int i11 = 0;
            if (this.f29111q == null) {
                this.f29109o = i5 + i6;
                int i12 = this.f29105k - i6;
                this.f29105k = 0;
                this.f29107m = 0;
                i11 = i12;
                while (i11 < i4) {
                    try {
                        long j4 = i4 - i11;
                        long skip = this.f29103i.skip(j4);
                        if (skip < 0 || skip > j4) {
                            throw new IllegalStateException(this.f29103i.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                        if (skip == 0) {
                            break;
                        } else {
                            i11 += (int) skip;
                        }
                    } finally {
                        this.f29109o += i11;
                        s0();
                    }
                }
            }
            if (i11 >= i4) {
                return;
            }
            int i13 = this.f29105k;
            int i14 = i13 - this.f29107m;
            this.f29107m = i13;
            t0(1);
            while (true) {
                int i15 = i4 - i14;
                int i16 = this.f29105k;
                if (i15 <= i16) {
                    this.f29107m = i15;
                    return;
                } else {
                    i14 += i16;
                    this.f29107m = i16;
                    t0(1);
                }
            }
        }

        private void v0() throws IOException {
            if (this.f29105k - this.f29107m >= 10) {
                w0();
            } else {
                x0();
            }
        }

        private void w0() throws IOException {
            for (int i4 = 0; i4 < 10; i4++) {
                byte[] bArr = this.f29104j;
                int i5 = this.f29107m;
                this.f29107m = i5 + 1;
                if (bArr[i5] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void x0() throws IOException {
            for (int i4 = 0; i4 < 10; i4++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private boolean y0(int i4) throws IOException {
            int i5 = this.f29107m;
            if (i5 + i4 <= this.f29105k) {
                throw new IllegalStateException(r2.a("refillBuffer() called when ", i4, " bytes were already available in buffer"));
            }
            int i6 = this.f29076c;
            int i7 = this.f29109o;
            if (i4 > (i6 - i7) - i5 || i7 + i5 + i4 > this.f29110p) {
                return false;
            }
            a aVar = this.f29111q;
            if (aVar != null) {
                aVar.a();
            }
            int i10 = this.f29107m;
            if (i10 > 0) {
                int i11 = this.f29105k;
                if (i11 > i10) {
                    byte[] bArr = this.f29104j;
                    System.arraycopy(bArr, i10, bArr, 0, i11 - i10);
                }
                this.f29109o += i10;
                this.f29105k -= i10;
                this.f29107m = 0;
            }
            InputStream inputStream = this.f29103i;
            byte[] bArr2 = this.f29104j;
            int i12 = this.f29105k;
            int read = inputStream.read(bArr2, i12, Math.min(bArr2.length - i12, (this.f29076c - this.f29109o) - i12));
            if (read == 0 || read < -1 || read > this.f29104j.length) {
                throw new IllegalStateException(this.f29103i.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f29105k += read;
            s0();
            if (this.f29105k >= i4) {
                return true;
            }
            return y0(i4);
        }

        @Override // androidx.content.preferences.protobuf.z
        public int A() throws IOException {
            return L();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long B() throws IOException {
            return M();
        }

        @Override // androidx.content.preferences.protobuf.z
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.content.preferences.protobuf.z
        public <T extends i2> T D(int i4, c3<T> c3Var, s0 s0Var) throws IOException {
            int i5 = this.f29074a;
            if (i5 >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f29074a = i5 + 1;
            T z4 = c3Var.z(this, s0Var);
            a(t4.c(i4, 4));
            this.f29074a--;
            return z4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void E(int i4, i2.a aVar, s0 s0Var) throws IOException {
            int i5 = this.f29074a;
            if (i5 >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f29074a = i5 + 1;
            aVar.n1(this, s0Var);
            a(t4.c(i4, 4));
            this.f29074a--;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int F() throws IOException {
            return N();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long G() throws IOException {
            return Q();
        }

        @Override // androidx.content.preferences.protobuf.z
        public <T extends i2> T H(c3<T> c3Var, s0 s0Var) throws IOException {
            int N = N();
            if (this.f29074a >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            int t4 = t(N);
            this.f29074a++;
            T z4 = c3Var.z(this, s0Var);
            a(0);
            this.f29074a--;
            s(t4);
            return z4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void I(i2.a aVar, s0 s0Var) throws IOException {
            int N = N();
            if (this.f29074a >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            int t4 = t(N);
            this.f29074a++;
            aVar.n1(this, s0Var);
            a(0);
            this.f29074a--;
            s(t4);
        }

        @Override // androidx.content.preferences.protobuf.z
        public byte J() throws IOException {
            if (this.f29107m == this.f29105k) {
                t0(1);
            }
            byte[] bArr = this.f29104j;
            int i4 = this.f29107m;
            this.f29107m = i4 + 1;
            return bArr[i4];
        }

        @Override // androidx.content.preferences.protobuf.z
        public byte[] K(int i4) throws IOException {
            int i5 = this.f29107m;
            if (i4 > this.f29105k - i5 || i4 <= 0) {
                return p0(i4, false);
            }
            int i6 = i4 + i5;
            this.f29107m = i6;
            return Arrays.copyOfRange(this.f29104j, i5, i6);
        }

        @Override // androidx.content.preferences.protobuf.z
        public int L() throws IOException {
            int i4 = this.f29107m;
            if (this.f29105k - i4 < 4) {
                t0(4);
                i4 = this.f29107m;
            }
            byte[] bArr = this.f29104j;
            this.f29107m = i4 + 4;
            return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
        }

        @Override // androidx.content.preferences.protobuf.z
        public long M() throws IOException {
            int i4 = this.f29107m;
            if (this.f29105k - i4 < 8) {
                t0(8);
                i4 = this.f29107m;
            }
            byte[] bArr = this.f29104j;
            this.f29107m = i4 + 8;
            return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
        }

        @Override // androidx.content.preferences.protobuf.z
        public int N() throws IOException {
            int i4;
            int i5 = this.f29107m;
            int i6 = this.f29105k;
            if (i6 != i5) {
                byte[] bArr = this.f29104j;
                int i7 = i5 + 1;
                byte b5 = bArr[i5];
                if (b5 >= 0) {
                    this.f29107m = i7;
                    return b5;
                }
                if (i6 - i7 >= 9) {
                    int i10 = i5 + 2;
                    int i11 = (bArr[i7] << 7) ^ b5;
                    if (i11 < 0) {
                        i4 = i11 ^ (-128);
                    } else {
                        int i12 = i5 + 3;
                        int i13 = (bArr[i10] << 14) ^ i11;
                        if (i13 >= 0) {
                            i4 = i13 ^ 16256;
                        } else {
                            int i14 = i5 + 4;
                            int i15 = i13 ^ (bArr[i12] << com.google.common.base.c.f54879y);
                            if (i15 < 0) {
                                i4 = (-2080896) ^ i15;
                            } else {
                                i12 = i5 + 5;
                                byte b6 = bArr[i14];
                                int i16 = (i15 ^ (b6 << com.google.common.base.c.F)) ^ 266354560;
                                if (b6 < 0) {
                                    i14 = i5 + 6;
                                    if (bArr[i12] < 0) {
                                        i12 = i5 + 7;
                                        if (bArr[i14] < 0) {
                                            i14 = i5 + 8;
                                            if (bArr[i12] < 0) {
                                                i12 = i5 + 9;
                                                if (bArr[i14] < 0) {
                                                    int i17 = i5 + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i10 = i17;
                                                        i4 = i16;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i4 = i16;
                                }
                                i4 = i16;
                            }
                            i10 = i14;
                        }
                        i10 = i12;
                    }
                    this.f29107m = i10;
                    return i4;
                }
            }
            return (int) R();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long Q() throws IOException {
            long j4;
            long j5;
            long j6;
            int i4 = this.f29107m;
            int i5 = this.f29105k;
            if (i5 != i4) {
                byte[] bArr = this.f29104j;
                int i6 = i4 + 1;
                byte b5 = bArr[i4];
                if (b5 >= 0) {
                    this.f29107m = i6;
                    return b5;
                }
                if (i5 - i6 >= 9) {
                    int i7 = i4 + 2;
                    int i10 = (bArr[i6] << 7) ^ b5;
                    if (i10 < 0) {
                        j4 = i10 ^ (-128);
                    } else {
                        int i11 = i4 + 3;
                        int i12 = (bArr[i7] << 14) ^ i10;
                        if (i12 >= 0) {
                            j4 = i12 ^ 16256;
                            i7 = i11;
                        } else {
                            int i13 = i4 + 4;
                            int i14 = i12 ^ (bArr[i11] << com.google.common.base.c.f54879y);
                            if (i14 < 0) {
                                long j7 = (-2080896) ^ i14;
                                i7 = i13;
                                j4 = j7;
                            } else {
                                long j10 = i14;
                                i7 = i4 + 5;
                                long j11 = j10 ^ (bArr[i13] << 28);
                                if (j11 >= 0) {
                                    j6 = 266354560;
                                } else {
                                    int i15 = i4 + 6;
                                    long j12 = j11 ^ (bArr[i7] << 35);
                                    if (j12 < 0) {
                                        j5 = -34093383808L;
                                    } else {
                                        i7 = i4 + 7;
                                        j11 = j12 ^ (bArr[i15] << 42);
                                        if (j11 >= 0) {
                                            j6 = 4363953127296L;
                                        } else {
                                            i15 = i4 + 8;
                                            j12 = j11 ^ (bArr[i7] << 49);
                                            if (j12 < 0) {
                                                j5 = -558586000294016L;
                                            } else {
                                                i7 = i4 + 9;
                                                long j13 = (j12 ^ (bArr[i15] << 56)) ^ 71499008037633920L;
                                                if (j13 < 0) {
                                                    int i16 = i4 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i7 = i16;
                                                    }
                                                }
                                                j4 = j13;
                                            }
                                        }
                                    }
                                    j4 = j12 ^ j5;
                                    i7 = i15;
                                }
                                j4 = j11 ^ j6;
                            }
                        }
                    }
                    this.f29107m = i7;
                    return j4;
                }
            }
            return R();
        }

        @Override // androidx.content.preferences.protobuf.z
        long R() throws IOException {
            long j4 = 0;
            for (int i4 = 0; i4 < 64; i4 += 7) {
                j4 |= (r3 & Byte.MAX_VALUE) << i4;
                if ((J() & 128) == 0) {
                    return j4;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int S() throws IOException {
            return L();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long T() throws IOException {
            return M();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int U() throws IOException {
            return z.b(N());
        }

        @Override // androidx.content.preferences.protobuf.z
        public long V() throws IOException {
            return z.c(Q());
        }

        @Override // androidx.content.preferences.protobuf.z
        public String W() throws IOException {
            int N = N();
            if (N > 0) {
                int i4 = this.f29105k;
                int i5 = this.f29107m;
                if (N <= i4 - i5) {
                    String str = new String(this.f29104j, i5, N, p1.f28847a);
                    this.f29107m += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N > this.f29105k) {
                return new String(p0(N, false), p1.f28847a);
            }
            t0(N);
            String str2 = new String(this.f29104j, this.f29107m, N, p1.f28847a);
            this.f29107m += N;
            return str2;
        }

        @Override // androidx.content.preferences.protobuf.z
        public String X() throws IOException {
            byte[] p02;
            int N = N();
            int i4 = this.f29107m;
            int i5 = this.f29105k;
            if (N <= i5 - i4 && N > 0) {
                p02 = this.f29104j;
                this.f29107m = i4 + N;
            } else {
                if (N == 0) {
                    return "";
                }
                i4 = 0;
                if (N <= i5) {
                    t0(N);
                    p02 = this.f29104j;
                    this.f29107m = N;
                } else {
                    p02 = p0(N, false);
                }
            }
            return q4.h(p02, i4, N);
        }

        @Override // androidx.content.preferences.protobuf.z
        public int Y() throws IOException {
            if (i()) {
                this.f29108n = 0;
                return 0;
            }
            int N = N();
            this.f29108n = N;
            if (t4.a(N) != 0) {
                return this.f29108n;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int Z() throws IOException {
            return N();
        }

        @Override // androidx.content.preferences.protobuf.z
        public void a(int i4) throws InvalidProtocolBufferException {
            if (this.f29108n != i4) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.content.preferences.protobuf.z
        public long a0() throws IOException {
            return Q();
        }

        @Override // androidx.content.preferences.protobuf.z
        @Deprecated
        public void b0(int i4, i2.a aVar) throws IOException {
            E(i4, aVar, s0.d());
        }

        @Override // androidx.content.preferences.protobuf.z
        public void c0() {
            this.f29109o = -this.f29107m;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void e(boolean z4) {
        }

        @Override // androidx.content.preferences.protobuf.z
        public int f() {
            int i4 = this.f29110p;
            if (i4 == Integer.MAX_VALUE) {
                return -1;
            }
            return i4 - (this.f29109o + this.f29107m);
        }

        @Override // androidx.content.preferences.protobuf.z
        public int g() {
            return this.f29108n;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean g0(int i4) throws IOException {
            int b5 = t4.b(i4);
            if (b5 == 0) {
                v0();
                return true;
            }
            if (b5 == 1) {
                k0(8);
                return true;
            }
            if (b5 == 2) {
                k0(N());
                return true;
            }
            if (b5 == 3) {
                i0();
                a(((i4 >>> 3) << 3) | 4);
                return true;
            }
            if (b5 == 4) {
                return false;
            }
            if (b5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            k0(4);
            return true;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int h() {
            return this.f29109o + this.f29107m;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean h0(int i4, CodedOutputStream codedOutputStream) throws IOException {
            int b5 = t4.b(i4);
            if (b5 == 0) {
                long Q = Q();
                codedOutputStream.h2(i4);
                codedOutputStream.i2(Q);
                return true;
            }
            if (b5 == 1) {
                long M = M();
                codedOutputStream.h2(i4);
                codedOutputStream.D1(M);
                return true;
            }
            if (b5 == 2) {
                w x4 = x();
                codedOutputStream.h2(i4);
                codedOutputStream.z1(x4);
                return true;
            }
            if (b5 == 3) {
                codedOutputStream.h2(i4);
                j0(codedOutputStream);
                int i5 = ((i4 >>> 3) << 3) | 4;
                a(i5);
                codedOutputStream.h2(i5);
                return true;
            }
            if (b5 == 4) {
                return false;
            }
            if (b5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            int L = L();
            codedOutputStream.h2(i4);
            codedOutputStream.C1(L);
            return true;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean i() throws IOException {
            return this.f29107m == this.f29105k && !y0(1);
        }

        @Override // androidx.content.preferences.protobuf.z
        public void i0() throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (g0(Y));
        }

        @Override // androidx.content.preferences.protobuf.z
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (h0(Y, codedOutputStream));
        }

        @Override // androidx.content.preferences.protobuf.z
        public void k0(int i4) throws IOException {
            int i5 = this.f29105k;
            int i6 = this.f29107m;
            if (i4 > i5 - i6 || i4 < 0) {
                u0(i4);
            } else {
                this.f29107m = i6 + i4;
            }
        }

        @Override // androidx.content.preferences.protobuf.z
        public void s(int i4) {
            this.f29110p = i4;
            s0();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int t(int i4) throws InvalidProtocolBufferException {
            if (i4 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i5 = this.f29109o + this.f29107m + i4;
            int i6 = this.f29110p;
            if (i5 > i6) {
                throw InvalidProtocolBufferException.l();
            }
            this.f29110p = i5;
            s0();
            return i6;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // androidx.content.preferences.protobuf.z
        public byte[] v() throws IOException {
            int N = N();
            int i4 = this.f29105k;
            int i5 = this.f29107m;
            if (N > i4 - i5 || N <= 0) {
                return p0(N, false);
            }
            byte[] copyOfRange = Arrays.copyOfRange(this.f29104j, i5, i5 + N);
            this.f29107m += N;
            return copyOfRange;
        }

        @Override // androidx.content.preferences.protobuf.z
        public ByteBuffer w() throws IOException {
            int N = N();
            int i4 = this.f29105k;
            int i5 = this.f29107m;
            if (N > i4 - i5 || N <= 0) {
                return N == 0 ? p1.f28851e : ByteBuffer.wrap(p0(N, true));
            }
            ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f29104j, i5, i5 + N));
            this.f29107m += N;
            return wrap;
        }

        @Override // androidx.content.preferences.protobuf.z
        public w x() throws IOException {
            int N = N();
            int i4 = this.f29105k;
            int i5 = this.f29107m;
            if (N > i4 - i5 || N <= 0) {
                return N == 0 ? w.f28998f : o0(N);
            }
            w x4 = w.x(this.f29104j, i5, N);
            this.f29107m += N;
            return x4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.content.preferences.protobuf.z
        public int z() throws IOException {
            return N();
        }

        private d(InputStream inputStream, int i4) {
            super();
            this.f29110p = Integer.MAX_VALUE;
            this.f29111q = null;
            p1.e(inputStream, "input");
            this.f29103i = inputStream;
            this.f29104j = new byte[i4];
            this.f29105k = 0;
            this.f29107m = 0;
            this.f29109o = 0;
        }
    }

    /* compiled from: CodedInputStream.java */
    private static final class e extends z {

        /* renamed from: i, reason: collision with root package name */
        private final ByteBuffer f29115i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f29116j;

        /* renamed from: k, reason: collision with root package name */
        private final long f29117k;

        /* renamed from: l, reason: collision with root package name */
        private long f29118l;

        /* renamed from: m, reason: collision with root package name */
        private long f29119m;

        /* renamed from: n, reason: collision with root package name */
        private long f29120n;

        /* renamed from: o, reason: collision with root package name */
        private int f29121o;

        /* renamed from: p, reason: collision with root package name */
        private int f29122p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f29123q;

        /* renamed from: r, reason: collision with root package name */
        private int f29124r;

        private int m0(long j4) {
            return (int) (j4 - this.f29117k);
        }

        static boolean n0() {
            return p4.T();
        }

        private void o0() {
            long j4 = this.f29118l + this.f29121o;
            this.f29118l = j4;
            int i4 = (int) (j4 - this.f29120n);
            int i5 = this.f29124r;
            if (i4 <= i5) {
                this.f29121o = 0;
                return;
            }
            int i6 = i4 - i5;
            this.f29121o = i6;
            this.f29118l = j4 - i6;
        }

        private int p0() {
            return (int) (this.f29118l - this.f29119m);
        }

        private void q0() throws IOException {
            if (p0() >= 10) {
                r0();
            } else {
                s0();
            }
        }

        private void r0() throws IOException {
            for (int i4 = 0; i4 < 10; i4++) {
                long j4 = this.f29119m;
                this.f29119m = 1 + j4;
                if (p4.y(j4) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void s0() throws IOException {
            for (int i4 = 0; i4 < 10; i4++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private ByteBuffer t0(long j4, long j5) throws IOException {
            int position = this.f29115i.position();
            int limit = this.f29115i.limit();
            try {
                try {
                    this.f29115i.position((int) (j4 - this.f29117k));
                    this.f29115i.limit((int) (j5 - this.f29117k));
                    return this.f29115i.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.l();
                }
            } finally {
                this.f29115i.position(position);
                this.f29115i.limit(limit);
            }
        }

        @Override // androidx.content.preferences.protobuf.z
        public int A() throws IOException {
            return L();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long B() throws IOException {
            return M();
        }

        @Override // androidx.content.preferences.protobuf.z
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.content.preferences.protobuf.z
        public <T extends i2> T D(int i4, c3<T> c3Var, s0 s0Var) throws IOException {
            int i5 = this.f29074a;
            if (i5 >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f29074a = i5 + 1;
            T z4 = c3Var.z(this, s0Var);
            a(t4.c(i4, 4));
            this.f29074a--;
            return z4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void E(int i4, i2.a aVar, s0 s0Var) throws IOException {
            int i5 = this.f29074a;
            if (i5 >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f29074a = i5 + 1;
            aVar.n1(this, s0Var);
            a(t4.c(i4, 4));
            this.f29074a--;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int F() throws IOException {
            return N();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long G() throws IOException {
            return Q();
        }

        @Override // androidx.content.preferences.protobuf.z
        public <T extends i2> T H(c3<T> c3Var, s0 s0Var) throws IOException {
            int N = N();
            if (this.f29074a >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            int t4 = t(N);
            this.f29074a++;
            T z4 = c3Var.z(this, s0Var);
            a(0);
            this.f29074a--;
            s(t4);
            return z4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void I(i2.a aVar, s0 s0Var) throws IOException {
            int N = N();
            if (this.f29074a >= this.f29075b) {
                throw InvalidProtocolBufferException.i();
            }
            int t4 = t(N);
            this.f29074a++;
            aVar.n1(this, s0Var);
            a(0);
            this.f29074a--;
            s(t4);
        }

        @Override // androidx.content.preferences.protobuf.z
        public byte J() throws IOException {
            long j4 = this.f29119m;
            if (j4 == this.f29118l) {
                throw InvalidProtocolBufferException.l();
            }
            this.f29119m = 1 + j4;
            return p4.y(j4);
        }

        @Override // androidx.content.preferences.protobuf.z
        public byte[] K(int i4) throws IOException {
            if (i4 < 0 || i4 > p0()) {
                if (i4 > 0) {
                    throw InvalidProtocolBufferException.l();
                }
                if (i4 == 0) {
                    return p1.f28850d;
                }
                throw InvalidProtocolBufferException.g();
            }
            byte[] bArr = new byte[i4];
            long j4 = this.f29119m;
            long j5 = i4;
            t0(j4, j4 + j5).get(bArr);
            this.f29119m += j5;
            return bArr;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int L() throws IOException {
            long j4 = this.f29119m;
            if (this.f29118l - j4 < 4) {
                throw InvalidProtocolBufferException.l();
            }
            this.f29119m = 4 + j4;
            return ((p4.y(j4 + 3) & 255) << 24) | (p4.y(j4) & 255) | ((p4.y(1 + j4) & 255) << 8) | ((p4.y(2 + j4) & 255) << 16);
        }

        @Override // androidx.content.preferences.protobuf.z
        public long M() throws IOException {
            long j4 = this.f29119m;
            if (this.f29118l - j4 < 8) {
                throw InvalidProtocolBufferException.l();
            }
            this.f29119m = 8 + j4;
            return ((p4.y(j4 + 7) & 255) << 56) | (p4.y(j4) & 255) | ((p4.y(1 + j4) & 255) << 8) | ((p4.y(2 + j4) & 255) << 16) | ((p4.y(3 + j4) & 255) << 24) | ((p4.y(4 + j4) & 255) << 32) | ((p4.y(5 + j4) & 255) << 40) | ((p4.y(6 + j4) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (androidx.content.preferences.protobuf.p4.y(r3) < 0) goto L34;
         */
        @Override // androidx.content.preferences.protobuf.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int N() throws java.io.IOException {
            /*
                r9 = this;
                long r0 = r9.f29119m
                long r2 = r9.f29118l
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = androidx.content.preferences.protobuf.p4.y(r0)
                if (r4 < 0) goto L16
                r9.f29119m = r2
                return r4
            L16:
                long r5 = r9.f29118l
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = androidx.content.preferences.protobuf.p4.y(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = androidx.content.preferences.protobuf.p4.y(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = androidx.content.preferences.protobuf.p4.y(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = androidx.content.preferences.protobuf.p4.y(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = androidx.content.preferences.protobuf.p4.y(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = androidx.content.preferences.protobuf.p4.y(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = androidx.content.preferences.protobuf.p4.y(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = androidx.content.preferences.protobuf.p4.y(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = androidx.content.preferences.protobuf.p4.y(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.R()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f29119m = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.e.N():int");
        }

        @Override // androidx.content.preferences.protobuf.z
        public long Q() throws IOException {
            long j4;
            long j5;
            long j6;
            int i4;
            long j7 = this.f29119m;
            if (this.f29118l != j7) {
                long j10 = 1 + j7;
                byte y4 = p4.y(j7);
                if (y4 >= 0) {
                    this.f29119m = j10;
                    return y4;
                }
                if (this.f29118l - j10 >= 9) {
                    long j11 = 2 + j7;
                    int y5 = (p4.y(j10) << 7) ^ y4;
                    if (y5 >= 0) {
                        long j12 = 3 + j7;
                        int y6 = y5 ^ (p4.y(j11) << 14);
                        if (y6 >= 0) {
                            j4 = y6 ^ 16256;
                            j11 = j12;
                        } else {
                            j11 = 4 + j7;
                            int y7 = y6 ^ (p4.y(j12) << com.google.common.base.c.f54879y);
                            if (y7 < 0) {
                                i4 = (-2080896) ^ y7;
                            } else {
                                long j13 = 5 + j7;
                                long y10 = y7 ^ (p4.y(j11) << 28);
                                if (y10 >= 0) {
                                    j6 = 266354560;
                                } else {
                                    long j14 = 6 + j7;
                                    long y11 = y10 ^ (p4.y(j13) << 35);
                                    if (y11 < 0) {
                                        j5 = -34093383808L;
                                    } else {
                                        j13 = 7 + j7;
                                        y10 = y11 ^ (p4.y(j14) << 42);
                                        if (y10 >= 0) {
                                            j6 = 4363953127296L;
                                        } else {
                                            j14 = 8 + j7;
                                            y11 = y10 ^ (p4.y(j13) << 49);
                                            if (y11 < 0) {
                                                j5 = -558586000294016L;
                                            } else {
                                                long j15 = j7 + 9;
                                                long y12 = (y11 ^ (p4.y(j14) << 56)) ^ 71499008037633920L;
                                                if (y12 < 0) {
                                                    long j16 = j7 + 10;
                                                    if (p4.y(j15) >= 0) {
                                                        j11 = j16;
                                                        j4 = y12;
                                                    }
                                                } else {
                                                    j4 = y12;
                                                    j11 = j15;
                                                }
                                            }
                                        }
                                    }
                                    j4 = j5 ^ y11;
                                    j11 = j14;
                                }
                                j4 = j6 ^ y10;
                                j11 = j13;
                            }
                        }
                        this.f29119m = j11;
                        return j4;
                    }
                    i4 = y5 ^ (-128);
                    j4 = i4;
                    this.f29119m = j11;
                    return j4;
                }
            }
            return R();
        }

        @Override // androidx.content.preferences.protobuf.z
        long R() throws IOException {
            long j4 = 0;
            for (int i4 = 0; i4 < 64; i4 += 7) {
                j4 |= (r3 & Byte.MAX_VALUE) << i4;
                if ((J() & 128) == 0) {
                    return j4;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int S() throws IOException {
            return L();
        }

        @Override // androidx.content.preferences.protobuf.z
        public long T() throws IOException {
            return M();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int U() throws IOException {
            return z.b(N());
        }

        @Override // androidx.content.preferences.protobuf.z
        public long V() throws IOException {
            return z.c(Q());
        }

        @Override // androidx.content.preferences.protobuf.z
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
            long j4 = N;
            p4.n(this.f29119m, bArr, 0L, j4);
            String str = new String(bArr, p1.f28847a);
            this.f29119m += j4;
            return str;
        }

        @Override // androidx.content.preferences.protobuf.z
        public String X() throws IOException {
            int N = N();
            if (N > 0 && N <= p0()) {
                String g4 = q4.g(this.f29115i, (int) (this.f29119m - this.f29117k), N);
                this.f29119m += N;
                return g4;
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int Y() throws IOException {
            if (i()) {
                this.f29122p = 0;
                return 0;
            }
            int N = N();
            this.f29122p = N;
            if (t4.a(N) != 0) {
                return this.f29122p;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int Z() throws IOException {
            return N();
        }

        @Override // androidx.content.preferences.protobuf.z
        public void a(int i4) throws InvalidProtocolBufferException {
            if (this.f29122p != i4) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.content.preferences.protobuf.z
        public long a0() throws IOException {
            return Q();
        }

        @Override // androidx.content.preferences.protobuf.z
        @Deprecated
        public void b0(int i4, i2.a aVar) throws IOException {
            E(i4, aVar, s0.d());
        }

        @Override // androidx.content.preferences.protobuf.z
        public void c0() {
            this.f29120n = this.f29119m;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void e(boolean z4) {
            this.f29123q = z4;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int f() {
            int i4 = this.f29124r;
            if (i4 == Integer.MAX_VALUE) {
                return -1;
            }
            return i4 - h();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int g() {
            return this.f29122p;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean g0(int i4) throws IOException {
            int b5 = t4.b(i4);
            if (b5 == 0) {
                q0();
                return true;
            }
            if (b5 == 1) {
                k0(8);
                return true;
            }
            if (b5 == 2) {
                k0(N());
                return true;
            }
            if (b5 == 3) {
                i0();
                a(((i4 >>> 3) << 3) | 4);
                return true;
            }
            if (b5 == 4) {
                return false;
            }
            if (b5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            k0(4);
            return true;
        }

        @Override // androidx.content.preferences.protobuf.z
        public int h() {
            return (int) (this.f29119m - this.f29120n);
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean h0(int i4, CodedOutputStream codedOutputStream) throws IOException {
            int b5 = t4.b(i4);
            if (b5 == 0) {
                long Q = Q();
                codedOutputStream.h2(i4);
                codedOutputStream.i2(Q);
                return true;
            }
            if (b5 == 1) {
                long M = M();
                codedOutputStream.h2(i4);
                codedOutputStream.D1(M);
                return true;
            }
            if (b5 == 2) {
                w x4 = x();
                codedOutputStream.h2(i4);
                codedOutputStream.z1(x4);
                return true;
            }
            if (b5 == 3) {
                codedOutputStream.h2(i4);
                j0(codedOutputStream);
                int i5 = ((i4 >>> 3) << 3) | 4;
                a(i5);
                codedOutputStream.h2(i5);
                return true;
            }
            if (b5 == 4) {
                return false;
            }
            if (b5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            int L = L();
            codedOutputStream.h2(i4);
            codedOutputStream.C1(L);
            return true;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean i() throws IOException {
            return this.f29119m == this.f29118l;
        }

        @Override // androidx.content.preferences.protobuf.z
        public void i0() throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (g0(Y));
        }

        @Override // androidx.content.preferences.protobuf.z
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int Y;
            do {
                Y = Y();
                if (Y == 0) {
                    return;
                }
            } while (h0(Y, codedOutputStream));
        }

        @Override // androidx.content.preferences.protobuf.z
        public void k0(int i4) throws IOException {
            if (i4 >= 0 && i4 <= p0()) {
                this.f29119m += i4;
            } else {
                if (i4 >= 0) {
                    throw InvalidProtocolBufferException.l();
                }
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.content.preferences.protobuf.z
        public void s(int i4) {
            this.f29124r = i4;
            o0();
        }

        @Override // androidx.content.preferences.protobuf.z
        public int t(int i4) throws InvalidProtocolBufferException {
            if (i4 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int h4 = i4 + h();
            int i5 = this.f29124r;
            if (h4 > i5) {
                throw InvalidProtocolBufferException.l();
            }
            this.f29124r = h4;
            o0();
            return i5;
        }

        @Override // androidx.content.preferences.protobuf.z
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // androidx.content.preferences.protobuf.z
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // androidx.content.preferences.protobuf.z
        public ByteBuffer w() throws IOException {
            int N = N();
            if (N <= 0 || N > p0()) {
                if (N == 0) {
                    return p1.f28851e;
                }
                if (N < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.l();
            }
            if (this.f29116j || !this.f29123q) {
                byte[] bArr = new byte[N];
                long j4 = N;
                p4.n(this.f29119m, bArr, 0L, j4);
                this.f29119m += j4;
                return ByteBuffer.wrap(bArr);
            }
            long j5 = this.f29119m;
            long j6 = N;
            ByteBuffer t02 = t0(j5, j5 + j6);
            this.f29119m += j6;
            return t02;
        }

        @Override // androidx.content.preferences.protobuf.z
        public w x() throws IOException {
            int N = N();
            if (N <= 0 || N > p0()) {
                if (N == 0) {
                    return w.f28998f;
                }
                if (N < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.l();
            }
            if (this.f29116j && this.f29123q) {
                long j4 = this.f29119m;
                long j5 = N;
                ByteBuffer t02 = t0(j4, j4 + j5);
                this.f29119m += j5;
                return w.q0(t02);
            }
            byte[] bArr = new byte[N];
            long j6 = N;
            p4.n(this.f29119m, bArr, 0L, j6);
            this.f29119m += j6;
            return w.r0(bArr);
        }

        @Override // androidx.content.preferences.protobuf.z
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.content.preferences.protobuf.z
        public int z() throws IOException {
            return N();
        }

        private e(ByteBuffer byteBuffer, boolean z4) {
            super();
            this.f29124r = Integer.MAX_VALUE;
            this.f29115i = byteBuffer;
            long i4 = p4.i(byteBuffer);
            this.f29117k = i4;
            this.f29118l = byteBuffer.limit() + i4;
            long position = i4 + byteBuffer.position();
            this.f29119m = position;
            this.f29120n = position;
            this.f29116j = z4;
        }
    }

    public static int O(int i4, InputStream inputStream) throws IOException {
        if ((i4 & 128) == 0) {
            return i4;
        }
        int i5 = i4 & 127;
        int i6 = 7;
        while (i6 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.l();
            }
            i5 |= (read & 127) << i6;
            if ((read & 128) == 0) {
                return i5;
            }
            i6 += 7;
        }
        while (i6 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.l();
            }
            if ((read2 & 128) == 0) {
                return i5;
            }
            i6 += 7;
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

    public static int b(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    public static long c(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    public static z j(InputStream inputStream) {
        return k(inputStream, 4096);
    }

    public static z k(InputStream inputStream, int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream != null) {
            return new d(inputStream, i4);
        }
        byte[] bArr = p1.f28850d;
        return r(bArr, 0, bArr.length, false);
    }

    public static z l(Iterable<ByteBuffer> iterable) {
        return !p4.T() ? k(new q1(iterable), 4096) : m(iterable, false);
    }

    static z m(Iterable<ByteBuffer> iterable, boolean z4) {
        int i4 = 0;
        int i5 = 0;
        for (ByteBuffer byteBuffer : iterable) {
            i5 += byteBuffer.remaining();
            i4 = byteBuffer.hasArray() ? i4 | 1 : byteBuffer.isDirect() ? i4 | 2 : i4 | 4;
        }
        return i4 == 2 ? new c(iterable, i5, z4) : k(new q1(iterable), 4096);
    }

    public static z n(ByteBuffer byteBuffer) {
        return o(byteBuffer, false);
    }

    static z o(ByteBuffer byteBuffer, boolean z4) {
        if (byteBuffer.hasArray()) {
            return r(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z4);
        }
        if (byteBuffer.isDirect() && p4.T()) {
            return new e(byteBuffer, z4);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return r(bArr, 0, remaining, true);
    }

    public static z p(byte[] bArr) {
        return r(bArr, 0, bArr.length, false);
    }

    public static z q(byte[] bArr, int i4, int i5) {
        return r(bArr, i4, i5, false);
    }

    static z r(byte[] bArr, int i4, int i5, boolean z4) {
        b bVar = new b(bArr, i4, i5, z4);
        try {
            bVar.t(i5);
            return bVar;
        } catch (InvalidProtocolBufferException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public abstract int A() throws IOException;

    public abstract long B() throws IOException;

    public abstract float C() throws IOException;

    public abstract <T extends i2> T D(int i4, c3<T> c3Var, s0 s0Var) throws IOException;

    public abstract void E(int i4, i2.a aVar, s0 s0Var) throws IOException;

    public abstract int F() throws IOException;

    public abstract long G() throws IOException;

    public abstract <T extends i2> T H(c3<T> c3Var, s0 s0Var) throws IOException;

    public abstract void I(i2.a aVar, s0 s0Var) throws IOException;

    public abstract byte J() throws IOException;

    public abstract byte[] K(int i4) throws IOException;

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

    public abstract void a(int i4) throws InvalidProtocolBufferException;

    public abstract long a0() throws IOException;

    @Deprecated
    public abstract void b0(int i4, i2.a aVar) throws IOException;

    public abstract void c0();

    final void d() {
        this.f29078e = true;
    }

    public final int d0(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Recursion limit cannot be negative: ", i4));
        }
        int i5 = this.f29075b;
        this.f29075b = i4;
        return i5;
    }

    public abstract void e(boolean z4);

    public final int e0(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Size limit cannot be negative: ", i4));
        }
        int i5 = this.f29076c;
        this.f29076c = i4;
        return i5;
    }

    public abstract int f();

    final boolean f0() {
        return this.f29078e;
    }

    public abstract int g();

    public abstract boolean g0(int i4) throws IOException;

    public abstract int h();

    @Deprecated
    public abstract boolean h0(int i4, CodedOutputStream codedOutputStream) throws IOException;

    public abstract boolean i() throws IOException;

    public abstract void i0() throws IOException;

    public abstract void j0(CodedOutputStream codedOutputStream) throws IOException;

    public abstract void k0(int i4) throws IOException;

    final void l0() {
        this.f29078e = false;
    }

    public abstract void s(int i4);

    public abstract int t(int i4) throws InvalidProtocolBufferException;

    public abstract boolean u() throws IOException;

    public abstract byte[] v() throws IOException;

    public abstract ByteBuffer w() throws IOException;

    public abstract w x() throws IOException;

    public abstract double y() throws IOException;

    public abstract int z() throws IOException;

    private z() {
        this.f29075b = 100;
        this.f29076c = Integer.MAX_VALUE;
        this.f29078e = false;
    }
}
