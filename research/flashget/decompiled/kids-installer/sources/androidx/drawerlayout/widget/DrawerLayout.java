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
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.core.view.accessibility.g0;
import androidx.core.view.d0;
import androidx.core.view.y1;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: e0, reason: collision with root package name */
    public static final int f7683e0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f7684f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f7685g0 = 2;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f7686h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f7687i0 = 1;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f7688j0 = 2;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f7689k0 = 3;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f7690l0 = 64;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f7691m0 = 10;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f7692n0 = -1728053248;

    /* renamed from: o0, reason: collision with root package name */
    private static final int f7693o0 = 160;

    /* renamed from: p0, reason: collision with root package name */
    private static final int f7694p0 = 400;

    /* renamed from: q0, reason: collision with root package name */
    private static final boolean f7695q0 = false;

    /* renamed from: s0, reason: collision with root package name */
    private static final float f7697s0 = 1.0f;
    private boolean A;
    private int B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private boolean G;

    @q0
    private d H;
    private List<d> I;
    private float J;
    private float K;
    private Drawable L;
    private Drawable M;
    private Drawable N;
    private CharSequence O;
    private CharSequence P;
    private Object Q;
    private boolean R;
    private Drawable S;
    private Drawable T;
    private Drawable U;
    private Drawable V;
    private final ArrayList<View> W;

    /* renamed from: a0, reason: collision with root package name */
    private Rect f7701a0;

    /* renamed from: b0, reason: collision with root package name */
    private Matrix f7702b0;

    /* renamed from: o, reason: collision with root package name */
    private final c f7703o;

    /* renamed from: p, reason: collision with root package name */
    private float f7704p;

    /* renamed from: q, reason: collision with root package name */
    private int f7705q;

    /* renamed from: r, reason: collision with root package name */
    private int f7706r;

    /* renamed from: s, reason: collision with root package name */
    private float f7707s;

    /* renamed from: t, reason: collision with root package name */
    private Paint f7708t;

    /* renamed from: u, reason: collision with root package name */
    private final androidx.customview.widget.c f7709u;

    /* renamed from: v, reason: collision with root package name */
    private final androidx.customview.widget.c f7710v;

    /* renamed from: w, reason: collision with root package name */
    private final f f7711w;

    /* renamed from: x, reason: collision with root package name */
    private final f f7712x;

    /* renamed from: y, reason: collision with root package name */
    private int f7713y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7714z;

    /* renamed from: c0, reason: collision with root package name */
    private static final String f7681c0 = "DrawerLayout";

    /* renamed from: d0, reason: collision with root package name */
    private static final int[] f7682d0 = {R.attr.colorPrimaryDark};

    /* renamed from: t0, reason: collision with root package name */
    static final int[] f7698t0 = {R.attr.layout_gravity};

    /* renamed from: r0, reason: collision with root package name */
    private static final boolean f7696r0 = true;

    /* renamed from: u0, reason: collision with root package name */
    static final boolean f7699u0 = f7696r0;

    /* renamed from: v0, reason: collision with root package name */
    private static final boolean f7700v0 = f7696r0;

    class a implements View.OnApplyWindowInsetsListener {
        a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).U(windowInsets, windowInsets.getSystemWindowInsetTop() > 0 ? DrawerLayout.f7696r0 : false);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* loaded from: classes3.dex */
    class b extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        private final Rect f7728d = new Rect();

        b() {
        }

        private void n(g0 g0Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (DrawerLayout.C(childAt)) {
                    g0Var.c(childAt);
                }
            }
        }

        private void o(g0 g0Var, g0 g0Var2) {
            Rect rect = this.f7728d;
            g0Var2.s(rect);
            g0Var.R0(rect);
            g0Var2.t(rect);
            g0Var.S0(rect);
            g0Var.V1(g0Var2.B0());
            g0Var.x1(g0Var2.N());
            g0Var.W0(g0Var2.w());
            g0Var.a1(g0Var2.A());
            g0Var.g1(g0Var2.o0());
            g0Var.X0(g0Var2.j0());
            g0Var.i1(g0Var2.p0());
            g0Var.j1(g0Var2.q0());
            g0Var.O0(g0Var2.g0());
            g0Var.G1(g0Var2.y0());
            g0Var.t1(g0Var2.t0());
            g0Var.a(g0Var2.p());
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View p5 = DrawerLayout.this.p();
            if (p5 == null) {
                return DrawerLayout.f7696r0;
            }
            CharSequence t5 = DrawerLayout.this.t(DrawerLayout.this.u(p5));
            if (t5 == null) {
                return DrawerLayout.f7696r0;
            }
            text.add(t5);
            return DrawerLayout.f7696r0;
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // androidx.core.view.a
        public void g(View view, g0 g0Var) {
            if (DrawerLayout.f7699u0) {
                super.g(view, g0Var);
            } else {
                g0 F0 = g0.F0(g0Var);
                super.g(view, F0);
                g0Var.I1(view);
                Object l02 = y1.l0(view);
                if (l02 instanceof View) {
                    g0Var.z1((View) l02);
                }
                o(g0Var, F0);
                F0.I0();
                n(g0Var, (ViewGroup) view);
            }
            g0Var.W0(DrawerLayout.class.getName());
            g0Var.i1(false);
            g0Var.j1(false);
            g0Var.K0(g0.a.f5373f);
            g0Var.K0(g0.a.f5374g);
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f7699u0 || DrawerLayout.C(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, g0 g0Var) {
            super.g(view, g0Var);
            if (DrawerLayout.C(view)) {
                return;
            }
            g0Var.z1(null);
        }
    }

    public interface d {
        void a(@o0 View view);

        void b(@o0 View view);

        void c(int i5);

        void d(@o0 View view, float f6);
    }

    /* loaded from: classes3.dex */
    public static abstract class e implements d {
        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void a(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void b(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void c(int i5) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void d(View view, float f6) {
        }
    }

    /* loaded from: classes3.dex */
    private class f extends c.AbstractC0065c {

        /* renamed from: a, reason: collision with root package name */
        private final int f7730a;

        /* renamed from: b, reason: collision with root package name */
        private androidx.customview.widget.c f7731b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f7732c = new a();

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.o();
            }
        }

        f(int i5) {
            this.f7730a = i5;
        }

        private void n() {
            View n5 = DrawerLayout.this.n(this.f7730a == 3 ? 5 : 3);
            if (n5 != null) {
                DrawerLayout.this.f(n5);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int a(View view, int i5, int i6) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i5, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i5, width));
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int b(View view, int i5, int i6) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int d(View view) {
            if (DrawerLayout.this.G(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void f(int i5, int i6) {
            View n5 = (i5 & 1) == 1 ? DrawerLayout.this.n(3) : DrawerLayout.this.n(5);
            if (n5 == null || DrawerLayout.this.s(n5) != 0) {
                return;
            }
            this.f7731b.d(n5, i6);
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public boolean g(int i5) {
            return false;
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void h(int i5, int i6) {
            DrawerLayout.this.postDelayed(this.f7732c, 160L);
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void i(View view, int i5) {
            ((LayoutParams) view.getLayoutParams()).f7720c = false;
            n();
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void j(int i5) {
            DrawerLayout.this.j0(this.f7730a, i5, this.f7731b.z());
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void k(View view, int i5, int i6, int i7, int i8) {
            float width = (DrawerLayout.this.c(view, 3) ? i5 + r3 : DrawerLayout.this.getWidth() - i5) / view.getWidth();
            DrawerLayout.this.d0(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void l(View view, float f6, float f7) {
            int i5;
            float v5 = DrawerLayout.this.v(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                i5 = (f6 > 0.0f || (f6 == 0.0f && v5 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f6 < 0.0f || (f6 == 0.0f && v5 > 0.5f)) {
                    width2 -= width;
                }
                i5 = width2;
            }
            this.f7731b.T(i5, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public boolean m(View view, int i5) {
            if (DrawerLayout.this.G(view) && DrawerLayout.this.c(view, this.f7730a) && DrawerLayout.this.s(view) == 0) {
                return DrawerLayout.f7696r0;
            }
            return false;
        }

        void o() {
            View n5;
            int width;
            int A = this.f7731b.A();
            boolean z5 = this.f7730a == 3;
            if (z5) {
                n5 = DrawerLayout.this.n(3);
                width = (n5 != null ? -n5.getWidth() : 0) + A;
            } else {
                n5 = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - A;
            }
            if (n5 != null) {
                if (((!z5 || n5.getLeft() >= width) && (z5 || n5.getLeft() <= width)) || DrawerLayout.this.s(n5) != 0) {
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) n5.getLayoutParams();
                this.f7731b.V(n5, width, n5.getTop());
                layoutParams.f7720c = DrawerLayout.f7696r0;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f7732c);
        }

        public void q(androidx.customview.widget.c cVar) {
            this.f7731b = cVar;
        }
    }

    public DrawerLayout(@o0 Context context) {
        this(context, null);
    }

    private boolean A() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).f7720c) {
                return f7696r0;
            }
        }
        return false;
    }

    private boolean B() {
        if (p() != null) {
            return f7696r0;
        }
        return false;
    }

    static boolean C(View view) {
        if (y1.V(view) == 4 || y1.V(view) == 2) {
            return false;
        }
        return f7696r0;
    }

    private boolean J(float f6, float f7, View view) {
        if (this.f7701a0 == null) {
            this.f7701a0 = new Rect();
        }
        view.getHitRect(this.f7701a0);
        return this.f7701a0.contains((int) f6, (int) f7);
    }

    private boolean K(Drawable drawable, int i5) {
        if (drawable == null || !androidx.core.graphics.drawable.d.h(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.d.m(drawable, i5);
        return f7696r0;
    }

    private Drawable R() {
        int Z = y1.Z(this);
        if (Z == 0) {
            Drawable drawable = this.S;
            if (drawable != null) {
                K(drawable, Z);
                return this.S;
            }
        } else {
            Drawable drawable2 = this.T;
            if (drawable2 != null) {
                K(drawable2, Z);
                return this.T;
            }
        }
        return this.U;
    }

    private Drawable S() {
        int Z = y1.Z(this);
        if (Z == 0) {
            Drawable drawable = this.T;
            if (drawable != null) {
                K(drawable, Z);
                return this.T;
            }
        } else {
            Drawable drawable2 = this.S;
            if (drawable2 != null) {
                K(drawable2, Z);
                return this.S;
            }
        }
        return this.V;
    }

    private void T() {
        if (f7700v0) {
            return;
        }
        this.M = R();
        this.N = S();
    }

    private void i0(View view, boolean z5) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((z5 || G(childAt)) && !(z5 && childAt == view)) {
                y1.R1(childAt, 4);
            } else {
                y1.R1(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent x5 = x(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(x5);
            x5.recycle();
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
            if (this.f7702b0 == null) {
                this.f7702b0 = new Matrix();
            }
            matrix.invert(this.f7702b0);
            obtain.transform(this.f7702b0);
        }
        return obtain;
    }

    static String y(int i5) {
        return (i5 & 3) == 3 ? "LEFT" : (i5 & 5) == 5 ? "RIGHT" : Integer.toHexString(i5);
    }

    private static boolean z(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return f7696r0;
    }

    boolean D(View view) {
        if (((LayoutParams) view.getLayoutParams()).f7718a == 0) {
            return f7696r0;
        }
        return false;
    }

    public boolean E(int i5) {
        View n5 = n(i5);
        if (n5 != null) {
            return F(n5);
        }
        return false;
    }

    public boolean F(@o0 View view) {
        if (G(view)) {
            if ((((LayoutParams) view.getLayoutParams()).f7721d & 1) == 1) {
                return f7696r0;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean G(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).f7718a, y1.Z(view));
        if ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) {
            return false;
        }
        return f7696r0;
    }

    public boolean H(int i5) {
        View n5 = n(i5);
        if (n5 != null) {
            return I(n5);
        }
        return false;
    }

    public boolean I(@o0 View view) {
        if (G(view)) {
            if (((LayoutParams) view.getLayoutParams()).f7719b > 0.0f) {
                return f7696r0;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void L(View view, float f6) {
        float v5 = v(view);
        float width = view.getWidth();
        int i5 = ((int) (width * f6)) - ((int) (v5 * width));
        if (!c(view, 3)) {
            i5 = -i5;
        }
        view.offsetLeftAndRight(i5);
        d0(view, f6);
    }

    public void M(int i5) {
        N(i5, f7696r0);
    }

    public void N(int i5, boolean z5) {
        View n5 = n(i5);
        if (n5 != null) {
            P(n5, z5);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + y(i5));
        }
    }

    public void O(@o0 View view) {
        P(view, f7696r0);
    }

    public void P(@o0 View view, boolean z5) {
        if (!G(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.A) {
            layoutParams.f7719b = 1.0f;
            layoutParams.f7721d = 1;
            i0(view, f7696r0);
        } else if (z5) {
            layoutParams.f7721d |= 2;
            if (c(view, 3)) {
                this.f7709u.V(view, 0, view.getTop());
            } else {
                this.f7710v.V(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            L(view, 1.0f);
            j0(layoutParams.f7718a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void Q(@o0 d dVar) {
        List<d> list;
        if (dVar == null || (list = this.I) == null) {
            return;
        }
        list.remove(dVar);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void U(Object obj, boolean z5) {
        this.Q = obj;
        this.R = z5;
        setWillNotDraw((z5 || getBackground() != null) ? false : f7696r0);
        requestLayout();
    }

    public void V(float f6) {
        this.f7704p = f6;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (G(childAt)) {
                y1.N1(childAt, this.f7704p);
            }
        }
    }

    @Deprecated
    public void W(d dVar) {
        d dVar2 = this.H;
        if (dVar2 != null) {
            Q(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.H = dVar;
    }

    public void X(int i5) {
        Y(i5, 3);
        Y(i5, 5);
    }

    public void Y(int i5, int i6) {
        View n5;
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, y1.Z(this));
        if (i6 == 3) {
            this.B = i5;
        } else if (i6 == 5) {
            this.C = i5;
        } else if (i6 == 8388611) {
            this.D = i5;
        } else if (i6 == 8388613) {
            this.E = i5;
        }
        if (i5 != 0) {
            (absoluteGravity == 3 ? this.f7709u : this.f7710v).c();
        }
        if (i5 != 1) {
            if (i5 == 2 && (n5 = n(absoluteGravity)) != null) {
                O(n5);
                return;
            }
            return;
        }
        View n6 = n(absoluteGravity);
        if (n6 != null) {
            f(n6);
        }
    }

    public void Z(int i5, @o0 View view) {
        if (G(view)) {
            Y(i5, ((LayoutParams) view.getLayoutParams()).f7718a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void a(@o0 d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.I == null) {
            this.I = new ArrayList();
        }
        this.I.add(dVar);
    }

    public void a0(@v int i5, int i6) {
        b0(androidx.core.content.d.i(getContext(), i5), i6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i5, int i6) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (!G(childAt)) {
                this.W.add(childAt);
            } else if (F(childAt)) {
                childAt.addFocusables(arrayList, i5, i6);
                z5 = f7696r0;
            }
        }
        if (!z5) {
            int size = this.W.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = this.W.get(i8);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i5, i6);
                }
            }
        }
        this.W.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i5, layoutParams);
        if (o() != null || G(view)) {
            y1.R1(view, 4);
        } else {
            y1.R1(view, 1);
        }
        if (f7699u0) {
            return;
        }
        y1.B1(view, this.f7703o);
    }

    void b() {
        if (this.G) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.G = f7696r0;
    }

    public void b0(Drawable drawable, int i5) {
        if (f7700v0) {
            return;
        }
        if ((i5 & d0.f5464b) == 8388611) {
            this.S = drawable;
        } else if ((i5 & d0.f5465c) == 8388613) {
            this.T = drawable;
        } else if ((i5 & 3) == 3) {
            this.U = drawable;
        } else if ((i5 & 5) != 5) {
            return;
        } else {
            this.V = drawable;
        }
        T();
        invalidate();
    }

    boolean c(View view, int i5) {
        if ((u(view) & i5) == i5) {
            return f7696r0;
        }
        return false;
    }

    public void c0(int i5, @q0 CharSequence charSequence) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, y1.Z(this));
        if (absoluteGravity == 3) {
            this.O = charSequence;
        } else if (absoluteGravity == 5) {
            this.P = charSequence;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return f7696r0;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f6 = 0.0f;
        for (int i5 = 0; i5 < childCount; i5++) {
            f6 = Math.max(f6, ((LayoutParams) getChildAt(i5).getLayoutParams()).f7719b);
        }
        this.f7707s = f6;
        boolean o5 = this.f7709u.o(f7696r0);
        boolean o6 = this.f7710v.o(f7696r0);
        if (o5 || o6) {
            y1.n1(this);
        }
    }

    public void d(int i5) {
        e(i5, f7696r0);
    }

    void d0(View view, float f6) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f6 == layoutParams.f7719b) {
            return;
        }
        layoutParams.f7719b = f6;
        l(view, f6);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f7707s <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt = getChildAt(i5);
            if (J(x5, y5, childAt) && !D(childAt) && m(motionEvent, childAt)) {
                return f7696r0;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j5) {
        int height = getHeight();
        boolean D = D(view);
        int width = getWidth();
        int save = canvas.save();
        int i5 = 0;
        if (D) {
            int childCount = getChildCount();
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt != view && childAt.getVisibility() == 0 && z(childAt) && G(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i6) {
                            i6 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i6, 0, width, getHeight());
            i5 = i6;
        }
        boolean drawChild = super.drawChild(canvas, view, j5);
        canvas.restoreToCount(save);
        float f6 = this.f7707s;
        if (f6 > 0.0f && D) {
            this.f7708t.setColor((this.f7706r & y1.f5757s) | (((int) ((((-16777216) & r2) >>> 24) * f6)) << 24));
            canvas.drawRect(i5, 0.0f, width, getHeight(), this.f7708t);
        } else if (this.M != null && c(view, 3)) {
            int intrinsicWidth = this.M.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f7709u.A(), 1.0f));
            this.M.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.M.setAlpha((int) (max * 255.0f));
            this.M.draw(canvas);
        } else if (this.N != null && c(view, 5)) {
            int intrinsicWidth2 = this.N.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f7710v.A(), 1.0f));
            this.N.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.N.setAlpha((int) (max2 * 255.0f));
            this.N.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i5, boolean z5) {
        View n5 = n(i5);
        if (n5 != null) {
            g(n5, z5);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + y(i5));
        }
    }

    public void e0(@l int i5) {
        this.f7706r = i5;
        invalidate();
    }

    public void f(@o0 View view) {
        g(view, f7696r0);
    }

    public void f0(int i5) {
        this.L = i5 != 0 ? androidx.core.content.d.i(getContext(), i5) : null;
        invalidate();
    }

    public void g(@o0 View view, boolean z5) {
        if (!G(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.A) {
            layoutParams.f7719b = 0.0f;
            layoutParams.f7721d = 0;
        } else if (z5) {
            layoutParams.f7721d |= 4;
            if (c(view, 3)) {
                this.f7709u.V(view, -view.getWidth(), view.getTop());
            } else {
                this.f7710v.V(view, getWidth(), view.getTop());
            }
        } else {
            L(view, 0.0f);
            j0(layoutParams.f7718a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void g0(@q0 Drawable drawable) {
        this.L = drawable;
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

    public void h0(@l int i5) {
        this.L = new ColorDrawable(i5);
        invalidate();
    }

    void i(boolean z5) {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (G(childAt) && (!z5 || layoutParams.f7720c)) {
                z6 |= c(childAt, 3) ? this.f7709u.V(childAt, -childAt.getWidth(), childAt.getTop()) : this.f7710v.V(childAt, getWidth(), childAt.getTop());
                layoutParams.f7720c = false;
            }
        }
        this.f7711w.p();
        this.f7712x.p();
        if (z6) {
            invalidate();
        }
    }

    void j(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f7721d & 1) == 1) {
            layoutParams.f7721d = 0;
            List<d> list = this.I;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.I.get(size).b(view);
                }
            }
            i0(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void j0(int i5, int i6, View view) {
        int i7;
        int E = this.f7709u.E();
        int E2 = this.f7710v.E();
        if (E == 1 || E2 == 1) {
            i7 = 1;
        } else {
            i7 = 2;
            if (E != 2 && E2 != 2) {
                i7 = 0;
            }
        }
        if (view != null && i6 == 0) {
            float f6 = ((LayoutParams) view.getLayoutParams()).f7719b;
            if (f6 == 0.0f) {
                j(view);
            } else if (f6 == 1.0f) {
                k(view);
            }
        }
        if (i7 != this.f7713y) {
            this.f7713y = i7;
            List<d> list = this.I;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.I.get(size).c(i7);
                }
            }
        }
    }

    void k(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f7721d & 1) == 0) {
            layoutParams.f7721d = 1;
            List<d> list = this.I;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.I.get(size).a(view);
                }
            }
            i0(view, f7696r0);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f6) {
        List<d> list = this.I;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.I.get(size).d(view, f6);
            }
        }
    }

    View n(int i5) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, y1.Z(this)) & 7;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if ((u(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((((LayoutParams) childAt.getLayoutParams()).f7721d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = f7696r0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A = f7696r0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.R || this.L == null) {
            return;
        }
        Object obj = this.Q;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.L.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.L.draw(canvas);
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
            androidx.customview.widget.c r1 = r6.f7709u
            boolean r1 = r1.U(r7)
            androidx.customview.widget.c r2 = r6.f7710v
            boolean r2 = r2.U(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L38
        L1e:
            androidx.customview.widget.c r7 = r6.f7709u
            boolean r7 = r7.f(r4)
            if (r7 == 0) goto L38
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.f7711w
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.f7712x
            r7.p()
            goto L38
        L31:
            r6.i(r2)
            r6.F = r3
            r6.G = r3
        L38:
            r7 = r3
            goto L64
        L3a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.J = r0
            r6.K = r7
            float r4 = r6.f7707s
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5f
            androidx.customview.widget.c r4 = r6.f7709u
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.v(r0, r7)
            if (r7 == 0) goto L5f
            boolean r7 = r6.D(r7)
            if (r7 == 0) goto L5f
            r7 = r2
            goto L60
        L5f:
            r7 = r3
        L60:
            r6.F = r3
            r6.G = r3
        L64:
            if (r1 != 0) goto L74
            if (r7 != 0) goto L74
            boolean r7 = r6.A()
            if (r7 != 0) goto L74
            boolean r7 = r6.G
            if (r7 == 0) goto L73
            goto L74
        L73:
            r2 = r3
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (i5 != 4 || !B()) {
            return super.onKeyDown(i5, keyEvent);
        }
        keyEvent.startTracking();
        return f7696r0;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i5, KeyEvent keyEvent) {
        if (i5 != 4) {
            return super.onKeyUp(i5, keyEvent);
        }
        View p5 = p();
        if (p5 != null && s(p5) == 0) {
            h();
        }
        if (p5 != null) {
            return f7696r0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        float f6;
        int i9;
        boolean z6 = f7696r0;
        this.f7714z = f7696r0;
        int i10 = i7 - i5;
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (D(childAt)) {
                    int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i12, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f7 = measuredWidth;
                        i9 = (-measuredWidth) + ((int) (layoutParams.f7719b * f7));
                        f6 = (measuredWidth + i9) / f7;
                    } else {
                        float f8 = measuredWidth;
                        f6 = (i10 - r11) / f8;
                        i9 = i10 - ((int) (layoutParams.f7719b * f8));
                    }
                    boolean z7 = f6 != layoutParams.f7719b ? z6 : false;
                    int i13 = layoutParams.f7718a & 112;
                    if (i13 == 16) {
                        int i14 = i8 - i6;
                        int i15 = (i14 - measuredHeight) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight;
                            int i18 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight;
                            }
                        }
                        childAt.layout(i9, i15, measuredWidth + i9, measuredHeight + i15);
                    } else if (i13 != 80) {
                        int i19 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i9, i19, measuredWidth + i9, measuredHeight + i19);
                    } else {
                        int i20 = i8 - i6;
                        childAt.layout(i9, (i20 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i9, i20 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z7) {
                        d0(childAt, f6);
                    }
                    int i21 = layoutParams.f7719b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i21) {
                        childAt.setVisibility(i21);
                    }
                }
            }
            i11++;
            z6 = f7696r0;
        }
        this.f7714z = false;
        this.A = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i6);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z5 = (this.Q == null || !y1.U(this)) ? false : f7696r0;
        int Z = y1.Z(this);
        int childCount = getChildCount();
        boolean z6 = false;
        boolean z7 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z5) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.f7718a, Z);
                    if (y1.U(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.Q;
                        if (absoluteGravity == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.Q;
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
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
                } else {
                    if (!G(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i7 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f7700v0) {
                        float R = y1.R(childAt);
                        float f6 = this.f7704p;
                        if (R != f6) {
                            y1.N1(childAt, f6);
                        }
                    }
                    int u5 = u(childAt) & 7;
                    boolean z8 = u5 == 3 ? f7696r0 : false;
                    if ((z8 && z6) || (!z8 && z7)) {
                        throw new IllegalStateException(androidx.concurrent.futures.a.a(new StringBuilder("Child drawer has absolute gravity "), y(u5), " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z8) {
                        z6 = f7696r0;
                    } else {
                        z7 = f7696r0;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i5, this.f7705q + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i6, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View n5;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i5 = savedState.f7722q;
        if (i5 != 0 && (n5 = n(i5)) != null) {
            O(n5);
        }
        int i6 = savedState.f7723r;
        if (i6 != 3) {
            Y(i6, 3);
        }
        int i7 = savedState.f7724s;
        if (i7 != 3) {
            Y(i7, 5);
        }
        int i8 = savedState.f7725t;
        if (i8 != 3) {
            Y(i8, d0.f5464b);
        }
        int i9 = savedState.f7726u;
        if (i9 != 3) {
            Y(i9, d0.f5465c);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i5) {
        T();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
            int i6 = layoutParams.f7721d;
            boolean z5 = f7696r0;
            boolean z6 = i6 == 1;
            if (i6 != 2) {
                z5 = false;
            }
            if (z6 || z5) {
                savedState.f7722q = layoutParams.f7718a;
                break;
            }
        }
        savedState.f7723r = this.B;
        savedState.f7724s = this.C;
        savedState.f7725t = this.D;
        savedState.f7726u = this.E;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        View o5;
        this.f7709u.L(motionEvent);
        this.f7710v.L(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            this.J = x5;
            this.K = y5;
            this.F = false;
            this.G = false;
        } else if (action == 1) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            View v5 = this.f7709u.v((int) x6, (int) y6);
            if (v5 != null && D(v5)) {
                float f6 = x6 - this.J;
                float f7 = y6 - this.K;
                int D = this.f7709u.D();
                if ((f7 * f7) + (f6 * f6) < D * D && (o5 = o()) != null && s(o5) != 2) {
                    z5 = false;
                    i(z5);
                    this.F = false;
                }
            }
            z5 = true;
            i(z5);
            this.F = false;
        } else if (action == 3) {
            i(f7696r0);
            this.F = false;
            this.G = false;
        }
        return f7696r0;
    }

    View p() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (G(childAt) && I(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public float q() {
        if (f7700v0) {
            return this.f7704p;
        }
        return 0.0f;
    }

    public int r(int i5) {
        int Z = y1.Z(this);
        if (i5 == 3) {
            int i6 = this.B;
            if (i6 != 3) {
                return i6;
            }
            int i7 = Z == 0 ? this.D : this.E;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i5 == 5) {
            int i8 = this.C;
            if (i8 != 3) {
                return i8;
            }
            int i9 = Z == 0 ? this.E : this.D;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
        if (i5 == 8388611) {
            int i10 = this.D;
            if (i10 != 3) {
                return i10;
            }
            int i11 = Z == 0 ? this.B : this.C;
            if (i11 != 3) {
                return i11;
            }
            return 0;
        }
        if (i5 != 8388613) {
            return 0;
        }
        int i12 = this.E;
        if (i12 != 3) {
            return i12;
        }
        int i13 = Z == 0 ? this.C : this.B;
        if (i13 != 3) {
            return i13;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        this.F = z5;
        if (z5) {
            i(f7696r0);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f7714z) {
            return;
        }
        super.requestLayout();
    }

    public int s(@o0 View view) {
        if (G(view)) {
            return r(((LayoutParams) view.getLayoutParams()).f7718a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @q0
    public CharSequence t(int i5) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, y1.Z(this));
        if (absoluteGravity == 3) {
            return this.O;
        }
        if (absoluteGravity == 5) {
            return this.P;
        }
        return null;
    }

    int u(View view) {
        return Gravity.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).f7718a, y1.Z(this));
    }

    float v(View view) {
        return ((LayoutParams) view.getLayoutParams()).f7719b;
    }

    @q0
    public Drawable w() {
        return this.L;
    }

    public DrawerLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public DrawerLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f7703o = new c();
        this.f7706r = f7692n0;
        this.f7708t = new Paint();
        this.A = f7696r0;
        this.B = 3;
        this.C = 3;
        this.D = 3;
        this.E = 3;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        setDescendantFocusability(262144);
        float f6 = getResources().getDisplayMetrics().density;
        this.f7705q = (int) ((64.0f * f6) + 0.5f);
        float f7 = 400.0f * f6;
        f fVar = new f(3);
        this.f7711w = fVar;
        f fVar2 = new f(5);
        this.f7712x = fVar2;
        androidx.customview.widget.c p5 = androidx.customview.widget.c.p(this, 1.0f, fVar);
        this.f7709u = p5;
        p5.R(1);
        p5.S(f7);
        fVar.q(p5);
        androidx.customview.widget.c p6 = androidx.customview.widget.c.p(this, 1.0f, fVar2);
        this.f7710v = p6;
        p6.R(2);
        p6.S(f7);
        fVar2.q(p6);
        setFocusableInTouchMode(f7696r0);
        y1.R1(this, 1);
        y1.B1(this, new b());
        setMotionEventSplittingEnabled(false);
        if (y1.U(this)) {
            setOnApplyWindowInsetsListener(new a());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f7682d0);
            try {
                this.L = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f7704p = f6 * 10.0f;
        this.W = new ArrayList<>();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e, reason: collision with root package name */
        private static final int f7715e = 1;

        /* renamed from: f, reason: collision with root package name */
        private static final int f7716f = 2;

        /* renamed from: g, reason: collision with root package name */
        private static final int f7717g = 4;

        /* renamed from: a, reason: collision with root package name */
        public int f7718a;

        /* renamed from: b, reason: collision with root package name */
        float f7719b;

        /* renamed from: c, reason: collision with root package name */
        boolean f7720c;

        /* renamed from: d, reason: collision with root package name */
        int f7721d;

        public LayoutParams(@o0 Context context, @q0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7718a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f7698t0);
            this.f7718a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.f7718a = 0;
        }

        public LayoutParams(int i5, int i6, int i7) {
            this(i5, i6);
            this.f7718a = i7;
        }

        public LayoutParams(@o0 LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f7718a = 0;
            this.f7718a = layoutParams.f7718a;
        }

        public LayoutParams(@o0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7718a = 0;
        }

        public LayoutParams(@o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7718a = 0;
        }
    }

    /* loaded from: classes3.dex */
    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        int f7722q;

        /* renamed from: r, reason: collision with root package name */
        int f7723r;

        /* renamed from: s, reason: collision with root package name */
        int f7724s;

        /* renamed from: t, reason: collision with root package name */
        int f7725t;

        /* renamed from: u, reason: collision with root package name */
        int f7726u;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public SavedState b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState[] c(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(@o0 Parcel parcel, @q0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7722q = 0;
            this.f7722q = parcel.readInt();
            this.f7723r = parcel.readInt();
            this.f7724s = parcel.readInt();
            this.f7725t = parcel.readInt();
            this.f7726u = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f7722q);
            parcel.writeInt(this.f7723r);
            parcel.writeInt(this.f7724s);
            parcel.writeInt(this.f7725t);
            parcel.writeInt(this.f7726u);
        }

        public SavedState(@o0 Parcelable parcelable) {
            super(parcelable);
            this.f7722q = 0;
        }
    }
}
