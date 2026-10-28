package com.bumptech.glide.load.engine;

import androidx.annotation.m1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Jobs.java */
/* loaded from: classes3.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.f, l<?>> f44197a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.f, l<?>> f44198b = new HashMap();

    r() {
    }

    private Map<com.bumptech.glide.load.f, l<?>> c(boolean z4) {
        return z4 ? this.f44198b : this.f44197a;
    }

    l<?> a(com.bumptech.glide.load.f fVar, boolean z4) {
        return c(z4).get(fVar);
    }

    @m1
    Map<com.bumptech.glide.load.f, l<?>> b() {
        return Collections.unmodifiableMap(this.f44197a);
    }

    void d(com.bumptech.glide.load.f fVar, l<?> lVar) {
        c(lVar.q()).put(fVar, lVar);
    }

    void e(com.bumptech.glide.load.f fVar, l<?> lVar) {
        Map<com.bumptech.glide.load.f, l<?>> c5 = c(lVar.q());
        if (lVar.equals(c5.get(fVar))) {
            c5.remove(fVar);
        }
    }
}
