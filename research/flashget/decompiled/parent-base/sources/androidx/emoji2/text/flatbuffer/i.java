package androidx.emoji2.text.flatbuffer;

import androidx.collection.r2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: FlatBufferBuilder.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f29339o = false;

    /* renamed from: a, reason: collision with root package name */
    ByteBuffer f29340a;

    /* renamed from: b, reason: collision with root package name */
    int f29341b;

    /* renamed from: c, reason: collision with root package name */
    int f29342c;

    /* renamed from: d, reason: collision with root package name */
    int[] f29343d;

    /* renamed from: e, reason: collision with root package name */
    int f29344e;

    /* renamed from: f, reason: collision with root package name */
    boolean f29345f;

    /* renamed from: g, reason: collision with root package name */
    boolean f29346g;

    /* renamed from: h, reason: collision with root package name */
    int f29347h;

    /* renamed from: i, reason: collision with root package name */
    int[] f29348i;

    /* renamed from: j, reason: collision with root package name */
    int f29349j;

    /* renamed from: k, reason: collision with root package name */
    int f29350k;

    /* renamed from: l, reason: collision with root package name */
    boolean f29351l;

    /* renamed from: m, reason: collision with root package name */
    b f29352m;

    /* renamed from: n, reason: collision with root package name */
    final w f29353n;

    /* compiled from: FlatBufferBuilder.java */
    static class a extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        ByteBuffer f29354b;

        public a(ByteBuffer byteBuffer) {
            this.f29354b = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.f29354b.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* compiled from: FlatBufferBuilder.java */
    public static abstract class b {
        public abstract ByteBuffer a(int i4);

        public void b(ByteBuffer byteBuffer) {
        }
    }

    /* compiled from: FlatBufferBuilder.java */
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f29355a = new c();

        @Override // androidx.emoji2.text.flatbuffer.i.b
        public ByteBuffer a(int i4) {
            return ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public i(int i4, b bVar) {
        this(i4, bVar, null, w.d());
    }

    @Deprecated
    private int C() {
        L();
        return this.f29341b;
    }

    static ByteBuffer N(ByteBuffer byteBuffer, b bVar) {
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i4 = capacity == 0 ? 1 : capacity << 1;
        byteBuffer.position(0);
        ByteBuffer a5 = bVar.a(i4);
        a5.position(a5.clear().capacity() - capacity);
        a5.put(byteBuffer);
        return a5;
    }

    public static boolean P(u uVar, int i4) {
        return uVar.d(i4) != 0;
    }

    public int A(int[] iArr) {
        Q();
        h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            n(iArr[length]);
        }
        return E();
    }

    public ByteBuffer B() {
        L();
        return this.f29340a;
    }

    public int D() {
        int i4;
        if (this.f29343d == null || !this.f29345f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        j(0);
        int R = R();
        int i5 = this.f29344e - 1;
        while (i5 >= 0 && this.f29343d[i5] == 0) {
            i5--;
        }
        for (int i6 = i5; i6 >= 0; i6--) {
            int i7 = this.f29343d[i6];
            q((short) (i7 != 0 ? R - i7 : 0));
        }
        q((short) (R - this.f29347h));
        q((short) ((i5 + 3) * 2));
        int i10 = 0;
        loop2: while (true) {
            if (i10 >= this.f29349j) {
                i4 = 0;
                break;
            }
            int capacity = this.f29340a.capacity() - this.f29348i[i10];
            int i11 = this.f29341b;
            short s4 = this.f29340a.getShort(capacity);
            if (s4 == this.f29340a.getShort(i11)) {
                for (int i12 = 2; i12 < s4; i12 += 2) {
                    if (this.f29340a.getShort(capacity + i12) != this.f29340a.getShort(i11 + i12)) {
                        break;
                    }
                }
                i4 = this.f29348i[i10];
                break loop2;
            }
            i10++;
        }
        if (i4 != 0) {
            int capacity2 = this.f29340a.capacity() - R;
            this.f29341b = capacity2;
            this.f29340a.putInt(capacity2, i4 - R);
        } else {
            int i13 = this.f29349j;
            int[] iArr = this.f29348i;
            if (i13 == iArr.length) {
                this.f29348i = Arrays.copyOf(iArr, i13 * 2);
            }
            int[] iArr2 = this.f29348i;
            int i14 = this.f29349j;
            this.f29349j = i14 + 1;
            iArr2[i14] = R();
            ByteBuffer byteBuffer = this.f29340a;
            byteBuffer.putInt(byteBuffer.capacity() - R, R() - R);
        }
        this.f29345f = false;
        return R;
    }

    public int E() {
        if (!this.f29345f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f29345f = false;
        Y(this.f29350k);
        return R();
    }

    public void F(int i4) {
        I(i4, false);
    }

    public void G(int i4, String str) {
        H(i4, str, false);
    }

    protected void H(int i4, String str, boolean z4) {
        T(this.f29342c, (z4 ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i5 = 3; i5 >= 0; i5--) {
            d((byte) str.charAt(i5));
        }
        I(i4, z4);
    }

    protected void I(int i4, boolean z4) {
        T(this.f29342c, (z4 ? 4 : 0) + 4);
        n(i4);
        if (z4) {
            j(this.f29340a.capacity() - this.f29341b);
        }
        this.f29340a.position(this.f29341b);
        this.f29346g = true;
    }

    public void J(int i4) {
        I(i4, true);
    }

    public void K(int i4, String str) {
        H(i4, str, true);
    }

    public void L() {
        if (!this.f29346g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public i M(boolean z4) {
        this.f29351l = z4;
        return this;
    }

    public i O(ByteBuffer byteBuffer, b bVar) {
        this.f29352m = bVar;
        this.f29340a = byteBuffer;
        byteBuffer.clear();
        this.f29340a.order(ByteOrder.LITTLE_ENDIAN);
        this.f29342c = 1;
        this.f29341b = this.f29340a.capacity();
        this.f29344e = 0;
        this.f29345f = false;
        this.f29346g = false;
        this.f29347h = 0;
        this.f29349j = 0;
        this.f29350k = 0;
        return this;
    }

    public void Q() {
        if (this.f29345f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int R() {
        return this.f29340a.capacity() - this.f29341b;
    }

    public void S(int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer = this.f29340a;
            int i6 = this.f29341b - 1;
            this.f29341b = i6;
            byteBuffer.put(i6, (byte) 0);
        }
    }

    public void T(int i4, int i5) {
        if (i4 > this.f29342c) {
            this.f29342c = i4;
        }
        int i6 = ((~((this.f29340a.capacity() - this.f29341b) + i5)) + 1) & (i4 - 1);
        while (this.f29341b < i6 + i4 + i5) {
            int capacity = this.f29340a.capacity();
            ByteBuffer byteBuffer = this.f29340a;
            ByteBuffer N = N(byteBuffer, this.f29352m);
            this.f29340a = N;
            if (byteBuffer != N) {
                this.f29352m.b(byteBuffer);
            }
            this.f29341b = (this.f29340a.capacity() - capacity) + this.f29341b;
        }
        S(i6);
    }

    public void U(boolean z4) {
        ByteBuffer byteBuffer = this.f29340a;
        int i4 = this.f29341b - 1;
        this.f29341b = i4;
        byteBuffer.put(i4, z4 ? (byte) 1 : (byte) 0);
    }

    public void V(byte b5) {
        ByteBuffer byteBuffer = this.f29340a;
        int i4 = this.f29341b - 1;
        this.f29341b = i4;
        byteBuffer.put(i4, b5);
    }

    public void W(double d5) {
        ByteBuffer byteBuffer = this.f29340a;
        int i4 = this.f29341b - 8;
        this.f29341b = i4;
        byteBuffer.putDouble(i4, d5);
    }

    public void X(float f4) {
        ByteBuffer byteBuffer = this.f29340a;
        int i4 = this.f29341b - 4;
        this.f29341b = i4;
        byteBuffer.putFloat(i4, f4);
    }

    public void Y(int i4) {
        ByteBuffer byteBuffer = this.f29340a;
        int i5 = this.f29341b - 4;
        this.f29341b = i5;
        byteBuffer.putInt(i5, i4);
    }

    public void Z(long j4) {
        ByteBuffer byteBuffer = this.f29340a;
        int i4 = this.f29341b - 8;
        this.f29341b = i4;
        byteBuffer.putLong(i4, j4);
    }

    public void a(int i4) {
        if (i4 != R()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void a0(short s4) {
        ByteBuffer byteBuffer = this.f29340a;
        int i4 = this.f29341b - 2;
        this.f29341b = i4;
        byteBuffer.putShort(i4, s4);
    }

    public void b(int i4, boolean z4, boolean z5) {
        if (this.f29351l || z4 != z5) {
            c(z4);
            f0(i4);
        }
    }

    public void b0(int i4, int i5) {
        int capacity = this.f29340a.capacity() - i4;
        if (this.f29340a.getShort((capacity - this.f29340a.getInt(capacity)) + i5) == 0) {
            throw new AssertionError(r2.a("FlatBuffers: field ", i5, " must be set"));
        }
    }

    public void c(boolean z4) {
        T(1, 0);
        U(z4);
    }

    public byte[] c0() {
        return d0(this.f29341b, this.f29340a.capacity() - this.f29341b);
    }

    public void d(byte b5) {
        T(1, 0);
        V(b5);
    }

    public byte[] d0(int i4, int i5) {
        L();
        byte[] bArr = new byte[i5];
        this.f29340a.position(i4);
        this.f29340a.get(bArr);
        return bArr;
    }

    public void e(int i4, byte b5, int i5) {
        if (this.f29351l || b5 != i5) {
            d(b5);
            f0(i4);
        }
    }

    public InputStream e0() {
        L();
        ByteBuffer duplicate = this.f29340a.duplicate();
        duplicate.position(this.f29341b);
        duplicate.limit(this.f29340a.capacity());
        return new a(duplicate);
    }

    public void f(double d5) {
        T(8, 0);
        W(d5);
    }

    public void f0(int i4) {
        this.f29343d[i4] = R();
    }

    public void g(int i4, double d5, double d6) {
        if (this.f29351l || d5 != d6) {
            f(d5);
            f0(i4);
        }
    }

    public void g0(int i4) {
        Q();
        int[] iArr = this.f29343d;
        if (iArr == null || iArr.length < i4) {
            this.f29343d = new int[i4];
        }
        this.f29344e = i4;
        Arrays.fill(this.f29343d, 0, i4, 0);
        this.f29345f = true;
        this.f29347h = R();
    }

    public void h(float f4) {
        T(4, 0);
        X(f4);
    }

    public void h0(int i4, int i5, int i6) {
        Q();
        this.f29350k = i5;
        int i7 = i4 * i5;
        T(4, i7);
        T(i6, i7);
        this.f29345f = true;
    }

    public void i(int i4, float f4, double d5) {
        if (this.f29351l || f4 != d5) {
            h(f4);
            f0(i4);
        }
    }

    public void j(int i4) {
        T(4, 0);
        Y(i4);
    }

    public void k(int i4, int i5, int i6) {
        if (this.f29351l || i5 != i6) {
            j(i5);
            f0(i4);
        }
    }

    public void l(int i4, long j4, long j5) {
        if (this.f29351l || j4 != j5) {
            m(j4);
            f0(i4);
        }
    }

    public void m(long j4) {
        T(8, 0);
        Z(j4);
    }

    public void n(int i4) {
        T(4, 0);
        Y((R() - i4) + 4);
    }

    public void o(int i4, int i5, int i6) {
        if (this.f29351l || i5 != i6) {
            n(i5);
            f0(i4);
        }
    }

    public void p(int i4, short s4, int i5) {
        if (this.f29351l || s4 != i5) {
            q(s4);
            f0(i4);
        }
    }

    public void q(short s4) {
        T(2, 0);
        a0(s4);
    }

    public void r(int i4, int i5, int i6) {
        if (i5 != i6) {
            a(i5);
            f0(i4);
        }
    }

    public void s() {
        this.f29341b = this.f29340a.capacity();
        this.f29340a.clear();
        this.f29342c = 1;
        while (true) {
            int i4 = this.f29344e;
            if (i4 <= 0) {
                this.f29344e = 0;
                this.f29345f = false;
                this.f29346g = false;
                this.f29347h = 0;
                this.f29349j = 0;
                this.f29350k = 0;
                return;
            }
            int[] iArr = this.f29343d;
            int i5 = i4 - 1;
            this.f29344e = i5;
            iArr[i5] = 0;
        }
    }

    public int t(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f29340a;
        int i4 = this.f29341b - remaining;
        this.f29341b = i4;
        byteBuffer2.position(i4);
        this.f29340a.put(byteBuffer);
        return E();
    }

    public int u(byte[] bArr) {
        int length = bArr.length;
        h0(1, length, 1);
        ByteBuffer byteBuffer = this.f29340a;
        int i4 = this.f29341b - length;
        this.f29341b = i4;
        byteBuffer.position(i4);
        this.f29340a.put(bArr);
        return E();
    }

    public int v(byte[] bArr, int i4, int i5) {
        h0(1, i5, 1);
        ByteBuffer byteBuffer = this.f29340a;
        int i6 = this.f29341b - i5;
        this.f29341b = i6;
        byteBuffer.position(i6);
        this.f29340a.put(bArr, i4, i5);
        return E();
    }

    public <T extends u> int w(T t4, int[] iArr) {
        t4.t(iArr, this.f29340a);
        return A(iArr);
    }

    public int x(CharSequence charSequence) {
        int c5 = this.f29353n.c(charSequence);
        d((byte) 0);
        h0(1, c5, 1);
        ByteBuffer byteBuffer = this.f29340a;
        int i4 = this.f29341b - c5;
        this.f29341b = i4;
        byteBuffer.position(i4);
        this.f29353n.b(charSequence, this.f29340a);
        return E();
    }

    public int y(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        d((byte) 0);
        h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f29340a;
        int i4 = this.f29341b - remaining;
        this.f29341b = i4;
        byteBuffer2.position(i4);
        this.f29340a.put(byteBuffer);
        return E();
    }

    public ByteBuffer z(int i4, int i5, int i6) {
        int i7 = i4 * i5;
        h0(i4, i5, i6);
        ByteBuffer byteBuffer = this.f29340a;
        int i10 = this.f29341b - i7;
        this.f29341b = i10;
        byteBuffer.position(i10);
        ByteBuffer order = this.f29340a.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i7);
        return order;
    }

    public i(int i4, b bVar, ByteBuffer byteBuffer, w wVar) {
        this.f29342c = 1;
        this.f29343d = null;
        this.f29344e = 0;
        this.f29345f = false;
        this.f29346g = false;
        this.f29348i = new int[16];
        this.f29349j = 0;
        this.f29350k = 0;
        this.f29351l = false;
        i4 = i4 <= 0 ? 1 : i4;
        this.f29352m = bVar;
        if (byteBuffer != null) {
            this.f29340a = byteBuffer;
            byteBuffer.clear();
            this.f29340a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f29340a = bVar.a(i4);
        }
        this.f29353n = wVar;
        this.f29341b = this.f29340a.capacity();
    }

    public i(int i4) {
        this(i4, c.f29355a, null, w.d());
    }

    public i() {
        this(1024);
    }

    public i(ByteBuffer byteBuffer, b bVar) {
        this(byteBuffer.capacity(), bVar, byteBuffer, w.d());
    }

    public i(ByteBuffer byteBuffer) {
        this(byteBuffer, new c());
    }
}
