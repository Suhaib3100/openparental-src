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
import androidx.collection.c3;
import androidx.core.view.accessibility.h0;
import androidx.core.view.accessibility.m0;
import androidx.core.view.x1;
import androidx.customview.widget.b;
import com.android.internal.telephony.cdma.UserData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes3.dex */
public abstract class a extends androidx.core.view.a {

    /* renamed from: o, reason: collision with root package name */
    public static final int f28333o = Integer.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public static final int f28334p = -1;

    /* renamed from: q, reason: collision with root package name */
    private static final String f28335q = "android.view.View";

    /* renamed from: r, reason: collision with root package name */
    private static final Rect f28336r = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: s, reason: collision with root package name */
    private static final b.a<h0> f28337s = new C0457a();

    /* renamed from: t, reason: collision with root package name */
    private static final b.InterfaceC0458b<c3<h0>, h0> f28338t = new b();

    /* renamed from: i, reason: collision with root package name */
    private final AccessibilityManager f28343i;

    /* renamed from: j, reason: collision with root package name */
    private final View f28344j;

    /* renamed from: k, reason: collision with root package name */
    private c f28345k;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f28339e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final Rect f28340f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    private final Rect f28341g = new Rect();

    /* renamed from: h, reason: collision with root package name */
    private final int[] f28342h = new int[2];

    /* renamed from: l, reason: collision with root package name */
    int f28346l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    int f28347m = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    private int f28348n = Integer.MIN_VALUE;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: androidx.customview.widget.a$a, reason: collision with other inner class name */
    class C0457a implements b.a<h0> {
        C0457a() {
        }

        @Override // androidx.customview.widget.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0 h0Var, Rect rect) {
            h0Var.s(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    class b implements b.InterfaceC0458b<c3<h0>, h0> {
        b() {
        }

        @Override // androidx.customview.widget.b.InterfaceC0458b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public h0 a(c3<h0> c3Var, int i4) {
            return c3Var.C(i4);
        }

        @Override // androidx.customview.widget.b.InterfaceC0458b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(c3<h0> c3Var) {
            return c3Var.B();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    private class c extends m0 {
        c() {
        }

        @Override // androidx.core.view.accessibility.m0
        public h0 b(int i4) {
            return h0.Q0(a.this.P(i4));
        }

        @Override // androidx.core.view.accessibility.m0
        public h0 d(int i4) {
            int i5 = i4 == 2 ? a.this.f28346l : a.this.f28347m;
            if (i5 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i5);
        }

        @Override // androidx.core.view.accessibility.m0
        public boolean f(int i4, int i5, Bundle bundle) {
            return a.this.X(i4, i5, bundle);
        }
    }

    public a(@o0 View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f28344j = view;
        this.f28343i = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (x1.X(view) == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private c3<h0> C() {
        ArrayList arrayList = new ArrayList();
        H(arrayList);
        c3<h0> c3Var = new c3<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            c3Var.q(((Integer) arrayList.get(i4)).intValue(), x(((Integer) arrayList.get(i4)).intValue()));
        }
        return c3Var;
    }

    private void D(int i4, Rect rect) {
        P(i4).s(rect);
    }

    private static Rect I(@o0 View view, int i4, @o0 Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i4 == 17) {
            rect.set(width, 0, width, height);
        } else if (i4 == 33) {
            rect.set(0, height, width, height);
        } else if (i4 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean M(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f28344j.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f28344j.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int N(int i4) {
        if (i4 == 19) {
            return 33;
        }
        if (i4 == 21) {
            return 17;
        }
        if (i4 != 22) {
            return UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS;
        }
        return 66;
    }

    private boolean O(int i4, @q0 Rect rect) {
        h0 h0Var;
        c3<h0> C = C();
        int i5 = this.f28347m;
        h0 i6 = i5 == Integer.MIN_VALUE ? null : C.i(i5);
        if (i4 == 1 || i4 == 2) {
            h0Var = (h0) androidx.customview.widget.b.d(C, f28338t, f28337s, i6, i4, x1.c0(this.f28344j) == 1, false);
        } else {
            if (i4 != 17 && i4 != 33 && i4 != 66 && i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i7 = this.f28347m;
            if (i7 != Integer.MIN_VALUE) {
                D(i7, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                I(this.f28344j, i4, rect2);
            }
            h0Var = (h0) androidx.customview.widget.b.c(C, f28338t, f28337s, i6, rect2, i4);
        }
        return b0(h0Var != null ? C.p(C.n(h0Var)) : Integer.MIN_VALUE);
    }

    private boolean Y(int i4, int i5, Bundle bundle) {
        return i5 != 1 ? i5 != 2 ? i5 != 64 ? i5 != 128 ? R(i4, i5, bundle) : r(i4) : a0(i4) : s(i4) : b0(i4);
    }

    private boolean Z(int i4, Bundle bundle) {
        return x1.p1(this.f28344j, i4, bundle);
    }

    private boolean a0(int i4) {
        int i5;
        if (!this.f28343i.isEnabled() || !this.f28343i.isTouchExplorationEnabled() || (i5 = this.f28346l) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            r(i5);
        }
        this.f28346l = i4;
        this.f28344j.invalidate();
        c0(i4, 32768);
        return true;
    }

    private void d0(int i4) {
        int i5 = this.f28348n;
        if (i5 == i4) {
            return;
        }
        this.f28348n = i4;
        c0(i4, 128);
        c0(i5, 256);
    }

    private boolean r(int i4) {
        if (this.f28346l != i4) {
            return false;
        }
        this.f28346l = Integer.MIN_VALUE;
        this.f28344j.invalidate();
        c0(i4, 65536);
        return true;
    }

    private boolean t() {
        int i4 = this.f28347m;
        return i4 != Integer.MIN_VALUE && R(i4, 16, null);
    }

    private AccessibilityEvent u(int i4, int i5) {
        return i4 != -1 ? v(i4, i5) : w(i5);
    }

    private AccessibilityEvent v(int i4, int i5) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i5);
        h0 P = P(i4);
        obtain.getText().add(P.a0());
        obtain.setContentDescription(P.D());
        obtain.setScrollable(P.H0());
        obtain.setPassword(P.F0());
        obtain.setEnabled(P.x0());
        obtain.setChecked(P.r0());
        T(i4, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(P.y());
        obtain.setSource(this.f28344j, i4);
        obtain.setPackageName(this.f28344j.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent w(int i4) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        this.f28344j.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @o0
    private h0 x(int i4) {
        h0 N0 = h0.N0();
        N0.u1(true);
        N0.w1(true);
        N0.j1("android.view.View");
        Rect rect = f28336r;
        N0.d1(rect);
        N0.e1(rect);
        N0.P1(this.f28344j);
        V(i4, N0);
        if (N0.a0() == null && N0.D() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        N0.s(this.f28340f);
        if (this.f28340f.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int p4 = N0.p();
        if ((p4 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((p4 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        N0.N1(this.f28344j.getContext().getPackageName());
        N0.b2(this.f28344j, i4);
        if (this.f28346l == i4) {
            N0.a1(true);
            N0.a(128);
        } else {
            N0.a1(false);
            N0.a(64);
        }
        boolean z4 = this.f28347m == i4;
        if (z4) {
            N0.a(2);
        } else if (N0.y0()) {
            N0.a(1);
        }
        N0.x1(z4);
        this.f28344j.getLocationOnScreen(this.f28342h);
        N0.t(this.f28339e);
        if (this.f28339e.equals(rect)) {
            N0.s(this.f28339e);
            if (N0.f27003b != -1) {
                h0 N02 = h0.N0();
                for (int i5 = N0.f27003b; i5 != -1; i5 = N02.f27003b) {
                    N02.Q1(this.f28344j, -1);
                    N02.d1(f28336r);
                    V(i5, N02);
                    N02.s(this.f28340f);
                    Rect rect2 = this.f28339e;
                    Rect rect3 = this.f28340f;
                    rect2.offset(rect3.left, rect3.top);
                }
                N02.T0();
            }
            this.f28339e.offset(this.f28342h[0] - this.f28344j.getScrollX(), this.f28342h[1] - this.f28344j.getScrollY());
        }
        if (this.f28344j.getLocalVisibleRect(this.f28341g)) {
            this.f28341g.offset(this.f28342h[0] - this.f28344j.getScrollX(), this.f28342h[1] - this.f28344j.getScrollY());
            if (this.f28339e.intersect(this.f28341g)) {
                N0.e1(this.f28339e);
                if (M(this.f28339e)) {
                    N0.p2(true);
                }
            }
        }
        return N0;
    }

    @o0
    private h0 y() {
        h0 O0 = h0.O0(this.f28344j);
        x1.m1(this.f28344j, O0);
        ArrayList arrayList = new ArrayList();
        H(arrayList);
        if (O0.x() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            O0.d(this.f28344j, ((Integer) arrayList.get(i4)).intValue());
        }
        return O0;
    }

    public final boolean A(@o0 KeyEvent keyEvent) {
        int i4 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return O(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return O(1, null);
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
                    int N = N(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z4 = false;
                    while (i4 < repeatCount && O(N, null)) {
                        i4++;
                        z4 = true;
                    }
                    return z4;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        t();
        return true;
    }

    public final int B() {
        return this.f28346l;
    }

    @Deprecated
    public int E() {
        return this.f28346l;
    }

    public final int F() {
        return this.f28347m;
    }

    protected abstract int G(float f4, float f5);

    protected abstract void H(List<Integer> list);

    public final void J() {
        L(-1, 1);
    }

    public final void K(int i4) {
        L(i4, 0);
    }

    public final void L(int i4, int i5) {
        ViewParent parent;
        if (i4 == Integer.MIN_VALUE || !this.f28343i.isEnabled() || (parent = this.f28344j.getParent()) == null) {
            return;
        }
        AccessibilityEvent u4 = u(i4, 2048);
        u4.setContentChangeTypes(i5);
        parent.requestSendAccessibilityEvent(this.f28344j, u4);
    }

    @o0
    h0 P(int i4) {
        return i4 == -1 ? y() : x(i4);
    }

    public final void Q(boolean z4, int i4, @q0 Rect rect) {
        int i5 = this.f28347m;
        if (i5 != Integer.MIN_VALUE) {
            s(i5);
        }
        if (z4) {
            O(i4, rect);
        }
    }

    protected abstract boolean R(int i4, int i5, @q0 Bundle bundle);

    protected void S(@o0 AccessibilityEvent accessibilityEvent) {
    }

    protected void T(int i4, @o0 AccessibilityEvent accessibilityEvent) {
    }

    protected void U(@o0 h0 h0Var) {
    }

    protected abstract void V(int i4, @o0 h0 h0Var);

    protected void W(int i4, boolean z4) {
    }

    boolean X(int i4, int i5, Bundle bundle) {
        return i4 != -1 ? Y(i4, i5, bundle) : x1.p1(this.f28344j, i5, bundle);
    }

    @Override // androidx.core.view.a
    public m0 b(View view) {
        if (this.f28345k == null) {
            this.f28345k = new c();
        }
        return this.f28345k;
    }

    public final boolean b0(int i4) {
        int i5;
        if ((!this.f28344j.isFocused() && !this.f28344j.requestFocus()) || (i5 = this.f28347m) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            s(i5);
        }
        if (i4 == Integer.MIN_VALUE) {
            return false;
        }
        this.f28347m = i4;
        W(i4, true);
        c0(i4, 8);
        return true;
    }

    public final boolean c0(int i4, int i5) {
        ViewParent parent;
        if (i4 == Integer.MIN_VALUE || !this.f28343i.isEnabled() || (parent = this.f28344j.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f28344j, u(i4, i5));
    }

    @Override // androidx.core.view.a
    public void h(View view, AccessibilityEvent accessibilityEvent) {
        super.h(view, accessibilityEvent);
        S(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void i(View view, h0 h0Var) {
        super.i(view, h0Var);
        U(h0Var);
    }

    public final boolean s(int i4) {
        if (this.f28347m != i4) {
            return false;
        }
        this.f28347m = Integer.MIN_VALUE;
        W(i4, false);
        c0(i4, 8);
        return true;
    }

    public final boolean z(@o0 MotionEvent motionEvent) {
        if (!this.f28343i.isEnabled() || !this.f28343i.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int G = G(motionEvent.getX(), motionEvent.getY());
            d0(G);
            return G != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f28348n == Integer.MIN_VALUE) {
            return false;
        }
        d0(Integer.MIN_VALUE);
        return true;
    }
}
