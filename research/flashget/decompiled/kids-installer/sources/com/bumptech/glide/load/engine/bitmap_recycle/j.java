package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* loaded from: classes3.dex */
public final class j implements com.bumptech.glide.load.engine.bitmap_recycle.b {

    /* renamed from: h, reason: collision with root package name */
    private static final int f11168h = 4194304;

    /* renamed from: i, reason: collision with root package name */
    @m1
    static final int f11169i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final int f11170j = 2;

    /* renamed from: b, reason: collision with root package name */
    private final h<a, Object> f11171b;

    /* renamed from: c, reason: collision with root package name */
    private final b f11172c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f11173d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>> f11174e;

    /* renamed from: f, reason: collision with root package name */
    private final int f11175f;

    /* renamed from: g, reason: collision with root package name */
    private int f11176g;

    /* compiled from: LruArrayPool.java */
    private static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final b f11177a;

        /* renamed from: b, reason: collision with root package name */
        int f11178b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f11179c;

        a(b bVar) {
            this.f11177a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f11177a.c(this);
        }

        void b(int i5, Class<?> cls) {
            this.f11178b = i5;
            this.f11179c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11178b == aVar.f11178b && this.f11179c == aVar.f11179c;
        }

        public int hashCode() {
            int i5 = this.f11178b * 31;
            Class<?> cls = this.f11179c;
            return i5 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return ProtectedSandApp.s("Ჟ") + this.f11178b + ProtectedSandApp.s("Რ") + this.f11179c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    private static final class b extends d<a> {
        b() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        protected a a() {
            return new a(this);
        }

        protected a d() {
            return new a(this);
        }

        a e(int i5, Class<?> cls) {
            a b6 = b();
            b6.b(i5, cls);
            return b6;
        }
    }

    @m1
    public j() {
        this.f11171b = new h<>();
        this.f11172c = new b();
        this.f11173d = new HashMap();
        this.f11174e = new HashMap();
        this.f11175f = 4194304;
    }

    private void f(int i5, Class<?> cls) {
        NavigableMap<Integer, Integer> n5 = n(cls);
        Integer num = n5.get(Integer.valueOf(i5));
        if (num != null) {
            if (num.intValue() == 1) {
                n5.remove(Integer.valueOf(i5));
                return;
            } else {
                n5.put(Integer.valueOf(i5), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException(ProtectedSandApp.s("Ს") + i5 + ProtectedSandApp.s("Ტ") + this);
    }

    private void g() {
        h(this.f11175f);
    }

    private void h(int i5) {
        while (this.f11176g > i5) {
            Object f6 = this.f11171b.f();
            com.bumptech.glide.util.l.d(f6);
            com.bumptech.glide.load.engine.bitmap_recycle.a i6 = i(f6);
            this.f11176g -= i6.c(f6) * i6.b();
            f(i6.c(f6), f6.getClass());
            if (Log.isLoggable(i6.a(), 2)) {
                i6.a();
                i6.c(f6);
            }
        }
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> i(T t5) {
        return j(t5.getClass());
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> j(Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVar = (com.bumptech.glide.load.engine.bitmap_recycle.a) this.f11174e.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new i();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("Უ").concat(cls.getSimpleName()));
                }
                aVar = new g();
            }
            this.f11174e.put(cls, aVar);
        }
        return aVar;
    }

    @q0
    private <T> T k(a aVar) {
        return (T) this.f11171b.a(aVar);
    }

    private <T> T m(a aVar, Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> j5 = j(cls);
        T t5 = (T) k(aVar);
        if (t5 != null) {
            this.f11176g -= j5.c(t5) * j5.b();
            f(j5.c(t5), cls);
        }
        if (t5 != null) {
            return t5;
        }
        if (Log.isLoggable(j5.a(), 2)) {
            j5.a();
            int i5 = aVar.f11178b;
        }
        return j5.newArray(aVar.f11178b);
    }

    private NavigableMap<Integer, Integer> n(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f11173d.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f11173d.put(cls, treeMap);
        return treeMap;
    }

    private boolean o() {
        int i5 = this.f11176g;
        return i5 == 0 || this.f11175f / i5 >= 2;
    }

    private boolean p(int i5) {
        return i5 <= this.f11175f / 2;
    }

    private boolean q(int i5, Integer num) {
        return num != null && (o() || num.intValue() <= i5 * 8);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void a(int i5) {
        try {
            if (i5 >= 40) {
                b();
            } else if (i5 >= 20 || i5 == 15) {
                h(this.f11175f / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void b() {
        h(0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T c(int i5, Class<T> cls) {
        return (T) m(this.f11172c.e(i5, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    @Deprecated
    public <T> void d(T t5, Class<T> cls) {
        put(t5);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T e(int i5, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = n(cls).ceilingKey(Integer.valueOf(i5));
        return (T) m(q(i5, ceilingKey) ? this.f11172c.e(ceilingKey.intValue(), cls) : this.f11172c.e(i5, cls), cls);
    }

    int l() {
        int i5 = 0;
        for (Class<?> cls : this.f11173d.keySet()) {
            for (Integer num : this.f11173d.get(cls).keySet()) {
                com.bumptech.glide.load.engine.bitmap_recycle.a j5 = j(cls);
                i5 += this.f11173d.get(cls).get(num).intValue() * num.intValue() * j5.b();
            }
        }
        return i5;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> void put(T t5) {
        Class<?> cls = t5.getClass();
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> j5 = j(cls);
        int c6 = j5.c(t5);
        int b6 = j5.b() * c6;
        if (p(b6)) {
            a e6 = this.f11172c.e(c6, cls);
            this.f11171b.d(e6, t5);
            NavigableMap<Integer, Integer> n5 = n(cls);
            Integer num = n5.get(Integer.valueOf(e6.f11178b));
            Integer valueOf = Integer.valueOf(e6.f11178b);
            int i5 = 1;
            if (num != null) {
                i5 = 1 + num.intValue();
            }
            n5.put(valueOf, Integer.valueOf(i5));
            this.f11176g += b6;
            g();
        }
    }

    public j(int i5) {
        this.f11171b = new h<>();
        this.f11172c = new b();
        this.f11173d = new HashMap();
        this.f11174e = new HashMap();
        this.f11175f = i5;
    }
}
