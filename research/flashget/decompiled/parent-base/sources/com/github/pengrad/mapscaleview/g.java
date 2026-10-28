package com.github.pengrad.mapscaleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.pengrad.mapscaleview.d;

/* compiled from: ViewConfig.java */
/* loaded from: classes5.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    final int f51739a;

    /* renamed from: b, reason: collision with root package name */
    final int f51740b;

    /* renamed from: c, reason: collision with root package name */
    final float f51741c;

    /* renamed from: d, reason: collision with root package name */
    final float f51742d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f51743e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f51744f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f51745g;

    g(Context context, AttributeSet attributeSet) {
        float f4 = context.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d.p.x5, 0, 0);
        try {
            this.f51739a = obtainStyledAttributes.getDimensionPixelSize(d.p.A5, (int) (100.0f * f4));
            this.f51740b = obtainStyledAttributes.getColor(d.p.y5, Color.parseColor(ProtectedSandApp.s("쒢")));
            this.f51741c = obtainStyledAttributes.getDimension(d.p.E5, 12.0f * f4);
            this.f51742d = obtainStyledAttributes.getDimension(d.p.D5, f4 * 1.5f);
            this.f51743e = obtainStyledAttributes.getBoolean(d.p.B5, false);
            this.f51744f = obtainStyledAttributes.getBoolean(d.p.C5, true);
            this.f51745g = obtainStyledAttributes.getBoolean(d.p.z5, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
