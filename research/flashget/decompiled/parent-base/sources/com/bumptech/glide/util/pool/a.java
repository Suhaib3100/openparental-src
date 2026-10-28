package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.o0;
import androidx.core.util.v;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FactoryPools.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final int f44988b = 20;

    /* renamed from: a, reason: collision with root package name */
    private static final String f44987a = ProtectedSandApp.s("ફ");

    /* renamed from: c, reason: collision with root package name */
    private static final g<Object> f44989c = new C0756a();

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.util.pool.a$a, reason: collision with other inner class name */
    class C0756a implements g<Object> {
        C0756a() {
        }

        @Override // com.bumptech.glide.util.pool.a.g
        public void a(@o0 Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    class b<T> implements d<List<T>> {
        b() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    class c<T> implements g<List<T>> {
        c() {
        }

        @Override // com.bumptech.glide.util.pool.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@o0 List<T> list) {
            list.clear();
        }
    }

    /* compiled from: FactoryPools.java */
    public interface d<T> {
        T create();
    }

    /* compiled from: FactoryPools.java */
    private static final class e<T> implements v.a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final d<T> f44990a;

        /* renamed from: b, reason: collision with root package name */
        private final g<T> f44991b;

        /* renamed from: c, reason: collision with root package name */
        private final v.a<T> f44992c;

        e(@o0 v.a<T> aVar, @o0 d<T> dVar, @o0 g<T> gVar) {
            this.f44992c = aVar;
            this.f44990a = dVar;
            this.f44991b = gVar;
        }

        @Override // androidx.core.util.v.a
        public T acquire() {
            T acquire = this.f44992c.acquire();
            if (acquire == null) {
                acquire = this.f44990a.create();
                if (Log.isLoggable(ProtectedSandApp.s("પ"), 2)) {
                    acquire.getClass().toString();
                }
            }
            if (acquire instanceof f) {
                acquire.d().b(false);
            }
            return (T) acquire;
        }

        @Override // androidx.core.util.v.a
        public boolean release(@o0 T t4) {
            if (t4 instanceof f) {
                ((f) t4).d().b(true);
            }
            this.f44991b.a(t4);
            return this.f44992c.release(t4);
        }
    }

    /* compiled from: FactoryPools.java */
    public interface f {
        @o0
        com.bumptech.glide.util.pool.c d();
    }

    /* compiled from: FactoryPools.java */
    public interface g<T> {
        void a(@o0 T t4);
    }

    private a() {
    }

    @o0
    private static <T extends f> v.a<T> a(@o0 v.a<T> aVar, @o0 d<T> dVar) {
        return new e(aVar, dVar, f44989c);
    }

    @o0
    private static <T> v.a<T> b(@o0 v.a<T> aVar, @o0 d<T> dVar, @o0 g<T> gVar) {
        return new e(aVar, dVar, gVar);
    }

    @o0
    private static <T> g<T> c() {
        return (g<T>) f44989c;
    }

    @o0
    public static <T extends f> v.a<T> d(int i4, @o0 d<T> dVar) {
        return a(new v.b(i4), dVar);
    }

    @o0
    public static <T extends f> v.a<T> e(int i4, @o0 d<T> dVar) {
        return a(new v.c(i4), dVar);
    }

    @o0
    public static <T extends f> v.a<T> f(int i4, @o0 d<T> dVar, @o0 g<T> gVar) {
        return new e(new v.c(i4), dVar, gVar);
    }

    @o0
    public static <T> v.a<List<T>> g() {
        return h(20);
    }

    @o0
    public static <T> v.a<List<T>> h(int i4) {
        return new e(new v.c(i4), new b(), new c());
    }
}
