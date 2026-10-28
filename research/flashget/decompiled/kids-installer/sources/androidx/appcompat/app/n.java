package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.y;
import androidx.core.view.y1;
import java.util.ArrayList;

/* compiled from: ToolbarActionBar.java */
/* loaded from: classes2.dex */
class n extends ActionBar {

    /* renamed from: i, reason: collision with root package name */
    y f386i;

    /* renamed from: j, reason: collision with root package name */
    boolean f387j;

    /* renamed from: k, reason: collision with root package name */
    Window.Callback f388k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f389l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f390m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<ActionBar.c> f391n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    private final Runnable f392o = new a();

    /* renamed from: p, reason: collision with root package name */
    private final Toolbar.e f393p;

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.F0();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    class b implements Toolbar.e {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            return n.this.f388k.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private final class c implements n.a {

        /* renamed from: o, reason: collision with root package name */
        private boolean f396o;

        c() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@o0 androidx.appcompat.view.menu.g gVar, boolean z5) {
            if (this.f396o) {
                return;
            }
            this.f396o = true;
            n.this.f386i.r();
            Window.Callback callback = n.this.f388k;
            if (callback != null) {
                callback.onPanelClosed(108, gVar);
            }
            this.f396o = false;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@o0 androidx.appcompat.view.menu.g gVar) {
            Window.Callback callback = n.this.f388k;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@o0 androidx.appcompat.view.menu.g gVar, @o0 MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@o0 androidx.appcompat.view.menu.g gVar) {
            n nVar = n.this;
            if (nVar.f388k != null) {
                if (nVar.f386i.f()) {
                    n.this.f388k.onPanelClosed(108, gVar);
                } else if (n.this.f388k.onPreparePanel(0, null, gVar)) {
                    n.this.f388k.onMenuOpened(108, gVar);
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private class e extends androidx.appcompat.view.k {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public View onCreatePanelView(int i5) {
            return i5 == 0 ? new View(n.this.f386i.l()) : super.onCreatePanelView(i5);
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean onPreparePanel(int i5, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i5, view, menu);
            if (onPreparePanel) {
                n nVar = n.this;
                if (!nVar.f387j) {
                    nVar.f386i.g();
                    n.this.f387j = true;
                }
            }
            return onPreparePanel;
        }
    }

    n(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f393p = bVar;
        this.f386i = new a1(toolbar, false);
        e eVar = new e(callback);
        this.f388k = eVar;
        this.f386i.k(eVar);
        toolbar.I0(bVar);
        this.f386i.e(charSequence);
    }

    private Menu D0() {
        if (!this.f389l) {
            this.f386i.K(new c(), new d());
            this.f389l = true;
        }
        return this.f386i.D();
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence A() {
        return this.f386i.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void A0(CharSequence charSequence) {
        this.f386i.e(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void B() {
        this.f386i.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void B0() {
        this.f386i.setVisibility(0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean C() {
        this.f386i.L().removeCallbacks(this.f392o);
        y1.p1(this.f386i.L(), this.f392o);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean E() {
        return this.f386i.c() == 0;
    }

    public Window.Callback E0() {
        return this.f388k;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean F() {
        return false;
    }

    void F0() {
        Menu D0 = D0();
        androidx.appcompat.view.menu.g gVar = D0 instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) D0 : null;
        if (gVar != null) {
            gVar.m0();
        }
        try {
            D0.clear();
            if (!this.f388k.onCreatePanelMenu(0, D0) || !this.f388k.onPreparePanel(0, null, D0)) {
                D0.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.l0();
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e G() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void H(Configuration configuration) {
    }

    @Override // androidx.appcompat.app.ActionBar
    void I() {
        this.f386i.L().removeCallbacks(this.f392o);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean J(int i5, KeyEvent keyEvent) {
        Menu D0 = D0();
        if (D0 == null) {
            return false;
        }
        D0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return D0.performShortcut(i5, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean K(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            L();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean L() {
        return this.f386i.p();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void M() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void N(ActionBar.c cVar) {
        this.f391n.remove(cVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void O(ActionBar.e eVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void P(int i5) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean Q() {
        ViewGroup L = this.f386i.L();
        if (L == null || L.hasFocus()) {
            return false;
        }
        L.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void R(ActionBar.e eVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void S(@q0 Drawable drawable) {
        this.f386i.b(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void T(int i5) {
        U(LayoutInflater.from(this.f386i.l()).inflate(i5, this.f386i.L(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void U(View view) {
        V(view, new ActionBar.LayoutParams(-2, -2));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void V(View view, ActionBar.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.f386i.T(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void W(boolean z5) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void X(boolean z5) {
        Z(z5 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    @SuppressLint({"WrongConstant"})
    public void Y(int i5) {
        Z(i5, -1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Z(int i5, int i6) {
        this.f386i.x((i5 & i6) | ((~i6) & this.f386i.Q()));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void a0(boolean z5) {
        Z(z5 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void b0(boolean z5) {
        Z(z5 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void c0(boolean z5) {
        Z(z5 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void d0(boolean z5) {
        Z(z5 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void e0(float f6) {
        y1.N1(this.f386i.L(), f6);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void f(ActionBar.c cVar) {
        this.f391n.add(cVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void g(ActionBar.e eVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h(ActionBar.e eVar, int i5) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h0(int i5) {
        this.f386i.S(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i(ActionBar.e eVar, int i5, boolean z5) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i0(CharSequence charSequence) {
        this.f386i.y(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j(ActionBar.e eVar, boolean z5) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j0(int i5) {
        this.f386i.J(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean k() {
        return this.f386i.o();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void k0(Drawable drawable) {
        this.f386i.X(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean l() {
        if (!this.f386i.v()) {
            return false;
        }
        this.f386i.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void l0(boolean z5) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m(boolean z5) {
        if (z5 == this.f390m) {
            return;
        }
        this.f390m = z5;
        int size = this.f391n.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f391n.get(i5).onMenuVisibilityChanged(z5);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m0(int i5) {
        this.f386i.setIcon(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public View n() {
        return this.f386i.s();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void n0(Drawable drawable) {
        this.f386i.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int o() {
        return this.f386i.Q();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void o0(SpinnerAdapter spinnerAdapter, ActionBar.d dVar) {
        this.f386i.N(spinnerAdapter, new l(dVar));
    }

    @Override // androidx.appcompat.app.ActionBar
    public float p() {
        return y1.R(this.f386i.L());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void p0(int i5) {
        this.f386i.h(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int q() {
        return this.f386i.d();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void q0(Drawable drawable) {
        this.f386i.u(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void r0(int i5) {
        if (i5 == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f386i.I(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int s() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void s0(int i5) {
        if (this.f386i.F() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.f386i.C(i5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int t() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void t0(boolean z5) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public int u() {
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void u0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e v() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void v0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence w() {
        return this.f386i.P();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void w0(int i5) {
        y yVar = this.f386i;
        yVar.z(i5 != 0 ? yVar.l().getText(i5) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e x(int i5) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void x0(CharSequence charSequence) {
        this.f386i.z(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int y() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void y0(int i5) {
        y yVar = this.f386i;
        yVar.setTitle(i5 != 0 ? yVar.l().getText(i5) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context z() {
        return this.f386i.l();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void z0(CharSequence charSequence) {
        this.f386i.setTitle(charSequence);
    }
}
