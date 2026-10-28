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
import androidx.transition.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;

/* compiled from: TextScale.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class l extends Transition {
    private static final String V1 = ProtectedSandApp.s("\uf1ea");

    /* compiled from: TextScale.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f53516b;

        a(TextView textView) {
            this.f53516b = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f53516b.setScaleX(floatValue);
            this.f53516b.setScaleY(floatValue);
        }
    }

    private void J0(@o0 b0 b0Var) {
        View view = b0Var.f34364b;
        if (view instanceof TextView) {
            b0Var.f34363a.put(ProtectedSandApp.s("\uf1ea"), Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public void m(@o0 b0 b0Var) {
        J0(b0Var);
    }

    @Override // androidx.transition.Transition
    public void p(@o0 b0 b0Var) {
        J0(b0Var);
    }

    @Override // androidx.transition.Transition
    public Animator t(@o0 ViewGroup viewGroup, @q0 b0 b0Var, @q0 b0 b0Var2) {
        if (b0Var == null || b0Var2 == null || !(b0Var.f34364b instanceof TextView)) {
            return null;
        }
        View view = b0Var2.f34364b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = b0Var.f34363a;
        Map<String, Object> map2 = b0Var2.f34363a;
        String s4 = ProtectedSandApp.s("\uf1ea");
        float floatValue = map.get(s4) != null ? ((Float) map.get(s4)).floatValue() : 1.0f;
        float floatValue2 = map2.get(s4) != null ? ((Float) map2.get(s4)).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
