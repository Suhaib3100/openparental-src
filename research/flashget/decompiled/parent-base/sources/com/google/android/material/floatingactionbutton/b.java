package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.annotation.i;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.animation.h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseMotionStrategy.java */
/* loaded from: classes6.dex */
abstract class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f53279a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final ExtendedFloatingActionButton f53280b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<Animator.AnimatorListener> f53281c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.a f53282d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private h f53283e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private h f53284f;

    /* compiled from: BaseMotionStrategy.java */
    class a extends Property<ExtendedFloatingActionButton, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(com.google.android.material.animation.a.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.O.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f53280b.O.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f4) {
            int colorForState = extendedFloatingActionButton.O.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f53280b.O.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (com.google.android.material.animation.a.a(0.0f, Color.alpha(colorForState) / 255.0f, f4.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f4.floatValue() == 1.0f) {
                extendedFloatingActionButton.b1(extendedFloatingActionButton.O);
            } else {
                extendedFloatingActionButton.b1(valueOf);
            }
        }
    }

    b(@o0 ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.a aVar) {
        this.f53280b = extendedFloatingActionButton;
        this.f53279a = extendedFloatingActionButton.getContext();
        this.f53282d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final h a() {
        h hVar = this.f53284f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f53283e == null) {
            this.f53283e = h.d(this.f53279a, g());
        }
        h hVar2 = this.f53283e;
        hVar2.getClass();
        return hVar2;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @q0
    public h c() {
        return this.f53284f;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void e(@o0 Animator.AnimatorListener animatorListener) {
        this.f53281c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @i
    public void f() {
        this.f53282d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void h(@o0 Animator.AnimatorListener animatorListener) {
        this.f53281c.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @i
    public void i() {
        this.f53282d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void j(@q0 h hVar) {
        this.f53284f = hVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public AnimatorSet k() {
        return o(a());
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @o0
    public final List<Animator.AnimatorListener> l() {
        return this.f53281c;
    }

    @o0
    AnimatorSet o(@o0 h hVar) {
        ArrayList arrayList = new ArrayList();
        String s4 = ProtectedSandApp.s("\uf1c1");
        if (hVar.j(s4)) {
            arrayList.add(hVar.f(s4, this.f53280b, View.ALPHA));
        }
        String s5 = ProtectedSandApp.s("\uf1c2");
        if (hVar.j(s5)) {
            arrayList.add(hVar.f(s5, this.f53280b, View.SCALE_Y));
            arrayList.add(hVar.f(s5, this.f53280b, View.SCALE_X));
        }
        String s6 = ProtectedSandApp.s("\uf1c3");
        if (hVar.j(s6)) {
            arrayList.add(hVar.f(s6, this.f53280b, ExtendedFloatingActionButton.V1));
        }
        String s7 = ProtectedSandApp.s("\uf1c4");
        if (hVar.j(s7)) {
            arrayList.add(hVar.f(s7, this.f53280b, ExtendedFloatingActionButton.L2));
        }
        String s10 = ProtectedSandApp.s("\uf1c5");
        if (hVar.j(s10)) {
            arrayList.add(hVar.f(s10, this.f53280b, ExtendedFloatingActionButton.M2));
        }
        String s11 = ProtectedSandApp.s("\uf1c6");
        if (hVar.j(s11)) {
            arrayList.add(hVar.f(s11, this.f53280b, ExtendedFloatingActionButton.N2));
        }
        String s12 = ProtectedSandApp.s("\uf1c7");
        if (hVar.j(s12)) {
            arrayList.add(hVar.f(s12, this.f53280b, new a(Float.class, ProtectedSandApp.s("\uf1c8"))));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @i
    public void onAnimationStart(Animator animator) {
        this.f53282d.c(animator);
    }
}
