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

/* loaded from: classes6.dex */
public class CircularRevealCardView extends MaterialCardView implements c {

    /* renamed from: v, reason: collision with root package name */
    @o0
    private final b f53036v;

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public c.e a() {
        return this.f53036v.j();
    }

    @Override // com.google.android.material.circularreveal.c
    public void b() {
        this.f53036v.a();
    }

    @Override // com.google.android.material.circularreveal.c
    public void c(@q0 Drawable drawable) {
        this.f53036v.m(drawable);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public void draw(Canvas canvas) {
        b bVar = this.f53036v;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.c
    public int f() {
        return this.f53036v.h();
    }

    @Override // com.google.android.material.circularreveal.c
    public void g() {
        this.f53036v.b();
    }

    @Override // com.google.android.material.circularreveal.b.a
    public void h(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.c
    public void i(@l int i4) {
        this.f53036v.n(i4);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public boolean isOpaque() {
        b bVar = this.f53036v;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    @q0
    public Drawable j() {
        return this.f53036v.g();
    }

    @Override // com.google.android.material.circularreveal.c
    public void k(@q0 c.e eVar) {
        this.f53036v.o(eVar);
    }

    @Override // com.google.android.material.circularreveal.b.a
    public boolean l() {
        return super.isOpaque();
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53036v = new b(this);
    }
}
