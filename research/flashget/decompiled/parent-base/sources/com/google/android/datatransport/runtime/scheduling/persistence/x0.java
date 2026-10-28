package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* compiled from: SchemaManager_Factory.java */
@com.google.android.datatransport.runtime.dagger.internal.f({"javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
/* loaded from: classes5.dex */
public final class x0 implements com.google.android.datatransport.runtime.dagger.internal.c<w0> {

    /* renamed from: a, reason: collision with root package name */
    private final cd.c<Context> f52297a;

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<String> f52298b;

    /* renamed from: c, reason: collision with root package name */
    private final cd.c<Integer> f52299c;

    public x0(cd.c<Context> cVar, cd.c<String> cVar2, cd.c<Integer> cVar3) {
        this.f52297a = cVar;
        this.f52298b = cVar2;
        this.f52299c = cVar3;
    }

    public static x0 a(cd.c<Context> cVar, cd.c<String> cVar2, cd.c<Integer> cVar3) {
        return new x0(cVar, cVar2, cVar3);
    }

    public static w0 c(Context context, String str, int i4) {
        return new w0(context, str, i4);
    }

    @Override // cd.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w0 get() {
        return new w0(this.f52297a.get(), this.f52298b.get(), this.f52299c.get().intValue());
    }
}
