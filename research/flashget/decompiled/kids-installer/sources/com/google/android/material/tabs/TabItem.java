package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.z0;
import n1.a;

/* loaded from: classes2.dex */
public class TabItem extends View {

    /* renamed from: o, reason: collision with root package name */
    public final CharSequence f14279o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f14280p;

    /* renamed from: q, reason: collision with root package name */
    public final int f14281q;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z0 F = z0.F(context, attributeSet, a.o.bq);
        this.f14279o = F.x(a.o.eq);
        this.f14280p = F.h(a.o.cq);
        this.f14281q = F.u(a.o.dq, 0);
        F.I();
    }
}
