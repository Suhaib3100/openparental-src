package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.annotation.v;
import androidx.core.graphics.e0;
import androidx.core.view.accessibility.h0;
import androidx.core.view.j3;
import androidx.core.view.x1;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.d;
import androidx.slidingpanelayout.widget.a;
import androidx.transition.ChangeBounds;
import androidx.transition.x;
import androidx.window.sidecar.q;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class SlidingPaneLayout extends ViewGroup implements androidx.customview.widget.c {
    private static final int D = 400;
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    private static boolean J;
    private Field A;
    private boolean B;

    /* renamed from: b, reason: collision with root package name */
    private int f34023b;

    /* renamed from: c, reason: collision with root package name */
    private int f34024c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f34025d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f34026e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f34027f;

    /* renamed from: g, reason: collision with root package name */
    View f34028g;

    /* renamed from: h, reason: collision with root package name */
    float f34029h;

    /* renamed from: i, reason: collision with root package name */
    private float f34030i;

    /* renamed from: j, reason: collision with root package name */
    int f34031j;

    /* renamed from: k, reason: collision with root package name */
    boolean f34032k;

    /* renamed from: l, reason: collision with root package name */
    private int f34033l;

    /* renamed from: m, reason: collision with root package name */
    private float f34034m;

    /* renamed from: n, reason: collision with root package name */
    private float f34035n;

    /* renamed from: o, reason: collision with root package name */
    private final List<e> f34036o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private e f34037p;

    /* renamed from: q, reason: collision with root package name */
    final androidx.customview.widget.d f34038q;

    /* renamed from: r, reason: collision with root package name */
    boolean f34039r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f34040s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f34041t;

    /* renamed from: u, reason: collision with root package name */
    final ArrayList<c> f34042u;

    /* renamed from: v, reason: collision with root package name */
    private int f34043v;

    /* renamed from: w, reason: collision with root package name */
    q f34044w;

    /* renamed from: x, reason: collision with root package name */
    private a.InterfaceC0618a f34045x;

    /* renamed from: y, reason: collision with root package name */
    private androidx.slidingpanelayout.widget.a f34046y;

    /* renamed from: z, reason: collision with root package name */
    private Method f34047z;
    private static final String C = "SlidingPaneLayout";
    private static final String E = "androidx.slidingpanelayout.widget.SlidingPaneLayout";

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        boolean f34053d;

        /* renamed from: e, reason: collision with root package name */
        int f34054e;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f34053d ? 1 : 0);
            parcel.writeInt(this.f34054e);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f34053d = parcel.readInt() != 0;
            this.f34054e = parcel.readInt();
        }
    }

    class a implements a.InterfaceC0618a {
        a() {
        }

        @Override // androidx.slidingpanelayout.widget.a.InterfaceC0618a
        public void a(@o0 q qVar) {
            SlidingPaneLayout.this.f34044w = qVar;
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.A0(300L);
            changeBounds.C0(new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f));
            x.b(SlidingPaneLayout.this, changeBounds);
            SlidingPaneLayout.this.requestLayout();
        }
    }

    class b extends androidx.core.view.a {

        /* renamed from: e, reason: collision with root package name */
        private final Rect f34056e = new Rect();

        b() {
        }

        private void r(h0 h0Var, h0 h0Var2) {
            Rect rect = this.f34056e;
            h0Var2.t(rect);
            h0Var.e1(rect);
            h0Var.p2(h0Var2.M0());
            h0Var.N1(h0Var2.S());
            h0Var.j1(h0Var2.y());
            h0Var.o1(h0Var2.D());
            h0Var.u1(h0Var2.x0());
            h0Var.k1(h0Var2.s0());
            h0Var.w1(h0Var2.y0());
            h0Var.x1(h0Var2.z0());
            h0Var.a1(h0Var2.p0());
            h0Var.Y1(h0Var2.I0());
            h0Var.I1(h0Var2.D0());
            h0Var.a(h0Var2.p());
            h0Var.L1(h0Var2.Q());
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // androidx.core.view.a
        public void i(View view, h0 h0Var) {
            h0 Q0 = h0.Q0(h0Var);
            super.i(view, Q0);
            r(h0Var, Q0);
            Q0.T0();
            h0Var.j1("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            h0Var.a2(view);
            Object o02 = x1.o0(view);
            if (o02 instanceof View) {
                h0Var.P1((View) o02);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i4);
                if (!s(childAt) && childAt.getVisibility() == 0) {
                    childAt.setImportantForAccessibility(1);
                    h0Var.c(childAt);
                }
            }
        }

        @Override // androidx.core.view.a
        public boolean k(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (s(view)) {
                return false;
            }
            return super.k(viewGroup, view, accessibilityEvent);
        }

        public boolean s(View view) {
            return SlidingPaneLayout.this.r(view);
        }
    }

    private class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final View f34058b;

        c(View view) {
            this.f34058b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f34058b.getParent() == SlidingPaneLayout.this) {
                this.f34058b.setLayerType(0, null);
                SlidingPaneLayout.this.q(this.f34058b);
            }
            SlidingPaneLayout.this.f34042u.remove(this);
        }
    }

    private class d extends d.c {
        d() {
        }

        private boolean n() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f34032k || slidingPaneLayout.l() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.l() == 1) {
                return false;
            }
            return SlidingPaneLayout.this.isOpen() || SlidingPaneLayout.this.l() != 2;
        }

        @Override // androidx.customview.widget.d.c
        public int a(View view, int i4, int i5) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f34028g.getLayoutParams();
            if (!SlidingPaneLayout.this.s()) {
                int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                return Math.min(Math.max(i4, paddingLeft), SlidingPaneLayout.this.f34031j + paddingLeft);
            }
            int width = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.f34028g.getWidth() + (SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
            return Math.max(Math.min(i4, width), width - SlidingPaneLayout.this.f34031j);
        }

        @Override // androidx.customview.widget.d.c
        public int b(View view, int i4, int i5) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(View view) {
            return SlidingPaneLayout.this.f34031j;
        }

        @Override // androidx.customview.widget.d.c
        public void f(int i4, int i5) {
            if (n()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f34038q.d(slidingPaneLayout.f34028g, i5);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void h(int i4, int i5) {
            if (n()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f34038q.d(slidingPaneLayout.f34028g, i5);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void i(View view, int i4) {
            SlidingPaneLayout.this.A();
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i4) {
            if (SlidingPaneLayout.this.f34038q.F() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f34029h != 1.0f) {
                    slidingPaneLayout.g(slidingPaneLayout.f34028g);
                    SlidingPaneLayout.this.f34039r = true;
                } else {
                    slidingPaneLayout.R(slidingPaneLayout.f34028g);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.f(slidingPaneLayout2.f34028g);
                    SlidingPaneLayout.this.f34039r = false;
                }
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(View view, int i4, int i5, int i6, int i7) {
            SlidingPaneLayout.this.v(i4);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public void l(View view, float f4, float f5) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.s()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f4 < 0.0f || (f4 == 0.0f && SlidingPaneLayout.this.f34029h > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f34031j;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f34028g.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f4 > 0.0f || (f4 == 0.0f && SlidingPaneLayout.this.f34029h > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f34031j;
                }
            }
            SlidingPaneLayout.this.f34038q.V(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i4) {
            if (n()) {
                return ((LayoutParams) view.getLayoutParams()).f34050b;
            }
            return false;
        }
    }

    public interface e {
        void a(@o0 View view);

        void b(@o0 View view);

        void c(@o0 View view, float f4);
    }

    public static class f implements e {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void a(@o0 View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void b(@o0 View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void c(@o0 View view, float f4) {
        }
    }

    private static class g extends FrameLayout {
        g(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        J = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@o0 Context context) {
        this(context, null);
    }

    private void C(androidx.slidingpanelayout.widget.a aVar) {
        this.f34046y = aVar;
        aVar.f(this.f34045x);
    }

    private ArrayList<Rect> Q() {
        Rect k4;
        q qVar = this.f34044w;
        if (qVar == null || !qVar.b() || this.f34044w.getBounds().left == 0 || this.f34044w.getBounds().top != 0 || (k4 = k(this.f34044w, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), k4.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(rect, new Rect(Math.min(width, k4.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    private static boolean S(View view) {
        return view.isOpaque();
    }

    private boolean e(int i4) {
        if (!this.f34027f) {
            this.f34039r = false;
        }
        if (!this.f34040s && !P(1.0f, i4)) {
            return false;
        }
        this.f34039r = false;
        return true;
    }

    @q0
    private static Activity i(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private static Rect k(@o0 q qVar, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i4 = iArr[0];
        Rect rect = new Rect(i4, iArr[1], view.getWidth() + i4, view.getWidth() + iArr[1]);
        Rect rect2 = new Rect(qVar.getBounds());
        boolean intersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !intersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    private static int m(View view) {
        return view instanceof g ? x1.i0(((g) view).getChildAt(0)) : x1.i0(view);
    }

    private e0 p() {
        j3 r02;
        if (!J || (r02 = x1.r0(this)) == null) {
            return null;
        }
        return r02.n();
    }

    private static int u(@o0 View view, int i4, int i5) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return (((ViewGroup.MarginLayoutParams) layoutParams).width != 0 || layoutParams.f34049a <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i4, i5, ((ViewGroup.MarginLayoutParams) layoutParams).height);
    }

    private boolean x(int i4) {
        if (!this.f34027f) {
            this.f34039r = true;
        }
        if (!this.f34040s && !P(0.0f, i4)) {
            return false;
        }
        this.f34039r = true;
        return true;
    }

    private void y(float f4) {
        boolean s4 = s();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != this.f34028g) {
                float f5 = 1.0f - this.f34030i;
                int i5 = this.f34033l;
                this.f34030i = f4;
                int i6 = ((int) (f5 * i5)) - ((int) ((1.0f - f4) * i5));
                if (s4) {
                    i6 = -i6;
                }
                childAt.offsetLeftAndRight(i6);
            }
        }
    }

    void A() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Deprecated
    public void B(@l int i4) {
        this.f34024c = i4;
    }

    public final void D(int i4) {
        this.f34043v = i4;
    }

    @Deprecated
    public void E(@q0 e eVar) {
        e eVar2 = this.f34037p;
        if (eVar2 != null) {
            z(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f34037p = eVar;
    }

    public void F(@u0 int i4) {
        this.f34033l = i4;
        requestLayout();
    }

    @Deprecated
    public void G(Drawable drawable) {
        H(drawable);
    }

    public void H(@q0 Drawable drawable) {
        this.f34025d = drawable;
    }

    public void I(@q0 Drawable drawable) {
        this.f34026e = drawable;
    }

    @Deprecated
    public void J(@v int i4) {
        H(getResources().getDrawable(i4));
    }

    public void K(int i4) {
        H(androidx.core.content.d.getDrawable(getContext(), i4));
    }

    public void L(int i4) {
        I(androidx.core.content.d.getDrawable(getContext(), i4));
    }

    @Deprecated
    public void M(@l int i4) {
        this.f34023b = i4;
    }

    @Deprecated
    public void N() {
        d();
    }

    @Deprecated
    public void O() {
        w();
    }

    boolean P(float f4, int i4) {
        int paddingLeft;
        if (!this.f34027f) {
            return false;
        }
        boolean s4 = s();
        LayoutParams layoutParams = (LayoutParams) this.f34028g.getLayoutParams();
        if (s4) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            paddingLeft = (int) (getWidth() - (((f4 * this.f34031j) + paddingRight) + this.f34028g.getWidth()));
        } else {
            paddingLeft = (int) ((f4 * this.f34031j) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
        }
        androidx.customview.widget.d dVar = this.f34038q;
        View view = this.f34028g;
        if (!dVar.X(view, paddingLeft, view.getTop())) {
            return false;
        }
        A();
        x1.t1(this);
        return true;
    }

    void R(View view) {
        int i4;
        int i5;
        int i6;
        int i7;
        View childAt;
        boolean z4;
        View view2 = view;
        boolean s4 = s();
        int width = s4 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = s4 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !S(view)) {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        } else {
            i4 = view.getLeft();
            i5 = view.getRight();
            i6 = view.getTop();
            i7 = view.getBottom();
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount && (childAt = getChildAt(i10)) != view2) {
            if (childAt.getVisibility() == 8) {
                z4 = s4;
            } else {
                z4 = s4;
                childAt.setVisibility((Math.max(s4 ? paddingLeft : width, childAt.getLeft()) < i4 || Math.max(paddingTop, childAt.getTop()) < i6 || Math.min(s4 ? width : paddingLeft, childAt.getRight()) > i5 || Math.min(height, childAt.getBottom()) > i7) ? 0 : 4);
            }
            i10++;
            view2 = view;
            s4 = z4;
        }
    }

    public void a(@o0 e eVar) {
        this.f34036o.add(eVar);
    }

    @Override // android.view.ViewGroup
    public void addView(@o0 View view, int i4, @q0 ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new g(view), i4, layoutParams);
        } else {
            super.addView(view, i4, layoutParams);
        }
    }

    protected boolean b(View view, boolean z4, int i4, int i5, int i6) {
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i10 = i5 + scrollX;
                if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && (i7 = i6 + scrollY) >= childAt.getTop() && i7 < childAt.getBottom() && b(childAt, true, i4, i10 - childAt.getLeft(), i7 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z4) {
            if (view.canScrollHorizontally(s() ? i4 : -i4)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean c() {
        return this.f34027f;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.c
    public void close() {
        d();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f34038q.o(true)) {
            if (this.f34027f) {
                x1.t1(this);
            } else {
                this.f34038q.a();
            }
        }
    }

    public boolean d() {
        return e(0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i4;
        int i5;
        super.draw(canvas);
        Drawable drawable = s() ? this.f34026e : this.f34025d;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top2 = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (s()) {
            i5 = childAt.getRight();
            i4 = intrinsicWidth + i5;
        } else {
            int left = childAt.getLeft();
            int i6 = left - intrinsicWidth;
            i4 = left;
            i5 = i6;
        }
        drawable.setBounds(i5, top2, i4, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        if (s() ^ isOpen()) {
            this.f34038q.T(1);
            e0 p4 = p();
            if (p4 != null) {
                androidx.customview.widget.d dVar = this.f34038q;
                dVar.S(Math.max(dVar.A(), p4.f26245a));
            }
        } else {
            this.f34038q.T(2);
            e0 p5 = p();
            if (p5 != null) {
                androidx.customview.widget.d dVar2 = this.f34038q;
                dVar2.S(Math.max(dVar2.A(), p5.f26247c));
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f34027f && !layoutParams.f34050b && this.f34028g != null) {
            canvas.getClipBounds(this.f34041t);
            if (s()) {
                Rect rect = this.f34041t;
                rect.left = Math.max(rect.left, this.f34028g.getRight());
            } else {
                Rect rect2 = this.f34041t;
                rect2.right = Math.min(rect2.right, this.f34028g.getLeft());
            }
            canvas.clipRect(this.f34041t);
        }
        boolean drawChild = super.drawChild(canvas, view, j4);
        canvas.restoreToCount(save);
        return drawChild;
    }

    void f(@o0 View view) {
        Iterator<e> it = this.f34036o.iterator();
        while (it.hasNext()) {
            it.next().b(view);
        }
        sendAccessibilityEvent(32);
    }

    void g(@o0 View view) {
        Iterator<e> it = this.f34036o.iterator();
        while (it.hasNext()) {
            it.next().a(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    void h(@o0 View view) {
        Iterator<e> it = this.f34036o.iterator();
        while (it.hasNext()) {
            it.next().c(view, this.f34029h);
        }
    }

    @Override // androidx.customview.widget.c
    public boolean isOpen() {
        return !this.f34027f || this.f34029h == 0.0f;
    }

    @l
    @Deprecated
    public int j() {
        return this.f34024c;
    }

    public final int l() {
        return this.f34043v;
    }

    @u0
    public int n() {
        return this.f34033l;
    }

    @l
    @Deprecated
    public int o() {
        return this.f34023b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Activity i4;
        super.onAttachedToWindow();
        this.f34040s = true;
        if (this.f34046y == null || (i4 = i(getContext())) == null) {
            return;
        }
        this.f34046y.e(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34040s = true;
        androidx.slidingpanelayout.widget.a aVar = this.f34046y;
        if (aVar != null) {
            aVar.g();
        }
        int size = this.f34042u.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f34042u.get(i4).run();
        }
        this.f34042u.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f34027f && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f34039r = this.f34038q.L(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f34027f || (this.f34032k && actionMasked != 0)) {
            this.f34038q.c();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f34038q.c();
            return false;
        }
        if (actionMasked == 0) {
            this.f34032k = false;
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            this.f34034m = x4;
            this.f34035n = y4;
            if (this.f34038q.L(this.f34028g, (int) x4, (int) y4) && r(this.f34028g)) {
                z4 = true;
                return this.f34038q.W(motionEvent) || z4;
            }
        } else if (actionMasked == 2) {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            float abs = Math.abs(x5 - this.f34034m);
            float abs2 = Math.abs(y5 - this.f34035n);
            if (abs > this.f34038q.E() && abs2 > abs) {
                this.f34038q.c();
                this.f34032k = true;
                return false;
            }
        }
        z4 = false;
        if (this.f34038q.W(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean s4 = s();
        int i15 = i6 - i4;
        int paddingRight = s4 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = s4 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f34040s) {
            this.f34029h = (this.f34027f && this.f34039r) ? 0.0f : 1.0f;
        }
        int i16 = paddingRight;
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                i10 = i16;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f34050b) {
                    int i18 = i15 - paddingLeft;
                    int min = (Math.min(paddingRight, i18) - i16) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f34031j = min;
                    int i19 = s4 ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f34051c = (measuredWidth / 2) + ((i16 + i19) + min) > i18;
                    int i20 = (int) (min * this.f34029h);
                    i10 = i19 + i20 + i16;
                    this.f34029h = i20 / min;
                    i11 = 0;
                } else if (!this.f34027f || (i12 = this.f34033l) == 0) {
                    i10 = paddingRight;
                    i11 = 0;
                } else {
                    i11 = (int) ((1.0f - this.f34029h) * i12);
                    i10 = paddingRight;
                }
                if (s4) {
                    i14 = (i15 - i10) + i11;
                    i13 = i14 - measuredWidth;
                } else {
                    i13 = i10 - i11;
                    i14 = i13 + measuredWidth;
                }
                childAt.layout(i13, paddingTop, i14, childAt.getMeasuredHeight() + paddingTop);
                q qVar = this.f34044w;
                paddingRight = Math.abs((qVar != null && qVar.a() == q.b.f35826c && this.f34044w.b()) ? this.f34044w.getBounds().width() : 0) + childAt.getWidth() + paddingRight;
            }
            i17++;
            i16 = i10;
        }
        if (this.f34040s) {
            if (this.f34027f && this.f34033l != 0) {
                y(this.f34029h);
            }
            R(this.f34028g);
        }
        this.f34040s = false;
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int paddingTop;
        int i6;
        int i7;
        int i10;
        int i11;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        ?? r82 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            i6 = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = i6;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i6 = 0;
        }
        int max = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        this.f34028g = null;
        int i12 = 0;
        boolean z4 = false;
        int i13 = max;
        float f4 = 0.0f;
        while (true) {
            i7 = 8;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int i14 = size;
            if (childAt.getVisibility() == 8) {
                layoutParams.f34051c = r82;
            } else {
                float f5 = layoutParams.f34049a;
                if (f5 > 0.0f) {
                    f4 += f5;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0) {
                    }
                }
                int max2 = Math.max(max - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r82);
                int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                childAt.measure(i15 == -2 ? View.MeasureSpec.makeMeasureSpec(max2, mode == 0 ? mode : Integer.MIN_VALUE) : i15 == -1 ? View.MeasureSpec.makeMeasureSpec(max2, mode) : View.MeasureSpec.makeMeasureSpec(i15, 1073741824), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i6) {
                    if (mode2 == Integer.MIN_VALUE) {
                        i6 = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        i6 = measuredHeight;
                    }
                }
                i13 -= measuredWidth;
                if (i12 != 0) {
                    boolean z5 = i13 < 0;
                    layoutParams.f34050b = z5;
                    z4 |= z5;
                    if (z5) {
                        this.f34028g = childAt;
                    }
                }
            }
            i12++;
            size = i14;
            r82 = 0;
        }
        int i16 = size;
        int i17 = i13;
        if (z4 || f4 > 0.0f) {
            int i18 = 0;
            while (i18 < childCount) {
                View childAt2 = getChildAt(i18);
                if (childAt2.getVisibility() != i7) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    int measuredWidth2 = (((ViewGroup.MarginLayoutParams) layoutParams2).width != 0 || layoutParams2.f34049a <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z4) {
                        i10 = max - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        i11 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                    } else if (layoutParams2.f34049a > 0.0f) {
                        i10 = measuredWidth2 + ((int) ((layoutParams2.f34049a * Math.max(0, i17)) / f4));
                        i11 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                    } else {
                        i10 = measuredWidth2;
                        i11 = 0;
                    }
                    int u4 = u(childAt2, i5, getPaddingBottom() + getPaddingTop());
                    if (measuredWidth2 != i10) {
                        childAt2.measure(i11, u4);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > i6) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 != 0) {
                            }
                            i6 = measuredHeight2;
                        }
                    }
                }
                i18++;
                i7 = 8;
            }
        }
        ArrayList<Rect> Q = Q();
        if (Q != null && !z4) {
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = Q.get(i19);
                    LayoutParams layoutParams3 = (LayoutParams) childAt3.getLayoutParams();
                    int i20 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), makeMeasureSpec);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (m(childAt3) != 0 && rect.width() < m(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(max - i20, 1073741824), makeMeasureSpec);
                        if (i19 != 0) {
                            layoutParams3.f34050b = true;
                            this.f34028g = childAt3;
                            z4 = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), makeMeasureSpec);
                    }
                }
            }
        }
        setMeasuredDimension(i16, getPaddingBottom() + getPaddingTop() + i6);
        this.f34027f = z4;
        if (this.f34038q.F() == 0 || z4) {
            return;
        }
        this.f34038q.a();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        if (savedState.f34053d) {
            w();
        } else {
            d();
        }
        this.f34039r = savedState.f34053d;
        this.f34043v = savedState.f34054e;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f34053d = t() ? isOpen() : this.f34039r;
        savedState.f34054e = this.f34043v;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 != i6) {
            this.f34040s = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f34027f) {
            return super.onTouchEvent(motionEvent);
        }
        this.f34038q.M(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            this.f34034m = x4;
            this.f34035n = y4;
        } else if (actionMasked == 1 && r(this.f34028g)) {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            float f4 = x5 - this.f34034m;
            float f5 = y5 - this.f34035n;
            int E2 = this.f34038q.E();
            if ((f5 * f5) + (f4 * f4) < E2 * E2 && this.f34038q.L(this.f34028g, (int) x5, (int) y5)) {
                e(0);
            }
        }
        return true;
    }

    @Override // androidx.customview.widget.c
    public void open() {
        w();
    }

    void q(View view) {
        x1.f2(view, ((LayoutParams) view.getLayoutParams()).f34052d);
    }

    boolean r(View view) {
        if (view == null) {
            return false;
        }
        return this.f34027f && ((LayoutParams) view.getLayoutParams()).f34051c && this.f34029h > 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@o0 View view) {
        if (view.getParent() instanceof g) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f34027f) {
            return;
        }
        this.f34039r = view == this.f34028g;
    }

    boolean s() {
        return x1.c0(this) == 1;
    }

    public boolean t() {
        return this.f34027f;
    }

    void v(int i4) {
        if (this.f34028g == null) {
            this.f34029h = 0.0f;
            return;
        }
        boolean s4 = s();
        LayoutParams layoutParams = (LayoutParams) this.f34028g.getLayoutParams();
        int width = this.f34028g.getWidth();
        if (s4) {
            i4 = (getWidth() - i4) - width;
        }
        float paddingRight = (i4 - ((s4 ? getPaddingRight() : getPaddingLeft()) + (s4 ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / this.f34031j;
        this.f34029h = paddingRight;
        if (this.f34033l != 0) {
            y(paddingRight);
        }
        h(this.f34028g);
    }

    public boolean w() {
        return x(0);
    }

    public void z(@o0 e eVar) {
        this.f34036o.remove(eVar);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e, reason: collision with root package name */
        private static final int[] f34048e = {R.attr.layout_weight};

        /* renamed from: a, reason: collision with root package name */
        public float f34049a;

        /* renamed from: b, reason: collision with root package name */
        boolean f34050b;

        /* renamed from: c, reason: collision with root package name */
        boolean f34051c;

        /* renamed from: d, reason: collision with root package name */
        Paint f34052d;

        public LayoutParams() {
            super(-1, -1);
            this.f34049a = 0.0f;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f34049a = 0.0f;
        }

        public LayoutParams(@o0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f34049a = 0.0f;
        }

        public LayoutParams(@o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f34049a = 0.0f;
        }

        public LayoutParams(@o0 LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f34049a = 0.0f;
            this.f34049a = layoutParams.f34049a;
        }

        public LayoutParams(@o0 Context context, @q0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f34049a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f34048e);
            this.f34049a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f34023b = 0;
        this.f34029h = 1.0f;
        this.f34036o = new CopyOnWriteArrayList();
        this.f34040s = true;
        this.f34041t = new Rect();
        this.f34042u = new ArrayList<>();
        this.f34045x = new a();
        float f4 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        x1.H1(this, new b());
        setImportantForAccessibility(1);
        androidx.customview.widget.d p4 = androidx.customview.widget.d.p(this, 0.5f, new d());
        this.f34038q = p4;
        p4.U(f4 * 400.0f);
        C(new androidx.slidingpanelayout.widget.a(androidx.window.sidecar.x.b(context), androidx.core.content.d.getMainExecutor(context)));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
