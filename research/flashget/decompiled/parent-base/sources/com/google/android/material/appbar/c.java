package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.o0;
import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.n;
import s8.a;

/* compiled from: ViewUtilsLollipop.java */
@x0(21)
/* loaded from: classes6.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f52612a = {R.attr.stateListAnimator};

    c() {
    }

    static void a(@o0 View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void b(@o0 View view, float f4) {
        int integer = view.getResources().getInteger(a.i.f91114c);
        StateListAnimator stateListAnimator = new StateListAnimator();
        String s4 = ProtectedSandApp.s("\uf14c");
        long j4 = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, a.c.f90387ed, -a.c.f90400fd}, ObjectAnimator.ofFloat(view, s4, 0.0f).setDuration(j4));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, s4, f4).setDuration(j4));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, s4, 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    static void c(@o0 View view, AttributeSet attributeSet, int i4, int i5) {
        Context context = view.getContext();
        TypedArray j4 = n.j(context, attributeSet, f52612a, i4, i5, new int[0]);
        try {
            if (j4.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, j4.getResourceId(0, 0)));
            }
        } finally {
            j4.recycle();
        }
    }
}
