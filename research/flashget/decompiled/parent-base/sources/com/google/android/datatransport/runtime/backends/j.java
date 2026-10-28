package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: CreationContextFactory.java */
/* loaded from: classes5.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f51971a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f51972b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f51973c;

    @cd.a
    j(Context context, @com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2) {
        this.f51971a = context;
        this.f51972b = aVar;
        this.f51973c = aVar2;
    }

    i a(String str) {
        return new c(this.f51971a, this.f51972b, this.f51973c, str);
    }
}
