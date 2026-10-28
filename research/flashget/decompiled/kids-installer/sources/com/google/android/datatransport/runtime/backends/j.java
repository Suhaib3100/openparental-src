package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: CreationContextFactory.java */
/* loaded from: classes2.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12431a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12432b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12433c;

    @h3.a
    j(Context context, @com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2) {
        this.f12431a = context;
        this.f12432b = aVar;
        this.f12433c = aVar2;
    }

    i a(String str) {
        return new c(this.f12431a, this.f12432b, this.f12433c, str);
    }
}
