package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e extends b implements h.a {

    /* renamed from: d, reason: collision with root package name */
    private Context f1063d;

    /* renamed from: e, reason: collision with root package name */
    private ActionBarContextView f1064e;

    /* renamed from: f, reason: collision with root package name */
    private b.a f1065f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<View> f1066g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1067h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1068i;

    /* renamed from: j, reason: collision with root package name */
    private androidx.appcompat.view.menu.h f1069j;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z4) {
        this.f1063d = context;
        this.f1064e = actionBarContextView;
        this.f1065f = aVar;
        androidx.appcompat.view.menu.h Z = new androidx.appcompat.view.menu.h(actionBarContextView.getContext()).Z(1);
        this.f1069j = Z;
        Z.X(this);
        this.f1068i = z4;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean a(@o0 androidx.appcompat.view.menu.h hVar, @o0 MenuItem menuItem) {
        return this.f1065f.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void b(@o0 androidx.appcompat.view.menu.h hVar) {
        k();
        this.f1064e.r();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f1067h) {
            return;
        }
        this.f1067h = true;
        this.f1065f.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference<View> weakReference = this.f1066g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f1069j;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new h(this.f1064e.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f1064e.t();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f1064e.u();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f1065f.d(this, this.f1069j);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f1064e.x();
    }

    @Override // androidx.appcompat.view.b
    public boolean m() {
        return this.f1068i;
    }

    @Override // androidx.appcompat.view.b
    public void n(View view) {
        this.f1064e.z(view);
        this.f1066g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void o(int i4) {
        p(this.f1063d.getString(i4));
    }

    @Override // androidx.appcompat.view.b
    public void p(CharSequence charSequence) {
        this.f1064e.A(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void r(int i4) {
        s(this.f1063d.getString(i4));
    }

    @Override // androidx.appcompat.view.b
    public void s(CharSequence charSequence) {
        this.f1064e.B(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void t(boolean z4) {
        super.t(z4);
        this.f1064e.C(z4);
    }

    public void u(androidx.appcompat.view.menu.h hVar, boolean z4) {
    }

    public void v(t tVar) {
    }

    public boolean w(t tVar) {
        if (!tVar.hasVisibleItems()) {
            return true;
        }
        new n(this.f1064e.getContext(), tVar).l();
        return true;
    }
}
