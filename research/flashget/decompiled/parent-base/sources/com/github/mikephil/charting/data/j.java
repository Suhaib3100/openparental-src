package com.github.mikephil.charting.data;

import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CandleDataSet.java */
/* loaded from: classes5.dex */
public class j extends q<CandleEntry> implements f8.d {
    private float C;
    private boolean D;
    private float E;
    private boolean F;
    protected Paint.Style G;
    protected Paint.Style H;
    protected int I;
    protected int J;
    protected int K;
    protected int L;

    public j(List<CandleEntry> list, String str) {
        super(list, str);
        this.C = 3.0f;
        this.D = true;
        this.E = 0.1f;
        this.F = false;
        this.G = Paint.Style.STROKE;
        this.H = Paint.Style.FILL;
        this.I = com.github.mikephil.charting.utils.a.f50620b;
        this.J = com.github.mikephil.charting.utils.a.f50620b;
        this.K = com.github.mikephil.charting.utils.a.f50620b;
        this.L = com.github.mikephil.charting.utils.a.f50620b;
    }

    @Override // f8.d
    public float A0() {
        return this.E;
    }

    @Override // f8.d
    public boolean G() {
        return this.F;
    }

    @Override // f8.d
    public Paint.Style J0() {
        return this.G;
    }

    @Override // com.github.mikephil.charting.data.m
    public m<CandleEntry> N1() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.f50401s.size(); i4++) {
            arrayList.add(((CandleEntry) this.f50401s.get(i4)).g());
        }
        j jVar = new j(arrayList, o());
        e2(jVar);
        return jVar;
    }

    @Override // f8.d
    public int T() {
        return this.J;
    }

    @Override // f8.d
    public boolean X() {
        return this.D;
    }

    @Override // f8.d
    public int a1() {
        return this.L;
    }

    @Override // f8.d
    public int c0() {
        return this.I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.m
    /* renamed from: c2, reason: merged with bridge method [inline-methods] */
    public void K1(CandleEntry candleEntry) {
        if (candleEntry.t() < this.f50403u) {
            this.f50403u = candleEntry.t();
        }
        if (candleEntry.r() > this.f50402t) {
            this.f50402t = candleEntry.r();
        }
        L1(candleEntry);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.m
    /* renamed from: d2, reason: merged with bridge method [inline-methods] */
    public void M1(CandleEntry candleEntry) {
        if (candleEntry.r() < this.f50403u) {
            this.f50403u = candleEntry.r();
        }
        if (candleEntry.r() > this.f50402t) {
            this.f50402t = candleEntry.r();
        }
        if (candleEntry.t() < this.f50403u) {
            this.f50403u = candleEntry.t();
        }
        if (candleEntry.t() > this.f50402t) {
            this.f50402t = candleEntry.t();
        }
    }

    protected void e2(j jVar) {
        super.U1(jVar);
        jVar.C = this.C;
        jVar.D = this.D;
        jVar.E = this.E;
        jVar.F = this.F;
        jVar.f50356x = this.f50356x;
        jVar.G = this.G;
        jVar.H = this.H;
        jVar.I = this.I;
        jVar.J = this.J;
        jVar.K = this.K;
        jVar.L = this.L;
    }

    public void f2(float f4) {
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 0.45f) {
            f4 = 0.45f;
        }
        this.E = f4;
    }

    public void g2(int i4) {
        this.K = i4;
    }

    public void h2(Paint.Style style) {
        this.H = style;
    }

    public void i2(int i4) {
        this.J = i4;
    }

    public void j2(Paint.Style style) {
        this.G = style;
    }

    public void k2(int i4) {
        this.I = i4;
    }

    public void l2(int i4) {
        this.L = i4;
    }

    @Override // f8.d
    public float m0() {
        return this.C;
    }

    public void m2(boolean z4) {
        this.F = z4;
    }

    public void n2(float f4) {
        this.C = com.github.mikephil.charting.utils.k.e(f4);
    }

    public void o2(boolean z4) {
        this.D = z4;
    }

    @Override // f8.d
    public int q1() {
        return this.K;
    }

    @Override // f8.d
    public Paint.Style y0() {
        return this.H;
    }
}
