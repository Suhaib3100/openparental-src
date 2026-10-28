package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.x;
import com.google.android.material.internal.v;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabIndicatorInterpolator.java */
/* loaded from: classes6.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    @r(unit = 0)
    private static final int f54217a = 24;

    b() {
    }

    static RectF a(TabLayout tabLayout, @q0 View view) {
        return view == null ? new RectF() : (tabLayout.Q() || !(view instanceof TabLayout.n)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.n) view, 24);
    }

    static RectF b(@o0 TabLayout.n nVar, @r(unit = 0) int i4) {
        int p4 = nVar.p();
        int o4 = nVar.o();
        int e4 = (int) v.e(nVar.getContext(), i4);
        if (p4 < e4) {
            p4 = e4;
        }
        int right = (nVar.getRight() + nVar.getLeft()) / 2;
        int bottom = (nVar.getBottom() + nVar.getTop()) / 2;
        int i5 = p4 / 2;
        return new RectF(right - i5, bottom - (o4 / 2), i5 + right, (right / 2) + bottom);
    }

    void c(TabLayout tabLayout, View view, View view2, @x(from = 0.0d, to = 1.0d) float f4, @o0 Drawable drawable) {
        RectF a5 = a(tabLayout, view);
        RectF a6 = a(tabLayout, view2);
        drawable.setBounds(com.google.android.material.animation.a.c((int) a5.left, (int) a6.left, f4), drawable.getBounds().top, com.google.android.material.animation.a.c((int) a5.right, (int) a6.right, f4), drawable.getBounds().bottom);
    }

    void d(TabLayout tabLayout, View view, @o0 Drawable drawable) {
        RectF a5 = a(tabLayout, view);
        drawable.setBounds((int) a5.left, drawable.getBounds().top, (int) a5.right, drawable.getBounds().bottom);
    }
}
