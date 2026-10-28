package com.github.mikephil.charting.data;

import androidx.core.view.x1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PieDataSet.java */
/* loaded from: classes5.dex */
public class s extends m<PieEntry> implements f8.i {
    private a A;
    private a B;
    private boolean C;
    private int D;
    private float E;
    private float F;
    private float G;
    private float H;
    private boolean I;

    /* renamed from: x, reason: collision with root package name */
    private float f50408x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f50409y;

    /* renamed from: z, reason: collision with root package name */
    private float f50410z;

    /* compiled from: PieDataSet.java */
    public enum a {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    public s(List<PieEntry> list, String str) {
        super(list, str);
        this.f50408x = 0.0f;
        this.f50410z = 18.0f;
        a aVar = a.INSIDE_SLICE;
        this.A = aVar;
        this.B = aVar;
        this.C = false;
        this.D = x1.f27484y;
        this.E = 1.0f;
        this.F = 75.0f;
        this.G = 0.3f;
        this.H = 0.4f;
        this.I = true;
    }

    @Override // f8.i
    public int E0() {
        return this.D;
    }

    @Override // f8.i
    public a I0() {
        return this.A;
    }

    @Override // f8.i
    public float K() {
        return this.H;
    }

    @Override // com.github.mikephil.charting.data.m
    public m<PieEntry> N1() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.f50401s.size(); i4++) {
            arrayList.add(((PieEntry) this.f50401s.get(i4)).g());
        }
        s sVar = new s(arrayList, o());
        T1(sVar);
        return sVar;
    }

    @Override // f8.i
    public float Q() {
        return this.f50410z;
    }

    @Override // f8.i
    public a S0() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.m
    /* renamed from: S1, reason: merged with bridge method [inline-methods] */
    public void K1(PieEntry pieEntry) {
        if (pieEntry == null) {
            return;
        }
        M1(pieEntry);
    }

    @Override // f8.i
    public boolean T0() {
        return this.I;
    }

    protected void T1(s sVar) {
        super.O1(sVar);
    }

    public void U1(boolean z4) {
        this.f50409y = z4;
    }

    public void V1(float f4) {
        this.f50410z = com.github.mikephil.charting.utils.k.e(f4);
    }

    public void W1(float f4) {
        if (f4 > 20.0f) {
            f4 = 20.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        this.f50408x = com.github.mikephil.charting.utils.k.e(f4);
    }

    @Override // f8.i
    public boolean X0() {
        return this.C;
    }

    public void X1(boolean z4) {
        this.C = z4;
    }

    public void Y1(int i4) {
        this.D = i4;
    }

    public void Z1(float f4) {
        this.G = f4;
    }

    public void a2(float f4) {
        this.F = f4;
    }

    public void b2(float f4) {
        this.H = f4;
    }

    @Override // f8.i
    public float c1() {
        return this.F;
    }

    public void c2(boolean z4) {
        this.I = z4;
    }

    public void d2(float f4) {
        this.E = f4;
    }

    public void e2(a aVar) {
        this.A = aVar;
    }

    public void f2(a aVar) {
        this.B = aVar;
    }

    @Override // f8.i
    public float g0() {
        return this.f50408x;
    }

    @Override // f8.i
    public boolean v() {
        return this.f50409y;
    }

    @Override // f8.i
    public float y() {
        return this.E;
    }

    @Override // f8.i
    public float z() {
        return this.G;
    }
}
