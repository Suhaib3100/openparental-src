package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* compiled from: SchemaManager_Factory.java */
/* loaded from: classes3.dex */
public final class v0 implements com.google.android.datatransport.runtime.dagger.internal.g<u0> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<Context> f12751a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.c<String> f12752b;

    /* renamed from: c, reason: collision with root package name */
    private final h3.c<Integer> f12753c;

    public v0(h3.c<Context> cVar, h3.c<String> cVar2, h3.c<Integer> cVar3) {
        this.f12751a = cVar;
        this.f12752b = cVar2;
        this.f12753c = cVar3;
    }

    public static v0 a(h3.c<Context> cVar, h3.c<String> cVar2, h3.c<Integer> cVar3) {
        return new v0(cVar, cVar2, cVar3);
    }

    public static u0 c(Context context, String str, int i5) {
        return new u0(context, str, i5);
    }

    @Override // h3.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u0 get() {
        return new u0(this.f12751a.get(), this.f12752b.get(), this.f12753c.get().intValue());
    }
}
