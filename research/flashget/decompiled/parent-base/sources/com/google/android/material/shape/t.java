package com.google.android.material.shape;

import androidx.annotation.o0;

/* compiled from: TriangleEdgeTreatment.java */
/* loaded from: classes6.dex */
public class t extends g {

    /* renamed from: b, reason: collision with root package name */
    private final float f53995b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f53996c;

    public t(float f4, boolean z4) {
        this.f53995b = f4;
        this.f53996c = z4;
    }

    @Override // com.google.android.material.shape.g
    public void c(float f4, float f5, float f6, @o0 q qVar) {
        qVar.n(f5 - (this.f53995b * f6), 0.0f);
        qVar.n(f5, (this.f53996c ? this.f53995b : -this.f53995b) * f6);
        qVar.n((this.f53995b * f6) + f5, 0.0f);
        qVar.n(f4, 0.0f);
    }
}
