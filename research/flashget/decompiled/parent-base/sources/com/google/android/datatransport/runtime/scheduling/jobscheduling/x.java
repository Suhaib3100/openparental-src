package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;

/* compiled from: WorkInitializer_Factory.java */
@com.google.android.datatransport.runtime.dagger.internal.f
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
/* loaded from: classes5.dex */
public final class x implements com.google.android.datatransport.runtime.dagger.internal.c<w> {

    /* renamed from: a, reason: collision with root package name */
    private final cd.c<Executor> f52194a;

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.scheduling.persistence.d> f52195b;

    /* renamed from: c, reason: collision with root package name */
    private final cd.c<y> f52196c;

    /* renamed from: d, reason: collision with root package name */
    private final cd.c<p8.a> f52197d;

    public x(cd.c<Executor> cVar, cd.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar2, cd.c<y> cVar3, cd.c<p8.a> cVar4) {
        this.f52194a = cVar;
        this.f52195b = cVar2;
        this.f52196c = cVar3;
        this.f52197d = cVar4;
    }

    public static x a(cd.c<Executor> cVar, cd.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar2, cd.c<y> cVar3, cd.c<p8.a> cVar4) {
        return new x(cVar, cVar2, cVar3, cVar4);
    }

    public static w c(Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, y yVar, p8.a aVar) {
        return new w(executor, dVar, yVar, aVar);
    }

    @Override // cd.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return new w(this.f52194a.get(), this.f52195b.get(), this.f52196c.get(), this.f52197d.get());
    }
}
