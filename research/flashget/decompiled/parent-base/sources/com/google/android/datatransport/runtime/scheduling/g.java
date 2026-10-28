package com.google.android.datatransport.runtime.scheduling;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.WallTime"})
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
/* loaded from: classes5.dex */
public final class g implements com.google.android.datatransport.runtime.dagger.internal.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> {

    /* renamed from: a, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.time.a> f52104a;

    public g(cd.c<com.google.android.datatransport.runtime.time.a> cVar) {
        this.f52104a = cVar;
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.g a(com.google.android.datatransport.runtime.time.a aVar) {
        return (com.google.android.datatransport.runtime.scheduling.jobscheduling.g) com.google.android.datatransport.runtime.dagger.internal.e.f(com.google.android.datatransport.runtime.scheduling.jobscheduling.g.f(aVar));
    }

    public static g b(cd.c<com.google.android.datatransport.runtime.time.a> cVar) {
        return new g(cVar);
    }

    @Override // cd.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.g get() {
        return a(this.f52104a.get());
    }
}
