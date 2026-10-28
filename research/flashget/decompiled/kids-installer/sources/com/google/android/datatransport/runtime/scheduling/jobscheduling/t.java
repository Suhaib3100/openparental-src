package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: Uploader_Factory.java */
/* loaded from: classes3.dex */
public final class t implements com.google.android.datatransport.runtime.dagger.internal.g<s> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<Context> f12649a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.backends.e> f12650b;

    /* renamed from: c, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.scheduling.persistence.d> f12651c;

    /* renamed from: d, reason: collision with root package name */
    private final h3.c<y> f12652d;

    /* renamed from: e, reason: collision with root package name */
    private final h3.c<Executor> f12653e;

    /* renamed from: f, reason: collision with root package name */
    private final h3.c<l1.a> f12654f;

    /* renamed from: g, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.time.a> f12655g;

    /* renamed from: h, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.time.a> f12656h;

    /* renamed from: i, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.scheduling.persistence.c> f12657i;

    public t(h3.c<Context> cVar, h3.c<com.google.android.datatransport.runtime.backends.e> cVar2, h3.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar3, h3.c<y> cVar4, h3.c<Executor> cVar5, h3.c<l1.a> cVar6, h3.c<com.google.android.datatransport.runtime.time.a> cVar7, h3.c<com.google.android.datatransport.runtime.time.a> cVar8, h3.c<com.google.android.datatransport.runtime.scheduling.persistence.c> cVar9) {
        this.f12649a = cVar;
        this.f12650b = cVar2;
        this.f12651c = cVar3;
        this.f12652d = cVar4;
        this.f12653e = cVar5;
        this.f12654f = cVar6;
        this.f12655g = cVar7;
        this.f12656h = cVar8;
        this.f12657i = cVar9;
    }

    public static t a(h3.c<Context> cVar, h3.c<com.google.android.datatransport.runtime.backends.e> cVar2, h3.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar3, h3.c<y> cVar4, h3.c<Executor> cVar5, h3.c<l1.a> cVar6, h3.c<com.google.android.datatransport.runtime.time.a> cVar7, h3.c<com.google.android.datatransport.runtime.time.a> cVar8, h3.c<com.google.android.datatransport.runtime.scheduling.persistence.c> cVar9) {
        return new t(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static s c(Context context, com.google.android.datatransport.runtime.backends.e eVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, y yVar, Executor executor, l1.a aVar, com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.time.a aVar3, com.google.android.datatransport.runtime.scheduling.persistence.c cVar) {
        return new s(context, eVar, dVar, yVar, executor, aVar, aVar2, aVar3, cVar);
    }

    @Override // h3.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.f12649a.get(), this.f12650b.get(), this.f12651c.get(), this.f12652d.get(), this.f12653e.get(), this.f12654f.get(), this.f12655g.get(), this.f12656h.get(), this.f12657i.get());
    }
}
