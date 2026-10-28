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
import androidx.annotation.h1;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements h.b, androidx.appcompat.view.menu.p {
    private static final String O = "ActionMenuView";
    static final int P = 56;
    static final int Q = 4;
    private androidx.appcompat.view.menu.h C;
    private Context D;
    private int E;
    private boolean F;
    private ActionMenuPresenter G;
    private o.a H;
    h.a I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    d N;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1407a;

        /* renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1408b;

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1409c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1410d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1411e;

        /* renamed from: f, reason: collision with root package name */
        boolean f1412f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f1407a = false;
        }

        LayoutParams(int i4, int i5, boolean z4) {
            super(i4, i5);
            this.f1407a = z4;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f1407a = layoutParams.f1407a;
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean a();

        boolean c();
    }

    private static class b implements o.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.o.a
        public void d(@androidx.annotation.o0 androidx.appcompat.view.menu.h hVar, boolean z4) {
        }

        @Override // androidx.appcompat.view.menu.o.a
        public boolean e(@androidx.annotation.o0 androidx.appcompat.view.menu.h hVar) {
            return false;
        }
    }

    private class c implements h.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean a(@androidx.annotation.o0 androidx.appcompat.view.menu.h hVar, @androidx.annotation.o0 MenuItem menuItem) {
            d dVar = ActionMenuView.this.N;
            return dVar != null && dVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void b(@androidx.annotation.o0 androidx.appcompat.view.menu.h hVar) {
            h.a aVar = ActionMenuView.this.I;
            if (aVar != null) {
                aVar.b(hVar);
            }
        }
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    static int o0(View view, int i4, int i5, int i6, int i7) {
        int i10;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i6) - i7, View.MeasureSpec.getMode(i6));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z4 = false;
        boolean z5 = actionMenuItemView != null && actionMenuItemView.d();
        if (i5 > 0) {
            i10 = 2;
            if (!z5 || i5 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i4, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i11 = measuredWidth / i4;
                if (measuredWidth % i4 != 0) {
                    i11++;
                }
                if (!z5 || i11 >= 2) {
                    i10 = i11;
                }
                if (!layoutParams.f1407a && z5) {
                    z4 = true;
                }
                layoutParams.f1410d = z4;
                layoutParams.f1408b = i10;
                view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i10, 1073741824), makeMeasureSpec);
                return i10;
            }
        }
        i10 = 0;
        if (!layoutParams.f1407a) {
            z4 = true;
        }
        layoutParams.f1410d = z4;
        layoutParams.f1408b = i10;
        view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i10, 1073741824), makeMeasureSpec);
        return i10;
    }

    /* JADX WARN: Type inference failed for: r14v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v9 */
    private void p0(int i4, int i5) {
        int i6;
        int i7;
        boolean z4;
        int i10;
        int i11;
        boolean z5;
        boolean z6;
        int i12;
        ?? r14;
        int i13;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int i14 = size - paddingRight;
        int i15 = this.L;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = (i17 / i16) + i15;
        int childCount = getChildCount();
        int i19 = 0;
        int i20 = 0;
        boolean z7 = false;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        long j4 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            int i24 = size2;
            if (childAt.getVisibility() == 8) {
                i13 = paddingBottom;
            } else {
                boolean z10 = childAt instanceof ActionMenuItemView;
                int i25 = i21 + 1;
                if (z10) {
                    int i26 = this.M;
                    i12 = i25;
                    r14 = 0;
                    childAt.setPadding(i26, 0, i26, 0);
                } else {
                    i12 = i25;
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f1412f = r14;
                layoutParams.f1409c = r14;
                layoutParams.f1408b = r14;
                layoutParams.f1410d = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                layoutParams.f1411e = z10 && ((ActionMenuItemView) childAt).d();
                int o02 = o0(childAt, i18, layoutParams.f1407a ? 1 : i16, childMeasureSpec, paddingBottom);
                i22 = Math.max(i22, o02);
                if (layoutParams.f1410d) {
                    i23++;
                }
                if (layoutParams.f1407a) {
                    z7 = true;
                }
                i16 -= o02;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (o02 == 1) {
                    i13 = paddingBottom;
                    j4 |= 1 << i20;
                    i16 = i16;
                } else {
                    i13 = paddingBottom;
                }
                i21 = i12;
            }
            i20++;
            paddingBottom = i13;
            size2 = i24;
        }
        int i27 = size2;
        boolean z11 = z7 && i21 == 2;
        boolean z12 = false;
        while (i23 > 0 && i16 > 0) {
            int i28 = Integer.MAX_VALUE;
            int i29 = 0;
            int i30 = 0;
            long j5 = 0;
            while (i30 < childCount) {
                boolean z13 = z12;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i30).getLayoutParams();
                int i31 = i19;
                if (layoutParams2.f1410d) {
                    int i32 = layoutParams2.f1408b;
                    if (i32 < i28) {
                        j5 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        i29++;
                        j5 |= 1 << i30;
                    }
                }
                i30++;
                i19 = i31;
                z12 = z13;
            }
            z4 = z12;
            i10 = i19;
            j4 |= j5;
            if (i29 > i16) {
                i6 = mode;
                i7 = i14;
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount) {
                View childAt2 = getChildAt(i34);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i35 = i14;
                int i36 = mode;
                long j6 = 1 << i34;
                if ((j5 & j6) == 0) {
                    if (layoutParams3.f1408b == i33) {
                        j4 |= j6;
                    }
                    z6 = z11;
                } else {
                    if (z11 && layoutParams3.f1411e && i16 == 1) {
                        int i37 = this.M;
                        z6 = z11;
                        childAt2.setPadding(i37 + i18, 0, i37, 0);
                    } else {
                        z6 = z11;
                    }
                    layoutParams3.f1408b++;
                    layoutParams3.f1412f = true;
                    i16--;
                }
                i34++;
                mode = i36;
                i14 = i35;
                z11 = z6;
            }
            i19 = i10;
            z12 = true;
        }
        i6 = mode;
        i7 = i14;
        z4 = z12;
        i10 = i19;
        boolean z14 = !z7 && i21 == 1;
        if (i16 <= 0 || j4 == 0 || (i16 >= i21 - 1 && !z14 && i22 <= 1)) {
            i11 = 0;
            z5 = z4;
        } else {
            float bitCount = Long.bitCount(j4);
            if (z14) {
                i11 = 0;
            } else {
                i11 = 0;
                if ((j4 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f1411e) {
                    bitCount -= 0.5f;
                }
                int i38 = childCount - 1;
                if ((j4 & (1 << i38)) != 0 && !((LayoutParams) getChildAt(i38).getLayoutParams()).f1411e) {
                    bitCount -= 0.5f;
                }
            }
            int i39 = bitCount > 0.0f ? (int) ((i16 * i18) / bitCount) : i11;
            z5 = z4;
            for (int i40 = i11; i40 < childCount; i40++) {
                if ((j4 & (1 << i40)) != 0) {
                    View childAt3 = getChildAt(i40);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f1409c = i39;
                        layoutParams4.f1412f = true;
                        if (i40 == 0 && !layoutParams4.f1411e) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i39) / 2;
                        }
                        z5 = true;
                    } else if (layoutParams4.f1407a) {
                        layoutParams4.f1409c = i39;
                        layoutParams4.f1412f = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i39) / 2;
                        z5 = true;
                    } else {
                        if (i40 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i39 / 2;
                        }
                        if (i40 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i39 / 2;
                        }
                    }
                }
            }
        }
        if (z5) {
            for (int i41 = i11; i41 < childCount; i41++) {
                View childAt4 = getChildAt(i41);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f1412f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f1408b * i18) + layoutParams5.f1409c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i7, i6 != 1073741824 ? i10 : i27);
    }

    @Override // androidx.appcompat.view.menu.p
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void a(androidx.appcompat.view.menu.h hVar) {
        this.C = hVar;
    }

    public void b0() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.appcompat.view.menu.p
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int d() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
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

    @Override // androidx.appcompat.view.menu.h.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean f(androidx.appcompat.view.menu.k kVar) {
        return this.C.O(kVar, 0);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public LayoutParams f0() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f1407a = true;
        return generateDefaultLayoutParams;
    }

    public Menu g0() {
        if (this.C == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
            this.C = hVar;
            hVar.X(new c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.G = actionMenuPresenter;
            actionMenuPresenter.P(true);
            ActionMenuPresenter actionMenuPresenter2 = this.G;
            o.a aVar = this.H;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter2.f(aVar);
            this.C.c(this.G, this.D);
            this.G.N(this);
        }
        return this.C;
    }

    @androidx.annotation.q0
    public Drawable h0() {
        g0();
        return this.G.E();
    }

    public int i0() {
        return this.E;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected boolean j0(int i4) {
        boolean z4 = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof a)) {
            z4 = ((a) childAt).a();
        }
        return (i4 <= 0 || !(childAt2 instanceof a)) ? z4 : z4 | ((a) childAt2).c();
    }

    public boolean k0() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        return actionMenuPresenter != null && actionMenuPresenter.F();
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean l0() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        return actionMenuPresenter != null && actionMenuPresenter.H();
    }

    public boolean m0() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        return actionMenuPresenter != null && actionMenuPresenter.I();
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean n0() {
        return this.F;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.G;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.k(false);
            if (this.G.I()) {
                this.G.F();
                this.G.R();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b0();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int width;
        int i10;
        if (!this.J) {
            super.onLayout(z4, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i7 - i5) / 2;
        int x4 = x();
        int i12 = i6 - i4;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean b5 = e1.b(this);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1407a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j0(i15)) {
                        measuredWidth += x4;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b5) {
                        i10 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i10 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i10 = width - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(i10, i16, width, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    j0(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        int max = Math.max(0, i19 > 0 ? paddingRight / i19 : 0);
        if (b5) {
            int width2 = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f1407a) {
                    int i21 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width2 = i21 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f1407a) {
                int i24 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max + i24;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i4, int i5) {
        androidx.appcompat.view.menu.h hVar;
        boolean z4 = this.J;
        boolean z5 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.J = z5;
        if (z4 != z5) {
            this.K = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.J && (hVar = this.C) != null && size != this.K) {
            this.K = size;
            hVar.N(true);
        }
        int childCount = getChildCount();
        if (this.J && childCount > 0) {
            p0(i4, i5);
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i4, i5);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.h q0() {
        return this.C;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void r0(boolean z4) {
        this.G.L(z4);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void s0(o.a aVar, h.a aVar2) {
        this.H = aVar;
        this.I = aVar2;
    }

    public void t0(d dVar) {
        this.N = dVar;
    }

    public void u0(@androidx.annotation.q0 Drawable drawable) {
        g0();
        this.G.O(drawable);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void v0(boolean z4) {
        this.F = z4;
    }

    public void w0(@h1 int i4) {
        if (this.E != i4) {
            this.E = i4;
            if (i4 == 0) {
                this.D = getContext();
            } else {
                this.D = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public void x0(ActionMenuPresenter actionMenuPresenter) {
        this.G = actionMenuPresenter;
        actionMenuPresenter.N(this);
    }

    public boolean y0() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        return actionMenuPresenter != null && actionMenuPresenter.R();
    }

    public ActionMenuView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        P(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.L = (int) (56.0f * f4);
        this.M = (int) (f4 * 4.0f);
        this.D = context;
        this.E = 0;
    }
}
