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
import androidx.annotation.x0;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.f0;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: ActionBarDrawerToggle.java */
/* loaded from: classes.dex */
public class a implements DrawerLayout.e {

    /* renamed from: a, reason: collision with root package name */
    private final b f815a;

    /* renamed from: b, reason: collision with root package name */
    private final DrawerLayout f816b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.appcompat.graphics.drawable.e f817c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f818d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f819e;

    /* renamed from: f, reason: collision with root package name */
    boolean f820f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f821g;

    /* renamed from: h, reason: collision with root package name */
    private final int f822h;

    /* renamed from: i, reason: collision with root package name */
    private final int f823i;

    /* renamed from: j, reason: collision with root package name */
    View.OnClickListener f824j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f825k;

    /* compiled from: ActionBarDrawerToggle.java */
    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0014a implements View.OnClickListener {
        ViewOnClickListenerC0014a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f820f) {
                aVar.v();
                return;
            }
            View.OnClickListener onClickListener = aVar.f824j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* compiled from: ActionBarDrawerToggle.java */
    public interface b {
        void a(Drawable drawable, @g1 int i4);

        Drawable b();

        void c(@g1 int i4);

        Context d();

        boolean e();
    }

    /* compiled from: ActionBarDrawerToggle.java */
    public interface c {
        @q0
        b getDrawerToggleDelegate();
    }

    /* compiled from: ActionBarDrawerToggle.java */
    private static class d implements b {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f827a;

        /* renamed from: b, reason: collision with root package name */
        private b.a f828b;

        /* compiled from: ActionBarDrawerToggle.java */
        @x0(18)
        /* renamed from: androidx.appcompat.app.a$d$a, reason: collision with other inner class name */
        static class C0015a {
            private C0015a() {
            }

            @androidx.annotation.u
            static void a(android.app.ActionBar actionBar, int i4) {
                actionBar.setHomeActionContentDescription(i4);
            }

            @androidx.annotation.u
            static void b(android.app.ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        d(Activity activity) {
            this.f827a = activity;
        }

        @Override // androidx.appcompat.app.a.b
        public void a(Drawable drawable, int i4) {
            android.app.ActionBar actionBar = this.f827a.getActionBar();
            if (actionBar != null) {
                C0015a.b(actionBar, drawable);
                C0015a.a(actionBar, i4);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable b() {
            TypedArray obtainStyledAttributes = d().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.a.b
        public void c(int i4) {
            android.app.ActionBar actionBar = this.f827a.getActionBar();
            if (actionBar != null) {
                C0015a.a(actionBar, i4);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Context d() {
            android.app.ActionBar actionBar = this.f827a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f827a;
        }

        @Override // androidx.appcompat.app.a.b
        public boolean e() {
            android.app.ActionBar actionBar = this.f827a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    /* compiled from: ActionBarDrawerToggle.java */
    static class e implements b {

        /* renamed from: a, reason: collision with root package name */
        final Toolbar f829a;

        /* renamed from: b, reason: collision with root package name */
        final Drawable f830b;

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f831c;

        e(Toolbar toolbar) {
            this.f829a = toolbar;
            this.f830b = toolbar.N();
            this.f831c = toolbar.M();
        }

        @Override // androidx.appcompat.app.a.b
        public void a(Drawable drawable, @g1 int i4) {
            this.f829a.L0(drawable);
            c(i4);
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable b() {
            return this.f830b;
        }

        @Override // androidx.appcompat.app.a.b
        public void c(@g1 int i4) {
            if (i4 == 0) {
                this.f829a.J0(this.f831c);
            } else {
                this.f829a.I0(i4);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Context d() {
            return this.f829a.getContext();
        }

        @Override // androidx.appcompat.app.a.b
        public boolean e() {
            return true;
        }
    }

    public a(Activity activity, DrawerLayout drawerLayout, @g1 int i4, @g1 int i5) {
        this(activity, null, drawerLayout, null, i4, i5);
    }

    private void s(float f4) {
        if (f4 == 1.0f) {
            this.f817c.t(true);
        } else if (f4 == 0.0f) {
            this.f817c.t(false);
        }
        this.f817c.setProgress(f4);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(View view) {
        s(1.0f);
        if (this.f820f) {
            l(this.f823i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void b(View view) {
        s(0.0f);
        if (this.f820f) {
            l(this.f822h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void c(int i4) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void d(View view, float f4) {
        if (this.f818d) {
            s(Math.min(1.0f, Math.max(0.0f, f4)));
        } else {
            s(0.0f);
        }
    }

    @o0
    public androidx.appcompat.graphics.drawable.e e() {
        return this.f817c;
    }

    Drawable f() {
        return this.f815a.b();
    }

    public View.OnClickListener g() {
        return this.f824j;
    }

    public boolean h() {
        return this.f820f;
    }

    public boolean i() {
        return this.f818d;
    }

    public void j(Configuration configuration) {
        if (!this.f821g) {
            this.f819e = f();
        }
        u();
    }

    public boolean k(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f820f) {
            return false;
        }
        v();
        return true;
    }

    void l(int i4) {
        this.f815a.c(i4);
    }

    void m(Drawable drawable, int i4) {
        if (!this.f825k && !this.f815a.e()) {
            this.f825k = true;
        }
        this.f815a.a(drawable, i4);
    }

    public void n(@o0 androidx.appcompat.graphics.drawable.e eVar) {
        this.f817c = eVar;
        u();
    }

    public void o(boolean z4) {
        if (z4 != this.f820f) {
            if (z4) {
                m(this.f817c, this.f816b.E(f0.f27129b) ? this.f823i : this.f822h);
            } else {
                m(this.f819e, 0);
            }
            this.f820f = z4;
        }
    }

    public void p(boolean z4) {
        this.f818d = z4;
        if (z4) {
            return;
        }
        s(0.0f);
    }

    public void q(int i4) {
        r(i4 != 0 ? this.f816b.getResources().getDrawable(i4) : null);
    }

    public void r(Drawable drawable) {
        if (drawable == null) {
            this.f819e = f();
            this.f821g = false;
        } else {
            this.f819e = drawable;
            this.f821g = true;
        }
        if (this.f820f) {
            return;
        }
        m(this.f819e, 0);
    }

    public void t(View.OnClickListener onClickListener) {
        this.f824j = onClickListener;
    }

    public void u() {
        if (this.f816b.E(f0.f27129b)) {
            s(1.0f);
        } else {
            s(0.0f);
        }
        if (this.f820f) {
            m(this.f817c, this.f816b.E(f0.f27129b) ? this.f823i : this.f822h);
        }
    }

    void v() {
        int r4 = this.f816b.r(f0.f27129b);
        if (this.f816b.H(f0.f27129b) && r4 != 2) {
            this.f816b.d(f0.f27129b);
        } else if (r4 != 1) {
            this.f816b.M(f0.f27129b);
        }
    }

    public a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @g1 int i4, @g1 int i5) {
        this(activity, toolbar, drawerLayout, null, i4, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    a(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, androidx.appcompat.graphics.drawable.e eVar, @g1 int i4, @g1 int i5) {
        this.f818d = true;
        this.f820f = true;
        this.f825k = false;
        if (toolbar != null) {
            this.f815a = new e(toolbar);
            toolbar.M0(new ViewOnClickListenerC0014a());
        } else if (activity instanceof c) {
            this.f815a = ((c) activity).getDrawerToggleDelegate();
        } else {
            this.f815a = new d(activity);
        }
        this.f816b = drawerLayout;
        this.f822h = i4;
        this.f823i = i5;
        if (eVar == null) {
            this.f817c = new androidx.appcompat.graphics.drawable.e(this.f815a.d());
        } else {
            this.f817c = eVar;
        }
        this.f819e = f();
    }
}
