package com.google.android.material.shape;

import androidx.annotation.o0;

/* compiled from: RoundedCornerTreatment.java */
/* loaded from: classes3.dex */
public class n extends e {

    /* renamed from: a, reason: collision with root package name */
    float f14039a;

    public n() {
        this.f14039a = -1.0f;
    }

    @Override // com.google.android.material.shape.e
    public void b(@o0 q qVar, float f6, float f7, float f8) {
        qVar.q(0.0f, f8 * f7, 180.0f, 180.0f - f6);
        float f9 = f8 * 2.0f * f7;
        qVar.a(0.0f, 0.0f, f9, f9, 180.0f, f6);
    }

    @Deprecated
    public n(float f6) {
        this.f14039a = f6;
    }
}
