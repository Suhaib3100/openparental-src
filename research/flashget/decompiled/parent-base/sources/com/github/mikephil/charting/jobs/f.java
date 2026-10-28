package com.github.mikephil.charting.jobs;

import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.utils.h;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;

/* compiled from: ZoomJob.java */
/* loaded from: classes5.dex */
public class f extends e {

    /* renamed from: n, reason: collision with root package name */
    private static h<f> f50466n;

    /* renamed from: j, reason: collision with root package name */
    protected float f50467j;

    /* renamed from: k, reason: collision with root package name */
    protected float f50468k;

    /* renamed from: l, reason: collision with root package name */
    protected k.a f50469l;

    /* renamed from: m, reason: collision with root package name */
    protected Matrix f50470m;

    static {
        h<f> a5 = h.a(1, new f(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null));
        f50466n = a5;
        a5.l(0.5f);
    }

    public f(l lVar, float f4, float f5, float f6, float f7, i iVar, k.a aVar, View view) {
        super(lVar, f6, f7, iVar, view);
        this.f50470m = new Matrix();
        this.f50467j = f4;
        this.f50468k = f5;
        this.f50469l = aVar;
    }

    public static f d(l lVar, float f4, float f5, float f6, float f7, i iVar, k.a aVar, View view) {
        f b5 = f50466n.b();
        b5.f50462f = f6;
        b5.f50463g = f7;
        b5.f50467j = f4;
        b5.f50468k = f5;
        b5.f50461e = lVar;
        b5.f50464h = iVar;
        b5.f50469l = aVar;
        b5.f50465i = view;
        return b5;
    }

    public static void e(f fVar) {
        f50466n.g(fVar);
    }

    @Override // com.github.mikephil.charting.utils.h.a
    protected h.a a() {
        return new f(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        Matrix matrix = this.f50470m;
        this.f50461e.m0(this.f50467j, this.f50468k, matrix);
        this.f50461e.S(matrix, this.f50465i, false);
        float x4 = ((BarLineChartBase) this.f50465i).x(this.f50469l).I / this.f50461e.x();
        float w4 = ((BarLineChartBase) this.f50465i).o0().I / this.f50461e.w();
        float[] fArr = this.f50460d;
        fArr[0] = this.f50462f - (w4 / 2.0f);
        fArr[1] = (x4 / 2.0f) + this.f50463g;
        this.f50464h.o(fArr);
        this.f50461e.i0(this.f50460d, matrix);
        this.f50461e.S(matrix, this.f50465i, false);
        ((BarLineChartBase) this.f50465i).J();
        this.f50465i.postInvalidate();
        e(this);
    }
}
