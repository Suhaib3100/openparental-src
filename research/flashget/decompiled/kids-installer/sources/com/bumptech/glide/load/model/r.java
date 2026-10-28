package com.bumptech.glide.load.model;

import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.p;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.model.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: e, reason: collision with root package name */
    private static final c f11585e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final n<Object, Object> f11586f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<b<?, ?>> f11587a;

    /* renamed from: b, reason: collision with root package name */
    private final c f11588b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<b<?, ?>> f11589c;

    /* renamed from: d, reason: collision with root package name */
    private final p.a<List<Throwable>> f11590d;

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes3.dex */
    private static class a implements n<Object, Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.model.n
        public boolean a(@o0 Object obj) {
            return false;
        }

        @Override // com.bumptech.glide.load.model.n
        @q0
        public n.a<Object> b(@o0 Object obj, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    private static class b<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<Model> f11591a;

        /* renamed from: b, reason: collision with root package name */
        final Class<Data> f11592b;

        /* renamed from: c, reason: collision with root package name */
        final o<? extends Model, ? extends Data> f11593c;

        public b(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 o<? extends Model, ? extends Data> oVar) {
            this.f11591a = cls;
            this.f11592b = cls2;
            this.f11593c = oVar;
        }

        public boolean a(@o0 Class<?> cls) {
            return this.f11591a.isAssignableFrom(cls);
        }

        public boolean b(@o0 Class<?> cls, @o0 Class<?> cls2) {
            return a(cls) && this.f11592b.isAssignableFrom(cls2);
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    static class c {
        c() {
        }

        @o0
        public <Model, Data> q<Model, Data> a(@o0 List<n<Model, Data>> list, @o0 p.a<List<Throwable>> aVar) {
            return new q<>(list, aVar);
        }
    }

    public r(@o0 p.a<List<Throwable>> aVar) {
        this(aVar, f11585e);
    }

    private <Model, Data> void a(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 o<? extends Model, ? extends Data> oVar, boolean z5) {
        b<?, ?> bVar = new b<>(cls, cls2, oVar);
        List<b<?, ?>> list = this.f11587a;
        list.add(z5 ? list.size() : 0, bVar);
    }

    @o0
    private <Model, Data> n<Model, Data> c(@o0 b<?, ?> bVar) {
        return (n) com.bumptech.glide.util.l.d(bVar.f11593c.c(this));
    }

    @o0
    private static <Model, Data> n<Model, Data> f() {
        return (n<Model, Data>) f11586f;
    }

    @o0
    private <Model, Data> o<Model, Data> h(@o0 b<?, ?> bVar) {
        return (o<Model, Data>) bVar.f11593c;
    }

    synchronized <Model, Data> void b(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, true);
    }

    @o0
    public synchronized <Model, Data> n<Model, Data> d(@o0 Class<Model> cls, @o0 Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z5 = false;
            for (b<?, ?> bVar : this.f11587a) {
                if (this.f11589c.contains(bVar)) {
                    z5 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f11589c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f11589c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f11588b.a(arrayList, this.f11590d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z5) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return (n<Model, Data>) f11586f;
        } catch (Throwable th) {
            this.f11589c.clear();
            throw th;
        }
    }

    @o0
    synchronized <Model> List<n<Model, ?>> e(@o0 Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f11587a) {
                if (!this.f11589c.contains(bVar) && bVar.a(cls)) {
                    this.f11589c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f11589c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f11589c.clear();
            throw th;
        }
        return arrayList;
    }

    @o0
    synchronized List<Class<?>> g(@o0 Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f11587a) {
            if (!arrayList.contains(bVar.f11592b) && bVar.a(cls)) {
                arrayList.add(bVar.f11592b);
            }
        }
        return arrayList;
    }

    synchronized <Model, Data> void i(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, false);
    }

    @o0
    synchronized <Model, Data> List<o<? extends Model, ? extends Data>> j(@o0 Class<Model> cls, @o0 Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f11587a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(next.f11593c);
            }
        }
        return arrayList;
    }

    @o0
    synchronized <Model, Data> List<o<? extends Model, ? extends Data>> k(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 o<? extends Model, ? extends Data> oVar) {
        List<o<? extends Model, ? extends Data>> j5;
        j5 = j(cls, cls2);
        b(cls, cls2, oVar);
        return j5;
    }

    @m1
    r(@o0 p.a<List<Throwable>> aVar, @o0 c cVar) {
        this.f11587a = new ArrayList();
        this.f11589c = new HashSet();
        this.f11590d = aVar;
        this.f11588b = cVar;
    }
}
