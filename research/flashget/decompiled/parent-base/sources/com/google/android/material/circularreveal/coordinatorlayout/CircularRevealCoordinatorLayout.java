package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;

/* loaded from: classes6.dex */
public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements c {

    @o0
    private final b G;

    public CircularRevealCoordinatorLayout(@o0 Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public c.e a() {
        return this.G.j();
    }

    @Override // com.google.android.material.circularreveal.c
    public void b() {
        this.G.a();
    }

    @Override // com.google.android.material.circularreveal.c
    public void c(@q0 Drawable drawable) {
        this.G.m(drawable);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public void draw(Canvas canvas) {
        b bVar = this.G;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.c
    public int f() {
        return this.G.h();
    }

    @Override // com.google.android.material.circularreveal.c
    public void g() {
        this.G.b();
    }

    @Override // com.google.android.material.circularreveal.b.a
    public void h(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.c
    public void i(@l int i4) {
        this.G.n(i4);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public boolean isOpaque() {
        b bVar = this.G;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public Drawable j() {
        return this.G.g();
    }

    @Override // com.google.android.material.circularreveal.c
    public void k(@q0 c.e eVar) {
        this.G.o(eVar);
    }

    @Override // com.google.android.material.circularreveal.b.a
    public boolean l() {
        return super.isOpaque();
    }

    public CircularRevealCoordinatorLayout(@o0 Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = new b(this);
    }
}
