package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: SourceGenerator.java */
/* loaded from: classes3.dex */
class y implements f, f.a {

    /* renamed from: i, reason: collision with root package name */
    private static final String f44230i = ProtectedSandApp.s("्");

    /* renamed from: b, reason: collision with root package name */
    private final g<?> f44231b;

    /* renamed from: c, reason: collision with root package name */
    private final f.a f44232c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f44233d;

    /* renamed from: e, reason: collision with root package name */
    private volatile c f44234e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f44235f;

    /* renamed from: g, reason: collision with root package name */
    private volatile o.a<?> f44236g;

    /* renamed from: h, reason: collision with root package name */
    private volatile d f44237h;

    /* compiled from: SourceGenerator.java */
    class a implements d.a<Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o.a f44238b;

        a(o.a aVar) {
            this.f44238b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(@o0 Exception exc) {
            if (y.this.g(this.f44238b)) {
                y.this.i(this.f44238b, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(@q0 Object obj) {
            if (y.this.g(this.f44238b)) {
                y.this.h(this.f44238b, obj);
            }
        }
    }

    y(g<?> gVar, f.a aVar) {
        this.f44231b = gVar;
        this.f44232c = aVar;
    }

    private boolean d(Object obj) throws IOException {
        String s4 = ProtectedSandApp.s("्");
        long b5 = com.bumptech.glide.util.i.b();
        boolean z4 = false;
        try {
            com.bumptech.glide.load.data.e<T> o4 = this.f44231b.o(obj);
            Object a5 = o4.a();
            com.bumptech.glide.load.d<X> q4 = this.f44231b.q(a5);
            e eVar = new e(q4, a5, this.f44231b.k());
            d dVar = new d(this.f44236g.f44319a, this.f44231b.p());
            com.bumptech.glide.load.engine.cache.a d5 = this.f44231b.d();
            d5.a(dVar, eVar);
            if (Log.isLoggable(s4, 2)) {
                dVar.toString();
                Objects.toString(obj);
                Objects.toString(q4);
                com.bumptech.glide.util.i.a(b5);
            }
            if (d5.b(dVar) != null) {
                this.f44237h = dVar;
                this.f44234e = new c(Collections.singletonList(this.f44236g.f44319a), this.f44231b, this);
                this.f44236g.f44321c.b();
                return true;
            }
            if (Log.isLoggable(s4, 3)) {
                Objects.toString(this.f44237h);
                Objects.toString(obj);
            }
            try {
                this.f44232c.e(this.f44236g.f44319a, o4.a(), this.f44236g.f44321c, this.f44236g.f44321c.d(), this.f44236g.f44319a);
                return false;
            } catch (Throwable th) {
                th = th;
                z4 = true;
                if (!z4) {
                    this.f44236g.f44321c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean f() {
        return this.f44233d < this.f44231b.g().size();
    }

    private void j(o.a<?> aVar) {
        this.f44236g.f44321c.e(this.f44231b.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(com.bumptech.glide.load.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        this.f44232c.a(fVar, exc, dVar, this.f44236g.f44321c.d());
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        if (this.f44235f != null) {
            Object obj = this.f44235f;
            this.f44235f = null;
            try {
                if (!d(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable(ProtectedSandApp.s("्"), 3);
            }
        }
        if (this.f44234e != null && this.f44234e.b()) {
            return true;
        }
        this.f44234e = null;
        this.f44236g = null;
        boolean z4 = false;
        while (!z4 && f()) {
            List<o.a<?>> g4 = this.f44231b.g();
            int i4 = this.f44233d;
            this.f44233d = i4 + 1;
            this.f44236g = g4.get(i4);
            if (this.f44236g != null && (this.f44231b.e().c(this.f44236g.f44321c.d()) || this.f44231b.u(this.f44236g.f44321c.a()))) {
                j(this.f44236g);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        o.a<?> aVar = this.f44236g;
        if (aVar != null) {
            aVar.f44321c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void e(com.bumptech.glide.load.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.f fVar2) {
        this.f44232c.e(fVar, obj, dVar, this.f44236g.f44321c.d(), fVar);
    }

    boolean g(o.a<?> aVar) {
        o.a<?> aVar2 = this.f44236g;
        return aVar2 != null && aVar2 == aVar;
    }

    void h(o.a<?> aVar, Object obj) {
        j e4 = this.f44231b.e();
        if (obj != null && e4.c(aVar.f44321c.d())) {
            this.f44235f = obj;
            this.f44232c.c();
        } else {
            f.a aVar2 = this.f44232c;
            com.bumptech.glide.load.f fVar = aVar.f44319a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f44321c;
            aVar2.e(fVar, obj, dVar, dVar.d(), this.f44237h);
        }
    }

    void i(o.a<?> aVar, @o0 Exception exc) {
        f.a aVar2 = this.f44232c;
        d dVar = this.f44237h;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f44321c;
        aVar2.a(dVar, exc, dVar2, dVar2.d());
    }
}
