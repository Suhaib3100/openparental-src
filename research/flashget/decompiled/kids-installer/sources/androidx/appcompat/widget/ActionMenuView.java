package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes2.dex */
public class ActionMenuView extends LinearLayoutCompat implements g.b, androidx.appcompat.view.menu.o {

    /* renamed from: e0, reason: collision with root package name */
    private static final String f814e0 = "ActionMenuView";

    /* renamed from: f0, reason: collision with root package name */
    static final int f815f0 = 56;

    /* renamed from: g0, reason: collision with root package name */
    static final int f816g0 = 4;
    private androidx.appcompat.view.menu.g P;
    private Context Q;
    private int R;
    private boolean S;
    private ActionMenuPresenter T;
    private n.a U;
    g.a V;
    private boolean W;

    /* renamed from: a0, reason: collision with root package name */
    private int f817a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f818b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f819c0;

    /* renamed from: d0, reason: collision with root package name */
    d f820d0;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f821a;

        /* renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f822b;

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f823c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f824d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f825e;

        /* renamed from: f, reason: collision with root package name */
        boolean f826f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f821a = layoutParams.f821a;
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.f821a = false;
        }

        LayoutParams(int i5, int i6, boolean z5) {
            super(i5, i6);
            this.f821a = z5;
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface a {
        boolean b();

        boolean f();
    }

    private static class b implements n.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@androidx.annotation.o0 androidx.appcompat.view.menu.g gVar, boolean z5) {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@androidx.annotation.o0 androidx.appcompat.view.menu.g gVar) {
            return false;
        }
    }

    private class c implements g.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@androidx.annotation.o0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.o0 MenuItem menuItem) {
            d dVar = ActionMenuView.this.f820d0;
            return dVar != null && dVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@androidx.annotation.o0 androidx.appcompat.view.menu.g gVar) {
            g.a aVar = ActionMenuView.this.V;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    static int m0(View view, int i5, int i6, int i7, int i8) {
        int i9;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7) - i8, View.MeasureSpec.getMode(i7));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z5 = actionMenuItemView != null && actionMenuItemView.u();
        if (i6 > 0) {
            i9 = 2;
            if (!z5 || i6 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i10 = measuredWidth / i5;
                if (measuredWidth % i5 != 0) {
                    i10++;
                }
                if (!z5 || i10 >= 2) {
                    i9 = i10;
                }
                layoutParams.f824d = layoutParams.f821a && z5;
                layoutParams.f822b = i9;
                view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i9, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), makeMeasureSpec);
                return i9;
            }
        }
        i9 = 0;
        layoutParams.f824d = layoutParams.f821a && z5;
        layoutParams.f822b = i9;
        view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i9, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), makeMeasureSpec);
        return i9;
    }

    /* JADX WARN: Type inference failed for: r14v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v9 */
    private void n0(int i5, int i6) {
        int i7;
        int i8;
        boolean z5;
        int i9;
        int i10;
        boolean z6;
        boolean z7;
        int i11;
        ?? r14;
        int i12;
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i6);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, paddingBottom, -2);
        int i13 = size - paddingRight;
        int i14 = this.f818b0;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (i15 == 0) {
            setMeasuredDimension(i13, 0);
            return;
        }
        int i17 = (i16 / i15) + i14;
        int childCount = getChildCount();
        int i18 = 0;
        int i19 = 0;
        boolean z8 = false;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        long j5 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            int i23 = size2;
            if (childAt.getVisibility() == 8) {
                i12 = paddingBottom;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                int i24 = i20 + 1;
                if (z9) {
                    int i25 = this.f819c0;
                    i11 = i24;
                    r14 = 0;
                    childAt.setPadding(i25, 0, i25, 0);
                } else {
                    i11 = i24;
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f826f = r14;
                layoutParams.f823c = r14;
                layoutParams.f822b = r14;
                layoutParams.f824d = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                layoutParams.f825e = z9 && ((ActionMenuItemView) childAt).u();
                int m02 = m0(childAt, i17, layoutParams.f821a ? 1 : i15, childMeasureSpec, paddingBottom);
                i21 = Math.max(i21, m02);
                if (layoutParams.f824d) {
                    i22++;
                }
                if (layoutParams.f821a) {
                    z8 = true;
                }
                i15 -= m02;
                i18 = Math.max(i18, childAt.getMeasuredHeight());
                if (m02 == 1) {
                    i12 = paddingBottom;
                    j5 |= 1 << i19;
                    i15 = i15;
                } else {
                    i12 = paddingBottom;
                }
                i20 = i11;
            }
            i19++;
            paddingBottom = i12;
            size2 = i23;
        }
        int i26 = size2;
        boolean z10 = z8 && i20 == 2;
        boolean z11 = false;
        while (i22 > 0 && i15 > 0) {
            int i27 = Integer.MAX_VALUE;
            int i28 = 0;
            int i29 = 0;
            long j6 = 0;
            while (i29 < childCount) {
                boolean z12 = z11;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i29).getLayoutParams();
                int i30 = i18;
                if (layoutParams2.f824d) {
                    int i31 = layoutParams2.f822b;
                    if (i31 < i27) {
                        j6 = 1 << i29;
                        i27 = i31;
                        i28 = 1;
                    } else if (i31 == i27) {
                        i28++;
                        j6 |= 1 << i29;
                    }
                }
                i29++;
                i18 = i30;
                z11 = z12;
            }
            z5 = z11;
            i9 = i18;
            j5 |= j6;
            if (i28 > i15) {
                i7 = mode;
                i8 = i13;
                break;
            }
            int i32 = i27 + 1;
            int i33 = 0;
            while (i33 < childCount) {
                View childAt2 = getChildAt(i33);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i34 = i13;
                int i35 = mode;
                long j7 = 1 << i33;
                if ((j6 & j7) == 0) {
                    if (layoutParams3.f822b == i32) {
                        j5 |= j7;
                    }
                    z7 = z10;
                } else {
                    if (z10 && layoutParams3.f825e && i15 == 1) {
                        int i36 = this.f819c0;
                        z7 = z10;
                        childAt2.setPadding(i36 + i17, 0, i36, 0);
                    } else {
                        z7 = z10;
                    }
                    layoutParams3.f822b++;
                    layoutParams3.f826f = true;
                    i15--;
                }
                i33++;
                mode = i35;
                i13 = i34;
                z10 = z7;
            }
            i18 = i9;
            z11 = true;
        }
        i7 = mode;
        i8 = i13;
        z5 = z11;
        i9 = i18;
        boolean z13 = !z8 && i20 == 1;
        if (i15 <= 0 || j5 == 0 || (i15 >= i20 - 1 && !z13 && i21 <= 1)) {
            i10 = 0;
            z6 = z5;
        } else {
            float bitCount = Long.bitCount(j5);
            if (z13) {
                i10 = 0;
            } else {
                i10 = 0;
                if ((j5 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f825e) {
                    bitCount -= 0.5f;
                }
                int i37 = childCount - 1;
                if ((j5 & (1 << i37)) != 0 && !((LayoutParams) getChildAt(i37).getLayoutParams()).f825e) {
                    bitCount -= 0.5f;
                }
            }
            int i38 = bitCount > 0.0f ? (int) ((i15 * i17) / bitCount) : i10;
            z6 = z5;
            for (int i39 = i10; i39 < childCount; i39++) {
                if ((j5 & (1 << i39)) != 0) {
                    View childAt3 = getChildAt(i39);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f823c = i38;
                        layoutParams4.f826f = true;
                        if (i39 == 0 && !layoutParams4.f825e) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i38) / 2;
                        }
                        z6 = true;
                    } else if (layoutParams4.f821a) {
                        layoutParams4.f823c = i38;
                        layoutParams4.f826f = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i38) / 2;
                        z6 = true;
                    } else {
                        if (i39 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i38 / 2;
                        }
                        if (i39 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i38 / 2;
                        }
                    }
                }
            }
        }
        if (z6) {
            for (int i40 = i10; i40 < childCount; i40++) {
                View childAt4 = getChildAt(i40);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f826f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f822b * i17) + layoutParams5.f823c, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, i7 != 1073741824 ? i9 : i26);
    }

    public void Z() {
        ActionMenuPresenter actionMenuPresenter = this.T;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
    }

    @Override // androidx.appcompat.view.menu.g.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean a(androidx.appcompat.view.menu.j jVar) {
        return this.P.O(jVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public LayoutParams d0() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f821a = true;
        return generateDefaultLayoutParams;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void e(androidx.appcompat.view.menu.g gVar) {
        this.P = gVar;
    }

    public Menu e0() {
        if (this.P == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.P = gVar;
            gVar.X(new c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.T = actionMenuPresenter;
            actionMenuPresenter.O(true);
            ActionMenuPresenter actionMenuPresenter2 = this.T;
            n.a aVar = this.U;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter2.h(aVar);
            this.P.c(this.T, this.Q);
            this.T.M(this);
        }
        return this.P;
    }

    @androidx.annotation.q0
    public Drawable f0() {
        e0();
        return this.T.D();
    }

    public int g0() {
        return this.R;
    }

    @Override // androidx.appcompat.view.menu.o
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int h() {
        return 0;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected boolean h0(int i5) {
        boolean z5 = false;
        if (i5 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i5 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i5);
        if (i5 < getChildCount() && (childAt instanceof a)) {
            z5 = false | ((a) childAt).b();
        }
        return (i5 <= 0 || !(childAt2 instanceof a)) ? z5 : z5 | ((a) childAt2).f();
    }

    public boolean i0() {
        ActionMenuPresenter actionMenuPresenter = this.T;
        return actionMenuPresenter != null && actionMenuPresenter.E();
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean j0() {
        ActionMenuPresenter actionMenuPresenter = this.T;
        return actionMenuPresenter != null && actionMenuPresenter.G();
    }

    public boolean k0() {
        ActionMenuPresenter actionMenuPresenter = this.T;
        return actionMenuPresenter != null && actionMenuPresenter.H();
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean l0() {
        return this.S;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.g o0() {
        return this.P;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.T;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.d(false);
            if (this.T.H()) {
                this.T.E();
                this.T.Q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Z();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        int width;
        int i9;
        if (!this.W) {
            super.onLayout(z5, i5, i6, i7, i8);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i8 - i6) / 2;
        int v5 = v();
        int i11 = i7 - i5;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean b6 = g1.b(this);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f821a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (h0(i14)) {
                        measuredWidth += v5;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b6) {
                        i9 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i9 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i9 = width - measuredWidth;
                    }
                    int i15 = i10 - (measuredHeight / 2);
                    childAt.layout(i9, i15, width, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    h0(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i11 / 2) - (measuredWidth2 / 2);
            int i17 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        int max = Math.max(0, i18 > 0 ? paddingRight / i18 : 0);
        if (b6) {
            int width2 = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f821a) {
                    int i20 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width2 = i20 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f821a) {
                int i23 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max + i23;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i5, int i6) {
        androidx.appcompat.view.menu.g gVar;
        boolean z5 = this.W;
        boolean z6 = View.MeasureSpec.getMode(i5) == 1073741824;
        this.W = z6;
        if (z5 != z6) {
            this.f817a0 = 0;
        }
        int size = View.MeasureSpec.getSize(i5);
        if (this.W && (gVar = this.P) != null && size != this.f817a0) {
            this.f817a0 = size;
            gVar.N(true);
        }
        int childCount = getChildCount();
        if (this.W && childCount > 0) {
            n0(i5, i6);
            return;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i5, i6);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void p0(boolean z5) {
        this.T.K(z5);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void q0(n.a aVar, g.a aVar2) {
        this.U = aVar;
        this.V = aVar2;
    }

    public void r0(d dVar) {
        this.f820d0 = dVar;
    }

    public void s0(@androidx.annotation.q0 Drawable drawable) {
        e0();
        this.T.N(drawable);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void t0(boolean z5) {
        this.S = z5;
    }

    public void u0(@androidx.annotation.h1 int i5) {
        if (this.R != i5) {
            this.R = i5;
            if (i5 == 0) {
                this.Q = getContext();
            } else {
                this.Q = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public void v0(ActionMenuPresenter actionMenuPresenter) {
        this.T = actionMenuPresenter;
        actionMenuPresenter.M(this);
    }

    public boolean w0() {
        ActionMenuPresenter actionMenuPresenter = this.T;
        return actionMenuPresenter != null && actionMenuPresenter.Q();
    }

    public ActionMenuView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        N(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f818b0 = (int) (56.0f * f6);
        this.f819c0 = (int) (f6 * 4.0f);
        this.Q = context;
        this.R = 0;
    }
}
