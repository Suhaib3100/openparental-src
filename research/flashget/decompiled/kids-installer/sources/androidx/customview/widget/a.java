package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.j;
import androidx.core.view.accessibility.g0;
import androidx.core.view.accessibility.k0;
import androidx.core.view.accessibility.l0;
import androidx.core.view.y1;
import androidx.customview.widget.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes3.dex */
public abstract class a extends androidx.core.view.a {

    /* renamed from: n, reason: collision with root package name */
    public static final int f5940n = Integer.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public static final int f5941o = -1;

    /* renamed from: p, reason: collision with root package name */
    private static final String f5942p = "android.view.View";

    /* renamed from: q, reason: collision with root package name */
    private static final Rect f5943q = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: r, reason: collision with root package name */
    private static final b.a<g0> f5944r = new C0063a();

    /* renamed from: s, reason: collision with root package name */
    private static final b.InterfaceC0064b<j<g0>, g0> f5945s = new b();

    /* renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f5950h;

    /* renamed from: i, reason: collision with root package name */
    private final View f5951i;

    /* renamed from: j, reason: collision with root package name */
    private c f5952j;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f5946d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f5947e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final Rect f5948f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    private final int[] f5949g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    int f5953k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    int f5954l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    private int f5955m = Integer.MIN_VALUE;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: androidx.customview.widget.a$a, reason: collision with other inner class name */
    static class C0063a implements b.a<g0> {
        C0063a() {
        }

        @Override // androidx.customview.widget.b.a
        public void a(g0 g0Var, Rect rect) {
            g0Var.s(rect);
        }

        public void b(g0 g0Var, Rect rect) {
            g0Var.s(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    static class b implements b.InterfaceC0064b<j<g0>, g0> {
        b() {
        }

        @Override // androidx.customview.widget.b.InterfaceC0064b
        public int b(j<g0> jVar) {
            return jVar.B();
        }

        @Override // androidx.customview.widget.b.InterfaceC0064b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g0 a(j<g0> jVar, int i5) {
            return jVar.C(i5);
        }

        public int d(j<g0> jVar) {
            return jVar.B();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    private class c extends k0 {
        c() {
        }

        @Override // androidx.core.view.accessibility.k0
        public g0 b(int i5) {
            return g0.F0(a.this.L(i5));
        }

        @Override // androidx.core.view.accessibility.k0
        public g0 d(int i5) {
            int i6 = i5 == 2 ? a.this.f5953k : a.this.f5954l;
            if (i6 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i6);
        }

        @Override // androidx.core.view.accessibility.k0
        public boolean f(int i5, int i6, Bundle bundle) {
            return a.this.T(i5, i6, bundle);
        }
    }

    public a(@o0 View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f5951i = view;
        this.f5950h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (y1.V(view) == 0) {
            y1.R1(view, 1);
        }
    }

    private static Rect E(@o0 View view, int i5, @o0 Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i5 == 17) {
            rect.set(width, 0, width, height);
        } else if (i5 == 33) {
            rect.set(0, height, width, height);
        } else if (i5 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean I(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f5951i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f5951i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int J(int i5) {
        if (i5 == 19) {
            return 33;
        }
        if (i5 != 21) {
            return i5 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean K(int i5, @q0 Rect rect) {
        g0 g0Var;
        j<g0> y5 = y();
        int i6 = this.f5954l;
        g0 j5 = i6 == Integer.MIN_VALUE ? null : y5.j(i6);
        if (i5 == 1 || i5 == 2) {
            g0Var = (g0) androidx.customview.widget.b.d(y5, f5945s, f5944r, j5, i5, y1.Z(this.f5951i) == 1, false);
        } else {
            if (i5 != 17 && i5 != 33 && i5 != 66 && i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i7 = this.f5954l;
            if (i7 != Integer.MIN_VALUE) {
                z(i7, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                E(this.f5951i, i5, rect2);
            }
            g0Var = (g0) androidx.customview.widget.b.c(y5, f5945s, f5944r, j5, rect2, i5);
        }
        return X(g0Var != null ? y5.o(y5.m(g0Var)) : Integer.MIN_VALUE);
    }

    private boolean U(int i5, int i6, Bundle bundle) {
        return i6 != 1 ? i6 != 2 ? i6 != 64 ? i6 != 128 ? N(i5, i6, bundle) : n(i5) : W(i5) : o(i5) : X(i5);
    }

    private boolean V(int i5, Bundle bundle) {
        return y1.l1(this.f5951i, i5, bundle);
    }

    private boolean W(int i5) {
        int i6;
        if (!this.f5950h.isEnabled() || !this.f5950h.isTouchExplorationEnabled() || (i6 = this.f5953k) == i5) {
            return false;
        }
        if (i6 != Integer.MIN_VALUE) {
            n(i6);
        }
        this.f5953k = i5;
        this.f5951i.invalidate();
        Y(i5, 32768);
        return true;
    }

    private void Z(int i5) {
        int i6 = this.f5955m;
        if (i6 == i5) {
            return;
        }
        this.f5955m = i5;
        Y(i5, 128);
        Y(i6, 256);
    }

    private boolean n(int i5) {
        if (this.f5953k != i5) {
            return false;
        }
        this.f5953k = Integer.MIN_VALUE;
        this.f5951i.invalidate();
        Y(i5, 65536);
        return true;
    }

    private boolean p() {
        int i5 = this.f5954l;
        return i5 != Integer.MIN_VALUE && N(i5, 16, null);
    }

    private AccessibilityEvent q(int i5, int i6) {
        return i5 != -1 ? r(i5, i6) : s(i6);
    }

    private AccessibilityEvent r(int i5, int i6) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i6);
        g0 L = L(i5);
        obtain.getText().add(L.U());
        obtain.setContentDescription(L.A());
        obtain.setScrollable(L.x0());
        obtain.setPassword(L.v0());
        obtain.setEnabled(L.o0());
        obtain.setChecked(L.i0());
        P(i5, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(L.w());
        l0.Y(obtain, this.f5951i, i5);
        obtain.setPackageName(this.f5951i.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent s(int i5) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i5);
        this.f5951i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @o0
    private g0 t(int i5) {
        g0 C0 = g0.C0();
        C0.g1(true);
        C0.i1(true);
        C0.W0("android.view.View");
        Rect rect = f5943q;
        C0.R0(rect);
        C0.S0(rect);
        C0.z1(this.f5951i);
        R(i5, C0);
        if (C0.U() == null && C0.A() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        C0.s(this.f5947e);
        if (this.f5947e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int p5 = C0.p();
        if ((p5 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((p5 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        C0.x1(this.f5951i.getContext().getPackageName());
        C0.J1(this.f5951i, i5);
        if (this.f5953k == i5) {
            C0.O0(true);
            C0.a(128);
        } else {
            C0.O0(false);
            C0.a(64);
        }
        boolean z5 = this.f5954l == i5;
        if (z5) {
            C0.a(2);
        } else if (C0.p0()) {
            C0.a(1);
        }
        C0.j1(z5);
        this.f5951i.getLocationOnScreen(this.f5949g);
        C0.t(this.f5946d);
        if (this.f5946d.equals(rect)) {
            C0.s(this.f5946d);
            if (C0.f5370b != -1) {
                g0 C02 = g0.C0();
                for (int i6 = C0.f5370b; i6 != -1; i6 = C02.f5370b) {
                    C02.A1(this.f5951i, -1);
                    C02.R0(f5943q);
                    R(i6, C02);
                    C02.s(this.f5947e);
                    Rect rect2 = this.f5946d;
                    Rect rect3 = this.f5947e;
                    rect2.offset(rect3.left, rect3.top);
                }
                C02.I0();
            }
            this.f5946d.offset(this.f5949g[0] - this.f5951i.getScrollX(), this.f5949g[1] - this.f5951i.getScrollY());
        }
        if (this.f5951i.getLocalVisibleRect(this.f5948f)) {
            this.f5948f.offset(this.f5949g[0] - this.f5951i.getScrollX(), this.f5949g[1] - this.f5951i.getScrollY());
            if (this.f5946d.intersect(this.f5948f)) {
                C0.S0(this.f5946d);
                if (I(this.f5946d)) {
                    C0.V1(true);
                }
            }
        }
        return C0;
    }

    @o0
    private g0 u() {
        g0 D0 = g0.D0(this.f5951i);
        y1.i1(this.f5951i, D0);
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        if (D0.v() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            D0.d(this.f5951i, ((Integer) arrayList.get(i5)).intValue());
        }
        return D0;
    }

    private j<g0> y() {
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        j<g0> jVar = new j<>();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            jVar.p(i5, t(i5));
        }
        return jVar;
    }

    private void z(int i5, Rect rect) {
        L(i5).s(rect);
    }

    @Deprecated
    public int A() {
        return x();
    }

    public final int B() {
        return this.f5954l;
    }

    protected abstract int C(float f6, float f7);

    protected abstract void D(List<Integer> list);

    public final void F() {
        H(-1, 1);
    }

    public final void G(int i5) {
        H(i5, 0);
    }

    public final void H(int i5, int i6) {
        ViewParent parent;
        if (i5 == Integer.MIN_VALUE || !this.f5950h.isEnabled() || (parent = this.f5951i.getParent()) == null) {
            return;
        }
        AccessibilityEvent q5 = q(i5, 2048);
        androidx.core.view.accessibility.b.i(q5, i6);
        parent.requestSendAccessibilityEvent(this.f5951i, q5);
    }

    @o0
    g0 L(int i5) {
        return i5 == -1 ? u() : t(i5);
    }

    public final void M(boolean z5, int i5, @q0 Rect rect) {
        int i6 = this.f5954l;
        if (i6 != Integer.MIN_VALUE) {
            o(i6);
        }
        if (z5) {
            K(i5, rect);
        }
    }

    protected abstract boolean N(int i5, int i6, @q0 Bundle bundle);

    protected void O(@o0 AccessibilityEvent accessibilityEvent) {
    }

    protected void P(int i5, @o0 AccessibilityEvent accessibilityEvent) {
    }

    protected void Q(@o0 g0 g0Var) {
    }

    protected abstract void R(int i5, @o0 g0 g0Var);

    protected void S(int i5, boolean z5) {
    }

    boolean T(int i5, int i6, Bundle bundle) {
        return i5 != -1 ? U(i5, i6, bundle) : V(i6, bundle);
    }

    public final boolean X(int i5) {
        int i6;
        if ((!this.f5951i.isFocused() && !this.f5951i.requestFocus()) || (i6 = this.f5954l) == i5) {
            return false;
        }
        if (i6 != Integer.MIN_VALUE) {
            o(i6);
        }
        this.f5954l = i5;
        S(i5, true);
        Y(i5, 8);
        return true;
    }

    public final boolean Y(int i5, int i6) {
        ViewParent parent;
        if (i5 == Integer.MIN_VALUE || !this.f5950h.isEnabled() || (parent = this.f5951i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f5951i, q(i5, i6));
    }

    @Override // androidx.core.view.a
    public k0 b(View view) {
        if (this.f5952j == null) {
            this.f5952j = new c();
        }
        return this.f5952j;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        O(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, g0 g0Var) {
        super.g(view, g0Var);
        Q(g0Var);
    }

    public final boolean o(int i5) {
        if (this.f5954l != i5) {
            return false;
        }
        this.f5954l = Integer.MIN_VALUE;
        S(i5, false);
        Y(i5, 8);
        return true;
    }

    public final boolean v(@o0 MotionEvent motionEvent) {
        if (!this.f5950h.isEnabled() || !this.f5950h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int C = C(motionEvent.getX(), motionEvent.getY());
            Z(C);
            return C != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f5955m == Integer.MIN_VALUE) {
            return false;
        }
        Z(Integer.MIN_VALUE);
        return true;
    }

    public final boolean w(@o0 KeyEvent keyEvent) {
        int i5 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return K(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return K(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int J = J(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z5 = false;
                    while (i5 < repeatCount && K(J, null)) {
                        i5++;
                        z5 = true;
                    }
                    return z5;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.f5953k;
    }
}
