package com.github.mikephil.charting.data;

import com.github.mikephil.charting.charts.ScatterChart;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ScatterDataSet.java */
/* loaded from: classes5.dex */
public class w extends q<Entry> implements f8.k {
    private float C;
    protected com.github.mikephil.charting.renderer.scatter.e D;
    private float E;
    private int F;

    /* compiled from: ScatterDataSet.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50412a;

        static {
            int[] iArr = new int[ScatterChart.a.values().length];
            f50412a = iArr;
            try {
                iArr[ScatterChart.a.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50412a[ScatterChart.a.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50412a[ScatterChart.a.TRIANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50412a[ScatterChart.a.CROSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50412a[ScatterChart.a.X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50412a[ScatterChart.a.CHEVRON_UP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50412a[ScatterChart.a.CHEVRON_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public w(List<Entry> list, String str) {
        super(list, str);
        this.C = 15.0f;
        this.D = new com.github.mikephil.charting.renderer.scatter.f();
        this.E = 0.0f;
        this.F = com.github.mikephil.charting.utils.a.f50619a;
    }

    public static com.github.mikephil.charting.renderer.scatter.e d2(ScatterChart.a aVar) {
        switch (a.f50412a[aVar.ordinal()]) {
            case 1:
                return new com.github.mikephil.charting.renderer.scatter.f();
            case 2:
                return new com.github.mikephil.charting.renderer.scatter.c();
            case 3:
                return new com.github.mikephil.charting.renderer.scatter.g();
            case 4:
                return new com.github.mikephil.charting.renderer.scatter.d();
            case 5:
                return new com.github.mikephil.charting.renderer.scatter.h();
            case 6:
                return new com.github.mikephil.charting.renderer.scatter.b();
            case 7:
                return new com.github.mikephil.charting.renderer.scatter.a();
            default:
                return null;
        }
    }

    @Override // f8.k
    public float C() {
        return this.C;
    }

    @Override // f8.k
    public int M() {
        return this.F;
    }

    @Override // com.github.mikephil.charting.data.m
    public m<Entry> N1() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.f50401s.size(); i4++) {
            arrayList.add(((Entry) this.f50401s.get(i4)).g());
        }
        w wVar = new w(arrayList, o());
        c2(wVar);
        return wVar;
    }

    @Override // f8.k
    public com.github.mikephil.charting.renderer.scatter.e Z0() {
        return this.D;
    }

    protected void c2(w wVar) {
        super.U1(wVar);
        wVar.C = this.C;
        wVar.D = this.D;
        wVar.E = this.E;
        wVar.F = this.F;
    }

    public void e2(ScatterChart.a aVar) {
        this.D = d2(aVar);
    }

    public void f2(int i4) {
        this.F = i4;
    }

    public void g2(float f4) {
        this.E = f4;
    }

    public void h2(float f4) {
        this.C = f4;
    }

    public void i2(com.github.mikephil.charting.renderer.scatter.e eVar) {
        this.D = eVar;
    }

    @Override // f8.k
    public float r1() {
        return this.E;
    }
}
