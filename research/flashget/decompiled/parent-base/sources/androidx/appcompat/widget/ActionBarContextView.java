package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.core.view.i2;
import androidx.core.view.x1;
import d.a;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContextView extends b {

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f1340k;

    /* renamed from: l, reason: collision with root package name */
    private CharSequence f1341l;

    /* renamed from: m, reason: collision with root package name */
    private View f1342m;

    /* renamed from: n, reason: collision with root package name */
    private View f1343n;

    /* renamed from: o, reason: collision with root package name */
    private View f1344o;

    /* renamed from: p, reason: collision with root package name */
    private LinearLayout f1345p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f1346q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f1347r;

    /* renamed from: s, reason: collision with root package name */
    private int f1348s;

    /* renamed from: t, reason: collision with root package name */
    private int f1349t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1350u;

    /* renamed from: v, reason: collision with root package name */
    private int f1351v;

    class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f1352b;

        a(androidx.appcompat.view.b bVar) {
            this.f1352b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1352b.c();
        }
    }

    public ActionBarContextView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private void w() {
        if (this.f1345p == null) {
            LayoutInflater.from(getContext()).inflate(a.j.f73299a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1345p = linearLayout;
            this.f1346q = (TextView) linearLayout.findViewById(a.g.f73248g);
            this.f1347r = (TextView) this.f1345p.findViewById(a.g.f73246f);
            if (this.f1348s != 0) {
                this.f1346q.setTextAppearance(getContext(), this.f1348s);
            }
            if (this.f1349t != 0) {
                this.f1347r.setTextAppearance(getContext(), this.f1349t);
            }
        }
        this.f1346q.setText(this.f1340k);
        this.f1347r.setText(this.f1341l);
        boolean isEmpty = TextUtils.isEmpty(this.f1340k);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1341l);
        this.f1347r.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1345p.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1345p.getParent() == null) {
            addView(this.f1345p);
        }
    }

    public void A(CharSequence charSequence) {
        this.f1341l = charSequence;
        w();
    }

    public void B(CharSequence charSequence) {
        this.f1340k = charSequence;
        w();
        x1.K1(this, charSequence);
    }

    public void C(boolean z4) {
        if (z4 != this.f1350u) {
            requestLayout();
        }
        this.f1350u = z4;
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ void c(int i4) {
        super.c(i4);
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ int f() {
        return super.f();
    }

    @Override // androidx.appcompat.widget.b
    public int g() {
        return this.f1723f;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    public boolean h() {
        ActionMenuPresenter actionMenuPresenter = this.f1722e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.F();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // androidx.appcompat.widget.b
    public boolean j() {
        ActionMenuPresenter actionMenuPresenter = this.f1722e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.I();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1722e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.F();
            this.f1722e.G();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        boolean b5 = e1.b(this);
        int paddingRight = b5 ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1342m;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1342m.getLayoutParams();
            int i10 = b5 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i11 = b5 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int m4 = b.m(paddingRight, i10, b5);
            paddingRight = b.m(m4 + n(this.f1342m, m4, paddingTop, paddingTop2, b5), i11, b5);
        }
        int i12 = paddingRight;
        LinearLayout linearLayout = this.f1345p;
        if (linearLayout != null && this.f1344o == null && linearLayout.getVisibility() != 8) {
            i12 += n(this.f1345p, i12, paddingTop, paddingTop2, b5);
        }
        int i13 = i12;
        View view2 = this.f1344o;
        if (view2 != null) {
            n(view2, i13, paddingTop, paddingTop2, b5);
        }
        int paddingLeft = b5 ? getPaddingLeft() : (i6 - i4) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1721d;
        if (actionMenuView != null) {
            n(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b5);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i4);
        int i6 = this.f1723f;
        if (i6 <= 0) {
            i6 = View.MeasureSpec.getSize(i5);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i7 = i6 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        View view = this.f1342m;
        if (view != null) {
            int l4 = l(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1342m.getLayoutParams();
            paddingLeft = l4 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1721d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = l(this.f1721d, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f1345p;
        if (linearLayout != null && this.f1344o == null) {
            if (this.f1350u) {
                this.f1345p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1345p.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f1345p.setVisibility(z4 ? 0 : 8);
            } else {
                paddingLeft = l(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f1344o;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = i10 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i10 >= 0) {
                paddingLeft = Math.min(i10, paddingLeft);
            }
            int i12 = layoutParams.height;
            int i13 = i12 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i12 >= 0) {
                i7 = Math.min(i12, i7);
            }
            this.f1344o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(i7, i13));
        }
        if (this.f1723f > 0) {
            setMeasuredDimension(size, i6);
            return;
        }
        int childCount = getChildCount();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            int measuredHeight = getChildAt(i15).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i14) {
                i14 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i14);
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.b
    public void p(int i4) {
        this.f1723f = i4;
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ i2 q(int i4, long j4) {
        return super.q(i4, j4);
    }

    @Override // androidx.appcompat.widget.b
    public boolean r() {
        ActionMenuPresenter actionMenuPresenter = this.f1722e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.R();
        }
        return false;
    }

    public void s() {
        if (this.f1342m == null) {
            y();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i4) {
        super.setVisibility(i4);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public CharSequence t() {
        return this.f1341l;
    }

    public CharSequence u() {
        return this.f1340k;
    }

    public void v(androidx.appcompat.view.b bVar) {
        View view = this.f1342m;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1351v, (ViewGroup) this, false);
            this.f1342m = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1342m);
        }
        View findViewById = this.f1342m.findViewById(a.g.f73260m);
        this.f1343n = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) bVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f1722e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.C();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1722e = actionMenuPresenter2;
        actionMenuPresenter2.P(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        hVar.c(this.f1722e, this.f1720c);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1722e.i(this);
        this.f1721d = actionMenuView;
        x1.P1(actionMenuView, null);
        addView(this.f1721d, layoutParams);
    }

    public boolean x() {
        return this.f1350u;
    }

    public void y() {
        removeAllViews();
        this.f1344o = null;
        this.f1721d = null;
        this.f1722e = null;
        View view = this.f1343n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public void z(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1344o;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1344o = view;
        if (view != null && (linearLayout = this.f1345p) != null) {
            removeView(linearLayout);
            this.f1345p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public ActionBarContextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.C);
    }

    public ActionBarContextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        t0 G = t0.G(context, attributeSet, a.m.J, i4, 0);
        x1.P1(this, G.h(a.m.K));
        this.f1348s = G.u(a.m.P, 0);
        this.f1349t = G.u(a.m.O, 0);
        this.f1723f = G.q(a.m.N, 0);
        this.f1351v = G.u(a.m.M, a.j.f73304f);
        G.I();
    }
}
