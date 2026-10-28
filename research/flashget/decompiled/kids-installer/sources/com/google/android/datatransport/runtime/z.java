package com.google.android.datatransport.runtime;

/* compiled from: TransportRuntime_Factory.java */
/* loaded from: classes3.dex */
public final class z implements com.google.android.datatransport.runtime.dagger.internal.g<x> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.time.a> f12773a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.time.a> f12774b;

    /* renamed from: c, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.scheduling.e> f12775c;

    /* renamed from: d, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> f12776d;

    /* renamed from: e, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.w> f12777e;

    public z(h3.c<com.google.android.datatransport.runtime.time.a> cVar, h3.c<com.google.android.datatransport.runtime.time.a> cVar2, h3.c<com.google.android.datatransport.runtime.scheduling.e> cVar3, h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> cVar4, h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.w> cVar5) {
        this.f12773a = cVar;
        this.f12774b = cVar2;
        this.f12775c = cVar3;
        this.f12776d = cVar4;
        this.f12777e = cVar5;
    }

    public static z a(h3.c<com.google.android.datatransport.runtime.time.a> cVar, h3.c<com.google.android.datatransport.runtime.time.a> cVar2, h3.c<com.google.android.datatransport.runtime.scheduling.e> cVar3, h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> cVar4, h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.w> cVar5) {
        return new z(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static x c(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.s sVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.w wVar) {
        return new x(aVar, aVar2, eVar, sVar, wVar);
    }

    @Override // h3.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f12773a.get(), this.f12774b.get(), this.f12775c.get(), this.f12776d.get(), this.f12777e.get());
    }
}
