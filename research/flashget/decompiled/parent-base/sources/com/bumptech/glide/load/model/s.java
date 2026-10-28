package com.bumptech.glide.load.model;

import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.v;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes3.dex */
public class s {

    /* renamed from: e, reason: collision with root package name */
    private static final c f44335e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final o<Object, Object> f44336f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<b<?, ?>> f44337a;

    /* renamed from: b, reason: collision with root package name */
    private final c f44338b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<b<?, ?>> f44339c;

    /* renamed from: d, reason: collision with root package name */
    private final v.a<List<Throwable>> f44340d;

    /* compiled from: MultiModelLoaderFactory.java */
    private static class a implements o<Object, Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.model.o
        public boolean a(@o0 Object obj) {
            return false;
        }

        @Override // com.bumptech.glide.load.model.o
        @q0
        public o.a<Object> b(@o0 Object obj, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    private static class b<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<Model> f44341a;

        /* renamed from: b, reason: collision with root package name */
        final Class<Data> f44342b;

        /* renamed from: c, reason: collision with root package name */
        final p<? extends Model, ? extends Data> f44343c;

        public b(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 p<? extends Model, ? extends Data> pVar) {
            this.f44341a = cls;
            this.f44342b = cls2;
            this.f44343c = pVar;
        }

        public boolean a(@o0 Class<?> cls) {
            return this.f44341a.isAssignableFrom(cls);
        }

        public boolean b(@o0 Class<?> cls, @o0 Class<?> cls2) {
            return a(cls) && this.f44342b.isAssignableFrom(cls2);
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    static class c {
        c() {
        }

        @o0
        public <Model, Data> r<Model, Data> a(@o0 List<o<Model, Data>> list, @o0 v.a<List<Throwable>> aVar) {
            return new r<>(list, aVar);
        }
    }

    public s(@o0 v.a<List<Throwable>> aVar) {
        this(aVar, f44335e);
    }

    private <Model, Data> void a(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 p<? extends Model, ? extends Data> pVar, boolean z4) {
        b<?, ?> bVar = new b<>(cls, cls2, pVar);
        List<b<?, ?>> list = this.f44337a;
        list.add(z4 ? list.size() : 0, bVar);
    }

    @o0
    private <Model, Data> o<Model, Data> c(@o0 b<?, ?> bVar) {
        return (o) com.bumptech.glide.util.m.f(bVar.f44343c.e(this), ProtectedSandApp.s("ॲ"));
    }

    @o0
    private static <Model, Data> o<Model, Data> f() {
        return (o<Model, Data>) f44336f;
    }

    @o0
    private <Model, Data> p<Model, Data> h(@o0 b<?, ?> bVar) {
        return (p<Model, Data>) bVar.f44343c;
    }

    synchronized <Model, Data> void b(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, true);
    }

    @o0
    public synchronized <Model, Data> o<Model, Data> d(@o0 Class<Model> cls, @o0 Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z4 = false;
            for (b<?, ?> bVar : this.f44337a) {
                if (this.f44339c.contains(bVar)) {
                    z4 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f44339c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f44339c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f44338b.a(arrayList, this.f44340d);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (!z4) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return (o<Model, Data>) f44336f;
        } catch (Throwable th) {
            this.f44339c.clear();
            throw th;
        }
    }

    @o0
    synchronized <Model> List<o<Model, ?>> e(@o0 Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f44337a) {
                if (!this.f44339c.contains(bVar) && bVar.a(cls)) {
                    this.f44339c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f44339c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    @o0
    synchronized List<Class<?>> g(@o0 Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f44337a) {
            if (!arrayList.contains(bVar.f44342b) && bVar.a(cls)) {
                arrayList.add(bVar.f44342b);
            }
        }
        return arrayList;
    }

    synchronized <Model, Data> void i(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, false);
    }

    @o0
    synchronized <Model, Data> List<p<? extends Model, ? extends Data>> j(@o0 Class<Model> cls, @o0 Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f44337a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(next.f44343c);
            }
        }
        return arrayList;
    }

    @o0
    synchronized <Model, Data> List<p<? extends Model, ? extends Data>> k(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 p<? extends Model, ? extends Data> pVar) {
        List<p<? extends Model, ? extends Data>> j4;
        j4 = j(cls, cls2);
        b(cls, cls2, pVar);
        return j4;
    }

    @m1
    s(@o0 v.a<List<Throwable>> aVar, @o0 c cVar) {
        this.f44337a = new ArrayList();
        this.f44339c = new HashSet();
        this.f44340d = aVar;
        this.f44338b = cVar;
    }
}
