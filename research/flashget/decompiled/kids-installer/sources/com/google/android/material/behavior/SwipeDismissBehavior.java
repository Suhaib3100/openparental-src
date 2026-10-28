package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.g0;
import androidx.core.view.accessibility.m0;
import androidx.core.view.y1;
import androidx.customview.widget.c;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f12946k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f12947l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f12948m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f12949n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f12950o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f12951p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final float f12952q = 0.5f;

    /* renamed from: r, reason: collision with root package name */
    private static final float f12953r = 0.0f;

    /* renamed from: s, reason: collision with root package name */
    private static final float f12954s = 0.5f;

    /* renamed from: a, reason: collision with root package name */
    androidx.customview.widget.c f12955a;

    /* renamed from: b, reason: collision with root package name */
    c f12956b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12957c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12959e;

    /* renamed from: d, reason: collision with root package name */
    private float f12958d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    int f12960f = 2;

    /* renamed from: g, reason: collision with root package name */
    float f12961g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    float f12962h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    float f12963i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    private final c.AbstractC0065c f12964j = new a();

    class a extends c.AbstractC0065c {

        /* renamed from: d, reason: collision with root package name */
        private static final int f12965d = -1;

        /* renamed from: a, reason: collision with root package name */
        private int f12966a;

        /* renamed from: b, reason: collision with root package name */
        private int f12967b = -1;

        a() {
        }

        private boolean n(@o0 View view, float f6) {
            if (f6 == 0.0f) {
                return Math.abs(view.getLeft() - this.f12966a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f12961g);
            }
            boolean z5 = y1.Z(view) == 1;
            int i5 = SwipeDismissBehavior.this.f12960f;
            if (i5 == 2) {
                return true;
            }
            if (i5 == 0) {
                if (z5) {
                    if (f6 >= 0.0f) {
                        return false;
                    }
                } else if (f6 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i5 != 1) {
                return false;
            }
            if (z5) {
                if (f6 <= 0.0f) {
                    return false;
                }
            } else if (f6 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int a(@o0 View view, int i5, int i6) {
            int width;
            int width2;
            int width3;
            boolean z5 = y1.Z(view) == 1;
            int i7 = SwipeDismissBehavior.this.f12960f;
            if (i7 == 0) {
                if (z5) {
                    width = this.f12966a - view.getWidth();
                    width2 = this.f12966a;
                } else {
                    width = this.f12966a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i7 != 1) {
                width = this.f12966a - view.getWidth();
                width2 = view.getWidth() + this.f12966a;
            } else if (z5) {
                width = this.f12966a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f12966a - view.getWidth();
                width2 = this.f12966a;
            }
            return SwipeDismissBehavior.I(width, i5, width2);
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int b(@o0 View view, int i5, int i6) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int d(@o0 View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void i(@o0 View view, int i5) {
            this.f12967b = i5;
            this.f12966a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void j(int i5) {
            c cVar = SwipeDismissBehavior.this.f12956b;
            if (cVar != null) {
                cVar.b(i5);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void k(@o0 View view, int i5, int i6, int i7, int i8) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f12962h) + this.f12966a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f12963i) + this.f12966a;
            float f6 = i5;
            if (f6 <= width) {
                view.setAlpha(1.0f);
            } else if (f6 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.H(0.0f, 1.0f - ((f6 - width) / (width2 - width)), 1.0f));
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void l(@o0 View view, float f6, float f7) {
            int i5;
            boolean z5;
            c cVar;
            this.f12967b = -1;
            int width = view.getWidth();
            if (n(view, f6)) {
                int left = view.getLeft();
                int i6 = this.f12966a;
                i5 = left < i6 ? i6 - width : i6 + width;
                z5 = true;
            } else {
                i5 = this.f12966a;
                z5 = false;
            }
            if (SwipeDismissBehavior.this.f12955a.T(i5, view.getTop())) {
                y1.p1(view, new d(view, z5));
            } else {
                if (!z5 || (cVar = SwipeDismissBehavior.this.f12956b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public boolean m(View view, int i5) {
            int i6 = this.f12967b;
            return (i6 == -1 || i6 == i5) && SwipeDismissBehavior.this.G(view);
        }
    }

    class b implements m0 {
        b() {
        }

        @Override // androidx.core.view.accessibility.m0
        public boolean a(@o0 View view, @q0 m0.a aVar) {
            boolean z5 = false;
            if (!SwipeDismissBehavior.this.G(view)) {
                return false;
            }
            boolean z6 = y1.Z(view) == 1;
            int i5 = SwipeDismissBehavior.this.f12960f;
            if ((i5 == 0 && z6) || (i5 == 1 && !z6)) {
                z5 = true;
            }
            int width = view.getWidth();
            if (z5) {
                width = -width;
            }
            view.offsetLeftAndRight(width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f12956b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(View view);

        void b(int i5);
    }

    /* loaded from: classes2.dex */
    private class d implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final View f12970o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f12971p;

        d(View view, boolean z5) {
            this.f12970o = view;
            this.f12971p = z5;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            androidx.customview.widget.c cVar2 = SwipeDismissBehavior.this.f12955a;
            if (cVar2 != null && cVar2.o(true)) {
                y1.p1(this.f12970o, this);
            } else {
                if (!this.f12971p || (cVar = SwipeDismissBehavior.this.f12956b) == null) {
                    return;
                }
                cVar.a(this.f12970o);
            }
        }
    }

    static float H(float f6, float f7, float f8) {
        return Math.min(Math.max(f6, f7), f8);
    }

    static int I(int i5, int i6, int i7) {
        return Math.min(Math.max(i5, i6), i7);
    }

    private void J(ViewGroup viewGroup) {
        if (this.f12955a == null) {
            this.f12955a = this.f12959e ? androidx.customview.widget.c.p(viewGroup, this.f12958d, this.f12964j) : androidx.customview.widget.c.q(viewGroup, this.f12964j);
        }
    }

    static float K(float f6, float f7, float f8) {
        return (f8 - f6) / (f7 - f6);
    }

    private void T(View view) {
        y1.r1(view, 1048576);
        if (G(view)) {
            y1.u1(view, g0.a.f5393z, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean E(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        androidx.customview.widget.c cVar = this.f12955a;
        if (cVar == null) {
            return false;
        }
        cVar.L(motionEvent);
        return true;
    }

    public boolean G(@o0 View view) {
        return true;
    }

    public int L() {
        androidx.customview.widget.c cVar = this.f12955a;
        if (cVar != null) {
            return cVar.E();
        }
        return 0;
    }

    @q0
    @m1
    public c M() {
        return this.f12956b;
    }

    public void N(float f6) {
        this.f12961g = H(0.0f, f6, 1.0f);
    }

    public void O(float f6) {
        this.f12963i = H(0.0f, f6, 1.0f);
    }

    public void P(@q0 c cVar) {
        this.f12956b = cVar;
    }

    public void Q(float f6) {
        this.f12958d = f6;
        this.f12959e = true;
    }

    public void R(float f6) {
        this.f12962h = H(0.0f, f6, 1.0f);
    }

    public void S(int i5) {
        this.f12960f = i5;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean l(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 MotionEvent motionEvent) {
        boolean z5 = this.f12957c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z5 = coordinatorLayout.P(v5, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f12957c = z5;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f12957c = false;
        }
        if (!z5) {
            return false;
        }
        J(coordinatorLayout);
        return this.f12955a.U(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, int i5) {
        if (y1.V(v5) != 0) {
            return false;
        }
        y1.R1(v5, 1);
        T(v5);
        return false;
    }
}
