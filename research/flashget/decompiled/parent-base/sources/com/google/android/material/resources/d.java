package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.y;
import androidx.core.content.res.i;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import s8.a;

/* compiled from: TextAppearance.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class d {

    /* renamed from: r, reason: collision with root package name */
    private static final String f53766r = ProtectedSandApp.s("\uf20b");

    /* renamed from: s, reason: collision with root package name */
    private static final int f53767s = 1;

    /* renamed from: t, reason: collision with root package name */
    private static final int f53768t = 2;

    /* renamed from: u, reason: collision with root package name */
    private static final int f53769u = 3;

    /* renamed from: a, reason: collision with root package name */
    @q0
    public final ColorStateList f53770a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    public final ColorStateList f53771b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    public final ColorStateList f53772c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    public final ColorStateList f53773d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    public final String f53774e;

    /* renamed from: f, reason: collision with root package name */
    public final int f53775f;

    /* renamed from: g, reason: collision with root package name */
    public final int f53776g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f53777h;

    /* renamed from: i, reason: collision with root package name */
    public final float f53778i;

    /* renamed from: j, reason: collision with root package name */
    public final float f53779j;

    /* renamed from: k, reason: collision with root package name */
    public final float f53780k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f53781l;

    /* renamed from: m, reason: collision with root package name */
    public final float f53782m;

    /* renamed from: n, reason: collision with root package name */
    public float f53783n;

    /* renamed from: o, reason: collision with root package name */
    @y
    private final int f53784o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f53785p = false;

    /* renamed from: q, reason: collision with root package name */
    private Typeface f53786q;

    /* compiled from: TextAppearance.java */
    class a extends i.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f53787a;

        a(f fVar) {
            this.f53787a = fVar;
        }

        @Override // androidx.core.content.res.i.f
        /* renamed from: h */
        public void f(int i4) {
            d.this.f53785p = true;
            this.f53787a.a(i4);
        }

        @Override // androidx.core.content.res.i.f
        /* renamed from: i */
        public void g(@o0 Typeface typeface) {
            d dVar = d.this;
            dVar.f53786q = Typeface.create(typeface, dVar.f53775f);
            d.this.f53785p = true;
            this.f53787a.b(d.this.f53786q, false);
        }
    }

    /* compiled from: TextAppearance.java */
    class b extends f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextPaint f53789a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f53790b;

        b(TextPaint textPaint, f fVar) {
            this.f53789a = textPaint;
            this.f53790b = fVar;
        }

        @Override // com.google.android.material.resources.f
        public void a(int i4) {
            this.f53790b.a(i4);
        }

        @Override // com.google.android.material.resources.f
        public void b(@o0 Typeface typeface, boolean z4) {
            d.this.l(this.f53789a, typeface);
            this.f53790b.b(typeface, z4);
        }
    }

    public d(@o0 Context context, @h1 int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, a.o.ls);
        this.f53783n = obtainStyledAttributes.getDimension(a.o.ms, 0.0f);
        this.f53770a = c.a(context, obtainStyledAttributes, a.o.ps);
        this.f53771b = c.a(context, obtainStyledAttributes, a.o.qs);
        this.f53772c = c.a(context, obtainStyledAttributes, a.o.rs);
        this.f53775f = obtainStyledAttributes.getInt(a.o.os, 0);
        this.f53776g = obtainStyledAttributes.getInt(a.o.ns, 1);
        int e4 = c.e(obtainStyledAttributes, a.o.ys, a.o.ws);
        this.f53784o = obtainStyledAttributes.getResourceId(e4, 0);
        this.f53774e = obtainStyledAttributes.getString(e4);
        this.f53777h = obtainStyledAttributes.getBoolean(a.o.As, false);
        this.f53773d = c.a(context, obtainStyledAttributes, a.o.ss);
        this.f53778i = obtainStyledAttributes.getFloat(a.o.ts, 0.0f);
        this.f53779j = obtainStyledAttributes.getFloat(a.o.us, 0.0f);
        this.f53780k = obtainStyledAttributes.getFloat(a.o.vs, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i4, a.o.Nl);
        int i5 = a.o.Ol;
        this.f53781l = obtainStyledAttributes2.hasValue(i5);
        this.f53782m = obtainStyledAttributes2.getFloat(i5, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f53786q == null && (str = this.f53774e) != null) {
            this.f53786q = Typeface.create(str, this.f53775f);
        }
        if (this.f53786q == null) {
            int i4 = this.f53776g;
            if (i4 == 1) {
                this.f53786q = Typeface.SANS_SERIF;
            } else if (i4 == 2) {
                this.f53786q = Typeface.SERIF;
            } else if (i4 != 3) {
                this.f53786q = Typeface.DEFAULT;
            } else {
                this.f53786q = Typeface.MONOSPACE;
            }
            this.f53786q = Typeface.create(this.f53786q, this.f53775f);
        }
    }

    private boolean i(Context context) {
        if (e.b()) {
            return true;
        }
        int i4 = this.f53784o;
        return (i4 != 0 ? i.d(context, i4) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f53786q;
    }

    @o0
    @m1
    public Typeface f(@o0 Context context) {
        if (this.f53785p) {
            return this.f53786q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface j4 = i.j(context, this.f53784o);
                this.f53786q = j4;
                if (j4 != null) {
                    this.f53786q = Typeface.create(j4, this.f53775f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        d();
        this.f53785p = true;
        return this.f53786q;
    }

    public void g(@o0 Context context, @o0 TextPaint textPaint, @o0 f fVar) {
        l(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(@o0 Context context, @o0 f fVar) {
        if (i(context)) {
            f(context);
        } else {
            d();
        }
        int i4 = this.f53784o;
        if (i4 == 0) {
            this.f53785p = true;
        }
        if (this.f53785p) {
            fVar.b(this.f53786q, true);
            return;
        }
        try {
            i.l(context, i4, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f53785p = true;
            fVar.a(1);
        } catch (Exception unused2) {
            this.f53785p = true;
            fVar.a(-3);
        }
    }

    public void j(@o0 Context context, @o0 TextPaint textPaint, @o0 f fVar) {
        k(context, textPaint, fVar);
        ColorStateList colorStateList = this.f53770a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : x1.f27484y);
        float f4 = this.f53780k;
        float f5 = this.f53778i;
        float f6 = this.f53779j;
        ColorStateList colorStateList2 = this.f53773d;
        textPaint.setShadowLayer(f4, f5, f6, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void k(@o0 Context context, @o0 TextPaint textPaint, @o0 f fVar) {
        if (i(context)) {
            l(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void l(@o0 TextPaint textPaint, @o0 Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i4 = (~typeface.getStyle()) & this.f53775f;
        textPaint.setFakeBoldText((i4 & 1) != 0);
        textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f53783n);
        if (this.f53781l) {
            textPaint.setLetterSpacing(this.f53782m);
        }
    }
}
