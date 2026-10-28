package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.x;

/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: classes3.dex */
class a extends b {
    a() {
    }

    private static float e(@x(from = 0.0d, to = 1.0d) float f6) {
        return (float) (1.0d - Math.cos((f6 * 3.141592653589793d) / 2.0d));
    }

    private static float f(@x(from = 0.0d, to = 1.0d) float f6) {
        return (float) Math.sin((f6 * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.b
    void c(TabLayout tabLayout, View view, View view2, float f6, @o0 Drawable drawable) {
        float f7;
        float e6;
        RectF a6 = b.a(tabLayout, view);
        RectF a7 = b.a(tabLayout, view2);
        if (a6.left < a7.left) {
            f7 = e(f6);
            e6 = f(f6);
        } else {
            f7 = f(f6);
            e6 = e(f6);
        }
        drawable.setBounds(com.google.android.material.animation.a.c((int) a6.left, (int) a7.left, f7), drawable.getBounds().top, com.google.android.material.animation.a.c((int) a6.right, (int) a7.right, e6), drawable.getBounds().bottom);
    }
}
