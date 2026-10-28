package com.github.mikephil.charting.jobs;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.github.mikephil.charting.utils.h;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;

/* compiled from: AnimatedMoveViewJob.java */
@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public class a extends b {

    /* renamed from: n, reason: collision with root package name */
    private static h<a> f50446n;

    static {
        h<a> a5 = h.a(4, new a(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L));
        f50446n = a5;
        a5.l(0.5f);
    }

    public a(l lVar, float f4, float f5, i iVar, View view, float f6, float f7, long j4) {
        super(lVar, f4, f5, iVar, view, f6, f7, j4);
    }

    public static a j(l lVar, float f4, float f5, i iVar, View view, float f6, float f7, long j4) {
        a b5 = f50446n.b();
        b5.f50461e = lVar;
        b5.f50462f = f4;
        b5.f50463g = f5;
        b5.f50464h = iVar;
        b5.f50465i = view;
        b5.f50449l = f6;
        b5.f50450m = f7;
        b5.f50447j.setDuration(j4);
        return b5;
    }

    public static void k(a aVar) {
        f50446n.g(aVar);
    }

    @Override // com.github.mikephil.charting.utils.h.a
    protected h.a a() {
        return new a(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L);
    }

    @Override // com.github.mikephil.charting.jobs.b
    public void g() {
        k(this);
    }

    @Override // com.github.mikephil.charting.jobs.b, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = this.f50460d;
        float f4 = this.f50449l;
        float f5 = this.f50462f - f4;
        float f6 = this.f50448k;
        fArr[0] = (f5 * f6) + f4;
        float f7 = this.f50450m;
        fArr[1] = androidx.appcompat.graphics.drawable.d.a(this.f50463g, f7, f6, f7);
        this.f50464h.o(fArr);
        this.f50461e.e(this.f50460d, this.f50465i);
    }
}
