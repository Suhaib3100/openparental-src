package com.github.mikephil.charting.highlight;

/* compiled from: Range.java */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public float f50444a;

    /* renamed from: b, reason: collision with root package name */
    public float f50445b;

    public j(float f4, float f5) {
        this.f50444a = f4;
        this.f50445b = f5;
    }

    public boolean a(float f4) {
        return f4 > this.f50444a && f4 <= this.f50445b;
    }

    public boolean b(float f4) {
        return f4 > this.f50445b;
    }

    public boolean c(float f4) {
        return f4 < this.f50444a;
    }
}
