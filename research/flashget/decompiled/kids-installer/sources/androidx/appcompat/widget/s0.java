package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.c;
import d.a;

/* compiled from: ShareActionProvider.java */
/* loaded from: classes2.dex */
public class s0 extends androidx.core.view.b {

    /* renamed from: k, reason: collision with root package name */
    private static final int f1327k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final String f1328l = "share_history.xml";

    /* renamed from: e, reason: collision with root package name */
    private int f1329e;

    /* renamed from: f, reason: collision with root package name */
    private final c f1330f;

    /* renamed from: g, reason: collision with root package name */
    final Context f1331g;

    /* renamed from: h, reason: collision with root package name */
    String f1332h;

    /* renamed from: i, reason: collision with root package name */
    a f1333i;

    /* renamed from: j, reason: collision with root package name */
    private c.f f1334j;

    /* compiled from: ShareActionProvider.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(s0 s0Var, Intent intent);
    }

    /* compiled from: ShareActionProvider.java */
    private class b implements c.f {
        b() {
        }

        @Override // androidx.appcompat.widget.c.f
        public boolean a(androidx.appcompat.widget.c cVar, Intent intent) {
            s0 s0Var = s0.this;
            a aVar = s0Var.f1333i;
            if (aVar == null) {
                return false;
            }
            aVar.a(s0Var, intent);
            return false;
        }
    }

    /* compiled from: ShareActionProvider.java */
    /* loaded from: classes.dex */
    private class c implements MenuItem.OnMenuItemClickListener {
        c() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            s0 s0Var = s0.this;
            Intent b6 = androidx.appcompat.widget.c.d(s0Var.f1331g, s0Var.f1332h).b(menuItem.getItemId());
            if (b6 == null) {
                return true;
            }
            String action = b6.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                s0.this.r(b6);
            }
            s0.this.f1331g.startActivity(b6);
            return true;
        }
    }

    public s0(Context context) {
        super(context);
        this.f1329e = 4;
        this.f1330f = new c();
        this.f1332h = "share_history.xml";
        this.f1331g = context;
    }

    private void n() {
        if (this.f1333i == null) {
            return;
        }
        if (this.f1334j == null) {
            this.f1334j = new b();
        }
        androidx.appcompat.widget.c.d(this.f1331g, this.f1332h).u(this.f1334j);
    }

    @Override // androidx.core.view.b
    public boolean b() {
        return true;
    }

    @Override // androidx.core.view.b
    public View d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1331g, null);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.a(androidx.appcompat.widget.c.d(this.f1331g, this.f1332h));
        }
        TypedValue typedValue = new TypedValue();
        this.f1331g.getTheme().resolveAttribute(a.c.A, typedValue, true);
        activityChooserView.h(androidx.appcompat.content.res.a.d(this.f1331g, typedValue.resourceId));
        activityChooserView.f837x = this;
        activityChooserView.f(a.l.f21995z);
        activityChooserView.g(a.l.f21994y);
        return activityChooserView;
    }

    @Override // androidx.core.view.b
    public void g(SubMenu subMenu) {
        subMenu.clear();
        androidx.appcompat.widget.c d6 = androidx.appcompat.widget.c.d(this.f1331g, this.f1332h);
        PackageManager packageManager = this.f1331g.getPackageManager();
        int f6 = d6.f();
        int min = Math.min(f6, this.f1329e);
        for (int i5 = 0; i5 < min; i5++) {
            ResolveInfo e6 = d6.e(i5);
            subMenu.add(0, i5, i5, e6.loadLabel(packageManager)).setIcon(e6.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1330f);
        }
        if (min < f6) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f1331g.getString(a.l.f21974e));
            for (int i6 = 0; i6 < f6; i6++) {
                ResolveInfo e7 = d6.e(i6);
                addSubMenu.add(0, i6, i6, e7.loadLabel(packageManager)).setIcon(e7.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1330f);
            }
        }
    }

    public void o(a aVar) {
        this.f1333i = aVar;
        n();
    }

    public void p(String str) {
        this.f1332h = str;
        n();
    }

    public void q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                r(intent);
            }
        }
        androidx.appcompat.widget.c.d(this.f1331g, this.f1332h).t(intent);
    }

    void r(Intent intent) {
        intent.addFlags(134742016);
    }
}
