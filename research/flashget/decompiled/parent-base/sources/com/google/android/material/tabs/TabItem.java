package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.t0;
import s8.a;

/* loaded from: classes6.dex */
public class TabItem extends View {

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f54141b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f54142c;

    /* renamed from: d, reason: collision with root package name */
    public final int f54143d;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t0 F = t0.F(context, attributeSet, a.o.Gr);
        this.f54141b = F.x(a.o.Jr);
        this.f54142c = F.h(a.o.Hr);
        this.f54143d = F.u(a.o.Ir, 0);
        F.I();
    }
}
