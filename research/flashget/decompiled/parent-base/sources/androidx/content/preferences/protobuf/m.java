package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.InvalidProtocolBufferException;
import androidx.content.preferences.protobuf.b2;
import androidx.content.preferences.protobuf.t4;
import com.google.common.base.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* compiled from: BinaryReader.java */
/* loaded from: classes3.dex */
abstract class m implements k3 {

    /* renamed from: c, reason: collision with root package name */
    private static final int f28754c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static final int f28755d = 7;

    /* compiled from: BinaryReader.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28756a;

        static {
            int[] iArr = new int[t4.b.values().length];
            f28756a = iArr;
            try {
                iArr[t4.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28756a[t4.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28756a[t4.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28756a[t4.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28756a[t4.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28756a[t4.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28756a[t4.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28756a[t4.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28756a[t4.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28756a[t4.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28756a[t4.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28756a[t4.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28756a[t4.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28756a[t4.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28756a[t4.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28756a[t4.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28756a[t4.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: BinaryReader.java */
    private static final class b extends m {

        /* renamed from: e, reason: collision with root package name */
        private final boolean f28757e;

        /* renamed from: f, reason: collision with root package name */
        private final byte[] f28758f;

        /* renamed from: g, reason: collision with root package name */
        private int f28759g;

        /* renamed from: h, reason: collision with root package name */
        private final int f28760h;

        /* renamed from: i, reason: collision with root package name */
        private int f28761i;

        /* renamed from: j, reason: collision with root package name */
        private int f28762j;

        /* renamed from: k, reason: collision with root package name */
        private int f28763k;

        public b(ByteBuffer byteBuffer, boolean z4) {
            this.f28757e = z4;
            this.f28758f = byteBuffer.array();
            int position = byteBuffer.position() + byteBuffer.arrayOffset();
            this.f28759g = position;
            this.f28760h = position;
            this.f28761i = byteBuffer.limit() + byteBuffer.arrayOffset();
        }

        private boolean U() {
            return this.f28759g == this.f28761i;
        }

        private byte V() throws IOException {
            int i4 = this.f28759g;
            if (i4 == this.f28761i) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f28758f;
            this.f28759g = i4 + 1;
            return bArr[i4];
        }

        private Object W(t4.b bVar, Class<?> cls, s0 s0Var) throws IOException {
            switch (a.f28756a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(e());
                case 2:
                    return o();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(k());
                case 5:
                    return Integer.valueOf(y());
                case 6:
                    return Long.valueOf(b());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(p());
                case 9:
                    return Long.valueOf(Q());
                case 10:
                    return v(cls, s0Var);
                case 11:
                    return Integer.valueOf(N());
                case 12:
                    return Long.valueOf(f());
                case 13:
                    return Integer.valueOf(l());
                case 14:
                    return Long.valueOf(F());
                case 15:
                    return d0(true);
                case 16:
                    return Integer.valueOf(h());
                case 17:
                    return Long.valueOf(u());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T X(m3<T> m3Var, s0 s0Var) throws IOException {
            int i4 = this.f28763k;
            this.f28763k = (t4.a(this.f28762j) << 3) | 4;
            try {
                T f4 = m3Var.f();
                m3Var.b(f4, this, s0Var);
                m3Var.c(f4);
                if (this.f28762j == this.f28763k) {
                    return f4;
                }
                throw InvalidProtocolBufferException.h();
            } finally {
                this.f28763k = i4;
            }
        }

        private int Y() throws IOException {
            i0(4);
            return Z();
        }

        private int Z() {
            int i4 = this.f28759g;
            byte[] bArr = this.f28758f;
            this.f28759g = i4 + 4;
            return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
        }

        private long a0() throws IOException {
            i0(8);
            return b0();
        }

        private long b0() {
            int i4 = this.f28759g;
            byte[] bArr = this.f28758f;
            this.f28759g = i4 + 8;
            return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
        }

        private <T> T c0(m3<T> m3Var, s0 s0Var) throws IOException {
            int f02 = f0();
            i0(f02);
            int i4 = this.f28761i;
            int i5 = this.f28759g + f02;
            this.f28761i = i5;
            try {
                T f4 = m3Var.f();
                m3Var.b(f4, this, s0Var);
                m3Var.c(f4);
                if (this.f28759g == i5) {
                    return f4;
                }
                throw InvalidProtocolBufferException.h();
            } finally {
                this.f28761i = i4;
            }
        }

        private int f0() throws IOException {
            int i4;
            int i5 = this.f28759g;
            int i6 = this.f28761i;
            if (i6 == i5) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f28758f;
            int i7 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.f28759g = i7;
                return b5;
            }
            if (i6 - i7 < 9) {
                return (int) h0();
            }
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
                    int i15 = i13 ^ (bArr[i12] << c.f54879y);
                    if (i15 < 0) {
                        i4 = (-2080896) ^ i15;
                    } else {
                        i12 = i5 + 5;
                        byte b6 = bArr[i14];
                        int i16 = (i15 ^ (b6 << c.F)) ^ 266354560;
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
                                            if (bArr[i12] < 0) {
                                                throw InvalidProtocolBufferException.f();
                                            }
                                            i10 = i17;
                                            i4 = i16;
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
            this.f28759g = i10;
            return i4;
        }

        private long h0() throws IOException {
            long j4 = 0;
            for (int i4 = 0; i4 < 64; i4 += 7) {
                j4 |= (r3 & Byte.MAX_VALUE) << i4;
                if ((V() & 128) == 0) {
                    return j4;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void i0(int i4) throws IOException {
            if (i4 < 0 || i4 > this.f28761i - this.f28759g) {
                throw InvalidProtocolBufferException.l();
            }
        }

        private void j0(int i4) throws IOException {
            if (this.f28759g != i4) {
                throw InvalidProtocolBufferException.l();
            }
        }

        private void k0(int i4) throws IOException {
            if (t4.b(this.f28762j) != i4) {
                throw InvalidProtocolBufferException.e();
            }
        }

        private void l0(int i4) throws IOException {
            i0(i4);
            this.f28759g += i4;
        }

        private void m0() throws IOException {
            int i4 = this.f28763k;
            this.f28763k = (t4.a(this.f28762j) << 3) | 4;
            while (H() != Integer.MAX_VALUE && M()) {
            }
            if (this.f28762j != this.f28763k) {
                throw InvalidProtocolBufferException.h();
            }
            this.f28763k = i4;
        }

        private void n0() throws IOException {
            int i4 = this.f28761i;
            int i5 = this.f28759g;
            if (i4 - i5 >= 10) {
                byte[] bArr = this.f28758f;
                int i6 = 0;
                while (i6 < 10) {
                    int i7 = i5 + 1;
                    if (bArr[i5] >= 0) {
                        this.f28759g = i7;
                        return;
                    } else {
                        i6++;
                        i5 = i7;
                    }
                }
            }
            o0();
        }

        private void o0() throws IOException {
            for (int i4 = 0; i4 < 10; i4++) {
                if (V() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void p0(int i4) throws IOException {
            i0(i4);
            if ((i4 & 3) != 0) {
                throw InvalidProtocolBufferException.h();
            }
        }

        private void q0(int i4) throws IOException {
            i0(i4);
            if ((i4 & 7) != 0) {
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override // androidx.content.preferences.protobuf.k3
        public <T> void A(List<T> list, Class<T> cls, s0 s0Var) throws IOException {
            q(list, f3.a().i(cls), s0Var);
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void B(List<Long> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof z1)) {
                int b5 = t4.b(this.f28762j);
                if (b5 == 1) {
                    do {
                        list.add(Long.valueOf(f()));
                        if (U()) {
                            return;
                        } else {
                            i4 = this.f28759g;
                        }
                    } while (f0() == this.f28762j);
                    this.f28759g = i4;
                    return;
                }
                if (b5 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int f02 = f0();
                q0(f02);
                int i6 = this.f28759g + f02;
                while (this.f28759g < i6) {
                    list.add(Long.valueOf(b0()));
                }
                return;
            }
            z1 z1Var = (z1) list;
            int b6 = t4.b(this.f28762j);
            if (b6 == 1) {
                do {
                    z1Var.D2(f());
                    if (U()) {
                        return;
                    } else {
                        i5 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i5;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int f03 = f0();
            q0(f03);
            int i7 = this.f28759g + f03;
            while (this.f28759g < i7) {
                z1Var.D2(b0());
            }
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void C(List<Integer> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof n1)) {
                int b5 = t4.b(this.f28762j);
                if (b5 == 0) {
                    do {
                        list.add(Integer.valueOf(p()));
                        if (U()) {
                            return;
                        } else {
                            i4 = this.f28759g;
                        }
                    } while (f0() == this.f28762j);
                    this.f28759g = i4;
                    return;
                }
                if (b5 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int f02 = this.f28759g + f0();
                while (this.f28759g < f02) {
                    list.add(Integer.valueOf(f0()));
                }
                j0(f02);
                return;
            }
            n1 n1Var = (n1) list;
            int b6 = t4.b(this.f28762j);
            if (b6 == 0) {
                do {
                    n1Var.o2(p());
                    if (U()) {
                        return;
                    } else {
                        i5 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i5;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int f03 = this.f28759g + f0();
            while (this.f28759g < f03) {
                n1Var.o2(f0());
            }
            j0(f03);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.content.preferences.protobuf.k3
        public <K, V> void D(Map<K, V> map, b2.b<K, V> bVar, s0 s0Var) throws IOException {
            k0(2);
            int f02 = f0();
            i0(f02);
            int i4 = this.f28761i;
            this.f28761i = this.f28759g + f02;
            try {
                Object obj = bVar.f28641b;
                Object obj2 = bVar.f28643d;
                while (true) {
                    int H = H();
                    if (H == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    }
                    if (H == 1) {
                        obj = W(bVar.f28640a, null, null);
                    } else if (H != 2) {
                        try {
                            if (!M()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!M()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = W(bVar.f28642c, bVar.f28643d.getClass(), s0Var);
                    }
                }
            } finally {
                this.f28761i = i4;
            }
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void E(List<Integer> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof n1)) {
                int b5 = t4.b(this.f28762j);
                if (b5 == 2) {
                    int f02 = f0();
                    p0(f02);
                    int i6 = this.f28759g + f02;
                    while (this.f28759g < i6) {
                        list.add(Integer.valueOf(Z()));
                    }
                    return;
                }
                if (b5 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    list.add(Integer.valueOf(y()));
                    if (U()) {
                        return;
                    } else {
                        i4 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i4;
                return;
            }
            n1 n1Var = (n1) list;
            int b6 = t4.b(this.f28762j);
            if (b6 == 2) {
                int f03 = f0();
                p0(f03);
                int i7 = this.f28759g + f03;
                while (this.f28759g < i7) {
                    n1Var.o2(Z());
                }
                return;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                n1Var.o2(y());
                if (U()) {
                    return;
                } else {
                    i5 = this.f28759g;
                }
            } while (f0() == this.f28762j);
            this.f28759g = i5;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public long F() throws IOException {
            k0(0);
            return z.c(g0());
        }

        @Override // androidx.content.preferences.protobuf.k3
        public String G() throws IOException {
            return d0(false);
        }

        @Override // androidx.content.preferences.protobuf.k3
        public int H() throws IOException {
            if (U()) {
                return Integer.MAX_VALUE;
            }
            int f02 = f0();
            this.f28762j = f02;
            if (f02 == this.f28763k) {
                return Integer.MAX_VALUE;
            }
            return t4.a(f02);
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void I(List<String> list) throws IOException {
            e0(list, false);
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void J(List<Float> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof e1)) {
                int b5 = t4.b(this.f28762j);
                if (b5 == 2) {
                    int f02 = f0();
                    p0(f02);
                    int i6 = this.f28759g + f02;
                    while (this.f28759g < i6) {
                        list.add(Float.valueOf(Float.intBitsToFloat(Z())));
                    }
                    return;
                }
                if (b5 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (U()) {
                        return;
                    } else {
                        i4 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i4;
                return;
            }
            e1 e1Var = (e1) list;
            int b6 = t4.b(this.f28762j);
            if (b6 == 2) {
                int f03 = f0();
                p0(f03);
                int i7 = this.f28759g + f03;
                while (this.f28759g < i7) {
                    e1Var.Y(Float.intBitsToFloat(Z()));
                }
                return;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                e1Var.Y(readFloat());
                if (U()) {
                    return;
                } else {
                    i5 = this.f28759g;
                }
            } while (f0() == this.f28762j);
            this.f28759g = i5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.content.preferences.protobuf.k3
        public <T> void K(List<T> list, m3<T> m3Var, s0 s0Var) throws IOException {
            int i4;
            if (t4.b(this.f28762j) != 3) {
                throw InvalidProtocolBufferException.e();
            }
            int i5 = this.f28762j;
            do {
                list.add(X(m3Var, s0Var));
                if (U()) {
                    return;
                } else {
                    i4 = this.f28759g;
                }
            } while (f0() == i5);
            this.f28759g = i4;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public boolean M() throws IOException {
            int i4;
            if (U() || (i4 = this.f28762j) == this.f28763k) {
                return false;
            }
            int b5 = t4.b(i4);
            if (b5 == 0) {
                n0();
                return true;
            }
            if (b5 == 1) {
                l0(8);
                return true;
            }
            if (b5 == 2) {
                l0(f0());
                return true;
            }
            if (b5 == 3) {
                m0();
                return true;
            }
            if (b5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            l0(4);
            return true;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public int N() throws IOException {
            k0(5);
            return Y();
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void O(List<w> list) throws IOException {
            int i4;
            if (t4.b(this.f28762j) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(o());
                if (U()) {
                    return;
                } else {
                    i4 = this.f28759g;
                }
            } while (f0() == this.f28762j);
            this.f28759g = i4;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void P(List<Double> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof c0)) {
                int b5 = t4.b(this.f28762j);
                if (b5 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (U()) {
                            return;
                        } else {
                            i4 = this.f28759g;
                        }
                    } while (f0() == this.f28762j);
                    this.f28759g = i4;
                    return;
                }
                if (b5 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int f02 = f0();
                q0(f02);
                int i6 = this.f28759g + f02;
                while (this.f28759g < i6) {
                    list.add(Double.valueOf(Double.longBitsToDouble(b0())));
                }
                return;
            }
            c0 c0Var = (c0) list;
            int b6 = t4.b(this.f28762j);
            if (b6 == 1) {
                do {
                    c0Var.V2(readDouble());
                    if (U()) {
                        return;
                    } else {
                        i5 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i5;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int f03 = f0();
            q0(f03);
            int i7 = this.f28759g + f03;
            while (this.f28759g < i7) {
                c0Var.V2(Double.longBitsToDouble(b0()));
            }
        }

        @Override // androidx.content.preferences.protobuf.k3
        public long Q() throws IOException {
            k0(0);
            return g0();
        }

        @Override // androidx.content.preferences.protobuf.k3
        public String R() throws IOException {
            return d0(true);
        }

        @Override // androidx.content.preferences.protobuf.m
        public int S() {
            return this.f28759g - this.f28760h;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public <T> T a(m3<T> m3Var, s0 s0Var) throws IOException {
            k0(2);
            return (T) c0(m3Var, s0Var);
        }

        @Override // androidx.content.preferences.protobuf.k3
        public long b() throws IOException {
            k0(1);
            return a0();
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void c(List<Integer> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof n1)) {
                int b5 = t4.b(this.f28762j);
                if (b5 == 2) {
                    int f02 = f0();
                    p0(f02);
                    int i6 = this.f28759g + f02;
                    while (this.f28759g < i6) {
                        list.add(Integer.valueOf(Z()));
                    }
                    return;
                }
                if (b5 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    list.add(Integer.valueOf(N()));
                    if (U()) {
                        return;
                    } else {
                        i4 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i4;
                return;
            }
            n1 n1Var = (n1) list;
            int b6 = t4.b(this.f28762j);
            if (b6 == 2) {
                int f03 = f0();
                p0(f03);
                int i7 = this.f28759g + f03;
                while (this.f28759g < i7) {
                    n1Var.o2(Z());
                }
                return;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                n1Var.o2(N());
                if (U()) {
                    return;
                } else {
                    i5 = this.f28759g;
                }
            } while (f0() == this.f28762j);
            this.f28759g = i5;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void d(List<Long> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof z1)) {
                int b5 = t4.b(this.f28762j);
                if (b5 != 0) {
                    if (b5 != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int f02 = this.f28759g + f0();
                    while (this.f28759g < f02) {
                        list.add(Long.valueOf(z.c(g0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(F()));
                    if (U()) {
                        return;
                    } else {
                        i4 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i4;
                return;
            }
            z1 z1Var = (z1) list;
            int b6 = t4.b(this.f28762j);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int f03 = this.f28759g + f0();
                while (this.f28759g < f03) {
                    z1Var.D2(z.c(g0()));
                }
                return;
            }
            do {
                z1Var.D2(F());
                if (U()) {
                    return;
                } else {
                    i5 = this.f28759g;
                }
            } while (f0() == this.f28762j);
            this.f28759g = i5;
        }

        public String d0(boolean z4) throws IOException {
            k0(2);
            int f02 = f0();
            if (f02 == 0) {
                return "";
            }
            i0(f02);
            if (z4) {
                byte[] bArr = this.f28758f;
                int i4 = this.f28759g;
                if (!q4.u(bArr, i4, i4 + f02)) {
                    throw InvalidProtocolBufferException.d();
                }
            }
            String str = new String(this.f28758f, this.f28759g, f02, p1.f28847a);
            this.f28759g += f02;
            return str;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public boolean e() throws IOException {
            k0(0);
            return f0() != 0;
        }

        public void e0(List<String> list, boolean z4) throws IOException {
            int i4;
            int i5;
            if (t4.b(this.f28762j) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            if (!(list instanceof v1) || z4) {
                do {
                    list.add(d0(z4));
                    if (U()) {
                        return;
                    } else {
                        i4 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i4;
                return;
            }
            v1 v1Var = (v1) list;
            do {
                v1Var.w2(o());
                if (U()) {
                    return;
                } else {
                    i5 = this.f28759g;
                }
            } while (f0() == this.f28762j);
            this.f28759g = i5;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public long f() throws IOException {
            k0(1);
            return a0();
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void g(List<Long> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof z1)) {
                int b5 = t4.b(this.f28762j);
                if (b5 == 0) {
                    do {
                        list.add(Long.valueOf(u()));
                        if (U()) {
                            return;
                        } else {
                            i4 = this.f28759g;
                        }
                    } while (f0() == this.f28762j);
                    this.f28759g = i4;
                    return;
                }
                if (b5 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int f02 = this.f28759g + f0();
                while (this.f28759g < f02) {
                    list.add(Long.valueOf(g0()));
                }
                j0(f02);
                return;
            }
            z1 z1Var = (z1) list;
            int b6 = t4.b(this.f28762j);
            if (b6 == 0) {
                do {
                    z1Var.D2(u());
                    if (U()) {
                        return;
                    } else {
                        i5 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i5;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int f03 = this.f28759g + f0();
            while (this.f28759g < f03) {
                z1Var.D2(g0());
            }
            j0(f03);
        }

        public long g0() throws IOException {
            long j4;
            long j5;
            long j6;
            int i4 = this.f28759g;
            int i5 = this.f28761i;
            if (i5 == i4) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f28758f;
            int i6 = i4 + 1;
            byte b5 = bArr[i4];
            if (b5 >= 0) {
                this.f28759g = i6;
                return b5;
            }
            if (i5 - i6 < 9) {
                return h0();
            }
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
                    int i14 = i12 ^ (bArr[i11] << c.f54879y);
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
                                            if (bArr[i7] < 0) {
                                                throw InvalidProtocolBufferException.f();
                                            }
                                            i7 = i16;
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
            this.f28759g = i7;
            return j4;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public int getTag() {
            return this.f28762j;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public int h() throws IOException {
            k0(0);
            return f0();
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void i(List<Long> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof z1)) {
                int b5 = t4.b(this.f28762j);
                if (b5 == 0) {
                    do {
                        list.add(Long.valueOf(Q()));
                        if (U()) {
                            return;
                        } else {
                            i4 = this.f28759g;
                        }
                    } while (f0() == this.f28762j);
                    this.f28759g = i4;
                    return;
                }
                if (b5 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int f02 = this.f28759g + f0();
                while (this.f28759g < f02) {
                    list.add(Long.valueOf(g0()));
                }
                j0(f02);
                return;
            }
            z1 z1Var = (z1) list;
            int b6 = t4.b(this.f28762j);
            if (b6 == 0) {
                do {
                    z1Var.D2(Q());
                    if (U()) {
                        return;
                    } else {
                        i5 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i5;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int f03 = this.f28759g + f0();
            while (this.f28759g < f03) {
                z1Var.D2(g0());
            }
            j0(f03);
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void j(List<Integer> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof n1)) {
                int b5 = t4.b(this.f28762j);
                if (b5 != 0) {
                    if (b5 != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int f02 = this.f28759g + f0();
                    while (this.f28759g < f02) {
                        list.add(Integer.valueOf(f0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(k()));
                    if (U()) {
                        return;
                    } else {
                        i4 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i4;
                return;
            }
            n1 n1Var = (n1) list;
            int b6 = t4.b(this.f28762j);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int f03 = this.f28759g + f0();
                while (this.f28759g < f03) {
                    n1Var.o2(f0());
                }
                return;
            }
            do {
                n1Var.o2(k());
                if (U()) {
                    return;
                } else {
                    i5 = this.f28759g;
                }
            } while (f0() == this.f28762j);
            this.f28759g = i5;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public int k() throws IOException {
            k0(0);
            return f0();
        }

        @Override // androidx.content.preferences.protobuf.k3
        public int l() throws IOException {
            k0(0);
            return z.b(f0());
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void m(List<Boolean> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof s)) {
                int b5 = t4.b(this.f28762j);
                if (b5 != 0) {
                    if (b5 != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int f02 = this.f28759g + f0();
                    while (this.f28759g < f02) {
                        list.add(Boolean.valueOf(f0() != 0));
                    }
                    j0(f02);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(e()));
                    if (U()) {
                        return;
                    } else {
                        i4 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i4;
                return;
            }
            s sVar = (s) list;
            int b6 = t4.b(this.f28762j);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int f03 = this.f28759g + f0();
                while (this.f28759g < f03) {
                    sVar.N0(f0() != 0);
                }
                j0(f03);
                return;
            }
            do {
                sVar.N0(e());
                if (U()) {
                    return;
                } else {
                    i5 = this.f28759g;
                }
            } while (f0() == this.f28762j);
            this.f28759g = i5;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void n(List<String> list) throws IOException {
            e0(list, true);
        }

        @Override // androidx.content.preferences.protobuf.k3
        public w o() throws IOException {
            k0(2);
            int f02 = f0();
            if (f02 == 0) {
                return w.f28998f;
            }
            i0(f02);
            w s02 = this.f28757e ? w.s0(this.f28758f, this.f28759g, f02) : w.x(this.f28758f, this.f28759g, f02);
            this.f28759g += f02;
            return s02;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public int p() throws IOException {
            k0(0);
            return f0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.content.preferences.protobuf.k3
        public <T> void q(List<T> list, m3<T> m3Var, s0 s0Var) throws IOException {
            int i4;
            if (t4.b(this.f28762j) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int i5 = this.f28762j;
            do {
                list.add(c0(m3Var, s0Var));
                if (U()) {
                    return;
                } else {
                    i4 = this.f28759g;
                }
            } while (f0() == i5);
            this.f28759g = i4;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void r(List<Long> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof z1)) {
                int b5 = t4.b(this.f28762j);
                if (b5 == 1) {
                    do {
                        list.add(Long.valueOf(b()));
                        if (U()) {
                            return;
                        } else {
                            i4 = this.f28759g;
                        }
                    } while (f0() == this.f28762j);
                    this.f28759g = i4;
                    return;
                }
                if (b5 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int f02 = f0();
                q0(f02);
                int i6 = this.f28759g + f02;
                while (this.f28759g < i6) {
                    list.add(Long.valueOf(b0()));
                }
                return;
            }
            z1 z1Var = (z1) list;
            int b6 = t4.b(this.f28762j);
            if (b6 == 1) {
                do {
                    z1Var.D2(b());
                    if (U()) {
                        return;
                    } else {
                        i5 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i5;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int f03 = f0();
            q0(f03);
            int i7 = this.f28759g + f03;
            while (this.f28759g < i7) {
                z1Var.D2(b0());
            }
        }

        @Override // androidx.content.preferences.protobuf.k3
        public double readDouble() throws IOException {
            k0(1);
            return Double.longBitsToDouble(a0());
        }

        @Override // androidx.content.preferences.protobuf.k3
        public float readFloat() throws IOException {
            k0(5);
            return Float.intBitsToFloat(Y());
        }

        @Override // androidx.content.preferences.protobuf.k3
        public <T> T s(m3<T> m3Var, s0 s0Var) throws IOException {
            k0(3);
            return (T) X(m3Var, s0Var);
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void t(List<Integer> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof n1)) {
                int b5 = t4.b(this.f28762j);
                if (b5 != 0) {
                    if (b5 != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int f02 = this.f28759g + f0();
                    while (this.f28759g < f02) {
                        list.add(Integer.valueOf(z.b(f0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(l()));
                    if (U()) {
                        return;
                    } else {
                        i4 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i4;
                return;
            }
            n1 n1Var = (n1) list;
            int b6 = t4.b(this.f28762j);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int f03 = this.f28759g + f0();
                while (this.f28759g < f03) {
                    n1Var.o2(z.b(f0()));
                }
                return;
            }
            do {
                n1Var.o2(l());
                if (U()) {
                    return;
                } else {
                    i5 = this.f28759g;
                }
            } while (f0() == this.f28762j);
            this.f28759g = i5;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public long u() throws IOException {
            k0(0);
            return g0();
        }

        @Override // androidx.content.preferences.protobuf.k3
        public <T> T v(Class<T> cls, s0 s0Var) throws IOException {
            k0(2);
            return (T) c0(f3.a().i(cls), s0Var);
        }

        @Override // androidx.content.preferences.protobuf.k3
        public <T> void w(List<T> list, Class<T> cls, s0 s0Var) throws IOException {
            K(list, f3.a().i(cls), s0Var);
        }

        @Override // androidx.content.preferences.protobuf.k3
        public void x(List<Integer> list) throws IOException {
            int i4;
            int i5;
            if (!(list instanceof n1)) {
                int b5 = t4.b(this.f28762j);
                if (b5 != 0) {
                    if (b5 != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int f02 = this.f28759g + f0();
                    while (this.f28759g < f02) {
                        list.add(Integer.valueOf(f0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(h()));
                    if (U()) {
                        return;
                    } else {
                        i4 = this.f28759g;
                    }
                } while (f0() == this.f28762j);
                this.f28759g = i4;
                return;
            }
            n1 n1Var = (n1) list;
            int b6 = t4.b(this.f28762j);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int f03 = this.f28759g + f0();
                while (this.f28759g < f03) {
                    n1Var.o2(f0());
                }
                return;
            }
            do {
                n1Var.o2(h());
                if (U()) {
                    return;
                } else {
                    i5 = this.f28759g;
                }
            } while (f0() == this.f28762j);
            this.f28759g = i5;
        }

        @Override // androidx.content.preferences.protobuf.k3
        public int y() throws IOException {
            k0(5);
            return Y();
        }

        @Override // androidx.content.preferences.protobuf.k3
        public <T> T z(Class<T> cls, s0 s0Var) throws IOException {
            k0(3);
            return (T) X(f3.a().i(cls), s0Var);
        }
    }

    private m() {
    }

    public static m T(ByteBuffer byteBuffer, boolean z4) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z4);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // androidx.content.preferences.protobuf.k3
    public boolean L() {
        return false;
    }

    public abstract int S();

    m(a aVar) {
    }
}
