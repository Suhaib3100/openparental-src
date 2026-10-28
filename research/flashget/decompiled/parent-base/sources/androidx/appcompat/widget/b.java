package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.i2;
import androidx.core.view.j2;
import androidx.core.view.x1;
import d.a;

/* compiled from: AbsActionBarView.java */
/* loaded from: classes.dex */
abstract class b extends ViewGroup {

    /* renamed from: j, reason: collision with root package name */
    private static final int f1718j = 200;

    /* renamed from: b, reason: collision with root package name */
    protected final C0019b f1719b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f1720c;

    /* renamed from: d, reason: collision with root package name */
    protected ActionMenuView f1721d;

    /* renamed from: e, reason: collision with root package name */
    protected ActionMenuPresenter f1722e;

    /* renamed from: f, reason: collision with root package name */
    protected int f1723f;

    /* renamed from: g, reason: collision with root package name */
    protected i2 f1724g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1725h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1726i;

    /* compiled from: AbsActionBarView.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.r();
        }
    }

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.b$b, reason: collision with other inner class name */
    protected class C0019b implements j2 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1728a = false;

        /* renamed from: b, reason: collision with root package name */
        int f1729b;

        protected C0019b() {
        }

        @Override // androidx.core.view.j2
        public void a(View view) {
            this.f1728a = true;
        }

        @Override // androidx.core.view.j2
        public void b(View view) {
            if (this.f1728a) {
                return;
            }
            b bVar = b.this;
            bVar.f1724g = null;
            b.super.setVisibility(this.f1729b);
        }

        @Override // androidx.core.view.j2
        public void c(View view) {
            b.super.setVisibility(0);
            this.f1728a = false;
        }

        public C0019b d(i2 i2Var, int i4) {
            b.this.f1724g = i2Var;
            this.f1729b = i4;
            return this;
        }
    }

    b(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    protected static int m(int i4, int i5, boolean z4) {
        return z4 ? i4 - i5 : i4 + i5;
    }

    public void c(int i4) {
        q(i4, 200L).y();
    }

    public boolean d() {
        return k() && getVisibility() == 0;
    }

    public void e() {
        ActionMenuPresenter actionMenuPresenter = this.f1722e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.C();
        }
    }

    public int f() {
        return this.f1724g != null ? this.f1719b.f1729b : getVisibility();
    }

    public int g() {
        return this.f1723f;
    }

    public boolean h() {
        ActionMenuPresenter actionMenuPresenter = this.f1722e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.F();
        }
        return false;
    }

    public boolean i() {
        ActionMenuPresenter actionMenuPresenter = this.f1722e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.H();
        }
        return false;
    }

    public boolean j() {
        ActionMenuPresenter actionMenuPresenter = this.f1722e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.I();
        }
        return false;
    }

    public boolean k() {
        ActionMenuPresenter actionMenuPresenter = this.f1722e;
        return actionMenuPresenter != null && actionMenuPresenter.J();
    }

    protected int l(View view, int i4, int i5, int i6) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i5);
        return Math.max(0, (i4 - view.getMeasuredWidth()) - i6);
    }

    protected int n(View view, int i4, int i5, int i6, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int a5 = androidx.appcompat.widget.a.a(i6, measuredHeight, 2, i5);
        if (z4) {
            view.layout(i4 - measuredWidth, a5, i4, measuredHeight + a5);
        } else {
            view.layout(i4, a5, i4 + measuredWidth, measuredHeight + a5);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public void o() {
        post(new a());
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.m.f73485a, a.b.f72973f, 0);
        p(obtainStyledAttributes.getLayoutDimension(a.m.f73559o, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1722e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.K(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1726i = false;
        }
        if (!this.f1726i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1726i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1726i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1725h = false;
        }
        if (!this.f1725h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1725h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1725h = false;
        }
        return true;
    }

    public void p(int i4) {
        this.f1723f = i4;
        requestLayout();
    }

    public i2 q(int i4, long j4) {
        i2 i2Var = this.f1724g;
        if (i2Var != null) {
            i2Var.d();
        }
        if (i4 != 0) {
            i2 b5 = x1.g(this).b(0.0f);
            b5.s(j4);
            b5.u(this.f1719b.d(b5, i4));
            return b5;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        i2 b6 = x1.g(this).b(1.0f);
        b6.s(j4);
        b6.u(this.f1719b.d(b6, i4));
        return b6;
    }

    public boolean r() {
        ActionMenuPresenter actionMenuPresenter = this.f1722e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.R();
        }
        return false;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            i2 i2Var = this.f1724g;
            if (i2Var != null) {
                i2Var.d();
            }
            super.setVisibility(i4);
        }
    }

    b(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    b(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1719b = new C0019b();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(a.b.f72956c, typedValue, true) && typedValue.resourceId != 0) {
            this.f1720c = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1720c = context;
        }
    }
}
