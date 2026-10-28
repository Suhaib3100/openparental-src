package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import java.util.concurrent.Executor;

/* compiled from: DefaultScheduler_Factory.java */
/* loaded from: classes3.dex */
public final class d implements com.google.android.datatransport.runtime.dagger.internal.g<c> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<Executor> f12569a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.backends.e> f12570b;

    /* renamed from: c, reason: collision with root package name */
    private final h3.c<y> f12571c;

    /* renamed from: d, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.scheduling.persistence.d> f12572d;

    /* renamed from: e, reason: collision with root package name */
    private final h3.c<l1.a> f12573e;

    public d(h3.c<Executor> cVar, h3.c<com.google.android.datatransport.runtime.backends.e> cVar2, h3.c<y> cVar3, h3.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar4, h3.c<l1.a> cVar5) {
        this.f12569a = cVar;
        this.f12570b = cVar2;
        this.f12571c = cVar3;
        this.f12572d = cVar4;
        this.f12573e = cVar5;
    }

    public static d a(h3.c<Executor> cVar, h3.c<com.google.android.datatransport.runtime.backends.e> cVar2, h3.c<y> cVar3, h3.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar4, h3.c<l1.a> cVar5) {
        return new d(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static c c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, y yVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, l1.a aVar) {
        return new c(executor, eVar, yVar, dVar, aVar);
    }

    @Override // h3.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f12569a.get(), this.f12570b.get(), this.f12571c.get(), this.f12572d.get(), this.f12573e.get());
    }
}
