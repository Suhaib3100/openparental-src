package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes5.dex */
public final class CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f25677a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25678b;

    /* renamed from: e, reason: collision with root package name */
    private final OutputStream f25681e;

    /* renamed from: d, reason: collision with root package name */
    private int f25680d = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f25679c = 0;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super(ProtectedSandApp.s("伟"));
        }
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f25681e = outputStream;
        this.f25677a = bArr;
        this.f25678b = bArr.length;
    }

    public static int A(int i5, long j5) {
        return B(j5) + D(i5);
    }

    public static int B(long j5) {
        return w(H(j5));
    }

    public static int C(String str) {
        try {
            byte[] bytes = str.getBytes(ProtectedSandApp.s("传"));
            return v(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException(ProtectedSandApp.s("伡"), e6);
        }
    }

    public static int D(int i5) {
        return v(w.c(i5, 0));
    }

    public static int E(int i5) {
        return v(i5);
    }

    public static int F(long j5) {
        return w(j5);
    }

    public static int G(int i5) {
        return (i5 >> 31) ^ (i5 << 1);
    }

    public static long H(long j5) {
        return (j5 >> 63) ^ (j5 << 1);
    }

    public static CodedOutputStream J(OutputStream outputStream, int i5) {
        return new CodedOutputStream(outputStream, new byte[i5]);
    }

    private void K() throws IOException {
        OutputStream outputStream = this.f25681e;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f25677a, 0, this.f25679c);
        this.f25679c = 0;
    }

    public static int a(int i5, boolean z5) {
        return D(i5) + 1;
    }

    public static int b(boolean z5) {
        return 1;
    }

    public static int c(byte[] bArr) {
        return v(bArr.length) + bArr.length;
    }

    public static int d(int i5, d dVar) {
        return e(dVar) + D(i5);
    }

    public static int e(d dVar) {
        return dVar.size() + v(dVar.size());
    }

    public static int f(int i5, double d6) {
        return D(i5) + 8;
    }

    public static int g(double d6) {
        return 8;
    }

    public static int h(int i5, int i6) {
        return p(i6) + D(i5);
    }

    public static int i(int i5) {
        return p(i5);
    }

    public static int j(int i5) {
        return 4;
    }

    public static int k(long j5) {
        return 8;
    }

    public static int l(int i5, float f6) {
        return D(i5) + 4;
    }

    public static int m(float f6) {
        return 4;
    }

    public static int n(o oVar) {
        return oVar.u();
    }

    public static int o(int i5, int i6) {
        return p(i6) + D(i5);
    }

    public static int p(int i5) {
        if (i5 >= 0) {
            return v(i5);
        }
        return 10;
    }

    public static int q(long j5) {
        return w(j5);
    }

    public static int r(k kVar) {
        int b6 = kVar.b();
        return v(b6) + b6;
    }

    public static int s(int i5, o oVar) {
        return t(oVar) + D(i5);
    }

    public static int t(o oVar) {
        int u5 = oVar.u();
        return v(u5) + u5;
    }

    static int u(int i5) {
        if (i5 > 4096) {
            return 4096;
        }
        return i5;
    }

    public static int v(int i5) {
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

    public static int w(long j5) {
        if (((-128) & j5) == 0) {
            return 1;
        }
        if (((-16384) & j5) == 0) {
            return 2;
        }
        if (((-2097152) & j5) == 0) {
            return 3;
        }
        if (((-268435456) & j5) == 0) {
            return 4;
        }
        if (((-34359738368L) & j5) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j5) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j5) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j5) == 0) {
            return 8;
        }
        return (j5 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int x(int i5) {
        return 4;
    }

    public static int y(long j5) {
        return 8;
    }

    public static int z(int i5) {
        return v((i5 >> 31) ^ (i5 << 1));
    }

    public void I() throws IOException {
        if (this.f25681e != null) {
            K();
        }
    }

    public void L(int i5, boolean z5) throws IOException {
        w0(i5, 0);
        g0(z5 ? (byte) 1 : (byte) 0);
    }

    public void M(boolean z5) throws IOException {
        g0(z5 ? (byte) 1 : (byte) 0);
    }

    public void N(byte[] bArr) throws IOException {
        o0(bArr.length);
        k0(bArr);
    }

    public void O(int i5, d dVar) throws IOException {
        w0(i5, 2);
        P(dVar);
    }

    public void P(d dVar) throws IOException {
        o0(dVar.size());
        i0(dVar);
    }

    public void Q(int i5, double d6) throws IOException {
        w0(i5, 1);
        R(d6);
    }

    public void R(double d6) throws IOException {
        n0(Double.doubleToRawLongBits(d6));
    }

    public void S(int i5, int i6) throws IOException {
        w0(i5, 0);
        b0(i6);
    }

    public void T(int i5) throws IOException {
        b0(i5);
    }

    public void U(int i5) throws IOException {
        m0(i5);
    }

    public void V(long j5) throws IOException {
        n0(j5);
    }

    public void W(int i5, float f6) throws IOException {
        w0(i5, 5);
        X(f6);
    }

    public void X(float f6) throws IOException {
        m0(Float.floatToRawIntBits(f6));
    }

    public void Y(int i5, o oVar) throws IOException {
        w0(i5, 3);
        oVar.a(this);
        w0(i5, 4);
    }

    public void Z(o oVar) throws IOException {
        oVar.a(this);
    }

    public void a0(int i5, int i6) throws IOException {
        w0(i5, 0);
        b0(i6);
    }

    public void b0(int i5) throws IOException {
        if (i5 >= 0) {
            o0(i5);
        } else {
            p0(i5);
        }
    }

    public void c0(long j5) throws IOException {
        p0(j5);
    }

    public void d0(int i5, o oVar) throws IOException {
        w0(i5, 2);
        e0(oVar);
    }

    public void e0(o oVar) throws IOException {
        o0(oVar.u());
        oVar.a(this);
    }

    public void f0(int i5, o oVar) throws IOException {
        w0(1, 3);
        x0(2, i5);
        d0(3, oVar);
        w0(1, 4);
    }

    public void g0(byte b6) throws IOException {
        if (this.f25679c == this.f25678b) {
            K();
        }
        byte[] bArr = this.f25677a;
        int i5 = this.f25679c;
        this.f25679c = i5 + 1;
        bArr[i5] = b6;
        this.f25680d++;
    }

    public void h0(int i5) throws IOException {
        g0((byte) i5);
    }

    public void i0(d dVar) throws IOException {
        j0(dVar, 0, dVar.size());
    }

    public void j0(d dVar, int i5, int i6) throws IOException {
        int i7 = this.f25678b;
        int i8 = this.f25679c;
        if (i7 - i8 >= i6) {
            dVar.p(this.f25677a, i5, i8, i6);
            this.f25679c += i6;
            this.f25680d += i6;
            return;
        }
        int i9 = i7 - i8;
        dVar.p(this.f25677a, i5, i8, i9);
        int i10 = i5 + i9;
        int i11 = i6 - i9;
        this.f25679c = this.f25678b;
        this.f25680d += i9;
        K();
        if (i11 <= this.f25678b) {
            dVar.p(this.f25677a, i10, 0, i11);
            this.f25679c = i11;
        } else {
            dVar.H(this.f25681e, i10, i11);
        }
        this.f25680d += i11;
    }

    public void k0(byte[] bArr) throws IOException {
        l0(bArr, 0, bArr.length);
    }

    public void l0(byte[] bArr, int i5, int i6) throws IOException {
        int i7 = this.f25678b;
        int i8 = this.f25679c;
        if (i7 - i8 >= i6) {
            System.arraycopy(bArr, i5, this.f25677a, i8, i6);
            this.f25679c += i6;
            this.f25680d += i6;
            return;
        }
        int i9 = i7 - i8;
        System.arraycopy(bArr, i5, this.f25677a, i8, i9);
        int i10 = i5 + i9;
        int i11 = i6 - i9;
        this.f25679c = this.f25678b;
        this.f25680d += i9;
        K();
        if (i11 <= this.f25678b) {
            System.arraycopy(bArr, i10, this.f25677a, 0, i11);
            this.f25679c = i11;
        } else {
            this.f25681e.write(bArr, i10, i11);
        }
        this.f25680d += i11;
    }

    public void m0(int i5) throws IOException {
        g0((byte) (i5 & 255));
        g0((byte) ((i5 >> 8) & 255));
        g0((byte) ((i5 >> 16) & 255));
        g0((byte) ((i5 >> 24) & 255));
    }

    public void n0(long j5) throws IOException {
        g0((byte) (((int) j5) & 255));
        g0((byte) (((int) (j5 >> 8)) & 255));
        g0((byte) (((int) (j5 >> 16)) & 255));
        g0((byte) (((int) (j5 >> 24)) & 255));
        g0((byte) (((int) (j5 >> 32)) & 255));
        g0((byte) (((int) (j5 >> 40)) & 255));
        g0((byte) (((int) (j5 >> 48)) & 255));
        g0((byte) (((int) (j5 >> 56)) & 255));
    }

    public void o0(int i5) throws IOException {
        while ((i5 & (-128)) != 0) {
            g0((byte) ((i5 & 127) | 128));
            i5 >>>= 7;
        }
        g0((byte) i5);
    }

    public void p0(long j5) throws IOException {
        while (((-128) & j5) != 0) {
            g0((byte) ((((int) j5) & 127) | 128));
            j5 >>>= 7;
        }
        g0((byte) j5);
    }

    public void q0(int i5) throws IOException {
        m0(i5);
    }

    public void r0(long j5) throws IOException {
        n0(j5);
    }

    public void s0(int i5) throws IOException {
        o0((i5 >> 31) ^ (i5 << 1));
    }

    public void t0(int i5, long j5) throws IOException {
        w0(i5, 0);
        u0(j5);
    }

    public void u0(long j5) throws IOException {
        p0(H(j5));
    }

    public void v0(String str) throws IOException {
        byte[] bytes = str.getBytes(ProtectedSandApp.s("伢"));
        o0(bytes.length);
        k0(bytes);
    }

    public void w0(int i5, int i6) throws IOException {
        o0(w.c(i5, i6));
    }

    public void x0(int i5, int i6) throws IOException {
        w0(i5, 0);
        o0(i6);
    }

    public void y0(int i5) throws IOException {
        o0(i5);
    }

    public void z0(long j5) throws IOException {
        p0(j5);
    }
}
