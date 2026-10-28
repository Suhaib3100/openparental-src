package com.google.android.material.shape;

import androidx.annotation.o0;

/* compiled from: OffsetEdgeTreatment.java */
/* loaded from: classes3.dex */
public final class l extends g {

    /* renamed from: o, reason: collision with root package name */
    private final g f14036o;

    /* renamed from: p, reason: collision with root package name */
    private final float f14037p;

    public l(@o0 g gVar, float f6) {
        this.f14036o = gVar;
        this.f14037p = f6;
    }

    @Override // com.google.android.material.shape.g
    boolean a() {
        return this.f14036o.a();
    }

    @Override // com.google.android.material.shape.g
    public void b(float f6, float f7, float f8, @o0 q qVar) {
        this.f14036o.b(f6, f7 - this.f14037p, f8, qVar);
    }
}
