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
import androidx.core.view.a1;
import androidx.core.view.accessibility.h0;
import androidx.core.view.j1;
import androidx.core.view.u0;
import androidx.core.view.w0;
import androidx.core.view.x1;
import androidx.core.view.y0;
import com.android.internal.telephony.cdma.UserData;
import java.util.ArrayList;
import z0.a;

/* loaded from: classes3.dex */
public class NestedScrollView extends FrameLayout implements a1, w0, j1 {
    static final int E = 250;
    static final float F = 0.5f;
    private static final int H = 250;
    private static final float I = 0.015f;
    private static final float J = 0.35f;
    private static final float L = 4.0f;
    private static final int M = -1;
    private float A;
    private e B;

    @m1
    final d C;

    @m1
    androidx.core.view.v D;

    /* renamed from: b, reason: collision with root package name */
    private final float f27515b;

    /* renamed from: c, reason: collision with root package name */
    private long f27516c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f27517d;

    /* renamed from: e, reason: collision with root package name */
    private OverScroller f27518e;

    /* renamed from: f, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    @o0
    @m1
    public EdgeEffect f27519f;

    /* renamed from: g, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    @o0
    @m1
    public EdgeEffect f27520g;

    /* renamed from: h, reason: collision with root package name */
    private int f27521h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27522i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f27523j;

    /* renamed from: k, reason: collision with root package name */
    private View f27524k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f27525l;

    /* renamed from: m, reason: collision with root package name */
    private VelocityTracker f27526m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f27527n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f27528o;

    /* renamed from: p, reason: collision with root package name */
    private int f27529p;

    /* renamed from: q, reason: collision with root package name */
    private int f27530q;

    /* renamed from: r, reason: collision with root package name */
    private int f27531r;

    /* renamed from: s, reason: collision with root package name */
    private int f27532s;

    /* renamed from: t, reason: collision with root package name */
    private final int[] f27533t;

    /* renamed from: u, reason: collision with root package name */
    private final int[] f27534u;

    /* renamed from: v, reason: collision with root package name */
    private int f27535v;

    /* renamed from: w, reason: collision with root package name */
    private int f27536w;

    /* renamed from: x, reason: collision with root package name */
    private SavedState f27537x;

    /* renamed from: y, reason: collision with root package name */
    private final androidx.core.view.c1 f27538y;

    /* renamed from: z, reason: collision with root package name */
    private final y0 f27539z;
    private static final String G = "NestedScrollView";
    private static final float K = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a N = new a();
    private static final int[] O = {R.attr.fillViewport};

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f27540b;

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
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
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
            return android.support.v4.media.b.a(sb, this.f27540b, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f27540b);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f27540b = parcel.readInt();
        }
    }

    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.q() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.q());
        }

        @Override // androidx.core.view.a
        public void i(View view, h0 h0Var) {
            int q4;
            super.i(view, h0Var);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            h0Var.j1(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (q4 = nestedScrollView.q()) <= 0) {
                return;
            }
            h0Var.X1(true);
            if (nestedScrollView.getScrollY() > 0) {
                h0Var.b(h0.a.f27019s);
                h0Var.b(h0.a.D);
            }
            if (nestedScrollView.getScrollY() < q4) {
                h0Var.b(h0.a.f27018r);
                h0Var.b(h0.a.F);
            }
        }

        @Override // androidx.core.view.a
        public boolean m(View view, int i4, Bundle bundle) {
            if (super.m(view, i4, bundle)) {
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
            if (i4 != 4096) {
                if (i4 == 8192 || i4 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.b0(0, max, true);
                    return true;
                }
                if (i4 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.q());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.b0(0, min, true);
            return true;
        }
    }

    @x0(21)
    static class b {
        private b() {
        }

        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    @x0(35)
    private static final class c {
        private c() {
        }

        public static void a(View view, float f4) {
            try {
                view.setFrameContentVelocity(f4);
            } catch (LinkageError unused) {
            }
        }
    }

    class d implements androidx.core.view.w {
        d() {
        }

        @Override // androidx.core.view.w
        public boolean a(float f4) {
            if (f4 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.n((int) f4);
            return true;
        }

        @Override // androidx.core.view.w
        public float b() {
            return -NestedScrollView.this.s();
        }

        @Override // androidx.core.view.w
        public void c() {
            NestedScrollView.this.f27518e.abortAnimation();
        }
    }

    public interface e {
        void a(@o0 NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7);
    }

    public NestedScrollView(@o0 Context context) {
        this(context, null);
    }

    private void A(int i4, int i5) {
        this.f27521h = i4;
        this.f27532s = i5;
        startNestedScroll(2, 0);
    }

    private boolean C(View view) {
        return !F(view, 0, getHeight());
    }

    private static boolean E(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && E((View) parent, view2);
    }

    private boolean F(View view, int i4, int i5) {
        view.getDrawingRect(this.f27517d);
        offsetDescendantRectToMyCoords(view, this.f27517d);
        return this.f27517d.bottom + i4 >= getScrollY() && this.f27517d.top - i4 <= getScrollY() + i5;
    }

    private void G(int i4, int i5, @q0 int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f27539z.e(0, scrollY2, 0, i4 - scrollY2, null, i5, iArr);
    }

    private void H(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f27532s) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f27521h = (int) motionEvent.getY(i4);
            this.f27532s = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f27526m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void K() {
        VelocityTracker velocityTracker = this.f27526m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f27526m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int L(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f27519f
            float r0 = androidx.core.widget.i.d(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f27519f
            float r4 = -r4
            float r4 = androidx.core.widget.i.j(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f27519f
            float r5 = androidx.core.widget.i.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f27519f
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f27520g
            float r0 = androidx.core.widget.i.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f27520g
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.i.j(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f27520g
            float r5 = androidx.core.widget.i.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f27520g
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.L(int, float):int");
    }

    private void M(boolean z4) {
        if (z4) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f27536w = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean N(int i4, int i5, int i6) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z4 = false;
        boolean z5 = i4 == 33;
        View m4 = m(z5, i5, i6);
        if (m4 == null) {
            m4 = this;
        }
        if (i5 < scrollY || i6 > i7) {
            O(z5 ? i5 - scrollY : i6 - i7, 0, 1, true);
            z4 = true;
        }
        if (m4 != findFocus()) {
            m4.requestFocus(i4);
        }
        return z4;
    }

    private int O(int i4, int i5, int i6, boolean z4) {
        int i7;
        int i10;
        VelocityTracker velocityTracker;
        if (i6 == 1) {
            startNestedScroll(2, i6);
        }
        boolean z5 = false;
        if (dispatchNestedPreScroll(0, i4, this.f27534u, this.f27533t, i6)) {
            i7 = i4 - this.f27534u[1];
            i10 = this.f27533t[1];
        } else {
            i7 = i4;
            i10 = 0;
        }
        int scrollY = getScrollY();
        int q4 = q();
        boolean z6 = d() && !z4;
        boolean z7 = I(0, i7, 0, scrollY, 0, q4, 0, 0, true) && !hasNestedScrollingParent(i6);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f27534u;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i7 - scrollY2, this.f27533t, i6, iArr);
        int i11 = i10 + this.f27533t[1];
        int i12 = i7 - this.f27534u[1];
        int i13 = scrollY + i12;
        if (i13 < 0) {
            if (z6) {
                i.j(this.f27519f, (-i12) / getHeight(), i5 / getWidth());
                if (!this.f27520g.isFinished()) {
                    this.f27520g.onRelease();
                }
            }
        } else if (i13 > q4 && z6) {
            i.j(this.f27520g, i12 / getHeight(), 1.0f - (i5 / getWidth()));
            if (!this.f27519f.isFinished()) {
                this.f27519f.onRelease();
            }
        }
        if (this.f27519f.isFinished() && this.f27520g.isFinished()) {
            z5 = z7;
        } else {
            postInvalidateOnAnimation();
        }
        if (z5 && i6 == 0 && (velocityTracker = this.f27526m) != null) {
            velocityTracker.clear();
        }
        if (i6 == 1) {
            stopNestedScroll(i6);
            this.f27519f.onRelease();
            this.f27520g.onRelease();
        }
        return i11;
    }

    private void P(View view) {
        view.getDrawingRect(this.f27517d);
        offsetDescendantRectToMyCoords(view, this.f27517d);
        int g4 = g(this.f27517d);
        if (g4 != 0) {
            scrollBy(0, g4);
        }
    }

    private boolean Q(Rect rect, boolean z4) {
        int g4 = g(rect);
        boolean z5 = g4 != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, g4);
            } else {
                V(0, g4);
            }
        }
        return z5;
    }

    private boolean U(@o0 EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        return r(-i4) < i.d(edgeEffect) * ((float) getHeight());
    }

    private void X(int i4, int i5, int i6, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f27516c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f27518e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY, i6);
            M(z4);
        } else {
            if (!this.f27518e.isFinished()) {
                a();
            }
            scrollBy(i4, i5);
        }
        this.f27516c = AnimationUtils.currentAnimationTimeMillis();
    }

    private void a() {
        this.f27518e.abortAnimation();
        stopNestedScroll(1);
    }

    private boolean c0(MotionEvent motionEvent) {
        boolean z4;
        if (i.d(this.f27519f) != 0.0f) {
            i.j(this.f27519f, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        if (i.d(this.f27520g) == 0.0f) {
            return z4;
        }
        i.j(this.f27520g, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && q() > 0;
        }
        return true;
    }

    private boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int f(int i4, int i5, int i6) {
        if (i5 >= i6 || i4 < 0) {
            return 0;
        }
        return i5 + i4 > i6 ? i6 - i5 : i4;
    }

    private void i(int i4) {
        if (i4 != 0) {
            if (this.f27528o) {
                V(0, i4);
            } else {
                scrollBy(0, i4);
            }
        }
    }

    private boolean j(int i4) {
        if (i.d(this.f27519f) != 0.0f) {
            if (U(this.f27519f, i4)) {
                this.f27519f.onAbsorb(i4);
            } else {
                n(-i4);
            }
        } else {
            if (i.d(this.f27520g) == 0.0f) {
                return false;
            }
            int i5 = -i4;
            if (U(this.f27520g, i5)) {
                this.f27520g.onAbsorb(i5);
            } else {
                n(i5);
            }
        }
        return true;
    }

    private void k() {
        this.f27532s = -1;
        this.f27525l = false;
        K();
        stopNestedScroll(0);
        this.f27519f.onRelease();
        this.f27520g.onRelease();
    }

    private View m(boolean z4, int i4, int i5) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top2 = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top2 < i5) {
                boolean z6 = i4 < top2 && bottom < i5;
                if (view == null) {
                    view = view2;
                    z5 = z6;
                } else {
                    boolean z7 = (z4 && top2 < view.getTop()) || (!z4 && bottom > view.getBottom());
                    if (z5) {
                        if (z6) {
                            if (!z7) {
                            }
                            view = view2;
                        }
                    } else if (z6) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z7) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float r(int i4) {
        double log = Math.log((Math.abs(i4) * J) / (this.f27515b * I));
        float f4 = K;
        return (float) (Math.exp((f4 / (f4 - 1.0d)) * log) * this.f27515b * I);
    }

    private boolean t(int i4, int i5) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i5 >= childAt.getTop() - scrollY && i5 < childAt.getBottom() - scrollY && i4 >= childAt.getLeft() && i4 < childAt.getRight();
    }

    private void v() {
        VelocityTracker velocityTracker = this.f27526m;
        if (velocityTracker == null) {
            this.f27526m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void w() {
        this.f27518e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f27529p = viewConfiguration.getScaledTouchSlop();
        this.f27530q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f27531r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void z() {
        if (this.f27526m == null) {
            this.f27526m = VelocityTracker.obtain();
        }
    }

    public boolean B() {
        return this.f27527n;
    }

    public boolean D() {
        return this.f27528o;
    }

    boolean I(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, boolean z4) {
        boolean z5;
        boolean z6;
        int overScrollMode = getOverScrollMode();
        boolean z7 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z10 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z11 = overScrollMode == 0 || (overScrollMode == 1 && z7);
        boolean z12 = overScrollMode == 0 || (overScrollMode == 1 && z10);
        int i14 = i6 + i4;
        int i15 = !z11 ? 0 : i12;
        int i16 = i7 + i5;
        int i17 = !z12 ? 0 : i13;
        int i18 = -i15;
        int i19 = i15 + i10;
        int i20 = -i17;
        int i21 = i17 + i11;
        if (i14 > i19) {
            i14 = i19;
            z5 = true;
        } else if (i14 < i18) {
            z5 = true;
            i14 = i18;
        } else {
            z5 = false;
        }
        if (i16 > i21) {
            i16 = i21;
            z6 = true;
        } else if (i16 < i20) {
            z6 = true;
            i16 = i20;
        } else {
            z6 = false;
        }
        if (z6 && !hasNestedScrollingParent(1)) {
            this.f27518e.springBack(i14, i16, 0, 0, 0, q());
        }
        onOverScrolled(i14, i16, z5, z6);
        return z5 || z6;
    }

    public boolean J(int i4) {
        boolean z4 = i4 == 130;
        int height = getHeight();
        if (z4) {
            this.f27517d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                Rect rect = this.f27517d;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            this.f27517d.top = getScrollY() - height;
            Rect rect2 = this.f27517d;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f27517d;
        int i5 = rect3.top;
        int i6 = height + i5;
        rect3.bottom = i6;
        return N(i4, i5, i6);
    }

    public void R(boolean z4) {
        if (z4 != this.f27527n) {
            this.f27527n = z4;
            requestLayout();
        }
    }

    public void S(@q0 e eVar) {
        this.B = eVar;
    }

    public void T(boolean z4) {
        this.f27528o = z4;
    }

    public final void V(int i4, int i5) {
        X(i4, i5, 250, false);
    }

    public final void W(int i4, int i5, int i6) {
        X(i4, i5, i6, false);
    }

    public final void Y(int i4, int i5) {
        a0(i4, i5, 250, false);
    }

    public final void Z(int i4, int i5, int i6) {
        a0(i4, i5, i6, false);
    }

    void a0(int i4, int i5, int i6, boolean z4) {
        X(i4 - getScrollX(), i5 - getScrollY(), i6, z4);
    }

    @Override // android.view.ViewGroup
    public void addView(@o0 View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    void b0(int i4, int i5, boolean z4) {
        a0(i4, i5, 250, z4);
    }

    public boolean c(int i4) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i4);
        int p4 = p();
        if (findNextFocus == null || !F(findNextFocus, p4, getHeight())) {
            if (i4 == 33 && getScrollY() < p4) {
                p4 = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                p4 = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), p4);
            }
            if (p4 == 0) {
                return false;
            }
            if (i4 != 130) {
                p4 = -p4;
            }
            O(p4, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f27517d);
            offsetDescendantRectToMyCoords(findNextFocus, this.f27517d);
            O(g(this.f27517d), 0, 1, true);
            findNextFocus.requestFocus(i4);
        }
        if (findFocus != null && findFocus.isFocused() && C(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.j1
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.j1
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.j1
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f27518e.isFinished()) {
            return;
        }
        this.f27518e.computeScrollOffset();
        int currY = this.f27518e.getCurrY();
        int h4 = h(currY - this.f27536w);
        this.f27536w = currY;
        int[] iArr = this.f27534u;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, h4, iArr, null, 1);
        int i4 = h4 - this.f27534u[1];
        int q4 = q();
        if (androidx.core.os.b.m()) {
            c.a(this, Math.abs(this.f27518e.getCurrVelocity()));
        }
        if (i4 != 0) {
            int scrollY = getScrollY();
            I(0, i4, getScrollX(), scrollY, 0, q4, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i5 = i4 - scrollY2;
            int[] iArr2 = this.f27534u;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i5, this.f27533t, 1, iArr2);
            i4 = i5 - this.f27534u[1];
        }
        if (i4 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && q4 > 0)) {
                if (i4 < 0) {
                    if (this.f27519f.isFinished()) {
                        this.f27519f.onAbsorb((int) this.f27518e.getCurrVelocity());
                    }
                } else if (this.f27520g.isFinished()) {
                    this.f27520g.onAbsorb((int) this.f27518e.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f27518e.isFinished()) {
            stopNestedScroll(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View, androidx.core.view.j1
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.j1
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.j1
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

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || l(keyEvent);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean dispatchNestedFling(float f4, float f5, boolean z4) {
        return this.f27539z.a(f4, f5, z4);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f27539z.b(f4, f5);
    }

    @Override // androidx.core.view.v0
    public boolean dispatchNestedPreScroll(int i4, int i5, @q0 int[] iArr, @q0 int[] iArr2, int i6) {
        return this.f27539z.d(i4, i5, iArr, iArr2, i6);
    }

    @Override // androidx.core.view.w0
    public void dispatchNestedScroll(int i4, int i5, int i6, int i7, @q0 int[] iArr, int i10, @o0 int[] iArr2) {
        this.f27539z.e(i4, i5, i6, i7, iArr, i10, iArr2);
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        int i4;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i5 = 0;
        if (!this.f27519f.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i4 = getPaddingLeft();
            } else {
                i4 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i4, min);
            this.f27519f.setSize(width, height);
            if (this.f27519f.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (this.f27520g.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(q(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i5 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i5 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f27520g.setSize(width2, height2);
        if (this.f27520g.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    protected int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
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

    @Override // android.view.ViewGroup, androidx.core.view.b1
    public int getNestedScrollAxes() {
        return this.f27538y.a();
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

    int h(int i4) {
        int height = getHeight();
        if (i4 > 0 && i.d(this.f27519f) != 0.0f) {
            int round = Math.round(i.j(this.f27519f, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (round != i4) {
                this.f27519f.finish();
            }
            return i4 - round;
        }
        if (i4 >= 0 || i.d(this.f27520g) == 0.0f) {
            return i4;
        }
        float f4 = height;
        int round2 = Math.round(i.j(this.f27520g, (i4 * 4.0f) / f4, 0.5f) * (f4 / 4.0f));
        if (round2 != i4) {
            this.f27520g.finish();
        }
        return i4 - round2;
    }

    @Override // androidx.core.view.v0
    public boolean hasNestedScrollingParent(int i4) {
        return this.f27539z.l(i4);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean isNestedScrollingEnabled() {
        return this.f27539z.m();
    }

    public boolean l(@o0 KeyEvent keyEvent) {
        this.f27517d.setEmpty();
        boolean e4 = e();
        int i4 = UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS;
        if (!e4) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? o(33) : c(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? o(UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS) : c(UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS);
        }
        if (keyCode == 62) {
            if (keyEvent.isShiftPressed()) {
                i4 = 33;
            }
            J(i4);
            return false;
        }
        if (keyCode == 92) {
            return o(33);
        }
        if (keyCode == 93) {
            return o(UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS);
        }
        if (keyCode == 122) {
            J(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        J(UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS);
        return false;
    }

    @Override // android.view.ViewGroup
    protected void measureChild(@o0 View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(int i4) {
        if (getChildCount() > 0) {
            this.f27518e.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            M(true);
            if (androidx.core.os.b.m()) {
                c.a(this, Math.abs(this.f27518e.getCurrVelocity()));
            }
        }
    }

    public boolean o(int i4) {
        int childCount;
        boolean z4 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f27517d;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f27517d.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f27517d;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f27517d;
        return N(i4, rect3.top, rect3.bottom);
    }

    @Override // androidx.core.view.a1
    public void o0(@o0 View view, int i4, int i5, int i6, int i7, int i10, @o0 int[] iArr) {
        G(i7, i10, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27523j = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@o0 MotionEvent motionEvent) {
        int i4;
        int i5;
        float f4;
        if (motionEvent.getAction() == 8 && !this.f27525l) {
            if (u0.l(motionEvent, 2)) {
                i4 = 9;
                f4 = motionEvent.getAxisValue(9);
                i5 = (int) motionEvent.getX();
            } else if (u0.l(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i5 = getWidth() / 2;
                i4 = 26;
                f4 = axisValue;
            } else {
                i4 = 0;
                i5 = 0;
                f4 = 0.0f;
            }
            if (f4 != 0.0f) {
                O(-((int) (f4 * s())), i5, 1, u0.l(motionEvent, 8194));
                if (i4 != 0) {
                    this.D.g(motionEvent, i4);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@o0 MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.f27525l) {
            return true;
        }
        int i4 = action & 255;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = this.f27532s;
                    if (i5 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i5)) != -1) {
                        int y4 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y4 - this.f27521h) > this.f27529p && (2 & getNestedScrollAxes()) == 0) {
                            this.f27525l = true;
                            this.f27521h = y4;
                            z();
                            this.f27526m.addMovement(motionEvent);
                            this.f27535v = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i4 != 3) {
                    if (i4 == 6) {
                        H(motionEvent);
                    }
                }
            }
            this.f27525l = false;
            this.f27532s = -1;
            K();
            if (this.f27518e.springBack(getScrollX(), getScrollY(), 0, 0, 0, q())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll(0);
        } else {
            int y5 = (int) motionEvent.getY();
            if (t((int) motionEvent.getX(), y5)) {
                this.f27521h = y5;
                this.f27532s = motionEvent.getPointerId(0);
                v();
                this.f27526m.addMovement(motionEvent);
                this.f27518e.computeScrollOffset();
                if (!c0(motionEvent) && this.f27518e.isFinished()) {
                    z4 = false;
                }
                this.f27525l = z4;
                startNestedScroll(2, 0);
            } else {
                if (!c0(motionEvent) && this.f27518e.isFinished()) {
                    z4 = false;
                }
                this.f27525l = z4;
                K();
            }
        }
        return this.f27525l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        int i10 = 0;
        this.f27522i = false;
        View view = this.f27524k;
        if (view != null && E(view, this)) {
            P(this.f27524k);
        }
        this.f27524k = null;
        if (!this.f27523j) {
            if (this.f27537x != null) {
                scrollTo(getScrollX(), this.f27537x.f27540b);
                this.f27537x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i10 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int f4 = f(scrollY, paddingTop, i10);
            if (f4 != scrollY) {
                scrollTo(getScrollX(), f4);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f27523j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f27527n && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedFling(@o0 View view, float f4, float f5, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        n((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedPreFling(@o0 View view, float f4, float f5) {
        return dispatchNestedPreFling(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedPreScroll(@o0 View view, int i4, int i5, @o0 int[] iArr) {
        y(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScroll(@o0 View view, int i4, int i5, int i6, int i7) {
        G(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScrollAccepted(@o0 View view, @o0 View view2, int i4) {
        u(view, view2, i4, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        super.scrollTo(i4, i5);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (i4 == 2) {
            i4 = UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS;
        } else if (i4 == 1) {
            i4 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i4) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        if (findNextFocus == null || C(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i4, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f27537x = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @o0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f27540b = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        e eVar = this.B;
        if (eVar != null) {
            eVar.a(this, i4, i5, i6, i7);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !F(findFocus, 0, i7)) {
            return;
        }
        findFocus.getDrawingRect(this.f27517d);
        offsetDescendantRectToMyCoords(findFocus, this.f27517d);
        i(g(this.f27517d));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onStartNestedScroll(@o0 View view, @o0 View view2, int i4) {
        return s0(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onStopNestedScroll(@o0 View view) {
        x(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@o0 MotionEvent motionEvent) {
        ViewParent parent;
        z();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f27535v = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f27535v);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f27526m;
                velocityTracker.computeCurrentVelocity(1000, this.f27531r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f27532s);
                if (Math.abs(yVelocity) >= this.f27530q) {
                    if (!j(yVelocity)) {
                        int i4 = -yVelocity;
                        float f4 = i4;
                        if (!dispatchNestedPreFling(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            n(i4);
                        }
                    }
                } else if (this.f27518e.springBack(getScrollX(), getScrollY(), 0, 0, 0, q())) {
                    postInvalidateOnAnimation();
                }
                k();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f27532s);
                if (findPointerIndex != -1) {
                    int y4 = (int) motionEvent.getY(findPointerIndex);
                    int i5 = this.f27521h - y4;
                    int L2 = i5 - L(i5, motionEvent.getX(findPointerIndex));
                    if (!this.f27525l && Math.abs(L2) > this.f27529p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f27525l = true;
                        L2 = L2 > 0 ? L2 - this.f27529p : L2 + this.f27529p;
                    }
                    if (this.f27525l) {
                        int O2 = O(L2, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f27521h = y4 - O2;
                        this.f27535v += O2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f27525l && getChildCount() > 0 && this.f27518e.springBack(getScrollX(), getScrollY(), 0, 0, 0, q())) {
                    postInvalidateOnAnimation();
                }
                k();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f27521h = (int) motionEvent.getY(actionIndex);
                this.f27532s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                H(motionEvent);
                this.f27521h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f27532s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f27525l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f27518e.isFinished()) {
                a();
            }
            A((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f27526m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public int p() {
        return (int) (getHeight() * 0.5f);
    }

    int q() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // androidx.core.view.z0
    public void q0(@o0 View view, int i4, int i5, int i6, int i7, int i10) {
        G(i7, i10, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f27522i) {
            this.f27524k = view2;
        } else {
            P(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@o0 View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return Q(rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        if (z4) {
            K();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f27522i = true;
        super.requestLayout();
    }

    @m1
    float s() {
        if (this.A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.A;
    }

    @Override // androidx.core.view.z0
    public boolean s0(@o0 View view, @o0 View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int f4 = f(i4, width, width2);
            int f5 = f(i5, height, height2);
            if (f4 == getScrollX() && f5 == getScrollY()) {
                return;
            }
            super.scrollTo(f4, f5);
        }
    }

    @Override // android.view.View, androidx.core.view.x0
    public void setNestedScrollingEnabled(boolean z4) {
        this.f27539z.p(z4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.v0
    public boolean startNestedScroll(int i4, int i5) {
        return this.f27539z.s(i4, i5);
    }

    @Override // androidx.core.view.v0
    public void stopNestedScroll(int i4) {
        this.f27539z.u(i4);
    }

    @Override // androidx.core.view.z0
    public void u(@o0 View view, @o0 View view2, int i4, int i5) {
        this.f27538y.c(view, view2, i4, i5);
        startNestedScroll(2, i5);
    }

    @Override // androidx.core.view.z0
    public void x(@o0 View view, int i4) {
        this.f27538y.e(view, i4);
        stopNestedScroll(i4);
    }

    @Override // androidx.core.view.z0
    public void y(@o0 View view, int i4, int i5, @o0 int[] iArr, int i6) {
        dispatchNestedPreScroll(i4, i5, iArr, null, i6);
    }

    public NestedScrollView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C1409a.f93505o);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean dispatchNestedPreScroll(int i4, int i5, @q0 int[] iArr, @q0 int[] iArr2) {
        return dispatchNestedPreScroll(i4, i5, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.v0
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, @q0 int[] iArr, int i10) {
        return this.f27539z.g(i4, i5, i6, i7, iArr, i10);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean startNestedScroll(int i4) {
        return startNestedScroll(i4, 0);
    }

    @Override // android.view.View, androidx.core.view.x0
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f27517d = new Rect();
        this.f27522i = true;
        this.f27523j = false;
        this.f27524k = null;
        this.f27525l = false;
        this.f27528o = true;
        this.f27532s = -1;
        this.f27533t = new int[2];
        this.f27534u = new int[2];
        d dVar = new d();
        this.C = dVar;
        this.D = new androidx.core.view.v(getContext(), dVar);
        this.f27519f = i.a(context, attributeSet);
        this.f27520g = i.a(context, attributeSet);
        this.f27515b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        w();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O, i4, 0);
        R(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f27538y = new androidx.core.view.c1();
        this.f27539z = new y0(this);
        setNestedScrollingEnabled(true);
        x1.H1(this, N);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, @q0 int[] iArr) {
        return this.f27539z.f(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
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
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
