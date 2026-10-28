package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.transition.l;

/* compiled from: MaskEvaluator.java */
/* loaded from: classes6.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final Path f54577a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f54578b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f54579c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.shape.p f54580d = com.google.android.material.shape.p.k();

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.material.shape.o f54581e;

    j() {
    }

    void a(Canvas canvas) {
        canvas.clipPath(this.f54577a);
    }

    void b(float f4, com.google.android.material.shape.o oVar, com.google.android.material.shape.o oVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        com.google.android.material.shape.o r4 = u.r(oVar, oVar2, rectF, rectF3, eVar.d(), eVar.c(), f4);
        this.f54581e = r4;
        this.f54580d.d(r4, 1.0f, rectF2, this.f54578b);
        this.f54580d.d(this.f54581e, 1.0f, rectF3, this.f54579c);
        this.f54577a.op(this.f54578b, this.f54579c, Path.Op.UNION);
    }

    com.google.android.material.shape.o c() {
        return this.f54581e;
    }

    Path d() {
        return this.f54577a;
    }
}
