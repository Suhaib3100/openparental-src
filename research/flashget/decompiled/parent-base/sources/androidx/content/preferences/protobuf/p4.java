package androidx.content.preferences.protobuf;

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
/* loaded from: classes3.dex */
final class p4 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f28887a = Logger.getLogger(p4.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f28888b = R();

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f28889c = androidx.content.preferences.protobuf.e.b();

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f28890d = q(Long.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f28891e = q(Integer.TYPE);

    /* renamed from: f, reason: collision with root package name */
    private static final e f28892f = N();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f28893g = t0();

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f28894h = s0();

    /* renamed from: i, reason: collision with root package name */
    static final long f28895i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f28896j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f28897k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f28898l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f28899m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f28900n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f28901o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f28902p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f28903q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f28904r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f28905s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f28906t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f28907u;

    /* renamed from: v, reason: collision with root package name */
    private static final long f28908v;

    /* renamed from: w, reason: collision with root package name */
    private static final int f28909w = 8;

    /* renamed from: x, reason: collision with root package name */
    private static final int f28910x = 7;

    /* renamed from: y, reason: collision with root package name */
    private static final int f28911y;

    /* renamed from: z, reason: collision with root package name */
    static final boolean f28912z;

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
    private static final class b extends e {

        /* renamed from: b, reason: collision with root package name */
        private static final long f28913b = -1;

        b(Unsafe unsafe) {
            super(unsafe);
        }

        private static int A(long j4) {
            return (int) j4;
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void c(long j4, byte[] bArr, long j5, long j6) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void d(byte[] bArr, long j4, long j5, long j6) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public boolean e(Object obj, long j4) {
            return p4.f28912z ? p4.w(obj, j4) : p4.x(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public byte f(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public byte g(Object obj, long j4) {
            return p4.f28912z ? p4.B(obj, j4) : p4.C(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public double h(Object obj, long j4) {
            return Double.longBitsToDouble(m(obj, j4));
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public float i(Object obj, long j4) {
            return Float.intBitsToFloat(k(obj, j4));
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public int j(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public long l(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void q(Object obj, long j4, boolean z4) {
            if (p4.f28912z) {
                p4.g(obj, j4, z4);
            } else {
                p4.h(obj, j4, z4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void r(long j4, byte b5) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void s(Object obj, long j4, byte b5) {
            if (p4.f28912z) {
                p4.e0(obj, j4, b5);
            } else {
                p4.f0(obj, j4, b5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void t(Object obj, long j4, double d5) {
            y(obj, j4, Double.doubleToLongBits(d5));
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void u(Object obj, long j4, float f4) {
            w(obj, j4, Float.floatToIntBits(f4));
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void v(long j4, int i4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void x(long j4, long j5) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnsafeUtil.java */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void c(long j4, byte[] bArr, long j5, long j6) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void d(byte[] bArr, long j4, long j5, long j6) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public boolean e(Object obj, long j4) {
            return p4.f28912z ? p4.w(obj, j4) : p4.x(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public byte f(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public byte g(Object obj, long j4) {
            return p4.f28912z ? p4.B(obj, j4) : p4.C(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public double h(Object obj, long j4) {
            return Double.longBitsToDouble(m(obj, j4));
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public float i(Object obj, long j4) {
            return Float.intBitsToFloat(k(obj, j4));
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public int j(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public long l(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void q(Object obj, long j4, boolean z4) {
            if (p4.f28912z) {
                p4.g(obj, j4, z4);
            } else {
                p4.h(obj, j4, z4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void r(long j4, byte b5) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void s(Object obj, long j4, byte b5) {
            if (p4.f28912z) {
                p4.e0(obj, j4, b5);
            } else {
                p4.f0(obj, j4, b5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void t(Object obj, long j4, double d5) {
            y(obj, j4, Double.doubleToLongBits(d5));
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void u(Object obj, long j4, float f4) {
            w(obj, j4, Float.floatToIntBits(f4));
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void v(long j4, int i4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void x(long j4, long j5) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnsafeUtil.java */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void c(long j4, byte[] bArr, long j5, long j6) {
            this.f28914a.copyMemory((Object) null, j4, bArr, p4.f28895i + j5, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void d(byte[] bArr, long j4, long j5, long j6) {
            this.f28914a.copyMemory(bArr, p4.f28895i + j4, (Object) null, j5, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public boolean e(Object obj, long j4) {
            return this.f28914a.getBoolean(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public byte f(long j4) {
            return this.f28914a.getByte(j4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public byte g(Object obj, long j4) {
            return this.f28914a.getByte(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public double h(Object obj, long j4) {
            return this.f28914a.getDouble(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public float i(Object obj, long j4) {
            return this.f28914a.getFloat(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public int j(long j4) {
            return this.f28914a.getInt(j4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public long l(long j4) {
            return this.f28914a.getLong(j4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public Object o(Field field) {
            return n(this.f28914a.staticFieldBase(field), this.f28914a.staticFieldOffset(field));
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void q(Object obj, long j4, boolean z4) {
            this.f28914a.putBoolean(obj, j4, z4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void r(long j4, byte b5) {
            this.f28914a.putByte(j4, b5);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void s(Object obj, long j4, byte b5) {
            this.f28914a.putByte(obj, j4, b5);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void t(Object obj, long j4, double d5) {
            this.f28914a.putDouble(obj, j4, d5);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void u(Object obj, long j4, float f4) {
            this.f28914a.putFloat(obj, j4, f4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void v(long j4, int i4) {
            this.f28914a.putInt(j4, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.p4.e
        public void x(long j4, long j5) {
            this.f28914a.putLong(j4, j5);
        }
    }

    /* compiled from: UnsafeUtil.java */
    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f28914a;

        e(Unsafe unsafe) {
            this.f28914a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f28914a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f28914a.arrayIndexScale(cls);
        }

        public abstract void c(long j4, byte[] bArr, long j5, long j6);

        public abstract void d(byte[] bArr, long j4, long j5, long j6);

        public abstract boolean e(Object obj, long j4);

        public abstract byte f(long j4);

        public abstract byte g(Object obj, long j4);

        public abstract double h(Object obj, long j4);

        public abstract float i(Object obj, long j4);

        public abstract int j(long j4);

        public final int k(Object obj, long j4) {
            return this.f28914a.getInt(obj, j4);
        }

        public abstract long l(long j4);

        public final long m(Object obj, long j4) {
            return this.f28914a.getLong(obj, j4);
        }

        public final Object n(Object obj, long j4) {
            return this.f28914a.getObject(obj, j4);
        }

        public abstract Object o(Field field);

        public final long p(Field field) {
            return this.f28914a.objectFieldOffset(field);
        }

        public abstract void q(Object obj, long j4, boolean z4);

        public abstract void r(long j4, byte b5);

        public abstract void s(Object obj, long j4, byte b5);

        public abstract void t(Object obj, long j4, double d5);

        public abstract void u(Object obj, long j4, float f4);

        public abstract void v(long j4, int i4);

        public final void w(Object obj, long j4, int i4) {
            this.f28914a.putInt(obj, j4, i4);
        }

        public abstract void x(long j4, long j5);

        public final void y(Object obj, long j4, long j5) {
            this.f28914a.putLong(obj, j4, j5);
        }

        public final void z(Object obj, long j4, Object obj2) {
            this.f28914a.putObject(obj, j4, obj2);
        }
    }

    static {
        long k4 = k(byte[].class);
        f28895i = k4;
        f28896j = k(boolean[].class);
        f28897k = l(boolean[].class);
        f28898l = k(int[].class);
        f28899m = l(int[].class);
        f28900n = k(long[].class);
        f28901o = l(long[].class);
        f28902p = k(float[].class);
        f28903q = l(float[].class);
        f28904r = k(double[].class);
        f28905s = l(double[].class);
        f28906t = k(Object[].class);
        f28907u = l(Object[].class);
        f28908v = s(m());
        f28911y = (int) (k4 & 7);
        f28912z = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private p4() {
    }

    static byte A(byte[] bArr, long j4) {
        return f28892f.g(bArr, f28895i + j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte B(Object obj, long j4) {
        return (byte) ((f28892f.k(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte C(Object obj, long j4) {
        return (byte) ((f28892f.k(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255);
    }

    static double D(Object obj, long j4) {
        return f28892f.h(obj, j4);
    }

    static double E(double[] dArr, long j4) {
        return f28892f.h(dArr, (j4 * f28905s) + f28904r);
    }

    static float F(Object obj, long j4) {
        return f28892f.i(obj, j4);
    }

    static float G(float[] fArr, long j4) {
        return f28892f.i(fArr, (j4 * f28903q) + f28902p);
    }

    static int H(long j4) {
        return f28892f.j(j4);
    }

    static int I(Object obj, long j4) {
        return f28892f.k(obj, j4);
    }

    static int J(int[] iArr, long j4) {
        return f28892f.k(iArr, (j4 * f28899m) + f28898l);
    }

    static long K(long j4) {
        return f28892f.l(j4);
    }

    static long L(Object obj, long j4) {
        return f28892f.m(obj, j4);
    }

    static long M(long[] jArr, long j4) {
        return f28892f.m(jArr, (j4 * f28901o) + f28900n);
    }

    private static e N() {
        Unsafe unsafe = f28888b;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.content.preferences.protobuf.e.c()) {
            return new d(unsafe);
        }
        if (f28890d) {
            return new c(unsafe);
        }
        if (f28891e) {
            return new b(unsafe);
        }
        return null;
    }

    static Object O(Object obj, long j4) {
        return f28892f.n(obj, j4);
    }

    static Object P(Object[] objArr, long j4) {
        return f28892f.n(objArr, (j4 * f28907u) + f28906t);
    }

    static Object Q(Field field) {
        return f28892f.o(field);
    }

    static Unsafe R() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean S() {
        return f28894h;
    }

    static boolean T() {
        return f28893g;
    }

    static boolean U() {
        return f28890d;
    }

    static int V(byte[] bArr, int i4, byte[] bArr2, int i5, int i6) {
        if (i4 < 0 || i5 < 0 || i6 < 0 || i4 + i6 > bArr.length || i5 + i6 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i7 = 0;
        if (f28894h) {
            for (int i10 = (f28911y + i4) & 7; i7 < i6 && (i10 & 7) != 0; i10++) {
                if (bArr[i4 + i7] != bArr2[i5 + i7]) {
                    return i7;
                }
                i7++;
            }
            int i11 = ((i6 - i7) & (-8)) + i7;
            while (i7 < i11) {
                long j4 = f28895i;
                long j5 = i7;
                e eVar = f28892f;
                long m4 = eVar.m(bArr, i4 + j4 + j5);
                long m5 = eVar.m(bArr2, j4 + i5 + j5);
                if (m4 != m5) {
                    return i7 + t(m4, m5);
                }
                i7 += 8;
            }
        }
        while (i7 < i6) {
            if (bArr[i4 + i7] != bArr2[i5 + i7]) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    static long W(Field field) {
        return f28892f.p(field);
    }

    static void X(Object obj, long j4, boolean z4) {
        f28892f.q(obj, j4, z4);
    }

    static void Y(boolean[] zArr, long j4, boolean z4) {
        f28892f.q(zArr, (j4 * f28897k) + f28896j, z4);
    }

    private static void Z(Object obj, long j4, boolean z4) {
        e0(obj, j4, z4 ? (byte) 1 : (byte) 0);
    }

    private static void a0(Object obj, long j4, boolean z4) {
        f0(obj, j4, z4 ? (byte) 1 : (byte) 0);
    }

    static void b0(long j4, byte b5) {
        f28892f.r(j4, b5);
    }

    static void c0(Object obj, long j4, byte b5) {
        f28892f.s(obj, j4, b5);
    }

    static void d0(byte[] bArr, long j4, byte b5) {
        f28892f.s(bArr, f28895i + j4, b5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e0(Object obj, long j4, byte b5) {
        long j5 = (-4) & j4;
        int k4 = f28892f.k(obj, j5);
        int i4 = ((~((int) j4)) & 3) << 3;
        l0(obj, j5, ((255 & b5) << i4) | (k4 & (~(255 << i4))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f0(Object obj, long j4, byte b5) {
        long j5 = (-4) & j4;
        int i4 = (((int) j4) & 3) << 3;
        l0(obj, j5, ((255 & b5) << i4) | (f28892f.k(obj, j5) & (~(255 << i4))));
    }

    static void g(Object obj, long j4, boolean z4) {
        e0(obj, j4, z4 ? (byte) 1 : (byte) 0);
    }

    static void g0(Object obj, long j4, double d5) {
        f28892f.t(obj, j4, d5);
    }

    static void h(Object obj, long j4, boolean z4) {
        f0(obj, j4, z4 ? (byte) 1 : (byte) 0);
    }

    static void h0(double[] dArr, long j4, double d5) {
        f28892f.t(dArr, (j4 * f28905s) + f28904r, d5);
    }

    static long i(ByteBuffer byteBuffer) {
        return f28892f.m(byteBuffer, f28908v);
    }

    static void i0(Object obj, long j4, float f4) {
        f28892f.u(obj, j4, f4);
    }

    static <T> T j(Class<T> cls) {
        try {
            return (T) f28888b.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    static void j0(float[] fArr, long j4, float f4) {
        f28892f.u(fArr, (j4 * f28903q) + f28902p, f4);
    }

    private static int k(Class<?> cls) {
        if (f28894h) {
            return f28892f.a(cls);
        }
        return -1;
    }

    static void k0(long j4, int i4) {
        f28892f.v(j4, i4);
    }

    private static int l(Class<?> cls) {
        if (f28894h) {
            return f28892f.b(cls);
        }
        return -1;
    }

    static void l0(Object obj, long j4, int i4) {
        f28892f.w(obj, j4, i4);
    }

    private static Field m() {
        Field r4;
        if (androidx.content.preferences.protobuf.e.c() && (r4 = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return r4;
        }
        Field r5 = r(Buffer.class, "address");
        if (r5 == null || r5.getType() != Long.TYPE) {
            return null;
        }
        return r5;
    }

    static void m0(int[] iArr, long j4, int i4) {
        f28892f.w(iArr, (j4 * f28899m) + f28898l, i4);
    }

    static void n(long j4, byte[] bArr, long j5, long j6) {
        f28892f.c(j4, bArr, j5, j6);
    }

    static void n0(long j4, long j5) {
        f28892f.x(j4, j5);
    }

    static void o(byte[] bArr, long j4, long j5, long j6) {
        f28892f.d(bArr, j4, j5, j6);
    }

    static void o0(Object obj, long j4, long j5) {
        f28892f.y(obj, j4, j5);
    }

    static void p(byte[] bArr, long j4, byte[] bArr2, long j5, long j6) {
        System.arraycopy(bArr, (int) j4, bArr2, (int) j5, (int) j6);
    }

    static void p0(long[] jArr, long j4, long j5) {
        f28892f.y(jArr, (j4 * f28901o) + f28900n, j5);
    }

    private static boolean q(Class<?> cls) {
        if (!androidx.content.preferences.protobuf.e.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f28889c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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

    static void q0(Object obj, long j4, Object obj2) {
        f28892f.z(obj, j4, obj2);
    }

    private static Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void r0(Object[] objArr, long j4, Object obj) {
        f28892f.z(objArr, (j4 * f28907u) + f28906t, obj);
    }

    private static long s(Field field) {
        e eVar;
        if (field == null || (eVar = f28892f) == null) {
            return -1L;
        }
        return eVar.p(field);
    }

    private static boolean s0() {
        Unsafe unsafe = f28888b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (androidx.content.preferences.protobuf.e.c()) {
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
            f28887a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static int t(long j4, long j5) {
        return (f28912z ? Long.numberOfLeadingZeros(j4 ^ j5) : Long.numberOfTrailingZeros(j4 ^ j5)) >> 3;
    }

    private static boolean t0() {
        Unsafe unsafe = f28888b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m() == null) {
                return false;
            }
            if (androidx.content.preferences.protobuf.e.c()) {
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
            f28887a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    static boolean u(Object obj, long j4) {
        return f28892f.e(obj, j4);
    }

    static boolean v(boolean[] zArr, long j4) {
        return f28892f.e(zArr, (j4 * f28897k) + f28896j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w(Object obj, long j4) {
        return B(obj, j4) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean x(Object obj, long j4) {
        return C(obj, j4) != 0;
    }

    static byte y(long j4) {
        return f28892f.f(j4);
    }

    static byte z(Object obj, long j4) {
        return f28892f.g(obj, j4);
    }
}
