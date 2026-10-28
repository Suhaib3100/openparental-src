package com.google.android.material.shape;

import androidx.annotation.o0;

/* compiled from: OffsetEdgeTreatment.java */
/* loaded from: classes6.dex */
public final class l extends g {

    /* renamed from: b, reason: collision with root package name */
    private final g f53909b;

    /* renamed from: c, reason: collision with root package name */
    private final float f53910c;

    public l(@o0 g gVar, float f4) {
        this.f53909b = gVar;
        this.f53910c = f4;
    }

    @Override // com.google.android.material.shape.g
    boolean b() {
        return this.f53909b.b();
    }

    @Override // com.google.android.material.shape.g
    public void c(float f4, float f5, float f6, @o0 q qVar) {
        this.f53909b.c(f4, f5 - this.f53910c, f6, qVar);
    }
}
