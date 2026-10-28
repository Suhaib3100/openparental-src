package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import java.util.concurrent.Executor;

/* compiled from: DefaultScheduler_Factory.java */
@com.google.android.datatransport.runtime.dagger.internal.f
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
/* loaded from: classes5.dex */
public final class d implements com.google.android.datatransport.runtime.dagger.internal.c<c> {

    /* renamed from: a, reason: collision with root package name */
    private final cd.c<Executor> f52099a;

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.backends.e> f52100b;

    /* renamed from: c, reason: collision with root package name */
    private final cd.c<y> f52101c;

    /* renamed from: d, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.scheduling.persistence.d> f52102d;

    /* renamed from: e, reason: collision with root package name */
    private final cd.c<p8.a> f52103e;

    public d(cd.c<Executor> cVar, cd.c<com.google.android.datatransport.runtime.backends.e> cVar2, cd.c<y> cVar3, cd.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar4, cd.c<p8.a> cVar5) {
        this.f52099a = cVar;
        this.f52100b = cVar2;
        this.f52101c = cVar3;
        this.f52102d = cVar4;
        this.f52103e = cVar5;
    }

    public static d a(cd.c<Executor> cVar, cd.c<com.google.android.datatransport.runtime.backends.e> cVar2, cd.c<y> cVar3, cd.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar4, cd.c<p8.a> cVar5) {
        return new d(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static c c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, y yVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, p8.a aVar) {
        return new c(executor, eVar, yVar, dVar, aVar);
    }

    @Override // cd.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new c(this.f52099a.get(), this.f52100b.get(), this.f52101c.get(), this.f52102d.get(), this.f52103e.get());
    }
}
