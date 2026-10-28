package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.annotation.x;
import androidx.appcompat.view.menu.s;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.g0;
import androidx.core.view.accessibility.m0;
import androidx.core.view.v4;
import androidx.core.view.y1;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.c;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.v;
import com.google.android.material.shape.o;
import com.google.firebase.remoteconfig.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import n1.a;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int Y = 1;
    public static final int Z = 2;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f13032a0 = 3;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f13033b0 = 4;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f13034c0 = 5;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f13035d0 = 6;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f13036e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f13037f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f13038g0 = 2;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f13039h0 = 4;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f13040i0 = 8;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f13041j0 = -1;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f13042k0 = 0;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f13044m0 = 500;

    /* renamed from: n0, reason: collision with root package name */
    private static final float f13045n0 = 0.5f;

    /* renamed from: o0, reason: collision with root package name */
    private static final float f13046o0 = 0.1f;

    /* renamed from: p0, reason: collision with root package name */
    private static final int f13047p0 = 500;

    /* renamed from: q0, reason: collision with root package name */
    private static final int f13048q0 = -1;
    float A;
    int B;
    float C;
    boolean D;
    private boolean E;
    private boolean F;
    int G;

    @q0
    androidx.customview.widget.c H;
    private boolean I;
    private int J;
    private boolean K;
    private int L;
    int M;
    int N;

    @q0
    WeakReference<V> O;

    @q0
    WeakReference<View> P;

    @o0
    private final ArrayList<g> Q;

    @q0
    private VelocityTracker R;
    int S;
    private int T;
    boolean U;

    @q0
    private Map<View, Integer> V;
    private int W;
    private final c.AbstractC0065c X;

    /* renamed from: a, reason: collision with root package name */
    private int f13050a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13051b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13052c;

    /* renamed from: d, reason: collision with root package name */
    private float f13053d;

    /* renamed from: e, reason: collision with root package name */
    private int f13054e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13055f;

    /* renamed from: g, reason: collision with root package name */
    private int f13056g;

    /* renamed from: h, reason: collision with root package name */
    private int f13057h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13058i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.android.material.shape.j f13059j;

    /* renamed from: k, reason: collision with root package name */
    private int f13060k;

    /* renamed from: l, reason: collision with root package name */
    private int f13061l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13062m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13063n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13064o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13065p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13066q;

    /* renamed from: r, reason: collision with root package name */
    private int f13067r;

    /* renamed from: s, reason: collision with root package name */
    private int f13068s;

    /* renamed from: t, reason: collision with root package name */
    private o f13069t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f13070u;

    /* renamed from: v, reason: collision with root package name */
    private BottomSheetBehavior<V>.i f13071v;

    /* renamed from: w, reason: collision with root package name */
    @q0
    private ValueAnimator f13072w;

    /* renamed from: x, reason: collision with root package name */
    int f13073x;

    /* renamed from: y, reason: collision with root package name */
    int f13074y;

    /* renamed from: z, reason: collision with root package name */
    int f13075z;

    /* renamed from: l0, reason: collision with root package name */
    private static final String f13043l0 = ProtectedSandApp.s("⚑");

    /* renamed from: r0, reason: collision with root package name */
    private static final int f13049r0 = a.n.ua;

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        final int f13076q;

        /* renamed from: r, reason: collision with root package name */
        int f13077r;

        /* renamed from: s, reason: collision with root package name */
        boolean f13078s;

        /* renamed from: t, reason: collision with root package name */
        boolean f13079t;

        /* renamed from: u, reason: collision with root package name */
        boolean f13080u;

        /* loaded from: classes2.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @q0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @o0
            public SavedState b(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @o0
            public SavedState[] c(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public Object[] newArray(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(@o0 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f13076q);
            parcel.writeInt(this.f13077r);
            parcel.writeInt(this.f13078s ? 1 : 0);
            parcel.writeInt(this.f13079t ? 1 : 0);
            parcel.writeInt(this.f13080u ? 1 : 0);
        }

        public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13076q = parcel.readInt();
            this.f13077r = parcel.readInt();
            this.f13078s = parcel.readInt() == 1;
            this.f13079t = parcel.readInt() == 1;
            this.f13080u = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @o0 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f13076q = bottomSheetBehavior.G;
            this.f13077r = ((BottomSheetBehavior) bottomSheetBehavior).f13054e;
            this.f13078s = ((BottomSheetBehavior) bottomSheetBehavior).f13051b;
            this.f13079t = bottomSheetBehavior.D;
            this.f13080u = ((BottomSheetBehavior) bottomSheetBehavior).E;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i5) {
            super(parcelable);
            this.f13076q = i5;
        }
    }

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f13081o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f13082p;

        a(View view, ViewGroup.LayoutParams layoutParams) {
            this.f13081o = view;
            this.f13082p = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13081o.setLayoutParams(this.f13082p);
        }
    }

    /* loaded from: classes2.dex */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f13084o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f13085p;

        b(View view, int i5) {
            this.f13084o = view;
            this.f13085p = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.O0(this.f13084o, this.f13085p);
        }
    }

    /* loaded from: classes2.dex */
    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f13059j != null) {
                BottomSheetBehavior.this.f13059j.q0(floatValue);
            }
        }
    }

    class d implements v.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13088a;

        d(boolean z5) {
            this.f13088a = z5;
        }

        @Override // com.google.android.material.internal.v.e
        public v4 a(View view, v4 v4Var, v.f fVar) {
            BottomSheetBehavior.this.f13068s = v4Var.r();
            boolean j5 = v.j(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f13063n) {
                BottomSheetBehavior.this.f13067r = v4Var.o();
                paddingBottom = fVar.f13747d + BottomSheetBehavior.this.f13067r;
            }
            if (BottomSheetBehavior.this.f13064o) {
                paddingLeft = (j5 ? fVar.f13746c : fVar.f13744a) + v4Var.p();
            }
            if (BottomSheetBehavior.this.f13065p) {
                paddingRight = v4Var.q() + (j5 ? fVar.f13744a : fVar.f13746c);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f13088a) {
                BottomSheetBehavior.this.f13061l = v4Var.h().f4816d;
            }
            if (BottomSheetBehavior.this.f13063n || this.f13088a) {
                BottomSheetBehavior.this.V0(false);
            }
            return v4Var;
        }
    }

    class e extends c.AbstractC0065c {
        e() {
        }

        private boolean n(@o0 View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.g0() + bottomSheetBehavior.N) / 2;
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int a(@o0 View view, int i5, int i6) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int b(@o0 View view, int i5, int i6) {
            int g02 = BottomSheetBehavior.this.g0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return o.a.e(i5, g02, bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B);
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int e(@o0 View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B;
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void j(int i5) {
            if (i5 == 1 && BottomSheetBehavior.this.F) {
                BottomSheetBehavior.this.L0(1);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void k(@o0 View view, int i5, int i6, int i7, int i8) {
            BottomSheetBehavior.this.d0(i6);
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void l(@o0 View view, float f6, float f7) {
            int i5;
            int i6 = 6;
            if (f7 < 0.0f) {
                if (BottomSheetBehavior.this.f13051b) {
                    i5 = BottomSheetBehavior.this.f13074y;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i7 = bottomSheetBehavior.f13075z;
                    if (top > i7) {
                        i5 = i7;
                    } else {
                        i5 = bottomSheetBehavior.g0();
                    }
                }
                i6 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.D && bottomSheetBehavior2.Q0(view, f7)) {
                    if ((Math.abs(f6) >= Math.abs(f7) || f7 <= 500.0f) && !n(view)) {
                        if (BottomSheetBehavior.this.f13051b) {
                            i5 = BottomSheetBehavior.this.f13074y;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.g0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f13075z)) {
                            i5 = BottomSheetBehavior.this.g0();
                        } else {
                            i5 = BottomSheetBehavior.this.f13075z;
                        }
                        i6 = 3;
                    } else {
                        i5 = BottomSheetBehavior.this.N;
                        i6 = 5;
                    }
                } else if (f7 == 0.0f || Math.abs(f6) > Math.abs(f7)) {
                    int top2 = view.getTop();
                    if (!BottomSheetBehavior.this.f13051b) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i8 = bottomSheetBehavior3.f13075z;
                        if (top2 < i8) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior3.B)) {
                                i5 = BottomSheetBehavior.this.g0();
                                i6 = 3;
                            } else {
                                i5 = BottomSheetBehavior.this.f13075z;
                            }
                        } else if (Math.abs(top2 - i8) < Math.abs(top2 - BottomSheetBehavior.this.B)) {
                            i5 = BottomSheetBehavior.this.f13075z;
                        } else {
                            i5 = BottomSheetBehavior.this.B;
                            i6 = 4;
                        }
                    } else if (Math.abs(top2 - BottomSheetBehavior.this.f13074y) < Math.abs(top2 - BottomSheetBehavior.this.B)) {
                        i5 = BottomSheetBehavior.this.f13074y;
                        i6 = 3;
                    } else {
                        i5 = BottomSheetBehavior.this.B;
                        i6 = 4;
                    }
                } else {
                    if (BottomSheetBehavior.this.f13051b) {
                        i5 = BottomSheetBehavior.this.B;
                    } else {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.f13075z) < Math.abs(top3 - BottomSheetBehavior.this.B)) {
                            i5 = BottomSheetBehavior.this.f13075z;
                        } else {
                            i5 = BottomSheetBehavior.this.B;
                        }
                    }
                    i6 = 4;
                }
            }
            BottomSheetBehavior.this.R0(view, i6, i5, true);
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public boolean m(@o0 View view, int i5) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i6 = bottomSheetBehavior.G;
            if (i6 == 1 || bottomSheetBehavior.U) {
                return false;
            }
            if (i6 == 3 && bottomSheetBehavior.S == i5) {
                WeakReference<View> weakReference = bottomSheetBehavior.P;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.O;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class f implements m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13091a;

        f(int i5) {
            this.f13091a = i5;
        }

        @Override // androidx.core.view.accessibility.m0
        public boolean a(@o0 View view, @q0 m0.a aVar) {
            BottomSheetBehavior.this.K0(this.f13091a);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class g {
        public abstract void a(@o0 View view, float f6);

        public abstract void b(@o0 View view, int i5);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface h {
    }

    /* loaded from: classes2.dex */
    private class i implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final View f13093o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f13094p;

        /* renamed from: q, reason: collision with root package name */
        int f13095q;

        i(View view, int i5) {
            this.f13093o = view;
            this.f13095q = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.customview.widget.c cVar = BottomSheetBehavior.this.H;
            if (cVar == null || !cVar.o(true)) {
                BottomSheetBehavior.this.L0(this.f13095q);
            } else {
                y1.p1(this.f13093o, this);
            }
            this.f13094p = false;
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface j {
    }

    public BottomSheetBehavior() {
        this.f13050a = 0;
        this.f13051b = true;
        this.f13052c = false;
        this.f13060k = -1;
        this.f13071v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new e();
    }

    private void N0(@o0 View view) {
        boolean z5 = (Build.VERSION.SDK_INT < 29 || s0() || this.f13055f) ? false : true;
        if (this.f13063n || this.f13064o || this.f13065p || z5) {
            v.d(view, new d(z5));
        }
    }

    private void P0(int i5) {
        V v5 = this.O.get();
        if (v5 == null) {
            return;
        }
        ViewParent parent = v5.getParent();
        if (parent != null && parent.isLayoutRequested() && y1.O0(v5)) {
            v5.post(new b(v5, i5));
        } else {
            O0(v5, i5);
        }
    }

    private void S0() {
        V v5;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        y1.r1(v5, 524288);
        y1.r1(v5, 262144);
        y1.r1(v5, 1048576);
        int i5 = this.W;
        if (i5 != -1) {
            y1.r1(v5, i5);
        }
        if (!this.f13051b && this.G != 6) {
            this.W = T(v5, a.m.D, 6);
        }
        if (this.D && this.G != 5) {
            v0(v5, g0.a.f5393z, 5);
        }
        int i6 = this.G;
        if (i6 == 3) {
            v0(v5, g0.a.f5392y, this.f13051b ? 4 : 6);
            return;
        }
        if (i6 == 4) {
            v0(v5, g0.a.f5391x, this.f13051b ? 3 : 6);
        } else {
            if (i6 != 6) {
                return;
            }
            v0(v5, g0.a.f5392y, 4);
            v0(v5, g0.a.f5391x, 3);
        }
    }

    private int T(V v5, @g1 int i5, int i6) {
        return y1.c(v5, v5.getResources().getString(i5), new f(i6));
    }

    private void T0(int i5) {
        ValueAnimator valueAnimator;
        if (i5 == 2) {
            return;
        }
        boolean z5 = i5 == 3;
        if (this.f13070u != z5) {
            this.f13070u = z5;
            if (this.f13059j == null || (valueAnimator = this.f13072w) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f13072w.reverse();
                return;
            }
            float f6 = z5 ? 0.0f : 1.0f;
            this.f13072w.setFloatValues(1.0f - f6, f6);
            this.f13072w.start();
        }
    }

    private void U0(boolean z5) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z5) {
                if (this.V != null) {
                    return;
                } else {
                    this.V = new HashMap(childCount);
                }
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                if (childAt != this.O.get()) {
                    if (z5) {
                        this.V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f13052c) {
                            y1.R1(childAt, 4);
                        }
                    } else if (this.f13052c && (map = this.V) != null && map.containsKey(childAt)) {
                        y1.R1(childAt, this.V.get(childAt).intValue());
                    }
                }
            }
            if (!z5) {
                this.V = null;
            } else if (this.f13052c) {
                this.O.get().sendAccessibilityEvent(8);
            }
        }
    }

    private void V() {
        int X = X();
        if (this.f13051b) {
            this.B = Math.max(this.N - X, this.f13074y);
        } else {
            this.B = this.N - X;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(boolean z5) {
        V v5;
        if (this.O != null) {
            V();
            if (this.G != 4 || (v5 = this.O.get()) == null) {
                return;
            }
            if (z5) {
                P0(this.G);
            } else {
                v5.requestLayout();
            }
        }
    }

    private void W() {
        this.f13075z = (int) ((1.0f - this.A) * this.N);
    }

    private int X() {
        int i5;
        return this.f13055f ? Math.min(Math.max(this.f13056g, this.N - ((this.M * 9) / 16)), this.L) + this.f13067r : (this.f13062m || this.f13063n || (i5 = this.f13061l) <= 0) ? this.f13054e + this.f13067r : Math.max(this.f13054e, i5 + this.f13057h);
    }

    private m0 Y(int i5) {
        return new f(i5);
    }

    private void Z(@o0 Context context, AttributeSet attributeSet, boolean z5) {
        a0(context, attributeSet, z5, null);
    }

    private void a0(@o0 Context context, AttributeSet attributeSet, boolean z5, @q0 ColorStateList colorStateList) {
        if (this.f13058i) {
            this.f13069t = o.e(context, attributeSet, a.c.O0, f13049r0).m();
            com.google.android.material.shape.j jVar = new com.google.android.material.shape.j(this.f13069t);
            this.f13059j = jVar;
            jVar.a0(context);
            if (z5 && colorStateList != null) {
                this.f13059j.p0(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f13059j.setTint(typedValue.data);
        }
    }

    private void b0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f13072w = ofFloat;
        ofFloat.setDuration(500L);
        this.f13072w.addUpdateListener(new c());
    }

    @o0
    public static <V extends View> BottomSheetBehavior<V> f0(@o0 V v5) {
        ViewGroup.LayoutParams layoutParams = v5.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⚓"));
        }
        CoordinatorLayout.Behavior f6 = ((CoordinatorLayout.f) layoutParams).f();
        if (f6 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) f6;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("⚒"));
    }

    private float p0() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f13053d);
        return this.R.getYVelocity(this.S);
    }

    private void v0(V v5, g0.a aVar, int i5) {
        y1.u1(v5, aVar, null, new f(i5));
    }

    private void w0() {
        this.S = -1;
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.R = null;
        }
    }

    private void x0(@o0 SavedState savedState) {
        int i5 = this.f13050a;
        if (i5 == 0) {
            return;
        }
        if (i5 == -1 || (i5 & 1) == 1) {
            this.f13054e = savedState.f13077r;
        }
        if (i5 == -1 || (i5 & 2) == 2) {
            this.f13051b = savedState.f13078s;
        }
        if (i5 == -1 || (i5 & 4) == 4) {
            this.D = savedState.f13079t;
        }
        if (i5 == -1 || (i5 & 8) == 8) {
            this.E = savedState.f13080u;
        }
    }

    public void A0(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⚔"));
        }
        this.f13073x = i5;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean B(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, @o0 View view2, int i5, int i6) {
        this.J = 0;
        this.K = false;
        return (i5 & 2) != 0;
    }

    public void B0(boolean z5) {
        if (this.f13051b == z5) {
            return;
        }
        this.f13051b = z5;
        if (this.O != null) {
            V();
        }
        L0((this.f13051b && this.G == 6) ? 3 : this.G);
        S0();
    }

    public void C0(boolean z5) {
        this.f13062m = z5;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void D(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, int i5) {
        int i6;
        int i7 = 3;
        if (v5.getTop() == g0()) {
            L0(3);
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (weakReference != null && view == weakReference.get() && this.K) {
            if (this.J > 0) {
                if (this.f13051b) {
                    i6 = this.f13074y;
                } else {
                    int top = v5.getTop();
                    int i8 = this.f13075z;
                    if (top > i8) {
                        i7 = 6;
                        i6 = i8;
                    } else {
                        i6 = g0();
                    }
                }
            } else if (this.D && Q0(v5, p0())) {
                i6 = this.N;
                i7 = 5;
            } else if (this.J == 0) {
                int top2 = v5.getTop();
                if (!this.f13051b) {
                    int i9 = this.f13075z;
                    if (top2 < i9) {
                        if (top2 < Math.abs(top2 - this.B)) {
                            i6 = g0();
                        } else {
                            i6 = this.f13075z;
                        }
                    } else if (Math.abs(top2 - i9) < Math.abs(top2 - this.B)) {
                        i6 = this.f13075z;
                    } else {
                        i6 = this.B;
                        i7 = 4;
                    }
                    i7 = 6;
                } else if (Math.abs(top2 - this.f13074y) < Math.abs(top2 - this.B)) {
                    i6 = this.f13074y;
                } else {
                    i6 = this.B;
                    i7 = 4;
                }
            } else {
                if (this.f13051b) {
                    i6 = this.B;
                } else {
                    int top3 = v5.getTop();
                    if (Math.abs(top3 - this.f13075z) < Math.abs(top3 - this.B)) {
                        i6 = this.f13075z;
                        i7 = 6;
                    } else {
                        i6 = this.B;
                    }
                }
                i7 = 4;
            }
            R0(v5, i7, i6, false);
            this.K = false;
        }
    }

    public void D0(@x(from = 0.0d, to = 1.0d) float f6) {
        if (f6 <= 0.0f || f6 >= 1.0f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⚕"));
        }
        this.A = f6;
        if (this.O != null) {
            W();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean E(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 MotionEvent motionEvent) {
        if (!v5.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.G == 1 && actionMasked == 0) {
            return true;
        }
        androidx.customview.widget.c cVar = this.H;
        if (cVar != null) {
            cVar.L(motionEvent);
        }
        if (actionMasked == 0) {
            w0();
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        if (this.H != null && actionMasked == 2 && !this.I && Math.abs(this.T - motionEvent.getY()) > this.H.D()) {
            this.H.d(v5, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.I;
    }

    public void E0(boolean z5) {
        if (this.D != z5) {
            this.D = z5;
            if (!z5 && this.G == 5) {
                K0(4);
            }
            S0();
        }
    }

    public void F0(@u0 int i5) {
        this.f13060k = i5;
    }

    public void G0(int i5) {
        H0(i5, false);
    }

    public final void H0(int i5, boolean z5) {
        boolean z6 = true;
        if (i5 == -1) {
            if (!this.f13055f) {
                this.f13055f = true;
            }
            z6 = false;
        } else {
            if (this.f13055f || this.f13054e != i5) {
                this.f13055f = false;
                this.f13054e = Math.max(0, i5);
            }
            z6 = false;
        }
        if (z6) {
            V0(z5);
        }
    }

    public void I0(int i5) {
        this.f13050a = i5;
    }

    public void J0(boolean z5) {
        this.E = z5;
    }

    public void K0(int i5) {
        if (i5 == this.G) {
            return;
        }
        if (this.O != null) {
            P0(i5);
            return;
        }
        if (i5 == 4 || i5 == 3 || i5 == 6 || (this.D && i5 == 5)) {
            this.G = i5;
        }
    }

    void L0(int i5) {
        V v5;
        if (this.G == i5) {
            return;
        }
        this.G = i5;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        if (i5 == 3) {
            U0(true);
        } else if (i5 == 6 || i5 == 5 || i5 == 4) {
            U0(false);
        }
        T0(i5);
        for (int i6 = 0; i6 < this.Q.size(); i6++) {
            this.Q.get(i6).b(v5, i5);
        }
        S0();
    }

    public void M0(boolean z5) {
        this.f13052c = z5;
    }

    void O0(@o0 View view, int i5) {
        int i6;
        int i7;
        if (i5 == 4) {
            i6 = this.B;
        } else if (i5 == 6) {
            i6 = this.f13075z;
            if (this.f13051b && i6 <= (i7 = this.f13074y)) {
                i5 = 3;
                i6 = i7;
            }
        } else if (i5 == 3) {
            i6 = g0();
        } else {
            if (!this.D || i5 != 5) {
                throw new IllegalArgumentException(s.a(ProtectedSandApp.s("⚖"), i5));
            }
            i6 = this.N;
        }
        R0(view, i5, i6, false);
    }

    boolean Q0(@o0 View view, float f6) {
        if (this.E) {
            return true;
        }
        if (view.getTop() < this.B) {
            return false;
        }
        return Math.abs(((f6 * 0.1f) + ((float) view.getTop())) - ((float) this.B)) / ((float) X()) > 0.5f;
    }

    void R0(View view, int i5, int i6, boolean z5) {
        androidx.customview.widget.c cVar = this.H;
        if (!(cVar != null && (!z5 ? !cVar.V(view, view.getLeft(), i6) : !cVar.T(view.getLeft(), i6)))) {
            L0(i5);
            return;
        }
        L0(2);
        T0(i5);
        if (this.f13071v == null) {
            this.f13071v = new i(view, i5);
        }
        if (((i) this.f13071v).f13094p) {
            this.f13071v.f13095q = i5;
            return;
        }
        BottomSheetBehavior<V>.i iVar = this.f13071v;
        iVar.f13095q = i5;
        y1.p1(view, iVar);
        ((i) this.f13071v).f13094p = true;
    }

    public void U(@o0 g gVar) {
        if (this.Q.contains(gVar)) {
            return;
        }
        this.Q.add(gVar);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @m1
    public void c0() {
        this.f13072w = null;
    }

    void d0(int i5) {
        float f6;
        float f7;
        V v5 = this.O.get();
        if (v5 == null || this.Q.isEmpty()) {
            return;
        }
        int i6 = this.B;
        if (i5 > i6 || i6 == g0()) {
            int i7 = this.B;
            f6 = i7 - i5;
            f7 = this.N - i7;
        } else {
            int i8 = this.B;
            f6 = i8 - i5;
            f7 = i8 - g0();
        }
        float f8 = f6 / f7;
        for (int i9 = 0; i9 < this.Q.size(); i9++) {
            this.Q.get(i9).a(v5, f8);
        }
    }

    @q0
    @m1
    View e0(View view) {
        if (y1.W0(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View e02 = e0(viewGroup.getChildAt(i5));
            if (e02 != null) {
                return e02;
            }
        }
        return null;
    }

    public int g0() {
        if (this.f13051b) {
            return this.f13074y;
        }
        return Math.max(this.f13073x, this.f13066q ? 0 : this.f13068s);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void h(@o0 CoordinatorLayout.f fVar) {
        this.O = null;
        this.H = null;
    }

    @x(from = p.f18289o, to = 1.0d)
    public float h0() {
        return this.A;
    }

    com.google.android.material.shape.j i0() {
        return this.f13059j;
    }

    @u0
    public int j0() {
        return this.f13060k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void k() {
        this.O = null;
        this.H = null;
    }

    public int k0() {
        if (this.f13055f) {
            return -1;
        }
        return this.f13054e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean l(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 MotionEvent motionEvent) {
        androidx.customview.widget.c cVar;
        if (!v5.isShown() || !this.F) {
            this.I = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            w0();
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x5 = (int) motionEvent.getX();
            this.T = (int) motionEvent.getY();
            if (this.G != 2) {
                WeakReference<View> weakReference = this.P;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.P(view, x5, this.T)) {
                    this.S = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.U = true;
                }
            }
            this.I = this.S == -1 && !coordinatorLayout.P(v5, x5, this.T);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.U = false;
            this.S = -1;
            if (this.I) {
                this.I = false;
                return false;
            }
        }
        if (!this.I && (cVar = this.H) != null && cVar.U(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.P;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.I || this.G == 1 || coordinatorLayout.P(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.H == null || Math.abs(((float) this.T) - motionEvent.getY()) <= ((float) this.H.D())) ? false : true;
    }

    @m1
    int l0() {
        return this.f13056g;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, int i5) {
        com.google.android.material.shape.j jVar;
        if (y1.U(coordinatorLayout) && !y1.U(v5)) {
            v5.setFitsSystemWindows(true);
        }
        if (this.O == null) {
            this.f13056g = coordinatorLayout.getResources().getDimensionPixelSize(a.f.f29461d1);
            N0(v5);
            this.O = new WeakReference<>(v5);
            if (this.f13058i && (jVar = this.f13059j) != null) {
                y1.I1(v5, jVar);
            }
            com.google.android.material.shape.j jVar2 = this.f13059j;
            if (jVar2 != null) {
                float f6 = this.C;
                if (f6 == -1.0f) {
                    f6 = y1.R(v5);
                }
                jVar2.o0(f6);
                boolean z5 = this.G == 3;
                this.f13070u = z5;
                this.f13059j.q0(z5 ? 0.0f : 1.0f);
            }
            S0();
            if (y1.V(v5) == 0) {
                y1.R1(v5, 1);
            }
            int measuredWidth = v5.getMeasuredWidth();
            int i6 = this.f13060k;
            if (measuredWidth > i6 && i6 != -1) {
                ViewGroup.LayoutParams layoutParams = v5.getLayoutParams();
                layoutParams.width = this.f13060k;
                v5.post(new a(v5, layoutParams));
            }
        }
        if (this.H == null) {
            this.H = androidx.customview.widget.c.q(coordinatorLayout, this.X);
        }
        int top = v5.getTop();
        coordinatorLayout.W(v5, i5);
        this.M = coordinatorLayout.getWidth();
        this.N = coordinatorLayout.getHeight();
        int height = v5.getHeight();
        this.L = height;
        int i7 = this.N;
        int i8 = i7 - height;
        int i9 = this.f13068s;
        if (i8 < i9) {
            if (this.f13066q) {
                this.L = i7;
            } else {
                this.L = i7 - i9;
            }
        }
        this.f13074y = Math.max(0, i7 - this.L);
        W();
        V();
        int i10 = this.G;
        if (i10 == 3) {
            v5.offsetTopAndBottom(g0());
        } else if (i10 == 6) {
            v5.offsetTopAndBottom(this.f13075z);
        } else if (this.D && i10 == 5) {
            v5.offsetTopAndBottom(this.N);
        } else if (i10 == 4) {
            v5.offsetTopAndBottom(this.B);
        } else if (i10 == 1 || i10 == 2) {
            v5.offsetTopAndBottom(top - v5.getTop());
        }
        this.P = new WeakReference<>(e0(v5));
        return true;
    }

    public int m0() {
        return this.f13050a;
    }

    public boolean n0() {
        return this.E;
    }

    public int o0() {
        return this.G;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean p(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, float f6, float f7) {
        WeakReference<View> weakReference = this.P;
        return (weakReference == null || view != weakReference.get() || this.G == 3) ? false : true;
    }

    public boolean q0() {
        return this.F;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void r(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, int i5, int i6, @o0 int[] iArr, int i7) {
        if (i7 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v5.getTop();
        int i8 = top - i6;
        if (i6 > 0) {
            if (i8 < g0()) {
                int g02 = top - g0();
                iArr[1] = g02;
                y1.f1(v5, -g02);
                L0(3);
            } else {
                if (!this.F) {
                    return;
                }
                iArr[1] = i6;
                y1.f1(v5, -i6);
                L0(1);
            }
        } else if (i6 < 0 && !view.canScrollVertically(-1)) {
            int i9 = this.B;
            if (i8 > i9 && !this.D) {
                int i10 = top - i9;
                iArr[1] = i10;
                y1.f1(v5, -i10);
                L0(4);
            } else {
                if (!this.F) {
                    return;
                }
                iArr[1] = i6;
                y1.f1(v5, -i6);
                L0(1);
            }
        }
        d0(v5.getTop());
        this.J = i6;
        this.K = true;
    }

    public boolean r0() {
        return this.f13051b;
    }

    public boolean s0() {
        return this.f13062m;
    }

    public boolean t0() {
        return this.D;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void u(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, int i5, int i6, int i7, int i8, int i9, @o0 int[] iArr) {
    }

    public void u0(@o0 g gVar) {
        this.Q.remove(gVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void y(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        savedState.a();
        x0(savedState);
        int i5 = savedState.f13076q;
        if (i5 == 1 || i5 == 2) {
            this.G = 4;
        } else {
            this.G = i5;
        }
    }

    @Deprecated
    public void y0(g gVar) {
        this.Q.clear();
        if (gVar != null) {
            this.Q.add(gVar);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @o0
    public Parcelable z(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    public void z0(boolean z5) {
        this.F = z5;
    }

    public BottomSheetBehavior(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        int i5;
        this.f13050a = 0;
        this.f13051b = true;
        this.f13052c = false;
        this.f13060k = -1;
        this.f13071v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new e();
        this.f13057h = context.getResources().getDimensionPixelSize(a.f.f29472e5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.A4);
        this.f13058i = obtainStyledAttributes.hasValue(a.o.R4);
        int i6 = a.o.D4;
        boolean hasValue = obtainStyledAttributes.hasValue(i6);
        if (hasValue) {
            a0(context, attributeSet, hasValue, com.google.android.material.resources.c.a(context, obtainStyledAttributes, i6));
        } else {
            a0(context, attributeSet, hasValue, null);
        }
        b0();
        this.C = obtainStyledAttributes.getDimension(a.o.C4, -1.0f);
        int i7 = a.o.B4;
        if (obtainStyledAttributes.hasValue(i7)) {
            F0(obtainStyledAttributes.getDimensionPixelSize(i7, -1));
        }
        int i8 = a.o.J4;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i8);
        if (peekValue != null && (i5 = peekValue.data) == -1) {
            G0(i5);
        } else {
            G0(obtainStyledAttributes.getDimensionPixelSize(i8, -1));
        }
        E0(obtainStyledAttributes.getBoolean(a.o.I4, false));
        C0(obtainStyledAttributes.getBoolean(a.o.M4, false));
        B0(obtainStyledAttributes.getBoolean(a.o.G4, true));
        J0(obtainStyledAttributes.getBoolean(a.o.L4, false));
        z0(obtainStyledAttributes.getBoolean(a.o.E4, true));
        I0(obtainStyledAttributes.getInt(a.o.K4, 0));
        D0(obtainStyledAttributes.getFloat(a.o.H4, 0.5f));
        int i9 = a.o.F4;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i9);
        if (peekValue2 != null && peekValue2.type == 16) {
            A0(peekValue2.data);
        } else {
            A0(obtainStyledAttributes.getDimensionPixelOffset(i9, 0));
        }
        this.f13063n = obtainStyledAttributes.getBoolean(a.o.N4, false);
        this.f13064o = obtainStyledAttributes.getBoolean(a.o.O4, false);
        this.f13065p = obtainStyledAttributes.getBoolean(a.o.P4, false);
        this.f13066q = obtainStyledAttributes.getBoolean(a.o.Q4, true);
        obtainStyledAttributes.recycle();
        this.f13053d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
