package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.x0;
import com.google.android.material.transition.platform.l;

/* compiled from: MaskEvaluator.java */
@x0(21)
/* loaded from: classes2.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final Path f14850a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f14851b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f14852c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.shape.p f14853d = com.google.android.material.shape.p.k();

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.material.shape.o f14854e;

    j() {
    }

    void a(Canvas canvas) {
        canvas.clipPath(this.f14850a);
    }

    void b(float f6, com.google.android.material.shape.o oVar, com.google.android.material.shape.o oVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        com.google.android.material.shape.o r5 = v.r(oVar, oVar2, rectF, rectF3, eVar.d(), eVar.c(), f6);
        this.f14854e = r5;
        this.f14853d.d(r5, 1.0f, rectF2, this.f14851b);
        this.f14853d.d(this.f14854e, 1.0f, rectF3, this.f14852c);
        this.f14850a.op(this.f14851b, this.f14852c, Path.Op.UNION);
    }

    com.google.android.material.shape.o c() {
        return this.f14854e;
    }

    Path d() {
        return this.f14850a;
    }
}
