package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;

/* loaded from: classes3.dex */
public class CircularRevealCardView extends MaterialCardView implements c {

    @o0
    private final b I;

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public c.e a() {
        return this.I.j();
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public Drawable b() {
        return this.I.g();
    }

    @Override // com.google.android.material.circularreveal.c
    public void c(@q0 c.e eVar) {
        this.I.o(eVar);
    }

    @Override // com.google.android.material.circularreveal.c
    public void d() {
        this.I.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public void draw(Canvas canvas) {
        b bVar = this.I;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.c
    public void e(@q0 Drawable drawable) {
        this.I.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.c
    public int f() {
        return this.I.h();
    }

    @Override // com.google.android.material.circularreveal.c
    public void h() {
        this.I.b();
    }

    @Override // com.google.android.material.circularreveal.b.a
    public void i(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public boolean isOpaque() {
        b bVar = this.I;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void j(@l int i5) {
        this.I.n(i5);
    }

    @Override // com.google.android.material.circularreveal.b.a
    public boolean k() {
        return super.isOpaque();
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = new b(this);
    }
}
