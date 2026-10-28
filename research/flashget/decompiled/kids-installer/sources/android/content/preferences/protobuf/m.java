package android.content.preferences.protobuf;

import android.content.preferences.protobuf.InvalidProtocolBufferException;
import android.content.preferences.protobuf.a2;
import android.content.preferences.protobuf.q4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: BinaryReader.java */
/* loaded from: classes3.dex */
abstract class m implements h3 {

    /* renamed from: c, reason: collision with root package name */
    private static final int f7338c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static final int f7339d = 7;

    /* compiled from: BinaryReader.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7340a;

        static {
            int[] iArr = new int[q4.b.values().length];
            f7340a = iArr;
            try {
                iArr[q4.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7340a[q4.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7340a[q4.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7340a[q4.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7340a[q4.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7340a[q4.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7340a[q4.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7340a[q4.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7340a[q4.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7340a[q4.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7340a[q4.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7340a[q4.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7340a[q4.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7340a[q4.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7340a[q4.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7340a[q4.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7340a[q4.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: BinaryReader.java */
    private static final class b extends m {

        /* renamed from: e, reason: collision with root package name */
        private final boolean f7341e;

        /* renamed from: f, reason: collision with root package name */
        private final byte[] f7342f;

        /* renamed from: g, reason: collision with root package name */
        private int f7343g;

        /* renamed from: h, reason: collision with root package name */
        private final int f7344h;

        /* renamed from: i, reason: collision with root package name */
        private int f7345i;

        /* renamed from: j, reason: collision with root package name */
        private int f7346j;

        /* renamed from: k, reason: collision with root package name */
        private int f7347k;

        public b(ByteBuffer byteBuffer, boolean z5) {
            super(null);
            this.f7341e = z5;
            this.f7342f = byteBuffer.array();
            int position = byteBuffer.position() + byteBuffer.arrayOffset();
            this.f7343g = position;
            this.f7344h = position;
            this.f7345i = byteBuffer.limit() + byteBuffer.arrayOffset();
        }

        private boolean V() {
            return this.f7343g == this.f7345i;
        }

        private byte W() throws IOException {
            int i5 = this.f7343g;
            if (i5 == this.f7345i) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f7342f;
            this.f7343g = i5 + 1;
            return bArr[i5];
        }

        private Object X(q4.b bVar, Class<?> cls, s0 s0Var) throws IOException {
            switch (a.f7340a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(l());
                case 2:
                    return F();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(w());
                case 5:
                    return Integer.valueOf(k());
                case 6:
                    return Long.valueOf(e());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(H());
                case 9:
                    return Long.valueOf(P());
                case 10:
                    return f(cls, s0Var);
                case 11:
                    return Integer.valueOf(L());
                case 12:
                    return Long.valueOf(m());
                case 13:
                    return Integer.valueOf(y());
                case 14:
                    return Long.valueOf(z());
                case 15:
                    return e0(true);
                case 16:
                    return Integer.valueOf(q());
                case 17:
                    return Long.valueOf(d());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T Y(j3<T> j3Var, s0 s0Var) throws IOException {
            int i5 = this.f7347k;
            this.f7347k = (q4.a(this.f7346j) << 3) | 4;
            try {
                T h5 = j3Var.h();
                j3Var.b(h5, this, s0Var);
                j3Var.c(h5);
                if (this.f7346j == this.f7347k) {
                    return h5;
                }
                throw InvalidProtocolBufferException.h();
            } finally {
                this.f7347k = i5;
            }
        }

        private int Z() throws IOException {
            j0(4);
            return a0();
        }

        private int a0() {
            int i5 = this.f7343g;
            byte[] bArr = this.f7342f;
            this.f7343g = i5 + 4;
            return ((bArr[i5 + 3] & UByte.f27220r) << 24) | (bArr[i5] & UByte.f27220r) | ((bArr[i5 + 1] & UByte.f27220r) << 8) | ((bArr[i5 + 2] & UByte.f27220r) << 16);
        }

        private long b0() throws IOException {
            j0(8);
            return c0();
        }

        private long c0() {
            int i5 = this.f7343g;
            byte[] bArr = this.f7342f;
            this.f7343g = i5 + 8;
            return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
        }

        private <T> T d0(j3<T> j3Var, s0 s0Var) throws IOException {
            int g02 = g0();
            j0(g02);
            int i5 = this.f7345i;
            int i6 = this.f7343g + g02;
            this.f7345i = i6;
            try {
                T h5 = j3Var.h();
                j3Var.b(h5, this, s0Var);
                j3Var.c(h5);
                if (this.f7343g == i6) {
                    return h5;
                }
                throw InvalidProtocolBufferException.h();
            } finally {
                this.f7345i = i5;
            }
        }

        private int g0() throws IOException {
            int i5;
            int i6 = this.f7343g;
            int i7 = this.f7345i;
            if (i7 == i6) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f7342f;
            int i8 = i6 + 1;
            byte b6 = bArr[i6];
            if (b6 >= 0) {
                this.f7343g = i8;
                return b6;
            }
            if (i7 - i8 < 9) {
                return (int) i0();
            }
            int i9 = i8 + 1;
            int i10 = b6 ^ (bArr[i8] << 7);
            if (i10 < 0) {
                i5 = i10 ^ (-128);
            } else {
                int i11 = i9 + 1;
                int i12 = i10 ^ (bArr[i9] << 14);
                if (i12 >= 0) {
                    i5 = i12 ^ 16256;
                } else {
                    i9 = i11 + 1;
                    int i13 = i12 ^ (bArr[i11] << 21);
                    if (i13 < 0) {
                        i5 = i13 ^ (-2080896);
                    } else {
                        i11 = i9 + 1;
                        byte b7 = bArr[i9];
                        i5 = (i13 ^ (b7 << 28)) ^ 266354560;
                        if (b7 < 0) {
                            i9 = i11 + 1;
                            if (bArr[i11] < 0) {
                                i11 = i9 + 1;
                                if (bArr[i9] < 0) {
                                    i9 = i11 + 1;
                                    if (bArr[i11] < 0) {
                                        i11 = i9 + 1;
                                        if (bArr[i9] < 0) {
                                            i9 = i11 + 1;
                                            if (bArr[i11] < 0) {
                                                throw InvalidProtocolBufferException.f();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i9 = i11;
            }
            this.f7343g = i9;
            return i5;
        }

        private long i0() throws IOException {
            long j5 = 0;
            for (int i5 = 0; i5 < 64; i5 += 7) {
                j5 |= (r3 & ByteCompanionObject.f23585c) << i5;
                if ((W() & ByteCompanionObject.f23584b) == 0) {
                    return j5;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void j0(int i5) throws IOException {
            if (i5 < 0 || i5 > this.f7345i - this.f7343g) {
                throw InvalidProtocolBufferException.l();
            }
        }

        private void k0(int i5) throws IOException {
            if (this.f7343g != i5) {
                throw InvalidProtocolBufferException.l();
            }
        }

        private void l0(int i5) throws IOException {
            if (q4.b(this.f7346j) != i5) {
                throw InvalidProtocolBufferException.e();
            }
        }

        private void m0(int i5) throws IOException {
            j0(i5);
            this.f7343g += i5;
        }

        private void n0() throws IOException {
            int i5 = this.f7347k;
            this.f7347k = (q4.a(this.f7346j) << 3) | 4;
            while (C() != Integer.MAX_VALUE && K()) {
            }
            if (this.f7346j != this.f7347k) {
                throw InvalidProtocolBufferException.h();
            }
            this.f7347k = i5;
        }

        private void o0() throws IOException {
            int i5 = this.f7345i;
            int i6 = this.f7343g;
            if (i5 - i6 >= 10) {
                byte[] bArr = this.f7342f;
                int i7 = 0;
                while (i7 < 10) {
                    int i8 = i6 + 1;
                    if (bArr[i6] >= 0) {
                        this.f7343g = i8;
                        return;
                    } else {
                        i7++;
                        i6 = i8;
                    }
                }
            }
            p0();
        }

        private void p0() throws IOException {
            for (int i5 = 0; i5 < 10; i5++) {
                if (W() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void q0(int i5) throws IOException {
            j0(i5);
            if ((i5 & 3) != 0) {
                throw InvalidProtocolBufferException.h();
            }
        }

        private void r0(int i5) throws IOException {
            j0(i5);
            if ((i5 & 7) != 0) {
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override // android.content.preferences.protobuf.h3
        public void A(List<Boolean> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof r)) {
                int b6 = q4.b(this.f7346j);
                if (b6 != 0) {
                    if (b6 != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int g02 = this.f7343g + g0();
                    while (this.f7343g < g02) {
                        list.add(Boolean.valueOf(g0() != 0));
                    }
                    k0(g02);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(l()));
                    if (V()) {
                        return;
                    } else {
                        i5 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i5;
                return;
            }
            r rVar = (r) list;
            int b7 = q4.b(this.f7346j);
            if (b7 != 0) {
                if (b7 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int g03 = this.f7343g + g0();
                while (this.f7343g < g03) {
                    rVar.i0(g0() != 0);
                }
                k0(g03);
                return;
            }
            do {
                rVar.i0(l());
                if (V()) {
                    return;
                } else {
                    i6 = this.f7343g;
                }
            } while (g0() == this.f7346j);
            this.f7343g = i6;
        }

        @Override // android.content.preferences.protobuf.h3
        public String B() throws IOException {
            return e0(false);
        }

        @Override // android.content.preferences.protobuf.h3
        public int C() throws IOException {
            if (V()) {
                return Integer.MAX_VALUE;
            }
            int g02 = g0();
            this.f7346j = g02;
            if (g02 == this.f7347k) {
                return Integer.MAX_VALUE;
            }
            return q4.a(g02);
        }

        @Override // android.content.preferences.protobuf.h3
        public void D(List<String> list) throws IOException {
            f0(list, false);
        }

        @Override // android.content.preferences.protobuf.h3
        public void E(List<String> list) throws IOException {
            f0(list, true);
        }

        @Override // android.content.preferences.protobuf.h3
        public w F() throws IOException {
            l0(2);
            int g02 = g0();
            if (g02 == 0) {
                return w.f7553s;
            }
            j0(g02);
            w t02 = this.f7341e ? w.t0(this.f7342f, this.f7343g, g02) : w.y(this.f7342f, this.f7343g, g02);
            this.f7343g += g02;
            return t02;
        }

        @Override // android.content.preferences.protobuf.h3
        public void G(List<Float> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof e1)) {
                int b6 = q4.b(this.f7346j);
                if (b6 == 2) {
                    int g02 = g0();
                    q0(g02);
                    int i7 = this.f7343g + g02;
                    while (this.f7343g < i7) {
                        list.add(Float.valueOf(Float.intBitsToFloat(a0())));
                    }
                    return;
                }
                if (b6 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (V()) {
                        return;
                    } else {
                        i5 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i5;
                return;
            }
            e1 e1Var = (e1) list;
            int b7 = q4.b(this.f7346j);
            if (b7 == 2) {
                int g03 = g0();
                q0(g03);
                int i8 = this.f7343g + g03;
                while (this.f7343g < i8) {
                    e1Var.m(Float.intBitsToFloat(a0()));
                }
                return;
            }
            if (b7 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                e1Var.m(readFloat());
                if (V()) {
                    return;
                } else {
                    i6 = this.f7343g;
                }
            } while (g0() == this.f7346j);
            this.f7343g = i6;
        }

        @Override // android.content.preferences.protobuf.h3
        public int H() throws IOException {
            l0(0);
            return g0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.preferences.protobuf.h3
        public <T> void I(List<T> list, j3<T> j3Var, s0 s0Var) throws IOException {
            int i5;
            if (q4.b(this.f7346j) != 3) {
                throw InvalidProtocolBufferException.e();
            }
            int i6 = this.f7346j;
            do {
                list.add(Y(j3Var, s0Var));
                if (V()) {
                    return;
                } else {
                    i5 = this.f7343g;
                }
            } while (g0() == i6);
            this.f7343g = i5;
        }

        @Override // android.content.preferences.protobuf.h3
        public boolean K() throws IOException {
            int i5;
            if (V() || (i5 = this.f7346j) == this.f7347k) {
                return false;
            }
            int b6 = q4.b(i5);
            if (b6 == 0) {
                o0();
                return true;
            }
            if (b6 == 1) {
                m0(8);
                return true;
            }
            if (b6 == 2) {
                m0(g0());
                return true;
            }
            if (b6 == 3) {
                n0();
                return true;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            m0(4);
            return true;
        }

        @Override // android.content.preferences.protobuf.h3
        public int L() throws IOException {
            l0(5);
            return Z();
        }

        @Override // android.content.preferences.protobuf.h3
        public void M(List<w> list) throws IOException {
            int i5;
            if (q4.b(this.f7346j) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(F());
                if (V()) {
                    return;
                } else {
                    i5 = this.f7343g;
                }
            } while (g0() == this.f7346j);
            this.f7343g = i5;
        }

        @Override // android.content.preferences.protobuf.h3
        public void N(List<Double> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof c0)) {
                int b6 = q4.b(this.f7346j);
                if (b6 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (V()) {
                            return;
                        } else {
                            i5 = this.f7343g;
                        }
                    } while (g0() == this.f7346j);
                    this.f7343g = i5;
                    return;
                }
                if (b6 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int g02 = g0();
                r0(g02);
                int i7 = this.f7343g + g02;
                while (this.f7343g < i7) {
                    list.add(Double.valueOf(Double.longBitsToDouble(c0())));
                }
                return;
            }
            c0 c0Var = (c0) list;
            int b7 = q4.b(this.f7346j);
            if (b7 == 1) {
                do {
                    c0Var.o0(readDouble());
                    if (V()) {
                        return;
                    } else {
                        i6 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i6;
                return;
            }
            if (b7 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int g03 = g0();
            r0(g03);
            int i8 = this.f7343g + g03;
            while (this.f7343g < i8) {
                c0Var.o0(Double.longBitsToDouble(c0()));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.preferences.protobuf.h3
        public <T> void O(List<T> list, j3<T> j3Var, s0 s0Var) throws IOException {
            int i5;
            if (q4.b(this.f7346j) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int i6 = this.f7346j;
            do {
                list.add(d0(j3Var, s0Var));
                if (V()) {
                    return;
                } else {
                    i5 = this.f7343g;
                }
            } while (g0() == i6);
            this.f7343g = i5;
        }

        @Override // android.content.preferences.protobuf.h3
        public long P() throws IOException {
            l0(0);
            return h0();
        }

        @Override // android.content.preferences.protobuf.h3
        public String Q() throws IOException {
            return e0(true);
        }

        @Override // android.content.preferences.protobuf.h3
        public void R(List<Long> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof y1)) {
                int b6 = q4.b(this.f7346j);
                if (b6 == 1) {
                    do {
                        list.add(Long.valueOf(e()));
                        if (V()) {
                            return;
                        } else {
                            i5 = this.f7343g;
                        }
                    } while (g0() == this.f7346j);
                    this.f7343g = i5;
                    return;
                }
                if (b6 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int g02 = g0();
                r0(g02);
                int i7 = this.f7343g + g02;
                while (this.f7343g < i7) {
                    list.add(Long.valueOf(c0()));
                }
                return;
            }
            y1 y1Var = (y1) list;
            int b7 = q4.b(this.f7346j);
            if (b7 == 1) {
                do {
                    y1Var.e0(e());
                    if (V()) {
                        return;
                    } else {
                        i6 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i6;
                return;
            }
            if (b7 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int g03 = g0();
            r0(g03);
            int i8 = this.f7343g + g03;
            while (this.f7343g < i8) {
                y1Var.e0(c0());
            }
        }

        @Override // android.content.preferences.protobuf.h3
        public <T> T S(j3<T> j3Var, s0 s0Var) throws IOException {
            l0(3);
            return (T) Y(j3Var, s0Var);
        }

        @Override // android.content.preferences.protobuf.m
        public int T() {
            return this.f7343g - this.f7344h;
        }

        @Override // android.content.preferences.protobuf.h3
        public int a() {
            return this.f7346j;
        }

        @Override // android.content.preferences.protobuf.h3
        public <T> T b(j3<T> j3Var, s0 s0Var) throws IOException {
            l0(2);
            return (T) d0(j3Var, s0Var);
        }

        @Override // android.content.preferences.protobuf.h3
        public void c(List<Integer> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof n1)) {
                int b6 = q4.b(this.f7346j);
                if (b6 != 0) {
                    if (b6 != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int g02 = this.f7343g + g0();
                    while (this.f7343g < g02) {
                        list.add(Integer.valueOf(z.b(g0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(y()));
                    if (V()) {
                        return;
                    } else {
                        i5 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i5;
                return;
            }
            n1 n1Var = (n1) list;
            int b7 = q4.b(this.f7346j);
            if (b7 != 0) {
                if (b7 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int g03 = this.f7343g + g0();
                while (this.f7343g < g03) {
                    n1Var.D(z.b(g0()));
                }
                return;
            }
            do {
                n1Var.D(y());
                if (V()) {
                    return;
                } else {
                    i6 = this.f7343g;
                }
            } while (g0() == this.f7346j);
            this.f7343g = i6;
        }

        @Override // android.content.preferences.protobuf.h3
        public long d() throws IOException {
            l0(0);
            return h0();
        }

        @Override // android.content.preferences.protobuf.h3
        public long e() throws IOException {
            l0(1);
            return b0();
        }

        public String e0(boolean z5) throws IOException {
            l0(2);
            int g02 = g0();
            if (g02 == 0) {
                return "";
            }
            j0(g02);
            if (z5) {
                byte[] bArr = this.f7342f;
                int i5 = this.f7343g;
                if (!n4.u(bArr, i5, i5 + g02)) {
                    throw InvalidProtocolBufferException.d();
                }
            }
            String str = new String(this.f7342f, this.f7343g, g02, o1.f7439a);
            this.f7343g += g02;
            return str;
        }

        @Override // android.content.preferences.protobuf.h3
        public <T> T f(Class<T> cls, s0 s0Var) throws IOException {
            l0(2);
            return (T) d0(c3.a().i(cls), s0Var);
        }

        public void f0(List<String> list, boolean z5) throws IOException {
            int i5;
            int i6;
            if (q4.b(this.f7346j) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            if (!(list instanceof u1) || z5) {
                do {
                    list.add(e0(z5));
                    if (V()) {
                        return;
                    } else {
                        i5 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i5;
                return;
            }
            u1 u1Var = (u1) list;
            do {
                u1Var.F(F());
                if (V()) {
                    return;
                } else {
                    i6 = this.f7343g;
                }
            } while (g0() == this.f7346j);
            this.f7343g = i6;
        }

        @Override // android.content.preferences.protobuf.h3
        public <T> void g(List<T> list, Class<T> cls, s0 s0Var) throws IOException {
            I(list, c3.a().i(cls), s0Var);
        }

        @Override // android.content.preferences.protobuf.h3
        public void h(List<Integer> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof n1)) {
                int b6 = q4.b(this.f7346j);
                if (b6 == 2) {
                    int g02 = g0();
                    q0(g02);
                    int i7 = this.f7343g + g02;
                    while (this.f7343g < i7) {
                        list.add(Integer.valueOf(a0()));
                    }
                    return;
                }
                if (b6 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    list.add(Integer.valueOf(L()));
                    if (V()) {
                        return;
                    } else {
                        i5 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i5;
                return;
            }
            n1 n1Var = (n1) list;
            int b7 = q4.b(this.f7346j);
            if (b7 == 2) {
                int g03 = g0();
                q0(g03);
                int i8 = this.f7343g + g03;
                while (this.f7343g < i8) {
                    n1Var.D(a0());
                }
                return;
            }
            if (b7 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                n1Var.D(L());
                if (V()) {
                    return;
                } else {
                    i6 = this.f7343g;
                }
            } while (g0() == this.f7346j);
            this.f7343g = i6;
        }

        public long h0() throws IOException {
            long j5;
            long j6;
            long j7;
            int i5;
            int i6 = this.f7343g;
            int i7 = this.f7345i;
            if (i7 == i6) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f7342f;
            int i8 = i6 + 1;
            byte b6 = bArr[i6];
            if (b6 >= 0) {
                this.f7343g = i8;
                return b6;
            }
            if (i7 - i8 < 9) {
                return i0();
            }
            int i9 = i8 + 1;
            int i10 = b6 ^ (bArr[i8] << 7);
            if (i10 >= 0) {
                int i11 = i9 + 1;
                int i12 = i10 ^ (bArr[i9] << 14);
                if (i12 >= 0) {
                    i9 = i11;
                    j5 = i12 ^ 16256;
                } else {
                    i9 = i11 + 1;
                    int i13 = i12 ^ (bArr[i11] << 21);
                    if (i13 < 0) {
                        i5 = i13 ^ (-2080896);
                    } else {
                        long j8 = i13;
                        int i14 = i9 + 1;
                        long j9 = j8 ^ (bArr[i9] << 28);
                        if (j9 >= 0) {
                            j7 = 266354560;
                        } else {
                            i9 = i14 + 1;
                            long j10 = j9 ^ (bArr[i14] << 35);
                            if (j10 < 0) {
                                j6 = -34093383808L;
                            } else {
                                i14 = i9 + 1;
                                j9 = j10 ^ (bArr[i9] << 42);
                                if (j9 >= 0) {
                                    j7 = 4363953127296L;
                                } else {
                                    i9 = i14 + 1;
                                    j10 = j9 ^ (bArr[i14] << 49);
                                    if (j10 < 0) {
                                        j6 = -558586000294016L;
                                    } else {
                                        int i15 = i9 + 1;
                                        long j11 = (j10 ^ (bArr[i9] << 56)) ^ 71499008037633920L;
                                        if (j11 < 0) {
                                            i9 = i15 + 1;
                                            if (bArr[i15] < 0) {
                                                throw InvalidProtocolBufferException.f();
                                            }
                                        } else {
                                            i9 = i15;
                                        }
                                        j5 = j11;
                                    }
                                }
                            }
                            j5 = j10 ^ j6;
                        }
                        j5 = j9 ^ j7;
                        i9 = i14;
                    }
                }
                this.f7343g = i9;
                return j5;
            }
            i5 = i10 ^ (-128);
            j5 = i5;
            this.f7343g = i9;
            return j5;
        }

        @Override // android.content.preferences.protobuf.h3
        public void i(List<Long> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof y1)) {
                int b6 = q4.b(this.f7346j);
                if (b6 != 0) {
                    if (b6 != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int g02 = this.f7343g + g0();
                    while (this.f7343g < g02) {
                        list.add(Long.valueOf(z.c(h0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(z()));
                    if (V()) {
                        return;
                    } else {
                        i5 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i5;
                return;
            }
            y1 y1Var = (y1) list;
            int b7 = q4.b(this.f7346j);
            if (b7 != 0) {
                if (b7 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int g03 = this.f7343g + g0();
                while (this.f7343g < g03) {
                    y1Var.e0(z.c(h0()));
                }
                return;
            }
            do {
                y1Var.e0(z());
                if (V()) {
                    return;
                } else {
                    i6 = this.f7343g;
                }
            } while (g0() == this.f7346j);
            this.f7343g = i6;
        }

        @Override // android.content.preferences.protobuf.h3
        public void j(List<Integer> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof n1)) {
                int b6 = q4.b(this.f7346j);
                if (b6 != 0) {
                    if (b6 != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int g02 = this.f7343g + g0();
                    while (this.f7343g < g02) {
                        list.add(Integer.valueOf(g0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(q()));
                    if (V()) {
                        return;
                    } else {
                        i5 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i5;
                return;
            }
            n1 n1Var = (n1) list;
            int b7 = q4.b(this.f7346j);
            if (b7 != 0) {
                if (b7 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int g03 = this.f7343g + g0();
                while (this.f7343g < g03) {
                    n1Var.D(g0());
                }
                return;
            }
            do {
                n1Var.D(q());
                if (V()) {
                    return;
                } else {
                    i6 = this.f7343g;
                }
            } while (g0() == this.f7346j);
            this.f7343g = i6;
        }

        @Override // android.content.preferences.protobuf.h3
        public int k() throws IOException {
            l0(5);
            return Z();
        }

        @Override // android.content.preferences.protobuf.h3
        public boolean l() throws IOException {
            l0(0);
            return g0() != 0;
        }

        @Override // android.content.preferences.protobuf.h3
        public long m() throws IOException {
            l0(1);
            return b0();
        }

        @Override // android.content.preferences.protobuf.h3
        public void n(List<Long> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof y1)) {
                int b6 = q4.b(this.f7346j);
                if (b6 == 0) {
                    do {
                        list.add(Long.valueOf(d()));
                        if (V()) {
                            return;
                        } else {
                            i5 = this.f7343g;
                        }
                    } while (g0() == this.f7346j);
                    this.f7343g = i5;
                    return;
                }
                if (b6 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int g02 = this.f7343g + g0();
                while (this.f7343g < g02) {
                    list.add(Long.valueOf(h0()));
                }
                k0(g02);
                return;
            }
            y1 y1Var = (y1) list;
            int b7 = q4.b(this.f7346j);
            if (b7 == 0) {
                do {
                    y1Var.e0(d());
                    if (V()) {
                        return;
                    } else {
                        i6 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i6;
                return;
            }
            if (b7 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int g03 = this.f7343g + g0();
            while (this.f7343g < g03) {
                y1Var.e0(h0());
            }
            k0(g03);
        }

        @Override // android.content.preferences.protobuf.h3
        public <T> T o(Class<T> cls, s0 s0Var) throws IOException {
            l0(3);
            return (T) Y(c3.a().i(cls), s0Var);
        }

        @Override // android.content.preferences.protobuf.h3
        public <T> void p(List<T> list, Class<T> cls, s0 s0Var) throws IOException {
            O(list, c3.a().i(cls), s0Var);
        }

        @Override // android.content.preferences.protobuf.h3
        public int q() throws IOException {
            l0(0);
            return g0();
        }

        @Override // android.content.preferences.protobuf.h3
        public void r(List<Long> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof y1)) {
                int b6 = q4.b(this.f7346j);
                if (b6 == 0) {
                    do {
                        list.add(Long.valueOf(P()));
                        if (V()) {
                            return;
                        } else {
                            i5 = this.f7343g;
                        }
                    } while (g0() == this.f7346j);
                    this.f7343g = i5;
                    return;
                }
                if (b6 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int g02 = this.f7343g + g0();
                while (this.f7343g < g02) {
                    list.add(Long.valueOf(h0()));
                }
                k0(g02);
                return;
            }
            y1 y1Var = (y1) list;
            int b7 = q4.b(this.f7346j);
            if (b7 == 0) {
                do {
                    y1Var.e0(P());
                    if (V()) {
                        return;
                    } else {
                        i6 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i6;
                return;
            }
            if (b7 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int g03 = this.f7343g + g0();
            while (this.f7343g < g03) {
                y1Var.e0(h0());
            }
            k0(g03);
        }

        @Override // android.content.preferences.protobuf.h3
        public double readDouble() throws IOException {
            l0(1);
            return Double.longBitsToDouble(b0());
        }

        @Override // android.content.preferences.protobuf.h3
        public float readFloat() throws IOException {
            l0(5);
            return Float.intBitsToFloat(Z());
        }

        @Override // android.content.preferences.protobuf.h3
        public void s(List<Long> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof y1)) {
                int b6 = q4.b(this.f7346j);
                if (b6 == 1) {
                    do {
                        list.add(Long.valueOf(m()));
                        if (V()) {
                            return;
                        } else {
                            i5 = this.f7343g;
                        }
                    } while (g0() == this.f7346j);
                    this.f7343g = i5;
                    return;
                }
                if (b6 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int g02 = g0();
                r0(g02);
                int i7 = this.f7343g + g02;
                while (this.f7343g < i7) {
                    list.add(Long.valueOf(c0()));
                }
                return;
            }
            y1 y1Var = (y1) list;
            int b7 = q4.b(this.f7346j);
            if (b7 == 1) {
                do {
                    y1Var.e0(m());
                    if (V()) {
                        return;
                    } else {
                        i6 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i6;
                return;
            }
            if (b7 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int g03 = g0();
            r0(g03);
            int i8 = this.f7343g + g03;
            while (this.f7343g < i8) {
                y1Var.e0(c0());
            }
        }

        @Override // android.content.preferences.protobuf.h3
        public void t(List<Integer> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof n1)) {
                int b6 = q4.b(this.f7346j);
                if (b6 == 0) {
                    do {
                        list.add(Integer.valueOf(H()));
                        if (V()) {
                            return;
                        } else {
                            i5 = this.f7343g;
                        }
                    } while (g0() == this.f7346j);
                    this.f7343g = i5;
                    return;
                }
                if (b6 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int g02 = this.f7343g + g0();
                while (this.f7343g < g02) {
                    list.add(Integer.valueOf(g0()));
                }
                k0(g02);
                return;
            }
            n1 n1Var = (n1) list;
            int b7 = q4.b(this.f7346j);
            if (b7 == 0) {
                do {
                    n1Var.D(H());
                    if (V()) {
                        return;
                    } else {
                        i6 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i6;
                return;
            }
            if (b7 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int g03 = this.f7343g + g0();
            while (this.f7343g < g03) {
                n1Var.D(g0());
            }
            k0(g03);
        }

        @Override // android.content.preferences.protobuf.h3
        public void u(List<Integer> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof n1)) {
                int b6 = q4.b(this.f7346j);
                if (b6 != 0) {
                    if (b6 != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int g02 = this.f7343g + g0();
                    while (this.f7343g < g02) {
                        list.add(Integer.valueOf(g0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(w()));
                    if (V()) {
                        return;
                    } else {
                        i5 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i5;
                return;
            }
            n1 n1Var = (n1) list;
            int b7 = q4.b(this.f7346j);
            if (b7 != 0) {
                if (b7 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int g03 = this.f7343g + g0();
                while (this.f7343g < g03) {
                    n1Var.D(g0());
                }
                return;
            }
            do {
                n1Var.D(w());
                if (V()) {
                    return;
                } else {
                    i6 = this.f7343g;
                }
            } while (g0() == this.f7346j);
            this.f7343g = i6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.preferences.protobuf.h3
        public <K, V> void v(Map<K, V> map, a2.b<K, V> bVar, s0 s0Var) throws IOException {
            l0(2);
            int g02 = g0();
            j0(g02);
            int i5 = this.f7345i;
            this.f7345i = this.f7343g + g02;
            try {
                Object obj = bVar.f7178b;
                Object obj2 = bVar.f7180d;
                while (true) {
                    int C = C();
                    if (C == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    }
                    if (C == 1) {
                        obj = X(bVar.f7177a, null, null);
                    } else if (C != 2) {
                        try {
                            if (!K()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!K()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = X(bVar.f7179c, bVar.f7180d.getClass(), s0Var);
                    }
                }
            } finally {
                this.f7345i = i5;
            }
        }

        @Override // android.content.preferences.protobuf.h3
        public int w() throws IOException {
            l0(0);
            return g0();
        }

        @Override // android.content.preferences.protobuf.h3
        public void x(List<Integer> list) throws IOException {
            int i5;
            int i6;
            if (!(list instanceof n1)) {
                int b6 = q4.b(this.f7346j);
                if (b6 == 2) {
                    int g02 = g0();
                    q0(g02);
                    int i7 = this.f7343g + g02;
                    while (this.f7343g < i7) {
                        list.add(Integer.valueOf(a0()));
                    }
                    return;
                }
                if (b6 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    list.add(Integer.valueOf(k()));
                    if (V()) {
                        return;
                    } else {
                        i5 = this.f7343g;
                    }
                } while (g0() == this.f7346j);
                this.f7343g = i5;
                return;
            }
            n1 n1Var = (n1) list;
            int b7 = q4.b(this.f7346j);
            if (b7 == 2) {
                int g03 = g0();
                q0(g03);
                int i8 = this.f7343g + g03;
                while (this.f7343g < i8) {
                    n1Var.D(a0());
                }
                return;
            }
            if (b7 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                n1Var.D(k());
                if (V()) {
                    return;
                } else {
                    i6 = this.f7343g;
                }
            } while (g0() == this.f7346j);
            this.f7343g = i6;
        }

        @Override // android.content.preferences.protobuf.h3
        public int y() throws IOException {
            l0(0);
            return z.b(g0());
        }

        @Override // android.content.preferences.protobuf.h3
        public long z() throws IOException {
            l0(0);
            return z.c(h0());
        }
    }

    private m() {
    }

    public static m U(ByteBuffer byteBuffer, boolean z5) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z5);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // android.content.preferences.protobuf.h3
    public boolean J() {
        return false;
    }

    public abstract int T();

    m(a aVar) {
    }
}
