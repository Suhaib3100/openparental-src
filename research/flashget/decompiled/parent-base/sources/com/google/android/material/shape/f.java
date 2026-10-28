package com.google.android.material.shape;

import androidx.annotation.o0;

/* compiled from: CutCornerTreatment.java */
/* loaded from: classes6.dex */
public class f extends e {

    /* renamed from: a, reason: collision with root package name */
    float f53850a;

    public f() {
        this.f53850a = -1.0f;
    }

    @Override // com.google.android.material.shape.e
    public void b(@o0 q qVar, float f4, float f5, float f6) {
        qVar.q(0.0f, f6 * f5, 180.0f, 180.0f - f4);
        double d5 = f6;
        double d6 = f5;
        qVar.n((float) (Math.sin(Math.toRadians(f4)) * d5 * d6), (float) (Math.sin(Math.toRadians(90.0f - f4)) * d5 * d6));
    }

    @Deprecated
    public f(float f4) {
        this.f53850a = f4;
    }
}
