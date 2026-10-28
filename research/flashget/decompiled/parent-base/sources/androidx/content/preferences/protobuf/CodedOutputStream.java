package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.q4;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class CodedOutputStream extends v {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f28581c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f28582d = p4.S();

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f28583e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f28584f = 4096;

    /* renamed from: a, reason: collision with root package name */
    b0 f28585a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28586b;

    public static class OutOfSpaceException extends IOException {

        /* renamed from: b, reason: collision with root package name */
        private static final long f28587b = -6947486886997889499L;

        /* renamed from: c, reason: collision with root package name */
        private static final String f28588c = "CodedOutputStream was writing to a flat byte array and ran out of space.";

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(String str) {
            super(androidx.constraintlayout.core.motion.key.c.a("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super(androidx.constraintlayout.core.motion.key.c.a("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    private static abstract class b extends CodedOutputStream {

        /* renamed from: g, reason: collision with root package name */
        final byte[] f28589g;

        /* renamed from: h, reason: collision with root package name */
        final int f28590h;

        /* renamed from: i, reason: collision with root package name */
        int f28591i;

        /* renamed from: j, reason: collision with root package name */
        int f28592j;

        b(int i4) {
            super();
            if (i4 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i4, 20)];
            this.f28589g = bArr;
            this.f28590h = bArr.length;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int f1() {
            return this.f28592j;
        }

        final void j2(byte b5) {
            byte[] bArr = this.f28589g;
            int i4 = this.f28591i;
            this.f28591i = i4 + 1;
            bArr[i4] = b5;
            this.f28592j++;
        }

        final void k2(int i4) {
            byte[] bArr = this.f28589g;
            int i5 = this.f28591i;
            int i6 = i5 + 1;
            this.f28591i = i6;
            bArr[i5] = (byte) (i4 & 255);
            int i7 = i5 + 2;
            this.f28591i = i7;
            bArr[i6] = (byte) ((i4 >> 8) & 255);
            int i10 = i5 + 3;
            this.f28591i = i10;
            bArr[i7] = (byte) ((i4 >> 16) & 255);
            this.f28591i = i5 + 4;
            bArr[i10] = (byte) ((i4 >> 24) & 255);
            this.f28592j += 4;
        }

        final void l2(long j4) {
            byte[] bArr = this.f28589g;
            int i4 = this.f28591i;
            int i5 = i4 + 1;
            this.f28591i = i5;
            bArr[i4] = (byte) (j4 & 255);
            int i6 = i4 + 2;
            this.f28591i = i6;
            bArr[i5] = (byte) ((j4 >> 8) & 255);
            int i7 = i4 + 3;
            this.f28591i = i7;
            bArr[i6] = (byte) ((j4 >> 16) & 255);
            int i10 = i4 + 4;
            this.f28591i = i10;
            bArr[i7] = (byte) (255 & (j4 >> 24));
            int i11 = i4 + 5;
            this.f28591i = i11;
            bArr[i10] = (byte) (((int) (j4 >> 32)) & 255);
            int i12 = i4 + 6;
            this.f28591i = i12;
            bArr[i11] = (byte) (((int) (j4 >> 40)) & 255);
            int i13 = i4 + 7;
            this.f28591i = i13;
            bArr[i12] = (byte) (((int) (j4 >> 48)) & 255);
            this.f28591i = i4 + 8;
            bArr[i13] = (byte) (((int) (j4 >> 56)) & 255);
            this.f28592j += 8;
        }

        final void m2(int i4) {
            if (i4 >= 0) {
                o2(i4);
            } else {
                p2(i4);
            }
        }

        final void n2(int i4, int i5) {
            o2(t4.c(i4, i5));
        }

        final void o2(int i4) {
            if (!CodedOutputStream.f28582d) {
                while ((i4 & (-128)) != 0) {
                    byte[] bArr = this.f28589g;
                    int i5 = this.f28591i;
                    this.f28591i = i5 + 1;
                    bArr[i5] = (byte) ((i4 & 127) | 128);
                    this.f28592j++;
                    i4 >>>= 7;
                }
                byte[] bArr2 = this.f28589g;
                int i6 = this.f28591i;
                this.f28591i = i6 + 1;
                bArr2[i6] = (byte) i4;
                this.f28592j++;
                return;
            }
            long j4 = this.f28591i;
            while ((i4 & (-128)) != 0) {
                byte[] bArr3 = this.f28589g;
                int i7 = this.f28591i;
                this.f28591i = i7 + 1;
                p4.d0(bArr3, i7, (byte) ((i4 & 127) | 128));
                i4 >>>= 7;
            }
            byte[] bArr4 = this.f28589g;
            int i10 = this.f28591i;
            this.f28591i = i10 + 1;
            p4.d0(bArr4, i10, (byte) i4);
            this.f28592j += (int) (this.f28591i - j4);
        }

        final void p2(long j4) {
            if (!CodedOutputStream.f28582d) {
                while ((j4 & (-128)) != 0) {
                    byte[] bArr = this.f28589g;
                    int i4 = this.f28591i;
                    this.f28591i = i4 + 1;
                    bArr[i4] = (byte) ((((int) j4) & 127) | 128);
                    this.f28592j++;
                    j4 >>>= 7;
                }
                byte[] bArr2 = this.f28589g;
                int i5 = this.f28591i;
                this.f28591i = i5 + 1;
                bArr2[i5] = (byte) j4;
                this.f28592j++;
                return;
            }
            long j5 = this.f28591i;
            while ((j4 & (-128)) != 0) {
                byte[] bArr3 = this.f28589g;
                int i6 = this.f28591i;
                this.f28591i = i6 + 1;
                p4.d0(bArr3, i6, (byte) ((((int) j4) & 127) | 128));
                j4 >>>= 7;
            }
            byte[] bArr4 = this.f28589g;
            int i7 = this.f28591i;
            this.f28591i = i7 + 1;
            p4.d0(bArr4, i7, (byte) j4);
            this.f28592j += (int) (this.f28591i - j5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int r1() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends CodedOutputStream {

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f28593g;

        /* renamed from: h, reason: collision with root package name */
        private final int f28594h;

        /* renamed from: i, reason: collision with root package name */
        private final int f28595i;

        /* renamed from: j, reason: collision with root package name */
        private int f28596j;

        c(byte[] bArr, int i4, int i5) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i6 = i4 + i5;
            if ((i4 | i5 | (bArr.length - i6)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            this.f28593g = bArr;
            this.f28594h = i4;
            this.f28596j = i4;
            this.f28595i = i6;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void C1(int i4) throws IOException {
            try {
                byte[] bArr = this.f28593g;
                int i5 = this.f28596j;
                int i6 = i5 + 1;
                this.f28596j = i6;
                bArr[i5] = (byte) (i4 & 255);
                int i7 = i5 + 2;
                this.f28596j = i7;
                bArr[i6] = (byte) ((i4 >> 8) & 255);
                int i10 = i5 + 3;
                this.f28596j = i10;
                bArr[i7] = (byte) ((i4 >> 16) & 255);
                this.f28596j = i5 + 4;
                bArr[i10] = (byte) ((i4 >> 24) & 255);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28596j), Integer.valueOf(this.f28595i), 1), e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void D1(long j4) throws IOException {
            try {
                byte[] bArr = this.f28593g;
                int i4 = this.f28596j;
                int i5 = i4 + 1;
                this.f28596j = i5;
                bArr[i4] = (byte) (((int) j4) & 255);
                int i6 = i4 + 2;
                this.f28596j = i6;
                bArr[i5] = (byte) (((int) (j4 >> 8)) & 255);
                int i7 = i4 + 3;
                this.f28596j = i7;
                bArr[i6] = (byte) (((int) (j4 >> 16)) & 255);
                int i10 = i4 + 4;
                this.f28596j = i10;
                bArr[i7] = (byte) (((int) (j4 >> 24)) & 255);
                int i11 = i4 + 5;
                this.f28596j = i11;
                bArr[i10] = (byte) (((int) (j4 >> 32)) & 255);
                int i12 = i4 + 6;
                this.f28596j = i12;
                bArr[i11] = (byte) (((int) (j4 >> 40)) & 255);
                int i13 = i4 + 7;
                this.f28596j = i13;
                bArr[i12] = (byte) (((int) (j4 >> 48)) & 255);
                this.f28596j = i4 + 8;
                bArr[i13] = (byte) (((int) (j4 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28596j), Integer.valueOf(this.f28595i), 1), e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void E(int i4, boolean z4) throws IOException {
            g2(i4, 0);
            T(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void J1(int i4) throws IOException {
            if (i4 >= 0) {
                h2(i4);
            } else {
                i2(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void L1(int i4, i2 i2Var) throws IOException {
            g2(i4, 2);
            N1(i2Var);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        final void M1(int i4, i2 i2Var, m3 m3Var) throws IOException {
            g2(i4, 2);
            h2(((androidx.content.preferences.protobuf.a) i2Var).r0(m3Var));
            m3Var.h(i2Var, this.f28585a);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void N1(i2 i2Var) throws IOException {
            h2(i2Var.t());
            i2Var.c1(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        final void O1(i2 i2Var, m3 m3Var) throws IOException {
            h2(((androidx.content.preferences.protobuf.a) i2Var).r0(m3Var));
            m3Var.h(i2Var, this.f28585a);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void P1(int i4, i2 i2Var) throws IOException {
            g2(1, 3);
            u(2, i4);
            L1(3, i2Var);
            g2(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public final void T(byte b5) throws IOException {
            try {
                byte[] bArr = this.f28593g;
                int i4 = this.f28596j;
                this.f28596j = i4 + 1;
                bArr[i4] = b5;
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28596j), Integer.valueOf(this.f28595i), 1), e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public final void U(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f28593g, this.f28596j, remaining);
                this.f28596j += remaining;
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28596j), Integer.valueOf(this.f28595i), Integer.valueOf(remaining)), e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public final void V(byte[] bArr, int i4, int i5) throws IOException {
            try {
                System.arraycopy(bArr, i4, this.f28593g, this.f28596j, i5);
                this.f28596j += i5;
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28596j), Integer.valueOf(this.f28595i), Integer.valueOf(i5)), e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public final void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public final void X(byte[] bArr, int i4, int i5) throws IOException {
            V(bArr, i4, i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void Y1(int i4, w wVar) throws IOException {
            g2(1, 3);
            u(2, i4);
            k(3, wVar);
            g2(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void c(int i4, int i5) throws IOException {
            g2(i4, 5);
            C1(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void e1() {
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int f1() {
            return this.f28596j - this.f28594h;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void f2(String str) throws IOException {
            int i4 = this.f28596j;
            try {
                int Z0 = CodedOutputStream.Z0(str.length() * 3);
                int Z02 = CodedOutputStream.Z0(str.length());
                if (Z02 == Z0) {
                    int i5 = i4 + Z02;
                    this.f28596j = i5;
                    int i6 = q4.i(str, this.f28593g, i5, r1());
                    this.f28596j = i4;
                    h2((i6 - i4) - Z02);
                    this.f28596j = i6;
                } else {
                    h2(q4.k(str));
                    this.f28596j = q4.i(str, this.f28593g, this.f28596j, r1());
                }
            } catch (q4.d e4) {
                this.f28596j = i4;
                g1(str, e4);
            } catch (IndexOutOfBoundsException e5) {
                throw new OutOfSpaceException(e5);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void g(int i4, String str) throws IOException {
            g2(i4, 2);
            f2(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void g2(int i4, int i5) throws IOException {
            h2(t4.c(i4, i5));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void h(int i4, long j4) throws IOException {
            g2(i4, 0);
            i2(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void h2(int i4) throws IOException {
            if (!CodedOutputStream.f28582d || androidx.content.preferences.protobuf.e.c() || r1() < 5) {
                while ((i4 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f28593g;
                        int i5 = this.f28596j;
                        this.f28596j = i5 + 1;
                        bArr[i5] = (byte) ((i4 & 127) | 128);
                        i4 >>>= 7;
                    } catch (IndexOutOfBoundsException e4) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28596j), Integer.valueOf(this.f28595i), 1), e4);
                    }
                }
                byte[] bArr2 = this.f28593g;
                int i6 = this.f28596j;
                this.f28596j = i6 + 1;
                bArr2[i6] = (byte) i4;
                return;
            }
            if ((i4 & (-128)) == 0) {
                byte[] bArr3 = this.f28593g;
                int i7 = this.f28596j;
                this.f28596j = i7 + 1;
                p4.d0(bArr3, i7, (byte) i4);
                return;
            }
            byte[] bArr4 = this.f28593g;
            int i10 = this.f28596j;
            this.f28596j = i10 + 1;
            p4.d0(bArr4, i10, (byte) (i4 | 128));
            int i11 = i4 >>> 7;
            if ((i11 & (-128)) == 0) {
                byte[] bArr5 = this.f28593g;
                int i12 = this.f28596j;
                this.f28596j = i12 + 1;
                p4.d0(bArr5, i12, (byte) i11);
                return;
            }
            byte[] bArr6 = this.f28593g;
            int i13 = this.f28596j;
            this.f28596j = i13 + 1;
            p4.d0(bArr6, i13, (byte) (i11 | 128));
            int i14 = i4 >>> 14;
            if ((i14 & (-128)) == 0) {
                byte[] bArr7 = this.f28593g;
                int i15 = this.f28596j;
                this.f28596j = i15 + 1;
                p4.d0(bArr7, i15, (byte) i14);
                return;
            }
            byte[] bArr8 = this.f28593g;
            int i16 = this.f28596j;
            this.f28596j = i16 + 1;
            p4.d0(bArr8, i16, (byte) (i14 | 128));
            int i17 = i4 >>> 21;
            if ((i17 & (-128)) == 0) {
                byte[] bArr9 = this.f28593g;
                int i18 = this.f28596j;
                this.f28596j = i18 + 1;
                p4.d0(bArr9, i18, (byte) i17);
                return;
            }
            byte[] bArr10 = this.f28593g;
            int i19 = this.f28596j;
            this.f28596j = i19 + 1;
            p4.d0(bArr10, i19, (byte) (i17 | 128));
            byte[] bArr11 = this.f28593g;
            int i20 = this.f28596j;
            this.f28596j = i20 + 1;
            p4.d0(bArr11, i20, (byte) (i4 >>> 28));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void i2(long j4) throws IOException {
            if (CodedOutputStream.f28582d && r1() >= 10) {
                while ((j4 & (-128)) != 0) {
                    byte[] bArr = this.f28593g;
                    int i4 = this.f28596j;
                    this.f28596j = i4 + 1;
                    p4.d0(bArr, i4, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
                byte[] bArr2 = this.f28593g;
                int i5 = this.f28596j;
                this.f28596j = i5 + 1;
                p4.d0(bArr2, i5, (byte) j4);
                return;
            }
            while ((j4 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f28593g;
                    int i6 = this.f28596j;
                    this.f28596j = i6 + 1;
                    bArr3[i6] = (byte) ((((int) j4) & 127) | 128);
                    j4 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28596j), Integer.valueOf(this.f28595i), 1), e4);
                }
            }
            byte[] bArr4 = this.f28593g;
            int i7 = this.f28596j;
            this.f28596j = i7 + 1;
            bArr4[i7] = (byte) j4;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void j(int i4, int i5) throws IOException {
            g2(i4, 0);
            J1(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void k(int i4, w wVar) throws IOException {
            g2(i4, 2);
            z1(wVar);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int r1() {
            return this.f28595i - this.f28596j;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void u(int i4, int i5) throws IOException {
            g2(i4, 0);
            h2(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void u1(int i4, byte[] bArr) throws IOException {
            v1(i4, bArr, 0, bArr.length);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void v1(int i4, byte[] bArr, int i5, int i6) throws IOException {
            g2(i4, 2);
            x1(bArr, i5, i6);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void x1(byte[] bArr, int i4, int i5) throws IOException {
            h2(i5);
            V(bArr, i4, i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void y(int i4, long j4) throws IOException {
            g2(i4, 1);
            D1(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void y1(int i4, ByteBuffer byteBuffer) throws IOException {
            g2(i4, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void z1(w wVar) throws IOException {
            h2(wVar.size());
            wVar.t0(this);
        }
    }

    private static final class d extends b {

        /* renamed from: k, reason: collision with root package name */
        private final v f28597k;

        d(v vVar, int i4) {
            super(i4);
            if (vVar == null) {
                throw new NullPointerException("out");
            }
            this.f28597k = vVar;
        }

        private void q2() throws IOException {
            this.f28597k.V(this.f28589g, 0, this.f28591i);
            this.f28591i = 0;
        }

        private void r2(int i4) throws IOException {
            if (this.f28590h - this.f28591i < i4) {
                q2();
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void C1(int i4) throws IOException {
            r2(4);
            k2(i4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void D1(long j4) throws IOException {
            r2(8);
            l2(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void E(int i4, boolean z4) throws IOException {
            r2(11);
            n2(i4, 0);
            j2(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void J1(int i4) throws IOException {
            if (i4 >= 0) {
                h2(i4);
            } else {
                i2(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void L1(int i4, i2 i2Var) throws IOException {
            g2(i4, 2);
            N1(i2Var);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        void M1(int i4, i2 i2Var, m3 m3Var) throws IOException {
            g2(i4, 2);
            O1(i2Var, m3Var);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void N1(i2 i2Var) throws IOException {
            h2(i2Var.t());
            i2Var.c1(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        void O1(i2 i2Var, m3 m3Var) throws IOException {
            h2(((androidx.content.preferences.protobuf.a) i2Var).r0(m3Var));
            m3Var.h(i2Var, this.f28585a);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void P1(int i4, i2 i2Var) throws IOException {
            g2(1, 3);
            u(2, i4);
            L1(3, i2Var);
            g2(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void T(byte b5) throws IOException {
            if (this.f28591i == this.f28590h) {
                q2();
            }
            j2(b5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void U(ByteBuffer byteBuffer) throws IOException {
            e1();
            int remaining = byteBuffer.remaining();
            this.f28597k.U(byteBuffer);
            this.f28592j += remaining;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void V(byte[] bArr, int i4, int i5) throws IOException {
            e1();
            this.f28597k.V(bArr, i4, i5);
            this.f28592j += i5;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void W(ByteBuffer byteBuffer) throws IOException {
            e1();
            int remaining = byteBuffer.remaining();
            this.f28597k.W(byteBuffer);
            this.f28592j += remaining;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void X(byte[] bArr, int i4, int i5) throws IOException {
            e1();
            this.f28597k.X(bArr, i4, i5);
            this.f28592j += i5;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void Y1(int i4, w wVar) throws IOException {
            g2(1, 3);
            u(2, i4);
            k(3, wVar);
            g2(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void c(int i4, int i5) throws IOException {
            r2(14);
            n2(i4, 5);
            k2(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void e1() throws IOException {
            if (this.f28591i > 0) {
                q2();
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            int length = str.length() * 3;
            int Z0 = CodedOutputStream.Z0(length);
            int i4 = Z0 + length;
            int i5 = this.f28590h;
            if (i4 > i5) {
                byte[] bArr = new byte[length];
                int i6 = q4.i(str, bArr, 0, length);
                h2(i6);
                X(bArr, 0, i6);
                return;
            }
            if (i4 > i5 - this.f28591i) {
                q2();
            }
            int i7 = this.f28591i;
            try {
                int Z02 = CodedOutputStream.Z0(str.length());
                if (Z02 == Z0) {
                    int i10 = i7 + Z02;
                    this.f28591i = i10;
                    int i11 = q4.i(str, this.f28589g, i10, this.f28590h - i10);
                    this.f28591i = i7;
                    int i12 = (i11 - i7) - Z02;
                    o2(i12);
                    this.f28591i = i11;
                    this.f28592j += i12;
                } else {
                    int k4 = q4.k(str);
                    o2(k4);
                    this.f28591i = q4.i(str, this.f28589g, this.f28591i, k4);
                    this.f28592j += k4;
                }
            } catch (q4.d e4) {
                this.f28592j -= this.f28591i - i7;
                this.f28591i = i7;
                g1(str, e4);
            } catch (IndexOutOfBoundsException e5) {
                throw new OutOfSpaceException(e5);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void g(int i4, String str) throws IOException {
            g2(i4, 2);
            f2(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void g2(int i4, int i5) throws IOException {
            h2(t4.c(i4, i5));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void h(int i4, long j4) throws IOException {
            r2(20);
            n2(i4, 0);
            p2(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void h2(int i4) throws IOException {
            r2(5);
            o2(i4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void i2(long j4) throws IOException {
            r2(10);
            p2(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void j(int i4, int i5) throws IOException {
            r2(20);
            n2(i4, 0);
            m2(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void k(int i4, w wVar) throws IOException {
            g2(i4, 2);
            z1(wVar);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void u(int i4, int i5) throws IOException {
            r2(20);
            n2(i4, 0);
            o2(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void u1(int i4, byte[] bArr) throws IOException {
            v1(i4, bArr, 0, bArr.length);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void v1(int i4, byte[] bArr, int i5, int i6) throws IOException {
            g2(i4, 2);
            x1(bArr, i5, i6);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i4, int i5) throws IOException {
            h2(i5);
            V(bArr, i4, i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void y(int i4, long j4) throws IOException {
            r2(18);
            n2(i4, 1);
            l2(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void y1(int i4, ByteBuffer byteBuffer) throws IOException {
            g2(i4, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void z1(w wVar) throws IOException {
            h2(wVar.size());
            wVar.t0(this);
        }
    }

    private static final class e extends c {

        /* renamed from: k, reason: collision with root package name */
        private final ByteBuffer f28598k;

        /* renamed from: l, reason: collision with root package name */
        private int f28599l;

        e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            this.f28598k = byteBuffer;
            this.f28599l = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.c, androidx.content.preferences.protobuf.CodedOutputStream
        public void e1() {
            this.f28598k.position(this.f28599l + f1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f extends b {

        /* renamed from: k, reason: collision with root package name */
        private final OutputStream f28600k;

        f(OutputStream outputStream, int i4) {
            super(i4);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f28600k = outputStream;
        }

        private void q2() throws IOException {
            this.f28600k.write(this.f28589g, 0, this.f28591i);
            this.f28591i = 0;
        }

        private void r2(int i4) throws IOException {
            if (this.f28590h - this.f28591i < i4) {
                q2();
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void C1(int i4) throws IOException {
            r2(4);
            k2(i4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void D1(long j4) throws IOException {
            r2(8);
            l2(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void E(int i4, boolean z4) throws IOException {
            r2(11);
            n2(i4, 0);
            j2(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void J1(int i4) throws IOException {
            if (i4 >= 0) {
                h2(i4);
            } else {
                i2(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void L1(int i4, i2 i2Var) throws IOException {
            g2(i4, 2);
            N1(i2Var);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        void M1(int i4, i2 i2Var, m3 m3Var) throws IOException {
            g2(i4, 2);
            O1(i2Var, m3Var);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void N1(i2 i2Var) throws IOException {
            h2(i2Var.t());
            i2Var.c1(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        void O1(i2 i2Var, m3 m3Var) throws IOException {
            h2(((androidx.content.preferences.protobuf.a) i2Var).r0(m3Var));
            m3Var.h(i2Var, this.f28585a);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void P1(int i4, i2 i2Var) throws IOException {
            g2(1, 3);
            u(2, i4);
            L1(3, i2Var);
            g2(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void T(byte b5) throws IOException {
            if (this.f28591i == this.f28590h) {
                q2();
            }
            j2(b5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void U(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i4 = this.f28590h;
            int i5 = this.f28591i;
            if (i4 - i5 >= remaining) {
                byteBuffer.get(this.f28589g, i5, remaining);
                this.f28591i += remaining;
                this.f28592j += remaining;
                return;
            }
            int i6 = i4 - i5;
            byteBuffer.get(this.f28589g, i5, i6);
            int i7 = remaining - i6;
            this.f28591i = this.f28590h;
            this.f28592j += i6;
            q2();
            while (true) {
                int i10 = this.f28590h;
                if (i7 <= i10) {
                    byteBuffer.get(this.f28589g, 0, i7);
                    this.f28591i = i7;
                    this.f28592j += i7;
                    return;
                } else {
                    byteBuffer.get(this.f28589g, 0, i10);
                    this.f28600k.write(this.f28589g, 0, this.f28590h);
                    int i11 = this.f28590h;
                    i7 -= i11;
                    this.f28592j += i11;
                }
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void V(byte[] bArr, int i4, int i5) throws IOException {
            int i6 = this.f28590h;
            int i7 = this.f28591i;
            if (i6 - i7 >= i5) {
                System.arraycopy(bArr, i4, this.f28589g, i7, i5);
                this.f28591i += i5;
                this.f28592j += i5;
                return;
            }
            int i10 = i6 - i7;
            System.arraycopy(bArr, i4, this.f28589g, i7, i10);
            int i11 = i4 + i10;
            int i12 = i5 - i10;
            this.f28591i = this.f28590h;
            this.f28592j += i10;
            q2();
            if (i12 <= this.f28590h) {
                System.arraycopy(bArr, i11, this.f28589g, 0, i12);
                this.f28591i = i12;
            } else {
                this.f28600k.write(bArr, i11, i12);
            }
            this.f28592j += i12;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void X(byte[] bArr, int i4, int i5) throws IOException {
            V(bArr, i4, i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void Y1(int i4, w wVar) throws IOException {
            g2(1, 3);
            u(2, i4);
            k(3, wVar);
            g2(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void c(int i4, int i5) throws IOException {
            r2(14);
            n2(i4, 5);
            k2(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void e1() throws IOException {
            if (this.f28591i > 0) {
                q2();
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            int k4;
            try {
                int length = str.length() * 3;
                int Z0 = CodedOutputStream.Z0(length);
                int i4 = Z0 + length;
                int i5 = this.f28590h;
                if (i4 > i5) {
                    byte[] bArr = new byte[length];
                    int i6 = q4.i(str, bArr, 0, length);
                    h2(i6);
                    V(bArr, 0, i6);
                    return;
                }
                if (i4 > i5 - this.f28591i) {
                    q2();
                }
                int Z02 = CodedOutputStream.Z0(str.length());
                int i7 = this.f28591i;
                try {
                    if (Z02 == Z0) {
                        int i10 = i7 + Z02;
                        this.f28591i = i10;
                        int i11 = q4.i(str, this.f28589g, i10, this.f28590h - i10);
                        this.f28591i = i7;
                        k4 = (i11 - i7) - Z02;
                        o2(k4);
                        this.f28591i = i11;
                    } else {
                        k4 = q4.k(str);
                        o2(k4);
                        this.f28591i = q4.i(str, this.f28589g, this.f28591i, k4);
                    }
                    this.f28592j += k4;
                } catch (q4.d e4) {
                    this.f28592j -= this.f28591i - i7;
                    this.f28591i = i7;
                    throw e4;
                } catch (ArrayIndexOutOfBoundsException e5) {
                    throw new OutOfSpaceException(e5);
                }
            } catch (q4.d e6) {
                g1(str, e6);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void g(int i4, String str) throws IOException {
            g2(i4, 2);
            f2(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void g2(int i4, int i5) throws IOException {
            h2(t4.c(i4, i5));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void h(int i4, long j4) throws IOException {
            r2(20);
            n2(i4, 0);
            p2(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void h2(int i4) throws IOException {
            r2(5);
            o2(i4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void i2(long j4) throws IOException {
            r2(10);
            p2(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void j(int i4, int i5) throws IOException {
            r2(20);
            n2(i4, 0);
            m2(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void k(int i4, w wVar) throws IOException {
            g2(i4, 2);
            z1(wVar);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void u(int i4, int i5) throws IOException {
            r2(20);
            n2(i4, 0);
            o2(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void u1(int i4, byte[] bArr) throws IOException {
            v1(i4, bArr, 0, bArr.length);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void v1(int i4, byte[] bArr, int i5, int i6) throws IOException {
            g2(i4, 2);
            x1(bArr, i5, i6);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i4, int i5) throws IOException {
            h2(i5);
            V(bArr, i4, i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void y(int i4, long j4) throws IOException {
            r2(18);
            n2(i4, 1);
            l2(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void y1(int i4, ByteBuffer byteBuffer) throws IOException {
            g2(i4, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void z1(w wVar) throws IOException {
            h2(wVar.size());
            wVar.t0(this);
        }
    }

    private static final class g extends CodedOutputStream {

        /* renamed from: g, reason: collision with root package name */
        private final ByteBuffer f28601g;

        /* renamed from: h, reason: collision with root package name */
        private final ByteBuffer f28602h;

        /* renamed from: i, reason: collision with root package name */
        private final int f28603i;

        g(ByteBuffer byteBuffer) {
            super();
            this.f28601g = byteBuffer;
            this.f28602h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f28603i = byteBuffer.position();
        }

        private void j2(String str) throws IOException {
            try {
                q4.j(str, this.f28602h);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void C1(int i4) throws IOException {
            try {
                this.f28602h.putInt(i4);
            } catch (BufferOverflowException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void D1(long j4) throws IOException {
            try {
                this.f28602h.putLong(j4);
            } catch (BufferOverflowException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void E(int i4, boolean z4) throws IOException {
            g2(i4, 0);
            T(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void J1(int i4) throws IOException {
            if (i4 >= 0) {
                h2(i4);
            } else {
                i2(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void L1(int i4, i2 i2Var) throws IOException {
            g2(i4, 2);
            N1(i2Var);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        void M1(int i4, i2 i2Var, m3 m3Var) throws IOException {
            g2(i4, 2);
            O1(i2Var, m3Var);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void N1(i2 i2Var) throws IOException {
            h2(i2Var.t());
            i2Var.c1(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        void O1(i2 i2Var, m3 m3Var) throws IOException {
            h2(((androidx.content.preferences.protobuf.a) i2Var).r0(m3Var));
            m3Var.h(i2Var, this.f28585a);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void P1(int i4, i2 i2Var) throws IOException {
            g2(1, 3);
            u(2, i4);
            L1(3, i2Var);
            g2(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void T(byte b5) throws IOException {
            try {
                this.f28602h.put(b5);
            } catch (BufferOverflowException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void U(ByteBuffer byteBuffer) throws IOException {
            try {
                this.f28602h.put(byteBuffer);
            } catch (BufferOverflowException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void V(byte[] bArr, int i4, int i5) throws IOException {
            try {
                this.f28602h.put(bArr, i4, i5);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(e4);
            } catch (BufferOverflowException e5) {
                throw new OutOfSpaceException(e5);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void X(byte[] bArr, int i4, int i5) throws IOException {
            V(bArr, i4, i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void Y1(int i4, w wVar) throws IOException {
            g2(1, 3);
            u(2, i4);
            k(3, wVar);
            g2(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void c(int i4, int i5) throws IOException {
            g2(i4, 5);
            C1(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void e1() {
            this.f28601g.position(this.f28602h.position());
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public int f1() {
            return this.f28602h.position() - this.f28603i;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            int position = this.f28602h.position();
            try {
                int Z0 = CodedOutputStream.Z0(str.length() * 3);
                int Z02 = CodedOutputStream.Z0(str.length());
                if (Z02 == Z0) {
                    int position2 = this.f28602h.position() + Z02;
                    this.f28602h.position(position2);
                    j2(str);
                    int position3 = this.f28602h.position();
                    this.f28602h.position(position);
                    h2(position3 - position2);
                    this.f28602h.position(position3);
                } else {
                    h2(q4.k(str));
                    j2(str);
                }
            } catch (q4.d e4) {
                this.f28602h.position(position);
                g1(str, e4);
            } catch (IllegalArgumentException e5) {
                throw new OutOfSpaceException(e5);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void g(int i4, String str) throws IOException {
            g2(i4, 2);
            f2(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void g2(int i4, int i5) throws IOException {
            h2(t4.c(i4, i5));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void h(int i4, long j4) throws IOException {
            g2(i4, 0);
            i2(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void h2(int i4) throws IOException {
            while ((i4 & (-128)) != 0) {
                try {
                    this.f28602h.put((byte) ((i4 & 127) | 128));
                    i4 >>>= 7;
                } catch (BufferOverflowException e4) {
                    throw new OutOfSpaceException(e4);
                }
            }
            this.f28602h.put((byte) i4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void i2(long j4) throws IOException {
            while (((-128) & j4) != 0) {
                try {
                    this.f28602h.put((byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                } catch (BufferOverflowException e4) {
                    throw new OutOfSpaceException(e4);
                }
            }
            this.f28602h.put((byte) j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void j(int i4, int i5) throws IOException {
            g2(i4, 0);
            J1(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void k(int i4, w wVar) throws IOException {
            g2(i4, 2);
            z1(wVar);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public int r1() {
            return this.f28602h.remaining();
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void u(int i4, int i5) throws IOException {
            g2(i4, 0);
            h2(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void u1(int i4, byte[] bArr) throws IOException {
            v1(i4, bArr, 0, bArr.length);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void v1(int i4, byte[] bArr, int i5, int i6) throws IOException {
            g2(i4, 2);
            x1(bArr, i5, i6);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i4, int i5) throws IOException {
            h2(i5);
            V(bArr, i4, i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void y(int i4, long j4) throws IOException {
            g2(i4, 1);
            D1(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void y1(int i4, ByteBuffer byteBuffer) throws IOException {
            g2(i4, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void z1(w wVar) throws IOException {
            h2(wVar.size());
            wVar.t0(this);
        }
    }

    private static final class h extends CodedOutputStream {

        /* renamed from: g, reason: collision with root package name */
        private final ByteBuffer f28604g;

        /* renamed from: h, reason: collision with root package name */
        private final ByteBuffer f28605h;

        /* renamed from: i, reason: collision with root package name */
        private final long f28606i;

        /* renamed from: j, reason: collision with root package name */
        private final long f28607j;

        /* renamed from: k, reason: collision with root package name */
        private final long f28608k;

        /* renamed from: l, reason: collision with root package name */
        private final long f28609l;

        /* renamed from: m, reason: collision with root package name */
        private long f28610m;

        h(ByteBuffer byteBuffer) {
            super();
            this.f28604g = byteBuffer;
            this.f28605h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long i4 = p4.i(byteBuffer);
            this.f28606i = i4;
            long position = byteBuffer.position() + i4;
            this.f28607j = position;
            long limit = i4 + byteBuffer.limit();
            this.f28608k = limit;
            this.f28609l = limit - 10;
            this.f28610m = position;
        }

        private int j2(long j4) {
            return (int) (j4 - this.f28606i);
        }

        static boolean k2() {
            return p4.T();
        }

        private void l2(long j4) {
            this.f28605h.position((int) (j4 - this.f28606i));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void C1(int i4) throws IOException {
            this.f28605h.putInt((int) (this.f28610m - this.f28606i), i4);
            this.f28610m += 4;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void D1(long j4) throws IOException {
            this.f28605h.putLong((int) (this.f28610m - this.f28606i), j4);
            this.f28610m += 8;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void E(int i4, boolean z4) throws IOException {
            g2(i4, 0);
            T(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void J1(int i4) throws IOException {
            if (i4 >= 0) {
                h2(i4);
            } else {
                i2(i4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void L1(int i4, i2 i2Var) throws IOException {
            g2(i4, 2);
            N1(i2Var);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        void M1(int i4, i2 i2Var, m3 m3Var) throws IOException {
            g2(i4, 2);
            O1(i2Var, m3Var);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void N1(i2 i2Var) throws IOException {
            h2(i2Var.t());
            i2Var.c1(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        void O1(i2 i2Var, m3 m3Var) throws IOException {
            h2(((androidx.content.preferences.protobuf.a) i2Var).r0(m3Var));
            m3Var.h(i2Var, this.f28585a);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void P1(int i4, i2 i2Var) throws IOException {
            g2(1, 3);
            u(2, i4);
            L1(3, i2Var);
            g2(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void T(byte b5) throws IOException {
            long j4 = this.f28610m;
            if (j4 >= this.f28608k) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f28610m), Long.valueOf(this.f28608k), 1));
            }
            this.f28610m = 1 + j4;
            p4.b0(j4, b5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void U(ByteBuffer byteBuffer) throws IOException {
            try {
                int remaining = byteBuffer.remaining();
                l2(this.f28610m);
                this.f28605h.put(byteBuffer);
                this.f28610m += remaining;
            } catch (BufferOverflowException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void V(byte[] bArr, int i4, int i5) throws IOException {
            if (bArr != null && i4 >= 0 && i5 >= 0 && bArr.length - i5 >= i4) {
                long j4 = i5;
                long j5 = this.f28608k - j4;
                long j6 = this.f28610m;
                if (j5 >= j6) {
                    p4.o(bArr, i4, j6, j4);
                    this.f28610m += j4;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f28610m), Long.valueOf(this.f28608k), Integer.valueOf(i5)));
            }
            throw new NullPointerException("value");
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.v
        public void X(byte[] bArr, int i4, int i5) throws IOException {
            V(bArr, i4, i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void Y1(int i4, w wVar) throws IOException {
            g2(1, 3);
            u(2, i4);
            k(3, wVar);
            g2(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void c(int i4, int i5) throws IOException {
            g2(i4, 5);
            C1(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void e1() {
            this.f28604g.position((int) (this.f28610m - this.f28606i));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public int f1() {
            return (int) (this.f28610m - this.f28607j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            long j4 = this.f28610m;
            try {
                int Z0 = CodedOutputStream.Z0(str.length() * 3);
                int Z02 = CodedOutputStream.Z0(str.length());
                if (Z02 == Z0) {
                    int i4 = ((int) (this.f28610m - this.f28606i)) + Z02;
                    this.f28605h.position(i4);
                    q4.j(str, this.f28605h);
                    int position = this.f28605h.position() - i4;
                    h2(position);
                    this.f28610m += position;
                } else {
                    int k4 = q4.k(str);
                    h2(k4);
                    l2(this.f28610m);
                    q4.j(str, this.f28605h);
                    this.f28610m += k4;
                }
            } catch (q4.d e4) {
                this.f28610m = j4;
                l2(j4);
                g1(str, e4);
            } catch (IllegalArgumentException e5) {
                throw new OutOfSpaceException(e5);
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(e6);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void g(int i4, String str) throws IOException {
            g2(i4, 2);
            f2(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void g2(int i4, int i5) throws IOException {
            h2(t4.c(i4, i5));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void h(int i4, long j4) throws IOException {
            g2(i4, 0);
            i2(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void h2(int i4) throws IOException {
            if (this.f28610m <= this.f28609l) {
                while ((i4 & (-128)) != 0) {
                    long j4 = this.f28610m;
                    this.f28610m = j4 + 1;
                    p4.b0(j4, (byte) ((i4 & 127) | 128));
                    i4 >>>= 7;
                }
                long j5 = this.f28610m;
                this.f28610m = 1 + j5;
                p4.b0(j5, (byte) i4);
                return;
            }
            while (true) {
                long j6 = this.f28610m;
                if (j6 >= this.f28608k) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f28610m), Long.valueOf(this.f28608k), 1));
                }
                if ((i4 & (-128)) == 0) {
                    this.f28610m = 1 + j6;
                    p4.b0(j6, (byte) i4);
                    return;
                } else {
                    this.f28610m = j6 + 1;
                    p4.b0(j6, (byte) ((i4 & 127) | 128));
                    i4 >>>= 7;
                }
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void i2(long j4) throws IOException {
            if (this.f28610m <= this.f28609l) {
                while ((j4 & (-128)) != 0) {
                    long j5 = this.f28610m;
                    this.f28610m = j5 + 1;
                    p4.b0(j5, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
                long j6 = this.f28610m;
                this.f28610m = 1 + j6;
                p4.b0(j6, (byte) j4);
                return;
            }
            while (true) {
                long j7 = this.f28610m;
                if (j7 >= this.f28608k) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f28610m), Long.valueOf(this.f28608k), 1));
                }
                if ((j4 & (-128)) == 0) {
                    this.f28610m = 1 + j7;
                    p4.b0(j7, (byte) j4);
                    return;
                } else {
                    this.f28610m = j7 + 1;
                    p4.b0(j7, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void j(int i4, int i5) throws IOException {
            g2(i4, 0);
            J1(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void k(int i4, w wVar) throws IOException {
            g2(i4, 2);
            z1(wVar);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public int r1() {
            return (int) (this.f28608k - this.f28610m);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void u(int i4, int i5) throws IOException {
            g2(i4, 0);
            h2(i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void u1(int i4, byte[] bArr) throws IOException {
            v1(i4, bArr, 0, bArr.length);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void v1(int i4, byte[] bArr, int i5, int i6) throws IOException {
            g2(i4, 2);
            x1(bArr, i5, i6);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i4, int i5) throws IOException {
            h2(i5);
            V(bArr, i4, i5);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void y(int i4, long j4) throws IOException {
            g2(i4, 1);
            D1(j4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void y1(int i4, ByteBuffer byteBuffer) throws IOException {
            g2(i4, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void z1(w wVar) throws IOException {
            h2(wVar.size());
            wVar.t0(this);
        }
    }

    private CodedOutputStream() {
    }

    public static int A0(int i4, t1 t1Var) {
        return B0(3, t1Var) + Y0(2, i4) + (X0(1) * 2);
    }

    public static int B0(int i4, t1 t1Var) {
        return C0(t1Var) + X0(i4);
    }

    public static int C0(t1 t1Var) {
        int f4 = t1Var.f();
        return Z0(f4) + f4;
    }

    static int D0(int i4) {
        return Z0(i4) + i4;
    }

    public static int E0(int i4, i2 i2Var) {
        return F0(3, i2Var) + Y0(2, i4) + (X0(1) * 2);
    }

    public static int F0(int i4, i2 i2Var) {
        return H0(i2Var) + X0(i4);
    }

    static int G0(int i4, i2 i2Var, m3 m3Var) {
        return X0(i4) + I0(i2Var, m3Var);
    }

    public static int H0(i2 i2Var) {
        int t4 = i2Var.t();
        return Z0(t4) + t4;
    }

    static int I0(i2 i2Var, m3 m3Var) {
        int r02 = ((androidx.content.preferences.protobuf.a) i2Var).r0(m3Var);
        return Z0(r02) + r02;
    }

    static int J0(int i4) {
        if (i4 > 4096) {
            return 4096;
        }
        return i4;
    }

    public static int K0(int i4, w wVar) {
        return g0(3, wVar) + Y0(2, i4) + (X0(1) * 2);
    }

    @Deprecated
    public static int L0(int i4) {
        return Z0(i4);
    }

    @Deprecated
    public static int M0(long j4) {
        return b1(j4);
    }

    public static int N0(int i4, int i5) {
        return X0(i4) + 4;
    }

    public static int O0(int i4) {
        return 4;
    }

    public static int P0(int i4, long j4) {
        return X0(i4) + 8;
    }

    public static int Q0(long j4) {
        return 8;
    }

    public static int R0(int i4, int i5) {
        return S0(i5) + X0(i4);
    }

    public static int S0(int i4) {
        return Z0(c1(i4));
    }

    public static int T0(int i4, long j4) {
        return U0(j4) + X0(i4);
    }

    public static int U0(long j4) {
        return b1(d1(j4));
    }

    public static int V0(int i4, String str) {
        return W0(str) + X0(i4);
    }

    public static int W0(String str) {
        int length;
        try {
            length = q4.k(str);
        } catch (q4.d unused) {
            length = str.getBytes(p1.f28847a).length;
        }
        return Z0(length) + length;
    }

    public static int X0(int i4) {
        return Z0(t4.c(i4, 0));
    }

    public static int Y0(int i4, int i5) {
        return Z0(i5) + X0(i4);
    }

    public static int Z0(int i4) {
        if ((i4 & (-128)) == 0) {
            return 1;
        }
        if ((i4 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i4) == 0) {
            return 3;
        }
        return (i4 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int a0(int i4, boolean z4) {
        return X0(i4) + 1;
    }

    public static int a1(int i4, long j4) {
        return b1(j4) + X0(i4);
    }

    public static int b0(boolean z4) {
        return 1;
    }

    public static int b1(long j4) {
        int i4;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            i4 = 6;
        } else {
            i4 = 2;
        }
        if (((-2097152) & j4) != 0) {
            i4 += 2;
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? i4 + 1 : i4;
    }

    public static int c0(int i4, byte[] bArr) {
        return d0(bArr) + X0(i4);
    }

    public static int c1(int i4) {
        return (i4 >> 31) ^ (i4 << 1);
    }

    public static int d0(byte[] bArr) {
        int length = bArr.length;
        return Z0(length) + length;
    }

    public static long d1(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    public static int e0(int i4, ByteBuffer byteBuffer) {
        return f0(byteBuffer) + X0(i4);
    }

    public static int f0(ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity();
        return Z0(capacity) + capacity;
    }

    public static int g0(int i4, w wVar) {
        return h0(wVar) + X0(i4);
    }

    public static int h0(w wVar) {
        int size = wVar.size();
        return Z0(size) + size;
    }

    public static int i0(int i4, double d5) {
        return X0(i4) + 8;
    }

    static CodedOutputStream i1(v vVar, int i4) {
        if (i4 >= 0) {
            return new d(vVar, i4);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    public static int j0(double d5) {
        return 8;
    }

    public static CodedOutputStream j1(OutputStream outputStream) {
        return new f(outputStream, 4096);
    }

    public static int k0(int i4, int i5) {
        return x0(i5) + X0(i4);
    }

    public static CodedOutputStream k1(OutputStream outputStream, int i4) {
        return new f(outputStream, i4);
    }

    public static int l0(int i4) {
        return x0(i4);
    }

    public static CodedOutputStream l1(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new e(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return p4.T() ? new h(byteBuffer) : new g(byteBuffer);
    }

    public static int m0(int i4, int i5) {
        return X0(i4) + 4;
    }

    @Deprecated
    public static CodedOutputStream m1(ByteBuffer byteBuffer, int i4) {
        return l1(byteBuffer);
    }

    public static int n0(int i4) {
        return 4;
    }

    public static CodedOutputStream n1(byte[] bArr) {
        return new c(bArr, 0, bArr.length);
    }

    public static int o0(int i4, long j4) {
        return X0(i4) + 8;
    }

    public static CodedOutputStream o1(byte[] bArr, int i4, int i5) {
        return new c(bArr, i4, i5);
    }

    public static int p0(long j4) {
        return 8;
    }

    static CodedOutputStream p1(ByteBuffer byteBuffer) {
        return new g(byteBuffer);
    }

    public static int q0(int i4, float f4) {
        return X0(i4) + 4;
    }

    static CodedOutputStream q1(ByteBuffer byteBuffer) {
        return new h(byteBuffer);
    }

    public static int r0(float f4) {
        return 4;
    }

    @Deprecated
    public static int s0(int i4, i2 i2Var) {
        return i2Var.t() + (X0(i4) * 2);
    }

    @Deprecated
    static int t0(int i4, i2 i2Var, m3 m3Var) {
        return (X0(i4) * 2) + ((androidx.content.preferences.protobuf.a) i2Var).r0(m3Var);
    }

    @Deprecated
    public static int u0(i2 i2Var) {
        return i2Var.t();
    }

    @Deprecated
    static int v0(i2 i2Var, m3 m3Var) {
        return ((androidx.content.preferences.protobuf.a) i2Var).r0(m3Var);
    }

    public static int w0(int i4, int i5) {
        return x0(i5) + X0(i4);
    }

    public static int x0(int i4) {
        if (i4 >= 0) {
            return Z0(i4);
        }
        return 10;
    }

    public static int y0(int i4, long j4) {
        return b1(j4) + X0(i4);
    }

    public static int z0(long j4) {
        return b1(j4);
    }

    public final void A1(double d5) throws IOException {
        D1(Double.doubleToRawLongBits(d5));
    }

    public final void B1(int i4) throws IOException {
        J1(i4);
    }

    public abstract void C1(int i4) throws IOException;

    public final void D(int i4, long j4) throws IOException {
        h(i4, j4);
    }

    public abstract void D1(long j4) throws IOException;

    public abstract void E(int i4, boolean z4) throws IOException;

    public final void E1(float f4) throws IOException {
        C1(Float.floatToRawIntBits(f4));
    }

    public final void F(int i4, int i5) throws IOException {
        c(i4, i5);
    }

    @Deprecated
    public final void F1(int i4, i2 i2Var) throws IOException {
        g2(i4, 3);
        i2Var.c1(this);
        g2(i4, 4);
    }

    @Deprecated
    final void G1(int i4, i2 i2Var, m3 m3Var) throws IOException {
        g2(i4, 3);
        I1(i2Var, m3Var);
        g2(i4, 4);
    }

    @Deprecated
    public final void H1(i2 i2Var) throws IOException {
        i2Var.c1(this);
    }

    @Deprecated
    final void I1(i2 i2Var, m3 m3Var) throws IOException {
        m3Var.h(i2Var, this.f28585a);
    }

    public abstract void J1(int i4) throws IOException;

    public final void K1(long j4) throws IOException {
        i2(j4);
    }

    public final void L(int i4, float f4) throws IOException {
        c(i4, Float.floatToRawIntBits(f4));
    }

    public abstract void L1(int i4, i2 i2Var) throws IOException;

    abstract void M1(int i4, i2 i2Var, m3 m3Var) throws IOException;

    public abstract void N1(i2 i2Var) throws IOException;

    public final void O(int i4, int i5) throws IOException {
        j(i4, i5);
    }

    abstract void O1(i2 i2Var, m3 m3Var) throws IOException;

    public abstract void P1(int i4, i2 i2Var) throws IOException;

    public final void Q1(byte b5) throws IOException {
        T(b5);
    }

    public final void R(int i4, int i5) throws IOException {
        u(i4, c1(i5));
    }

    public final void R1(int i4) throws IOException {
        T((byte) i4);
    }

    public final void S1(w wVar) throws IOException {
        wVar.t0(this);
    }

    @Override // androidx.content.preferences.protobuf.v
    public abstract void T(byte b5) throws IOException;

    public abstract void T1(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.content.preferences.protobuf.v
    public abstract void U(ByteBuffer byteBuffer) throws IOException;

    public final void U1(byte[] bArr) throws IOException {
        V(bArr, 0, bArr.length);
    }

    @Override // androidx.content.preferences.protobuf.v
    public abstract void V(byte[] bArr, int i4, int i5) throws IOException;

    public final void V1(byte[] bArr, int i4, int i5) throws IOException {
        V(bArr, i4, i5);
    }

    @Override // androidx.content.preferences.protobuf.v
    public abstract void W(ByteBuffer byteBuffer) throws IOException;

    @Deprecated
    public final void W1(int i4) throws IOException {
        C1(i4);
    }

    @Override // androidx.content.preferences.protobuf.v
    public abstract void X(byte[] bArr, int i4, int i5) throws IOException;

    @Deprecated
    public final void X1(long j4) throws IOException {
        D1(j4);
    }

    public abstract void Y1(int i4, w wVar) throws IOException;

    public final void Z() {
        if (r1() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public final void Z1(int i4) throws IOException {
        h2(i4);
    }

    @Deprecated
    public final void a2(long j4) throws IOException {
        i2(j4);
    }

    public final void b2(int i4) throws IOException {
        C1(i4);
    }

    public abstract void c(int i4, int i5) throws IOException;

    public final void c2(long j4) throws IOException {
        D1(j4);
    }

    public final void d2(int i4) throws IOException {
        h2(c1(i4));
    }

    public abstract void e1() throws IOException;

    public final void e2(long j4) throws IOException {
        i2(d1(j4));
    }

    public abstract int f1();

    public abstract void f2(String str) throws IOException;

    public abstract void g(int i4, String str) throws IOException;

    final void g1(String str, q4.d dVar) throws IOException {
        f28581c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(p1.f28847a);
        try {
            h2(bytes.length);
            X(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e5) {
            throw new OutOfSpaceException(e5);
        }
    }

    public abstract void g2(int i4, int i5) throws IOException;

    public abstract void h(int i4, long j4) throws IOException;

    boolean h1() {
        return this.f28586b;
    }

    public abstract void h2(int i4) throws IOException;

    public abstract void i2(long j4) throws IOException;

    public abstract void j(int i4, int i5) throws IOException;

    public abstract void k(int i4, w wVar) throws IOException;

    public final void l(int i4, long j4) throws IOException {
        y(i4, j4);
    }

    public final void q(int i4, long j4) throws IOException {
        h(i4, d1(j4));
    }

    public abstract int r1();

    public void s1() {
        this.f28586b = true;
    }

    public final void t1(boolean z4) throws IOException {
        T(z4 ? (byte) 1 : (byte) 0);
    }

    public abstract void u(int i4, int i5) throws IOException;

    public abstract void u1(int i4, byte[] bArr) throws IOException;

    public final void v(int i4, double d5) throws IOException {
        y(i4, Double.doubleToRawLongBits(d5));
    }

    public abstract void v1(int i4, byte[] bArr, int i5, int i6) throws IOException;

    public final void w1(byte[] bArr) throws IOException {
        x1(bArr, 0, bArr.length);
    }

    abstract void x1(byte[] bArr, int i4, int i5) throws IOException;

    public abstract void y(int i4, long j4) throws IOException;

    public abstract void y1(int i4, ByteBuffer byteBuffer) throws IOException;

    public abstract void z1(w wVar) throws IOException;
}
