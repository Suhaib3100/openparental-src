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
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;
import n1.a;

/* loaded from: classes4.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: f0, reason: collision with root package name */
    private static final int f13447f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f13448g0 = 1;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f13449h0 = 2;
    private int N;
    private final com.google.android.material.floatingactionbutton.a O;

    @o0
    private final com.google.android.material.floatingactionbutton.f P;

    @o0
    private final com.google.android.material.floatingactionbutton.f Q;
    private final com.google.android.material.floatingactionbutton.f R;
    private final com.google.android.material.floatingactionbutton.f S;
    private final int T;
    private int U;
    private int V;

    @o0
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f13454a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f13455b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f13456c0;

    /* renamed from: d0, reason: collision with root package name */
    @o0
    protected ColorStateList f13457d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final int f13446e0 = a.n.zb;

    /* renamed from: i0, reason: collision with root package name */
    static final Property<View, Float> f13450i0 = new d(Float.class, ProtectedSandApp.s("㌨"));

    /* renamed from: j0, reason: collision with root package name */
    static final Property<View, Float> f13451j0 = new e(Float.class, ProtectedSandApp.s("㌩"));

    /* renamed from: k0, reason: collision with root package name */
    static final Property<View, Float> f13452k0 = new f(Float.class, ProtectedSandApp.s("㌪"));

    /* renamed from: l0, reason: collision with root package name */
    static final Property<View, Float> f13453l0 = new g(Float.class, ProtectedSandApp.s("㌫"));

    /* loaded from: classes3.dex */
    class a implements l {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int a() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.C0() * 2)) + ExtendedFloatingActionButton.this.U + ExtendedFloatingActionButton.this.V;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int b() {
            return ExtendedFloatingActionButton.this.V;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public ViewGroup.LayoutParams c() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int d() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int e() {
            return ExtendedFloatingActionButton.this.U;
        }
    }

    /* loaded from: classes3.dex */
    class b implements l {
        b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int a() {
            return ExtendedFloatingActionButton.this.D0();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int b() {
            return ExtendedFloatingActionButton.this.C0();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public ViewGroup.LayoutParams c() {
            return new ViewGroup.LayoutParams(a(), d());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int d() {
            return ExtendedFloatingActionButton.this.D0();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int e() {
            return ExtendedFloatingActionButton.this.C0();
        }
    }

    /* loaded from: classes2.dex */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f13467a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.f f13468b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f13469c;

        c(com.google.android.material.floatingactionbutton.f fVar, j jVar) {
            this.f13468b = fVar;
            this.f13469c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13467a = true;
            this.f13468b.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13468b.i();
            if (this.f13467a) {
                return;
            }
            this.f13468b.m(this.f13469c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f13468b.onAnimationStart(animator);
            this.f13467a = false;
        }
    }

    /* loaded from: classes2.dex */
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
        public void set(@o0 View view, @o0 Float f6) {
            view.getLayoutParams().width = f6.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
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
        public void set(@o0 View view, @o0 Float f6) {
            view.getLayoutParams().height = f6.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    static class f extends Property<View, Float> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@o0 View view) {
            return Float.valueOf(y1.k0(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@o0 View view, @o0 Float f6) {
            y1.d2(view, f6.intValue(), view.getPaddingTop(), y1.j0(view), view.getPaddingBottom());
        }
    }

    /* loaded from: classes2.dex */
    static class g extends Property<View, Float> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@o0 View view) {
            return Float.valueOf(y1.j0(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@o0 View view, @o0 Float f6) {
            y1.d2(view, y1.k0(view), view.getPaddingTop(), f6.intValue(), view.getPaddingBottom());
        }
    }

    /* loaded from: classes3.dex */
    class h extends com.google.android.material.floatingactionbutton.b {

        /* renamed from: g, reason: collision with root package name */
        private final l f13471g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f13472h;

        h(com.google.android.material.floatingactionbutton.a aVar, l lVar, boolean z5) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f13471g = lVar;
            this.f13472h = z5;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int c() {
            return this.f13472h ? a.b.f29160m : a.b.f29159l;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void d() {
            ExtendedFloatingActionButton.this.f13454a0 = this.f13472h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f13471g.c().width;
            layoutParams.height = this.f13471g.c().height;
            y1.d2(ExtendedFloatingActionButton.this, this.f13471g.e(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f13471g.b(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean f() {
            return this.f13472h == ExtendedFloatingActionButton.this.f13454a0 || ExtendedFloatingActionButton.this.q() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.f13455b0 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f13471g.c().width;
            layoutParams.height = this.f13471g.c().height;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        @o0
        public AnimatorSet k() {
            com.google.android.material.animation.h b6 = b();
            String s5 = ProtectedSandApp.s("⛪");
            if (b6.j(s5)) {
                PropertyValuesHolder[] g5 = b6.g(s5);
                g5[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f13471g.a());
                b6.l(s5, g5);
            }
            String s6 = ProtectedSandApp.s("⛫");
            if (b6.j(s6)) {
                PropertyValuesHolder[] g6 = b6.g(s6);
                g6[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f13471g.d());
                b6.l(s6, g6);
            }
            String s7 = ProtectedSandApp.s("⛬");
            if (b6.j(s7)) {
                PropertyValuesHolder[] g7 = b6.g(s7);
                g7[0].setFloatValues(y1.k0(ExtendedFloatingActionButton.this), this.f13471g.e());
                b6.l(s7, g7);
            }
            String s8 = ProtectedSandApp.s("⛭");
            if (b6.j(s8)) {
                PropertyValuesHolder[] g8 = b6.g(s8);
                g8[0].setFloatValues(y1.j0(ExtendedFloatingActionButton.this), this.f13471g.b());
                b6.l(s8, g8);
            }
            String s9 = ProtectedSandApp.s("⛮");
            if (b6.j(s9)) {
                PropertyValuesHolder[] g9 = b6.g(s9);
                boolean z5 = this.f13472h;
                g9[0].setFloatValues(z5 ? 0.0f : 1.0f, z5 ? 1.0f : 0.0f);
                b6.l(s9, g9);
            }
            return super.o(b6);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void m(@q0 j jVar) {
            if (jVar == null) {
                return;
            }
            if (this.f13472h) {
                jVar.a(ExtendedFloatingActionButton.this);
            } else {
                jVar.d(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f13454a0 = this.f13472h;
            ExtendedFloatingActionButton.this.f13455b0 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* loaded from: classes3.dex */
    class i extends com.google.android.material.floatingactionbutton.b {

        /* renamed from: g, reason: collision with root package name */
        private boolean f13474g;

        public i(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            this.f13474g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int c() {
            return a.b.f29161n;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void d() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean f() {
            return ExtendedFloatingActionButton.this.L0();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.N = 0;
            if (this.f13474g) {
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
            this.f13474g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.N = 1;
        }
    }

    /* loaded from: classes2.dex */
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

    /* loaded from: classes3.dex */
    class k extends com.google.android.material.floatingactionbutton.b {
        public k(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int c() {
            return a.b.f29162o;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void d() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean f() {
            return ExtendedFloatingActionButton.this.M0();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.N = 0;
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
            ExtendedFloatingActionButton.this.N = 2;
        }
    }

    /* loaded from: classes2.dex */
    interface l {
        int a();

        int b();

        ViewGroup.LayoutParams c();

        int d();

        int e();
    }

    public ExtendedFloatingActionButton(@o0 Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L0() {
        return getVisibility() == 0 ? this.N == 1 : this.N != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M0() {
        return getVisibility() != 0 ? this.N == 2 : this.N != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(@o0 com.google.android.material.floatingactionbutton.f fVar, @q0 j jVar) {
        if (fVar.f()) {
            return;
        }
        if (!d1()) {
            fVar.d();
            fVar.m(jVar);
            return;
        }
        measure(0, 0);
        AnimatorSet k5 = fVar.k();
        k5.addListener(new c(fVar, jVar));
        Iterator<Animator.AnimatorListener> it = fVar.l().iterator();
        while (it.hasNext()) {
            k5.addListener(it.next());
        }
        k5.start();
    }

    private void S0() {
        this.f13457d0 = getTextColors();
    }

    private boolean d1() {
        return (y1.U0(this) || (!M0() && this.f13456c0)) && !isInEditMode();
    }

    public void A0() {
        N0(this.Q, null);
    }

    public void B0(@o0 j jVar) {
        N0(this.Q, jVar);
    }

    int C0() {
        return (D0() - t()) / 2;
    }

    @m1
    int D0() {
        int i5 = this.T;
        return i5 < 0 ? (Math.min(y1.k0(this), y1.j0(this)) * 2) + t() : i5;
    }

    @q0
    public com.google.android.material.animation.h E0() {
        return this.Q.e();
    }

    @q0
    public com.google.android.material.animation.h F0() {
        return this.S.e();
    }

    @q0
    public com.google.android.material.animation.h G0() {
        return this.R.e();
    }

    @q0
    public com.google.android.material.animation.h H0() {
        return this.P.e();
    }

    public void I0() {
        N0(this.S, null);
    }

    public void J0(@o0 j jVar) {
        N0(this.S, jVar);
    }

    public final boolean K0() {
        return this.f13454a0;
    }

    public void O0(@o0 Animator.AnimatorListener animatorListener) {
        this.Q.g(animatorListener);
    }

    public void P0(@o0 Animator.AnimatorListener animatorListener) {
        this.S.g(animatorListener);
    }

    public void Q0(@o0 Animator.AnimatorListener animatorListener) {
        this.R.g(animatorListener);
    }

    public void R0(@o0 Animator.AnimatorListener animatorListener) {
        this.P.g(animatorListener);
    }

    public void T0(boolean z5) {
        this.f13456c0 = z5;
    }

    public void U0(@q0 com.google.android.material.animation.h hVar) {
        this.Q.j(hVar);
    }

    public void V0(@androidx.annotation.b int i5) {
        U0(com.google.android.material.animation.h.d(getContext(), i5));
    }

    public void W0(boolean z5) {
        if (this.f13454a0 == z5) {
            return;
        }
        com.google.android.material.floatingactionbutton.f fVar = z5 ? this.Q : this.P;
        if (fVar.f()) {
            return;
        }
        fVar.d();
    }

    public void X0(@q0 com.google.android.material.animation.h hVar) {
        this.S.j(hVar);
    }

    public void Y0(@androidx.annotation.b int i5) {
        X0(com.google.android.material.animation.h.d(getContext(), i5));
    }

    public void Z0(@q0 com.google.android.material.animation.h hVar) {
        this.R.j(hVar);
    }

    public void a1(@androidx.annotation.b int i5) {
        Z0(com.google.android.material.animation.h.d(getContext(), i5));
    }

    public void b1(@q0 com.google.android.material.animation.h hVar) {
        this.P.j(hVar);
    }

    public void c1(@androidx.annotation.b int i5) {
        b1(com.google.android.material.animation.h.d(getContext(), i5));
    }

    public void e1() {
        N0(this.R, null);
    }

    public void f1(@o0 j jVar) {
        N0(this.R, jVar);
    }

    public void g1() {
        N0(this.P, null);
    }

    public void h1(@o0 j jVar) {
        N0(this.P, jVar);
    }

    protected void i1(@o0 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @o0
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> k() {
        return this.W;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13454a0 && TextUtils.isEmpty(getText()) && q() != null) {
            this.f13454a0 = false;
            this.P.d();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i5, int i6, int i7, int i8) {
        super.setPadding(i5, i6, i7, i8);
        if (!this.f13454a0 || this.f13455b0) {
            return;
        }
        this.U = y1.k0(this);
        this.V = y1.j0(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i5, int i6, int i7, int i8) {
        super.setPaddingRelative(i5, i6, i7, i8);
        if (!this.f13454a0 || this.f13455b0) {
            return;
        }
        this.U = i5;
        this.V = i7;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i5) {
        super.setTextColor(i5);
        S0();
    }

    public void w0(@o0 Animator.AnimatorListener animatorListener) {
        this.Q.h(animatorListener);
    }

    public void x0(@o0 Animator.AnimatorListener animatorListener) {
        this.S.h(animatorListener);
    }

    public void y0(@o0 Animator.AnimatorListener animatorListener) {
        this.R.h(animatorListener);
    }

    public void z0(@o0 Animator.AnimatorListener animatorListener) {
        this.P.h(animatorListener);
    }

    public ExtendedFloatingActionButton(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.l5);
    }

    /* loaded from: classes3.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: f, reason: collision with root package name */
        private static final boolean f13458f = false;

        /* renamed from: g, reason: collision with root package name */
        private static final boolean f13459g = true;

        /* renamed from: a, reason: collision with root package name */
        private Rect f13460a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        private j f13461b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        private j f13462c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f13463d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f13464e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f13463d = false;
            this.f13464e = f13459g;
        }

        private static boolean K(@o0 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean R(@o0 View view, @o0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f13463d || this.f13464e) && fVar.e() == view.getId()) {
                return f13459g;
            }
            return false;
        }

        private boolean T(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, @o0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!R(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f13460a == null) {
                this.f13460a = new Rect();
            }
            Rect rect = this.f13460a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.l()) {
                S(extendedFloatingActionButton);
                return f13459g;
            }
            G(extendedFloatingActionButton);
            return f13459g;
        }

        private boolean U(@o0 View view, @o0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!R(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                S(extendedFloatingActionButton);
                return f13459g;
            }
            G(extendedFloatingActionButton);
            return f13459g;
        }

        protected void G(@o0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z5 = this.f13464e;
            extendedFloatingActionButton.N0(z5 ? extendedFloatingActionButton.Q : extendedFloatingActionButton.R, z5 ? this.f13462c : this.f13461b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean b(@o0 CoordinatorLayout coordinatorLayout, @o0 ExtendedFloatingActionButton extendedFloatingActionButton, @o0 Rect rect) {
            return false;
        }

        public boolean I() {
            return this.f13463d;
        }

        public boolean J() {
            return this.f13464e;
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
        public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 ExtendedFloatingActionButton extendedFloatingActionButton, int i5) {
            List<View> C = coordinatorLayout.C(extendedFloatingActionButton);
            int size = C.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = C.get(i6);
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
            coordinatorLayout.W(extendedFloatingActionButton, i5);
            return f13459g;
        }

        public void N(boolean z5) {
            this.f13463d = z5;
        }

        public void O(boolean z5) {
            this.f13464e = z5;
        }

        @m1
        void P(@q0 j jVar) {
            this.f13461b = jVar;
        }

        @m1
        void Q(@q0 j jVar) {
            this.f13462c = jVar;
        }

        protected void S(@o0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z5 = this.f13464e;
            extendedFloatingActionButton.N0(z5 ? extendedFloatingActionButton.P : extendedFloatingActionButton.S, z5 ? this.f13462c : this.f13461b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void h(@o0 CoordinatorLayout.f fVar) {
            if (fVar.f3934h == 0) {
                fVar.f3934h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@o0 Context context, @q0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.Ud);
            this.f13463d = obtainStyledAttributes.getBoolean(a.o.Vd, false);
            this.f13464e = obtainStyledAttributes.getBoolean(a.o.Wd, f13459g);
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
            int r9 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f13446e0
            r1 = r17
            android.content.Context r1 = v1.a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.N = r10
            com.google.android.material.floatingactionbutton.a r1 = new com.google.android.material.floatingactionbutton.a
            r1.<init>()
            r0.O = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r11.<init>(r1)
            r0.R = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.S = r12
            r13 = 1
            r0.f13454a0 = r13
            r0.f13455b0 = r10
            r0.f13456c0 = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.W = r1
            int[] r3 = n1.a.o.Nd
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.n.j(r1, r2, r3, r4, r5, r6)
            int r2 = n1.a.o.Sd
            com.google.android.material.animation.h r2 = com.google.android.material.animation.h.c(r14, r1, r2)
            int r3 = n1.a.o.Rd
            com.google.android.material.animation.h r3 = com.google.android.material.animation.h.c(r14, r1, r3)
            int r4 = n1.a.o.Qd
            com.google.android.material.animation.h r4 = com.google.android.material.animation.h.c(r14, r1, r4)
            int r5 = n1.a.o.Td
            com.google.android.material.animation.h r5 = com.google.android.material.animation.h.c(r14, r1, r5)
            int r6 = n1.a.o.Od
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.T = r6
            int r6 = androidx.core.view.y1.k0(r16)
            r0.U = r6
            int r6 = androidx.core.view.y1.j0(r16)
            r0.V = r6
            com.google.android.material.floatingactionbutton.a r6 = new com.google.android.material.floatingactionbutton.a
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.Q = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.P = r10
            r11.j(r2)
            r12.j(r3)
            r15.j(r4)
            r10.j(r5)
            r1.recycle()
            com.google.android.material.shape.d r1 = com.google.android.material.shape.o.f14040m
            r2 = r18
            com.google.android.material.shape.o$b r1 = com.google.android.material.shape.o.g(r14, r2, r8, r9, r1)
            com.google.android.material.shape.o r1 = r1.m()
            r0.g(r1)
            r16.S0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public void setTextColor(@o0 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        S0();
    }
}
