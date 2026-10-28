package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import java.util.ArrayList;
import n1.a;

/* compiled from: FloatingActionButtonImplLollipop.java */
@x0(21)
/* loaded from: classes3.dex */
class e extends d {

    /* compiled from: FloatingActionButtonImplLollipop.java */
    static class a extends j {
        a(o oVar) {
            super(oVar);
        }

        @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    e(FloatingActionButton floatingActionButton, com.google.android.material.shadow.c cVar) {
        super(floatingActionButton, cVar);
    }

    @o0
    private Animator m0(float f6, float f7) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f13547y, ProtectedSandApp.s("⛴"), f6).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f13547y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f7).setDuration(100L));
        animatorSet.setInterpolator(d.F);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void A() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void C() {
        i0();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void E(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void F(float f6, float f7, float f8) {
        int i5 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.S, m0(f6, f8));
        stateListAnimator.addState(d.T, m0(f6, f7));
        stateListAnimator.addState(d.U, m0(f6, f7));
        stateListAnimator.addState(d.V, m0(f6, f7));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f13547y, ProtectedSandApp.s("⛵"), f6).setDuration(0L));
        if (i5 <= 24) {
            FloatingActionButton floatingActionButton = this.f13547y;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f13547y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.F);
        stateListAnimator.addState(d.W, animatorSet);
        stateListAnimator.addState(d.X, m0(0.0f, 0.0f));
        this.f13547y.setStateListAnimator(stateListAnimator);
        if (c0()) {
            i0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean N() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void Y(@q0 ColorStateList colorStateList) {
        Drawable drawable = this.f13525c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(com.google.android.material.ripple.b.d(colorStateList));
        } else {
            super.Y(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean c0() {
        return this.f13548z.c() || !e0();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void g0() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    @o0
    j j() {
        o oVar = this.f13523a;
        oVar.getClass();
        return new a(oVar);
    }

    @o0
    c l0(int i5, ColorStateList colorStateList) {
        Context context = this.f13547y.getContext();
        o oVar = this.f13523a;
        oVar.getClass();
        c cVar = new c(oVar);
        cVar.f(androidx.core.content.d.f(context, a.e.D0), androidx.core.content.d.f(context, a.e.C0), androidx.core.content.d.f(context, a.e.A0), androidx.core.content.d.f(context, a.e.B0));
        cVar.e(i5);
        cVar.d(colorStateList);
        return cVar;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public float n() {
        return this.f13547y.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void s(@o0 Rect rect) {
        if (this.f13548z.c()) {
            super.s(rect);
        } else if (e0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int L = (this.f13533k - this.f13547y.L()) / 2;
            rect.set(L, L, L, L);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void x(ColorStateList colorStateList, @q0 PorterDuff.Mode mode, ColorStateList colorStateList2, int i5) {
        Drawable drawable;
        j j5 = j();
        this.f13524b = j5;
        j5.setTintList(colorStateList);
        if (mode != null) {
            this.f13524b.setTintMode(mode);
        }
        this.f13524b.a0(this.f13547y.getContext());
        if (i5 > 0) {
            this.f13526d = l0(i5, colorStateList);
            c cVar = this.f13526d;
            cVar.getClass();
            j jVar = this.f13524b;
            jVar.getClass();
            drawable = new LayerDrawable(new Drawable[]{cVar, jVar});
        } else {
            this.f13526d = null;
            drawable = this.f13524b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.d(colorStateList2), drawable, null);
        this.f13525c = rippleDrawable;
        this.f13527e = rippleDrawable;
    }
}
