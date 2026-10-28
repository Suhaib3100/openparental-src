package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.i2;
import androidx.core.view.k2;
import androidx.core.view.x1;
import com.google.android.material.badge.BadgeDrawable;
import d.a;

/* compiled from: ToolbarWidgetWrapper.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class x0 implements v {

    /* renamed from: s, reason: collision with root package name */
    private static final String f2045s = "ToolbarWidgetWrapper";

    /* renamed from: t, reason: collision with root package name */
    private static final int f2046t = 3;

    /* renamed from: u, reason: collision with root package name */
    private static final long f2047u = 200;

    /* renamed from: a, reason: collision with root package name */
    Toolbar f2048a;

    /* renamed from: b, reason: collision with root package name */
    private int f2049b;

    /* renamed from: c, reason: collision with root package name */
    private View f2050c;

    /* renamed from: d, reason: collision with root package name */
    private Spinner f2051d;

    /* renamed from: e, reason: collision with root package name */
    private View f2052e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f2053f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f2054g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f2055h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2056i;

    /* renamed from: j, reason: collision with root package name */
    CharSequence f2057j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f2058k;

    /* renamed from: l, reason: collision with root package name */
    private CharSequence f2059l;

    /* renamed from: m, reason: collision with root package name */
    Window.Callback f2060m;

    /* renamed from: n, reason: collision with root package name */
    boolean f2061n;

    /* renamed from: o, reason: collision with root package name */
    private ActionMenuPresenter f2062o;

    /* renamed from: p, reason: collision with root package name */
    private int f2063p;

    /* renamed from: q, reason: collision with root package name */
    private int f2064q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f2065r;

    /* compiled from: ToolbarWidgetWrapper.java */
    class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f2066b;

        a() {
            this.f2066b = new androidx.appcompat.view.menu.a(x0.this.f2048a.getContext(), 0, R.id.home, 0, 0, x0.this.f2057j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.f2060m;
            if (callback == null || !x0Var.f2061n) {
                return;
            }
            callback.onMenuItemSelected(0, this.f2066b);
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    class b extends k2 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f2068a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2069b;

        b(int i4) {
            this.f2069b = i4;
        }

        @Override // androidx.core.view.k2, androidx.core.view.j2
        public void a(View view) {
            this.f2068a = true;
        }

        @Override // androidx.core.view.k2, androidx.core.view.j2
        public void b(View view) {
            if (this.f2068a) {
                return;
            }
            x0.this.f2048a.setVisibility(this.f2069b);
        }

        @Override // androidx.core.view.k2, androidx.core.view.j2
        public void c(View view) {
            x0.this.f2048a.setVisibility(0);
        }
    }

    public x0(Toolbar toolbar, boolean z4) {
        this(toolbar, z4, a.k.f73326b, a.f.f73226v);
    }

    private int W() {
        if (this.f2048a.N() == null) {
            return 11;
        }
        this.f2065r = this.f2048a.N();
        return 15;
    }

    private void X() {
        if (this.f2051d == null) {
            this.f2051d = new AppCompatSpinner(getContext(), null, a.b.f73008m);
            this.f2051d.setLayoutParams(new Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    private void Y(CharSequence charSequence) {
        this.f2057j = charSequence;
        if ((this.f2049b & 8) != 0) {
            this.f2048a.W0(charSequence);
            if (this.f2056i) {
                x1.K1(this.f2048a.getRootView(), charSequence);
            }
        }
    }

    private void Z() {
        if ((this.f2049b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2059l)) {
                this.f2048a.I0(this.f2064q);
            } else {
                this.f2048a.J0(this.f2059l);
            }
        }
    }

    private void a0() {
        if ((this.f2049b & 4) == 0) {
            this.f2048a.L0(null);
            return;
        }
        Toolbar toolbar = this.f2048a;
        Drawable drawable = this.f2055h;
        if (drawable == null) {
            drawable = this.f2065r;
        }
        toolbar.L0(drawable);
    }

    private void b0() {
        Drawable drawable;
        int i4 = this.f2049b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) != 0) {
            drawable = this.f2054g;
            if (drawable == null) {
                drawable = this.f2053f;
            }
        } else {
            drawable = this.f2053f;
        }
        this.f2048a.D0(drawable);
    }

    @Override // androidx.appcompat.widget.v
    public void A(int i4) {
        q(i4 == 0 ? null : getContext().getString(i4));
    }

    @Override // androidx.appcompat.widget.v
    public void B() {
    }

    @Override // androidx.appcompat.widget.v
    public int C() {
        Spinner spinner = this.f2051d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.v
    public void D(boolean z4) {
        this.f2048a.x0(z4);
    }

    @Override // androidx.appcompat.widget.v
    public void E(int i4) {
        if (i4 == this.f2064q) {
            return;
        }
        this.f2064q = i4;
        if (TextUtils.isEmpty(this.f2048a.M())) {
            A(this.f2064q);
        }
    }

    @Override // androidx.appcompat.widget.v
    public void F() {
        this.f2048a.g();
    }

    @Override // androidx.appcompat.widget.v
    public View G() {
        return this.f2052e;
    }

    @Override // androidx.appcompat.widget.v
    public void H(l0 l0Var) {
        View view = this.f2050c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f2048a;
            if (parent == toolbar) {
                toolbar.removeView(this.f2050c);
            }
        }
        this.f2050c = l0Var;
        if (l0Var == null || this.f2063p != 2) {
            return;
        }
        this.f2048a.addView(l0Var, 0);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f2050c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        layoutParams.f658a = BadgeDrawable.f52616u;
        l0Var.m(true);
    }

    @Override // androidx.appcompat.widget.v
    public void I(Drawable drawable) {
        this.f2054g = drawable;
        b0();
    }

    @Override // androidx.appcompat.widget.v
    public void J(Drawable drawable) {
        if (this.f2065r != drawable) {
            this.f2065r = drawable;
            a0();
        }
    }

    @Override // androidx.appcompat.widget.v
    public void K(SparseArray<Parcelable> sparseArray) {
        this.f2048a.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.v
    public boolean L() {
        return this.f2050c != null;
    }

    @Override // androidx.appcompat.widget.v
    public void M(int i4) {
        i2 v4 = v(i4, f2047u);
        if (v4 != null) {
            v4.y();
        }
    }

    @Override // androidx.appcompat.widget.v
    public void N(int i4) {
        V(i4 != 0 ? e.a.b(getContext(), i4) : null);
    }

    @Override // androidx.appcompat.widget.v
    public void O(o.a aVar, h.a aVar2) {
        this.f2048a.H0(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.v
    public void P(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        X();
        this.f2051d.setAdapter(spinnerAdapter);
        this.f2051d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.v
    public void Q(SparseArray<Parcelable> sparseArray) {
        this.f2048a.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.v
    public CharSequence R() {
        return this.f2048a.S();
    }

    @Override // androidx.appcompat.widget.v
    public int S() {
        return this.f2049b;
    }

    @Override // androidx.appcompat.widget.v
    public void T(View view) {
        View view2 = this.f2052e;
        if (view2 != null && (this.f2049b & 16) != 0) {
            this.f2048a.removeView(view2);
        }
        this.f2052e = view;
        if (view == null || (this.f2049b & 16) == 0) {
            return;
        }
        this.f2048a.addView(view);
    }

    @Override // androidx.appcompat.widget.v
    public void U() {
    }

    @Override // androidx.appcompat.widget.v
    public void V(Drawable drawable) {
        this.f2055h = drawable;
        a0();
    }

    @Override // androidx.appcompat.widget.v
    public void a(Drawable drawable) {
        x1.P1(this.f2048a, drawable);
    }

    @Override // androidx.appcompat.widget.v
    public boolean b() {
        return this.f2053f != null;
    }

    @Override // androidx.appcompat.widget.v
    public boolean c() {
        return this.f2048a.e();
    }

    @Override // androidx.appcompat.widget.v
    public void collapseActionView() {
        this.f2048a.f();
    }

    @Override // androidx.appcompat.widget.v
    public boolean d() {
        return this.f2048a.e0();
    }

    @Override // androidx.appcompat.widget.v
    public boolean e() {
        return this.f2048a.h1();
    }

    @Override // androidx.appcompat.widget.v
    public void f(Menu menu, o.a aVar) {
        if (this.f2062o == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f2048a.getContext());
            this.f2062o = actionMenuPresenter;
            actionMenuPresenter.t(a.g.f73254j);
        }
        this.f2062o.f(aVar);
        this.f2048a.G0((androidx.appcompat.view.menu.h) menu, this.f2062o);
    }

    @Override // androidx.appcompat.widget.v
    public void g(CharSequence charSequence) {
        if (this.f2056i) {
            return;
        }
        Y(charSequence);
    }

    @Override // androidx.appcompat.widget.v
    public Context getContext() {
        return this.f2048a.getContext();
    }

    @Override // androidx.appcompat.widget.v
    public int getHeight() {
        return this.f2048a.getHeight();
    }

    @Override // androidx.appcompat.widget.v
    public CharSequence getTitle() {
        return this.f2048a.U();
    }

    @Override // androidx.appcompat.widget.v
    public int getVisibility() {
        return this.f2048a.getVisibility();
    }

    @Override // androidx.appcompat.widget.v
    public boolean h() {
        return this.f2048a.j0();
    }

    @Override // androidx.appcompat.widget.v
    public void i() {
        this.f2061n = true;
    }

    @Override // androidx.appcompat.widget.v
    public void j(int i4) {
        I(i4 != 0 ? e.a.b(getContext(), i4) : null);
    }

    @Override // androidx.appcompat.widget.v
    public void k(Window.Callback callback) {
        this.f2060m = callback;
    }

    @Override // androidx.appcompat.widget.v
    public boolean l() {
        return this.f2054g != null;
    }

    @Override // androidx.appcompat.widget.v
    public boolean m() {
        return this.f2048a.i0();
    }

    @Override // androidx.appcompat.widget.v
    public boolean n() {
        return this.f2048a.d0();
    }

    @Override // androidx.appcompat.widget.v
    public boolean o() {
        return this.f2048a.k0();
    }

    @Override // androidx.appcompat.widget.v
    public void p(int i4) {
        View view;
        int i5 = this.f2049b ^ i4;
        this.f2049b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    Z();
                }
                a0();
            }
            if ((i5 & 3) != 0) {
                b0();
            }
            if ((i5 & 8) != 0) {
                if ((i4 & 8) != 0) {
                    this.f2048a.W0(this.f2057j);
                    this.f2048a.R0(this.f2058k);
                } else {
                    this.f2048a.W0(null);
                    this.f2048a.R0(null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f2052e) == null) {
                return;
            }
            if ((i4 & 16) != 0) {
                this.f2048a.addView(view);
            } else {
                this.f2048a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.v
    public void q(CharSequence charSequence) {
        this.f2059l = charSequence;
        Z();
    }

    @Override // androidx.appcompat.widget.v
    public void r(CharSequence charSequence) {
        this.f2058k = charSequence;
        if ((this.f2049b & 8) != 0) {
            this.f2048a.R0(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.v
    public void s(int i4) {
        Spinner spinner = this.f2051d;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i4);
    }

    @Override // androidx.appcompat.widget.v
    public void setIcon(int i4) {
        setIcon(i4 != 0 ? e.a.b(getContext(), i4) : null);
    }

    @Override // androidx.appcompat.widget.v
    public void setTitle(CharSequence charSequence) {
        this.f2056i = true;
        Y(charSequence);
    }

    @Override // androidx.appcompat.widget.v
    public void setVisibility(int i4) {
        this.f2048a.setVisibility(i4);
    }

    @Override // androidx.appcompat.widget.v
    public Menu t() {
        return this.f2048a.J();
    }

    @Override // androidx.appcompat.widget.v
    public int u() {
        return this.f2063p;
    }

    @Override // androidx.appcompat.widget.v
    public i2 v(int i4, long j4) {
        return x1.g(this.f2048a).b(i4 == 0 ? 1.0f : 0.0f).s(j4).u(new b(i4));
    }

    @Override // androidx.appcompat.widget.v
    public void w(int i4) {
        View view;
        int i5 = this.f2063p;
        if (i4 != i5) {
            if (i5 == 1) {
                Spinner spinner = this.f2051d;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.f2048a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.f2051d);
                    }
                }
            } else if (i5 == 2 && (view = this.f2050c) != null) {
                ViewParent parent2 = view.getParent();
                Toolbar toolbar2 = this.f2048a;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.f2050c);
                }
            }
            this.f2063p = i4;
            if (i4 != 0) {
                if (i4 == 1) {
                    X();
                    this.f2048a.addView(this.f2051d, 0);
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException(android.support.v4.media.a.a("Invalid navigation mode ", i4));
                    }
                    View view2 = this.f2050c;
                    if (view2 != null) {
                        this.f2048a.addView(view2, 0);
                        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f2050c.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                        layoutParams.f658a = BadgeDrawable.f52616u;
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.v
    public ViewGroup x() {
        return this.f2048a;
    }

    @Override // androidx.appcompat.widget.v
    public void y(boolean z4) {
    }

    @Override // androidx.appcompat.widget.v
    public int z() {
        Spinner spinner = this.f2051d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    public x0(Toolbar toolbar, boolean z4, int i4, int i5) {
        Drawable drawable;
        this.f2063p = 0;
        this.f2064q = 0;
        this.f2048a = toolbar;
        this.f2057j = toolbar.U();
        this.f2058k = toolbar.S();
        this.f2056i = this.f2057j != null;
        this.f2055h = toolbar.N();
        t0 G = t0.G(toolbar.getContext(), null, a.m.f73485a, a.b.f72973f, 0);
        this.f2065r = G.h(a.m.f73569q);
        if (z4) {
            CharSequence x4 = G.x(a.m.C);
            if (!TextUtils.isEmpty(x4)) {
                setTitle(x4);
            }
            CharSequence x5 = G.x(a.m.A);
            if (!TextUtils.isEmpty(x5)) {
                r(x5);
            }
            Drawable h4 = G.h(a.m.f73594v);
            if (h4 != null) {
                I(h4);
            }
            Drawable h5 = G.h(a.m.f73579s);
            if (h5 != null) {
                setIcon(h5);
            }
            if (this.f2055h == null && (drawable = this.f2065r) != null) {
                V(drawable);
            }
            p(G.o(a.m.f73544l, 0));
            int u4 = G.u(a.m.f73539k, 0);
            if (u4 != 0) {
                T(LayoutInflater.from(this.f2048a.getContext()).inflate(u4, (ViewGroup) this.f2048a, false));
                p(this.f2049b | 16);
            }
            int q4 = G.q(a.m.f73559o, 0);
            if (q4 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2048a.getLayoutParams();
                layoutParams.height = q4;
                this.f2048a.setLayoutParams(layoutParams);
            }
            int f4 = G.f(a.m.f73529i, -1);
            int f5 = G.f(a.m.f73509e, -1);
            if (f4 >= 0 || f5 >= 0) {
                this.f2048a.B0(Math.max(f4, 0), Math.max(f5, 0));
            }
            int u5 = G.u(a.m.D, 0);
            if (u5 != 0) {
                Toolbar toolbar2 = this.f2048a;
                toolbar2.c1(toolbar2.getContext(), u5);
            }
            int u6 = G.u(a.m.B, 0);
            if (u6 != 0) {
                Toolbar toolbar3 = this.f2048a;
                toolbar3.S0(toolbar3.getContext(), u6);
            }
            int u7 = G.u(a.m.f73604x, 0);
            if (u7 != 0) {
                this.f2048a.P0(u7);
            }
        } else {
            this.f2049b = W();
        }
        G.I();
        E(i4);
        this.f2059l = this.f2048a.M();
        this.f2048a.M0(new a());
    }

    @Override // androidx.appcompat.widget.v
    public void setIcon(Drawable drawable) {
        this.f2053f = drawable;
        b0();
    }
}
