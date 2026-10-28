package com.github.mikephil.charting.components;

import android.graphics.Paint;
import com.google.firebase.remoteconfig.p;

/* compiled from: YAxis.java */
/* loaded from: classes5.dex */
public class k extends com.github.mikephil.charting.components.a {
    private boolean J;
    private boolean K;
    protected boolean L;
    protected boolean M;
    private boolean N;
    private boolean O;
    protected int P;
    protected float Q;
    protected float R;
    protected float S;
    private b T;
    private a U;
    protected float V;
    protected float W;

    /* compiled from: YAxis.java */
    public enum a {
        LEFT,
        RIGHT
    }

    /* compiled from: YAxis.java */
    public enum b {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public k() {
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = -7829368;
        this.Q = 1.0f;
        this.R = 10.0f;
        this.S = 10.0f;
        this.T = b.OUTSIDE_CHART;
        this.V = 0.0f;
        this.W = Float.POSITIVE_INFINITY;
        this.U = a.LEFT;
        this.f50291c = 0.0f;
    }

    public float A0(Paint paint) {
        paint.setTextSize(this.f50293e);
        float d5 = (d() * 2.0f) + com.github.mikephil.charting.utils.k.d(paint, E());
        float y02 = y0();
        float x02 = x0();
        if (y02 > 0.0f) {
            y02 = com.github.mikephil.charting.utils.k.e(y02);
        }
        if (x02 > 0.0f && x02 != Float.POSITIVE_INFINITY) {
            x02 = com.github.mikephil.charting.utils.k.e(x02);
        }
        if (x02 <= p.f60679p) {
            x02 = d5;
        }
        return Math.max(y02, Math.min(d5, x02));
    }

    public float B0() {
        return this.S;
    }

    public float C0() {
        return this.R;
    }

    public int D0() {
        return this.P;
    }

    public float E0() {
        return this.Q;
    }

    public boolean F0() {
        return this.J;
    }

    public boolean G0() {
        return this.K;
    }

    public boolean H0() {
        return this.M;
    }

    public boolean I0() {
        return this.L;
    }

    @Deprecated
    public boolean J0() {
        return this.O;
    }

    @Deprecated
    public boolean K0() {
        return this.N;
    }

    public boolean L0() {
        return f() && P() && w0() == b.OUTSIDE_CHART;
    }

    public void M0(boolean z4) {
        this.K = z4;
    }

    public void N0(boolean z4) {
        this.M = z4;
    }

    public void O0(boolean z4) {
        this.L = z4;
    }

    public void P0(float f4) {
        this.W = f4;
    }

    public void Q0(float f4) {
        this.V = f4;
    }

    public void R0(b bVar) {
        this.T = bVar;
    }

    public void S0(float f4) {
        this.S = f4;
    }

    public void T0(float f4) {
        this.R = f4;
    }

    @Deprecated
    public void U0(boolean z4) {
        if (z4) {
            e0(0.0f);
        } else {
            X();
        }
    }

    @Deprecated
    public void V0(boolean z4) {
        this.O = z4;
    }

    @Deprecated
    public void W0(boolean z4) {
        this.N = z4;
    }

    public void X0(int i4) {
        this.P = i4;
    }

    public void Y0(float f4) {
        this.Q = com.github.mikephil.charting.utils.k.e(f4);
    }

    @Override // com.github.mikephil.charting.components.a
    public void n(float f4, float f5) {
        float B0;
        float C0;
        if (Math.abs(f5 - f4) == 0.0f) {
            f5 += 1.0f;
            f4 -= 1.0f;
        }
        float abs = Math.abs(f5 - f4);
        if (this.E) {
            B0 = this.H;
        } else {
            B0 = f4 - (B0() * (abs / 100.0f));
        }
        this.H = B0;
        if (this.F) {
            C0 = this.G;
        } else {
            C0 = (C0() * (abs / 100.0f)) + f5;
        }
        this.G = C0;
        this.I = Math.abs(this.H - C0);
    }

    public a v0() {
        return this.U;
    }

    public b w0() {
        return this.T;
    }

    public float x0() {
        return this.W;
    }

    public float y0() {
        return this.V;
    }

    public float z0(Paint paint) {
        paint.setTextSize(this.f50293e);
        return (e() * 2.0f) + com.github.mikephil.charting.utils.k.a(paint, E());
    }

    public k(a aVar) {
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = -7829368;
        this.Q = 1.0f;
        this.R = 10.0f;
        this.S = 10.0f;
        this.T = b.OUTSIDE_CHART;
        this.V = 0.0f;
        this.W = Float.POSITIVE_INFINITY;
        this.U = aVar;
        this.f50291c = 0.0f;
    }
}
