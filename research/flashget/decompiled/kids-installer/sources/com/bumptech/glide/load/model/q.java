package com.bumptech.glide.load.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.p;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: MultiModelLoader.java */
/* loaded from: classes3.dex */
class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final List<n<Model, Data>> f11576a;

    /* renamed from: b, reason: collision with root package name */
    private final p.a<List<Throwable>> f11577b;

    /* compiled from: MultiModelLoader.java */
    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: o, reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f11578o;

        /* renamed from: p, reason: collision with root package name */
        private final p.a<List<Throwable>> f11579p;

        /* renamed from: q, reason: collision with root package name */
        private int f11580q;

        /* renamed from: r, reason: collision with root package name */
        private com.bumptech.glide.i f11581r;

        /* renamed from: s, reason: collision with root package name */
        private d.a<? super Data> f11582s;

        /* renamed from: t, reason: collision with root package name */
        @q0
        private List<Throwable> f11583t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f11584u;

        a(@o0 List<com.bumptech.glide.load.data.d<Data>> list, @o0 p.a<List<Throwable>> aVar) {
            this.f11579p = aVar;
            com.bumptech.glide.util.l.c(list);
            this.f11578o = list;
            this.f11580q = 0;
        }

        private void g() {
            if (this.f11584u) {
                return;
            }
            if (this.f11580q < this.f11578o.size() - 1) {
                this.f11580q++;
                e(this.f11581r, this.f11582s);
            } else {
                com.bumptech.glide.util.l.d(this.f11583t);
                this.f11582s.c(new GlideException(ProtectedSandApp.s("ᴵ"), new ArrayList(this.f11583t)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<Data> a() {
            return this.f11578o.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f11583t;
            if (list != null) {
                this.f11579p.a(list);
            }
            this.f11583t = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f11578o.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(@o0 Exception exc) {
            ((List) com.bumptech.glide.util.l.d(this.f11583t)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f11584u = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f11578o.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public com.bumptech.glide.load.a d() {
            return this.f11578o.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@o0 com.bumptech.glide.i iVar, @o0 d.a<? super Data> aVar) {
            this.f11581r = iVar;
            this.f11582s = aVar;
            this.f11583t = this.f11579p.b();
            this.f11578o.get(this.f11580q).e(iVar, this);
            if (this.f11584u) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(@q0 Data data) {
            if (data != null) {
                this.f11582s.f(data);
            } else {
                g();
            }
        }
    }

    q(@o0 List<n<Model, Data>> list, @o0 p.a<List<Throwable>> aVar) {
        this.f11576a = list;
        this.f11577b = aVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean a(@o0 Model model) {
        Iterator<n<Model, Data>> it = this.f11576a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.n
    public n.a<Data> b(@o0 Model model, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        n.a<Data> b6;
        int size = this.f11576a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.f fVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            n<Model, Data> nVar = this.f11576a.get(i7);
            if (nVar.a(model) && (b6 = nVar.b(model, i5, i6, iVar)) != null) {
                fVar = b6.f11569a;
                arrayList.add(b6.f11571c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a<>(fVar, new a(arrayList, this.f11577b));
    }

    public String toString() {
        return ProtectedSandApp.s("ᴶ") + Arrays.toString(this.f11576a.toArray()) + '}';
    }
}
