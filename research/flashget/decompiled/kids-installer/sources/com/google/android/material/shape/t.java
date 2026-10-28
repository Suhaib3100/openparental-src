package com.google.android.material.shape;

import androidx.annotation.o0;

/* compiled from: TriangleEdgeTreatment.java */
/* loaded from: classes3.dex */
public class t extends g {

    /* renamed from: o, reason: collision with root package name */
    private final float f14122o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f14123p;

    public t(float f6, boolean z5) {
        this.f14122o = f6;
        this.f14123p = z5;
    }

    @Override // com.google.android.material.shape.g
    public void b(float f6, float f7, float f8, @o0 q qVar) {
        qVar.n(f7 - (this.f14122o * f8), 0.0f);
        qVar.n(f7, (this.f14123p ? this.f14122o : -this.f14122o) * f8);
        qVar.n((this.f14122o * f8) + f7, 0.0f);
        qVar.n(f6, 0.0f);
    }
}
