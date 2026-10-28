package com.bumptech.glide.load.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.content.preferences.protobuf.o1;
import androidx.core.util.v;
import com.bumptech.glide.Registry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ModelLoaderRegistry.java */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final s f44322a;

    /* renamed from: b, reason: collision with root package name */
    private final a f44323b;

    /* compiled from: ModelLoaderRegistry.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, C0748a<?>> f44324a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: com.bumptech.glide.load.model.q$a$a, reason: collision with other inner class name */
        private static class C0748a<Model> {

            /* renamed from: a, reason: collision with root package name */
            final List<o<Model, ?>> f44325a;

            public C0748a(List<o<Model, ?>> list) {
                this.f44325a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f44324a.clear();
        }

        @q0
        public <Model> List<o<Model, ?>> b(Class<Model> cls) {
            C0748a<?> c0748a = this.f44324a.get(cls);
            if (c0748a == null) {
                return null;
            }
            return (List<o<Model, ?>>) c0748a.f44325a;
        }

        public <Model> void c(Class<Model> cls, List<o<Model, ?>> list) {
            if (this.f44324a.put(cls, new C0748a<>(list)) != null) {
                throw new IllegalStateException(o1.a(ProtectedSandApp.s("८"), cls));
            }
        }
    }

    public q(@o0 v.a<List<Throwable>> aVar) {
        this(new s(aVar));
    }

    @o0
    private static <A> Class<A> c(@o0 A a5) {
        return (Class<A>) a5.getClass();
    }

    @o0
    private synchronized <A> List<o<A, ?>> f(@o0 Class<A> cls) {
        List<o<A, ?>> b5;
        b5 = this.f44323b.b(cls);
        if (b5 == null) {
            b5 = Collections.unmodifiableList(this.f44322a.e(cls));
            this.f44323b.c(cls, b5);
        }
        return b5;
    }

    private <Model, Data> void j(@o0 List<p<? extends Model, ? extends Data>> list) {
        Iterator<p<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public synchronized <Model, Data> void a(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 p<? extends Model, ? extends Data> pVar) {
        this.f44322a.b(cls, cls2, pVar);
        this.f44323b.a();
    }

    public synchronized <Model, Data> o<Model, Data> b(@o0 Class<Model> cls, @o0 Class<Data> cls2) {
        return this.f44322a.d(cls, cls2);
    }

    @o0
    public synchronized List<Class<?>> d(@o0 Class<?> cls) {
        return this.f44322a.g(cls);
    }

    @o0
    public <A> List<o<A, ?>> e(@o0 A a5) {
        List<o<A, ?>> f4 = f(a5.getClass());
        if (f4.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a5);
        }
        int size = f4.size();
        List<o<A, ?>> emptyList = Collections.emptyList();
        boolean z4 = true;
        for (int i4 = 0; i4 < size; i4++) {
            o<A, ?> oVar = f4.get(i4);
            if (oVar.a(a5)) {
                if (z4) {
                    emptyList = new ArrayList<>(size - i4);
                    z4 = false;
                }
                emptyList.add(oVar);
            }
        }
        if (emptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a5, f4);
        }
        return emptyList;
    }

    public synchronized <Model, Data> void g(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 p<? extends Model, ? extends Data> pVar) {
        this.f44322a.i(cls, cls2, pVar);
        this.f44323b.a();
    }

    public synchronized <Model, Data> void h(@o0 Class<Model> cls, @o0 Class<Data> cls2) {
        j(this.f44322a.j(cls, cls2));
        this.f44323b.a();
    }

    public synchronized <Model, Data> void i(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 p<? extends Model, ? extends Data> pVar) {
        j(this.f44322a.k(cls, cls2, pVar));
        this.f44323b.a();
    }

    private q(@o0 s sVar) {
        this.f44323b = new a();
        this.f44322a = sVar;
    }
}
