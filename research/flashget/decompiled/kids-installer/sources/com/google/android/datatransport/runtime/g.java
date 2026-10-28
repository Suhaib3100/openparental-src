package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.m;
import com.google.android.datatransport.runtime.scheduling.persistence.n0;
import com.google.android.datatransport.runtime.scheduling.persistence.o0;
import com.google.android.datatransport.runtime.scheduling.persistence.v0;
import com.google.android.datatransport.runtime.y;
import java.util.concurrent.Executor;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* loaded from: classes3.dex */
final class g extends y {
    private h3.c<x> A;

    /* renamed from: o, reason: collision with root package name */
    private h3.c<Executor> f12536o;

    /* renamed from: p, reason: collision with root package name */
    private h3.c<Context> f12537p;

    /* renamed from: q, reason: collision with root package name */
    private h3.c f12538q;

    /* renamed from: r, reason: collision with root package name */
    private h3.c f12539r;

    /* renamed from: s, reason: collision with root package name */
    private h3.c f12540s;

    /* renamed from: t, reason: collision with root package name */
    private h3.c<String> f12541t;

    /* renamed from: u, reason: collision with root package name */
    private h3.c<n0> f12542u;

    /* renamed from: v, reason: collision with root package name */
    private h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> f12543v;

    /* renamed from: w, reason: collision with root package name */
    private h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.y> f12544w;

    /* renamed from: x, reason: collision with root package name */
    private h3.c<com.google.android.datatransport.runtime.scheduling.c> f12545x;

    /* renamed from: y, reason: collision with root package name */
    private h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> f12546y;

    /* renamed from: z, reason: collision with root package name */
    private h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.w> f12547z;

    /* compiled from: DaggerTransportRuntimeComponent.java */
    private static final class b implements y.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f12548a;

        private b() {
        }

        @Override // com.google.android.datatransport.runtime.y.a
        public y.a a(Context context) {
            context.getClass();
            this.f12548a = context;
            return this;
        }

        public b b(Context context) {
            context.getClass();
            this.f12548a = context;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.y.a
        public y build() {
            com.google.android.datatransport.runtime.dagger.internal.p.a(this.f12548a, Context.class);
            return new g(this.f12548a);
        }

        b(a aVar) {
        }
    }

    public static y.a c() {
        return new b(null);
    }

    private void d(Context context) {
        this.f12536o = com.google.android.datatransport.runtime.dagger.internal.f.b(m.a.f12551a);
        com.google.android.datatransport.runtime.dagger.internal.g a6 = com.google.android.datatransport.runtime.dagger.internal.j.a(context);
        this.f12537p = a6;
        com.google.android.datatransport.runtime.backends.k kVar = new com.google.android.datatransport.runtime.backends.k(a6, com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a());
        this.f12538q = kVar;
        this.f12539r = com.google.android.datatransport.runtime.dagger.internal.f.b(new com.google.android.datatransport.runtime.backends.m(this.f12537p, kVar));
        this.f12540s = new v0(this.f12537p, com.google.android.datatransport.runtime.scheduling.persistence.g.a(), com.google.android.datatransport.runtime.scheduling.persistence.i.a());
        this.f12541t = com.google.android.datatransport.runtime.dagger.internal.f.b(new com.google.android.datatransport.runtime.scheduling.persistence.h(this.f12537p));
        this.f12542u = com.google.android.datatransport.runtime.dagger.internal.f.b(o0.a(com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), com.google.android.datatransport.runtime.scheduling.persistence.j.a(), this.f12540s, this.f12541t));
        com.google.android.datatransport.runtime.scheduling.g gVar = new com.google.android.datatransport.runtime.scheduling.g(com.google.android.datatransport.runtime.time.e.a());
        this.f12543v = gVar;
        com.google.android.datatransport.runtime.scheduling.i iVar = new com.google.android.datatransport.runtime.scheduling.i(this.f12537p, this.f12542u, gVar, com.google.android.datatransport.runtime.time.f.a());
        this.f12544w = iVar;
        h3.c<Executor> cVar = this.f12536o;
        h3.c cVar2 = this.f12539r;
        h3.c<n0> cVar3 = this.f12542u;
        this.f12545x = com.google.android.datatransport.runtime.scheduling.d.a(cVar, cVar2, iVar, cVar3, cVar3);
        h3.c<Context> cVar4 = this.f12537p;
        h3.c cVar5 = this.f12539r;
        h3.c<n0> cVar6 = this.f12542u;
        this.f12546y = com.google.android.datatransport.runtime.scheduling.jobscheduling.t.a(cVar4, cVar5, cVar6, this.f12544w, this.f12536o, cVar6, com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), this.f12542u);
        h3.c<Executor> cVar7 = this.f12536o;
        h3.c<n0> cVar8 = this.f12542u;
        this.f12547z = new com.google.android.datatransport.runtime.scheduling.jobscheduling.x(cVar7, cVar8, this.f12544w, cVar8);
        this.A = com.google.android.datatransport.runtime.dagger.internal.f.b(z.a(com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), this.f12545x, this.f12546y, this.f12547z));
    }

    @Override // com.google.android.datatransport.runtime.y
    com.google.android.datatransport.runtime.scheduling.persistence.d a() {
        return this.f12542u.get();
    }

    @Override // com.google.android.datatransport.runtime.y
    x b() {
        return this.A.get();
    }

    private g(Context context) {
        d(context);
    }
}
