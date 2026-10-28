package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.o0;
import androidx.annotation.x;
import com.google.android.material.progressindicator.c;

/* compiled from: DrawingDelegate.java */
/* loaded from: classes2.dex */
abstract class h<S extends c> {

    /* renamed from: a, reason: collision with root package name */
    S f13876a;

    /* renamed from: b, reason: collision with root package name */
    protected g f13877b;

    public h(S s5) {
        this.f13876a = s5;
    }

    abstract void a(@o0 Canvas canvas, @x(from = 0.0d, to = 1.0d) float f6);

    abstract void b(@o0 Canvas canvas, @o0 Paint paint, @x(from = 0.0d, to = 1.0d) float f6, @x(from = 0.0d, to = 1.0d) float f7, @androidx.annotation.l int i5);

    abstract void c(@o0 Canvas canvas, @o0 Paint paint);

    abstract int d();

    abstract int e();

    protected void f(@o0 g gVar) {
        this.f13877b = gVar;
    }

    void g(@o0 Canvas canvas, @x(from = 0.0d, to = 1.0d) float f6) {
        this.f13876a.e();
        a(canvas, f6);
    }
}
