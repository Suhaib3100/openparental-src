package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.n;

/* compiled from: DefaultFillFormatter.java */
/* loaded from: classes5.dex */
public class c implements f {
    @Override // com.github.mikephil.charting.formatter.f
    public float a(f8.f fVar, e8.g gVar) {
        float l4 = gVar.l();
        float k4 = gVar.k();
        n r4 = gVar.r();
        if (fVar.f() > 0.0f && fVar.p() < 0.0f) {
            return 0.0f;
        }
        if (r4.z() > 0.0f) {
            l4 = 0.0f;
        }
        if (r4.B() < 0.0f) {
            k4 = 0.0f;
        }
        return fVar.p() >= 0.0f ? k4 : l4;
    }
}
