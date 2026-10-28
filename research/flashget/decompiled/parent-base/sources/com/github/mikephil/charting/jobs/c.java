package com.github.mikephil.charting.jobs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.utils.h;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;

/* compiled from: AnimatedZoomJob.java */
@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public class c extends b implements Animator.AnimatorListener {

    /* renamed from: u, reason: collision with root package name */
    private static h<c> f50451u = h.a(8, new c(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0));

    /* renamed from: n, reason: collision with root package name */
    protected float f50452n;

    /* renamed from: o, reason: collision with root package name */
    protected float f50453o;

    /* renamed from: p, reason: collision with root package name */
    protected float f50454p;

    /* renamed from: q, reason: collision with root package name */
    protected float f50455q;

    /* renamed from: r, reason: collision with root package name */
    protected k f50456r;

    /* renamed from: s, reason: collision with root package name */
    protected float f50457s;

    /* renamed from: t, reason: collision with root package name */
    protected Matrix f50458t;

    @SuppressLint({"NewApi"})
    public c(l lVar, View view, i iVar, k kVar, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, long j4) {
        super(lVar, f5, f6, iVar, view, f7, f10, j4);
        this.f50458t = new Matrix();
        this.f50454p = f11;
        this.f50455q = f12;
        this.f50452n = f13;
        this.f50453o = f14;
        this.f50447j.addListener(this);
        this.f50456r = kVar;
        this.f50457s = f4;
    }

    public static c j(l lVar, View view, i iVar, k kVar, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, long j4) {
        c b5 = f50451u.b();
        b5.f50461e = lVar;
        b5.f50462f = f5;
        b5.f50463g = f6;
        b5.f50464h = iVar;
        b5.f50465i = view;
        b5.f50449l = f7;
        b5.f50450m = f10;
        b5.f50456r = kVar;
        b5.f50457s = f4;
        b5.h();
        b5.f50447j.setDuration(j4);
        return b5;
    }

    @Override // com.github.mikephil.charting.utils.h.a
    protected h.a a() {
        return new c(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    @Override // com.github.mikephil.charting.jobs.b
    public void g() {
    }

    @Override // com.github.mikephil.charting.jobs.b, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.b, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ((BarLineChartBase) this.f50465i).J();
        this.f50465i.postInvalidate();
    }

    @Override // com.github.mikephil.charting.jobs.b, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.b, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.b, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f4 = this.f50449l;
        float f5 = this.f50462f - f4;
        float f6 = this.f50448k;
        float f7 = (f5 * f6) + f4;
        float f10 = this.f50450m;
        float a5 = androidx.appcompat.graphics.drawable.d.a(this.f50463g, f10, f6, f10);
        Matrix matrix = this.f50458t;
        this.f50461e.g0(f7, a5, matrix);
        this.f50461e.S(matrix, this.f50465i, false);
        float x4 = this.f50456r.I / this.f50461e.x();
        float w4 = this.f50457s / this.f50461e.w();
        float[] fArr = this.f50460d;
        float f11 = this.f50452n;
        float f12 = (this.f50454p - (w4 / 2.0f)) - f11;
        float f13 = this.f50448k;
        fArr[0] = (f12 * f13) + f11;
        float f14 = this.f50453o;
        fArr[1] = ((((x4 / 2.0f) + this.f50455q) - f14) * f13) + f14;
        this.f50464h.o(fArr);
        this.f50461e.i0(this.f50460d, matrix);
        this.f50461e.S(matrix, this.f50465i, true);
    }
}
