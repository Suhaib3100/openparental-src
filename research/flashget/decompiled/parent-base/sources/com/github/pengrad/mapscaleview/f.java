package com.github.pengrad.mapscaleview;

import androidx.annotation.q0;

/* compiled from: Scales.java */
/* loaded from: classes5.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final e f51737a;

    /* renamed from: b, reason: collision with root package name */
    private final e f51738b;

    f(e eVar, e eVar2) {
        this.f51737a = eVar;
        this.f51738b = eVar2;
    }

    @q0
    e a() {
        return this.f51738b;
    }

    float b() {
        e eVar = this.f51737a;
        float a5 = eVar != null ? eVar.a() : 0.0f;
        e eVar2 = this.f51738b;
        return Math.max(a5, eVar2 != null ? eVar2.a() : 0.0f);
    }

    @q0
    e c() {
        return this.f51737a;
    }
}
