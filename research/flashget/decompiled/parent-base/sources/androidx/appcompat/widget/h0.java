package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.appcompat.view.menu.h;
import d.a;

/* compiled from: PopupMenu.java */
/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1862a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.view.menu.h f1863b;

    /* renamed from: c, reason: collision with root package name */
    private final View f1864c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.appcompat.view.menu.n f1865d;

    /* renamed from: e, reason: collision with root package name */
    e f1866e;

    /* renamed from: f, reason: collision with root package name */
    d f1867f;

    /* renamed from: g, reason: collision with root package name */
    private View.OnTouchListener f1868g;

    /* compiled from: PopupMenu.java */
    class a implements h.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean a(@androidx.annotation.o0 androidx.appcompat.view.menu.h hVar, @androidx.annotation.o0 MenuItem menuItem) {
            e eVar = h0.this.f1866e;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void b(@androidx.annotation.o0 androidx.appcompat.view.menu.h hVar) {
        }
    }

    /* compiled from: PopupMenu.java */
    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h0 h0Var = h0.this;
            d dVar = h0Var.f1867f;
            if (dVar != null) {
                dVar.a(h0Var);
            }
        }
    }

    /* compiled from: PopupMenu.java */
    class c extends e0 {
        c(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.e0
        public androidx.appcompat.view.menu.r b() {
            return h0.this.f1865d.e();
        }

        @Override // androidx.appcompat.widget.e0
        protected boolean c() {
            h0.this.l();
            return true;
        }

        @Override // androidx.appcompat.widget.e0
        protected boolean d() {
            h0.this.a();
            return true;
        }
    }

    /* compiled from: PopupMenu.java */
    public interface d {
        void a(h0 h0Var);
    }

    /* compiled from: PopupMenu.java */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public h0(@androidx.annotation.o0 Context context, @androidx.annotation.o0 View view) {
        this(context, view, 0);
    }

    public void a() {
        this.f1865d.dismiss();
    }

    @androidx.annotation.o0
    public View.OnTouchListener b() {
        if (this.f1868g == null) {
            this.f1868g = new c(this.f1864c);
        }
        return this.f1868g;
    }

    public int c() {
        return this.f1865d.c();
    }

    @androidx.annotation.o0
    public Menu d() {
        return this.f1863b;
    }

    @androidx.annotation.o0
    public MenuInflater e() {
        return new androidx.appcompat.view.h(this.f1862a);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    ListView f() {
        if (this.f1865d.f()) {
            return this.f1865d.d();
        }
        return null;
    }

    public void g(@androidx.annotation.m0 int i4) {
        e().inflate(i4, this.f1863b);
    }

    public void h(boolean z4) {
        this.f1865d.i(z4);
    }

    public void i(int i4) {
        this.f1865d.j(i4);
    }

    public void j(@androidx.annotation.q0 d dVar) {
        this.f1867f = dVar;
    }

    public void k(@androidx.annotation.q0 e eVar) {
        this.f1866e = eVar;
    }

    public void l() {
        this.f1865d.l();
    }

    public h0(@androidx.annotation.o0 Context context, @androidx.annotation.o0 View view, int i4) {
        this(context, view, i4, a.b.f73076z2, 0);
    }

    public h0(@androidx.annotation.o0 Context context, @androidx.annotation.o0 View view, int i4, @androidx.annotation.f int i5, @h1 int i6) {
        this.f1862a = context;
        this.f1864c = view;
        androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
        this.f1863b = hVar;
        hVar.X(new a());
        androidx.appcompat.view.menu.n nVar = new androidx.appcompat.view.menu.n(context, hVar, view, false, i5, i6);
        this.f1865d = nVar;
        nVar.j(i4);
        nVar.k(new b());
    }
}
