package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* compiled from: Striped64.java */
@k
@d9.c
/* loaded from: classes6.dex */
abstract class i0 extends Number {

    /* renamed from: e, reason: collision with root package name */
    static final ThreadLocal<int[]> f56976e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    static final Random f56977f = new Random();

    /* renamed from: g, reason: collision with root package name */
    static final int f56978g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h, reason: collision with root package name */
    private static final Unsafe f56979h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f56980i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f56981j;

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    volatile transient b[] f56982b;

    /* renamed from: c, reason: collision with root package name */
    volatile transient long f56983c;

    /* renamed from: d, reason: collision with root package name */
    volatile transient int f56984d;

    /* compiled from: Striped64.java */
    class a implements PrivilegedExceptionAction<Unsafe> {
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
            throw new NoSuchFieldError(ProtectedSandApp.s("\uf612"));
        }
    }

    /* compiled from: Striped64.java */
    static final class b {

        /* renamed from: p, reason: collision with root package name */
        private static final Unsafe f56985p;

        /* renamed from: q, reason: collision with root package name */
        private static final long f56986q;

        /* renamed from: a, reason: collision with root package name */
        volatile long f56987a;

        /* renamed from: b, reason: collision with root package name */
        volatile long f56988b;

        /* renamed from: c, reason: collision with root package name */
        volatile long f56989c;

        /* renamed from: d, reason: collision with root package name */
        volatile long f56990d;

        /* renamed from: e, reason: collision with root package name */
        volatile long f56991e;

        /* renamed from: f, reason: collision with root package name */
        volatile long f56992f;

        /* renamed from: g, reason: collision with root package name */
        volatile long f56993g;

        /* renamed from: h, reason: collision with root package name */
        volatile long f56994h;

        /* renamed from: i, reason: collision with root package name */
        volatile long f56995i;

        /* renamed from: j, reason: collision with root package name */
        volatile long f56996j;

        /* renamed from: k, reason: collision with root package name */
        volatile long f56997k;

        /* renamed from: l, reason: collision with root package name */
        volatile long f56998l;

        /* renamed from: m, reason: collision with root package name */
        volatile long f56999m;

        /* renamed from: n, reason: collision with root package name */
        volatile long f57000n;

        /* renamed from: o, reason: collision with root package name */
        volatile long f57001o;

        static {
            try {
                Unsafe h4 = i0.h();
                f56985p = h4;
                f56986q = h4.objectFieldOffset(b.class.getDeclaredField(ProtectedSandApp.s("\uf613")));
            } catch (Exception e4) {
                throw new Error(e4);
            }
        }

        b(long j4) {
            this.f56994h = j4;
        }

        final boolean a(long j4, long j5) {
            return f56985p.compareAndSwapLong(this, f56986q, j4, j5);
        }
    }

    static {
        try {
            Unsafe h4 = h();
            f56979h = h4;
            f56980i = h4.objectFieldOffset(i0.class.getDeclaredField(ProtectedSandApp.s("\uf5eb")));
            f56981j = h4.objectFieldOffset(i0.class.getDeclaredField(ProtectedSandApp.s("\uf5ec")));
        } catch (Exception e4) {
            throw new Error(e4);
        }
    }

    i0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe h() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e4) {
                throw new RuntimeException(ProtectedSandApp.s("\uf5ed"), e4.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new a());
        }
    }

    final boolean e(long j4, long j5) {
        return f56979h.compareAndSwapLong(this, f56980i, j4, j5);
    }

    final boolean f() {
        return f56979h.compareAndSwapInt(this, f56981j, 0, 1);
    }

    abstract long g(long j4, long j5);

    final void i(long j4) {
        b[] bVarArr = this.f56982b;
        this.f56983c = j4;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    bVar.f56994h = j4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0023 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void j(long r17, @zc.a int[] r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.i0.j(long, int[], boolean):void");
    }
}
