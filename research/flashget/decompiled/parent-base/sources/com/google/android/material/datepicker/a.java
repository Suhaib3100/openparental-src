package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.core.util.w;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import s8.a;

/* compiled from: CalendarItemStyle.java */
/* loaded from: classes6.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final Rect f53085a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f53086b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f53087c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f53088d;

    /* renamed from: e, reason: collision with root package name */
    private final int f53089e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.material.shape.o f53090f;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i4, com.google.android.material.shape.o oVar, @o0 Rect rect) {
        w.i(rect.left);
        w.i(rect.top);
        w.i(rect.right);
        w.i(rect.bottom);
        this.f53085a = rect;
        this.f53086b = colorStateList2;
        this.f53087c = colorStateList;
        this.f53088d = colorStateList3;
        this.f53089e = i4;
        this.f53090f = oVar;
    }

    @o0
    static a a(@o0 Context context, @h1 int i4) {
        w.b(i4 != 0, ProtectedSandApp.s("\uf197"));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, a.o.gl);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(a.o.hl, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.jl, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.il, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.kl, 0));
        ColorStateList a5 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.ll);
        ColorStateList a6 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.ql);
        ColorStateList a7 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.ol);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.o.pl, 0);
        com.google.android.material.shape.o m4 = com.google.android.material.shape.o.b(context, obtainStyledAttributes.getResourceId(a.o.ml, 0), obtainStyledAttributes.getResourceId(a.o.nl, 0)).m();
        obtainStyledAttributes.recycle();
        return new a(a5, a6, a7, dimensionPixelSize, m4, rect);
    }

    int b() {
        return this.f53085a.bottom;
    }

    int c() {
        return this.f53085a.left;
    }

    int d() {
        return this.f53085a.right;
    }

    int e() {
        return this.f53085a.top;
    }

    void f(@o0 TextView textView) {
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
        com.google.android.material.shape.j jVar2 = new com.google.android.material.shape.j();
        jVar.d(this.f53090f);
        jVar2.d(this.f53090f);
        jVar.p0(this.f53087c);
        jVar.F0(this.f53089e, this.f53088d);
        textView.setTextColor(this.f53086b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f53086b.withAlpha(30), jVar, jVar2);
        Rect rect = this.f53085a;
        x1.P1(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
