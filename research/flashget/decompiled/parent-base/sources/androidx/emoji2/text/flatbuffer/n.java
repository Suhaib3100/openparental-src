package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataItem.java */
/* loaded from: classes3.dex */
public final class n extends u {

    /* compiled from: MetadataItem.java */
    public static final class a extends b {
        public a f(int i4, int i5, ByteBuffer byteBuffer) {
            b(i4, i5, byteBuffer);
            return this;
        }

        public n g(int i4) {
            return h(new n(), i4);
        }

        public n h(n nVar, int i4) {
            int a5 = a(i4);
            nVar.g(this.f29329d.getInt(a5) + a5, this.f29329d);
            return nVar;
        }
    }

    public static void A(i iVar, boolean z4) {
        iVar.b(1, z4, false);
    }

    public static void B(i iVar, short s4) {
        iVar.p(5, s4, 0);
    }

    public static void C(i iVar, int i4) {
        iVar.k(0, i4, 0);
    }

    public static void D(i iVar, short s4) {
        iVar.p(2, s4, 0);
    }

    public static void E(i iVar, short s4) {
        iVar.p(4, s4, 0);
    }

    public static int M(i iVar, int[] iArr) {
        iVar.h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            iVar.j(iArr[length]);
        }
        return iVar.E();
    }

    public static int N(i iVar, int i4, boolean z4, short s4, short s5, short s6, short s7, int i5) {
        iVar.g0(7);
        y(iVar, i5);
        iVar.k(0, i4, 0);
        B(iVar, s7);
        E(iVar, s6);
        z(iVar, s5);
        D(iVar, s4);
        A(iVar, z4);
        return iVar.D();
    }

    public static int P(i iVar) {
        return iVar.D();
    }

    public static n Q(ByteBuffer byteBuffer) {
        return R(byteBuffer, new n());
    }

    public static n R(ByteBuffer byteBuffer, n nVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        nVar.g(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
        return nVar;
    }

    public static void V(i iVar, int i4) {
        iVar.h0(4, i4, 4);
    }

    public static void W(i iVar) {
        iVar.g0(7);
    }

    public static void u() {
    }

    static int x(int i4, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i4) + i4;
    }

    public static void y(i iVar, int i4) {
        iVar.o(6, i4, 0);
    }

    public static void z(i iVar, short s4) {
        iVar.p(3, s4, 0);
    }

    public int F(int i4) {
        int d5 = d(16);
        if (d5 == 0) {
            return 0;
        }
        return this.f29385b.getInt((i4 * 4) + l(d5));
    }

    public ByteBuffer G() {
        return m(16, 4);
    }

    public ByteBuffer H(ByteBuffer byteBuffer) {
        return n(byteBuffer, 16, 4);
    }

    public int I() {
        int d5 = d(16);
        if (d5 != 0) {
            return o(d5);
        }
        return 0;
    }

    public l J() {
        return K(new l());
    }

    public l K(l lVar) {
        int d5 = d(16);
        if (d5 == 0) {
            return null;
        }
        lVar.b(l(d5), 4, this.f29385b);
        return lVar;
    }

    public short L() {
        int d5 = d(10);
        if (d5 != 0) {
            return this.f29385b.getShort(d5 + this.f29384a);
        }
        return (short) 0;
    }

    public boolean O() {
        int d5 = d(6);
        return (d5 == 0 || this.f29385b.get(d5 + this.f29384a) == 0) ? false : true;
    }

    public short S() {
        int d5 = d(14);
        if (d5 != 0) {
            return this.f29385b.getShort(d5 + this.f29384a);
        }
        return (short) 0;
    }

    public int T() {
        int d5 = d(4);
        if (d5 != 0) {
            return this.f29385b.getInt(d5 + this.f29384a);
        }
        return 0;
    }

    public short U() {
        int d5 = d(8);
        if (d5 != 0) {
            return this.f29385b.getShort(d5 + this.f29384a);
        }
        return (short) 0;
    }

    public short X() {
        int d5 = d(12);
        if (d5 != 0) {
            return this.f29385b.getShort(d5 + this.f29384a);
        }
        return (short) 0;
    }

    public n v(int i4, ByteBuffer byteBuffer) {
        g(i4, byteBuffer);
        return this;
    }

    public void w(int i4, ByteBuffer byteBuffer) {
        g(i4, byteBuffer);
    }
}
