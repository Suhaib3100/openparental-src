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
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.annotation.x0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.d1;
import androidx.core.view.j3;
import androidx.core.view.x1;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import s8.a;

/* loaded from: classes6.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int E = a.n.f91465va;
    private static final int F = 600;
    public static final int G = 0;
    public static final int H = 1;
    private int A;
    private boolean B;
    private int C;
    private boolean D;

    /* renamed from: b, reason: collision with root package name */
    private boolean f52553b;

    /* renamed from: c, reason: collision with root package name */
    private int f52554c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private ViewGroup f52555d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private View f52556e;

    /* renamed from: f, reason: collision with root package name */
    private View f52557f;

    /* renamed from: g, reason: collision with root package name */
    private int f52558g;

    /* renamed from: h, reason: collision with root package name */
    private int f52559h;

    /* renamed from: i, reason: collision with root package name */
    private int f52560i;

    /* renamed from: j, reason: collision with root package name */
    private int f52561j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f52562k;

    /* renamed from: l, reason: collision with root package name */
    @o0
    final com.google.android.material.internal.a f52563l;

    /* renamed from: m, reason: collision with root package name */
    @o0
    final x8.a f52564m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f52565n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f52566o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private Drawable f52567p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    Drawable f52568q;

    /* renamed from: r, reason: collision with root package name */
    private int f52569r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f52570s;

    /* renamed from: t, reason: collision with root package name */
    private ValueAnimator f52571t;

    /* renamed from: u, reason: collision with root package name */
    private long f52572u;

    /* renamed from: v, reason: collision with root package name */
    private int f52573v;

    /* renamed from: w, reason: collision with root package name */
    private AppBarLayout.d f52574w;

    /* renamed from: x, reason: collision with root package name */
    int f52575x;

    /* renamed from: y, reason: collision with root package name */
    private int f52576y;

    /* renamed from: z, reason: collision with root package name */
    @q0
    j3 f52577z;

    class a implements d1 {
        a() {
        }

        @Override // androidx.core.view.d1
        public j3 a(View view, @o0 j3 j3Var) {
            return CollapsingToolbarLayout.this.L(j3Var);
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

    private class c implements AppBarLayout.d {
        c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.d, com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i4) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f52575x = i4;
            j3 j3Var = collapsingToolbarLayout.f52577z;
            int r4 = j3Var != null ? j3Var.r() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                com.google.android.material.appbar.b D = CollapsingToolbarLayout.D(childAt);
                int i6 = layoutParams.f52582a;
                if (i6 == 1) {
                    D.k(e1.a.e(-i4, 0, CollapsingToolbarLayout.this.v(childAt)));
                } else if (i6 == 2) {
                    D.k(Math.round((-i4) * layoutParams.f52583b));
                }
            }
            CollapsingToolbarLayout.this.B0();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f52568q != null && r4 > 0) {
                x1.t1(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - x1.h0(CollapsingToolbarLayout.this)) - r4;
            float f4 = height;
            CollapsingToolbarLayout.this.f52563l.w0(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.y()) / f4));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f52563l.k0(collapsingToolbarLayout3.f52575x + height);
            CollapsingToolbarLayout.this.f52563l.u0(Math.abs(i4) / f4);
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
        if (!this.f52565n && (view = this.f52557f) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f52557f);
            }
        }
        if (!this.f52565n || this.f52555d == null) {
            return;
        }
        if (this.f52557f == null) {
            this.f52557f = new View(getContext());
        }
        if (this.f52557f.getParent() == null) {
            this.f52555d.addView(this.f52557f, -1, -1);
        }
    }

    private static CharSequence C(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).U();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    private void C0(int i4, int i5, int i6, int i7, boolean z4) {
        View view;
        if (!this.f52565n || (view = this.f52557f) == null) {
            return;
        }
        boolean z5 = x1.R0(view) && this.f52557f.getVisibility() == 0;
        this.f52566o = z5;
        if (z5 || z4) {
            boolean z6 = getLayoutDirection() == 1;
            w0(z6);
            this.f52563l.l0(z6 ? this.f52560i : this.f52558g, this.f52562k.top + this.f52559h, (i6 - i4) - (z6 ? this.f52558g : this.f52560i), (i7 - i5) - this.f52561j);
            this.f52563l.Z(z4);
        }
    }

    @o0
    static com.google.android.material.appbar.b D(@o0 View view) {
        int i4 = a.h.S5;
        com.google.android.material.appbar.b bVar = (com.google.android.material.appbar.b) view.getTag(i4);
        if (bVar != null) {
            return bVar;
        }
        com.google.android.material.appbar.b bVar2 = new com.google.android.material.appbar.b(view);
        view.setTag(i4, bVar2);
        return bVar2;
    }

    private void D0() {
        if (this.f52555d != null && this.f52565n && TextUtils.isEmpty(this.f52563l.N())) {
            t0(C(this.f52555d));
        }
    }

    private boolean H() {
        return this.f52576y == 1;
    }

    private static boolean J(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean K(View view) {
        View view2 = this.f52556e;
        if (view2 == null || view2 == this) {
            if (view != this.f52555d) {
                return false;
            }
        } else if (view != view2) {
            return false;
        }
        return true;
    }

    private void a(int i4) {
        c();
        ValueAnimator valueAnimator = this.f52571t;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f52571t = valueAnimator2;
            valueAnimator2.setDuration(this.f52572u);
            this.f52571t.setInterpolator(i4 > this.f52569r ? com.google.android.material.animation.a.f52468c : com.google.android.material.animation.a.f52469d);
            this.f52571t.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.f52571t.cancel();
        }
        this.f52571t.setIntValues(this.f52569r, i4);
        this.f52571t.start();
    }

    private void b(AppBarLayout appBarLayout) {
        if (H()) {
            appBarLayout.G(false);
        }
    }

    private void c() {
        if (this.f52553b) {
            ViewGroup viewGroup = null;
            this.f52555d = null;
            this.f52556e = null;
            int i4 = this.f52554c;
            if (i4 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i4);
                this.f52555d = viewGroup2;
                if (viewGroup2 != null) {
                    this.f52556e = d(viewGroup2);
                }
            }
            if (this.f52555d == null) {
                int childCount = getChildCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i5);
                    if (J(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i5++;
                }
                this.f52555d = viewGroup;
            }
            A0();
            this.f52553b = false;
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

    private void w0(boolean z4) {
        int i4;
        int i5;
        int i6;
        int i7;
        View view = this.f52556e;
        if (view == null) {
            view = this.f52555d;
        }
        int v4 = v(view);
        com.google.android.material.internal.c.a(this, this.f52557f, this.f52562k);
        ViewGroup viewGroup = this.f52555d;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i4 = toolbar.X();
            i6 = toolbar.W();
            i7 = toolbar.Y();
            i5 = toolbar.V();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i4 = toolbar2.getTitleMarginStart();
            i6 = toolbar2.getTitleMarginEnd();
            i7 = toolbar2.getTitleMarginTop();
            i5 = toolbar2.getTitleMarginBottom();
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        com.google.android.material.internal.a aVar = this.f52563l;
        Rect rect = this.f52562k;
        int i10 = rect.left + (z4 ? i6 : i4);
        int i11 = rect.top + v4 + i7;
        int i12 = rect.right;
        if (!z4) {
            i4 = i6;
        }
        aVar.b0(i10, i11, i12 - i4, (rect.bottom + v4) - i5);
    }

    private void x0() {
        setContentDescription(A());
    }

    private void y0(@o0 Drawable drawable, int i4, int i5) {
        z0(drawable, this.f52555d, i4, i5);
    }

    private void z0(@o0 Drawable drawable, @q0 View view, int i4, int i5) {
        if (H() && view != null && this.f52565n) {
            i5 = view.getBottom();
        }
        drawable.setBounds(0, 0, i4, i5);
    }

    @q0
    public CharSequence A() {
        if (this.f52565n) {
            return this.f52563l.N();
        }
        return null;
    }

    public int B() {
        return this.f52576y;
    }

    final void B0() {
        if (this.f52567p == null && this.f52568q == null) {
            return;
        }
        o0(getHeight() + this.f52575x < y());
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean E() {
        return this.D;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean F() {
        return this.B;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean G() {
        return this.f52563l.T();
    }

    public boolean I() {
        return this.f52565n;
    }

    j3 L(@o0 j3 j3Var) {
        j3 j3Var2 = x1.W(this) ? j3Var : null;
        if (!Objects.equals(this.f52577z, j3Var2)) {
            this.f52577z = j3Var2;
            requestLayout();
        }
        return j3Var.c();
    }

    public void M(int i4) {
        this.f52563l.g0(i4);
    }

    public void N(@h1 int i4) {
        this.f52563l.d0(i4);
    }

    public void O(@l int i4) {
        P(ColorStateList.valueOf(i4));
    }

    public void P(@o0 ColorStateList colorStateList) {
        this.f52563l.f0(colorStateList);
    }

    public void Q(@q0 Typeface typeface) {
        this.f52563l.i0(typeface);
    }

    public void R(@q0 Drawable drawable) {
        Drawable drawable2 = this.f52567p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f52567p = mutate;
            if (mutate != null) {
                y0(mutate, getWidth(), getHeight());
                this.f52567p.setCallback(this);
                this.f52567p.setAlpha(this.f52569r);
            }
            x1.t1(this);
        }
    }

    public void S(@l int i4) {
        R(new ColorDrawable(i4));
    }

    public void T(@v int i4) {
        R(androidx.core.content.d.getDrawable(getContext(), i4));
    }

    public void U(@l int i4) {
        c0(ColorStateList.valueOf(i4));
    }

    public void V(int i4) {
        this.f52563l.q0(i4);
    }

    public void W(int i4, int i5, int i6, int i7) {
        this.f52558g = i4;
        this.f52559h = i5;
        this.f52560i = i6;
        this.f52561j = i7;
        requestLayout();
    }

    public void X(int i4) {
        this.f52561j = i4;
        requestLayout();
    }

    public void Y(int i4) {
        this.f52560i = i4;
        requestLayout();
    }

    public void Z(int i4) {
        this.f52558g = i4;
        requestLayout();
    }

    public void a0(int i4) {
        this.f52559h = i4;
        requestLayout();
    }

    public void b0(@h1 int i4) {
        this.f52563l.n0(i4);
    }

    public void c0(@o0 ColorStateList colorStateList) {
        this.f52563l.p0(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void d0(@q0 Typeface typeface) {
        this.f52563l.s0(typeface);
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        c();
        if (this.f52555d == null && (drawable = this.f52567p) != null && this.f52569r > 0) {
            drawable.mutate().setAlpha(this.f52569r);
            this.f52567p.draw(canvas);
        }
        if (this.f52565n && this.f52566o) {
            if (this.f52555d == null || this.f52567p == null || this.f52569r <= 0 || !H() || this.f52563l.G() >= this.f52563l.H()) {
                this.f52563l.m(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f52567p.getBounds(), Region.Op.DIFFERENCE);
                this.f52563l.m(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f52568q == null || this.f52569r <= 0) {
            return;
        }
        j3 j3Var = this.f52577z;
        int r4 = j3Var != null ? j3Var.r() : 0;
        if (r4 > 0) {
            this.f52568q.setBounds(0, -this.f52575x, getWidth(), r4 - this.f52575x);
            this.f52568q.mutate().setAlpha(this.f52569r);
            this.f52568q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        boolean z4;
        if (this.f52567p == null || this.f52569r <= 0 || !K(view)) {
            z4 = false;
        } else {
            z0(this.f52567p, view, getWidth(), getHeight());
            this.f52567p.mutate().setAlpha(this.f52569r);
            this.f52567p.draw(canvas);
            z4 = true;
        }
        return super.drawChild(canvas, view, j4) || z4;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f52568q;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f52567p;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.f52563l;
        if (aVar != null) {
            state |= aVar.E0(drawableState);
        }
        if (state) {
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
    public void e0(boolean z4) {
        this.D = z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void f0(boolean z4) {
        this.B = z4;
    }

    public int g() {
        return this.f52563l.r();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public void g0(int i4) {
        this.f52563l.x0(i4);
    }

    @o0
    public Typeface h() {
        return this.f52563l.w();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public void h0(float f4) {
        this.f52563l.z0(f4);
    }

    @q0
    public Drawable i() {
        return this.f52567p;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public void i0(@x(from = 0.0d) float f4) {
        this.f52563l.A0(f4);
    }

    public int j() {
        return this.f52563l.C();
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void j0(int i4) {
        this.f52563l.B0(i4);
    }

    public int k() {
        return this.f52561j;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void k0(boolean z4) {
        this.f52563l.D0(z4);
    }

    public int l() {
        return this.f52560i;
    }

    void l0(int i4) {
        ViewGroup viewGroup;
        if (i4 != this.f52569r) {
            if (this.f52567p != null && (viewGroup = this.f52555d) != null) {
                x1.t1(viewGroup);
            }
            this.f52569r = i4;
            x1.t1(this);
        }
    }

    public int m() {
        return this.f52558g;
    }

    public void m0(@g0(from = 0) long j4) {
        this.f52572u = j4;
    }

    public int n() {
        return this.f52559h;
    }

    public void n0(@g0(from = 0) int i4) {
        if (this.f52573v != i4) {
            this.f52573v = i4;
            B0();
        }
    }

    @o0
    public Typeface o() {
        return this.f52563l.F();
    }

    public void o0(boolean z4) {
        p0(z4, x1.Y0(this) && !isInEditMode());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            b(appBarLayout);
            setFitsSystemWindows(x1.W(appBarLayout));
            if (this.f52574w == null) {
                this.f52574w = new c();
            }
            appBarLayout.c(this.f52574w);
            x1.B1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.d dVar = this.f52574w;
        if (dVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).B(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        j3 j3Var = this.f52577z;
        if (j3Var != null) {
            int r4 = j3Var.r();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (!x1.W(childAt) && childAt.getTop() < r4) {
                    childAt.offsetTopAndBottom(r4);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            D(getChildAt(i11)).h();
        }
        C0(i4, i5, i6, i7, false);
        D0();
        B0();
        int childCount3 = getChildCount();
        for (int i12 = 0; i12 < childCount3; i12++) {
            D(getChildAt(i12)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        c();
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        j3 j3Var = this.f52577z;
        int r4 = j3Var != null ? j3Var.r() : 0;
        if ((mode == 0 || this.B) && r4 > 0) {
            this.A = r4;
            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + r4, 1073741824));
        }
        if (this.D && this.f52563l.M() > 1) {
            D0();
            C0(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int J = this.f52563l.J();
            if (J > 1) {
                this.C = (J - 1) * Math.round(this.f52563l.B());
                super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.C, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f52555d;
        if (viewGroup != null) {
            View view = this.f52556e;
            if (view == null || view == this) {
                setMinimumHeight(p(viewGroup));
            } else {
                setMinimumHeight(p(view));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        Drawable drawable = this.f52567p;
        if (drawable != null) {
            y0(drawable, i4, i5);
        }
    }

    public void p0(boolean z4, boolean z5) {
        if (this.f52570s != z4) {
            if (z5) {
                a(z4 ? 255 : 0);
            } else {
                l0(z4 ? 255 : 0);
            }
            this.f52570s = z4;
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public int q() {
        return this.f52563l.I();
    }

    public void q0(@q0 Drawable drawable) {
        Drawable drawable2 = this.f52568q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f52568q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f52568q.setState(getDrawableState());
                }
                this.f52568q.setLayoutDirection(x1.c0(this));
                this.f52568q.setVisible(getVisibility() == 0, false);
                this.f52568q.setCallback(this);
                this.f52568q.setAlpha(this.f52569r);
            }
            x1.t1(this);
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public int r() {
        return this.f52563l.J();
    }

    public void r0(@l int i4) {
        q0(new ColorDrawable(i4));
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public float s() {
        return this.f52563l.K();
    }

    public void s0(@v int i4) {
        q0(androidx.core.content.d.getDrawable(getContext(), i4));
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f52568q;
        if (drawable != null && drawable.isVisible() != z4) {
            this.f52568q.setVisible(z4, false);
        }
        Drawable drawable2 = this.f52567p;
        if (drawable2 == null || drawable2.isVisible() == z4) {
            return;
        }
        this.f52567p.setVisible(z4, false);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public float t() {
        return this.f52563l.L();
    }

    public void t0(@q0 CharSequence charSequence) {
        this.f52563l.F0(charSequence);
        x0();
    }

    @c1({c1.a.LIBRARY_GROUP})
    public int u() {
        return this.f52563l.M();
    }

    public void u0(int i4) {
        this.f52576y = i4;
        boolean H2 = H();
        this.f52563l.v0(H2);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            b((AppBarLayout) parent);
        }
        if (H2 && this.f52567p == null) {
            S(this.f52564m.g(getResources().getDimension(a.f.O0)));
        }
    }

    final int v(@o0 View view) {
        return ((getHeight() - D(view).c()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public void v0(boolean z4) {
        if (z4 != this.f52565n) {
            this.f52565n = z4;
            x0();
            A0();
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@o0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f52567p || drawable == this.f52568q;
    }

    int w() {
        return this.f52569r;
    }

    public long x() {
        return this.f52572u;
    }

    public int y() {
        int i4 = this.f52573v;
        if (i4 >= 0) {
            return i4 + this.A + this.C;
        }
        j3 j3Var = this.f52577z;
        int r4 = j3Var != null ? j3Var.r() : 0;
        int h02 = x1.h0(this);
        return h02 > 0 ? Math.min((h02 * 2) + r4, getHeight()) : getHeight() / 3;
    }

    @q0
    public Drawable z() {
        return this.f52568q;
    }

    public CollapsingToolbarLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f90590u2);
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
        private static final float f52578c = 0.5f;

        /* renamed from: d, reason: collision with root package name */
        public static final int f52579d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f52580e = 1;

        /* renamed from: f, reason: collision with root package name */
        public static final int f52581f = 2;

        /* renamed from: a, reason: collision with root package name */
        int f52582a;

        /* renamed from: b, reason: collision with root package name */
        float f52583b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f52582a = 0;
            this.f52583b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.P6);
            this.f52582a = obtainStyledAttributes.getInt(a.o.Q6, 0);
            d(obtainStyledAttributes.getFloat(a.o.R6, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.f52582a;
        }

        public float b() {
            return this.f52583b;
        }

        public void c(int i4) {
            this.f52582a = i4;
        }

        public void d(float f4) {
            this.f52583b = f4;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f52582a = 0;
            this.f52583b = 0.5f;
        }

        public LayoutParams(int i4, int i5, int i6) {
            super(i4, i5, i6);
            this.f52582a = 0;
            this.f52583b = 0.5f;
        }

        public LayoutParams(@o0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52582a = 0;
            this.f52583b = 0.5f;
        }

        public LayoutParams(@o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f52582a = 0;
            this.f52583b = 0.5f;
        }

        @x0(19)
        public LayoutParams(@o0 FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52582a = 0;
            this.f52583b = 0.5f;
        }
    }
}
