package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.material.circularreveal.c;

/* loaded from: classes3.dex */
public class CircularRevealGridLayout extends GridLayout implements c {

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final b f13257o;

    public CircularRevealGridLayout(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public c.e a() {
        return this.f13257o.j();
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public Drawable b() {
        return this.f13257o.g();
    }

    @Override // com.google.android.material.circularreveal.c
    public void c(@q0 c.e eVar) {
        this.f13257o.o(eVar);
    }

    @Override // com.google.android.material.circularreveal.c
    public void d() {
        this.f13257o.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public void draw(@o0 Canvas canvas) {
        b bVar = this.f13257o;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.c
    public void e(@q0 Drawable drawable) {
        this.f13257o.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.c
    public int f() {
        return this.f13257o.h();
    }

    @Override // com.google.android.material.circularreveal.c
    public void h() {
        this.f13257o.b();
    }

    @Override // com.google.android.material.circularreveal.b.a
    public void i(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public boolean isOpaque() {
        b bVar = this.f13257o;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void j(@l int i5) {
        this.f13257o.n(i5);
    }

    @Override // com.google.android.material.circularreveal.b.a
    public boolean k() {
        return super.isOpaque();
    }

    public CircularRevealGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13257o = new b(this);
    }
}
