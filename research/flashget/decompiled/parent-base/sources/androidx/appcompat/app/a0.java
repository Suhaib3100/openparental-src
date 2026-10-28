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
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.x0;
import androidx.core.view.x1;
import java.util.ArrayList;

/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
class a0 extends ActionBar {

    /* renamed from: i, reason: collision with root package name */
    final androidx.appcompat.widget.v f832i;

    /* renamed from: j, reason: collision with root package name */
    final Window.Callback f833j;

    /* renamed from: k, reason: collision with root package name */
    final AppCompatDelegateImpl.i f834k;

    /* renamed from: l, reason: collision with root package name */
    boolean f835l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f836m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f837n;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<ActionBar.c> f838o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f839p = new a();

    /* renamed from: q, reason: collision with root package name */
    private final Toolbar.g f840q;

    /* compiled from: ToolbarActionBar.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.F0();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    class b implements Toolbar.g {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.g
        public boolean onMenuItemClick(MenuItem menuItem) {
            return a0.this.f833j.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private final class c implements o.a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f843b;

        c() {
        }

        @Override // androidx.appcompat.view.menu.o.a
        public void d(@o0 androidx.appcompat.view.menu.h hVar, boolean z4) {
            if (this.f843b) {
                return;
            }
            this.f843b = true;
            a0.this.f832i.F();
            a0.this.f833j.onPanelClosed(108, hVar);
            this.f843b = false;
        }

        @Override // androidx.appcompat.view.menu.o.a
        public boolean e(@o0 androidx.appcompat.view.menu.h hVar) {
            a0.this.f833j.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private final class d implements h.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean a(@o0 androidx.appcompat.view.menu.h hVar, @o0 MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void b(@o0 androidx.appcompat.view.menu.h hVar) {
            if (a0.this.f832i.h()) {
                a0.this.f833j.onPanelClosed(108, hVar);
            } else if (a0.this.f833j.onPreparePanel(0, null, hVar)) {
                a0.this.f833j.onMenuOpened(108, hVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private class e implements AppCompatDelegateImpl.i {
        e() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.i
        public boolean a(int i4) {
            if (i4 != 0) {
                return false;
            }
            a0 a0Var = a0.this;
            if (a0Var.f835l) {
                return false;
            }
            a0Var.f832i.i();
            a0.this.f835l = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.i
        public View onCreatePanelView(int i4) {
            if (i4 == 0) {
                return new View(a0.this.f832i.getContext());
            }
            return null;
        }
    }

    a0(@o0 Toolbar toolbar, @q0 CharSequence charSequence, @o0 Window.Callback callback) {
        b bVar = new b();
        this.f840q = bVar;
        toolbar.getClass();
        x0 x0Var = new x0(toolbar, false);
        this.f832i = x0Var;
        callback.getClass();
        this.f833j = callback;
        x0Var.k(callback);
        toolbar.N0(bVar);
        x0Var.g(charSequence);
        this.f834k = new e();
    }

    private Menu E0() {
        if (!this.f836m) {
            this.f832i.O(new c(), new d());
            this.f836m = true;
        }
        return this.f832i.t();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context A() {
        return this.f832i.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void A0(CharSequence charSequence) {
        this.f832i.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence B() {
        return this.f832i.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void B0(CharSequence charSequence) {
        this.f832i.g(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void C() {
        this.f832i.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void C0() {
        this.f832i.setVisibility(0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean D() {
        this.f832i.x().removeCallbacks(this.f839p);
        x1.v1(this.f832i.x(), this.f839p);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean F() {
        return this.f832i.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void F0() {
        /*
            r5 = this;
            android.view.Menu r0 = r5.E0()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.h
            r2 = 0
            if (r1 == 0) goto Ld
            r1 = r0
            androidx.appcompat.view.menu.h r1 = (androidx.appcompat.view.menu.h) r1
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 == 0) goto L13
            r1.m0()
        L13:
            r0.clear()     // Catch: java.lang.Throwable -> L28
            android.view.Window$Callback r3 = r5.f833j     // Catch: java.lang.Throwable -> L28
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            android.view.Window$Callback r3 = r5.f833j     // Catch: java.lang.Throwable -> L28
            boolean r2 = r3.onPreparePanel(r4, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L2d
            goto L2a
        L28:
            r0 = move-exception
            goto L33
        L2a:
            r0.clear()     // Catch: java.lang.Throwable -> L28
        L2d:
            if (r1 == 0) goto L32
            r1.l0()
        L32:
            return
        L33:
            if (r1 == 0) goto L38
            r1.l0()
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a0.F0():void");
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean G() {
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e H() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void I(Configuration configuration) {
    }

    @Override // androidx.appcompat.app.ActionBar
    void J() {
        this.f832i.x().removeCallbacks(this.f839p);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean K(int i4, KeyEvent keyEvent) {
        Menu E0 = E0();
        if (E0 == null) {
            return false;
        }
        E0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return E0.performShortcut(i4, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean L(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            M();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean M() {
        return this.f832i.e();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void N() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void O(ActionBar.c cVar) {
        this.f838o.remove(cVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void P(ActionBar.e eVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Q(int i4) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean R() {
        ViewGroup x4 = this.f832i.x();
        if (x4 == null || x4.hasFocus()) {
            return false;
        }
        x4.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void S(ActionBar.e eVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void T(@q0 Drawable drawable) {
        this.f832i.a(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void U(int i4) {
        V(LayoutInflater.from(this.f832i.getContext()).inflate(i4, this.f832i.x(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void V(View view) {
        W(view, new ActionBar.LayoutParams(-2, -2));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void W(View view, ActionBar.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.f832i.T(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void X(boolean z4) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Y(boolean z4) {
        a0(z4 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    @SuppressLint({"WrongConstant"})
    public void Z(int i4) {
        a0(i4, -1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void a0(int i4, int i5) {
        this.f832i.p((i4 & i5) | ((~i5) & this.f832i.S()));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void b0(boolean z4) {
        a0(z4 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void c0(boolean z4) {
        a0(z4 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void d0(boolean z4) {
        a0(z4 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void e0(boolean z4) {
        a0(z4 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void f0(float f4) {
        x1.V1(this.f832i.x(), f4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void g(ActionBar.c cVar) {
        this.f838o.add(cVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h(ActionBar.e eVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i(ActionBar.e eVar, int i4) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i0(int i4) {
        this.f832i.A(i4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j(ActionBar.e eVar, int i4, boolean z4) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j0(CharSequence charSequence) {
        this.f832i.q(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void k(ActionBar.e eVar, boolean z4) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void k0(int i4) {
        this.f832i.N(i4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean l() {
        return this.f832i.d();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void l0(Drawable drawable) {
        this.f832i.V(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean m() {
        if (!this.f832i.n()) {
            return false;
        }
        this.f832i.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m0(boolean z4) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void n(boolean z4) {
        if (z4 == this.f837n) {
            return;
        }
        this.f837n = z4;
        int size = this.f838o.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f838o.get(i4).a(z4);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void n0(int i4) {
        this.f832i.setIcon(i4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public View o() {
        return this.f832i.G();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void o0(Drawable drawable) {
        this.f832i.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int p() {
        return this.f832i.S();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void p0(SpinnerAdapter spinnerAdapter, ActionBar.d dVar) {
        this.f832i.P(spinnerAdapter, new y(dVar));
    }

    @Override // androidx.appcompat.app.ActionBar
    public float q() {
        return x1.T(this.f832i.x());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void q0(int i4) {
        this.f832i.j(i4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int r() {
        return this.f832i.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void r0(Drawable drawable) {
        this.f832i.I(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void s0(int i4) {
        if (i4 == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f832i.w(i4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int t() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void t0(int i4) {
        if (this.f832i.u() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.f832i.s(i4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int u() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void u0(boolean z4) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public int v() {
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void v0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e w() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void w0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence x() {
        return this.f832i.R();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void x0(int i4) {
        androidx.appcompat.widget.v vVar = this.f832i;
        vVar.r(i4 != 0 ? vVar.getContext().getText(i4) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e y(int i4) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void y0(CharSequence charSequence) {
        this.f832i.r(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int z() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void z0(int i4) {
        androidx.appcompat.widget.v vVar = this.f832i;
        vVar.setTitle(i4 != 0 ? vVar.getContext().getText(i4) : null);
    }
}
