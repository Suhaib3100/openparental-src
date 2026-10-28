package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a2;
import android.content.preferences.protobuf.n4;
import android.content.preferences.protobuf.o1;
import android.content.preferences.protobuf.q4;
import android.content.preferences.protobuf.s4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import okhttp3.internal.http2.h;

/* compiled from: BinaryWriter.java */
/* loaded from: classes3.dex */
abstract class n extends u implements s4 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7398e = 4096;

    /* renamed from: f, reason: collision with root package name */
    private static final int f7399f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7400g = 2;

    /* renamed from: a, reason: collision with root package name */
    private final s f7401a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7402b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayDeque<android.content.preferences.protobuf.d> f7403c;

    /* renamed from: d, reason: collision with root package name */
    int f7404d;

    /* compiled from: BinaryWriter.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7405a;

        static {
            int[] iArr = new int[q4.b.values().length];
            f7405a = iArr;
            try {
                iArr[q4.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7405a[q4.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7405a[q4.b.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7405a[q4.b.INT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7405a[q4.b.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7405a[q4.b.SFIXED32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7405a[q4.b.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7405a[q4.b.SINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7405a[q4.b.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7405a[q4.b.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7405a[q4.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7405a[q4.b.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7405a[q4.b.FLOAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7405a[q4.b.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7405a[q4.b.MESSAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7405a[q4.b.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7405a[q4.b.ENUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: BinaryWriter.java */
    private static final class b extends n {

        /* renamed from: h, reason: collision with root package name */
        private ByteBuffer f7406h;

        /* renamed from: i, reason: collision with root package name */
        private int f7407i;

        /* renamed from: j, reason: collision with root package name */
        private int f7408j;

        b(s sVar, int i5) {
            super(sVar, i5, null);
            Z0();
        }

        private int Y0() {
            return this.f7407i - this.f7408j;
        }

        private void Z0() {
            b1(f0());
        }

        private void a1(int i5) {
            b1(g0(i5));
        }

        private void b1(android.content.preferences.protobuf.d dVar) {
            if (!dVar.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer f6 = dVar.f();
            if (!f6.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            b0();
            this.f7403c.addFirst(dVar);
            this.f7406h = f6;
            f6.limit(f6.capacity());
            this.f7406h.position(0);
            this.f7406h.order(ByteOrder.LITTLE_ENDIAN);
            int limit = this.f7406h.limit() - 1;
            this.f7407i = limit;
            this.f7408j = limit;
        }

        private int c1() {
            return this.f7408j + 1;
        }

        private void d1(int i5) {
            ByteBuffer byteBuffer = this.f7406h;
            int i6 = this.f7408j;
            this.f7408j = i6 - 1;
            byteBuffer.put(i6, (byte) (i5 >>> 28));
            int i7 = this.f7408j - 4;
            this.f7408j = i7;
            this.f7406h.putInt(i7 + 1, (i5 & 127) | 128 | ((((i5 >>> 21) & 127) | 128) << 24) | ((((i5 >>> 14) & 127) | 128) << 16) | ((((i5 >>> 7) & 127) | 128) << 8));
        }

        private void e1(int i5) {
            int i6 = this.f7408j - 4;
            this.f7408j = i6;
            this.f7406h.putInt(i6 + 1, (i5 & 127) | 128 | ((266338304 & i5) << 3) | (((2080768 & i5) | 2097152) << 2) | (((i5 & 16256) | 16384) << 1));
        }

        private void f1(int i5) {
            ByteBuffer byteBuffer = this.f7406h;
            int i6 = this.f7408j;
            this.f7408j = i6 - 1;
            byteBuffer.put(i6, (byte) i5);
        }

        private void g1(int i5) {
            int i6 = this.f7408j - 3;
            this.f7408j = i6;
            this.f7406h.putInt(i6, (((i5 & 127) | 128) << 8) | ((2080768 & i5) << 10) | (((i5 & 16256) | 16384) << 9));
        }

        private void h1(int i5) {
            int i6 = this.f7408j - 2;
            this.f7408j = i6;
            this.f7406h.putShort(i6 + 1, (short) ((i5 & 127) | 128 | ((i5 & 16256) << 1)));
        }

        private void i1(long j5) {
            int i5 = this.f7408j - 8;
            this.f7408j = i5;
            this.f7406h.putLong(i5 + 1, (j5 & 127) | 128 | ((71494644084506624L & j5) << 7) | (((558551906910208L & j5) | 562949953421312L) << 6) | (((4363686772736L & j5) | 4398046511104L) << 5) | (((34091302912L & j5) | 34359738368L) << 4) | (((266338304 & j5) | 268435456) << 3) | (((2080768 & j5) | 2097152) << 2) | (((16256 & j5) | h.f31202o) << 1));
        }

        private void j1(long j5) {
            int i5 = this.f7408j - 8;
            this.f7408j = i5;
            this.f7406h.putLong(i5 + 1, (j5 & 127) | 128 | (((71494644084506624L & j5) | 72057594037927936L) << 7) | (((558551906910208L & j5) | 562949953421312L) << 6) | (((4363686772736L & j5) | 4398046511104L) << 5) | (((34091302912L & j5) | 34359738368L) << 4) | (((266338304 & j5) | 268435456) << 3) | (((2080768 & j5) | 2097152) << 2) | (((16256 & j5) | h.f31202o) << 1));
        }

        private void k1(long j5) {
            int i5 = this.f7408j - 5;
            this.f7408j = i5;
            this.f7406h.putLong(i5 - 2, (((j5 & 127) | 128) << 24) | ((34091302912L & j5) << 28) | (((266338304 & j5) | 268435456) << 27) | (((2080768 & j5) | 2097152) << 26) | (((16256 & j5) | h.f31202o) << 25));
        }

        private void l1(long j5) {
            e1((int) j5);
        }

        private void m1(long j5) {
            ByteBuffer byteBuffer = this.f7406h;
            int i5 = this.f7408j;
            this.f7408j = i5 - 1;
            byteBuffer.put(i5, (byte) (j5 >>> 56));
            j1(j5 & 72057594037927935L);
        }

        private void n1(long j5) {
            f1((int) j5);
        }

        private void o1(long j5) {
            int i5 = this.f7408j - 7;
            this.f7408j = i5;
            this.f7406h.putLong(i5, (((j5 & 127) | 128) << 8) | ((558551906910208L & j5) << 14) | (((4363686772736L & j5) | 4398046511104L) << 13) | (((34091302912L & j5) | 34359738368L) << 12) | (((266338304 & j5) | 268435456) << 11) | (((2080768 & j5) | 2097152) << 10) | (((16256 & j5) | h.f31202o) << 9));
        }

        private void p1(long j5) {
            int i5 = this.f7408j - 6;
            this.f7408j = i5;
            this.f7406h.putLong(i5 - 1, (((j5 & 127) | 128) << 16) | ((4363686772736L & j5) << 21) | (((34091302912L & j5) | 34359738368L) << 20) | (((266338304 & j5) | 268435456) << 19) | (((2080768 & j5) | 2097152) << 18) | (((16256 & j5) | h.f31202o) << 17));
        }

        private void q1(long j5) {
            ByteBuffer byteBuffer = this.f7406h;
            int i5 = this.f7408j;
            this.f7408j = i5 - 1;
            byteBuffer.put(i5, (byte) (j5 >>> 63));
            ByteBuffer byteBuffer2 = this.f7406h;
            int i6 = this.f7408j;
            this.f7408j = i6 - 1;
            byteBuffer2.put(i6, (byte) (((j5 >>> 56) & 127) | 128));
            j1(j5 & 72057594037927935L);
        }

        private void r1(long j5) {
            g1((int) j5);
        }

        private void s1(long j5) {
            h1((int) j5);
        }

        @Override // android.content.preferences.protobuf.n
        void A0(long j5) {
            int i5 = this.f7408j - 8;
            this.f7408j = i5;
            this.f7406h.putLong(i5 + 1, j5);
        }

        @Override // android.content.preferences.protobuf.s4
        public void C(int i5, Object obj, j3 j3Var) throws IOException {
            int c02 = c0();
            j3Var.e(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i5, 2);
        }

        @Override // android.content.preferences.protobuf.s4
        public void E(int i5, Object obj) throws IOException {
            R0(i5, 4);
            c3.a().k(obj, this);
            R0(i5, 3);
        }

        @Override // android.content.preferences.protobuf.n
        void F0(int i5) {
            if (i5 >= 0) {
                W0(i5);
            } else {
                X0(i5);
            }
        }

        @Override // android.content.preferences.protobuf.s4
        public void H(int i5, long j5) {
            r0(15);
            N0(j5);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void J(int i5) {
            R0(i5, 4);
        }

        @Override // android.content.preferences.protobuf.n
        void K0(int i5) {
            W0(CodedOutputStream.c1(i5));
        }

        @Override // android.content.preferences.protobuf.n
        void N0(long j5) {
            X0(CodedOutputStream.d1(j5));
        }

        @Override // android.content.preferences.protobuf.s4
        public void Q(int i5, int i6) {
            r0(10);
            K0(i6);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.n
        void Q0(String str) {
            int i5;
            int i6;
            int i7;
            char charAt;
            r0(str.length());
            int length = str.length() - 1;
            this.f7408j -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f7406h.put(this.f7408j + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.f7408j--;
                return;
            }
            this.f7408j += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i7 = this.f7408j) >= 0) {
                    ByteBuffer byteBuffer = this.f7406h;
                    this.f7408j = i7 - 1;
                    byteBuffer.put(i7, (byte) charAt2);
                } else if (charAt2 < 2048 && (i6 = this.f7408j) > 0) {
                    ByteBuffer byteBuffer2 = this.f7406h;
                    this.f7408j = i6 - 1;
                    byteBuffer2.put(i6, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f7406h;
                    int i8 = this.f7408j;
                    this.f7408j = i8 - 1;
                    byteBuffer3.put(i8, (byte) ((charAt2 >>> 6) | 960));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i5 = this.f7408j) > 1) {
                    ByteBuffer byteBuffer4 = this.f7406h;
                    this.f7408j = i5 - 1;
                    byteBuffer4.put(i5, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f7406h;
                    int i9 = this.f7408j;
                    this.f7408j = i9 - 1;
                    byteBuffer5.put(i9, (byte) (((charAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f7406h;
                    int i10 = this.f7408j;
                    this.f7408j = i10 - 1;
                    byteBuffer6.put(i10, (byte) ((charAt2 >>> '\f') | 480));
                } else {
                    if (this.f7408j > 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                ByteBuffer byteBuffer7 = this.f7406h;
                                int i11 = this.f7408j;
                                this.f7408j = i11 - 1;
                                byteBuffer7.put(i11, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer8 = this.f7406h;
                                int i12 = this.f7408j;
                                this.f7408j = i12 - 1;
                                byteBuffer8.put(i12, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer9 = this.f7406h;
                                int i13 = this.f7408j;
                                this.f7408j = i13 - 1;
                                byteBuffer9.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                ByteBuffer byteBuffer10 = this.f7406h;
                                int i14 = this.f7408j;
                                this.f7408j = i14 - 1;
                                byteBuffer10.put(i14, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new n4.d(length - 1, length);
                    }
                    r0(length);
                    length++;
                }
                length--;
            }
        }

        @Override // android.content.preferences.protobuf.n
        void R0(int i5, int i6) {
            W0(q4.c(i5, i6));
        }

        @Override // android.content.preferences.protobuf.s4
        public void S(int i5, Object obj, j3 j3Var) throws IOException {
            R0(i5, 4);
            j3Var.e(obj, this);
            R0(i5, 3);
        }

        @Override // android.content.preferences.protobuf.u
        public void T(byte b6) {
            ByteBuffer byteBuffer = this.f7406h;
            int i5 = this.f7408j;
            this.f7408j = i5 - 1;
            byteBuffer.put(i5, b6);
        }

        @Override // android.content.preferences.protobuf.u
        public void U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (this.f7408j + 1 < remaining) {
                a1(remaining);
            }
            int i5 = this.f7408j - remaining;
            this.f7408j = i5;
            this.f7406h.position(i5 + 1);
            this.f7406h.put(byteBuffer);
        }

        @Override // android.content.preferences.protobuf.u
        public void V(byte[] bArr, int i5, int i6) {
            if (this.f7408j + 1 < i6) {
                a1(i6);
            }
            int i7 = this.f7408j - i6;
            this.f7408j = i7;
            this.f7406h.position(i7 + 1);
            this.f7406h.put(bArr, i5, i6);
        }

        @Override // android.content.preferences.protobuf.u
        public void W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i5 = this.f7408j;
            if (i5 + 1 < remaining) {
                this.f7404d += remaining;
                this.f7403c.addFirst(android.content.preferences.protobuf.d.j(byteBuffer));
                Z0();
            } else {
                int i6 = i5 - remaining;
                this.f7408j = i6;
                this.f7406h.position(i6 + 1);
                this.f7406h.put(byteBuffer);
            }
        }

        @Override // android.content.preferences.protobuf.n
        void W0(int i5) {
            if ((i5 & (-128)) == 0) {
                f1(i5);
                return;
            }
            if ((i5 & (-16384)) == 0) {
                h1(i5);
                return;
            }
            if (((-2097152) & i5) == 0) {
                g1(i5);
            } else if (((-268435456) & i5) == 0) {
                e1(i5);
            } else {
                d1(i5);
            }
        }

        @Override // android.content.preferences.protobuf.u
        public void X(byte[] bArr, int i5, int i6) {
            int i7 = this.f7408j;
            if (i7 + 1 < i6) {
                this.f7404d += i6;
                this.f7403c.addFirst(android.content.preferences.protobuf.d.l(bArr, i5, i6));
                Z0();
            } else {
                int i8 = i7 - i6;
                this.f7408j = i8;
                this.f7406h.position(i8 + 1);
                this.f7406h.put(bArr, i5, i6);
            }
        }

        @Override // android.content.preferences.protobuf.n
        void X0(long j5) {
            switch (n.a0(j5)) {
                case 1:
                    f1((int) j5);
                    break;
                case 2:
                    h1((int) j5);
                    break;
                case 3:
                    g1((int) j5);
                    break;
                case 4:
                    e1((int) j5);
                    break;
                case 5:
                    k1(j5);
                    break;
                case 6:
                    p1(j5);
                    break;
                case 7:
                    o1(j5);
                    break;
                case 8:
                    i1(j5);
                    break;
                case 9:
                    m1(j5);
                    break;
                case 10:
                    q1(j5);
                    break;
            }
        }

        @Override // android.content.preferences.protobuf.s4
        public void b(int i5, int i6) {
            r0(10);
            W0(i6);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.n
        void b0() {
            ByteBuffer byteBuffer = this.f7406h;
            if (byteBuffer != null) {
                int i5 = this.f7404d;
                int i6 = this.f7407i;
                int i7 = this.f7408j;
                this.f7404d = (i6 - i7) + i5;
                byteBuffer.position(i7 + 1);
                this.f7406h = null;
                this.f7408j = 0;
                this.f7407i = 0;
            }
        }

        @Override // android.content.preferences.protobuf.n
        public int c0() {
            return (this.f7407i - this.f7408j) + this.f7404d;
        }

        @Override // android.content.preferences.protobuf.s4
        public void d(int i5, int i6) {
            r0(9);
            x0(i6);
            R0(i5, 5);
        }

        @Override // android.content.preferences.protobuf.s4
        public void i(int i5, long j5) {
            r0(13);
            A0(j5);
            R0(i5, 1);
        }

        @Override // android.content.preferences.protobuf.s4
        public void o(int i5, String str) {
            int c02 = c0();
            Q0(str);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i5, 2);
        }

        @Override // android.content.preferences.protobuf.s4
        public void p(int i5, long j5) {
            r0(15);
            X0(j5);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void q(int i5, Object obj) throws IOException {
            int c02 = c0();
            c3.a().k(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i5, 2);
        }

        @Override // android.content.preferences.protobuf.n
        void r0(int i5) {
            if (this.f7408j + 1 < i5) {
                a1(i5);
            }
        }

        @Override // android.content.preferences.protobuf.n
        void s0(boolean z5) {
            T(z5 ? (byte) 1 : (byte) 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void t(int i5, boolean z5) {
            r0(6);
            T(z5 ? (byte) 1 : (byte) 0);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void v(int i5) {
            R0(i5, 3);
        }

        @Override // android.content.preferences.protobuf.s4
        public void w(int i5, int i6) {
            r0(15);
            F0(i6);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.n
        void x0(int i5) {
            int i6 = this.f7408j - 4;
            this.f7408j = i6;
            this.f7406h.putInt(i6 + 1, i5);
        }

        @Override // android.content.preferences.protobuf.s4
        public void z(int i5, w wVar) {
            try {
                wVar.y0(this);
                r0(10);
                W0(wVar.size());
                R0(i5, 2);
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* compiled from: BinaryWriter.java */
    private static final class c extends n {

        /* renamed from: h, reason: collision with root package name */
        private android.content.preferences.protobuf.d f7409h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f7410i;

        /* renamed from: j, reason: collision with root package name */
        private int f7411j;

        /* renamed from: k, reason: collision with root package name */
        private int f7412k;

        /* renamed from: l, reason: collision with root package name */
        private int f7413l;

        /* renamed from: m, reason: collision with root package name */
        private int f7414m;

        /* renamed from: n, reason: collision with root package name */
        private int f7415n;

        c(s sVar, int i5) {
            super(sVar, i5, null);
            Z0();
        }

        private void Z0() {
            b1(j0());
        }

        private void a1(int i5) {
            b1(k0(i5));
        }

        private void b1(android.content.preferences.protobuf.d dVar) {
            if (!dVar.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            b0();
            this.f7403c.addFirst(dVar);
            this.f7409h = dVar;
            this.f7410i = dVar.a();
            int b6 = dVar.b();
            this.f7412k = dVar.e() + b6;
            int g5 = b6 + dVar.g();
            this.f7411j = g5;
            this.f7413l = g5 - 1;
            int i5 = this.f7412k - 1;
            this.f7414m = i5;
            this.f7415n = i5;
        }

        private void d1(int i5) {
            byte[] bArr = this.f7410i;
            int i6 = this.f7415n;
            int i7 = i6 - 1;
            bArr[i6] = (byte) (i5 >>> 28);
            int i8 = i7 - 1;
            bArr[i7] = (byte) (((i5 >>> 21) & 127) | 128);
            int i9 = i8 - 1;
            bArr[i8] = (byte) (((i5 >>> 14) & 127) | 128);
            int i10 = i9 - 1;
            bArr[i9] = (byte) (((i5 >>> 7) & 127) | 128);
            this.f7415n = i10 - 1;
            bArr[i10] = (byte) ((i5 & 127) | 128);
        }

        private void e1(int i5) {
            byte[] bArr = this.f7410i;
            int i6 = this.f7415n;
            int i7 = i6 - 1;
            bArr[i6] = (byte) (i5 >>> 21);
            int i8 = i7 - 1;
            bArr[i7] = (byte) (((i5 >>> 14) & 127) | 128);
            int i9 = i8 - 1;
            bArr[i8] = (byte) (((i5 >>> 7) & 127) | 128);
            this.f7415n = i9 - 1;
            bArr[i9] = (byte) ((i5 & 127) | 128);
        }

        private void f1(int i5) {
            byte[] bArr = this.f7410i;
            int i6 = this.f7415n;
            this.f7415n = i6 - 1;
            bArr[i6] = (byte) i5;
        }

        private void g1(int i5) {
            byte[] bArr = this.f7410i;
            int i6 = this.f7415n;
            int i7 = i6 - 1;
            bArr[i6] = (byte) (i5 >>> 14);
            int i8 = i7 - 1;
            bArr[i7] = (byte) (((i5 >>> 7) & 127) | 128);
            this.f7415n = i8 - 1;
            bArr[i8] = (byte) ((i5 & 127) | 128);
        }

        private void h1(int i5) {
            byte[] bArr = this.f7410i;
            int i6 = this.f7415n;
            int i7 = i6 - 1;
            bArr[i6] = (byte) (i5 >>> 7);
            this.f7415n = i7 - 1;
            bArr[i7] = (byte) ((i5 & 127) | 128);
        }

        private void i1(long j5) {
            byte[] bArr = this.f7410i;
            int i5 = this.f7415n;
            int i6 = i5 - 1;
            bArr[i5] = (byte) (j5 >>> 49);
            int i7 = i6 - 1;
            bArr[i6] = (byte) (((j5 >>> 42) & 127) | 128);
            int i8 = i7 - 1;
            bArr[i7] = (byte) (((j5 >>> 35) & 127) | 128);
            int i9 = i8 - 1;
            bArr[i8] = (byte) (((j5 >>> 28) & 127) | 128);
            int i10 = i9 - 1;
            bArr[i9] = (byte) (((j5 >>> 21) & 127) | 128);
            int i11 = i10 - 1;
            bArr[i10] = (byte) (((j5 >>> 14) & 127) | 128);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((j5 >>> 7) & 127) | 128);
            this.f7415n = i12 - 1;
            bArr[i12] = (byte) ((j5 & 127) | 128);
        }

        private void j1(long j5) {
            byte[] bArr = this.f7410i;
            int i5 = this.f7415n;
            int i6 = i5 - 1;
            bArr[i5] = (byte) (j5 >>> 28);
            int i7 = i6 - 1;
            bArr[i6] = (byte) (((j5 >>> 21) & 127) | 128);
            int i8 = i7 - 1;
            bArr[i7] = (byte) (((j5 >>> 14) & 127) | 128);
            int i9 = i8 - 1;
            bArr[i8] = (byte) (((j5 >>> 7) & 127) | 128);
            this.f7415n = i9 - 1;
            bArr[i9] = (byte) ((j5 & 127) | 128);
        }

        private void k1(long j5) {
            byte[] bArr = this.f7410i;
            int i5 = this.f7415n;
            int i6 = i5 - 1;
            bArr[i5] = (byte) (j5 >>> 21);
            int i7 = i6 - 1;
            bArr[i6] = (byte) (((j5 >>> 14) & 127) | 128);
            int i8 = i7 - 1;
            bArr[i7] = (byte) (((j5 >>> 7) & 127) | 128);
            this.f7415n = i8 - 1;
            bArr[i8] = (byte) ((j5 & 127) | 128);
        }

        private void l1(long j5) {
            byte[] bArr = this.f7410i;
            int i5 = this.f7415n;
            int i6 = i5 - 1;
            bArr[i5] = (byte) (j5 >>> 56);
            int i7 = i6 - 1;
            bArr[i6] = (byte) (((j5 >>> 49) & 127) | 128);
            int i8 = i7 - 1;
            bArr[i7] = (byte) (((j5 >>> 42) & 127) | 128);
            int i9 = i8 - 1;
            bArr[i8] = (byte) (((j5 >>> 35) & 127) | 128);
            int i10 = i9 - 1;
            bArr[i9] = (byte) (((j5 >>> 28) & 127) | 128);
            int i11 = i10 - 1;
            bArr[i10] = (byte) (((j5 >>> 21) & 127) | 128);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((j5 >>> 14) & 127) | 128);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((j5 >>> 7) & 127) | 128);
            this.f7415n = i13 - 1;
            bArr[i13] = (byte) ((j5 & 127) | 128);
        }

        private void m1(long j5) {
            byte[] bArr = this.f7410i;
            int i5 = this.f7415n;
            this.f7415n = i5 - 1;
            bArr[i5] = (byte) j5;
        }

        private void n1(long j5) {
            byte[] bArr = this.f7410i;
            int i5 = this.f7415n;
            int i6 = i5 - 1;
            bArr[i5] = (byte) (j5 >>> 42);
            int i7 = i6 - 1;
            bArr[i6] = (byte) (((j5 >>> 35) & 127) | 128);
            int i8 = i7 - 1;
            bArr[i7] = (byte) (((j5 >>> 28) & 127) | 128);
            int i9 = i8 - 1;
            bArr[i8] = (byte) (((j5 >>> 21) & 127) | 128);
            int i10 = i9 - 1;
            bArr[i9] = (byte) (((j5 >>> 14) & 127) | 128);
            int i11 = i10 - 1;
            bArr[i10] = (byte) (((j5 >>> 7) & 127) | 128);
            this.f7415n = i11 - 1;
            bArr[i11] = (byte) ((j5 & 127) | 128);
        }

        private void o1(long j5) {
            byte[] bArr = this.f7410i;
            int i5 = this.f7415n;
            int i6 = i5 - 1;
            bArr[i5] = (byte) (j5 >>> 35);
            int i7 = i6 - 1;
            bArr[i6] = (byte) (((j5 >>> 28) & 127) | 128);
            int i8 = i7 - 1;
            bArr[i7] = (byte) (((j5 >>> 21) & 127) | 128);
            int i9 = i8 - 1;
            bArr[i8] = (byte) (((j5 >>> 14) & 127) | 128);
            int i10 = i9 - 1;
            bArr[i9] = (byte) (((j5 >>> 7) & 127) | 128);
            this.f7415n = i10 - 1;
            bArr[i10] = (byte) ((j5 & 127) | 128);
        }

        private void p1(long j5) {
            byte[] bArr = this.f7410i;
            int i5 = this.f7415n;
            int i6 = i5 - 1;
            bArr[i5] = (byte) (j5 >>> 63);
            int i7 = i6 - 1;
            bArr[i6] = (byte) (((j5 >>> 56) & 127) | 128);
            int i8 = i7 - 1;
            bArr[i7] = (byte) (((j5 >>> 49) & 127) | 128);
            int i9 = i8 - 1;
            bArr[i8] = (byte) (((j5 >>> 42) & 127) | 128);
            int i10 = i9 - 1;
            bArr[i9] = (byte) (((j5 >>> 35) & 127) | 128);
            int i11 = i10 - 1;
            bArr[i10] = (byte) (((j5 >>> 28) & 127) | 128);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((j5 >>> 21) & 127) | 128);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((j5 >>> 14) & 127) | 128);
            int i14 = i13 - 1;
            bArr[i13] = (byte) (((j5 >>> 7) & 127) | 128);
            this.f7415n = i14 - 1;
            bArr[i14] = (byte) ((j5 & 127) | 128);
        }

        private void q1(long j5) {
            byte[] bArr = this.f7410i;
            int i5 = this.f7415n;
            int i6 = i5 - 1;
            bArr[i5] = (byte) (((int) j5) >>> 14);
            int i7 = i6 - 1;
            bArr[i6] = (byte) (((j5 >>> 7) & 127) | 128);
            this.f7415n = i7 - 1;
            bArr[i7] = (byte) ((j5 & 127) | 128);
        }

        private void r1(long j5) {
            byte[] bArr = this.f7410i;
            int i5 = this.f7415n;
            int i6 = i5 - 1;
            bArr[i5] = (byte) (j5 >>> 7);
            this.f7415n = i6 - 1;
            bArr[i6] = (byte) ((((int) j5) & 127) | 128);
        }

        @Override // android.content.preferences.protobuf.n
        void A0(long j5) {
            byte[] bArr = this.f7410i;
            int i5 = this.f7415n;
            int i6 = i5 - 1;
            bArr[i5] = (byte) (((int) (j5 >> 56)) & 255);
            int i7 = i6 - 1;
            bArr[i6] = (byte) (((int) (j5 >> 48)) & 255);
            int i8 = i7 - 1;
            bArr[i7] = (byte) (((int) (j5 >> 40)) & 255);
            int i9 = i8 - 1;
            bArr[i8] = (byte) (((int) (j5 >> 32)) & 255);
            int i10 = i9 - 1;
            bArr[i9] = (byte) (((int) (j5 >> 24)) & 255);
            int i11 = i10 - 1;
            bArr[i10] = (byte) (((int) (j5 >> 16)) & 255);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((int) (j5 >> 8)) & 255);
            this.f7415n = i12 - 1;
            bArr[i12] = (byte) (((int) j5) & 255);
        }

        @Override // android.content.preferences.protobuf.s4
        public void C(int i5, Object obj, j3 j3Var) throws IOException {
            int c02 = c0();
            j3Var.e(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i5, 2);
        }

        @Override // android.content.preferences.protobuf.s4
        public void E(int i5, Object obj) throws IOException {
            R0(i5, 4);
            c3.a().k(obj, this);
            R0(i5, 3);
        }

        @Override // android.content.preferences.protobuf.n
        void F0(int i5) {
            if (i5 >= 0) {
                W0(i5);
            } else {
                X0(i5);
            }
        }

        @Override // android.content.preferences.protobuf.s4
        public void H(int i5, long j5) throws IOException {
            r0(15);
            N0(j5);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void J(int i5) {
            R0(i5, 4);
        }

        @Override // android.content.preferences.protobuf.n
        void K0(int i5) {
            W0(CodedOutputStream.c1(i5));
        }

        @Override // android.content.preferences.protobuf.n
        void N0(long j5) {
            X0(CodedOutputStream.d1(j5));
        }

        @Override // android.content.preferences.protobuf.s4
        public void Q(int i5, int i6) throws IOException {
            r0(10);
            K0(i6);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.n
        void Q0(String str) {
            int i5;
            int i6;
            int i7;
            char charAt;
            r0(str.length());
            int length = str.length() - 1;
            this.f7415n -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f7410i[this.f7415n + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.f7415n--;
                return;
            }
            this.f7415n += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i7 = this.f7415n) > this.f7413l) {
                    byte[] bArr = this.f7410i;
                    this.f7415n = i7 - 1;
                    bArr[i7] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i6 = this.f7415n) > this.f7411j) {
                    byte[] bArr2 = this.f7410i;
                    int i8 = i6 - 1;
                    bArr2[i6] = (byte) ((charAt2 & '?') | 128);
                    this.f7415n = i8 - 1;
                    bArr2[i8] = (byte) ((charAt2 >>> 6) | 960);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i5 = this.f7415n) > this.f7411j + 1) {
                    byte[] bArr3 = this.f7410i;
                    int i9 = i5 - 1;
                    bArr3[i5] = (byte) ((charAt2 & '?') | 128);
                    int i10 = i9 - 1;
                    bArr3[i9] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.f7415n = i10 - 1;
                    bArr3[i10] = (byte) ((charAt2 >>> '\f') | 480);
                } else {
                    if (this.f7415n > this.f7411j + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr4 = this.f7410i;
                                int i11 = this.f7415n;
                                int i12 = i11 - 1;
                                bArr4[i11] = (byte) ((codePoint & 63) | 128);
                                int i13 = i12 - 1;
                                bArr4[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i14 = i13 - 1;
                                bArr4[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.f7415n = i14 - 1;
                                bArr4[i14] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new n4.d(length - 1, length);
                    }
                    r0(length);
                    length++;
                }
                length--;
            }
        }

        @Override // android.content.preferences.protobuf.n
        void R0(int i5, int i6) {
            W0(q4.c(i5, i6));
        }

        @Override // android.content.preferences.protobuf.s4
        public void S(int i5, Object obj, j3 j3Var) throws IOException {
            R0(i5, 4);
            j3Var.e(obj, this);
            R0(i5, 3);
        }

        @Override // android.content.preferences.protobuf.u
        public void T(byte b6) {
            byte[] bArr = this.f7410i;
            int i5 = this.f7415n;
            this.f7415n = i5 - 1;
            bArr[i5] = b6;
        }

        @Override // android.content.preferences.protobuf.u
        public void U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (this.f7415n - this.f7413l < remaining) {
                a1(remaining);
            }
            int i5 = this.f7415n - remaining;
            this.f7415n = i5;
            byteBuffer.get(this.f7410i, i5 + 1, remaining);
        }

        @Override // android.content.preferences.protobuf.u
        public void V(byte[] bArr, int i5, int i6) {
            if (this.f7415n - this.f7413l < i6) {
                a1(i6);
            }
            int i7 = this.f7415n - i6;
            this.f7415n = i7;
            System.arraycopy(bArr, i5, this.f7410i, i7 + 1, i6);
        }

        @Override // android.content.preferences.protobuf.u
        public void W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (this.f7415n - this.f7413l < remaining) {
                this.f7404d += remaining;
                this.f7403c.addFirst(android.content.preferences.protobuf.d.j(byteBuffer));
                Z0();
            }
            int i5 = this.f7415n - remaining;
            this.f7415n = i5;
            byteBuffer.get(this.f7410i, i5 + 1, remaining);
        }

        @Override // android.content.preferences.protobuf.n
        void W0(int i5) {
            if ((i5 & (-128)) == 0) {
                f1(i5);
                return;
            }
            if ((i5 & (-16384)) == 0) {
                h1(i5);
                return;
            }
            if (((-2097152) & i5) == 0) {
                g1(i5);
            } else if (((-268435456) & i5) == 0) {
                e1(i5);
            } else {
                d1(i5);
            }
        }

        @Override // android.content.preferences.protobuf.u
        public void X(byte[] bArr, int i5, int i6) {
            int i7 = this.f7415n;
            if (i7 - this.f7413l < i6) {
                this.f7404d += i6;
                this.f7403c.addFirst(android.content.preferences.protobuf.d.l(bArr, i5, i6));
                Z0();
            } else {
                int i8 = i7 - i6;
                this.f7415n = i8;
                System.arraycopy(bArr, i5, this.f7410i, i8 + 1, i6);
            }
        }

        @Override // android.content.preferences.protobuf.n
        void X0(long j5) {
            switch (n.a0(j5)) {
                case 1:
                    m1(j5);
                    break;
                case 2:
                    r1(j5);
                    break;
                case 3:
                    q1(j5);
                    break;
                case 4:
                    k1(j5);
                    break;
                case 5:
                    j1(j5);
                    break;
                case 6:
                    o1(j5);
                    break;
                case 7:
                    n1(j5);
                    break;
                case 8:
                    i1(j5);
                    break;
                case 9:
                    l1(j5);
                    break;
                case 10:
                    p1(j5);
                    break;
            }
        }

        int Y0() {
            return this.f7414m - this.f7415n;
        }

        @Override // android.content.preferences.protobuf.s4
        public void b(int i5, int i6) throws IOException {
            r0(10);
            W0(i6);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.n
        void b0() {
            android.content.preferences.protobuf.d dVar = this.f7409h;
            if (dVar != null) {
                int i5 = this.f7404d;
                int i6 = this.f7414m;
                int i7 = this.f7415n;
                this.f7404d = (i6 - i7) + i5;
                dVar.h((i7 - dVar.b()) + 1);
                this.f7409h = null;
                this.f7415n = 0;
                this.f7414m = 0;
            }
        }

        @Override // android.content.preferences.protobuf.n
        public int c0() {
            return (this.f7414m - this.f7415n) + this.f7404d;
        }

        int c1() {
            return this.f7415n - this.f7413l;
        }

        @Override // android.content.preferences.protobuf.s4
        public void d(int i5, int i6) throws IOException {
            r0(9);
            x0(i6);
            R0(i5, 5);
        }

        @Override // android.content.preferences.protobuf.s4
        public void i(int i5, long j5) throws IOException {
            r0(13);
            A0(j5);
            R0(i5, 1);
        }

        @Override // android.content.preferences.protobuf.s4
        public void o(int i5, String str) throws IOException {
            int c02 = c0();
            Q0(str);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i5, 2);
        }

        @Override // android.content.preferences.protobuf.s4
        public void p(int i5, long j5) throws IOException {
            r0(15);
            X0(j5);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void q(int i5, Object obj) throws IOException {
            int c02 = c0();
            c3.a().k(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i5, 2);
        }

        @Override // android.content.preferences.protobuf.n
        void r0(int i5) {
            if (this.f7415n - this.f7413l < i5) {
                a1(i5);
            }
        }

        @Override // android.content.preferences.protobuf.n
        void s0(boolean z5) {
            T(z5 ? (byte) 1 : (byte) 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void t(int i5, boolean z5) throws IOException {
            r0(6);
            T(z5 ? (byte) 1 : (byte) 0);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void v(int i5) {
            R0(i5, 3);
        }

        @Override // android.content.preferences.protobuf.s4
        public void w(int i5, int i6) throws IOException {
            r0(15);
            F0(i6);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.n
        void x0(int i5) {
            byte[] bArr = this.f7410i;
            int i6 = this.f7415n;
            int i7 = i6 - 1;
            bArr[i6] = (byte) ((i5 >> 24) & 255);
            int i8 = i7 - 1;
            bArr[i7] = (byte) ((i5 >> 16) & 255);
            int i9 = i8 - 1;
            bArr[i8] = (byte) ((i5 >> 8) & 255);
            this.f7415n = i9 - 1;
            bArr[i9] = (byte) (i5 & 255);
        }

        @Override // android.content.preferences.protobuf.s4
        public void z(int i5, w wVar) throws IOException {
            try {
                wVar.y0(this);
                r0(10);
                W0(wVar.size());
                R0(i5, 2);
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* compiled from: BinaryWriter.java */
    private static final class d extends n {

        /* renamed from: h, reason: collision with root package name */
        private ByteBuffer f7416h;

        /* renamed from: i, reason: collision with root package name */
        private long f7417i;

        /* renamed from: j, reason: collision with root package name */
        private long f7418j;

        /* renamed from: k, reason: collision with root package name */
        private long f7419k;

        d(s sVar, int i5) {
            super(sVar, i5, null);
            c1();
        }

        static boolean Y0() {
            return m4.T();
        }

        private int Z0() {
            return (int) (this.f7419k - this.f7417i);
        }

        private int a1() {
            return (int) (this.f7418j - this.f7419k);
        }

        private static boolean b1() {
            return m4.T();
        }

        private void c1() {
            e1(f0());
        }

        private void d1(int i5) {
            e1(g0(i5));
        }

        private void e1(android.content.preferences.protobuf.d dVar) {
            if (!dVar.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer f6 = dVar.f();
            if (!f6.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            b0();
            this.f7403c.addFirst(dVar);
            this.f7416h = f6;
            f6.limit(f6.capacity());
            this.f7416h.position(0);
            long i5 = m4.i(this.f7416h);
            this.f7417i = i5;
            long limit = i5 + (this.f7416h.limit() - 1);
            this.f7418j = limit;
            this.f7419k = limit;
        }

        private int f1() {
            return Z0() + 1;
        }

        private void g1(int i5) {
            long j5 = this.f7419k;
            this.f7419k = j5 - 1;
            m4.b0(j5, (byte) (i5 >>> 28));
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (((i5 >>> 21) & 127) | 128));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) (((i5 >>> 14) & 127) | 128));
            long j8 = this.f7419k;
            this.f7419k = j8 - 1;
            m4.b0(j8, (byte) (((i5 >>> 7) & 127) | 128));
            long j9 = this.f7419k;
            this.f7419k = j9 - 1;
            m4.b0(j9, (byte) ((i5 & 127) | 128));
        }

        private void h1(int i5) {
            long j5 = this.f7419k;
            this.f7419k = j5 - 1;
            m4.b0(j5, (byte) (i5 >>> 21));
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (((i5 >>> 14) & 127) | 128));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) (((i5 >>> 7) & 127) | 128));
            long j8 = this.f7419k;
            this.f7419k = j8 - 1;
            m4.b0(j8, (byte) ((i5 & 127) | 128));
        }

        private void i1(int i5) {
            long j5 = this.f7419k;
            this.f7419k = j5 - 1;
            m4.b0(j5, (byte) i5);
        }

        private void j1(int i5) {
            long j5 = this.f7419k;
            this.f7419k = j5 - 1;
            m4.b0(j5, (byte) (i5 >>> 14));
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (((i5 >>> 7) & 127) | 128));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) ((i5 & 127) | 128));
        }

        private void k1(int i5) {
            long j5 = this.f7419k;
            this.f7419k = j5 - 1;
            m4.b0(j5, (byte) (i5 >>> 7));
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) ((i5 & 127) | 128));
        }

        private void l1(long j5) {
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (j5 >>> 49));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) (((j5 >>> 42) & 127) | 128));
            long j8 = this.f7419k;
            this.f7419k = j8 - 1;
            m4.b0(j8, (byte) (((j5 >>> 35) & 127) | 128));
            long j9 = this.f7419k;
            this.f7419k = j9 - 1;
            m4.b0(j9, (byte) (((j5 >>> 28) & 127) | 128));
            long j10 = this.f7419k;
            this.f7419k = j10 - 1;
            m4.b0(j10, (byte) (((j5 >>> 21) & 127) | 128));
            long j11 = this.f7419k;
            this.f7419k = j11 - 1;
            m4.b0(j11, (byte) (((j5 >>> 14) & 127) | 128));
            long j12 = this.f7419k;
            this.f7419k = j12 - 1;
            m4.b0(j12, (byte) (((j5 >>> 7) & 127) | 128));
            long j13 = this.f7419k;
            this.f7419k = j13 - 1;
            m4.b0(j13, (byte) ((j5 & 127) | 128));
        }

        private void m1(long j5) {
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (j5 >>> 28));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) (((j5 >>> 21) & 127) | 128));
            long j8 = this.f7419k;
            this.f7419k = j8 - 1;
            m4.b0(j8, (byte) (((j5 >>> 14) & 127) | 128));
            long j9 = this.f7419k;
            this.f7419k = j9 - 1;
            m4.b0(j9, (byte) (((j5 >>> 7) & 127) | 128));
            long j10 = this.f7419k;
            this.f7419k = j10 - 1;
            m4.b0(j10, (byte) ((j5 & 127) | 128));
        }

        private void n1(long j5) {
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (j5 >>> 21));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) (((j5 >>> 14) & 127) | 128));
            long j8 = this.f7419k;
            this.f7419k = j8 - 1;
            m4.b0(j8, (byte) (((j5 >>> 7) & 127) | 128));
            long j9 = this.f7419k;
            this.f7419k = j9 - 1;
            m4.b0(j9, (byte) ((j5 & 127) | 128));
        }

        private void o1(long j5) {
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (j5 >>> 56));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) (((j5 >>> 49) & 127) | 128));
            long j8 = this.f7419k;
            this.f7419k = j8 - 1;
            m4.b0(j8, (byte) (((j5 >>> 42) & 127) | 128));
            long j9 = this.f7419k;
            this.f7419k = j9 - 1;
            m4.b0(j9, (byte) (((j5 >>> 35) & 127) | 128));
            long j10 = this.f7419k;
            this.f7419k = j10 - 1;
            m4.b0(j10, (byte) (((j5 >>> 28) & 127) | 128));
            long j11 = this.f7419k;
            this.f7419k = j11 - 1;
            m4.b0(j11, (byte) (((j5 >>> 21) & 127) | 128));
            long j12 = this.f7419k;
            this.f7419k = j12 - 1;
            m4.b0(j12, (byte) (((j5 >>> 14) & 127) | 128));
            long j13 = this.f7419k;
            this.f7419k = j13 - 1;
            m4.b0(j13, (byte) (((j5 >>> 7) & 127) | 128));
            long j14 = this.f7419k;
            this.f7419k = j14 - 1;
            m4.b0(j14, (byte) ((j5 & 127) | 128));
        }

        private void p1(long j5) {
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) j5);
        }

        private void q1(long j5) {
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (j5 >>> 42));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) (((j5 >>> 35) & 127) | 128));
            long j8 = this.f7419k;
            this.f7419k = j8 - 1;
            m4.b0(j8, (byte) (((j5 >>> 28) & 127) | 128));
            long j9 = this.f7419k;
            this.f7419k = j9 - 1;
            m4.b0(j9, (byte) (((j5 >>> 21) & 127) | 128));
            long j10 = this.f7419k;
            this.f7419k = j10 - 1;
            m4.b0(j10, (byte) (((j5 >>> 14) & 127) | 128));
            long j11 = this.f7419k;
            this.f7419k = j11 - 1;
            m4.b0(j11, (byte) (((j5 >>> 7) & 127) | 128));
            long j12 = this.f7419k;
            this.f7419k = j12 - 1;
            m4.b0(j12, (byte) ((j5 & 127) | 128));
        }

        private void r1(long j5) {
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (j5 >>> 35));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) (((j5 >>> 28) & 127) | 128));
            long j8 = this.f7419k;
            this.f7419k = j8 - 1;
            m4.b0(j8, (byte) (((j5 >>> 21) & 127) | 128));
            long j9 = this.f7419k;
            this.f7419k = j9 - 1;
            m4.b0(j9, (byte) (((j5 >>> 14) & 127) | 128));
            long j10 = this.f7419k;
            this.f7419k = j10 - 1;
            m4.b0(j10, (byte) (((j5 >>> 7) & 127) | 128));
            long j11 = this.f7419k;
            this.f7419k = j11 - 1;
            m4.b0(j11, (byte) ((j5 & 127) | 128));
        }

        private void s1(long j5) {
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (j5 >>> 63));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) (((j5 >>> 56) & 127) | 128));
            long j8 = this.f7419k;
            this.f7419k = j8 - 1;
            m4.b0(j8, (byte) (((j5 >>> 49) & 127) | 128));
            long j9 = this.f7419k;
            this.f7419k = j9 - 1;
            m4.b0(j9, (byte) (((j5 >>> 42) & 127) | 128));
            long j10 = this.f7419k;
            this.f7419k = j10 - 1;
            m4.b0(j10, (byte) (((j5 >>> 35) & 127) | 128));
            long j11 = this.f7419k;
            this.f7419k = j11 - 1;
            m4.b0(j11, (byte) (((j5 >>> 28) & 127) | 128));
            long j12 = this.f7419k;
            this.f7419k = j12 - 1;
            m4.b0(j12, (byte) (((j5 >>> 21) & 127) | 128));
            long j13 = this.f7419k;
            this.f7419k = j13 - 1;
            m4.b0(j13, (byte) (((j5 >>> 14) & 127) | 128));
            long j14 = this.f7419k;
            this.f7419k = j14 - 1;
            m4.b0(j14, (byte) (((j5 >>> 7) & 127) | 128));
            long j15 = this.f7419k;
            this.f7419k = j15 - 1;
            m4.b0(j15, (byte) ((j5 & 127) | 128));
        }

        private void t1(long j5) {
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (((int) j5) >>> 14));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) (((j5 >>> 7) & 127) | 128));
            long j8 = this.f7419k;
            this.f7419k = j8 - 1;
            m4.b0(j8, (byte) ((j5 & 127) | 128));
        }

        private void u1(long j5) {
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (j5 >>> 7));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) ((((int) j5) & 127) | 128));
        }

        @Override // android.content.preferences.protobuf.n
        void A0(long j5) {
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) (((int) (j5 >> 56)) & 255));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) (((int) (j5 >> 48)) & 255));
            long j8 = this.f7419k;
            this.f7419k = j8 - 1;
            m4.b0(j8, (byte) (((int) (j5 >> 40)) & 255));
            long j9 = this.f7419k;
            this.f7419k = j9 - 1;
            m4.b0(j9, (byte) (((int) (j5 >> 32)) & 255));
            long j10 = this.f7419k;
            this.f7419k = j10 - 1;
            m4.b0(j10, (byte) (((int) (j5 >> 24)) & 255));
            long j11 = this.f7419k;
            this.f7419k = j11 - 1;
            m4.b0(j11, (byte) (((int) (j5 >> 16)) & 255));
            long j12 = this.f7419k;
            this.f7419k = j12 - 1;
            m4.b0(j12, (byte) (((int) (j5 >> 8)) & 255));
            long j13 = this.f7419k;
            this.f7419k = j13 - 1;
            m4.b0(j13, (byte) (((int) j5) & 255));
        }

        @Override // android.content.preferences.protobuf.s4
        public void C(int i5, Object obj, j3 j3Var) throws IOException {
            int c02 = c0();
            j3Var.e(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i5, 2);
        }

        @Override // android.content.preferences.protobuf.s4
        public void E(int i5, Object obj) throws IOException {
            R0(i5, 4);
            c3.a().k(obj, this);
            R0(i5, 3);
        }

        @Override // android.content.preferences.protobuf.n
        void F0(int i5) {
            if (i5 >= 0) {
                W0(i5);
            } else {
                X0(i5);
            }
        }

        @Override // android.content.preferences.protobuf.s4
        public void H(int i5, long j5) {
            r0(15);
            N0(j5);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void J(int i5) {
            R0(i5, 4);
        }

        @Override // android.content.preferences.protobuf.n
        void K0(int i5) {
            W0(CodedOutputStream.c1(i5));
        }

        @Override // android.content.preferences.protobuf.n
        void N0(long j5) {
            X0(CodedOutputStream.d1(j5));
        }

        @Override // android.content.preferences.protobuf.s4
        public void Q(int i5, int i6) {
            r0(10);
            K0(i6);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.n
        void Q0(String str) {
            char charAt;
            r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                long j5 = this.f7419k;
                this.f7419k = j5 - 1;
                m4.b0(j5, (byte) charAt);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128) {
                    long j6 = this.f7419k;
                    if (j6 >= this.f7417i) {
                        this.f7419k = j6 - 1;
                        m4.b0(j6, (byte) charAt2);
                        length--;
                    }
                }
                if (charAt2 < 2048) {
                    long j7 = this.f7419k;
                    if (j7 > this.f7417i) {
                        this.f7419k = j7 - 1;
                        m4.b0(j7, (byte) ((charAt2 & '?') | 128));
                        long j8 = this.f7419k;
                        this.f7419k = j8 - 1;
                        m4.b0(j8, (byte) ((charAt2 >>> 6) | 960));
                        length--;
                    }
                }
                if (charAt2 < 55296 || 57343 < charAt2) {
                    long j9 = this.f7419k;
                    if (j9 > this.f7417i + 1) {
                        this.f7419k = j9 - 1;
                        m4.b0(j9, (byte) ((charAt2 & '?') | 128));
                        long j10 = this.f7419k;
                        this.f7419k = j10 - 1;
                        m4.b0(j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                        long j11 = this.f7419k;
                        this.f7419k = j11 - 1;
                        m4.b0(j11, (byte) ((charAt2 >>> '\f') | 480));
                        length--;
                    }
                }
                if (this.f7419k > this.f7417i + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            long j12 = this.f7419k;
                            this.f7419k = j12 - 1;
                            m4.b0(j12, (byte) ((codePoint & 63) | 128));
                            long j13 = this.f7419k;
                            this.f7419k = j13 - 1;
                            m4.b0(j13, (byte) (((codePoint >>> 6) & 63) | 128));
                            long j14 = this.f7419k;
                            this.f7419k = j14 - 1;
                            m4.b0(j14, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j15 = this.f7419k;
                            this.f7419k = j15 - 1;
                            m4.b0(j15, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new n4.d(length - 1, length);
                }
                r0(length);
                length++;
                length--;
            }
        }

        @Override // android.content.preferences.protobuf.n
        void R0(int i5, int i6) {
            W0(q4.c(i5, i6));
        }

        @Override // android.content.preferences.protobuf.s4
        public void S(int i5, Object obj, j3 j3Var) throws IOException {
            R0(i5, 4);
            j3Var.e(obj, this);
            R0(i5, 3);
        }

        @Override // android.content.preferences.protobuf.u
        public void T(byte b6) {
            long j5 = this.f7419k;
            this.f7419k = j5 - 1;
            m4.b0(j5, b6);
        }

        @Override // android.content.preferences.protobuf.u
        public void U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (f1() < remaining) {
                d1(remaining);
            }
            this.f7419k -= remaining;
            this.f7416h.position(Z0() + 1);
            this.f7416h.put(byteBuffer);
        }

        @Override // android.content.preferences.protobuf.u
        public void V(byte[] bArr, int i5, int i6) {
            if (f1() < i6) {
                d1(i6);
            }
            this.f7419k -= i6;
            this.f7416h.position(Z0() + 1);
            this.f7416h.put(bArr, i5, i6);
        }

        @Override // android.content.preferences.protobuf.u
        public void W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (f1() < remaining) {
                this.f7404d += remaining;
                this.f7403c.addFirst(android.content.preferences.protobuf.d.j(byteBuffer));
                c1();
            } else {
                this.f7419k -= remaining;
                this.f7416h.position(Z0() + 1);
                this.f7416h.put(byteBuffer);
            }
        }

        @Override // android.content.preferences.protobuf.n
        void W0(int i5) {
            if ((i5 & (-128)) == 0) {
                i1(i5);
                return;
            }
            if ((i5 & (-16384)) == 0) {
                k1(i5);
                return;
            }
            if (((-2097152) & i5) == 0) {
                j1(i5);
            } else if (((-268435456) & i5) == 0) {
                h1(i5);
            } else {
                g1(i5);
            }
        }

        @Override // android.content.preferences.protobuf.u
        public void X(byte[] bArr, int i5, int i6) {
            if (f1() < i6) {
                this.f7404d += i6;
                this.f7403c.addFirst(android.content.preferences.protobuf.d.l(bArr, i5, i6));
                c1();
            } else {
                this.f7419k -= i6;
                this.f7416h.position(Z0() + 1);
                this.f7416h.put(bArr, i5, i6);
            }
        }

        @Override // android.content.preferences.protobuf.n
        void X0(long j5) {
            switch (n.a0(j5)) {
                case 1:
                    p1(j5);
                    break;
                case 2:
                    u1(j5);
                    break;
                case 3:
                    t1(j5);
                    break;
                case 4:
                    n1(j5);
                    break;
                case 5:
                    m1(j5);
                    break;
                case 6:
                    r1(j5);
                    break;
                case 7:
                    q1(j5);
                    break;
                case 8:
                    l1(j5);
                    break;
                case 9:
                    o1(j5);
                    break;
                case 10:
                    s1(j5);
                    break;
            }
        }

        @Override // android.content.preferences.protobuf.s4
        public void b(int i5, int i6) {
            r0(10);
            W0(i6);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.n
        void b0() {
            if (this.f7416h != null) {
                this.f7404d += a1();
                this.f7416h.position(Z0() + 1);
                this.f7416h = null;
                this.f7419k = 0L;
                this.f7418j = 0L;
            }
        }

        @Override // android.content.preferences.protobuf.n
        public int c0() {
            return this.f7404d + a1();
        }

        @Override // android.content.preferences.protobuf.s4
        public void d(int i5, int i6) {
            r0(9);
            x0(i6);
            R0(i5, 5);
        }

        @Override // android.content.preferences.protobuf.s4
        public void i(int i5, long j5) {
            r0(13);
            A0(j5);
            R0(i5, 1);
        }

        @Override // android.content.preferences.protobuf.s4
        public void o(int i5, String str) {
            int c02 = c0();
            Q0(str);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i5, 2);
        }

        @Override // android.content.preferences.protobuf.s4
        public void p(int i5, long j5) {
            r0(15);
            X0(j5);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void q(int i5, Object obj) throws IOException {
            int c02 = c0();
            c3.a().k(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i5, 2);
        }

        @Override // android.content.preferences.protobuf.n
        void r0(int i5) {
            if (f1() < i5) {
                d1(i5);
            }
        }

        @Override // android.content.preferences.protobuf.n
        void s0(boolean z5) {
            T(z5 ? (byte) 1 : (byte) 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void t(int i5, boolean z5) {
            r0(6);
            T(z5 ? (byte) 1 : (byte) 0);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void v(int i5) {
            R0(i5, 3);
        }

        @Override // android.content.preferences.protobuf.s4
        public void w(int i5, int i6) {
            r0(15);
            F0(i6);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.n
        void x0(int i5) {
            long j5 = this.f7419k;
            this.f7419k = j5 - 1;
            m4.b0(j5, (byte) ((i5 >> 24) & 255));
            long j6 = this.f7419k;
            this.f7419k = j6 - 1;
            m4.b0(j6, (byte) ((i5 >> 16) & 255));
            long j7 = this.f7419k;
            this.f7419k = j7 - 1;
            m4.b0(j7, (byte) ((i5 >> 8) & 255));
            long j8 = this.f7419k;
            this.f7419k = j8 - 1;
            m4.b0(j8, (byte) (i5 & 255));
        }

        @Override // android.content.preferences.protobuf.s4
        public void z(int i5, w wVar) {
            try {
                wVar.y0(this);
                r0(10);
                W0(wVar.size());
                R0(i5, 2);
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* compiled from: BinaryWriter.java */
    private static final class e extends n {

        /* renamed from: h, reason: collision with root package name */
        private android.content.preferences.protobuf.d f7420h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f7421i;

        /* renamed from: j, reason: collision with root package name */
        private long f7422j;

        /* renamed from: k, reason: collision with root package name */
        private long f7423k;

        /* renamed from: l, reason: collision with root package name */
        private long f7424l;

        /* renamed from: m, reason: collision with root package name */
        private long f7425m;

        /* renamed from: n, reason: collision with root package name */
        private long f7426n;

        e(s sVar, int i5) {
            super(sVar, i5, null);
            b1();
        }

        private int Y0() {
            return (int) this.f7426n;
        }

        static boolean a1() {
            return m4.S();
        }

        private void b1() {
            d1(j0());
        }

        private void c1(int i5) {
            d1(k0(i5));
        }

        private void d1(android.content.preferences.protobuf.d dVar) {
            if (!dVar.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            b0();
            this.f7403c.addFirst(dVar);
            this.f7420h = dVar;
            this.f7421i = dVar.a();
            int b6 = dVar.b();
            this.f7423k = dVar.e() + b6;
            long g5 = b6 + dVar.g();
            this.f7422j = g5;
            this.f7424l = g5 - 1;
            long j5 = this.f7423k - 1;
            this.f7425m = j5;
            this.f7426n = j5;
        }

        private void f1(int i5) {
            byte[] bArr = this.f7421i;
            long j5 = this.f7426n;
            this.f7426n = j5 - 1;
            m4.d0(bArr, j5, (byte) (i5 >>> 28));
            byte[] bArr2 = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr2, j6, (byte) (((i5 >>> 21) & 127) | 128));
            byte[] bArr3 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr3, j7, (byte) (((i5 >>> 14) & 127) | 128));
            byte[] bArr4 = this.f7421i;
            long j8 = this.f7426n;
            this.f7426n = j8 - 1;
            m4.d0(bArr4, j8, (byte) (((i5 >>> 7) & 127) | 128));
            byte[] bArr5 = this.f7421i;
            long j9 = this.f7426n;
            this.f7426n = j9 - 1;
            m4.d0(bArr5, j9, (byte) ((i5 & 127) | 128));
        }

        private void g1(int i5) {
            byte[] bArr = this.f7421i;
            long j5 = this.f7426n;
            this.f7426n = j5 - 1;
            m4.d0(bArr, j5, (byte) (i5 >>> 21));
            byte[] bArr2 = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr2, j6, (byte) (((i5 >>> 14) & 127) | 128));
            byte[] bArr3 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr3, j7, (byte) (((i5 >>> 7) & 127) | 128));
            byte[] bArr4 = this.f7421i;
            long j8 = this.f7426n;
            this.f7426n = j8 - 1;
            m4.d0(bArr4, j8, (byte) ((i5 & 127) | 128));
        }

        private void h1(int i5) {
            byte[] bArr = this.f7421i;
            long j5 = this.f7426n;
            this.f7426n = j5 - 1;
            m4.d0(bArr, j5, (byte) i5);
        }

        private void i1(int i5) {
            byte[] bArr = this.f7421i;
            long j5 = this.f7426n;
            this.f7426n = j5 - 1;
            m4.d0(bArr, j5, (byte) (i5 >>> 14));
            byte[] bArr2 = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr2, j6, (byte) (((i5 >>> 7) & 127) | 128));
            byte[] bArr3 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr3, j7, (byte) ((i5 & 127) | 128));
        }

        private void j1(int i5) {
            byte[] bArr = this.f7421i;
            long j5 = this.f7426n;
            this.f7426n = j5 - 1;
            m4.d0(bArr, j5, (byte) (i5 >>> 7));
            byte[] bArr2 = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr2, j6, (byte) ((i5 & 127) | 128));
        }

        private void k1(long j5) {
            byte[] bArr = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr, j6, (byte) (j5 >>> 49));
            byte[] bArr2 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr2, j7, (byte) (((j5 >>> 42) & 127) | 128));
            byte[] bArr3 = this.f7421i;
            long j8 = this.f7426n;
            this.f7426n = j8 - 1;
            m4.d0(bArr3, j8, (byte) (((j5 >>> 35) & 127) | 128));
            byte[] bArr4 = this.f7421i;
            long j9 = this.f7426n;
            this.f7426n = j9 - 1;
            m4.d0(bArr4, j9, (byte) (((j5 >>> 28) & 127) | 128));
            byte[] bArr5 = this.f7421i;
            long j10 = this.f7426n;
            this.f7426n = j10 - 1;
            m4.d0(bArr5, j10, (byte) (((j5 >>> 21) & 127) | 128));
            byte[] bArr6 = this.f7421i;
            long j11 = this.f7426n;
            this.f7426n = j11 - 1;
            m4.d0(bArr6, j11, (byte) (((j5 >>> 14) & 127) | 128));
            byte[] bArr7 = this.f7421i;
            long j12 = this.f7426n;
            this.f7426n = j12 - 1;
            m4.d0(bArr7, j12, (byte) (((j5 >>> 7) & 127) | 128));
            byte[] bArr8 = this.f7421i;
            long j13 = this.f7426n;
            this.f7426n = j13 - 1;
            m4.d0(bArr8, j13, (byte) ((j5 & 127) | 128));
        }

        private void l1(long j5) {
            byte[] bArr = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr, j6, (byte) (j5 >>> 28));
            byte[] bArr2 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr2, j7, (byte) (((j5 >>> 21) & 127) | 128));
            byte[] bArr3 = this.f7421i;
            long j8 = this.f7426n;
            this.f7426n = j8 - 1;
            m4.d0(bArr3, j8, (byte) (((j5 >>> 14) & 127) | 128));
            byte[] bArr4 = this.f7421i;
            long j9 = this.f7426n;
            this.f7426n = j9 - 1;
            m4.d0(bArr4, j9, (byte) (((j5 >>> 7) & 127) | 128));
            byte[] bArr5 = this.f7421i;
            long j10 = this.f7426n;
            this.f7426n = j10 - 1;
            m4.d0(bArr5, j10, (byte) ((j5 & 127) | 128));
        }

        private void m1(long j5) {
            byte[] bArr = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr, j6, (byte) (j5 >>> 21));
            byte[] bArr2 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr2, j7, (byte) (((j5 >>> 14) & 127) | 128));
            byte[] bArr3 = this.f7421i;
            long j8 = this.f7426n;
            this.f7426n = j8 - 1;
            m4.d0(bArr3, j8, (byte) (((j5 >>> 7) & 127) | 128));
            byte[] bArr4 = this.f7421i;
            long j9 = this.f7426n;
            this.f7426n = j9 - 1;
            m4.d0(bArr4, j9, (byte) ((j5 & 127) | 128));
        }

        private void n1(long j5) {
            byte[] bArr = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr, j6, (byte) (j5 >>> 56));
            byte[] bArr2 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr2, j7, (byte) (((j5 >>> 49) & 127) | 128));
            byte[] bArr3 = this.f7421i;
            long j8 = this.f7426n;
            this.f7426n = j8 - 1;
            m4.d0(bArr3, j8, (byte) (((j5 >>> 42) & 127) | 128));
            byte[] bArr4 = this.f7421i;
            long j9 = this.f7426n;
            this.f7426n = j9 - 1;
            m4.d0(bArr4, j9, (byte) (((j5 >>> 35) & 127) | 128));
            byte[] bArr5 = this.f7421i;
            long j10 = this.f7426n;
            this.f7426n = j10 - 1;
            m4.d0(bArr5, j10, (byte) (((j5 >>> 28) & 127) | 128));
            byte[] bArr6 = this.f7421i;
            long j11 = this.f7426n;
            this.f7426n = j11 - 1;
            m4.d0(bArr6, j11, (byte) (((j5 >>> 21) & 127) | 128));
            byte[] bArr7 = this.f7421i;
            long j12 = this.f7426n;
            this.f7426n = j12 - 1;
            m4.d0(bArr7, j12, (byte) (((j5 >>> 14) & 127) | 128));
            byte[] bArr8 = this.f7421i;
            long j13 = this.f7426n;
            this.f7426n = j13 - 1;
            m4.d0(bArr8, j13, (byte) (((j5 >>> 7) & 127) | 128));
            byte[] bArr9 = this.f7421i;
            long j14 = this.f7426n;
            this.f7426n = j14 - 1;
            m4.d0(bArr9, j14, (byte) ((j5 & 127) | 128));
        }

        private void o1(long j5) {
            byte[] bArr = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr, j6, (byte) j5);
        }

        private void p1(long j5) {
            byte[] bArr = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr, j6, (byte) (j5 >>> 42));
            byte[] bArr2 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr2, j7, (byte) (((j5 >>> 35) & 127) | 128));
            byte[] bArr3 = this.f7421i;
            long j8 = this.f7426n;
            this.f7426n = j8 - 1;
            m4.d0(bArr3, j8, (byte) (((j5 >>> 28) & 127) | 128));
            byte[] bArr4 = this.f7421i;
            long j9 = this.f7426n;
            this.f7426n = j9 - 1;
            m4.d0(bArr4, j9, (byte) (((j5 >>> 21) & 127) | 128));
            byte[] bArr5 = this.f7421i;
            long j10 = this.f7426n;
            this.f7426n = j10 - 1;
            m4.d0(bArr5, j10, (byte) (((j5 >>> 14) & 127) | 128));
            byte[] bArr6 = this.f7421i;
            long j11 = this.f7426n;
            this.f7426n = j11 - 1;
            m4.d0(bArr6, j11, (byte) (((j5 >>> 7) & 127) | 128));
            byte[] bArr7 = this.f7421i;
            long j12 = this.f7426n;
            this.f7426n = j12 - 1;
            m4.d0(bArr7, j12, (byte) ((j5 & 127) | 128));
        }

        private void q1(long j5) {
            byte[] bArr = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr, j6, (byte) (j5 >>> 35));
            byte[] bArr2 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr2, j7, (byte) (((j5 >>> 28) & 127) | 128));
            byte[] bArr3 = this.f7421i;
            long j8 = this.f7426n;
            this.f7426n = j8 - 1;
            m4.d0(bArr3, j8, (byte) (((j5 >>> 21) & 127) | 128));
            byte[] bArr4 = this.f7421i;
            long j9 = this.f7426n;
            this.f7426n = j9 - 1;
            m4.d0(bArr4, j9, (byte) (((j5 >>> 14) & 127) | 128));
            byte[] bArr5 = this.f7421i;
            long j10 = this.f7426n;
            this.f7426n = j10 - 1;
            m4.d0(bArr5, j10, (byte) (((j5 >>> 7) & 127) | 128));
            byte[] bArr6 = this.f7421i;
            long j11 = this.f7426n;
            this.f7426n = j11 - 1;
            m4.d0(bArr6, j11, (byte) ((j5 & 127) | 128));
        }

        private void r1(long j5) {
            byte[] bArr = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr, j6, (byte) (j5 >>> 63));
            byte[] bArr2 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr2, j7, (byte) (((j5 >>> 56) & 127) | 128));
            byte[] bArr3 = this.f7421i;
            long j8 = this.f7426n;
            this.f7426n = j8 - 1;
            m4.d0(bArr3, j8, (byte) (((j5 >>> 49) & 127) | 128));
            byte[] bArr4 = this.f7421i;
            long j9 = this.f7426n;
            this.f7426n = j9 - 1;
            m4.d0(bArr4, j9, (byte) (((j5 >>> 42) & 127) | 128));
            byte[] bArr5 = this.f7421i;
            long j10 = this.f7426n;
            this.f7426n = j10 - 1;
            m4.d0(bArr5, j10, (byte) (((j5 >>> 35) & 127) | 128));
            byte[] bArr6 = this.f7421i;
            long j11 = this.f7426n;
            this.f7426n = j11 - 1;
            m4.d0(bArr6, j11, (byte) (((j5 >>> 28) & 127) | 128));
            byte[] bArr7 = this.f7421i;
            long j12 = this.f7426n;
            this.f7426n = j12 - 1;
            m4.d0(bArr7, j12, (byte) (((j5 >>> 21) & 127) | 128));
            byte[] bArr8 = this.f7421i;
            long j13 = this.f7426n;
            this.f7426n = j13 - 1;
            m4.d0(bArr8, j13, (byte) (((j5 >>> 14) & 127) | 128));
            byte[] bArr9 = this.f7421i;
            long j14 = this.f7426n;
            this.f7426n = j14 - 1;
            m4.d0(bArr9, j14, (byte) (((j5 >>> 7) & 127) | 128));
            byte[] bArr10 = this.f7421i;
            long j15 = this.f7426n;
            this.f7426n = j15 - 1;
            m4.d0(bArr10, j15, (byte) ((j5 & 127) | 128));
        }

        private void s1(long j5) {
            byte[] bArr = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr, j6, (byte) (((int) j5) >>> 14));
            byte[] bArr2 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr2, j7, (byte) (((j5 >>> 7) & 127) | 128));
            byte[] bArr3 = this.f7421i;
            long j8 = this.f7426n;
            this.f7426n = j8 - 1;
            m4.d0(bArr3, j8, (byte) ((j5 & 127) | 128));
        }

        private void t1(long j5) {
            byte[] bArr = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr, j6, (byte) (j5 >>> 7));
            byte[] bArr2 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr2, j7, (byte) ((((int) j5) & 127) | 128));
        }

        @Override // android.content.preferences.protobuf.n
        void A0(long j5) {
            byte[] bArr = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr, j6, (byte) (((int) (j5 >> 56)) & 255));
            byte[] bArr2 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr2, j7, (byte) (((int) (j5 >> 48)) & 255));
            byte[] bArr3 = this.f7421i;
            long j8 = this.f7426n;
            this.f7426n = j8 - 1;
            m4.d0(bArr3, j8, (byte) (((int) (j5 >> 40)) & 255));
            byte[] bArr4 = this.f7421i;
            long j9 = this.f7426n;
            this.f7426n = j9 - 1;
            m4.d0(bArr4, j9, (byte) (((int) (j5 >> 32)) & 255));
            byte[] bArr5 = this.f7421i;
            long j10 = this.f7426n;
            this.f7426n = j10 - 1;
            m4.d0(bArr5, j10, (byte) (((int) (j5 >> 24)) & 255));
            byte[] bArr6 = this.f7421i;
            long j11 = this.f7426n;
            this.f7426n = j11 - 1;
            m4.d0(bArr6, j11, (byte) (((int) (j5 >> 16)) & 255));
            byte[] bArr7 = this.f7421i;
            long j12 = this.f7426n;
            this.f7426n = j12 - 1;
            m4.d0(bArr7, j12, (byte) (((int) (j5 >> 8)) & 255));
            byte[] bArr8 = this.f7421i;
            long j13 = this.f7426n;
            this.f7426n = j13 - 1;
            m4.d0(bArr8, j13, (byte) (((int) j5) & 255));
        }

        @Override // android.content.preferences.protobuf.s4
        public void C(int i5, Object obj, j3 j3Var) throws IOException {
            int c02 = c0();
            j3Var.e(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i5, 2);
        }

        @Override // android.content.preferences.protobuf.s4
        public void E(int i5, Object obj) throws IOException {
            R0(i5, 4);
            c3.a().k(obj, this);
            R0(i5, 3);
        }

        @Override // android.content.preferences.protobuf.n
        void F0(int i5) {
            if (i5 >= 0) {
                W0(i5);
            } else {
                X0(i5);
            }
        }

        @Override // android.content.preferences.protobuf.s4
        public void H(int i5, long j5) {
            r0(15);
            N0(j5);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void J(int i5) {
            R0(i5, 4);
        }

        @Override // android.content.preferences.protobuf.n
        void K0(int i5) {
            W0(CodedOutputStream.c1(i5));
        }

        @Override // android.content.preferences.protobuf.n
        void N0(long j5) {
            X0(CodedOutputStream.d1(j5));
        }

        @Override // android.content.preferences.protobuf.s4
        public void Q(int i5, int i6) {
            r0(10);
            K0(i6);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.n
        void Q0(String str) {
            char charAt;
            r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.f7421i;
                long j5 = this.f7426n;
                this.f7426n = j5 - 1;
                m4.d0(bArr, j5, (byte) charAt);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128) {
                    long j6 = this.f7426n;
                    if (j6 > this.f7424l) {
                        byte[] bArr2 = this.f7421i;
                        this.f7426n = j6 - 1;
                        m4.d0(bArr2, j6, (byte) charAt2);
                        length--;
                    }
                }
                if (charAt2 < 2048) {
                    long j7 = this.f7426n;
                    if (j7 > this.f7422j) {
                        byte[] bArr3 = this.f7421i;
                        this.f7426n = j7 - 1;
                        m4.d0(bArr3, j7, (byte) ((charAt2 & '?') | 128));
                        byte[] bArr4 = this.f7421i;
                        long j8 = this.f7426n;
                        this.f7426n = j8 - 1;
                        m4.d0(bArr4, j8, (byte) ((charAt2 >>> 6) | 960));
                        length--;
                    }
                }
                if (charAt2 < 55296 || 57343 < charAt2) {
                    long j9 = this.f7426n;
                    if (j9 > this.f7422j + 1) {
                        byte[] bArr5 = this.f7421i;
                        this.f7426n = j9 - 1;
                        m4.d0(bArr5, j9, (byte) ((charAt2 & '?') | 128));
                        byte[] bArr6 = this.f7421i;
                        long j10 = this.f7426n;
                        this.f7426n = j10 - 1;
                        m4.d0(bArr6, j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                        byte[] bArr7 = this.f7421i;
                        long j11 = this.f7426n;
                        this.f7426n = j11 - 1;
                        m4.d0(bArr7, j11, (byte) ((charAt2 >>> '\f') | 480));
                        length--;
                    }
                }
                if (this.f7426n > this.f7422j + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr8 = this.f7421i;
                            long j12 = this.f7426n;
                            this.f7426n = j12 - 1;
                            m4.d0(bArr8, j12, (byte) ((codePoint & 63) | 128));
                            byte[] bArr9 = this.f7421i;
                            long j13 = this.f7426n;
                            this.f7426n = j13 - 1;
                            m4.d0(bArr9, j13, (byte) (((codePoint >>> 6) & 63) | 128));
                            byte[] bArr10 = this.f7421i;
                            long j14 = this.f7426n;
                            this.f7426n = j14 - 1;
                            m4.d0(bArr10, j14, (byte) (((codePoint >>> 12) & 63) | 128));
                            byte[] bArr11 = this.f7421i;
                            long j15 = this.f7426n;
                            this.f7426n = j15 - 1;
                            m4.d0(bArr11, j15, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new n4.d(length - 1, length);
                }
                r0(length);
                length++;
                length--;
            }
        }

        @Override // android.content.preferences.protobuf.n
        void R0(int i5, int i6) {
            W0(q4.c(i5, i6));
        }

        @Override // android.content.preferences.protobuf.s4
        public void S(int i5, Object obj, j3 j3Var) throws IOException {
            R0(i5, 4);
            j3Var.e(obj, this);
            R0(i5, 3);
        }

        @Override // android.content.preferences.protobuf.u
        public void T(byte b6) {
            byte[] bArr = this.f7421i;
            long j5 = this.f7426n;
            this.f7426n = j5 - 1;
            m4.d0(bArr, j5, b6);
        }

        @Override // android.content.preferences.protobuf.u
        public void U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            r0(remaining);
            long j5 = this.f7426n - remaining;
            this.f7426n = j5;
            byteBuffer.get(this.f7421i, ((int) j5) + 1, remaining);
        }

        @Override // android.content.preferences.protobuf.u
        public void V(byte[] bArr, int i5, int i6) {
            if (i5 < 0 || i5 + i6 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i6)));
            }
            r0(i6);
            long j5 = this.f7426n - i6;
            this.f7426n = j5;
            System.arraycopy(bArr, i5, this.f7421i, ((int) j5) + 1, i6);
        }

        @Override // android.content.preferences.protobuf.u
        public void W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (e1() < remaining) {
                this.f7404d += remaining;
                this.f7403c.addFirst(android.content.preferences.protobuf.d.j(byteBuffer));
                b1();
            }
            long j5 = this.f7426n - remaining;
            this.f7426n = j5;
            byteBuffer.get(this.f7421i, ((int) j5) + 1, remaining);
        }

        @Override // android.content.preferences.protobuf.n
        void W0(int i5) {
            if ((i5 & (-128)) == 0) {
                h1(i5);
                return;
            }
            if ((i5 & (-16384)) == 0) {
                j1(i5);
                return;
            }
            if (((-2097152) & i5) == 0) {
                i1(i5);
            } else if (((-268435456) & i5) == 0) {
                g1(i5);
            } else {
                f1(i5);
            }
        }

        @Override // android.content.preferences.protobuf.u
        public void X(byte[] bArr, int i5, int i6) {
            if (i5 < 0 || i5 + i6 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i6)));
            }
            if (e1() < i6) {
                this.f7404d += i6;
                this.f7403c.addFirst(android.content.preferences.protobuf.d.l(bArr, i5, i6));
                b1();
            } else {
                long j5 = this.f7426n - i6;
                this.f7426n = j5;
                System.arraycopy(bArr, i5, this.f7421i, ((int) j5) + 1, i6);
            }
        }

        @Override // android.content.preferences.protobuf.n
        void X0(long j5) {
            switch (n.a0(j5)) {
                case 1:
                    o1(j5);
                    break;
                case 2:
                    t1(j5);
                    break;
                case 3:
                    s1(j5);
                    break;
                case 4:
                    m1(j5);
                    break;
                case 5:
                    l1(j5);
                    break;
                case 6:
                    q1(j5);
                    break;
                case 7:
                    p1(j5);
                    break;
                case 8:
                    k1(j5);
                    break;
                case 9:
                    n1(j5);
                    break;
                case 10:
                    r1(j5);
                    break;
            }
        }

        int Z0() {
            return (int) (this.f7425m - this.f7426n);
        }

        @Override // android.content.preferences.protobuf.s4
        public void b(int i5, int i6) {
            r0(10);
            W0(i6);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.n
        void b0() {
            if (this.f7420h != null) {
                this.f7404d += Z0();
                android.content.preferences.protobuf.d dVar = this.f7420h;
                dVar.h((((int) this.f7426n) - dVar.b()) + 1);
                this.f7420h = null;
                this.f7426n = 0L;
                this.f7425m = 0L;
            }
        }

        @Override // android.content.preferences.protobuf.n
        public int c0() {
            return this.f7404d + Z0();
        }

        @Override // android.content.preferences.protobuf.s4
        public void d(int i5, int i6) {
            r0(9);
            x0(i6);
            R0(i5, 5);
        }

        int e1() {
            return (int) (this.f7426n - this.f7424l);
        }

        @Override // android.content.preferences.protobuf.s4
        public void i(int i5, long j5) {
            r0(13);
            A0(j5);
            R0(i5, 1);
        }

        @Override // android.content.preferences.protobuf.s4
        public void o(int i5, String str) {
            int c02 = c0();
            Q0(str);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i5, 2);
        }

        @Override // android.content.preferences.protobuf.s4
        public void p(int i5, long j5) {
            r0(15);
            X0(j5);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void q(int i5, Object obj) throws IOException {
            int c02 = c0();
            c3.a().k(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i5, 2);
        }

        @Override // android.content.preferences.protobuf.n
        void r0(int i5) {
            if (e1() < i5) {
                c1(i5);
            }
        }

        @Override // android.content.preferences.protobuf.n
        void s0(boolean z5) {
            T(z5 ? (byte) 1 : (byte) 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void t(int i5, boolean z5) {
            r0(6);
            T(z5 ? (byte) 1 : (byte) 0);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.s4
        public void v(int i5) {
            R0(i5, 3);
        }

        @Override // android.content.preferences.protobuf.s4
        public void w(int i5, int i6) {
            r0(15);
            F0(i6);
            R0(i5, 0);
        }

        @Override // android.content.preferences.protobuf.n
        void x0(int i5) {
            byte[] bArr = this.f7421i;
            long j5 = this.f7426n;
            this.f7426n = j5 - 1;
            m4.d0(bArr, j5, (byte) ((i5 >> 24) & 255));
            byte[] bArr2 = this.f7421i;
            long j6 = this.f7426n;
            this.f7426n = j6 - 1;
            m4.d0(bArr2, j6, (byte) ((i5 >> 16) & 255));
            byte[] bArr3 = this.f7421i;
            long j7 = this.f7426n;
            this.f7426n = j7 - 1;
            m4.d0(bArr3, j7, (byte) ((i5 >> 8) & 255));
            byte[] bArr4 = this.f7421i;
            long j8 = this.f7426n;
            this.f7426n = j8 - 1;
            m4.d0(bArr4, j8, (byte) (i5 & 255));
        }

        @Override // android.content.preferences.protobuf.s4
        public void z(int i5, w wVar) {
            try {
                wVar.y0(this);
                r0(10);
                W0(wVar.size());
                R0(i5, 2);
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* synthetic */ n(s sVar, int i5, a aVar) {
        this(sVar, i5);
    }

    private final void B0(int i5, y1 y1Var, boolean z5) throws IOException {
        if (!z5) {
            for (int size = y1Var.size() - 1; size >= 0; size--) {
                i(i5, y1Var.getLong(size));
            }
            return;
        }
        r0((y1Var.size() * 8) + 10);
        int c02 = c0();
        for (int size2 = y1Var.size() - 1; size2 >= 0; size2--) {
            A0(y1Var.getLong(size2));
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void C0(int i5, List<Long> list, boolean z5) throws IOException {
        if (!z5) {
            for (int size = list.size() - 1; size >= 0; size--) {
                i(i5, list.get(size).longValue());
            }
            return;
        }
        r0((list.size() * 8) + 10);
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A0(list.get(size2).longValue());
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void D0(int i5, e1 e1Var, boolean z5) throws IOException {
        if (!z5) {
            for (int size = e1Var.size() - 1; size >= 0; size--) {
                I(i5, e1Var.getFloat(size));
            }
            return;
        }
        r0((e1Var.size() * 4) + 10);
        int c02 = c0();
        for (int size2 = e1Var.size() - 1; size2 >= 0; size2--) {
            x0(Float.floatToRawIntBits(e1Var.getFloat(size2)));
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void E0(int i5, List<Float> list, boolean z5) throws IOException {
        if (!z5) {
            for (int size = list.size() - 1; size >= 0; size--) {
                I(i5, list.get(size).floatValue());
            }
            return;
        }
        r0((list.size() * 4) + 10);
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            x0(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void G0(int i5, n1 n1Var, boolean z5) throws IOException {
        if (!z5) {
            for (int size = n1Var.size() - 1; size >= 0; size--) {
                w(i5, n1Var.getInt(size));
            }
            return;
        }
        r0((n1Var.size() * 10) + 10);
        int c02 = c0();
        for (int size2 = n1Var.size() - 1; size2 >= 0; size2--) {
            F0(n1Var.getInt(size2));
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void H0(int i5, List<Integer> list, boolean z5) throws IOException {
        if (!z5) {
            for (int size = list.size() - 1; size >= 0; size--) {
                w(i5, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            F0(list.get(size2).intValue());
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private void I0(int i5, Object obj) throws IOException {
        if (obj instanceof String) {
            o(i5, (String) obj);
        } else {
            z(i5, (w) obj);
        }
    }

    static final void J0(s4 s4Var, int i5, q4.b bVar, Object obj) throws IOException {
        switch (a.f7405a[bVar.ordinal()]) {
            case 1:
                s4Var.t(i5, ((Boolean) obj).booleanValue());
                return;
            case 2:
                s4Var.d(i5, ((Integer) obj).intValue());
                return;
            case 3:
                s4Var.i(i5, ((Long) obj).longValue());
                return;
            case 4:
                s4Var.w(i5, ((Integer) obj).intValue());
                return;
            case 5:
                s4Var.s(i5, ((Long) obj).longValue());
                return;
            case 6:
                s4Var.u(i5, ((Integer) obj).intValue());
                return;
            case 7:
                s4Var.A(i5, ((Long) obj).longValue());
                return;
            case 8:
                s4Var.Q(i5, ((Integer) obj).intValue());
                return;
            case 9:
                s4Var.H(i5, ((Long) obj).longValue());
                return;
            case 10:
                s4Var.o(i5, (String) obj);
                return;
            case 11:
                s4Var.b(i5, ((Integer) obj).intValue());
                return;
            case 12:
                s4Var.p(i5, ((Long) obj).longValue());
                return;
            case 13:
                s4Var.I(i5, ((Float) obj).floatValue());
                return;
            case 14:
                s4Var.e(i5, ((Double) obj).doubleValue());
                return;
            case 15:
                s4Var.q(i5, obj);
                return;
            case 16:
                s4Var.z(i5, (w) obj);
                return;
            case 17:
                if (obj instanceof o1.c) {
                    s4Var.L(i5, ((o1.c) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    s4Var.L(i5, ((Integer) obj).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + bVar);
        }
    }

    private final void L0(int i5, n1 n1Var, boolean z5) throws IOException {
        if (!z5) {
            for (int size = n1Var.size() - 1; size >= 0; size--) {
                Q(i5, n1Var.getInt(size));
            }
            return;
        }
        r0((n1Var.size() * 5) + 10);
        int c02 = c0();
        for (int size2 = n1Var.size() - 1; size2 >= 0; size2--) {
            K0(n1Var.getInt(size2));
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void M0(int i5, List<Integer> list, boolean z5) throws IOException {
        if (!z5) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Q(i5, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 5) + 10);
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            K0(list.get(size2).intValue());
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void O0(int i5, y1 y1Var, boolean z5) throws IOException {
        if (!z5) {
            for (int size = y1Var.size() - 1; size >= 0; size--) {
                H(i5, y1Var.getLong(size));
            }
            return;
        }
        r0((y1Var.size() * 10) + 10);
        int c02 = c0();
        for (int size2 = y1Var.size() - 1; size2 >= 0; size2--) {
            N0(y1Var.getLong(size2));
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void P0(int i5, List<Long> list, boolean z5) throws IOException {
        if (!z5) {
            for (int size = list.size() - 1; size >= 0; size--) {
                H(i5, list.get(size).longValue());
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            N0(list.get(size2).longValue());
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void S0(int i5, n1 n1Var, boolean z5) throws IOException {
        if (!z5) {
            for (int size = n1Var.size() - 1; size >= 0; size--) {
                b(i5, n1Var.getInt(size));
            }
            return;
        }
        r0((n1Var.size() * 5) + 10);
        int c02 = c0();
        for (int size2 = n1Var.size() - 1; size2 >= 0; size2--) {
            W0(n1Var.getInt(size2));
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void T0(int i5, List<Integer> list, boolean z5) throws IOException {
        if (!z5) {
            for (int size = list.size() - 1; size >= 0; size--) {
                b(i5, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 5) + 10);
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            W0(list.get(size2).intValue());
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void U0(int i5, y1 y1Var, boolean z5) throws IOException {
        if (!z5) {
            for (int size = y1Var.size() - 1; size >= 0; size--) {
                p(i5, y1Var.getLong(size));
            }
            return;
        }
        r0((y1Var.size() * 10) + 10);
        int c02 = c0();
        for (int size2 = y1Var.size() - 1; size2 >= 0; size2--) {
            X0(y1Var.getLong(size2));
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void V0(int i5, List<Long> list, boolean z5) throws IOException {
        if (!z5) {
            for (int size = list.size() - 1; size >= 0; size--) {
                p(i5, list.get(size).longValue());
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            X0(list.get(size2).longValue());
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte a0(long j5) {
        byte b6;
        if (((-128) & j5) == 0) {
            return (byte) 1;
        }
        if (j5 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j5) != 0) {
            b6 = (byte) 6;
            j5 >>>= 28;
        } else {
            b6 = 2;
        }
        if (((-2097152) & j5) != 0) {
            b6 = (byte) (b6 + 2);
            j5 >>>= 14;
        }
        return (j5 & (-16384)) != 0 ? (byte) (b6 + 1) : b6;
    }

    static boolean d0() {
        return m4.T();
    }

    static boolean e0() {
        return m4.S();
    }

    public static n h0(s sVar) {
        return i0(sVar, 4096);
    }

    public static n i0(s sVar, int i5) {
        return m4.T() ? p0(sVar, i5) : new b(sVar, i5);
    }

    public static n l0(s sVar) {
        return m0(sVar, 4096);
    }

    public static n m0(s sVar, int i5) {
        return m4.S() ? q0(sVar, i5) : new c(sVar, i5);
    }

    static n n0(s sVar, int i5) {
        return new b(sVar, i5);
    }

    static n o0(s sVar, int i5) {
        return new c(sVar, i5);
    }

    static n p0(s sVar, int i5) {
        if (m4.T()) {
            return new d(sVar, i5);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    static n q0(s sVar, int i5) {
        if (m4.S()) {
            return new e(sVar, i5);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    private final void t0(int i5, r rVar, boolean z5) throws IOException {
        if (!z5) {
            for (int size = rVar.size() - 1; size >= 0; size--) {
                t(i5, rVar.getBoolean(size));
            }
            return;
        }
        r0(rVar.size() + 10);
        int c02 = c0();
        for (int size2 = rVar.size() - 1; size2 >= 0; size2--) {
            s0(rVar.getBoolean(size2));
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void u0(int i5, List<Boolean> list, boolean z5) throws IOException {
        if (!z5) {
            for (int size = list.size() - 1; size >= 0; size--) {
                t(i5, list.get(size).booleanValue());
            }
            return;
        }
        r0(list.size() + 10);
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            s0(list.get(size2).booleanValue());
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void v0(int i5, c0 c0Var, boolean z5) throws IOException {
        if (!z5) {
            for (int size = c0Var.size() - 1; size >= 0; size--) {
                e(i5, c0Var.getDouble(size));
            }
            return;
        }
        r0((c0Var.size() * 8) + 10);
        int c02 = c0();
        for (int size2 = c0Var.size() - 1; size2 >= 0; size2--) {
            A0(Double.doubleToRawLongBits(c0Var.getDouble(size2)));
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void w0(int i5, List<Double> list, boolean z5) throws IOException {
        if (!z5) {
            for (int size = list.size() - 1; size >= 0; size--) {
                e(i5, list.get(size).doubleValue());
            }
            return;
        }
        r0((list.size() * 8) + 10);
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A0(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void y0(int i5, n1 n1Var, boolean z5) throws IOException {
        if (!z5) {
            for (int size = n1Var.size() - 1; size >= 0; size--) {
                d(i5, n1Var.getInt(size));
            }
            return;
        }
        r0((n1Var.size() * 4) + 10);
        int c02 = c0();
        for (int size2 = n1Var.size() - 1; size2 >= 0; size2--) {
            x0(n1Var.getInt(size2));
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    private final void z0(int i5, List<Integer> list, boolean z5) throws IOException {
        if (!z5) {
            for (int size = list.size() - 1; size >= 0; size--) {
                d(i5, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 4) + 10);
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            x0(list.get(size2).intValue());
        }
        W0(c0() - c02);
        R0(i5, 2);
    }

    @Override // android.content.preferences.protobuf.s4
    public final void A(int i5, long j5) throws IOException {
        i(i5, j5);
    }

    abstract void A0(long j5);

    @Override // android.content.preferences.protobuf.s4
    public final void B(int i5, List<Integer> list, boolean z5) throws IOException {
        if (list instanceof n1) {
            y0(i5, (n1) list, z5);
        } else {
            z0(i5, list, z5);
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public final void D(int i5, List<Boolean> list, boolean z5) throws IOException {
        if (list instanceof r) {
            t0(i5, (r) list, z5);
        } else {
            u0(i5, list, z5);
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public final void F(int i5, List<Integer> list, boolean z5) throws IOException {
        if (list instanceof n1) {
            S0(i5, (n1) list, z5);
        } else {
            T0(i5, list, z5);
        }
    }

    abstract void F0(int i5);

    @Override // android.content.preferences.protobuf.s4
    public final void G(int i5, List<Long> list, boolean z5) throws IOException {
        if (list instanceof y1) {
            O0(i5, (y1) list, z5);
        } else {
            P0(i5, list, z5);
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public final void I(int i5, float f6) throws IOException {
        d(i5, Float.floatToRawIntBits(f6));
    }

    @Override // android.content.preferences.protobuf.s4
    public final void K(int i5, List<Integer> list, boolean z5) throws IOException {
        if (list instanceof n1) {
            L0(i5, (n1) list, z5);
        } else {
            M0(i5, list, z5);
        }
    }

    abstract void K0(int i5);

    @Override // android.content.preferences.protobuf.s4
    public final void L(int i5, int i6) throws IOException {
        w(i5, i6);
    }

    @Override // android.content.preferences.protobuf.s4
    public final void M(int i5, List<Long> list, boolean z5) throws IOException {
        g(i5, list, z5);
    }

    @Override // android.content.preferences.protobuf.s4
    public final void N(int i5, List<Integer> list, boolean z5) throws IOException {
        r(i5, list, z5);
    }

    abstract void N0(long j5);

    @Override // android.content.preferences.protobuf.s4
    public final void O(int i5, List<Double> list, boolean z5) throws IOException {
        if (list instanceof c0) {
            v0(i5, (c0) list, z5);
        } else {
            w0(i5, list, z5);
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public <K, V> void P(int i5, a2.b<K, V> bVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int c02 = c0();
            J0(this, 2, bVar.f7179c, entry.getValue());
            J0(this, 1, bVar.f7177a, entry.getKey());
            W0(c0() - c02);
            R0(i5, 2);
        }
    }

    abstract void Q0(String str);

    @Override // android.content.preferences.protobuf.s4
    public final void R(int i5, List<w> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            z(i5, list.get(size));
        }
    }

    abstract void R0(int i5, int i6);

    abstract void W0(int i5);

    abstract void X0(long j5);

    public final Queue<android.content.preferences.protobuf.d> Z() {
        b0();
        return this.f7403c;
    }

    @Override // android.content.preferences.protobuf.s4
    public final void a(int i5, List<Float> list, boolean z5) throws IOException {
        if (list instanceof e1) {
            D0(i5, (e1) list, z5);
        } else {
            E0(i5, list, z5);
        }
    }

    abstract void b0();

    @Override // android.content.preferences.protobuf.s4
    public final void c(int i5, Object obj) throws IOException {
        R0(1, 4);
        if (obj instanceof w) {
            z(3, (w) obj);
        } else {
            q(3, obj);
        }
        b(2, i5);
        R0(1, 3);
    }

    public abstract int c0();

    @Override // android.content.preferences.protobuf.s4
    public final void e(int i5, double d6) throws IOException {
        i(i5, Double.doubleToRawLongBits(d6));
    }

    @Override // android.content.preferences.protobuf.s4
    public final void f(int i5, List<Long> list, boolean z5) throws IOException {
        x(i5, list, z5);
    }

    final android.content.preferences.protobuf.d f0() {
        return this.f7401a.a(this.f7402b);
    }

    @Override // android.content.preferences.protobuf.s4
    public final void g(int i5, List<Long> list, boolean z5) throws IOException {
        if (list instanceof y1) {
            U0(i5, (y1) list, z5);
        } else {
            V0(i5, list, z5);
        }
    }

    final android.content.preferences.protobuf.d g0(int i5) {
        return this.f7401a.a(Math.max(i5, this.f7402b));
    }

    @Override // android.content.preferences.protobuf.s4
    public final void h(int i5, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            E(i5, list.get(size));
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public final s4.a j() {
        return s4.a.DESCENDING;
    }

    final android.content.preferences.protobuf.d j0() {
        return this.f7401a.b(this.f7402b);
    }

    @Override // android.content.preferences.protobuf.s4
    public final void k(int i5, List<?> list, j3 j3Var) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            C(i5, list.get(size), j3Var);
        }
    }

    final android.content.preferences.protobuf.d k0(int i5) {
        return this.f7401a.b(Math.max(i5, this.f7402b));
    }

    @Override // android.content.preferences.protobuf.s4
    public final void l(int i5, List<String> list) throws IOException {
        if (!(list instanceof u1)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                o(i5, list.get(size));
            }
            return;
        }
        u1 u1Var = (u1) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            I0(i5, u1Var.b1(size2));
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public final void m(int i5, List<?> list, j3 j3Var) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            S(i5, list.get(size), j3Var);
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public final void n(int i5, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            q(i5, list.get(size));
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public final void r(int i5, List<Integer> list, boolean z5) throws IOException {
        if (list instanceof n1) {
            G0(i5, (n1) list, z5);
        } else {
            H0(i5, list, z5);
        }
    }

    abstract void r0(int i5);

    @Override // android.content.preferences.protobuf.s4
    public final void s(int i5, long j5) throws IOException {
        p(i5, j5);
    }

    abstract void s0(boolean z5);

    @Override // android.content.preferences.protobuf.s4
    public final void u(int i5, int i6) throws IOException {
        d(i5, i6);
    }

    @Override // android.content.preferences.protobuf.s4
    public final void x(int i5, List<Long> list, boolean z5) throws IOException {
        if (list instanceof y1) {
            B0(i5, (y1) list, z5);
        } else {
            C0(i5, list, z5);
        }
    }

    abstract void x0(int i5);

    @Override // android.content.preferences.protobuf.s4
    public final void y(int i5, List<Integer> list, boolean z5) throws IOException {
        B(i5, list, z5);
    }

    private n(s sVar, int i5) {
        this.f7403c = new ArrayDeque<>(4);
        if (i5 <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.f7401a = (s) o1.e(sVar, "alloc");
        this.f7402b = i5;
    }
}
