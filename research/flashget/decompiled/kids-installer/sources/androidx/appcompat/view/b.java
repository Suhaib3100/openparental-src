package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.c1;

/* compiled from: ActionMode.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: o, reason: collision with root package name */
    private Object f533o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f534p;

    /* compiled from: ActionMode.java */
    public interface a {
        void a(b bVar);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, Menu menu);

        boolean d(b bVar, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f533o;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f534p;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean m() {
        return true;
    }

    public abstract void n(View view);

    public abstract void o(int i5);

    public abstract void p(CharSequence charSequence);

    public void q(Object obj) {
        this.f533o = obj;
    }

    public abstract void r(int i5);

    public abstract void s(CharSequence charSequence);

    public void t(boolean z5) {
        this.f534p = z5;
    }
}
