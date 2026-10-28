package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.transition.l;

/* compiled from: MaskEvaluator.java */
/* loaded from: classes2.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final Path f14738a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f14739b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f14740c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.shape.p f14741d = com.google.android.material.shape.p.k();

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.material.shape.o f14742e;

    j() {
    }

    void a(Canvas canvas) {
        canvas.clipPath(this.f14738a);
    }

    void b(float f6, com.google.android.material.shape.o oVar, com.google.android.material.shape.o oVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        com.google.android.material.shape.o r5 = u.r(oVar, oVar2, rectF, rectF3, eVar.d(), eVar.c(), f6);
        this.f14742e = r5;
        this.f14741d.d(r5, 1.0f, rectF2, this.f14739b);
        this.f14741d.d(this.f14742e, 1.0f, rectF3, this.f14740c);
        this.f14738a.op(this.f14739b, this.f14740c, Path.Op.UNION);
    }

    com.google.android.material.shape.o c() {
        return this.f14742e;
    }

    Path d() {
        return this.f14738a;
    }
}
