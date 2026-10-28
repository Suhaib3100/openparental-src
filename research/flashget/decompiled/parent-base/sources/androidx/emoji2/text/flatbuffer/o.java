package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataList.java */
/* loaded from: classes3.dex */
public final class o extends u {

    /* compiled from: MetadataList.java */
    public static final class a extends b {
        public a f(int i4, int i5, ByteBuffer byteBuffer) {
            b(i4, i5, byteBuffer);
            return this;
        }

        public o g(int i4) {
            return h(new o(), i4);
        }

        public o h(o oVar, int i4) {
            int a5 = a(i4);
            oVar.g(this.f29329d.getInt(a5) + a5, this.f29329d);
            return oVar;
        }
    }

    public static void A(i iVar, int i4) {
        iVar.k(0, i4, 0);
    }

    public static int B(i iVar, int[] iArr) {
        iVar.h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            iVar.n(iArr[length]);
        }
        return iVar.E();
    }

    public static int C(i iVar, int i4, int i5, int i6) {
        iVar.g0(3);
        z(iVar, i6);
        y(iVar, i5);
        iVar.k(0, i4, 0);
        return iVar.D();
    }

    public static int D(i iVar) {
        return iVar.D();
    }

    public static void E(i iVar, int i4) {
        iVar.F(i4);
    }

    public static void F(i iVar, int i4) {
        iVar.J(i4);
    }

    public static o G(ByteBuffer byteBuffer) {
        return H(byteBuffer, new o());
    }

    public static o H(ByteBuffer byteBuffer, o oVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        oVar.g(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
        return oVar;
    }

    public static void Q(i iVar, int i4) {
        iVar.h0(4, i4, 4);
    }

    public static void R(i iVar) {
        iVar.g0(3);
    }

    public static void u() {
    }

    static int x(int i4, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i4) + i4;
    }

    public static void y(i iVar, int i4) {
        iVar.o(1, i4, 0);
    }

    public static void z(i iVar, int i4) {
        iVar.o(2, i4, 0);
    }

    public n I(int i4) {
        return J(new n(), i4);
    }

    public n J(n nVar, int i4) {
        int d5 = d(6);
        if (d5 == 0) {
            return null;
        }
        nVar.g(b((i4 * 4) + l(d5)), this.f29385b);
        return nVar;
    }

    public int K() {
        int d5 = d(6);
        if (d5 != 0) {
            return o(d5);
        }
        return 0;
    }

    public n.a L() {
        return M(new n.a());
    }

    public n.a M(n.a aVar) {
        int d5 = d(6);
        if (d5 == 0) {
            return null;
        }
        aVar.b(l(d5), 4, this.f29385b);
        return aVar;
    }

    public String N() {
        int d5 = d(8);
        if (d5 != 0) {
            return h(d5 + this.f29384a);
        }
        return null;
    }

    public ByteBuffer O() {
        return m(8, 1);
    }

    public ByteBuffer P(ByteBuffer byteBuffer) {
        return n(byteBuffer, 8, 1);
    }

    public int S() {
        int d5 = d(4);
        if (d5 != 0) {
            return this.f29385b.getInt(d5 + this.f29384a);
        }
        return 0;
    }

    public o v(int i4, ByteBuffer byteBuffer) {
        g(i4, byteBuffer);
        return this;
    }

    public void w(int i4, ByteBuffer byteBuffer) {
        g(i4, byteBuffer);
    }
}
