package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.g;
import d.a;

/* compiled from: PopupMenu.java */
/* loaded from: classes.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1267a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.view.menu.g f1268b;

    /* renamed from: c, reason: collision with root package name */
    private final View f1269c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.appcompat.view.menu.m f1270d;

    /* renamed from: e, reason: collision with root package name */
    e f1271e;

    /* renamed from: f, reason: collision with root package name */
    d f1272f;

    /* renamed from: g, reason: collision with root package name */
    private View.OnTouchListener f1273g;

    /* compiled from: PopupMenu.java */
    /* loaded from: classes2.dex */
    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@androidx.annotation.o0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.o0 MenuItem menuItem) {
            e eVar = n0.this.f1271e;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@androidx.annotation.o0 androidx.appcompat.view.menu.g gVar) {
        }
    }

    /* compiled from: PopupMenu.java */
    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            n0 n0Var = n0.this;
            d dVar = n0Var.f1272f;
            if (dVar != null) {
                dVar.a(n0Var);
            }
        }
    }

    /* compiled from: PopupMenu.java */
    /* loaded from: classes2.dex */
    class c extends h0 {
        c(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.h0
        public androidx.appcompat.view.menu.q b() {
            return n0.this.f1270d.e();
        }

        @Override // androidx.appcompat.widget.h0
        protected boolean c() {
            n0.this.k();
            return true;
        }

        @Override // androidx.appcompat.widget.h0
        protected boolean d() {
            n0.this.a();
            return true;
        }
    }

    /* compiled from: PopupMenu.java */
    public interface d {
        void a(n0 n0Var);
    }

    /* compiled from: PopupMenu.java */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public n0(@androidx.annotation.o0 Context context, @androidx.annotation.o0 View view) {
        this(context, view, 0);
    }

    public void a() {
        this.f1270d.dismiss();
    }

    @androidx.annotation.o0
    public View.OnTouchListener b() {
        if (this.f1273g == null) {
            this.f1273g = new c(this.f1269c);
        }
        return this.f1273g;
    }

    public int c() {
        return this.f1270d.c();
    }

    @androidx.annotation.o0
    public Menu d() {
        return this.f1268b;
    }

    @androidx.annotation.o0
    public MenuInflater e() {
        return new androidx.appcompat.view.h(this.f1267a);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    ListView f() {
        if (this.f1270d.f()) {
            return this.f1270d.d();
        }
        return null;
    }

    public void g(@androidx.annotation.m0 int i5) {
        e().inflate(i5, this.f1268b);
    }

    public void h(int i5) {
        this.f1270d.j(i5);
    }

    public void i(@androidx.annotation.q0 d dVar) {
        this.f1272f = dVar;
    }

    public void j(@androidx.annotation.q0 e eVar) {
        this.f1271e = eVar;
    }

    public void k() {
        this.f1270d.l();
    }

    public n0(@androidx.annotation.o0 Context context, @androidx.annotation.o0 View view, int i5) {
        this(context, view, i5, a.c.G2, 0);
    }

    public n0(@androidx.annotation.o0 Context context, @androidx.annotation.o0 View view, int i5, @androidx.annotation.f int i6, @androidx.annotation.h1 int i7) {
        this.f1267a = context;
        this.f1269c = view;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        this.f1268b = gVar;
        gVar.X(new a());
        androidx.appcompat.view.menu.m mVar = new androidx.appcompat.view.menu.m(context, gVar, view, false, i6, i7);
        this.f1270d = mVar;
        mVar.j(i5);
        mVar.k(new b());
    }
}
