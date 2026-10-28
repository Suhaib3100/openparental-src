package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import n1.a;

/* compiled from: MaterialStyledDatePickerDialog.java */
@c1({c1.a.LIBRARY_GROUP, c1.a.TESTS})
/* loaded from: classes2.dex */
public class i extends DatePickerDialog {

    /* renamed from: q, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f13412q = 16843612;

    /* renamed from: r, reason: collision with root package name */
    @h1
    private static final int f13413r = a.n.B3;

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final Drawable f13414o;

    /* renamed from: p, reason: collision with root package name */
    @o0
    private final Rect f13415p;

    public i(@o0 Context context) {
        this(context, 0);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f13414o);
        getWindow().getDecorView().setOnTouchListener(new q1.a(this, this.f13415p));
    }

    public i(@o0 Context context, int i5) {
        this(context, i5, null, -1, -1, -1);
    }

    public i(@o0 Context context, @q0 DatePickerDialog.OnDateSetListener onDateSetListener, int i5, int i6, int i7) {
        this(context, 0, onDateSetListener, i5, i6, i7);
    }

    public i(@o0 Context context, int i5, @q0 DatePickerDialog.OnDateSetListener onDateSetListener, int i6, int i7, int i8) {
        super(context, i5, onDateSetListener, i6, i7, i8);
        Context context2 = getContext();
        int g5 = com.google.android.material.resources.b.g(getContext(), a.c.Q2, getClass().getCanonicalName());
        int i9 = f13413r;
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j(context2, null, 16843612, i9);
        jVar.p0(ColorStateList.valueOf(g5));
        Rect a6 = q1.c.a(context2, 16843612, i9);
        this.f13415p = a6;
        this.f13414o = q1.c.b(jVar, a6);
    }
}
