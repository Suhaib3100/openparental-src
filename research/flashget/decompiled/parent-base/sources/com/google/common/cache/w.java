package com.google.common.cache;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* compiled from: Striped64.java */
@d9.c
@g
/* loaded from: classes6.dex */
abstract class w extends Number {

    /* renamed from: e, reason: collision with root package name */
    static final ThreadLocal<int[]> f55297e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    static final Random f55298f = new Random();

    /* renamed from: g, reason: collision with root package name */
    static final int f55299g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h, reason: collision with root package name */
    private static final Unsafe f55300h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f55301i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f55302j;

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    volatile transient b[] f55303b;

    /* renamed from: c, reason: collision with root package name */
    volatile transient long f55304c;

    /* renamed from: d, reason: collision with root package name */
    volatile transient int f55305d;

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
            throw new NoSuchFieldError(ProtectedSandApp.s("\uf43e"));
        }
    }

    /* compiled from: Striped64.java */
    static final class b {

        /* renamed from: p, reason: collision with root package name */
        private static final Unsafe f55306p;

        /* renamed from: q, reason: collision with root package name */
        private static final long f55307q;

        /* renamed from: a, reason: collision with root package name */
        volatile long f55308a;

        /* renamed from: b, reason: collision with root package name */
        volatile long f55309b;

        /* renamed from: c, reason: collision with root package name */
        volatile long f55310c;

        /* renamed from: d, reason: collision with root package name */
        volatile long f55311d;

        /* renamed from: e, reason: collision with root package name */
        volatile long f55312e;

        /* renamed from: f, reason: collision with root package name */
        volatile long f55313f;

        /* renamed from: g, reason: collision with root package name */
        volatile long f55314g;

        /* renamed from: h, reason: collision with root package name */
        volatile long f55315h;

        /* renamed from: i, reason: collision with root package name */
        volatile long f55316i;

        /* renamed from: j, reason: collision with root package name */
        volatile long f55317j;

        /* renamed from: k, reason: collision with root package name */
        volatile long f55318k;

        /* renamed from: l, reason: collision with root package name */
        volatile long f55319l;

        /* renamed from: m, reason: collision with root package name */
        volatile long f55320m;

        /* renamed from: n, reason: collision with root package name */
        volatile long f55321n;

        /* renamed from: o, reason: collision with root package name */
        volatile long f55322o;

        static {
            try {
                Unsafe h4 = w.h();
                f55306p = h4;
                f55307q = h4.objectFieldOffset(b.class.getDeclaredField(ProtectedSandApp.s("\uf43f")));
            } catch (Exception e4) {
                throw new Error(e4);
            }
        }

        b(long j4) {
            this.f55315h = j4;
        }

        final boolean a(long j4, long j5) {
            return f55306p.compareAndSwapLong(this, f55307q, j4, j5);
        }
    }

    static {
        try {
            Unsafe h4 = h();
            f55300h = h4;
            f55301i = h4.objectFieldOffset(w.class.getDeclaredField(ProtectedSandApp.s("\uf436")));
            f55302j = h4.objectFieldOffset(w.class.getDeclaredField(ProtectedSandApp.s("\uf437")));
        } catch (Exception e4) {
            throw new Error(e4);
        }
    }

    w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe h() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e4) {
                throw new RuntimeException(ProtectedSandApp.s("\uf438"), e4.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new a());
        }
    }

    final boolean e(long j4, long j5) {
        return f55300h.compareAndSwapLong(this, f55301i, j4, j5);
    }

    final boolean f() {
        return f55300h.compareAndSwapInt(this, f55302j, 0, 1);
    }

    abstract long g(long j4, long j5);

    final void i(long j4) {
        b[] bVarArr = this.f55303b;
        this.f55304c = j4;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    bVar.f55315h = j4;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.w.j(long, int[], boolean):void");
    }
}
