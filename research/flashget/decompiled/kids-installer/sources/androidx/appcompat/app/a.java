package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.g1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.d0;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: ActionBarDrawerToggle.java */
/* loaded from: classes2.dex */
public class a implements DrawerLayout.d {

    /* renamed from: a, reason: collision with root package name */
    private final b f323a;

    /* renamed from: b, reason: collision with root package name */
    private final DrawerLayout f324b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.appcompat.graphics.drawable.e f325c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f326d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f327e;

    /* renamed from: f, reason: collision with root package name */
    boolean f328f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f329g;

    /* renamed from: h, reason: collision with root package name */
    private final int f330h;

    /* renamed from: i, reason: collision with root package name */
    private final int f331i;

    /* renamed from: j, reason: collision with root package name */
    View.OnClickListener f332j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f333k;

    /* compiled from: ActionBarDrawerToggle.java */
    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC0005a implements View.OnClickListener {
        ViewOnClickListenerC0005a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f328f) {
                aVar.v();
                return;
            }
            View.OnClickListener onClickListener = aVar.f332j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a();

        Context b();

        void c(Drawable drawable, @g1 int i5);

        Drawable d();

        void e(@g1 int i5);
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    public interface c {
        @q0
        b j();
    }

    /* compiled from: ActionBarDrawerToggle.java */
    private static class d implements b {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f335a;

        /* renamed from: b, reason: collision with root package name */
        private b.a f336b;

        d(Activity activity) {
            this.f335a = activity;
        }

        @Override // androidx.appcompat.app.a.b
        public boolean a() {
            android.app.ActionBar actionBar = this.f335a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.a.b
        public Context b() {
            android.app.ActionBar actionBar = this.f335a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f335a;
        }

        @Override // androidx.appcompat.app.a.b
        public void c(Drawable drawable, int i5) {
            android.app.ActionBar actionBar = this.f335a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i5);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable d() {
            TypedArray obtainStyledAttributes = b().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.a.b
        public void e(int i5) {
            android.app.ActionBar actionBar = this.f335a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i5);
            }
        }
    }

    /* compiled from: ActionBarDrawerToggle.java */
    static class e implements b {

        /* renamed from: a, reason: collision with root package name */
        final Toolbar f337a;

        /* renamed from: b, reason: collision with root package name */
        final Drawable f338b;

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f339c;

        e(Toolbar toolbar) {
            this.f337a = toolbar;
            this.f338b = toolbar.L();
            this.f339c = toolbar.K();
        }

        @Override // androidx.appcompat.app.a.b
        public boolean a() {
            return true;
        }

        @Override // androidx.appcompat.app.a.b
        public Context b() {
            return this.f337a.getContext();
        }

        @Override // androidx.appcompat.app.a.b
        public void c(Drawable drawable, @g1 int i5) {
            this.f337a.G0(drawable);
            e(i5);
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable d() {
            return this.f338b;
        }

        @Override // androidx.appcompat.app.a.b
        public void e(@g1 int i5) {
            if (i5 == 0) {
                this.f337a.E0(this.f339c);
            } else {
                this.f337a.D0(i5);
            }
        }
    }

    public a(Activity activity, DrawerLayout drawerLayout, @g1 int i5, @g1 int i6) {
        this(activity, null, drawerLayout, null, i5, i6);
    }

    private void s(float f6) {
        if (f6 == 1.0f) {
            this.f325c.u(true);
        } else if (f6 == 0.0f) {
            this.f325c.u(false);
        }
        this.f325c.s(f6);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void a(View view) {
        s(1.0f);
        if (this.f328f) {
            l(this.f331i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void b(View view) {
        s(0.0f);
        if (this.f328f) {
            l(this.f330h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void c(int i5) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void d(View view, float f6) {
        if (this.f326d) {
            s(Math.min(1.0f, Math.max(0.0f, f6)));
        } else {
            s(0.0f);
        }
    }

    @o0
    public androidx.appcompat.graphics.drawable.e e() {
        return this.f325c;
    }

    Drawable f() {
        return this.f323a.d();
    }

    public View.OnClickListener g() {
        return this.f332j;
    }

    public boolean h() {
        return this.f328f;
    }

    public boolean i() {
        return this.f326d;
    }

    public void j(Configuration configuration) {
        if (!this.f329g) {
            this.f327e = f();
        }
        u();
    }

    public boolean k(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f328f) {
            return false;
        }
        v();
        return true;
    }

    void l(int i5) {
        this.f323a.e(i5);
    }

    void m(Drawable drawable, int i5) {
        if (!this.f333k && !this.f323a.a()) {
            this.f333k = true;
        }
        this.f323a.c(drawable, i5);
    }

    public void n(@o0 androidx.appcompat.graphics.drawable.e eVar) {
        this.f325c = eVar;
        u();
    }

    public void o(boolean z5) {
        if (z5 != this.f328f) {
            if (z5) {
                m(this.f325c, this.f324b.E(d0.f5464b) ? this.f331i : this.f330h);
            } else {
                m(this.f327e, 0);
            }
            this.f328f = z5;
        }
    }

    public void p(boolean z5) {
        this.f326d = z5;
        if (z5) {
            return;
        }
        s(0.0f);
    }

    public void q(int i5) {
        r(i5 != 0 ? this.f324b.getResources().getDrawable(i5) : null);
    }

    public void r(Drawable drawable) {
        if (drawable == null) {
            this.f327e = f();
            this.f329g = false;
        } else {
            this.f327e = drawable;
            this.f329g = true;
        }
        if (this.f328f) {
            return;
        }
        m(this.f327e, 0);
    }

    public void t(View.OnClickListener onClickListener) {
        this.f332j = onClickListener;
    }

    public void u() {
        if (this.f324b.E(d0.f5464b)) {
            s(1.0f);
        } else {
            s(0.0f);
        }
        if (this.f328f) {
            m(this.f325c, this.f324b.E(d0.f5464b) ? this.f331i : this.f330h);
        }
    }

    void v() {
        int r5 = this.f324b.r(d0.f5464b);
        if (this.f324b.H(d0.f5464b) && r5 != 2) {
            this.f324b.d(d0.f5464b);
        } else if (r5 != 1) {
            this.f324b.M(d0.f5464b);
        }
    }

    public a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @g1 int i5, @g1 int i6) {
        this(activity, toolbar, drawerLayout, null, i5, i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    a(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, androidx.appcompat.graphics.drawable.e eVar, @g1 int i5, @g1 int i6) {
        this.f326d = true;
        this.f328f = true;
        this.f333k = false;
        if (toolbar != null) {
            this.f323a = new e(toolbar);
            toolbar.H0(new ViewOnClickListenerC0005a());
        } else if (activity instanceof c) {
            this.f323a = ((c) activity).j();
        } else {
            this.f323a = new d(activity);
        }
        this.f324b = drawerLayout;
        this.f330h = i5;
        this.f331i = i6;
        if (eVar == null) {
            this.f325c = new androidx.appcompat.graphics.drawable.e(this.f323a.b());
        } else {
            this.f325c = eVar;
        }
        this.f327e = f();
    }
}
