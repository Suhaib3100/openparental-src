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
import androidx.core.view.accessibility.g0;
import androidx.core.view.accessibility.m0;
import androidx.core.view.i1;
import androidx.core.view.o1;
import androidx.core.view.v4;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import n1.a;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    static final int F = 0;
    static final int G = 1;
    static final int H = 2;
    static final int I = 4;
    static final int J = 8;
    private static final int K = a.n.sa;
    private static final int L = -1;

    @d0
    private int A;

    @q0
    private WeakReference<View> B;

    @q0
    private ValueAnimator C;
    private int[] D;

    @q0
    private Drawable E;

    /* renamed from: o, reason: collision with root package name */
    private int f12802o;

    /* renamed from: p, reason: collision with root package name */
    private int f12803p;

    /* renamed from: q, reason: collision with root package name */
    private int f12804q;

    /* renamed from: r, reason: collision with root package name */
    private int f12805r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f12806s;

    /* renamed from: t, reason: collision with root package name */
    private int f12807t;

    /* renamed from: u, reason: collision with root package name */
    @q0
    private v4 f12808u;

    /* renamed from: v, reason: collision with root package name */
    private List<c> f12809v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f12810w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f12811x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f12812y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f12813z;

    /* loaded from: classes4.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* loaded from: classes3.dex */
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
        public /* bridge */ /* synthetic */ void L(boolean z5) {
            super.L(z5);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean M(int i5) {
            return super.M(i5);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean N(int i5) {
            return super.N(i5);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void O(boolean z5) {
            super.O(z5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, int i5) {
            return super.m(coordinatorLayout, appBarLayout, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean n(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, int i5, int i6, int i7, int i8) {
            return super.n(coordinatorLayout, appBarLayout, i5, i6, i7, i8);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void r(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, View view, int i5, int i6, int[] iArr, int i7) {
            super.r(coordinatorLayout, appBarLayout, view, i5, i6, iArr, i7);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: s0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
            super.u(coordinatorLayout, appBarLayout, view, i5, i6, i7, i8, i9, iArr);
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
        public /* bridge */ /* synthetic */ boolean B(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, @o0 View view, View view2, int i5, int i6) {
            return super.B(coordinatorLayout, appBarLayout, view, view2, i5, i6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: w0 */
        public /* bridge */ /* synthetic */ void D(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, View view, int i5) {
            super.D(coordinatorLayout, appBarLayout, view, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void x0(@q0 BaseBehavior.d dVar) {
            super.x0(dVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes4.dex */
    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        private static int Z(@o0 AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior f6 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f6 instanceof BaseBehavior) {
                return ((BaseBehavior) f6).U();
            }
            return 0;
        }

        private void a0(@o0 View view, @o0 View view2) {
            CoordinatorLayout.Behavior f6 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f6 instanceof BaseBehavior) {
                y1.f1(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f6).f12816l) + U()) - Q(view2));
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
        public /* bridge */ /* synthetic */ void L(boolean z5) {
            super.L(z5);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean M(int i5) {
            return super.M(i5);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean N(int i5) {
            return super.N(i5);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void O(boolean z5) {
            super.O(z5);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        float R(View view) {
            int i5;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int q5 = appBarLayout.q();
                int h5 = appBarLayout.h();
                int Z = Z(appBarLayout);
                if ((h5 == 0 || q5 + Z > h5) && (i5 = q5 - h5) != 0) {
                    return (Z / i5) + 1.0f;
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
            for (int i5 = 0; i5 < size; i5++) {
                View view = list.get(i5);
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
                y1.r1(coordinatorLayout, g0.a.f5385r.b());
                y1.r1(coordinatorLayout, g0.a.f5386s.b());
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i5) {
            return super.m(coordinatorLayout, view, i5);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean n(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i5, int i6, int i7, int i8) {
            return super.n(coordinatorLayout, view, i5, i6, i7, i8);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean x(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 Rect rect, boolean z5) {
            AppBarLayout P = P(coordinatorLayout.C(view));
            if (P != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f12885d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    P.E(false, !z5);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.Pn);
            W(obtainStyledAttributes.getDimensionPixelSize(a.o.Qn, 0));
            obtainStyledAttributes.recycle();
        }
    }

    class a implements o1 {
        a() {
        }

        @Override // androidx.core.view.o1
        public v4 a(View view, v4 v4Var) {
            return AppBarLayout.this.z(v4Var);
        }
    }

    /* loaded from: classes2.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f12851a;

        b(j jVar) {
            this.f12851a = jVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            this.f12851a.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes2.dex */
    public interface c<T extends AppBarLayout> {
        void a(T t5, int i5);
    }

    public interface d extends c<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.c
        void a(AppBarLayout appBarLayout, int i5);
    }

    public AppBarLayout(@o0 Context context) {
        this(context, null);
    }

    private void F(boolean z5, boolean z6, boolean z7) {
        this.f12807t = (z5 ? 1 : 2) | (z6 ? 4 : 0) | (z7 ? 8 : 0);
        requestLayout();
    }

    private boolean J(boolean z5) {
        if (this.f12811x == z5) {
            return false;
        }
        this.f12811x = z5;
        refreshDrawableState();
        return true;
    }

    private boolean Q() {
        return this.E != null && p() > 0;
    }

    private boolean S() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || y1.U(childAt)) ? false : true;
    }

    private void T(@o0 j jVar, boolean z5) {
        float dimension = getResources().getDimension(a.f.O0);
        float f6 = z5 ? 0.0f : dimension;
        if (!z5) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f6, dimension);
        this.C = ofFloat;
        ofFloat.setDuration(getResources().getInteger(a.i.f29842c));
        this.C.setInterpolator(com.google.android.material.animation.a.f12778a);
        this.C.addUpdateListener(new b(jVar));
        this.C.start();
    }

    private void U() {
        setWillNotDraw(!Q());
    }

    private void c() {
        WeakReference<View> weakReference = this.B;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.B = null;
    }

    @q0
    private View d(@q0 View view) {
        int i5;
        if (this.B == null && (i5 = this.A) != -1) {
            View findViewById = view != null ? view.findViewById(i5) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.A);
            }
            if (findViewById != null) {
                this.B = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.B;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean t() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void v() {
        this.f12803p = -1;
        this.f12804q = -1;
        this.f12805r = -1;
    }

    public void A(@q0 c cVar) {
        List<c> list = this.f12809v;
        if (list == null || cVar == null) {
            return;
        }
        list.remove(cVar);
    }

    public void B(d dVar) {
        A(dVar);
    }

    void C() {
        this.f12807t = 0;
    }

    public void D(boolean z5) {
        E(z5, y1.U0(this));
    }

    public void E(boolean z5, boolean z6) {
        F(z5, z6, true);
    }

    public void G(boolean z5) {
        this.f12813z = z5;
    }

    public void H(@d0 int i5) {
        this.A = i5;
        c();
    }

    public boolean I(boolean z5) {
        this.f12810w = true;
        return J(z5);
    }

    public boolean K(boolean z5) {
        return L(z5);
    }

    boolean L(boolean z5) {
        if (this.f12812y == z5) {
            return false;
        }
        this.f12812y = z5;
        refreshDrawableState();
        if (!this.f12813z || !(getBackground() instanceof j)) {
            return true;
        }
        T((j) getBackground(), z5);
        return true;
    }

    public void M(@q0 Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.E = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.E.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.d.m(this.E, y1.Z(this));
                this.E.setVisible(getVisibility() == 0, false);
                this.E.setCallback(this);
            }
            U();
            y1.n1(this);
        }
    }

    public void N(@l int i5) {
        M(new ColorDrawable(i5));
    }

    public void O(@v int i5) {
        M(androidx.appcompat.content.res.a.d(getContext(), i5));
    }

    @Deprecated
    public void P(float f6) {
        com.google.android.material.appbar.b.b(this, f6);
    }

    boolean R(@q0 View view) {
        View d6 = d(view);
        if (d6 != null) {
            view = d6;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void a(@q0 c cVar) {
        if (this.f12809v == null) {
            this.f12809v = new ArrayList();
        }
        if (cVar == null || this.f12809v.contains(cVar)) {
            return;
        }
        this.f12809v.add(cVar);
    }

    public void b(d dVar) {
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
            canvas.translate(0.0f, -this.f12802o);
            this.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.E;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    int h() {
        int i5;
        int e02;
        int i6 = this.f12804q;
        if (i6 != -1) {
            return i6;
        }
        int i7 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i8 = layoutParams.f12848a;
            if ((i8 & 5) != 5) {
                if (i7 > 0) {
                    break;
                }
            } else {
                int i9 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if ((i8 & 8) != 0) {
                    e02 = y1.e0(childAt);
                } else if ((i8 & 2) != 0) {
                    e02 = measuredHeight - y1.e0(childAt);
                } else {
                    i5 = i9 + measuredHeight;
                    if (childCount == 0 && y1.U(childAt)) {
                        i5 = Math.min(i5, measuredHeight - p());
                    }
                    i7 += i5;
                }
                i5 = e02 + i9;
                if (childCount == 0) {
                    i5 = Math.min(i5, measuredHeight - p());
                }
                i7 += i5;
            }
        }
        int max = Math.max(0, i7);
        this.f12804q = max;
        return max;
    }

    int i() {
        int i5 = this.f12805r;
        if (i5 != -1) {
            return i5;
        }
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
            int i8 = layoutParams.f12848a;
            if ((i8 & 1) == 0) {
                break;
            }
            i7 += measuredHeight;
            if ((i8 & 2) != 0) {
                i7 -= y1.e0(childAt);
                break;
            }
            i6++;
        }
        int max = Math.max(0, i7);
        this.f12805r = max;
        return max;
    }

    @d0
    public int j() {
        return this.A;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @o0
    public CoordinatorLayout.Behavior<AppBarLayout> k() {
        return new Behavior();
    }

    public final int l() {
        int p5 = p();
        int e02 = y1.e0(this);
        if (e02 == 0) {
            int childCount = getChildCount();
            e02 = childCount >= 1 ? y1.e0(getChildAt(childCount - 1)) : 0;
            if (e02 == 0) {
                return getHeight() / 3;
            }
        }
        return (e02 * 2) + p5;
    }

    int m() {
        return this.f12807t;
    }

    @q0
    public Drawable n() {
        return this.E;
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
    protected int[] onCreateDrawableState(int i5) {
        if (this.D == null) {
            this.D = new int[4];
        }
        int[] iArr = this.D;
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + iArr.length);
        boolean z5 = this.f12811x;
        int i6 = a.c.fd;
        if (!z5) {
            i6 = -i6;
        }
        iArr[0] = i6;
        iArr[1] = (z5 && this.f12812y) ? a.c.gd : -a.c.gd;
        int i7 = a.c.dd;
        if (!z5) {
            i7 = -i7;
        }
        iArr[2] = i7;
        iArr[3] = (z5 && this.f12812y) ? a.c.cd : -a.c.cd;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        boolean z6 = true;
        if (y1.U(this) && S()) {
            int p5 = p();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(p5);
            }
        }
        v();
        this.f12806s = false;
        int childCount2 = getChildCount();
        int i9 = 0;
        while (true) {
            if (i9 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i9).getLayoutParams()).b() != null) {
                this.f12806s = true;
                break;
            }
            i9++;
        }
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), p());
        }
        if (this.f12810w) {
            return;
        }
        if (!this.f12813z && !t()) {
            z6 = false;
        }
        J(z6);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        int mode = View.MeasureSpec.getMode(i6);
        if (mode != 1073741824 && y1.U(this) && S()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = o.a.e(getMeasuredHeight() + p(), 0, View.MeasureSpec.getSize(i6));
            } else if (mode == 0) {
                measuredHeight += p();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        v();
    }

    @m1
    final int p() {
        v4 v4Var = this.f12808u;
        if (v4Var != null) {
            return v4Var.r();
        }
        return 0;
    }

    public final int q() {
        int i5 = this.f12803p;
        if (i5 != -1) {
            return i5;
        }
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i8 = layoutParams.f12848a;
            if ((i8 & 1) == 0) {
                break;
            }
            int i9 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i7;
            if (i6 == 0 && y1.U(childAt)) {
                i9 -= p();
            }
            i7 = i9;
            if ((i8 & 2) != 0) {
                i7 -= y1.e0(childAt);
                break;
            }
            i6++;
        }
        int max = Math.max(0, i7);
        this.f12803p = max;
        return max;
    }

    int r() {
        return q();
    }

    boolean s() {
        return this.f12806s;
    }

    @Override // android.view.View
    @x0(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        k.d(this, f6);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i5) {
        if (i5 != 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⚇"));
        }
        super.setOrientation(i5);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z5 = i5 == 0;
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
    }

    boolean u() {
        return q() != 0;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@o0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.E;
    }

    public boolean w() {
        return this.f12813z;
    }

    public boolean x() {
        return this.f12812y;
    }

    void y(int i5) {
        this.f12802o = i5;
        if (!willNotDraw()) {
            y1.n1(this);
        }
        List<c> list = this.f12809v;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                c cVar = this.f12809v.get(i6);
                if (cVar != null) {
                    cVar.a(this, i5);
                }
            }
        }
    }

    v4 z(v4 v4Var) {
        v4 v4Var2 = y1.U(this) ? v4Var : null;
        if (!androidx.core.util.l.a(this.f12808u, v4Var2)) {
            this.f12808u = v4Var2;
            U();
            requestLayout();
        }
        return v4Var;
    }

    /* loaded from: classes4.dex */
    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: t, reason: collision with root package name */
        private static final int f12814t = 600;

        /* renamed from: u, reason: collision with root package name */
        private static final int f12815u = -1;

        /* renamed from: l, reason: collision with root package name */
        private int f12816l;

        /* renamed from: m, reason: collision with root package name */
        private int f12817m;

        /* renamed from: n, reason: collision with root package name */
        private ValueAnimator f12818n;

        /* renamed from: o, reason: collision with root package name */
        private int f12819o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f12820p;

        /* renamed from: q, reason: collision with root package name */
        private float f12821q;

        /* renamed from: r, reason: collision with root package name */
        @q0
        private WeakReference<View> f12822r;

        /* renamed from: s, reason: collision with root package name */
        private d f12823s;

        /* loaded from: classes2.dex */
        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f12827a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f12828b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f12827a = coordinatorLayout;
                this.f12828b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
                BaseBehavior.this.X(this.f12827a, this.f12828b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* loaded from: classes3.dex */
        class b implements m0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f12830a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f12831b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f12832c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f12833d;

            b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i5) {
                this.f12830a = coordinatorLayout;
                this.f12831b = appBarLayout;
                this.f12832c = view;
                this.f12833d = i5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.m0
            public boolean a(@o0 View view, @q0 m0.a aVar) {
                BaseBehavior.this.r(this.f12830a, this.f12831b, this.f12832c, 0, this.f12833d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* loaded from: classes3.dex */
        class c implements m0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f12835a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f12836b;

            c(AppBarLayout appBarLayout, boolean z5) {
                this.f12835a = appBarLayout;
                this.f12836b = z5;
            }

            @Override // androidx.core.view.accessibility.m0
            public boolean a(@o0 View view, @q0 m0.a aVar) {
                this.f12835a.D(this.f12836b);
                return true;
            }
        }

        /* loaded from: classes2.dex */
        public static abstract class d<T extends AppBarLayout> {
            public abstract boolean a(@o0 T t5);
        }

        public BaseBehavior() {
            this.f12819o = -1;
        }

        private void A0(CoordinatorLayout coordinatorLayout, @o0 T t5) {
            int U = U();
            int j02 = j0(t5, U);
            if (j02 >= 0) {
                View childAt = t5.getChildAt(j02);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int a6 = layoutParams.a();
                if ((a6 & 17) == 17) {
                    int i5 = -childAt.getTop();
                    int i6 = -childAt.getBottom();
                    if (j02 == t5.getChildCount() - 1) {
                        i6 += t5.p();
                    }
                    if (g0(a6, 2)) {
                        i6 += y1.e0(childAt);
                    } else if (g0(a6, 5)) {
                        int e02 = y1.e0(childAt) + i6;
                        if (U < e02) {
                            i5 = e02;
                        } else {
                            i6 = e02;
                        }
                    }
                    if (g0(a6, 32)) {
                        i5 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        i6 -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    if (U < (i6 + i5) / 2) {
                        i5 = i6;
                    }
                    c0(coordinatorLayout, t5, o.a.e(i5, -t5.q(), 0), 0.0f);
                }
            }
        }

        private void B0(CoordinatorLayout coordinatorLayout, @o0 T t5) {
            y1.r1(coordinatorLayout, g0.a.f5385r.b());
            y1.r1(coordinatorLayout, g0.a.f5386s.b());
            View h02 = h0(coordinatorLayout);
            if (h02 == null || t5.q() == 0 || !(((CoordinatorLayout.f) h02.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                return;
            }
            a0(coordinatorLayout, t5, h02);
        }

        private void C0(@o0 CoordinatorLayout coordinatorLayout, @o0 T t5, int i5, int i6, boolean z5) {
            View i02 = i0(t5, i5);
            if (i02 != null) {
                int a6 = ((LayoutParams) i02.getLayoutParams()).a();
                boolean z6 = false;
                if ((a6 & 1) != 0) {
                    int e02 = y1.e0(i02);
                    if (i6 <= 0 || (a6 & 12) == 0 ? !((a6 & 2) == 0 || (-i5) < (i02.getBottom() - e02) - t5.p()) : (-i5) >= (i02.getBottom() - e02) - t5.p()) {
                        z6 = true;
                    }
                }
                if (t5.w()) {
                    z6 = t5.R(h0(coordinatorLayout));
                }
                boolean L = t5.L(z6);
                if (z5 || (L && z0(coordinatorLayout, t5))) {
                    t5.jumpDrawablesToCurrentState();
                }
            }
        }

        private void a0(CoordinatorLayout coordinatorLayout, @o0 T t5, @o0 View view) {
            if (U() != (-t5.q()) && view.canScrollVertically(1)) {
                b0(coordinatorLayout, t5, g0.a.f5385r, false);
            }
            if (U() != 0) {
                if (!view.canScrollVertically(-1)) {
                    b0(coordinatorLayout, t5, g0.a.f5386s, true);
                    return;
                }
                int i5 = -t5.h();
                if (i5 != 0) {
                    y1.u1(coordinatorLayout, g0.a.f5386s, null, new b(coordinatorLayout, t5, view, i5));
                }
            }
        }

        private void b0(CoordinatorLayout coordinatorLayout, @o0 T t5, @o0 g0.a aVar, boolean z5) {
            y1.u1(coordinatorLayout, aVar, null, new c(t5, z5));
        }

        private void c0(CoordinatorLayout coordinatorLayout, @o0 T t5, int i5, float f6) {
            int abs = Math.abs(U() - i5);
            float abs2 = Math.abs(f6);
            d0(coordinatorLayout, t5, i5, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t5.getHeight()) + 1.0f) * 150.0f));
        }

        private void d0(CoordinatorLayout coordinatorLayout, T t5, int i5, int i6) {
            int U = U();
            if (U == i5) {
                ValueAnimator valueAnimator = this.f12818n;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f12818n.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f12818n;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f12818n = valueAnimator3;
                valueAnimator3.setInterpolator(com.google.android.material.animation.a.f12782e);
                this.f12818n.addUpdateListener(new a(coordinatorLayout, t5));
            } else {
                valueAnimator2.cancel();
            }
            this.f12818n.setDuration(Math.min(i6, f12814t));
            this.f12818n.setIntValues(U, i5);
            this.f12818n.start();
        }

        private boolean f0(@o0 CoordinatorLayout coordinatorLayout, @o0 T t5, @o0 View view) {
            return t5.u() && coordinatorLayout.getHeight() - view.getHeight() <= t5.getHeight();
        }

        private static boolean g0(int i5, int i6) {
            return (i5 & i6) == i6;
        }

        @q0
        private View h0(@o0 CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                if ((childAt instanceof i1) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @q0
        private static View i0(@o0 AppBarLayout appBarLayout, int i5) {
            int abs = Math.abs(i5);
            int childCount = appBarLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = appBarLayout.getChildAt(i6);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int j0(@o0 T t5, int i5) {
            int childCount = t5.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = t5.getChildAt(i6);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (g0(layoutParams.a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i7 = -i5;
                if (top <= i7 && bottom >= i7) {
                    return i6;
                }
            }
            return -1;
        }

        private int m0(@o0 T t5, int i5) {
            int abs = Math.abs(i5);
            int childCount = t5.getChildCount();
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = t5.getChildAt(i7);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator b6 = layoutParams.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i7++;
                } else if (b6 != null) {
                    int a6 = layoutParams.a();
                    if ((a6 & 1) != 0) {
                        i6 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((a6 & 2) != 0) {
                            i6 -= y1.e0(childAt);
                        }
                    }
                    if (y1.U(childAt)) {
                        i6 -= t5.p();
                    }
                    if (i6 > 0) {
                        float f6 = i6;
                        return (childAt.getTop() + Math.round(b6.getInterpolation((abs - childAt.getTop()) / f6) * f6)) * Integer.signum(i5);
                    }
                }
            }
            return i5;
        }

        private boolean z0(@o0 CoordinatorLayout coordinatorLayout, @o0 T t5) {
            List<View> E = coordinatorLayout.E(t5);
            int size = E.size();
            for (int i5 = 0; i5 < size; i5++) {
                CoordinatorLayout.Behavior f6 = ((CoordinatorLayout.f) E.get(i5).getLayoutParams()).f();
                if (f6 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f6).S() != 0;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        int U() {
            return H() + this.f12816l;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public boolean P(T t5) {
            d dVar = this.f12823s;
            if (dVar != null) {
                return dVar.a(t5);
            }
            WeakReference<View> weakReference = this.f12822r;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int S(@o0 T t5) {
            return -t5.i();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int T(@o0 T t5) {
            return t5.q();
        }

        @m1
        boolean n0() {
            ValueAnimator valueAnimator = this.f12818n;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public void V(@o0 CoordinatorLayout coordinatorLayout, @o0 T t5) {
            A0(coordinatorLayout, t5);
            if (t5.w()) {
                t5.L(t5.R(h0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 T t5, int i5) {
            boolean m5 = super.m(coordinatorLayout, t5, i5);
            int m6 = t5.m();
            int i6 = this.f12819o;
            if (i6 >= 0 && (m6 & 8) == 0) {
                View childAt = t5.getChildAt(i6);
                X(coordinatorLayout, t5, (this.f12820p ? y1.e0(childAt) + t5.p() : Math.round(childAt.getHeight() * this.f12821q)) + (-childAt.getBottom()));
            } else if (m6 != 0) {
                boolean z5 = (m6 & 4) != 0;
                if ((m6 & 2) != 0) {
                    int i7 = -t5.r();
                    if (z5) {
                        c0(coordinatorLayout, t5, i7, 0.0f);
                    } else {
                        X(coordinatorLayout, t5, i7);
                    }
                } else if ((m6 & 1) != 0) {
                    if (z5) {
                        c0(coordinatorLayout, t5, 0, 0.0f);
                    } else {
                        X(coordinatorLayout, t5, 0);
                    }
                }
            }
            t5.C();
            this.f12819o = -1;
            N(o.a.e(H(), -t5.q(), 0));
            C0(coordinatorLayout, t5, H(), 0, true);
            t5.y(H());
            B0(coordinatorLayout, t5);
            return m5;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        public boolean n(@o0 CoordinatorLayout coordinatorLayout, @o0 T t5, int i5, int i6, int i7, int i8) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t5.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.X(t5, i5, i6, View.MeasureSpec.makeMeasureSpec(0, 0), i8);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void r(CoordinatorLayout coordinatorLayout, @o0 T t5, View view, int i5, int i6, int[] iArr, int i7) {
            int i8;
            int i9;
            if (i6 != 0) {
                if (i6 < 0) {
                    i8 = -t5.q();
                    i9 = t5.h() + i8;
                } else {
                    i8 = -t5.r();
                    i9 = 0;
                }
                int i10 = i8;
                int i11 = i9;
                if (i10 != i11) {
                    iArr[1] = W(coordinatorLayout, t5, i6, i10, i11);
                }
            }
            if (t5.w()) {
                t5.L(t5.R(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void u(CoordinatorLayout coordinatorLayout, @o0 T t5, View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
            if (i8 < 0) {
                iArr[1] = W(coordinatorLayout, t5, i8, -t5.i(), 0);
            }
            if (i8 == 0) {
                B0(coordinatorLayout, t5);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public void y(@o0 CoordinatorLayout coordinatorLayout, @o0 T t5, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                this.f12819o = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            savedState.a();
            this.f12819o = savedState.f12824q;
            this.f12821q = savedState.f12825r;
            this.f12820p = savedState.f12826s;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public Parcelable z(@o0 CoordinatorLayout coordinatorLayout, @o0 T t5) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int H = H();
            int childCount = t5.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = t5.getChildAt(i5);
                int bottom = childAt.getBottom() + H;
                if (childAt.getTop() + H <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.f12824q = i5;
                    savedState.f12826s = bottom == y1.e0(childAt) + t5.p();
                    savedState.f12825r = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return absSavedState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public boolean B(@o0 CoordinatorLayout coordinatorLayout, @o0 T t5, @o0 View view, View view2, int i5, int i6) {
            ValueAnimator valueAnimator;
            boolean z5 = (i5 & 2) != 0 && (t5.w() || f0(coordinatorLayout, t5, view));
            if (z5 && (valueAnimator = this.f12818n) != null) {
                valueAnimator.cancel();
            }
            this.f12822r = null;
            this.f12817m = i6;
            return z5;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: w0, reason: merged with bridge method [inline-methods] */
        public void D(CoordinatorLayout coordinatorLayout, @o0 T t5, View view, int i5) {
            if (this.f12817m == 0 || i5 == 1) {
                A0(coordinatorLayout, t5);
                if (t5.w()) {
                    t5.L(t5.R(view));
                }
            }
            this.f12822r = new WeakReference<>(view);
        }

        public void x0(@q0 d dVar) {
            this.f12823s = dVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int Y(@o0 CoordinatorLayout coordinatorLayout, @o0 T t5, int i5, int i6, int i7) {
            int U = U();
            int i8 = 0;
            if (i6 == 0 || U < i6 || U > i7) {
                this.f12816l = 0;
            } else {
                int e6 = o.a.e(i5, i6, i7);
                if (U != e6) {
                    int m02 = t5.s() ? m0(t5, e6) : e6;
                    boolean N = N(m02);
                    i8 = U - e6;
                    this.f12816l = e6 - m02;
                    if (!N && t5.s()) {
                        coordinatorLayout.q(t5);
                    }
                    t5.y(H());
                    C0(coordinatorLayout, t5, e6, e6 < U ? -1 : 1, false);
                }
            }
            B0(coordinatorLayout, t5);
            return i8;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12819o = -1;
        }

        /* loaded from: classes3.dex */
        protected static class SavedState extends androidx.customview.view.AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: q, reason: collision with root package name */
            int f12824q;

            /* renamed from: r, reason: collision with root package name */
            float f12825r;

            /* renamed from: s, reason: collision with root package name */
            boolean f12826s;

            /* loaded from: classes2.dex */
            static class a implements Parcelable.ClassLoaderCreator<SavedState> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                @q0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(@o0 Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @o0
                public SavedState b(@o0 Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @o0
                public SavedState[] c(int i5) {
                    return new SavedState[i5];
                }

                @Override // android.os.Parcelable.Creator
                @o0
                public Object[] newArray(int i5) {
                    return new SavedState[i5];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                @o0
                public SavedState createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }
            }

            public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f12824q = parcel.readInt();
                this.f12825r = parcel.readFloat();
                this.f12826s = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@o0 Parcel parcel, int i5) {
                super.writeToParcel(parcel, i5);
                parcel.writeInt(this.f12824q);
                parcel.writeFloat(this.f12825r);
                parcel.writeByte(this.f12826s ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public AppBarLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.T);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBarLayout(@androidx.annotation.o0 android.content.Context r10, @androidx.annotation.q0 android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.K
            android.content.Context r10 = v1.a.c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f12803p = r10
            r9.f12804q = r10
            r9.f12805r = r10
            r6 = 0
            r9.f12807t = r6
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            com.google.android.material.appbar.b.a(r9)
            com.google.android.material.appbar.b.c(r9, r11, r12, r4)
            int[] r2 = n1.a.o.f30262r0
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r12 = n1.a.o.f30268s0
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            androidx.core.view.y1.I1(r9, r12)
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
            androidx.core.view.y1.I1(r9, r0)
        L5b:
            int r12 = n1.a.o.f30292w0
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L6a
            boolean r12 = r11.getBoolean(r12, r6)
            r9.F(r12, r6, r6)
        L6a:
            int r12 = n1.a.o.f30286v0
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L7a
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.b.b(r9, r12)
        L7a:
            r12 = 26
            if (r8 < r12) goto L9c
            int r12 = n1.a.o.f30280u0
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L8d
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        L8d:
            int r12 = n1.a.o.f30274t0
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L9c
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        L9c:
            int r12 = n1.a.o.f30298x0
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f12813z = r12
            int r12 = n1.a.o.f30304y0
            int r10 = r11.getResourceId(r12, r10)
            r9.A = r10
            int r10 = n1.a.o.f30310z0
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.M(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            androidx.core.view.y1.a2(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: c, reason: collision with root package name */
        public static final int f12838c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final int f12839d = 1;

        /* renamed from: e, reason: collision with root package name */
        public static final int f12840e = 2;

        /* renamed from: f, reason: collision with root package name */
        public static final int f12841f = 4;

        /* renamed from: g, reason: collision with root package name */
        public static final int f12842g = 8;

        /* renamed from: h, reason: collision with root package name */
        public static final int f12843h = 16;

        /* renamed from: i, reason: collision with root package name */
        public static final int f12844i = 32;

        /* renamed from: j, reason: collision with root package name */
        static final int f12845j = 5;

        /* renamed from: k, reason: collision with root package name */
        static final int f12846k = 17;

        /* renamed from: l, reason: collision with root package name */
        static final int f12847l = 10;

        /* renamed from: a, reason: collision with root package name */
        int f12848a;

        /* renamed from: b, reason: collision with root package name */
        Interpolator f12849b;

        @c1({c1.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12848a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.F0);
            this.f12848a = obtainStyledAttributes.getInt(a.o.G0, 0);
            int i5 = a.o.H0;
            if (obtainStyledAttributes.hasValue(i5)) {
                this.f12849b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i5, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.f12848a;
        }

        public Interpolator b() {
            return this.f12849b;
        }

        boolean c() {
            int i5 = this.f12848a;
            return (i5 & 1) == 1 && (i5 & 10) != 0;
        }

        public void d(int i5) {
            this.f12848a = i5;
        }

        public void e(Interpolator interpolator) {
            this.f12849b = interpolator;
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.f12848a = 1;
        }

        public LayoutParams(int i5, int i6, float f6) {
            super(i5, i6, f6);
            this.f12848a = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12848a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12848a = 1;
        }

        @x0(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12848a = 1;
        }

        @x0(19)
        public LayoutParams(@o0 LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.f12848a = 1;
            this.f12848a = layoutParams.f12848a;
            this.f12849b = layoutParams.f12849b;
        }
    }
}
