package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.o0;
import n1.a;

/* compiled from: CalendarStyle.java */
/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    @o0
    final a f13338a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    final a f13339b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    final a f13340c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    final a f13341d;

    /* renamed from: e, reason: collision with root package name */
    @o0
    final a f13342e;

    /* renamed from: f, reason: collision with root package name */
    @o0
    final a f13343f;

    /* renamed from: g, reason: collision with root package name */
    @o0
    final a f13344g;

    /* renamed from: h, reason: collision with root package name */
    @o0
    final Paint f13345h;

    b(@o0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.g(context, a.c.J9, f.class.getCanonicalName()), a.o.Cj);
        this.f13338a = a.a(context, obtainStyledAttributes.getResourceId(a.o.Gj, 0));
        this.f13344g = a.a(context, obtainStyledAttributes.getResourceId(a.o.Ej, 0));
        this.f13339b = a.a(context, obtainStyledAttributes.getResourceId(a.o.Fj, 0));
        this.f13340c = a.a(context, obtainStyledAttributes.getResourceId(a.o.Hj, 0));
        ColorStateList a6 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.Jj);
        this.f13341d = a.a(context, obtainStyledAttributes.getResourceId(a.o.Lj, 0));
        this.f13342e = a.a(context, obtainStyledAttributes.getResourceId(a.o.Kj, 0));
        this.f13343f = a.a(context, obtainStyledAttributes.getResourceId(a.o.Mj, 0));
        Paint paint = new Paint();
        this.f13345h = paint;
        paint.setColor(a6.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
