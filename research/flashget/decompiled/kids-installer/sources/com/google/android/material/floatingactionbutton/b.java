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
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.animation.h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseMotionStrategy.java */
/* loaded from: classes3.dex */
abstract class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13498a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final ExtendedFloatingActionButton f13499b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<Animator.AnimatorListener> f13500c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.a f13501d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private h f13502e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private h f13503f;

    /* compiled from: BaseMotionStrategy.java */
    /* loaded from: classes2.dex */
    class a extends Property<ExtendedFloatingActionButton, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(com.google.android.material.animation.a.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f13457d0.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f13499b.f13457d0.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f6) {
            int colorForState = extendedFloatingActionButton.f13457d0.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f13499b.f13457d0.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (com.google.android.material.animation.a.a(0.0f, Color.alpha(colorForState) / 255.0f, f6.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f6.floatValue() == 1.0f) {
                extendedFloatingActionButton.i1(extendedFloatingActionButton.f13457d0);
            } else {
                extendedFloatingActionButton.i1(valueOf);
            }
        }
    }

    b(@o0 ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.a aVar) {
        this.f13499b = extendedFloatingActionButton;
        this.f13498a = extendedFloatingActionButton.getContext();
        this.f13501d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @i
    public void a() {
        this.f13501d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final h b() {
        h hVar = this.f13503f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f13502e == null) {
            this.f13502e = h.d(this.f13498a, c());
        }
        h hVar2 = this.f13502e;
        hVar2.getClass();
        return hVar2;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @q0
    public h e() {
        return this.f13503f;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void g(@o0 Animator.AnimatorListener animatorListener) {
        this.f13500c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void h(@o0 Animator.AnimatorListener animatorListener) {
        this.f13500c.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @i
    public void i() {
        this.f13501d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void j(@q0 h hVar) {
        this.f13503f = hVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public AnimatorSet k() {
        return o(b());
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @o0
    public final List<Animator.AnimatorListener> l() {
        return this.f13500c;
    }

    @o0
    AnimatorSet o(@o0 h hVar) {
        ArrayList arrayList = new ArrayList();
        String s5 = ProtectedSandApp.s("⛢");
        if (hVar.j(s5)) {
            arrayList.add(hVar.f(s5, this.f13499b, View.ALPHA));
        }
        String s6 = ProtectedSandApp.s("⛣");
        if (hVar.j(s6)) {
            arrayList.add(hVar.f(s6, this.f13499b, View.SCALE_Y));
            arrayList.add(hVar.f(s6, this.f13499b, View.SCALE_X));
        }
        String s7 = ProtectedSandApp.s("⛤");
        if (hVar.j(s7)) {
            arrayList.add(hVar.f(s7, this.f13499b, ExtendedFloatingActionButton.f13450i0));
        }
        String s8 = ProtectedSandApp.s("⛥");
        if (hVar.j(s8)) {
            arrayList.add(hVar.f(s8, this.f13499b, ExtendedFloatingActionButton.f13451j0));
        }
        String s9 = ProtectedSandApp.s("⛦");
        if (hVar.j(s9)) {
            arrayList.add(hVar.f(s9, this.f13499b, ExtendedFloatingActionButton.f13452k0));
        }
        String s10 = ProtectedSandApp.s("⛧");
        if (hVar.j(s10)) {
            arrayList.add(hVar.f(s10, this.f13499b, ExtendedFloatingActionButton.f13453l0));
        }
        String s11 = ProtectedSandApp.s("⛨");
        if (hVar.j(s11)) {
            arrayList.add(hVar.f(s11, this.f13499b, new a(Float.class, ProtectedSandApp.s("⛩"))));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @i
    public void onAnimationStart(Animator animator) {
        this.f13501d.c(animator);
    }
}
