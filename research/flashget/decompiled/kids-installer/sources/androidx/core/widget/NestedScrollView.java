package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.view.accessibility.g0;
import androidx.core.view.accessibility.l0;
import androidx.core.view.f1;
import androidx.core.view.h1;
import androidx.core.view.j1;
import androidx.core.view.l1;
import androidx.core.view.n1;
import androidx.core.view.u1;
import androidx.core.view.y1;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import k.a;

/* loaded from: classes3.dex */
public class NestedScrollView extends FrameLayout implements l1, h1, u1 {
    static final int O = 250;
    static final float P = 0.5f;
    private static final int R = 250;
    private static final int S = -1;
    private boolean A;
    private int B;
    private int C;
    private int D;
    private int E;
    private final int[] F;
    private final int[] G;
    private int H;
    private int I;
    private SavedState J;
    private final n1 K;
    private final j1 L;
    private float M;
    private c N;

    /* renamed from: o, reason: collision with root package name */
    private long f5837o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f5838p;

    /* renamed from: q, reason: collision with root package name */
    private OverScroller f5839q;

    /* renamed from: r, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    @o0
    @m1
    public EdgeEffect f5840r;

    /* renamed from: s, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    @o0
    @m1
    public EdgeEffect f5841s;

    /* renamed from: t, reason: collision with root package name */
    private int f5842t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f5843u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f5844v;

    /* renamed from: w, reason: collision with root package name */
    private View f5845w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f5846x;

    /* renamed from: y, reason: collision with root package name */
    private VelocityTracker f5847y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f5848z;
    private static final String Q = "NestedScrollView";
    private static final a T = new a();
    private static final int[] U = {R.attr.fillViewport};

    /* loaded from: classes.dex */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        public int f5849o;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @o0
        public String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return androidx.constraintlayout.solver.e.a(sb, this.f5849o, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f5849o);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f5849o = parcel.readInt();
        }
    }

    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.A() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            l0.N(accessibilityEvent, nestedScrollView.getScrollX());
            l0.P(accessibilityEvent, nestedScrollView.A());
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.g0 g0Var) {
            int A;
            super.g(view, g0Var);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            g0Var.W0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (A = nestedScrollView.A()) <= 0) {
                return;
            }
            g0Var.F1(true);
            if (nestedScrollView.getScrollY() > 0) {
                g0Var.b(g0.a.f5386s);
                g0Var.b(g0.a.D);
            }
            if (nestedScrollView.getScrollY() < A) {
                g0Var.b(g0.a.f5385r);
                g0Var.b(g0.a.F);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i5, Bundle bundle) {
            if (super.j(view, i5, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i5 != 4096) {
                if (i5 == 8192 || i5 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.e0(0, max, true);
                    return true;
                }
                if (i5 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.A());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.e0(0, min, true);
            return true;
        }
    }

    @x0(21)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(@o0 NestedScrollView nestedScrollView, int i5, int i6, int i7, int i8);
    }

    public NestedScrollView(@o0 Context context) {
        this(context, null);
    }

    private float B() {
        if (this.M == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.M = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.M;
    }

    private boolean C(int i5, int i6) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i6 >= childAt.getTop() - scrollY && i6 < childAt.getBottom() - scrollY && i5 >= childAt.getLeft() && i5 < childAt.getRight();
    }

    private void D() {
        VelocityTracker velocityTracker = this.f5847y;
        if (velocityTracker == null) {
            this.f5847y = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void E() {
        this.f5839q = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.B = viewConfiguration.getScaledTouchSlop();
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        this.D = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void F() {
        if (this.f5847y == null) {
            this.f5847y = VelocityTracker.obtain();
        }
    }

    private boolean H(View view) {
        return !K(view, 0, getHeight());
    }

    private static boolean J(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && J((View) parent, view2);
    }

    private boolean K(View view, int i5, int i6) {
        view.getDrawingRect(this.f5838p);
        offsetDescendantRectToMyCoords(view, this.f5838p);
        return this.f5838p.bottom + i5 >= getScrollY() && this.f5838p.top - i5 <= getScrollY() + i6;
    }

    private void L(int i5, int i6, @q0 int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i5);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.L.e(0, scrollY2, 0, i5 - scrollY2, null, i6, iArr);
    }

    private void M(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.E) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.f5842t = (int) motionEvent.getY(i5);
            this.E = motionEvent.getPointerId(i5);
            VelocityTracker velocityTracker = this.f5847y;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void P() {
        VelocityTracker velocityTracker = this.f5847y;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5847y = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int Q(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f5840r
            float r0 = androidx.core.widget.i.d(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f5840r
            float r4 = -r4
            float r4 = androidx.core.widget.i.j(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f5840r
            float r5 = androidx.core.widget.i.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f5840r
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f5841s
            float r0 = androidx.core.widget.i.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f5841s
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.i.j(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f5841s
            float r5 = androidx.core.widget.i.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f5841s
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.Q(int, float):int");
    }

    private void R(boolean z5) {
        if (z5) {
            f(2, 1);
        } else {
            g(1);
        }
        this.I = getScrollY();
        y1.n1(this);
    }

    private boolean S(int i5, int i6, int i7) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        boolean z5 = false;
        boolean z6 = i5 == 33;
        View r5 = r(z6, i6, i7);
        if (r5 == null) {
            r5 = this;
        }
        if (i6 < scrollY || i7 > i8) {
            n(z6 ? i6 - scrollY : i7 - i8);
            z5 = true;
        }
        if (r5 != findFocus()) {
            r5.requestFocus(i5);
        }
        return z5;
    }

    private void T(View view) {
        view.getDrawingRect(this.f5838p);
        offsetDescendantRectToMyCoords(view, this.f5838p);
        int m5 = m(this.f5838p);
        if (m5 != 0) {
            scrollBy(0, m5);
        }
    }

    private boolean U(Rect rect, boolean z5) {
        int m5 = m(rect);
        boolean z6 = m5 != 0;
        if (z6) {
            if (z5) {
                scrollBy(0, m5);
            } else {
                Y(0, m5);
            }
        }
        return z6;
    }

    private void a0(int i5, int i6, int i7, boolean z5) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f5837o > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f5839q.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i6 + scrollY, Math.max(0, height - height2))) - scrollY, i7);
            R(z5);
        } else {
            if (!this.f5839q.isFinished()) {
                e();
            }
            scrollBy(i5, i6);
        }
        this.f5837o = AnimationUtils.currentAnimationTimeMillis();
    }

    private void e() {
        this.f5839q.abortAnimation();
        g(1);
    }

    private boolean f0(MotionEvent motionEvent) {
        boolean z5;
        if (i.d(this.f5840r) != 0.0f) {
            i.j(this.f5840r, 0.0f, motionEvent.getX() / getWidth());
            z5 = true;
        } else {
            z5 = false;
        }
        if (i.d(this.f5841s) == 0.0f) {
            return z5;
        }
        i.j(this.f5841s, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private boolean i() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && A() > 0;
        }
        return true;
    }

    private boolean j() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int k(int i5, int i6, int i7) {
        if (i6 >= i7 || i5 < 0) {
            return 0;
        }
        return i6 + i5 > i7 ? i7 - i6 : i5;
    }

    private void n(int i5) {
        if (i5 != 0) {
            if (this.A) {
                Y(0, i5);
            } else {
                scrollBy(0, i5);
            }
        }
    }

    private boolean o(int i5) {
        if (i.d(this.f5840r) != 0.0f) {
            this.f5840r.onAbsorb(i5);
        } else {
            if (i.d(this.f5841s) == 0.0f) {
                return false;
            }
            this.f5841s.onAbsorb(-i5);
        }
        return true;
    }

    private void p() {
        this.f5846x = false;
        P();
        g(0);
        this.f5840r.onRelease();
        this.f5841s.onRelease();
    }

    private View r(boolean z5, int i5, int i6) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z7 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z6 = z7;
                } else {
                    boolean z8 = (z5 && top < view.getTop()) || (!z5 && bottom > view.getBottom());
                    if (z6) {
                        if (z7) {
                            if (!z8) {
                            }
                            view = view2;
                        }
                    } else if (z7) {
                        view = view2;
                        z6 = true;
                    } else {
                        if (!z8) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    int A() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public boolean G() {
        return this.f5848z;
    }

    public boolean I() {
        return this.A;
    }

    boolean N(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z5) {
        boolean z6;
        boolean z7;
        int overScrollMode = getOverScrollMode();
        boolean z8 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z9 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z10 = overScrollMode == 0 || (overScrollMode == 1 && z8);
        boolean z11 = overScrollMode == 0 || (overScrollMode == 1 && z9);
        int i13 = i7 + i5;
        int i14 = !z10 ? 0 : i11;
        int i15 = i8 + i6;
        int i16 = !z11 ? 0 : i12;
        int i17 = -i14;
        int i18 = i14 + i9;
        int i19 = -i16;
        int i20 = i16 + i10;
        if (i13 > i18) {
            i13 = i18;
            z6 = true;
        } else if (i13 < i17) {
            z6 = true;
            i13 = i17;
        } else {
            z6 = false;
        }
        if (i15 > i20) {
            i15 = i20;
            z7 = true;
        } else if (i15 < i19) {
            z7 = true;
            i15 = i19;
        } else {
            z7 = false;
        }
        if (z7 && !d(1)) {
            this.f5839q.springBack(i13, i15, 0, 0, 0, A());
        }
        onOverScrolled(i13, i15, z6, z7);
        return z6 || z7;
    }

    public boolean O(int i5) {
        boolean z5 = i5 == 130;
        int height = getHeight();
        if (z5) {
            this.f5838p.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                Rect rect = this.f5838p;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            this.f5838p.top = getScrollY() - height;
            Rect rect2 = this.f5838p;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f5838p;
        int i6 = rect3.top;
        int i7 = height + i6;
        rect3.bottom = i7;
        return S(i5, i6, i7);
    }

    public void V(boolean z5) {
        if (z5 != this.f5848z) {
            this.f5848z = z5;
            requestLayout();
        }
    }

    public void W(@q0 c cVar) {
        this.N = cVar;
    }

    public void X(boolean z5) {
        this.A = z5;
    }

    public final void Y(int i5, int i6) {
        a0(i5, i6, o.f.f9513c, false);
    }

    public final void Z(int i5, int i6, int i7) {
        a0(i5, i6, i7, false);
    }

    @Override // androidx.core.view.g1
    public boolean a(int i5, int i6, int i7, int i8, @q0 int[] iArr, int i9) {
        return this.L.g(i5, i6, i7, i8, iArr, i9);
    }

    @Override // android.view.ViewGroup
    public void addView(@o0 View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // androidx.core.view.g1
    public boolean b(int i5, int i6, @q0 int[] iArr, @q0 int[] iArr2, int i7) {
        return this.L.d(i5, i6, iArr, iArr2, i7);
    }

    public final void b0(int i5, int i6) {
        d0(i5, i6, o.f.f9513c, false);
    }

    @Override // androidx.core.view.h1
    public void c(int i5, int i6, int i7, int i8, @q0 int[] iArr, int i9, @o0 int[] iArr2) {
        this.L.e(i5, i6, i7, i8, iArr, i9, iArr2);
    }

    public final void c0(int i5, int i6, int i7) {
        d0(i5, i6, i7, false);
    }

    @Override // android.view.View, androidx.core.view.u1
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.u1
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.u1
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f5839q.isFinished()) {
            return;
        }
        this.f5839q.computeScrollOffset();
        int currY = this.f5839q.getCurrY();
        int i5 = currY - this.I;
        this.I = currY;
        int[] iArr = this.G;
        boolean z5 = false;
        iArr[1] = 0;
        b(0, i5, iArr, null, 1);
        int i6 = i5 - this.G[1];
        int A = A();
        if (i6 != 0) {
            int scrollY = getScrollY();
            N(0, i6, getScrollX(), scrollY, 0, A, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i7 = i6 - scrollY2;
            int[] iArr2 = this.G;
            iArr2[1] = 0;
            c(0, scrollY2, 0, i7, this.F, 1, iArr2);
            i6 = i7 - this.G[1];
        }
        if (i6 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && A > 0)) {
                z5 = true;
            }
            if (z5) {
                if (i6 < 0) {
                    if (this.f5840r.isFinished()) {
                        this.f5840r.onAbsorb((int) this.f5839q.getCurrVelocity());
                    }
                } else if (this.f5841s.isFinished()) {
                    this.f5841s.onAbsorb((int) this.f5839q.getCurrVelocity());
                }
            }
            e();
        }
        if (this.f5839q.isFinished()) {
            g(1);
        } else {
            y1.n1(this);
        }
    }

    @Override // android.view.View, androidx.core.view.u1
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.u1
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.u1
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // androidx.core.view.g1
    public boolean d(int i5) {
        return this.L.l(i5);
    }

    void d0(int i5, int i6, int i7, boolean z5) {
        a0(i5 - getScrollX(), i6 - getScrollY(), i7, z5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || q(keyEvent);
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean dispatchNestedFling(float f6, float f7, boolean z5) {
        return this.L.a(f6, f7, z5);
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean dispatchNestedPreFling(float f6, float f7) {
        return this.L.b(f6, f7);
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean dispatchNestedPreScroll(int i5, int i6, @q0 int[] iArr, @q0 int[] iArr2) {
        return b(i5, i6, iArr, iArr2, 0);
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean dispatchNestedScroll(int i5, int i6, int i7, int i8, @q0 int[] iArr) {
        return this.L.f(i5, i6, i7, i8, iArr);
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        int i5;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i6 = 0;
        if (!this.f5840r.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i5 = getPaddingLeft() + 0;
            } else {
                i5 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i5, min);
            this.f5840r.setSize(width, height);
            if (this.f5840r.draw(canvas)) {
                y1.n1(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f5841s.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(A(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i6 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i6 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f5841s.setSize(width2, height2);
        if (this.f5841s.draw(canvas)) {
            y1.n1(this);
        }
        canvas.restoreToCount(save2);
    }

    void e0(int i5, int i6, boolean z5) {
        d0(i5, i6, o.f.f9513c, z5);
    }

    @Override // androidx.core.view.g1
    public boolean f(int i5, int i6) {
        return this.L.s(i5, i6);
    }

    @Override // androidx.core.view.g1
    public void g(int i5) {
        this.L.u(i5);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup, androidx.core.view.m1
    public int getNestedScrollAxes() {
        return this.K.a();
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public boolean h(int i5) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i5);
        int u5 = u();
        if (findNextFocus == null || !K(findNextFocus, u5, getHeight())) {
            if (i5 == 33 && getScrollY() < u5) {
                u5 = getScrollY();
            } else if (i5 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                u5 = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), u5);
            }
            if (u5 == 0) {
                return false;
            }
            if (i5 != 130) {
                u5 = -u5;
            }
            n(u5);
        } else {
            findNextFocus.getDrawingRect(this.f5838p);
            offsetDescendantRectToMyCoords(findNextFocus, this.f5838p);
            n(m(this.f5838p));
            findNextFocus.requestFocus(i5);
        }
        if (findFocus == null || !findFocus.isFocused() || !H(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean hasNestedScrollingParent() {
        return d(0);
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean isNestedScrollingEnabled() {
        return this.L.m();
    }

    @Override // androidx.core.view.l1
    public void l(@o0 View view, int i5, int i6, int i7, int i8, int i9, @o0 int[] iArr) {
        L(i8, i9, iArr);
    }

    protected int m(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i6 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i5 - verticalFadingEdgeLength : i5;
        int i7 = rect.bottom;
        if (i7 > i6 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i6) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        }
        if (rect.top >= scrollY || i7 >= i6) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i6 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup
    protected void measureChild(@o0 View view, int i5, int i6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5844v = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(@o0 MotionEvent motionEvent) {
        boolean z5;
        int i5 = 0;
        if (motionEvent.getAction() == 8 && !this.f5846x) {
            float axisValue = f1.l(motionEvent, 2) ? motionEvent.getAxisValue(9) : f1.l(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            if (axisValue != 0.0f) {
                int B = (int) (axisValue * B());
                int A = A();
                int scrollY = getScrollY();
                int i6 = scrollY - B;
                if (i6 < 0) {
                    if (i() && !f1.l(motionEvent, 8194)) {
                        i.j(this.f5840r, (-i6) / getHeight(), 0.5f);
                        this.f5840r.onRelease();
                        invalidate();
                        z5 = 1;
                    } else {
                        z5 = 0;
                    }
                } else if (i6 > A) {
                    if (i() && !f1.l(motionEvent, 8194)) {
                        i.j(this.f5841s, (i6 - A) / getHeight(), 0.5f);
                        this.f5841s.onRelease();
                        invalidate();
                        i5 = 1;
                    }
                    z5 = i5;
                    i5 = A;
                } else {
                    z5 = 0;
                    i5 = i6;
                }
                if (i5 == scrollY) {
                    return z5;
                }
                super.scrollTo(getScrollX(), i5);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@o0 MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        boolean z5 = true;
        if (action == 2 && this.f5846x) {
            return true;
        }
        int i5 = action & 255;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = this.E;
                    if (i6 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i6)) != -1) {
                        int y5 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y5 - this.f5842t) > this.B && (2 & getNestedScrollAxes()) == 0) {
                            this.f5846x = true;
                            this.f5842t = y5;
                            F();
                            this.f5847y.addMovement(motionEvent);
                            this.H = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i5 != 3) {
                    if (i5 == 6) {
                        M(motionEvent);
                    }
                }
            }
            this.f5846x = false;
            this.E = -1;
            P();
            if (this.f5839q.springBack(getScrollX(), getScrollY(), 0, 0, 0, A())) {
                y1.n1(this);
            }
            g(0);
        } else {
            int y6 = (int) motionEvent.getY();
            if (C((int) motionEvent.getX(), y6)) {
                this.f5842t = y6;
                this.E = motionEvent.getPointerId(0);
                D();
                this.f5847y.addMovement(motionEvent);
                this.f5839q.computeScrollOffset();
                if (!f0(motionEvent) && this.f5839q.isFinished()) {
                    z5 = false;
                }
                this.f5846x = z5;
                f(2, 0);
            } else {
                if (!f0(motionEvent) && this.f5839q.isFinished()) {
                    z5 = false;
                }
                this.f5846x = z5;
                P();
            }
        }
        return this.f5846x;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        int i9 = 0;
        this.f5843u = false;
        View view = this.f5845w;
        if (view != null && J(view, this)) {
            T(this.f5845w);
        }
        this.f5845w = null;
        if (!this.f5844v) {
            if (this.J != null) {
                scrollTo(getScrollX(), this.J.f5849o);
                this.J = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i9 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i8 - i6) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int k5 = k(scrollY, paddingTop, i9);
            if (k5 != scrollY) {
                scrollTo(getScrollX(), k5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f5844v = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (this.f5848z && View.MeasureSpec.getMode(i6) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onNestedFling(@o0 View view, float f6, float f7, boolean z5) {
        if (z5) {
            return false;
        }
        dispatchNestedFling(0.0f, f7, true);
        s((int) f7);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onNestedPreFling(@o0 View view, float f6, float f7) {
        return dispatchNestedPreFling(f6, f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onNestedPreScroll(@o0 View view, int i5, int i6, @o0 int[] iArr) {
        z(view, i5, i6, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onNestedScroll(@o0 View view, int i5, int i6, int i7, int i8) {
        L(i8, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onNestedScrollAccepted(@o0 View view, @o0 View view2, int i5) {
        x(view, view2, i5, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i5, int i6, boolean z5, boolean z6) {
        super.scrollTo(i5, i6);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i5, Rect rect) {
        if (i5 == 2) {
            i5 = 130;
        } else if (i5 == 1) {
            i5 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i5) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i5);
        if (findNextFocus == null || H(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i5, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.J = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @o0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5849o = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i5, int i6, int i7, int i8) {
        super.onScrollChanged(i5, i6, i7, i8);
        c cVar = this.N;
        if (cVar != null) {
            cVar.a(this, i5, i6, i7, i8);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !K(findFocus, 0, i8)) {
            return;
        }
        findFocus.getDrawingRect(this.f5838p);
        offsetDescendantRectToMyCoords(findFocus, this.f5838p);
        n(m(this.f5838p));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onStartNestedScroll(@o0 View view, @o0 View view2, int i5) {
        return w(view, view2, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onStopNestedScroll(@o0 View view) {
        y(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01b9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.o0 android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean q(@o0 KeyEvent keyEvent) {
        this.f5838p.setEmpty();
        if (!j()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? h(33) : t(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? h(130) : t(130);
        }
        if (keyCode != 62) {
            return false;
        }
        O(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f5843u) {
            this.f5845w = view2;
        } else {
            T(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@o0 View view, Rect rect, boolean z5) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return U(rect, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        if (z5) {
            P();
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f5843u = true;
        super.requestLayout();
    }

    public void s(int i5) {
        if (getChildCount() > 0) {
            this.f5839q.fling(getScrollX(), getScrollY(), 0, i5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            R(true);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i5, int i6) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int k5 = k(i5, width, width2);
            int k6 = k(i6, height, height2);
            if (k5 == getScrollX() && k6 == getScrollY()) {
                return;
            }
            super.scrollTo(k5, k6);
        }
    }

    @Override // android.view.View, androidx.core.view.i1
    public void setNestedScrollingEnabled(boolean z5) {
        this.L.p(z5);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean startNestedScroll(int i5) {
        return f(i5, 0);
    }

    @Override // android.view.View, androidx.core.view.i1
    public void stopNestedScroll() {
        g(0);
    }

    public boolean t(int i5) {
        int childCount;
        boolean z5 = i5 == 130;
        int height = getHeight();
        Rect rect = this.f5838p;
        rect.top = 0;
        rect.bottom = height;
        if (z5 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f5838p.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f5838p;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f5838p;
        return S(i5, rect3.top, rect3.bottom);
    }

    public int u() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // androidx.core.view.k1
    public void v(@o0 View view, int i5, int i6, int i7, int i8, int i9) {
        L(i8, i9, null);
    }

    @Override // androidx.core.view.k1
    public boolean w(@o0 View view, @o0 View view2, int i5, int i6) {
        return (i5 & 2) != 0;
    }

    @Override // androidx.core.view.k1
    public void x(@o0 View view, @o0 View view2, int i5, int i6) {
        this.K.c(view, view2, i5, i6);
        f(2, i6);
    }

    @Override // androidx.core.view.k1
    public void y(@o0 View view, int i5) {
        this.K.e(view, i5);
        g(i5);
    }

    @Override // androidx.core.view.k1
    public void z(@o0 View view, int i5, int i6, @o0 int[] iArr, int i7) {
        b(i5, i6, iArr, null, i7);
    }

    public NestedScrollView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0251a.f22931n);
    }

    public NestedScrollView(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f5838p = new Rect();
        this.f5843u = true;
        this.f5844v = false;
        this.f5845w = null;
        this.f5846x = false;
        this.A = true;
        this.E = -1;
        this.F = new int[2];
        this.G = new int[2];
        this.f5840r = i.a(context, attributeSet);
        this.f5841s = i.a(context, attributeSet);
        E();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U, i5, 0);
        V(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.K = new n1(this);
        this.L = new j1(this);
        setNestedScrollingEnabled(true);
        y1.B1(this, T);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5) {
        if (getChildCount() <= 0) {
            super.addView(view, i5);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i5, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
