package com.bumptech.glide.load.engine;

import androidx.annotation.m1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Jobs.java */
/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.f, l<?>> f11457a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.f, l<?>> f11458b = new HashMap();

    r() {
    }

    private Map<com.bumptech.glide.load.f, l<?>> c(boolean z5) {
        return z5 ? this.f11458b : this.f11457a;
    }

    l<?> a(com.bumptech.glide.load.f fVar, boolean z5) {
        return c(z5).get(fVar);
    }

    @m1
    Map<com.bumptech.glide.load.f, l<?>> b() {
        return Collections.unmodifiableMap(this.f11457a);
    }

    void d(com.bumptech.glide.load.f fVar, l<?> lVar) {
        c(lVar.q()).put(fVar, lVar);
    }

    void e(com.bumptech.glide.load.f fVar, l<?> lVar) {
        Map<com.bumptech.glide.load.f, l<?>> c6 = c(lVar.q());
        if (lVar.equals(c6.get(fVar))) {
            c6.remove(fVar);
        }
    }
}
