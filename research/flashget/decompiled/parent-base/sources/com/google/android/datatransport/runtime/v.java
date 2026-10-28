package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.d;

/* compiled from: TransportImpl.java */
/* loaded from: classes5.dex */
final class v<T> implements com.google.android.datatransport.l<T> {

    /* renamed from: a, reason: collision with root package name */
    private final s f52306a;

    /* renamed from: b, reason: collision with root package name */
    private final String f52307b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.e f52308c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.k<T, byte[]> f52309d;

    /* renamed from: e, reason: collision with root package name */
    private final w f52310e;

    v(s sVar, String str, com.google.android.datatransport.e eVar, com.google.android.datatransport.k<T, byte[]> kVar, w wVar) {
        this.f52306a = sVar;
        this.f52307b = str;
        this.f52308c = eVar;
        this.f52309d = kVar;
        this.f52310e = wVar;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    private static /* synthetic */ void e(Exception exc) {
    }

    @Override // com.google.android.datatransport.l
    public void a(com.google.android.datatransport.f<T> fVar, com.google.android.datatransport.n nVar) {
        this.f52310e.a(new d.b().f(this.f52306a).c(fVar).g(this.f52307b).e(this.f52309d).b(this.f52308c).a(), nVar);
    }

    @Override // com.google.android.datatransport.l
    public void b(com.google.android.datatransport.f<T> fVar) {
        a(fVar, new u());
    }

    s d() {
        return this.f52306a;
    }
}
