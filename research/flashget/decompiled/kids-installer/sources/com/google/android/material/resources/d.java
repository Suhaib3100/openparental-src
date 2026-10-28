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
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import n1.a;

/* compiled from: TextAppearance.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class d {

    /* renamed from: r, reason: collision with root package name */
    private static final String f13916r = ProtectedSandApp.s("\u124f");

    /* renamed from: s, reason: collision with root package name */
    private static final int f13917s = 1;

    /* renamed from: t, reason: collision with root package name */
    private static final int f13918t = 2;

    /* renamed from: u, reason: collision with root package name */
    private static final int f13919u = 3;

    /* renamed from: a, reason: collision with root package name */
    @q0
    public final ColorStateList f13920a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    public final ColorStateList f13921b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    public final ColorStateList f13922c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    public final ColorStateList f13923d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    public final String f13924e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13925f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13926g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13927h;

    /* renamed from: i, reason: collision with root package name */
    public final float f13928i;

    /* renamed from: j, reason: collision with root package name */
    public final float f13929j;

    /* renamed from: k, reason: collision with root package name */
    public final float f13930k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13931l;

    /* renamed from: m, reason: collision with root package name */
    public final float f13932m;

    /* renamed from: n, reason: collision with root package name */
    public float f13933n;

    /* renamed from: o, reason: collision with root package name */
    @y
    private final int f13934o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13935p = false;

    /* renamed from: q, reason: collision with root package name */
    private Typeface f13936q;

    /* compiled from: TextAppearance.java */
    /* loaded from: classes3.dex */
    class a extends i.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f13937a;

        a(f fVar) {
            this.f13937a = fVar;
        }

        @Override // androidx.core.content.res.i.g
        /* renamed from: h */
        public void f(int i5) {
            d.this.f13935p = true;
            this.f13937a.a(i5);
        }

        @Override // androidx.core.content.res.i.g
        /* renamed from: i */
        public void g(@o0 Typeface typeface) {
            d dVar = d.this;
            dVar.f13936q = Typeface.create(typeface, dVar.f13925f);
            d.this.f13935p = true;
            this.f13937a.b(d.this.f13936q, false);
        }
    }

    /* compiled from: TextAppearance.java */
    /* loaded from: classes3.dex */
    class b extends f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextPaint f13939a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f13940b;

        b(TextPaint textPaint, f fVar) {
            this.f13939a = textPaint;
            this.f13940b = fVar;
        }

        @Override // com.google.android.material.resources.f
        public void a(int i5) {
            this.f13940b.a(i5);
        }

        @Override // com.google.android.material.resources.f
        public void b(@o0 Typeface typeface, boolean z5) {
            d.this.l(this.f13939a, typeface);
            this.f13940b.b(typeface, z5);
        }
    }

    public d(@o0 Context context, @h1 int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, a.o.Gq);
        this.f13933n = obtainStyledAttributes.getDimension(a.o.Hq, 0.0f);
        this.f13920a = c.a(context, obtainStyledAttributes, a.o.Kq);
        this.f13921b = c.a(context, obtainStyledAttributes, a.o.Lq);
        this.f13922c = c.a(context, obtainStyledAttributes, a.o.Mq);
        this.f13925f = obtainStyledAttributes.getInt(a.o.Jq, 0);
        this.f13926g = obtainStyledAttributes.getInt(a.o.Iq, 1);
        int e6 = c.e(obtainStyledAttributes, a.o.Tq, a.o.Rq);
        this.f13934o = obtainStyledAttributes.getResourceId(e6, 0);
        this.f13924e = obtainStyledAttributes.getString(e6);
        this.f13927h = obtainStyledAttributes.getBoolean(a.o.Vq, false);
        this.f13923d = c.a(context, obtainStyledAttributes, a.o.Nq);
        this.f13928i = obtainStyledAttributes.getFloat(a.o.Oq, 0.0f);
        this.f13929j = obtainStyledAttributes.getFloat(a.o.Pq, 0.0f);
        this.f13930k = obtainStyledAttributes.getFloat(a.o.Qq, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i5, a.o.uk);
        int i6 = a.o.vk;
        this.f13931l = obtainStyledAttributes2.hasValue(i6);
        this.f13932m = obtainStyledAttributes2.getFloat(i6, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f13936q == null && (str = this.f13924e) != null) {
            this.f13936q = Typeface.create(str, this.f13925f);
        }
        if (this.f13936q == null) {
            int i5 = this.f13926g;
            if (i5 == 1) {
                this.f13936q = Typeface.SANS_SERIF;
            } else if (i5 == 2) {
                this.f13936q = Typeface.SERIF;
            } else if (i5 != 3) {
                this.f13936q = Typeface.DEFAULT;
            } else {
                this.f13936q = Typeface.MONOSPACE;
            }
            this.f13936q = Typeface.create(this.f13936q, this.f13925f);
        }
    }

    private boolean i(Context context) {
        if (e.b()) {
            return true;
        }
        int i5 = this.f13934o;
        return (i5 != 0 ? i.d(context, i5) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f13936q;
    }

    @o0
    @m1
    public Typeface f(@o0 Context context) {
        if (this.f13935p) {
            return this.f13936q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface j5 = i.j(context, this.f13934o);
                this.f13936q = j5;
                if (j5 != null) {
                    this.f13936q = Typeface.create(j5, this.f13925f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        d();
        this.f13935p = true;
        return this.f13936q;
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
        int i5 = this.f13934o;
        if (i5 == 0) {
            this.f13935p = true;
        }
        if (this.f13935p) {
            fVar.b(this.f13936q, true);
            return;
        }
        try {
            i.l(context, i5, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f13935p = true;
            fVar.a(1);
        } catch (Exception unused2) {
            this.f13935p = true;
            fVar.a(-3);
        }
    }

    public void j(@o0 Context context, @o0 TextPaint textPaint, @o0 f fVar) {
        k(context, textPaint, fVar);
        ColorStateList colorStateList = this.f13920a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : y1.f5758t);
        float f6 = this.f13930k;
        float f7 = this.f13928i;
        float f8 = this.f13929j;
        ColorStateList colorStateList2 = this.f13923d;
        textPaint.setShadowLayer(f6, f7, f8, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
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
        int i5 = (~typeface.getStyle()) & this.f13925f;
        textPaint.setFakeBoldText((i5 & 1) != 0);
        textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f13933n);
        if (this.f13931l) {
            textPaint.setLetterSpacing(this.f13932m);
        }
    }
}
