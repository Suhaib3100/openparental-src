package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.n;
import androidx.core.graphics.w1;
import androidx.core.view.k1;
import androidx.core.view.l1;
import androidx.core.view.m1;
import androidx.core.view.n1;
import androidx.core.view.v4;
import androidx.core.view.y1;
import d.a;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"UnknownNullness"})
/* loaded from: classes3.dex */
public class ActionBarOverlayLayout extends ViewGroup implements x, m1, k1, l1 {
    private static final int U = 600;
    private int A;
    private final Rect B;
    private final Rect C;
    private final Rect D;
    private final Rect E;
    private final Rect F;
    private final Rect G;
    private final Rect H;

    @androidx.annotation.o0
    private v4 I;

    @androidx.annotation.o0
    private v4 J;

    @androidx.annotation.o0
    private v4 K;

    @androidx.annotation.o0
    private v4 L;
    private d M;
    private OverScroller N;
    ViewPropertyAnimator O;
    final AnimatorListenerAdapter P;
    private final Runnable Q;
    private final Runnable R;
    private final n1 S;

    /* renamed from: o, reason: collision with root package name */
    private int f787o;

    /* renamed from: p, reason: collision with root package name */
    private int f788p;

    /* renamed from: q, reason: collision with root package name */
    private ContentFrameLayout f789q;

    /* renamed from: r, reason: collision with root package name */
    ActionBarContainer f790r;

    /* renamed from: s, reason: collision with root package name */
    private y f791s;

    /* renamed from: t, reason: collision with root package name */
    private Drawable f792t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f793u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f794v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f795w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f796x;

    /* renamed from: y, reason: collision with root package name */
    boolean f797y;

    /* renamed from: z, reason: collision with root package name */
    private int f798z;
    private static final String T = "ActionBarOverlayLayout";
    static final int[] V = {a.c.f21547d, R.attr.windowContentOverlay};

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.O = null;
            actionBarOverlayLayout.f797y = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.O = null;
            actionBarOverlayLayout.f797y = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.D();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.O = actionBarOverlayLayout.f790r.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.P);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.D();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.O = actionBarOverlayLayout.f790r.animate().translationY(-ActionBarOverlayLayout.this.f790r.getHeight()).setListener(ActionBarOverlayLayout.this.P);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(boolean z5);

        void d();

        void e();

        void onWindowVisibilityChanged(int i5);
    }

    public ActionBarOverlayLayout(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private y C(View view) {
        if (view instanceof y) {
            return (y) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).a0();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of ".concat(view.getClass().getSimpleName()));
    }

    private void E(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(V);
        this.f787o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f792t = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f793u = context.getApplicationInfo().targetSdkVersion < 19;
        this.N = new OverScroller(context);
    }

    private void H() {
        D();
        postDelayed(this.R, 600L);
    }

    private void I() {
        D();
        postDelayed(this.Q, 600L);
    }

    private void K() {
        D();
        this.Q.run();
    }

    private boolean R(float f6) {
        this.N.fling(0, 0, 0, (int) f6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.N.getFinalY() > this.f790r.getHeight();
    }

    private void b() {
        D();
        this.R.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean c(@androidx.annotation.o0 android.view.View r3, @androidx.annotation.o0 android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.c(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int B() {
        ActionBarContainer actionBarContainer = this.f790r;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    void D() {
        removeCallbacks(this.Q);
        removeCallbacks(this.R);
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean F() {
        return this.f796x;
    }

    public boolean G() {
        return this.f794v;
    }

    void J() {
        if (this.f789q == null) {
            this.f789q = (ContentFrameLayout) findViewById(a.h.I);
            this.f790r = (ActionBarContainer) findViewById(a.h.J);
            this.f791s = C(findViewById(a.h.H));
        }
    }

    public void L(int i5) {
        D();
        this.f790r.setTranslationY(-Math.max(0, Math.min(i5, this.f790r.getHeight())));
    }

    public void M(d dVar) {
        this.M = dVar;
        if (getWindowToken() != null) {
            this.M.onWindowVisibilityChanged(this.f788p);
            int i5 = this.A;
            if (i5 != 0) {
                onWindowSystemUiVisibilityChanged(i5);
                y1.v1(this);
            }
        }
    }

    public void N(boolean z5) {
        this.f795w = z5;
    }

    public void O(boolean z5) {
        if (z5 != this.f796x) {
            this.f796x = z5;
            if (z5) {
                return;
            }
            D();
            L(0);
        }
    }

    public void P(boolean z5) {
        this.f794v = z5;
        this.f793u = z5 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void Q(boolean z5) {
    }

    @Override // androidx.appcompat.widget.x
    public void a(Menu menu, n.a aVar) {
        J();
        this.f791s.a(menu, aVar);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i5;
        super.draw(canvas);
        if (this.f792t == null || this.f793u) {
            return;
        }
        if (this.f790r.getVisibility() == 0) {
            i5 = (int) (this.f790r.getTranslationY() + this.f790r.getBottom() + 0.5f);
        } else {
            i5 = 0;
        }
        this.f792t.setBounds(0, i5, getWidth(), this.f792t.getIntrinsicHeight() + i5);
        this.f792t.draw(canvas);
    }

    @Override // androidx.appcompat.widget.x
    public void e(CharSequence charSequence) {
        J();
        this.f791s.e(charSequence);
    }

    @Override // androidx.appcompat.widget.x
    public boolean f() {
        J();
        return this.f791s.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.x
    public void g() {
        J();
        this.f791s.g();
    }

    @Override // android.view.ViewGroup, androidx.core.view.m1
    public int getNestedScrollAxes() {
        return this.S.a();
    }

    @Override // androidx.appcompat.widget.x
    public CharSequence getTitle() {
        J();
        return this.f791s.getTitle();
    }

    @Override // androidx.appcompat.widget.x
    public void h(int i5) {
        J();
        this.f791s.h(i5);
    }

    @Override // androidx.appcompat.widget.x
    public boolean i() {
        J();
        return this.f791s.i();
    }

    @Override // androidx.appcompat.widget.x
    public boolean j() {
        J();
        return this.f791s.j();
    }

    @Override // androidx.appcompat.widget.x
    public void k(Window.Callback callback) {
        J();
        this.f791s.k(callback);
    }

    @Override // androidx.core.view.l1
    public void l(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        v(view, i5, i6, i7, i8, i9);
    }

    @Override // androidx.appcompat.widget.x
    public boolean m() {
        J();
        return this.f791s.m();
    }

    @Override // androidx.appcompat.widget.x
    public boolean n() {
        J();
        return this.f791s.n();
    }

    @Override // androidx.appcompat.widget.x
    public boolean o() {
        J();
        return this.f791s.o();
    }

    @Override // android.view.View
    @androidx.annotation.x0(21)
    public WindowInsets onApplyWindowInsets(@androidx.annotation.o0 WindowInsets windowInsets) {
        J();
        v4 L = v4.L(windowInsets, this);
        boolean c6 = c(this.f790r, new Rect(L.p(), L.r(), L.q(), L.o()), true, true, false, true);
        y1.o(this, L, this.B);
        Rect rect = this.B;
        v4 x5 = L.x(rect.left, rect.top, rect.right, rect.bottom);
        this.I = x5;
        boolean z5 = true;
        if (!this.J.equals(x5)) {
            this.J = this.I;
            c6 = true;
        }
        if (this.C.equals(this.B)) {
            z5 = c6;
        } else {
            this.C.set(this.B);
        }
        if (z5) {
            requestLayout();
        }
        return L.a().c().b().J();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        E(getContext());
        y1.v1(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        D();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i10, i11, measuredWidth + i10, measuredHeight + i11);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        int measuredHeight;
        J();
        measureChildWithMargins(this.f790r, i5, 0, i6, 0);
        LayoutParams layoutParams = (LayoutParams) this.f790r.getLayoutParams();
        int max = Math.max(0, this.f790r.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = Math.max(0, this.f790r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f790r.getMeasuredState());
        boolean z5 = (y1.C0(this) & 256) != 0;
        if (z5) {
            measuredHeight = this.f787o;
            if (this.f795w && this.f790r.b() != null) {
                measuredHeight += this.f787o;
            }
        } else {
            measuredHeight = this.f790r.getVisibility() != 8 ? this.f790r.getMeasuredHeight() : 0;
        }
        this.D.set(this.B);
        v4 v4Var = this.I;
        this.K = v4Var;
        if (this.f794v || z5) {
            this.K = new v4.b(this.K).h(w1.d(v4Var.p(), this.K.r() + measuredHeight, this.K.q(), this.K.o() + 0)).a();
        } else {
            Rect rect = this.D;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.K = v4Var.x(0, measuredHeight, 0, 0);
        }
        c(this.f789q, this.D, true, true, true, true);
        if (!this.L.equals(this.K)) {
            v4 v4Var2 = this.K;
            this.L = v4Var2;
            y1.p(this.f789q, v4Var2);
        }
        measureChildWithMargins(this.f789q, i5, 0, i6, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f789q.getLayoutParams();
        int max3 = Math.max(max, this.f789q.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = Math.max(max2, this.f789q.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f789q.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i5, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i6, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        if (!this.f796x || !z5) {
            return false;
        }
        if (R(f7)) {
            b();
        } else {
            K();
        }
        this.f797y = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onNestedPreFling(View view, float f6, float f7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        int i9 = this.f798z + i6;
        this.f798z = i9;
        L(i9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onNestedScrollAccepted(View view, View view2, int i5) {
        this.S.b(view, view2, i5);
        this.f798z = B();
        D();
        d dVar = this.M;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onStartNestedScroll(View view, View view2, int i5) {
        if ((i5 & 2) == 0 || this.f790r.getVisibility() != 0) {
            return false;
        }
        return this.f796x;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onStopNestedScroll(View view) {
        if (this.f796x && !this.f797y) {
            if (this.f798z <= this.f790r.getHeight()) {
                I();
            } else {
                H();
            }
        }
        d dVar = this.M;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i5) {
        super.onWindowSystemUiVisibilityChanged(i5);
        J();
        int i6 = this.A ^ i5;
        this.A = i5;
        boolean z5 = (i5 & 4) == 0;
        boolean z6 = (i5 & 256) != 0;
        d dVar = this.M;
        if (dVar != null) {
            dVar.c(!z6);
            if (z5 || !z6) {
                this.M.a();
            } else {
                this.M.d();
            }
        }
        if ((i6 & 256) == 0 || this.M == null) {
            return;
        }
        y1.v1(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
        this.f788p = i5;
        d dVar = this.M;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i5);
        }
    }

    @Override // androidx.appcompat.widget.x
    public boolean p() {
        J();
        return this.f791s.p();
    }

    @Override // androidx.appcompat.widget.x
    public void q(int i5) {
    }

    @Override // androidx.appcompat.widget.x
    public void r(SparseArray<Parcelable> sparseArray) {
        J();
        this.f791s.B(sparseArray);
    }

    @Override // androidx.appcompat.widget.x
    public void s(int i5) {
        J();
        if (i5 == 2) {
            this.f791s.U();
        } else if (i5 == 5) {
            this.f791s.W();
        } else {
            if (i5 != 109) {
                return;
            }
            P(true);
        }
    }

    @Override // androidx.appcompat.widget.x
    public void setIcon(int i5) {
        J();
        this.f791s.setIcon(i5);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.x
    public void t() {
        J();
        this.f791s.r();
    }

    @Override // androidx.appcompat.widget.x
    public void u(SparseArray<Parcelable> sparseArray) {
        J();
        this.f791s.O(sparseArray);
    }

    @Override // androidx.core.view.k1
    public void v(View view, int i5, int i6, int i7, int i8, int i9) {
        if (i9 == 0) {
            onNestedScroll(view, i5, i6, i7, i8);
        }
    }

    @Override // androidx.core.view.k1
    public boolean w(View view, View view2, int i5, int i6) {
        return i6 == 0 && onStartNestedScroll(view, view2, i5);
    }

    @Override // androidx.core.view.k1
    public void x(View view, View view2, int i5, int i6) {
        if (i6 == 0) {
            onNestedScrollAccepted(view, view2, i5);
        }
    }

    @Override // androidx.core.view.k1
    public void y(View view, int i5) {
        if (i5 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.k1
    public void z(View view, int i5, int i6, int[] iArr, int i7) {
        if (i7 == 0) {
            onNestedPreScroll(view, i5, i6, iArr);
        }
    }

    public ActionBarOverlayLayout(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f788p = 0;
        this.B = new Rect();
        this.C = new Rect();
        this.D = new Rect();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new Rect();
        this.H = new Rect();
        v4 v4Var = v4.f5691c;
        this.I = v4Var;
        this.J = v4Var;
        this.K = v4Var;
        this.L = v4Var;
        this.P = new a();
        this.Q = new b();
        this.R = new c();
        E(context);
        this.S = new n1(this);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.x
    public void setIcon(Drawable drawable) {
        J();
        this.f791s.setIcon(drawable);
    }
}
