package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.x;

/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: classes6.dex */
class a extends b {
    a() {
    }

    private static float e(@x(from = 0.0d, to = 1.0d) float f4) {
        return (float) (1.0d - Math.cos((f4 * 3.141592653589793d) / 2.0d));
    }

    private static float f(@x(from = 0.0d, to = 1.0d) float f4) {
        return (float) Math.sin((f4 * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.b
    void c(TabLayout tabLayout, View view, View view2, float f4, @o0 Drawable drawable) {
        float f5;
        float e4;
        RectF a5 = b.a(tabLayout, view);
        RectF a6 = b.a(tabLayout, view2);
        if (a5.left < a6.left) {
            f5 = e(f4);
            e4 = f(f4);
        } else {
            f5 = f(f4);
            e4 = e(f4);
        }
        drawable.setBounds(com.google.android.material.animation.a.c((int) a5.left, (int) a6.left, f5), drawable.getBounds().top, com.google.android.material.animation.a.c((int) a5.right, (int) a6.right, e4), drawable.getBounds().bottom);
    }
}
