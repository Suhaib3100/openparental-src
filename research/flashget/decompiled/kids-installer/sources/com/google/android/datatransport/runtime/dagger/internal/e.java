package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: DelegateFactory.java */
/* loaded from: classes3.dex */
public final class e<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    private h3.c<T> f12471a;

    public static <T> void b(h3.c<T> cVar, h3.c<T> cVar2) {
        cVar2.getClass();
        e eVar = (e) cVar;
        if (eVar.f12471a != null) {
            throw new IllegalStateException();
        }
        eVar.f12471a = cVar2;
    }

    h3.c<T> a() {
        h3.c<T> cVar = this.f12471a;
        cVar.getClass();
        return cVar;
    }

    @Deprecated
    public void c(h3.c<T> cVar) {
        b(this, cVar);
    }

    @Override // h3.c
    public T get() {
        h3.c<T> cVar = this.f12471a;
        if (cVar != null) {
            return cVar.get();
        }
        throw new IllegalStateException();
    }
}
