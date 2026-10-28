package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.h0;

/* compiled from: ClickActionDelegate.java */
/* loaded from: classes6.dex */
class a extends androidx.core.view.a {

    /* renamed from: e, reason: collision with root package name */
    private final h0.a f54440e;

    public a(Context context, int i4) {
        this.f54440e = new h0.a(16, context.getString(i4));
    }

    @Override // androidx.core.view.a
    public void i(View view, h0 h0Var) {
        super.i(view, h0Var);
        h0Var.b(this.f54440e);
    }
}
