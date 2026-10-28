package android.content.preferences.protobuf;

import android.content.preferences.protobuf.n4;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class CodedOutputStream extends u {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f7127c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f7128d = m4.S();

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f7129e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7130f = 4096;

    /* renamed from: a, reason: collision with root package name */
    b0 f7131a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7132b;

    private static abstract class b extends CodedOutputStream {

        /* renamed from: g, reason: collision with root package name */
        final byte[] f7135g;

        /* renamed from: h, reason: collision with root package name */
        final int f7136h;

        /* renamed from: i, reason: collision with root package name */
        int f7137i;

        /* renamed from: j, reason: collision with root package name */
        int f7138j;

        b(int i5) {
            super();
            if (i5 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i5, 20)];
            this.f7135g = bArr;
            this.f7136h = bArr.length;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final int f1() {
            return this.f7138j;
        }

        final void j2(byte b6) {
            byte[] bArr = this.f7135g;
            int i5 = this.f7137i;
            this.f7137i = i5 + 1;
            bArr[i5] = b6;
            this.f7138j++;
        }

        final void k2(int i5) {
            byte[] bArr = this.f7135g;
            int i6 = this.f7137i;
            int i7 = i6 + 1;
            bArr[i6] = (byte) (i5 & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) ((i5 >> 8) & 255);
            int i9 = i8 + 1;
            bArr[i8] = (byte) ((i5 >> 16) & 255);
            this.f7137i = i9 + 1;
            bArr[i9] = (byte) ((i5 >> 24) & 255);
            this.f7138j += 4;
        }

        final void l2(long j5) {
            byte[] bArr = this.f7135g;
            int i5 = this.f7137i;
            int i6 = i5 + 1;
            bArr[i5] = (byte) (j5 & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) ((j5 >> 8) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) ((j5 >> 16) & 255);
            int i9 = i8 + 1;
            bArr[i8] = (byte) (255 & (j5 >> 24));
            int i10 = i9 + 1;
            bArr[i9] = (byte) (((int) (j5 >> 32)) & 255);
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) (j5 >> 40)) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j5 >> 48)) & 255);
            this.f7137i = i12 + 1;
            bArr[i12] = (byte) (((int) (j5 >> 56)) & 255);
            this.f7138j += 8;
        }

        final void m2(int i5) {
            if (i5 >= 0) {
                o2(i5);
            } else {
                p2(i5);
            }
        }

        final void n2(int i5, int i6) {
            o2(q4.c(i5, i6));
        }

        final void o2(int i5) {
            if (!CodedOutputStream.f7128d) {
                while ((i5 & (-128)) != 0) {
                    byte[] bArr = this.f7135g;
                    int i6 = this.f7137i;
                    this.f7137i = i6 + 1;
                    bArr[i6] = (byte) ((i5 & 127) | 128);
                    this.f7138j++;
                    i5 >>>= 7;
                }
                byte[] bArr2 = this.f7135g;
                int i7 = this.f7137i;
                this.f7137i = i7 + 1;
                bArr2[i7] = (byte) i5;
                this.f7138j++;
                return;
            }
            long j5 = this.f7137i;
            while ((i5 & (-128)) != 0) {
                byte[] bArr3 = this.f7135g;
                int i8 = this.f7137i;
                this.f7137i = i8 + 1;
                m4.d0(bArr3, i8, (byte) ((i5 & 127) | 128));
                i5 >>>= 7;
            }
            byte[] bArr4 = this.f7135g;
            int i9 = this.f7137i;
            this.f7137i = i9 + 1;
            m4.d0(bArr4, i9, (byte) i5);
            this.f7138j += (int) (this.f7137i - j5);
        }

        final void p2(long j5) {
            if (!CodedOutputStream.f7128d) {
                while ((j5 & (-128)) != 0) {
                    byte[] bArr = this.f7135g;
                    int i5 = this.f7137i;
                    this.f7137i = i5 + 1;
                    bArr[i5] = (byte) ((((int) j5) & 127) | 128);
                    this.f7138j++;
                    j5 >>>= 7;
                }
                byte[] bArr2 = this.f7135g;
                int i6 = this.f7137i;
                this.f7137i = i6 + 1;
                bArr2[i6] = (byte) j5;
                this.f7138j++;
                return;
            }
            long j6 = this.f7137i;
            while ((j5 & (-128)) != 0) {
                byte[] bArr3 = this.f7135g;
                int i7 = this.f7137i;
                this.f7137i = i7 + 1;
                m4.d0(bArr3, i7, (byte) ((((int) j5) & 127) | 128));
                j5 >>>= 7;
            }
            byte[] bArr4 = this.f7135g;
            int i8 = this.f7137i;
            this.f7137i = i8 + 1;
            m4.d0(bArr4, i8, (byte) j5);
            this.f7138j += (int) (this.f7137i - j6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final int r1() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends CodedOutputStream {

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f7139g;

        /* renamed from: h, reason: collision with root package name */
        private final int f7140h;

        /* renamed from: i, reason: collision with root package name */
        private final int f7141i;

        /* renamed from: j, reason: collision with root package name */
        private int f7142j;

        c(byte[] bArr, int i5, int i6) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i7 = i5 + i6;
            if ((i5 | i6 | (bArr.length - i7)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i6)));
            }
            this.f7139g = bArr;
            this.f7140h = i5;
            this.f7142j = i5;
            this.f7141i = i7;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void C1(int i5) throws IOException {
            try {
                byte[] bArr = this.f7139g;
                int i6 = this.f7142j;
                int i7 = i6 + 1;
                bArr[i6] = (byte) (i5 & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((i5 >> 8) & 255);
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((i5 >> 16) & 255);
                this.f7142j = i9 + 1;
                bArr[i9] = (byte) ((i5 >> 24) & 255);
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7142j), Integer.valueOf(this.f7141i), 1), e6);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void D1(long j5) throws IOException {
            try {
                byte[] bArr = this.f7139g;
                int i5 = this.f7142j;
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) j5) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j5 >> 8)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j5 >> 16)) & 255);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (((int) (j5 >> 24)) & 255);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((int) (j5 >> 32)) & 255);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) (j5 >> 40)) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j5 >> 48)) & 255);
                this.f7142j = i12 + 1;
                bArr[i12] = (byte) (((int) (j5 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7142j), Integer.valueOf(this.f7141i), 1), e6);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void J1(int i5) throws IOException {
            if (i5 >= 0) {
                h2(i5);
            } else {
                i2(i5);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void L1(int i5, h2 h2Var) throws IOException {
            g2(i5, 2);
            N1(h2Var);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        final void M1(int i5, h2 h2Var, j3 j3Var) throws IOException {
            g2(i5, 2);
            h2(((android.content.preferences.protobuf.a) h2Var).R(j3Var));
            j3Var.e(h2Var, this.f7131a);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void N1(h2 h2Var) throws IOException {
            h2(h2Var.u());
            h2Var.M0(this);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        final void O1(h2 h2Var, j3 j3Var) throws IOException {
            h2(((android.content.preferences.protobuf.a) h2Var).R(j3Var));
            j3Var.e(h2Var, this.f7131a);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void P1(int i5, h2 h2Var) throws IOException {
            g2(1, 3);
            b(2, i5);
            L1(3, h2Var);
            g2(1, 4);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public final void T(byte b6) throws IOException {
            try {
                byte[] bArr = this.f7139g;
                int i5 = this.f7142j;
                this.f7142j = i5 + 1;
                bArr[i5] = b6;
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7142j), Integer.valueOf(this.f7141i), 1), e6);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public final void U(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f7139g, this.f7142j, remaining);
                this.f7142j += remaining;
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7142j), Integer.valueOf(this.f7141i), Integer.valueOf(remaining)), e6);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public final void V(byte[] bArr, int i5, int i6) throws IOException {
            try {
                System.arraycopy(bArr, i5, this.f7139g, this.f7142j, i6);
                this.f7142j += i6;
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7142j), Integer.valueOf(this.f7141i), Integer.valueOf(i6)), e6);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public final void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public final void X(byte[] bArr, int i5, int i6) throws IOException {
            V(bArr, i5, i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void Y1(int i5, w wVar) throws IOException {
            g2(1, 3);
            b(2, i5);
            z(3, wVar);
            g2(1, 4);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void b(int i5, int i6) throws IOException {
            g2(i5, 0);
            h2(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void d(int i5, int i6) throws IOException {
            g2(i5, 5);
            C1(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void e1() {
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final int f1() {
            return this.f7142j - this.f7140h;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void f2(String str) throws IOException {
            int i5 = this.f7142j;
            try {
                int Z0 = CodedOutputStream.Z0(str.length() * 3);
                int Z02 = CodedOutputStream.Z0(str.length());
                if (Z02 == Z0) {
                    int i6 = i5 + Z02;
                    this.f7142j = i6;
                    int i7 = n4.i(str, this.f7139g, i6, r1());
                    this.f7142j = i5;
                    h2((i7 - i5) - Z02);
                    this.f7142j = i7;
                } else {
                    h2(n4.k(str));
                    this.f7142j = n4.i(str, this.f7139g, this.f7142j, r1());
                }
            } catch (n4.d e6) {
                this.f7142j = i5;
                g1(str, e6);
            } catch (IndexOutOfBoundsException e7) {
                throw new OutOfSpaceException(e7);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void g2(int i5, int i6) throws IOException {
            h2(q4.c(i5, i6));
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void h2(int i5) throws IOException {
            if (!CodedOutputStream.f7128d || android.content.preferences.protobuf.e.c() || r1() < 5) {
                while ((i5 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f7139g;
                        int i6 = this.f7142j;
                        this.f7142j = i6 + 1;
                        bArr[i6] = (byte) ((i5 & 127) | 128);
                        i5 >>>= 7;
                    } catch (IndexOutOfBoundsException e6) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7142j), Integer.valueOf(this.f7141i), 1), e6);
                    }
                }
                byte[] bArr2 = this.f7139g;
                int i7 = this.f7142j;
                this.f7142j = i7 + 1;
                bArr2[i7] = (byte) i5;
                return;
            }
            if ((i5 & (-128)) == 0) {
                byte[] bArr3 = this.f7139g;
                int i8 = this.f7142j;
                this.f7142j = i8 + 1;
                m4.d0(bArr3, i8, (byte) i5);
                return;
            }
            byte[] bArr4 = this.f7139g;
            int i9 = this.f7142j;
            this.f7142j = i9 + 1;
            m4.d0(bArr4, i9, (byte) (i5 | 128));
            int i10 = i5 >>> 7;
            if ((i10 & (-128)) == 0) {
                byte[] bArr5 = this.f7139g;
                int i11 = this.f7142j;
                this.f7142j = i11 + 1;
                m4.d0(bArr5, i11, (byte) i10);
                return;
            }
            byte[] bArr6 = this.f7139g;
            int i12 = this.f7142j;
            this.f7142j = i12 + 1;
            m4.d0(bArr6, i12, (byte) (i10 | 128));
            int i13 = i10 >>> 7;
            if ((i13 & (-128)) == 0) {
                byte[] bArr7 = this.f7139g;
                int i14 = this.f7142j;
                this.f7142j = i14 + 1;
                m4.d0(bArr7, i14, (byte) i13);
                return;
            }
            byte[] bArr8 = this.f7139g;
            int i15 = this.f7142j;
            this.f7142j = i15 + 1;
            m4.d0(bArr8, i15, (byte) (i13 | 128));
            int i16 = i13 >>> 7;
            if ((i16 & (-128)) == 0) {
                byte[] bArr9 = this.f7139g;
                int i17 = this.f7142j;
                this.f7142j = i17 + 1;
                m4.d0(bArr9, i17, (byte) i16);
                return;
            }
            byte[] bArr10 = this.f7139g;
            int i18 = this.f7142j;
            this.f7142j = i18 + 1;
            m4.d0(bArr10, i18, (byte) (i16 | 128));
            byte[] bArr11 = this.f7139g;
            int i19 = this.f7142j;
            this.f7142j = i19 + 1;
            m4.d0(bArr11, i19, (byte) (i16 >>> 7));
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void i(int i5, long j5) throws IOException {
            g2(i5, 1);
            D1(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void i2(long j5) throws IOException {
            if (CodedOutputStream.f7128d && r1() >= 10) {
                while ((j5 & (-128)) != 0) {
                    byte[] bArr = this.f7139g;
                    int i5 = this.f7142j;
                    this.f7142j = i5 + 1;
                    m4.d0(bArr, i5, (byte) ((((int) j5) & 127) | 128));
                    j5 >>>= 7;
                }
                byte[] bArr2 = this.f7139g;
                int i6 = this.f7142j;
                this.f7142j = i6 + 1;
                m4.d0(bArr2, i6, (byte) j5);
                return;
            }
            while ((j5 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f7139g;
                    int i7 = this.f7142j;
                    this.f7142j = i7 + 1;
                    bArr3[i7] = (byte) ((((int) j5) & 127) | 128);
                    j5 >>>= 7;
                } catch (IndexOutOfBoundsException e6) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7142j), Integer.valueOf(this.f7141i), 1), e6);
                }
            }
            byte[] bArr4 = this.f7139g;
            int i8 = this.f7142j;
            this.f7142j = i8 + 1;
            bArr4[i8] = (byte) j5;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void o(int i5, String str) throws IOException {
            g2(i5, 2);
            f2(str);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void p(int i5, long j5) throws IOException {
            g2(i5, 0);
            i2(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final int r1() {
            return this.f7141i - this.f7142j;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void t(int i5, boolean z5) throws IOException {
            g2(i5, 0);
            T(z5 ? (byte) 1 : (byte) 0);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void u1(int i5, byte[] bArr) throws IOException {
            v1(i5, bArr, 0, bArr.length);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void v1(int i5, byte[] bArr, int i6, int i7) throws IOException {
            g2(i5, 2);
            x1(bArr, i6, i7);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void w(int i5, int i6) throws IOException {
            g2(i5, 0);
            J1(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void x1(byte[] bArr, int i5, int i6) throws IOException {
            h2(i6);
            V(bArr, i5, i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void y1(int i5, ByteBuffer byteBuffer) throws IOException {
            g2(i5, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void z(int i5, w wVar) throws IOException {
            g2(i5, 2);
            z1(wVar);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public final void z1(w wVar) throws IOException {
            h2(wVar.size());
            wVar.u0(this);
        }
    }

    private static final class d extends b {

        /* renamed from: k, reason: collision with root package name */
        private final u f7143k;

        d(u uVar, int i5) {
            super(i5);
            if (uVar == null) {
                throw new NullPointerException("out");
            }
            this.f7143k = uVar;
        }

        private void q2() throws IOException {
            this.f7143k.V(this.f7135g, 0, this.f7137i);
            this.f7137i = 0;
        }

        private void r2(int i5) throws IOException {
            if (this.f7136h - this.f7137i < i5) {
                q2();
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void C1(int i5) throws IOException {
            r2(4);
            k2(i5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void D1(long j5) throws IOException {
            r2(8);
            l2(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void J1(int i5) throws IOException {
            if (i5 >= 0) {
                h2(i5);
            } else {
                i2(i5);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void L1(int i5, h2 h2Var) throws IOException {
            g2(i5, 2);
            N1(h2Var);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        void M1(int i5, h2 h2Var, j3 j3Var) throws IOException {
            g2(i5, 2);
            O1(h2Var, j3Var);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void N1(h2 h2Var) throws IOException {
            h2(h2Var.u());
            h2Var.M0(this);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        void O1(h2 h2Var, j3 j3Var) throws IOException {
            h2(((android.content.preferences.protobuf.a) h2Var).R(j3Var));
            j3Var.e(h2Var, this.f7131a);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void P1(int i5, h2 h2Var) throws IOException {
            g2(1, 3);
            b(2, i5);
            L1(3, h2Var);
            g2(1, 4);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void T(byte b6) throws IOException {
            if (this.f7137i == this.f7136h) {
                q2();
            }
            j2(b6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void U(ByteBuffer byteBuffer) throws IOException {
            e1();
            int remaining = byteBuffer.remaining();
            this.f7143k.U(byteBuffer);
            this.f7138j += remaining;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void V(byte[] bArr, int i5, int i6) throws IOException {
            e1();
            this.f7143k.V(bArr, i5, i6);
            this.f7138j += i6;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void W(ByteBuffer byteBuffer) throws IOException {
            e1();
            int remaining = byteBuffer.remaining();
            this.f7143k.W(byteBuffer);
            this.f7138j += remaining;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void X(byte[] bArr, int i5, int i6) throws IOException {
            e1();
            this.f7143k.X(bArr, i5, i6);
            this.f7138j += i6;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void Y1(int i5, w wVar) throws IOException {
            g2(1, 3);
            b(2, i5);
            z(3, wVar);
            g2(1, 4);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void b(int i5, int i6) throws IOException {
            r2(20);
            n2(i5, 0);
            o2(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void d(int i5, int i6) throws IOException {
            r2(14);
            n2(i5, 5);
            k2(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void e1() throws IOException {
            if (this.f7137i > 0) {
                q2();
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            int length = str.length() * 3;
            int Z0 = CodedOutputStream.Z0(length);
            int i5 = Z0 + length;
            int i6 = this.f7136h;
            if (i5 > i6) {
                byte[] bArr = new byte[length];
                int i7 = n4.i(str, bArr, 0, length);
                h2(i7);
                X(bArr, 0, i7);
                return;
            }
            if (i5 > i6 - this.f7137i) {
                q2();
            }
            int i8 = this.f7137i;
            try {
                int Z02 = CodedOutputStream.Z0(str.length());
                if (Z02 == Z0) {
                    int i9 = i8 + Z02;
                    this.f7137i = i9;
                    int i10 = n4.i(str, this.f7135g, i9, this.f7136h - i9);
                    this.f7137i = i8;
                    int i11 = (i10 - i8) - Z02;
                    o2(i11);
                    this.f7137i = i10;
                    this.f7138j += i11;
                } else {
                    int k5 = n4.k(str);
                    o2(k5);
                    this.f7137i = n4.i(str, this.f7135g, this.f7137i, k5);
                    this.f7138j += k5;
                }
            } catch (n4.d e6) {
                this.f7138j -= this.f7137i - i8;
                this.f7137i = i8;
                g1(str, e6);
            } catch (IndexOutOfBoundsException e7) {
                throw new OutOfSpaceException(e7);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void g2(int i5, int i6) throws IOException {
            h2(q4.c(i5, i6));
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void h2(int i5) throws IOException {
            r2(5);
            o2(i5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void i(int i5, long j5) throws IOException {
            r2(18);
            n2(i5, 1);
            l2(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void i2(long j5) throws IOException {
            r2(10);
            p2(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void o(int i5, String str) throws IOException {
            g2(i5, 2);
            f2(str);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void p(int i5, long j5) throws IOException {
            r2(20);
            n2(i5, 0);
            p2(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void t(int i5, boolean z5) throws IOException {
            r2(11);
            n2(i5, 0);
            j2(z5 ? (byte) 1 : (byte) 0);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void u1(int i5, byte[] bArr) throws IOException {
            v1(i5, bArr, 0, bArr.length);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void v1(int i5, byte[] bArr, int i6, int i7) throws IOException {
            g2(i5, 2);
            x1(bArr, i6, i7);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void w(int i5, int i6) throws IOException {
            r2(20);
            n2(i5, 0);
            m2(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i5, int i6) throws IOException {
            h2(i6);
            V(bArr, i5, i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void y1(int i5, ByteBuffer byteBuffer) throws IOException {
            g2(i5, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void z(int i5, w wVar) throws IOException {
            g2(i5, 2);
            z1(wVar);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void z1(w wVar) throws IOException {
            h2(wVar.size());
            wVar.u0(this);
        }
    }

    private static final class e extends c {

        /* renamed from: k, reason: collision with root package name */
        private final ByteBuffer f7144k;

        /* renamed from: l, reason: collision with root package name */
        private int f7145l;

        e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            this.f7144k = byteBuffer;
            this.f7145l = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.c, android.content.preferences.protobuf.CodedOutputStream
        public void e1() {
            this.f7144k.position(this.f7145l + f1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f extends b {

        /* renamed from: k, reason: collision with root package name */
        private final OutputStream f7146k;

        f(OutputStream outputStream, int i5) {
            super(i5);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f7146k = outputStream;
        }

        private void q2() throws IOException {
            this.f7146k.write(this.f7135g, 0, this.f7137i);
            this.f7137i = 0;
        }

        private void r2(int i5) throws IOException {
            if (this.f7136h - this.f7137i < i5) {
                q2();
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void C1(int i5) throws IOException {
            r2(4);
            k2(i5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void D1(long j5) throws IOException {
            r2(8);
            l2(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void J1(int i5) throws IOException {
            if (i5 >= 0) {
                h2(i5);
            } else {
                i2(i5);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void L1(int i5, h2 h2Var) throws IOException {
            g2(i5, 2);
            N1(h2Var);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        void M1(int i5, h2 h2Var, j3 j3Var) throws IOException {
            g2(i5, 2);
            O1(h2Var, j3Var);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void N1(h2 h2Var) throws IOException {
            h2(h2Var.u());
            h2Var.M0(this);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        void O1(h2 h2Var, j3 j3Var) throws IOException {
            h2(((android.content.preferences.protobuf.a) h2Var).R(j3Var));
            j3Var.e(h2Var, this.f7131a);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void P1(int i5, h2 h2Var) throws IOException {
            g2(1, 3);
            b(2, i5);
            L1(3, h2Var);
            g2(1, 4);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void T(byte b6) throws IOException {
            if (this.f7137i == this.f7136h) {
                q2();
            }
            j2(b6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void U(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i5 = this.f7136h;
            int i6 = this.f7137i;
            if (i5 - i6 >= remaining) {
                byteBuffer.get(this.f7135g, i6, remaining);
                this.f7137i += remaining;
                this.f7138j += remaining;
                return;
            }
            int i7 = i5 - i6;
            byteBuffer.get(this.f7135g, i6, i7);
            int i8 = remaining - i7;
            this.f7137i = this.f7136h;
            this.f7138j += i7;
            q2();
            while (true) {
                int i9 = this.f7136h;
                if (i8 <= i9) {
                    byteBuffer.get(this.f7135g, 0, i8);
                    this.f7137i = i8;
                    this.f7138j += i8;
                    return;
                } else {
                    byteBuffer.get(this.f7135g, 0, i9);
                    this.f7146k.write(this.f7135g, 0, this.f7136h);
                    int i10 = this.f7136h;
                    i8 -= i10;
                    this.f7138j += i10;
                }
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void V(byte[] bArr, int i5, int i6) throws IOException {
            int i7 = this.f7136h;
            int i8 = this.f7137i;
            if (i7 - i8 >= i6) {
                System.arraycopy(bArr, i5, this.f7135g, i8, i6);
                this.f7137i += i6;
                this.f7138j += i6;
                return;
            }
            int i9 = i7 - i8;
            System.arraycopy(bArr, i5, this.f7135g, i8, i9);
            int i10 = i5 + i9;
            int i11 = i6 - i9;
            this.f7137i = this.f7136h;
            this.f7138j += i9;
            q2();
            if (i11 <= this.f7136h) {
                System.arraycopy(bArr, i10, this.f7135g, 0, i11);
                this.f7137i = i11;
            } else {
                this.f7146k.write(bArr, i10, i11);
            }
            this.f7138j += i11;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void X(byte[] bArr, int i5, int i6) throws IOException {
            V(bArr, i5, i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void Y1(int i5, w wVar) throws IOException {
            g2(1, 3);
            b(2, i5);
            z(3, wVar);
            g2(1, 4);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void b(int i5, int i6) throws IOException {
            r2(20);
            n2(i5, 0);
            o2(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void d(int i5, int i6) throws IOException {
            r2(14);
            n2(i5, 5);
            k2(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void e1() throws IOException {
            if (this.f7137i > 0) {
                q2();
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            int k5;
            try {
                int length = str.length() * 3;
                int Z0 = CodedOutputStream.Z0(length);
                int i5 = Z0 + length;
                int i6 = this.f7136h;
                if (i5 > i6) {
                    byte[] bArr = new byte[length];
                    int i7 = n4.i(str, bArr, 0, length);
                    h2(i7);
                    V(bArr, 0, i7);
                    return;
                }
                if (i5 > i6 - this.f7137i) {
                    q2();
                }
                int Z02 = CodedOutputStream.Z0(str.length());
                int i8 = this.f7137i;
                try {
                    if (Z02 == Z0) {
                        int i9 = i8 + Z02;
                        this.f7137i = i9;
                        int i10 = n4.i(str, this.f7135g, i9, this.f7136h - i9);
                        this.f7137i = i8;
                        k5 = (i10 - i8) - Z02;
                        o2(k5);
                        this.f7137i = i10;
                    } else {
                        k5 = n4.k(str);
                        o2(k5);
                        this.f7137i = n4.i(str, this.f7135g, this.f7137i, k5);
                    }
                    this.f7138j += k5;
                } catch (n4.d e6) {
                    this.f7138j -= this.f7137i - i8;
                    this.f7137i = i8;
                    throw e6;
                } catch (ArrayIndexOutOfBoundsException e7) {
                    throw new OutOfSpaceException(e7);
                }
            } catch (n4.d e8) {
                g1(str, e8);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void g2(int i5, int i6) throws IOException {
            h2(q4.c(i5, i6));
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void h2(int i5) throws IOException {
            r2(5);
            o2(i5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void i(int i5, long j5) throws IOException {
            r2(18);
            n2(i5, 1);
            l2(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void i2(long j5) throws IOException {
            r2(10);
            p2(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void o(int i5, String str) throws IOException {
            g2(i5, 2);
            f2(str);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void p(int i5, long j5) throws IOException {
            r2(20);
            n2(i5, 0);
            p2(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void t(int i5, boolean z5) throws IOException {
            r2(11);
            n2(i5, 0);
            j2(z5 ? (byte) 1 : (byte) 0);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void u1(int i5, byte[] bArr) throws IOException {
            v1(i5, bArr, 0, bArr.length);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void v1(int i5, byte[] bArr, int i6, int i7) throws IOException {
            g2(i5, 2);
            x1(bArr, i6, i7);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void w(int i5, int i6) throws IOException {
            r2(20);
            n2(i5, 0);
            m2(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i5, int i6) throws IOException {
            h2(i6);
            V(bArr, i5, i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void y1(int i5, ByteBuffer byteBuffer) throws IOException {
            g2(i5, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void z(int i5, w wVar) throws IOException {
            g2(i5, 2);
            z1(wVar);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void z1(w wVar) throws IOException {
            h2(wVar.size());
            wVar.u0(this);
        }
    }

    private static final class g extends CodedOutputStream {

        /* renamed from: g, reason: collision with root package name */
        private final ByteBuffer f7147g;

        /* renamed from: h, reason: collision with root package name */
        private final ByteBuffer f7148h;

        /* renamed from: i, reason: collision with root package name */
        private final int f7149i;

        g(ByteBuffer byteBuffer) {
            super();
            this.f7147g = byteBuffer;
            this.f7148h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f7149i = byteBuffer.position();
        }

        private void j2(String str) throws IOException {
            try {
                n4.j(str, this.f7148h);
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(e6);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void C1(int i5) throws IOException {
            try {
                this.f7148h.putInt(i5);
            } catch (BufferOverflowException e6) {
                throw new OutOfSpaceException(e6);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void D1(long j5) throws IOException {
            try {
                this.f7148h.putLong(j5);
            } catch (BufferOverflowException e6) {
                throw new OutOfSpaceException(e6);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void J1(int i5) throws IOException {
            if (i5 >= 0) {
                h2(i5);
            } else {
                i2(i5);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void L1(int i5, h2 h2Var) throws IOException {
            g2(i5, 2);
            N1(h2Var);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        void M1(int i5, h2 h2Var, j3 j3Var) throws IOException {
            g2(i5, 2);
            O1(h2Var, j3Var);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void N1(h2 h2Var) throws IOException {
            h2(h2Var.u());
            h2Var.M0(this);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        void O1(h2 h2Var, j3 j3Var) throws IOException {
            h2(((android.content.preferences.protobuf.a) h2Var).R(j3Var));
            j3Var.e(h2Var, this.f7131a);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void P1(int i5, h2 h2Var) throws IOException {
            g2(1, 3);
            b(2, i5);
            L1(3, h2Var);
            g2(1, 4);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void T(byte b6) throws IOException {
            try {
                this.f7148h.put(b6);
            } catch (BufferOverflowException e6) {
                throw new OutOfSpaceException(e6);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void U(ByteBuffer byteBuffer) throws IOException {
            try {
                this.f7148h.put(byteBuffer);
            } catch (BufferOverflowException e6) {
                throw new OutOfSpaceException(e6);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void V(byte[] bArr, int i5, int i6) throws IOException {
            try {
                this.f7148h.put(bArr, i5, i6);
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(e6);
            } catch (BufferOverflowException e7) {
                throw new OutOfSpaceException(e7);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void X(byte[] bArr, int i5, int i6) throws IOException {
            V(bArr, i5, i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void Y1(int i5, w wVar) throws IOException {
            g2(1, 3);
            b(2, i5);
            z(3, wVar);
            g2(1, 4);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void b(int i5, int i6) throws IOException {
            g2(i5, 0);
            h2(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void d(int i5, int i6) throws IOException {
            g2(i5, 5);
            C1(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void e1() {
            this.f7147g.position(this.f7148h.position());
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public int f1() {
            return this.f7148h.position() - this.f7149i;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            int position = this.f7148h.position();
            try {
                int Z0 = CodedOutputStream.Z0(str.length() * 3);
                int Z02 = CodedOutputStream.Z0(str.length());
                if (Z02 == Z0) {
                    int position2 = this.f7148h.position() + Z02;
                    this.f7148h.position(position2);
                    j2(str);
                    int position3 = this.f7148h.position();
                    this.f7148h.position(position);
                    h2(position3 - position2);
                    this.f7148h.position(position3);
                } else {
                    h2(n4.k(str));
                    j2(str);
                }
            } catch (n4.d e6) {
                this.f7148h.position(position);
                g1(str, e6);
            } catch (IllegalArgumentException e7) {
                throw new OutOfSpaceException(e7);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void g2(int i5, int i6) throws IOException {
            h2(q4.c(i5, i6));
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void h2(int i5) throws IOException {
            while ((i5 & (-128)) != 0) {
                try {
                    this.f7148h.put((byte) ((i5 & 127) | 128));
                    i5 >>>= 7;
                } catch (BufferOverflowException e6) {
                    throw new OutOfSpaceException(e6);
                }
            }
            this.f7148h.put((byte) i5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void i(int i5, long j5) throws IOException {
            g2(i5, 1);
            D1(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void i2(long j5) throws IOException {
            while (((-128) & j5) != 0) {
                try {
                    this.f7148h.put((byte) ((((int) j5) & 127) | 128));
                    j5 >>>= 7;
                } catch (BufferOverflowException e6) {
                    throw new OutOfSpaceException(e6);
                }
            }
            this.f7148h.put((byte) j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void o(int i5, String str) throws IOException {
            g2(i5, 2);
            f2(str);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void p(int i5, long j5) throws IOException {
            g2(i5, 0);
            i2(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public int r1() {
            return this.f7148h.remaining();
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void t(int i5, boolean z5) throws IOException {
            g2(i5, 0);
            T(z5 ? (byte) 1 : (byte) 0);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void u1(int i5, byte[] bArr) throws IOException {
            v1(i5, bArr, 0, bArr.length);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void v1(int i5, byte[] bArr, int i6, int i7) throws IOException {
            g2(i5, 2);
            x1(bArr, i6, i7);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void w(int i5, int i6) throws IOException {
            g2(i5, 0);
            J1(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i5, int i6) throws IOException {
            h2(i6);
            V(bArr, i5, i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void y1(int i5, ByteBuffer byteBuffer) throws IOException {
            g2(i5, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void z(int i5, w wVar) throws IOException {
            g2(i5, 2);
            z1(wVar);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void z1(w wVar) throws IOException {
            h2(wVar.size());
            wVar.u0(this);
        }
    }

    private static final class h extends CodedOutputStream {

        /* renamed from: g, reason: collision with root package name */
        private final ByteBuffer f7150g;

        /* renamed from: h, reason: collision with root package name */
        private final ByteBuffer f7151h;

        /* renamed from: i, reason: collision with root package name */
        private final long f7152i;

        /* renamed from: j, reason: collision with root package name */
        private final long f7153j;

        /* renamed from: k, reason: collision with root package name */
        private final long f7154k;

        /* renamed from: l, reason: collision with root package name */
        private final long f7155l;

        /* renamed from: m, reason: collision with root package name */
        private long f7156m;

        h(ByteBuffer byteBuffer) {
            super();
            this.f7150g = byteBuffer;
            this.f7151h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long i5 = m4.i(byteBuffer);
            this.f7152i = i5;
            long position = byteBuffer.position() + i5;
            this.f7153j = position;
            long limit = i5 + byteBuffer.limit();
            this.f7154k = limit;
            this.f7155l = limit - 10;
            this.f7156m = position;
        }

        private int j2(long j5) {
            return (int) (j5 - this.f7152i);
        }

        static boolean k2() {
            return m4.T();
        }

        private void l2(long j5) {
            this.f7151h.position((int) (j5 - this.f7152i));
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void C1(int i5) throws IOException {
            this.f7151h.putInt((int) (this.f7156m - this.f7152i), i5);
            this.f7156m += 4;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void D1(long j5) throws IOException {
            this.f7151h.putLong((int) (this.f7156m - this.f7152i), j5);
            this.f7156m += 8;
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void J1(int i5) throws IOException {
            if (i5 >= 0) {
                h2(i5);
            } else {
                i2(i5);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void L1(int i5, h2 h2Var) throws IOException {
            g2(i5, 2);
            N1(h2Var);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        void M1(int i5, h2 h2Var, j3 j3Var) throws IOException {
            g2(i5, 2);
            O1(h2Var, j3Var);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void N1(h2 h2Var) throws IOException {
            h2(h2Var.u());
            h2Var.M0(this);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        void O1(h2 h2Var, j3 j3Var) throws IOException {
            h2(((android.content.preferences.protobuf.a) h2Var).R(j3Var));
            j3Var.e(h2Var, this.f7131a);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void P1(int i5, h2 h2Var) throws IOException {
            g2(1, 3);
            b(2, i5);
            L1(3, h2Var);
            g2(1, 4);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void T(byte b6) throws IOException {
            long j5 = this.f7156m;
            if (j5 >= this.f7154k) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f7156m), Long.valueOf(this.f7154k), 1));
            }
            this.f7156m = 1 + j5;
            m4.b0(j5, b6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void U(ByteBuffer byteBuffer) throws IOException {
            try {
                int remaining = byteBuffer.remaining();
                l2(this.f7156m);
                this.f7151h.put(byteBuffer);
                this.f7156m += remaining;
            } catch (BufferOverflowException e6) {
                throw new OutOfSpaceException(e6);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void V(byte[] bArr, int i5, int i6) throws IOException {
            if (bArr != null && i5 >= 0 && i6 >= 0 && bArr.length - i6 >= i5) {
                long j5 = i6;
                long j6 = this.f7154k - j5;
                long j7 = this.f7156m;
                if (j6 >= j7) {
                    m4.o(bArr, i5, j7, j5);
                    this.f7156m += j5;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f7156m), Long.valueOf(this.f7154k), Integer.valueOf(i6)));
            }
            throw new NullPointerException("value");
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream, android.content.preferences.protobuf.u
        public void X(byte[] bArr, int i5, int i6) throws IOException {
            V(bArr, i5, i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void Y1(int i5, w wVar) throws IOException {
            g2(1, 3);
            b(2, i5);
            z(3, wVar);
            g2(1, 4);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void b(int i5, int i6) throws IOException {
            g2(i5, 0);
            h2(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void d(int i5, int i6) throws IOException {
            g2(i5, 5);
            C1(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void e1() {
            this.f7150g.position((int) (this.f7156m - this.f7152i));
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public int f1() {
            return (int) (this.f7156m - this.f7153j);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            long j5 = this.f7156m;
            try {
                int Z0 = CodedOutputStream.Z0(str.length() * 3);
                int Z02 = CodedOutputStream.Z0(str.length());
                if (Z02 == Z0) {
                    int i5 = ((int) (this.f7156m - this.f7152i)) + Z02;
                    this.f7151h.position(i5);
                    n4.j(str, this.f7151h);
                    int position = this.f7151h.position() - i5;
                    h2(position);
                    this.f7156m += position;
                } else {
                    int k5 = n4.k(str);
                    h2(k5);
                    l2(this.f7156m);
                    n4.j(str, this.f7151h);
                    this.f7156m += k5;
                }
            } catch (n4.d e6) {
                this.f7156m = j5;
                l2(j5);
                g1(str, e6);
            } catch (IllegalArgumentException e7) {
                throw new OutOfSpaceException(e7);
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(e8);
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void g2(int i5, int i6) throws IOException {
            h2(q4.c(i5, i6));
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void h2(int i5) throws IOException {
            if (this.f7156m <= this.f7155l) {
                while ((i5 & (-128)) != 0) {
                    long j5 = this.f7156m;
                    this.f7156m = j5 + 1;
                    m4.b0(j5, (byte) ((i5 & 127) | 128));
                    i5 >>>= 7;
                }
                long j6 = this.f7156m;
                this.f7156m = 1 + j6;
                m4.b0(j6, (byte) i5);
                return;
            }
            while (true) {
                long j7 = this.f7156m;
                if (j7 >= this.f7154k) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f7156m), Long.valueOf(this.f7154k), 1));
                }
                if ((i5 & (-128)) == 0) {
                    this.f7156m = 1 + j7;
                    m4.b0(j7, (byte) i5);
                    return;
                } else {
                    this.f7156m = j7 + 1;
                    m4.b0(j7, (byte) ((i5 & 127) | 128));
                    i5 >>>= 7;
                }
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void i(int i5, long j5) throws IOException {
            g2(i5, 1);
            D1(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void i2(long j5) throws IOException {
            if (this.f7156m <= this.f7155l) {
                while ((j5 & (-128)) != 0) {
                    long j6 = this.f7156m;
                    this.f7156m = j6 + 1;
                    m4.b0(j6, (byte) ((((int) j5) & 127) | 128));
                    j5 >>>= 7;
                }
                long j7 = this.f7156m;
                this.f7156m = 1 + j7;
                m4.b0(j7, (byte) j5);
                return;
            }
            while (true) {
                long j8 = this.f7156m;
                if (j8 >= this.f7154k) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f7156m), Long.valueOf(this.f7154k), 1));
                }
                if ((j5 & (-128)) == 0) {
                    this.f7156m = 1 + j8;
                    m4.b0(j8, (byte) j5);
                    return;
                } else {
                    this.f7156m = j8 + 1;
                    m4.b0(j8, (byte) ((((int) j5) & 127) | 128));
                    j5 >>>= 7;
                }
            }
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void o(int i5, String str) throws IOException {
            g2(i5, 2);
            f2(str);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void p(int i5, long j5) throws IOException {
            g2(i5, 0);
            i2(j5);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public int r1() {
            return (int) (this.f7154k - this.f7156m);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void t(int i5, boolean z5) throws IOException {
            g2(i5, 0);
            T(z5 ? (byte) 1 : (byte) 0);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void u1(int i5, byte[] bArr) throws IOException {
            v1(i5, bArr, 0, bArr.length);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void v1(int i5, byte[] bArr, int i6, int i7) throws IOException {
            g2(i5, 2);
            x1(bArr, i6, i7);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void w(int i5, int i6) throws IOException {
            g2(i5, 0);
            J1(i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i5, int i6) throws IOException {
            h2(i6);
            V(bArr, i5, i6);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void y1(int i5, ByteBuffer byteBuffer) throws IOException {
            g2(i5, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void z(int i5, w wVar) throws IOException {
            g2(i5, 2);
            z1(wVar);
        }

        @Override // android.content.preferences.protobuf.CodedOutputStream
        public void z1(w wVar) throws IOException {
            h2(wVar.size());
            wVar.u0(this);
        }
    }

    public static int A0(int i5, s1 s1Var) {
        return B0(3, s1Var) + Y0(2, i5) + (X0(1) * 2);
    }

    public static int B0(int i5, s1 s1Var) {
        return C0(s1Var) + X0(i5);
    }

    public static int C0(s1 s1Var) {
        int f6 = s1Var.f();
        return Z0(f6) + f6;
    }

    static int D0(int i5) {
        return Z0(i5) + i5;
    }

    public static int E0(int i5, h2 h2Var) {
        return F0(3, h2Var) + Y0(2, i5) + (X0(1) * 2);
    }

    public static int F0(int i5, h2 h2Var) {
        return H0(h2Var) + X0(i5);
    }

    static int G0(int i5, h2 h2Var, j3 j3Var) {
        return X0(i5) + I0(h2Var, j3Var);
    }

    public static int H0(h2 h2Var) {
        int u5 = h2Var.u();
        return Z0(u5) + u5;
    }

    static int I0(h2 h2Var, j3 j3Var) {
        int R = ((android.content.preferences.protobuf.a) h2Var).R(j3Var);
        return Z0(R) + R;
    }

    static int J0(int i5) {
        if (i5 > 4096) {
            return 4096;
        }
        return i5;
    }

    public static int K0(int i5, w wVar) {
        return g0(3, wVar) + Y0(2, i5) + (X0(1) * 2);
    }

    @Deprecated
    public static int L0(int i5) {
        return Z0(i5);
    }

    @Deprecated
    public static int M0(long j5) {
        return b1(j5);
    }

    public static int N0(int i5, int i6) {
        return X0(i5) + 4;
    }

    public static int O0(int i5) {
        return 4;
    }

    public static int P0(int i5, long j5) {
        return X0(i5) + 8;
    }

    public static int Q0(long j5) {
        return 8;
    }

    public static int R0(int i5, int i6) {
        return S0(i6) + X0(i5);
    }

    public static int S0(int i5) {
        return Z0((i5 >> 31) ^ (i5 << 1));
    }

    public static int T0(int i5, long j5) {
        return U0(j5) + X0(i5);
    }

    public static int U0(long j5) {
        return b1(d1(j5));
    }

    public static int V0(int i5, String str) {
        return W0(str) + X0(i5);
    }

    public static int W0(String str) {
        int length;
        try {
            length = n4.k(str);
        } catch (n4.d unused) {
            length = str.getBytes(o1.f7439a).length;
        }
        return Z0(length) + length;
    }

    public static int X0(int i5) {
        return Z0(q4.c(i5, 0));
    }

    public static int Y0(int i5, int i6) {
        return Z0(i6) + X0(i5);
    }

    public static int Z0(int i5) {
        if ((i5 & (-128)) == 0) {
            return 1;
        }
        if ((i5 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i5) == 0) {
            return 3;
        }
        return (i5 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int a0(int i5, boolean z5) {
        return X0(i5) + 1;
    }

    public static int a1(int i5, long j5) {
        return b1(j5) + X0(i5);
    }

    public static int b0(boolean z5) {
        return 1;
    }

    public static int b1(long j5) {
        int i5;
        if (((-128) & j5) == 0) {
            return 1;
        }
        if (j5 < 0) {
            return 10;
        }
        if (((-34359738368L) & j5) != 0) {
            j5 >>>= 28;
            i5 = 6;
        } else {
            i5 = 2;
        }
        if (((-2097152) & j5) != 0) {
            i5 += 2;
            j5 >>>= 14;
        }
        return (j5 & (-16384)) != 0 ? i5 + 1 : i5;
    }

    public static int c0(int i5, byte[] bArr) {
        return d0(bArr) + X0(i5);
    }

    public static int c1(int i5) {
        return (i5 >> 31) ^ (i5 << 1);
    }

    public static int d0(byte[] bArr) {
        int length = bArr.length;
        return Z0(length) + length;
    }

    public static long d1(long j5) {
        return (j5 >> 63) ^ (j5 << 1);
    }

    public static int e0(int i5, ByteBuffer byteBuffer) {
        return f0(byteBuffer) + X0(i5);
    }

    public static int f0(ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity();
        return Z0(capacity) + capacity;
    }

    public static int g0(int i5, w wVar) {
        return h0(wVar) + X0(i5);
    }

    public static int h0(w wVar) {
        int size = wVar.size();
        return Z0(size) + size;
    }

    public static int i0(int i5, double d6) {
        return X0(i5) + 8;
    }

    static CodedOutputStream i1(u uVar, int i5) {
        if (i5 >= 0) {
            return new d(uVar, i5);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    public static int j0(double d6) {
        return 8;
    }

    public static CodedOutputStream j1(OutputStream outputStream) {
        return new f(outputStream, 4096);
    }

    public static int k0(int i5, int i6) {
        return x0(i6) + X0(i5);
    }

    public static CodedOutputStream k1(OutputStream outputStream, int i5) {
        return new f(outputStream, i5);
    }

    public static int l0(int i5) {
        return x0(i5);
    }

    public static CodedOutputStream l1(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new e(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return m4.T() ? new h(byteBuffer) : new g(byteBuffer);
    }

    public static int m0(int i5, int i6) {
        return X0(i5) + 4;
    }

    @Deprecated
    public static CodedOutputStream m1(ByteBuffer byteBuffer, int i5) {
        return l1(byteBuffer);
    }

    public static int n0(int i5) {
        return 4;
    }

    public static CodedOutputStream n1(byte[] bArr) {
        return new c(bArr, 0, bArr.length);
    }

    public static int o0(int i5, long j5) {
        return X0(i5) + 8;
    }

    public static CodedOutputStream o1(byte[] bArr, int i5, int i6) {
        return new c(bArr, i5, i6);
    }

    public static int p0(long j5) {
        return 8;
    }

    static CodedOutputStream p1(ByteBuffer byteBuffer) {
        return new g(byteBuffer);
    }

    public static int q0(int i5, float f6) {
        return X0(i5) + 4;
    }

    static CodedOutputStream q1(ByteBuffer byteBuffer) {
        return new h(byteBuffer);
    }

    public static int r0(float f6) {
        return 4;
    }

    @Deprecated
    public static int s0(int i5, h2 h2Var) {
        return h2Var.u() + (X0(i5) * 2);
    }

    @Deprecated
    static int t0(int i5, h2 h2Var, j3 j3Var) {
        return (X0(i5) * 2) + v0(h2Var, j3Var);
    }

    @Deprecated
    public static int u0(h2 h2Var) {
        return h2Var.u();
    }

    @Deprecated
    static int v0(h2 h2Var, j3 j3Var) {
        return ((android.content.preferences.protobuf.a) h2Var).R(j3Var);
    }

    public static int w0(int i5, int i6) {
        return x0(i6) + X0(i5);
    }

    public static int x0(int i5) {
        if (i5 >= 0) {
            return Z0(i5);
        }
        return 10;
    }

    public static int y0(int i5, long j5) {
        return b1(j5) + X0(i5);
    }

    public static int z0(long j5) {
        return b1(j5);
    }

    public final void A(int i5, long j5) throws IOException {
        i(i5, j5);
    }

    public final void A1(double d6) throws IOException {
        D1(Double.doubleToRawLongBits(d6));
    }

    public final void B1(int i5) throws IOException {
        J1(i5);
    }

    public abstract void C1(int i5) throws IOException;

    public abstract void D1(long j5) throws IOException;

    public final void E1(float f6) throws IOException {
        C1(Float.floatToRawIntBits(f6));
    }

    @Deprecated
    public final void F1(int i5, h2 h2Var) throws IOException {
        g2(i5, 3);
        H1(h2Var);
        g2(i5, 4);
    }

    @Deprecated
    final void G1(int i5, h2 h2Var, j3 j3Var) throws IOException {
        g2(i5, 3);
        I1(h2Var, j3Var);
        g2(i5, 4);
    }

    public final void H(int i5, long j5) throws IOException {
        p(i5, d1(j5));
    }

    @Deprecated
    public final void H1(h2 h2Var) throws IOException {
        h2Var.M0(this);
    }

    public final void I(int i5, float f6) throws IOException {
        d(i5, Float.floatToRawIntBits(f6));
    }

    @Deprecated
    final void I1(h2 h2Var, j3 j3Var) throws IOException {
        j3Var.e(h2Var, this.f7131a);
    }

    public abstract void J1(int i5) throws IOException;

    public final void K1(long j5) throws IOException {
        i2(j5);
    }

    public final void L(int i5, int i6) throws IOException {
        w(i5, i6);
    }

    public abstract void L1(int i5, h2 h2Var) throws IOException;

    abstract void M1(int i5, h2 h2Var, j3 j3Var) throws IOException;

    public abstract void N1(h2 h2Var) throws IOException;

    abstract void O1(h2 h2Var, j3 j3Var) throws IOException;

    public abstract void P1(int i5, h2 h2Var) throws IOException;

    public final void Q(int i5, int i6) throws IOException {
        b(i5, (i6 >> 31) ^ (i6 << 1));
    }

    public final void Q1(byte b6) throws IOException {
        T(b6);
    }

    public final void R1(int i5) throws IOException {
        T((byte) i5);
    }

    public final void S1(w wVar) throws IOException {
        wVar.u0(this);
    }

    @Override // android.content.preferences.protobuf.u
    public abstract void T(byte b6) throws IOException;

    public abstract void T1(ByteBuffer byteBuffer) throws IOException;

    @Override // android.content.preferences.protobuf.u
    public abstract void U(ByteBuffer byteBuffer) throws IOException;

    public final void U1(byte[] bArr) throws IOException {
        V(bArr, 0, bArr.length);
    }

    @Override // android.content.preferences.protobuf.u
    public abstract void V(byte[] bArr, int i5, int i6) throws IOException;

    public final void V1(byte[] bArr, int i5, int i6) throws IOException {
        V(bArr, i5, i6);
    }

    @Override // android.content.preferences.protobuf.u
    public abstract void W(ByteBuffer byteBuffer) throws IOException;

    @Deprecated
    public final void W1(int i5) throws IOException {
        C1(i5);
    }

    @Override // android.content.preferences.protobuf.u
    public abstract void X(byte[] bArr, int i5, int i6) throws IOException;

    @Deprecated
    public final void X1(long j5) throws IOException {
        D1(j5);
    }

    public abstract void Y1(int i5, w wVar) throws IOException;

    public final void Z() {
        if (r1() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public final void Z1(int i5) throws IOException {
        h2(i5);
    }

    @Deprecated
    public final void a2(long j5) throws IOException {
        i2(j5);
    }

    public abstract void b(int i5, int i6) throws IOException;

    public final void b2(int i5) throws IOException {
        C1(i5);
    }

    public final void c2(long j5) throws IOException {
        D1(j5);
    }

    public abstract void d(int i5, int i6) throws IOException;

    public final void d2(int i5) throws IOException {
        h2((i5 >> 31) ^ (i5 << 1));
    }

    public final void e(int i5, double d6) throws IOException {
        i(i5, Double.doubleToRawLongBits(d6));
    }

    public abstract void e1() throws IOException;

    public final void e2(long j5) throws IOException {
        i2(d1(j5));
    }

    public abstract int f1();

    public abstract void f2(String str) throws IOException;

    final void g1(String str, n4.d dVar) throws IOException {
        f7127c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(o1.f7439a);
        try {
            h2(bytes.length);
            X(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e6) {
            throw e6;
        } catch (IndexOutOfBoundsException e7) {
            throw new OutOfSpaceException(e7);
        }
    }

    public abstract void g2(int i5, int i6) throws IOException;

    boolean h1() {
        return this.f7132b;
    }

    public abstract void h2(int i5) throws IOException;

    public abstract void i(int i5, long j5) throws IOException;

    public abstract void i2(long j5) throws IOException;

    public abstract void o(int i5, String str) throws IOException;

    public abstract void p(int i5, long j5) throws IOException;

    public abstract int r1();

    public final void s(int i5, long j5) throws IOException {
        p(i5, j5);
    }

    public void s1() {
        this.f7132b = true;
    }

    public abstract void t(int i5, boolean z5) throws IOException;

    public final void t1(boolean z5) throws IOException {
        T(z5 ? (byte) 1 : (byte) 0);
    }

    public final void u(int i5, int i6) throws IOException {
        d(i5, i6);
    }

    public abstract void u1(int i5, byte[] bArr) throws IOException;

    public abstract void v1(int i5, byte[] bArr, int i6, int i7) throws IOException;

    public abstract void w(int i5, int i6) throws IOException;

    public final void w1(byte[] bArr) throws IOException {
        x1(bArr, 0, bArr.length);
    }

    abstract void x1(byte[] bArr, int i5, int i6) throws IOException;

    public abstract void y1(int i5, ByteBuffer byteBuffer) throws IOException;

    public abstract void z(int i5, w wVar) throws IOException;

    public abstract void z1(w wVar) throws IOException;

    private CodedOutputStream() {
    }

    /* loaded from: classes.dex */
    public static class OutOfSpaceException extends IOException {

        /* renamed from: o, reason: collision with root package name */
        private static final long f7133o = -6947486886997889499L;

        /* renamed from: p, reason: collision with root package name */
        private static final String f7134p = "CodedOutputStream was writing to a flat byte array and ran out of space.";

        OutOfSpaceException(String str) {
            super(androidx.constraintlayout.motion.widget.g.a("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        OutOfSpaceException(String str, Throwable th) {
            super(androidx.constraintlayout.motion.widget.g.a("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }
}
