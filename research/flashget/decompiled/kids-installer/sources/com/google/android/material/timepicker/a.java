package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.g0;

/* compiled from: ClickActionDelegate.java */
/* loaded from: classes3.dex */
class a extends androidx.core.view.a {

    /* renamed from: d, reason: collision with root package name */
    private final g0.a f14603d;

    public a(Context context, int i5) {
        this.f14603d = new g0.a(16, context.getString(i5));
    }

    @Override // androidx.core.view.a
    public void g(View view, g0 g0Var) {
        super.g(view, g0Var);
        g0Var.b(this.f14603d);
    }
}
