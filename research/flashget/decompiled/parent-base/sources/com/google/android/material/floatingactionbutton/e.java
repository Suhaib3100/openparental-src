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
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import java.util.ArrayList;
import s8.a;

/* compiled from: FloatingActionButtonImplLollipop.java */
@x0(21)
/* loaded from: classes6.dex */
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
    private Animator m0(float f4, float f5) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f53328y, ProtectedSandApp.s("\uf1d9"), f4).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f53328y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f5).setDuration(100L));
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
    void F(float f4, float f5, float f6) {
        int i4 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.S, m0(f4, f6));
        stateListAnimator.addState(d.T, m0(f4, f5));
        stateListAnimator.addState(d.U, m0(f4, f5));
        stateListAnimator.addState(d.V, m0(f4, f5));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f53328y, ProtectedSandApp.s("\uf1d9"), f4).setDuration(0L));
        if (i4 <= 24) {
            FloatingActionButton floatingActionButton = this.f53328y;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f53328y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.F);
        stateListAnimator.addState(d.W, animatorSet);
        stateListAnimator.addState(d.X, m0(0.0f, 0.0f));
        this.f53328y.setStateListAnimator(stateListAnimator);
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
        Drawable drawable = this.f53306c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(com.google.android.material.ripple.b.d(colorStateList));
        } else {
            super.Y(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean c0() {
        return this.f53329z.c() || !e0();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void g0() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    @o0
    j j() {
        o oVar = this.f53304a;
        oVar.getClass();
        return new a(oVar);
    }

    @o0
    c l0(int i4, ColorStateList colorStateList) {
        Context context = this.f53328y.getContext();
        o oVar = this.f53304a;
        oVar.getClass();
        c cVar = new c(oVar);
        cVar.f(androidx.core.content.d.getColor(context, a.e.D0), androidx.core.content.d.getColor(context, a.e.C0), androidx.core.content.d.getColor(context, a.e.A0), androidx.core.content.d.getColor(context, a.e.B0));
        cVar.e(i4);
        cVar.d(colorStateList);
        return cVar;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public float n() {
        return this.f53328y.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void s(@o0 Rect rect) {
        if (this.f53329z.c()) {
            super.s(rect);
        } else if (e0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int D = (this.f53314k - this.f53328y.D()) / 2;
            rect.set(D, D, D, D);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void x(ColorStateList colorStateList, @q0 PorterDuff.Mode mode, ColorStateList colorStateList2, int i4) {
        Drawable drawable;
        j j4 = j();
        this.f53305b = j4;
        j4.setTintList(colorStateList);
        if (mode != null) {
            this.f53305b.setTintMode(mode);
        }
        this.f53305b.a0(this.f53328y.getContext());
        if (i4 > 0) {
            this.f53307d = l0(i4, colorStateList);
            c cVar = this.f53307d;
            cVar.getClass();
            j jVar = this.f53305b;
            jVar.getClass();
            drawable = new LayerDrawable(new Drawable[]{cVar, jVar});
        } else {
            this.f53307d = null;
            drawable = this.f53305b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.d(colorStateList2), drawable, null);
        this.f53306c = rippleDrawable;
        this.f53308e = rippleDrawable;
    }
}
