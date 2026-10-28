package com.google.android.material.shape;

import androidx.annotation.o0;

/* compiled from: CutCornerTreatment.java */
/* loaded from: classes3.dex */
public class f extends e {

    /* renamed from: a, reason: collision with root package name */
    float f13990a;

    public f() {
        this.f13990a = -1.0f;
    }

    @Override // com.google.android.material.shape.e
    public void b(@o0 q qVar, float f6, float f7, float f8) {
        qVar.q(0.0f, f8 * f7, 180.0f, 180.0f - f6);
        double d6 = f8;
        double d7 = f7;
        qVar.n((float) (Math.sin(Math.toRadians(f6)) * d6 * d7), (float) (Math.sin(Math.toRadians(90.0f - f6)) * d6 * d7));
    }

    @Deprecated
    public f(float f6) {
        this.f13990a = f6;
    }
}
