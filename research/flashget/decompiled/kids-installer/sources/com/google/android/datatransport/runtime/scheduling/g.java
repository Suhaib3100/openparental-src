package com.google.android.datatransport.runtime.scheduling;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.dagger.internal.p;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* loaded from: classes3.dex */
public final class g implements com.google.android.datatransport.runtime.dagger.internal.g<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.time.a> f12574a;

    public g(h3.c<com.google.android.datatransport.runtime.time.a> cVar) {
        this.f12574a = cVar;
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.g a(com.google.android.datatransport.runtime.time.a aVar) {
        return (com.google.android.datatransport.runtime.scheduling.jobscheduling.g) p.c(com.google.android.datatransport.runtime.scheduling.jobscheduling.g.f(aVar), ProtectedSandApp.s("\u2061"));
    }

    public static g b(h3.c<com.google.android.datatransport.runtime.time.a> cVar) {
        return new g(cVar);
    }

    @Override // h3.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.g get() {
        return a(this.f12574a.get());
    }
}
