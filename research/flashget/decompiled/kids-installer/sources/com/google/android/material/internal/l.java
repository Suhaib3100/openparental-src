package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.transition.Transition;
import androidx.transition.d0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;

/* compiled from: TextScale.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class l extends Transition {

    /* renamed from: k0, reason: collision with root package name */
    private static final String f13721k0 = ProtectedSandApp.s("✈");

    /* compiled from: TextScale.java */
    /* loaded from: classes2.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f13722a;

        a(TextView textView) {
            this.f13722a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f13722a.setScaleX(floatValue);
            this.f13722a.setScaleY(floatValue);
        }
    }

    private void P0(@o0 d0 d0Var) {
        View view = d0Var.f9860b;
        if (view instanceof TextView) {
            d0Var.f9859a.put(ProtectedSandApp.s("✆"), Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public void l(@o0 d0 d0Var) {
        P0(d0Var);
    }

    @Override // androidx.transition.Transition
    public void o(@o0 d0 d0Var) {
        P0(d0Var);
    }

    @Override // androidx.transition.Transition
    public Animator u(@o0 ViewGroup viewGroup, @q0 d0 d0Var, @q0 d0 d0Var2) {
        if (d0Var == null || d0Var2 == null || !(d0Var.f9860b instanceof TextView)) {
            return null;
        }
        View view = d0Var2.f9860b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = d0Var.f9859a;
        Map<String, Object> map2 = d0Var2.f9859a;
        String s5 = ProtectedSandApp.s("✇");
        float floatValue = map.get(s5) != null ? ((Float) map.get(s5)).floatValue() : 1.0f;
        float floatValue2 = map2.get(s5) != null ? ((Float) map2.get(s5)).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
