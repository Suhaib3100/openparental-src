package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l0;
import androidx.core.view.i2;
import androidx.core.view.j2;
import androidx.core.view.k2;
import androidx.core.view.l2;
import androidx.core.view.x1;
import androidx.fragment.app.FragmentActivity;
import d.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e0 extends ActionBar implements ActionBarOverlayLayout.d {
    private static final String N = "WindowDecorActionBar";
    private static final Interpolator O = new AccelerateInterpolator();
    private static final Interpolator P = new DecelerateInterpolator();
    private static final int Q = -1;
    private static final long R = 100;
    private static final long S = 200;
    private boolean A;
    boolean D;
    boolean E;
    private boolean F;
    androidx.appcompat.view.i H;
    private boolean I;
    boolean J;

    /* renamed from: i, reason: collision with root package name */
    Context f881i;

    /* renamed from: j, reason: collision with root package name */
    private Context f882j;

    /* renamed from: k, reason: collision with root package name */
    private Activity f883k;

    /* renamed from: l, reason: collision with root package name */
    ActionBarOverlayLayout f884l;

    /* renamed from: m, reason: collision with root package name */
    ActionBarContainer f885m;

    /* renamed from: n, reason: collision with root package name */
    androidx.appcompat.widget.v f886n;

    /* renamed from: o, reason: collision with root package name */
    ActionBarContextView f887o;

    /* renamed from: p, reason: collision with root package name */
    View f888p;

    /* renamed from: q, reason: collision with root package name */
    l0 f889q;

    /* renamed from: s, reason: collision with root package name */
    private e f891s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f893u;

    /* renamed from: v, reason: collision with root package name */
    d f894v;

    /* renamed from: w, reason: collision with root package name */
    androidx.appcompat.view.b f895w;

    /* renamed from: x, reason: collision with root package name */
    b.a f896x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f897y;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<e> f890r = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    private int f892t = -1;

    /* renamed from: z, reason: collision with root package name */
    private ArrayList<ActionBar.c> f898z = new ArrayList<>();
    private int B = 0;
    boolean C = true;
    private boolean G = true;
    final j2 K = new a();
    final j2 L = new b();
    final l2 M = new c();

    /* compiled from: WindowDecorActionBar.java */
    class a extends k2 {
        a() {
        }

        @Override // androidx.core.view.k2, androidx.core.view.j2
        public void b(View view) {
            View view2;
            e0 e0Var = e0.this;
            if (e0Var.C && (view2 = e0Var.f888p) != null) {
                view2.setTranslationY(0.0f);
                e0.this.f885m.setTranslationY(0.0f);
            }
            e0.this.f885m.setVisibility(8);
            e0.this.f885m.h(false);
            e0 e0Var2 = e0.this;
            e0Var2.H = null;
            e0Var2.H0();
            ActionBarOverlayLayout actionBarOverlayLayout = e0.this.f884l;
            if (actionBarOverlayLayout != null) {
                x1.B1(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    class b extends k2 {
        b() {
        }

        @Override // androidx.core.view.k2, androidx.core.view.j2
        public void b(View view) {
            e0 e0Var = e0.this;
            e0Var.H = null;
            e0Var.f885m.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    class c implements l2 {
        c() {
        }

        @Override // androidx.core.view.l2
        public void a(View view) {
            ((View) e0.this.f885m.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public class d extends androidx.appcompat.view.b implements h.a {

        /* renamed from: d, reason: collision with root package name */
        private final Context f902d;

        /* renamed from: e, reason: collision with root package name */
        private final androidx.appcompat.view.menu.h f903e;

        /* renamed from: f, reason: collision with root package name */
        private b.a f904f;

        /* renamed from: g, reason: collision with root package name */
        private WeakReference<View> f905g;

        public d(Context context, b.a aVar) {
            this.f902d = context;
            this.f904f = aVar;
            androidx.appcompat.view.menu.h Z = new androidx.appcompat.view.menu.h(context).Z(1);
            this.f903e = Z;
            Z.X(this);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean a(@o0 androidx.appcompat.view.menu.h hVar, @o0 MenuItem menuItem) {
            b.a aVar = this.f904f;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void b(@o0 androidx.appcompat.view.menu.h hVar) {
            if (this.f904f == null) {
                return;
            }
            k();
            e0.this.f887o.r();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            e0 e0Var = e0.this;
            if (e0Var.f894v != this) {
                return;
            }
            if (e0.F0(e0Var.D, e0Var.E, false)) {
                this.f904f.a(this);
            } else {
                e0 e0Var2 = e0.this;
                e0Var2.f895w = this;
                e0Var2.f896x = this.f904f;
            }
            this.f904f = null;
            e0.this.E0(false);
            e0.this.f887o.s();
            e0 e0Var3 = e0.this;
            e0Var3.f884l.L(e0Var3.J);
            e0.this.f894v = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference<View> weakReference = this.f905g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f903e;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.h(this.f902d);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return e0.this.f887o.t();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return e0.this.f887o.u();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (e0.this.f894v != this) {
                return;
            }
            this.f903e.m0();
            try {
                this.f904f.d(this, this.f903e);
            } finally {
                this.f903e.l0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return e0.this.f887o.x();
        }

        @Override // androidx.appcompat.view.b
        public void n(View view) {
            e0.this.f887o.z(view);
            this.f905g = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        public void o(int i4) {
            p(e0.this.f881i.getResources().getString(i4));
        }

        @Override // androidx.appcompat.view.b
        public void p(CharSequence charSequence) {
            e0.this.f887o.A(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void r(int i4) {
            s(e0.this.f881i.getResources().getString(i4));
        }

        @Override // androidx.appcompat.view.b
        public void s(CharSequence charSequence) {
            e0.this.f887o.B(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void t(boolean z4) {
            super.t(z4);
            e0.this.f887o.C(z4);
        }

        public boolean u() {
            this.f903e.m0();
            try {
                return this.f904f.b(this, this.f903e);
            } finally {
                this.f903e.l0();
            }
        }

        public void v(androidx.appcompat.view.menu.h hVar, boolean z4) {
        }

        public void w(androidx.appcompat.view.menu.t tVar) {
        }

        public boolean x(androidx.appcompat.view.menu.t tVar) {
            if (this.f904f == null) {
                return false;
            }
            if (!tVar.hasVisibleItems()) {
                return true;
            }
            new androidx.appcompat.view.menu.n(e0.this.A(), tVar).l();
            return true;
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public class e extends ActionBar.e {

        /* renamed from: b, reason: collision with root package name */
        private ActionBar.f f907b;

        /* renamed from: c, reason: collision with root package name */
        private Object f908c;

        /* renamed from: d, reason: collision with root package name */
        private Drawable f909d;

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f910e;

        /* renamed from: f, reason: collision with root package name */
        private CharSequence f911f;

        /* renamed from: g, reason: collision with root package name */
        private int f912g = -1;

        /* renamed from: h, reason: collision with root package name */
        private View f913h;

        public e() {
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public CharSequence a() {
            return this.f911f;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public View b() {
            return this.f913h;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public Drawable c() {
            return this.f909d;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public int d() {
            return this.f912g;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public Object e() {
            return this.f908c;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public CharSequence f() {
            return this.f910e;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public void g() {
            e0.this.S(this);
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e h(int i4) {
            return i(e0.this.f881i.getResources().getText(i4));
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e i(CharSequence charSequence) {
            this.f911f = charSequence;
            int i4 = this.f912g;
            if (i4 >= 0) {
                e0.this.f889q.p(i4);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e j(int i4) {
            return k(LayoutInflater.from(e0.this.A()).inflate(i4, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e k(View view) {
            this.f913h = view;
            int i4 = this.f912g;
            if (i4 >= 0) {
                e0.this.f889q.p(i4);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e l(int i4) {
            return m(e.a.b(e0.this.f881i, i4));
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e m(Drawable drawable) {
            this.f909d = drawable;
            int i4 = this.f912g;
            if (i4 >= 0) {
                e0.this.f889q.p(i4);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e n(ActionBar.f fVar) {
            this.f907b = fVar;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e o(Object obj) {
            this.f908c = obj;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e p(int i4) {
            return q(e0.this.f881i.getResources().getText(i4));
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e q(CharSequence charSequence) {
            this.f910e = charSequence;
            int i4 = this.f912g;
            if (i4 >= 0) {
                e0.this.f889q.p(i4);
            }
            return this;
        }

        public ActionBar.f r() {
            return this.f907b;
        }

        public void s(int i4) {
            this.f912g = i4;
        }
    }

    public e0(Activity activity, boolean z4) {
        this.f883k = activity;
        View decorView = activity.getWindow().getDecorView();
        Q0(decorView);
        if (z4) {
            return;
        }
        this.f888p = decorView.findViewById(R.id.content);
    }

    static boolean F0(boolean z4, boolean z5, boolean z6) {
        if (z6) {
            return true;
        }
        return (z4 || z5) ? false : true;
    }

    private void G0() {
        if (this.f891s != null) {
            S(null);
        }
        this.f890r.clear();
        l0 l0Var = this.f889q;
        if (l0Var != null) {
            l0Var.k();
        }
        this.f892t = -1;
    }

    private void I0(ActionBar.e eVar, int i4) {
        e eVar2 = (e) eVar;
        if (eVar2.r() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        eVar2.s(i4);
        this.f890r.add(i4, eVar2);
        int size = this.f890r.size();
        while (true) {
            i4++;
            if (i4 >= size) {
                return;
            } else {
                this.f890r.get(i4).s(i4);
            }
        }
    }

    private void L0() {
        if (this.f889q != null) {
            return;
        }
        l0 l0Var = new l0(this.f881i);
        if (this.A) {
            l0Var.setVisibility(0);
            this.f886n.H(l0Var);
        } else {
            if (u() == 2) {
                l0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f884l;
                if (actionBarOverlayLayout != null) {
                    x1.B1(actionBarOverlayLayout);
                }
            } else {
                l0Var.setVisibility(8);
            }
            this.f885m.g(l0Var);
        }
        this.f889q = l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private androidx.appcompat.widget.v M0(View view) {
        if (view instanceof androidx.appcompat.widget.v) {
            return (androidx.appcompat.widget.v) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).c0();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of ".concat(view != 0 ? view.getClass().getSimpleName() : "null"));
    }

    private void P0() {
        if (this.F) {
            this.F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f884l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.N(false);
            }
            U0(false);
        }
    }

    private void Q0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(a.g.f73282x);
        this.f884l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.J(this);
        }
        this.f886n = M0(view.findViewById(a.g.f73236a));
        this.f887o = (ActionBarContextView) view.findViewById(a.g.f73250h);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(a.g.f73240c);
        this.f885m = actionBarContainer;
        androidx.appcompat.widget.v vVar = this.f886n;
        if (vVar == null || this.f887o == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f881i = vVar.getContext();
        boolean z4 = (this.f886n.S() & 4) != 0;
        if (z4) {
            this.f893u = true;
        }
        androidx.appcompat.view.a b5 = androidx.appcompat.view.a.b(this.f881i);
        m0(b5.a() || z4);
        R0(b5.g());
        TypedArray obtainStyledAttributes = this.f881i.obtainStyledAttributes(null, a.m.f73485a, a.b.f72973f, 0);
        if (obtainStyledAttributes.getBoolean(a.m.f73564p, false)) {
            h0(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.m.f73554n, 0);
        if (dimensionPixelSize != 0) {
            f0(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void R0(boolean z4) {
        this.A = z4;
        if (z4) {
            this.f885m.g(null);
            this.f886n.H(this.f889q);
        } else {
            this.f886n.H(null);
            this.f885m.g(this.f889q);
        }
        boolean z5 = u() == 2;
        l0 l0Var = this.f889q;
        if (l0Var != null) {
            if (z5) {
                l0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f884l;
                if (actionBarOverlayLayout != null) {
                    x1.B1(actionBarOverlayLayout);
                }
            } else {
                l0Var.setVisibility(8);
            }
        }
        this.f886n.D(!this.A && z5);
        this.f884l.K(!this.A && z5);
    }

    private boolean S0() {
        return x1.Y0(this.f885m);
    }

    private void T0() {
        if (this.F) {
            return;
        }
        this.F = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f884l;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.N(true);
        }
        U0(false);
    }

    private void U0(boolean z4) {
        if (F0(this.D, this.E, this.F)) {
            if (this.G) {
                return;
            }
            this.G = true;
            K0(z4);
            return;
        }
        if (this.G) {
            this.G = false;
            J0(z4);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context A() {
        if (this.f882j == null) {
            TypedValue typedValue = new TypedValue();
            this.f881i.getTheme().resolveAttribute(a.b.f72998k, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                this.f882j = new ContextThemeWrapper(this.f881i, i4);
            } else {
                this.f882j = this.f881i;
            }
        }
        return this.f882j;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void A0(CharSequence charSequence) {
        this.f886n.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence B() {
        return this.f886n.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void B0(CharSequence charSequence) {
        this.f886n.g(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void C() {
        if (this.D) {
            return;
        }
        this.D = true;
        U0(false);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void C0() {
        if (this.D) {
            this.D = false;
            U0(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.view.b D0(b.a aVar) {
        d dVar = this.f894v;
        if (dVar != null) {
            dVar.c();
        }
        this.f884l.L(false);
        this.f887o.y();
        d dVar2 = new d(this.f887o.getContext(), aVar);
        if (!dVar2.u()) {
            return null;
        }
        this.f894v = dVar2;
        dVar2.k();
        this.f887o.v(dVar2);
        E0(true);
        return dVar2;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean E() {
        return this.f884l.C();
    }

    public void E0(boolean z4) {
        i2 v4;
        i2 q4;
        if (z4) {
            T0();
        } else {
            P0();
        }
        if (!x1.Y0(this.f885m)) {
            if (z4) {
                this.f886n.setVisibility(4);
                this.f887o.setVisibility(0);
                return;
            } else {
                this.f886n.setVisibility(0);
                this.f887o.setVisibility(8);
                return;
            }
        }
        if (z4) {
            q4 = this.f886n.v(4, 100L);
            v4 = this.f887o.q(0, S);
        } else {
            v4 = this.f886n.v(0, S);
            q4 = this.f887o.q(8, 100L);
        }
        androidx.appcompat.view.i iVar = new androidx.appcompat.view.i();
        iVar.d(q4, v4);
        iVar.h();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean F() {
        int r4 = r();
        return this.G && (r4 == 0 || s() < r4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean G() {
        androidx.appcompat.widget.v vVar = this.f886n;
        return vVar != null && vVar.o();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e H() {
        return new e();
    }

    void H0() {
        b.a aVar = this.f896x;
        if (aVar != null) {
            aVar.a(this.f895w);
            this.f895w = null;
            this.f896x = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void I(Configuration configuration) {
        R0(androidx.appcompat.view.a.b(this.f881i).g());
    }

    public void J0(boolean z4) {
        View view;
        androidx.appcompat.view.i iVar = this.H;
        if (iVar != null) {
            iVar.a();
        }
        if (this.B != 0 || (!this.I && !z4)) {
            this.K.b(null);
            return;
        }
        this.f885m.setAlpha(1.0f);
        this.f885m.h(true);
        androidx.appcompat.view.i iVar2 = new androidx.appcompat.view.i();
        float f4 = -this.f885m.getHeight();
        if (z4) {
            this.f885m.getLocationInWindow(new int[]{0, 0});
            f4 -= r5[1];
        }
        i2 B = x1.g(this.f885m).B(f4);
        B.x(this.M);
        iVar2.c(B);
        if (this.C && (view = this.f888p) != null) {
            iVar2.c(x1.g(view).B(f4));
        }
        iVar2.f(O);
        iVar2.e(250L);
        iVar2.g(this.K);
        this.H = iVar2;
        iVar2.h();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean K(int i4, KeyEvent keyEvent) {
        Menu e4;
        d dVar = this.f894v;
        if (dVar == null || (e4 = dVar.e()) == null) {
            return false;
        }
        e4.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e4.performShortcut(i4, keyEvent, 0);
    }

    public void K0(boolean z4) {
        View view;
        View view2;
        androidx.appcompat.view.i iVar = this.H;
        if (iVar != null) {
            iVar.a();
        }
        this.f885m.setVisibility(0);
        if (this.B == 0 && (this.I || z4)) {
            this.f885m.setTranslationY(0.0f);
            float f4 = -this.f885m.getHeight();
            if (z4) {
                this.f885m.getLocationInWindow(new int[]{0, 0});
                f4 -= r5[1];
            }
            this.f885m.setTranslationY(f4);
            androidx.appcompat.view.i iVar2 = new androidx.appcompat.view.i();
            i2 B = x1.g(this.f885m).B(0.0f);
            B.x(this.M);
            iVar2.c(B);
            if (this.C && (view2 = this.f888p) != null) {
                view2.setTranslationY(f4);
                iVar2.c(x1.g(this.f888p).B(0.0f));
            }
            iVar2.f(P);
            iVar2.e(250L);
            iVar2.g(this.L);
            this.H = iVar2;
            iVar2.h();
        } else {
            this.f885m.setAlpha(1.0f);
            this.f885m.setTranslationY(0.0f);
            if (this.C && (view = this.f888p) != null) {
                view.setTranslationY(0.0f);
            }
            this.L.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f884l;
        if (actionBarOverlayLayout != null) {
            x1.B1(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void N() {
        G0();
    }

    public boolean N0() {
        return this.f886n.b();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void O(ActionBar.c cVar) {
        this.f898z.remove(cVar);
    }

    public boolean O0() {
        return this.f886n.l();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void P(ActionBar.e eVar) {
        Q(eVar.d());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Q(int i4) {
        if (this.f889q == null) {
            return;
        }
        e eVar = this.f891s;
        int d5 = eVar != null ? eVar.d() : this.f892t;
        this.f889q.l(i4);
        e remove = this.f890r.remove(i4);
        if (remove != null) {
            remove.s(-1);
        }
        int size = this.f890r.size();
        for (int i5 = i4; i5 < size; i5++) {
            this.f890r.get(i5).s(i5);
        }
        if (d5 == i4) {
            S(this.f890r.isEmpty() ? null : this.f890r.get(Math.max(0, i4 - 1)));
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean R() {
        ViewGroup x4 = this.f886n.x();
        if (x4 == null || x4.hasFocus()) {
            return false;
        }
        x4.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void S(ActionBar.e eVar) {
        if (u() != 2) {
            this.f892t = eVar != null ? eVar.d() : -1;
            return;
        }
        androidx.fragment.app.l0 x4 = (!(this.f883k instanceof FragmentActivity) || this.f886n.x().isInEditMode()) ? null : ((FragmentActivity) this.f883k).getSupportFragmentManager().u().x();
        e eVar2 = this.f891s;
        if (eVar2 != eVar) {
            this.f889q.o(eVar != null ? eVar.d() : -1);
            e eVar3 = this.f891s;
            if (eVar3 != null) {
                eVar3.r().b(this.f891s, x4);
            }
            e eVar4 = (e) eVar;
            this.f891s = eVar4;
            if (eVar4 != null) {
                eVar4.r().a(this.f891s, x4);
            }
        } else if (eVar2 != null) {
            eVar2.r().c(this.f891s, x4);
            this.f889q.c(eVar.d());
        }
        if (x4 == null || x4.B()) {
            return;
        }
        x4.r();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void T(Drawable drawable) {
        this.f885m.d(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void U(int i4) {
        V(LayoutInflater.from(A()).inflate(i4, this.f886n.x(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void V(View view) {
        this.f886n.T(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void W(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.f886n.T(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void X(boolean z4) {
        if (this.f893u) {
            return;
        }
        Y(z4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Y(boolean z4) {
        a0(z4 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Z(int i4) {
        if ((i4 & 4) != 0) {
            this.f893u = true;
        }
        this.f886n.p(i4);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.E) {
            this.E = false;
            U0(true);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void a0(int i4, int i5) {
        int S2 = this.f886n.S();
        if ((i5 & 4) != 0) {
            this.f893u = true;
        }
        this.f886n.p((i4 & i5) | ((~i5) & S2));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b(int i4) {
        this.B = i4;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void b0(boolean z4) {
        a0(z4 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void c0(boolean z4) {
        a0(z4 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(boolean z4) {
        this.C = z4;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void d0(boolean z4) {
        a0(z4 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (this.E) {
            return;
        }
        this.E = true;
        U0(true);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void e0(boolean z4) {
        a0(z4 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
        androidx.appcompat.view.i iVar = this.H;
        if (iVar != null) {
            iVar.a();
            this.H = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void f0(float f4) {
        x1.V1(this.f885m, f4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void g(ActionBar.c cVar) {
        this.f898z.add(cVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void g0(int i4) {
        if (i4 != 0 && !this.f884l.D()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f884l.I(i4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h(ActionBar.e eVar) {
        k(eVar, this.f890r.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h0(boolean z4) {
        if (z4 && !this.f884l.D()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.J = z4;
        this.f884l.L(z4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i(ActionBar.e eVar, int i4) {
        j(eVar, i4, this.f890r.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i0(int i4) {
        this.f886n.A(i4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j(ActionBar.e eVar, int i4, boolean z4) {
        L0();
        this.f889q.a(eVar, i4, z4);
        I0(eVar, i4);
        if (z4) {
            S(eVar);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j0(CharSequence charSequence) {
        this.f886n.q(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void k(ActionBar.e eVar, boolean z4) {
        L0();
        this.f889q.b(eVar, z4);
        I0(eVar, this.f890r.size());
        if (z4) {
            S(eVar);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void k0(int i4) {
        this.f886n.N(i4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void l0(Drawable drawable) {
        this.f886n.V(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean m() {
        androidx.appcompat.widget.v vVar = this.f886n;
        if (vVar == null || !vVar.n()) {
            return false;
        }
        this.f886n.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m0(boolean z4) {
        this.f886n.y(z4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void n(boolean z4) {
        if (z4 == this.f897y) {
            return;
        }
        this.f897y = z4;
        int size = this.f898z.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f898z.get(i4).a(z4);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void n0(int i4) {
        this.f886n.setIcon(i4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public View o() {
        return this.f886n.G();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void o0(Drawable drawable) {
        this.f886n.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int p() {
        return this.f886n.S();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void p0(SpinnerAdapter spinnerAdapter, ActionBar.d dVar) {
        this.f886n.P(spinnerAdapter, new y(dVar));
    }

    @Override // androidx.appcompat.app.ActionBar
    public float q() {
        return x1.T(this.f885m);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void q0(int i4) {
        this.f886n.j(i4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int r() {
        return this.f885m.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void r0(Drawable drawable) {
        this.f886n.I(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int s() {
        return this.f884l.w();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void s0(int i4) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int u4 = this.f886n.u();
        if (u4 == 2) {
            this.f892t = v();
            S(null);
            this.f889q.setVisibility(8);
        }
        if (u4 != i4 && !this.A && (actionBarOverlayLayout = this.f884l) != null) {
            x1.B1(actionBarOverlayLayout);
        }
        this.f886n.w(i4);
        boolean z4 = false;
        if (i4 == 2) {
            L0();
            this.f889q.setVisibility(0);
            int i5 = this.f892t;
            if (i5 != -1) {
                t0(i5);
                this.f892t = -1;
            }
        }
        this.f886n.D(i4 == 2 && !this.A);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f884l;
        if (i4 == 2 && !this.A) {
            z4 = true;
        }
        actionBarOverlayLayout2.K(z4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int t() {
        int u4 = this.f886n.u();
        if (u4 == 1) {
            return this.f886n.C();
        }
        if (u4 != 2) {
            return 0;
        }
        return this.f890r.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void t0(int i4) {
        int u4 = this.f886n.u();
        if (u4 == 1) {
            this.f886n.s(i4);
        } else {
            if (u4 != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            S(this.f890r.get(i4));
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public int u() {
        return this.f886n.u();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void u0(boolean z4) {
        androidx.appcompat.view.i iVar;
        this.I = z4;
        if (z4 || (iVar = this.H) == null) {
            return;
        }
        iVar.a();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int v() {
        e eVar;
        int u4 = this.f886n.u();
        if (u4 == 1) {
            return this.f886n.z();
        }
        if (u4 == 2 && (eVar = this.f891s) != null) {
            return eVar.d();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void v0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e w() {
        return this.f891s;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void w0(Drawable drawable) {
        this.f885m.f(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence x() {
        return this.f886n.R();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void x0(int i4) {
        y0(this.f881i.getString(i4));
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e y(int i4) {
        return this.f890r.get(i4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void y0(CharSequence charSequence) {
        this.f886n.r(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int z() {
        return this.f890r.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void z0(int i4) {
        A0(this.f881i.getString(i4));
    }

    public e0(Dialog dialog) {
        Q0(dialog.getWindow().getDecorView());
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public e0(View view) {
        Q0(view);
    }
}
