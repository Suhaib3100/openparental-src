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
import androidx.appcompat.view.menu.o;
import androidx.core.view.j3;
import androidx.core.view.x1;
import d.a;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements u, androidx.core.view.b1, androidx.core.view.z0, androidx.core.view.a1 {
    private static final int H = 600;
    private OverScroller A;
    ViewPropertyAnimator B;
    final AnimatorListenerAdapter C;
    private final Runnable D;
    private final Runnable E;
    private final androidx.core.view.c1 F;

    /* renamed from: b, reason: collision with root package name */
    private int f1354b;

    /* renamed from: c, reason: collision with root package name */
    private int f1355c;

    /* renamed from: d, reason: collision with root package name */
    private ContentFrameLayout f1356d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f1357e;

    /* renamed from: f, reason: collision with root package name */
    private v f1358f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f1359g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1360h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1361i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1362j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1363k;

    /* renamed from: l, reason: collision with root package name */
    boolean f1364l;

    /* renamed from: m, reason: collision with root package name */
    private int f1365m;

    /* renamed from: n, reason: collision with root package name */
    private int f1366n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f1367o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f1368p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f1369q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f1370r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f1371s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f1372t;

    /* renamed from: u, reason: collision with root package name */
    private final Rect f1373u;

    /* renamed from: v, reason: collision with root package name */
    @androidx.annotation.o0
    private j3 f1374v;

    /* renamed from: w, reason: collision with root package name */
    @androidx.annotation.o0
    private j3 f1375w;

    /* renamed from: x, reason: collision with root package name */
    @androidx.annotation.o0
    private j3 f1376x;

    /* renamed from: y, reason: collision with root package name */
    @androidx.annotation.o0
    private j3 f1377y;

    /* renamed from: z, reason: collision with root package name */
    private d f1378z;
    private static final String G = "ActionBarOverlayLayout";
    static final int[] I = {a.b.f72962d, R.attr.windowContentOverlay};

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f1364l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f1364l = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.A();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f1357e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.A();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f1357e.animate().translationY(-ActionBarOverlayLayout.this.f1357e.getHeight()).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public interface d {
        void a();

        void b(int i4);

        void c();

        void d(boolean z4);

        void e();

        void f();
    }

    public ActionBarOverlayLayout(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private void B(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(I);
        this.f1354b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1359g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1360h = context.getApplicationInfo().targetSdkVersion < 19;
        this.A = new OverScroller(context);
    }

    private void E() {
        A();
        postDelayed(this.E, 600L);
    }

    private void F() {
        A();
        postDelayed(this.D, 600L);
    }

    private void H() {
        A();
        this.D.run();
    }

    private boolean O(float f4) {
        this.A.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.A.getFinalY() > this.f1357e.getHeight();
    }

    private void a() {
        A();
        this.E.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean s(@androidx.annotation.o0 android.view.View r3, @androidx.annotation.o0 android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.s(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v z(View view) {
        if (view instanceof v) {
            return (v) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).c0();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of ".concat(view.getClass().getSimpleName()));
    }

    void A() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean C() {
        return this.f1363k;
    }

    public boolean D() {
        return this.f1361i;
    }

    void G() {
        if (this.f1356d == null) {
            this.f1356d = (ContentFrameLayout) findViewById(a.g.f73238b);
            this.f1357e = (ActionBarContainer) findViewById(a.g.f73240c);
            this.f1358f = z(findViewById(a.g.f73236a));
        }
    }

    public void I(int i4) {
        A();
        this.f1357e.setTranslationY(-Math.max(0, Math.min(i4, this.f1357e.getHeight())));
    }

    public void J(d dVar) {
        this.f1378z = dVar;
        if (getWindowToken() != null) {
            this.f1378z.b(this.f1355c);
            int i4 = this.f1366n;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                x1.B1(this);
            }
        }
    }

    public void K(boolean z4) {
        this.f1362j = z4;
    }

    public void L(boolean z4) {
        if (z4 != this.f1363k) {
            this.f1363k = z4;
            if (z4) {
                return;
            }
            A();
            I(0);
        }
    }

    public void M(boolean z4) {
        this.f1361i = z4;
        this.f1360h = z4 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void N(boolean z4) {
    }

    @Override // androidx.appcompat.widget.u
    public boolean b() {
        G();
        return this.f1358f.b();
    }

    @Override // androidx.appcompat.widget.u
    public boolean c() {
        G();
        return this.f1358f.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.appcompat.widget.u
    public boolean d() {
        G();
        return this.f1358f.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        if (this.f1359g == null || this.f1360h) {
            return;
        }
        if (this.f1357e.getVisibility() == 0) {
            i4 = (int) (this.f1357e.getTranslationY() + this.f1357e.getBottom() + 0.5f);
        } else {
            i4 = 0;
        }
        this.f1359g.setBounds(0, i4, getWidth(), this.f1359g.getIntrinsicHeight() + i4);
        this.f1359g.draw(canvas);
    }

    @Override // androidx.appcompat.widget.u
    public boolean e() {
        G();
        return this.f1358f.e();
    }

    @Override // androidx.appcompat.widget.u
    public void f(Menu menu, o.a aVar) {
        G();
        this.f1358f.f(menu, aVar);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.u
    public void g(CharSequence charSequence) {
        G();
        this.f1358f.g(charSequence);
    }

    @Override // android.view.ViewGroup, androidx.core.view.b1
    public int getNestedScrollAxes() {
        return this.F.a();
    }

    @Override // androidx.appcompat.widget.u
    public CharSequence getTitle() {
        G();
        return this.f1358f.getTitle();
    }

    @Override // androidx.appcompat.widget.u
    public boolean h() {
        G();
        return this.f1358f.h();
    }

    @Override // androidx.appcompat.widget.u
    public void i() {
        G();
        this.f1358f.i();
    }

    @Override // androidx.appcompat.widget.u
    public void j(int i4) {
        G();
        this.f1358f.j(i4);
    }

    @Override // androidx.appcompat.widget.u
    public void k(Window.Callback callback) {
        G();
        this.f1358f.k(callback);
    }

    @Override // androidx.appcompat.widget.u
    public boolean l() {
        G();
        return this.f1358f.l();
    }

    @Override // androidx.appcompat.widget.u
    public boolean m() {
        G();
        return this.f1358f.m();
    }

    @Override // androidx.appcompat.widget.u
    public void n(SparseArray<Parcelable> sparseArray) {
        G();
        this.f1358f.K(sparseArray);
    }

    @Override // androidx.appcompat.widget.u
    public void o(int i4) {
        G();
        if (i4 == 2) {
            this.f1358f.B();
        } else if (i4 == 5) {
            this.f1358f.U();
        } else {
            if (i4 != 109) {
                return;
            }
            M(true);
        }
    }

    @Override // androidx.core.view.a1
    public void o0(View view, int i4, int i5, int i6, int i7, int i10, int[] iArr) {
        q0(view, i4, i5, i6, i7, i10);
    }

    @Override // android.view.View
    @androidx.annotation.x0(21)
    public WindowInsets onApplyWindowInsets(@androidx.annotation.o0 WindowInsets windowInsets) {
        G();
        j3 L = j3.L(windowInsets, this);
        boolean s4 = s(this.f1357e, new Rect(L.p(), L.r(), L.q(), L.o()), true, true, false, true);
        x1.o(this, L, this.f1367o);
        Rect rect = this.f1367o;
        j3 x4 = L.x(rect.left, rect.top, rect.right, rect.bottom);
        this.f1374v = x4;
        boolean z4 = true;
        if (!this.f1375w.equals(x4)) {
            this.f1375w = this.f1374v;
            s4 = true;
        }
        if (this.f1368p.equals(this.f1367o)) {
            z4 = s4;
        } else {
            this.f1368p.set(this.f1367o);
        }
        if (z4) {
            requestLayout();
        }
        return L.a().c().b().J();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        B(getContext());
        x1.B1(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int measuredHeight;
        G();
        measureChildWithMargins(this.f1357e, i4, 0, i5, 0);
        LayoutParams layoutParams = (LayoutParams) this.f1357e.getLayoutParams();
        int max = Math.max(0, this.f1357e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = Math.max(0, this.f1357e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1357e.getMeasuredState());
        boolean z4 = (x1.F0(this) & 256) != 0;
        if (z4) {
            measuredHeight = this.f1354b;
            if (this.f1362j && this.f1357e.b() != null) {
                measuredHeight += this.f1354b;
            }
        } else {
            measuredHeight = this.f1357e.getVisibility() != 8 ? this.f1357e.getMeasuredHeight() : 0;
        }
        this.f1369q.set(this.f1367o);
        j3 j3Var = this.f1374v;
        this.f1376x = j3Var;
        if (this.f1361i || z4) {
            this.f1376x = new j3.b(this.f1376x).h(androidx.core.graphics.e0.d(j3Var.p(), this.f1376x.r() + measuredHeight, this.f1376x.q(), this.f1376x.o())).a();
        } else {
            Rect rect = this.f1369q;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f1376x = j3Var.x(0, measuredHeight, 0, 0);
        }
        s(this.f1356d, this.f1369q, true, true, true, true);
        if (!this.f1377y.equals(this.f1376x)) {
            j3 j3Var2 = this.f1376x;
            this.f1377y = j3Var2;
            x1.p(this.f1356d, j3Var2);
        }
        measureChildWithMargins(this.f1356d, i4, 0, i5, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f1356d.getLayoutParams();
        int max3 = Math.max(max, this.f1356d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = Math.max(max2, this.f1356d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1356d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i4, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        if (!this.f1363k || !z4) {
            return false;
        }
        if (O(f5)) {
            a();
        } else {
            H();
        }
        this.f1364l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i10 = this.f1365m + i5;
        this.f1365m = i10;
        I(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        this.F.b(view, view2, i4);
        this.f1365m = w();
        A();
        d dVar = this.f1378z;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f1357e.getVisibility() != 0) {
            return false;
        }
        return this.f1363k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onStopNestedScroll(View view) {
        if (this.f1363k && !this.f1364l) {
            if (this.f1365m <= this.f1357e.getHeight()) {
                F();
            } else {
                E();
            }
        }
        d dVar = this.f1378z;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        G();
        int i5 = this.f1366n ^ i4;
        this.f1366n = i4;
        boolean z4 = (i4 & 4) == 0;
        boolean z5 = (i4 & 256) != 0;
        d dVar = this.f1378z;
        if (dVar != null) {
            dVar.d(!z5);
            if (z4 || !z5) {
                this.f1378z.a();
            } else {
                this.f1378z.e();
            }
        }
        if ((i5 & 256) == 0 || this.f1378z == null) {
            return;
        }
        x1.B1(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.f1355c = i4;
        d dVar = this.f1378z;
        if (dVar != null) {
            dVar.b(i4);
        }
    }

    @Override // androidx.appcompat.widget.u
    public void p(int i4) {
    }

    @Override // androidx.appcompat.widget.u
    public void q() {
        G();
        this.f1358f.F();
    }

    @Override // androidx.core.view.z0
    public void q0(View view, int i4, int i5, int i6, int i7, int i10) {
        if (i10 == 0) {
            onNestedScroll(view, i4, i5, i6, i7);
        }
    }

    @Override // androidx.appcompat.widget.u
    public void r(SparseArray<Parcelable> sparseArray) {
        G();
        this.f1358f.Q(sparseArray);
    }

    @Override // androidx.core.view.z0
    public boolean s0(View view, View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
    }

    @Override // androidx.appcompat.widget.u
    public void setIcon(int i4) {
        G();
        this.f1358f.setIcon(i4);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // androidx.core.view.z0
    public void u(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int w() {
        ActionBarContainer actionBarContainer = this.f1357e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // androidx.core.view.z0
    public void x(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.z0
    public void y(View view, int i4, int i5, int[] iArr, int i6) {
        if (i6 == 0) {
            onNestedPreScroll(view, i4, i5, iArr);
        }
    }

    public ActionBarOverlayLayout(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1355c = 0;
        this.f1367o = new Rect();
        this.f1368p = new Rect();
        this.f1369q = new Rect();
        this.f1370r = new Rect();
        this.f1371s = new Rect();
        this.f1372t = new Rect();
        this.f1373u = new Rect();
        j3 j3Var = j3.f27272c;
        this.f1374v = j3Var;
        this.f1375w = j3Var;
        this.f1376x = j3Var;
        this.f1377y = j3Var;
        this.C = new a();
        this.D = new b();
        this.E = new c();
        B(context);
        this.F = new androidx.core.view.c1();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.u
    public void setIcon(Drawable drawable) {
        G();
        this.f1358f.setIcon(drawable);
    }
}
