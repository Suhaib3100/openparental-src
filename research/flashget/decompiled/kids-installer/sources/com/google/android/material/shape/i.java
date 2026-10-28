package com.google.android.material.shape;

import androidx.annotation.o0;

/* compiled from: MarkerEdgeTreatment.java */
/* loaded from: classes3.dex */
public final class i extends g {

    /* renamed from: o, reason: collision with root package name */
    private final float f13998o;

    public i(float f6) {
        this.f13998o = f6 - 0.001f;
    }

    @Override // com.google.android.material.shape.g
    boolean a() {
        return true;
    }

    @Override // com.google.android.material.shape.g
    public void b(float f6, float f7, float f8, @o0 q qVar) {
        float sqrt = (float) ((Math.sqrt(2.0d) * this.f13998o) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.f13998o, 2.0d) - Math.pow(sqrt, 2.0d));
        qVar.p(f7 - sqrt, ((float) (-((Math.sqrt(2.0d) * this.f13998o) - this.f13998o))) + sqrt2);
        qVar.n(f7, (float) (-((Math.sqrt(2.0d) * this.f13998o) - this.f13998o)));
        qVar.n(f7 + sqrt, ((float) (-((Math.sqrt(2.0d) * this.f13998o) - this.f13998o))) + sqrt2);
    }
}
