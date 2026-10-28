package com.google.android.material.circularreveal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.material.circularreveal.c;

/* loaded from: classes3.dex */
public class CircularRevealFrameLayout extends FrameLayout implements c {

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final b f13256o;

    public CircularRevealFrameLayout(@o0 Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public c.e a() {
        return this.f13256o.j();
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public Drawable b() {
        return this.f13256o.g();
    }

    @Override // com.google.android.material.circularreveal.c
    public void c(@q0 c.e eVar) {
        this.f13256o.o(eVar);
    }

    @Override // com.google.android.material.circularreveal.c
    public void d() {
        this.f13256o.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    @SuppressLint({"MissingSuperCall"})
    public void draw(@o0 Canvas canvas) {
        b bVar = this.f13256o;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.c
    public void e(@q0 Drawable drawable) {
        this.f13256o.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.c
    public int f() {
        return this.f13256o.h();
    }

    @Override // com.google.android.material.circularreveal.c
    public void h() {
        this.f13256o.b();
    }

    @Override // com.google.android.material.circularreveal.b.a
    public void i(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public boolean isOpaque() {
        b bVar = this.f13256o;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void j(@l int i5) {
        this.f13256o.n(i5);
    }

    @Override // com.google.android.material.circularreveal.b.a
    public boolean k() {
        return super.isOpaque();
    }

    public CircularRevealFrameLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13256o = new b(this);
    }
}
