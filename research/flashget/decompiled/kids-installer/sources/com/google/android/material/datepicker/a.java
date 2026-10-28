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
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import n1.a;

/* compiled from: CalendarItemStyle.java */
/* loaded from: classes2.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final Rect f13332a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f13333b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f13334c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f13335d;

    /* renamed from: e, reason: collision with root package name */
    private final int f13336e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.material.shape.o f13337f;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i5, com.google.android.material.shape.o oVar, @o0 Rect rect) {
        androidx.core.util.q.i(rect.left);
        androidx.core.util.q.i(rect.top);
        androidx.core.util.q.i(rect.right);
        androidx.core.util.q.i(rect.bottom);
        this.f13332a = rect;
        this.f13333b = colorStateList2;
        this.f13334c = colorStateList;
        this.f13335d = colorStateList3;
        this.f13336e = i5;
        this.f13337f = oVar;
    }

    @o0
    static a a(@o0 Context context, @h1 int i5) {
        androidx.core.util.q.b(i5 != 0, ProtectedSandApp.s("መ"));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, a.o.Nj);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(a.o.Oj, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.Qj, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.Pj, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.Rj, 0));
        ColorStateList a6 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.Sj);
        ColorStateList a7 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.Xj);
        ColorStateList a8 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.Vj);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.o.Wj, 0);
        com.google.android.material.shape.o m5 = com.google.android.material.shape.o.b(context, obtainStyledAttributes.getResourceId(a.o.Tj, 0), obtainStyledAttributes.getResourceId(a.o.Uj, 0)).m();
        obtainStyledAttributes.recycle();
        return new a(a6, a7, a8, dimensionPixelSize, m5, rect);
    }

    int b() {
        return this.f13332a.bottom;
    }

    int c() {
        return this.f13332a.left;
    }

    int d() {
        return this.f13332a.right;
    }

    int e() {
        return this.f13332a.top;
    }

    void f(@o0 TextView textView) {
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
        com.google.android.material.shape.j jVar2 = new com.google.android.material.shape.j();
        jVar.g(this.f13337f);
        jVar2.g(this.f13337f);
        jVar.p0(this.f13334c);
        jVar.F0(this.f13336e, this.f13335d);
        textView.setTextColor(this.f13333b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f13333b.withAlpha(30), jVar, jVar2);
        Rect rect = this.f13332a;
        y1.I1(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
