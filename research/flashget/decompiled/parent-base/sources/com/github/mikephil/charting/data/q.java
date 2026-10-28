package com.github.mikephil.charting.data;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* compiled from: LineScatterCandleRadarDataSet.java */
/* loaded from: classes5.dex */
public abstract class q<T extends Entry> extends d<T> implements f8.h<T> {
    protected float A;
    protected DashPathEffect B;

    /* renamed from: y, reason: collision with root package name */
    protected boolean f50406y;

    /* renamed from: z, reason: collision with root package name */
    protected boolean f50407z;

    public q(List<T> list, String str) {
        super(list, str);
        this.f50406y = true;
        this.f50407z = true;
        this.A = 0.5f;
        this.B = null;
        this.A = com.github.mikephil.charting.utils.k.e(0.5f);
    }

    @Override // f8.h
    public DashPathEffect R0() {
        return this.B;
    }

    protected void U1(q qVar) {
        super.S1(qVar);
        qVar.f50407z = this.f50407z;
        qVar.f50406y = this.f50406y;
        qVar.A = this.A;
        qVar.B = this.B;
    }

    public void V1() {
        this.B = null;
    }

    public void W1(float f4, float f5, float f6) {
        this.B = new DashPathEffect(new float[]{f4, f5}, f6);
    }

    public boolean X1() {
        return this.B != null;
    }

    public void Y1(boolean z4) {
        a2(z4);
        Z1(z4);
    }

    @Override // f8.h
    public boolean Z() {
        return this.f50406y;
    }

    public void Z1(boolean z4) {
        this.f50407z = z4;
    }

    public void a2(boolean z4) {
        this.f50406y = z4;
    }

    public void b2(float f4) {
        this.A = com.github.mikephil.charting.utils.k.e(f4);
    }

    @Override // f8.h
    public boolean o1() {
        return this.f50407z;
    }

    @Override // f8.h
    public float u0() {
        return this.A;
    }
}
