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
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.y;
import androidx.core.view.r3;
import androidx.core.view.s3;
import androidx.core.view.t3;
import androidx.core.view.u3;
import androidx.core.view.y1;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.f0;
import d.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class q extends ActionBar implements ActionBarOverlayLayout.d {
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
    Context f427i;

    /* renamed from: j, reason: collision with root package name */
    private Context f428j;

    /* renamed from: k, reason: collision with root package name */
    private Activity f429k;

    /* renamed from: l, reason: collision with root package name */
    ActionBarOverlayLayout f430l;

    /* renamed from: m, reason: collision with root package name */
    ActionBarContainer f431m;

    /* renamed from: n, reason: collision with root package name */
    y f432n;

    /* renamed from: o, reason: collision with root package name */
    ActionBarContextView f433o;

    /* renamed from: p, reason: collision with root package name */
    View f434p;

    /* renamed from: q, reason: collision with root package name */
    r0 f435q;

    /* renamed from: s, reason: collision with root package name */
    private e f437s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f439u;

    /* renamed from: v, reason: collision with root package name */
    d f440v;

    /* renamed from: w, reason: collision with root package name */
    androidx.appcompat.view.b f441w;

    /* renamed from: x, reason: collision with root package name */
    b.a f442x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f443y;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<e> f436r = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    private int f438t = -1;

    /* renamed from: z, reason: collision with root package name */
    private ArrayList<ActionBar.c> f444z = new ArrayList<>();
    private int B = 0;
    boolean C = true;
    private boolean G = true;
    final s3 K = new a();
    final s3 L = new b();
    final u3 M = new c();

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes3.dex */
    class a extends t3 {
        a() {
        }

        @Override // androidx.core.view.t3, androidx.core.view.s3
        public void b(View view) {
            View view2;
            q qVar = q.this;
            if (qVar.C && (view2 = qVar.f434p) != null) {
                view2.setTranslationY(0.0f);
                q.this.f431m.setTranslationY(0.0f);
            }
            q.this.f431m.setVisibility(8);
            q.this.f431m.h(false);
            q qVar2 = q.this;
            qVar2.H = null;
            qVar2.G0();
            ActionBarOverlayLayout actionBarOverlayLayout = q.this.f430l;
            if (actionBarOverlayLayout != null) {
                y1.v1(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes3.dex */
    class b extends t3 {
        b() {
        }

        @Override // androidx.core.view.t3, androidx.core.view.s3
        public void b(View view) {
            q qVar = q.this;
            qVar.H = null;
            qVar.f431m.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    class c implements u3 {
        c() {
        }

        @Override // androidx.core.view.u3
        public void a(View view) {
            ((View) q.this.f431m.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public class d extends androidx.appcompat.view.b implements g.a {

        /* renamed from: q, reason: collision with root package name */
        private final Context f448q;

        /* renamed from: r, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f449r;

        /* renamed from: s, reason: collision with root package name */
        private b.a f450s;

        /* renamed from: t, reason: collision with root package name */
        private WeakReference<View> f451t;

        public d(Context context, b.a aVar) {
            this.f448q = context;
            this.f450s = aVar;
            androidx.appcompat.view.menu.g Z = new androidx.appcompat.view.menu.g(context).Z(1);
            this.f449r = Z;
            Z.X(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@o0 androidx.appcompat.view.menu.g gVar, @o0 MenuItem menuItem) {
            b.a aVar = this.f450s;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@o0 androidx.appcompat.view.menu.g gVar) {
            if (this.f450s == null) {
                return;
            }
            k();
            q.this.f433o.r();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            q qVar = q.this;
            if (qVar.f440v != this) {
                return;
            }
            if (q.E0(qVar.D, qVar.E, false)) {
                this.f450s.a(this);
            } else {
                q qVar2 = q.this;
                qVar2.f441w = this;
                qVar2.f442x = this.f450s;
            }
            this.f450s = null;
            q.this.D0(false);
            q.this.f433o.s();
            q.this.f432n.L().sendAccessibilityEvent(32);
            q qVar3 = q.this;
            qVar3.f430l.O(qVar3.J);
            q.this.f440v = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference<View> weakReference = this.f451t;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f449r;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.h(this.f448q);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return q.this.f433o.t();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return q.this.f433o.u();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (q.this.f440v != this) {
                return;
            }
            this.f449r.m0();
            try {
                this.f450s.c(this, this.f449r);
            } finally {
                this.f449r.l0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return q.this.f433o.x();
        }

        @Override // androidx.appcompat.view.b
        public void n(View view) {
            q.this.f433o.z(view);
            this.f451t = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        public void o(int i5) {
            p(q.this.f427i.getResources().getString(i5));
        }

        @Override // androidx.appcompat.view.b
        public void p(CharSequence charSequence) {
            q.this.f433o.A(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void r(int i5) {
            s(q.this.f427i.getResources().getString(i5));
        }

        @Override // androidx.appcompat.view.b
        public void s(CharSequence charSequence) {
            q.this.f433o.B(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void t(boolean z5) {
            super.t(z5);
            q.this.f433o.C(z5);
        }

        public boolean u() {
            this.f449r.m0();
            try {
                return this.f450s.b(this, this.f449r);
            } finally {
                this.f449r.l0();
            }
        }

        public void v(androidx.appcompat.view.menu.g gVar, boolean z5) {
        }

        public void w(t tVar) {
        }

        public boolean x(t tVar) {
            if (this.f450s == null) {
                return false;
            }
            if (!tVar.hasVisibleItems()) {
                return true;
            }
            new androidx.appcompat.view.menu.m(q.this.z(), tVar).l();
            return true;
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public class e extends ActionBar.e {

        /* renamed from: b, reason: collision with root package name */
        private ActionBar.f f453b;

        /* renamed from: c, reason: collision with root package name */
        private Object f454c;

        /* renamed from: d, reason: collision with root package name */
        private Drawable f455d;

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f456e;

        /* renamed from: f, reason: collision with root package name */
        private CharSequence f457f;

        /* renamed from: g, reason: collision with root package name */
        private int f458g = -1;

        /* renamed from: h, reason: collision with root package name */
        private View f459h;

        public e() {
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public CharSequence a() {
            return this.f457f;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public View b() {
            return this.f459h;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public Drawable c() {
            return this.f455d;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public int d() {
            return this.f458g;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public Object e() {
            return this.f454c;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public CharSequence f() {
            return this.f456e;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public void g() {
            q.this.R(this);
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e h(int i5) {
            return i(q.this.f427i.getResources().getText(i5));
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e i(CharSequence charSequence) {
            this.f457f = charSequence;
            int i5 = this.f458g;
            if (i5 >= 0) {
                q.this.f435q.p(i5);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e j(int i5) {
            return k(LayoutInflater.from(q.this.z()).inflate(i5, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e k(View view) {
            this.f459h = view;
            int i5 = this.f458g;
            if (i5 >= 0) {
                q.this.f435q.p(i5);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e l(int i5) {
            return m(androidx.appcompat.content.res.a.d(q.this.f427i, i5));
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e m(Drawable drawable) {
            this.f455d = drawable;
            int i5 = this.f458g;
            if (i5 >= 0) {
                q.this.f435q.p(i5);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e n(ActionBar.f fVar) {
            this.f453b = fVar;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e o(Object obj) {
            this.f454c = obj;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e p(int i5) {
            return q(q.this.f427i.getResources().getText(i5));
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e q(CharSequence charSequence) {
            this.f456e = charSequence;
            int i5 = this.f458g;
            if (i5 >= 0) {
                q.this.f435q.p(i5);
            }
            return this;
        }

        public ActionBar.f r() {
            return this.f453b;
        }

        public void s(int i5) {
            this.f458g = i5;
        }
    }

    public q(Activity activity, boolean z5) {
        this.f429k = activity;
        View decorView = activity.getWindow().getDecorView();
        P0(decorView);
        if (z5) {
            return;
        }
        this.f434p = decorView.findViewById(R.id.content);
    }

    static boolean E0(boolean z5, boolean z6, boolean z7) {
        if (z7) {
            return true;
        }
        return (z5 || z6) ? false : true;
    }

    private void F0() {
        if (this.f437s != null) {
            R(null);
        }
        this.f436r.clear();
        r0 r0Var = this.f435q;
        if (r0Var != null) {
            r0Var.k();
        }
        this.f438t = -1;
    }

    private void H0(ActionBar.e eVar, int i5) {
        e eVar2 = (e) eVar;
        if (eVar2.r() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        eVar2.s(i5);
        this.f436r.add(i5, eVar2);
        int size = this.f436r.size();
        while (true) {
            i5++;
            if (i5 >= size) {
                return;
            } else {
                this.f436r.get(i5).s(i5);
            }
        }
    }

    private void K0() {
        if (this.f435q != null) {
            return;
        }
        r0 r0Var = new r0(this.f427i);
        if (this.A) {
            r0Var.setVisibility(0);
            this.f432n.t(r0Var);
        } else {
            if (t() == 2) {
                r0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f430l;
                if (actionBarOverlayLayout != null) {
                    y1.v1(actionBarOverlayLayout);
                }
            } else {
                r0Var.setVisibility(8);
            }
            this.f431m.g(r0Var);
        }
        this.f435q = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private y L0(View view) {
        if (view instanceof y) {
            return (y) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).a0();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of ".concat(view != 0 ? view.getClass().getSimpleName() : "null"));
    }

    private void O0() {
        if (this.F) {
            this.F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f430l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.Q(false);
            }
            T0(false);
        }
    }

    private void P0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(a.h.f21891m0);
        this.f430l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.M(this);
        }
        this.f432n = L0(view.findViewById(a.h.H));
        this.f433o = (ActionBarContextView) view.findViewById(a.h.P);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(a.h.J);
        this.f431m = actionBarContainer;
        y yVar = this.f432n;
        if (yVar == null || this.f433o == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f427i = yVar.l();
        boolean z5 = (this.f432n.Q() & 4) != 0;
        if (z5) {
            this.f439u = true;
        }
        androidx.appcompat.view.a b6 = androidx.appcompat.view.a.b(this.f427i);
        l0(b6.a() || z5);
        Q0(b6.g());
        TypedArray obtainStyledAttributes = this.f427i.obtainStyledAttributes(null, a.n.f22158a, a.c.f21559f, 0);
        if (obtainStyledAttributes.getBoolean(a.n.f22254p, false)) {
            g0(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.n.f22242n, 0);
        if (dimensionPixelSize != 0) {
            e0(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void Q0(boolean z5) {
        this.A = z5;
        if (z5) {
            this.f431m.g(null);
            this.f432n.t(this.f435q);
        } else {
            this.f432n.t(null);
            this.f431m.g(this.f435q);
        }
        boolean z6 = t() == 2;
        r0 r0Var = this.f435q;
        if (r0Var != null) {
            if (z6) {
                r0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f430l;
                if (actionBarOverlayLayout != null) {
                    y1.v1(actionBarOverlayLayout);
                }
            } else {
                r0Var.setVisibility(8);
            }
        }
        this.f432n.Y(!this.A && z6);
        this.f430l.N(!this.A && z6);
    }

    private boolean R0() {
        return y1.U0(this.f431m);
    }

    private void S0() {
        if (this.F) {
            return;
        }
        this.F = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f430l;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.Q(true);
        }
        T0(false);
    }

    private void T0(boolean z5) {
        if (E0(this.D, this.E, this.F)) {
            if (this.G) {
                return;
            }
            this.G = true;
            J0(z5);
            return;
        }
        if (this.G) {
            this.G = false;
            I0(z5);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence A() {
        return this.f432n.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void A0(CharSequence charSequence) {
        this.f432n.e(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void B() {
        if (this.D) {
            return;
        }
        this.D = true;
        T0(false);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void B0() {
        if (this.D) {
            this.D = false;
            T0(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.view.b C0(b.a aVar) {
        d dVar = this.f440v;
        if (dVar != null) {
            dVar.c();
        }
        this.f430l.O(false);
        this.f433o.y();
        d dVar2 = new d(this.f433o.getContext(), aVar);
        if (!dVar2.u()) {
            return null;
        }
        this.f440v = dVar2;
        dVar2.k();
        this.f433o.v(dVar2);
        D0(true);
        this.f433o.sendAccessibilityEvent(32);
        return dVar2;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean D() {
        return this.f430l.F();
    }

    public void D0(boolean z5) {
        r3 H;
        r3 q5;
        if (z5) {
            S0();
        } else {
            O0();
        }
        if (!R0()) {
            if (z5) {
                this.f432n.setVisibility(4);
                this.f433o.setVisibility(0);
                return;
            } else {
                this.f432n.setVisibility(0);
                this.f433o.setVisibility(8);
                return;
            }
        }
        if (z5) {
            q5 = this.f432n.H(4, R);
            H = this.f433o.q(0, S);
        } else {
            H = this.f432n.H(0, S);
            q5 = this.f433o.q(8, R);
        }
        androidx.appcompat.view.i iVar = new androidx.appcompat.view.i();
        iVar.d(q5, H);
        iVar.h();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean E() {
        int q5 = q();
        return this.G && (q5 == 0 || r() < q5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean F() {
        y yVar = this.f432n;
        return yVar != null && yVar.w();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e G() {
        return new e();
    }

    void G0() {
        b.a aVar = this.f442x;
        if (aVar != null) {
            aVar.a(this.f441w);
            this.f441w = null;
            this.f442x = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void H(Configuration configuration) {
        Q0(androidx.appcompat.view.a.b(this.f427i).g());
    }

    public void I0(boolean z5) {
        View view;
        androidx.appcompat.view.i iVar = this.H;
        if (iVar != null) {
            iVar.a();
        }
        if (this.B != 0 || (!this.I && !z5)) {
            this.K.b(null);
            return;
        }
        this.f431m.setAlpha(1.0f);
        this.f431m.h(true);
        androidx.appcompat.view.i iVar2 = new androidx.appcompat.view.i();
        float f6 = -this.f431m.getHeight();
        if (z5) {
            this.f431m.getLocationInWindow(new int[]{0, 0});
            f6 -= r5[1];
        }
        r3 B = y1.g(this.f431m).B(f6);
        B.x(this.M);
        iVar2.c(B);
        if (this.C && (view = this.f434p) != null) {
            iVar2.c(y1.g(view).B(f6));
        }
        iVar2.f(O);
        iVar2.e(250L);
        iVar2.g(this.K);
        this.H = iVar2;
        iVar2.h();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean J(int i5, KeyEvent keyEvent) {
        Menu e6;
        d dVar = this.f440v;
        if (dVar == null || (e6 = dVar.e()) == null) {
            return false;
        }
        e6.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e6.performShortcut(i5, keyEvent, 0);
    }

    public void J0(boolean z5) {
        View view;
        View view2;
        androidx.appcompat.view.i iVar = this.H;
        if (iVar != null) {
            iVar.a();
        }
        this.f431m.setVisibility(0);
        if (this.B == 0 && (this.I || z5)) {
            this.f431m.setTranslationY(0.0f);
            float f6 = -this.f431m.getHeight();
            if (z5) {
                this.f431m.getLocationInWindow(new int[]{0, 0});
                f6 -= r5[1];
            }
            this.f431m.setTranslationY(f6);
            androidx.appcompat.view.i iVar2 = new androidx.appcompat.view.i();
            r3 B = y1.g(this.f431m).B(0.0f);
            B.x(this.M);
            iVar2.c(B);
            if (this.C && (view2 = this.f434p) != null) {
                view2.setTranslationY(f6);
                iVar2.c(y1.g(this.f434p).B(0.0f));
            }
            iVar2.f(P);
            iVar2.e(250L);
            iVar2.g(this.L);
            this.H = iVar2;
            iVar2.h();
        } else {
            this.f431m.setAlpha(1.0f);
            this.f431m.setTranslationY(0.0f);
            if (this.C && (view = this.f434p) != null) {
                view.setTranslationY(0.0f);
            }
            this.L.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f430l;
        if (actionBarOverlayLayout != null) {
            y1.v1(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void M() {
        F0();
    }

    public boolean M0() {
        return this.f432n.i();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void N(ActionBar.c cVar) {
        this.f444z.remove(cVar);
    }

    public boolean N0() {
        return this.f432n.m();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void O(ActionBar.e eVar) {
        P(eVar.d());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void P(int i5) {
        if (this.f435q == null) {
            return;
        }
        e eVar = this.f437s;
        int d6 = eVar != null ? eVar.d() : this.f438t;
        this.f435q.l(i5);
        e remove = this.f436r.remove(i5);
        if (remove != null) {
            remove.s(-1);
        }
        int size = this.f436r.size();
        for (int i6 = i5; i6 < size; i6++) {
            this.f436r.get(i6).s(i6);
        }
        if (d6 == i5) {
            R(this.f436r.isEmpty() ? null : this.f436r.get(Math.max(0, i5 - 1)));
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean Q() {
        ViewGroup L = this.f432n.L();
        if (L == null || L.hasFocus()) {
            return false;
        }
        L.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void R(ActionBar.e eVar) {
        if (t() != 2) {
            this.f438t = eVar != null ? eVar.d() : -1;
            return;
        }
        f0 s5 = (!(this.f429k instanceof FragmentActivity) || this.f432n.L().isInEditMode()) ? null : ((FragmentActivity) this.f429k).Y().u().s();
        e eVar2 = this.f437s;
        if (eVar2 != eVar) {
            this.f435q.o(eVar != null ? eVar.d() : -1);
            e eVar3 = this.f437s;
            if (eVar3 != null) {
                eVar3.r().b(this.f437s, s5);
            }
            e eVar4 = (e) eVar;
            this.f437s = eVar4;
            if (eVar4 != null) {
                eVar4.r().a(this.f437s, s5);
            }
        } else if (eVar2 != null) {
            eVar2.r().c(this.f437s, s5);
            this.f435q.c(eVar.d());
        }
        if (s5 == null || s5.w()) {
            return;
        }
        s5.m();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void S(Drawable drawable) {
        this.f431m.d(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void T(int i5) {
        U(LayoutInflater.from(z()).inflate(i5, this.f432n.L(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void U(View view) {
        this.f432n.T(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void V(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.f432n.T(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void W(boolean z5) {
        if (this.f439u) {
            return;
        }
        X(z5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void X(boolean z5) {
        Z(z5 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Y(int i5) {
        if ((i5 & 4) != 0) {
            this.f439u = true;
        }
        this.f432n.x(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Z(int i5, int i6) {
        int Q2 = this.f432n.Q();
        if ((i6 & 4) != 0) {
            this.f439u = true;
        }
        this.f432n.x((i5 & i6) | ((~i6) & Q2));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.E) {
            this.E = false;
            T0(true);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void a0(boolean z5) {
        Z(z5 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void b0(boolean z5) {
        Z(z5 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z5) {
        this.C = z5;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void c0(boolean z5) {
        Z(z5 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.E) {
            return;
        }
        this.E = true;
        T0(true);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void d0(boolean z5) {
        Z(z5 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.i iVar = this.H;
        if (iVar != null) {
            iVar.a();
            this.H = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void e0(float f6) {
        y1.N1(this.f431m, f6);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void f(ActionBar.c cVar) {
        this.f444z.add(cVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void f0(int i5) {
        if (i5 != 0 && !this.f430l.G()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f430l.L(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void g(ActionBar.e eVar) {
        j(eVar, this.f436r.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void g0(boolean z5) {
        if (z5 && !this.f430l.G()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.J = z5;
        this.f430l.O(z5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h(ActionBar.e eVar, int i5) {
        i(eVar, i5, this.f436r.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h0(int i5) {
        this.f432n.S(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i(ActionBar.e eVar, int i5, boolean z5) {
        K0();
        this.f435q.a(eVar, i5, z5);
        H0(eVar, i5);
        if (z5) {
            R(eVar);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i0(CharSequence charSequence) {
        this.f432n.y(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j(ActionBar.e eVar, boolean z5) {
        K0();
        this.f435q.b(eVar, z5);
        H0(eVar, this.f436r.size());
        if (z5) {
            R(eVar);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j0(int i5) {
        this.f432n.J(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void k0(Drawable drawable) {
        this.f432n.X(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean l() {
        y yVar = this.f432n;
        if (yVar == null || !yVar.v()) {
            return false;
        }
        this.f432n.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void l0(boolean z5) {
        this.f432n.M(z5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m(boolean z5) {
        if (z5 == this.f443y) {
            return;
        }
        this.f443y = z5;
        int size = this.f444z.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f444z.get(i5).onMenuVisibilityChanged(z5);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m0(int i5) {
        this.f432n.setIcon(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public View n() {
        return this.f432n.s();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void n0(Drawable drawable) {
        this.f432n.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int o() {
        return this.f432n.Q();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void o0(SpinnerAdapter spinnerAdapter, ActionBar.d dVar) {
        this.f432n.N(spinnerAdapter, new l(dVar));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i5) {
        this.B = i5;
    }

    @Override // androidx.appcompat.app.ActionBar
    public float p() {
        return y1.R(this.f431m);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void p0(int i5) {
        this.f432n.h(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int q() {
        return this.f431m.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void q0(Drawable drawable) {
        this.f432n.u(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int r() {
        return this.f430l.B();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void r0(int i5) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int F = this.f432n.F();
        if (F == 2) {
            this.f438t = u();
            R(null);
            this.f435q.setVisibility(8);
        }
        if (F != i5 && !this.A && (actionBarOverlayLayout = this.f430l) != null) {
            y1.v1(actionBarOverlayLayout);
        }
        this.f432n.I(i5);
        boolean z5 = false;
        if (i5 == 2) {
            K0();
            this.f435q.setVisibility(0);
            int i6 = this.f438t;
            if (i6 != -1) {
                s0(i6);
                this.f438t = -1;
            }
        }
        this.f432n.Y(i5 == 2 && !this.A);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f430l;
        if (i5 == 2 && !this.A) {
            z5 = true;
        }
        actionBarOverlayLayout2.N(z5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int s() {
        int F = this.f432n.F();
        if (F == 1) {
            return this.f432n.V();
        }
        if (F != 2) {
            return 0;
        }
        return this.f436r.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void s0(int i5) {
        int F = this.f432n.F();
        if (F == 1) {
            this.f432n.C(i5);
        } else {
            if (F != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            R(this.f436r.get(i5));
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public int t() {
        return this.f432n.F();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void t0(boolean z5) {
        androidx.appcompat.view.i iVar;
        this.I = z5;
        if (z5 || (iVar = this.H) == null) {
            return;
        }
        iVar.a();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int u() {
        e eVar;
        int F = this.f432n.F();
        if (F == 1) {
            return this.f432n.R();
        }
        if (F == 2 && (eVar = this.f437s) != null) {
            return eVar.d();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void u0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e v() {
        return this.f437s;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void v0(Drawable drawable) {
        this.f431m.f(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence w() {
        return this.f432n.P();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void w0(int i5) {
        x0(this.f427i.getString(i5));
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e x(int i5) {
        return this.f436r.get(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void x0(CharSequence charSequence) {
        this.f432n.z(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int y() {
        return this.f436r.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void y0(int i5) {
        z0(this.f427i.getString(i5));
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context z() {
        if (this.f428j == null) {
            TypedValue typedValue = new TypedValue();
            this.f427i.getTheme().resolveAttribute(a.c.f21589k, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                this.f428j = new ContextThemeWrapper(this.f427i, i5);
            } else {
                this.f428j = this.f427i;
            }
        }
        return this.f428j;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void z0(CharSequence charSequence) {
        this.f432n.setTitle(charSequence);
    }

    public q(Dialog dialog) {
        P0(dialog.getWindow().getDecorView());
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public q(View view) {
        P0(view);
    }
}
