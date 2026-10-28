package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;
import s8.a;

/* loaded from: classes6.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private static final int Q = 0;
    private static final int Q1 = 2;
    private static final int R = 1;
    private int B;
    private final com.google.android.material.floatingactionbutton.a C;

    @o0
    private final com.google.android.material.floatingactionbutton.f D;

    @o0
    private final com.google.android.material.floatingactionbutton.f E;
    private final com.google.android.material.floatingactionbutton.f F;
    private final com.google.android.material.floatingactionbutton.f G;
    private final int H;
    private int I;
    private int J;

    @o0
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> K;
    private boolean L;
    private boolean M;
    private boolean N;

    @o0
    protected ColorStateList O;
    private static final int P = a.n.zb;
    static final Property<View, Float> V1 = new d(Float.class, ProtectedSandApp.s("\uf1ce"));
    static final Property<View, Float> L2 = new e(Float.class, ProtectedSandApp.s("\uf1cf"));
    static final Property<View, Float> M2 = new f(Float.class, ProtectedSandApp.s("\uf1d0"));
    static final Property<View, Float> N2 = new g(Float.class, ProtectedSandApp.s("\uf1d1"));

    class a implements l {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.J;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.I;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.v0() * 2)) + ExtendedFloatingActionButton.this.I + ExtendedFloatingActionButton.this.J;
        }
    }

    class b implements l {
        b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getHeight() {
            return ExtendedFloatingActionButton.this.w0();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.v0();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.v0();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getWidth() {
            return ExtendedFloatingActionButton.this.w0();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        private boolean f53235b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.f f53236c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f53237d;

        c(com.google.android.material.floatingactionbutton.f fVar, j jVar) {
            this.f53236c = fVar;
            this.f53237d = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f53235b = true;
            this.f53236c.f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f53236c.i();
            if (this.f53235b) {
                return;
            }
            this.f53236c.m(this.f53237d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f53236c.onAnimationStart(animator);
            this.f53235b = false;
        }
    }

    static class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@o0 View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@o0 View view, @o0 Float f4) {
            view.getLayoutParams().width = f4.intValue();
            view.requestLayout();
        }
    }

    static class e extends Property<View, Float> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@o0 View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@o0 View view, @o0 Float f4) {
            view.getLayoutParams().height = f4.intValue();
            view.requestLayout();
        }
    }

    static class f extends Property<View, Float> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@o0 View view) {
            return Float.valueOf(x1.n0(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@o0 View view, @o0 Float f4) {
            view.setPaddingRelative(f4.intValue(), view.getPaddingTop(), x1.m0(view), view.getPaddingBottom());
        }
    }

    static class g extends Property<View, Float> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@o0 View view) {
            return Float.valueOf(x1.m0(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@o0 View view, @o0 Float f4) {
            view.setPaddingRelative(x1.n0(view), view.getPaddingTop(), f4.intValue(), view.getPaddingBottom());
        }
    }

    class h extends com.google.android.material.floatingactionbutton.b {

        /* renamed from: g, reason: collision with root package name */
        private final l f53239g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f53240h;

        h(com.google.android.material.floatingactionbutton.a aVar, l lVar, boolean z4) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f53239g = lVar;
            this.f53240h = z4;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void b() {
            ExtendedFloatingActionButton.this.L = this.f53240h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f53239g.a().width;
            layoutParams.height = this.f53239g.a().height;
            x1.n2(ExtendedFloatingActionButton.this, this.f53239g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f53239g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return this.f53240h == ExtendedFloatingActionButton.this.L || ExtendedFloatingActionButton.this.j() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int g() {
            return this.f53240h ? a.b.f90315m : a.b.f90314l;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.M = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f53239g.a().width;
            layoutParams.height = this.f53239g.a().height;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        @o0
        public AnimatorSet k() {
            com.google.android.material.animation.h a5 = a();
            String s4 = ProtectedSandApp.s("\uf1c9");
            if (a5.j(s4)) {
                PropertyValuesHolder[] g4 = a5.g(s4);
                g4[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f53239g.getWidth());
                a5.l(s4, g4);
            }
            String s5 = ProtectedSandApp.s("\uf1ca");
            if (a5.j(s5)) {
                PropertyValuesHolder[] g5 = a5.g(s5);
                g5[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f53239g.getHeight());
                a5.l(s5, g5);
            }
            String s6 = ProtectedSandApp.s("\uf1cb");
            if (a5.j(s6)) {
                PropertyValuesHolder[] g6 = a5.g(s6);
                g6[0].setFloatValues(x1.n0(ExtendedFloatingActionButton.this), this.f53239g.getPaddingStart());
                a5.l(s6, g6);
            }
            String s7 = ProtectedSandApp.s("\uf1cc");
            if (a5.j(s7)) {
                PropertyValuesHolder[] g7 = a5.g(s7);
                g7[0].setFloatValues(x1.m0(ExtendedFloatingActionButton.this), this.f53239g.getPaddingEnd());
                a5.l(s7, g7);
            }
            String s10 = ProtectedSandApp.s("\uf1cd");
            if (a5.j(s10)) {
                PropertyValuesHolder[] g10 = a5.g(s10);
                boolean z4 = this.f53240h;
                g10[0].setFloatValues(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f);
                a5.l(s10, g10);
            }
            return super.o(a5);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void m(@q0 j jVar) {
            if (jVar == null) {
                return;
            }
            if (this.f53240h) {
                jVar.a(ExtendedFloatingActionButton.this);
            } else {
                jVar.d(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.L = this.f53240h;
            ExtendedFloatingActionButton.this.M = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    class i extends com.google.android.material.floatingactionbutton.b {

        /* renamed from: g, reason: collision with root package name */
        private boolean f53242g;

        public i(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void b() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return ExtendedFloatingActionButton.this.E0();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void f() {
            super.f();
            this.f53242g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int g() {
            return a.b.f90316n;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.B = 0;
            if (this.f53242g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void m(@q0 j jVar) {
            if (jVar != null) {
                jVar.b(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f53242g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.B = 1;
        }
    }

    public static abstract class j {
        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    class k extends com.google.android.material.floatingactionbutton.b {
        public k(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void b() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return ExtendedFloatingActionButton.this.F0();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int g() {
            return a.b.f90317o;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.B = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void m(@q0 j jVar) {
            if (jVar != null) {
                jVar.c(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.B = 2;
        }
    }

    interface l {
        ViewGroup.LayoutParams a();

        int getHeight();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@o0 Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E0() {
        return getVisibility() == 0 ? this.B == 1 : this.B != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F0() {
        return getVisibility() != 0 ? this.B == 2 : this.B != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(@o0 com.google.android.material.floatingactionbutton.f fVar, @q0 j jVar) {
        if (fVar.d()) {
            return;
        }
        if (!W0()) {
            fVar.b();
            fVar.m(jVar);
            return;
        }
        measure(0, 0);
        AnimatorSet k4 = fVar.k();
        k4.addListener(new c(fVar, jVar));
        Iterator<Animator.AnimatorListener> it = fVar.l().iterator();
        while (it.hasNext()) {
            k4.addListener(it.next());
        }
        k4.start();
    }

    private void L0() {
        this.O = getTextColors();
    }

    private boolean W0() {
        return (x1.Y0(this) || (!F0() && this.N)) && !isInEditMode();
    }

    @q0
    public com.google.android.material.animation.h A0() {
        return this.D.c();
    }

    public void B0() {
        G0(this.G, null);
    }

    public void C0(@o0 j jVar) {
        G0(this.G, jVar);
    }

    public final boolean D0() {
        return this.L;
    }

    public void H0(@o0 Animator.AnimatorListener animatorListener) {
        this.E.e(animatorListener);
    }

    public void I0(@o0 Animator.AnimatorListener animatorListener) {
        this.G.e(animatorListener);
    }

    public void J0(@o0 Animator.AnimatorListener animatorListener) {
        this.F.e(animatorListener);
    }

    public void K0(@o0 Animator.AnimatorListener animatorListener) {
        this.D.e(animatorListener);
    }

    public void M0(boolean z4) {
        this.N = z4;
    }

    public void N0(@q0 com.google.android.material.animation.h hVar) {
        this.E.j(hVar);
    }

    public void O0(@androidx.annotation.b int i4) {
        N0(com.google.android.material.animation.h.d(getContext(), i4));
    }

    public void P0(boolean z4) {
        if (this.L == z4) {
            return;
        }
        com.google.android.material.floatingactionbutton.f fVar = z4 ? this.E : this.D;
        if (fVar.d()) {
            return;
        }
        fVar.b();
    }

    public void Q0(@q0 com.google.android.material.animation.h hVar) {
        this.G.j(hVar);
    }

    public void R0(@androidx.annotation.b int i4) {
        Q0(com.google.android.material.animation.h.d(getContext(), i4));
    }

    public void S0(@q0 com.google.android.material.animation.h hVar) {
        this.F.j(hVar);
    }

    public void T0(@androidx.annotation.b int i4) {
        S0(com.google.android.material.animation.h.d(getContext(), i4));
    }

    public void U0(@q0 com.google.android.material.animation.h hVar) {
        this.D.j(hVar);
    }

    public void V0(@androidx.annotation.b int i4) {
        U0(com.google.android.material.animation.h.d(getContext(), i4));
    }

    public void X0() {
        G0(this.F, null);
    }

    public void Y0(@o0 j jVar) {
        G0(this.F, jVar);
    }

    public void Z0() {
        G0(this.D, null);
    }

    public void a1(@o0 j jVar) {
        G0(this.D, jVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @o0
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> b() {
        return this.K;
    }

    protected void b1(@o0 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.L && TextUtils.isEmpty(getText()) && j() != null) {
            this.L = false;
            this.D.b();
        }
    }

    public void p0(@o0 Animator.AnimatorListener animatorListener) {
        this.E.h(animatorListener);
    }

    public void q0(@o0 Animator.AnimatorListener animatorListener) {
        this.G.h(animatorListener);
    }

    public void r0(@o0 Animator.AnimatorListener animatorListener) {
        this.F.h(animatorListener);
    }

    public void s0(@o0 Animator.AnimatorListener animatorListener) {
        this.D.h(animatorListener);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        super.setPadding(i4, i5, i6, i7);
        if (!this.L || this.M) {
            return;
        }
        this.I = x1.n0(this);
        this.J = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i4, int i5, int i6, int i7) {
        super.setPaddingRelative(i4, i5, i6, i7);
        if (!this.L || this.M) {
            return;
        }
        this.I = i4;
        this.J = i6;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i4) {
        super.setTextColor(i4);
        L0();
    }

    public void t0() {
        G0(this.E, null);
    }

    public void u0(@o0 j jVar) {
        G0(this.E, jVar);
    }

    int v0() {
        return (w0() - m()) / 2;
    }

    @m1
    int w0() {
        int i4 = this.H;
        return i4 < 0 ? (Math.min(x1.n0(this), getPaddingEnd()) * 2) + m() : i4;
    }

    @q0
    public com.google.android.material.animation.h x0() {
        return this.E.c();
    }

    @q0
    public com.google.android.material.animation.h y0() {
        return this.G.c();
    }

    @q0
    public com.google.android.material.animation.h z0() {
        return this.F.c();
    }

    public ExtendedFloatingActionButton(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.k5);
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: f, reason: collision with root package name */
        private static final boolean f53226f = false;

        /* renamed from: g, reason: collision with root package name */
        private static final boolean f53227g = true;

        /* renamed from: a, reason: collision with root package name */
        private Rect f53228a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        private j f53229b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        private j f53230c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f53231d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f53232e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f53231d = false;
            this.f53232e = true;
        }

        private static boolean K(@o0 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean R(@o0 View view, @o0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f53231d || this.f53232e) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean T(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, @o0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!R(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f53228a == null) {
                this.f53228a = new Rect();
            }
            Rect rect = this.f53228a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.l()) {
                S(extendedFloatingActionButton);
                return true;
            }
            G(extendedFloatingActionButton);
            return true;
        }

        private boolean U(@o0 View view, @o0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!R(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                S(extendedFloatingActionButton);
                return true;
            }
            G(extendedFloatingActionButton);
            return true;
        }

        protected void G(@o0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z4 = this.f53232e;
            extendedFloatingActionButton.G0(z4 ? extendedFloatingActionButton.E : extendedFloatingActionButton.F, z4 ? this.f53230c : this.f53229b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean b(@o0 CoordinatorLayout coordinatorLayout, @o0 ExtendedFloatingActionButton extendedFloatingActionButton, @o0 Rect rect) {
            return false;
        }

        public boolean I() {
            return this.f53231d;
        }

        public boolean J() {
            return this.f53232e;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean i(CoordinatorLayout coordinatorLayout, @o0 ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!K(view)) {
                return false;
            }
            U(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 ExtendedFloatingActionButton extendedFloatingActionButton, int i4) {
            List<View> z4 = coordinatorLayout.z(extendedFloatingActionButton);
            int size = z4.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = z4.get(i5);
                if (!(view instanceof AppBarLayout)) {
                    if (K(view) && U(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.T(extendedFloatingActionButton, i4);
            return true;
        }

        public void N(boolean z4) {
            this.f53231d = z4;
        }

        public void O(boolean z4) {
            this.f53232e = z4;
        }

        @m1
        void P(@q0 j jVar) {
            this.f53229b = jVar;
        }

        @m1
        void Q(@q0 j jVar) {
            this.f53230c = jVar;
        }

        protected void S(@o0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z4 = this.f53232e;
            extendedFloatingActionButton.G0(z4 ? extendedFloatingActionButton.D : extendedFloatingActionButton.G, z4 ? this.f53230c : this.f53229b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void h(@o0 CoordinatorLayout.f fVar) {
            if (fVar.f25336h == 0) {
                fVar.f25336h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@o0 Context context, @q0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.Te);
            this.f53231d = obtainStyledAttributes.getBoolean(a.o.Ue, false);
            this.f53232e = obtainStyledAttributes.getBoolean(a.o.Ve, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExtendedFloatingActionButton(@androidx.annotation.o0 android.content.Context r17, @androidx.annotation.q0 android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.P
            r1 = r17
            android.content.Context r1 = a9.a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.B = r10
            com.google.android.material.floatingactionbutton.a r1 = new com.google.android.material.floatingactionbutton.a
            r1.<init>()
            r0.C = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r11.<init>(r1)
            r0.F = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.G = r12
            r13 = 1
            r0.L = r13
            r0.M = r10
            r0.N = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.K = r1
            int[] r3 = s8.a.o.Me
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.n.j(r1, r2, r3, r4, r5, r6)
            int r2 = s8.a.o.Re
            com.google.android.material.animation.h r2 = com.google.android.material.animation.h.c(r14, r1, r2)
            int r3 = s8.a.o.Qe
            com.google.android.material.animation.h r3 = com.google.android.material.animation.h.c(r14, r1, r3)
            int r4 = s8.a.o.Pe
            com.google.android.material.animation.h r4 = com.google.android.material.animation.h.c(r14, r1, r4)
            int r5 = s8.a.o.Se
            com.google.android.material.animation.h r5 = com.google.android.material.animation.h.c(r14, r1, r5)
            int r6 = s8.a.o.Ne
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.H = r6
            int r6 = androidx.core.view.x1.n0(r16)
            r0.I = r6
            int r6 = r16.getPaddingEnd()
            r0.J = r6
            com.google.android.material.floatingactionbutton.a r6 = new com.google.android.material.floatingactionbutton.a
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.E = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.D = r10
            r11.j(r2)
            r12.j(r3)
            r15.j(r4)
            r10.j(r5)
            r1.recycle()
            com.google.android.material.shape.d r1 = com.google.android.material.shape.o.f53913m
            r2 = r18
            com.google.android.material.shape.o$b r1 = com.google.android.material.shape.o.g(r14, r2, r8, r9, r1)
            com.google.android.material.shape.o r1 = r1.m()
            r0.d(r1)
            r16.L0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public void setTextColor(@o0 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        L0();
    }
}
