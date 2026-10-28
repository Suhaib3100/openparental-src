package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: SQLiteEventStore_Factory.java */
/* loaded from: classes3.dex */
public final class o0 implements com.google.android.datatransport.runtime.dagger.internal.g<n0> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.time.a> f12724a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.time.a> f12725b;

    /* renamed from: c, reason: collision with root package name */
    private final h3.c<e> f12726c;

    /* renamed from: d, reason: collision with root package name */
    private final h3.c<u0> f12727d;

    /* renamed from: e, reason: collision with root package name */
    private final h3.c<String> f12728e;

    public o0(h3.c<com.google.android.datatransport.runtime.time.a> cVar, h3.c<com.google.android.datatransport.runtime.time.a> cVar2, h3.c<e> cVar3, h3.c<u0> cVar4, h3.c<String> cVar5) {
        this.f12724a = cVar;
        this.f12725b = cVar2;
        this.f12726c = cVar3;
        this.f12727d = cVar4;
        this.f12728e = cVar5;
    }

    public static o0 a(h3.c<com.google.android.datatransport.runtime.time.a> cVar, h3.c<com.google.android.datatransport.runtime.time.a> cVar2, h3.c<e> cVar3, h3.c<u0> cVar4, h3.c<String> cVar5) {
        return new o0(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static n0 c(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, Object obj, Object obj2, h3.c<String> cVar) {
        return new n0(aVar, aVar2, (e) obj, (u0) obj2, cVar);
    }

    @Override // h3.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c(this.f12724a.get(), this.f12725b.get(), this.f12726c.get(), this.f12727d.get(), this.f12728e);
    }
}
