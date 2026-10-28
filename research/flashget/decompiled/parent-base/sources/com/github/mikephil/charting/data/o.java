package com.github.mikephil.charting.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import com.android.internal.telephony.SmsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LineDataSet.java */
/* loaded from: classes5.dex */
public class o extends p<Entry> implements f8.f {
    private a H;
    private List<Integer> I;
    private int J;
    private float K;
    private float L;
    private float M;
    private DashPathEffect N;
    private com.github.mikephil.charting.formatter.f O;
    private boolean P;
    private boolean Q;

    /* compiled from: LineDataSet.java */
    public enum a {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER
    }

    public o(List<Entry> list, String str) {
        super(list, str);
        this.H = a.LINEAR;
        this.I = null;
        this.J = -1;
        this.K = 8.0f;
        this.L = 4.0f;
        this.M = 0.2f;
        this.N = null;
        this.O = new com.github.mikephil.charting.formatter.c();
        this.P = true;
        this.Q = true;
        this.I = new ArrayList();
        this.I.clear();
        this.I.add(Integer.valueOf(Color.rgb(SmsConstants.MAX_USER_DATA_BYTES, 234, 255)));
    }

    @Override // f8.f
    public float C0() {
        return this.K;
    }

    @Override // f8.f
    public a F0() {
        return this.H;
    }

    @Override // com.github.mikephil.charting.data.m
    public m<Entry> N1() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.f50401s.size(); i4++) {
            arrayList.add(((Entry) this.f50401s.get(i4)).g());
        }
        o oVar = new o(arrayList, o());
        h2(oVar);
        return oVar;
    }

    @Override // f8.f
    @Deprecated
    public boolean a0() {
        return this.H == a.STEPPED;
    }

    @Override // f8.f
    public int e0() {
        return this.I.size();
    }

    @Override // f8.f
    public int g1(int i4) {
        return this.I.get(i4).intValue();
    }

    protected void h2(o oVar) {
        super.c2(oVar);
        oVar.I = this.I;
        oVar.J = this.J;
        oVar.L = this.L;
        oVar.K = this.K;
        oVar.M = this.M;
        oVar.N = this.N;
        oVar.Q = this.Q;
        oVar.P = this.Q;
        oVar.O = this.O;
        oVar.H = this.H;
    }

    public void i2() {
        this.N = null;
    }

    @Override // f8.f
    public boolean j1() {
        return this.P;
    }

    public void j2(float f4, float f5, float f6) {
        this.N = new DashPathEffect(new float[]{f4, f5}, f6);
    }

    @Override // f8.f
    @Deprecated
    public boolean k() {
        return this.H == a.CUBIC_BEZIER;
    }

    @Override // f8.f
    public com.github.mikephil.charting.formatter.f k0() {
        return this.O;
    }

    public List<Integer> k2() {
        return this.I;
    }

    @Override // f8.f
    public boolean l() {
        return this.N != null;
    }

    @Override // f8.f
    public float l1() {
        return this.L;
    }

    @Deprecated
    public float l2() {
        return C0();
    }

    public void m2() {
        if (this.I == null) {
            this.I = new ArrayList();
        }
        this.I.clear();
    }

    @Override // f8.f
    public int n() {
        return this.J;
    }

    public void n2(int i4) {
        m2();
        this.I.add(Integer.valueOf(i4));
    }

    public void o2(List<Integer> list) {
        this.I = list;
    }

    public void p2(int... iArr) {
        this.I = com.github.mikephil.charting.utils.a.c(iArr);
    }

    public void q2(int[] iArr, Context context) {
        List<Integer> list = this.I;
        if (list == null) {
            list = new ArrayList<>();
        }
        list.clear();
        for (int i4 : iArr) {
            list.add(Integer.valueOf(context.getResources().getColor(i4)));
        }
        this.I = list;
    }

    @Override // f8.f
    public float r() {
        return this.M;
    }

    public void r2(int i4) {
        this.J = i4;
    }

    @Override // f8.f
    public boolean s1() {
        return this.Q;
    }

    public void s2(float f4) {
        if (f4 >= 0.5f) {
            this.L = com.github.mikephil.charting.utils.k.e(f4);
        }
    }

    public void t2(float f4) {
        if (f4 >= 1.0f) {
            this.K = com.github.mikephil.charting.utils.k.e(f4);
        }
    }

    @Deprecated
    public void u2(float f4) {
        t2(f4);
    }

    public void v2(float f4) {
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (f4 < 0.05f) {
            f4 = 0.05f;
        }
        this.M = f4;
    }

    @Override // f8.f
    public DashPathEffect w0() {
        return this.N;
    }

    public void w2(boolean z4) {
        this.Q = z4;
    }

    public void x2(boolean z4) {
        this.P = z4;
    }

    public void y2(com.github.mikephil.charting.formatter.f fVar) {
        if (fVar == null) {
            this.O = new com.github.mikephil.charting.formatter.c();
        } else {
            this.O = fVar;
        }
    }

    public void z2(a aVar) {
        this.H = aVar;
    }
}
