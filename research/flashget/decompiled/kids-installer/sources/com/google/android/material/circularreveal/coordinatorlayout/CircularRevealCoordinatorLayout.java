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

/* loaded from: classes4.dex */
public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements c {

    @o0
    private final b T;

    public CircularRevealCoordinatorLayout(@o0 Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public c.e a() {
        return this.T.j();
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public Drawable b() {
        return this.T.g();
    }

    @Override // com.google.android.material.circularreveal.c
    public void c(@q0 c.e eVar) {
        this.T.o(eVar);
    }

    @Override // com.google.android.material.circularreveal.c
    public void d() {
        this.T.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public void draw(Canvas canvas) {
        b bVar = this.T;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.c
    public void e(@q0 Drawable drawable) {
        this.T.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.c
    public int f() {
        return this.T.h();
    }

    @Override // com.google.android.material.circularreveal.c
    public void h() {
        this.T.b();
    }

    @Override // com.google.android.material.circularreveal.b.a
    public void i(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public boolean isOpaque() {
        b bVar = this.T;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void j(@l int i5) {
        this.T.n(i5);
    }

    @Override // com.google.android.material.circularreveal.b.a
    public boolean k() {
        return super.isOpaque();
    }

    public CircularRevealCoordinatorLayout(@o0 Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = new b(this);
    }
}
