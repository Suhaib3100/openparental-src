package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class e extends b implements g.a {

    /* renamed from: q, reason: collision with root package name */
    private Context f540q;

    /* renamed from: r, reason: collision with root package name */
    private ActionBarContextView f541r;

    /* renamed from: s, reason: collision with root package name */
    private b.a f542s;

    /* renamed from: t, reason: collision with root package name */
    private WeakReference<View> f543t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f544u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f545v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f546w;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z5) {
        this.f540q = context;
        this.f541r = actionBarContextView;
        this.f542s = aVar;
        androidx.appcompat.view.menu.g Z = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).Z(1);
        this.f546w = Z;
        Z.X(this);
        this.f545v = z5;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(@o0 androidx.appcompat.view.menu.g gVar, @o0 MenuItem menuItem) {
        return this.f542s.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(@o0 androidx.appcompat.view.menu.g gVar) {
        k();
        this.f541r.r();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f544u) {
            return;
        }
        this.f544u = true;
        this.f541r.sendAccessibilityEvent(32);
        this.f542s.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference<View> weakReference = this.f543t;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f546w;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new h(this.f541r.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f541r.t();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f541r.u();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f542s.c(this, this.f546w);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f541r.x();
    }

    @Override // androidx.appcompat.view.b
    public boolean m() {
        return this.f545v;
    }

    @Override // androidx.appcompat.view.b
    public void n(View view) {
        this.f541r.z(view);
        this.f543t = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void o(int i5) {
        p(this.f540q.getString(i5));
    }

    @Override // androidx.appcompat.view.b
    public void p(CharSequence charSequence) {
        this.f541r.A(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void r(int i5) {
        s(this.f540q.getString(i5));
    }

    @Override // androidx.appcompat.view.b
    public void s(CharSequence charSequence) {
        this.f541r.B(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void t(boolean z5) {
        super.t(z5);
        this.f541r.C(z5);
    }

    public void u(androidx.appcompat.view.menu.g gVar, boolean z5) {
    }

    public void v(t tVar) {
    }

    public boolean w(t tVar) {
        if (!tVar.hasVisibleItems()) {
            return true;
        }
        new m(this.f541r.getContext(), tVar).l();
        return true;
    }
}
