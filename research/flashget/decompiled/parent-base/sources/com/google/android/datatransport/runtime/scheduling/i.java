package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
/* loaded from: classes5.dex */
public final class i implements com.google.android.datatransport.runtime.dagger.internal.c<y> {

    /* renamed from: a, reason: collision with root package name */
    private final cd.c<Context> f52105a;

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.scheduling.persistence.d> f52106b;

    /* renamed from: c, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> f52107c;

    /* renamed from: d, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.time.a> f52108d;

    public i(cd.c<Context> cVar, cd.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar2, cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> cVar3, cd.c<com.google.android.datatransport.runtime.time.a> cVar4) {
        this.f52105a = cVar;
        this.f52106b = cVar2;
        this.f52107c = cVar3;
        this.f52108d = cVar4;
    }

    public static i a(cd.c<Context> cVar, cd.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar2, cd.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> cVar3, cd.c<com.google.android.datatransport.runtime.time.a> cVar4) {
        return new i(cVar, cVar2, cVar3, cVar4);
    }

    public static y c(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.g gVar, com.google.android.datatransport.runtime.time.a aVar) {
        return (y) com.google.android.datatransport.runtime.dagger.internal.e.f(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(context, dVar, gVar));
    }

    @Override // cd.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f52105a.get(), this.f52106b.get(), this.f52107c.get(), this.f52108d.get());
    }
}
