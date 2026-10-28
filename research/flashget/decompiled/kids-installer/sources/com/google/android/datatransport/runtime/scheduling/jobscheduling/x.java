package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;

/* compiled from: WorkInitializer_Factory.java */
/* loaded from: classes3.dex */
public final class x implements com.google.android.datatransport.runtime.dagger.internal.g<w> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<Executor> f12664a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.scheduling.persistence.d> f12665b;

    /* renamed from: c, reason: collision with root package name */
    private final h3.c<y> f12666c;

    /* renamed from: d, reason: collision with root package name */
    private final h3.c<l1.a> f12667d;

    public x(h3.c<Executor> cVar, h3.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar2, h3.c<y> cVar3, h3.c<l1.a> cVar4) {
        this.f12664a = cVar;
        this.f12665b = cVar2;
        this.f12666c = cVar3;
        this.f12667d = cVar4;
    }

    public static x a(h3.c<Executor> cVar, h3.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar2, h3.c<y> cVar3, h3.c<l1.a> cVar4) {
        return new x(cVar, cVar2, cVar3, cVar4);
    }

    public static w c(Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, y yVar, l1.a aVar) {
        return new w(executor, dVar, yVar, aVar);
    }

    @Override // h3.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return new w(this.f12664a.get(), this.f12665b.get(), this.f12666c.get(), this.f12667d.get());
    }
}
