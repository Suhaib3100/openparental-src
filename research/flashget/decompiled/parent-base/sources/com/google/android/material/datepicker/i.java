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
import s8.a;

/* compiled from: MaterialStyledDatePickerDialog.java */
@c1({c1.a.LIBRARY_GROUP, c1.a.TESTS})
/* loaded from: classes6.dex */
public class i extends DatePickerDialog {

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f53188d = 16843612;

    /* renamed from: e, reason: collision with root package name */
    @h1
    private static final int f53189e = a.n.B3;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Drawable f53190b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final Rect f53191c;

    public i(@o0 Context context) {
        this(context, 0);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f53190b);
        getWindow().getDecorView().setOnTouchListener(new v8.a(this, this.f53191c));
    }

    public i(@o0 Context context, int i4) {
        this(context, i4, null, -1, -1, -1);
    }

    public i(@o0 Context context, @q0 DatePickerDialog.OnDateSetListener onDateSetListener, int i4, int i5, int i6) {
        this(context, 0, onDateSetListener, i4, i5, i6);
    }

    public i(@o0 Context context, int i4, @q0 DatePickerDialog.OnDateSetListener onDateSetListener, int i5, int i6, int i7) {
        super(context, i4, onDateSetListener, i5, i6, i7);
        Context context2 = getContext();
        int g4 = com.google.android.material.resources.b.g(getContext(), a.c.P2, getClass().getCanonicalName());
        int i10 = f53189e;
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j(context2, null, 16843612, i10);
        jVar.p0(ColorStateList.valueOf(g4));
        Rect a5 = v8.c.a(context2, 16843612, i10);
        this.f53191c = a5;
        this.f53190b = v8.c.b(jVar, a5);
    }
}
