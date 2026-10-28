package com.google.android.material.shape;

import androidx.annotation.o0;

/* compiled from: RoundedCornerTreatment.java */
/* loaded from: classes6.dex */
public class n extends e {

    /* renamed from: a, reason: collision with root package name */
    float f53912a;

    public n() {
        this.f53912a = -1.0f;
    }

    @Override // com.google.android.material.shape.e
    public void b(@o0 q qVar, float f4, float f5, float f6) {
        qVar.q(0.0f, f6 * f5, 180.0f, 180.0f - f4);
        float f7 = f6 * 2.0f * f5;
        qVar.a(0.0f, 0.0f, f7, f7, 180.0f, f4);
    }

    @Deprecated
    public n(float f4) {
        this.f53912a = f4;
    }
}
