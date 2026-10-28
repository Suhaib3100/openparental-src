package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.d;

/* compiled from: TransportImpl.java */
/* loaded from: classes3.dex */
final class v<T> implements com.google.android.datatransport.h<T> {

    /* renamed from: a, reason: collision with root package name */
    private final s f12763a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12764b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.c f12765c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.g<T, byte[]> f12766d;

    /* renamed from: e, reason: collision with root package name */
    private final w f12767e;

    v(s sVar, String str, com.google.android.datatransport.c cVar, com.google.android.datatransport.g<T, byte[]> gVar, w wVar) {
        this.f12763a = sVar;
        this.f12764b = str;
        this.f12765c = cVar;
        this.f12766d = gVar;
        this.f12767e = wVar;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    private static /* synthetic */ void e(Exception exc) {
    }

    @Override // com.google.android.datatransport.h
    public void a(com.google.android.datatransport.d<T> dVar) {
        b(dVar, new com.google.android.datatransport.j() { // from class: com.google.android.datatransport.runtime.u
            @Override // com.google.android.datatransport.j
            public final void a(Exception exc) {
            }
        });
    }

    @Override // com.google.android.datatransport.h
    public void b(com.google.android.datatransport.d<T> dVar, com.google.android.datatransport.j jVar) {
        this.f12767e.a(new d.b().f(this.f12763a).c(dVar).g(this.f12764b).e(this.f12766d).b(this.f12765c).a(), jVar);
    }

    s d() {
        return this.f12763a;
    }
}
