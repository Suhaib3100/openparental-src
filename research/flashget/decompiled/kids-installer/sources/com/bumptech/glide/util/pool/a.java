package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.o0;
import androidx.core.util.p;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FactoryPools.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final int f12179b = 20;

    /* renamed from: a, reason: collision with root package name */
    private static final String f12178a = ProtectedSandApp.s("ȷ");

    /* renamed from: c, reason: collision with root package name */
    private static final g<Object> f12180c = new C0155a();

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.util.pool.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0155a implements g<Object> {
        C0155a() {
        }

        @Override // com.bumptech.glide.util.pool.a.g
        public void a(@o0 Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    /* loaded from: classes3.dex */
    class b<T> implements d<List<T>> {
        b() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        @o0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    /* loaded from: classes3.dex */
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
        T a();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes3.dex */
    private static final class e<T> implements p.a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final d<T> f12181a;

        /* renamed from: b, reason: collision with root package name */
        private final g<T> f12182b;

        /* renamed from: c, reason: collision with root package name */
        private final p.a<T> f12183c;

        e(@o0 p.a<T> aVar, @o0 d<T> dVar, @o0 g<T> gVar) {
            this.f12183c = aVar;
            this.f12181a = dVar;
            this.f12182b = gVar;
        }

        @Override // androidx.core.util.p.a
        public boolean a(@o0 T t5) {
            if (t5 instanceof f) {
                ((f) t5).l().b(true);
            }
            this.f12182b.a(t5);
            return this.f12183c.a(t5);
        }

        @Override // androidx.core.util.p.a
        public T b() {
            T b6 = this.f12183c.b();
            if (b6 == null) {
                b6 = this.f12181a.a();
                if (Log.isLoggable(ProtectedSandApp.s("ᶳ"), 2)) {
                    b6.getClass().toString();
                }
            }
            if (b6 instanceof f) {
                b6.l().b(false);
            }
            return (T) b6;
        }
    }

    /* compiled from: FactoryPools.java */
    public interface f {
        @o0
        com.bumptech.glide.util.pool.c l();
    }

    /* compiled from: FactoryPools.java */
    public interface g<T> {
        void a(@o0 T t5);
    }

    private a() {
    }

    @o0
    private static <T extends f> p.a<T> a(@o0 p.a<T> aVar, @o0 d<T> dVar) {
        return new e(aVar, dVar, f12180c);
    }

    @o0
    private static <T> p.a<T> b(@o0 p.a<T> aVar, @o0 d<T> dVar, @o0 g<T> gVar) {
        return new e(aVar, dVar, gVar);
    }

    @o0
    private static <T> g<T> c() {
        return (g<T>) f12180c;
    }

    @o0
    public static <T extends f> p.a<T> d(int i5, @o0 d<T> dVar) {
        return a(new p.b(i5), dVar);
    }

    @o0
    public static <T extends f> p.a<T> e(int i5, @o0 d<T> dVar) {
        return a(new p.c(i5), dVar);
    }

    @o0
    public static <T> p.a<List<T>> f() {
        return g(20);
    }

    @o0
    public static <T> p.a<List<T>> g(int i5) {
        return new e(new p.c(i5), new b(), new c());
    }
}
