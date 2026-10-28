package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* loaded from: classes3.dex */
public final class j implements com.bumptech.glide.load.engine.bitmap_recycle.b {

    /* renamed from: h, reason: collision with root package name */
    private static final int f43876h = 4194304;

    /* renamed from: i, reason: collision with root package name */
    @m1
    static final int f43877i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final int f43878j = 2;

    /* renamed from: b, reason: collision with root package name */
    private final h<a, Object> f43879b;

    /* renamed from: c, reason: collision with root package name */
    private final b f43880c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f43881d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>> f43882e;

    /* renamed from: f, reason: collision with root package name */
    private final int f43883f;

    /* renamed from: g, reason: collision with root package name */
    private int f43884g;

    /* compiled from: LruArrayPool.java */
    private static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final b f43885a;

        /* renamed from: b, reason: collision with root package name */
        int f43886b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f43887c;

        a(b bVar) {
            this.f43885a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f43885a.c(this);
        }

        void b(int i4, Class<?> cls) {
            this.f43886b = i4;
            this.f43887c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f43886b == aVar.f43886b && this.f43887c == aVar.f43887c;
        }

        public int hashCode() {
            int i4 = this.f43886b * 31;
            Class<?> cls = this.f43887c;
            return i4 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return ProtectedSandApp.s("ࢢ") + this.f43886b + ProtectedSandApp.s("ࢣ") + this.f43887c + '}';
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

        a e(int i4, Class<?> cls) {
            a b5 = b();
            b5.b(i4, cls);
            return b5;
        }
    }

    @m1
    public j() {
        this.f43879b = new h<>();
        this.f43880c = new b();
        this.f43881d = new HashMap();
        this.f43882e = new HashMap();
        this.f43883f = 4194304;
    }

    private void a(int i4, Class<?> cls) {
        NavigableMap<Integer, Integer> n4 = n(cls);
        Integer num = n4.get(Integer.valueOf(i4));
        if (num != null) {
            if (num.intValue() == 1) {
                n4.remove(Integer.valueOf(i4));
                return;
            } else {
                n4.put(Integer.valueOf(i4), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException(ProtectedSandApp.s("ࢤ") + i4 + ProtectedSandApp.s("ࢥ") + this);
    }

    private void g() {
        h(this.f43883f);
    }

    private void h(int i4) {
        while (this.f43884g > i4) {
            Object f4 = this.f43879b.f();
            com.bumptech.glide.util.m.e(f4);
            com.bumptech.glide.load.engine.bitmap_recycle.a i5 = i(f4);
            this.f43884g -= i5.b(f4) * i5.a();
            a(i5.b(f4), f4.getClass());
            if (Log.isLoggable(i5.getTag(), 2)) {
                i5.getTag();
                i5.b(f4);
            }
        }
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> i(T t4) {
        return j(t4.getClass());
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> j(Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVar = (com.bumptech.glide.load.engine.bitmap_recycle.a) this.f43882e.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new i();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("ࢦ").concat(cls.getSimpleName()));
                }
                aVar = new g();
            }
            this.f43882e.put(cls, aVar);
        }
        return aVar;
    }

    @q0
    private <T> T k(a aVar) {
        return (T) this.f43879b.a(aVar);
    }

    private <T> T m(a aVar, Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> j4 = j(cls);
        T t4 = (T) this.f43879b.a(aVar);
        if (t4 != null) {
            this.f43884g -= j4.b(t4) * j4.a();
            a(j4.b(t4), cls);
        }
        if (t4 != null) {
            return t4;
        }
        if (Log.isLoggable(j4.getTag(), 2)) {
            j4.getTag();
            int i4 = aVar.f43886b;
        }
        return j4.newArray(aVar.f43886b);
    }

    private NavigableMap<Integer, Integer> n(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f43881d.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f43881d.put(cls, treeMap);
        return treeMap;
    }

    private boolean o() {
        int i4 = this.f43884g;
        return i4 == 0 || this.f43883f / i4 >= 2;
    }

    private boolean p(int i4) {
        return i4 <= this.f43883f / 2;
    }

    private boolean q(int i4, Integer num) {
        return num != null && (o() || num.intValue() <= i4 * 8);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void b(int i4) {
        try {
            if (i4 >= 40) {
                c();
            } else if (i4 >= 20 || i4 == 15) {
                h(this.f43883f / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void c() {
        h(0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T d(int i4, Class<T> cls) {
        Integer ceilingKey;
        try {
            ceilingKey = n(cls).ceilingKey(Integer.valueOf(i4));
        } catch (Throwable th) {
            throw th;
        }
        return (T) m(q(i4, ceilingKey) ? this.f43880c.e(ceilingKey.intValue(), cls) : this.f43880c.e(i4, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T e(int i4, Class<T> cls) {
        return (T) m(this.f43880c.e(i4, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    @Deprecated
    public <T> void f(T t4, Class<T> cls) {
        put(t4);
    }

    int l() {
        int i4 = 0;
        for (Class<?> cls : this.f43881d.keySet()) {
            for (Integer num : this.f43881d.get(cls).keySet()) {
                com.bumptech.glide.load.engine.bitmap_recycle.a j4 = j(cls);
                i4 += this.f43881d.get(cls).get(num).intValue() * num.intValue() * j4.a();
            }
        }
        return i4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> void put(T t4) {
        Class<?> cls = t4.getClass();
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> j4 = j(cls);
        int b5 = j4.b(t4);
        int a5 = j4.a() * b5;
        if (p(a5)) {
            a e4 = this.f43880c.e(b5, cls);
            this.f43879b.d(e4, t4);
            NavigableMap<Integer, Integer> n4 = n(cls);
            Integer num = n4.get(Integer.valueOf(e4.f43886b));
            Integer valueOf = Integer.valueOf(e4.f43886b);
            int i4 = 1;
            if (num != null) {
                i4 = 1 + num.intValue();
            }
            n4.put(valueOf, Integer.valueOf(i4));
            this.f43884g += a5;
            g();
        }
    }

    public j(int i4) {
        this.f43879b = new h<>();
        this.f43880c = new b();
        this.f43881d = new HashMap();
        this.f43882e = new HashMap();
        this.f43883f = i4;
    }
}
