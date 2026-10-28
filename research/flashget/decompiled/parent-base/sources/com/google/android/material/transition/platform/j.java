package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.x0;
import com.google.android.material.transition.platform.l;

/* compiled from: MaskEvaluator.java */
@x0(21)
/* loaded from: classes6.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final Path f54682a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f54683b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f54684c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.shape.p f54685d = com.google.android.material.shape.p.k();

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.material.shape.o f54686e;

    j() {
    }

    void a(Canvas canvas) {
        canvas.clipPath(this.f54682a);
    }

    void b(float f4, com.google.android.material.shape.o oVar, com.google.android.material.shape.o oVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        com.google.android.material.shape.o r4 = v.r(oVar, oVar2, rectF, rectF3, eVar.d(), eVar.c(), f4);
        this.f54686e = r4;
        this.f54685d.d(r4, 1.0f, rectF2, this.f54683b);
        this.f54685d.d(this.f54686e, 1.0f, rectF3, this.f54684c);
        this.f54682a.op(this.f54683b, this.f54684c, Path.Op.UNION);
    }

    com.google.android.material.shape.o c() {
        return this.f54686e;
    }

    Path d() {
        return this.f54682a;
    }
}
