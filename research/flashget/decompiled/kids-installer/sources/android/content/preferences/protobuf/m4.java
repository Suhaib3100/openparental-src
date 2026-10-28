package android.content.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil.java */
/* loaded from: classes.dex */
final class m4 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f7370a = Logger.getLogger(m4.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f7371b = R();

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f7372c = android.content.preferences.protobuf.e.b();

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f7373d = q(Long.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f7374e = q(Integer.TYPE);

    /* renamed from: f, reason: collision with root package name */
    private static final e f7375f = N();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f7376g = t0();

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f7377h = s0();

    /* renamed from: i, reason: collision with root package name */
    static final long f7378i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f7379j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f7380k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f7381l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f7382m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f7383n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f7384o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f7385p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f7386q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f7387r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f7388s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f7389t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f7390u;

    /* renamed from: v, reason: collision with root package name */
    private static final long f7391v;

    /* renamed from: w, reason: collision with root package name */
    private static final int f7392w = 8;

    /* renamed from: x, reason: collision with root package name */
    private static final int f7393x = 7;

    /* renamed from: y, reason: collision with root package name */
    private static final int f7394y;

    /* renamed from: z, reason: collision with root package name */
    static final boolean f7395z;

    /* compiled from: UnsafeUtil.java */
    static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes3.dex */
    private static final class b extends e {

        /* renamed from: b, reason: collision with root package name */
        private static final long f7396b = -1;

        b(Unsafe unsafe) {
            super(unsafe);
        }

        private static int A(long j5) {
            return (int) (j5 & (-1));
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void c(long j5, byte[] bArr, long j6, long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void d(byte[] bArr, long j5, long j6, long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public boolean e(Object obj, long j5) {
            return m4.f7395z ? m4.w(obj, j5) : m4.x(obj, j5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public byte f(long j5) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public byte g(Object obj, long j5) {
            return m4.f7395z ? m4.B(obj, j5) : m4.C(obj, j5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public double h(Object obj, long j5) {
            return Double.longBitsToDouble(m(obj, j5));
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public float i(Object obj, long j5) {
            return Float.intBitsToFloat(k(obj, j5));
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public int j(long j5) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public long l(long j5) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void q(Object obj, long j5, boolean z5) {
            if (m4.f7395z) {
                m4.g(obj, j5, z5);
            } else {
                m4.h(obj, j5, z5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void r(long j5, byte b6) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void s(Object obj, long j5, byte b6) {
            if (m4.f7395z) {
                m4.e0(obj, j5, b6);
            } else {
                m4.f0(obj, j5, b6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void t(Object obj, long j5, double d6) {
            y(obj, j5, Double.doubleToLongBits(d6));
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void u(Object obj, long j5, float f6) {
            w(obj, j5, Float.floatToIntBits(f6));
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void v(long j5, int i5) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void x(long j5, long j6) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes3.dex */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void c(long j5, byte[] bArr, long j6, long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void d(byte[] bArr, long j5, long j6, long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public boolean e(Object obj, long j5) {
            return m4.f7395z ? m4.w(obj, j5) : m4.x(obj, j5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public byte f(long j5) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public byte g(Object obj, long j5) {
            return m4.f7395z ? m4.B(obj, j5) : m4.C(obj, j5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public double h(Object obj, long j5) {
            return Double.longBitsToDouble(m(obj, j5));
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public float i(Object obj, long j5) {
            return Float.intBitsToFloat(k(obj, j5));
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public int j(long j5) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public long l(long j5) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void q(Object obj, long j5, boolean z5) {
            if (m4.f7395z) {
                m4.g(obj, j5, z5);
            } else {
                m4.h(obj, j5, z5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void r(long j5, byte b6) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void s(Object obj, long j5, byte b6) {
            if (m4.f7395z) {
                m4.e0(obj, j5, b6);
            } else {
                m4.f0(obj, j5, b6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void t(Object obj, long j5, double d6) {
            y(obj, j5, Double.doubleToLongBits(d6));
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void u(Object obj, long j5, float f6) {
            w(obj, j5, Float.floatToIntBits(f6));
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void v(long j5, int i5) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void x(long j5, long j6) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes3.dex */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void c(long j5, byte[] bArr, long j6, long j7) {
            this.f7397a.copyMemory((Object) null, j5, bArr, m4.f7378i + j6, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void d(byte[] bArr, long j5, long j6, long j7) {
            this.f7397a.copyMemory(bArr, m4.f7378i + j5, (Object) null, j6, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public boolean e(Object obj, long j5) {
            return this.f7397a.getBoolean(obj, j5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public byte f(long j5) {
            return this.f7397a.getByte(j5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public byte g(Object obj, long j5) {
            return this.f7397a.getByte(obj, j5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public double h(Object obj, long j5) {
            return this.f7397a.getDouble(obj, j5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public float i(Object obj, long j5) {
            return this.f7397a.getFloat(obj, j5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public int j(long j5) {
            return this.f7397a.getInt(j5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public long l(long j5) {
            return this.f7397a.getLong(j5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public Object o(Field field) {
            return n(this.f7397a.staticFieldBase(field), this.f7397a.staticFieldOffset(field));
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void q(Object obj, long j5, boolean z5) {
            this.f7397a.putBoolean(obj, j5, z5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void r(long j5, byte b6) {
            this.f7397a.putByte(j5, b6);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void s(Object obj, long j5, byte b6) {
            this.f7397a.putByte(obj, j5, b6);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void t(Object obj, long j5, double d6) {
            this.f7397a.putDouble(obj, j5, d6);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void u(Object obj, long j5, float f6) {
            this.f7397a.putFloat(obj, j5, f6);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void v(long j5, int i5) {
            this.f7397a.putInt(j5, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.m4.e
        public void x(long j5, long j6) {
            this.f7397a.putLong(j5, j6);
        }
    }

    /* compiled from: UnsafeUtil.java */
    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f7397a;

        e(Unsafe unsafe) {
            this.f7397a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f7397a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f7397a.arrayIndexScale(cls);
        }

        public abstract void c(long j5, byte[] bArr, long j6, long j7);

        public abstract void d(byte[] bArr, long j5, long j6, long j7);

        public abstract boolean e(Object obj, long j5);

        public abstract byte f(long j5);

        public abstract byte g(Object obj, long j5);

        public abstract double h(Object obj, long j5);

        public abstract float i(Object obj, long j5);

        public abstract int j(long j5);

        public final int k(Object obj, long j5) {
            return this.f7397a.getInt(obj, j5);
        }

        public abstract long l(long j5);

        public final long m(Object obj, long j5) {
            return this.f7397a.getLong(obj, j5);
        }

        public final Object n(Object obj, long j5) {
            return this.f7397a.getObject(obj, j5);
        }

        public abstract Object o(Field field);

        public final long p(Field field) {
            return this.f7397a.objectFieldOffset(field);
        }

        public abstract void q(Object obj, long j5, boolean z5);

        public abstract void r(long j5, byte b6);

        public abstract void s(Object obj, long j5, byte b6);

        public abstract void t(Object obj, long j5, double d6);

        public abstract void u(Object obj, long j5, float f6);

        public abstract void v(long j5, int i5);

        public final void w(Object obj, long j5, int i5) {
            this.f7397a.putInt(obj, j5, i5);
        }

        public abstract void x(long j5, long j6);

        public final void y(Object obj, long j5, long j6) {
            this.f7397a.putLong(obj, j5, j6);
        }

        public final void z(Object obj, long j5, Object obj2) {
            this.f7397a.putObject(obj, j5, obj2);
        }
    }

    static {
        long k5 = k(byte[].class);
        f7378i = k5;
        f7379j = k(boolean[].class);
        f7380k = l(boolean[].class);
        f7381l = k(int[].class);
        f7382m = l(int[].class);
        f7383n = k(long[].class);
        f7384o = l(long[].class);
        f7385p = k(float[].class);
        f7386q = l(float[].class);
        f7387r = k(double[].class);
        f7388s = l(double[].class);
        f7389t = k(Object[].class);
        f7390u = l(Object[].class);
        f7391v = s(m());
        f7394y = (int) (k5 & 7);
        f7395z = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private m4() {
    }

    static byte A(byte[] bArr, long j5) {
        return f7375f.g(bArr, f7378i + j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte B(Object obj, long j5) {
        return (byte) ((I(obj, (-4) & j5) >>> ((int) (((~j5) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte C(Object obj, long j5) {
        return (byte) ((I(obj, (-4) & j5) >>> ((int) ((j5 & 3) << 3))) & 255);
    }

    static double D(Object obj, long j5) {
        return f7375f.h(obj, j5);
    }

    static double E(double[] dArr, long j5) {
        return f7375f.h(dArr, (j5 * f7388s) + f7387r);
    }

    static float F(Object obj, long j5) {
        return f7375f.i(obj, j5);
    }

    static float G(float[] fArr, long j5) {
        return f7375f.i(fArr, (j5 * f7386q) + f7385p);
    }

    static int H(long j5) {
        return f7375f.j(j5);
    }

    static int I(Object obj, long j5) {
        return f7375f.k(obj, j5);
    }

    static int J(int[] iArr, long j5) {
        return f7375f.k(iArr, (j5 * f7382m) + f7381l);
    }

    static long K(long j5) {
        return f7375f.l(j5);
    }

    static long L(Object obj, long j5) {
        return f7375f.m(obj, j5);
    }

    static long M(long[] jArr, long j5) {
        return f7375f.m(jArr, (j5 * f7384o) + f7383n);
    }

    private static e N() {
        Unsafe unsafe = f7371b;
        if (unsafe == null) {
            return null;
        }
        if (!android.content.preferences.protobuf.e.c()) {
            return new d(unsafe);
        }
        if (f7373d) {
            return new c(unsafe);
        }
        if (f7374e) {
            return new b(unsafe);
        }
        return null;
    }

    static Object O(Object obj, long j5) {
        return f7375f.n(obj, j5);
    }

    static Object P(Object[] objArr, long j5) {
        return f7375f.n(objArr, (j5 * f7390u) + f7389t);
    }

    static Object Q(Field field) {
        return f7375f.o(field);
    }

    static Unsafe R() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean S() {
        return f7377h;
    }

    static boolean T() {
        return f7376g;
    }

    static boolean U() {
        return f7373d;
    }

    static int V(byte[] bArr, int i5, byte[] bArr2, int i6, int i7) {
        if (i5 < 0 || i6 < 0 || i7 < 0 || i5 + i7 > bArr.length || i6 + i7 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i8 = 0;
        if (f7377h) {
            for (int i9 = (f7394y + i5) & 7; i8 < i7 && (i9 & 7) != 0; i9++) {
                if (bArr[i5 + i8] != bArr2[i6 + i8]) {
                    return i8;
                }
                i8++;
            }
            int i10 = ((i7 - i8) & (-8)) + i8;
            while (i8 < i10) {
                long j5 = f7378i;
                long j6 = i8;
                long L = L(bArr, i5 + j5 + j6);
                long L2 = L(bArr2, j5 + i6 + j6);
                if (L != L2) {
                    return i8 + t(L, L2);
                }
                i8 += 8;
            }
        }
        while (i8 < i7) {
            if (bArr[i5 + i8] != bArr2[i6 + i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    static long W(Field field) {
        return f7375f.p(field);
    }

    static void X(Object obj, long j5, boolean z5) {
        f7375f.q(obj, j5, z5);
    }

    static void Y(boolean[] zArr, long j5, boolean z5) {
        f7375f.q(zArr, (j5 * f7380k) + f7379j, z5);
    }

    private static void Z(Object obj, long j5, boolean z5) {
        e0(obj, j5, z5 ? (byte) 1 : (byte) 0);
    }

    private static void a0(Object obj, long j5, boolean z5) {
        f0(obj, j5, z5 ? (byte) 1 : (byte) 0);
    }

    static void b0(long j5, byte b6) {
        f7375f.r(j5, b6);
    }

    static void c0(Object obj, long j5, byte b6) {
        f7375f.s(obj, j5, b6);
    }

    static void d0(byte[] bArr, long j5, byte b6) {
        f7375f.s(bArr, f7378i + j5, b6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e0(Object obj, long j5, byte b6) {
        long j6 = (-4) & j5;
        int I = I(obj, j6);
        int i5 = ((~((int) j5)) & 3) << 3;
        l0(obj, j6, ((255 & b6) << i5) | (I & (~(255 << i5))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f0(Object obj, long j5, byte b6) {
        long j6 = (-4) & j5;
        int i5 = (((int) j5) & 3) << 3;
        l0(obj, j6, ((255 & b6) << i5) | (I(obj, j6) & (~(255 << i5))));
    }

    static void g(Object obj, long j5, boolean z5) {
        e0(obj, j5, z5 ? (byte) 1 : (byte) 0);
    }

    static void g0(Object obj, long j5, double d6) {
        f7375f.t(obj, j5, d6);
    }

    static void h(Object obj, long j5, boolean z5) {
        f0(obj, j5, z5 ? (byte) 1 : (byte) 0);
    }

    static void h0(double[] dArr, long j5, double d6) {
        f7375f.t(dArr, (j5 * f7388s) + f7387r, d6);
    }

    static long i(ByteBuffer byteBuffer) {
        return f7375f.m(byteBuffer, f7391v);
    }

    static void i0(Object obj, long j5, float f6) {
        f7375f.u(obj, j5, f6);
    }

    static <T> T j(Class<T> cls) {
        try {
            return (T) f7371b.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    static void j0(float[] fArr, long j5, float f6) {
        f7375f.u(fArr, (j5 * f7386q) + f7385p, f6);
    }

    private static int k(Class<?> cls) {
        if (f7377h) {
            return f7375f.a(cls);
        }
        return -1;
    }

    static void k0(long j5, int i5) {
        f7375f.v(j5, i5);
    }

    private static int l(Class<?> cls) {
        if (f7377h) {
            return f7375f.b(cls);
        }
        return -1;
    }

    static void l0(Object obj, long j5, int i5) {
        f7375f.w(obj, j5, i5);
    }

    private static Field m() {
        Field r5;
        if (android.content.preferences.protobuf.e.c() && (r5 = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return r5;
        }
        Field r6 = r(Buffer.class, "address");
        if (r6 == null || r6.getType() != Long.TYPE) {
            return null;
        }
        return r6;
    }

    static void m0(int[] iArr, long j5, int i5) {
        f7375f.w(iArr, (j5 * f7382m) + f7381l, i5);
    }

    static void n(long j5, byte[] bArr, long j6, long j7) {
        f7375f.c(j5, bArr, j6, j7);
    }

    static void n0(long j5, long j6) {
        f7375f.x(j5, j6);
    }

    static void o(byte[] bArr, long j5, long j6, long j7) {
        f7375f.d(bArr, j5, j6, j7);
    }

    static void o0(Object obj, long j5, long j6) {
        f7375f.y(obj, j5, j6);
    }

    static void p(byte[] bArr, long j5, byte[] bArr2, long j6, long j7) {
        System.arraycopy(bArr, (int) j5, bArr2, (int) j6, (int) j7);
    }

    static void p0(long[] jArr, long j5, long j6) {
        f7375f.y(jArr, (j5 * f7384o) + f7383n, j6);
    }

    private static boolean q(Class<?> cls) {
        if (!android.content.preferences.protobuf.e.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f7372c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static void q0(Object obj, long j5, Object obj2) {
        f7375f.z(obj, j5, obj2);
    }

    private static Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void r0(Object[] objArr, long j5, Object obj) {
        f7375f.z(objArr, (j5 * f7390u) + f7389t, obj);
    }

    private static long s(Field field) {
        e eVar;
        if (field == null || (eVar = f7375f) == null) {
            return -1L;
        }
        return eVar.p(field);
    }

    private static boolean s0() {
        Unsafe unsafe = f7371b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (android.content.preferences.protobuf.e.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            f7370a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static int t(long j5, long j6) {
        return (f7395z ? Long.numberOfLeadingZeros(j5 ^ j6) : Long.numberOfTrailingZeros(j5 ^ j6)) >> 3;
    }

    private static boolean t0() {
        Unsafe unsafe = f7371b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m() == null) {
                return false;
            }
            if (android.content.preferences.protobuf.e.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            f7370a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    static boolean u(Object obj, long j5) {
        return f7375f.e(obj, j5);
    }

    static boolean v(boolean[] zArr, long j5) {
        return f7375f.e(zArr, (j5 * f7380k) + f7379j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w(Object obj, long j5) {
        return B(obj, j5) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean x(Object obj, long j5) {
        return C(obj, j5) != 0;
    }

    static byte y(long j5) {
        return f7375f.f(j5);
    }

    static byte z(Object obj, long j5) {
        return f7375f.g(obj, j5);
    }
}
