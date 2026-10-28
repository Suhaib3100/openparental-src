package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.core.view.r3;
import androidx.core.view.y1;
import d.a;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {
    private View A;
    private View B;
    private LinearLayout C;
    private TextView D;
    private TextView E;
    private int F;
    private int G;
    private boolean H;
    private int I;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f782x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f783y;

    /* renamed from: z, reason: collision with root package name */
    private View f784z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f785o;

        a(androidx.appcompat.view.b bVar) {
            this.f785o = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f785o.c();
        }
    }

    public ActionBarContextView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private void w() {
        if (this.C == null) {
            LayoutInflater.from(getContext()).inflate(a.k.f21944a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.C = linearLayout;
            this.D = (TextView) linearLayout.findViewById(a.h.N);
            this.E = (TextView) this.C.findViewById(a.h.M);
            if (this.F != 0) {
                this.D.setTextAppearance(getContext(), this.F);
            }
            if (this.G != 0) {
                this.E.setTextAppearance(getContext(), this.G);
            }
        }
        this.D.setText(this.f782x);
        this.E.setText(this.f783y);
        boolean z5 = !TextUtils.isEmpty(this.f782x);
        boolean z6 = !TextUtils.isEmpty(this.f783y);
        int i5 = 0;
        this.E.setVisibility(z6 ? 0 : 8);
        LinearLayout linearLayout2 = this.C;
        if (!z5 && !z6) {
            i5 = 8;
        }
        linearLayout2.setVisibility(i5);
        if (this.C.getParent() == null) {
            addView(this.C);
        }
    }

    public void A(CharSequence charSequence) {
        this.f783y = charSequence;
        w();
    }

    public void B(CharSequence charSequence) {
        this.f782x = charSequence;
        w();
    }

    public void C(boolean z5) {
        if (z5 != this.H) {
            requestLayout();
        }
        this.H = z5;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void c(int i5) {
        super.c(i5);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int f() {
        return super.f();
    }

    @Override // androidx.appcompat.widget.a
    public int g() {
        return this.f1096s;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public boolean h() {
        ActionMenuPresenter actionMenuPresenter = this.f1095r;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.E();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // androidx.appcompat.widget.a
    public boolean j() {
        ActionMenuPresenter actionMenuPresenter = this.f1095r;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.H();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1095r;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.E();
            this.f1095r.F();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f782x);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        boolean b6 = g1.b(this);
        int paddingRight = b6 ? (i7 - i5) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i8 - i6) - getPaddingTop()) - getPaddingBottom();
        View view = this.f784z;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f784z.getLayoutParams();
            int i9 = b6 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i10 = b6 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i11 = b6 ? paddingRight - i9 : paddingRight + i9;
            int n5 = i11 + n(this.f784z, i11, paddingTop, paddingTop2, b6);
            paddingRight = b6 ? n5 - i10 : n5 + i10;
        }
        int i12 = paddingRight;
        LinearLayout linearLayout = this.C;
        if (linearLayout != null && this.B == null && linearLayout.getVisibility() != 8) {
            i12 += n(this.C, i12, paddingTop, paddingTop2, b6);
        }
        int i13 = i12;
        View view2 = this.B;
        if (view2 != null) {
            n(view2, i13, paddingTop, paddingTop2, b6);
        }
        int paddingLeft = b6 ? getPaddingLeft() : (i7 - i5) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1094q;
        if (actionMenuView != null) {
            n(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b6);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int i7 = androidx.constraintlayout.solver.widgets.analyzer.b.f2366g;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i6) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i5);
        int i8 = this.f1096s;
        if (i8 <= 0) {
            i8 = View.MeasureSpec.getSize(i6);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i9 = i8 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        View view = this.f784z;
        if (view != null) {
            int l5 = l(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f784z.getLayoutParams();
            paddingLeft = l5 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1094q;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = l(this.f1094q, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.C;
        if (linearLayout != null && this.B == null) {
            if (this.H) {
                this.C.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.C.getMeasuredWidth();
                boolean z5 = measuredWidth <= paddingLeft;
                if (z5) {
                    paddingLeft -= measuredWidth;
                }
                this.C.setVisibility(z5 ? 0 : 8);
            } else {
                paddingLeft = l(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.B;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = i10 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i10 >= 0) {
                paddingLeft = Math.min(i10, paddingLeft);
            }
            int i12 = layoutParams.height;
            if (i12 == -2) {
                i7 = Integer.MIN_VALUE;
            }
            if (i12 >= 0) {
                i9 = Math.min(i12, i9);
            }
            this.B.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(i9, i7));
        }
        if (this.f1096s > 0) {
            setMeasuredDimension(size, i8);
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i13) {
                i13 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i13);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void p(int i5) {
        this.f1096s = i5;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ r3 q(int i5, long j5) {
        return super.q(i5, j5);
    }

    @Override // androidx.appcompat.widget.a
    public boolean r() {
        ActionMenuPresenter actionMenuPresenter = this.f1095r;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.Q();
        }
        return false;
    }

    public void s() {
        if (this.f784z == null) {
            y();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i5) {
        super.setVisibility(i5);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public CharSequence t() {
        return this.f783y;
    }

    public CharSequence u() {
        return this.f782x;
    }

    public void v(androidx.appcompat.view.b bVar) {
        View view = this.f784z;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.I, (ViewGroup) this, false);
            this.f784z = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f784z);
        }
        View findViewById = this.f784z.findViewById(a.h.W);
        this.A = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f1095r;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1095r = actionMenuPresenter2;
        actionMenuPresenter2.O(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.c(this.f1095r, this.f1093p);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1095r.m(this);
        this.f1094q = actionMenuView;
        y1.I1(actionMenuView, null);
        addView(this.f1094q, layoutParams);
    }

    public boolean x() {
        return this.H;
    }

    public void y() {
        removeAllViews();
        this.B = null;
        this.f1094q = null;
        this.f1095r = null;
        View view = this.A;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public void z(View view) {
        LinearLayout linearLayout;
        View view2 = this.B;
        if (view2 != null) {
            removeView(view2);
        }
        this.B = view;
        if (view != null && (linearLayout = this.C) != null) {
            removeView(linearLayout);
            this.C = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public ActionBarContextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.C);
    }

    public ActionBarContextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        z0 G = z0.G(context, attributeSet, a.n.J, i5, 0);
        y1.I1(this, G.h(a.n.K));
        this.F = G.u(a.n.P, 0);
        this.G = G.u(a.n.O, 0);
        this.f1096s = G.q(a.n.N, 0);
        this.I = G.u(a.n.M, a.k.f21949f);
        G.I();
    }
}
