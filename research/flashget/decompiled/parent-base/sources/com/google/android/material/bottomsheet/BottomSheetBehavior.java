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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.h0;
import androidx.core.view.accessibility.o0;
import androidx.core.view.j3;
import androidx.core.view.x1;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.v;
import com.google.android.material.shape.o;
import com.google.firebase.remoteconfig.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import s8.a;

/* loaded from: classes6.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int Y = 1;
    public static final int Z = 2;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f52755a0 = 3;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f52756b0 = 4;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f52757c0 = 5;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f52758d0 = 6;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f52759e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f52760f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f52761g0 = 2;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f52762h0 = 4;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f52763i0 = 8;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f52764j0 = -1;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f52765k0 = 0;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f52767m0 = 500;

    /* renamed from: n0, reason: collision with root package name */
    private static final float f52768n0 = 0.5f;

    /* renamed from: o0, reason: collision with root package name */
    private static final float f52769o0 = 0.1f;

    /* renamed from: p0, reason: collision with root package name */
    private static final int f52770p0 = 500;

    /* renamed from: q0, reason: collision with root package name */
    private static final int f52771q0 = -1;
    float A;
    int B;
    float C;
    boolean D;
    private boolean E;
    private boolean F;
    int G;

    @q0
    androidx.customview.widget.d H;
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
    private final d.c X;

    /* renamed from: a, reason: collision with root package name */
    private int f52773a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f52774b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f52775c;

    /* renamed from: d, reason: collision with root package name */
    private float f52776d;

    /* renamed from: e, reason: collision with root package name */
    private int f52777e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f52778f;

    /* renamed from: g, reason: collision with root package name */
    private int f52779g;

    /* renamed from: h, reason: collision with root package name */
    private int f52780h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f52781i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.android.material.shape.j f52782j;

    /* renamed from: k, reason: collision with root package name */
    private int f52783k;

    /* renamed from: l, reason: collision with root package name */
    private int f52784l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f52785m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f52786n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f52787o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f52788p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f52789q;

    /* renamed from: r, reason: collision with root package name */
    private int f52790r;

    /* renamed from: s, reason: collision with root package name */
    private int f52791s;

    /* renamed from: t, reason: collision with root package name */
    private o f52792t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f52793u;

    /* renamed from: v, reason: collision with root package name */
    private BottomSheetBehavior<V>.i f52794v;

    /* renamed from: w, reason: collision with root package name */
    @q0
    private ValueAnimator f52795w;

    /* renamed from: x, reason: collision with root package name */
    int f52796x;

    /* renamed from: y, reason: collision with root package name */
    int f52797y;

    /* renamed from: z, reason: collision with root package name */
    int f52798z;

    /* renamed from: l0, reason: collision with root package name */
    private static final String f52766l0 = ProtectedSandApp.s("\uf159");

    /* renamed from: r0, reason: collision with root package name */
    private static final int f52772r0 = a.n.f91456ua;

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        final int f52799d;

        /* renamed from: e, reason: collision with root package name */
        int f52800e;

        /* renamed from: f, reason: collision with root package name */
        boolean f52801f;

        /* renamed from: g, reason: collision with root package name */
        boolean f52802g;

        /* renamed from: h, reason: collision with root package name */
        boolean f52803h;

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
            public SavedState[] c(int i4) {
                return new SavedState[i4];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public Object[] newArray(int i4) {
                return new SavedState[i4];
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
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f52799d);
            parcel.writeInt(this.f52800e);
            parcel.writeInt(this.f52801f ? 1 : 0);
            parcel.writeInt(this.f52802g ? 1 : 0);
            parcel.writeInt(this.f52803h ? 1 : 0);
        }

        public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f52799d = parcel.readInt();
            this.f52800e = parcel.readInt();
            this.f52801f = parcel.readInt() == 1;
            this.f52802g = parcel.readInt() == 1;
            this.f52803h = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @o0 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f52799d = bottomSheetBehavior.G;
            this.f52800e = ((BottomSheetBehavior) bottomSheetBehavior).f52777e;
            this.f52801f = ((BottomSheetBehavior) bottomSheetBehavior).f52774b;
            this.f52802g = bottomSheetBehavior.D;
            this.f52803h = ((BottomSheetBehavior) bottomSheetBehavior).E;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i4) {
            super(parcelable);
            this.f52799d = i4;
        }
    }

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f52804b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f52805c;

        a(View view, ViewGroup.LayoutParams layoutParams) {
            this.f52804b = view;
            this.f52805c = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f52804b.setLayoutParams(this.f52805c);
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f52807b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f52808c;

        b(View view, int i4) {
            this.f52807b = view;
            this.f52808c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.O0(this.f52807b, this.f52808c);
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f52782j != null) {
                BottomSheetBehavior.this.f52782j.q0(floatValue);
            }
        }
    }

    class d implements v.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f52811a;

        d(boolean z4) {
            this.f52811a = z4;
        }

        @Override // com.google.android.material.internal.v.e
        public j3 a(View view, j3 j3Var, v.f fVar) {
            BottomSheetBehavior.this.f52791s = j3Var.r();
            boolean j4 = v.j(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f52786n) {
                BottomSheetBehavior.this.f52790r = j3Var.o();
                paddingBottom = fVar.f53541d + BottomSheetBehavior.this.f52790r;
            }
            if (BottomSheetBehavior.this.f52787o) {
                paddingLeft = (j4 ? fVar.f53540c : fVar.f53538a) + j3Var.p();
            }
            if (BottomSheetBehavior.this.f52788p) {
                paddingRight = j3Var.q() + (j4 ? fVar.f53538a : fVar.f53540c);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f52811a) {
                BottomSheetBehavior.this.f52784l = j3Var.h().f26248d;
            }
            if (BottomSheetBehavior.this.f52786n || this.f52811a) {
                BottomSheetBehavior.this.V0(false);
            }
            return j3Var;
        }
    }

    class e extends d.c {
        e() {
        }

        private boolean n(@o0 View view) {
            int top2 = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top2 > (bottomSheetBehavior.g0() + bottomSheetBehavior.N) / 2;
        }

        @Override // androidx.customview.widget.d.c
        public int a(@o0 View view, int i4, int i5) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.d.c
        public int b(@o0 View view, int i4, int i5) {
            int g02 = BottomSheetBehavior.this.g0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return e1.a.e(i4, g02, bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B);
        }

        @Override // androidx.customview.widget.d.c
        public int e(@o0 View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B;
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i4) {
            if (i4 == 1 && BottomSheetBehavior.this.F) {
                BottomSheetBehavior.this.L0(1);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(@o0 View view, int i4, int i5, int i6, int i7) {
            BottomSheetBehavior.this.d0(i5);
        }

        @Override // androidx.customview.widget.d.c
        public void l(@o0 View view, float f4, float f5) {
            int i4;
            int i5 = 6;
            if (f5 < 0.0f) {
                if (BottomSheetBehavior.this.f52774b) {
                    i4 = BottomSheetBehavior.this.f52797y;
                } else {
                    int top2 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i6 = bottomSheetBehavior.f52798z;
                    if (top2 > i6) {
                        i4 = i6;
                    } else {
                        i4 = bottomSheetBehavior.g0();
                    }
                }
                i5 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.D && bottomSheetBehavior2.Q0(view, f5)) {
                    if ((Math.abs(f4) >= Math.abs(f5) || f5 <= 500.0f) && !n(view)) {
                        if (BottomSheetBehavior.this.f52774b) {
                            i4 = BottomSheetBehavior.this.f52797y;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.g0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f52798z)) {
                            i4 = BottomSheetBehavior.this.g0();
                        } else {
                            i4 = BottomSheetBehavior.this.f52798z;
                        }
                        i5 = 3;
                    } else {
                        i4 = BottomSheetBehavior.this.N;
                        i5 = 5;
                    }
                } else if (f5 == 0.0f || Math.abs(f4) > Math.abs(f5)) {
                    int top3 = view.getTop();
                    if (!BottomSheetBehavior.this.f52774b) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i7 = bottomSheetBehavior3.f52798z;
                        if (top3 < i7) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior3.B)) {
                                i4 = BottomSheetBehavior.this.g0();
                                i5 = 3;
                            } else {
                                i4 = BottomSheetBehavior.this.f52798z;
                            }
                        } else if (Math.abs(top3 - i7) < Math.abs(top3 - BottomSheetBehavior.this.B)) {
                            i4 = BottomSheetBehavior.this.f52798z;
                        } else {
                            i4 = BottomSheetBehavior.this.B;
                            i5 = 4;
                        }
                    } else if (Math.abs(top3 - BottomSheetBehavior.this.f52797y) < Math.abs(top3 - BottomSheetBehavior.this.B)) {
                        i4 = BottomSheetBehavior.this.f52797y;
                        i5 = 3;
                    } else {
                        i4 = BottomSheetBehavior.this.B;
                        i5 = 4;
                    }
                } else {
                    if (BottomSheetBehavior.this.f52774b) {
                        i4 = BottomSheetBehavior.this.B;
                    } else {
                        int top4 = view.getTop();
                        if (Math.abs(top4 - BottomSheetBehavior.this.f52798z) < Math.abs(top4 - BottomSheetBehavior.this.B)) {
                            i4 = BottomSheetBehavior.this.f52798z;
                        } else {
                            i4 = BottomSheetBehavior.this.B;
                        }
                    }
                    i5 = 4;
                }
            }
            BottomSheetBehavior.this.R0(view, i5, i4, true);
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(@o0 View view, int i4) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i5 = bottomSheetBehavior.G;
            if (i5 == 1 || bottomSheetBehavior.U) {
                return false;
            }
            if (i5 == 3 && bottomSheetBehavior.S == i4) {
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

    class f implements androidx.core.view.accessibility.o0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52814a;

        f(int i4) {
            this.f52814a = i4;
        }

        @Override // androidx.core.view.accessibility.o0
        public boolean a(@o0 View view, @q0 o0.a aVar) {
            BottomSheetBehavior.this.K0(this.f52814a);
            return true;
        }
    }

    public static abstract class g {
        public abstract void a(@androidx.annotation.o0 View view, float f4);

        public abstract void b(@androidx.annotation.o0 View view, int i4);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    private class i implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final View f52816b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f52817c;

        /* renamed from: d, reason: collision with root package name */
        int f52818d;

        i(View view, int i4) {
            this.f52816b = view;
            this.f52818d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.customview.widget.d dVar = BottomSheetBehavior.this.H;
            if (dVar == null || !dVar.o(true)) {
                BottomSheetBehavior.this.L0(this.f52818d);
            } else {
                x1.v1(this.f52816b, this);
            }
            this.f52817c = false;
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    public BottomSheetBehavior() {
        this.f52773a = 0;
        this.f52774b = true;
        this.f52775c = false;
        this.f52783k = -1;
        this.f52794v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new e();
    }

    private void N0(@androidx.annotation.o0 View view) {
        boolean z4 = (Build.VERSION.SDK_INT < 29 || s0() || this.f52778f) ? false : true;
        if (this.f52786n || this.f52787o || this.f52788p || z4) {
            v.d(view, new d(z4));
        }
    }

    private void P0(int i4) {
        V v4 = this.O.get();
        if (v4 == null) {
            return;
        }
        ViewParent parent = v4.getParent();
        if (parent != null && parent.isLayoutRequested() && x1.R0(v4)) {
            v4.post(new b(v4, i4));
        } else {
            O0(v4, i4);
        }
    }

    private void S0() {
        V v4;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v4 = weakReference.get()) == null) {
            return;
        }
        x1.x1(v4, 524288);
        x1.x1(v4, 262144);
        x1.x1(v4, 1048576);
        int i4 = this.W;
        if (i4 != -1) {
            x1.x1(v4, i4);
        }
        if (!this.f52774b && this.G != 6) {
            this.W = T(v4, a.m.D, 6);
        }
        if (this.D && this.G != 5) {
            v0(v4, h0.a.f27026z, 5);
        }
        int i5 = this.G;
        if (i5 == 3) {
            v0(v4, h0.a.f27025y, this.f52774b ? 4 : 6);
            return;
        }
        if (i5 == 4) {
            v0(v4, h0.a.f27024x, this.f52774b ? 3 : 6);
        } else {
            if (i5 != 6) {
                return;
            }
            v0(v4, h0.a.f27025y, 4);
            v0(v4, h0.a.f27024x, 3);
        }
    }

    private int T(V v4, @g1 int i4, int i5) {
        return x1.c(v4, v4.getResources().getString(i4), new f(i5));
    }

    private void T0(int i4) {
        ValueAnimator valueAnimator;
        if (i4 == 2) {
            return;
        }
        boolean z4 = i4 == 3;
        if (this.f52793u != z4) {
            this.f52793u = z4;
            if (this.f52782j == null || (valueAnimator = this.f52795w) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f52795w.reverse();
                return;
            }
            float f4 = z4 ? 0.0f : 1.0f;
            this.f52795w.setFloatValues(1.0f - f4, f4);
            this.f52795w.start();
        }
    }

    private void U0(boolean z4) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                if (this.V != null) {
                    return;
                } else {
                    this.V = new HashMap(childCount);
                }
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (childAt != this.O.get()) {
                    if (z4) {
                        this.V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f52775c) {
                            x1.Z1(childAt, 4);
                        }
                    } else if (this.f52775c && (map = this.V) != null && map.containsKey(childAt)) {
                        x1.Z1(childAt, this.V.get(childAt).intValue());
                    }
                }
            }
            if (!z4) {
                this.V = null;
            } else if (this.f52775c) {
                this.O.get().sendAccessibilityEvent(8);
            }
        }
    }

    private void V() {
        int X = X();
        if (this.f52774b) {
            this.B = Math.max(this.N - X, this.f52797y);
        } else {
            this.B = this.N - X;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(boolean z4) {
        V v4;
        if (this.O != null) {
            V();
            if (this.G != 4 || (v4 = this.O.get()) == null) {
                return;
            }
            if (z4) {
                P0(this.G);
            } else {
                v4.requestLayout();
            }
        }
    }

    private void W() {
        this.f52798z = (int) ((1.0f - this.A) * this.N);
    }

    private int X() {
        int i4;
        return this.f52778f ? Math.min(Math.max(this.f52779g, this.N - ((this.M * 9) / 16)), this.L) + this.f52790r : (this.f52785m || this.f52786n || (i4 = this.f52784l) <= 0) ? this.f52777e + this.f52790r : Math.max(this.f52777e, i4 + this.f52780h);
    }

    private androidx.core.view.accessibility.o0 Y(int i4) {
        return new f(i4);
    }

    private void Z(@androidx.annotation.o0 Context context, AttributeSet attributeSet, boolean z4) {
        a0(context, attributeSet, z4, null);
    }

    private void a0(@androidx.annotation.o0 Context context, AttributeSet attributeSet, boolean z4, @q0 ColorStateList colorStateList) {
        if (this.f52781i) {
            this.f52792t = o.e(context, attributeSet, a.c.N0, f52772r0).m();
            com.google.android.material.shape.j jVar = new com.google.android.material.shape.j(this.f52792t);
            this.f52782j = jVar;
            jVar.a0(context);
            if (z4 && colorStateList != null) {
                this.f52782j.p0(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f52782j.setTint(typedValue.data);
        }
    }

    private void b0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f52795w = ofFloat;
        ofFloat.setDuration(500L);
        this.f52795w.addUpdateListener(new c());
    }

    @androidx.annotation.o0
    public static <V extends View> BottomSheetBehavior<V> f0(@androidx.annotation.o0 V v4) {
        ViewGroup.LayoutParams layoutParams = v4.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf15b"));
        }
        CoordinatorLayout.Behavior f4 = ((CoordinatorLayout.f) layoutParams).f();
        if (f4 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) f4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\uf15a"));
    }

    private float p0() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f52776d);
        return this.R.getYVelocity(this.S);
    }

    private void v0(V v4, h0.a aVar, int i4) {
        x1.A1(v4, aVar, null, new f(i4));
    }

    private void w0() {
        this.S = -1;
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.R = null;
        }
    }

    private void x0(@androidx.annotation.o0 SavedState savedState) {
        int i4 = this.f52773a;
        if (i4 == 0) {
            return;
        }
        if (i4 == -1 || (i4 & 1) == 1) {
            this.f52777e = savedState.f52800e;
        }
        if (i4 == -1 || (i4 & 2) == 2) {
            this.f52774b = savedState.f52801f;
        }
        if (i4 == -1 || (i4 & 4) == 4) {
            this.D = savedState.f52802g;
        }
        if (i4 == -1 || (i4 & 8) == 8) {
            this.E = savedState.f52803h;
        }
    }

    public void A0(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf15c"));
        }
        this.f52796x = i4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean B(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 V v4, @androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i4, int i5) {
        this.J = 0;
        this.K = false;
        return (i4 & 2) != 0;
    }

    public void B0(boolean z4) {
        if (this.f52774b == z4) {
            return;
        }
        this.f52774b = z4;
        if (this.O != null) {
            V();
        }
        L0((this.f52774b && this.G == 6) ? 3 : this.G);
        S0();
    }

    public void C0(boolean z4) {
        this.f52785m = z4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void D(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 V v4, @androidx.annotation.o0 View view, int i4) {
        int i5;
        int i6 = 3;
        if (v4.getTop() == g0()) {
            L0(3);
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (weakReference != null && view == weakReference.get() && this.K) {
            if (this.J > 0) {
                if (this.f52774b) {
                    i5 = this.f52797y;
                } else {
                    int top2 = v4.getTop();
                    int i7 = this.f52798z;
                    if (top2 > i7) {
                        i6 = 6;
                        i5 = i7;
                    } else {
                        i5 = g0();
                    }
                }
            } else if (this.D && Q0(v4, p0())) {
                i5 = this.N;
                i6 = 5;
            } else if (this.J == 0) {
                int top3 = v4.getTop();
                if (!this.f52774b) {
                    int i10 = this.f52798z;
                    if (top3 < i10) {
                        if (top3 < Math.abs(top3 - this.B)) {
                            i5 = g0();
                        } else {
                            i5 = this.f52798z;
                        }
                    } else if (Math.abs(top3 - i10) < Math.abs(top3 - this.B)) {
                        i5 = this.f52798z;
                    } else {
                        i5 = this.B;
                        i6 = 4;
                    }
                    i6 = 6;
                } else if (Math.abs(top3 - this.f52797y) < Math.abs(top3 - this.B)) {
                    i5 = this.f52797y;
                } else {
                    i5 = this.B;
                    i6 = 4;
                }
            } else {
                if (this.f52774b) {
                    i5 = this.B;
                } else {
                    int top4 = v4.getTop();
                    if (Math.abs(top4 - this.f52798z) < Math.abs(top4 - this.B)) {
                        i5 = this.f52798z;
                        i6 = 6;
                    } else {
                        i5 = this.B;
                    }
                }
                i6 = 4;
            }
            R0(v4, i6, i5, false);
            this.K = false;
        }
    }

    public void D0(@x(from = 0.0d, to = 1.0d) float f4) {
        if (f4 <= 0.0f || f4 >= 1.0f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf15d"));
        }
        this.A = f4;
        if (this.O != null) {
            W();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean E(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 V v4, @androidx.annotation.o0 MotionEvent motionEvent) {
        if (!v4.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.G == 1 && actionMasked == 0) {
            return true;
        }
        androidx.customview.widget.d dVar = this.H;
        if (dVar != null) {
            dVar.M(motionEvent);
        }
        if (actionMasked == 0) {
            w0();
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        if (this.H != null && actionMasked == 2 && !this.I && Math.abs(this.T - motionEvent.getY()) > this.H.E()) {
            this.H.d(v4, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.I;
    }

    public void E0(boolean z4) {
        if (this.D != z4) {
            this.D = z4;
            if (!z4 && this.G == 5) {
                K0(4);
            }
            S0();
        }
    }

    public void F0(@u0 int i4) {
        this.f52783k = i4;
    }

    public void G0(int i4) {
        H0(i4, false);
    }

    public final void H0(int i4, boolean z4) {
        if (i4 == -1) {
            if (this.f52778f) {
                return;
            } else {
                this.f52778f = true;
            }
        } else {
            if (!this.f52778f && this.f52777e == i4) {
                return;
            }
            this.f52778f = false;
            this.f52777e = Math.max(0, i4);
        }
        V0(z4);
    }

    public void I0(int i4) {
        this.f52773a = i4;
    }

    public void J0(boolean z4) {
        this.E = z4;
    }

    public void K0(int i4) {
        if (i4 == this.G) {
            return;
        }
        if (this.O != null) {
            P0(i4);
            return;
        }
        if (i4 == 4 || i4 == 3 || i4 == 6 || (this.D && i4 == 5)) {
            this.G = i4;
        }
    }

    void L0(int i4) {
        V v4;
        if (this.G == i4) {
            return;
        }
        this.G = i4;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v4 = weakReference.get()) == null) {
            return;
        }
        if (i4 == 3) {
            U0(true);
        } else if (i4 == 6 || i4 == 5 || i4 == 4) {
            U0(false);
        }
        T0(i4);
        for (int i5 = 0; i5 < this.Q.size(); i5++) {
            this.Q.get(i5).b(v4, i4);
        }
        S0();
    }

    public void M0(boolean z4) {
        this.f52775c = z4;
    }

    void O0(@androidx.annotation.o0 View view, int i4) {
        int i5;
        int i6;
        if (i4 == 4) {
            i5 = this.B;
        } else if (i4 == 6) {
            i5 = this.f52798z;
            if (this.f52774b && i5 <= (i6 = this.f52797y)) {
                i4 = 3;
                i5 = i6;
            }
        } else if (i4 == 3) {
            i5 = g0();
        } else {
            if (!this.D || i4 != 5) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf15e"), i4));
            }
            i5 = this.N;
        }
        R0(view, i4, i5, false);
    }

    boolean Q0(@androidx.annotation.o0 View view, float f4) {
        if (this.E) {
            return true;
        }
        if (view.getTop() < this.B) {
            return false;
        }
        return Math.abs(((f4 * 0.1f) + ((float) view.getTop())) - ((float) this.B)) / ((float) X()) > 0.5f;
    }

    void R0(View view, int i4, int i5, boolean z4) {
        androidx.customview.widget.d dVar = this.H;
        if (dVar == null || (!z4 ? dVar.X(view, view.getLeft(), i5) : dVar.V(view.getLeft(), i5))) {
            L0(i4);
            return;
        }
        L0(2);
        T0(i4);
        if (this.f52794v == null) {
            this.f52794v = new i(view, i4);
        }
        if (((i) this.f52794v).f52817c) {
            this.f52794v.f52818d = i4;
            return;
        }
        BottomSheetBehavior<V>.i iVar = this.f52794v;
        iVar.f52818d = i4;
        x1.v1(view, iVar);
        ((i) this.f52794v).f52817c = true;
    }

    public void U(@androidx.annotation.o0 g gVar) {
        if (this.Q.contains(gVar)) {
            return;
        }
        this.Q.add(gVar);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @m1
    public void c0() {
        this.f52795w = null;
    }

    void d0(int i4) {
        float f4;
        float f5;
        V v4 = this.O.get();
        if (v4 == null || this.Q.isEmpty()) {
            return;
        }
        int i5 = this.B;
        if (i4 > i5 || i5 == g0()) {
            int i6 = this.B;
            f4 = i6 - i4;
            f5 = this.N - i6;
        } else {
            int i7 = this.B;
            f4 = i7 - i4;
            f5 = i7 - g0();
        }
        float f6 = f4 / f5;
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            this.Q.get(i10).a(v4, f6);
        }
    }

    @q0
    @m1
    View e0(View view) {
        if (x1.a1(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View e02 = e0(viewGroup.getChildAt(i4));
            if (e02 != null) {
                return e02;
            }
        }
        return null;
    }

    public int g0() {
        if (this.f52774b) {
            return this.f52797y;
        }
        return Math.max(this.f52796x, this.f52789q ? 0 : this.f52791s);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void h(@androidx.annotation.o0 CoordinatorLayout.f fVar) {
        this.O = null;
        this.H = null;
    }

    @x(from = p.f60679p, to = 1.0d)
    public float h0() {
        return this.A;
    }

    com.google.android.material.shape.j i0() {
        return this.f52782j;
    }

    @u0
    public int j0() {
        return this.f52783k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void k() {
        this.O = null;
        this.H = null;
    }

    public int k0() {
        if (this.f52778f) {
            return -1;
        }
        return this.f52777e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean l(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 V v4, @androidx.annotation.o0 MotionEvent motionEvent) {
        androidx.customview.widget.d dVar;
        if (!v4.isShown() || !this.F) {
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
            int x4 = (int) motionEvent.getX();
            this.T = (int) motionEvent.getY();
            if (this.G != 2) {
                WeakReference<View> weakReference = this.P;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.M(view, x4, this.T)) {
                    this.S = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.U = true;
                }
            }
            this.I = this.S == -1 && !coordinatorLayout.M(v4, x4, this.T);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.U = false;
            this.S = -1;
            if (this.I) {
                this.I = false;
                return false;
            }
        }
        if (!this.I && (dVar = this.H) != null && dVar.W(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.P;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.I || this.G == 1 || coordinatorLayout.M(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.H == null || Math.abs(((float) this.T) - motionEvent.getY()) <= ((float) this.H.E())) ? false : true;
    }

    @m1
    int l0() {
        return this.f52779g;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 V v4, int i4) {
        com.google.android.material.shape.j jVar;
        if (x1.W(coordinatorLayout) && !v4.getFitsSystemWindows()) {
            v4.setFitsSystemWindows(true);
        }
        if (this.O == null) {
            this.f52779g = coordinatorLayout.getResources().getDimensionPixelSize(a.f.f90786d1);
            N0(v4);
            this.O = new WeakReference<>(v4);
            if (this.f52781i && (jVar = this.f52782j) != null) {
                v4.setBackground(jVar);
            }
            com.google.android.material.shape.j jVar2 = this.f52782j;
            if (jVar2 != null) {
                float f4 = this.C;
                if (f4 == -1.0f) {
                    f4 = x1.T(v4);
                }
                jVar2.o0(f4);
                boolean z4 = this.G == 3;
                this.f52793u = z4;
                this.f52782j.q0(z4 ? 0.0f : 1.0f);
            }
            S0();
            if (v4.getImportantForAccessibility() == 0) {
                v4.setImportantForAccessibility(1);
            }
            int measuredWidth = v4.getMeasuredWidth();
            int i5 = this.f52783k;
            if (measuredWidth > i5 && i5 != -1) {
                ViewGroup.LayoutParams layoutParams = v4.getLayoutParams();
                layoutParams.width = this.f52783k;
                v4.post(new a(v4, layoutParams));
            }
        }
        if (this.H == null) {
            this.H = androidx.customview.widget.d.q(coordinatorLayout, this.X);
        }
        int top2 = v4.getTop();
        coordinatorLayout.T(v4, i4);
        this.M = coordinatorLayout.getWidth();
        this.N = coordinatorLayout.getHeight();
        int height = v4.getHeight();
        this.L = height;
        int i6 = this.N;
        int i7 = i6 - height;
        int i10 = this.f52791s;
        if (i7 < i10) {
            if (this.f52789q) {
                this.L = i6;
            } else {
                this.L = i6 - i10;
            }
        }
        this.f52797y = Math.max(0, i6 - this.L);
        W();
        V();
        int i11 = this.G;
        if (i11 == 3) {
            v4.offsetTopAndBottom(g0());
        } else if (i11 == 6) {
            v4.offsetTopAndBottom(this.f52798z);
        } else if (this.D && i11 == 5) {
            v4.offsetTopAndBottom(this.N);
        } else if (i11 == 4) {
            v4.offsetTopAndBottom(this.B);
        } else if (i11 == 1 || i11 == 2) {
            v4.offsetTopAndBottom(top2 - v4.getTop());
        }
        this.P = new WeakReference<>(e0(v4));
        return true;
    }

    public int m0() {
        return this.f52773a;
    }

    public boolean n0() {
        return this.E;
    }

    public int o0() {
        return this.G;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean p(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 V v4, @androidx.annotation.o0 View view, float f4, float f5) {
        WeakReference<View> weakReference = this.P;
        return (weakReference == null || view != weakReference.get() || this.G == 3) ? false : true;
    }

    public boolean q0() {
        return this.F;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void r(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 V v4, @androidx.annotation.o0 View view, int i4, int i5, @androidx.annotation.o0 int[] iArr, int i6) {
        if (i6 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top2 = v4.getTop();
        int i7 = top2 - i5;
        if (i5 > 0) {
            if (i7 < g0()) {
                int g02 = top2 - g0();
                iArr[1] = g02;
                x1.j1(v4, -g02);
                L0(3);
            } else {
                if (!this.F) {
                    return;
                }
                iArr[1] = i5;
                x1.j1(v4, -i5);
                L0(1);
            }
        } else if (i5 < 0 && !view.canScrollVertically(-1)) {
            int i10 = this.B;
            if (i7 > i10 && !this.D) {
                int i11 = top2 - i10;
                iArr[1] = i11;
                x1.j1(v4, -i11);
                L0(4);
            } else {
                if (!this.F) {
                    return;
                }
                iArr[1] = i5;
                x1.j1(v4, -i5);
                L0(1);
            }
        }
        d0(v4.getTop());
        this.J = i5;
        this.K = true;
    }

    public boolean r0() {
        return this.f52774b;
    }

    public boolean s0() {
        return this.f52785m;
    }

    public boolean t0() {
        return this.D;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void u(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 V v4, @androidx.annotation.o0 View view, int i4, int i5, int i6, int i7, int i10, @androidx.annotation.o0 int[] iArr) {
    }

    public void u0(@androidx.annotation.o0 g gVar) {
        this.Q.remove(gVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void y(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 V v4, @androidx.annotation.o0 Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        savedState.a();
        x0(savedState);
        int i4 = savedState.f52799d;
        if (i4 == 1 || i4 == 2) {
            this.G = 4;
        } else {
            this.G = i4;
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
    @androidx.annotation.o0
    public Parcelable z(@androidx.annotation.o0 CoordinatorLayout coordinatorLayout, @androidx.annotation.o0 V v4) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    public void z0(boolean z4) {
        this.F = z4;
    }

    public BottomSheetBehavior(@androidx.annotation.o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        int i4;
        this.f52773a = 0;
        this.f52774b = true;
        this.f52775c = false;
        this.f52783k = -1;
        this.f52794v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new e();
        this.f52780h = context.getResources().getDimensionPixelSize(a.f.e5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.B4);
        this.f52781i = obtainStyledAttributes.hasValue(a.o.S4);
        int i5 = a.o.E4;
        boolean hasValue = obtainStyledAttributes.hasValue(i5);
        if (hasValue) {
            a0(context, attributeSet, hasValue, com.google.android.material.resources.c.a(context, obtainStyledAttributes, i5));
        } else {
            a0(context, attributeSet, hasValue, null);
        }
        b0();
        this.C = obtainStyledAttributes.getDimension(a.o.D4, -1.0f);
        int i6 = a.o.C4;
        if (obtainStyledAttributes.hasValue(i6)) {
            F0(obtainStyledAttributes.getDimensionPixelSize(i6, -1));
        }
        int i7 = a.o.K4;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i7);
        if (peekValue != null && (i4 = peekValue.data) == -1) {
            G0(i4);
        } else {
            G0(obtainStyledAttributes.getDimensionPixelSize(i7, -1));
        }
        E0(obtainStyledAttributes.getBoolean(a.o.J4, false));
        C0(obtainStyledAttributes.getBoolean(a.o.N4, false));
        B0(obtainStyledAttributes.getBoolean(a.o.H4, true));
        J0(obtainStyledAttributes.getBoolean(a.o.M4, false));
        z0(obtainStyledAttributes.getBoolean(a.o.F4, true));
        I0(obtainStyledAttributes.getInt(a.o.L4, 0));
        D0(obtainStyledAttributes.getFloat(a.o.I4, 0.5f));
        int i10 = a.o.G4;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i10);
        if (peekValue2 != null && peekValue2.type == 16) {
            A0(peekValue2.data);
        } else {
            A0(obtainStyledAttributes.getDimensionPixelOffset(i10, 0));
        }
        this.f52786n = obtainStyledAttributes.getBoolean(a.o.O4, false);
        this.f52787o = obtainStyledAttributes.getBoolean(a.o.P4, false);
        this.f52788p = obtainStyledAttributes.getBoolean(a.o.Q4, false);
        this.f52789q = obtainStyledAttributes.getBoolean(a.o.R4, true);
        obtainStyledAttributes.recycle();
        this.f52776d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
