package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.List;

/* compiled from: RadarDataSet.java */
/* loaded from: classes5.dex */
public class u extends p<RadarEntry> implements f8.j {
    protected boolean H;
    protected int I;
    protected int J;
    protected int K;
    protected float L;
    protected float M;
    protected float N;

    public u(List<RadarEntry> list, String str) {
        super(list, str);
        this.H = false;
        this.I = -1;
        this.J = com.github.mikephil.charting.utils.a.f50619a;
        this.K = 76;
        this.L = 3.0f;
        this.M = 4.0f;
        this.N = 2.0f;
    }

    @Override // com.github.mikephil.charting.data.m
    public m<RadarEntry> N1() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.f50401s.size(); i4++) {
            arrayList.add(((RadarEntry) this.f50401s.get(i4)).g());
        }
        u uVar = new u(arrayList, o());
        h2(uVar);
        return uVar;
    }

    @Override // f8.j
    public void U0(boolean z4) {
        this.H = z4;
    }

    @Override // f8.j
    public float b0() {
        return this.N;
    }

    @Override // f8.j
    public int c() {
        return this.I;
    }

    @Override // f8.j
    public int h() {
        return this.J;
    }

    @Override // f8.j
    public float h0() {
        return this.L;
    }

    protected void h2(u uVar) {
        super.c2(uVar);
        uVar.H = this.H;
        uVar.I = this.I;
        uVar.L = this.L;
        uVar.K = this.K;
        uVar.J = this.J;
        uVar.N = this.N;
    }

    @Override // f8.j
    public int i0() {
        return this.K;
    }

    public void i2(int i4) {
        this.I = i4;
    }

    public void j2(float f4) {
        this.L = f4;
    }

    public void k2(float f4) {
        this.M = f4;
    }

    public void l2(int i4) {
        this.K = i4;
    }

    public void m2(int i4) {
        this.J = i4;
    }

    public void n2(float f4) {
        this.N = f4;
    }

    @Override // f8.j
    public boolean p0() {
        return this.H;
    }

    @Override // f8.j
    public float q() {
        return this.M;
    }
}
