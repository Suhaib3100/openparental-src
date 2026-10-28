package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.l;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.x0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.h0;
import androidx.core.view.accessibility.o0;
import androidx.core.view.d1;
import androidx.core.view.j3;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import s8.a;

/* loaded from: classes6.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: s, reason: collision with root package name */
    static final int f52490s = 0;

    /* renamed from: t, reason: collision with root package name */
    static final int f52491t = 1;

    /* renamed from: u, reason: collision with root package name */
    static final int f52492u = 2;

    /* renamed from: v, reason: collision with root package name */
    static final int f52493v = 4;

    /* renamed from: w, reason: collision with root package name */
    static final int f52494w = 8;

    /* renamed from: x, reason: collision with root package name */
    private static final int f52495x = a.n.f91438sa;

    /* renamed from: y, reason: collision with root package name */
    private static final int f52496y = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f52497b;

    /* renamed from: c, reason: collision with root package name */
    private int f52498c;

    /* renamed from: d, reason: collision with root package name */
    private int f52499d;

    /* renamed from: e, reason: collision with root package name */
    private int f52500e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f52501f;

    /* renamed from: g, reason: collision with root package name */
    private int f52502g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private j3 f52503h;

    /* renamed from: i, reason: collision with root package name */
    private List<c> f52504i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f52505j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f52506k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f52507l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f52508m;

    /* renamed from: n, reason: collision with root package name */
    @d0
    private int f52509n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private WeakReference<View> f52510o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private ValueAnimator f52511p;

    /* renamed from: q, reason: collision with root package name */
    private int[] f52512q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private Drawable f52513r;

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class a extends BaseBehavior.d<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int G() {
            return super.G();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int H() {
            return super.H();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean I() {
            return super.I();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean J() {
            return super.J();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void L(boolean z4) {
            super.L(z4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean M(int i4) {
            return super.M(i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean N(int i4) {
            return super.N(i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void O(boolean z4) {
            super.O(z4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, int i4) {
            return super.m(coordinatorLayout, appBarLayout, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean n(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, int i4, int i5, int i6, int i7) {
            return super.n(coordinatorLayout, appBarLayout, i4, i5, i6, i7);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void r(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, View view, int i4, int i5, int[] iArr, int i6) {
            super.r(coordinatorLayout, appBarLayout, view, i4, i5, iArr, i6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: s0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, View view, int i4, int i5, int i6, int i7, int i10, int[] iArr) {
            super.u(coordinatorLayout, appBarLayout, view, i4, i5, i6, i7, i10, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ void y(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, Parcelable parcelable) {
            super.y(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ Parcelable z(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout) {
            return super.z(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ boolean B(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, @o0 View view, View view2, int i4, int i5) {
            return super.B(coordinatorLayout, appBarLayout, view, view2, i4, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: w0 */
        public /* bridge */ /* synthetic */ void D(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, View view, int i4) {
            super.D(coordinatorLayout, appBarLayout, view, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void x0(@q0 BaseBehavior.d dVar) {
            super.x0(dVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        private static int Z(@o0 AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior f4 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f4 instanceof BaseBehavior) {
                return ((BaseBehavior) f4).U();
            }
            return 0;
        }

        private void a0(@o0 View view, @o0 View view2) {
            CoordinatorLayout.Behavior f4 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f4 instanceof BaseBehavior) {
                x1.j1(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f4).f52516l) + U()) - Q(view2));
            }
        }

        private void b0(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.w()) {
                    appBarLayout.L(appBarLayout.R(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int G() {
            return super.G();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int H() {
            return super.H();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean I() {
            return super.I();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean J() {
            return super.J();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void L(boolean z4) {
            super.L(z4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean M(int i4) {
            return super.M(i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean N(int i4) {
            return super.N(i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void O(boolean z4) {
            super.O(z4);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        float R(View view) {
            int i4;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int q4 = appBarLayout.q();
                int i5 = appBarLayout.i();
                int Z = Z(appBarLayout);
                if ((i5 == 0 || q4 + Z > i5) && (i4 = q4 - i5) != 0) {
                    return (Z / i4) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        int T(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).q() : view.getMeasuredHeight();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @q0
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public AppBarLayout P(@o0 List<View> list) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = list.get(i4);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean i(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 View view2) {
            a0(view, view2);
            b0(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void j(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 View view2) {
            if (view2 instanceof AppBarLayout) {
                x1.x1(coordinatorLayout, h0.a.f27018r.b());
                x1.x1(coordinatorLayout, h0.a.f27019s.b());
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i4) {
            return super.m(coordinatorLayout, view, i4);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean n(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i4, int i5, int i6, int i7) {
            return super.n(coordinatorLayout, view, i4, i5, i6, i7);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean x(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 Rect rect, boolean z4) {
            AppBarLayout P = P(coordinatorLayout.z(view));
            if (P != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f52598d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    P.E(false, !z4);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.up);
            W(obtainStyledAttributes.getDimensionPixelSize(a.o.vp, 0));
            obtainStyledAttributes.recycle();
        }
    }

    class a implements d1 {
        a() {
        }

        @Override // androidx.core.view.d1
        public j3 a(View view, j3 j3Var) {
            return AppBarLayout.this.z(j3Var);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f52551b;

        b(j jVar) {
            this.f52551b = jVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            this.f52551b.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface c<T extends AppBarLayout> {
        void a(T t4, int i4);
    }

    public interface d extends c<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.c
        void a(AppBarLayout appBarLayout, int i4);
    }

    public AppBarLayout(@o0 Context context) {
        this(context, null);
    }

    private void F(boolean z4, boolean z5, boolean z6) {
        this.f52502g = (z4 ? 1 : 2) | (z5 ? 4 : 0) | (z6 ? 8 : 0);
        requestLayout();
    }

    private boolean J(boolean z4) {
        if (this.f52506k == z4) {
            return false;
        }
        this.f52506k = z4;
        refreshDrawableState();
        return true;
    }

    private boolean Q() {
        return this.f52513r != null && p() > 0;
    }

    private boolean S() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || x1.W(childAt)) ? false : true;
    }

    private void T(@o0 j jVar, boolean z4) {
        float dimension = getResources().getDimension(a.f.O0);
        float f4 = z4 ? 0.0f : dimension;
        if (!z4) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f52511p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, dimension);
        this.f52511p = ofFloat;
        ofFloat.setDuration(getResources().getInteger(a.i.f91114c));
        this.f52511p.setInterpolator(com.google.android.material.animation.a.f52466a);
        this.f52511p.addUpdateListener(new b(jVar));
        this.f52511p.start();
    }

    private void U() {
        setWillNotDraw(!Q());
    }

    private void d() {
        WeakReference<View> weakReference = this.f52510o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f52510o = null;
    }

    @q0
    private View e(@q0 View view) {
        int i4;
        if (this.f52510o == null && (i4 = this.f52509n) != -1) {
            View findViewById = view != null ? view.findViewById(i4) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f52509n);
            }
            if (findViewById != null) {
                this.f52510o = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f52510o;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean t() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (((LayoutParams) getChildAt(i4).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void v() {
        this.f52498c = -1;
        this.f52499d = -1;
        this.f52500e = -1;
    }

    public void A(@q0 c cVar) {
        List<c> list = this.f52504i;
        if (list == null || cVar == null) {
            return;
        }
        list.remove(cVar);
    }

    public void B(d dVar) {
        A(dVar);
    }

    void C() {
        this.f52502g = 0;
    }

    public void D(boolean z4) {
        E(z4, x1.Y0(this));
    }

    public void E(boolean z4, boolean z5) {
        F(z4, z5, true);
    }

    public void G(boolean z4) {
        this.f52508m = z4;
    }

    public void H(@d0 int i4) {
        this.f52509n = i4;
        d();
    }

    public boolean I(boolean z4) {
        this.f52505j = true;
        return J(z4);
    }

    public boolean K(boolean z4) {
        return L(z4);
    }

    boolean L(boolean z4) {
        if (this.f52507l == z4) {
            return false;
        }
        this.f52507l = z4;
        refreshDrawableState();
        if (!this.f52508m || !(getBackground() instanceof j)) {
            return true;
        }
        T((j) getBackground(), z4);
        return true;
    }

    public void M(@q0 Drawable drawable) {
        Drawable drawable2 = this.f52513r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f52513r = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f52513r.setState(getDrawableState());
                }
                this.f52513r.setLayoutDirection(x1.c0(this));
                this.f52513r.setVisible(getVisibility() == 0, false);
                this.f52513r.setCallback(this);
            }
            U();
            x1.t1(this);
        }
    }

    public void N(@l int i4) {
        M(new ColorDrawable(i4));
    }

    public void O(@v int i4) {
        M(e.a.b(getContext(), i4));
    }

    @Deprecated
    public void P(float f4) {
        com.google.android.material.appbar.c.b(this, f4);
    }

    boolean R(@q0 View view) {
        View e4 = e(view);
        if (e4 != null) {
            view = e4;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void a(@q0 c cVar) {
        if (this.f52504i == null) {
            this.f52504i = new ArrayList();
        }
        if (cVar == null || this.f52504i.contains(cVar)) {
            return;
        }
        this.f52504i.add(cVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @o0
    public CoordinatorLayout.Behavior<AppBarLayout> b() {
        return new Behavior();
    }

    public void c(d dVar) {
        a(dVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        super.draw(canvas);
        if (Q()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f52497b);
            this.f52513r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f52513r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    int i() {
        int i4;
        int h02;
        int i5 = this.f52499d;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i7 = layoutParams.f52548a;
            if ((i7 & 5) != 5) {
                if (i6 > 0) {
                    break;
                }
            } else {
                int i10 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if ((i7 & 8) != 0) {
                    h02 = x1.h0(childAt);
                } else if ((i7 & 2) != 0) {
                    h02 = measuredHeight - x1.h0(childAt);
                } else {
                    i4 = i10 + measuredHeight;
                    if (childCount == 0 && x1.W(childAt)) {
                        i4 = Math.min(i4, measuredHeight - p());
                    }
                    i6 += i4;
                }
                i4 = h02 + i10;
                if (childCount == 0) {
                    i4 = Math.min(i4, measuredHeight - p());
                }
                i6 += i4;
            }
        }
        int max = Math.max(0, i6);
        this.f52499d = max;
        return max;
    }

    int j() {
        int i4 = this.f52500e;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
            int i7 = layoutParams.f52548a;
            if ((i7 & 1) == 0) {
                break;
            }
            i6 += measuredHeight;
            if ((i7 & 2) != 0) {
                i6 -= x1.h0(childAt);
                break;
            }
            i5++;
        }
        int max = Math.max(0, i6);
        this.f52500e = max;
        return max;
    }

    @d0
    public int k() {
        return this.f52509n;
    }

    public final int l() {
        int p4 = p();
        int h02 = x1.h0(this);
        if (h02 == 0) {
            int childCount = getChildCount();
            h02 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (h02 == 0) {
                return getHeight() / 3;
            }
        }
        return (h02 * 2) + p4;
    }

    int m() {
        return this.f52502g;
    }

    @q0
    public Drawable n() {
        return this.f52513r;
    }

    @Deprecated
    public float o() {
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        if (this.f52512q == null) {
            this.f52512q = new int[4];
        }
        int[] iArr = this.f52512q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + iArr.length);
        boolean z4 = this.f52506k;
        int i5 = a.c.f90387ed;
        if (!z4) {
            i5 = -i5;
        }
        iArr[0] = i5;
        iArr[1] = (z4 && this.f52507l) ? a.c.f90400fd : -a.c.f90400fd;
        int i6 = a.c.f90360cd;
        if (!z4) {
            i6 = -i6;
        }
        iArr[2] = i6;
        iArr[3] = (z4 && this.f52507l) ? a.c.f90346bd : -a.c.f90346bd;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        boolean z5 = true;
        if (x1.W(this) && S()) {
            int p4 = p();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(p4);
            }
        }
        v();
        this.f52501f = false;
        int childCount2 = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i10).getLayoutParams()).b() != null) {
                this.f52501f = true;
                break;
            }
            i10++;
        }
        Drawable drawable = this.f52513r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), p());
        }
        if (this.f52505j) {
            return;
        }
        if (!this.f52508m && !t()) {
            z5 = false;
        }
        J(z5);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        if (mode != 1073741824 && x1.W(this) && S()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = e1.a.e(getMeasuredHeight() + p(), 0, View.MeasureSpec.getSize(i5));
            } else if (mode == 0) {
                measuredHeight += p();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        v();
    }

    @m1
    final int p() {
        j3 j3Var = this.f52503h;
        if (j3Var != null) {
            return j3Var.r();
        }
        return 0;
    }

    public final int q() {
        int i4 = this.f52498c;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i7 = layoutParams.f52548a;
            if ((i7 & 1) == 0) {
                break;
            }
            int i10 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i6;
            if (i5 == 0 && x1.W(childAt)) {
                i10 -= p();
            }
            i6 = i10;
            if ((i7 & 2) != 0) {
                i6 -= x1.h0(childAt);
                break;
            }
            i5++;
        }
        int max = Math.max(0, i6);
        this.f52498c = max;
        return max;
    }

    int r() {
        return q();
    }

    boolean s() {
        return this.f52501f;
    }

    @Override // android.view.View
    @x0(21)
    public void setElevation(float f4) {
        super.setElevation(f4);
        k.d(this, f4);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i4) {
        if (i4 != 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf14b"));
        }
        super.setOrientation(i4);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f52513r;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
    }

    boolean u() {
        return q() != 0;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@o0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f52513r;
    }

    public boolean w() {
        return this.f52508m;
    }

    public boolean x() {
        return this.f52507l;
    }

    void y(int i4) {
        this.f52497b = i4;
        if (!willNotDraw()) {
            x1.t1(this);
        }
        List<c> list = this.f52504i;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                c cVar = this.f52504i.get(i5);
                if (cVar != null) {
                    cVar.a(this, i4);
                }
            }
        }
    }

    j3 z(j3 j3Var) {
        j3 j3Var2 = x1.W(this) ? j3Var : null;
        if (!Objects.equals(this.f52503h, j3Var2)) {
            this.f52503h = j3Var2;
            U();
            requestLayout();
        }
        return j3Var;
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: t, reason: collision with root package name */
        private static final int f52514t = 600;

        /* renamed from: u, reason: collision with root package name */
        private static final int f52515u = -1;

        /* renamed from: l, reason: collision with root package name */
        private int f52516l;

        /* renamed from: m, reason: collision with root package name */
        private int f52517m;

        /* renamed from: n, reason: collision with root package name */
        private ValueAnimator f52518n;

        /* renamed from: o, reason: collision with root package name */
        private int f52519o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f52520p;

        /* renamed from: q, reason: collision with root package name */
        private float f52521q;

        /* renamed from: r, reason: collision with root package name */
        @q0
        private WeakReference<View> f52522r;

        /* renamed from: s, reason: collision with root package name */
        private d f52523s;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f52527b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f52528c;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f52527b = coordinatorLayout;
                this.f52528c = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
                BaseBehavior.this.X(this.f52527b, this.f52528c, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b implements androidx.core.view.accessibility.o0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f52530a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f52531b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f52532c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f52533d;

            b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4) {
                this.f52530a = coordinatorLayout;
                this.f52531b = appBarLayout;
                this.f52532c = view;
                this.f52533d = i4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.o0
            public boolean a(@o0 View view, @q0 o0.a aVar) {
                BaseBehavior.this.r(this.f52530a, this.f52531b, this.f52532c, 0, this.f52533d, new int[]{0, 0}, 1);
                return true;
            }
        }

        class c implements androidx.core.view.accessibility.o0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f52535a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f52536b;

            c(AppBarLayout appBarLayout, boolean z4) {
                this.f52535a = appBarLayout;
                this.f52536b = z4;
            }

            @Override // androidx.core.view.accessibility.o0
            public boolean a(@androidx.annotation.o0 View view, @q0 o0.a aVar) {
                this.f52535a.D(this.f52536b);
                return true;
            }
        }

        public static abstract class d<T extends AppBarLayout> {
            public abstract boolean a(@androidx.annotation.o0 T t4);
        }

        public BaseBehavior() {
            this.f52519o = -1;
        }

        private void A0(CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4) {
            int U = U();
            int j02 = j0(t4, U);
            if (j02 >= 0) {
                View childAt = t4.getChildAt(j02);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int a5 = layoutParams.a();
                if ((a5 & 17) == 17) {
                    int i4 = -childAt.getTop();
                    int i5 = -childAt.getBottom();
                    if (j02 == t4.getChildCount() - 1) {
                        i5 += t4.p();
                    }
                    if (g0(a5, 2)) {
                        i5 += x1.h0(childAt);
                    } else if (g0(a5, 5)) {
                        int h02 = x1.h0(childAt) + i5;
                        if (U < h02) {
                            i4 = h02;
                        } else {
                            i5 = h02;
                        }
                    }
                    if (g0(a5, 32)) {
                        i4 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    if (U < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    c0(coordinatorLayout, t4, e1.a.e(i4, -t4.q(), 0), 0.0f);
                }
            }
        }

        private void B0(CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4) {
            x1.x1(coordinatorLayout, h0.a.f27018r.b());
            x1.x1(coordinatorLayout, h0.a.f27019s.b());
            View h02 = h0(coordinatorLayout);
            if (h02 == null || t4.q() == 0 || !(((CoordinatorLayout.f) h02.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                return;
            }
            a0(coordinatorLayout, t4, h02);
        }

        private void C0(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, int i4, int i5, boolean z4) {
            View i02 = i0(t4, i4);
            if (i02 != null) {
                int a5 = ((LayoutParams) i02.getLayoutParams()).a();
                boolean z5 = false;
                if ((a5 & 1) != 0) {
                    int h02 = x1.h0(i02);
                    if (i5 <= 0 || (a5 & 12) == 0 ? !((a5 & 2) == 0 || (-i4) < (i02.getBottom() - h02) - t4.p()) : (-i4) >= (i02.getBottom() - h02) - t4.p()) {
                        z5 = true;
                    }
                }
                if (t4.w()) {
                    z5 = t4.R(h0(coordinatorLayout));
                }
                boolean L = t4.L(z5);
                if (z4 || (L && z0(coordinatorLayout, t4))) {
                    t4.jumpDrawablesToCurrentState();
                }
            }
        }

        private void a0(CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, @androidx.annotation.o0 View view) {
            if (U() != (-t4.q()) && view.canScrollVertically(1)) {
                b0(coordinatorLayout, t4, h0.a.f27018r, false);
            }
            if (U() != 0) {
                if (!view.canScrollVertically(-1)) {
                    b0(coordinatorLayout, t4, h0.a.f27019s, true);
                    return;
                }
                int i4 = -t4.i();
                if (i4 != 0) {
                    x1.A1(coordinatorLayout, h0.a.f27019s, null, new b(coordinatorLayout, t4, view, i4));
                }
            }
        }

        private void b0(CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, @androidx.annotation.o0 h0.a aVar, boolean z4) {
            x1.A1(coordinatorLayout, aVar, null, new c(t4, z4));
        }

        private void c0(CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, int i4, float f4) {
            int abs = Math.abs(U() - i4);
            float abs2 = Math.abs(f4);
            d0(coordinatorLayout, t4, i4, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t4.getHeight()) + 1.0f) * 150.0f));
        }

        private void d0(CoordinatorLayout coordinatorLayout, T t4, int i4, int i5) {
            int U = U();
            if (U == i4) {
                ValueAnimator valueAnimator = this.f52518n;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f52518n.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f52518n;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f52518n = valueAnimator3;
                valueAnimator3.setInterpolator(com.google.android.material.animation.a.f52470e);
                this.f52518n.addUpdateListener(new a(coordinatorLayout, t4));
            } else {
                valueAnimator2.cancel();
            }
            this.f52518n.setDuration(Math.min(i5, 600));
            this.f52518n.setIntValues(U, i4);
            this.f52518n.start();
        }

        private boolean f0(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, @androidx.annotation.o0 View view) {
            return t4.u() && coordinatorLayout.getHeight() - view.getHeight() <= t4.getHeight();
        }

        private static boolean g0(int i4, int i5) {
            return (i4 & i5) == i5;
        }

        @q0
        private View h0(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if ((childAt instanceof androidx.core.view.x0) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @q0
        private static View i0(@androidx.annotation.o0 AppBarLayout appBarLayout, int i4) {
            int abs = Math.abs(i4);
            int childCount = appBarLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = appBarLayout.getChildAt(i5);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int j0(@androidx.annotation.o0 T t4, int i4) {
            int childCount = t4.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = t4.getChildAt(i5);
                int top2 = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (g0(layoutParams.a(), 32)) {
                    top2 -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i6 = -i4;
                if (top2 <= i6 && bottom >= i6) {
                    return i5;
                }
            }
            return -1;
        }

        private int m0(@androidx.annotation.o0 T t4, int i4) {
            int abs = Math.abs(i4);
            int childCount = t4.getChildCount();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    break;
                }
                View childAt = t4.getChildAt(i6);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator b5 = layoutParams.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i6++;
                } else if (b5 != null) {
                    int a5 = layoutParams.a();
                    if ((a5 & 1) != 0) {
                        i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((a5 & 2) != 0) {
                            i5 -= x1.h0(childAt);
                        }
                    }
                    if (x1.W(childAt)) {
                        i5 -= t4.p();
                    }
                    if (i5 > 0) {
                        float f4 = i5;
                        return (childAt.getTop() + Math.round(b5.getInterpolation((abs - childAt.getTop()) / f4) * f4)) * Integer.signum(i4);
                    }
                }
            }
            return i4;
        }

        private boolean z0(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4) {
            List<View> B = coordinatorLayout.B(t4);
            int size = B.size();
            for (int i4 = 0; i4 < size; i4++) {
                CoordinatorLayout.Behavior f4 = ((CoordinatorLayout.f) B.get(i4).getLayoutParams()).f();
                if (f4 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f4).S() != 0;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        int U() {
            return H() + this.f52516l;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public boolean P(T t4) {
            d dVar = this.f52523s;
            if (dVar != null) {
                return dVar.a(t4);
            }
            WeakReference<View> weakReference = this.f52522r;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int S(@androidx.annotation.o0 T t4) {
            return -t4.j();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int T(@androidx.annotation.o0 T t4) {
            return t4.q();
        }

        @m1
        boolean n0() {
            ValueAnimator valueAnimator = this.f52518n;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public void V(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4) {
            A0(coordinatorLayout, t4);
            if (t4.w()) {
                t4.L(t4.R(h0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean m(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, int i4) {
            boolean m4 = super.m(coordinatorLayout, t4, i4);
            int m5 = t4.m();
            int i5 = this.f52519o;
            if (i5 >= 0 && (m5 & 8) == 0) {
                View childAt = t4.getChildAt(i5);
                X(coordinatorLayout, t4, (this.f52520p ? x1.h0(childAt) + t4.p() : Math.round(childAt.getHeight() * this.f52521q)) + (-childAt.getBottom()));
            } else if (m5 != 0) {
                boolean z4 = (m5 & 4) != 0;
                if ((m5 & 2) != 0) {
                    int i6 = -t4.r();
                    if (z4) {
                        c0(coordinatorLayout, t4, i6, 0.0f);
                    } else {
                        X(coordinatorLayout, t4, i6);
                    }
                } else if ((m5 & 1) != 0) {
                    if (z4) {
                        c0(coordinatorLayout, t4, 0, 0.0f);
                    } else {
                        X(coordinatorLayout, t4, 0);
                    }
                }
            }
            t4.C();
            this.f52519o = -1;
            N(e1.a.e(H(), -t4.q(), 0));
            C0(coordinatorLayout, t4, H(), 0, true);
            t4.y(H());
            B0(coordinatorLayout, t4);
            return m4;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        public boolean n(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, int i4, int i5, int i6, int i7) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t4.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.U(t4, i4, i5, View.MeasureSpec.makeMeasureSpec(0, 0), i7);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void r(CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, View view, int i4, int i5, int[] iArr, int i6) {
            int i7;
            int i10;
            if (i5 != 0) {
                if (i5 < 0) {
                    i7 = -t4.q();
                    i10 = t4.i() + i7;
                } else {
                    i7 = -t4.r();
                    i10 = 0;
                }
                int i11 = i7;
                int i12 = i10;
                if (i11 != i12) {
                    iArr[1] = W(coordinatorLayout, t4, i5, i11, i12);
                }
            }
            if (t4.w()) {
                t4.L(t4.R(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void u(CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, View view, int i4, int i5, int i6, int i7, int i10, int[] iArr) {
            if (i7 < 0) {
                iArr[1] = W(coordinatorLayout, t4, i7, -t4.j(), 0);
            }
            if (i7 == 0) {
                B0(coordinatorLayout, t4);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public void y(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                this.f52519o = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            savedState.a();
            this.f52519o = savedState.f52524d;
            this.f52521q = savedState.f52525e;
            this.f52520p = savedState.f52526f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public Parcelable z(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int H = H();
            int childCount = t4.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = t4.getChildAt(i4);
                int bottom = childAt.getBottom() + H;
                if (childAt.getTop() + H <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.f52524d = i4;
                    savedState.f52526f = bottom == x1.h0(childAt) + t4.p();
                    savedState.f52525e = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return absSavedState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public boolean B(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, @androidx.annotation.o0 View view, View view2, int i4, int i5) {
            ValueAnimator valueAnimator;
            boolean z4 = (i4 & 2) != 0 && (t4.w() || f0(coordinatorLayout, t4, view));
            if (z4 && (valueAnimator = this.f52518n) != null) {
                valueAnimator.cancel();
            }
            this.f52522r = null;
            this.f52517m = i5;
            return z4;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: w0, reason: merged with bridge method [inline-methods] */
        public void D(CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, View view, int i4) {
            if (this.f52517m == 0 || i4 == 1) {
                A0(coordinatorLayout, t4);
                if (t4.w()) {
                    t4.L(t4.R(view));
                }
            }
            this.f52522r = new WeakReference<>(view);
        }

        public void x0(@q0 d dVar) {
            this.f52523s = dVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int Y(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 T t4, int i4, int i5, int i6) {
            int U = U();
            int i7 = 0;
            if (i5 == 0 || U < i5 || U > i6) {
                this.f52516l = 0;
            } else {
                int e4 = e1.a.e(i4, i5, i6);
                if (U != e4) {
                    int m02 = t4.s() ? m0(t4, e4) : e4;
                    boolean N = N(m02);
                    i7 = U - e4;
                    this.f52516l = e4 - m02;
                    if (!N && t4.s()) {
                        coordinatorLayout.p(t4);
                    }
                    t4.y(H());
                    C0(coordinatorLayout, t4, e4, e4 < U ? -1 : 1, false);
                }
            }
            B0(coordinatorLayout, t4);
            return i7;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f52519o = -1;
        }

        protected static class SavedState extends androidx.customview.view.AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            int f52524d;

            /* renamed from: e, reason: collision with root package name */
            float f52525e;

            /* renamed from: f, reason: collision with root package name */
            boolean f52526f;

            static class a implements Parcelable.ClassLoaderCreator<SavedState> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                @q0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(@androidx.annotation.o0 Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @androidx.annotation.o0
                public SavedState b(@androidx.annotation.o0 Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @androidx.annotation.o0
                public SavedState[] c(int i4) {
                    return new SavedState[i4];
                }

                @Override // android.os.Parcelable.Creator
                @androidx.annotation.o0
                public Object[] newArray(int i4) {
                    return new SavedState[i4];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                @androidx.annotation.o0
                public SavedState createFromParcel(@androidx.annotation.o0 Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }
            }

            public SavedState(@androidx.annotation.o0 Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f52524d = parcel.readInt();
                this.f52525e = parcel.readFloat();
                this.f52526f = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@androidx.annotation.o0 Parcel parcel, int i4) {
                super.writeToParcel(parcel, i4);
                parcel.writeInt(this.f52524d);
                parcel.writeFloat(this.f52525e);
                parcel.writeByte(this.f52526f ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public AppBarLayout(@androidx.annotation.o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.S);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBarLayout(@androidx.annotation.o0 android.content.Context r10, @androidx.annotation.q0 android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.f52495x
            android.content.Context r10 = a9.a.c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f52498c = r10
            r9.f52499d = r10
            r9.f52500e = r10
            r6 = 0
            r9.f52502g = r6
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            com.google.android.material.appbar.c.a(r9)
            com.google.android.material.appbar.c.c(r9, r11, r12, r4)
            int[] r2 = s8.a.o.f91732r0
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r12 = s8.a.o.f91745s0
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            androidx.core.view.x1.P1(r9, r12)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L5b
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            com.google.android.material.shape.j r0 = new com.google.android.material.shape.j
            r0.<init>()
            int r12 = r12.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r0.p0(r12)
            r0.a0(r7)
            r9.setBackground(r0)
        L5b:
            int r12 = s8.a.o.f91793w0
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L6a
            boolean r12 = r11.getBoolean(r12, r6)
            r9.F(r12, r6, r6)
        L6a:
            int r12 = s8.a.o.f91781v0
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L7a
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.c.b(r9, r12)
        L7a:
            r12 = 26
            if (r8 < r12) goto L9c
            int r12 = s8.a.o.f91769u0
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L8d
            boolean r12 = r11.getBoolean(r12, r6)
            com.google.android.material.appbar.a.a(r9, r12)
        L8d:
            int r12 = s8.a.o.f91757t0
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L9c
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        L9c:
            int r12 = s8.a.o.f91805x0
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f52508m = r12
            int r12 = s8.a.o.f91817y0
            int r10 = r11.getResourceId(r12, r10)
            r9.f52509n = r10
            int r10 = s8.a.o.f91829z0
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.M(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            androidx.core.view.x1.k2(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: c, reason: collision with root package name */
        public static final int f52538c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final int f52539d = 1;

        /* renamed from: e, reason: collision with root package name */
        public static final int f52540e = 2;

        /* renamed from: f, reason: collision with root package name */
        public static final int f52541f = 4;

        /* renamed from: g, reason: collision with root package name */
        public static final int f52542g = 8;

        /* renamed from: h, reason: collision with root package name */
        public static final int f52543h = 16;

        /* renamed from: i, reason: collision with root package name */
        public static final int f52544i = 32;

        /* renamed from: j, reason: collision with root package name */
        static final int f52545j = 5;

        /* renamed from: k, reason: collision with root package name */
        static final int f52546k = 17;

        /* renamed from: l, reason: collision with root package name */
        static final int f52547l = 10;

        /* renamed from: a, reason: collision with root package name */
        int f52548a;

        /* renamed from: b, reason: collision with root package name */
        Interpolator f52549b;

        @c1({c1.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f52548a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.F0);
            this.f52548a = obtainStyledAttributes.getInt(a.o.G0, 0);
            int i4 = a.o.H0;
            if (obtainStyledAttributes.hasValue(i4)) {
                this.f52549b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i4, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.f52548a;
        }

        public Interpolator b() {
            return this.f52549b;
        }

        boolean c() {
            int i4 = this.f52548a;
            return (i4 & 1) == 1 && (i4 & 10) != 0;
        }

        public void d(int i4) {
            this.f52548a = i4;
        }

        public void e(Interpolator interpolator) {
            this.f52549b = interpolator;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f52548a = 1;
        }

        public LayoutParams(int i4, int i5, float f4) {
            super(i4, i5, f4);
            this.f52548a = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52548a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f52548a = 1;
        }

        @x0(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52548a = 1;
        }

        @x0(19)
        public LayoutParams(@androidx.annotation.o0 LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.f52548a = 1;
            this.f52548a = layoutParams.f52548a;
            this.f52549b = layoutParams.f52549b;
        }
    }
}
