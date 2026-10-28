package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.c1;
import androidx.annotation.l;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.core.graphics.e0;
import androidx.core.view.accessibility.h0;
import androidx.core.view.accessibility.o0;
import androidx.core.view.f0;
import androidx.core.view.j3;
import androidx.core.view.x1;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.d;
import java.util.ArrayList;
import java.util.List;
import r1.a;

/* loaded from: classes3.dex */
public class DrawerLayout extends ViewGroup implements androidx.customview.widget.c {
    public static final int L2 = 3;
    private static final int M2 = 64;
    private static final int N2 = -1728053248;
    public static final int O = 0;
    private static final int O2 = 160;
    public static final int P = 1;
    private static final int P2 = 400;
    public static final int Q = 2;
    public static final int Q1 = 1;
    private static final boolean Q2 = false;
    public static final int R = 0;
    private static final boolean R2 = true;
    private static final float S2 = 1.0f;
    static final boolean U2;
    public static final int V1 = 2;
    private static final boolean V2;
    private static boolean X2;
    private CharSequence A;
    private CharSequence B;
    private Object C;
    private boolean D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private final ArrayList<View> I;
    private Rect J;
    private Matrix K;
    private final o0 L;

    /* renamed from: b, reason: collision with root package name */
    private final d f29141b;

    /* renamed from: c, reason: collision with root package name */
    private float f29142c;

    /* renamed from: d, reason: collision with root package name */
    private int f29143d;

    /* renamed from: e, reason: collision with root package name */
    private int f29144e;

    /* renamed from: f, reason: collision with root package name */
    private float f29145f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f29146g;

    /* renamed from: h, reason: collision with root package name */
    private final androidx.customview.widget.d f29147h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.customview.widget.d f29148i;

    /* renamed from: j, reason: collision with root package name */
    private final g f29149j;

    /* renamed from: k, reason: collision with root package name */
    private final g f29150k;

    /* renamed from: l, reason: collision with root package name */
    private int f29151l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f29152m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f29153n;

    /* renamed from: o, reason: collision with root package name */
    private int f29154o;

    /* renamed from: p, reason: collision with root package name */
    private int f29155p;

    /* renamed from: q, reason: collision with root package name */
    private int f29156q;

    /* renamed from: r, reason: collision with root package name */
    private int f29157r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f29158s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private e f29159t;

    /* renamed from: u, reason: collision with root package name */
    private List<e> f29160u;

    /* renamed from: v, reason: collision with root package name */
    private float f29161v;

    /* renamed from: w, reason: collision with root package name */
    private float f29162w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f29163x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f29164y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f29165z;
    private static final String W2 = "androidx.drawerlayout.widget.DrawerLayout";
    private static final String M = "DrawerLayout";
    private static final int[] N = {R.attr.colorPrimaryDark};
    static final int[] T2 = {R.attr.layout_gravity};

    class a implements o0 {
        a() {
        }

        @Override // androidx.core.view.accessibility.o0
        public boolean a(@androidx.annotation.o0 View view, @q0 o0.a aVar) {
            if (!DrawerLayout.this.F(view) || DrawerLayout.this.s(view) == 2) {
                return false;
            }
            DrawerLayout.this.f(view);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).U(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends androidx.core.view.a {

        /* renamed from: e, reason: collision with root package name */
        private final Rect f29180e = new Rect();

        c() {
        }

        private void r(h0 h0Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (DrawerLayout.C(childAt)) {
                    h0Var.c(childAt);
                }
            }
        }

        private void s(h0 h0Var, h0 h0Var2) {
            Rect rect = this.f29180e;
            h0Var2.t(rect);
            h0Var.e1(rect);
            h0Var.p2(h0Var2.M0());
            h0Var.N1(h0Var2.S());
            h0Var.j1(h0Var2.y());
            h0Var.o1(h0Var2.D());
            h0Var.u1(h0Var2.x0());
            h0Var.x1(h0Var2.z0());
            h0Var.a1(h0Var2.p0());
            h0Var.Y1(h0Var2.I0());
            h0Var.a(h0Var2.p());
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View p4 = DrawerLayout.this.p();
            if (p4 == null) {
                return true;
            }
            CharSequence t4 = DrawerLayout.this.t(DrawerLayout.this.u(p4));
            if (t4 == null) {
                return true;
            }
            text.add(t4);
            return true;
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.a
        public void i(View view, h0 h0Var) {
            if (DrawerLayout.U2) {
                super.i(view, h0Var);
            } else {
                h0 Q0 = h0.Q0(h0Var);
                super.i(view, Q0);
                h0Var.a2(view);
                Object o02 = x1.o0(view);
                if (o02 instanceof View) {
                    h0Var.P1((View) o02);
                }
                s(h0Var, Q0);
                Q0.T0();
                r(h0Var, (ViewGroup) view);
            }
            h0Var.j1("androidx.drawerlayout.widget.DrawerLayout");
            h0Var.w1(false);
            h0Var.x1(false);
            h0Var.V0(h0.a.f27006f);
            h0Var.V0(h0.a.f27007g);
        }

        @Override // androidx.core.view.a
        public boolean k(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.U2 || DrawerLayout.C(view)) {
                return super.k(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class d extends androidx.core.view.a {
        d() {
        }

        @Override // androidx.core.view.a
        public void i(View view, h0 h0Var) {
            super.i(view, h0Var);
            if (DrawerLayout.C(view)) {
                return;
            }
            h0Var.P1(null);
        }
    }

    public interface e {
        void a(@androidx.annotation.o0 View view);

        void b(@androidx.annotation.o0 View view);

        void c(int i4);

        void d(@androidx.annotation.o0 View view, float f4);
    }

    public static abstract class f implements e {
        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void b(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void c(int i4) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void d(View view, float f4) {
        }
    }

    private class g extends d.c {

        /* renamed from: a, reason: collision with root package name */
        private final int f29182a;

        /* renamed from: b, reason: collision with root package name */
        private androidx.customview.widget.d f29183b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f29184c = new a();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.o();
            }
        }

        g(int i4) {
            this.f29182a = i4;
        }

        private void n() {
            View n4 = DrawerLayout.this.n(this.f29182a == 3 ? 5 : 3);
            if (n4 != null) {
                DrawerLayout.this.f(n4);
            }
        }

        @Override // androidx.customview.widget.d.c
        public int a(View view, int i4, int i5) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i4, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i4, width));
        }

        @Override // androidx.customview.widget.d.c
        public int b(View view, int i4, int i5) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(View view) {
            if (DrawerLayout.this.G(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.d.c
        public void f(int i4, int i5) {
            View n4 = (i4 & 1) == 1 ? DrawerLayout.this.n(3) : DrawerLayout.this.n(5);
            if (n4 == null || DrawerLayout.this.s(n4) != 0) {
                return;
            }
            this.f29183b.d(n4, i5);
        }

        @Override // androidx.customview.widget.d.c
        public boolean g(int i4) {
            return false;
        }

        @Override // androidx.customview.widget.d.c
        public void h(int i4, int i5) {
            DrawerLayout.this.postDelayed(this.f29184c, 160L);
        }

        @Override // androidx.customview.widget.d.c
        public void i(View view, int i4) {
            ((LayoutParams) view.getLayoutParams()).f29171c = false;
            n();
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i4) {
            DrawerLayout.this.k0(i4, this.f29183b.z());
        }

        @Override // androidx.customview.widget.d.c
        public void k(View view, int i4, int i5, int i6, int i7) {
            float width = (DrawerLayout.this.c(view, 3) ? i4 + r3 : DrawerLayout.this.getWidth() - i4) / view.getWidth();
            DrawerLayout.this.d0(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public void l(View view, float f4, float f5) {
            int i4;
            float v4 = DrawerLayout.this.v(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                i4 = (f4 > 0.0f || (f4 == 0.0f && v4 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f4 < 0.0f || (f4 == 0.0f && v4 > 0.5f)) {
                    width2 -= width;
                }
                i4 = width2;
            }
            this.f29183b.V(i4, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i4) {
            return DrawerLayout.this.G(view) && DrawerLayout.this.c(view, this.f29182a) && DrawerLayout.this.s(view) == 0;
        }

        void o() {
            View n4;
            int width;
            int B = this.f29183b.B();
            boolean z4 = this.f29182a == 3;
            if (z4) {
                n4 = DrawerLayout.this.n(3);
                width = (n4 != null ? -n4.getWidth() : 0) + B;
            } else {
                n4 = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - B;
            }
            if (n4 != null) {
                if (((!z4 || n4.getLeft() >= width) && (z4 || n4.getLeft() <= width)) || DrawerLayout.this.s(n4) != 0) {
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) n4.getLayoutParams();
                this.f29183b.X(n4, width, n4.getTop());
                layoutParams.f29171c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f29184c);
        }

        public void q(androidx.customview.widget.d dVar) {
            this.f29183b = dVar;
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        U2 = true;
        V2 = true;
        X2 = i4 >= 29;
    }

    public DrawerLayout(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private boolean A() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (((LayoutParams) getChildAt(i4).getLayoutParams()).f29171c) {
                return true;
            }
        }
        return false;
    }

    private boolean B() {
        return p() != null;
    }

    static boolean C(View view) {
        return (x1.X(view) == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    private boolean J(float f4, float f5, View view) {
        if (this.J == null) {
            this.J = new Rect();
        }
        view.getHitRect(this.J);
        return this.J.contains((int) f4, (int) f5);
    }

    private void K(Drawable drawable, int i4) {
        if (drawable == null || !drawable.isAutoMirrored()) {
            return;
        }
        drawable.setLayoutDirection(i4);
    }

    private Drawable R() {
        int c02 = x1.c0(this);
        if (c02 == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                K(drawable, c02);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                K(drawable2, c02);
                return this.F;
            }
        }
        return this.G;
    }

    private Drawable S() {
        int c02 = x1.c0(this);
        if (c02 == 0) {
            Drawable drawable = this.F;
            if (drawable != null) {
                K(drawable, c02);
                return this.F;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                K(drawable2, c02);
                return this.E;
            }
        }
        return this.H;
    }

    private void T() {
        if (V2) {
            return;
        }
        this.f29164y = R();
        this.f29165z = S();
    }

    private void i0(View view) {
        h0.a aVar = h0.a.f27026z;
        x1.x1(view, aVar.b());
        if (!F(view) || s(view) == 2) {
            return;
        }
        x1.A1(view, aVar, null, this.L);
    }

    private void j0(View view, boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((z4 || G(childAt)) && !(z4 && childAt == view)) {
                x1.Z1(childAt, 4);
            } else {
                x1.Z1(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent x4 = x(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(x4);
            x4.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent x(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.K == null) {
                this.K = new Matrix();
            }
            matrix.invert(this.K);
            obtain.transform(this.K);
        }
        return obtain;
    }

    static String y(int i4) {
        return (i4 & 3) == 3 ? "LEFT" : (i4 & 5) == 5 ? "RIGHT" : Integer.toHexString(i4);
    }

    private static boolean z(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    boolean D(View view) {
        return ((LayoutParams) view.getLayoutParams()).f29169a == 0;
    }

    public boolean E(int i4) {
        View n4 = n(i4);
        if (n4 != null) {
            return F(n4);
        }
        return false;
    }

    public boolean F(@androidx.annotation.o0 View view) {
        if (G(view)) {
            return (((LayoutParams) view.getLayoutParams()).f29172d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean G(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).f29169a, x1.c0(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public boolean H(int i4) {
        View n4 = n(i4);
        if (n4 != null) {
            return I(n4);
        }
        return false;
    }

    public boolean I(@androidx.annotation.o0 View view) {
        if (G(view)) {
            return ((LayoutParams) view.getLayoutParams()).f29170b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void L(View view, float f4) {
        float v4 = v(view);
        float width = view.getWidth();
        int i4 = ((int) (width * f4)) - ((int) (v4 * width));
        if (!c(view, 3)) {
            i4 = -i4;
        }
        view.offsetLeftAndRight(i4);
        d0(view, f4);
    }

    public void M(int i4) {
        N(i4, true);
    }

    public void N(int i4, boolean z4) {
        View n4 = n(i4);
        if (n4 != null) {
            P(n4, z4);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + y(i4));
        }
    }

    public void O(@androidx.annotation.o0 View view) {
        P(view, true);
    }

    public void P(@androidx.annotation.o0 View view, boolean z4) {
        if (!G(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f29153n) {
            layoutParams.f29170b = 1.0f;
            layoutParams.f29172d = 1;
            j0(view, true);
            i0(view);
        } else if (z4) {
            layoutParams.f29172d |= 2;
            if (c(view, 3)) {
                this.f29147h.X(view, 0, view.getTop());
            } else {
                this.f29148i.X(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            L(view, 1.0f);
            k0(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void Q(@androidx.annotation.o0 e eVar) {
        List<e> list;
        if (eVar == null || (list = this.f29160u) == null) {
            return;
        }
        list.remove(eVar);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void U(Object obj, boolean z4) {
        this.C = obj;
        this.D = z4;
        setWillNotDraw(!z4 && getBackground() == null);
        requestLayout();
    }

    public void V(float f4) {
        this.f29142c = f4;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (G(childAt)) {
                x1.V1(childAt, this.f29142c);
            }
        }
    }

    @Deprecated
    public void W(e eVar) {
        e eVar2 = this.f29159t;
        if (eVar2 != null) {
            Q(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f29159t = eVar;
    }

    public void X(int i4) {
        Y(i4, 3);
        Y(i4, 5);
    }

    public void Y(int i4, int i5) {
        View n4;
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, x1.c0(this));
        if (i5 == 3) {
            this.f29154o = i4;
        } else if (i5 == 5) {
            this.f29155p = i4;
        } else if (i5 == 8388611) {
            this.f29156q = i4;
        } else if (i5 == 8388613) {
            this.f29157r = i4;
        }
        if (i4 != 0) {
            (absoluteGravity == 3 ? this.f29147h : this.f29148i).c();
        }
        if (i4 != 1) {
            if (i4 == 2 && (n4 = n(absoluteGravity)) != null) {
                O(n4);
                return;
            }
            return;
        }
        View n5 = n(absoluteGravity);
        if (n5 != null) {
            f(n5);
        }
    }

    public void Z(int i4, @androidx.annotation.o0 View view) {
        if (G(view)) {
            Y(i4, ((LayoutParams) view.getLayoutParams()).f29169a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void a(@androidx.annotation.o0 e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f29160u == null) {
            this.f29160u = new ArrayList();
        }
        this.f29160u.add(eVar);
    }

    public void a0(@v int i4, int i5) {
        b0(androidx.core.content.d.getDrawable(getContext(), i4), i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (!G(childAt)) {
                this.I.add(childAt);
            } else if (F(childAt)) {
                childAt.addFocusables(arrayList, i4, i5);
                z4 = true;
            }
        }
        if (!z4) {
            int size = this.I.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = this.I.get(i7);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i4, i5);
                }
            }
        }
        this.I.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (o() != null || G(view)) {
            x1.Z1(view, 4);
        } else {
            x1.Z1(view, 1);
        }
        if (U2) {
            return;
        }
        x1.H1(view, this.f29141b);
    }

    void b() {
        if (this.f29158s) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f29158s = true;
    }

    public void b0(Drawable drawable, int i4) {
        if (V2) {
            return;
        }
        if ((i4 & f0.f27129b) == 8388611) {
            this.E = drawable;
        } else if ((i4 & f0.f27130c) == 8388613) {
            this.F = drawable;
        } else if ((i4 & 3) == 3) {
            this.G = drawable;
        } else if ((i4 & 5) != 5) {
            return;
        } else {
            this.H = drawable;
        }
        T();
        invalidate();
    }

    boolean c(View view, int i4) {
        return (u(view) & i4) == i4;
    }

    public void c0(int i4, @q0 CharSequence charSequence) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, x1.c0(this));
        if (absoluteGravity == 3) {
            this.A = charSequence;
        } else if (absoluteGravity == 5) {
            this.B = charSequence;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.c
    public void close() {
        d(f0.f27129b);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f4 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            f4 = Math.max(f4, ((LayoutParams) getChildAt(i4).getLayoutParams()).f29170b);
        }
        this.f29145f = f4;
        boolean o4 = this.f29147h.o(true);
        boolean o5 = this.f29148i.o(true);
        if (o4 || o5) {
            x1.t1(this);
        }
    }

    public void d(int i4) {
        e(i4, true);
    }

    void d0(View view, float f4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f4 == layoutParams.f29170b) {
            return;
        }
        layoutParams.f29170b = f4;
        l(view, f4);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f29145f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt = getChildAt(i4);
            if (J(x4, y4, childAt) && !D(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        int height = getHeight();
        boolean D = D(view);
        int width = getWidth();
        int save = canvas.save();
        int i4 = 0;
        if (D) {
            int childCount = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt != view && childAt.getVisibility() == 0 && z(childAt) && G(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i5) {
                            i5 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i5, 0, width, getHeight());
            i4 = i5;
        }
        boolean drawChild = super.drawChild(canvas, view, j4);
        canvas.restoreToCount(save);
        float f4 = this.f29145f;
        if (f4 > 0.0f && D) {
            this.f29146g.setColor((this.f29144e & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f4)) << 24));
            canvas.drawRect(i4, 0.0f, width, getHeight(), this.f29146g);
        } else if (this.f29164y != null && c(view, 3)) {
            int intrinsicWidth = this.f29164y.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f29147h.B(), 1.0f));
            this.f29164y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f29164y.setAlpha((int) (max * 255.0f));
            this.f29164y.draw(canvas);
        } else if (this.f29165z != null && c(view, 5)) {
            int intrinsicWidth2 = this.f29165z.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f29148i.B(), 1.0f));
            this.f29165z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f29165z.setAlpha((int) (max2 * 255.0f));
            this.f29165z.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i4, boolean z4) {
        View n4 = n(i4);
        if (n4 != null) {
            g(n4, z4);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + y(i4));
        }
    }

    public void e0(@l int i4) {
        this.f29144e = i4;
        invalidate();
    }

    public void f(@androidx.annotation.o0 View view) {
        g(view, true);
    }

    public void f0(int i4) {
        this.f29163x = i4 != 0 ? androidx.core.content.d.getDrawable(getContext(), i4) : null;
        invalidate();
    }

    public void g(@androidx.annotation.o0 View view, boolean z4) {
        if (!G(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f29153n) {
            layoutParams.f29170b = 0.0f;
            layoutParams.f29172d = 0;
        } else if (z4) {
            layoutParams.f29172d |= 4;
            if (c(view, 3)) {
                this.f29147h.X(view, -view.getWidth(), view.getTop());
            } else {
                this.f29148i.X(view, getWidth(), view.getTop());
            }
        } else {
            L(view, 0.0f);
            k0(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void g0(@q0 Drawable drawable) {
        this.f29163x = drawable;
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void h() {
        i(false);
    }

    public void h0(@l int i4) {
        this.f29163x = new ColorDrawable(i4);
        invalidate();
    }

    void i(boolean z4) {
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (G(childAt) && (!z4 || layoutParams.f29171c)) {
                z5 |= c(childAt, 3) ? this.f29147h.X(childAt, -childAt.getWidth(), childAt.getTop()) : this.f29148i.X(childAt, getWidth(), childAt.getTop());
                layoutParams.f29171c = false;
            }
        }
        this.f29149j.p();
        this.f29150k.p();
        if (z5) {
            invalidate();
        }
    }

    @Override // androidx.customview.widget.c
    public boolean isOpen() {
        return E(f0.f27129b);
    }

    void j(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f29172d & 1) == 1) {
            layoutParams.f29172d = 0;
            List<e> list = this.f29160u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f29160u.get(size).b(view);
                }
            }
            j0(view, false);
            i0(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f29172d & 1) == 0) {
            layoutParams.f29172d = 1;
            List<e> list = this.f29160u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f29160u.get(size).a(view);
                }
            }
            j0(view, true);
            i0(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void k0(int i4, View view) {
        int i5;
        int F = this.f29147h.F();
        int F2 = this.f29148i.F();
        if (F == 1 || F2 == 1) {
            i5 = 1;
        } else {
            i5 = 2;
            if (F != 2 && F2 != 2) {
                i5 = 0;
            }
        }
        if (view != null && i4 == 0) {
            float f4 = ((LayoutParams) view.getLayoutParams()).f29170b;
            if (f4 == 0.0f) {
                j(view);
            } else if (f4 == 1.0f) {
                k(view);
            }
        }
        if (i5 != this.f29151l) {
            this.f29151l = i5;
            List<e> list = this.f29160u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f29160u.get(size).c(i5);
                }
            }
        }
    }

    void l(View view, float f4) {
        List<e> list = this.f29160u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f29160u.get(size).d(view, f4);
            }
        }
    }

    View n(int i4) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, x1.c0(this)) & 7;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((u(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((((LayoutParams) childAt.getLayoutParams()).f29172d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29153n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29153n = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.D || this.f29163x == null) {
            return;
        }
        Object obj = this.C;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f29163x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f29163x.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0 != 3) goto L13;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.customview.widget.d r1 = r6.f29147h
            boolean r1 = r1.W(r7)
            androidx.customview.widget.d r2 = r6.f29148i
            boolean r2 = r2.W(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            androidx.customview.widget.d r7 = r6.f29147h
            boolean r7 = r7.f(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f29149j
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f29150k
            r7.p()
            goto L36
        L31:
            r6.i(r2)
            r6.f29158s = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f29161v = r0
            r6.f29162w = r7
            float r4 = r6.f29145f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            androidx.customview.widget.d r4 = r6.f29147h
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.v(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.D(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.f29158s = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.A()
            if (r7 != 0) goto L70
            boolean r7 = r6.f29158s
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 != 4 || !B()) {
            return super.onKeyDown(i4, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (i4 != 4) {
            return super.onKeyUp(i4, keyEvent);
        }
        View p4 = p();
        if (p4 != null && s(p4) == 0) {
            h();
        }
        return p4 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        WindowInsets rootWindowInsets;
        float f4;
        int i10;
        boolean z5 = true;
        this.f29152m = true;
        int i11 = i6 - i4;
        int childCount = getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (D(childAt)) {
                    int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i13, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i13, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f5 = measuredWidth;
                        i10 = (-measuredWidth) + ((int) (layoutParams.f29170b * f5));
                        f4 = (measuredWidth + i10) / f5;
                    } else {
                        float f6 = measuredWidth;
                        f4 = (i11 - r11) / f6;
                        i10 = i11 - ((int) (layoutParams.f29170b * f6));
                    }
                    boolean z6 = f4 != layoutParams.f29170b ? z5 : false;
                    int i14 = layoutParams.f29169a & 112;
                    if (i14 == 16) {
                        int i15 = i7 - i5;
                        int i16 = (i15 - measuredHeight) / 2;
                        int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i16 < i17) {
                            i16 = i17;
                        } else {
                            int i18 = i16 + measuredHeight;
                            int i19 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i18 > i15 - i19) {
                                i16 = (i15 - i19) - measuredHeight;
                            }
                        }
                        childAt.layout(i10, i16, measuredWidth + i10, measuredHeight + i16);
                    } else if (i14 != 80) {
                        int i20 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i10, i20, measuredWidth + i10, measuredHeight + i20);
                    } else {
                        int i21 = i7 - i5;
                        childAt.layout(i10, (i21 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i10, i21 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z6) {
                        d0(childAt, f4);
                    }
                    int i22 = layoutParams.f29170b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i22) {
                        childAt.setVisibility(i22);
                    }
                }
            }
            i12++;
            z5 = true;
        }
        if (X2 && (rootWindowInsets = getRootWindowInsets()) != null) {
            e0 n4 = j3.K(rootWindowInsets).n();
            androidx.customview.widget.d dVar = this.f29147h;
            dVar.S(Math.max(dVar.A(), n4.f26245a));
            androidx.customview.widget.d dVar2 = this.f29148i;
            dVar2.S(Math.max(dVar2.A(), n4.f26247c));
        }
        this.f29152m = false;
        this.f29153n = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z4 = this.C != null && x1.W(this);
        int c02 = x1.c0(this);
        int childCount = getChildCount();
        boolean z5 = false;
        boolean z6 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z4) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.f29169a, c02);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsets = (WindowInsets) this.C;
                        if (absoluteGravity == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.C;
                        if (absoluteGravity == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (D(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!G(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i6 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (V2) {
                        float T = x1.T(childAt);
                        float f4 = this.f29142c;
                        if (T != f4) {
                            x1.V1(childAt, f4);
                        }
                    }
                    int u4 = u(childAt) & 7;
                    boolean z7 = u4 == 3;
                    if ((z7 && z5) || (!z7 && z6)) {
                        throw new IllegalStateException(android.support.v4.media.c.a(new StringBuilder("Child drawer has absolute gravity "), y(u4), " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z7) {
                        z5 = true;
                    } else {
                        z6 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i4, this.f29143d + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i5, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View n4;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i4 = savedState.f29173d;
        if (i4 != 0 && (n4 = n(i4)) != null) {
            O(n4);
        }
        int i5 = savedState.f29174e;
        if (i5 != 3) {
            Y(i5, 3);
        }
        int i6 = savedState.f29175f;
        if (i6 != 3) {
            Y(i6, 5);
        }
        int i7 = savedState.f29176g;
        if (i7 != 3) {
            Y(i7, f0.f27129b);
        }
        int i10 = savedState.f29177h;
        if (i10 != 3) {
            Y(i10, f0.f27130c);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i4) {
        T();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
            int i5 = layoutParams.f29172d;
            boolean z4 = i5 == 1;
            boolean z5 = i5 == 2;
            if (z4 || z5) {
                savedState.f29173d = layoutParams.f29169a;
                break;
            }
        }
        savedState.f29174e = this.f29154o;
        savedState.f29175f = this.f29155p;
        savedState.f29176g = this.f29156q;
        savedState.f29177h = this.f29157r;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (s(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.customview.widget.d r0 = r6.f29147h
            r0.M(r7)
            androidx.customview.widget.d r0 = r6.f29148i
            r0.M(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6d
        L1a:
            r6.i(r2)
            r6.f29158s = r1
            goto L6d
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            androidx.customview.widget.d r3 = r6.f29147h
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.v(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.D(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.f29161v
            float r0 = r0 - r3
            float r3 = r6.f29162w
            float r7 = r7 - r3
            androidx.customview.widget.d r3 = r6.f29147h
            int r3 = r3.E()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r7 = r7 + r0
            int r3 = r3 * r3
            float r0 = (float) r3
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L5a
            int r7 = r6.s(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.i(r1)
            goto L6d
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f29161v = r0
            r6.f29162w = r7
            r6.f29158s = r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.customview.widget.c
    public void open() {
        M(f0.f27129b);
    }

    View p() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (G(childAt) && I(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public float q() {
        if (V2) {
            return this.f29142c;
        }
        return 0.0f;
    }

    public int r(int i4) {
        int c02 = x1.c0(this);
        if (i4 == 3) {
            int i5 = this.f29154o;
            if (i5 != 3) {
                return i5;
            }
            int i6 = c02 == 0 ? this.f29156q : this.f29157r;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i4 == 5) {
            int i7 = this.f29155p;
            if (i7 != 3) {
                return i7;
            }
            int i10 = c02 == 0 ? this.f29157r : this.f29156q;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
        if (i4 == 8388611) {
            int i11 = this.f29156q;
            if (i11 != 3) {
                return i11;
            }
            int i12 = c02 == 0 ? this.f29154o : this.f29155p;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i4 != 8388613) {
            return 0;
        }
        int i13 = this.f29157r;
        if (i13 != 3) {
            return i13;
        }
        int i14 = c02 == 0 ? this.f29155p : this.f29154o;
        if (i14 != 3) {
            return i14;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (z4) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f29152m) {
            return;
        }
        super.requestLayout();
    }

    public int s(@androidx.annotation.o0 View view) {
        if (G(view)) {
            return r(((LayoutParams) view.getLayoutParams()).f29169a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @q0
    public CharSequence t(int i4) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, x1.c0(this));
        if (absoluteGravity == 3) {
            return this.A;
        }
        if (absoluteGravity == 5) {
            return this.B;
        }
        return null;
    }

    int u(View view) {
        return Gravity.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).f29169a, x1.c0(this));
    }

    float v(View view) {
        return ((LayoutParams) view.getLayoutParams()).f29170b;
    }

    @q0
    public Drawable w() {
        return this.f29163x;
    }

    public DrawerLayout(@androidx.annotation.o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C1379a.f89567b);
    }

    public DrawerLayout(@androidx.annotation.o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f29141b = new d();
        this.f29144e = N2;
        this.f29146g = new Paint();
        this.f29153n = true;
        this.f29154o = 3;
        this.f29155p = 3;
        this.f29156q = 3;
        this.f29157r = 3;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.L = new a();
        setDescendantFocusability(262144);
        float f4 = getResources().getDisplayMetrics().density;
        this.f29143d = (int) ((64.0f * f4) + 0.5f);
        float f5 = f4 * 400.0f;
        g gVar = new g(3);
        this.f29149j = gVar;
        g gVar2 = new g(5);
        this.f29150k = gVar2;
        androidx.customview.widget.d p4 = androidx.customview.widget.d.p(this, 1.0f, gVar);
        this.f29147h = p4;
        p4.T(1);
        p4.U(f5);
        gVar.q(p4);
        androidx.customview.widget.d p5 = androidx.customview.widget.d.p(this, 1.0f, gVar2);
        this.f29148i = p5;
        p5.T(2);
        p5.U(f5);
        gVar2.q(p5);
        setFocusableInTouchMode(true);
        x1.Z1(this, 1);
        x1.H1(this, new c());
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(N);
            try {
                this.f29163x = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.j.f89682g, i4, 0);
        try {
            int i5 = a.j.f89683h;
            if (obtainStyledAttributes2.hasValue(i5)) {
                this.f29142c = obtainStyledAttributes2.getDimension(i5, 0.0f);
            } else {
                this.f29142c = getResources().getDimension(a.c.f89591h);
            }
            obtainStyledAttributes2.recycle();
            this.I = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e, reason: collision with root package name */
        private static final int f29166e = 1;

        /* renamed from: f, reason: collision with root package name */
        private static final int f29167f = 2;

        /* renamed from: g, reason: collision with root package name */
        private static final int f29168g = 4;

        /* renamed from: a, reason: collision with root package name */
        public int f29169a;

        /* renamed from: b, reason: collision with root package name */
        float f29170b;

        /* renamed from: c, reason: collision with root package name */
        boolean f29171c;

        /* renamed from: d, reason: collision with root package name */
        int f29172d;

        public LayoutParams(@androidx.annotation.o0 Context context, @q0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29169a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.T2);
            this.f29169a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f29169a = 0;
        }

        public LayoutParams(int i4, int i5, int i6) {
            this(i4, i5);
            this.f29169a = i6;
        }

        public LayoutParams(@androidx.annotation.o0 LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f29169a = 0;
            this.f29169a = layoutParams.f29169a;
        }

        public LayoutParams(@androidx.annotation.o0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f29169a = 0;
        }

        public LayoutParams(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f29169a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        int f29173d;

        /* renamed from: e, reason: collision with root package name */
        int f29174e;

        /* renamed from: f, reason: collision with root package name */
        int f29175f;

        /* renamed from: g, reason: collision with root package name */
        int f29176g;

        /* renamed from: h, reason: collision with root package name */
        int f29177h;

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
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState(@androidx.annotation.o0 Parcel parcel, @q0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29173d = 0;
            this.f29173d = parcel.readInt();
            this.f29174e = parcel.readInt();
            this.f29175f = parcel.readInt();
            this.f29176g = parcel.readInt();
            this.f29177h = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f29173d);
            parcel.writeInt(this.f29174e);
            parcel.writeInt(this.f29175f);
            parcel.writeInt(this.f29176g);
            parcel.writeInt(this.f29177h);
        }

        public SavedState(@androidx.annotation.o0 Parcelable parcelable) {
            super(parcelable);
            this.f29173d = 0;
        }
    }
}
