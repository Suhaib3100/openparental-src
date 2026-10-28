package com.bumptech.glide.load.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.p;
import com.bumptech.glide.Registry;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ModelLoaderRegistry.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final r f11572a;

    /* renamed from: b, reason: collision with root package name */
    private final a f11573b;

    /* compiled from: ModelLoaderRegistry.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, C0149a<?>> f11574a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: com.bumptech.glide.load.model.p$a$a, reason: collision with other inner class name */
        private static class C0149a<Model> {

            /* renamed from: a, reason: collision with root package name */
            final List<n<Model, ?>> f11575a;

            public C0149a(List<n<Model, ?>> list) {
                this.f11575a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f11574a.clear();
        }

        @q0
        public <Model> List<n<Model, ?>> b(Class<Model> cls) {
            C0149a<?> c0149a = this.f11574a.get(cls);
            if (c0149a == null) {
                return null;
            }
            return (List<n<Model, ?>>) c0149a.f11575a;
        }

        public <Model> void c(Class<Model> cls, List<n<Model, ?>> list) {
            if (this.f11574a.put(cls, new C0149a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException(ProtectedSandApp.s("Ŭ") + cls);
        }
    }

    public p(@o0 p.a<List<Throwable>> aVar) {
        this(new r(aVar));
    }

    @o0
    private static <A> Class<A> c(@o0 A a6) {
        return (Class<A>) a6.getClass();
    }

    @o0
    private synchronized <A> List<n<A, ?>> f(@o0 Class<A> cls) {
        List<n<A, ?>> b6;
        b6 = this.f11573b.b(cls);
        if (b6 == null) {
            b6 = Collections.unmodifiableList(this.f11572a.e(cls));
            this.f11573b.c(cls, b6);
        }
        return b6;
    }

    private <Model, Data> void j(@o0 List<o<? extends Model, ? extends Data>> list) {
        Iterator<o<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public synchronized <Model, Data> void a(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 o<? extends Model, ? extends Data> oVar) {
        this.f11572a.b(cls, cls2, oVar);
        this.f11573b.a();
    }

    public synchronized <Model, Data> n<Model, Data> b(@o0 Class<Model> cls, @o0 Class<Data> cls2) {
        return this.f11572a.d(cls, cls2);
    }

    @o0
    public synchronized List<Class<?>> d(@o0 Class<?> cls) {
        return this.f11572a.g(cls);
    }

    @o0
    public <A> List<n<A, ?>> e(@o0 A a6) {
        List<n<A, ?>> f6 = f(a6.getClass());
        if (f6.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a6);
        }
        int size = f6.size();
        List<n<A, ?>> emptyList = Collections.emptyList();
        boolean z5 = true;
        for (int i5 = 0; i5 < size; i5++) {
            n<A, ?> nVar = f6.get(i5);
            if (nVar.a(a6)) {
                if (z5) {
                    emptyList = new ArrayList<>(size - i5);
                    z5 = false;
                }
                emptyList.add(nVar);
            }
        }
        if (emptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a6, f6);
        }
        return emptyList;
    }

    public synchronized <Model, Data> void g(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 o<? extends Model, ? extends Data> oVar) {
        this.f11572a.i(cls, cls2, oVar);
        this.f11573b.a();
    }

    public synchronized <Model, Data> void h(@o0 Class<Model> cls, @o0 Class<Data> cls2) {
        j(this.f11572a.j(cls, cls2));
        this.f11573b.a();
    }

    public synchronized <Model, Data> void i(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 o<? extends Model, ? extends Data> oVar) {
        j(this.f11572a.k(cls, cls2, oVar));
        this.f11573b.a();
    }

    private p(@o0 r rVar) {
        this.f11573b = new a();
        this.f11572a = rVar;
    }
}
