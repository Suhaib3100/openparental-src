package androidx.content.preferences.protobuf;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.content.preferences.protobuf.b2;
import androidx.content.preferences.protobuf.p1;
import androidx.content.preferences.protobuf.q4;
import androidx.content.preferences.protobuf.t4;
import androidx.content.preferences.protobuf.v4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* compiled from: BinaryWriter.java */
/* loaded from: classes3.dex */
abstract class o extends v implements v4 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f28802e = 4096;

    /* renamed from: f, reason: collision with root package name */
    private static final int f28803f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f28804g = 2;

    /* renamed from: a, reason: collision with root package name */
    private final t f28805a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28806b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayDeque<androidx.content.preferences.protobuf.d> f28807c;

    /* renamed from: d, reason: collision with root package name */
    int f28808d;

    /* compiled from: BinaryWriter.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28809a;

        static {
            int[] iArr = new int[t4.b.values().length];
            f28809a = iArr;
            try {
                iArr[t4.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28809a[t4.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28809a[t4.b.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28809a[t4.b.INT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28809a[t4.b.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28809a[t4.b.SFIXED32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28809a[t4.b.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28809a[t4.b.SINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28809a[t4.b.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28809a[t4.b.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28809a[t4.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28809a[t4.b.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28809a[t4.b.FLOAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28809a[t4.b.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28809a[t4.b.MESSAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28809a[t4.b.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28809a[t4.b.ENUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: BinaryWriter.java */
    private static final class b extends o {

        /* renamed from: h, reason: collision with root package name */
        private ByteBuffer f28810h;

        /* renamed from: i, reason: collision with root package name */
        private int f28811i;

        /* renamed from: j, reason: collision with root package name */
        private int f28812j;

        b(t tVar, int i4) {
            super(tVar, i4, null);
            Z0();
        }

        private int Y0() {
            return this.f28811i - this.f28812j;
        }

        private void Z0() {
            b1(f0());
        }

        private void a1(int i4) {
            b1(g0(i4));
        }

        private void b1(androidx.content.preferences.protobuf.d dVar) {
            if (!dVar.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer f4 = dVar.f();
            if (!f4.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            b0();
            this.f28807c.addFirst(dVar);
            this.f28810h = f4;
            f4.limit(f4.capacity());
            this.f28810h.position(0);
            this.f28810h.order(ByteOrder.LITTLE_ENDIAN);
            int limit = this.f28810h.limit() - 1;
            this.f28811i = limit;
            this.f28812j = limit;
        }

        private int c1() {
            return this.f28812j + 1;
        }

        private void d1(int i4) {
            ByteBuffer byteBuffer = this.f28810h;
            int i5 = this.f28812j;
            this.f28812j = i5 - 1;
            byteBuffer.put(i5, (byte) (i4 >>> 28));
            int i6 = this.f28812j;
            this.f28812j = i6 - 4;
            this.f28810h.putInt(i6 - 3, (i4 & 127) | 128 | ((((i4 >>> 21) & 127) | 128) << 24) | ((((i4 >>> 14) & 127) | 128) << 16) | ((((i4 >>> 7) & 127) | 128) << 8));
        }

        private void e1(int i4) {
            int i5 = this.f28812j;
            this.f28812j = i5 - 4;
            this.f28810h.putInt(i5 - 3, (i4 & 127) | 128 | ((266338304 & i4) << 3) | (((2080768 & i4) | 2097152) << 2) | (((i4 & 16256) | 16384) << 1));
        }

        private void f1(int i4) {
            ByteBuffer byteBuffer = this.f28810h;
            int i5 = this.f28812j;
            this.f28812j = i5 - 1;
            byteBuffer.put(i5, (byte) i4);
        }

        private void g1(int i4) {
            int i5 = this.f28812j - 3;
            this.f28812j = i5;
            this.f28810h.putInt(i5, (((i4 & 127) | 128) << 8) | ((2080768 & i4) << 10) | (((i4 & 16256) | 16384) << 9));
        }

        private void h1(int i4) {
            int i5 = this.f28812j;
            this.f28812j = i5 - 2;
            this.f28810h.putShort(i5 - 1, (short) ((i4 & 127) | 128 | ((i4 & 16256) << 1)));
        }

        private void i1(long j4) {
            int i4 = this.f28812j;
            this.f28812j = i4 - 8;
            this.f28810h.putLong(i4 - 7, (j4 & 127) | 128 | ((71494644084506624L & j4) << 7) | (((558551906910208L & j4) | 562949953421312L) << 6) | (((4363686772736L & j4) | 4398046511104L) << 5) | (((34091302912L & j4) | 34359738368L) << 4) | (((266338304 & j4) | 268435456) << 3) | (((2080768 & j4) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 2) | (((16256 & j4) | 16384) << 1));
        }

        private void j1(long j4) {
            int i4 = this.f28812j;
            this.f28812j = i4 - 8;
            this.f28810h.putLong(i4 - 7, (j4 & 127) | 128 | (((71494644084506624L & j4) | 72057594037927936L) << 7) | (((558551906910208L & j4) | 562949953421312L) << 6) | (((4363686772736L & j4) | 4398046511104L) << 5) | (((34091302912L & j4) | 34359738368L) << 4) | (((266338304 & j4) | 268435456) << 3) | (((2080768 & j4) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 2) | (((16256 & j4) | 16384) << 1));
        }

        private void k1(long j4) {
            int i4 = this.f28812j;
            this.f28812j = i4 - 5;
            this.f28810h.putLong(i4 - 7, (((j4 & 127) | 128) << 24) | ((34091302912L & j4) << 28) | (((266338304 & j4) | 268435456) << 27) | (((2080768 & j4) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 26) | (((16256 & j4) | 16384) << 25));
        }

        private void l1(long j4) {
            e1((int) j4);
        }

        private void m1(long j4) {
            ByteBuffer byteBuffer = this.f28810h;
            int i4 = this.f28812j;
            this.f28812j = i4 - 1;
            byteBuffer.put(i4, (byte) (j4 >>> 56));
            j1(j4 & 72057594037927935L);
        }

        private void n1(long j4) {
            f1((int) j4);
        }

        private void o1(long j4) {
            int i4 = this.f28812j - 7;
            this.f28812j = i4;
            this.f28810h.putLong(i4, (((j4 & 127) | 128) << 8) | ((558551906910208L & j4) << 14) | (((4363686772736L & j4) | 4398046511104L) << 13) | (((34091302912L & j4) | 34359738368L) << 12) | (((266338304 & j4) | 268435456) << 11) | (((2080768 & j4) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 10) | (((16256 & j4) | 16384) << 9));
        }

        private void p1(long j4) {
            int i4 = this.f28812j;
            this.f28812j = i4 - 6;
            this.f28810h.putLong(i4 - 7, (((j4 & 127) | 128) << 16) | ((4363686772736L & j4) << 21) | (((34091302912L & j4) | 34359738368L) << 20) | (((266338304 & j4) | 268435456) << 19) | (((2080768 & j4) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 18) | (((16256 & j4) | 16384) << 17));
        }

        private void q1(long j4) {
            ByteBuffer byteBuffer = this.f28810h;
            int i4 = this.f28812j;
            this.f28812j = i4 - 1;
            byteBuffer.put(i4, (byte) (j4 >>> 63));
            ByteBuffer byteBuffer2 = this.f28810h;
            int i5 = this.f28812j;
            this.f28812j = i5 - 1;
            byteBuffer2.put(i5, (byte) (((j4 >>> 56) & 127) | 128));
            j1(j4 & 72057594037927935L);
        }

        private void r1(long j4) {
            g1((int) j4);
        }

        private void s1(long j4) {
            h1((int) j4);
        }

        @Override // androidx.content.preferences.protobuf.o
        void A0(long j4) {
            int i4 = this.f28812j;
            this.f28812j = i4 - 8;
            this.f28810h.putLong(i4 - 7, j4);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void C(int i4, Object obj) throws IOException {
            int c02 = c0();
            f3.a().k(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i4, 2);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void E(int i4, boolean z4) {
            r0(6);
            T(z4 ? (byte) 1 : (byte) 0);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void F0(int i4) {
            if (i4 >= 0) {
                W0(i4);
            } else {
                X0(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void G(int i4) {
            R0(i4, 3);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void K(int i4, Object obj) throws IOException {
            R0(i4, 4);
            f3.a().k(obj, this);
            R0(i4, 3);
        }

        @Override // androidx.content.preferences.protobuf.o
        void K0(int i4) {
            W0(CodedOutputStream.c1(i4));
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void M(int i4) {
            R0(i4, 4);
        }

        @Override // androidx.content.preferences.protobuf.o
        void N0(long j4) {
            X0(CodedOutputStream.d1(j4));
        }

        @Override // androidx.content.preferences.protobuf.o
        void Q0(String str) {
            int i4;
            int i5;
            int i6;
            char charAt;
            r0(str.length());
            int length = str.length() - 1;
            this.f28812j -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f28810h.put(this.f28812j + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.f28812j--;
                return;
            }
            this.f28812j += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i6 = this.f28812j) >= 0) {
                    ByteBuffer byteBuffer = this.f28810h;
                    this.f28812j = i6 - 1;
                    byteBuffer.put(i6, (byte) charAt2);
                } else if (charAt2 < 2048 && (i5 = this.f28812j) > 0) {
                    ByteBuffer byteBuffer2 = this.f28810h;
                    this.f28812j = i5 - 1;
                    byteBuffer2.put(i5, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f28810h;
                    int i7 = this.f28812j;
                    this.f28812j = i7 - 1;
                    byteBuffer3.put(i7, (byte) ((charAt2 >>> 6) | 960));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i4 = this.f28812j) > 1) {
                    ByteBuffer byteBuffer4 = this.f28810h;
                    this.f28812j = i4 - 1;
                    byteBuffer4.put(i4, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f28810h;
                    int i10 = this.f28812j;
                    this.f28812j = i10 - 1;
                    byteBuffer5.put(i10, (byte) (((charAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f28810h;
                    int i11 = this.f28812j;
                    this.f28812j = i11 - 1;
                    byteBuffer6.put(i11, (byte) ((charAt2 >>> '\f') | 480));
                } else {
                    if (this.f28812j > 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                ByteBuffer byteBuffer7 = this.f28810h;
                                int i12 = this.f28812j;
                                this.f28812j = i12 - 1;
                                byteBuffer7.put(i12, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer8 = this.f28810h;
                                int i13 = this.f28812j;
                                this.f28812j = i13 - 1;
                                byteBuffer8.put(i13, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer9 = this.f28810h;
                                int i14 = this.f28812j;
                                this.f28812j = i14 - 1;
                                byteBuffer9.put(i14, (byte) (((codePoint >>> 12) & 63) | 128));
                                ByteBuffer byteBuffer10 = this.f28810h;
                                int i15 = this.f28812j;
                                this.f28812j = i15 - 1;
                                byteBuffer10.put(i15, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new q4.d(length - 1, length);
                    }
                    r0(length);
                    length++;
                }
                length--;
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void R(int i4, int i5) {
            r0(10);
            K0(i5);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void R0(int i4, int i5) {
            W0(t4.c(i4, i5));
        }

        @Override // androidx.content.preferences.protobuf.v
        public void T(byte b5) {
            ByteBuffer byteBuffer = this.f28810h;
            int i4 = this.f28812j;
            this.f28812j = i4 - 1;
            byteBuffer.put(i4, b5);
        }

        @Override // androidx.content.preferences.protobuf.v
        public void U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (this.f28812j + 1 < remaining) {
                a1(remaining);
            }
            int i4 = this.f28812j - remaining;
            this.f28812j = i4;
            this.f28810h.position(i4 + 1);
            this.f28810h.put(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.v
        public void V(byte[] bArr, int i4, int i5) {
            if (this.f28812j + 1 < i5) {
                a1(i5);
            }
            int i6 = this.f28812j - i5;
            this.f28812j = i6;
            this.f28810h.position(i6 + 1);
            this.f28810h.put(bArr, i4, i5);
        }

        @Override // androidx.content.preferences.protobuf.v
        public void W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i4 = this.f28812j;
            if (i4 + 1 < remaining) {
                this.f28808d += remaining;
                this.f28807c.addFirst(androidx.content.preferences.protobuf.d.j(byteBuffer));
                Z0();
            } else {
                int i5 = i4 - remaining;
                this.f28812j = i5;
                this.f28810h.position(i5 + 1);
                this.f28810h.put(byteBuffer);
            }
        }

        @Override // androidx.content.preferences.protobuf.o
        void W0(int i4) {
            if ((i4 & (-128)) == 0) {
                f1(i4);
                return;
            }
            if ((i4 & (-16384)) == 0) {
                h1(i4);
                return;
            }
            if (((-2097152) & i4) == 0) {
                g1(i4);
            } else if (((-268435456) & i4) == 0) {
                e1(i4);
            } else {
                d1(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.v
        public void X(byte[] bArr, int i4, int i5) {
            int i6 = this.f28812j;
            if (i6 + 1 < i5) {
                this.f28808d += i5;
                this.f28807c.addFirst(androidx.content.preferences.protobuf.d.l(bArr, i4, i5));
                Z0();
            } else {
                int i7 = i6 - i5;
                this.f28812j = i7;
                this.f28810h.position(i7 + 1);
                this.f28810h.put(bArr, i4, i5);
            }
        }

        @Override // androidx.content.preferences.protobuf.o
        void X0(long j4) {
            switch (o.a0(j4)) {
                case 1:
                    f1((int) j4);
                    break;
                case 2:
                    h1((int) j4);
                    break;
                case 3:
                    g1((int) j4);
                    break;
                case 4:
                    e1((int) j4);
                    break;
                case 5:
                    k1(j4);
                    break;
                case 6:
                    p1(j4);
                    break;
                case 7:
                    o1(j4);
                    break;
                case 8:
                    i1(j4);
                    break;
                case 9:
                    m1(j4);
                    break;
                case 10:
                    q1(j4);
                    break;
            }
        }

        @Override // androidx.content.preferences.protobuf.o
        void b0() {
            if (this.f28810h != null) {
                this.f28808d += Y0();
                this.f28810h.position(this.f28812j + 1);
                this.f28810h = null;
                this.f28812j = 0;
                this.f28811i = 0;
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void c(int i4, int i5) {
            r0(9);
            x0(i5);
            R0(i4, 5);
        }

        @Override // androidx.content.preferences.protobuf.o
        public int c0() {
            return this.f28808d + Y0();
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void g(int i4, String str) {
            int c02 = c0();
            Q0(str);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i4, 2);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void h(int i4, long j4) {
            r0(15);
            X0(j4);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void j(int i4, int i5) {
            r0(15);
            F0(i5);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void k(int i4, w wVar) {
            try {
                wVar.x0(this);
                r0(10);
                W0(wVar.size());
                R0(i4, 2);
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void n(int i4, Object obj, m3 m3Var) throws IOException {
            int c02 = c0();
            m3Var.h(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i4, 2);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void q(int i4, long j4) {
            r0(15);
            N0(j4);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void r0(int i4) {
            if (this.f28812j + 1 < i4) {
                a1(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.o
        void s0(boolean z4) {
            T(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void t(int i4, Object obj, m3 m3Var) throws IOException {
            R0(i4, 4);
            m3Var.h(obj, this);
            R0(i4, 3);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void u(int i4, int i5) {
            r0(10);
            W0(i5);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void x0(int i4) {
            int i5 = this.f28812j;
            this.f28812j = i5 - 4;
            this.f28810h.putInt(i5 - 3, i4);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void y(int i4, long j4) {
            r0(13);
            A0(j4);
            R0(i4, 1);
        }
    }

    /* compiled from: BinaryWriter.java */
    private static final class c extends o {

        /* renamed from: h, reason: collision with root package name */
        private androidx.content.preferences.protobuf.d f28813h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f28814i;

        /* renamed from: j, reason: collision with root package name */
        private int f28815j;

        /* renamed from: k, reason: collision with root package name */
        private int f28816k;

        /* renamed from: l, reason: collision with root package name */
        private int f28817l;

        /* renamed from: m, reason: collision with root package name */
        private int f28818m;

        /* renamed from: n, reason: collision with root package name */
        private int f28819n;

        c(t tVar, int i4) {
            super(tVar, i4, null);
            Z0();
        }

        private void Z0() {
            b1(j0());
        }

        private void a1(int i4) {
            b1(k0(i4));
        }

        private void b1(androidx.content.preferences.protobuf.d dVar) {
            if (!dVar.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            b0();
            this.f28807c.addFirst(dVar);
            this.f28813h = dVar;
            this.f28814i = dVar.a();
            int b5 = dVar.b();
            this.f28816k = dVar.e() + b5;
            int g4 = b5 + dVar.g();
            this.f28815j = g4;
            this.f28817l = g4 - 1;
            int i4 = this.f28816k - 1;
            this.f28818m = i4;
            this.f28819n = i4;
        }

        private void d1(int i4) {
            byte[] bArr = this.f28814i;
            int i5 = this.f28819n;
            int i6 = i5 - 1;
            this.f28819n = i6;
            bArr[i5] = (byte) (i4 >>> 28);
            int i7 = i5 - 2;
            this.f28819n = i7;
            bArr[i6] = (byte) (((i4 >>> 21) & 127) | 128);
            int i10 = i5 - 3;
            this.f28819n = i10;
            bArr[i7] = (byte) (((i4 >>> 14) & 127) | 128);
            int i11 = i5 - 4;
            this.f28819n = i11;
            bArr[i10] = (byte) (((i4 >>> 7) & 127) | 128);
            this.f28819n = i5 - 5;
            bArr[i11] = (byte) ((i4 & 127) | 128);
        }

        private void e1(int i4) {
            byte[] bArr = this.f28814i;
            int i5 = this.f28819n;
            int i6 = i5 - 1;
            this.f28819n = i6;
            bArr[i5] = (byte) (i4 >>> 21);
            int i7 = i5 - 2;
            this.f28819n = i7;
            bArr[i6] = (byte) (((i4 >>> 14) & 127) | 128);
            int i10 = i5 - 3;
            this.f28819n = i10;
            bArr[i7] = (byte) (((i4 >>> 7) & 127) | 128);
            this.f28819n = i5 - 4;
            bArr[i10] = (byte) ((i4 & 127) | 128);
        }

        private void f1(int i4) {
            byte[] bArr = this.f28814i;
            int i5 = this.f28819n;
            this.f28819n = i5 - 1;
            bArr[i5] = (byte) i4;
        }

        private void g1(int i4) {
            byte[] bArr = this.f28814i;
            int i5 = this.f28819n;
            int i6 = i5 - 1;
            this.f28819n = i6;
            bArr[i5] = (byte) (i4 >>> 14);
            int i7 = i5 - 2;
            this.f28819n = i7;
            bArr[i6] = (byte) (((i4 >>> 7) & 127) | 128);
            this.f28819n = i5 - 3;
            bArr[i7] = (byte) ((i4 & 127) | 128);
        }

        private void h1(int i4) {
            byte[] bArr = this.f28814i;
            int i5 = this.f28819n;
            int i6 = i5 - 1;
            this.f28819n = i6;
            bArr[i5] = (byte) (i4 >>> 7);
            this.f28819n = i5 - 2;
            bArr[i6] = (byte) ((i4 & 127) | 128);
        }

        private void i1(long j4) {
            byte[] bArr = this.f28814i;
            int i4 = this.f28819n;
            int i5 = i4 - 1;
            this.f28819n = i5;
            bArr[i4] = (byte) (j4 >>> 49);
            int i6 = i4 - 2;
            this.f28819n = i6;
            bArr[i5] = (byte) (((j4 >>> 42) & 127) | 128);
            int i7 = i4 - 3;
            this.f28819n = i7;
            bArr[i6] = (byte) (((j4 >>> 35) & 127) | 128);
            int i10 = i4 - 4;
            this.f28819n = i10;
            bArr[i7] = (byte) (((j4 >>> 28) & 127) | 128);
            int i11 = i4 - 5;
            this.f28819n = i11;
            bArr[i10] = (byte) (((j4 >>> 21) & 127) | 128);
            int i12 = i4 - 6;
            this.f28819n = i12;
            bArr[i11] = (byte) (((j4 >>> 14) & 127) | 128);
            int i13 = i4 - 7;
            this.f28819n = i13;
            bArr[i12] = (byte) (((j4 >>> 7) & 127) | 128);
            this.f28819n = i4 - 8;
            bArr[i13] = (byte) ((j4 & 127) | 128);
        }

        private void j1(long j4) {
            byte[] bArr = this.f28814i;
            int i4 = this.f28819n;
            int i5 = i4 - 1;
            this.f28819n = i5;
            bArr[i4] = (byte) (j4 >>> 28);
            int i6 = i4 - 2;
            this.f28819n = i6;
            bArr[i5] = (byte) (((j4 >>> 21) & 127) | 128);
            int i7 = i4 - 3;
            this.f28819n = i7;
            bArr[i6] = (byte) (((j4 >>> 14) & 127) | 128);
            int i10 = i4 - 4;
            this.f28819n = i10;
            bArr[i7] = (byte) (((j4 >>> 7) & 127) | 128);
            this.f28819n = i4 - 5;
            bArr[i10] = (byte) ((j4 & 127) | 128);
        }

        private void k1(long j4) {
            byte[] bArr = this.f28814i;
            int i4 = this.f28819n;
            int i5 = i4 - 1;
            this.f28819n = i5;
            bArr[i4] = (byte) (j4 >>> 21);
            int i6 = i4 - 2;
            this.f28819n = i6;
            bArr[i5] = (byte) (((j4 >>> 14) & 127) | 128);
            int i7 = i4 - 3;
            this.f28819n = i7;
            bArr[i6] = (byte) (((j4 >>> 7) & 127) | 128);
            this.f28819n = i4 - 4;
            bArr[i7] = (byte) ((j4 & 127) | 128);
        }

        private void l1(long j4) {
            byte[] bArr = this.f28814i;
            int i4 = this.f28819n;
            int i5 = i4 - 1;
            this.f28819n = i5;
            bArr[i4] = (byte) (j4 >>> 56);
            int i6 = i4 - 2;
            this.f28819n = i6;
            bArr[i5] = (byte) (((j4 >>> 49) & 127) | 128);
            int i7 = i4 - 3;
            this.f28819n = i7;
            bArr[i6] = (byte) (((j4 >>> 42) & 127) | 128);
            int i10 = i4 - 4;
            this.f28819n = i10;
            bArr[i7] = (byte) (((j4 >>> 35) & 127) | 128);
            int i11 = i4 - 5;
            this.f28819n = i11;
            bArr[i10] = (byte) (((j4 >>> 28) & 127) | 128);
            int i12 = i4 - 6;
            this.f28819n = i12;
            bArr[i11] = (byte) (((j4 >>> 21) & 127) | 128);
            int i13 = i4 - 7;
            this.f28819n = i13;
            bArr[i12] = (byte) (((j4 >>> 14) & 127) | 128);
            int i14 = i4 - 8;
            this.f28819n = i14;
            bArr[i13] = (byte) (((j4 >>> 7) & 127) | 128);
            this.f28819n = i4 - 9;
            bArr[i14] = (byte) ((j4 & 127) | 128);
        }

        private void m1(long j4) {
            byte[] bArr = this.f28814i;
            int i4 = this.f28819n;
            this.f28819n = i4 - 1;
            bArr[i4] = (byte) j4;
        }

        private void n1(long j4) {
            byte[] bArr = this.f28814i;
            int i4 = this.f28819n;
            int i5 = i4 - 1;
            this.f28819n = i5;
            bArr[i4] = (byte) (j4 >>> 42);
            int i6 = i4 - 2;
            this.f28819n = i6;
            bArr[i5] = (byte) (((j4 >>> 35) & 127) | 128);
            int i7 = i4 - 3;
            this.f28819n = i7;
            bArr[i6] = (byte) (((j4 >>> 28) & 127) | 128);
            int i10 = i4 - 4;
            this.f28819n = i10;
            bArr[i7] = (byte) (((j4 >>> 21) & 127) | 128);
            int i11 = i4 - 5;
            this.f28819n = i11;
            bArr[i10] = (byte) (((j4 >>> 14) & 127) | 128);
            int i12 = i4 - 6;
            this.f28819n = i12;
            bArr[i11] = (byte) (((j4 >>> 7) & 127) | 128);
            this.f28819n = i4 - 7;
            bArr[i12] = (byte) ((j4 & 127) | 128);
        }

        private void o1(long j4) {
            byte[] bArr = this.f28814i;
            int i4 = this.f28819n;
            int i5 = i4 - 1;
            this.f28819n = i5;
            bArr[i4] = (byte) (j4 >>> 35);
            int i6 = i4 - 2;
            this.f28819n = i6;
            bArr[i5] = (byte) (((j4 >>> 28) & 127) | 128);
            int i7 = i4 - 3;
            this.f28819n = i7;
            bArr[i6] = (byte) (((j4 >>> 21) & 127) | 128);
            int i10 = i4 - 4;
            this.f28819n = i10;
            bArr[i7] = (byte) (((j4 >>> 14) & 127) | 128);
            int i11 = i4 - 5;
            this.f28819n = i11;
            bArr[i10] = (byte) (((j4 >>> 7) & 127) | 128);
            this.f28819n = i4 - 6;
            bArr[i11] = (byte) ((j4 & 127) | 128);
        }

        private void p1(long j4) {
            byte[] bArr = this.f28814i;
            int i4 = this.f28819n;
            int i5 = i4 - 1;
            this.f28819n = i5;
            bArr[i4] = (byte) (j4 >>> 63);
            int i6 = i4 - 2;
            this.f28819n = i6;
            bArr[i5] = (byte) (((j4 >>> 56) & 127) | 128);
            int i7 = i4 - 3;
            this.f28819n = i7;
            bArr[i6] = (byte) (((j4 >>> 49) & 127) | 128);
            int i10 = i4 - 4;
            this.f28819n = i10;
            bArr[i7] = (byte) (((j4 >>> 42) & 127) | 128);
            int i11 = i4 - 5;
            this.f28819n = i11;
            bArr[i10] = (byte) (((j4 >>> 35) & 127) | 128);
            int i12 = i4 - 6;
            this.f28819n = i12;
            bArr[i11] = (byte) (((j4 >>> 28) & 127) | 128);
            int i13 = i4 - 7;
            this.f28819n = i13;
            bArr[i12] = (byte) (((j4 >>> 21) & 127) | 128);
            int i14 = i4 - 8;
            this.f28819n = i14;
            bArr[i13] = (byte) (((j4 >>> 14) & 127) | 128);
            int i15 = i4 - 9;
            this.f28819n = i15;
            bArr[i14] = (byte) (((j4 >>> 7) & 127) | 128);
            this.f28819n = i4 - 10;
            bArr[i15] = (byte) ((j4 & 127) | 128);
        }

        private void q1(long j4) {
            byte[] bArr = this.f28814i;
            int i4 = this.f28819n;
            int i5 = i4 - 1;
            this.f28819n = i5;
            bArr[i4] = (byte) (((int) j4) >>> 14);
            int i6 = i4 - 2;
            this.f28819n = i6;
            bArr[i5] = (byte) (((j4 >>> 7) & 127) | 128);
            this.f28819n = i4 - 3;
            bArr[i6] = (byte) ((j4 & 127) | 128);
        }

        private void r1(long j4) {
            byte[] bArr = this.f28814i;
            int i4 = this.f28819n;
            int i5 = i4 - 1;
            this.f28819n = i5;
            bArr[i4] = (byte) (j4 >>> 7);
            this.f28819n = i4 - 2;
            bArr[i5] = (byte) ((((int) j4) & 127) | 128);
        }

        @Override // androidx.content.preferences.protobuf.o
        void A0(long j4) {
            byte[] bArr = this.f28814i;
            int i4 = this.f28819n;
            int i5 = i4 - 1;
            this.f28819n = i5;
            bArr[i4] = (byte) (((int) (j4 >> 56)) & 255);
            int i6 = i4 - 2;
            this.f28819n = i6;
            bArr[i5] = (byte) (((int) (j4 >> 48)) & 255);
            int i7 = i4 - 3;
            this.f28819n = i7;
            bArr[i6] = (byte) (((int) (j4 >> 40)) & 255);
            int i10 = i4 - 4;
            this.f28819n = i10;
            bArr[i7] = (byte) (((int) (j4 >> 32)) & 255);
            int i11 = i4 - 5;
            this.f28819n = i11;
            bArr[i10] = (byte) (((int) (j4 >> 24)) & 255);
            int i12 = i4 - 6;
            this.f28819n = i12;
            bArr[i11] = (byte) (((int) (j4 >> 16)) & 255);
            int i13 = i4 - 7;
            this.f28819n = i13;
            bArr[i12] = (byte) (((int) (j4 >> 8)) & 255);
            this.f28819n = i4 - 8;
            bArr[i13] = (byte) (((int) j4) & 255);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void C(int i4, Object obj) throws IOException {
            int c02 = c0();
            f3.a().k(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i4, 2);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void E(int i4, boolean z4) throws IOException {
            r0(6);
            T(z4 ? (byte) 1 : (byte) 0);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void F0(int i4) {
            if (i4 >= 0) {
                W0(i4);
            } else {
                X0(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void G(int i4) {
            R0(i4, 3);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void K(int i4, Object obj) throws IOException {
            R0(i4, 4);
            f3.a().k(obj, this);
            R0(i4, 3);
        }

        @Override // androidx.content.preferences.protobuf.o
        void K0(int i4) {
            W0(CodedOutputStream.c1(i4));
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void M(int i4) {
            R0(i4, 4);
        }

        @Override // androidx.content.preferences.protobuf.o
        void N0(long j4) {
            X0(CodedOutputStream.d1(j4));
        }

        @Override // androidx.content.preferences.protobuf.o
        void Q0(String str) {
            int i4;
            int i5;
            int i6;
            char charAt;
            r0(str.length());
            int length = str.length() - 1;
            this.f28819n -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f28814i[this.f28819n + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.f28819n--;
                return;
            }
            this.f28819n += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i6 = this.f28819n) > this.f28817l) {
                    byte[] bArr = this.f28814i;
                    this.f28819n = i6 - 1;
                    bArr[i6] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i5 = this.f28819n) > this.f28815j) {
                    byte[] bArr2 = this.f28814i;
                    int i7 = i5 - 1;
                    this.f28819n = i7;
                    bArr2[i5] = (byte) ((charAt2 & '?') | 128);
                    this.f28819n = i5 - 2;
                    bArr2[i7] = (byte) ((charAt2 >>> 6) | 960);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i4 = this.f28819n) > this.f28815j + 1) {
                    byte[] bArr3 = this.f28814i;
                    int i10 = i4 - 1;
                    this.f28819n = i10;
                    bArr3[i4] = (byte) ((charAt2 & '?') | 128);
                    int i11 = i4 - 2;
                    this.f28819n = i11;
                    bArr3[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.f28819n = i4 - 3;
                    bArr3[i11] = (byte) ((charAt2 >>> '\f') | 480);
                } else {
                    if (this.f28819n > this.f28815j + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr4 = this.f28814i;
                                int i12 = this.f28819n;
                                int i13 = i12 - 1;
                                this.f28819n = i13;
                                bArr4[i12] = (byte) ((codePoint & 63) | 128);
                                int i14 = i12 - 2;
                                this.f28819n = i14;
                                bArr4[i13] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i15 = i12 - 3;
                                this.f28819n = i15;
                                bArr4[i14] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.f28819n = i12 - 4;
                                bArr4[i15] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new q4.d(length - 1, length);
                    }
                    r0(length);
                    length++;
                }
                length--;
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void R(int i4, int i5) throws IOException {
            r0(10);
            K0(i5);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void R0(int i4, int i5) {
            W0(t4.c(i4, i5));
        }

        @Override // androidx.content.preferences.protobuf.v
        public void T(byte b5) {
            byte[] bArr = this.f28814i;
            int i4 = this.f28819n;
            this.f28819n = i4 - 1;
            bArr[i4] = b5;
        }

        @Override // androidx.content.preferences.protobuf.v
        public void U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (c1() < remaining) {
                a1(remaining);
            }
            int i4 = this.f28819n - remaining;
            this.f28819n = i4;
            byteBuffer.get(this.f28814i, i4 + 1, remaining);
        }

        @Override // androidx.content.preferences.protobuf.v
        public void V(byte[] bArr, int i4, int i5) {
            if (c1() < i5) {
                a1(i5);
            }
            int i6 = this.f28819n - i5;
            this.f28819n = i6;
            System.arraycopy(bArr, i4, this.f28814i, i6 + 1, i5);
        }

        @Override // androidx.content.preferences.protobuf.v
        public void W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (c1() < remaining) {
                this.f28808d += remaining;
                this.f28807c.addFirst(androidx.content.preferences.protobuf.d.j(byteBuffer));
                Z0();
            }
            int i4 = this.f28819n - remaining;
            this.f28819n = i4;
            byteBuffer.get(this.f28814i, i4 + 1, remaining);
        }

        @Override // androidx.content.preferences.protobuf.o
        void W0(int i4) {
            if ((i4 & (-128)) == 0) {
                f1(i4);
                return;
            }
            if ((i4 & (-16384)) == 0) {
                h1(i4);
                return;
            }
            if (((-2097152) & i4) == 0) {
                g1(i4);
            } else if (((-268435456) & i4) == 0) {
                e1(i4);
            } else {
                d1(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.v
        public void X(byte[] bArr, int i4, int i5) {
            if (c1() < i5) {
                this.f28808d += i5;
                this.f28807c.addFirst(androidx.content.preferences.protobuf.d.l(bArr, i4, i5));
                Z0();
            } else {
                int i6 = this.f28819n - i5;
                this.f28819n = i6;
                System.arraycopy(bArr, i4, this.f28814i, i6 + 1, i5);
            }
        }

        @Override // androidx.content.preferences.protobuf.o
        void X0(long j4) {
            switch (o.a0(j4)) {
                case 1:
                    m1(j4);
                    break;
                case 2:
                    r1(j4);
                    break;
                case 3:
                    q1(j4);
                    break;
                case 4:
                    k1(j4);
                    break;
                case 5:
                    j1(j4);
                    break;
                case 6:
                    o1(j4);
                    break;
                case 7:
                    n1(j4);
                    break;
                case 8:
                    i1(j4);
                    break;
                case 9:
                    l1(j4);
                    break;
                case 10:
                    p1(j4);
                    break;
            }
        }

        int Y0() {
            return this.f28818m - this.f28819n;
        }

        @Override // androidx.content.preferences.protobuf.o
        void b0() {
            if (this.f28813h != null) {
                this.f28808d += Y0();
                androidx.content.preferences.protobuf.d dVar = this.f28813h;
                dVar.h((this.f28819n - dVar.b()) + 1);
                this.f28813h = null;
                this.f28819n = 0;
                this.f28818m = 0;
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void c(int i4, int i5) throws IOException {
            r0(9);
            x0(i5);
            R0(i4, 5);
        }

        @Override // androidx.content.preferences.protobuf.o
        public int c0() {
            return this.f28808d + Y0();
        }

        int c1() {
            return this.f28819n - this.f28817l;
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void g(int i4, String str) throws IOException {
            int c02 = c0();
            Q0(str);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i4, 2);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void h(int i4, long j4) throws IOException {
            r0(15);
            X0(j4);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void j(int i4, int i5) throws IOException {
            r0(15);
            F0(i5);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void k(int i4, w wVar) throws IOException {
            try {
                wVar.x0(this);
                r0(10);
                W0(wVar.size());
                R0(i4, 2);
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void n(int i4, Object obj, m3 m3Var) throws IOException {
            int c02 = c0();
            m3Var.h(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i4, 2);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void q(int i4, long j4) throws IOException {
            r0(15);
            N0(j4);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void r0(int i4) {
            if (c1() < i4) {
                a1(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.o
        void s0(boolean z4) {
            T(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void t(int i4, Object obj, m3 m3Var) throws IOException {
            R0(i4, 4);
            m3Var.h(obj, this);
            R0(i4, 3);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void u(int i4, int i5) throws IOException {
            r0(10);
            W0(i5);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void x0(int i4) {
            byte[] bArr = this.f28814i;
            int i5 = this.f28819n;
            int i6 = i5 - 1;
            this.f28819n = i6;
            bArr[i5] = (byte) ((i4 >> 24) & 255);
            int i7 = i5 - 2;
            this.f28819n = i7;
            bArr[i6] = (byte) ((i4 >> 16) & 255);
            int i10 = i5 - 3;
            this.f28819n = i10;
            bArr[i7] = (byte) ((i4 >> 8) & 255);
            this.f28819n = i5 - 4;
            bArr[i10] = (byte) (i4 & 255);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void y(int i4, long j4) throws IOException {
            r0(13);
            A0(j4);
            R0(i4, 1);
        }
    }

    /* compiled from: BinaryWriter.java */
    private static final class d extends o {

        /* renamed from: h, reason: collision with root package name */
        private ByteBuffer f28820h;

        /* renamed from: i, reason: collision with root package name */
        private long f28821i;

        /* renamed from: j, reason: collision with root package name */
        private long f28822j;

        /* renamed from: k, reason: collision with root package name */
        private long f28823k;

        d(t tVar, int i4) {
            super(tVar, i4, null);
            c1();
        }

        static boolean Y0() {
            return p4.T();
        }

        private int Z0() {
            return (int) (this.f28823k - this.f28821i);
        }

        private int a1() {
            return (int) (this.f28822j - this.f28823k);
        }

        private static boolean b1() {
            return p4.T();
        }

        private void c1() {
            e1(f0());
        }

        private void d1(int i4) {
            e1(g0(i4));
        }

        private void e1(androidx.content.preferences.protobuf.d dVar) {
            if (!dVar.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer f4 = dVar.f();
            if (!f4.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            b0();
            this.f28807c.addFirst(dVar);
            this.f28820h = f4;
            f4.limit(f4.capacity());
            this.f28820h.position(0);
            long i4 = p4.i(this.f28820h);
            this.f28821i = i4;
            long limit = i4 + (this.f28820h.limit() - 1);
            this.f28822j = limit;
            this.f28823k = limit;
        }

        private int f1() {
            return Z0() + 1;
        }

        private void g1(int i4) {
            long j4 = this.f28823k;
            this.f28823k = j4 - 1;
            p4.b0(j4, (byte) (i4 >>> 28));
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (((i4 >>> 21) & 127) | 128));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) (((i4 >>> 14) & 127) | 128));
            long j7 = this.f28823k;
            this.f28823k = j7 - 1;
            p4.b0(j7, (byte) (((i4 >>> 7) & 127) | 128));
            long j10 = this.f28823k;
            this.f28823k = j10 - 1;
            p4.b0(j10, (byte) ((i4 & 127) | 128));
        }

        private void h1(int i4) {
            long j4 = this.f28823k;
            this.f28823k = j4 - 1;
            p4.b0(j4, (byte) (i4 >>> 21));
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (((i4 >>> 14) & 127) | 128));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) (((i4 >>> 7) & 127) | 128));
            long j7 = this.f28823k;
            this.f28823k = j7 - 1;
            p4.b0(j7, (byte) ((i4 & 127) | 128));
        }

        private void i1(int i4) {
            long j4 = this.f28823k;
            this.f28823k = j4 - 1;
            p4.b0(j4, (byte) i4);
        }

        private void j1(int i4) {
            long j4 = this.f28823k;
            this.f28823k = j4 - 1;
            p4.b0(j4, (byte) (i4 >>> 14));
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (((i4 >>> 7) & 127) | 128));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) ((i4 & 127) | 128));
        }

        private void k1(int i4) {
            long j4 = this.f28823k;
            this.f28823k = j4 - 1;
            p4.b0(j4, (byte) (i4 >>> 7));
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) ((i4 & 127) | 128));
        }

        private void l1(long j4) {
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (j4 >>> 49));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) (((j4 >>> 42) & 127) | 128));
            long j7 = this.f28823k;
            this.f28823k = j7 - 1;
            p4.b0(j7, (byte) (((j4 >>> 35) & 127) | 128));
            long j10 = this.f28823k;
            this.f28823k = j10 - 1;
            p4.b0(j10, (byte) (((j4 >>> 28) & 127) | 128));
            long j11 = this.f28823k;
            this.f28823k = j11 - 1;
            p4.b0(j11, (byte) (((j4 >>> 21) & 127) | 128));
            long j12 = this.f28823k;
            this.f28823k = j12 - 1;
            p4.b0(j12, (byte) (((j4 >>> 14) & 127) | 128));
            long j13 = this.f28823k;
            this.f28823k = j13 - 1;
            p4.b0(j13, (byte) (((j4 >>> 7) & 127) | 128));
            long j14 = this.f28823k;
            this.f28823k = j14 - 1;
            p4.b0(j14, (byte) ((j4 & 127) | 128));
        }

        private void m1(long j4) {
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (j4 >>> 28));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) (((j4 >>> 21) & 127) | 128));
            long j7 = this.f28823k;
            this.f28823k = j7 - 1;
            p4.b0(j7, (byte) (((j4 >>> 14) & 127) | 128));
            long j10 = this.f28823k;
            this.f28823k = j10 - 1;
            p4.b0(j10, (byte) (((j4 >>> 7) & 127) | 128));
            long j11 = this.f28823k;
            this.f28823k = j11 - 1;
            p4.b0(j11, (byte) ((j4 & 127) | 128));
        }

        private void n1(long j4) {
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (j4 >>> 21));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) (((j4 >>> 14) & 127) | 128));
            long j7 = this.f28823k;
            this.f28823k = j7 - 1;
            p4.b0(j7, (byte) (((j4 >>> 7) & 127) | 128));
            long j10 = this.f28823k;
            this.f28823k = j10 - 1;
            p4.b0(j10, (byte) ((j4 & 127) | 128));
        }

        private void o1(long j4) {
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (j4 >>> 56));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) (((j4 >>> 49) & 127) | 128));
            long j7 = this.f28823k;
            this.f28823k = j7 - 1;
            p4.b0(j7, (byte) (((j4 >>> 42) & 127) | 128));
            long j10 = this.f28823k;
            this.f28823k = j10 - 1;
            p4.b0(j10, (byte) (((j4 >>> 35) & 127) | 128));
            long j11 = this.f28823k;
            this.f28823k = j11 - 1;
            p4.b0(j11, (byte) (((j4 >>> 28) & 127) | 128));
            long j12 = this.f28823k;
            this.f28823k = j12 - 1;
            p4.b0(j12, (byte) (((j4 >>> 21) & 127) | 128));
            long j13 = this.f28823k;
            this.f28823k = j13 - 1;
            p4.b0(j13, (byte) (((j4 >>> 14) & 127) | 128));
            long j14 = this.f28823k;
            this.f28823k = j14 - 1;
            p4.b0(j14, (byte) (((j4 >>> 7) & 127) | 128));
            long j15 = this.f28823k;
            this.f28823k = j15 - 1;
            p4.b0(j15, (byte) ((j4 & 127) | 128));
        }

        private void p1(long j4) {
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) j4);
        }

        private void q1(long j4) {
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (j4 >>> 42));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) (((j4 >>> 35) & 127) | 128));
            long j7 = this.f28823k;
            this.f28823k = j7 - 1;
            p4.b0(j7, (byte) (((j4 >>> 28) & 127) | 128));
            long j10 = this.f28823k;
            this.f28823k = j10 - 1;
            p4.b0(j10, (byte) (((j4 >>> 21) & 127) | 128));
            long j11 = this.f28823k;
            this.f28823k = j11 - 1;
            p4.b0(j11, (byte) (((j4 >>> 14) & 127) | 128));
            long j12 = this.f28823k;
            this.f28823k = j12 - 1;
            p4.b0(j12, (byte) (((j4 >>> 7) & 127) | 128));
            long j13 = this.f28823k;
            this.f28823k = j13 - 1;
            p4.b0(j13, (byte) ((j4 & 127) | 128));
        }

        private void r1(long j4) {
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (j4 >>> 35));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) (((j4 >>> 28) & 127) | 128));
            long j7 = this.f28823k;
            this.f28823k = j7 - 1;
            p4.b0(j7, (byte) (((j4 >>> 21) & 127) | 128));
            long j10 = this.f28823k;
            this.f28823k = j10 - 1;
            p4.b0(j10, (byte) (((j4 >>> 14) & 127) | 128));
            long j11 = this.f28823k;
            this.f28823k = j11 - 1;
            p4.b0(j11, (byte) (((j4 >>> 7) & 127) | 128));
            long j12 = this.f28823k;
            this.f28823k = j12 - 1;
            p4.b0(j12, (byte) ((j4 & 127) | 128));
        }

        private void s1(long j4) {
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (j4 >>> 63));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) (((j4 >>> 56) & 127) | 128));
            long j7 = this.f28823k;
            this.f28823k = j7 - 1;
            p4.b0(j7, (byte) (((j4 >>> 49) & 127) | 128));
            long j10 = this.f28823k;
            this.f28823k = j10 - 1;
            p4.b0(j10, (byte) (((j4 >>> 42) & 127) | 128));
            long j11 = this.f28823k;
            this.f28823k = j11 - 1;
            p4.b0(j11, (byte) (((j4 >>> 35) & 127) | 128));
            long j12 = this.f28823k;
            this.f28823k = j12 - 1;
            p4.b0(j12, (byte) (((j4 >>> 28) & 127) | 128));
            long j13 = this.f28823k;
            this.f28823k = j13 - 1;
            p4.b0(j13, (byte) (((j4 >>> 21) & 127) | 128));
            long j14 = this.f28823k;
            this.f28823k = j14 - 1;
            p4.b0(j14, (byte) (((j4 >>> 14) & 127) | 128));
            long j15 = this.f28823k;
            this.f28823k = j15 - 1;
            p4.b0(j15, (byte) (((j4 >>> 7) & 127) | 128));
            long j16 = this.f28823k;
            this.f28823k = j16 - 1;
            p4.b0(j16, (byte) ((j4 & 127) | 128));
        }

        private void t1(long j4) {
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (((int) j4) >>> 14));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) (((j4 >>> 7) & 127) | 128));
            long j7 = this.f28823k;
            this.f28823k = j7 - 1;
            p4.b0(j7, (byte) ((j4 & 127) | 128));
        }

        private void u1(long j4) {
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (j4 >>> 7));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) ((((int) j4) & 127) | 128));
        }

        @Override // androidx.content.preferences.protobuf.o
        void A0(long j4) {
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) (((int) (j4 >> 56)) & 255));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) (((int) (j4 >> 48)) & 255));
            long j7 = this.f28823k;
            this.f28823k = j7 - 1;
            p4.b0(j7, (byte) (((int) (j4 >> 40)) & 255));
            long j10 = this.f28823k;
            this.f28823k = j10 - 1;
            p4.b0(j10, (byte) (((int) (j4 >> 32)) & 255));
            long j11 = this.f28823k;
            this.f28823k = j11 - 1;
            p4.b0(j11, (byte) (((int) (j4 >> 24)) & 255));
            long j12 = this.f28823k;
            this.f28823k = j12 - 1;
            p4.b0(j12, (byte) (((int) (j4 >> 16)) & 255));
            long j13 = this.f28823k;
            this.f28823k = j13 - 1;
            p4.b0(j13, (byte) (((int) (j4 >> 8)) & 255));
            long j14 = this.f28823k;
            this.f28823k = j14 - 1;
            p4.b0(j14, (byte) (((int) j4) & 255));
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void C(int i4, Object obj) throws IOException {
            int c02 = c0();
            f3.a().k(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i4, 2);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void E(int i4, boolean z4) {
            r0(6);
            T(z4 ? (byte) 1 : (byte) 0);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void F0(int i4) {
            if (i4 >= 0) {
                W0(i4);
            } else {
                X0(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void G(int i4) {
            R0(i4, 3);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void K(int i4, Object obj) throws IOException {
            R0(i4, 4);
            f3.a().k(obj, this);
            R0(i4, 3);
        }

        @Override // androidx.content.preferences.protobuf.o
        void K0(int i4) {
            W0(CodedOutputStream.c1(i4));
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void M(int i4) {
            R0(i4, 4);
        }

        @Override // androidx.content.preferences.protobuf.o
        void N0(long j4) {
            X0(CodedOutputStream.d1(j4));
        }

        @Override // androidx.content.preferences.protobuf.o
        void Q0(String str) {
            char charAt;
            r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                long j4 = this.f28823k;
                this.f28823k = j4 - 1;
                p4.b0(j4, (byte) charAt);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128) {
                    long j5 = this.f28823k;
                    if (j5 >= this.f28821i) {
                        this.f28823k = j5 - 1;
                        p4.b0(j5, (byte) charAt2);
                        length--;
                    }
                }
                if (charAt2 < 2048) {
                    long j6 = this.f28823k;
                    if (j6 > this.f28821i) {
                        this.f28823k = j6 - 1;
                        p4.b0(j6, (byte) ((charAt2 & '?') | 128));
                        long j7 = this.f28823k;
                        this.f28823k = j7 - 1;
                        p4.b0(j7, (byte) ((charAt2 >>> 6) | 960));
                        length--;
                    }
                }
                if (charAt2 < 55296 || 57343 < charAt2) {
                    long j10 = this.f28823k;
                    if (j10 > this.f28821i + 1) {
                        this.f28823k = j10 - 1;
                        p4.b0(j10, (byte) ((charAt2 & '?') | 128));
                        long j11 = this.f28823k;
                        this.f28823k = j11 - 1;
                        p4.b0(j11, (byte) (((charAt2 >>> 6) & 63) | 128));
                        long j12 = this.f28823k;
                        this.f28823k = j12 - 1;
                        p4.b0(j12, (byte) ((charAt2 >>> '\f') | 480));
                        length--;
                    }
                }
                if (this.f28823k > this.f28821i + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            long j13 = this.f28823k;
                            this.f28823k = j13 - 1;
                            p4.b0(j13, (byte) ((codePoint & 63) | 128));
                            long j14 = this.f28823k;
                            this.f28823k = j14 - 1;
                            p4.b0(j14, (byte) (((codePoint >>> 6) & 63) | 128));
                            long j15 = this.f28823k;
                            this.f28823k = j15 - 1;
                            p4.b0(j15, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j16 = this.f28823k;
                            this.f28823k = j16 - 1;
                            p4.b0(j16, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new q4.d(length - 1, length);
                }
                r0(length);
                length++;
                length--;
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void R(int i4, int i5) {
            r0(10);
            K0(i5);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void R0(int i4, int i5) {
            W0(t4.c(i4, i5));
        }

        @Override // androidx.content.preferences.protobuf.v
        public void T(byte b5) {
            long j4 = this.f28823k;
            this.f28823k = j4 - 1;
            p4.b0(j4, b5);
        }

        @Override // androidx.content.preferences.protobuf.v
        public void U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (f1() < remaining) {
                d1(remaining);
            }
            this.f28823k -= remaining;
            this.f28820h.position(Z0() + 1);
            this.f28820h.put(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.v
        public void V(byte[] bArr, int i4, int i5) {
            if (f1() < i5) {
                d1(i5);
            }
            this.f28823k -= i5;
            this.f28820h.position(Z0() + 1);
            this.f28820h.put(bArr, i4, i5);
        }

        @Override // androidx.content.preferences.protobuf.v
        public void W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (f1() < remaining) {
                this.f28808d += remaining;
                this.f28807c.addFirst(androidx.content.preferences.protobuf.d.j(byteBuffer));
                c1();
            } else {
                this.f28823k -= remaining;
                this.f28820h.position(Z0() + 1);
                this.f28820h.put(byteBuffer);
            }
        }

        @Override // androidx.content.preferences.protobuf.o
        void W0(int i4) {
            if ((i4 & (-128)) == 0) {
                i1(i4);
                return;
            }
            if ((i4 & (-16384)) == 0) {
                k1(i4);
                return;
            }
            if (((-2097152) & i4) == 0) {
                j1(i4);
            } else if (((-268435456) & i4) == 0) {
                h1(i4);
            } else {
                g1(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.v
        public void X(byte[] bArr, int i4, int i5) {
            if (f1() < i5) {
                this.f28808d += i5;
                this.f28807c.addFirst(androidx.content.preferences.protobuf.d.l(bArr, i4, i5));
                c1();
            } else {
                this.f28823k -= i5;
                this.f28820h.position(Z0() + 1);
                this.f28820h.put(bArr, i4, i5);
            }
        }

        @Override // androidx.content.preferences.protobuf.o
        void X0(long j4) {
            switch (o.a0(j4)) {
                case 1:
                    p1(j4);
                    break;
                case 2:
                    u1(j4);
                    break;
                case 3:
                    t1(j4);
                    break;
                case 4:
                    n1(j4);
                    break;
                case 5:
                    m1(j4);
                    break;
                case 6:
                    r1(j4);
                    break;
                case 7:
                    q1(j4);
                    break;
                case 8:
                    l1(j4);
                    break;
                case 9:
                    o1(j4);
                    break;
                case 10:
                    s1(j4);
                    break;
            }
        }

        @Override // androidx.content.preferences.protobuf.o
        void b0() {
            if (this.f28820h != null) {
                this.f28808d += a1();
                this.f28820h.position(Z0() + 1);
                this.f28820h = null;
                this.f28823k = 0L;
                this.f28822j = 0L;
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void c(int i4, int i5) {
            r0(9);
            x0(i5);
            R0(i4, 5);
        }

        @Override // androidx.content.preferences.protobuf.o
        public int c0() {
            return this.f28808d + a1();
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void g(int i4, String str) {
            int c02 = c0();
            Q0(str);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i4, 2);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void h(int i4, long j4) {
            r0(15);
            X0(j4);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void j(int i4, int i5) {
            r0(15);
            F0(i5);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void k(int i4, w wVar) {
            try {
                wVar.x0(this);
                r0(10);
                W0(wVar.size());
                R0(i4, 2);
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void n(int i4, Object obj, m3 m3Var) throws IOException {
            int c02 = c0();
            m3Var.h(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i4, 2);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void q(int i4, long j4) {
            r0(15);
            N0(j4);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void r0(int i4) {
            if (f1() < i4) {
                d1(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.o
        void s0(boolean z4) {
            T(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void t(int i4, Object obj, m3 m3Var) throws IOException {
            R0(i4, 4);
            m3Var.h(obj, this);
            R0(i4, 3);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void u(int i4, int i5) {
            r0(10);
            W0(i5);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void x0(int i4) {
            long j4 = this.f28823k;
            this.f28823k = j4 - 1;
            p4.b0(j4, (byte) ((i4 >> 24) & 255));
            long j5 = this.f28823k;
            this.f28823k = j5 - 1;
            p4.b0(j5, (byte) ((i4 >> 16) & 255));
            long j6 = this.f28823k;
            this.f28823k = j6 - 1;
            p4.b0(j6, (byte) ((i4 >> 8) & 255));
            long j7 = this.f28823k;
            this.f28823k = j7 - 1;
            p4.b0(j7, (byte) (i4 & 255));
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void y(int i4, long j4) {
            r0(13);
            A0(j4);
            R0(i4, 1);
        }
    }

    /* compiled from: BinaryWriter.java */
    private static final class e extends o {

        /* renamed from: h, reason: collision with root package name */
        private androidx.content.preferences.protobuf.d f28824h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f28825i;

        /* renamed from: j, reason: collision with root package name */
        private long f28826j;

        /* renamed from: k, reason: collision with root package name */
        private long f28827k;

        /* renamed from: l, reason: collision with root package name */
        private long f28828l;

        /* renamed from: m, reason: collision with root package name */
        private long f28829m;

        /* renamed from: n, reason: collision with root package name */
        private long f28830n;

        e(t tVar, int i4) {
            super(tVar, i4, null);
            b1();
        }

        private int Y0() {
            return (int) this.f28830n;
        }

        static boolean a1() {
            return p4.S();
        }

        private void b1() {
            d1(j0());
        }

        private void c1(int i4) {
            d1(k0(i4));
        }

        private void d1(androidx.content.preferences.protobuf.d dVar) {
            if (!dVar.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            b0();
            this.f28807c.addFirst(dVar);
            this.f28824h = dVar;
            this.f28825i = dVar.a();
            int b5 = dVar.b();
            this.f28827k = dVar.e() + b5;
            long g4 = b5 + dVar.g();
            this.f28826j = g4;
            this.f28828l = g4 - 1;
            long j4 = this.f28827k - 1;
            this.f28829m = j4;
            this.f28830n = j4;
        }

        private void f1(int i4) {
            byte[] bArr = this.f28825i;
            long j4 = this.f28830n;
            this.f28830n = j4 - 1;
            p4.d0(bArr, j4, (byte) (i4 >>> 28));
            byte[] bArr2 = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr2, j5, (byte) (((i4 >>> 21) & 127) | 128));
            byte[] bArr3 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr3, j6, (byte) (((i4 >>> 14) & 127) | 128));
            byte[] bArr4 = this.f28825i;
            long j7 = this.f28830n;
            this.f28830n = j7 - 1;
            p4.d0(bArr4, j7, (byte) (((i4 >>> 7) & 127) | 128));
            byte[] bArr5 = this.f28825i;
            long j10 = this.f28830n;
            this.f28830n = j10 - 1;
            p4.d0(bArr5, j10, (byte) ((i4 & 127) | 128));
        }

        private void g1(int i4) {
            byte[] bArr = this.f28825i;
            long j4 = this.f28830n;
            this.f28830n = j4 - 1;
            p4.d0(bArr, j4, (byte) (i4 >>> 21));
            byte[] bArr2 = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr2, j5, (byte) (((i4 >>> 14) & 127) | 128));
            byte[] bArr3 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr3, j6, (byte) (((i4 >>> 7) & 127) | 128));
            byte[] bArr4 = this.f28825i;
            long j7 = this.f28830n;
            this.f28830n = j7 - 1;
            p4.d0(bArr4, j7, (byte) ((i4 & 127) | 128));
        }

        private void h1(int i4) {
            byte[] bArr = this.f28825i;
            long j4 = this.f28830n;
            this.f28830n = j4 - 1;
            p4.d0(bArr, j4, (byte) i4);
        }

        private void i1(int i4) {
            byte[] bArr = this.f28825i;
            long j4 = this.f28830n;
            this.f28830n = j4 - 1;
            p4.d0(bArr, j4, (byte) (i4 >>> 14));
            byte[] bArr2 = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr2, j5, (byte) (((i4 >>> 7) & 127) | 128));
            byte[] bArr3 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr3, j6, (byte) ((i4 & 127) | 128));
        }

        private void j1(int i4) {
            byte[] bArr = this.f28825i;
            long j4 = this.f28830n;
            this.f28830n = j4 - 1;
            p4.d0(bArr, j4, (byte) (i4 >>> 7));
            byte[] bArr2 = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr2, j5, (byte) ((i4 & 127) | 128));
        }

        private void k1(long j4) {
            byte[] bArr = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr, j5, (byte) (j4 >>> 49));
            byte[] bArr2 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr2, j6, (byte) (((j4 >>> 42) & 127) | 128));
            byte[] bArr3 = this.f28825i;
            long j7 = this.f28830n;
            this.f28830n = j7 - 1;
            p4.d0(bArr3, j7, (byte) (((j4 >>> 35) & 127) | 128));
            byte[] bArr4 = this.f28825i;
            long j10 = this.f28830n;
            this.f28830n = j10 - 1;
            p4.d0(bArr4, j10, (byte) (((j4 >>> 28) & 127) | 128));
            byte[] bArr5 = this.f28825i;
            long j11 = this.f28830n;
            this.f28830n = j11 - 1;
            p4.d0(bArr5, j11, (byte) (((j4 >>> 21) & 127) | 128));
            byte[] bArr6 = this.f28825i;
            long j12 = this.f28830n;
            this.f28830n = j12 - 1;
            p4.d0(bArr6, j12, (byte) (((j4 >>> 14) & 127) | 128));
            byte[] bArr7 = this.f28825i;
            long j13 = this.f28830n;
            this.f28830n = j13 - 1;
            p4.d0(bArr7, j13, (byte) (((j4 >>> 7) & 127) | 128));
            byte[] bArr8 = this.f28825i;
            long j14 = this.f28830n;
            this.f28830n = j14 - 1;
            p4.d0(bArr8, j14, (byte) ((j4 & 127) | 128));
        }

        private void l1(long j4) {
            byte[] bArr = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr, j5, (byte) (j4 >>> 28));
            byte[] bArr2 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr2, j6, (byte) (((j4 >>> 21) & 127) | 128));
            byte[] bArr3 = this.f28825i;
            long j7 = this.f28830n;
            this.f28830n = j7 - 1;
            p4.d0(bArr3, j7, (byte) (((j4 >>> 14) & 127) | 128));
            byte[] bArr4 = this.f28825i;
            long j10 = this.f28830n;
            this.f28830n = j10 - 1;
            p4.d0(bArr4, j10, (byte) (((j4 >>> 7) & 127) | 128));
            byte[] bArr5 = this.f28825i;
            long j11 = this.f28830n;
            this.f28830n = j11 - 1;
            p4.d0(bArr5, j11, (byte) ((j4 & 127) | 128));
        }

        private void m1(long j4) {
            byte[] bArr = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr, j5, (byte) (j4 >>> 21));
            byte[] bArr2 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr2, j6, (byte) (((j4 >>> 14) & 127) | 128));
            byte[] bArr3 = this.f28825i;
            long j7 = this.f28830n;
            this.f28830n = j7 - 1;
            p4.d0(bArr3, j7, (byte) (((j4 >>> 7) & 127) | 128));
            byte[] bArr4 = this.f28825i;
            long j10 = this.f28830n;
            this.f28830n = j10 - 1;
            p4.d0(bArr4, j10, (byte) ((j4 & 127) | 128));
        }

        private void n1(long j4) {
            byte[] bArr = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr, j5, (byte) (j4 >>> 56));
            byte[] bArr2 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr2, j6, (byte) (((j4 >>> 49) & 127) | 128));
            byte[] bArr3 = this.f28825i;
            long j7 = this.f28830n;
            this.f28830n = j7 - 1;
            p4.d0(bArr3, j7, (byte) (((j4 >>> 42) & 127) | 128));
            byte[] bArr4 = this.f28825i;
            long j10 = this.f28830n;
            this.f28830n = j10 - 1;
            p4.d0(bArr4, j10, (byte) (((j4 >>> 35) & 127) | 128));
            byte[] bArr5 = this.f28825i;
            long j11 = this.f28830n;
            this.f28830n = j11 - 1;
            p4.d0(bArr5, j11, (byte) (((j4 >>> 28) & 127) | 128));
            byte[] bArr6 = this.f28825i;
            long j12 = this.f28830n;
            this.f28830n = j12 - 1;
            p4.d0(bArr6, j12, (byte) (((j4 >>> 21) & 127) | 128));
            byte[] bArr7 = this.f28825i;
            long j13 = this.f28830n;
            this.f28830n = j13 - 1;
            p4.d0(bArr7, j13, (byte) (((j4 >>> 14) & 127) | 128));
            byte[] bArr8 = this.f28825i;
            long j14 = this.f28830n;
            this.f28830n = j14 - 1;
            p4.d0(bArr8, j14, (byte) (((j4 >>> 7) & 127) | 128));
            byte[] bArr9 = this.f28825i;
            long j15 = this.f28830n;
            this.f28830n = j15 - 1;
            p4.d0(bArr9, j15, (byte) ((j4 & 127) | 128));
        }

        private void o1(long j4) {
            byte[] bArr = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr, j5, (byte) j4);
        }

        private void p1(long j4) {
            byte[] bArr = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr, j5, (byte) (j4 >>> 42));
            byte[] bArr2 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr2, j6, (byte) (((j4 >>> 35) & 127) | 128));
            byte[] bArr3 = this.f28825i;
            long j7 = this.f28830n;
            this.f28830n = j7 - 1;
            p4.d0(bArr3, j7, (byte) (((j4 >>> 28) & 127) | 128));
            byte[] bArr4 = this.f28825i;
            long j10 = this.f28830n;
            this.f28830n = j10 - 1;
            p4.d0(bArr4, j10, (byte) (((j4 >>> 21) & 127) | 128));
            byte[] bArr5 = this.f28825i;
            long j11 = this.f28830n;
            this.f28830n = j11 - 1;
            p4.d0(bArr5, j11, (byte) (((j4 >>> 14) & 127) | 128));
            byte[] bArr6 = this.f28825i;
            long j12 = this.f28830n;
            this.f28830n = j12 - 1;
            p4.d0(bArr6, j12, (byte) (((j4 >>> 7) & 127) | 128));
            byte[] bArr7 = this.f28825i;
            long j13 = this.f28830n;
            this.f28830n = j13 - 1;
            p4.d0(bArr7, j13, (byte) ((j4 & 127) | 128));
        }

        private void q1(long j4) {
            byte[] bArr = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr, j5, (byte) (j4 >>> 35));
            byte[] bArr2 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr2, j6, (byte) (((j4 >>> 28) & 127) | 128));
            byte[] bArr3 = this.f28825i;
            long j7 = this.f28830n;
            this.f28830n = j7 - 1;
            p4.d0(bArr3, j7, (byte) (((j4 >>> 21) & 127) | 128));
            byte[] bArr4 = this.f28825i;
            long j10 = this.f28830n;
            this.f28830n = j10 - 1;
            p4.d0(bArr4, j10, (byte) (((j4 >>> 14) & 127) | 128));
            byte[] bArr5 = this.f28825i;
            long j11 = this.f28830n;
            this.f28830n = j11 - 1;
            p4.d0(bArr5, j11, (byte) (((j4 >>> 7) & 127) | 128));
            byte[] bArr6 = this.f28825i;
            long j12 = this.f28830n;
            this.f28830n = j12 - 1;
            p4.d0(bArr6, j12, (byte) ((j4 & 127) | 128));
        }

        private void r1(long j4) {
            byte[] bArr = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr, j5, (byte) (j4 >>> 63));
            byte[] bArr2 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr2, j6, (byte) (((j4 >>> 56) & 127) | 128));
            byte[] bArr3 = this.f28825i;
            long j7 = this.f28830n;
            this.f28830n = j7 - 1;
            p4.d0(bArr3, j7, (byte) (((j4 >>> 49) & 127) | 128));
            byte[] bArr4 = this.f28825i;
            long j10 = this.f28830n;
            this.f28830n = j10 - 1;
            p4.d0(bArr4, j10, (byte) (((j4 >>> 42) & 127) | 128));
            byte[] bArr5 = this.f28825i;
            long j11 = this.f28830n;
            this.f28830n = j11 - 1;
            p4.d0(bArr5, j11, (byte) (((j4 >>> 35) & 127) | 128));
            byte[] bArr6 = this.f28825i;
            long j12 = this.f28830n;
            this.f28830n = j12 - 1;
            p4.d0(bArr6, j12, (byte) (((j4 >>> 28) & 127) | 128));
            byte[] bArr7 = this.f28825i;
            long j13 = this.f28830n;
            this.f28830n = j13 - 1;
            p4.d0(bArr7, j13, (byte) (((j4 >>> 21) & 127) | 128));
            byte[] bArr8 = this.f28825i;
            long j14 = this.f28830n;
            this.f28830n = j14 - 1;
            p4.d0(bArr8, j14, (byte) (((j4 >>> 14) & 127) | 128));
            byte[] bArr9 = this.f28825i;
            long j15 = this.f28830n;
            this.f28830n = j15 - 1;
            p4.d0(bArr9, j15, (byte) (((j4 >>> 7) & 127) | 128));
            byte[] bArr10 = this.f28825i;
            long j16 = this.f28830n;
            this.f28830n = j16 - 1;
            p4.d0(bArr10, j16, (byte) ((j4 & 127) | 128));
        }

        private void s1(long j4) {
            byte[] bArr = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr, j5, (byte) (((int) j4) >>> 14));
            byte[] bArr2 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr2, j6, (byte) (((j4 >>> 7) & 127) | 128));
            byte[] bArr3 = this.f28825i;
            long j7 = this.f28830n;
            this.f28830n = j7 - 1;
            p4.d0(bArr3, j7, (byte) ((j4 & 127) | 128));
        }

        private void t1(long j4) {
            byte[] bArr = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr, j5, (byte) (j4 >>> 7));
            byte[] bArr2 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr2, j6, (byte) ((((int) j4) & 127) | 128));
        }

        @Override // androidx.content.preferences.protobuf.o
        void A0(long j4) {
            byte[] bArr = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr, j5, (byte) (((int) (j4 >> 56)) & 255));
            byte[] bArr2 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr2, j6, (byte) (((int) (j4 >> 48)) & 255));
            byte[] bArr3 = this.f28825i;
            long j7 = this.f28830n;
            this.f28830n = j7 - 1;
            p4.d0(bArr3, j7, (byte) (((int) (j4 >> 40)) & 255));
            byte[] bArr4 = this.f28825i;
            long j10 = this.f28830n;
            this.f28830n = j10 - 1;
            p4.d0(bArr4, j10, (byte) (((int) (j4 >> 32)) & 255));
            byte[] bArr5 = this.f28825i;
            long j11 = this.f28830n;
            this.f28830n = j11 - 1;
            p4.d0(bArr5, j11, (byte) (((int) (j4 >> 24)) & 255));
            byte[] bArr6 = this.f28825i;
            long j12 = this.f28830n;
            this.f28830n = j12 - 1;
            p4.d0(bArr6, j12, (byte) (((int) (j4 >> 16)) & 255));
            byte[] bArr7 = this.f28825i;
            long j13 = this.f28830n;
            this.f28830n = j13 - 1;
            p4.d0(bArr7, j13, (byte) (((int) (j4 >> 8)) & 255));
            byte[] bArr8 = this.f28825i;
            long j14 = this.f28830n;
            this.f28830n = j14 - 1;
            p4.d0(bArr8, j14, (byte) (((int) j4) & 255));
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void C(int i4, Object obj) throws IOException {
            int c02 = c0();
            f3.a().k(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i4, 2);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void E(int i4, boolean z4) {
            r0(6);
            T(z4 ? (byte) 1 : (byte) 0);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void F0(int i4) {
            if (i4 >= 0) {
                W0(i4);
            } else {
                X0(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void G(int i4) {
            R0(i4, 3);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void K(int i4, Object obj) throws IOException {
            R0(i4, 4);
            f3.a().k(obj, this);
            R0(i4, 3);
        }

        @Override // androidx.content.preferences.protobuf.o
        void K0(int i4) {
            W0(CodedOutputStream.c1(i4));
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void M(int i4) {
            R0(i4, 4);
        }

        @Override // androidx.content.preferences.protobuf.o
        void N0(long j4) {
            X0(CodedOutputStream.d1(j4));
        }

        @Override // androidx.content.preferences.protobuf.o
        void Q0(String str) {
            char charAt;
            r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.f28825i;
                long j4 = this.f28830n;
                this.f28830n = j4 - 1;
                p4.d0(bArr, j4, (byte) charAt);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128) {
                    long j5 = this.f28830n;
                    if (j5 > this.f28828l) {
                        byte[] bArr2 = this.f28825i;
                        this.f28830n = j5 - 1;
                        p4.d0(bArr2, j5, (byte) charAt2);
                        length--;
                    }
                }
                if (charAt2 < 2048) {
                    long j6 = this.f28830n;
                    if (j6 > this.f28826j) {
                        byte[] bArr3 = this.f28825i;
                        this.f28830n = j6 - 1;
                        p4.d0(bArr3, j6, (byte) ((charAt2 & '?') | 128));
                        byte[] bArr4 = this.f28825i;
                        long j7 = this.f28830n;
                        this.f28830n = j7 - 1;
                        p4.d0(bArr4, j7, (byte) ((charAt2 >>> 6) | 960));
                        length--;
                    }
                }
                if (charAt2 < 55296 || 57343 < charAt2) {
                    long j10 = this.f28830n;
                    if (j10 > this.f28826j + 1) {
                        byte[] bArr5 = this.f28825i;
                        this.f28830n = j10 - 1;
                        p4.d0(bArr5, j10, (byte) ((charAt2 & '?') | 128));
                        byte[] bArr6 = this.f28825i;
                        long j11 = this.f28830n;
                        this.f28830n = j11 - 1;
                        p4.d0(bArr6, j11, (byte) (((charAt2 >>> 6) & 63) | 128));
                        byte[] bArr7 = this.f28825i;
                        long j12 = this.f28830n;
                        this.f28830n = j12 - 1;
                        p4.d0(bArr7, j12, (byte) ((charAt2 >>> '\f') | 480));
                        length--;
                    }
                }
                if (this.f28830n > this.f28826j + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr8 = this.f28825i;
                            long j13 = this.f28830n;
                            this.f28830n = j13 - 1;
                            p4.d0(bArr8, j13, (byte) ((codePoint & 63) | 128));
                            byte[] bArr9 = this.f28825i;
                            long j14 = this.f28830n;
                            this.f28830n = j14 - 1;
                            p4.d0(bArr9, j14, (byte) (((codePoint >>> 6) & 63) | 128));
                            byte[] bArr10 = this.f28825i;
                            long j15 = this.f28830n;
                            this.f28830n = j15 - 1;
                            p4.d0(bArr10, j15, (byte) (((codePoint >>> 12) & 63) | 128));
                            byte[] bArr11 = this.f28825i;
                            long j16 = this.f28830n;
                            this.f28830n = j16 - 1;
                            p4.d0(bArr11, j16, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new q4.d(length - 1, length);
                }
                r0(length);
                length++;
                length--;
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void R(int i4, int i5) {
            r0(10);
            K0(i5);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void R0(int i4, int i5) {
            W0(t4.c(i4, i5));
        }

        @Override // androidx.content.preferences.protobuf.v
        public void T(byte b5) {
            byte[] bArr = this.f28825i;
            long j4 = this.f28830n;
            this.f28830n = j4 - 1;
            p4.d0(bArr, j4, b5);
        }

        @Override // androidx.content.preferences.protobuf.v
        public void U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            r0(remaining);
            long j4 = this.f28830n - remaining;
            this.f28830n = j4;
            byteBuffer.get(this.f28825i, ((int) j4) + 1, remaining);
        }

        @Override // androidx.content.preferences.protobuf.v
        public void V(byte[] bArr, int i4, int i5) {
            if (i4 < 0 || i4 + i5 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            r0(i5);
            long j4 = this.f28830n - i5;
            this.f28830n = j4;
            System.arraycopy(bArr, i4, this.f28825i, ((int) j4) + 1, i5);
        }

        @Override // androidx.content.preferences.protobuf.v
        public void W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (e1() < remaining) {
                this.f28808d += remaining;
                this.f28807c.addFirst(androidx.content.preferences.protobuf.d.j(byteBuffer));
                b1();
            }
            long j4 = this.f28830n - remaining;
            this.f28830n = j4;
            byteBuffer.get(this.f28825i, ((int) j4) + 1, remaining);
        }

        @Override // androidx.content.preferences.protobuf.o
        void W0(int i4) {
            if ((i4 & (-128)) == 0) {
                h1(i4);
                return;
            }
            if ((i4 & (-16384)) == 0) {
                j1(i4);
                return;
            }
            if (((-2097152) & i4) == 0) {
                i1(i4);
            } else if (((-268435456) & i4) == 0) {
                g1(i4);
            } else {
                f1(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.v
        public void X(byte[] bArr, int i4, int i5) {
            if (i4 < 0 || i4 + i5 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            if (e1() < i5) {
                this.f28808d += i5;
                this.f28807c.addFirst(androidx.content.preferences.protobuf.d.l(bArr, i4, i5));
                b1();
            } else {
                long j4 = this.f28830n - i5;
                this.f28830n = j4;
                System.arraycopy(bArr, i4, this.f28825i, ((int) j4) + 1, i5);
            }
        }

        @Override // androidx.content.preferences.protobuf.o
        void X0(long j4) {
            switch (o.a0(j4)) {
                case 1:
                    o1(j4);
                    break;
                case 2:
                    t1(j4);
                    break;
                case 3:
                    s1(j4);
                    break;
                case 4:
                    m1(j4);
                    break;
                case 5:
                    l1(j4);
                    break;
                case 6:
                    q1(j4);
                    break;
                case 7:
                    p1(j4);
                    break;
                case 8:
                    k1(j4);
                    break;
                case 9:
                    n1(j4);
                    break;
                case 10:
                    r1(j4);
                    break;
            }
        }

        int Z0() {
            return (int) (this.f28829m - this.f28830n);
        }

        @Override // androidx.content.preferences.protobuf.o
        void b0() {
            if (this.f28824h != null) {
                this.f28808d += Z0();
                androidx.content.preferences.protobuf.d dVar = this.f28824h;
                dVar.h((((int) this.f28830n) - dVar.b()) + 1);
                this.f28824h = null;
                this.f28830n = 0L;
                this.f28829m = 0L;
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void c(int i4, int i5) {
            r0(9);
            x0(i5);
            R0(i4, 5);
        }

        @Override // androidx.content.preferences.protobuf.o
        public int c0() {
            return this.f28808d + Z0();
        }

        int e1() {
            return (int) (this.f28830n - this.f28828l);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void g(int i4, String str) {
            int c02 = c0();
            Q0(str);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i4, 2);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void h(int i4, long j4) {
            r0(15);
            X0(j4);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void j(int i4, int i5) {
            r0(15);
            F0(i5);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void k(int i4, w wVar) {
            try {
                wVar.x0(this);
                r0(10);
                W0(wVar.size());
                R0(i4, 2);
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void n(int i4, Object obj, m3 m3Var) throws IOException {
            int c02 = c0();
            m3Var.h(obj, this);
            int c03 = c0() - c02;
            r0(10);
            W0(c03);
            R0(i4, 2);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void q(int i4, long j4) {
            r0(15);
            N0(j4);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void r0(int i4) {
            if (e1() < i4) {
                c1(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.o
        void s0(boolean z4) {
            T(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void t(int i4, Object obj, m3 m3Var) throws IOException {
            R0(i4, 4);
            m3Var.h(obj, this);
            R0(i4, 3);
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void u(int i4, int i5) {
            r0(10);
            W0(i5);
            R0(i4, 0);
        }

        @Override // androidx.content.preferences.protobuf.o
        void x0(int i4) {
            byte[] bArr = this.f28825i;
            long j4 = this.f28830n;
            this.f28830n = j4 - 1;
            p4.d0(bArr, j4, (byte) ((i4 >> 24) & 255));
            byte[] bArr2 = this.f28825i;
            long j5 = this.f28830n;
            this.f28830n = j5 - 1;
            p4.d0(bArr2, j5, (byte) ((i4 >> 16) & 255));
            byte[] bArr3 = this.f28825i;
            long j6 = this.f28830n;
            this.f28830n = j6 - 1;
            p4.d0(bArr3, j6, (byte) ((i4 >> 8) & 255));
            byte[] bArr4 = this.f28825i;
            long j7 = this.f28830n;
            this.f28830n = j7 - 1;
            p4.d0(bArr4, j7, (byte) (i4 & 255));
        }

        @Override // androidx.content.preferences.protobuf.v4
        public void y(int i4, long j4) {
            r0(13);
            A0(j4);
            R0(i4, 1);
        }
    }

    private o(t tVar, int i4) {
        this.f28807c = new ArrayDeque<>(4);
        if (i4 <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.f28805a = (t) p1.e(tVar, "alloc");
        this.f28806b = i4;
    }

    private final void B0(int i4, z1 z1Var, boolean z4) throws IOException {
        if (!z4) {
            for (int size = z1Var.size() - 1; size >= 0; size--) {
                y(i4, z1Var.getLong(size));
            }
            return;
        }
        r0((z1Var.size() * 8) + 10);
        int c02 = c0();
        for (int size2 = z1Var.size() - 1; size2 >= 0; size2--) {
            A0(z1Var.getLong(size2));
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void C0(int i4, List<Long> list, boolean z4) throws IOException {
        if (!z4) {
            for (int size = list.size() - 1; size >= 0; size--) {
                y(i4, list.get(size).longValue());
            }
            return;
        }
        r0(n.a(list, 8, 10));
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A0(list.get(size2).longValue());
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void D0(int i4, e1 e1Var, boolean z4) throws IOException {
        if (!z4) {
            for (int size = e1Var.size() - 1; size >= 0; size--) {
                L(i4, e1Var.getFloat(size));
            }
            return;
        }
        r0((e1Var.size() * 4) + 10);
        int c02 = c0();
        for (int size2 = e1Var.size() - 1; size2 >= 0; size2--) {
            x0(Float.floatToRawIntBits(e1Var.getFloat(size2)));
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void E0(int i4, List<Float> list, boolean z4) throws IOException {
        if (!z4) {
            for (int size = list.size() - 1; size >= 0; size--) {
                L(i4, list.get(size).floatValue());
            }
            return;
        }
        r0(n.a(list, 4, 10));
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            x0(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void G0(int i4, n1 n1Var, boolean z4) throws IOException {
        if (!z4) {
            for (int size = n1Var.size() - 1; size >= 0; size--) {
                j(i4, n1Var.getInt(size));
            }
            return;
        }
        r0((n1Var.size() * 10) + 10);
        int c02 = c0();
        for (int size2 = n1Var.size() - 1; size2 >= 0; size2--) {
            F0(n1Var.getInt(size2));
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void H0(int i4, List<Integer> list, boolean z4) throws IOException {
        if (!z4) {
            for (int size = list.size() - 1; size >= 0; size--) {
                j(i4, list.get(size).intValue());
            }
            return;
        }
        r0(n.a(list, 10, 10));
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            F0(list.get(size2).intValue());
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private void I0(int i4, Object obj) throws IOException {
        if (obj instanceof String) {
            g(i4, (String) obj);
        } else {
            k(i4, (w) obj);
        }
    }

    static final void J0(v4 v4Var, int i4, t4.b bVar, Object obj) throws IOException {
        switch (a.f28809a[bVar.ordinal()]) {
            case 1:
                v4Var.E(i4, ((Boolean) obj).booleanValue());
                return;
            case 2:
                v4Var.c(i4, ((Integer) obj).intValue());
                return;
            case 3:
                v4Var.y(i4, ((Long) obj).longValue());
                return;
            case 4:
                v4Var.j(i4, ((Integer) obj).intValue());
                return;
            case 5:
                v4Var.D(i4, ((Long) obj).longValue());
                return;
            case 6:
                v4Var.F(i4, ((Integer) obj).intValue());
                return;
            case 7:
                v4Var.l(i4, ((Long) obj).longValue());
                return;
            case 8:
                v4Var.R(i4, ((Integer) obj).intValue());
                return;
            case 9:
                v4Var.q(i4, ((Long) obj).longValue());
                return;
            case 10:
                v4Var.g(i4, (String) obj);
                return;
            case 11:
                v4Var.u(i4, ((Integer) obj).intValue());
                return;
            case 12:
                v4Var.h(i4, ((Long) obj).longValue());
                return;
            case 13:
                v4Var.L(i4, ((Float) obj).floatValue());
                return;
            case 14:
                v4Var.v(i4, ((Double) obj).doubleValue());
                return;
            case 15:
                v4Var.C(i4, obj);
                return;
            case 16:
                v4Var.k(i4, (w) obj);
                return;
            case 17:
                if (obj instanceof p1.c) {
                    v4Var.O(i4, ((p1.c) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    v4Var.O(i4, ((Integer) obj).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + bVar);
        }
    }

    private final void L0(int i4, n1 n1Var, boolean z4) throws IOException {
        if (!z4) {
            for (int size = n1Var.size() - 1; size >= 0; size--) {
                R(i4, n1Var.getInt(size));
            }
            return;
        }
        r0((n1Var.size() * 5) + 10);
        int c02 = c0();
        for (int size2 = n1Var.size() - 1; size2 >= 0; size2--) {
            K0(n1Var.getInt(size2));
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void M0(int i4, List<Integer> list, boolean z4) throws IOException {
        if (!z4) {
            for (int size = list.size() - 1; size >= 0; size--) {
                R(i4, list.get(size).intValue());
            }
            return;
        }
        r0(n.a(list, 5, 10));
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            K0(list.get(size2).intValue());
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void O0(int i4, z1 z1Var, boolean z4) throws IOException {
        if (!z4) {
            for (int size = z1Var.size() - 1; size >= 0; size--) {
                q(i4, z1Var.getLong(size));
            }
            return;
        }
        r0((z1Var.size() * 10) + 10);
        int c02 = c0();
        for (int size2 = z1Var.size() - 1; size2 >= 0; size2--) {
            N0(z1Var.getLong(size2));
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void P0(int i4, List<Long> list, boolean z4) throws IOException {
        if (!z4) {
            for (int size = list.size() - 1; size >= 0; size--) {
                q(i4, list.get(size).longValue());
            }
            return;
        }
        r0(n.a(list, 10, 10));
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            N0(list.get(size2).longValue());
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void S0(int i4, n1 n1Var, boolean z4) throws IOException {
        if (!z4) {
            for (int size = n1Var.size() - 1; size >= 0; size--) {
                u(i4, n1Var.getInt(size));
            }
            return;
        }
        r0((n1Var.size() * 5) + 10);
        int c02 = c0();
        for (int size2 = n1Var.size() - 1; size2 >= 0; size2--) {
            W0(n1Var.getInt(size2));
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void T0(int i4, List<Integer> list, boolean z4) throws IOException {
        if (!z4) {
            for (int size = list.size() - 1; size >= 0; size--) {
                u(i4, list.get(size).intValue());
            }
            return;
        }
        r0(n.a(list, 5, 10));
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            W0(list.get(size2).intValue());
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void U0(int i4, z1 z1Var, boolean z4) throws IOException {
        if (!z4) {
            for (int size = z1Var.size() - 1; size >= 0; size--) {
                h(i4, z1Var.getLong(size));
            }
            return;
        }
        r0((z1Var.size() * 10) + 10);
        int c02 = c0();
        for (int size2 = z1Var.size() - 1; size2 >= 0; size2--) {
            X0(z1Var.getLong(size2));
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void V0(int i4, List<Long> list, boolean z4) throws IOException {
        if (!z4) {
            for (int size = list.size() - 1; size >= 0; size--) {
                h(i4, list.get(size).longValue());
            }
            return;
        }
        r0(n.a(list, 10, 10));
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            X0(list.get(size2).longValue());
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte a0(long j4) {
        byte b5;
        if (((-128) & j4) == 0) {
            return (byte) 1;
        }
        if (j4 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j4) != 0) {
            b5 = (byte) 6;
            j4 >>>= 28;
        } else {
            b5 = 2;
        }
        if (((-2097152) & j4) != 0) {
            b5 = (byte) (b5 + 2);
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? (byte) (b5 + 1) : b5;
    }

    static boolean d0() {
        return p4.T();
    }

    static boolean e0() {
        return p4.S();
    }

    public static o h0(t tVar) {
        return i0(tVar, 4096);
    }

    public static o i0(t tVar, int i4) {
        return p4.T() ? p0(tVar, i4) : new b(tVar, i4);
    }

    public static o l0(t tVar) {
        return m0(tVar, 4096);
    }

    public static o m0(t tVar, int i4) {
        return p4.S() ? q0(tVar, i4) : new c(tVar, i4);
    }

    static o n0(t tVar, int i4) {
        return new b(tVar, i4);
    }

    static o o0(t tVar, int i4) {
        return new c(tVar, i4);
    }

    static o p0(t tVar, int i4) {
        if (p4.T()) {
            return new d(tVar, i4);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    static o q0(t tVar, int i4) {
        if (p4.S()) {
            return new e(tVar, i4);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    private final void t0(int i4, s sVar, boolean z4) throws IOException {
        if (!z4) {
            for (int size = sVar.size() - 1; size >= 0; size--) {
                E(i4, sVar.J(size));
            }
            return;
        }
        r0(sVar.size() + 10);
        int c02 = c0();
        for (int size2 = sVar.size() - 1; size2 >= 0; size2--) {
            s0(sVar.J(size2));
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void u0(int i4, List<Boolean> list, boolean z4) throws IOException {
        if (!z4) {
            for (int size = list.size() - 1; size >= 0; size--) {
                E(i4, list.get(size).booleanValue());
            }
            return;
        }
        r0(list.size() + 10);
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            s0(list.get(size2).booleanValue());
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void v0(int i4, c0 c0Var, boolean z4) throws IOException {
        if (!z4) {
            for (int size = c0Var.size() - 1; size >= 0; size--) {
                v(i4, c0Var.getDouble(size));
            }
            return;
        }
        r0((c0Var.size() * 8) + 10);
        int c02 = c0();
        for (int size2 = c0Var.size() - 1; size2 >= 0; size2--) {
            A0(Double.doubleToRawLongBits(c0Var.getDouble(size2)));
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void w0(int i4, List<Double> list, boolean z4) throws IOException {
        if (!z4) {
            for (int size = list.size() - 1; size >= 0; size--) {
                v(i4, list.get(size).doubleValue());
            }
            return;
        }
        r0(n.a(list, 8, 10));
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A0(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void y0(int i4, n1 n1Var, boolean z4) throws IOException {
        if (!z4) {
            for (int size = n1Var.size() - 1; size >= 0; size--) {
                c(i4, n1Var.getInt(size));
            }
            return;
        }
        r0((n1Var.size() * 4) + 10);
        int c02 = c0();
        for (int size2 = n1Var.size() - 1; size2 >= 0; size2--) {
            x0(n1Var.getInt(size2));
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    private final void z0(int i4, List<Integer> list, boolean z4) throws IOException {
        if (!z4) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c(i4, list.get(size).intValue());
            }
            return;
        }
        r0(n.a(list, 4, 10));
        int c02 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            x0(list.get(size2).intValue());
        }
        W0(c0() - c02);
        R0(i4, 2);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void A(int i4, List<?> list, m3 m3Var) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            n(i4, list.get(size), m3Var);
        }
    }

    abstract void A0(long j4);

    @Override // androidx.content.preferences.protobuf.v4
    public final void B(int i4, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            C(i4, list.get(size));
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void D(int i4, long j4) throws IOException {
        h(i4, j4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void F(int i4, int i5) throws IOException {
        c(i4, i5);
    }

    abstract void F0(int i4);

    @Override // androidx.content.preferences.protobuf.v4
    public final void H(int i4, List<Long> list, boolean z4) throws IOException {
        if (list instanceof z1) {
            B0(i4, (z1) list, z4);
        } else {
            C0(i4, list, z4);
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void I(int i4, List<Integer> list, boolean z4) throws IOException {
        m(i4, list, z4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void J(int i4, List<Boolean> list, boolean z4) throws IOException {
        if (list instanceof s) {
            t0(i4, (s) list, z4);
        } else {
            u0(i4, list, z4);
        }
    }

    abstract void K0(int i4);

    @Override // androidx.content.preferences.protobuf.v4
    public final void L(int i4, float f4) throws IOException {
        c(i4, Float.floatToRawIntBits(f4));
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void N(int i4, List<Integer> list, boolean z4) throws IOException {
        if (list instanceof n1) {
            L0(i4, (n1) list, z4);
        } else {
            M0(i4, list, z4);
        }
    }

    abstract void N0(long j4);

    @Override // androidx.content.preferences.protobuf.v4
    public final void O(int i4, int i5) throws IOException {
        j(i4, i5);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void P(int i4, List<Long> list, boolean z4) throws IOException {
        x(i4, list, z4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void Q(int i4, List<Double> list, boolean z4) throws IOException {
        if (list instanceof c0) {
            v0(i4, (c0) list, z4);
        } else {
            w0(i4, list, z4);
        }
    }

    abstract void Q0(String str);

    abstract void R0(int i4, int i5);

    @Override // androidx.content.preferences.protobuf.v4
    public final void S(int i4, List<w> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            k(i4, list.get(size));
        }
    }

    abstract void W0(int i4);

    abstract void X0(long j4);

    public final Queue<androidx.content.preferences.protobuf.d> Z() {
        b0();
        return this.f28807c;
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void a(int i4, List<Float> list, boolean z4) throws IOException {
        if (list instanceof e1) {
            D0(i4, (e1) list, z4);
        } else {
            E0(i4, list, z4);
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void b(int i4, Object obj) throws IOException {
        R0(1, 4);
        if (obj instanceof w) {
            k(3, (w) obj);
        } else {
            C(3, obj);
        }
        u(2, i4);
        R0(1, 3);
    }

    abstract void b0();

    public abstract int c0();

    @Override // androidx.content.preferences.protobuf.v4
    public final void d(int i4, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            K(i4, list.get(size));
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void e(int i4, List<String> list) throws IOException {
        if (!(list instanceof v1)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                g(i4, list.get(size));
            }
            return;
        }
        v1 v1Var = (v1) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            I0(i4, v1Var.D3(size2));
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void f(int i4, List<?> list, m3 m3Var) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            t(i4, list.get(size), m3Var);
        }
    }

    final androidx.content.preferences.protobuf.d f0() {
        return this.f28805a.a(this.f28806b);
    }

    final androidx.content.preferences.protobuf.d g0(int i4) {
        return this.f28805a.a(Math.max(i4, this.f28806b));
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void i(int i4, List<Integer> list, boolean z4) throws IOException {
        if (list instanceof n1) {
            G0(i4, (n1) list, z4);
        } else {
            H0(i4, list, z4);
        }
    }

    final androidx.content.preferences.protobuf.d j0() {
        return this.f28805a.b(this.f28806b);
    }

    final androidx.content.preferences.protobuf.d k0(int i4) {
        return this.f28805a.b(Math.max(i4, this.f28806b));
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void l(int i4, long j4) throws IOException {
        y(i4, j4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void m(int i4, List<Integer> list, boolean z4) throws IOException {
        if (list instanceof n1) {
            y0(i4, (n1) list, z4);
        } else {
            z0(i4, list, z4);
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void o(int i4, List<Integer> list, boolean z4) throws IOException {
        if (list instanceof n1) {
            S0(i4, (n1) list, z4);
        } else {
            T0(i4, list, z4);
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void p(int i4, List<Long> list, boolean z4) throws IOException {
        if (list instanceof z1) {
            O0(i4, (z1) list, z4);
        } else {
            P0(i4, list, z4);
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void r(int i4, List<Integer> list, boolean z4) throws IOException {
        i(i4, list, z4);
    }

    abstract void r0(int i4);

    @Override // androidx.content.preferences.protobuf.v4
    public <K, V> void s(int i4, b2.b<K, V> bVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int c02 = c0();
            J0(this, 2, bVar.f28642c, entry.getValue());
            J0(this, 1, bVar.f28640a, entry.getKey());
            W0(c0() - c02);
            R0(i4, 2);
        }
    }

    abstract void s0(boolean z4);

    @Override // androidx.content.preferences.protobuf.v4
    public final void v(int i4, double d5) throws IOException {
        y(i4, Double.doubleToRawLongBits(d5));
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void w(int i4, List<Long> list, boolean z4) throws IOException {
        H(i4, list, z4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void x(int i4, List<Long> list, boolean z4) throws IOException {
        if (list instanceof z1) {
            U0(i4, (z1) list, z4);
        } else {
            V0(i4, list, z4);
        }
    }

    abstract void x0(int i4);

    @Override // androidx.content.preferences.protobuf.v4
    public final v4.a z() {
        return v4.a.DESCENDING;
    }

    /* synthetic */ o(t tVar, int i4, a aVar) {
        this(tVar, i4);
    }
}
