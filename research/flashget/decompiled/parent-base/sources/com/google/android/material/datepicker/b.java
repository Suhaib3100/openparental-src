package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.o0;
import s8.a;

/* compiled from: CalendarStyle.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    @o0
    final a f53091a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    final a f53092b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    final a f53093c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    final a f53094d;

    /* renamed from: e, reason: collision with root package name */
    @o0
    final a f53095e;

    /* renamed from: f, reason: collision with root package name */
    @o0
    final a f53096f;

    /* renamed from: g, reason: collision with root package name */
    @o0
    final a f53097g;

    /* renamed from: h, reason: collision with root package name */
    @o0
    final Paint f53098h;

    b(@o0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.g(context, a.c.I9, f.class.getCanonicalName()), a.o.Vk);
        this.f53091a = a.a(context, obtainStyledAttributes.getResourceId(a.o.Zk, 0));
        this.f53097g = a.a(context, obtainStyledAttributes.getResourceId(a.o.Xk, 0));
        this.f53092b = a.a(context, obtainStyledAttributes.getResourceId(a.o.Yk, 0));
        this.f53093c = a.a(context, obtainStyledAttributes.getResourceId(a.o.al, 0));
        ColorStateList a5 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.cl);
        this.f53094d = a.a(context, obtainStyledAttributes.getResourceId(a.o.el, 0));
        this.f53095e = a.a(context, obtainStyledAttributes.getResourceId(a.o.dl, 0));
        this.f53096f = a.a(context, obtainStyledAttributes.getResourceId(a.o.fl, 0));
        Paint paint = new Paint();
        this.f53098h = paint;
        paint.setColor(a5.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
