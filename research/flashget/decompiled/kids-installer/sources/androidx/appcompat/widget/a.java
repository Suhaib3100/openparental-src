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
import androidx.core.view.r3;
import androidx.core.view.s3;
import androidx.core.view.y1;
import d.a;

/* compiled from: AbsActionBarView.java */
/* loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* renamed from: w, reason: collision with root package name */
    private static final int f1091w = 200;

    /* renamed from: o, reason: collision with root package name */
    protected final b f1092o;

    /* renamed from: p, reason: collision with root package name */
    protected final Context f1093p;

    /* renamed from: q, reason: collision with root package name */
    protected ActionMenuView f1094q;

    /* renamed from: r, reason: collision with root package name */
    protected ActionMenuPresenter f1095r;

    /* renamed from: s, reason: collision with root package name */
    protected int f1096s;

    /* renamed from: t, reason: collision with root package name */
    protected r3 f1097t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1098u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1099v;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    class RunnableC0010a implements Runnable {
        RunnableC0010a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.r();
        }
    }

    /* compiled from: AbsActionBarView.java */
    /* loaded from: classes2.dex */
    protected class b implements s3 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1101a = false;

        /* renamed from: b, reason: collision with root package name */
        int f1102b;

        protected b() {
        }

        @Override // androidx.core.view.s3
        public void a(View view) {
            this.f1101a = true;
        }

        @Override // androidx.core.view.s3
        public void b(View view) {
            if (this.f1101a) {
                return;
            }
            a aVar = a.this;
            aVar.f1097t = null;
            a.super.setVisibility(this.f1102b);
        }

        @Override // androidx.core.view.s3
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1101a = false;
        }

        public b d(r3 r3Var, int i5) {
            a.this.f1097t = r3Var;
            this.f1102b = i5;
            return this;
        }
    }

    a(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    protected static int m(int i5, int i6, boolean z5) {
        return z5 ? i5 - i6 : i5 + i6;
    }

    public void c(int i5) {
        q(i5, 200L).y();
    }

    public boolean d() {
        return k() && getVisibility() == 0;
    }

    public void e() {
        ActionMenuPresenter actionMenuPresenter = this.f1095r;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
    }

    public int f() {
        return this.f1097t != null ? this.f1092o.f1102b : getVisibility();
    }

    public int g() {
        return this.f1096s;
    }

    public boolean h() {
        ActionMenuPresenter actionMenuPresenter = this.f1095r;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.E();
        }
        return false;
    }

    public boolean i() {
        ActionMenuPresenter actionMenuPresenter = this.f1095r;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.G();
        }
        return false;
    }

    public boolean j() {
        ActionMenuPresenter actionMenuPresenter = this.f1095r;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.H();
        }
        return false;
    }

    public boolean k() {
        ActionMenuPresenter actionMenuPresenter = this.f1095r;
        return actionMenuPresenter != null && actionMenuPresenter.I();
    }

    protected int l(View view, int i5, int i6, int i7) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i6);
        return Math.max(0, (i5 - view.getMeasuredWidth()) - i7);
    }

    protected int n(View view, int i5, int i6, int i7, boolean z5) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = ((i7 - measuredHeight) / 2) + i6;
        if (z5) {
            view.layout(i5 - measuredWidth, i8, i5, measuredHeight + i8);
        } else {
            view.layout(i5, i8, i5 + measuredWidth, measuredHeight + i8);
        }
        return z5 ? -measuredWidth : measuredWidth;
    }

    public void o() {
        post(new RunnableC0010a());
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.n.f22158a, a.c.f21559f, 0);
        p(obtainStyledAttributes.getLayoutDimension(a.n.f22248o, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1095r;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.J(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1099v = false;
        }
        if (!this.f1099v) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1099v = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1099v = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1098u = false;
        }
        if (!this.f1098u) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1098u = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1098u = false;
        }
        return true;
    }

    public void p(int i5) {
        this.f1096s = i5;
        requestLayout();
    }

    public r3 q(int i5, long j5) {
        r3 r3Var = this.f1097t;
        if (r3Var != null) {
            r3Var.d();
        }
        if (i5 != 0) {
            r3 b6 = y1.g(this).b(0.0f);
            b6.s(j5);
            b6.u(this.f1092o.d(b6, i5));
            return b6;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        r3 b7 = y1.g(this).b(1.0f);
        b7.s(j5);
        b7.u(this.f1092o.d(b7, i5));
        return b7;
    }

    public boolean r() {
        ActionMenuPresenter actionMenuPresenter = this.f1095r;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.Q();
        }
        return false;
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        if (i5 != getVisibility()) {
            r3 r3Var = this.f1097t;
            if (r3Var != null) {
                r3Var.d();
            }
            super.setVisibility(i5);
        }
    }

    a(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f1092o = new b();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(a.c.f21541c, typedValue, true) && typedValue.resourceId != 0) {
            this.f1093p = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1093p = context;
        }
    }
}
