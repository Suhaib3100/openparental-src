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
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.n;
import n1.a;

/* compiled from: ViewUtilsLollipop.java */
@x0(21)
/* loaded from: classes2.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f12903a = {R.attr.stateListAnimator};

    b() {
    }

    static void a(@o0 View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void b(@o0 View view, float f6) {
        int integer = view.getResources().getInteger(a.i.f29842c);
        StateListAnimator stateListAnimator = new StateListAnimator();
        String s5 = ProtectedSandApp.s("ለ");
        long j5 = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, a.c.fd, -a.c.gd}, ObjectAnimator.ofFloat(view, s5, 0.0f).setDuration(j5));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, s5, f6).setDuration(j5));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, s5, 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    static void c(@o0 View view, AttributeSet attributeSet, int i5, int i6) {
        Context context = view.getContext();
        TypedArray j5 = n.j(context, attributeSet, f12903a, i5, i6, new int[0]);
        try {
            if (j5.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, j5.getResourceId(0, 0)));
            }
        } finally {
            j5.recycle();
        }
    }
}
