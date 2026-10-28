package com.google.android.datatransport.runtime;

/* compiled from: TransportRuntime_Factory.java */
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.g("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.a
/* loaded from: classes5.dex */
public final class z implements com.google.android.datatransport.runtime.dagger.internal.c<x> {

    /* renamed from: a, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.time.a> f52316a;

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.time.a> f52317b;

    /* renamed from: c, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.scheduling.e> f52318c;

    /* renamed from: d, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> f52319d;

    /* renamed from: e, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.w> f52320e;

    public z(cd.c<com.google.android.datatransport.runtime.time.a> cVar, cd.c<com.google.android.datatransport.runtime.time.a> cVar2, cd.c<com.google.android.datatransport.runtime.scheduling.e> cVar3, cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> cVar4, cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.w> cVar5) {
        this.f52316a = cVar;
        this.f52317b = cVar2;
        this.f52318c = cVar3;
        this.f52319d = cVar4;
        this.f52320e = cVar5;
    }

    public static z a(cd.c<com.google.android.datatransport.runtime.time.a> cVar, cd.c<com.google.android.datatransport.runtime.time.a> cVar2, cd.c<com.google.android.datatransport.runtime.scheduling.e> cVar3, cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> cVar4, cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.w> cVar5) {
        return new z(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static x c(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.s sVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.w wVar) {
        return new x(aVar, aVar2, eVar, sVar, wVar);
    }

    @Override // cd.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return new x(this.f52316a.get(), this.f52317b.get(), this.f52318c.get(), this.f52319d.get(), this.f52320e.get());
    }
}
