package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.annotation.x0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.util.l;
import androidx.core.view.o1;
import androidx.core.view.v4;
import androidx.core.view.y1;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import n1.a;

/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int R = a.n.va;
    private static final int S = 600;
    public static final int T = 0;
    public static final int U = 1;
    private boolean A;
    private boolean B;

    @q0
    private Drawable C;

    @q0
    Drawable D;
    private int E;
    private boolean F;
    private ValueAnimator G;
    private long H;
    private int I;
    private AppBarLayout.d J;
    int K;
    private int L;

    @q0
    v4 M;
    private int N;
    private boolean O;
    private int P;
    private boolean Q;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12853o;

    /* renamed from: p, reason: collision with root package name */
    private int f12854p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private ViewGroup f12855q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private View f12856r;

    /* renamed from: s, reason: collision with root package name */
    private View f12857s;

    /* renamed from: t, reason: collision with root package name */
    private int f12858t;

    /* renamed from: u, reason: collision with root package name */
    private int f12859u;

    /* renamed from: v, reason: collision with root package name */
    private int f12860v;

    /* renamed from: w, reason: collision with root package name */
    private int f12861w;

    /* renamed from: x, reason: collision with root package name */
    private final Rect f12862x;

    /* renamed from: y, reason: collision with root package name */
    @o0
    final com.google.android.material.internal.a f12863y;

    /* renamed from: z, reason: collision with root package name */
    @o0
    final s1.a f12864z;

    /* loaded from: classes3.dex */
    class a implements o1 {
        a() {
        }

        @Override // androidx.core.view.o1
        public v4 a(View view, @o0 v4 v4Var) {
            return CollapsingToolbarLayout.this.L(v4Var);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.l0(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* loaded from: classes3.dex */
    private class c implements AppBarLayout.d {
        c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.d, com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i5) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.K = i5;
            v4 v4Var = collapsingToolbarLayout.M;
            int r5 = v4Var != null ? v4Var.r() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i6);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                com.google.android.material.appbar.a D = CollapsingToolbarLayout.D(childAt);
                int i7 = layoutParams.f12869a;
                if (i7 == 1) {
                    D.k(o.a.e(-i5, 0, CollapsingToolbarLayout.this.v(childAt)));
                } else if (i7 == 2) {
                    D.k(Math.round((-i5) * layoutParams.f12870b));
                }
            }
            CollapsingToolbarLayout.this.B0();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.D != null && r5 > 0) {
                y1.n1(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - y1.e0(CollapsingToolbarLayout.this)) - r5;
            float f6 = height;
            CollapsingToolbarLayout.this.f12863y.w0(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.y()) / f6));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f12863y.k0(collapsingToolbarLayout3.K + height);
            CollapsingToolbarLayout.this.f12863y.u0(Math.abs(i5) / f6);
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public CollapsingToolbarLayout(@o0 Context context) {
        this(context, null);
    }

    private void A0() {
        View view;
        if (!this.A && (view = this.f12857s) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f12857s);
            }
        }
        if (!this.A || this.f12855q == null) {
            return;
        }
        if (this.f12857s == null) {
            this.f12857s = new View(getContext());
        }
        if (this.f12857s.getParent() == null) {
            this.f12855q.addView(this.f12857s, -1, -1);
        }
    }

    private static CharSequence C(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).S();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    private void C0(int i5, int i6, int i7, int i8, boolean z5) {
        View view;
        if (!this.A || (view = this.f12857s) == null) {
            return;
        }
        boolean z6 = y1.O0(view) && this.f12857s.getVisibility() == 0;
        this.B = z6;
        if (z6 || z5) {
            boolean z7 = y1.Z(this) == 1;
            w0(z7);
            this.f12863y.l0(z7 ? this.f12860v : this.f12858t, this.f12862x.top + this.f12859u, (i7 - i5) - (z7 ? this.f12858t : this.f12860v), (i8 - i6) - this.f12861w);
            this.f12863y.Z(z5);
        }
    }

    @o0
    static com.google.android.material.appbar.a D(@o0 View view) {
        int i5 = a.h.S5;
        com.google.android.material.appbar.a aVar = (com.google.android.material.appbar.a) view.getTag(i5);
        if (aVar != null) {
            return aVar;
        }
        com.google.android.material.appbar.a aVar2 = new com.google.android.material.appbar.a(view);
        view.setTag(i5, aVar2);
        return aVar2;
    }

    private void D0() {
        if (this.f12855q != null && this.A && TextUtils.isEmpty(this.f12863y.N())) {
            t0(C(this.f12855q));
        }
    }

    private boolean H() {
        return this.L == 1;
    }

    private static boolean J(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean K(View view) {
        View view2 = this.f12856r;
        if (view2 == null || view2 == this) {
            if (view == this.f12855q) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private void a(int i5) {
        c();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.G = valueAnimator2;
            valueAnimator2.setDuration(this.H);
            this.G.setInterpolator(i5 > this.E ? com.google.android.material.animation.a.f12780c : com.google.android.material.animation.a.f12781d);
            this.G.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.G.cancel();
        }
        this.G.setIntValues(this.E, i5);
        this.G.start();
    }

    private void b(AppBarLayout appBarLayout) {
        if (H()) {
            appBarLayout.G(false);
        }
    }

    private void c() {
        if (this.f12853o) {
            ViewGroup viewGroup = null;
            this.f12855q = null;
            this.f12856r = null;
            int i5 = this.f12854p;
            if (i5 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i5);
                this.f12855q = viewGroup2;
                if (viewGroup2 != null) {
                    this.f12856r = d(viewGroup2);
                }
            }
            if (this.f12855q == null) {
                int childCount = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i6);
                    if (J(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i6++;
                }
                this.f12855q = viewGroup;
            }
            A0();
            this.f12853o = false;
        }
    }

    @o0
    private View d(@o0 View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private static int p(@o0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private void w0(boolean z5) {
        int i5;
        int i6;
        int i7;
        int i8;
        View view = this.f12856r;
        if (view == null) {
            view = this.f12855q;
        }
        int v5 = v(view);
        com.google.android.material.internal.c.a(this, this.f12857s, this.f12862x);
        ViewGroup viewGroup = this.f12855q;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i5 = toolbar.V();
            i7 = toolbar.U();
            i8 = toolbar.W();
            i6 = toolbar.T();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i5 = toolbar2.getTitleMarginStart();
            i7 = toolbar2.getTitleMarginEnd();
            i8 = toolbar2.getTitleMarginTop();
            i6 = toolbar2.getTitleMarginBottom();
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        com.google.android.material.internal.a aVar = this.f12863y;
        Rect rect = this.f12862x;
        int i9 = rect.left + (z5 ? i7 : i5);
        int i10 = rect.top + v5 + i8;
        int i11 = rect.right;
        if (!z5) {
            i5 = i7;
        }
        aVar.b0(i9, i10, i11 - i5, (rect.bottom + v5) - i6);
    }

    private void x0() {
        setContentDescription(A());
    }

    private void y0(@o0 Drawable drawable, int i5, int i6) {
        z0(drawable, this.f12855q, i5, i6);
    }

    private void z0(@o0 Drawable drawable, @q0 View view, int i5, int i6) {
        if (H() && view != null && this.A) {
            i6 = view.getBottom();
        }
        drawable.setBounds(0, 0, i5, i6);
    }

    @q0
    public CharSequence A() {
        if (this.A) {
            return this.f12863y.N();
        }
        return null;
    }

    public int B() {
        return this.L;
    }

    final void B0() {
        if (this.C == null && this.D == null) {
            return;
        }
        o0(getHeight() + this.K < y());
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean E() {
        return this.Q;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean F() {
        return this.O;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean G() {
        return this.f12863y.T();
    }

    public boolean I() {
        return this.A;
    }

    v4 L(@o0 v4 v4Var) {
        v4 v4Var2 = y1.U(this) ? v4Var : null;
        if (!l.a(this.M, v4Var2)) {
            this.M = v4Var2;
            requestLayout();
        }
        return v4Var.c();
    }

    public void M(int i5) {
        this.f12863y.g0(i5);
    }

    public void N(@h1 int i5) {
        this.f12863y.d0(i5);
    }

    public void O(@androidx.annotation.l int i5) {
        P(ColorStateList.valueOf(i5));
    }

    public void P(@o0 ColorStateList colorStateList) {
        this.f12863y.f0(colorStateList);
    }

    public void Q(@q0 Typeface typeface) {
        this.f12863y.i0(typeface);
    }

    public void R(@q0 Drawable drawable) {
        Drawable drawable2 = this.C;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.C = mutate;
            if (mutate != null) {
                y0(mutate, getWidth(), getHeight());
                this.C.setCallback(this);
                this.C.setAlpha(this.E);
            }
            y1.n1(this);
        }
    }

    public void S(@androidx.annotation.l int i5) {
        R(new ColorDrawable(i5));
    }

    public void T(@v int i5) {
        R(androidx.core.content.d.i(getContext(), i5));
    }

    public void U(@androidx.annotation.l int i5) {
        c0(ColorStateList.valueOf(i5));
    }

    public void V(int i5) {
        this.f12863y.q0(i5);
    }

    public void W(int i5, int i6, int i7, int i8) {
        this.f12858t = i5;
        this.f12859u = i6;
        this.f12860v = i7;
        this.f12861w = i8;
        requestLayout();
    }

    public void X(int i5) {
        this.f12861w = i5;
        requestLayout();
    }

    public void Y(int i5) {
        this.f12860v = i5;
        requestLayout();
    }

    public void Z(int i5) {
        this.f12858t = i5;
        requestLayout();
    }

    public void a0(int i5) {
        this.f12859u = i5;
        requestLayout();
    }

    public void b0(@h1 int i5) {
        this.f12863y.n0(i5);
    }

    public void c0(@o0 ColorStateList colorStateList) {
        this.f12863y.p0(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void d0(@q0 Typeface typeface) {
        this.f12863y.s0(typeface);
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        c();
        if (this.f12855q == null && (drawable = this.C) != null && this.E > 0) {
            drawable.mutate().setAlpha(this.E);
            this.C.draw(canvas);
        }
        if (this.A && this.B) {
            if (this.f12855q == null || this.C == null || this.E <= 0 || !H() || this.f12863y.G() >= this.f12863y.H()) {
                this.f12863y.m(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.C.getBounds(), Region.Op.DIFFERENCE);
                this.f12863y.m(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.D == null || this.E <= 0) {
            return;
        }
        v4 v4Var = this.M;
        int r5 = v4Var != null ? v4Var.r() : 0;
        if (r5 > 0) {
            this.D.setBounds(0, -this.K, getWidth(), r5 - this.K);
            this.D.mutate().setAlpha(this.E);
            this.D.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j5) {
        boolean z5;
        if (this.C == null || this.E <= 0 || !K(view)) {
            z5 = false;
        } else {
            z0(this.C, view, getWidth(), getHeight());
            this.C.mutate().setAlpha(this.E);
            this.C.draw(canvas);
            z5 = true;
        }
        return super.drawChild(canvas, view, j5) || z5;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.D;
        boolean z5 = false;
        if (drawable != null && drawable.isStateful()) {
            z5 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.C;
        if (drawable2 != null && drawable2.isStateful()) {
            z5 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.f12863y;
        if (aVar != null) {
            z5 |= aVar.E0(drawableState);
        }
        if (z5) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void e0(boolean z5) {
        this.Q = z5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void f0(boolean z5) {
        this.O = z5;
    }

    public int g() {
        return this.f12863y.r();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public void g0(int i5) {
        this.f12863y.x0(i5);
    }

    @o0
    public Typeface h() {
        return this.f12863y.w();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public void h0(float f6) {
        this.f12863y.z0(f6);
    }

    @q0
    public Drawable i() {
        return this.C;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public void i0(@x(from = 0.0d) float f6) {
        this.f12863y.A0(f6);
    }

    public int j() {
        return this.f12863y.C();
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void j0(int i5) {
        this.f12863y.B0(i5);
    }

    public int k() {
        return this.f12861w;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void k0(boolean z5) {
        this.f12863y.D0(z5);
    }

    public int l() {
        return this.f12860v;
    }

    void l0(int i5) {
        ViewGroup viewGroup;
        if (i5 != this.E) {
            if (this.C != null && (viewGroup = this.f12855q) != null) {
                y1.n1(viewGroup);
            }
            this.E = i5;
            y1.n1(this);
        }
    }

    public int m() {
        return this.f12858t;
    }

    public void m0(@g0(from = 0) long j5) {
        this.H = j5;
    }

    public int n() {
        return this.f12859u;
    }

    public void n0(@g0(from = 0) int i5) {
        if (this.I != i5) {
            this.I = i5;
            B0();
        }
    }

    @o0
    public Typeface o() {
        return this.f12863y.F();
    }

    public void o0(boolean z5) {
        p0(z5, y1.U0(this) && !isInEditMode());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            b(appBarLayout);
            setFitsSystemWindows(y1.U(appBarLayout));
            if (this.J == null) {
                this.J = new c();
            }
            appBarLayout.b(this.J);
            y1.v1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.d dVar = this.J;
        if (dVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).B(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        v4 v4Var = this.M;
        if (v4Var != null) {
            int r5 = v4Var.r();
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (!y1.U(childAt) && childAt.getTop() < r5) {
                    childAt.offsetTopAndBottom(r5);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            D(getChildAt(i10)).h();
        }
        C0(i5, i6, i7, i8, false);
        D0();
        B0();
        int childCount3 = getChildCount();
        for (int i11 = 0; i11 < childCount3; i11++) {
            D(getChildAt(i11)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        c();
        super.onMeasure(i5, i6);
        int mode = View.MeasureSpec.getMode(i6);
        v4 v4Var = this.M;
        int r5 = v4Var != null ? v4Var.r() : 0;
        if ((mode == 0 || this.O) && r5 > 0) {
            this.N = r5;
            super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + r5, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
        }
        if (this.Q && this.f12863y.M() > 1) {
            D0();
            C0(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int J = this.f12863y.J();
            if (J > 1) {
                this.P = (J - 1) * Math.round(this.f12863y.B());
                super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.P, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
            }
        }
        ViewGroup viewGroup = this.f12855q;
        if (viewGroup != null) {
            View view = this.f12856r;
            if (view == null || view == this) {
                setMinimumHeight(p(viewGroup));
            } else {
                setMinimumHeight(p(view));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        Drawable drawable = this.C;
        if (drawable != null) {
            y0(drawable, i5, i6);
        }
    }

    public void p0(boolean z5, boolean z6) {
        if (this.F != z5) {
            if (z6) {
                a(z5 ? 255 : 0);
            } else {
                l0(z5 ? 255 : 0);
            }
            this.F = z5;
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public int q() {
        return this.f12863y.I();
    }

    public void q0(@q0 Drawable drawable) {
        Drawable drawable2 = this.D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.D = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.D.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.d.m(this.D, y1.Z(this));
                this.D.setVisible(getVisibility() == 0, false);
                this.D.setCallback(this);
                this.D.setAlpha(this.E);
            }
            y1.n1(this);
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public int r() {
        return this.f12863y.J();
    }

    public void r0(@androidx.annotation.l int i5) {
        q0(new ColorDrawable(i5));
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public float s() {
        return this.f12863y.K();
    }

    public void s0(@v int i5) {
        q0(androidx.core.content.d.i(getContext(), i5));
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z5 = i5 == 0;
        Drawable drawable = this.D;
        if (drawable != null && drawable.isVisible() != z5) {
            this.D.setVisible(z5, false);
        }
        Drawable drawable2 = this.C;
        if (drawable2 == null || drawable2.isVisible() == z5) {
            return;
        }
        this.C.setVisible(z5, false);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public float t() {
        return this.f12863y.L();
    }

    public void t0(@q0 CharSequence charSequence) {
        this.f12863y.F0(charSequence);
        x0();
    }

    @c1({c1.a.LIBRARY_GROUP})
    public int u() {
        return this.f12863y.M();
    }

    public void u0(int i5) {
        this.L = i5;
        boolean H = H();
        this.f12863y.v0(H);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            b((AppBarLayout) parent);
        }
        if (H && this.C == null) {
            S(this.f12864z.g(getResources().getDimension(a.f.O0)));
        }
    }

    final int v(@o0 View view) {
        return ((getHeight() - D(view).c()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public void v0(boolean z5) {
        if (z5 != this.A) {
            this.A = z5;
            x0();
            A0();
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@o0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.C || drawable == this.D;
    }

    int w() {
        return this.E;
    }

    public long x() {
        return this.H;
    }

    public int y() {
        int i5 = this.I;
        if (i5 >= 0) {
            return i5 + this.N + this.P;
        }
        v4 v4Var = this.M;
        int r5 = v4Var != null ? v4Var.r() : 0;
        int e02 = y1.e0(this);
        return e02 > 0 ? Math.min((e02 * 2) + r5, getHeight()) : getHeight() / 3;
    }

    @q0
    public Drawable z() {
        return this.D;
    }

    public CollapsingToolbarLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f29304v2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollapsingToolbarLayout(@androidx.annotation.o0 android.content.Context r10, @androidx.annotation.q0 android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: c, reason: collision with root package name */
        private static final float f12865c = 0.5f;

        /* renamed from: d, reason: collision with root package name */
        public static final int f12866d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f12867e = 1;

        /* renamed from: f, reason: collision with root package name */
        public static final int f12868f = 2;

        /* renamed from: a, reason: collision with root package name */
        int f12869a;

        /* renamed from: b, reason: collision with root package name */
        float f12870b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12869a = 0;
            this.f12870b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.O6);
            this.f12869a = obtainStyledAttributes.getInt(a.o.P6, 0);
            d(obtainStyledAttributes.getFloat(a.o.Q6, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.f12869a;
        }

        public float b() {
            return this.f12870b;
        }

        public void c(int i5) {
            this.f12869a = i5;
        }

        public void d(float f6) {
            this.f12870b = f6;
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.f12869a = 0;
            this.f12870b = 0.5f;
        }

        public LayoutParams(int i5, int i6, int i7) {
            super(i5, i6, i7);
            this.f12869a = 0;
            this.f12870b = 0.5f;
        }

        public LayoutParams(@o0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12869a = 0;
            this.f12870b = 0.5f;
        }

        public LayoutParams(@o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12869a = 0;
            this.f12870b = 0.5f;
        }

        @x0(19)
        public LayoutParams(@o0 FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12869a = 0;
            this.f12870b = 0.5f;
        }
    }
}
