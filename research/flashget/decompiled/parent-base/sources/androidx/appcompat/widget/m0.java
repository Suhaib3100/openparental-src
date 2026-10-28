package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.d;
import d.a;

/* compiled from: ShareActionProvider.java */
/* loaded from: classes.dex */
public class m0 extends androidx.core.view.b {

    /* renamed from: k, reason: collision with root package name */
    private static final int f1936k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final String f1937l = "share_history.xml";

    /* renamed from: e, reason: collision with root package name */
    private int f1938e;

    /* renamed from: f, reason: collision with root package name */
    private final c f1939f;

    /* renamed from: g, reason: collision with root package name */
    final Context f1940g;

    /* renamed from: h, reason: collision with root package name */
    String f1941h;

    /* renamed from: i, reason: collision with root package name */
    a f1942i;

    /* renamed from: j, reason: collision with root package name */
    private d.f f1943j;

    /* compiled from: ShareActionProvider.java */
    public interface a {
        boolean a(m0 m0Var, Intent intent);
    }

    /* compiled from: ShareActionProvider.java */
    private class b implements d.f {
        b() {
        }

        @Override // androidx.appcompat.widget.d.f
        public boolean a(d dVar, Intent intent) {
            m0 m0Var = m0.this;
            a aVar = m0Var.f1942i;
            if (aVar == null) {
                return false;
            }
            aVar.a(m0Var, intent);
            return false;
        }
    }

    /* compiled from: ShareActionProvider.java */
    private class c implements MenuItem.OnMenuItemClickListener {
        c() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            m0 m0Var = m0.this;
            Intent b5 = d.d(m0Var.f1940g, m0Var.f1941h).b(menuItem.getItemId());
            if (b5 == null) {
                return true;
            }
            String action = b5.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                m0.this.r(b5);
            }
            m0.this.f1940g.startActivity(b5);
            return true;
        }
    }

    public m0(Context context) {
        super(context);
        this.f1938e = 4;
        this.f1939f = new c();
        this.f1941h = "share_history.xml";
        this.f1940g = context;
    }

    private void n() {
        if (this.f1942i == null) {
            return;
        }
        if (this.f1943j == null) {
            this.f1943j = new b();
        }
        d.d(this.f1940g, this.f1941h).u(this.f1943j);
    }

    @Override // androidx.core.view.b
    public boolean b() {
        return true;
    }

    @Override // androidx.core.view.b
    public View d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1940g, null);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.a(d.d(this.f1940g, this.f1941h));
        }
        TypedValue typedValue = new TypedValue();
        this.f1940g.getTheme().resolveAttribute(a.b.A, typedValue, true);
        activityChooserView.h(e.a.b(this.f1940g, typedValue.resourceId));
        activityChooserView.f1423k = this;
        activityChooserView.f(a.k.f73350z);
        activityChooserView.g(a.k.f73349y);
        return activityChooserView;
    }

    @Override // androidx.core.view.b
    public void g(SubMenu subMenu) {
        subMenu.clear();
        d d5 = d.d(this.f1940g, this.f1941h);
        PackageManager packageManager = this.f1940g.getPackageManager();
        int f4 = d5.f();
        int min = Math.min(f4, this.f1938e);
        for (int i4 = 0; i4 < min; i4++) {
            ResolveInfo e4 = d5.e(i4);
            subMenu.add(0, i4, i4, e4.loadLabel(packageManager)).setIcon(e4.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1939f);
        }
        if (min < f4) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f1940g.getString(a.k.f73329e));
            for (int i5 = 0; i5 < f4; i5++) {
                ResolveInfo e5 = d5.e(i5);
                addSubMenu.add(0, i5, i5, e5.loadLabel(packageManager)).setIcon(e5.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1939f);
            }
        }
    }

    public void o(a aVar) {
        this.f1942i = aVar;
        n();
    }

    public void p(String str) {
        this.f1941h = str;
        n();
    }

    public void q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                r(intent);
            }
        }
        d.d(this.f1940g, this.f1941h).t(intent);
    }

    void r(Intent intent) {
        intent.addFlags(134742016);
    }
}
