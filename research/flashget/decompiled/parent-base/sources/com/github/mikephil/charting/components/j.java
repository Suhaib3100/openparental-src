package com.github.mikephil.charting.components;

/* compiled from: XAxis.java */
/* loaded from: classes5.dex */
public class j extends com.github.mikephil.charting.components.a {
    public int J = 1;
    public int K = 1;
    public int L = 1;
    public int M = 1;
    protected float N = 0.0f;
    private boolean O = false;
    private a P = a.TOP;

    /* compiled from: XAxis.java */
    public enum a {
        TOP,
        BOTTOM,
        BOTH_SIDED,
        TOP_INSIDE,
        BOTTOM_INSIDE
    }

    public j() {
        this.f50291c = com.github.mikephil.charting.utils.k.e(4.0f);
    }

    public void A0(a aVar) {
        this.P = aVar;
    }

    public float v0() {
        return this.N;
    }

    public a w0() {
        return this.P;
    }

    public boolean x0() {
        return this.O;
    }

    public void y0(boolean z4) {
        this.O = z4;
    }

    public void z0(float f4) {
        this.N = f4;
    }
}
