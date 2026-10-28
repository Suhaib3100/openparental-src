package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.core.view.accessibility.g0;
import androidx.core.view.f1;
import androidx.core.view.g1;
import androidx.core.view.h1;
import androidx.core.view.j1;
import androidx.core.view.j3;
import androidx.core.view.u1;
import androidx.core.view.y1;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.k0;
import androidx.recyclerview.widget.l0;
import androidx.recyclerview.widget.n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import q0.a;

/* loaded from: classes3.dex */
public class RecyclerView extends ViewGroup implements u1, g1, h1 {
    static final boolean R0 = false;
    static final boolean S0 = false;

    /* renamed from: a1, reason: collision with root package name */
    static final boolean f8873a1 = false;

    /* renamed from: b1, reason: collision with root package name */
    public static final int f8874b1 = 0;

    /* renamed from: c1, reason: collision with root package name */
    public static final int f8875c1 = 1;

    /* renamed from: d1, reason: collision with root package name */
    static final int f8876d1 = 1;

    /* renamed from: e1, reason: collision with root package name */
    public static final int f8877e1 = -1;

    /* renamed from: f1, reason: collision with root package name */
    public static final long f8878f1 = -1;

    /* renamed from: g1, reason: collision with root package name */
    public static final int f8879g1 = -1;

    /* renamed from: h1, reason: collision with root package name */
    public static final int f8880h1 = 0;

    /* renamed from: i1, reason: collision with root package name */
    public static final int f8881i1 = 1;

    /* renamed from: j1, reason: collision with root package name */
    public static final int f8882j1 = Integer.MIN_VALUE;

    /* renamed from: k1, reason: collision with root package name */
    static final int f8883k1 = 2000;

    /* renamed from: t1, reason: collision with root package name */
    private static final Class<?>[] f8892t1;

    /* renamed from: u1, reason: collision with root package name */
    private static final int f8893u1 = -1;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f8894v1 = 0;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f8895w1 = 1;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f8896x1 = 2;

    /* renamed from: y1, reason: collision with root package name */
    static final long f8897y1 = Long.MAX_VALUE;

    /* renamed from: z1, reason: collision with root package name */
    static final Interpolator f8898z1;

    @m1
    LayoutManager A;
    boolean A0;
    w B;
    private m.c B0;
    final List<w> C;
    boolean C0;
    final ArrayList<o> D;
    androidx.recyclerview.widget.b0 D0;
    private final ArrayList<r> E;
    private k E0;
    private r F;
    private final int[] F0;
    boolean G;
    private j1 G0;
    boolean H;
    private final int[] H0;
    boolean I;
    private final int[] I0;

    @m1
    boolean J;
    final int[] J0;
    private int K;

    @m1
    final List<d0> K0;
    boolean L;
    private Runnable L0;
    boolean M;
    private boolean M0;
    private boolean N;
    private int N0;
    private int O;
    private int O0;
    boolean P;
    private final l0.b P0;
    private final AccessibilityManager Q;
    private List<p> R;
    boolean S;
    boolean T;
    private int U;
    private int V;

    @o0
    private l W;

    /* renamed from: a0, reason: collision with root package name */
    private EdgeEffect f8899a0;

    /* renamed from: b0, reason: collision with root package name */
    private EdgeEffect f8900b0;

    /* renamed from: c0, reason: collision with root package name */
    private EdgeEffect f8901c0;

    /* renamed from: d0, reason: collision with root package name */
    private EdgeEffect f8902d0;

    /* renamed from: e0, reason: collision with root package name */
    m f8903e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f8904f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f8905g0;

    /* renamed from: h0, reason: collision with root package name */
    private VelocityTracker f8906h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f8907i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f8908j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f8909k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f8910l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f8911m0;

    /* renamed from: n0, reason: collision with root package name */
    private q f8912n0;

    /* renamed from: o, reason: collision with root package name */
    private final x f8913o;

    /* renamed from: o0, reason: collision with root package name */
    private final int f8914o0;

    /* renamed from: p, reason: collision with root package name */
    final v f8915p;

    /* renamed from: p0, reason: collision with root package name */
    private final int f8916p0;

    /* renamed from: q, reason: collision with root package name */
    SavedState f8917q;

    /* renamed from: q0, reason: collision with root package name */
    private float f8918q0;

    /* renamed from: r, reason: collision with root package name */
    androidx.recyclerview.widget.a f8919r;

    /* renamed from: r0, reason: collision with root package name */
    private float f8920r0;

    /* renamed from: s, reason: collision with root package name */
    androidx.recyclerview.widget.g f8921s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f8922s0;

    /* renamed from: t, reason: collision with root package name */
    final l0 f8923t;

    /* renamed from: t0, reason: collision with root package name */
    final c0 f8924t0;

    /* renamed from: u, reason: collision with root package name */
    boolean f8925u;

    /* renamed from: u0, reason: collision with root package name */
    androidx.recyclerview.widget.n f8926u0;

    /* renamed from: v, reason: collision with root package name */
    final Runnable f8927v;

    /* renamed from: v0, reason: collision with root package name */
    n.b f8928v0;

    /* renamed from: w, reason: collision with root package name */
    final Rect f8929w;

    /* renamed from: w0, reason: collision with root package name */
    final a0 f8930w0;

    /* renamed from: x, reason: collision with root package name */
    private final Rect f8931x;

    /* renamed from: x0, reason: collision with root package name */
    private s f8932x0;

    /* renamed from: y, reason: collision with root package name */
    final RectF f8933y;

    /* renamed from: y0, reason: collision with root package name */
    private List<s> f8934y0;

    /* renamed from: z, reason: collision with root package name */
    h f8935z;

    /* renamed from: z0, reason: collision with root package name */
    boolean f8936z0;

    /* renamed from: q1, reason: collision with root package name */
    static final String f8889q1 = "RV Prefetch";

    /* renamed from: p1, reason: collision with root package name */
    static final String f8888p1 = "RV OnBindView";

    /* renamed from: o1, reason: collision with root package name */
    private static final String f8887o1 = "RV PartialInvalidate";

    /* renamed from: n1, reason: collision with root package name */
    private static final String f8886n1 = "RV FullInvalidate";

    /* renamed from: m1, reason: collision with root package name */
    private static final String f8885m1 = "RV OnLayout";

    /* renamed from: l1, reason: collision with root package name */
    static final String f8884l1 = "RV Scroll";

    /* renamed from: s1, reason: collision with root package name */
    static final String f8891s1 = "RV CreateView";
    static final String Q0 = "RecyclerView";

    /* renamed from: r1, reason: collision with root package name */
    static final String f8890r1 = "RV Nested Prefetch";
    private static final int[] T0 = {R.attr.nestedScrollingEnabled};
    static final boolean U0 = false;
    static final boolean V0 = true;
    static final boolean W0 = true;
    static final boolean X0 = true;
    private static final boolean Y0 = false;
    private static final boolean Z0 = false;

    /* loaded from: classes.dex */
    public static abstract class LayoutManager {

        /* renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.g f8937a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView f8938b;

        /* renamed from: c, reason: collision with root package name */
        private final k0.b f8939c;

        /* renamed from: d, reason: collision with root package name */
        private final k0.b f8940d;

        /* renamed from: e, reason: collision with root package name */
        k0 f8941e;

        /* renamed from: f, reason: collision with root package name */
        k0 f8942f;

        /* renamed from: g, reason: collision with root package name */
        @q0
        z f8943g;

        /* renamed from: h, reason: collision with root package name */
        boolean f8944h;

        /* renamed from: i, reason: collision with root package name */
        boolean f8945i;

        /* renamed from: j, reason: collision with root package name */
        boolean f8946j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f8947k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f8948l;

        /* renamed from: m, reason: collision with root package name */
        int f8949m;

        /* renamed from: n, reason: collision with root package name */
        boolean f8950n;

        /* renamed from: o, reason: collision with root package name */
        private int f8951o;

        /* renamed from: p, reason: collision with root package name */
        private int f8952p;

        /* renamed from: q, reason: collision with root package name */
        private int f8953q;

        /* renamed from: r, reason: collision with root package name */
        private int f8954r;

        public static class Properties {

            /* renamed from: a, reason: collision with root package name */
            public int f8955a;

            /* renamed from: b, reason: collision with root package name */
            public int f8956b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f8957c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f8958d;
        }

        /* loaded from: classes3.dex */
        class a implements k0.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.k0.b
            public View a(int i5) {
                return LayoutManager.this.P(i5);
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int b(View view) {
                return LayoutManager.this.Y(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int c() {
                return LayoutManager.this.o0();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int d() {
                return LayoutManager.this.z0() - LayoutManager.this.p0();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int e(View view) {
                return LayoutManager.this.b0(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes3.dex */
        class b implements k0.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.k0.b
            public View a(int i5) {
                return LayoutManager.this.P(i5);
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int b(View view) {
                return LayoutManager.this.c0(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int c() {
                return LayoutManager.this.r0();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int d() {
                return LayoutManager.this.e0() - LayoutManager.this.m0();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int e(View view) {
                return LayoutManager.this.W(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i5, int i6);
        }

        public LayoutManager() {
            a aVar = new a();
            this.f8939c = aVar;
            b bVar = new b();
            this.f8940d = bVar;
            this.f8941e = new k0(aVar);
            this.f8942f = new k0(bVar);
            this.f8944h = false;
            this.f8945i = false;
            this.f8946j = false;
            this.f8947k = true;
            this.f8948l = true;
        }

        private void E(int i5, @o0 View view) {
            this.f8937a.d(i5);
        }

        private boolean H0(RecyclerView recyclerView, int i5, int i6) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int o02 = o0();
            int r02 = r0();
            int z02 = z0() - p0();
            int e02 = e0() - m0();
            Rect rect = this.f8938b.f8929w;
            X(focusedChild, rect);
            return rect.left - i5 < z02 && rect.right - i5 > o02 && rect.top - i6 < e02 && rect.bottom - i6 > r02;
        }

        private static boolean L0(int i5, int i6, int i7) {
            int mode = View.MeasureSpec.getMode(i6);
            int size = View.MeasureSpec.getSize(i6);
            if (i7 > 0 && i5 != i7) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i5;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i5;
            }
            return true;
        }

        private void P1(v vVar, int i5, View view) {
            d0 w02 = RecyclerView.w0(view);
            if (w02.N()) {
                return;
            }
            if (w02.x() && !w02.z() && !this.f8938b.f8935z.l()) {
                K1(i5);
                vVar.D(w02);
            } else {
                D(i5);
                vVar.E(view);
                this.f8938b.f8923t.k(w02);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int R(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.R(int, int, int, int, boolean):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
        
            if (r3 >= 0) goto L8;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int S(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = r2
                goto L1e
            Lf:
                if (r3 < 0) goto L13
            L11:
                r2 = r0
                goto L1e
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto L11
            L18:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.S(int, int, int, boolean):int");
        }

        private int[] T(View view, Rect rect) {
            int[] iArr = new int[2];
            int o02 = o0();
            int r02 = r0();
            int z02 = z0() - p0();
            int e02 = e0() - m0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i5 = left - o02;
            int min = Math.min(0, i5);
            int i6 = top - r02;
            int min2 = Math.min(0, i6);
            int i7 = width - z02;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, height - e02);
            if (i0() != 1) {
                if (min == 0) {
                    min = Math.min(i5, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i7);
            }
            if (min2 == 0) {
                min2 = Math.min(i6, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private void g(View view, int i5, boolean z5) {
            d0 w02 = RecyclerView.w0(view);
            if (z5 || w02.z()) {
                this.f8938b.f8923t.b(w02);
            } else {
                this.f8938b.f8923t.p(w02);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (w02.Q() || w02.A()) {
                if (w02.A()) {
                    w02.P();
                } else {
                    w02.e();
                }
                this.f8937a.c(view, i5, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f8938b) {
                int m5 = this.f8937a.m(view);
                if (i5 == -1) {
                    i5 = this.f8937a.g();
                }
                if (m5 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f8938b.indexOfChild(view) + this.f8938b.Z());
                }
                if (m5 != i5) {
                    this.f8938b.A.S0(m5, i5);
                }
            } else {
                this.f8937a.a(view, i5, false);
                layoutParams.f8963c = true;
                z zVar = this.f8943g;
                if (zVar != null && zVar.i()) {
                    this.f8943g.l(view);
                }
            }
            if (layoutParams.f8964d) {
                w02.f9003a.invalidate();
                layoutParams.f8964d = false;
            }
        }

        public static int q(int i5, int i6, int i7) {
            int mode = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i6, i7) : size : Math.min(size, Math.max(i6, i7));
        }

        public static Properties t0(@o0 Context context, @q0 AttributeSet attributeSet, int i5, int i6) {
            Properties properties = new Properties();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.P, i5, i6);
            properties.f8955a = obtainStyledAttributes.getInt(a.j.Q, 1);
            properties.f8956b = obtainStyledAttributes.getInt(a.j.f32497a0, 1);
            properties.f8957c = obtainStyledAttributes.getBoolean(a.j.Z, false);
            properties.f8958d = obtainStyledAttributes.getBoolean(a.j.f32499b0, false);
            obtainStyledAttributes.recycle();
            return properties;
        }

        public void A(@o0 View view, @o0 v vVar) {
            P1(vVar, this.f8937a.m(view), view);
        }

        public int A0() {
            return this.f8951o;
        }

        public boolean A1(@o0 v vVar, @o0 a0 a0Var, @o0 View view, int i5, @q0 Bundle bundle) {
            return false;
        }

        public void B(int i5, @o0 v vVar) {
            P1(vVar, i5, P(i5));
        }

        boolean B0() {
            int Q = Q();
            for (int i5 = 0; i5 < Q; i5++) {
                ViewGroup.LayoutParams layoutParams = P(i5).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void B1(Runnable runnable) {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                y1.p1(recyclerView, runnable);
            }
        }

        public void C(@o0 View view) {
            int m5 = this.f8937a.m(view);
            if (m5 >= 0) {
                E(m5, view);
            }
        }

        public boolean C0() {
            RecyclerView recyclerView = this.f8938b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void C1() {
            for (int Q = Q() - 1; Q >= 0; Q--) {
                this.f8937a.q(Q);
            }
        }

        public void D(int i5) {
            E(i5, P(i5));
        }

        public void D0(@o0 View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f8938b;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f8938b.Z());
            }
            d0 w02 = RecyclerView.w0(view);
            w02.b(128);
            this.f8938b.f8923t.q(w02);
        }

        public void D1(@o0 v vVar) {
            for (int Q = Q() - 1; Q >= 0; Q--) {
                if (!RecyclerView.w0(P(Q)).N()) {
                    G1(Q, vVar);
                }
            }
        }

        public boolean E0() {
            return this.f8945i;
        }

        void E1(v vVar) {
            int k5 = vVar.k();
            for (int i5 = k5 - 1; i5 >= 0; i5--) {
                View o5 = vVar.o(i5);
                d0 w02 = RecyclerView.w0(o5);
                if (!w02.N()) {
                    w02.K(false);
                    if (w02.B()) {
                        this.f8938b.removeDetachedView(o5, false);
                    }
                    m mVar = this.f8938b.f8903e0;
                    if (mVar != null) {
                        mVar.k(w02);
                    }
                    w02.K(true);
                    vVar.z(o5);
                }
            }
            vVar.f();
            if (k5 > 0) {
                this.f8938b.invalidate();
            }
        }

        void F(RecyclerView recyclerView) {
            this.f8945i = true;
            X0(recyclerView);
        }

        public boolean F0() {
            return this.f8946j;
        }

        public void F1(@o0 View view, @o0 v vVar) {
            J1(view);
            vVar.C(view);
        }

        void G(RecyclerView recyclerView, v vVar) {
            this.f8945i = false;
            Z0(recyclerView, vVar);
        }

        public boolean G0() {
            RecyclerView recyclerView = this.f8938b;
            return recyclerView != null && recyclerView.isFocused();
        }

        public void G1(int i5, @o0 v vVar) {
            View P = P(i5);
            K1(i5);
            vVar.C(P);
        }

        public void H(View view) {
            m mVar = this.f8938b.f8903e0;
            if (mVar != null) {
                mVar.k(RecyclerView.w0(view));
            }
        }

        public boolean H1(Runnable runnable) {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @q0
        public View I(@o0 View view) {
            View c02;
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView == null || (c02 = recyclerView.c0(view)) == null || this.f8937a.n(c02)) {
                return null;
            }
            return c02;
        }

        public final boolean I0() {
            return this.f8948l;
        }

        public void I1(@o0 View view) {
            this.f8938b.removeDetachedView(view, false);
        }

        @q0
        public View J(int i5) {
            int Q = Q();
            for (int i6 = 0; i6 < Q; i6++) {
                View P = P(i6);
                d0 w02 = RecyclerView.w0(P);
                if (w02 != null && w02.p() == i5 && !w02.N() && (this.f8938b.f8930w0.j() || !w02.z())) {
                    return P;
                }
            }
            return null;
        }

        public boolean J0(@o0 v vVar, @o0 a0 a0Var) {
            return false;
        }

        public void J1(View view) {
            this.f8937a.p(view);
        }

        public abstract LayoutParams K();

        public boolean K0() {
            return this.f8947k;
        }

        public void K1(int i5) {
            if (P(i5) != null) {
                this.f8937a.q(i5);
            }
        }

        public LayoutParams L(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public boolean L1(@o0 RecyclerView recyclerView, @o0 View view, @o0 Rect rect, boolean z5) {
            return M1(recyclerView, view, rect, z5, false);
        }

        public LayoutParams M(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public boolean M0() {
            z zVar = this.f8943g;
            return zVar != null && zVar.i();
        }

        public boolean M1(@o0 RecyclerView recyclerView, @o0 View view, @o0 Rect rect, boolean z5, boolean z6) {
            int[] T = T(view, rect);
            int i5 = T[0];
            int i6 = T[1];
            if ((z6 && !H0(recyclerView, i5, i6)) || (i5 == 0 && i6 == 0)) {
                return false;
            }
            if (z5) {
                recyclerView.scrollBy(i5, i6);
            } else {
                recyclerView.q2(i5, i6);
            }
            return true;
        }

        public int N() {
            return -1;
        }

        public boolean N0(@o0 View view, boolean z5, boolean z6) {
            boolean z7 = this.f8941e.b(view, 24579) && this.f8942f.b(view, 24579);
            return z5 ? z7 : !z7;
        }

        public void N1() {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int O(@o0 View view) {
            return ((LayoutParams) view.getLayoutParams()).f8962b.bottom;
        }

        public void O0(@o0 View view, int i5, int i6, int i7, int i8) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f8962b;
            view.layout(i5 + rect.left, i6 + rect.top, i7 - rect.right, i8 - rect.bottom);
        }

        public void O1() {
            this.f8944h = true;
        }

        @q0
        public View P(int i5) {
            androidx.recyclerview.widget.g gVar = this.f8937a;
            if (gVar != null) {
                return gVar.f(i5);
            }
            return null;
        }

        public void P0(@o0 View view, int i5, int i6, int i7, int i8) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f8962b;
            view.layout(i5 + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i6 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i7 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i8 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public int Q() {
            androidx.recyclerview.widget.g gVar = this.f8937a;
            if (gVar != null) {
                return gVar.g();
            }
            return 0;
        }

        public void Q0(@o0 View view, int i5, int i6) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect E0 = this.f8938b.E0(view);
            int i7 = E0.left + E0.right + i5;
            int i8 = E0.top + E0.bottom + i6;
            int R = R(z0(), A0(), p0() + o0() + i7, ((ViewGroup.MarginLayoutParams) layoutParams).width, n());
            int R2 = R(e0(), f0(), m0() + r0() + i8, ((ViewGroup.MarginLayoutParams) layoutParams).height, o());
            if (c2(view, R, R2, layoutParams)) {
                view.measure(R, R2);
            }
        }

        public int Q1(int i5, v vVar, a0 a0Var) {
            return 0;
        }

        public void R0(@o0 View view, int i5, int i6) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect E0 = this.f8938b.E0(view);
            int i7 = E0.left + E0.right + i5;
            int i8 = E0.top + E0.bottom + i6;
            int R = R(z0(), A0(), p0() + o0() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i7, ((ViewGroup.MarginLayoutParams) layoutParams).width, n());
            int R2 = R(e0(), f0(), m0() + r0() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i8, ((ViewGroup.MarginLayoutParams) layoutParams).height, o());
            if (c2(view, R, R2, layoutParams)) {
                view.measure(R, R2);
            }
        }

        public void R1(int i5) {
        }

        public void S0(int i5, int i6) {
            View P = P(i5);
            if (P != null) {
                D(i5);
                k(P, i6);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i5 + this.f8938b.toString());
            }
        }

        public int S1(int i5, v vVar, a0 a0Var) {
            return 0;
        }

        public void T0(@u0 int i5) {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                recyclerView.k1(i5);
            }
        }

        @Deprecated
        public void T1(boolean z5) {
            this.f8946j = z5;
        }

        public boolean U() {
            RecyclerView recyclerView = this.f8938b;
            return recyclerView != null && recyclerView.f8925u;
        }

        public void U0(@u0 int i5) {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                recyclerView.l1(i5);
            }
        }

        void U1(RecyclerView recyclerView) {
            W1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
        }

        public int V(@o0 v vVar, @o0 a0 a0Var) {
            return -1;
        }

        public void V0(@q0 h hVar, @q0 h hVar2) {
        }

        public final void V1(boolean z5) {
            if (z5 != this.f8948l) {
                this.f8948l = z5;
                this.f8949m = 0;
                RecyclerView recyclerView = this.f8938b;
                if (recyclerView != null) {
                    recyclerView.f8915p.L();
                }
            }
        }

        public int W(@o0 View view) {
            return O(view) + view.getBottom();
        }

        public boolean W0(@o0 RecyclerView recyclerView, @o0 ArrayList<View> arrayList, int i5, int i6) {
            return false;
        }

        void W1(int i5, int i6) {
            this.f8953q = View.MeasureSpec.getSize(i5);
            int mode = View.MeasureSpec.getMode(i5);
            this.f8951o = mode;
            if (mode == 0 && !RecyclerView.V0) {
                this.f8953q = 0;
            }
            this.f8954r = View.MeasureSpec.getSize(i6);
            int mode2 = View.MeasureSpec.getMode(i6);
            this.f8952p = mode2;
            if (mode2 != 0 || RecyclerView.V0) {
                return;
            }
            this.f8954r = 0;
        }

        public void X(@o0 View view, @o0 Rect rect) {
            RecyclerView.z0(view, rect);
        }

        @androidx.annotation.i
        public void X0(RecyclerView recyclerView) {
        }

        public void X1(int i5, int i6) {
            this.f8938b.setMeasuredDimension(i5, i6);
        }

        public int Y(@o0 View view) {
            return view.getLeft() - j0(view);
        }

        @Deprecated
        public void Y0(RecyclerView recyclerView) {
        }

        public void Y1(Rect rect, int i5, int i6) {
            X1(q(i5, p0() + o0() + rect.width(), l0()), q(i6, m0() + r0() + rect.height(), k0()));
        }

        public int Z(@o0 View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f8962b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        @androidx.annotation.i
        public void Z0(RecyclerView recyclerView, v vVar) {
            Y0(recyclerView);
        }

        void Z1(int i5, int i6) {
            int Q = Q();
            if (Q == 0) {
                this.f8938b.I(i5, i6);
                return;
            }
            int i7 = Integer.MIN_VALUE;
            int i8 = Integer.MAX_VALUE;
            int i9 = Integer.MIN_VALUE;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < Q; i11++) {
                View P = P(i11);
                Rect rect = this.f8938b.f8929w;
                X(P, rect);
                int i12 = rect.left;
                if (i12 < i10) {
                    i10 = i12;
                }
                int i13 = rect.right;
                if (i13 > i7) {
                    i7 = i13;
                }
                int i14 = rect.top;
                if (i14 < i8) {
                    i8 = i14;
                }
                int i15 = rect.bottom;
                if (i15 > i9) {
                    i9 = i15;
                }
            }
            this.f8938b.f8929w.set(i10, i8, i7, i9);
            Y1(this.f8938b.f8929w, i5, i6);
        }

        public int a0(@o0 View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f8962b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        @q0
        public View a1(@o0 View view, int i5, @o0 v vVar, @o0 a0 a0Var) {
            return null;
        }

        public void a2(boolean z5) {
            this.f8947k = z5;
        }

        public int b0(@o0 View view) {
            return u0(view) + view.getRight();
        }

        public void b1(@o0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f8938b;
            c1(recyclerView.f8915p, recyclerView.f8930w0, accessibilityEvent);
        }

        void b2(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f8938b = null;
                this.f8937a = null;
                this.f8953q = 0;
                this.f8954r = 0;
            } else {
                this.f8938b = recyclerView;
                this.f8937a = recyclerView.f8921s;
                this.f8953q = recyclerView.getWidth();
                this.f8954r = recyclerView.getHeight();
            }
            this.f8951o = androidx.constraintlayout.solver.widgets.analyzer.b.f2366g;
            this.f8952p = androidx.constraintlayout.solver.widgets.analyzer.b.f2366g;
        }

        public void c(View view) {
            d(view, -1);
        }

        public int c0(@o0 View view) {
            return view.getTop() - x0(view);
        }

        public void c1(@o0 v vVar, @o0 a0 a0Var, @o0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z5 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f8938b.canScrollVertically(-1) && !this.f8938b.canScrollHorizontally(-1) && !this.f8938b.canScrollHorizontally(1)) {
                z5 = false;
            }
            accessibilityEvent.setScrollable(z5);
            h hVar = this.f8938b.f8935z;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.g());
            }
        }

        boolean c2(View view, int i5, int i6, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.f8947k && L0(view.getWidth(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).width) && L0(view.getHeight(), i6, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public void d(View view, int i5) {
            g(view, i5, true);
        }

        @q0
        public View d0() {
            View focusedChild;
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f8937a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        void d1(androidx.core.view.accessibility.g0 g0Var) {
            RecyclerView recyclerView = this.f8938b;
            e1(recyclerView.f8915p, recyclerView.f8930w0, g0Var);
        }

        boolean d2() {
            return false;
        }

        public void e(View view) {
            f(view, -1);
        }

        @u0
        public int e0() {
            return this.f8954r;
        }

        public void e1(@o0 v vVar, @o0 a0 a0Var, @o0 androidx.core.view.accessibility.g0 g0Var) {
            if (this.f8938b.canScrollVertically(-1) || this.f8938b.canScrollHorizontally(-1)) {
                g0Var.a(8192);
                g0Var.F1(true);
            }
            if (this.f8938b.canScrollVertically(1) || this.f8938b.canScrollHorizontally(1)) {
                g0Var.a(4096);
                g0Var.F1(true);
            }
            g0Var.Y0(g0.b.f(v0(vVar, a0Var), V(vVar, a0Var), J0(vVar, a0Var), w0(vVar, a0Var)));
        }

        boolean e2(View view, int i5, int i6, LayoutParams layoutParams) {
            return (this.f8947k && L0(view.getMeasuredWidth(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).width) && L0(view.getMeasuredHeight(), i6, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public void f(View view, int i5) {
            g(view, i5, false);
        }

        public int f0() {
            return this.f8952p;
        }

        void f1(View view, androidx.core.view.accessibility.g0 g0Var) {
            d0 w02 = RecyclerView.w0(view);
            if (w02 == null || w02.z() || this.f8937a.n(w02.f9003a)) {
                return;
            }
            RecyclerView recyclerView = this.f8938b;
            g1(recyclerView.f8915p, recyclerView.f8930w0, view, g0Var);
        }

        public void f2(RecyclerView recyclerView, a0 a0Var, int i5) {
        }

        public int g0() {
            RecyclerView recyclerView = this.f8938b;
            h o02 = recyclerView != null ? recyclerView.o0() : null;
            if (o02 != null) {
                return o02.g();
            }
            return 0;
        }

        public void g1(@o0 v vVar, @o0 a0 a0Var, @o0 View view, @o0 androidx.core.view.accessibility.g0 g0Var) {
        }

        public void g2(z zVar) {
            z zVar2 = this.f8943g;
            if (zVar2 != null && zVar != zVar2 && zVar2.i()) {
                this.f8943g.s();
            }
            this.f8943g = zVar;
            zVar.r(this.f8938b, this);
        }

        public void h(String str) {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                recyclerView.x(str);
            }
        }

        public int h0(@o0 View view) {
            return RecyclerView.w0(view).o();
        }

        @q0
        public View h1(@o0 View view, int i5) {
            return null;
        }

        public void h2(@o0 View view) {
            d0 w02 = RecyclerView.w0(view);
            w02.O();
            w02.H();
            w02.b(4);
        }

        public void i(String str) {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                recyclerView.y(str);
            }
        }

        public int i0() {
            return y1.Z(this.f8938b);
        }

        public void i1(@o0 RecyclerView recyclerView, int i5, int i6) {
        }

        void i2() {
            z zVar = this.f8943g;
            if (zVar != null) {
                zVar.s();
            }
        }

        public void j(@o0 View view) {
            k(view, -1);
        }

        public int j0(@o0 View view) {
            return ((LayoutParams) view.getLayoutParams()).f8962b.left;
        }

        public void j1(@o0 RecyclerView recyclerView) {
        }

        public boolean j2() {
            return false;
        }

        public void k(@o0 View view, int i5) {
            l(view, i5, (LayoutParams) view.getLayoutParams());
        }

        @u0
        public int k0() {
            return y1.e0(this.f8938b);
        }

        public void k1(@o0 RecyclerView recyclerView, int i5, int i6, int i7) {
        }

        public void l(@o0 View view, int i5, LayoutParams layoutParams) {
            d0 w02 = RecyclerView.w0(view);
            if (w02.z()) {
                this.f8938b.f8923t.b(w02);
            } else {
                this.f8938b.f8923t.p(w02);
            }
            this.f8937a.c(view, i5, layoutParams, w02.z());
        }

        @u0
        public int l0() {
            return y1.f0(this.f8938b);
        }

        public void l1(@o0 RecyclerView recyclerView, int i5, int i6) {
        }

        public void m(@o0 View view, @o0 Rect rect) {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.E0(view));
            }
        }

        @u0
        public int m0() {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void m1(@o0 RecyclerView recyclerView, int i5, int i6) {
        }

        public boolean n() {
            return false;
        }

        @u0
        public int n0() {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                return y1.j0(recyclerView);
            }
            return 0;
        }

        public void n1(@o0 RecyclerView recyclerView, int i5, int i6, @q0 Object obj) {
            m1(recyclerView, i5, i6);
        }

        public boolean o() {
            return false;
        }

        @u0
        public int o0() {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void o1(v vVar, a0 a0Var) {
        }

        public boolean p(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        @u0
        public int p0() {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void p1(a0 a0Var) {
        }

        @u0
        public int q0() {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                return y1.k0(recyclerView);
            }
            return 0;
        }

        public void q1(@o0 v vVar, @o0 a0 a0Var, int i5, int i6) {
            this.f8938b.I(i5, i6);
        }

        public void r(int i5, int i6, a0 a0Var, c cVar) {
        }

        @u0
        public int r0() {
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        @Deprecated
        public boolean r1(@o0 RecyclerView recyclerView, @o0 View view, @q0 View view2) {
            return M0() || recyclerView.c1();
        }

        public void s(int i5, c cVar) {
        }

        public int s0(@o0 View view) {
            return ((LayoutParams) view.getLayoutParams()).d();
        }

        public boolean s1(@o0 RecyclerView recyclerView, @o0 a0 a0Var, @o0 View view, @q0 View view2) {
            return r1(recyclerView, view, view2);
        }

        public int t(@o0 a0 a0Var) {
            return 0;
        }

        public void t1(Parcelable parcelable) {
        }

        public int u(@o0 a0 a0Var) {
            return 0;
        }

        public int u0(@o0 View view) {
            return ((LayoutParams) view.getLayoutParams()).f8962b.right;
        }

        @q0
        public Parcelable u1() {
            return null;
        }

        public int v(@o0 a0 a0Var) {
            return 0;
        }

        public int v0(@o0 v vVar, @o0 a0 a0Var) {
            return -1;
        }

        public void v1(int i5) {
        }

        public int w(@o0 a0 a0Var) {
            return 0;
        }

        public int w0(@o0 v vVar, @o0 a0 a0Var) {
            return 0;
        }

        void w1(z zVar) {
            if (this.f8943g == zVar) {
                this.f8943g = null;
            }
        }

        public int x(@o0 a0 a0Var) {
            return 0;
        }

        public int x0(@o0 View view) {
            return ((LayoutParams) view.getLayoutParams()).f8962b.top;
        }

        boolean x1(int i5, @q0 Bundle bundle) {
            RecyclerView recyclerView = this.f8938b;
            return y1(recyclerView.f8915p, recyclerView.f8930w0, i5, bundle);
        }

        public int y(@o0 a0 a0Var) {
            return 0;
        }

        public void y0(@o0 View view, boolean z5, @o0 Rect rect) {
            Matrix matrix;
            if (z5) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f8962b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f8938b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f8938b.f8933y;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean y1(@o0 v vVar, @o0 a0 a0Var, int i5, @q0 Bundle bundle) {
            int e02;
            int z02;
            int i6;
            int i7;
            RecyclerView recyclerView = this.f8938b;
            if (recyclerView == null) {
                return false;
            }
            if (i5 == 4096) {
                e02 = recyclerView.canScrollVertically(1) ? (e0() - r0()) - m0() : 0;
                if (this.f8938b.canScrollHorizontally(1)) {
                    z02 = (z0() - o0()) - p0();
                    i6 = e02;
                    i7 = z02;
                }
                i6 = e02;
                i7 = 0;
            } else if (i5 != 8192) {
                i7 = 0;
                i6 = 0;
            } else {
                e02 = recyclerView.canScrollVertically(-1) ? -((e0() - r0()) - m0()) : 0;
                if (this.f8938b.canScrollHorizontally(-1)) {
                    z02 = -((z0() - o0()) - p0());
                    i6 = e02;
                    i7 = z02;
                }
                i6 = e02;
                i7 = 0;
            }
            if (i6 == 0 && i7 == 0) {
                return false;
            }
            this.f8938b.t2(i7, i6, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void z(@o0 v vVar) {
            for (int Q = Q() - 1; Q >= 0; Q--) {
                P1(vVar, Q, P(Q));
            }
        }

        @u0
        public int z0() {
            return this.f8953q;
        }

        boolean z1(@o0 View view, int i5, @q0 Bundle bundle) {
            RecyclerView recyclerView = this.f8938b;
            return A1(recyclerView.f8915p, recyclerView.f8930w0, view, i5, bundle);
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.J || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.G) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.M) {
                recyclerView2.L = true;
            } else {
                recyclerView2.G();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a0 {

        /* renamed from: r, reason: collision with root package name */
        static final int f8967r = 1;

        /* renamed from: s, reason: collision with root package name */
        static final int f8968s = 2;

        /* renamed from: t, reason: collision with root package name */
        static final int f8969t = 4;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f8971b;

        /* renamed from: m, reason: collision with root package name */
        int f8982m;

        /* renamed from: n, reason: collision with root package name */
        long f8983n;

        /* renamed from: o, reason: collision with root package name */
        int f8984o;

        /* renamed from: p, reason: collision with root package name */
        int f8985p;

        /* renamed from: q, reason: collision with root package name */
        int f8986q;

        /* renamed from: a, reason: collision with root package name */
        int f8970a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f8972c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f8973d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f8974e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f8975f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f8976g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f8977h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f8978i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f8979j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f8980k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f8981l = false;

        void a(int i5) {
            if ((this.f8974e & i5) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i5) + " but it is " + Integer.toBinaryString(this.f8974e));
        }

        public boolean b() {
            return this.f8976g;
        }

        public <T> T c(int i5) {
            SparseArray<Object> sparseArray = this.f8971b;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i5);
        }

        public int d() {
            return this.f8977h ? this.f8972c - this.f8973d : this.f8975f;
        }

        public int e() {
            return this.f8985p;
        }

        public int f() {
            return this.f8986q;
        }

        public int g() {
            return this.f8970a;
        }

        public boolean h() {
            return this.f8970a != -1;
        }

        public boolean i() {
            return this.f8979j;
        }

        public boolean j() {
            return this.f8977h;
        }

        void k(h hVar) {
            this.f8974e = 1;
            this.f8975f = hVar.g();
            this.f8977h = false;
            this.f8978i = false;
            this.f8979j = false;
        }

        public void l(int i5, Object obj) {
            if (this.f8971b == null) {
                this.f8971b = new SparseArray<>();
            }
            this.f8971b.put(i5, obj);
        }

        public void m(int i5) {
            SparseArray<Object> sparseArray = this.f8971b;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i5);
        }

        public boolean n() {
            return this.f8981l;
        }

        public boolean o() {
            return this.f8980k;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f8970a + ", mData=" + this.f8971b + ", mItemCount=" + this.f8975f + ", mIsMeasuring=" + this.f8979j + ", mPreviousLayoutItemCount=" + this.f8972c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f8973d + ", mStructureChanged=" + this.f8976g + ", mInPreLayout=" + this.f8977h + ", mRunSimpleAnimations=" + this.f8980k + ", mRunPredictiveAnimations=" + this.f8981l + '}';
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f8903e0;
            if (mVar != null) {
                mVar.x();
            }
            RecyclerView.this.C0 = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b0 {
        @q0
        public abstract View a(@o0 v vVar, int i5, int i6);
    }

    /* loaded from: classes.dex */
    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            float f7 = f6 - 1.0f;
            return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    class c0 implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private int f8988o;

        /* renamed from: p, reason: collision with root package name */
        private int f8989p;

        /* renamed from: q, reason: collision with root package name */
        OverScroller f8990q;

        /* renamed from: r, reason: collision with root package name */
        Interpolator f8991r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f8992s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f8993t;

        c0() {
            Interpolator interpolator = RecyclerView.f8898z1;
            this.f8991r = interpolator;
            this.f8992s = false;
            this.f8993t = false;
            this.f8990q = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i5, int i6) {
            int abs = Math.abs(i5);
            int abs2 = Math.abs(i6);
            boolean z5 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z5 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z5) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), RecyclerView.f8883k1);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            y1.p1(RecyclerView.this, this);
        }

        public void b(int i5, int i6) {
            RecyclerView.this.m2(2);
            this.f8989p = 0;
            this.f8988o = 0;
            Interpolator interpolator = this.f8991r;
            Interpolator interpolator2 = RecyclerView.f8898z1;
            if (interpolator != interpolator2) {
                this.f8991r = interpolator2;
                this.f8990q = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f8990q.fling(0, 0, i5, i6, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f8992s) {
                this.f8993t = true;
            } else {
                c();
            }
        }

        public void e(int i5, int i6, int i7, @q0 Interpolator interpolator) {
            if (i7 == Integer.MIN_VALUE) {
                i7 = a(i5, i6);
            }
            int i8 = i7;
            if (interpolator == null) {
                interpolator = RecyclerView.f8898z1;
            }
            if (this.f8991r != interpolator) {
                this.f8991r = interpolator;
                this.f8990q = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f8989p = 0;
            this.f8988o = 0;
            RecyclerView.this.m2(2);
            this.f8990q.startScroll(0, 0, i5, i6, i8);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f8990q.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i5;
            int i6;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.A == null) {
                f();
                return;
            }
            this.f8993t = false;
            this.f8992s = true;
            recyclerView.G();
            OverScroller overScroller = this.f8990q;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i7 = currX - this.f8988o;
                int i8 = currY - this.f8989p;
                this.f8988o = currX;
                this.f8989p = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.J0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.b(i7, i8, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.J0;
                    i7 -= iArr2[0];
                    i8 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.F(i7, i8);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f8935z != null) {
                    int[] iArr3 = recyclerView3.J0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.U1(i7, i8, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.J0;
                    i6 = iArr4[0];
                    i5 = iArr4[1];
                    i7 -= i6;
                    i8 -= i5;
                    z zVar = recyclerView4.A.f8943g;
                    if (zVar != null && !zVar.h() && zVar.i()) {
                        int d6 = RecyclerView.this.f8930w0.d();
                        if (d6 == 0) {
                            zVar.s();
                        } else if (zVar.f() >= d6) {
                            zVar.q(d6 - 1);
                            zVar.k(i6, i5);
                        } else {
                            zVar.k(i6, i5);
                        }
                    }
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                if (!RecyclerView.this.D.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.J0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.c(i6, i5, i7, i8, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.J0;
                int i9 = i7 - iArr6[0];
                int i10 = i8 - iArr6[1];
                if (i6 != 0 || i5 != 0) {
                    recyclerView6.S(i6, i5);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z5 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i9 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i10 != 0));
                z zVar2 = RecyclerView.this.A.f8943g;
                if ((zVar2 != null && zVar2.h()) || !z5) {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.n nVar = recyclerView7.f8926u0;
                    if (nVar != null) {
                        nVar.f(recyclerView7, i6, i5);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i11 = i9 < 0 ? -currVelocity : i9 > 0 ? currVelocity : 0;
                        if (i10 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i10 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.i(i11, currVelocity);
                    }
                    if (RecyclerView.X0) {
                        RecyclerView.this.f8928v0.b();
                    }
                }
            }
            z zVar3 = RecyclerView.this.A.f8943g;
            if (zVar3 != null && zVar3.h()) {
                zVar3.k(0, 0);
            }
            this.f8992s = false;
            if (this.f8993t) {
                c();
            } else {
                RecyclerView.this.m2(0);
                RecyclerView.this.g(1);
            }
        }
    }

    class d implements l0.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.l0.b
        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.A.F1(d0Var.f9003a, recyclerView.f8915p);
        }

        @Override // androidx.recyclerview.widget.l0.b
        public void b(d0 d0Var, m.d dVar, m.d dVar2) {
            RecyclerView.this.u(d0Var, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.l0.b
        public void c(d0 d0Var, @o0 m.d dVar, @q0 m.d dVar2) {
            RecyclerView.this.f8915p.K(d0Var);
            RecyclerView.this.w(d0Var, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.l0.b
        public void d(d0 d0Var, @o0 m.d dVar, @o0 m.d dVar2) {
            d0Var.K(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.S) {
                if (recyclerView.f8903e0.b(d0Var, d0Var, dVar, dVar2)) {
                    RecyclerView.this.x1();
                }
            } else if (recyclerView.f8903e0.d(d0Var, dVar, dVar2)) {
                RecyclerView.this.x1();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d0 {
        static final int A = 256;
        static final int B = 512;
        static final int C = 1024;
        static final int D = 2048;
        static final int E = 4096;
        static final int F = -1;
        static final int G = 8192;
        private static final List<Object> H = Collections.emptyList();

        /* renamed from: t, reason: collision with root package name */
        static final int f8996t = 1;

        /* renamed from: u, reason: collision with root package name */
        static final int f8997u = 2;

        /* renamed from: v, reason: collision with root package name */
        static final int f8998v = 4;

        /* renamed from: w, reason: collision with root package name */
        static final int f8999w = 8;

        /* renamed from: x, reason: collision with root package name */
        static final int f9000x = 16;

        /* renamed from: y, reason: collision with root package name */
        static final int f9001y = 32;

        /* renamed from: z, reason: collision with root package name */
        static final int f9002z = 128;

        /* renamed from: a, reason: collision with root package name */
        @o0
        public final View f9003a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference<RecyclerView> f9004b;

        /* renamed from: j, reason: collision with root package name */
        int f9012j;

        /* renamed from: r, reason: collision with root package name */
        RecyclerView f9020r;

        /* renamed from: s, reason: collision with root package name */
        h<? extends d0> f9021s;

        /* renamed from: c, reason: collision with root package name */
        int f9005c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f9006d = -1;

        /* renamed from: e, reason: collision with root package name */
        long f9007e = -1;

        /* renamed from: f, reason: collision with root package name */
        int f9008f = -1;

        /* renamed from: g, reason: collision with root package name */
        int f9009g = -1;

        /* renamed from: h, reason: collision with root package name */
        d0 f9010h = null;

        /* renamed from: i, reason: collision with root package name */
        d0 f9011i = null;

        /* renamed from: k, reason: collision with root package name */
        List<Object> f9013k = null;

        /* renamed from: l, reason: collision with root package name */
        List<Object> f9014l = null;

        /* renamed from: m, reason: collision with root package name */
        private int f9015m = 0;

        /* renamed from: n, reason: collision with root package name */
        v f9016n = null;

        /* renamed from: o, reason: collision with root package name */
        boolean f9017o = false;

        /* renamed from: p, reason: collision with root package name */
        private int f9018p = 0;

        /* renamed from: q, reason: collision with root package name */
        @m1
        int f9019q = -1;

        public d0(@o0 View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f9003a = view;
        }

        private void g() {
            if (this.f9013k == null) {
                ArrayList arrayList = new ArrayList();
                this.f9013k = arrayList;
                this.f9014l = Collections.unmodifiableList(arrayList);
            }
        }

        boolean A() {
            return this.f9016n != null;
        }

        boolean B() {
            return (this.f9012j & 256) != 0;
        }

        boolean C() {
            return (this.f9012j & 2) != 0;
        }

        boolean D() {
            return (this.f9012j & 2) != 0;
        }

        void E(int i5, boolean z5) {
            if (this.f9006d == -1) {
                this.f9006d = this.f9005c;
            }
            if (this.f9009g == -1) {
                this.f9009g = this.f9005c;
            }
            if (z5) {
                this.f9009g += i5;
            }
            this.f9005c += i5;
            if (this.f9003a.getLayoutParams() != null) {
                ((LayoutParams) this.f9003a.getLayoutParams()).f8963c = true;
            }
        }

        void F(RecyclerView recyclerView) {
            int i5 = this.f9019q;
            if (i5 != -1) {
                this.f9018p = i5;
            } else {
                this.f9018p = y1.V(this.f9003a);
            }
            recyclerView.a2(this, 4);
        }

        void G(RecyclerView recyclerView) {
            recyclerView.a2(this, this.f9018p);
            this.f9018p = 0;
        }

        void H() {
            this.f9012j = 0;
            this.f9005c = -1;
            this.f9006d = -1;
            this.f9007e = -1L;
            this.f9009g = -1;
            this.f9015m = 0;
            this.f9010h = null;
            this.f9011i = null;
            d();
            this.f9018p = 0;
            this.f9019q = -1;
            RecyclerView.B(this);
        }

        void I() {
            if (this.f9006d == -1) {
                this.f9006d = this.f9005c;
            }
        }

        void J(int i5, int i6) {
            this.f9012j = (i5 & i6) | (this.f9012j & (~i6));
        }

        public final void K(boolean z5) {
            int i5 = this.f9015m;
            int i6 = z5 ? i5 - 1 : i5 + 1;
            this.f9015m = i6;
            if (i6 < 0) {
                this.f9015m = 0;
                toString();
            } else if (!z5 && i6 == 1) {
                this.f9012j |= 16;
            } else if (z5 && i6 == 0) {
                this.f9012j &= -17;
            }
        }

        void L(v vVar, boolean z5) {
            this.f9016n = vVar;
            this.f9017o = z5;
        }

        boolean M() {
            return (this.f9012j & 16) != 0;
        }

        boolean N() {
            return (this.f9012j & 128) != 0;
        }

        void O() {
            this.f9012j &= -129;
        }

        void P() {
            this.f9016n.K(this);
        }

        boolean Q() {
            return (this.f9012j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f9012j) == 0) {
                g();
                this.f9013k.add(obj);
            }
        }

        void b(int i5) {
            this.f9012j = i5 | this.f9012j;
        }

        void c() {
            this.f9006d = -1;
            this.f9009g = -1;
        }

        void d() {
            List<Object> list = this.f9013k;
            if (list != null) {
                list.clear();
            }
            this.f9012j &= -1025;
        }

        void e() {
            this.f9012j &= -33;
        }

        void f() {
            this.f9012j &= -257;
        }

        boolean h() {
            return (this.f9012j & 16) == 0 && y1.M0(this.f9003a);
        }

        void i(int i5, int i6, boolean z5) {
            b(8);
            E(i6, z5);
            this.f9005c = i5;
        }

        public final int j() {
            RecyclerView recyclerView = this.f9020r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.p0(this);
        }

        @Deprecated
        public final int k() {
            return m();
        }

        @q0
        public final h<? extends d0> l() {
            return this.f9021s;
        }

        public final int m() {
            RecyclerView recyclerView;
            h o02;
            int p02;
            if (this.f9021s == null || (recyclerView = this.f9020r) == null || (o02 = recyclerView.o0()) == null || (p02 = this.f9020r.p0(this)) == -1) {
                return -1;
            }
            return o02.f(this.f9021s, this, p02);
        }

        public final long n() {
            return this.f9007e;
        }

        public final int o() {
            return this.f9008f;
        }

        public final int p() {
            int i5 = this.f9009g;
            return i5 == -1 ? this.f9005c : i5;
        }

        public final int q() {
            return this.f9006d;
        }

        @Deprecated
        public final int r() {
            int i5 = this.f9009g;
            return i5 == -1 ? this.f9005c : i5;
        }

        List<Object> s() {
            if ((this.f9012j & 1024) != 0) {
                return H;
            }
            List<Object> list = this.f9013k;
            return (list == null || list.size() == 0) ? H : this.f9014l;
        }

        boolean t(int i5) {
            return (i5 & this.f9012j) != 0;
        }

        public String toString() {
            StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            a6.append(Integer.toHexString(hashCode()));
            a6.append(" position=");
            a6.append(this.f9005c);
            a6.append(" id=");
            a6.append(this.f9007e);
            a6.append(", oldPos=");
            a6.append(this.f9006d);
            a6.append(", pLpos:");
            a6.append(this.f9009g);
            StringBuilder sb = new StringBuilder(a6.toString());
            if (A()) {
                sb.append(" scrap ");
                sb.append(this.f9017o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (x()) {
                sb.append(" invalid");
            }
            if (!w()) {
                sb.append(" unbound");
            }
            if (D()) {
                sb.append(" update");
            }
            if (z()) {
                sb.append(" removed");
            }
            if (N()) {
                sb.append(" ignored");
            }
            if (B()) {
                sb.append(" tmpDetached");
            }
            if (!y()) {
                sb.append(" not recyclable(" + this.f9015m + ")");
            }
            if (u()) {
                sb.append(" undefined adapter position");
            }
            if (this.f9003a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        boolean u() {
            return (this.f9012j & 512) != 0 || x();
        }

        boolean v() {
            return (this.f9003a.getParent() == null || this.f9003a.getParent() == this.f9020r) ? false : true;
        }

        boolean w() {
            return (this.f9012j & 1) != 0;
        }

        boolean x() {
            return (this.f9012j & 4) != 0;
        }

        public final boolean y() {
            return (this.f9012j & 16) == 0 && !y1.M0(this.f9003a);
        }

        boolean z() {
            return (this.f9012j & 8) != 0;
        }
    }

    class e implements g.b {
        e() {
        }

        @Override // androidx.recyclerview.widget.g.b
        public View a(int i5) {
            return RecyclerView.this.getChildAt(i5);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void b(View view) {
            d0 w02 = RecyclerView.w0(view);
            if (w02 != null) {
                w02.F(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.g.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.g.b
        public void d() {
            int c6 = c();
            for (int i5 = 0; i5 < c6; i5++) {
                View a6 = a(i5);
                RecyclerView.this.L(a6);
                a6.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.g.b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public d0 f(View view) {
            return RecyclerView.w0(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void g(int i5) {
            d0 w02;
            View a6 = a(i5);
            if (a6 != null && (w02 = RecyclerView.w0(a6)) != null) {
                if (w02.B() && !w02.N()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + w02 + RecyclerView.this.Z());
                }
                w02.b(256);
            }
            RecyclerView.this.detachViewFromParent(i5);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void h(View view) {
            d0 w02 = RecyclerView.w0(view);
            if (w02 != null) {
                w02.G(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.g.b
        public void i(View view, int i5) {
            RecyclerView.this.addView(view, i5);
            RecyclerView.this.K(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void j(int i5) {
            View childAt = RecyclerView.this.getChildAt(i5);
            if (childAt != null) {
                RecyclerView.this.L(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i5);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void k(View view, int i5, ViewGroup.LayoutParams layoutParams) {
            d0 w02 = RecyclerView.w0(view);
            if (w02 != null) {
                if (!w02.B() && !w02.N()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + w02 + RecyclerView.this.Z());
                }
                w02.f();
            }
            RecyclerView.this.attachViewToParent(view, i5, layoutParams);
        }
    }

    class f implements a.InterfaceC0109a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0109a
        public void a(int i5, int i6) {
            RecyclerView.this.n1(i5, i6);
            RecyclerView.this.f8936z0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0109a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0109a
        public void c(int i5, int i6, Object obj) {
            RecyclerView.this.A2(i5, i6, obj);
            RecyclerView.this.A0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0109a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0109a
        public d0 e(int i5) {
            d0 m02 = RecyclerView.this.m0(i5, true);
            if (m02 == null || RecyclerView.this.f8921s.n(m02.f9003a)) {
                return null;
            }
            return m02;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0109a
        public void f(int i5, int i6) {
            RecyclerView.this.o1(i5, i6, false);
            RecyclerView.this.f8936z0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0109a
        public void g(int i5, int i6) {
            RecyclerView.this.m1(i5, i6);
            RecyclerView.this.f8936z0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0109a
        public void h(int i5, int i6) {
            RecyclerView.this.o1(i5, i6, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f8936z0 = true;
            recyclerView.f8930w0.f8973d += i6;
        }

        void i(a.b bVar) {
            int i5 = bVar.f9143a;
            if (i5 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.A.i1(recyclerView, bVar.f9144b, bVar.f9146d);
                return;
            }
            if (i5 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.A.l1(recyclerView2, bVar.f9144b, bVar.f9146d);
            } else if (i5 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.A.n1(recyclerView3, bVar.f9144b, bVar.f9146d, bVar.f9145c);
            } else {
                if (i5 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.A.k1(recyclerView4, bVar.f9144b, bVar.f9146d, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9024a;

        static {
            int[] iArr = new int[h.a.values().length];
            f9024a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9024a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h<VH extends d0> {

        /* renamed from: a, reason: collision with root package name */
        private final i f9025a = new i();

        /* renamed from: b, reason: collision with root package name */
        private boolean f9026b = false;

        /* renamed from: c, reason: collision with root package name */
        private a f9027c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public void A(@o0 RecyclerView recyclerView) {
        }

        public boolean B(@o0 VH vh) {
            return false;
        }

        public void C(@o0 VH vh) {
        }

        public void D(@o0 VH vh) {
        }

        public void E(@o0 VH vh) {
        }

        public void F(@o0 j jVar) {
            this.f9025a.registerObserver(jVar);
        }

        public void G(boolean z5) {
            if (k()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f9026b = z5;
        }

        public void H(@o0 a aVar) {
            this.f9027c = aVar;
            this.f9025a.h();
        }

        public void I(@o0 j jVar) {
            this.f9025a.unregisterObserver(jVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(@o0 VH vh, int i5) {
            boolean z5 = vh.f9021s == null;
            if (z5) {
                vh.f9005c = i5;
                if (l()) {
                    vh.f9007e = h(i5);
                }
                vh.J(1, 519);
                androidx.core.os.v.b("RV OnBindView");
            }
            vh.f9021s = this;
            y(vh, i5, vh.s());
            if (z5) {
                vh.d();
                ViewGroup.LayoutParams layoutParams = vh.f9003a.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f8963c = true;
                }
                androidx.core.os.v.d();
            }
        }

        boolean d() {
            int i5 = g.f9024a[this.f9027c.ordinal()];
            if (i5 != 1) {
                return i5 != 2 || g() > 0;
            }
            return false;
        }

        @o0
        public final VH e(@o0 ViewGroup viewGroup, int i5) {
            try {
                androidx.core.os.v.b("RV CreateView");
                VH z5 = z(viewGroup, i5);
                if (z5.f9003a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                z5.f9008f = i5;
                return z5;
            } finally {
                androidx.core.os.v.d();
            }
        }

        public int f(@o0 h<? extends d0> hVar, @o0 d0 d0Var, int i5) {
            if (hVar == this) {
                return i5;
            }
            return -1;
        }

        public abstract int g();

        public long h(int i5) {
            return -1L;
        }

        public int i(int i5) {
            return 0;
        }

        @o0
        public final a j() {
            return this.f9027c;
        }

        public final boolean k() {
            return this.f9025a.a();
        }

        public final boolean l() {
            return this.f9026b;
        }

        public final void m() {
            this.f9025a.b();
        }

        public final void n(int i5) {
            this.f9025a.d(i5, 1);
        }

        public final void o(int i5, @q0 Object obj) {
            this.f9025a.e(i5, 1, obj);
        }

        public final void p(int i5) {
            this.f9025a.f(i5, 1);
        }

        public final void q(int i5, int i6) {
            this.f9025a.c(i5, i6);
        }

        public final void r(int i5, int i6) {
            this.f9025a.d(i5, i6);
        }

        public final void s(int i5, int i6, @q0 Object obj) {
            this.f9025a.e(i5, i6, obj);
        }

        public final void t(int i5, int i6) {
            this.f9025a.f(i5, i6);
        }

        public final void u(int i5, int i6) {
            this.f9025a.g(i5, i6);
        }

        public final void v(int i5) {
            this.f9025a.g(i5, 1);
        }

        public void w(@o0 RecyclerView recyclerView) {
        }

        public abstract void x(@o0 VH vh, int i5);

        public void y(@o0 VH vh, int i5, @o0 List<Object> list) {
            x(vh, i5);
        }

        @o0
        public abstract VH z(@o0 ViewGroup viewGroup, int i5);
    }

    /* loaded from: classes.dex */
    static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i5, int i6) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i5, i6, 1);
            }
        }

        public void d(int i5, int i6) {
            e(i5, i6, null);
        }

        public void e(int i5, int i6, @q0 Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i5, i6, obj);
            }
        }

        public void f(int i5, int i6) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i5, i6);
            }
        }

        public void g(int i5, int i6) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i5, i6);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public void a() {
        }

        public void b(int i5, int i6) {
        }

        public void c(int i5, int i6, @q0 Object obj) {
            b(i5, i6);
        }

        public void d(int i5, int i6) {
        }

        public void e(int i5, int i6, int i7) {
        }

        public void f(int i5, int i6) {
        }

        public void g() {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        int a(int i5, int i6);
    }

    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public static final int f9028a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f9029b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f9030c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f9031d = 3;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @o0
        protected EdgeEffect a(@o0 RecyclerView recyclerView, int i5) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {

        /* renamed from: g, reason: collision with root package name */
        public static final int f9032g = 2;

        /* renamed from: h, reason: collision with root package name */
        public static final int f9033h = 8;

        /* renamed from: i, reason: collision with root package name */
        public static final int f9034i = 4;

        /* renamed from: j, reason: collision with root package name */
        public static final int f9035j = 2048;

        /* renamed from: k, reason: collision with root package name */
        public static final int f9036k = 4096;

        /* renamed from: a, reason: collision with root package name */
        private c f9037a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<b> f9038b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        private long f9039c = 120;

        /* renamed from: d, reason: collision with root package name */
        private long f9040d = 120;

        /* renamed from: e, reason: collision with root package name */
        private long f9041e = 250;

        /* renamed from: f, reason: collision with root package name */
        private long f9042f = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public interface b {
            void a();
        }

        interface c {
            void a(@o0 d0 d0Var);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f9043a;

            /* renamed from: b, reason: collision with root package name */
            public int f9044b;

            /* renamed from: c, reason: collision with root package name */
            public int f9045c;

            /* renamed from: d, reason: collision with root package name */
            public int f9046d;

            /* renamed from: e, reason: collision with root package name */
            public int f9047e;

            @o0
            public d a(@o0 d0 d0Var) {
                return b(d0Var, 0);
            }

            @o0
            public d b(@o0 d0 d0Var, int i5) {
                View view = d0Var.f9003a;
                this.f9043a = view.getLeft();
                this.f9044b = view.getTop();
                this.f9045c = view.getRight();
                this.f9046d = view.getBottom();
                return this;
            }
        }

        static int e(d0 d0Var) {
            int i5 = d0Var.f9012j & 14;
            if (d0Var.x()) {
                return 4;
            }
            if ((i5 & 4) != 0) {
                return i5;
            }
            int q5 = d0Var.q();
            int j5 = d0Var.j();
            return (q5 == -1 || j5 == -1 || q5 == j5) ? i5 : i5 | 2048;
        }

        void A(c cVar) {
            this.f9037a = cVar;
        }

        public void B(long j5) {
            this.f9041e = j5;
        }

        public void C(long j5) {
            this.f9040d = j5;
        }

        public abstract boolean a(@o0 d0 d0Var, @q0 d dVar, @o0 d dVar2);

        public abstract boolean b(@o0 d0 d0Var, @o0 d0 d0Var2, @o0 d dVar, @o0 d dVar2);

        public abstract boolean c(@o0 d0 d0Var, @o0 d dVar, @q0 d dVar2);

        public abstract boolean d(@o0 d0 d0Var, @o0 d dVar, @o0 d dVar2);

        public boolean f(@o0 d0 d0Var) {
            return true;
        }

        public boolean g(@o0 d0 d0Var, @o0 List<Object> list) {
            return f(d0Var);
        }

        public final void h(@o0 d0 d0Var) {
            t(d0Var);
            c cVar = this.f9037a;
            if (cVar != null) {
                cVar.a(d0Var);
            }
        }

        public final void i(@o0 d0 d0Var) {
            u(d0Var);
        }

        public final void j() {
            int size = this.f9038b.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f9038b.get(i5).a();
            }
            this.f9038b.clear();
        }

        public abstract void k(@o0 d0 d0Var);

        public abstract void l();

        public long m() {
            return this.f9039c;
        }

        public long n() {
            return this.f9042f;
        }

        public long o() {
            return this.f9041e;
        }

        public long p() {
            return this.f9040d;
        }

        public abstract boolean q();

        public final boolean r(@q0 b bVar) {
            boolean q5 = q();
            if (bVar != null) {
                if (q5) {
                    this.f9038b.add(bVar);
                } else {
                    bVar.a();
                }
            }
            return q5;
        }

        @o0
        public d s() {
            return new d();
        }

        public void t(@o0 d0 d0Var) {
        }

        public void u(@o0 d0 d0Var) {
        }

        @o0
        public d v(@o0 a0 a0Var, @o0 d0 d0Var) {
            return s().a(d0Var);
        }

        @o0
        public d w(@o0 a0 a0Var, @o0 d0 d0Var, int i5, @o0 List<Object> list) {
            return s().a(d0Var);
        }

        public abstract void x();

        public void y(long j5) {
            this.f9039c = j5;
        }

        public void z(long j5) {
            this.f9042f = j5;
        }
    }

    private class n implements m.c {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.c
        public void a(d0 d0Var) {
            d0Var.K(true);
            if (d0Var.f9010h != null && d0Var.f9011i == null) {
                d0Var.f9010h = null;
            }
            d0Var.f9011i = null;
            if (d0Var.M() || RecyclerView.this.G1(d0Var.f9003a) || !d0Var.B()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d0Var.f9003a, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        @Deprecated
        public void f(@o0 Rect rect, int i5, @o0 RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(@o0 Rect rect, @o0 View view, @o0 RecyclerView recyclerView, @o0 a0 a0Var) {
            f(rect, ((LayoutParams) view.getLayoutParams()).d(), recyclerView);
        }

        @Deprecated
        public void h(@o0 Canvas canvas, @o0 RecyclerView recyclerView) {
        }

        public void i(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 a0 a0Var) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void j(@o0 Canvas canvas, @o0 RecyclerView recyclerView) {
        }

        public void k(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 a0 a0Var) {
            j(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public interface p {
        void b(@o0 View view);

        void d(@o0 View view);
    }

    /* loaded from: classes.dex */
    public static abstract class q {
        public abstract boolean a(int i5, int i6);
    }

    /* loaded from: classes.dex */
    public interface r {
        void a(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent);

        boolean c(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent);

        void e(boolean z5);
    }

    /* loaded from: classes.dex */
    public static abstract class s {
        public void a(@o0 RecyclerView recyclerView, int i5) {
        }

        public void b(@o0 RecyclerView recyclerView, int i5, int i6) {
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface t {
    }

    /* loaded from: classes.dex */
    public static class u {

        /* renamed from: c, reason: collision with root package name */
        private static final int f9049c = 5;

        /* renamed from: a, reason: collision with root package name */
        SparseArray<a> f9050a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        private int f9051b = 0;

        static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList<d0> f9052a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            int f9053b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f9054c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f9055d = 0;

            a() {
            }
        }

        private a h(int i5) {
            a aVar = this.f9050a.get(i5);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f9050a.put(i5, aVar2);
            return aVar2;
        }

        void a() {
            this.f9051b++;
        }

        public void b() {
            for (int i5 = 0; i5 < this.f9050a.size(); i5++) {
                this.f9050a.valueAt(i5).f9052a.clear();
            }
        }

        void c() {
            this.f9051b--;
        }

        void d(int i5, long j5) {
            a h5 = h(i5);
            h5.f9055d = k(h5.f9055d, j5);
        }

        void e(int i5, long j5) {
            a h5 = h(i5);
            h5.f9054c = k(h5.f9054c, j5);
        }

        @q0
        public d0 f(int i5) {
            a aVar = this.f9050a.get(i5);
            if (aVar == null || aVar.f9052a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.f9052a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).v()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public int g(int i5) {
            return h(i5).f9052a.size();
        }

        void i(h hVar, h hVar2, boolean z5) {
            if (hVar != null) {
                c();
            }
            if (!z5 && this.f9051b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void j(d0 d0Var) {
            int o5 = d0Var.o();
            ArrayList<d0> arrayList = h(o5).f9052a;
            if (this.f9050a.get(o5).f9053b <= arrayList.size()) {
                return;
            }
            d0Var.H();
            arrayList.add(d0Var);
        }

        long k(long j5, long j6) {
            if (j5 == 0) {
                return j6;
            }
            return (j6 / 4) + ((j5 / 4) * 3);
        }

        public void l(int i5, int i6) {
            a h5 = h(i5);
            h5.f9053b = i6;
            ArrayList<d0> arrayList = h5.f9052a;
            while (arrayList.size() > i6) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        int m() {
            int i5 = 0;
            for (int i6 = 0; i6 < this.f9050a.size(); i6++) {
                ArrayList<d0> arrayList = this.f9050a.valueAt(i6).f9052a;
                if (arrayList != null) {
                    i5 = arrayList.size() + i5;
                }
            }
            return i5;
        }

        boolean n(int i5, long j5, long j6) {
            long j7 = h(i5).f9055d;
            return j7 == 0 || j5 + j7 < j6;
        }

        boolean o(int i5, long j5, long j6) {
            long j7 = h(i5).f9054c;
            return j7 == 0 || j5 + j7 < j6;
        }
    }

    /* loaded from: classes.dex */
    public final class v {

        /* renamed from: j, reason: collision with root package name */
        static final int f9056j = 2;

        /* renamed from: a, reason: collision with root package name */
        final ArrayList<d0> f9057a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<d0> f9058b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<d0> f9059c;

        /* renamed from: d, reason: collision with root package name */
        private final List<d0> f9060d;

        /* renamed from: e, reason: collision with root package name */
        private int f9061e;

        /* renamed from: f, reason: collision with root package name */
        int f9062f;

        /* renamed from: g, reason: collision with root package name */
        u f9063g;

        /* renamed from: h, reason: collision with root package name */
        private b0 f9064h;

        public v() {
            ArrayList<d0> arrayList = new ArrayList<>();
            this.f9057a = arrayList;
            this.f9058b = null;
            this.f9059c = new ArrayList<>();
            this.f9060d = Collections.unmodifiableList(arrayList);
            this.f9061e = 2;
            this.f9062f = 2;
        }

        private boolean I(@o0 d0 d0Var, int i5, int i6, long j5) {
            d0Var.f9021s = null;
            d0Var.f9020r = RecyclerView.this;
            int o5 = d0Var.o();
            long K0 = RecyclerView.this.K0();
            if (j5 != Long.MAX_VALUE && !this.f9063g.n(o5, K0, j5)) {
                return false;
            }
            RecyclerView.this.f8935z.c(d0Var, i5);
            this.f9063g.d(d0Var.o(), RecyclerView.this.K0() - K0);
            b(d0Var);
            if (!RecyclerView.this.f8930w0.j()) {
                return true;
            }
            d0Var.f9009g = i6;
            return true;
        }

        private void b(d0 d0Var) {
            if (RecyclerView.this.a1()) {
                View view = d0Var.f9003a;
                if (y1.V(view) == 0) {
                    y1.R1(view, 1);
                }
                androidx.recyclerview.widget.b0 b0Var = RecyclerView.this.D0;
                if (b0Var == null) {
                    return;
                }
                androidx.core.view.a n5 = b0Var.n();
                if (n5 instanceof b0.a) {
                    ((b0.a) n5).o(view);
                }
                y1.B1(view, n5);
            }
        }

        private void r(ViewGroup viewGroup, boolean z5) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    r((ViewGroup) childAt, true);
                }
            }
            if (z5) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void s(d0 d0Var) {
            View view = d0Var.f9003a;
            if (view instanceof ViewGroup) {
                r((ViewGroup) view, false);
            }
        }

        void A() {
            for (int size = this.f9059c.size() - 1; size >= 0; size--) {
                B(size);
            }
            this.f9059c.clear();
            if (RecyclerView.X0) {
                RecyclerView.this.f8928v0.b();
            }
        }

        void B(int i5) {
            a(this.f9059c.get(i5), true);
            this.f9059c.remove(i5);
        }

        public void C(@o0 View view) {
            d0 w02 = RecyclerView.w0(view);
            if (w02.B()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (w02.A()) {
                w02.P();
            } else if (w02.Q()) {
                w02.e();
            }
            D(w02);
            if (RecyclerView.this.f8903e0 == null || w02.y()) {
                return;
            }
            RecyclerView.this.f8903e0.k(w02);
        }

        void D(d0 d0Var) {
            boolean z5;
            boolean z6 = true;
            if (d0Var.A() || d0Var.f9003a.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.A());
                sb.append(" isAttached:");
                sb.append(d0Var.f9003a.getParent() != null);
                sb.append(RecyclerView.this.Z());
                throw new IllegalArgumentException(sb.toString());
            }
            if (d0Var.B()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.Z());
            }
            if (d0Var.N()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.Z());
            }
            boolean h5 = d0Var.h();
            h hVar = RecyclerView.this.f8935z;
            if ((hVar != null && h5 && hVar.B(d0Var)) || d0Var.y()) {
                if (this.f9062f <= 0 || d0Var.t(526)) {
                    z5 = false;
                } else {
                    int size = this.f9059c.size();
                    if (size >= this.f9062f && size > 0) {
                        B(0);
                        size--;
                    }
                    if (RecyclerView.X0 && size > 0 && !RecyclerView.this.f8928v0.d(d0Var.f9005c)) {
                        int i5 = size - 1;
                        while (i5 >= 0) {
                            if (!RecyclerView.this.f8928v0.d(this.f9059c.get(i5).f9005c)) {
                                break;
                            } else {
                                i5--;
                            }
                        }
                        size = i5 + 1;
                    }
                    this.f9059c.add(size, d0Var);
                    z5 = true;
                }
                if (z5) {
                    z6 = false;
                } else {
                    a(d0Var, true);
                }
                r1 = z5;
            } else {
                z6 = false;
            }
            RecyclerView.this.f8923t.q(d0Var);
            if (r1 || z6 || !h5) {
                return;
            }
            d0Var.f9021s = null;
            d0Var.f9020r = null;
        }

        void E(View view) {
            d0 w02 = RecyclerView.w0(view);
            if (!w02.t(12) && w02.C() && !RecyclerView.this.z(w02)) {
                if (this.f9058b == null) {
                    this.f9058b = new ArrayList<>();
                }
                w02.L(this, true);
                this.f9058b.add(w02);
                return;
            }
            if (!w02.x() || w02.z() || RecyclerView.this.f8935z.l()) {
                w02.L(this, false);
                this.f9057a.add(w02);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.Z());
            }
        }

        void F(u uVar) {
            u uVar2 = this.f9063g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f9063g = uVar;
            if (uVar == null || RecyclerView.this.o0() == null) {
                return;
            }
            this.f9063g.a();
        }

        void G(b0 b0Var) {
            this.f9064h = b0Var;
        }

        public void H(int i5) {
            this.f9061e = i5;
            L();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01f5  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x021f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01cb  */
        @androidx.annotation.q0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        androidx.recyclerview.widget.RecyclerView.d0 J(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 603
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.J(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        void K(d0 d0Var) {
            if (d0Var.f9017o) {
                this.f9058b.remove(d0Var);
            } else {
                this.f9057a.remove(d0Var);
            }
            d0Var.f9016n = null;
            d0Var.f9017o = false;
            d0Var.e();
        }

        void L() {
            LayoutManager layoutManager = RecyclerView.this.A;
            this.f9062f = this.f9061e + (layoutManager != null ? layoutManager.f8949m : 0);
            for (int size = this.f9059c.size() - 1; size >= 0 && this.f9059c.size() > this.f9062f; size--) {
                B(size);
            }
        }

        boolean M(d0 d0Var) {
            if (d0Var.z()) {
                return RecyclerView.this.f8930w0.j();
            }
            int i5 = d0Var.f9005c;
            if (i5 < 0 || i5 >= RecyclerView.this.f8935z.g()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.Z());
            }
            if (RecyclerView.this.f8930w0.j() || RecyclerView.this.f8935z.i(d0Var.f9005c) == d0Var.o()) {
                return !RecyclerView.this.f8935z.l() || d0Var.n() == RecyclerView.this.f8935z.h(d0Var.f9005c);
            }
            return false;
        }

        void N(int i5, int i6) {
            int i7;
            int i8 = i6 + i5;
            for (int size = this.f9059c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f9059c.get(size);
                if (d0Var != null && (i7 = d0Var.f9005c) >= i5 && i7 < i8) {
                    d0Var.b(2);
                    B(size);
                }
            }
        }

        void a(@o0 d0 d0Var, boolean z5) {
            RecyclerView.B(d0Var);
            View view = d0Var.f9003a;
            androidx.recyclerview.widget.b0 b0Var = RecyclerView.this.D0;
            if (b0Var != null) {
                androidx.core.view.a n5 = b0Var.n();
                y1.B1(view, n5 instanceof b0.a ? ((b0.a) n5).n(view) : null);
            }
            if (z5) {
                h(d0Var);
            }
            d0Var.f9021s = null;
            d0Var.f9020r = null;
            j().j(d0Var);
        }

        public void c(@o0 View view, int i5) {
            LayoutParams layoutParams;
            d0 w02 = RecyclerView.w0(view);
            if (w02 == null) {
                throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.Z());
            }
            int o5 = RecyclerView.this.f8919r.o(i5, 0);
            if (o5 < 0 || o5 >= RecyclerView.this.f8935z.g()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i5 + "(offset:" + o5 + ").state:" + RecyclerView.this.f8930w0.d() + RecyclerView.this.Z());
            }
            I(w02, o5, i5, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams2 = w02.f9003a.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                w02.f9003a.setLayoutParams(layoutParams);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams2)) {
                layoutParams = (LayoutParams) layoutParams2;
            } else {
                layoutParams = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams2);
                w02.f9003a.setLayoutParams(layoutParams);
            }
            layoutParams.f8963c = true;
            layoutParams.f8961a = w02;
            layoutParams.f8964d = w02.f9003a.getParent() == null;
        }

        public void d() {
            this.f9057a.clear();
            A();
        }

        void e() {
            int size = this.f9059c.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f9059c.get(i5).c();
            }
            int size2 = this.f9057a.size();
            for (int i6 = 0; i6 < size2; i6++) {
                this.f9057a.get(i6).c();
            }
            ArrayList<d0> arrayList = this.f9058b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    this.f9058b.get(i7).c();
                }
            }
        }

        void f() {
            this.f9057a.clear();
            ArrayList<d0> arrayList = this.f9058b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int g(int i5) {
            if (i5 >= 0 && i5 < RecyclerView.this.f8930w0.d()) {
                return !RecyclerView.this.f8930w0.j() ? i5 : RecyclerView.this.f8919r.o(i5, 0);
            }
            StringBuilder a6 = androidx.core.app.x.a("invalid position ", i5, ". State item count is ");
            a6.append(RecyclerView.this.f8930w0.d());
            a6.append(RecyclerView.this.Z());
            throw new IndexOutOfBoundsException(a6.toString());
        }

        void h(@o0 d0 d0Var) {
            w wVar = RecyclerView.this.B;
            if (wVar != null) {
                wVar.a(d0Var);
            }
            int size = RecyclerView.this.C.size();
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.this.C.get(i5).a(d0Var);
            }
            h hVar = RecyclerView.this.f8935z;
            if (hVar != null) {
                hVar.E(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f8930w0 != null) {
                recyclerView.f8923t.q(d0Var);
            }
        }

        d0 i(int i5) {
            int size;
            int o5;
            ArrayList<d0> arrayList = this.f9058b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i6 = 0; i6 < size; i6++) {
                    d0 d0Var = this.f9058b.get(i6);
                    if (!d0Var.Q() && d0Var.p() == i5) {
                        d0Var.b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.f8935z.l() && (o5 = RecyclerView.this.f8919r.o(i5, 0)) > 0 && o5 < RecyclerView.this.f8935z.g()) {
                    long h5 = RecyclerView.this.f8935z.h(o5);
                    for (int i7 = 0; i7 < size; i7++) {
                        d0 d0Var2 = this.f9058b.get(i7);
                        if (!d0Var2.Q() && d0Var2.n() == h5) {
                            d0Var2.b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        u j() {
            if (this.f9063g == null) {
                this.f9063g = new u();
            }
            return this.f9063g;
        }

        int k() {
            return this.f9057a.size();
        }

        @o0
        public List<d0> l() {
            return this.f9060d;
        }

        d0 m(long j5, int i5, boolean z5) {
            for (int size = this.f9057a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f9057a.get(size);
                if (d0Var.n() == j5 && !d0Var.Q()) {
                    if (i5 == d0Var.o()) {
                        d0Var.b(32);
                        if (d0Var.z() && !RecyclerView.this.f8930w0.j()) {
                            d0Var.J(2, 14);
                        }
                        return d0Var;
                    }
                    if (!z5) {
                        this.f9057a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f9003a, false);
                        z(d0Var.f9003a);
                    }
                }
            }
            int size2 = this.f9059c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = this.f9059c.get(size2);
                if (d0Var2.n() == j5 && !d0Var2.v()) {
                    if (i5 == d0Var2.o()) {
                        if (!z5) {
                            this.f9059c.remove(size2);
                        }
                        return d0Var2;
                    }
                    if (!z5) {
                        B(size2);
                        return null;
                    }
                }
            }
        }

        d0 n(int i5, boolean z5) {
            View e6;
            int size = this.f9057a.size();
            for (int i6 = 0; i6 < size; i6++) {
                d0 d0Var = this.f9057a.get(i6);
                if (!d0Var.Q() && d0Var.p() == i5 && !d0Var.x() && (RecyclerView.this.f8930w0.f8977h || !d0Var.z())) {
                    d0Var.b(32);
                    return d0Var;
                }
            }
            if (z5 || (e6 = RecyclerView.this.f8921s.e(i5)) == null) {
                int size2 = this.f9059c.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    d0 d0Var2 = this.f9059c.get(i7);
                    if (!d0Var2.x() && d0Var2.p() == i5 && !d0Var2.v()) {
                        if (!z5) {
                            this.f9059c.remove(i7);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 w02 = RecyclerView.w0(e6);
            RecyclerView.this.f8921s.s(e6);
            int m5 = RecyclerView.this.f8921s.m(e6);
            if (m5 != -1) {
                RecyclerView.this.f8921s.d(m5);
                E(e6);
                w02.b(8224);
                return w02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + w02 + RecyclerView.this.Z());
        }

        View o(int i5) {
            return this.f9057a.get(i5).f9003a;
        }

        @o0
        public View p(int i5) {
            return q(i5, false);
        }

        View q(int i5, boolean z5) {
            return J(i5, z5, Long.MAX_VALUE).f9003a;
        }

        void t() {
            int size = this.f9059c.size();
            for (int i5 = 0; i5 < size; i5++) {
                LayoutParams layoutParams = (LayoutParams) this.f9059c.get(i5).f9003a.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f8963c = true;
                }
            }
        }

        void u() {
            int size = this.f9059c.size();
            for (int i5 = 0; i5 < size; i5++) {
                d0 d0Var = this.f9059c.get(i5);
                if (d0Var != null) {
                    d0Var.b(6);
                    d0Var.a(null);
                }
            }
            h hVar = RecyclerView.this.f8935z;
            if (hVar == null || !hVar.l()) {
                A();
            }
        }

        void v(int i5, int i6) {
            int size = this.f9059c.size();
            for (int i7 = 0; i7 < size; i7++) {
                d0 d0Var = this.f9059c.get(i7);
                if (d0Var != null && d0Var.f9005c >= i5) {
                    d0Var.E(i6, false);
                }
            }
        }

        void w(int i5, int i6) {
            int i7;
            int i8;
            int i9;
            int i10;
            if (i5 < i6) {
                i7 = -1;
                i9 = i5;
                i8 = i6;
            } else {
                i7 = 1;
                i8 = i5;
                i9 = i6;
            }
            int size = this.f9059c.size();
            for (int i11 = 0; i11 < size; i11++) {
                d0 d0Var = this.f9059c.get(i11);
                if (d0Var != null && (i10 = d0Var.f9005c) >= i9 && i10 <= i8) {
                    if (i10 == i5) {
                        d0Var.E(i6 - i5, false);
                    } else {
                        d0Var.E(i7, false);
                    }
                }
            }
        }

        void x(int i5, int i6, boolean z5) {
            int i7 = i5 + i6;
            for (int size = this.f9059c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f9059c.get(size);
                if (d0Var != null) {
                    int i8 = d0Var.f9005c;
                    if (i8 >= i7) {
                        d0Var.E(-i6, z5);
                    } else if (i8 >= i5) {
                        d0Var.b(8);
                        B(size);
                    }
                }
            }
        }

        void y(h hVar, h hVar2, boolean z5) {
            d();
            j().i(hVar, hVar2, z5);
        }

        void z(View view) {
            d0 w02 = RecyclerView.w0(view);
            w02.f9016n = null;
            w02.f9017o = false;
            w02.e();
            D(w02);
        }
    }

    /* loaded from: classes.dex */
    public interface w {
        void a(@o0 d0 d0Var);
    }

    private class x extends j {
        x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.y(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f8930w0.f8976g = true;
            recyclerView.A1(true);
            if (RecyclerView.this.f8919r.q()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i5, int i6, Object obj) {
            RecyclerView.this.y(null);
            if (RecyclerView.this.f8919r.s(i5, i6, obj)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i5, int i6) {
            RecyclerView.this.y(null);
            if (RecyclerView.this.f8919r.t(i5, i6)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i5, int i6, int i7) {
            RecyclerView.this.y(null);
            if (RecyclerView.this.f8919r.u(i5, i6, i7)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i5, int i6) {
            RecyclerView.this.y(null);
            if (RecyclerView.this.f8919r.v(i5, i6)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f8917q == null || (hVar = recyclerView.f8935z) == null || !hVar.d()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        void h() {
            if (RecyclerView.W0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.H && recyclerView.G) {
                    y1.p1(recyclerView, recyclerView.f8927v);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.P = true;
            recyclerView2.requestLayout();
        }
    }

    public static class y implements r {
        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void a(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public boolean c(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void e(boolean z5) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class z {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView f9068b;

        /* renamed from: c, reason: collision with root package name */
        private LayoutManager f9069c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9070d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9071e;

        /* renamed from: f, reason: collision with root package name */
        private View f9072f;

        /* renamed from: h, reason: collision with root package name */
        private boolean f9074h;

        /* renamed from: a, reason: collision with root package name */
        private int f9067a = -1;

        /* renamed from: g, reason: collision with root package name */
        private final a f9073g = new a(0, 0);

        public static class a {

            /* renamed from: h, reason: collision with root package name */
            public static final int f9075h = Integer.MIN_VALUE;

            /* renamed from: a, reason: collision with root package name */
            private int f9076a;

            /* renamed from: b, reason: collision with root package name */
            private int f9077b;

            /* renamed from: c, reason: collision with root package name */
            private int f9078c;

            /* renamed from: d, reason: collision with root package name */
            private int f9079d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f9080e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f9081f;

            /* renamed from: g, reason: collision with root package name */
            private int f9082g;

            public a(@u0 int i5, @u0 int i6) {
                this(i5, i6, Integer.MIN_VALUE, null);
            }

            private void m() {
                if (this.f9080e != null && this.f9078c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f9078c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public int a() {
                return this.f9078c;
            }

            @u0
            public int b() {
                return this.f9076a;
            }

            @u0
            public int c() {
                return this.f9077b;
            }

            @q0
            public Interpolator d() {
                return this.f9080e;
            }

            boolean e() {
                return this.f9079d >= 0;
            }

            public void f(int i5) {
                this.f9079d = i5;
            }

            void g(RecyclerView recyclerView) {
                int i5 = this.f9079d;
                if (i5 >= 0) {
                    this.f9079d = -1;
                    recyclerView.f1(i5);
                    this.f9081f = false;
                } else {
                    if (!this.f9081f) {
                        this.f9082g = 0;
                        return;
                    }
                    m();
                    recyclerView.f8924t0.e(this.f9076a, this.f9077b, this.f9078c, this.f9080e);
                    this.f9082g++;
                    this.f9081f = false;
                }
            }

            public void h(int i5) {
                this.f9081f = true;
                this.f9078c = i5;
            }

            public void i(@u0 int i5) {
                this.f9081f = true;
                this.f9076a = i5;
            }

            public void j(@u0 int i5) {
                this.f9081f = true;
                this.f9077b = i5;
            }

            public void k(@q0 Interpolator interpolator) {
                this.f9081f = true;
                this.f9080e = interpolator;
            }

            public void l(@u0 int i5, @u0 int i6, int i7, @q0 Interpolator interpolator) {
                this.f9076a = i5;
                this.f9077b = i6;
                this.f9078c = i7;
                this.f9080e = interpolator;
                this.f9081f = true;
            }

            public a(@u0 int i5, @u0 int i6, int i7) {
                this(i5, i6, i7, null);
            }

            public a(@u0 int i5, @u0 int i6, int i7, @q0 Interpolator interpolator) {
                this.f9079d = -1;
                this.f9081f = false;
                this.f9082g = 0;
                this.f9076a = i5;
                this.f9077b = i6;
                this.f9078c = i7;
                this.f9080e = interpolator;
            }
        }

        public interface b {
            @q0
            PointF a(int i5);
        }

        @q0
        public PointF a(int i5) {
            Object e6 = e();
            if (e6 instanceof b) {
                return ((b) e6).a(i5);
            }
            return null;
        }

        public View b(int i5) {
            return this.f9068b.A.J(i5);
        }

        public int c() {
            return this.f9068b.A.Q();
        }

        public int d(View view) {
            return this.f9068b.t0(view);
        }

        @q0
        public LayoutManager e() {
            return this.f9069c;
        }

        public int f() {
            return this.f9067a;
        }

        @Deprecated
        public void g(int i5) {
            this.f9068b.V1(i5);
        }

        public boolean h() {
            return this.f9070d;
        }

        public boolean i() {
            return this.f9071e;
        }

        protected void j(@o0 PointF pointF) {
            float f6 = pointF.x;
            float f7 = pointF.y;
            float sqrt = (float) Math.sqrt((f7 * f7) + (f6 * f6));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void k(int i5, int i6) {
            PointF a6;
            RecyclerView recyclerView = this.f9068b;
            if (this.f9067a == -1 || recyclerView == null) {
                s();
            }
            if (this.f9070d && this.f9072f == null && this.f9069c != null && (a6 = a(this.f9067a)) != null) {
                float f6 = a6.x;
                if (f6 != 0.0f || a6.y != 0.0f) {
                    recyclerView.U1((int) Math.signum(f6), (int) Math.signum(a6.y), null);
                }
            }
            this.f9070d = false;
            View view = this.f9072f;
            if (view != null) {
                if (d(view) == this.f9067a) {
                    p(this.f9072f, recyclerView.f8930w0, this.f9073g);
                    this.f9073g.g(recyclerView);
                    s();
                } else {
                    this.f9072f = null;
                }
            }
            if (this.f9071e) {
                m(i5, i6, recyclerView.f8930w0, this.f9073g);
                boolean e6 = this.f9073g.e();
                this.f9073g.g(recyclerView);
                if (e6 && this.f9071e) {
                    this.f9070d = true;
                    recyclerView.f8924t0.d();
                }
            }
        }

        protected void l(View view) {
            if (d(view) == f()) {
                this.f9072f = view;
            }
        }

        protected abstract void m(@u0 int i5, @u0 int i6, @o0 a0 a0Var, @o0 a aVar);

        protected abstract void n();

        protected abstract void o();

        protected abstract void p(@o0 View view, @o0 a0 a0Var, @o0 a aVar);

        public void q(int i5) {
            this.f9067a = i5;
        }

        void r(RecyclerView recyclerView, LayoutManager layoutManager) {
            recyclerView.f8924t0.f();
            this.f9068b = recyclerView;
            this.f9069c = layoutManager;
            int i5 = this.f9067a;
            if (i5 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f8930w0.f8970a = i5;
            this.f9071e = true;
            this.f9070d = true;
            this.f9072f = b(f());
            n();
            this.f9068b.f8924t0.d();
            this.f9074h = true;
        }

        protected final void s() {
            if (this.f9071e) {
                this.f9071e = false;
                o();
                this.f9068b.f8930w0.f8970a = -1;
                this.f9072f = null;
                this.f9067a = -1;
                this.f9070d = false;
                this.f9069c.w1(this);
                this.f9069c = null;
                this.f9068b = null;
            }
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        f8892t1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f8898z1 = new c();
    }

    public RecyclerView(@o0 Context context) {
        this(context, null);
    }

    private void A() {
        Q1();
        m2(0);
    }

    private int A0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    static void B(@o0 d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f9004b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == d0Var.f9003a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            d0Var.f9004b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void B1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.W()
            android.widget.EdgeEffect r1 = r6.f8899a0
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.i.g(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.X()
            android.widget.EdgeEffect r1 = r6.f8901c0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.i.g(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.Y()
            android.widget.EdgeEffect r9 = r6.f8900b0
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.i.g(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.V()
            android.widget.EdgeEffect r9 = r6.f8902d0
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.i.g(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.y1.n1(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B1(float, float, float, float):void");
    }

    private String C0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + org.apache.commons.io.k.f32026a + str;
    }

    private void D1() {
        View findViewById;
        if (!this.f8922s0 || this.f8935z == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!Z0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f8921s.n(focusedChild)) {
                    return;
                }
            } else if (this.f8921s.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        d0 j02 = (this.f8930w0.f8983n == -1 || !this.f8935z.l()) ? null : j0(this.f8930w0.f8983n);
        if (j02 != null && !this.f8921s.n(j02.f9003a) && j02.f9003a.hasFocusable()) {
            view = j02.f9003a;
        } else if (this.f8921s.g() > 0) {
            view = h0();
        }
        if (view != null) {
            int i5 = this.f8930w0.f8984o;
            if (i5 != -1 && (findViewById = view.findViewById(i5)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void E1() {
        boolean z5;
        EdgeEffect edgeEffect = this.f8899a0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z5 = this.f8899a0.isFinished();
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = this.f8900b0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z5 |= this.f8900b0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f8901c0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z5 |= this.f8901c0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f8902d0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z5 |= this.f8902d0.isFinished();
        }
        if (z5) {
            y1.n1(this);
        }
    }

    private void H(Context context, String str, AttributeSet attributeSet, int i5, int i6) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String C0 = C0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(C0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(LayoutManager.class);
                try {
                    constructor = asSubclass.getConstructor(f8892t1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i5), Integer.valueOf(i6)};
                } catch (NoSuchMethodException e6) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e7) {
                        e7.initCause(e6);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + C0, e7);
                    }
                }
                constructor.setAccessible(true);
                g2((LayoutManager) constructor.newInstance(objArr));
            } catch (ClassCastException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + C0, e8);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + C0, e9);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + C0, e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + C0, e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + C0, e12);
            }
        }
    }

    private boolean J(int i5, int i6) {
        f0(this.F0);
        int[] iArr = this.F0;
        return (iArr[0] == i5 && iArr[1] == i6) ? false : true;
    }

    private void M() {
        int i5 = this.O;
        this.O = 0;
        if (i5 == 0 || !a1()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        androidx.core.view.accessibility.b.i(obtain, i5);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void O() {
        this.f8930w0.a(1);
        a0(this.f8930w0);
        this.f8930w0.f8979j = false;
        v2();
        this.f8923t.f();
        r1();
        z1();
        R1();
        a0 a0Var = this.f8930w0;
        a0Var.f8978i = a0Var.f8980k && this.A0;
        this.A0 = false;
        this.f8936z0 = false;
        a0Var.f8977h = a0Var.f8981l;
        a0Var.f8975f = this.f8935z.g();
        f0(this.F0);
        if (this.f8930w0.f8980k) {
            int g5 = this.f8921s.g();
            for (int i5 = 0; i5 < g5; i5++) {
                d0 w02 = w0(this.f8921s.f(i5));
                if (!w02.N() && (!w02.x() || this.f8935z.l())) {
                    this.f8923t.e(w02, this.f8903e0.w(this.f8930w0, w02, m.e(w02), w02.s()));
                    if (this.f8930w0.f8978i && w02.C() && !w02.z() && !w02.N() && !w02.x()) {
                        this.f8923t.c(q0(w02), w02);
                    }
                }
            }
        }
        if (this.f8930w0.f8981l) {
            S1();
            a0 a0Var2 = this.f8930w0;
            boolean z5 = a0Var2.f8976g;
            a0Var2.f8976g = false;
            this.A.o1(this.f8915p, a0Var2);
            this.f8930w0.f8976g = z5;
            for (int i6 = 0; i6 < this.f8921s.g(); i6++) {
                d0 w03 = w0(this.f8921s.f(i6));
                if (!w03.N() && !this.f8923t.i(w03)) {
                    int e6 = m.e(w03);
                    boolean t5 = w03.t(8192);
                    if (!t5) {
                        e6 |= 4096;
                    }
                    m.d w5 = this.f8903e0.w(this.f8930w0, w03, e6, w03.s());
                    if (t5) {
                        C1(w03, w5);
                    } else {
                        this.f8923t.a(w03, w5);
                    }
                }
            }
            C();
        } else {
            C();
        }
        s1();
        w2(false);
        this.f8930w0.f8974e = 2;
    }

    private void O1(@o0 View view, @q0 View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f8929w.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f8963c) {
                Rect rect = layoutParams2.f8962b;
                Rect rect2 = this.f8929w;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f8929w);
            offsetRectIntoDescendantCoords(view, this.f8929w);
        }
        this.A.M1(this, view, this.f8929w, !this.J, view2 == null);
    }

    private void P() {
        v2();
        r1();
        this.f8930w0.a(6);
        this.f8919r.k();
        this.f8930w0.f8975f = this.f8935z.g();
        this.f8930w0.f8973d = 0;
        if (this.f8917q != null && this.f8935z.d()) {
            Parcelable parcelable = this.f8917q.f8965q;
            if (parcelable != null) {
                this.A.t1(parcelable);
            }
            this.f8917q = null;
        }
        a0 a0Var = this.f8930w0;
        a0Var.f8977h = false;
        this.A.o1(this.f8915p, a0Var);
        a0 a0Var2 = this.f8930w0;
        a0Var2.f8976g = false;
        a0Var2.f8980k = a0Var2.f8980k && this.f8903e0 != null;
        a0Var2.f8974e = 4;
        s1();
        w2(false);
    }

    private j1 P0() {
        if (this.G0 == null) {
            this.G0 = new j1(this);
        }
        return this.G0;
    }

    private void P1() {
        a0 a0Var = this.f8930w0;
        a0Var.f8983n = -1L;
        a0Var.f8982m = -1;
        a0Var.f8984o = -1;
    }

    private void Q() {
        this.f8930w0.a(4);
        v2();
        r1();
        a0 a0Var = this.f8930w0;
        a0Var.f8974e = 1;
        if (a0Var.f8980k) {
            for (int g5 = this.f8921s.g() - 1; g5 >= 0; g5--) {
                d0 w02 = w0(this.f8921s.f(g5));
                if (!w02.N()) {
                    long q02 = q0(w02);
                    m.d v5 = this.f8903e0.v(this.f8930w0, w02);
                    d0 g6 = this.f8923t.g(q02);
                    if (g6 == null || g6.N()) {
                        this.f8923t.d(w02, v5);
                    } else {
                        boolean h5 = this.f8923t.h(g6);
                        boolean h6 = this.f8923t.h(w02);
                        if (h5 && g6 == w02) {
                            this.f8923t.d(w02, v5);
                        } else {
                            m.d n5 = this.f8923t.n(g6);
                            this.f8923t.d(w02, v5);
                            m.d m5 = this.f8923t.m(w02);
                            if (n5 == null) {
                                Q0(q02, w02, g6);
                            } else {
                                v(g6, w02, n5, m5, h5, h6);
                            }
                        }
                    }
                }
            }
            this.f8923t.o(this.P0);
        }
        this.A.E1(this.f8915p);
        a0 a0Var2 = this.f8930w0;
        a0Var2.f8972c = a0Var2.f8975f;
        this.S = false;
        this.T = false;
        a0Var2.f8980k = false;
        a0Var2.f8981l = false;
        this.A.f8944h = false;
        ArrayList<d0> arrayList = this.f8915p.f9058b;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.A;
        if (layoutManager.f8950n) {
            layoutManager.f8949m = 0;
            layoutManager.f8950n = false;
            this.f8915p.L();
        }
        this.A.p1(this.f8930w0);
        s1();
        w2(false);
        this.f8923t.f();
        int[] iArr = this.F0;
        if (J(iArr[0], iArr[1])) {
            S(0, 0);
        }
        D1();
        P1();
    }

    private void Q0(long j5, d0 d0Var, d0 d0Var2) {
        int g5 = this.f8921s.g();
        for (int i5 = 0; i5 < g5; i5++) {
            d0 w02 = w0(this.f8921s.f(i5));
            if (w02 != d0Var && q0(w02) == j5) {
                h hVar = this.f8935z;
                if (hVar == null || !hVar.l()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + w02 + " \n View Holder 2:" + d0Var + Z());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + w02 + " \n View Holder 2:" + d0Var + Z());
            }
        }
        Objects.toString(d0Var2);
        Objects.toString(d0Var);
        Z();
    }

    private void Q1() {
        VelocityTracker velocityTracker = this.f8906h0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        g(0);
        E1();
    }

    private void R1() {
        View focusedChild = (this.f8922s0 && hasFocus() && this.f8935z != null) ? getFocusedChild() : null;
        d0 d02 = focusedChild != null ? d0(focusedChild) : null;
        if (d02 == null) {
            P1();
            return;
        }
        this.f8930w0.f8983n = this.f8935z.l() ? d02.n() : -1L;
        this.f8930w0.f8982m = this.S ? -1 : d02.z() ? d02.f9006d : d02.j();
        this.f8930w0.f8984o = A0(d02.f9003a);
    }

    private boolean T0() {
        int g5 = this.f8921s.g();
        for (int i5 = 0; i5 < g5; i5++) {
            d0 w02 = w0(this.f8921s.f(i5));
            if (w02 != null && !w02.N() && w02.C()) {
                return true;
            }
        }
        return false;
    }

    private boolean U(MotionEvent motionEvent) {
        r rVar = this.F;
        if (rVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return e0(motionEvent);
        }
        rVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.F = null;
        }
        return true;
    }

    @SuppressLint({"InlinedApi"})
    private void V0() {
        if (y1.W(this) == 0) {
            y1.S1(this, 8);
        }
    }

    private void W0() {
        this.f8921s = new androidx.recyclerview.widget.g(new e());
    }

    private void Y1(@q0 h hVar, boolean z5, boolean z6) {
        h hVar2 = this.f8935z;
        if (hVar2 != null) {
            hVar2.I(this.f8913o);
            this.f8935z.A(this);
        }
        if (!z5 || z6) {
            F1();
        }
        this.f8919r.z();
        h hVar3 = this.f8935z;
        this.f8935z = hVar;
        if (hVar != null) {
            hVar.F(this.f8913o);
            hVar.w(this);
        }
        LayoutManager layoutManager = this.A;
        if (layoutManager != null) {
            layoutManager.V0(hVar3, this.f8935z);
        }
        this.f8915p.y(hVar3, this.f8935z, z5);
        this.f8930w0.f8976g = true;
    }

    private boolean e0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.E.size();
        for (int i5 = 0; i5 < size; i5++) {
            r rVar = this.E.get(i5);
            if (rVar.c(this, motionEvent) && action != 3) {
                this.F = rVar;
                return true;
            }
        }
        return false;
    }

    private boolean e1(View view, View view2, int i5) {
        int i6;
        if (view2 == null || view2 == this || view2 == view || c0(view2) == null) {
            return false;
        }
        if (view == null || c0(view) == null) {
            return true;
        }
        this.f8929w.set(0, 0, view.getWidth(), view.getHeight());
        this.f8931x.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f8929w);
        offsetDescendantRectToMyCoords(view2, this.f8931x);
        char c6 = 65535;
        int i7 = this.A.i0() == 1 ? -1 : 1;
        Rect rect = this.f8929w;
        int i8 = rect.left;
        Rect rect2 = this.f8931x;
        int i9 = rect2.left;
        if ((i8 < i9 || rect.right <= i9) && rect.right < rect2.right) {
            i6 = 1;
        } else {
            int i10 = rect.right;
            int i11 = rect2.right;
            i6 = ((i10 > i11 || i8 >= i11) && i8 > i9) ? -1 : 0;
        }
        int i12 = rect.top;
        int i13 = rect2.top;
        if ((i12 < i13 || rect.bottom <= i13) && rect.bottom < rect2.bottom) {
            c6 = 1;
        } else {
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if ((i14 <= i15 && i12 < i15) || i12 <= i13) {
                c6 = 0;
            }
        }
        if (i5 == 1) {
            return c6 < 0 || (c6 == 0 && i6 * i7 < 0);
        }
        if (i5 == 2) {
            return c6 > 0 || (c6 == 0 && i6 * i7 > 0);
        }
        if (i5 == 17) {
            return i6 < 0;
        }
        if (i5 == 33) {
            return c6 < 0;
        }
        if (i5 == 66) {
            return i6 > 0;
        }
        if (i5 == 130) {
            return c6 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i5 + Z());
    }

    private void f0(int[] iArr) {
        int g5 = this.f8921s.g();
        if (g5 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < g5; i7++) {
            d0 w02 = w0(this.f8921s.f(i7));
            if (!w02.N()) {
                int p5 = w02.p();
                if (p5 < i5) {
                    i5 = p5;
                }
                if (p5 > i6) {
                    i6 = p5;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
    }

    @q0
    static RecyclerView g0(@o0 View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            RecyclerView g02 = g0(viewGroup.getChildAt(i5));
            if (g02 != null) {
                return g02;
            }
        }
        return null;
    }

    @q0
    private View h0() {
        d0 i02;
        a0 a0Var = this.f8930w0;
        int i5 = a0Var.f8982m;
        if (i5 == -1) {
            i5 = 0;
        }
        int d6 = a0Var.d();
        for (int i6 = i5; i6 < d6; i6++) {
            d0 i03 = i0(i6);
            if (i03 == null) {
                break;
            }
            if (i03.f9003a.hasFocusable()) {
                return i03.f9003a;
            }
        }
        int min = Math.min(d6, i5);
        do {
            min--;
            if (min < 0 || (i02 = i0(min)) == null) {
                return null;
            }
        } while (!i02.f9003a.hasFocusable());
        return i02.f9003a;
    }

    private void j1(int i5, int i6, @q0 MotionEvent motionEvent, int i7) {
        LayoutManager layoutManager = this.A;
        if (layoutManager == null || this.M) {
            return;
        }
        int[] iArr = this.J0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean n5 = layoutManager.n();
        boolean o5 = this.A.o();
        f(o5 ? (n5 ? 1 : 0) | 2 : n5 ? 1 : 0, i7);
        if (b(n5 ? i5 : 0, o5 ? i6 : 0, this.J0, this.H0, i7)) {
            int[] iArr2 = this.J0;
            i5 -= iArr2[0];
            i6 -= iArr2[1];
        }
        T1(n5 ? i5 : 0, o5 ? i6 : 0, motionEvent, i7);
        androidx.recyclerview.widget.n nVar = this.f8926u0;
        if (nVar != null && (i5 != 0 || i6 != 0)) {
            nVar.f(this, i5, i6);
        }
        g(i7);
    }

    private void n(d0 d0Var) {
        View view = d0Var.f9003a;
        boolean z5 = view.getParent() == this;
        this.f8915p.K(v0(view));
        if (d0Var.B()) {
            this.f8921s.c(view, -1, view.getLayoutParams(), true);
        } else if (z5) {
            this.f8921s.k(view);
        } else {
            this.f8921s.b(view, true);
        }
    }

    private void u1(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f8905g0) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.f8905g0 = motionEvent.getPointerId(i5);
            int x5 = (int) (motionEvent.getX(i5) + 0.5f);
            this.f8909k0 = x5;
            this.f8907i0 = x5;
            int y5 = (int) (motionEvent.getY(i5) + 0.5f);
            this.f8910l0 = y5;
            this.f8908j0 = y5;
        }
    }

    private void v(@o0 d0 d0Var, @o0 d0 d0Var2, @o0 m.d dVar, @o0 m.d dVar2, boolean z5, boolean z6) {
        d0Var.K(false);
        if (z5) {
            n(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z6) {
                n(d0Var2);
            }
            d0Var.f9010h = d0Var2;
            n(d0Var);
            this.f8915p.K(d0Var);
            d0Var2.K(false);
            d0Var2.f9011i = d0Var;
        }
        if (this.f8903e0.b(d0Var, d0Var2, dVar, dVar2)) {
            x1();
        }
    }

    static d0 w0(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f8961a;
    }

    private boolean y1() {
        return this.f8903e0 != null && this.A.j2();
    }

    private void y2() {
        this.f8924t0.f();
        LayoutManager layoutManager = this.A;
        if (layoutManager != null) {
            layoutManager.i2();
        }
    }

    static void z0(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f8962b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private void z1() {
        boolean z5;
        if (this.S) {
            this.f8919r.z();
            if (this.T) {
                this.A.j1(this);
            }
        }
        if (y1()) {
            this.f8919r.x();
        } else {
            this.f8919r.k();
        }
        boolean z6 = false;
        boolean z7 = this.f8936z0 || this.A0;
        this.f8930w0.f8980k = this.J && this.f8903e0 != null && ((z5 = this.S) || z7 || this.A.f8944h) && (!z5 || this.f8935z.l());
        a0 a0Var = this.f8930w0;
        if (a0Var.f8980k && z7 && !this.S && y1()) {
            z6 = true;
        }
        a0Var.f8981l = z6;
    }

    void A1(boolean z5) {
        this.T = z5 | this.T;
        this.S = true;
        h1();
    }

    void A2(int i5, int i6, Object obj) {
        int i7;
        int j5 = this.f8921s.j();
        int i8 = i5 + i6;
        for (int i9 = 0; i9 < j5; i9++) {
            View i10 = this.f8921s.i(i9);
            d0 w02 = w0(i10);
            if (w02 != null && !w02.N() && (i7 = w02.f9005c) >= i5 && i7 < i8) {
                w02.b(2);
                w02.a(obj);
                ((LayoutParams) i10.getLayoutParams()).f8963c = true;
            }
        }
        this.f8915p.N(i5, i6);
    }

    @o0
    public l B0() {
        return this.W;
    }

    void C() {
        int j5 = this.f8921s.j();
        for (int i5 = 0; i5 < j5; i5++) {
            d0 w02 = w0(this.f8921s.i(i5));
            if (!w02.N()) {
                w02.c();
            }
        }
        this.f8915p.e();
    }

    void C1(d0 d0Var, m.d dVar) {
        d0Var.J(0, 8192);
        if (this.f8930w0.f8978i && d0Var.C() && !d0Var.z() && !d0Var.N()) {
            this.f8923t.c(q0(d0Var), d0Var);
        }
        this.f8923t.e(d0Var, dVar);
    }

    public void D() {
        List<p> list = this.R;
        if (list != null) {
            list.clear();
        }
    }

    @q0
    public m D0() {
        return this.f8903e0;
    }

    public void E() {
        List<s> list = this.f8934y0;
        if (list != null) {
            list.clear();
        }
    }

    Rect E0(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f8963c) {
            return layoutParams.f8962b;
        }
        if (this.f8930w0.j() && (layoutParams.f() || layoutParams.h())) {
            return layoutParams.f8962b;
        }
        Rect rect = layoutParams.f8962b;
        rect.set(0, 0, 0, 0);
        int size = this.D.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f8929w.set(0, 0, 0, 0);
            this.D.get(i5).g(this.f8929w, view, this, this.f8930w0);
            int i6 = rect.left;
            Rect rect2 = this.f8929w;
            rect.left = i6 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f8963c = false;
        return rect;
    }

    void F(int i5, int i6) {
        boolean z5;
        EdgeEffect edgeEffect = this.f8899a0;
        if (edgeEffect == null || edgeEffect.isFinished() || i5 <= 0) {
            z5 = false;
        } else {
            this.f8899a0.onRelease();
            z5 = this.f8899a0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f8901c0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i5 < 0) {
            this.f8901c0.onRelease();
            z5 |= this.f8901c0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f8900b0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i6 > 0) {
            this.f8900b0.onRelease();
            z5 |= this.f8900b0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f8902d0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i6 < 0) {
            this.f8902d0.onRelease();
            z5 |= this.f8902d0.isFinished();
        }
        if (z5) {
            y1.n1(this);
        }
    }

    @o0
    public o F0(int i5) {
        int G0 = G0();
        if (i5 >= 0 && i5 < G0) {
            return this.D.get(i5);
        }
        throw new IndexOutOfBoundsException(i5 + " is an invalid index for size " + G0);
    }

    void F1() {
        m mVar = this.f8903e0;
        if (mVar != null) {
            mVar.l();
        }
        LayoutManager layoutManager = this.A;
        if (layoutManager != null) {
            layoutManager.D1(this.f8915p);
            this.A.E1(this.f8915p);
        }
        this.f8915p.d();
    }

    void G() {
        if (!this.J || this.S) {
            androidx.core.os.v.b("RV FullInvalidate");
            N();
            androidx.core.os.v.d();
            return;
        }
        if (this.f8919r.q()) {
            if (!this.f8919r.p(4) || this.f8919r.p(11)) {
                if (this.f8919r.q()) {
                    androidx.core.os.v.b("RV FullInvalidate");
                    N();
                    androidx.core.os.v.d();
                    return;
                }
                return;
            }
            androidx.core.os.v.b("RV PartialInvalidate");
            v2();
            r1();
            this.f8919r.x();
            if (!this.L) {
                if (T0()) {
                    N();
                } else {
                    this.f8919r.j();
                }
            }
            w2(true);
            s1();
            androidx.core.os.v.d();
        }
    }

    public int G0() {
        return this.D.size();
    }

    boolean G1(View view) {
        v2();
        boolean r5 = this.f8921s.r(view);
        if (r5) {
            d0 w02 = w0(view);
            this.f8915p.K(w02);
            this.f8915p.D(w02);
        }
        w2(!r5);
        return r5;
    }

    @q0
    public LayoutManager H0() {
        return this.A;
    }

    public void H1(@o0 o oVar) {
        LayoutManager layoutManager = this.A;
        if (layoutManager != null) {
            layoutManager.i("Cannot remove item decoration during a scroll  or layout");
        }
        this.D.remove(oVar);
        if (this.D.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        g1();
        requestLayout();
    }

    void I(int i5, int i6) {
        setMeasuredDimension(LayoutManager.q(i5, getPaddingRight() + getPaddingLeft(), y1.f0(this)), LayoutManager.q(i6, getPaddingBottom() + getPaddingTop(), y1.e0(this)));
    }

    public int I0() {
        return this.f8916p0;
    }

    public void I1(int i5) {
        int G0 = G0();
        if (i5 >= 0 && i5 < G0) {
            H1(F0(i5));
            return;
        }
        throw new IndexOutOfBoundsException(i5 + " is an invalid index for size " + G0);
    }

    public int J0() {
        return this.f8914o0;
    }

    public void J1(@o0 p pVar) {
        List<p> list = this.R;
        if (list == null) {
            return;
        }
        list.remove(pVar);
    }

    void K(View view) {
        d0 w02 = w0(view);
        p1(view);
        h hVar = this.f8935z;
        if (hVar != null && w02 != null) {
            hVar.C(w02);
        }
        List<p> list = this.R;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.R.get(size).d(view);
            }
        }
    }

    long K0() {
        if (X0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public void K1(@o0 r rVar) {
        this.E.remove(rVar);
        if (this.F == rVar) {
            this.F = null;
        }
    }

    void L(View view) {
        d0 w02 = w0(view);
        q1(view);
        h hVar = this.f8935z;
        if (hVar != null && w02 != null) {
            hVar.D(w02);
        }
        List<p> list = this.R;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.R.get(size).b(view);
            }
        }
    }

    @q0
    public q L0() {
        return this.f8912n0;
    }

    public void L1(@o0 s sVar) {
        List<s> list = this.f8934y0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public boolean M0() {
        return this.f8922s0;
    }

    public void M1(@o0 w wVar) {
        this.C.remove(wVar);
    }

    void N() {
        if (this.f8935z == null || this.A == null) {
            return;
        }
        this.f8930w0.f8979j = false;
        boolean z5 = this.M0 && !(this.N0 == getWidth() && this.O0 == getHeight());
        this.N0 = 0;
        this.O0 = 0;
        this.M0 = false;
        if (this.f8930w0.f8974e == 1) {
            O();
            this.A.U1(this);
            P();
        } else if (this.f8919r.r() || z5 || this.A.z0() != getWidth() || this.A.e0() != getHeight()) {
            this.A.U1(this);
            P();
        } else {
            this.A.U1(this);
        }
        Q();
    }

    @o0
    public u N0() {
        return this.f8915p.j();
    }

    void N1() {
        d0 d0Var;
        int g5 = this.f8921s.g();
        for (int i5 = 0; i5 < g5; i5++) {
            View f6 = this.f8921s.f(i5);
            d0 v02 = v0(f6);
            if (v02 != null && (d0Var = v02.f9011i) != null) {
                View view = d0Var.f9003a;
                int left = f6.getLeft();
                int top = f6.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public int O0() {
        return this.f8904f0;
    }

    void R(int i5) {
        LayoutManager layoutManager = this.A;
        if (layoutManager != null) {
            layoutManager.v1(i5);
        }
        v1(i5);
        s sVar = this.f8932x0;
        if (sVar != null) {
            sVar.a(this, i5);
        }
        List<s> list = this.f8934y0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f8934y0.get(size).a(this, i5);
            }
        }
    }

    public boolean R0() {
        return this.H;
    }

    void S(int i5, int i6) {
        this.V++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i5, scrollY - i6);
        w1(i5, i6);
        s sVar = this.f8932x0;
        if (sVar != null) {
            sVar.b(this, i5, i6);
        }
        List<s> list = this.f8934y0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f8934y0.get(size).b(this, i5, i6);
            }
        }
        this.V--;
    }

    public boolean S0() {
        return !this.J || this.S || this.f8919r.q();
    }

    void S1() {
        int j5 = this.f8921s.j();
        for (int i5 = 0; i5 < j5; i5++) {
            d0 w02 = w0(this.f8921s.i(i5));
            if (!w02.N()) {
                w02.I();
            }
        }
    }

    void T() {
        int i5;
        for (int size = this.K0.size() - 1; size >= 0; size--) {
            d0 d0Var = this.K0.get(size);
            if (d0Var.f9003a.getParent() == this && !d0Var.N() && (i5 = d0Var.f9019q) != -1) {
                y1.R1(d0Var.f9003a, i5);
                d0Var.f9019q = -1;
            }
        }
        this.K0.clear();
    }

    boolean T1(int i5, int i6, MotionEvent motionEvent, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        G();
        if (this.f8935z != null) {
            int[] iArr = this.J0;
            iArr[0] = 0;
            iArr[1] = 0;
            U1(i5, i6, iArr);
            int[] iArr2 = this.J0;
            int i12 = iArr2[0];
            int i13 = iArr2[1];
            i8 = i13;
            i9 = i12;
            i10 = i5 - i12;
            i11 = i6 - i13;
        } else {
            i8 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (!this.D.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.J0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        c(i9, i8, i10, i11, this.H0, i7, iArr3);
        int[] iArr4 = this.J0;
        int i14 = iArr4[0];
        int i15 = i10 - i14;
        int i16 = iArr4[1];
        int i17 = i11 - i16;
        boolean z5 = (i14 == 0 && i16 == 0) ? false : true;
        int i18 = this.f8909k0;
        int[] iArr5 = this.H0;
        int i19 = iArr5[0];
        this.f8909k0 = i18 - i19;
        int i20 = this.f8910l0;
        int i21 = iArr5[1];
        this.f8910l0 = i20 - i21;
        int[] iArr6 = this.I0;
        iArr6[0] = iArr6[0] + i19;
        iArr6[1] = iArr6[1] + i21;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !f1.l(motionEvent, 8194)) {
                B1(motionEvent.getX(), i15, motionEvent.getY(), i17);
            }
            F(i5, i6);
        }
        if (i9 != 0 || i8 != 0) {
            S(i9, i8);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z5 && i9 == 0 && i8 == 0) ? false : true;
    }

    void U0() {
        this.f8919r = new androidx.recyclerview.widget.a(new f(), false);
    }

    void U1(int i5, int i6, @q0 int[] iArr) {
        v2();
        r1();
        androidx.core.os.v.b("RV Scroll");
        a0(this.f8930w0);
        int Q1 = i5 != 0 ? this.A.Q1(i5, this.f8915p, this.f8930w0) : 0;
        int S1 = i6 != 0 ? this.A.S1(i6, this.f8915p, this.f8930w0) : 0;
        androidx.core.os.v.d();
        N1();
        s1();
        w2(false);
        if (iArr != null) {
            iArr[0] = Q1;
            iArr[1] = S1;
        }
    }

    void V() {
        if (this.f8902d0 != null) {
            return;
        }
        EdgeEffect a6 = this.W.a(this, 3);
        this.f8902d0 = a6;
        if (this.f8925u) {
            a6.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a6.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void V1(int i5) {
        if (this.M) {
            return;
        }
        x2();
        LayoutManager layoutManager = this.A;
        if (layoutManager == null) {
            return;
        }
        layoutManager.R1(i5);
        awakenScrollBars();
    }

    void W() {
        if (this.f8899a0 != null) {
            return;
        }
        EdgeEffect a6 = this.W.a(this, 0);
        this.f8899a0 = a6;
        if (this.f8925u) {
            a6.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a6.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void W1(@q0 androidx.recyclerview.widget.b0 b0Var) {
        this.D0 = b0Var;
        y1.B1(this, b0Var);
    }

    void X() {
        if (this.f8901c0 != null) {
            return;
        }
        EdgeEffect a6 = this.W.a(this, 2);
        this.f8901c0 = a6;
        if (this.f8925u) {
            a6.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a6.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @m1
    void X0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + Z());
        }
        Resources resources = getContext().getResources();
        new androidx.recyclerview.widget.m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(a.c.f32407h), resources.getDimensionPixelSize(a.c.f32409j), resources.getDimensionPixelOffset(a.c.f32408i));
    }

    public void X1(@q0 h hVar) {
        f2(false);
        Y1(hVar, false, true);
        A1(false);
        requestLayout();
    }

    void Y() {
        if (this.f8900b0 != null) {
            return;
        }
        EdgeEffect a6 = this.W.a(this, 1);
        this.f8900b0 = a6;
        if (this.f8925u) {
            a6.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a6.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void Y0() {
        this.f8902d0 = null;
        this.f8900b0 = null;
        this.f8901c0 = null;
        this.f8899a0 = null;
    }

    String Z() {
        return " " + super.toString() + ", adapter:" + this.f8935z + ", layout:" + this.A + ", context:" + getContext();
    }

    public void Z0() {
        if (this.D.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.A;
        if (layoutManager != null) {
            layoutManager.i("Cannot invalidate item decorations during a scroll or layout");
        }
        g1();
        requestLayout();
    }

    public void Z1(@q0 k kVar) {
        if (kVar == this.E0) {
            return;
        }
        this.E0 = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    @Override // androidx.core.view.g1
    public boolean a(int i5, int i6, int i7, int i8, int[] iArr, int i9) {
        return P0().g(i5, i6, i7, i8, iArr, i9);
    }

    final void a0(a0 a0Var) {
        if (O0() != 2) {
            a0Var.f8985p = 0;
            a0Var.f8986q = 0;
        } else {
            OverScroller overScroller = this.f8924t0.f8990q;
            a0Var.f8985p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f8986q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    boolean a1() {
        AccessibilityManager accessibilityManager = this.Q;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    @m1
    boolean a2(d0 d0Var, int i5) {
        if (!c1()) {
            y1.R1(d0Var.f9003a, i5);
            return true;
        }
        d0Var.f9019q = i5;
        this.K0.add(d0Var);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i5, int i6) {
        LayoutManager layoutManager = this.A;
        if (layoutManager == null || !layoutManager.W0(this, arrayList, i5, i6)) {
            super.addFocusables(arrayList, i5, i6);
        }
    }

    @Override // androidx.core.view.g1
    public boolean b(int i5, int i6, int[] iArr, int[] iArr2, int i7) {
        return P0().d(i5, i6, iArr, iArr2, i7);
    }

    @q0
    public View b0(float f6, float f7) {
        for (int g5 = this.f8921s.g() - 1; g5 >= 0; g5--) {
            View f8 = this.f8921s.f(g5);
            float translationX = f8.getTranslationX();
            float translationY = f8.getTranslationY();
            if (f6 >= f8.getLeft() + translationX && f6 <= f8.getRight() + translationX && f7 >= f8.getTop() + translationY && f7 <= f8.getBottom() + translationY) {
                return f8;
            }
        }
        return null;
    }

    public boolean b1() {
        m mVar = this.f8903e0;
        return mVar != null && mVar.q();
    }

    public void b2(@o0 l lVar) {
        lVar.getClass();
        this.W = lVar;
        Y0();
    }

    @Override // androidx.core.view.h1
    public final void c(int i5, int i6, int i7, int i8, int[] iArr, int i9, @o0 int[] iArr2) {
        P0().e(i5, i6, i7, i8, iArr, i9, iArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View c0(@androidx.annotation.o0 android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c0(android.view.View):android.view.View");
    }

    public boolean c1() {
        return this.U > 0;
    }

    public void c2(boolean z5) {
        this.H = z5;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.A.p((LayoutParams) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.u1
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.A;
        if (layoutManager != null && layoutManager.n()) {
            return this.A.t(this.f8930w0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.u1
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.A;
        if (layoutManager != null && layoutManager.n()) {
            return this.A.u(this.f8930w0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.u1
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.A;
        if (layoutManager != null && layoutManager.n()) {
            return this.A.v(this.f8930w0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.u1
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.A;
        if (layoutManager != null && layoutManager.o()) {
            return this.A.w(this.f8930w0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.u1
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.A;
        if (layoutManager != null && layoutManager.o()) {
            return this.A.x(this.f8930w0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.u1
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.A;
        if (layoutManager != null && layoutManager.o()) {
            return this.A.y(this.f8930w0);
        }
        return 0;
    }

    @Override // androidx.core.view.g1
    public boolean d(int i5) {
        return P0().l(i5);
    }

    @q0
    public d0 d0(@o0 View view) {
        View c02 = c0(view);
        if (c02 == null) {
            return null;
        }
        return v0(c02);
    }

    @Deprecated
    public boolean d1() {
        return isLayoutSuppressed();
    }

    public void d2(@q0 m mVar) {
        m mVar2 = this.f8903e0;
        if (mVar2 != null) {
            mVar2.l();
            this.f8903e0.A(null);
        }
        this.f8903e0 = mVar;
        if (mVar != null) {
            mVar.A(this.B0);
        }
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean dispatchNestedFling(float f6, float f7, boolean z5) {
        return P0().a(f6, f7, z5);
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean dispatchNestedPreFling(float f6, float f7) {
        return P0().b(f6, f7);
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean dispatchNestedPreScroll(int i5, int i6, int[] iArr, int[] iArr2) {
        return P0().c(i5, i6, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean dispatchNestedScroll(int i5, int i6, int i7, int i8, int[] iArr) {
        return P0().f(i5, i6, i7, i8, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z5;
        super.draw(canvas);
        int size = this.D.size();
        boolean z6 = false;
        for (int i5 = 0; i5 < size; i5++) {
            this.D.get(i5).k(canvas, this, this.f8930w0);
        }
        EdgeEffect edgeEffect = this.f8899a0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z5 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f8925u ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f8899a0;
            z5 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f8900b0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f8925u) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f8900b0;
            z5 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f8901c0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f8925u ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f8901c0;
            z5 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f8902d0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f8925u) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f8902d0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z5 |= z6;
            canvas.restoreToCount(save4);
        }
        if ((z5 || this.f8903e0 == null || this.D.size() <= 0 || !this.f8903e0.q()) ? z5 : true) {
            y1.n1(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j5) {
        return super.drawChild(canvas, view, j5);
    }

    public void e2(int i5) {
        this.f8915p.H(i5);
    }

    @Override // androidx.core.view.g1
    public boolean f(int i5, int i6) {
        return P0().s(i5, i6);
    }

    void f1(int i5) {
        if (this.A == null) {
            return;
        }
        m2(2);
        this.A.R1(i5);
        awakenScrollBars();
    }

    @Deprecated
    public void f2(boolean z5) {
        suppressLayout(z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i5) {
        View view2;
        boolean z5;
        View h12 = this.A.h1(view, i5);
        if (h12 != null) {
            return h12;
        }
        boolean z6 = (this.f8935z == null || this.A == null || c1() || this.M) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z6 && (i5 == 2 || i5 == 1)) {
            if (this.A.o()) {
                int i6 = i5 == 2 ? 130 : 33;
                z5 = focusFinder.findNextFocus(this, view, i6) == null;
                if (Y0) {
                    i5 = i6;
                }
            } else {
                z5 = false;
            }
            if (!z5 && this.A.n()) {
                int i7 = (this.A.i0() == 1) ^ (i5 == 2) ? 66 : 17;
                boolean z7 = focusFinder.findNextFocus(this, view, i7) == null;
                if (Y0) {
                    i5 = i7;
                }
                z5 = z7;
            }
            if (z5) {
                G();
                if (c0(view) == null) {
                    return null;
                }
                v2();
                this.A.a1(view, i5, this.f8915p, this.f8930w0);
                w2(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i5);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i5);
            if (findNextFocus == null && z6) {
                G();
                if (c0(view) == null) {
                    return null;
                }
                v2();
                view2 = this.A.a1(view, i5, this.f8915p, this.f8930w0);
                w2(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return e1(view, view2, i5) ? view2 : super.focusSearch(view, i5);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i5);
        }
        O1(view2, null);
        return view;
    }

    @Override // androidx.core.view.g1
    public void g(int i5) {
        P0().u(i5);
    }

    void g1() {
        int j5 = this.f8921s.j();
        for (int i5 = 0; i5 < j5; i5++) {
            ((LayoutParams) this.f8921s.i(i5).getLayoutParams()).f8963c = true;
        }
        this.f8915p.t();
    }

    public void g2(@q0 LayoutManager layoutManager) {
        if (layoutManager == this.A) {
            return;
        }
        x2();
        if (this.A != null) {
            m mVar = this.f8903e0;
            if (mVar != null) {
                mVar.l();
            }
            this.A.D1(this.f8915p);
            this.A.E1(this.f8915p);
            this.f8915p.d();
            if (this.G) {
                this.A.G(this, this.f8915p);
            }
            this.A.b2(null);
            this.A = null;
        } else {
            this.f8915p.d();
        }
        this.f8921s.o();
        this.A = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.f8938b != null) {
                throw new IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.f8938b.Z());
            }
            layoutManager.b2(this);
            if (this.G) {
                this.A.F(this);
            }
        }
        this.f8915p.L();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.A;
        if (layoutManager != null) {
            return layoutManager.K();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Z());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.A;
        if (layoutManager != null) {
            return layoutManager.L(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Z());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.A;
        return layoutManager != null ? layoutManager.N() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i5, int i6) {
        k kVar = this.E0;
        return kVar == null ? super.getChildDrawingOrder(i5, i6) : kVar.a(i5, i6);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f8925u;
    }

    void h1() {
        int j5 = this.f8921s.j();
        for (int i5 = 0; i5 < j5; i5++) {
            d0 w02 = w0(this.f8921s.i(i5));
            if (w02 != null && !w02.N()) {
                w02.b(6);
            }
        }
        g1();
        this.f8915p.u();
    }

    public void h2(@q0 q qVar) {
        this.f8912n0 = qVar;
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean hasNestedScrollingParent() {
        return P0().k();
    }

    void i(int i5, int i6) {
        if (i5 < 0) {
            W();
            if (this.f8899a0.isFinished()) {
                this.f8899a0.onAbsorb(-i5);
            }
        } else if (i5 > 0) {
            X();
            if (this.f8901c0.isFinished()) {
                this.f8901c0.onAbsorb(i5);
            }
        }
        if (i6 < 0) {
            Y();
            if (this.f8900b0.isFinished()) {
                this.f8900b0.onAbsorb(-i6);
            }
        } else if (i6 > 0) {
            V();
            if (this.f8902d0.isFinished()) {
                this.f8902d0.onAbsorb(i6);
            }
        }
        if (i5 == 0 && i6 == 0) {
            return;
        }
        y1.n1(this);
    }

    @q0
    public d0 i0(int i5) {
        d0 d0Var = null;
        if (this.S) {
            return null;
        }
        int j5 = this.f8921s.j();
        for (int i6 = 0; i6 < j5; i6++) {
            d0 w02 = w0(this.f8921s.i(i6));
            if (w02 != null && !w02.z() && p0(w02) == i5) {
                if (!this.f8921s.n(w02.f9003a)) {
                    return w02;
                }
                d0Var = w02;
            }
        }
        return d0Var;
    }

    public void i1(int i5, int i6) {
        j1(i5, i6, null, 1);
    }

    @Deprecated
    public void i2(@q0 s sVar) {
        this.f8932x0 = sVar;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.G;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.M;
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean isNestedScrollingEnabled() {
        return P0().m();
    }

    public d0 j0(long j5) {
        h hVar = this.f8935z;
        d0 d0Var = null;
        if (hVar != null && hVar.l()) {
            int j6 = this.f8921s.j();
            for (int i5 = 0; i5 < j6; i5++) {
                d0 w02 = w0(this.f8921s.i(i5));
                if (w02 != null && !w02.z() && w02.n() == j5) {
                    if (!this.f8921s.n(w02.f9003a)) {
                        return w02;
                    }
                    d0Var = w02;
                }
            }
        }
        return d0Var;
    }

    public void j2(boolean z5) {
        this.f8922s0 = z5;
    }

    @q0
    public d0 k0(int i5) {
        return m0(i5, false);
    }

    public void k1(@u0 int i5) {
        int g5 = this.f8921s.g();
        for (int i6 = 0; i6 < g5; i6++) {
            this.f8921s.f(i6).offsetLeftAndRight(i5);
        }
    }

    public void k2(@q0 u uVar) {
        this.f8915p.F(uVar);
    }

    @q0
    @Deprecated
    public d0 l0(int i5) {
        return m0(i5, false);
    }

    public void l1(@u0 int i5) {
        int g5 = this.f8921s.g();
        for (int i6 = 0; i6 < g5; i6++) {
            this.f8921s.f(i6).offsetTopAndBottom(i5);
        }
    }

    @Deprecated
    public void l2(@q0 w wVar) {
        this.B = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.d0 m0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.g r0 = r5.f8921s
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.g r3 = r5.f8921s
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = w0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.z()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f9005c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.p()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.g r1 = r5.f8921s
            android.view.View r4 = r3.f9003a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m0(int, boolean):androidx.recyclerview.widget.RecyclerView$d0");
    }

    void m1(int i5, int i6) {
        int j5 = this.f8921s.j();
        for (int i7 = 0; i7 < j5; i7++) {
            d0 w02 = w0(this.f8921s.i(i7));
            if (w02 != null && !w02.N() && w02.f9005c >= i5) {
                w02.E(i6, false);
                this.f8930w0.f8976g = true;
            }
        }
        this.f8915p.v(i5, i6);
        requestLayout();
    }

    void m2(int i5) {
        if (i5 == this.f8904f0) {
            return;
        }
        this.f8904f0 = i5;
        if (i5 != 2) {
            y2();
        }
        R(i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean n0(int i5, int i6) {
        LayoutManager layoutManager = this.A;
        if (layoutManager == null || this.M) {
            return false;
        }
        int n5 = layoutManager.n();
        boolean o5 = this.A.o();
        if (n5 == 0 || Math.abs(i5) < this.f8914o0) {
            i5 = 0;
        }
        if (!o5 || Math.abs(i6) < this.f8914o0) {
            i6 = 0;
        }
        if (i5 == 0 && i6 == 0) {
            return false;
        }
        float f6 = i5;
        float f7 = i6;
        if (!dispatchNestedPreFling(f6, f7)) {
            boolean z5 = n5 != 0 || o5;
            dispatchNestedFling(f6, f7, z5);
            q qVar = this.f8912n0;
            if (qVar != null && qVar.a(i5, i6)) {
                return true;
            }
            if (z5) {
                if (o5) {
                    n5 = (n5 == true ? 1 : 0) | 2;
                }
                f(n5, 1);
                int i7 = this.f8916p0;
                int max = Math.max(-i7, Math.min(i5, i7));
                int i8 = this.f8916p0;
                this.f8924t0.b(max, Math.max(-i8, Math.min(i6, i8)));
                return true;
            }
        }
        return false;
    }

    void n1(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int j5 = this.f8921s.j();
        if (i5 < i6) {
            i9 = -1;
            i8 = i5;
            i7 = i6;
        } else {
            i7 = i5;
            i8 = i6;
            i9 = 1;
        }
        for (int i11 = 0; i11 < j5; i11++) {
            d0 w02 = w0(this.f8921s.i(i11));
            if (w02 != null && (i10 = w02.f9005c) >= i8 && i10 <= i7) {
                if (i10 == i5) {
                    w02.E(i6 - i5, false);
                } else {
                    w02.E(i9, false);
                }
                this.f8930w0.f8976g = true;
            }
        }
        this.f8915p.w(i5, i6);
        requestLayout();
    }

    public void n2(int i5) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i5 != 1) {
            this.f8911m0 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f8911m0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void o(@o0 o oVar) {
        p(oVar, -1);
    }

    @q0
    public h o0() {
        return this.f8935z;
    }

    void o1(int i5, int i6, boolean z5) {
        int i7 = i5 + i6;
        int j5 = this.f8921s.j();
        for (int i8 = 0; i8 < j5; i8++) {
            d0 w02 = w0(this.f8921s.i(i8));
            if (w02 != null && !w02.N()) {
                int i9 = w02.f9005c;
                if (i9 >= i7) {
                    w02.E(-i6, z5);
                    this.f8930w0.f8976g = true;
                } else if (i9 >= i5) {
                    w02.i(i5 - 1, -i6, z5);
                    this.f8930w0.f8976g = true;
                }
            }
        }
        this.f8915p.x(i5, i6, z5);
        requestLayout();
    }

    public void o2(@q0 b0 b0Var) {
        this.f8915p.G(b0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.U = r0
            r1 = 1
            r5.G = r1
            boolean r2 = r5.J
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.J = r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r5.A
            if (r1 == 0) goto L1e
            r1.F(r5)
        L1e:
            r5.C0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.X0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal<androidx.recyclerview.widget.n> r0 = androidx.recyclerview.widget.n.f9462s
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.n r1 = (androidx.recyclerview.widget.n) r1
            r5.f8926u0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.n r1 = new androidx.recyclerview.widget.n
            r1.<init>()
            r5.f8926u0 = r1
            android.view.Display r1 = androidx.core.view.y1.Q(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.n r2 = r5.f8926u0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f9466q = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.n r0 = r5.f8926u0
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.n nVar;
        super.onDetachedFromWindow();
        m mVar = this.f8903e0;
        if (mVar != null) {
            mVar.l();
        }
        x2();
        this.G = false;
        LayoutManager layoutManager = this.A;
        if (layoutManager != null) {
            layoutManager.G(this, this.f8915p);
        }
        this.K0.clear();
        removeCallbacks(this.L0);
        this.f8923t.j();
        if (!X0 || (nVar = this.f8926u0) == null) {
            return;
        }
        nVar.j(this);
        this.f8926u0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.D.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.D.get(i5).i(canvas, this, this.f8930w0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.A
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.M
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.A
            boolean r0 = r0.o()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.A
            boolean r3 = r3.n()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.A
            boolean r3 = r3.o()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.A
            boolean r3 = r3.n()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.f8918q0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f8920r0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.j1(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        if (this.M) {
            return false;
        }
        this.F = null;
        if (e0(motionEvent)) {
            A();
            return true;
        }
        LayoutManager layoutManager = this.A;
        if (layoutManager == null) {
            return false;
        }
        boolean n5 = layoutManager.n();
        boolean o5 = this.A.o();
        if (this.f8906h0 == null) {
            this.f8906h0 = VelocityTracker.obtain();
        }
        this.f8906h0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.N) {
                this.N = false;
            }
            this.f8905g0 = motionEvent.getPointerId(0);
            int x5 = (int) (motionEvent.getX() + 0.5f);
            this.f8909k0 = x5;
            this.f8907i0 = x5;
            int y5 = (int) (motionEvent.getY() + 0.5f);
            this.f8910l0 = y5;
            this.f8908j0 = y5;
            if (this.f8904f0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                m2(1);
                g(1);
            }
            int[] iArr = this.I0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i5 = n5;
            if (o5) {
                i5 = (n5 ? 1 : 0) | 2;
            }
            f(i5, 0);
        } else if (actionMasked == 1) {
            this.f8906h0.clear();
            g(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f8905g0);
            if (findPointerIndex < 0) {
                return false;
            }
            int x6 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y6 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f8904f0 != 1) {
                int i6 = x6 - this.f8907i0;
                int i7 = y6 - this.f8908j0;
                if (n5 == 0 || Math.abs(i6) <= this.f8911m0) {
                    z5 = false;
                } else {
                    this.f8909k0 = x6;
                    z5 = true;
                }
                if (o5 && Math.abs(i7) > this.f8911m0) {
                    this.f8910l0 = y6;
                    z5 = true;
                }
                if (z5) {
                    m2(1);
                }
            }
        } else if (actionMasked == 3) {
            A();
        } else if (actionMasked == 5) {
            this.f8905g0 = motionEvent.getPointerId(actionIndex);
            int x7 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f8909k0 = x7;
            this.f8907i0 = x7;
            int y7 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f8910l0 = y7;
            this.f8908j0 = y7;
        } else if (actionMasked == 6) {
            u1(motionEvent);
        }
        return this.f8904f0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        androidx.core.os.v.b("RV OnLayout");
        N();
        androidx.core.os.v.d();
        this.J = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        LayoutManager layoutManager = this.A;
        if (layoutManager == null) {
            I(i5, i6);
            return;
        }
        boolean z5 = false;
        if (layoutManager.F0()) {
            int mode = View.MeasureSpec.getMode(i5);
            int mode2 = View.MeasureSpec.getMode(i6);
            this.A.q1(this.f8915p, this.f8930w0, i5, i6);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z5 = true;
            }
            this.M0 = z5;
            if (z5 || this.f8935z == null) {
                return;
            }
            if (this.f8930w0.f8974e == 1) {
                O();
            }
            this.A.W1(i5, i6);
            this.f8930w0.f8979j = true;
            P();
            this.A.Z1(i5, i6);
            if (this.A.d2()) {
                this.A.W1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
                this.f8930w0.f8979j = true;
                P();
                this.A.Z1(i5, i6);
            }
            this.N0 = getMeasuredWidth();
            this.O0 = getMeasuredHeight();
            return;
        }
        if (this.H) {
            this.A.q1(this.f8915p, this.f8930w0, i5, i6);
            return;
        }
        if (this.P) {
            v2();
            r1();
            z1();
            s1();
            a0 a0Var = this.f8930w0;
            if (a0Var.f8981l) {
                a0Var.f8977h = true;
            } else {
                this.f8919r.k();
                this.f8930w0.f8977h = false;
            }
            this.P = false;
            w2(false);
        } else if (this.f8930w0.f8981l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f8935z;
        if (hVar != null) {
            this.f8930w0.f8975f = hVar.g();
        } else {
            this.f8930w0.f8975f = 0;
        }
        v2();
        this.A.q1(this.f8915p, this.f8930w0, i5, i6);
        w2(false);
        this.f8930w0.f8977h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i5, Rect rect) {
        if (c1()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i5, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f8917q = savedState;
        super.onRestoreInstanceState(savedState.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f8917q;
        if (savedState2 != null) {
            savedState.f8965q = savedState2.f8965q;
        } else {
            LayoutManager layoutManager = this.A;
            if (layoutManager != null) {
                savedState.f8965q = layoutManager.u1();
            } else {
                savedState.f8965q = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        if (i5 == i7 && i6 == i8) {
            return;
        }
        Y0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(@o0 o oVar, int i5) {
        LayoutManager layoutManager = this.A;
        if (layoutManager != null) {
            layoutManager.i("Cannot add item decoration during a scroll  or layout");
        }
        if (this.D.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i5 < 0) {
            this.D.add(oVar);
        } else {
            this.D.add(i5, oVar);
        }
        g1();
        requestLayout();
    }

    int p0(d0 d0Var) {
        if (d0Var.t(524) || !d0Var.w()) {
            return -1;
        }
        return this.f8919r.f(d0Var.f9005c);
    }

    public void p1(@o0 View view) {
    }

    boolean p2(AccessibilityEvent accessibilityEvent) {
        if (!c1()) {
            return false;
        }
        int d6 = accessibilityEvent != null ? androidx.core.view.accessibility.b.d(accessibilityEvent) : 0;
        this.O |= d6 != 0 ? d6 : 0;
        return true;
    }

    public void q(@o0 p pVar) {
        if (this.R == null) {
            this.R = new ArrayList();
        }
        this.R.add(pVar);
    }

    long q0(d0 d0Var) {
        return this.f8935z.l() ? d0Var.n() : d0Var.f9005c;
    }

    public void q1(@o0 View view) {
    }

    public void q2(@u0 int i5, @u0 int i6) {
        r2(i5, i6, null);
    }

    public void r(@o0 r rVar) {
        this.E.add(rVar);
    }

    public int r0(@o0 View view) {
        d0 w02 = w0(view);
        if (w02 != null) {
            return w02.j();
        }
        return -1;
    }

    void r1() {
        this.U++;
    }

    public void r2(@u0 int i5, @u0 int i6, @q0 Interpolator interpolator) {
        s2(i5, i6, interpolator, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z5) {
        d0 w02 = w0(view);
        if (w02 != null) {
            if (w02.B()) {
                w02.f();
            } else if (!w02.N()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + w02 + Z());
            }
        }
        view.clearAnimation();
        L(view);
        super.removeDetachedView(view, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.A.s1(this, this.f8930w0, view, view2) && view2 != null) {
            O1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        return this.A.L1(this, view, rect, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        int size = this.E.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.E.get(i5).e(z5);
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.K != 0 || this.M) {
            this.L = true;
        } else {
            super.requestLayout();
        }
    }

    public void s(@o0 s sVar) {
        if (this.f8934y0 == null) {
            this.f8934y0 = new ArrayList();
        }
        this.f8934y0.add(sVar);
    }

    public long s0(@o0 View view) {
        d0 w02;
        h hVar = this.f8935z;
        if (hVar == null || !hVar.l() || (w02 = w0(view)) == null) {
            return -1L;
        }
        return w02.n();
    }

    void s1() {
        t1(true);
    }

    public void s2(@u0 int i5, @u0 int i6, @q0 Interpolator interpolator, int i7) {
        t2(i5, i6, interpolator, i7, false);
    }

    @Override // android.view.View
    public void scrollBy(int i5, int i6) {
        LayoutManager layoutManager = this.A;
        if (layoutManager == null || this.M) {
            return;
        }
        boolean n5 = layoutManager.n();
        boolean o5 = this.A.o();
        if (n5 || o5) {
            if (!n5) {
                i5 = 0;
            }
            if (!o5) {
                i6 = 0;
            }
            T1(i5, i6, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i5, int i6) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (p2(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z5) {
        if (z5 != this.f8925u) {
            Y0();
        }
        this.f8925u = z5;
        super.setClipToPadding(z5);
        if (this.J) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View, androidx.core.view.i1
    public void setNestedScrollingEnabled(boolean z5) {
        P0().p(z5);
    }

    @Override // android.view.View, androidx.core.view.i1
    public boolean startNestedScroll(int i5) {
        return P0().r(i5);
    }

    @Override // android.view.View, androidx.core.view.i1
    public void stopNestedScroll() {
        P0().t();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z5) {
        if (z5 != this.M) {
            y("Do not suppressLayout in layout or scroll");
            if (z5) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.M = true;
                this.N = true;
                x2();
                return;
            }
            this.M = false;
            if (this.L && this.A != null && this.f8935z != null) {
                requestLayout();
            }
            this.L = false;
        }
    }

    public void t(@o0 w wVar) {
        androidx.core.util.q.b(wVar != null, "'listener' arg cannot be null.");
        this.C.add(wVar);
    }

    public int t0(@o0 View view) {
        d0 w02 = w0(view);
        if (w02 != null) {
            return w02.p();
        }
        return -1;
    }

    void t1(boolean z5) {
        int i5 = this.U - 1;
        this.U = i5;
        if (i5 < 1) {
            this.U = 0;
            if (z5) {
                M();
                T();
            }
        }
    }

    void t2(@u0 int i5, @u0 int i6, @q0 Interpolator interpolator, int i7, boolean z5) {
        LayoutManager layoutManager = this.A;
        if (layoutManager == null || this.M) {
            return;
        }
        if (!layoutManager.n()) {
            i5 = 0;
        }
        if (!this.A.o()) {
            i6 = 0;
        }
        if (i5 == 0 && i6 == 0) {
            return;
        }
        if (!(i7 == Integer.MIN_VALUE || i7 > 0)) {
            scrollBy(i5, i6);
            return;
        }
        if (z5) {
            int i8 = i5 != 0 ? 1 : 0;
            if (i6 != 0) {
                i8 |= 2;
            }
            f(i8, 1);
        }
        this.f8924t0.e(i5, i6, i7, interpolator);
    }

    void u(@o0 d0 d0Var, @q0 m.d dVar, @o0 m.d dVar2) {
        d0Var.K(false);
        if (this.f8903e0.a(d0Var, dVar, dVar2)) {
            x1();
        }
    }

    @Deprecated
    public int u0(@o0 View view) {
        return r0(view);
    }

    public void u2(int i5) {
        LayoutManager layoutManager;
        if (this.M || (layoutManager = this.A) == null) {
            return;
        }
        layoutManager.f2(this, this.f8930w0, i5);
    }

    public d0 v0(@o0 View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return w0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void v1(int i5) {
    }

    void v2() {
        int i5 = this.K + 1;
        this.K = i5;
        if (i5 != 1 || this.M) {
            return;
        }
        this.L = false;
    }

    void w(@o0 d0 d0Var, @o0 m.d dVar, @q0 m.d dVar2) {
        n(d0Var);
        d0Var.K(false);
        if (this.f8903e0.c(d0Var, dVar, dVar2)) {
            x1();
        }
    }

    public void w1(@u0 int i5, @u0 int i6) {
    }

    void w2(boolean z5) {
        if (this.K < 1) {
            this.K = 1;
        }
        if (!z5 && !this.M) {
            this.L = false;
        }
        if (this.K == 1) {
            if (z5 && this.L && !this.M && this.A != null && this.f8935z != null) {
                N();
            }
            if (!this.M) {
                this.L = false;
            }
        }
        this.K--;
    }

    void x(String str) {
        if (c1()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + Z());
        }
        StringBuilder a6 = androidx.constraintlayout.motion.widget.r.a(str);
        a6.append(Z());
        throw new IllegalStateException(a6.toString());
    }

    @q0
    public androidx.recyclerview.widget.b0 x0() {
        return this.D0;
    }

    void x1() {
        if (this.C0 || !this.G) {
            return;
        }
        y1.p1(this, this.L0);
        this.C0 = true;
    }

    public void x2() {
        m2(0);
        y2();
    }

    void y(String str) {
        if (c1()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + Z());
        }
        if (this.V > 0) {
            new IllegalStateException("" + Z());
        }
    }

    public void y0(@o0 View view, @o0 Rect rect) {
        z0(view, rect);
    }

    boolean z(d0 d0Var) {
        m mVar = this.f8903e0;
        return mVar == null || mVar.g(d0Var, d0Var.s());
    }

    public void z2(@q0 h hVar, boolean z5) {
        f2(false);
        Y1(hVar, true, z5);
        A1(true);
        requestLayout();
    }

    public RecyclerView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0499a.f32389r);
    }

    @c1({c1.a.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        Parcelable f8965q;

        /* loaded from: classes.dex */
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
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8965q = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        void b(SavedState savedState) {
            this.f8965q = savedState.f8965q;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeParcelable(this.f8965q, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f8913o = new x();
        this.f8915p = new v();
        this.f8923t = new l0();
        this.f8927v = new a();
        this.f8929w = new Rect();
        this.f8931x = new Rect();
        this.f8933y = new RectF();
        this.C = new ArrayList();
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.K = 0;
        this.S = false;
        this.T = false;
        this.U = 0;
        this.V = 0;
        this.W = new l();
        this.f8903e0 = new androidx.recyclerview.widget.j();
        this.f8904f0 = 0;
        this.f8905g0 = -1;
        this.f8918q0 = Float.MIN_VALUE;
        this.f8920r0 = Float.MIN_VALUE;
        this.f8922s0 = true;
        this.f8924t0 = new c0();
        this.f8928v0 = X0 ? new n.b() : null;
        this.f8930w0 = new a0();
        this.f8936z0 = false;
        this.A0 = false;
        this.B0 = new n();
        this.C0 = false;
        this.F0 = new int[2];
        this.H0 = new int[2];
        this.I0 = new int[2];
        this.J0 = new int[2];
        this.K0 = new ArrayList();
        this.L0 = new b();
        this.N0 = 0;
        this.O0 = 0;
        this.P0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8911m0 = viewConfiguration.getScaledTouchSlop();
        this.f8918q0 = j3.b(viewConfiguration, context);
        this.f8920r0 = j3.e(viewConfiguration, context);
        this.f8914o0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8916p0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f8903e0.A(this.B0);
        U0();
        W0();
        V0();
        if (y1.V(this) == 0) {
            y1.R1(this, 1);
        }
        this.Q = (AccessibilityManager) getContext().getSystemService("accessibility");
        W1(new androidx.recyclerview.widget.b0(this));
        int[] iArr = a.j.P;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, 0);
        y1.z1(this, context, iArr, attributeSet, obtainStyledAttributes, i5, 0);
        String string = obtainStyledAttributes.getString(a.j.Y);
        if (obtainStyledAttributes.getInt(a.j.S, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f8925u = obtainStyledAttributes.getBoolean(a.j.R, true);
        boolean z5 = obtainStyledAttributes.getBoolean(a.j.T, false);
        this.I = z5;
        if (z5) {
            X0((StateListDrawable) obtainStyledAttributes.getDrawable(a.j.W), obtainStyledAttributes.getDrawable(a.j.X), (StateListDrawable) obtainStyledAttributes.getDrawable(a.j.U), obtainStyledAttributes.getDrawable(a.j.V));
        }
        obtainStyledAttributes.recycle();
        H(context, string, attributeSet, i5, 0);
        int[] iArr2 = T0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i5, 0);
        y1.z1(this, context, iArr2, attributeSet, obtainStyledAttributes2, i5, 0);
        boolean z6 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z6);
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        d0 f8961a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f8962b;

        /* renamed from: c, reason: collision with root package name */
        boolean f8963c;

        /* renamed from: d, reason: collision with root package name */
        boolean f8964d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8962b = new Rect();
            this.f8963c = true;
            this.f8964d = false;
        }

        public int a() {
            return this.f8961a.j();
        }

        public int b() {
            return this.f8961a.m();
        }

        @Deprecated
        public int c() {
            return this.f8961a.m();
        }

        public int d() {
            return this.f8961a.p();
        }

        @Deprecated
        public int e() {
            return this.f8961a.r();
        }

        public boolean f() {
            return this.f8961a.C();
        }

        public boolean g() {
            return this.f8961a.z();
        }

        public boolean h() {
            return this.f8961a.x();
        }

        public boolean i() {
            return this.f8961a.D();
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.f8962b = new Rect();
            this.f8963c = true;
            this.f8964d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8962b = new Rect();
            this.f8963c = true;
            this.f8964d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8962b = new Rect();
            this.f8963c = true;
            this.f8964d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f8962b = new Rect();
            this.f8963c = true;
            this.f8964d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.A;
        if (layoutManager != null) {
            return layoutManager.M(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Z());
    }
}
