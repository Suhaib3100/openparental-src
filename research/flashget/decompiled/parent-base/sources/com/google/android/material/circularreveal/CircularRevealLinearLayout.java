package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.material.circularreveal.c;

/* loaded from: classes6.dex */
public class CircularRevealLinearLayout extends LinearLayout implements c {

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final b f53010b;

    public CircularRevealLinearLayout(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public c.e a() {
        return this.f53010b.j();
    }

    @Override // com.google.android.material.circularreveal.c
    public void b() {
        this.f53010b.a();
    }

    @Override // com.google.android.material.circularreveal.c
    public void c(@q0 Drawable drawable) {
        this.f53010b.m(drawable);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public void draw(@o0 Canvas canvas) {
        b bVar = this.f53010b;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.c
    public int f() {
        return this.f53010b.h();
    }

    @Override // com.google.android.material.circularreveal.c
    public void g() {
        this.f53010b.b();
    }

    @Override // com.google.android.material.circularreveal.b.a
    public void h(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.c
    public void i(@l int i4) {
        this.f53010b.n(i4);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public boolean isOpaque() {
        b bVar = this.f53010b;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public Drawable j() {
        return this.f53010b.g();
    }

    @Override // com.google.android.material.circularreveal.c
    public void k(@q0 c.e eVar) {
        this.f53010b.o(eVar);
    }

    @Override // com.google.android.material.circularreveal.b.a
    public boolean l() {
        return super.isOpaque();
    }

    public CircularRevealLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53010b = new b(this);
    }
}
