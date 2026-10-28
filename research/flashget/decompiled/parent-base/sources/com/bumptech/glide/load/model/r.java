package com.bumptech.glide.load.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.v;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: MultiModelLoader.java */
/* loaded from: classes3.dex */
class r<Model, Data> implements o<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final List<o<Model, Data>> f44326a;

    /* renamed from: b, reason: collision with root package name */
    private final v.a<List<Throwable>> f44327b;

    /* compiled from: MultiModelLoader.java */
    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: b, reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f44328b;

        /* renamed from: c, reason: collision with root package name */
        private final v.a<List<Throwable>> f44329c;

        /* renamed from: d, reason: collision with root package name */
        private int f44330d;

        /* renamed from: e, reason: collision with root package name */
        private com.bumptech.glide.j f44331e;

        /* renamed from: f, reason: collision with root package name */
        private d.a<? super Data> f44332f;

        /* renamed from: g, reason: collision with root package name */
        @q0
        private List<Throwable> f44333g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f44334h;

        a(@o0 List<com.bumptech.glide.load.data.d<Data>> list, @o0 v.a<List<Throwable>> aVar) {
            this.f44329c = aVar;
            com.bumptech.glide.util.m.d(list);
            this.f44328b = list;
            this.f44330d = 0;
        }

        private void g() {
            if (this.f44334h) {
                return;
            }
            if (this.f44330d < this.f44328b.size() - 1) {
                this.f44330d++;
                e(this.f44331e, this.f44332f);
            } else {
                com.bumptech.glide.util.m.e(this.f44333g);
                this.f44332f.c(new GlideException(ProtectedSandApp.s("९"), new ArrayList(this.f44333g)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<Data> a() {
            return this.f44328b.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f44333g;
            if (list != null) {
                this.f44329c.release(list);
            }
            this.f44333g = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f44328b.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(@o0 Exception exc) {
            ((List) com.bumptech.glide.util.m.f(this.f44333g, ProtectedSandApp.s("॰"))).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f44334h = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f44328b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public com.bumptech.glide.load.a d() {
            return this.f44328b.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@o0 com.bumptech.glide.j jVar, @o0 d.a<? super Data> aVar) {
            this.f44331e = jVar;
            this.f44332f = aVar;
            this.f44333g = this.f44329c.acquire();
            this.f44328b.get(this.f44330d).e(jVar, this);
            if (this.f44334h) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(@q0 Data data) {
            if (data != null) {
                this.f44332f.f(data);
            } else {
                g();
            }
        }
    }

    r(@o0 List<o<Model, Data>> list, @o0 v.a<List<Throwable>> aVar) {
        this.f44326a = list;
        this.f44327b = aVar;
    }

    @Override // com.bumptech.glide.load.model.o
    public boolean a(@o0 Model model) {
        Iterator<o<Model, Data>> it = this.f44326a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.o
    public o.a<Data> b(@o0 Model model, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        o.a<Data> b5;
        int size = this.f44326a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.f fVar = null;
        for (int i6 = 0; i6 < size; i6++) {
            o<Model, Data> oVar = this.f44326a.get(i6);
            if (oVar.a(model) && (b5 = oVar.b(model, i4, i5, iVar)) != null) {
                fVar = b5.f44319a;
                arrayList.add(b5.f44321c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new o.a<>(fVar, new a(arrayList, this.f44327b));
    }

    public String toString() {
        return ProtectedSandApp.s("ॱ") + Arrays.toString(this.f44326a.toArray()) + '}';
    }
}
