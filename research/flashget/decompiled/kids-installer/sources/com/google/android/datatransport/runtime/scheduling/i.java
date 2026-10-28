package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.dagger.internal.p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* loaded from: classes3.dex */
public final class i implements com.google.android.datatransport.runtime.dagger.internal.g<y> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<Context> f12575a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.scheduling.persistence.d> f12576b;

    /* renamed from: c, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> f12577c;

    /* renamed from: d, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.time.a> f12578d;

    public i(h3.c<Context> cVar, h3.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar2, h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> cVar3, h3.c<com.google.android.datatransport.runtime.time.a> cVar4) {
        this.f12575a = cVar;
        this.f12576b = cVar2;
        this.f12577c = cVar3;
        this.f12578d = cVar4;
    }

    public static i a(h3.c<Context> cVar, h3.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar2, h3.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> cVar3, h3.c<com.google.android.datatransport.runtime.time.a> cVar4) {
        return new i(cVar, cVar2, cVar3, cVar4);
    }

    public static y c(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.g gVar, com.google.android.datatransport.runtime.time.a aVar) {
        return (y) p.c(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(context, dVar, gVar), ProtectedSandApp.s("\u2062"));
    }

    @Override // h3.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f12575a.get(), this.f12576b.get(), this.f12577c.get(), this.f12578d.get());
    }
}
