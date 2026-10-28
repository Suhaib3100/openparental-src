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
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.r3;
import androidx.core.view.t3;
import androidx.core.view.y1;
import com.google.android.material.badge.BadgeDrawable;
import d.a;

/* compiled from: ToolbarWidgetWrapper.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class a1 implements y {

    /* renamed from: s, reason: collision with root package name */
    private static final String f1104s = "ToolbarWidgetWrapper";

    /* renamed from: t, reason: collision with root package name */
    private static final int f1105t = 3;

    /* renamed from: u, reason: collision with root package name */
    private static final long f1106u = 200;

    /* renamed from: a, reason: collision with root package name */
    Toolbar f1107a;

    /* renamed from: b, reason: collision with root package name */
    private int f1108b;

    /* renamed from: c, reason: collision with root package name */
    private View f1109c;

    /* renamed from: d, reason: collision with root package name */
    private Spinner f1110d;

    /* renamed from: e, reason: collision with root package name */
    private View f1111e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f1112f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f1113g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f1114h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1115i;

    /* renamed from: j, reason: collision with root package name */
    CharSequence f1116j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f1117k;

    /* renamed from: l, reason: collision with root package name */
    private CharSequence f1118l;

    /* renamed from: m, reason: collision with root package name */
    Window.Callback f1119m;

    /* renamed from: n, reason: collision with root package name */
    boolean f1120n;

    /* renamed from: o, reason: collision with root package name */
    private ActionMenuPresenter f1121o;

    /* renamed from: p, reason: collision with root package name */
    private int f1122p;

    /* renamed from: q, reason: collision with root package name */
    private int f1123q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f1124r;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f1125o;

        a() {
            this.f1125o = new androidx.appcompat.view.menu.a(a1.this.f1107a.getContext(), 0, R.id.home, 0, 0, a1.this.f1116j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a1 a1Var = a1.this;
            Window.Callback callback = a1Var.f1119m;
            if (callback == null || !a1Var.f1120n) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1125o);
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes3.dex */
    class b extends t3 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1127a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1128b;

        b(int i5) {
            this.f1128b = i5;
        }

        @Override // androidx.core.view.t3, androidx.core.view.s3
        public void a(View view) {
            this.f1127a = true;
        }

        @Override // androidx.core.view.t3, androidx.core.view.s3
        public void b(View view) {
            if (this.f1127a) {
                return;
            }
            a1.this.f1107a.setVisibility(this.f1128b);
        }

        @Override // androidx.core.view.t3, androidx.core.view.s3
        public void c(View view) {
            a1.this.f1107a.setVisibility(0);
        }
    }

    public a1(Toolbar toolbar, boolean z5) {
        this(toolbar, z5, a.l.f21971b, a.g.f21844v);
    }

    private int Z() {
        if (this.f1107a.L() == null) {
            return 11;
        }
        this.f1124r = this.f1107a.L();
        return 15;
    }

    private void a0() {
        if (this.f1110d == null) {
            this.f1110d = new AppCompatSpinner(l(), null, a.c.f21601m);
            this.f1110d.setLayoutParams(new Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    private void b0(CharSequence charSequence) {
        this.f1116j = charSequence;
        if ((this.f1108b & 8) != 0) {
            this.f1107a.R0(charSequence);
        }
    }

    private void c0() {
        if ((this.f1108b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1118l)) {
                this.f1107a.D0(this.f1123q);
            } else {
                this.f1107a.E0(this.f1118l);
            }
        }
    }

    private void d0() {
        if ((this.f1108b & 4) == 0) {
            this.f1107a.G0(null);
            return;
        }
        Toolbar toolbar = this.f1107a;
        Drawable drawable = this.f1114h;
        if (drawable == null) {
            drawable = this.f1124r;
        }
        toolbar.G0(drawable);
    }

    private void e0() {
        Drawable drawable;
        int i5 = this.f1108b;
        if ((i5 & 2) == 0) {
            drawable = null;
        } else if ((i5 & 1) != 0) {
            drawable = this.f1113g;
            if (drawable == null) {
                drawable = this.f1112f;
            }
        } else {
            drawable = this.f1112f;
        }
        this.f1107a.y0(drawable);
    }

    @Override // androidx.appcompat.widget.y
    public void A(Drawable drawable) {
        if (this.f1124r != drawable) {
            this.f1124r = drawable;
            d0();
        }
    }

    @Override // androidx.appcompat.widget.y
    public void B(SparseArray<Parcelable> sparseArray) {
        this.f1107a.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.y
    public void C(int i5) {
        Spinner spinner = this.f1110d;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i5);
    }

    @Override // androidx.appcompat.widget.y
    public Menu D() {
        return this.f1107a.I();
    }

    @Override // androidx.appcompat.widget.y
    public boolean E() {
        return this.f1109c != null;
    }

    @Override // androidx.appcompat.widget.y
    public int F() {
        return this.f1122p;
    }

    @Override // androidx.appcompat.widget.y
    public void G(int i5) {
        r3 H = H(i5, f1106u);
        if (H != null) {
            H.y();
        }
    }

    @Override // androidx.appcompat.widget.y
    public r3 H(int i5, long j5) {
        return y1.g(this.f1107a).b(i5 == 0 ? 1.0f : 0.0f).s(j5).u(new b(i5));
    }

    @Override // androidx.appcompat.widget.y
    public void I(int i5) {
        View view;
        int i6 = this.f1122p;
        if (i5 != i6) {
            if (i6 == 1) {
                Spinner spinner = this.f1110d;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.f1107a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.f1110d);
                    }
                }
            } else if (i6 == 2 && (view = this.f1109c) != null) {
                ViewParent parent2 = view.getParent();
                Toolbar toolbar2 = this.f1107a;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.f1109c);
                }
            }
            this.f1122p = i5;
            if (i5 != 0) {
                if (i5 == 1) {
                    a0();
                    this.f1107a.addView(this.f1110d, 0);
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a("Invalid navigation mode ", i5));
                    }
                    View view2 = this.f1109c;
                    if (view2 != null) {
                        this.f1107a.addView(view2, 0);
                        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f1109c.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                        layoutParams.f165a = BadgeDrawable.H;
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.y
    public void J(int i5) {
        X(i5 != 0 ? androidx.appcompat.content.res.a.d(l(), i5) : null);
    }

    @Override // androidx.appcompat.widget.y
    public void K(n.a aVar, g.a aVar2) {
        this.f1107a.C0(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.y
    public ViewGroup L() {
        return this.f1107a;
    }

    @Override // androidx.appcompat.widget.y
    public void M(boolean z5) {
    }

    @Override // androidx.appcompat.widget.y
    public void N(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        a0();
        this.f1110d.setAdapter(spinnerAdapter);
        this.f1110d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.y
    public void O(SparseArray<Parcelable> sparseArray) {
        this.f1107a.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.y
    public CharSequence P() {
        return this.f1107a.Q();
    }

    @Override // androidx.appcompat.widget.y
    public int Q() {
        return this.f1108b;
    }

    @Override // androidx.appcompat.widget.y
    public int R() {
        Spinner spinner = this.f1110d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.y
    public void S(int i5) {
        y(i5 == 0 ? null : l().getString(i5));
    }

    @Override // androidx.appcompat.widget.y
    public void T(View view) {
        View view2 = this.f1111e;
        if (view2 != null && (this.f1108b & 16) != 0) {
            this.f1107a.removeView(view2);
        }
        this.f1111e = view;
        if (view == null || (this.f1108b & 16) == 0) {
            return;
        }
        this.f1107a.addView(view);
    }

    @Override // androidx.appcompat.widget.y
    public void U() {
    }

    @Override // androidx.appcompat.widget.y
    public int V() {
        Spinner spinner = this.f1110d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.y
    public void W() {
    }

    @Override // androidx.appcompat.widget.y
    public void X(Drawable drawable) {
        this.f1114h = drawable;
        d0();
    }

    @Override // androidx.appcompat.widget.y
    public void Y(boolean z5) {
        this.f1107a.s0(z5);
    }

    @Override // androidx.appcompat.widget.y
    public void a(Menu menu, n.a aVar) {
        if (this.f1121o == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1107a.getContext());
            this.f1121o = actionMenuPresenter;
            actionMenuPresenter.s(a.h.T);
        }
        this.f1121o.h(aVar);
        this.f1107a.B0((androidx.appcompat.view.menu.g) menu, this.f1121o);
    }

    @Override // androidx.appcompat.widget.y
    public void b(Drawable drawable) {
        y1.I1(this.f1107a, drawable);
    }

    @Override // androidx.appcompat.widget.y
    public int c() {
        return this.f1107a.getVisibility();
    }

    @Override // androidx.appcompat.widget.y
    public void collapseActionView() {
        this.f1107a.e();
    }

    @Override // androidx.appcompat.widget.y
    public int d() {
        return this.f1107a.getHeight();
    }

    @Override // androidx.appcompat.widget.y
    public void e(CharSequence charSequence) {
        if (this.f1115i) {
            return;
        }
        b0(charSequence);
    }

    @Override // androidx.appcompat.widget.y
    public boolean f() {
        return this.f1107a.g0();
    }

    @Override // androidx.appcompat.widget.y
    public void g() {
        this.f1120n = true;
    }

    @Override // androidx.appcompat.widget.y
    public CharSequence getTitle() {
        return this.f1107a.S();
    }

    @Override // androidx.appcompat.widget.y
    public void h(int i5) {
        u(i5 != 0 ? androidx.appcompat.content.res.a.d(l(), i5) : null);
    }

    @Override // androidx.appcompat.widget.y
    public boolean i() {
        return this.f1112f != null;
    }

    @Override // androidx.appcompat.widget.y
    public boolean j() {
        return this.f1107a.d();
    }

    @Override // androidx.appcompat.widget.y
    public void k(Window.Callback callback) {
        this.f1119m = callback;
    }

    @Override // androidx.appcompat.widget.y
    public Context l() {
        return this.f1107a.getContext();
    }

    @Override // androidx.appcompat.widget.y
    public boolean m() {
        return this.f1113g != null;
    }

    @Override // androidx.appcompat.widget.y
    public boolean n() {
        return this.f1107a.f0();
    }

    @Override // androidx.appcompat.widget.y
    public boolean o() {
        return this.f1107a.c0();
    }

    @Override // androidx.appcompat.widget.y
    public boolean p() {
        return this.f1107a.c1();
    }

    @Override // androidx.appcompat.widget.y
    public void q(int i5) {
        if (i5 == this.f1123q) {
            return;
        }
        this.f1123q = i5;
        if (TextUtils.isEmpty(this.f1107a.K())) {
            S(this.f1123q);
        }
    }

    @Override // androidx.appcompat.widget.y
    public void r() {
        this.f1107a.f();
    }

    @Override // androidx.appcompat.widget.y
    public View s() {
        return this.f1111e;
    }

    @Override // androidx.appcompat.widget.y
    public void setIcon(int i5) {
        setIcon(i5 != 0 ? androidx.appcompat.content.res.a.d(l(), i5) : null);
    }

    @Override // androidx.appcompat.widget.y
    public void setTitle(CharSequence charSequence) {
        this.f1115i = true;
        b0(charSequence);
    }

    @Override // androidx.appcompat.widget.y
    public void setVisibility(int i5) {
        this.f1107a.setVisibility(i5);
    }

    @Override // androidx.appcompat.widget.y
    public void t(r0 r0Var) {
        View view = this.f1109c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1107a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1109c);
            }
        }
        this.f1109c = r0Var;
        if (r0Var == null || this.f1122p != 2) {
            return;
        }
        this.f1107a.addView(r0Var, 0);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f1109c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        layoutParams.f165a = BadgeDrawable.H;
        r0Var.m(true);
    }

    @Override // androidx.appcompat.widget.y
    public void u(Drawable drawable) {
        this.f1113g = drawable;
        e0();
    }

    @Override // androidx.appcompat.widget.y
    public boolean v() {
        return this.f1107a.b0();
    }

    @Override // androidx.appcompat.widget.y
    public boolean w() {
        return this.f1107a.h0();
    }

    @Override // androidx.appcompat.widget.y
    public void x(int i5) {
        View view;
        int i6 = this.f1108b ^ i5;
        this.f1108b = i5;
        if (i6 != 0) {
            if ((i6 & 4) != 0) {
                if ((i5 & 4) != 0) {
                    c0();
                }
                d0();
            }
            if ((i6 & 3) != 0) {
                e0();
            }
            if ((i6 & 8) != 0) {
                if ((i5 & 8) != 0) {
                    this.f1107a.R0(this.f1116j);
                    this.f1107a.M0(this.f1117k);
                } else {
                    this.f1107a.R0(null);
                    this.f1107a.M0(null);
                }
            }
            if ((i6 & 16) == 0 || (view = this.f1111e) == null) {
                return;
            }
            if ((i5 & 16) != 0) {
                this.f1107a.addView(view);
            } else {
                this.f1107a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.y
    public void y(CharSequence charSequence) {
        this.f1118l = charSequence;
        c0();
    }

    @Override // androidx.appcompat.widget.y
    public void z(CharSequence charSequence) {
        this.f1117k = charSequence;
        if ((this.f1108b & 8) != 0) {
            this.f1107a.M0(charSequence);
        }
    }

    public a1(Toolbar toolbar, boolean z5, int i5, int i6) {
        Drawable drawable;
        this.f1122p = 0;
        this.f1123q = 0;
        this.f1107a = toolbar;
        this.f1116j = toolbar.S();
        this.f1117k = toolbar.Q();
        this.f1115i = this.f1116j != null;
        this.f1114h = toolbar.L();
        z0 G = z0.G(toolbar.getContext(), null, a.n.f22158a, a.c.f21559f, 0);
        this.f1124r = G.h(a.n.f22260q);
        if (z5) {
            CharSequence x5 = G.x(a.n.C);
            if (!TextUtils.isEmpty(x5)) {
                setTitle(x5);
            }
            CharSequence x6 = G.x(a.n.A);
            if (!TextUtils.isEmpty(x6)) {
                z(x6);
            }
            Drawable h5 = G.h(a.n.f22290v);
            if (h5 != null) {
                u(h5);
            }
            Drawable h6 = G.h(a.n.f22272s);
            if (h6 != null) {
                setIcon(h6);
            }
            if (this.f1114h == null && (drawable = this.f1124r) != null) {
                X(drawable);
            }
            x(G.o(a.n.f22230l, 0));
            int u5 = G.u(a.n.f22224k, 0);
            if (u5 != 0) {
                T(LayoutInflater.from(this.f1107a.getContext()).inflate(u5, (ViewGroup) this.f1107a, false));
                x(this.f1108b | 16);
            }
            int q5 = G.q(a.n.f22248o, 0);
            if (q5 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1107a.getLayoutParams();
                layoutParams.height = q5;
                this.f1107a.setLayoutParams(layoutParams);
            }
            int f6 = G.f(a.n.f22212i, -1);
            int f7 = G.f(a.n.f22186e, -1);
            if (f6 >= 0 || f7 >= 0) {
                this.f1107a.w0(Math.max(f6, 0), Math.max(f7, 0));
            }
            int u6 = G.u(a.n.D, 0);
            if (u6 != 0) {
                Toolbar toolbar2 = this.f1107a;
                toolbar2.X0(toolbar2.getContext(), u6);
            }
            int u7 = G.u(a.n.B, 0);
            if (u7 != 0) {
                Toolbar toolbar3 = this.f1107a;
                toolbar3.N0(toolbar3.getContext(), u7);
            }
            int u8 = G.u(a.n.f22302x, 0);
            if (u8 != 0) {
                this.f1107a.K0(u8);
            }
        } else {
            this.f1108b = Z();
        }
        G.I();
        q(i5);
        this.f1118l = this.f1107a.K();
        this.f1107a.H0(new a());
    }

    @Override // androidx.appcompat.widget.y
    public void setIcon(Drawable drawable) {
        this.f1112f = drawable;
        e0();
    }
}
