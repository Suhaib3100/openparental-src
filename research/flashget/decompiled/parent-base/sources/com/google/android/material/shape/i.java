package com.google.android.material.shape;

import androidx.annotation.o0;

/* compiled from: MarkerEdgeTreatment.java */
/* loaded from: classes6.dex */
public final class i extends g {

    /* renamed from: b, reason: collision with root package name */
    private final float f53858b;

    public i(float f4) {
        this.f53858b = f4 - 0.001f;
    }

    @Override // com.google.android.material.shape.g
    boolean b() {
        return true;
    }

    @Override // com.google.android.material.shape.g
    public void c(float f4, float f5, float f6, @o0 q qVar) {
        float sqrt = (float) ((Math.sqrt(2.0d) * this.f53858b) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.f53858b, 2.0d) - Math.pow(sqrt, 2.0d));
        qVar.p(f5 - sqrt, ((float) (-((Math.sqrt(2.0d) * this.f53858b) - this.f53858b))) + sqrt2);
        qVar.n(f5, (float) (-((Math.sqrt(2.0d) * this.f53858b) - this.f53858b)));
        qVar.n(f5 + sqrt, ((float) (-((Math.sqrt(2.0d) * this.f53858b) - this.f53858b))) + sqrt2);
    }
}
