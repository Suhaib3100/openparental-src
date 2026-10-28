package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: Uploader_Factory.java */
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
/* loaded from: classes5.dex */
public final class t implements com.google.android.datatransport.runtime.dagger.internal.c<s> {

    /* renamed from: a, reason: collision with root package name */
    private final cd.c<Context> f52179a;

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.backends.e> f52180b;

    /* renamed from: c, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.scheduling.persistence.d> f52181c;

    /* renamed from: d, reason: collision with root package name */
    private final cd.c<y> f52182d;

    /* renamed from: e, reason: collision with root package name */
    private final cd.c<Executor> f52183e;

    /* renamed from: f, reason: collision with root package name */
    private final cd.c<p8.a> f52184f;

    /* renamed from: g, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.time.a> f52185g;

    /* renamed from: h, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.time.a> f52186h;

    /* renamed from: i, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.scheduling.persistence.c> f52187i;

    public t(cd.c<Context> cVar, cd.c<com.google.android.datatransport.runtime.backends.e> cVar2, cd.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar3, cd.c<y> cVar4, cd.c<Executor> cVar5, cd.c<p8.a> cVar6, cd.c<com.google.android.datatransport.runtime.time.a> cVar7, cd.c<com.google.android.datatransport.runtime.time.a> cVar8, cd.c<com.google.android.datatransport.runtime.scheduling.persistence.c> cVar9) {
        this.f52179a = cVar;
        this.f52180b = cVar2;
        this.f52181c = cVar3;
        this.f52182d = cVar4;
        this.f52183e = cVar5;
        this.f52184f = cVar6;
        this.f52185g = cVar7;
        this.f52186h = cVar8;
        this.f52187i = cVar9;
    }

    public static t a(cd.c<Context> cVar, cd.c<com.google.android.datatransport.runtime.backends.e> cVar2, cd.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar3, cd.c<y> cVar4, cd.c<Executor> cVar5, cd.c<p8.a> cVar6, cd.c<com.google.android.datatransport.runtime.time.a> cVar7, cd.c<com.google.android.datatransport.runtime.time.a> cVar8, cd.c<com.google.android.datatransport.runtime.scheduling.persistence.c> cVar9) {
        return new t(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static s c(Context context, com.google.android.datatransport.runtime.backends.e eVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, y yVar, Executor executor, p8.a aVar, com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.time.a aVar3, com.google.android.datatransport.runtime.scheduling.persistence.c cVar) {
        return new s(context, eVar, dVar, yVar, executor, aVar, aVar2, aVar3, cVar);
    }

    @Override // cd.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return new s(this.f52179a.get(), this.f52180b.get(), this.f52181c.get(), this.f52182d.get(), this.f52183e.get(), this.f52184f.get(), this.f52185g.get(), this.f52186h.get(), this.f52187i.get());
    }
}
