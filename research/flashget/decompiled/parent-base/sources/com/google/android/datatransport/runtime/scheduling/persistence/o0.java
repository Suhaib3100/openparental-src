package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: SQLiteEventStore_Factory.java */
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic", "javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.g("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.a
/* loaded from: classes5.dex */
public final class o0 implements com.google.android.datatransport.runtime.dagger.internal.c<n0> {

    /* renamed from: a, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.time.a> f52247a;

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.time.a> f52248b;

    /* renamed from: c, reason: collision with root package name */
    private final cd.c<e> f52249c;

    /* renamed from: d, reason: collision with root package name */
    private final cd.c<w0> f52250d;

    /* renamed from: e, reason: collision with root package name */
    private final cd.c<String> f52251e;

    public o0(cd.c<com.google.android.datatransport.runtime.time.a> cVar, cd.c<com.google.android.datatransport.runtime.time.a> cVar2, cd.c<e> cVar3, cd.c<w0> cVar4, cd.c<String> cVar5) {
        this.f52247a = cVar;
        this.f52248b = cVar2;
        this.f52249c = cVar3;
        this.f52250d = cVar4;
        this.f52251e = cVar5;
    }

    public static o0 a(cd.c<com.google.android.datatransport.runtime.time.a> cVar, cd.c<com.google.android.datatransport.runtime.time.a> cVar2, cd.c<e> cVar3, cd.c<w0> cVar4, cd.c<String> cVar5) {
        return new o0(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static n0 c(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, Object obj, Object obj2, cd.c<String> cVar) {
        return new n0(aVar, aVar2, (e) obj, (w0) obj2, cVar);
    }

    @Override // cd.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c(this.f52247a.get(), this.f52248b.get(), this.f52249c.get(), this.f52250d.get(), this.f52251e);
    }
}
