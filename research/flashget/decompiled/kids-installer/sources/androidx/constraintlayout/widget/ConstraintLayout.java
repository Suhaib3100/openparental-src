package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.solver.h;
import androidx.constraintlayout.solver.widgets.analyzer.b;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.e;
import androidx.constraintlayout.solver.widgets.k;
import androidx.constraintlayout.solver.widgets.m;
import androidx.constraintlayout.widget.f;
import androidx.core.view.y1;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static final String N = "ConstraintLayout-2.0.4";
    private static final String O = "ConstraintLayout";
    private static final boolean P = true;
    private static final boolean Q = false;
    private static final boolean R = false;
    private static final boolean S = false;
    public static final int T = 0;
    private HashMap<String, Integer> A;
    private int B;
    private int C;
    int D;
    int E;
    int F;
    int G;
    private SparseArray<androidx.constraintlayout.solver.widgets.e> H;
    private e I;
    private h J;
    b K;
    private int L;
    private int M;

    /* renamed from: o, reason: collision with root package name */
    SparseArray<View> f2707o;

    /* renamed from: p, reason: collision with root package name */
    private ArrayList<ConstraintHelper> f2708p;

    /* renamed from: q, reason: collision with root package name */
    protected androidx.constraintlayout.solver.widgets.f f2709q;

    /* renamed from: r, reason: collision with root package name */
    private int f2710r;

    /* renamed from: s, reason: collision with root package name */
    private int f2711s;

    /* renamed from: t, reason: collision with root package name */
    private int f2712t;

    /* renamed from: u, reason: collision with root package name */
    private int f2713u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f2714v;

    /* renamed from: w, reason: collision with root package name */
    private int f2715w;

    /* renamed from: x, reason: collision with root package name */
    private d f2716x;

    /* renamed from: y, reason: collision with root package name */
    protected androidx.constraintlayout.widget.b f2717y;

    /* renamed from: z, reason: collision with root package name */
    private int f2718z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2798a;

        static {
            int[] iArr = new int[e.b.values().length];
            f2798a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2798a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2798a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2798a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements b.InterfaceC0021b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f2799a;

        /* renamed from: b, reason: collision with root package name */
        int f2800b;

        /* renamed from: c, reason: collision with root package name */
        int f2801c;

        /* renamed from: d, reason: collision with root package name */
        int f2802d;

        /* renamed from: e, reason: collision with root package name */
        int f2803e;

        /* renamed from: f, reason: collision with root package name */
        int f2804f;

        /* renamed from: g, reason: collision with root package name */
        int f2805g;

        public b(ConstraintLayout constraintLayout) {
            this.f2799a = constraintLayout;
        }

        private boolean d(int i5, int i6, int i7) {
            if (i5 == i6) {
                return ConstraintLayout.P;
            }
            int mode = View.MeasureSpec.getMode(i5);
            View.MeasureSpec.getSize(i5);
            int mode2 = View.MeasureSpec.getMode(i6);
            int size = View.MeasureSpec.getSize(i6);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i7 == size) {
                return ConstraintLayout.P;
            }
            return false;
        }

        @Override // androidx.constraintlayout.solver.widgets.analyzer.b.InterfaceC0021b
        public final void a() {
            int childCount = this.f2799a.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = this.f2799a.getChildAt(i5);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).f(this.f2799a);
                }
            }
            int size = this.f2799a.f2708p.size();
            if (size > 0) {
                for (int i6 = 0; i6 < size; i6++) {
                    ((ConstraintHelper) this.f2799a.f2708p.get(i6)).A(this.f2799a);
                }
            }
        }

        @Override // androidx.constraintlayout.solver.widgets.analyzer.b.InterfaceC0021b
        @SuppressLint({"WrongCall"})
        public final void b(androidx.constraintlayout.solver.widgets.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i5;
            int i6;
            int i7;
            if (eVar == null) {
                return;
            }
            if (eVar.i0() == 8 && !eVar.t0()) {
                aVar.f2381e = 0;
                aVar.f2382f = 0;
                aVar.f2383g = 0;
                return;
            }
            if (eVar.U() == null) {
                return;
            }
            e.b bVar = aVar.f2377a;
            e.b bVar2 = aVar.f2378b;
            int i8 = aVar.f2379c;
            int i9 = aVar.f2380d;
            int i10 = this.f2800b + this.f2801c;
            int i11 = this.f2802d;
            View view = (View) eVar.w();
            int[] iArr = a.f2798a;
            int i12 = iArr[bVar.ordinal()];
            if (i12 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
            } else if (i12 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2804f, i11, -2);
            } else if (i12 == 3) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2804f, eVar.I() + i11, -1);
            } else if (i12 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2804f, i11, -2);
                boolean z5 = eVar.f2540p == 1;
                int i13 = aVar.f2386j;
                if (i13 == b.a.f2375l || i13 == b.a.f2376m) {
                    if (aVar.f2386j == b.a.f2376m || !z5 || (z5 && (view.getMeasuredHeight() == eVar.D())) || (view instanceof Placeholder) || eVar.x0()) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.j0(), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
                    }
                }
            }
            int i14 = iArr[bVar2.ordinal()];
            if (i14 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
            } else if (i14 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2805g, i10, -2);
            } else if (i14 == 3) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2805g, eVar.h0() + i10, -1);
            } else if (i14 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2805g, i10, -2);
                boolean z6 = eVar.f2542q == 1;
                int i15 = aVar.f2386j;
                if (i15 == b.a.f2375l || i15 == b.a.f2376m) {
                    if (aVar.f2386j == b.a.f2376m || !z6 || (z6 && (view.getMeasuredWidth() == eVar.j0())) || (view instanceof Placeholder) || eVar.y0()) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.D(), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
                    }
                }
            }
            androidx.constraintlayout.solver.widgets.f fVar = (androidx.constraintlayout.solver.widgets.f) eVar.U();
            if (fVar != null && k.b(ConstraintLayout.this.f2715w, 256) && view.getMeasuredWidth() == eVar.j0() && view.getMeasuredWidth() < fVar.j0() && view.getMeasuredHeight() == eVar.D() && view.getMeasuredHeight() < fVar.D() && view.getBaseline() == eVar.t() && !eVar.w0()) {
                if (d(eVar.J(), makeMeasureSpec, eVar.j0()) && d(eVar.K(), makeMeasureSpec2, eVar.D())) {
                    aVar.f2381e = eVar.j0();
                    aVar.f2382f = eVar.D();
                    aVar.f2383g = eVar.t();
                    return;
                }
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z7 = bVar == bVar3;
            boolean z8 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z9 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z10 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z11 = z7 && eVar.Y > 0.0f;
            boolean z12 = z8 && eVar.Y > 0.0f;
            if (view == null) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i16 = aVar.f2386j;
            if (i16 != b.a.f2375l && i16 != b.a.f2376m && z7 && eVar.f2540p == 0 && z8 && eVar.f2542q == 0) {
                i7 = -1;
                i6 = 0;
                baseline = 0;
                max = 0;
            } else {
                if ((view instanceof VirtualLayout) && (eVar instanceof m)) {
                    ((VirtualLayout) view).F((m) eVar, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                eVar.o1(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i17 = eVar.f2546s;
                max = i17 > 0 ? Math.max(i17, measuredWidth) : measuredWidth;
                int i18 = eVar.f2548t;
                if (i18 > 0) {
                    max = Math.min(i18, max);
                }
                int i19 = eVar.f2552v;
                if (i19 > 0) {
                    i6 = Math.max(i19, measuredHeight);
                    i5 = makeMeasureSpec;
                } else {
                    i5 = makeMeasureSpec;
                    i6 = measuredHeight;
                }
                int i20 = eVar.f2554w;
                if (i20 > 0) {
                    i6 = Math.min(i20, i6);
                }
                if (!k.b(ConstraintLayout.this.f2715w, 1)) {
                    if (z11 && z9) {
                        max = (int) ((i6 * eVar.Y) + 0.5f);
                    } else if (z12 && z10) {
                        i6 = (int) ((max / eVar.Y) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != i6) {
                    int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g) : i5;
                    if (measuredHeight != i6) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
                    }
                    view.measure(makeMeasureSpec3, makeMeasureSpec2);
                    eVar.o1(makeMeasureSpec3, makeMeasureSpec2);
                    max = view.getMeasuredWidth();
                    i6 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i7 = -1;
            }
            boolean z13 = baseline != i7 ? ConstraintLayout.P : false;
            aVar.f2385i = (max == aVar.f2379c && i6 == aVar.f2380d) ? false : ConstraintLayout.P;
            if (layoutParams.Y) {
                z13 = ConstraintLayout.P;
            }
            if (z13 && baseline != -1 && eVar.t() != baseline) {
                aVar.f2385i = ConstraintLayout.P;
            }
            aVar.f2381e = max;
            aVar.f2382f = i6;
            aVar.f2384h = z13;
            aVar.f2383g = baseline;
        }

        public void c(int i5, int i6, int i7, int i8, int i9, int i10) {
            this.f2800b = i7;
            this.f2801c = i8;
            this.f2802d = i9;
            this.f2803e = i10;
            this.f2804f = i5;
            this.f2805g = i6;
        }
    }

    public ConstraintLayout(@o0 Context context) {
        super(context);
        this.f2707o = new SparseArray<>();
        this.f2708p = new ArrayList<>(4);
        this.f2709q = new androidx.constraintlayout.solver.widgets.f();
        this.f2710r = 0;
        this.f2711s = 0;
        this.f2712t = Integer.MAX_VALUE;
        this.f2713u = Integer.MAX_VALUE;
        this.f2714v = P;
        this.f2715w = 257;
        this.f2716x = null;
        this.f2717y = null;
        this.f2718z = -1;
        this.A = new HashMap<>();
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = 0;
        this.G = 0;
        this.H = new SparseArray<>();
        this.K = new b(this);
        this.L = 0;
        this.M = 0;
        B(null, 0, 0);
    }

    private void B(AttributeSet attributeSet, int i5, int i6) {
        this.f2709q.M0(this);
        this.f2709q.y2(this.K);
        this.f2707o.put(getId(), this);
        this.f2716x = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.m.W5, i5, i6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == f.m.g6) {
                    this.f2710r = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2710r);
                } else if (index == f.m.h6) {
                    this.f2711s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2711s);
                } else if (index == f.m.e6) {
                    this.f2712t = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2712t);
                } else if (index == f.m.f6) {
                    this.f2713u = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2713u);
                } else if (index == f.m.J7) {
                    this.f2715w = obtainStyledAttributes.getInt(index, this.f2715w);
                } else if (index == f.m.K6) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            F(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2717y = null;
                        }
                    }
                } else if (index == f.m.p6) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f2716x = dVar;
                        dVar.n0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2716x = null;
                    }
                    this.f2718z = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2709q.z2(this.f2715w);
    }

    private void E() {
        this.f2714v = P;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = 0;
        this.G = 0;
    }

    private void I() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            androidx.constraintlayout.solver.widgets.e A = A(getChildAt(i5));
            if (A != null) {
                A.F0();
            }
        }
        if (isInEditMode) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    K(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    t(childAt.getId()).O0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2718z != -1) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = getChildAt(i7);
                if (childAt2.getId() == this.f2718z && (childAt2 instanceof Constraints)) {
                    this.f2716x = ((Constraints) childAt2).c();
                }
            }
        }
        d dVar = this.f2716x;
        if (dVar != null) {
            dVar.n(this, P);
        }
        this.f2709q.T1();
        int size = this.f2708p.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                this.f2708p.get(i8).D(this);
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt3 = getChildAt(i9);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).g(this);
            }
        }
        this.H.clear();
        this.H.put(0, this.f2709q);
        this.H.put(getId(), this.f2709q);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt4 = getChildAt(i10);
            this.H.put(childAt4.getId(), A(childAt4));
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt5 = getChildAt(i11);
            androidx.constraintlayout.solver.widgets.e A2 = A(childAt5);
            if (A2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.f2709q.a(A2);
                h(isInEditMode, childAt5, A2, layoutParams, this.H);
            }
        }
    }

    private boolean T() {
        int childCount = getChildCount();
        boolean z5 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            if (getChildAt(i5).isLayoutRequested()) {
                z5 = P;
                break;
            }
            i5++;
        }
        if (z5) {
            I();
        }
        return z5;
    }

    private int s() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    private final androidx.constraintlayout.solver.widgets.e t(int i5) {
        if (i5 == 0) {
            return this.f2709q;
        }
        View view = this.f2707o.get(i5);
        if (view == null && (view = findViewById(i5)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2709q;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2757n0;
    }

    public final androidx.constraintlayout.solver.widgets.e A(View view) {
        if (view == this) {
            return this.f2709q;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2757n0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean C() {
        if (((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection()) {
            return P;
        }
        return false;
    }

    public void D(int i5) {
        if (i5 == 0) {
            this.f2717y = null;
            return;
        }
        try {
            this.f2717y = new androidx.constraintlayout.widget.b(getContext(), this, i5);
        } catch (Resources.NotFoundException unused) {
            this.f2717y = null;
        }
    }

    protected void F(int i5) {
        this.f2717y = new androidx.constraintlayout.widget.b(getContext(), this, i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void G(int i5, int i6, int i7, int i8, boolean z5, boolean z6) {
        b bVar = this.K;
        int i9 = bVar.f2803e;
        int resolveSizeAndState = View.resolveSizeAndState(i7 + bVar.f2802d, i5, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i8 + i9, i6, 0);
        int i10 = resolveSizeAndState & y1.f5757s;
        int i11 = resolveSizeAndState2 & y1.f5757s;
        int min = Math.min(this.f2712t, i10);
        int min2 = Math.min(this.f2713u, i11);
        if (z5) {
            min |= 16777216;
        }
        if (z6) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.B = min;
        this.C = min2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void H(androidx.constraintlayout.solver.widgets.f fVar, int i5, int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i8 = max + max2;
        int s5 = s();
        this.K.c(i6, i7, max, max2, s5, i8);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? C() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i9 = size - s5;
        int i10 = size2 - i8;
        R(fVar, mode, i9, mode2, i10);
        fVar.u2(i5, mode, i9, mode2, i10, this.B, this.C, max5, max);
    }

    public void J(d dVar) {
        this.f2716x = dVar;
    }

    public void K(int i5, Object obj, Object obj2) {
        if (i5 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.A == null) {
                this.A = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.A.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void L(int i5) {
        if (i5 == this.f2713u) {
            return;
        }
        this.f2713u = i5;
        requestLayout();
    }

    public void M(int i5) {
        if (i5 == this.f2712t) {
            return;
        }
        this.f2712t = i5;
        requestLayout();
    }

    public void N(int i5) {
        if (i5 == this.f2711s) {
            return;
        }
        this.f2711s = i5;
        requestLayout();
    }

    public void O(int i5) {
        if (i5 == this.f2710r) {
            return;
        }
        this.f2710r = i5;
        requestLayout();
    }

    public void P(e eVar) {
        this.I = eVar;
        androidx.constraintlayout.widget.b bVar = this.f2717y;
        if (bVar != null) {
            bVar.d(eVar);
        }
    }

    public void Q(int i5) {
        this.f2715w = i5;
        this.f2709q.z2(i5);
    }

    protected void R(androidx.constraintlayout.solver.widgets.f fVar, int i5, int i6, int i7, int i8) {
        e.b bVar;
        b bVar2 = this.K;
        int i9 = bVar2.f2803e;
        int i10 = bVar2.f2802d;
        e.b bVar3 = e.b.FIXED;
        int childCount = getChildCount();
        if (i5 == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i6 = Math.max(0, this.f2710r);
            }
        } else if (i5 == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i6 = Math.max(0, this.f2710r);
            }
            i6 = 0;
        } else if (i5 != 1073741824) {
            bVar = bVar3;
            i6 = 0;
        } else {
            i6 = Math.min(this.f2712t - i10, i6);
            bVar = bVar3;
        }
        if (i7 == Integer.MIN_VALUE) {
            bVar3 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i8 = Math.max(0, this.f2711s);
            }
        } else if (i7 != 0) {
            if (i7 == 1073741824) {
                i8 = Math.min(this.f2713u - i9, i8);
            }
            i8 = 0;
        } else {
            bVar3 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i8 = Math.max(0, this.f2711s);
            }
            i8 = 0;
        }
        if (i6 != fVar.j0() || i8 != fVar.D()) {
            fVar.q2();
        }
        fVar.J1(0);
        fVar.K1(0);
        fVar.r1(this.f2712t - i10);
        fVar.q1(this.f2713u - i9);
        fVar.u1(0);
        fVar.t1(0);
        fVar.i1(bVar);
        fVar.H1(i6);
        fVar.D1(bVar3);
        fVar.d1(i8);
        fVar.u1(this.f2710r - i10);
        fVar.t1(this.f2711s - i9);
    }

    public void S(int i5, int i6, int i7) {
        androidx.constraintlayout.widget.b bVar = this.f2717y;
        if (bVar != null) {
            bVar.e(i5, i6, i7);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i5, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f2708p;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f2708p.get(i5).B(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i7 = (int) ((parseInt / 1080.0f) * width);
                        int i8 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(m.a.f29111c);
                        float f6 = i7;
                        float f7 = i8;
                        float f8 = i7 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f6, f7, f8, f7, paint);
                        float parseInt4 = i8 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f8, f7, f8, parseInt4, paint);
                        canvas.drawLine(f8, parseInt4, f6, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f6, f7, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f6, f7, f8, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f8, f7, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        E();
        super.forceLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(boolean z5, View view, androidx.constraintlayout.solver.widgets.e eVar, LayoutParams layoutParams, SparseArray<androidx.constraintlayout.solver.widgets.e> sparseArray) {
        float f6;
        androidx.constraintlayout.solver.widgets.e eVar2;
        androidx.constraintlayout.solver.widgets.e eVar3;
        androidx.constraintlayout.solver.widgets.e eVar4;
        androidx.constraintlayout.solver.widgets.e eVar5;
        int i5;
        layoutParams.e();
        layoutParams.f2759o0 = false;
        eVar.G1(view.getVisibility());
        if (layoutParams.f2733b0) {
            eVar.m1(P);
            eVar.G1(8);
        }
        eVar.M0(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).u(eVar, this.f2709q.s2());
        }
        if (layoutParams.Z) {
            androidx.constraintlayout.solver.widgets.h hVar = (androidx.constraintlayout.solver.widgets.h) eVar;
            int i6 = layoutParams.f2751k0;
            int i7 = layoutParams.f2753l0;
            float f7 = layoutParams.f2755m0;
            if (f7 != -1.0f) {
                hVar.c2(f7);
                return;
            } else if (i6 != -1) {
                hVar.a2(i6);
                return;
            } else {
                if (i7 != -1) {
                    hVar.b2(i7);
                    return;
                }
                return;
            }
        }
        int i8 = layoutParams.f2737d0;
        int i9 = layoutParams.f2739e0;
        int i10 = layoutParams.f2741f0;
        int i11 = layoutParams.f2743g0;
        int i12 = layoutParams.f2745h0;
        int i13 = layoutParams.f2747i0;
        float f8 = layoutParams.f2749j0;
        int i14 = layoutParams.f2754m;
        if (i14 != -1) {
            androidx.constraintlayout.solver.widgets.e eVar6 = sparseArray.get(i14);
            if (eVar6 != null) {
                eVar.m(eVar6, layoutParams.f2758o, layoutParams.f2756n);
            }
        } else {
            if (i8 != -1) {
                androidx.constraintlayout.solver.widgets.e eVar7 = sparseArray.get(i8);
                if (eVar7 != null) {
                    d.b bVar = d.b.LEFT;
                    f6 = f8;
                    eVar.p0(bVar, eVar7, bVar, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i12);
                } else {
                    f6 = f8;
                }
            } else {
                f6 = f8;
                if (i9 != -1 && (eVar2 = sparseArray.get(i9)) != null) {
                    eVar.p0(d.b.LEFT, eVar2, d.b.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i12);
                }
            }
            if (i10 != -1) {
                androidx.constraintlayout.solver.widgets.e eVar8 = sparseArray.get(i10);
                if (eVar8 != null) {
                    eVar.p0(d.b.RIGHT, eVar8, d.b.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i13);
                }
            } else if (i11 != -1 && (eVar3 = sparseArray.get(i11)) != null) {
                d.b bVar2 = d.b.RIGHT;
                eVar.p0(bVar2, eVar3, bVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i13);
            }
            int i15 = layoutParams.f2744h;
            if (i15 != -1) {
                androidx.constraintlayout.solver.widgets.e eVar9 = sparseArray.get(i15);
                if (eVar9 != null) {
                    d.b bVar3 = d.b.TOP;
                    eVar.p0(bVar3, eVar9, bVar3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f2765u);
                }
            } else {
                int i16 = layoutParams.f2746i;
                if (i16 != -1 && (eVar4 = sparseArray.get(i16)) != null) {
                    eVar.p0(d.b.TOP, eVar4, d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f2765u);
                }
            }
            int i17 = layoutParams.f2748j;
            if (i17 != -1) {
                androidx.constraintlayout.solver.widgets.e eVar10 = sparseArray.get(i17);
                if (eVar10 != null) {
                    eVar.p0(d.b.BOTTOM, eVar10, d.b.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f2767w);
                }
            } else {
                int i18 = layoutParams.f2750k;
                if (i18 != -1 && (eVar5 = sparseArray.get(i18)) != null) {
                    d.b bVar4 = d.b.BOTTOM;
                    eVar.p0(bVar4, eVar5, bVar4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f2767w);
                }
            }
            int i19 = layoutParams.f2752l;
            if (i19 != -1) {
                View view2 = this.f2707o.get(i19);
                androidx.constraintlayout.solver.widgets.e eVar11 = sparseArray.get(layoutParams.f2752l);
                if (eVar11 != null && view2 != null && (view2.getLayoutParams() instanceof LayoutParams)) {
                    LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                    layoutParams.Y = P;
                    layoutParams2.Y = P;
                    d.b bVar5 = d.b.BASELINE;
                    eVar.r(bVar5).b(eVar11.r(bVar5), 0, -1, P);
                    eVar.c1(P);
                    layoutParams2.f2757n0.c1(P);
                    eVar.r(d.b.TOP).x();
                    eVar.r(d.b.BOTTOM).x();
                }
            }
            float f9 = f6;
            if (f9 >= 0.0f) {
                eVar.f1(f9);
            }
            float f10 = layoutParams.A;
            if (f10 >= 0.0f) {
                eVar.A1(f10);
            }
        }
        if (z5 && ((i5 = layoutParams.Q) != -1 || layoutParams.R != -1)) {
            eVar.w1(i5, layoutParams.R);
        }
        if (layoutParams.W) {
            eVar.i1(e.b.FIXED);
            eVar.H1(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                eVar.i1(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            if (layoutParams.T) {
                eVar.i1(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.i1(e.b.MATCH_PARENT);
            }
            eVar.r(d.b.LEFT).f2492g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            eVar.r(d.b.RIGHT).f2492g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            eVar.i1(e.b.MATCH_CONSTRAINT);
            eVar.H1(0);
        }
        if (layoutParams.X) {
            eVar.D1(e.b.FIXED);
            eVar.d1(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                eVar.D1(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            if (layoutParams.U) {
                eVar.D1(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.D1(e.b.MATCH_PARENT);
            }
            eVar.r(d.b.TOP).f2492g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            eVar.r(d.b.BOTTOM).f2492g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            eVar.D1(e.b.MATCH_CONSTRAINT);
            eVar.d1(0);
        }
        eVar.S0(layoutParams.B);
        eVar.k1(layoutParams.E);
        eVar.F1(layoutParams.F);
        eVar.g1(layoutParams.G);
        eVar.B1(layoutParams.H);
        eVar.j1(layoutParams.I, layoutParams.K, layoutParams.M, layoutParams.O);
        eVar.E1(layoutParams.J, layoutParams.L, layoutParams.N, layoutParams.P);
    }

    public void i(h hVar) {
        this.J = hVar;
        this.f2709q.i2(hVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public Object m(int i5, Object obj) {
        if (i5 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.A;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.A.get(str);
    }

    public int n() {
        return this.f2713u;
    }

    public int o() {
        return this.f2712t;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        View a6;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            androidx.constraintlayout.solver.widgets.e eVar = layoutParams.f2757n0;
            if ((childAt.getVisibility() != 8 || layoutParams.Z || layoutParams.f2731a0 || layoutParams.f2735c0 || isInEditMode) && !layoutParams.f2733b0) {
                int k02 = eVar.k0();
                int l02 = eVar.l0();
                int j02 = eVar.j0() + k02;
                int D = eVar.D() + l02;
                childAt.layout(k02, l02, j02, D);
                if ((childAt instanceof Placeholder) && (a6 = ((Placeholder) childAt).a()) != null) {
                    a6.setVisibility(0);
                    a6.layout(k02, l02, j02, D);
                }
            }
        }
        int size = this.f2708p.size();
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f2708p.get(i10).z(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        if (!this.f2714v) {
            int childCount = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                if (getChildAt(i7).isLayoutRequested()) {
                    this.f2714v = P;
                    break;
                }
                i7++;
            }
        }
        if (!this.f2714v) {
            int i8 = this.L;
            if (i8 == i5 && this.M == i6) {
                G(i5, i6, this.f2709q.j0(), this.f2709q.D(), this.f2709q.t2(), this.f2709q.r2());
                return;
            }
            if (i8 == i5 && View.MeasureSpec.getMode(i5) == 1073741824 && View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.M) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i6) >= this.f2709q.D()) {
                this.L = i5;
                this.M = i6;
                G(i5, i6, this.f2709q.j0(), this.f2709q.D(), this.f2709q.t2(), this.f2709q.r2());
                return;
            }
        }
        this.L = i5;
        this.M = i6;
        this.f2709q.B2(C());
        if (this.f2714v) {
            this.f2714v = false;
            if (T()) {
                this.f2709q.D2();
            }
        }
        H(this.f2709q, this.f2715w, i5, i6);
        G(i5, i6, this.f2709q.j0(), this.f2709q.D(), this.f2709q.t2(), this.f2709q.r2());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        androidx.constraintlayout.solver.widgets.e A = A(view);
        if ((view instanceof Guideline) && !(A instanceof androidx.constraintlayout.solver.widgets.h)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.solver.widgets.h hVar = new androidx.constraintlayout.solver.widgets.h();
            layoutParams.f2757n0 = hVar;
            layoutParams.Z = P;
            hVar.f2(layoutParams.S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.E();
            ((LayoutParams) view.getLayoutParams()).f2731a0 = P;
            if (!this.f2708p.contains(constraintHelper)) {
                this.f2708p.add(constraintHelper);
            }
        }
        this.f2707o.put(view.getId(), view);
        this.f2714v = P;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2707o.remove(view.getId());
        this.f2709q.S1(A(view));
        this.f2708p.remove(view);
        this.f2714v = P;
    }

    public int p() {
        return this.f2711s;
    }

    public int q() {
        return this.f2710r;
    }

    public int r() {
        return this.f2709q.l2();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        E();
        super.requestLayout();
    }

    @Override // android.view.View
    public void setId(int i5) {
        this.f2707o.remove(getId());
        super.setId(i5);
        this.f2707o.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public View u(int i5) {
        return this.f2707o.get(i5);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2707o = new SparseArray<>();
        this.f2708p = new ArrayList<>(4);
        this.f2709q = new androidx.constraintlayout.solver.widgets.f();
        this.f2710r = 0;
        this.f2711s = 0;
        this.f2712t = Integer.MAX_VALUE;
        this.f2713u = Integer.MAX_VALUE;
        this.f2714v = P;
        this.f2715w = 257;
        this.f2716x = null;
        this.f2717y = null;
        this.f2718z = -1;
        this.A = new HashMap<>();
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = 0;
        this.G = 0;
        this.H = new SparseArray<>();
        this.K = new b(this);
        this.L = 0;
        this.M = 0;
        B(attributeSet, 0, 0);
    }

    public ConstraintLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f2707o = new SparseArray<>();
        this.f2708p = new ArrayList<>(4);
        this.f2709q = new androidx.constraintlayout.solver.widgets.f();
        this.f2710r = 0;
        this.f2711s = 0;
        this.f2712t = Integer.MAX_VALUE;
        this.f2713u = Integer.MAX_VALUE;
        this.f2714v = P;
        this.f2715w = 257;
        this.f2716x = null;
        this.f2717y = null;
        this.f2718z = -1;
        this.A = new HashMap<>();
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = 0;
        this.G = 0;
        this.H = new SparseArray<>();
        this.K = new b(this);
        this.L = 0;
        this.M = 0;
        B(attributeSet, i5, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        this.f2707o = new SparseArray<>();
        this.f2708p = new ArrayList<>(4);
        this.f2709q = new androidx.constraintlayout.solver.widgets.f();
        this.f2710r = 0;
        this.f2711s = 0;
        this.f2712t = Integer.MAX_VALUE;
        this.f2713u = Integer.MAX_VALUE;
        this.f2714v = P;
        this.f2715w = 257;
        this.f2716x = null;
        this.f2717y = null;
        this.f2718z = -1;
        this.A = new HashMap<>();
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = 0;
        this.G = 0;
        this.H = new SparseArray<>();
        this.K = new b(this);
        this.L = 0;
        this.M = 0;
        B(attributeSet, i5, i6);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int A0 = 7;
        public static final int B0 = 1;
        public static final int C0 = 0;
        public static final int D0 = 2;
        public static final int E0 = 0;
        public static final int F0 = 1;
        public static final int G0 = 2;

        /* renamed from: p0, reason: collision with root package name */
        public static final int f2719p0 = 0;

        /* renamed from: q0, reason: collision with root package name */
        public static final int f2720q0 = 0;

        /* renamed from: r0, reason: collision with root package name */
        public static final int f2721r0 = -1;

        /* renamed from: s0, reason: collision with root package name */
        public static final int f2722s0 = 0;

        /* renamed from: t0, reason: collision with root package name */
        public static final int f2723t0 = 1;

        /* renamed from: u0, reason: collision with root package name */
        public static final int f2724u0 = 1;

        /* renamed from: v0, reason: collision with root package name */
        public static final int f2725v0 = 2;

        /* renamed from: w0, reason: collision with root package name */
        public static final int f2726w0 = 3;

        /* renamed from: x0, reason: collision with root package name */
        public static final int f2727x0 = 4;

        /* renamed from: y0, reason: collision with root package name */
        public static final int f2728y0 = 5;

        /* renamed from: z0, reason: collision with root package name */
        public static final int f2729z0 = 6;
        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* renamed from: a, reason: collision with root package name */
        public int f2730a;

        /* renamed from: a0, reason: collision with root package name */
        boolean f2731a0;

        /* renamed from: b, reason: collision with root package name */
        public int f2732b;

        /* renamed from: b0, reason: collision with root package name */
        boolean f2733b0;

        /* renamed from: c, reason: collision with root package name */
        public float f2734c;

        /* renamed from: c0, reason: collision with root package name */
        boolean f2735c0;

        /* renamed from: d, reason: collision with root package name */
        public int f2736d;

        /* renamed from: d0, reason: collision with root package name */
        int f2737d0;

        /* renamed from: e, reason: collision with root package name */
        public int f2738e;

        /* renamed from: e0, reason: collision with root package name */
        int f2739e0;

        /* renamed from: f, reason: collision with root package name */
        public int f2740f;

        /* renamed from: f0, reason: collision with root package name */
        int f2741f0;

        /* renamed from: g, reason: collision with root package name */
        public int f2742g;

        /* renamed from: g0, reason: collision with root package name */
        int f2743g0;

        /* renamed from: h, reason: collision with root package name */
        public int f2744h;

        /* renamed from: h0, reason: collision with root package name */
        int f2745h0;

        /* renamed from: i, reason: collision with root package name */
        public int f2746i;

        /* renamed from: i0, reason: collision with root package name */
        int f2747i0;

        /* renamed from: j, reason: collision with root package name */
        public int f2748j;

        /* renamed from: j0, reason: collision with root package name */
        float f2749j0;

        /* renamed from: k, reason: collision with root package name */
        public int f2750k;

        /* renamed from: k0, reason: collision with root package name */
        int f2751k0;

        /* renamed from: l, reason: collision with root package name */
        public int f2752l;

        /* renamed from: l0, reason: collision with root package name */
        int f2753l0;

        /* renamed from: m, reason: collision with root package name */
        public int f2754m;

        /* renamed from: m0, reason: collision with root package name */
        float f2755m0;

        /* renamed from: n, reason: collision with root package name */
        public int f2756n;

        /* renamed from: n0, reason: collision with root package name */
        androidx.constraintlayout.solver.widgets.e f2757n0;

        /* renamed from: o, reason: collision with root package name */
        public float f2758o;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f2759o0;

        /* renamed from: p, reason: collision with root package name */
        public int f2760p;

        /* renamed from: q, reason: collision with root package name */
        public int f2761q;

        /* renamed from: r, reason: collision with root package name */
        public int f2762r;

        /* renamed from: s, reason: collision with root package name */
        public int f2763s;

        /* renamed from: t, reason: collision with root package name */
        public int f2764t;

        /* renamed from: u, reason: collision with root package name */
        public int f2765u;

        /* renamed from: v, reason: collision with root package name */
        public int f2766v;

        /* renamed from: w, reason: collision with root package name */
        public int f2767w;

        /* renamed from: x, reason: collision with root package name */
        public int f2768x;

        /* renamed from: y, reason: collision with root package name */
        public int f2769y;

        /* renamed from: z, reason: collision with root package name */
        public float f2770z;

        private static class a {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 31;
            public static final int G = 32;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 47;
            public static final int W = 48;
            public static final int X = 49;
            public static final int Y = 50;
            public static final int Z = 51;

            /* renamed from: a, reason: collision with root package name */
            public static final int f2771a = 0;

            /* renamed from: a0, reason: collision with root package name */
            public static final SparseIntArray f2772a0;

            /* renamed from: b, reason: collision with root package name */
            public static final int f2773b = 1;

            /* renamed from: c, reason: collision with root package name */
            public static final int f2774c = 2;

            /* renamed from: d, reason: collision with root package name */
            public static final int f2775d = 3;

            /* renamed from: e, reason: collision with root package name */
            public static final int f2776e = 4;

            /* renamed from: f, reason: collision with root package name */
            public static final int f2777f = 5;

            /* renamed from: g, reason: collision with root package name */
            public static final int f2778g = 6;

            /* renamed from: h, reason: collision with root package name */
            public static final int f2779h = 7;

            /* renamed from: i, reason: collision with root package name */
            public static final int f2780i = 8;

            /* renamed from: j, reason: collision with root package name */
            public static final int f2781j = 9;

            /* renamed from: k, reason: collision with root package name */
            public static final int f2782k = 10;

            /* renamed from: l, reason: collision with root package name */
            public static final int f2783l = 11;

            /* renamed from: m, reason: collision with root package name */
            public static final int f2784m = 12;

            /* renamed from: n, reason: collision with root package name */
            public static final int f2785n = 13;

            /* renamed from: o, reason: collision with root package name */
            public static final int f2786o = 14;

            /* renamed from: p, reason: collision with root package name */
            public static final int f2787p = 15;

            /* renamed from: q, reason: collision with root package name */
            public static final int f2788q = 16;

            /* renamed from: r, reason: collision with root package name */
            public static final int f2789r = 17;

            /* renamed from: s, reason: collision with root package name */
            public static final int f2790s = 18;

            /* renamed from: t, reason: collision with root package name */
            public static final int f2791t = 19;

            /* renamed from: u, reason: collision with root package name */
            public static final int f2792u = 20;

            /* renamed from: v, reason: collision with root package name */
            public static final int f2793v = 21;

            /* renamed from: w, reason: collision with root package name */
            public static final int f2794w = 22;

            /* renamed from: x, reason: collision with root package name */
            public static final int f2795x = 23;

            /* renamed from: y, reason: collision with root package name */
            public static final int f2796y = 24;

            /* renamed from: z, reason: collision with root package name */
            public static final int f2797z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2772a0 = sparseIntArray;
                sparseIntArray.append(f.m.j7, 8);
                sparseIntArray.append(f.m.k7, 9);
                sparseIntArray.append(f.m.m7, 10);
                sparseIntArray.append(f.m.n7, 11);
                sparseIntArray.append(f.m.t7, 12);
                sparseIntArray.append(f.m.s7, 13);
                sparseIntArray.append(f.m.R6, 14);
                sparseIntArray.append(f.m.Q6, 15);
                sparseIntArray.append(f.m.O6, 16);
                sparseIntArray.append(f.m.S6, 2);
                sparseIntArray.append(f.m.U6, 3);
                sparseIntArray.append(f.m.T6, 4);
                sparseIntArray.append(f.m.B7, 49);
                sparseIntArray.append(f.m.C7, 50);
                sparseIntArray.append(f.m.Y6, 5);
                sparseIntArray.append(f.m.Z6, 6);
                sparseIntArray.append(f.m.a7, 7);
                sparseIntArray.append(f.m.X5, 1);
                sparseIntArray.append(f.m.o7, 17);
                sparseIntArray.append(f.m.p7, 18);
                sparseIntArray.append(f.m.X6, 19);
                sparseIntArray.append(f.m.W6, 20);
                sparseIntArray.append(f.m.F7, 21);
                sparseIntArray.append(f.m.I7, 22);
                sparseIntArray.append(f.m.G7, 23);
                sparseIntArray.append(f.m.D7, 24);
                sparseIntArray.append(f.m.H7, 25);
                sparseIntArray.append(f.m.E7, 26);
                sparseIntArray.append(f.m.f7, 29);
                sparseIntArray.append(f.m.u7, 30);
                sparseIntArray.append(f.m.V6, 44);
                sparseIntArray.append(f.m.h7, 45);
                sparseIntArray.append(f.m.w7, 46);
                sparseIntArray.append(f.m.g7, 47);
                sparseIntArray.append(f.m.v7, 48);
                sparseIntArray.append(f.m.M6, 27);
                sparseIntArray.append(f.m.L6, 28);
                sparseIntArray.append(f.m.x7, 31);
                sparseIntArray.append(f.m.b7, 32);
                sparseIntArray.append(f.m.z7, 33);
                sparseIntArray.append(f.m.y7, 34);
                sparseIntArray.append(f.m.A7, 35);
                sparseIntArray.append(f.m.d7, 36);
                sparseIntArray.append(f.m.c7, 37);
                sparseIntArray.append(f.m.e7, 38);
                sparseIntArray.append(f.m.i7, 39);
                sparseIntArray.append(f.m.r7, 40);
                sparseIntArray.append(f.m.l7, 41);
                sparseIntArray.append(f.m.P6, 42);
                sparseIntArray.append(f.m.N6, 43);
                sparseIntArray.append(f.m.q7, 51);
            }

            private a() {
            }
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f2730a = -1;
            this.f2732b = -1;
            this.f2734c = -1.0f;
            this.f2736d = -1;
            this.f2738e = -1;
            this.f2740f = -1;
            this.f2742g = -1;
            this.f2744h = -1;
            this.f2746i = -1;
            this.f2748j = -1;
            this.f2750k = -1;
            this.f2752l = -1;
            this.f2754m = -1;
            this.f2756n = 0;
            this.f2758o = 0.0f;
            this.f2760p = -1;
            this.f2761q = -1;
            this.f2762r = -1;
            this.f2763s = -1;
            this.f2764t = -1;
            this.f2765u = -1;
            this.f2766v = -1;
            this.f2767w = -1;
            this.f2768x = -1;
            this.f2769y = -1;
            this.f2770z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = ConstraintLayout.P;
            this.X = ConstraintLayout.P;
            this.Y = false;
            this.Z = false;
            this.f2731a0 = false;
            this.f2733b0 = false;
            this.f2735c0 = false;
            this.f2737d0 = -1;
            this.f2739e0 = -1;
            this.f2741f0 = -1;
            this.f2743g0 = -1;
            this.f2745h0 = -1;
            this.f2747i0 = -1;
            this.f2749j0 = 0.5f;
            this.f2757n0 = new androidx.constraintlayout.solver.widgets.e();
            this.f2759o0 = false;
            this.f2730a = layoutParams.f2730a;
            this.f2732b = layoutParams.f2732b;
            this.f2734c = layoutParams.f2734c;
            this.f2736d = layoutParams.f2736d;
            this.f2738e = layoutParams.f2738e;
            this.f2740f = layoutParams.f2740f;
            this.f2742g = layoutParams.f2742g;
            this.f2744h = layoutParams.f2744h;
            this.f2746i = layoutParams.f2746i;
            this.f2748j = layoutParams.f2748j;
            this.f2750k = layoutParams.f2750k;
            this.f2752l = layoutParams.f2752l;
            this.f2754m = layoutParams.f2754m;
            this.f2756n = layoutParams.f2756n;
            this.f2758o = layoutParams.f2758o;
            this.f2760p = layoutParams.f2760p;
            this.f2761q = layoutParams.f2761q;
            this.f2762r = layoutParams.f2762r;
            this.f2763s = layoutParams.f2763s;
            this.f2764t = layoutParams.f2764t;
            this.f2765u = layoutParams.f2765u;
            this.f2766v = layoutParams.f2766v;
            this.f2767w = layoutParams.f2767w;
            this.f2768x = layoutParams.f2768x;
            this.f2769y = layoutParams.f2769y;
            this.f2770z = layoutParams.f2770z;
            this.A = layoutParams.A;
            this.B = layoutParams.B;
            this.C = layoutParams.C;
            this.D = layoutParams.D;
            this.E = layoutParams.E;
            this.F = layoutParams.F;
            this.G = layoutParams.G;
            this.H = layoutParams.H;
            this.T = layoutParams.T;
            this.U = layoutParams.U;
            this.I = layoutParams.I;
            this.J = layoutParams.J;
            this.K = layoutParams.K;
            this.M = layoutParams.M;
            this.L = layoutParams.L;
            this.N = layoutParams.N;
            this.O = layoutParams.O;
            this.P = layoutParams.P;
            this.Q = layoutParams.Q;
            this.R = layoutParams.R;
            this.S = layoutParams.S;
            this.W = layoutParams.W;
            this.X = layoutParams.X;
            this.Y = layoutParams.Y;
            this.Z = layoutParams.Z;
            this.f2737d0 = layoutParams.f2737d0;
            this.f2739e0 = layoutParams.f2739e0;
            this.f2741f0 = layoutParams.f2741f0;
            this.f2743g0 = layoutParams.f2743g0;
            this.f2745h0 = layoutParams.f2745h0;
            this.f2747i0 = layoutParams.f2747i0;
            this.f2749j0 = layoutParams.f2749j0;
            this.V = layoutParams.V;
            this.f2757n0 = layoutParams.f2757n0;
        }

        public String a() {
            return this.V;
        }

        public androidx.constraintlayout.solver.widgets.e b() {
            return this.f2757n0;
        }

        public void c() {
            androidx.constraintlayout.solver.widgets.e eVar = this.f2757n0;
            if (eVar != null) {
                eVar.F0();
            }
        }

        public void d(String str) {
            this.f2757n0.O0(str);
        }

        public void e() {
            this.Z = false;
            this.W = ConstraintLayout.P;
            this.X = ConstraintLayout.P;
            int i5 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i5 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i6 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i6 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i5 == 0 || i5 == -1) {
                this.W = false;
                if (i5 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = ConstraintLayout.P;
                }
            }
            if (i6 == 0 || i6 == -1) {
                this.X = false;
                if (i6 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = ConstraintLayout.P;
                }
            }
            if (this.f2734c == -1.0f && this.f2730a == -1 && this.f2732b == -1) {
                return;
            }
            this.Z = ConstraintLayout.P;
            this.W = ConstraintLayout.P;
            this.X = ConstraintLayout.P;
            if (!(this.f2757n0 instanceof androidx.constraintlayout.solver.widgets.h)) {
                this.f2757n0 = new androidx.constraintlayout.solver.widgets.h();
            }
            ((androidx.constraintlayout.solver.widgets.h) this.f2757n0).f2(this.S);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i5;
            this.f2730a = -1;
            this.f2732b = -1;
            this.f2734c = -1.0f;
            this.f2736d = -1;
            this.f2738e = -1;
            this.f2740f = -1;
            this.f2742g = -1;
            this.f2744h = -1;
            this.f2746i = -1;
            this.f2748j = -1;
            this.f2750k = -1;
            this.f2752l = -1;
            this.f2754m = -1;
            this.f2756n = 0;
            this.f2758o = 0.0f;
            this.f2760p = -1;
            this.f2761q = -1;
            this.f2762r = -1;
            this.f2763s = -1;
            this.f2764t = -1;
            this.f2765u = -1;
            this.f2766v = -1;
            this.f2767w = -1;
            this.f2768x = -1;
            this.f2769y = -1;
            this.f2770z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = ConstraintLayout.P;
            this.X = ConstraintLayout.P;
            this.Y = false;
            this.Z = false;
            this.f2731a0 = false;
            this.f2733b0 = false;
            this.f2735c0 = false;
            this.f2737d0 = -1;
            this.f2739e0 = -1;
            this.f2741f0 = -1;
            this.f2743g0 = -1;
            this.f2745h0 = -1;
            this.f2747i0 = -1;
            this.f2749j0 = 0.5f;
            this.f2757n0 = new androidx.constraintlayout.solver.widgets.e();
            this.f2759o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.m.W5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                int i7 = a.f2772a0.get(index);
                switch (i7) {
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2754m);
                        this.f2754m = resourceId;
                        if (resourceId == -1) {
                            this.f2754m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f2756n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2756n);
                        break;
                    case 4:
                        float f6 = obtainStyledAttributes.getFloat(index, this.f2758o) % 360.0f;
                        this.f2758o = f6;
                        if (f6 < 0.0f) {
                            this.f2758o = (360.0f - f6) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f2730a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2730a);
                        break;
                    case 6:
                        this.f2732b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2732b);
                        break;
                    case 7:
                        this.f2734c = obtainStyledAttributes.getFloat(index, this.f2734c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2736d);
                        this.f2736d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2736d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2738e);
                        this.f2738e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2738e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2740f);
                        this.f2740f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2740f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2742g);
                        this.f2742g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2742g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2744h);
                        this.f2744h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2744h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2746i);
                        this.f2746i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2746i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2748j);
                        this.f2748j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2748j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2750k);
                        this.f2750k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2750k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2752l);
                        this.f2752l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2752l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2760p);
                        this.f2760p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2760p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2761q);
                        this.f2761q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2761q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2762r);
                        this.f2762r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2762r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2763s);
                        this.f2763s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2763s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f2764t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2764t);
                        break;
                    case 22:
                        this.f2765u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2765u);
                        break;
                    case 23:
                        this.f2766v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2766v);
                        break;
                    case 24:
                        this.f2767w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2767w);
                        break;
                    case 25:
                        this.f2768x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2768x);
                        break;
                    case 26:
                        this.f2769y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2769y);
                        break;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        break;
                    case 29:
                        this.f2770z = obtainStyledAttributes.getFloat(index, this.f2770z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        this.I = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.J = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        break;
                    case 36:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        break;
                    default:
                        switch (i7) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i5 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i5 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i5, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.D == 1) {
                                                        this.C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i5);
                                        if (substring4.length() > 0) {
                                            this.C = Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 46:
                                this.F = obtainStyledAttributes.getFloat(index, this.F);
                                break;
                            case 47:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 50:
                                this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                break;
                            case 51:
                                this.V = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            e();
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.f2730a = -1;
            this.f2732b = -1;
            this.f2734c = -1.0f;
            this.f2736d = -1;
            this.f2738e = -1;
            this.f2740f = -1;
            this.f2742g = -1;
            this.f2744h = -1;
            this.f2746i = -1;
            this.f2748j = -1;
            this.f2750k = -1;
            this.f2752l = -1;
            this.f2754m = -1;
            this.f2756n = 0;
            this.f2758o = 0.0f;
            this.f2760p = -1;
            this.f2761q = -1;
            this.f2762r = -1;
            this.f2763s = -1;
            this.f2764t = -1;
            this.f2765u = -1;
            this.f2766v = -1;
            this.f2767w = -1;
            this.f2768x = -1;
            this.f2769y = -1;
            this.f2770z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = ConstraintLayout.P;
            this.X = ConstraintLayout.P;
            this.Y = false;
            this.Z = false;
            this.f2731a0 = false;
            this.f2733b0 = false;
            this.f2735c0 = false;
            this.f2737d0 = -1;
            this.f2739e0 = -1;
            this.f2741f0 = -1;
            this.f2743g0 = -1;
            this.f2745h0 = -1;
            this.f2747i0 = -1;
            this.f2749j0 = 0.5f;
            this.f2757n0 = new androidx.constraintlayout.solver.widgets.e();
            this.f2759o0 = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2730a = -1;
            this.f2732b = -1;
            this.f2734c = -1.0f;
            this.f2736d = -1;
            this.f2738e = -1;
            this.f2740f = -1;
            this.f2742g = -1;
            this.f2744h = -1;
            this.f2746i = -1;
            this.f2748j = -1;
            this.f2750k = -1;
            this.f2752l = -1;
            this.f2754m = -1;
            this.f2756n = 0;
            this.f2758o = 0.0f;
            this.f2760p = -1;
            this.f2761q = -1;
            this.f2762r = -1;
            this.f2763s = -1;
            this.f2764t = -1;
            this.f2765u = -1;
            this.f2766v = -1;
            this.f2767w = -1;
            this.f2768x = -1;
            this.f2769y = -1;
            this.f2770z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = ConstraintLayout.P;
            this.X = ConstraintLayout.P;
            this.Y = false;
            this.Z = false;
            this.f2731a0 = false;
            this.f2733b0 = false;
            this.f2735c0 = false;
            this.f2737d0 = -1;
            this.f2739e0 = -1;
            this.f2741f0 = -1;
            this.f2743g0 = -1;
            this.f2745h0 = -1;
            this.f2747i0 = -1;
            this.f2749j0 = 0.5f;
            this.f2757n0 = new androidx.constraintlayout.solver.widgets.e();
            this.f2759o0 = false;
        }
    }
}
