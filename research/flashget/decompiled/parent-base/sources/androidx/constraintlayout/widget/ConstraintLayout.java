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
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.k;
import androidx.constraintlayout.core.widgets.n;
import androidx.constraintlayout.widget.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static final String A = "ConstraintLayout-2.1.4";
    private static final String B = "ConstraintLayout";
    private static final boolean C = true;
    private static final boolean D = false;
    private static final boolean E = false;
    private static final boolean F = false;
    private static final boolean G = false;
    public static final int H = 0;
    private static h I;

    /* renamed from: b, reason: collision with root package name */
    SparseArray<View> f23789b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<ConstraintHelper> f23790c;

    /* renamed from: d, reason: collision with root package name */
    protected androidx.constraintlayout.core.widgets.f f23791d;

    /* renamed from: e, reason: collision with root package name */
    private int f23792e;

    /* renamed from: f, reason: collision with root package name */
    private int f23793f;

    /* renamed from: g, reason: collision with root package name */
    private int f23794g;

    /* renamed from: h, reason: collision with root package name */
    private int f23795h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f23796i;

    /* renamed from: j, reason: collision with root package name */
    private int f23797j;

    /* renamed from: k, reason: collision with root package name */
    private d f23798k;

    /* renamed from: l, reason: collision with root package name */
    protected androidx.constraintlayout.widget.b f23799l;

    /* renamed from: m, reason: collision with root package name */
    private int f23800m;

    /* renamed from: n, reason: collision with root package name */
    private HashMap<String, Integer> f23801n;

    /* renamed from: o, reason: collision with root package name */
    private int f23802o;

    /* renamed from: p, reason: collision with root package name */
    private int f23803p;

    /* renamed from: q, reason: collision with root package name */
    int f23804q;

    /* renamed from: r, reason: collision with root package name */
    int f23805r;

    /* renamed from: s, reason: collision with root package name */
    int f23806s;

    /* renamed from: t, reason: collision with root package name */
    int f23807t;

    /* renamed from: u, reason: collision with root package name */
    private SparseArray<androidx.constraintlayout.core.widgets.e> f23808u;

    /* renamed from: v, reason: collision with root package name */
    private f f23809v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.constraintlayout.core.g f23810w;

    /* renamed from: x, reason: collision with root package name */
    b f23811x;

    /* renamed from: y, reason: collision with root package name */
    private int f23812y;

    /* renamed from: z, reason: collision with root package name */
    private int f23813z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23900a;

        static {
            int[] iArr = new int[e.b.values().length];
            f23900a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23900a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23900a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23900a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class b implements b.InterfaceC0389b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f23901a;

        /* renamed from: b, reason: collision with root package name */
        int f23902b;

        /* renamed from: c, reason: collision with root package name */
        int f23903c;

        /* renamed from: d, reason: collision with root package name */
        int f23904d;

        /* renamed from: e, reason: collision with root package name */
        int f23905e;

        /* renamed from: f, reason: collision with root package name */
        int f23906f;

        /* renamed from: g, reason: collision with root package name */
        int f23907g;

        public b(ConstraintLayout l4) {
            this.f23901a = l4;
        }

        private boolean d(int lastMeasureSpec, int spec, int widgetSize) {
            if (lastMeasureSpec == spec) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(lastMeasureSpec);
            View.MeasureSpec.getSize(lastMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(spec);
            int size = View.MeasureSpec.getSize(spec);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && widgetSize == size;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0389b
        public final void a() {
            int childCount = this.f23901a.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.f23901a.getChildAt(i4);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).f(this.f23901a);
                }
            }
            int size = this.f23901a.f23790c.size();
            if (size > 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    ((ConstraintHelper) this.f23901a.f23790c.get(i5)).K(this.f23901a);
                }
            }
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0389b
        @SuppressLint({"WrongCall"})
        public final void b(androidx.constraintlayout.core.widgets.e widget, b.a measure) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i4;
            int i5;
            int i6;
            if (widget == null) {
                return;
            }
            if (widget.l0() == 8 && !widget.C0()) {
                measure.f22789e = 0;
                measure.f22790f = 0;
                measure.f22791g = 0;
                return;
            }
            if (widget.U() == null) {
                return;
            }
            e.b bVar = measure.f22785a;
            e.b bVar2 = measure.f22786b;
            int i7 = measure.f22787c;
            int i10 = measure.f22788d;
            int i11 = this.f23902b + this.f23903c;
            int i12 = this.f23904d;
            View view = (View) widget.w();
            int[] iArr = a.f23900a;
            int i13 = iArr[bVar.ordinal()];
            if (i13 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
            } else if (i13 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f23906f, i12, -2);
            } else if (i13 == 3) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f23906f, widget.I() + i12, -1);
            } else if (i13 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f23906f, i12, -2);
                boolean z4 = widget.f22977w == 1;
                int i14 = measure.f22794j;
                if (i14 == b.a.f22783l || i14 == b.a.f22784m) {
                    boolean z5 = view.getMeasuredHeight() == widget.D();
                    if (measure.f22794j == b.a.f22784m || !z4 || ((z4 && z5) || (view instanceof Placeholder) || widget.G0())) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(widget.m0(), 1073741824);
                    }
                }
            }
            int i15 = iArr[bVar2.ordinal()];
            if (i15 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else if (i15 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f23907g, i11, -2);
            } else if (i15 == 3) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f23907g, widget.k0() + i11, -1);
            } else if (i15 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f23907g, i11, -2);
                boolean z6 = widget.f22979x == 1;
                int i16 = measure.f22794j;
                if (i16 == b.a.f22783l || i16 == b.a.f22784m) {
                    boolean z7 = view.getMeasuredWidth() == widget.m0();
                    if (measure.f22794j == b.a.f22784m || !z6 || ((z6 && z7) || (view instanceof Placeholder) || widget.H0())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(widget.D(), 1073741824);
                    }
                }
            }
            androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) widget.U();
            if (fVar != null && k.b(ConstraintLayout.this.f23797j, 256) && view.getMeasuredWidth() == widget.m0() && view.getMeasuredWidth() < fVar.m0() && view.getMeasuredHeight() == widget.D() && view.getMeasuredHeight() < fVar.D() && view.getBaseline() == widget.t() && !widget.F0() && d(widget.J(), makeMeasureSpec, widget.m0()) && d(widget.K(), makeMeasureSpec2, widget.D())) {
                measure.f22789e = widget.m0();
                measure.f22790f = widget.D();
                measure.f22791g = widget.t();
                return;
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z10 = bVar == bVar3;
            boolean z11 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z12 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z13 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z14 = z10 && widget.f22944f0 > 0.0f;
            boolean z15 = z11 && widget.f22944f0 > 0.0f;
            if (view == null) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i17 = measure.f22794j;
            if (i17 != b.a.f22783l && i17 != b.a.f22784m && z10 && widget.f22977w == 0 && z11 && widget.f22979x == 0) {
                i6 = -1;
                i5 = 0;
                baseline = 0;
                max = 0;
            } else {
                if ((view instanceof VirtualLayout) && (widget instanceof n)) {
                    ((VirtualLayout) view).P((n) widget, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                widget.J1(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i18 = widget.f22983z;
                max = i18 > 0 ? Math.max(i18, measuredWidth) : measuredWidth;
                int i19 = widget.A;
                if (i19 > 0) {
                    max = Math.min(i19, max);
                }
                int i20 = widget.C;
                if (i20 > 0) {
                    i5 = Math.max(i20, measuredHeight);
                    i4 = makeMeasureSpec;
                } else {
                    i4 = makeMeasureSpec;
                    i5 = measuredHeight;
                }
                int i21 = widget.D;
                if (i21 > 0) {
                    i5 = Math.min(i21, i5);
                }
                if (!k.b(ConstraintLayout.this.f23797j, 1)) {
                    if (z14 && z12) {
                        max = (int) ((i5 * widget.f22944f0) + 0.5f);
                    } else if (z15 && z13) {
                        i5 = (int) ((max / widget.f22944f0) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != i5) {
                    int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i4;
                    if (measuredHeight != i5) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    }
                    view.measure(makeMeasureSpec3, makeMeasureSpec2);
                    widget.J1(makeMeasureSpec3, makeMeasureSpec2);
                    max = view.getMeasuredWidth();
                    i5 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i6 = -1;
            }
            boolean z16 = baseline != i6;
            measure.f22793i = (max == measure.f22787c && i5 == measure.f22788d) ? false : true;
            if (layoutParams.V2) {
                z16 = true;
            }
            if (z16 && baseline != -1 && widget.t() != baseline) {
                measure.f22793i = true;
            }
            measure.f22789e = max;
            measure.f22790f = i5;
            measure.f22792h = z16;
            measure.f22791g = baseline;
        }

        public void c(int widthSpec, int heightSpec, int top2, int bottom, int width, int height) {
            this.f23902b = top2;
            this.f23903c = bottom;
            this.f23904d = width;
            this.f23905e = height;
            this.f23906f = widthSpec;
            this.f23907g = heightSpec;
        }
    }

    public ConstraintLayout(@o0 Context context) {
        super(context);
        this.f23789b = new SparseArray<>();
        this.f23790c = new ArrayList<>(4);
        this.f23791d = new androidx.constraintlayout.core.widgets.f();
        this.f23792e = 0;
        this.f23793f = 0;
        this.f23794g = Integer.MAX_VALUE;
        this.f23795h = Integer.MAX_VALUE;
        this.f23796i = true;
        this.f23797j = 257;
        this.f23798k = null;
        this.f23799l = null;
        this.f23800m = -1;
        this.f23801n = new HashMap<>();
        this.f23802o = -1;
        this.f23803p = -1;
        this.f23804q = -1;
        this.f23805r = -1;
        this.f23806s = 0;
        this.f23807t = 0;
        this.f23808u = new SparseArray<>();
        this.f23811x = new b(this);
        this.f23812y = 0;
        this.f23813z = 0;
        A(null, 0, 0);
    }

    private void A(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f23791d.h1(this);
        this.f23791d.U2(this.f23811x);
        this.f23789b.put(getId(), this);
        this.f23798k = null;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.x6, defStyleAttr, defStyleRes);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.O6) {
                    this.f23792e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f23792e);
                } else if (index == g.m.P6) {
                    this.f23793f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f23793f);
                } else if (index == g.m.M6) {
                    this.f23794g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f23794g);
                } else if (index == g.m.N6) {
                    this.f23795h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f23795h);
                } else if (index == g.m.H8) {
                    this.f23797j = obtainStyledAttributes.getInt(index, this.f23797j);
                } else if (index == g.m.C7) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            E(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f23799l = null;
                        }
                    }
                } else if (index == g.m.g7) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f23798k = dVar;
                        dVar.w0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f23798k = null;
                    }
                    this.f23800m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f23791d.V2(this.f23797j);
    }

    private void D() {
        this.f23796i = true;
        this.f23802o = -1;
        this.f23803p = -1;
        this.f23804q = -1;
        this.f23805r = -1;
        this.f23806s = 0;
        this.f23807t = 0;
    }

    private void H() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            androidx.constraintlayout.core.widgets.e z4 = z(getChildAt(i4));
            if (z4 != null) {
                z4.R0();
            }
        }
        if (isInEditMode) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    J(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    v(childAt.getId()).j1(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f23800m != -1) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (childAt2.getId() == this.f23800m && (childAt2 instanceof Constraints)) {
                    this.f23798k = ((Constraints) childAt2).c();
                }
            }
        }
        d dVar = this.f23798k;
        if (dVar != null) {
            dVar.t(this, true);
        }
        this.f23791d.p2();
        int size = this.f23790c.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f23790c.get(i7).N(this);
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt3 = getChildAt(i10);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).g(this);
            }
        }
        this.f23808u.clear();
        this.f23808u.put(0, this.f23791d);
        this.f23808u.put(getId(), this.f23791d);
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt4 = getChildAt(i11);
            this.f23808u.put(childAt4.getId(), z(childAt4));
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt5 = getChildAt(i12);
            androidx.constraintlayout.core.widgets.e z5 = z(childAt5);
            if (z5 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.f23791d.a(z5);
                h(isInEditMode, childAt5, z5, layoutParams, this.f23808u);
            }
        }
    }

    private void S(androidx.constraintlayout.core.widgets.e widget, LayoutParams layoutParams, SparseArray<androidx.constraintlayout.core.widgets.e> idToWidget, int baselineTarget, d.b type) {
        View view = this.f23789b.get(baselineTarget);
        androidx.constraintlayout.core.widgets.e eVar = idToWidget.get(baselineTarget);
        if (eVar == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.V2 = true;
        d.b bVar = d.b.BASELINE;
        if (type == bVar) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.V2 = true;
            layoutParams2.f23848k3.x1(true);
        }
        widget.r(bVar).b(eVar.r(type), layoutParams.E, layoutParams.D, true);
        widget.x1(true);
        widget.r(d.b.TOP).x();
        widget.r(d.b.BOTTOM).x();
    }

    private boolean T() {
        int childCount = getChildCount();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            if (getChildAt(i4).isLayoutRequested()) {
                z4 = true;
                break;
            }
            i4++;
        }
        if (z4) {
            H();
        }
        return z4;
    }

    private int r() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static h t() {
        if (I == null) {
            I = new h();
        }
        return I;
    }

    private final androidx.constraintlayout.core.widgets.e v(int id2) {
        if (id2 == 0) {
            return this.f23791d;
        }
        View view = this.f23789b.get(id2);
        if (view == null && (view = findViewById(id2)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f23791d;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f23848k3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean B() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void C(int layoutDescription) {
        if (layoutDescription == 0) {
            this.f23799l = null;
            return;
        }
        try {
            this.f23799l = new androidx.constraintlayout.widget.b(getContext(), this, layoutDescription);
        } catch (Resources.NotFoundException unused) {
            this.f23799l = null;
        }
    }

    protected void E(int id2) {
        this.f23799l = new androidx.constraintlayout.widget.b(getContext(), this, id2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F(int widthMeasureSpec, int heightMeasureSpec, int measuredWidth, int measuredHeight, boolean isWidthMeasuredTooSmall, boolean isHeightMeasuredTooSmall) {
        b bVar = this.f23811x;
        int i4 = bVar.f23905e;
        int resolveSizeAndState = View.resolveSizeAndState(measuredWidth + bVar.f23904d, widthMeasureSpec, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(measuredHeight + i4, heightMeasureSpec, 0) & 16777215;
        int min = Math.min(this.f23794g, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f23795h, resolveSizeAndState2);
        if (isWidthMeasuredTooSmall) {
            min |= 16777216;
        }
        if (isHeightMeasuredTooSmall) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f23802o = min;
        this.f23803p = min2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void G(androidx.constraintlayout.core.widgets.f layout, int optimizationLevel, int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int r4 = r();
        this.f23811x.c(widthMeasureSpec, heightMeasureSpec, max, max2, r4, i4);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? B() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i5 = size - r4;
        int i6 = size2 - i4;
        Q(layout, mode, i5, mode2, i6);
        layout.Q2(optimizationLevel, mode, i5, mode2, i6, this.f23802o, this.f23803p, max5, max);
    }

    public void I(d set) {
        this.f23798k = set;
    }

    public void J(int type, Object value1, Object value2) {
        if (type == 0 && (value1 instanceof String) && (value2 instanceof Integer)) {
            if (this.f23801n == null) {
                this.f23801n = new HashMap<>();
            }
            String str = (String) value1;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) value2;
            num.intValue();
            this.f23801n.put(str, num);
        }
    }

    public void K(int value) {
        if (value == this.f23795h) {
            return;
        }
        this.f23795h = value;
        requestLayout();
    }

    public void L(int value) {
        if (value == this.f23794g) {
            return;
        }
        this.f23794g = value;
        requestLayout();
    }

    public void M(int value) {
        if (value == this.f23793f) {
            return;
        }
        this.f23793f = value;
        requestLayout();
    }

    public void N(int value) {
        if (value == this.f23792e) {
            return;
        }
        this.f23792e = value;
        requestLayout();
    }

    public void O(f constraintsChangedListener) {
        this.f23809v = constraintsChangedListener;
        androidx.constraintlayout.widget.b bVar = this.f23799l;
        if (bVar != null) {
            bVar.d(constraintsChangedListener);
        }
    }

    public void P(int level) {
        this.f23797j = level;
        this.f23791d.V2(level);
    }

    protected void Q(androidx.constraintlayout.core.widgets.f layout, int widthMode, int widthSize, int heightMode, int heightSize) {
        e.b bVar;
        b bVar2 = this.f23811x;
        int i4 = bVar2.f23905e;
        int i5 = bVar2.f23904d;
        e.b bVar3 = e.b.FIXED;
        int childCount = getChildCount();
        if (widthMode == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                widthSize = Math.max(0, this.f23792e);
            }
        } else if (widthMode == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                widthSize = Math.max(0, this.f23792e);
            }
            widthSize = 0;
        } else if (widthMode != 1073741824) {
            bVar = bVar3;
            widthSize = 0;
        } else {
            widthSize = Math.min(this.f23794g - i5, widthSize);
            bVar = bVar3;
        }
        if (heightMode == Integer.MIN_VALUE) {
            bVar3 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                heightSize = Math.max(0, this.f23793f);
            }
        } else if (heightMode != 0) {
            if (heightMode == 1073741824) {
                heightSize = Math.min(this.f23795h - i4, heightSize);
            }
            heightSize = 0;
        } else {
            bVar3 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                heightSize = Math.max(0, this.f23793f);
            }
            heightSize = 0;
        }
        if (widthSize != layout.m0() || heightSize != layout.D()) {
            layout.M2();
        }
        layout.f2(0);
        layout.g2(0);
        layout.M1(this.f23794g - i5);
        layout.L1(this.f23795h - i4);
        layout.P1(0);
        layout.O1(0);
        layout.D1(bVar);
        layout.c2(widthSize);
        layout.Y1(bVar3);
        layout.y1(heightSize);
        layout.P1(this.f23792e - i5);
        layout.O1(this.f23793f - i4);
    }

    public void R(int id2, int screenWidth, int screenHeight) {
        androidx.constraintlayout.widget.b bVar = this.f23799l;
        if (bVar != null) {
            bVar.e(id2, screenWidth, screenHeight);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p4) {
        return p4 instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f23790c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f23790c.get(i4).L(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i6 = (int) ((parseInt / 1080.0f) * width);
                        int i7 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(c1.a.f38447c);
                        float f4 = i6;
                        float f5 = i7;
                        float f6 = i6 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f4, f5, f6, f5, paint);
                        float parseInt4 = i7 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f6, f5, f6, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f4, f5, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f4, f5, f6, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f6, f5, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        D();
        super.forceLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(boolean isInEditMode, View child, androidx.constraintlayout.core.widgets.e widget, LayoutParams layoutParams, SparseArray<androidx.constraintlayout.core.widgets.e> idToWidget) {
        androidx.constraintlayout.core.widgets.e eVar;
        androidx.constraintlayout.core.widgets.e eVar2;
        androidx.constraintlayout.core.widgets.e eVar3;
        androidx.constraintlayout.core.widgets.e eVar4;
        int i4;
        layoutParams.f();
        layoutParams.f23850l3 = false;
        widget.b2(child.getVisibility());
        if (layoutParams.Y2) {
            widget.H1(true);
            widget.b2(8);
        }
        widget.h1(child);
        if (child instanceof ConstraintHelper) {
            ((ConstraintHelper) child).E(widget, this.f23791d.O2());
        }
        if (layoutParams.W2) {
            androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) widget;
            int i5 = layoutParams.f23842h3;
            int i6 = layoutParams.f23844i3;
            float f4 = layoutParams.f23846j3;
            if (f4 != -1.0f) {
                hVar.y2(f4);
                return;
            } else if (i5 != -1) {
                hVar.w2(i5);
                return;
            } else {
                if (i6 != -1) {
                    hVar.x2(i6);
                    return;
                }
                return;
            }
        }
        int i7 = layoutParams.f23828a3;
        int i10 = layoutParams.f23830b3;
        int i11 = layoutParams.f23832c3;
        int i12 = layoutParams.f23834d3;
        int i13 = layoutParams.f23836e3;
        int i14 = layoutParams.f23838f3;
        float f5 = layoutParams.f23840g3;
        int i15 = layoutParams.f23855q;
        if (i15 != -1) {
            androidx.constraintlayout.core.widgets.e eVar5 = idToWidget.get(i15);
            if (eVar5 != null) {
                widget.m(eVar5, layoutParams.f23857s, layoutParams.f23856r);
            }
        } else {
            if (i7 != -1) {
                androidx.constraintlayout.core.widgets.e eVar6 = idToWidget.get(i7);
                if (eVar6 != null) {
                    d.b bVar = d.b.LEFT;
                    widget.v0(bVar, eVar6, bVar, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i13);
                }
            } else if (i10 != -1 && (eVar = idToWidget.get(i10)) != null) {
                widget.v0(d.b.LEFT, eVar, d.b.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i13);
            }
            if (i11 != -1) {
                androidx.constraintlayout.core.widgets.e eVar7 = idToWidget.get(i11);
                if (eVar7 != null) {
                    widget.v0(d.b.RIGHT, eVar7, d.b.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i14);
                }
            } else if (i12 != -1 && (eVar2 = idToWidget.get(i12)) != null) {
                d.b bVar2 = d.b.RIGHT;
                widget.v0(bVar2, eVar2, bVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i14);
            }
            int i16 = layoutParams.f23845j;
            if (i16 != -1) {
                androidx.constraintlayout.core.widgets.e eVar8 = idToWidget.get(i16);
                if (eVar8 != null) {
                    d.b bVar3 = d.b.TOP;
                    widget.v0(bVar3, eVar8, bVar3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f23863y);
                }
            } else {
                int i17 = layoutParams.f23847k;
                if (i17 != -1 && (eVar3 = idToWidget.get(i17)) != null) {
                    widget.v0(d.b.TOP, eVar3, d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f23863y);
                }
            }
            int i18 = layoutParams.f23849l;
            if (i18 != -1) {
                androidx.constraintlayout.core.widgets.e eVar9 = idToWidget.get(i18);
                if (eVar9 != null) {
                    widget.v0(d.b.BOTTOM, eVar9, d.b.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.A);
                }
            } else {
                int i19 = layoutParams.f23851m;
                if (i19 != -1 && (eVar4 = idToWidget.get(i19)) != null) {
                    d.b bVar4 = d.b.BOTTOM;
                    widget.v0(bVar4, eVar4, bVar4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.A);
                }
            }
            int i20 = layoutParams.f23852n;
            if (i20 != -1) {
                S(widget, layoutParams, idToWidget, i20, d.b.BASELINE);
            } else {
                int i21 = layoutParams.f23853o;
                if (i21 != -1) {
                    S(widget, layoutParams, idToWidget, i21, d.b.TOP);
                } else {
                    int i22 = layoutParams.f23854p;
                    if (i22 != -1) {
                        S(widget, layoutParams, idToWidget, i22, d.b.BOTTOM);
                    }
                }
            }
            if (f5 >= 0.0f) {
                widget.A1(f5);
            }
            float f6 = layoutParams.I;
            if (f6 >= 0.0f) {
                widget.V1(f6);
            }
        }
        if (isInEditMode && ((i4 = layoutParams.M2) != -1 || layoutParams.N2 != -1)) {
            widget.R1(i4, layoutParams.N2);
        }
        if (layoutParams.T2) {
            widget.D1(e.b.FIXED);
            widget.c2(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                widget.D1(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            if (layoutParams.P2) {
                widget.D1(e.b.MATCH_CONSTRAINT);
            } else {
                widget.D1(e.b.MATCH_PARENT);
            }
            widget.r(d.b.LEFT).f22903g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            widget.r(d.b.RIGHT).f22903g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            widget.D1(e.b.MATCH_CONSTRAINT);
            widget.c2(0);
        }
        if (layoutParams.U2) {
            widget.Y1(e.b.FIXED);
            widget.y1(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                widget.Y1(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            if (layoutParams.Q2) {
                widget.Y1(e.b.MATCH_CONSTRAINT);
            } else {
                widget.Y1(e.b.MATCH_PARENT);
            }
            widget.r(d.b.TOP).f22903g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            widget.r(d.b.BOTTOM).f22903g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            widget.Y1(e.b.MATCH_CONSTRAINT);
            widget.y1(0);
        }
        widget.n1(layoutParams.J);
        widget.F1(layoutParams.M);
        widget.a2(layoutParams.N);
        widget.B1(layoutParams.O);
        widget.W1(layoutParams.P);
        widget.e2(layoutParams.S2);
        widget.E1(layoutParams.Q, layoutParams.X, layoutParams.Z, layoutParams.V1);
        widget.Z1(layoutParams.R, layoutParams.Y, layoutParams.Q1, layoutParams.L2);
    }

    public void i(androidx.constraintlayout.core.g metrics) {
        this.f23810w = metrics;
        this.f23791d.E2(metrics);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    public Object l(int type, Object value) {
        if (type != 0 || !(value instanceof String)) {
            return null;
        }
        String str = (String) value;
        HashMap<String, Integer> hashMap = this.f23801n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f23801n.get(str);
    }

    public int m() {
        return this.f23795h;
    }

    public int n() {
        return this.f23794g;
    }

    public int o() {
        return this.f23793f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top2, int right, int bottom) {
        View a5;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            androidx.constraintlayout.core.widgets.e eVar = layoutParams.f23848k3;
            if ((childAt.getVisibility() != 8 || layoutParams.W2 || layoutParams.X2 || layoutParams.Z2 || isInEditMode) && !layoutParams.Y2) {
                int o02 = eVar.o0();
                int p02 = eVar.p0();
                int m02 = eVar.m0() + o02;
                int D2 = eVar.D() + p02;
                childAt.layout(o02, p02, m02, D2);
                if ((childAt instanceof Placeholder) && (a5 = ((Placeholder) childAt).a()) != null) {
                    a5.setVisibility(0);
                    a5.layout(o02, p02, m02, D2);
                }
            }
        }
        int size = this.f23790c.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f23790c.get(i5).J(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f23812y == widthMeasureSpec) {
            int i4 = this.f23813z;
        }
        if (!this.f23796i) {
            int childCount = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                if (getChildAt(i5).isLayoutRequested()) {
                    this.f23796i = true;
                    break;
                }
                i5++;
            }
        }
        this.f23812y = widthMeasureSpec;
        this.f23813z = heightMeasureSpec;
        this.f23791d.Y2(B());
        if (this.f23796i) {
            this.f23796i = false;
            if (T()) {
                this.f23791d.a3();
            }
        }
        G(this.f23791d, this.f23797j, widthMeasureSpec, heightMeasureSpec);
        F(widthMeasureSpec, heightMeasureSpec, this.f23791d.m0(), this.f23791d.D(), this.f23791d.P2(), this.f23791d.N2());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        androidx.constraintlayout.core.widgets.e z4 = z(view);
        if ((view instanceof Guideline) && !(z4 instanceof androidx.constraintlayout.core.widgets.h)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.h hVar = new androidx.constraintlayout.core.widgets.h();
            layoutParams.f23848k3 = hVar;
            layoutParams.W2 = true;
            hVar.B2(layoutParams.O2);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.O();
            ((LayoutParams) view.getLayoutParams()).X2 = true;
            if (!this.f23790c.contains(constraintHelper)) {
                this.f23790c.add(constraintHelper);
            }
        }
        this.f23789b.put(view.getId(), view);
        this.f23796i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f23789b.remove(view.getId());
        this.f23791d.o2(z(view));
        this.f23790c.remove(view);
        this.f23796i = true;
    }

    public int p() {
        return this.f23792e;
    }

    public int q() {
        return this.f23791d.H2();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        D();
        super.requestLayout();
    }

    public String s() {
        int id2;
        StringBuilder sb = new StringBuilder();
        if (this.f23791d.f22961o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f23791d.f22961o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f23791d.f22961o = "parent";
            }
        }
        if (this.f23791d.y() == null) {
            androidx.constraintlayout.core.widgets.f fVar = this.f23791d;
            fVar.j1(fVar.f22961o);
            this.f23791d.y();
        }
        Iterator<androidx.constraintlayout.core.widgets.e> it = this.f23791d.l2().iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.e next = it.next();
            View view = (View) next.w();
            if (view != null) {
                if (next.f22961o == null && (id2 = view.getId()) != -1) {
                    next.f22961o = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.y() == null) {
                    next.j1(next.f22961o);
                    next.y();
                }
            }
        }
        this.f23791d.b0(sb);
        return sb.toString();
    }

    @Override // android.view.View
    public void setId(int id2) {
        this.f23789b.remove(getId());
        super.setId(id2);
        this.f23789b.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public View w(int id2) {
        return this.f23789b.get(id2);
    }

    public final androidx.constraintlayout.core.widgets.e z(View view) {
        if (view == this) {
            return this.f23791d;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f23848k3;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f23848k3;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p4) {
        return new LayoutParams(p4);
    }

    public ConstraintLayout(@o0 Context context, @q0 AttributeSet attrs) {
        super(context, attrs);
        this.f23789b = new SparseArray<>();
        this.f23790c = new ArrayList<>(4);
        this.f23791d = new androidx.constraintlayout.core.widgets.f();
        this.f23792e = 0;
        this.f23793f = 0;
        this.f23794g = Integer.MAX_VALUE;
        this.f23795h = Integer.MAX_VALUE;
        this.f23796i = true;
        this.f23797j = 257;
        this.f23798k = null;
        this.f23799l = null;
        this.f23800m = -1;
        this.f23801n = new HashMap<>();
        this.f23802o = -1;
        this.f23803p = -1;
        this.f23804q = -1;
        this.f23805r = -1;
        this.f23806s = 0;
        this.f23807t = 0;
        this.f23808u = new SparseArray<>();
        this.f23811x = new b(this);
        this.f23812y = 0;
        this.f23813z = 0;
        A(attrs, 0, 0);
    }

    public ConstraintLayout(@o0 Context context, @q0 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23789b = new SparseArray<>();
        this.f23790c = new ArrayList<>(4);
        this.f23791d = new androidx.constraintlayout.core.widgets.f();
        this.f23792e = 0;
        this.f23793f = 0;
        this.f23794g = Integer.MAX_VALUE;
        this.f23795h = Integer.MAX_VALUE;
        this.f23796i = true;
        this.f23797j = 257;
        this.f23798k = null;
        this.f23799l = null;
        this.f23800m = -1;
        this.f23801n = new HashMap<>();
        this.f23802o = -1;
        this.f23803p = -1;
        this.f23804q = -1;
        this.f23805r = -1;
        this.f23806s = 0;
        this.f23807t = 0;
        this.f23808u = new SparseArray<>();
        this.f23811x = new b(this);
        this.f23812y = 0;
        this.f23813z = 0;
        A(attrs, defStyleAttr, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@o0 Context context, @q0 AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.f23789b = new SparseArray<>();
        this.f23790c = new ArrayList<>(4);
        this.f23791d = new androidx.constraintlayout.core.widgets.f();
        this.f23792e = 0;
        this.f23793f = 0;
        this.f23794g = Integer.MAX_VALUE;
        this.f23795h = Integer.MAX_VALUE;
        this.f23796i = true;
        this.f23797j = 257;
        this.f23798k = null;
        this.f23799l = null;
        this.f23800m = -1;
        this.f23801n = new HashMap<>();
        this.f23802o = -1;
        this.f23803p = -1;
        this.f23804q = -1;
        this.f23805r = -1;
        this.f23806s = 0;
        this.f23807t = 0;
        this.f23808u = new SparseArray<>();
        this.f23811x = new b(this);
        this.f23812y = 0;
        this.f23813z = 0;
        A(attrs, defStyleAttr, defStyleRes);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int A3 = 1;
        public static final int B3 = 0;
        public static final int C3 = 2;
        public static final int D3 = 0;
        public static final int E3 = 1;
        public static final int F3 = 2;
        public static final int G3 = 0;
        public static final int H3 = 1;
        public static final int I3 = 2;
        public static final int J3 = 3;

        /* renamed from: m3, reason: collision with root package name */
        public static final int f23814m3 = 0;

        /* renamed from: n3, reason: collision with root package name */
        public static final int f23815n3 = 0;

        /* renamed from: o3, reason: collision with root package name */
        public static final int f23816o3 = -1;

        /* renamed from: p3, reason: collision with root package name */
        public static final int f23817p3 = Integer.MIN_VALUE;

        /* renamed from: q3, reason: collision with root package name */
        public static final int f23818q3 = 0;

        /* renamed from: r3, reason: collision with root package name */
        public static final int f23819r3 = 1;

        /* renamed from: s3, reason: collision with root package name */
        public static final int f23820s3 = 1;

        /* renamed from: t3, reason: collision with root package name */
        public static final int f23821t3 = 2;

        /* renamed from: u3, reason: collision with root package name */
        public static final int f23822u3 = 3;

        /* renamed from: v3, reason: collision with root package name */
        public static final int f23823v3 = 4;

        /* renamed from: w3, reason: collision with root package name */
        public static final int f23824w3 = 5;

        /* renamed from: x3, reason: collision with root package name */
        public static final int f23825x3 = 6;

        /* renamed from: y3, reason: collision with root package name */
        public static final int f23826y3 = 7;

        /* renamed from: z3, reason: collision with root package name */
        public static final int f23827z3 = 8;
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        boolean F;
        boolean G;
        public float H;
        public float I;
        public String J;
        float K;
        int L;
        public float L2;
        public float M;
        public int M2;
        public float N;
        public int N2;
        public int O;
        public int O2;
        public int P;
        public boolean P2;
        public int Q;
        public int Q1;
        public boolean Q2;
        public int R;
        public String R2;
        public int S2;
        boolean T2;
        boolean U2;
        public float V1;
        boolean V2;
        boolean W2;
        public int X;
        boolean X2;
        public int Y;
        boolean Y2;
        public int Z;
        boolean Z2;

        /* renamed from: a3, reason: collision with root package name */
        int f23828a3;

        /* renamed from: b, reason: collision with root package name */
        public int f23829b;

        /* renamed from: b3, reason: collision with root package name */
        int f23830b3;

        /* renamed from: c, reason: collision with root package name */
        public int f23831c;

        /* renamed from: c3, reason: collision with root package name */
        int f23832c3;

        /* renamed from: d, reason: collision with root package name */
        public float f23833d;

        /* renamed from: d3, reason: collision with root package name */
        int f23834d3;

        /* renamed from: e, reason: collision with root package name */
        public boolean f23835e;

        /* renamed from: e3, reason: collision with root package name */
        int f23836e3;

        /* renamed from: f, reason: collision with root package name */
        public int f23837f;

        /* renamed from: f3, reason: collision with root package name */
        int f23838f3;

        /* renamed from: g, reason: collision with root package name */
        public int f23839g;

        /* renamed from: g3, reason: collision with root package name */
        float f23840g3;

        /* renamed from: h, reason: collision with root package name */
        public int f23841h;

        /* renamed from: h3, reason: collision with root package name */
        int f23842h3;

        /* renamed from: i, reason: collision with root package name */
        public int f23843i;

        /* renamed from: i3, reason: collision with root package name */
        int f23844i3;

        /* renamed from: j, reason: collision with root package name */
        public int f23845j;

        /* renamed from: j3, reason: collision with root package name */
        float f23846j3;

        /* renamed from: k, reason: collision with root package name */
        public int f23847k;

        /* renamed from: k3, reason: collision with root package name */
        androidx.constraintlayout.core.widgets.e f23848k3;

        /* renamed from: l, reason: collision with root package name */
        public int f23849l;

        /* renamed from: l3, reason: collision with root package name */
        public boolean f23850l3;

        /* renamed from: m, reason: collision with root package name */
        public int f23851m;

        /* renamed from: n, reason: collision with root package name */
        public int f23852n;

        /* renamed from: o, reason: collision with root package name */
        public int f23853o;

        /* renamed from: p, reason: collision with root package name */
        public int f23854p;

        /* renamed from: q, reason: collision with root package name */
        public int f23855q;

        /* renamed from: r, reason: collision with root package name */
        public int f23856r;

        /* renamed from: s, reason: collision with root package name */
        public float f23857s;

        /* renamed from: t, reason: collision with root package name */
        public int f23858t;

        /* renamed from: u, reason: collision with root package name */
        public int f23859u;

        /* renamed from: v, reason: collision with root package name */
        public int f23860v;

        /* renamed from: w, reason: collision with root package name */
        public int f23861w;

        /* renamed from: x, reason: collision with root package name */
        public int f23862x;

        /* renamed from: y, reason: collision with root package name */
        public int f23863y;

        /* renamed from: z, reason: collision with root package name */
        public int f23864z;

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
            public static final int f23865a = 0;

            /* renamed from: a0, reason: collision with root package name */
            public static final int f23866a0 = 52;

            /* renamed from: b, reason: collision with root package name */
            public static final int f23867b = 1;

            /* renamed from: b0, reason: collision with root package name */
            public static final int f23868b0 = 53;

            /* renamed from: c, reason: collision with root package name */
            public static final int f23869c = 2;

            /* renamed from: c0, reason: collision with root package name */
            public static final int f23870c0 = 54;

            /* renamed from: d, reason: collision with root package name */
            public static final int f23871d = 3;

            /* renamed from: d0, reason: collision with root package name */
            public static final int f23872d0 = 55;

            /* renamed from: e, reason: collision with root package name */
            public static final int f23873e = 4;

            /* renamed from: e0, reason: collision with root package name */
            public static final int f23874e0 = 64;

            /* renamed from: f, reason: collision with root package name */
            public static final int f23875f = 5;

            /* renamed from: f0, reason: collision with root package name */
            public static final int f23876f0 = 65;

            /* renamed from: g, reason: collision with root package name */
            public static final int f23877g = 6;

            /* renamed from: g0, reason: collision with root package name */
            public static final int f23878g0 = 66;

            /* renamed from: h, reason: collision with root package name */
            public static final int f23879h = 7;

            /* renamed from: h0, reason: collision with root package name */
            public static final int f23880h0 = 67;

            /* renamed from: i, reason: collision with root package name */
            public static final int f23881i = 8;

            /* renamed from: i0, reason: collision with root package name */
            public static final SparseIntArray f23882i0;

            /* renamed from: j, reason: collision with root package name */
            public static final int f23883j = 9;

            /* renamed from: k, reason: collision with root package name */
            public static final int f23884k = 10;

            /* renamed from: l, reason: collision with root package name */
            public static final int f23885l = 11;

            /* renamed from: m, reason: collision with root package name */
            public static final int f23886m = 12;

            /* renamed from: n, reason: collision with root package name */
            public static final int f23887n = 13;

            /* renamed from: o, reason: collision with root package name */
            public static final int f23888o = 14;

            /* renamed from: p, reason: collision with root package name */
            public static final int f23889p = 15;

            /* renamed from: q, reason: collision with root package name */
            public static final int f23890q = 16;

            /* renamed from: r, reason: collision with root package name */
            public static final int f23891r = 17;

            /* renamed from: s, reason: collision with root package name */
            public static final int f23892s = 18;

            /* renamed from: t, reason: collision with root package name */
            public static final int f23893t = 19;

            /* renamed from: u, reason: collision with root package name */
            public static final int f23894u = 20;

            /* renamed from: v, reason: collision with root package name */
            public static final int f23895v = 21;

            /* renamed from: w, reason: collision with root package name */
            public static final int f23896w = 22;

            /* renamed from: x, reason: collision with root package name */
            public static final int f23897x = 23;

            /* renamed from: y, reason: collision with root package name */
            public static final int f23898y = 24;

            /* renamed from: z, reason: collision with root package name */
            public static final int f23899z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f23882i0 = sparseIntArray;
                sparseIntArray.append(g.m.f25187s8, 64);
                sparseIntArray.append(g.m.V7, 65);
                sparseIntArray.append(g.m.f25001e8, 8);
                sparseIntArray.append(g.m.f25014f8, 9);
                sparseIntArray.append(g.m.f25040h8, 10);
                sparseIntArray.append(g.m.f25053i8, 11);
                sparseIntArray.append(g.m.f25132o8, 12);
                sparseIntArray.append(g.m.f25118n8, 13);
                sparseIntArray.append(g.m.L7, 14);
                sparseIntArray.append(g.m.K7, 15);
                sparseIntArray.append(g.m.G7, 16);
                sparseIntArray.append(g.m.I7, 52);
                sparseIntArray.append(g.m.H7, 53);
                sparseIntArray.append(g.m.M7, 2);
                sparseIntArray.append(g.m.O7, 3);
                sparseIntArray.append(g.m.N7, 4);
                sparseIntArray.append(g.m.f25247x8, 49);
                sparseIntArray.append(g.m.f25259y8, 50);
                sparseIntArray.append(g.m.S7, 5);
                sparseIntArray.append(g.m.T7, 6);
                sparseIntArray.append(g.m.U7, 7);
                sparseIntArray.append(g.m.B7, 67);
                sparseIntArray.append(g.m.y6, 1);
                sparseIntArray.append(g.m.f25066j8, 17);
                sparseIntArray.append(g.m.f25079k8, 18);
                sparseIntArray.append(g.m.R7, 19);
                sparseIntArray.append(g.m.Q7, 20);
                sparseIntArray.append(g.m.C8, 21);
                sparseIntArray.append(g.m.F8, 22);
                sparseIntArray.append(g.m.D8, 23);
                sparseIntArray.append(g.m.A8, 24);
                sparseIntArray.append(g.m.E8, 25);
                sparseIntArray.append(g.m.B8, 26);
                sparseIntArray.append(g.m.f25271z8, 55);
                sparseIntArray.append(g.m.G8, 54);
                sparseIntArray.append(g.m.a8, 29);
                sparseIntArray.append(g.m.f25146p8, 30);
                sparseIntArray.append(g.m.P7, 44);
                sparseIntArray.append(g.m.f24974c8, 45);
                sparseIntArray.append(g.m.f25174r8, 46);
                sparseIntArray.append(g.m.f24960b8, 47);
                sparseIntArray.append(g.m.f25160q8, 48);
                sparseIntArray.append(g.m.E7, 27);
                sparseIntArray.append(g.m.D7, 28);
                sparseIntArray.append(g.m.f25199t8, 31);
                sparseIntArray.append(g.m.W7, 32);
                sparseIntArray.append(g.m.f25223v8, 33);
                sparseIntArray.append(g.m.f25211u8, 34);
                sparseIntArray.append(g.m.f25235w8, 35);
                sparseIntArray.append(g.m.Y7, 36);
                sparseIntArray.append(g.m.X7, 37);
                sparseIntArray.append(g.m.Z7, 38);
                sparseIntArray.append(g.m.f24988d8, 39);
                sparseIntArray.append(g.m.f25105m8, 40);
                sparseIntArray.append(g.m.f25027g8, 41);
                sparseIntArray.append(g.m.J7, 42);
                sparseIntArray.append(g.m.F7, 43);
                sparseIntArray.append(g.m.f25092l8, 51);
                sparseIntArray.append(g.m.I8, 66);
            }

            private a() {
            }
        }

        public LayoutParams(LayoutParams source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.f23829b = -1;
            this.f23831c = -1;
            this.f23833d = -1.0f;
            this.f23835e = true;
            this.f23837f = -1;
            this.f23839g = -1;
            this.f23841h = -1;
            this.f23843i = -1;
            this.f23845j = -1;
            this.f23847k = -1;
            this.f23849l = -1;
            this.f23851m = -1;
            this.f23852n = -1;
            this.f23853o = -1;
            this.f23854p = -1;
            this.f23855q = -1;
            this.f23856r = 0;
            this.f23857s = 0.0f;
            this.f23858t = -1;
            this.f23859u = -1;
            this.f23860v = -1;
            this.f23861w = -1;
            this.f23862x = Integer.MIN_VALUE;
            this.f23863y = Integer.MIN_VALUE;
            this.f23864z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = Integer.MIN_VALUE;
            this.E = 0;
            this.F = true;
            this.G = true;
            this.H = 0.5f;
            this.I = 0.5f;
            this.J = null;
            this.K = 0.0f;
            this.L = 1;
            this.M = -1.0f;
            this.N = -1.0f;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.X = 0;
            this.Y = 0;
            this.Z = 0;
            this.Q1 = 0;
            this.V1 = 1.0f;
            this.L2 = 1.0f;
            this.M2 = -1;
            this.N2 = -1;
            this.O2 = -1;
            this.P2 = false;
            this.Q2 = false;
            this.R2 = null;
            this.S2 = 0;
            this.T2 = true;
            this.U2 = true;
            this.V2 = false;
            this.W2 = false;
            this.X2 = false;
            this.Y2 = false;
            this.Z2 = false;
            this.f23828a3 = -1;
            this.f23830b3 = -1;
            this.f23832c3 = -1;
            this.f23834d3 = -1;
            this.f23836e3 = Integer.MIN_VALUE;
            this.f23838f3 = Integer.MIN_VALUE;
            this.f23840g3 = 0.5f;
            this.f23848k3 = new androidx.constraintlayout.core.widgets.e();
            this.f23850l3 = false;
            this.f23829b = source.f23829b;
            this.f23831c = source.f23831c;
            this.f23833d = source.f23833d;
            this.f23835e = source.f23835e;
            this.f23837f = source.f23837f;
            this.f23839g = source.f23839g;
            this.f23841h = source.f23841h;
            this.f23843i = source.f23843i;
            this.f23845j = source.f23845j;
            this.f23847k = source.f23847k;
            this.f23849l = source.f23849l;
            this.f23851m = source.f23851m;
            this.f23852n = source.f23852n;
            this.f23853o = source.f23853o;
            this.f23854p = source.f23854p;
            this.f23855q = source.f23855q;
            this.f23856r = source.f23856r;
            this.f23857s = source.f23857s;
            this.f23858t = source.f23858t;
            this.f23859u = source.f23859u;
            this.f23860v = source.f23860v;
            this.f23861w = source.f23861w;
            this.f23862x = source.f23862x;
            this.f23863y = source.f23863y;
            this.f23864z = source.f23864z;
            this.A = source.A;
            this.B = source.B;
            this.C = source.C;
            this.D = source.D;
            this.E = source.E;
            this.H = source.H;
            this.I = source.I;
            this.J = source.J;
            this.K = source.K;
            this.L = source.L;
            this.M = source.M;
            this.N = source.N;
            this.O = source.O;
            this.P = source.P;
            this.P2 = source.P2;
            this.Q2 = source.Q2;
            this.Q = source.Q;
            this.R = source.R;
            this.X = source.X;
            this.Z = source.Z;
            this.Y = source.Y;
            this.Q1 = source.Q1;
            this.V1 = source.V1;
            this.L2 = source.L2;
            this.M2 = source.M2;
            this.N2 = source.N2;
            this.O2 = source.O2;
            this.T2 = source.T2;
            this.U2 = source.U2;
            this.V2 = source.V2;
            this.W2 = source.W2;
            this.f23828a3 = source.f23828a3;
            this.f23830b3 = source.f23830b3;
            this.f23832c3 = source.f23832c3;
            this.f23834d3 = source.f23834d3;
            this.f23836e3 = source.f23836e3;
            this.f23838f3 = source.f23838f3;
            this.f23840g3 = source.f23840g3;
            this.R2 = source.R2;
            this.S2 = source.S2;
            this.f23848k3 = source.f23848k3;
            this.F = source.F;
            this.G = source.G;
        }

        public String a() {
            return this.R2;
        }

        public androidx.constraintlayout.core.widgets.e c() {
            return this.f23848k3;
        }

        public void d() {
            androidx.constraintlayout.core.widgets.e eVar = this.f23848k3;
            if (eVar != null) {
                eVar.R0();
            }
        }

        public void e(String text) {
            this.f23848k3.j1(text);
        }

        public void f() {
            this.W2 = false;
            this.T2 = true;
            this.U2 = true;
            int i4 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i4 == -2 && this.P2) {
                this.T2 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            int i5 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i5 == -2 && this.Q2) {
                this.U2 = false;
                if (this.R == 0) {
                    this.R = 1;
                }
            }
            if (i4 == 0 || i4 == -1) {
                this.T2 = false;
                if (i4 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.P2 = true;
                }
            }
            if (i5 == 0 || i5 == -1) {
                this.U2 = false;
                if (i5 == 0 && this.R == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.Q2 = true;
                }
            }
            if (this.f23833d == -1.0f && this.f23829b == -1 && this.f23831c == -1) {
                return;
            }
            this.W2 = true;
            this.T2 = true;
            this.U2 = true;
            if (!(this.f23848k3 instanceof androidx.constraintlayout.core.widgets.h)) {
                this.f23848k3 = new androidx.constraintlayout.core.widgets.h();
            }
            ((androidx.constraintlayout.core.widgets.h) this.f23848k3).B2(this.O2);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(Context c5, AttributeSet attrs) {
            super(c5, attrs);
            this.f23829b = -1;
            this.f23831c = -1;
            this.f23833d = -1.0f;
            this.f23835e = true;
            this.f23837f = -1;
            this.f23839g = -1;
            this.f23841h = -1;
            this.f23843i = -1;
            this.f23845j = -1;
            this.f23847k = -1;
            this.f23849l = -1;
            this.f23851m = -1;
            this.f23852n = -1;
            this.f23853o = -1;
            this.f23854p = -1;
            this.f23855q = -1;
            this.f23856r = 0;
            this.f23857s = 0.0f;
            this.f23858t = -1;
            this.f23859u = -1;
            this.f23860v = -1;
            this.f23861w = -1;
            this.f23862x = Integer.MIN_VALUE;
            this.f23863y = Integer.MIN_VALUE;
            this.f23864z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = Integer.MIN_VALUE;
            this.E = 0;
            this.F = true;
            this.G = true;
            this.H = 0.5f;
            this.I = 0.5f;
            this.J = null;
            this.K = 0.0f;
            this.L = 1;
            this.M = -1.0f;
            this.N = -1.0f;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.X = 0;
            this.Y = 0;
            this.Z = 0;
            this.Q1 = 0;
            this.V1 = 1.0f;
            this.L2 = 1.0f;
            this.M2 = -1;
            this.N2 = -1;
            this.O2 = -1;
            this.P2 = false;
            this.Q2 = false;
            this.R2 = null;
            this.S2 = 0;
            this.T2 = true;
            this.U2 = true;
            this.V2 = false;
            this.W2 = false;
            this.X2 = false;
            this.Y2 = false;
            this.Z2 = false;
            this.f23828a3 = -1;
            this.f23830b3 = -1;
            this.f23832c3 = -1;
            this.f23834d3 = -1;
            this.f23836e3 = Integer.MIN_VALUE;
            this.f23838f3 = Integer.MIN_VALUE;
            this.f23840g3 = 0.5f;
            this.f23848k3 = new androidx.constraintlayout.core.widgets.e();
            this.f23850l3 = false;
            TypedArray obtainStyledAttributes = c5.obtainStyledAttributes(attrs, g.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = a.f23882i0.get(index);
                switch (i5) {
                    case 1:
                        this.O2 = obtainStyledAttributes.getInt(index, this.O2);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f23855q);
                        this.f23855q = resourceId;
                        if (resourceId == -1) {
                            this.f23855q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f23856r = obtainStyledAttributes.getDimensionPixelSize(index, this.f23856r);
                        break;
                    case 4:
                        float f4 = obtainStyledAttributes.getFloat(index, this.f23857s) % 360.0f;
                        this.f23857s = f4;
                        if (f4 < 0.0f) {
                            this.f23857s = (360.0f - f4) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f23829b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f23829b);
                        break;
                    case 6:
                        this.f23831c = obtainStyledAttributes.getDimensionPixelOffset(index, this.f23831c);
                        break;
                    case 7:
                        this.f23833d = obtainStyledAttributes.getFloat(index, this.f23833d);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f23837f);
                        this.f23837f = resourceId2;
                        if (resourceId2 == -1) {
                            this.f23837f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f23839g);
                        this.f23839g = resourceId3;
                        if (resourceId3 == -1) {
                            this.f23839g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f23841h);
                        this.f23841h = resourceId4;
                        if (resourceId4 == -1) {
                            this.f23841h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f23843i);
                        this.f23843i = resourceId5;
                        if (resourceId5 == -1) {
                            this.f23843i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f23845j);
                        this.f23845j = resourceId6;
                        if (resourceId6 == -1) {
                            this.f23845j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f23847k);
                        this.f23847k = resourceId7;
                        if (resourceId7 == -1) {
                            this.f23847k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f23849l);
                        this.f23849l = resourceId8;
                        if (resourceId8 == -1) {
                            this.f23849l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f23851m);
                        this.f23851m = resourceId9;
                        if (resourceId9 == -1) {
                            this.f23851m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f23852n);
                        this.f23852n = resourceId10;
                        if (resourceId10 == -1) {
                            this.f23852n = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f23858t);
                        this.f23858t = resourceId11;
                        if (resourceId11 == -1) {
                            this.f23858t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f23859u);
                        this.f23859u = resourceId12;
                        if (resourceId12 == -1) {
                            this.f23859u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f23860v);
                        this.f23860v = resourceId13;
                        if (resourceId13 == -1) {
                            this.f23860v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f23861w);
                        this.f23861w = resourceId14;
                        if (resourceId14 == -1) {
                            this.f23861w = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f23862x = obtainStyledAttributes.getDimensionPixelSize(index, this.f23862x);
                        break;
                    case 22:
                        this.f23863y = obtainStyledAttributes.getDimensionPixelSize(index, this.f23863y);
                        break;
                    case 23:
                        this.f23864z = obtainStyledAttributes.getDimensionPixelSize(index, this.f23864z);
                        break;
                    case 24:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 25:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 26:
                        this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                        break;
                    case 27:
                        this.P2 = obtainStyledAttributes.getBoolean(index, this.P2);
                        break;
                    case 28:
                        this.Q2 = obtainStyledAttributes.getBoolean(index, this.Q2);
                        break;
                    case 29:
                        this.H = obtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 30:
                        this.I = obtainStyledAttributes.getFloat(index, this.I);
                        break;
                    case 31:
                        this.Q = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.R = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.X) == -2) {
                                this.X = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.Z) == -2) {
                                this.Z = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.V1 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V1));
                        this.Q = 2;
                        break;
                    case 36:
                        try {
                            this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.Y) == -2) {
                                this.Y = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q1 = obtainStyledAttributes.getDimensionPixelSize(index, this.Q1);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q1) == -2) {
                                this.Q1 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.L2 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.L2));
                        this.R = 2;
                        break;
                    default:
                        switch (i5) {
                            case 44:
                                d.C0(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.M = obtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 46:
                                this.N = obtainStyledAttributes.getFloat(index, this.N);
                                break;
                            case 47:
                                this.O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.P = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.M2 = obtainStyledAttributes.getDimensionPixelOffset(index, this.M2);
                                break;
                            case 50:
                                this.N2 = obtainStyledAttributes.getDimensionPixelOffset(index, this.N2);
                                break;
                            case 51:
                                this.R2 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f23853o);
                                this.f23853o = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f23853o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f23854p);
                                this.f23854p = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f23854p = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                                break;
                            case 55:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            default:
                                switch (i5) {
                                    case 64:
                                        d.A0(this, obtainStyledAttributes, index, 0);
                                        this.F = true;
                                        break;
                                    case 65:
                                        d.A0(this, obtainStyledAttributes, index, 1);
                                        this.G = true;
                                        break;
                                    case 66:
                                        this.S2 = obtainStyledAttributes.getInt(index, this.S2);
                                        break;
                                    case 67:
                                        this.f23835e = obtainStyledAttributes.getBoolean(index, this.f23835e);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            f();
        }

        public LayoutParams(int width, int height) {
            super(width, height);
            this.f23829b = -1;
            this.f23831c = -1;
            this.f23833d = -1.0f;
            this.f23835e = true;
            this.f23837f = -1;
            this.f23839g = -1;
            this.f23841h = -1;
            this.f23843i = -1;
            this.f23845j = -1;
            this.f23847k = -1;
            this.f23849l = -1;
            this.f23851m = -1;
            this.f23852n = -1;
            this.f23853o = -1;
            this.f23854p = -1;
            this.f23855q = -1;
            this.f23856r = 0;
            this.f23857s = 0.0f;
            this.f23858t = -1;
            this.f23859u = -1;
            this.f23860v = -1;
            this.f23861w = -1;
            this.f23862x = Integer.MIN_VALUE;
            this.f23863y = Integer.MIN_VALUE;
            this.f23864z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = Integer.MIN_VALUE;
            this.E = 0;
            this.F = true;
            this.G = true;
            this.H = 0.5f;
            this.I = 0.5f;
            this.J = null;
            this.K = 0.0f;
            this.L = 1;
            this.M = -1.0f;
            this.N = -1.0f;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.X = 0;
            this.Y = 0;
            this.Z = 0;
            this.Q1 = 0;
            this.V1 = 1.0f;
            this.L2 = 1.0f;
            this.M2 = -1;
            this.N2 = -1;
            this.O2 = -1;
            this.P2 = false;
            this.Q2 = false;
            this.R2 = null;
            this.S2 = 0;
            this.T2 = true;
            this.U2 = true;
            this.V2 = false;
            this.W2 = false;
            this.X2 = false;
            this.Y2 = false;
            this.Z2 = false;
            this.f23828a3 = -1;
            this.f23830b3 = -1;
            this.f23832c3 = -1;
            this.f23834d3 = -1;
            this.f23836e3 = Integer.MIN_VALUE;
            this.f23838f3 = Integer.MIN_VALUE;
            this.f23840g3 = 0.5f;
            this.f23848k3 = new androidx.constraintlayout.core.widgets.e();
            this.f23850l3 = false;
        }

        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
            this.f23829b = -1;
            this.f23831c = -1;
            this.f23833d = -1.0f;
            this.f23835e = true;
            this.f23837f = -1;
            this.f23839g = -1;
            this.f23841h = -1;
            this.f23843i = -1;
            this.f23845j = -1;
            this.f23847k = -1;
            this.f23849l = -1;
            this.f23851m = -1;
            this.f23852n = -1;
            this.f23853o = -1;
            this.f23854p = -1;
            this.f23855q = -1;
            this.f23856r = 0;
            this.f23857s = 0.0f;
            this.f23858t = -1;
            this.f23859u = -1;
            this.f23860v = -1;
            this.f23861w = -1;
            this.f23862x = Integer.MIN_VALUE;
            this.f23863y = Integer.MIN_VALUE;
            this.f23864z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = Integer.MIN_VALUE;
            this.E = 0;
            this.F = true;
            this.G = true;
            this.H = 0.5f;
            this.I = 0.5f;
            this.J = null;
            this.K = 0.0f;
            this.L = 1;
            this.M = -1.0f;
            this.N = -1.0f;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.X = 0;
            this.Y = 0;
            this.Z = 0;
            this.Q1 = 0;
            this.V1 = 1.0f;
            this.L2 = 1.0f;
            this.M2 = -1;
            this.N2 = -1;
            this.O2 = -1;
            this.P2 = false;
            this.Q2 = false;
            this.R2 = null;
            this.S2 = 0;
            this.T2 = true;
            this.U2 = true;
            this.V2 = false;
            this.W2 = false;
            this.X2 = false;
            this.Y2 = false;
            this.Z2 = false;
            this.f23828a3 = -1;
            this.f23830b3 = -1;
            this.f23832c3 = -1;
            this.f23834d3 = -1;
            this.f23836e3 = Integer.MIN_VALUE;
            this.f23838f3 = Integer.MIN_VALUE;
            this.f23840g3 = 0.5f;
            this.f23848k3 = new androidx.constraintlayout.core.widgets.e();
            this.f23850l3 = false;
        }
    }
}
