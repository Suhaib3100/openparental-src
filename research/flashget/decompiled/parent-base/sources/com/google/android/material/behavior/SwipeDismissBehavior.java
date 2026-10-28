package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.h0;
import androidx.core.view.accessibility.o0;
import androidx.core.view.x1;
import androidx.customview.widget.d;

/* loaded from: classes6.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f52670k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f52671l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f52672m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f52673n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f52674o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f52675p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final float f52676q = 0.5f;

    /* renamed from: r, reason: collision with root package name */
    private static final float f52677r = 0.0f;

    /* renamed from: s, reason: collision with root package name */
    private static final float f52678s = 0.5f;

    /* renamed from: a, reason: collision with root package name */
    androidx.customview.widget.d f52679a;

    /* renamed from: b, reason: collision with root package name */
    c f52680b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f52681c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f52683e;

    /* renamed from: d, reason: collision with root package name */
    private float f52682d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    int f52684f = 2;

    /* renamed from: g, reason: collision with root package name */
    float f52685g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    float f52686h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    float f52687i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    private final d.c f52688j = new a();

    class a extends d.c {

        /* renamed from: d, reason: collision with root package name */
        private static final int f52689d = -1;

        /* renamed from: a, reason: collision with root package name */
        private int f52690a;

        /* renamed from: b, reason: collision with root package name */
        private int f52691b = -1;

        a() {
        }

        private boolean n(@o0 View view, float f4) {
            if (f4 == 0.0f) {
                return Math.abs(view.getLeft() - this.f52690a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f52685g);
            }
            boolean z4 = x1.c0(view) == 1;
            int i4 = SwipeDismissBehavior.this.f52684f;
            if (i4 == 2) {
                return true;
            }
            if (i4 == 0) {
                if (z4) {
                    if (f4 >= 0.0f) {
                        return false;
                    }
                } else if (f4 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i4 != 1) {
                return false;
            }
            if (z4) {
                if (f4 <= 0.0f) {
                    return false;
                }
            } else if (f4 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.d.c
        public int a(@o0 View view, int i4, int i5) {
            int width;
            int width2;
            int width3;
            boolean z4 = x1.c0(view) == 1;
            int i6 = SwipeDismissBehavior.this.f52684f;
            if (i6 == 0) {
                if (z4) {
                    width = this.f52690a - view.getWidth();
                    width2 = this.f52690a;
                } else {
                    width = this.f52690a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i6 != 1) {
                width = this.f52690a - view.getWidth();
                width2 = view.getWidth() + this.f52690a;
            } else if (z4) {
                width = this.f52690a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f52690a - view.getWidth();
                width2 = this.f52690a;
            }
            return SwipeDismissBehavior.I(width, i4, width2);
        }

        @Override // androidx.customview.widget.d.c
        public int b(@o0 View view, int i4, int i5) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(@o0 View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.d.c
        public void i(@o0 View view, int i4) {
            this.f52691b = i4;
            this.f52690a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i4) {
            c cVar = SwipeDismissBehavior.this.f52680b;
            if (cVar != null) {
                cVar.b(i4);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(@o0 View view, int i4, int i5, int i6, int i7) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f52686h) + this.f52690a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f52687i) + this.f52690a;
            float f4 = i4;
            if (f4 <= width) {
                view.setAlpha(1.0f);
            } else if (f4 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.H(0.0f, 1.0f - SwipeDismissBehavior.K(width, width2, f4), 1.0f));
            }
        }

        @Override // androidx.customview.widget.d.c
        public void l(@o0 View view, float f4, float f5) {
            int i4;
            boolean z4;
            c cVar;
            this.f52691b = -1;
            int width = view.getWidth();
            if (n(view, f4)) {
                int left = view.getLeft();
                int i5 = this.f52690a;
                i4 = left < i5 ? i5 - width : i5 + width;
                z4 = true;
            } else {
                i4 = this.f52690a;
                z4 = false;
            }
            if (SwipeDismissBehavior.this.f52679a.V(i4, view.getTop())) {
                x1.v1(view, new d(view, z4));
            } else {
                if (!z4 || (cVar = SwipeDismissBehavior.this.f52680b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i4) {
            int i5 = this.f52691b;
            return (i5 == -1 || i5 == i4) && SwipeDismissBehavior.this.G(view);
        }
    }

    class b implements androidx.core.view.accessibility.o0 {
        b() {
        }

        @Override // androidx.core.view.accessibility.o0
        public boolean a(@o0 View view, @q0 o0.a aVar) {
            if (!SwipeDismissBehavior.this.G(view)) {
                return false;
            }
            boolean z4 = x1.c0(view) == 1;
            int i4 = SwipeDismissBehavior.this.f52684f;
            view.offsetLeftAndRight((!(i4 == 0 && z4) && (i4 != 1 || z4)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f52680b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i4);
    }

    private class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final View f52694b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f52695c;

        d(View view, boolean z4) {
            this.f52694b = view;
            this.f52695c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            androidx.customview.widget.d dVar = SwipeDismissBehavior.this.f52679a;
            if (dVar != null && dVar.o(true)) {
                x1.v1(this.f52694b, this);
            } else {
                if (!this.f52695c || (cVar = SwipeDismissBehavior.this.f52680b) == null) {
                    return;
                }
                cVar.a(this.f52694b);
            }
        }
    }

    static float H(float f4, float f5, float f6) {
        return Math.min(Math.max(f4, f5), f6);
    }

    static int I(int i4, int i5, int i6) {
        return Math.min(Math.max(i4, i5), i6);
    }

    private void J(ViewGroup viewGroup) {
        if (this.f52679a == null) {
            this.f52679a = this.f52683e ? androidx.customview.widget.d.p(viewGroup, this.f52682d, this.f52688j) : androidx.customview.widget.d.q(viewGroup, this.f52688j);
        }
    }

    static float K(float f4, float f5, float f6) {
        return (f6 - f4) / (f5 - f4);
    }

    private void T(View view) {
        x1.x1(view, 1048576);
        if (G(view)) {
            x1.A1(view, h0.a.f27026z, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean E(CoordinatorLayout coordinatorLayout, V v4, MotionEvent motionEvent) {
        androidx.customview.widget.d dVar = this.f52679a;
        if (dVar == null) {
            return false;
        }
        dVar.M(motionEvent);
        return true;
    }

    public boolean G(@androidx.annotation.o0 View view) {
        return true;
    }

    public int L() {
        androidx.customview.widget.d dVar = this.f52679a;
        if (dVar != null) {
            return dVar.F();
        }
        return 0;
    }

    @q0
    @m1
    public c M() {
        return this.f52680b;
    }

    public void N(float f4) {
        this.f52685g = H(0.0f, f4, 1.0f);
    }

    public void O(float f4) {
        this.f52687i = H(0.0f, f4, 1.0f);
    }

    public void P(@q0 c cVar) {
        this.f52680b = cVar;
    }

    public void Q(float f4) {
        this.f52682d = f4;
        this.f52683e = true;
    }

    public void R(float f4) {
        this.f52686h = H(0.0f, f4, 1.0f);
    }

    public void S(int i4) {
        this.f52684f = i4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean l(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 V v4, @androidx.annotation.o0 MotionEvent motionEvent) {
        boolean z4 = this.f52681c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z4 = coordinatorLayout.M(v4, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f52681c = z4;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f52681c = false;
        }
        if (!z4) {
            return false;
        }
        J(coordinatorLayout);
        return this.f52679a.W(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 V v4, int i4) {
        if (x1.X(v4) != 0) {
            return false;
        }
        v4.setImportantForAccessibility(1);
        T(v4);
        return false;
    }
}
