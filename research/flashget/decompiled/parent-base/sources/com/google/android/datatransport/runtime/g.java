package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.m;
import com.google.android.datatransport.runtime.scheduling.persistence.n0;
import com.google.android.datatransport.runtime.scheduling.persistence.o0;
import com.google.android.datatransport.runtime.scheduling.persistence.x0;
import com.google.android.datatransport.runtime.y;
import java.util.concurrent.Executor;

/* compiled from: DaggerTransportRuntimeComponent.java */
@com.google.android.datatransport.runtime.dagger.internal.a
/* loaded from: classes5.dex */
final class g {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerTransportRuntimeComponent.java */
    static final class b implements y.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f52064a;

        private b() {
        }

        @Override // com.google.android.datatransport.runtime.y.a
        public y a() {
            com.google.android.datatransport.runtime.dagger.internal.e.a(this.f52064a, Context.class);
            return new c(this.f52064a);
        }

        @Override // com.google.android.datatransport.runtime.y.a
        public y.a b(Context context) {
            context.getClass();
            this.f52064a = context;
            return this;
        }

        public b c(Context context) {
            context.getClass();
            this.f52064a = context;
            return this;
        }

        b(a aVar) {
        }
    }

    /* compiled from: DaggerTransportRuntimeComponent.java */
    private static final class c extends y {

        /* renamed from: b, reason: collision with root package name */
        private final c f52065b;

        /* renamed from: c, reason: collision with root package name */
        private cd.c<Executor> f52066c;

        /* renamed from: d, reason: collision with root package name */
        private cd.c<Context> f52067d;

        /* renamed from: e, reason: collision with root package name */
        private cd.c f52068e;

        /* renamed from: f, reason: collision with root package name */
        private cd.c f52069f;

        /* renamed from: g, reason: collision with root package name */
        private cd.c f52070g;

        /* renamed from: h, reason: collision with root package name */
        private cd.c<String> f52071h;

        /* renamed from: i, reason: collision with root package name */
        private cd.c<n0> f52072i;

        /* renamed from: j, reason: collision with root package name */
        private cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> f52073j;

        /* renamed from: k, reason: collision with root package name */
        private cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.y> f52074k;

        /* renamed from: l, reason: collision with root package name */
        private cd.c<com.google.android.datatransport.runtime.scheduling.c> f52075l;

        /* renamed from: m, reason: collision with root package name */
        private cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> f52076m;

        /* renamed from: n, reason: collision with root package name */
        private cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.w> f52077n;

        /* renamed from: o, reason: collision with root package name */
        private cd.c<x> f52078o;

        private c(Context context) {
            this.f52065b = this;
            c(context);
        }

        private void c(Context context) {
            this.f52066c = com.google.android.datatransport.runtime.dagger.internal.b.b(m.a.f52081a);
            com.google.android.datatransport.runtime.dagger.internal.c a5 = com.google.android.datatransport.runtime.dagger.internal.d.a(context);
            this.f52067d = a5;
            com.google.android.datatransport.runtime.backends.k kVar = new com.google.android.datatransport.runtime.backends.k(a5, com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a());
            this.f52068e = kVar;
            this.f52069f = com.google.android.datatransport.runtime.dagger.internal.b.b(new com.google.android.datatransport.runtime.backends.m(this.f52067d, kVar));
            this.f52070g = new x0(this.f52067d, com.google.android.datatransport.runtime.scheduling.persistence.g.a(), com.google.android.datatransport.runtime.scheduling.persistence.i.a());
            this.f52071h = com.google.android.datatransport.runtime.dagger.internal.b.b(new com.google.android.datatransport.runtime.scheduling.persistence.h(this.f52067d));
            this.f52072i = com.google.android.datatransport.runtime.dagger.internal.b.b(new o0(com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), com.google.android.datatransport.runtime.scheduling.persistence.j.a(), this.f52070g, this.f52071h));
            com.google.android.datatransport.runtime.scheduling.g gVar = new com.google.android.datatransport.runtime.scheduling.g(com.google.android.datatransport.runtime.time.e.a());
            this.f52073j = gVar;
            com.google.android.datatransport.runtime.scheduling.i iVar = new com.google.android.datatransport.runtime.scheduling.i(this.f52067d, this.f52072i, gVar, com.google.android.datatransport.runtime.time.f.a());
            this.f52074k = iVar;
            cd.c<Executor> cVar = this.f52066c;
            cd.c cVar2 = this.f52069f;
            cd.c<n0> cVar3 = this.f52072i;
            this.f52075l = new com.google.android.datatransport.runtime.scheduling.d(cVar, cVar2, iVar, cVar3, cVar3);
            cd.c<Context> cVar4 = this.f52067d;
            cd.c cVar5 = this.f52069f;
            cd.c<n0> cVar6 = this.f52072i;
            this.f52076m = new com.google.android.datatransport.runtime.scheduling.jobscheduling.t(cVar4, cVar5, cVar6, this.f52074k, this.f52066c, cVar6, com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), this.f52072i);
            cd.c<Executor> cVar7 = this.f52066c;
            cd.c<n0> cVar8 = this.f52072i;
            this.f52077n = new com.google.android.datatransport.runtime.scheduling.jobscheduling.x(cVar7, cVar8, this.f52074k, cVar8);
            this.f52078o = com.google.android.datatransport.runtime.dagger.internal.b.b(new z(com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), this.f52075l, this.f52076m, this.f52077n));
        }

        @Override // com.google.android.datatransport.runtime.y
        com.google.android.datatransport.runtime.scheduling.persistence.d a() {
            return this.f52072i.get();
        }

        @Override // com.google.android.datatransport.runtime.y
        x b() {
            return this.f52078o.get();
        }
    }

    private g() {
    }

    public static y.a a() {
        return new b();
    }
}
