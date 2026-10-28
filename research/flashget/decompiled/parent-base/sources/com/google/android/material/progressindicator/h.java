package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.o0;
import androidx.annotation.x;
import com.google.android.material.progressindicator.c;

/* compiled from: DrawingDelegate.java */
/* loaded from: classes6.dex */
abstract class h<S extends c> {

    /* renamed from: a, reason: collision with root package name */
    S f53724a;

    /* renamed from: b, reason: collision with root package name */
    protected g f53725b;

    public h(S s4) {
        this.f53724a = s4;
    }

    abstract void a(@o0 Canvas canvas, @x(from = 0.0d, to = 1.0d) float f4);

    abstract void b(@o0 Canvas canvas, @o0 Paint paint, @x(from = 0.0d, to = 1.0d) float f4, @x(from = 0.0d, to = 1.0d) float f5, @androidx.annotation.l int i4);

    abstract void c(@o0 Canvas canvas, @o0 Paint paint);

    abstract int d();

    abstract int e();

    protected void f(@o0 g gVar) {
        this.f53725b = gVar;
    }

    void g(@o0 Canvas canvas, @x(from = 0.0d, to = 1.0d) float f4) {
        this.f53724a.e();
        a(canvas, f4);
    }
}
