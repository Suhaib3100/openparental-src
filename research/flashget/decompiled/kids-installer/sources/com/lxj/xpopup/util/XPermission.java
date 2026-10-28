package com.lxj.xpopup.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.MotionEvent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class XPermission {

    /* renamed from: k, reason: collision with root package name */
    private static List<String> f21265k;

    /* renamed from: l, reason: collision with root package name */
    private static XPermission f21266l;

    /* renamed from: m, reason: collision with root package name */
    private static d f21267m;

    /* renamed from: n, reason: collision with root package name */
    private static d f21268n;

    /* renamed from: a, reason: collision with root package name */
    private Context f21269a;

    /* renamed from: b, reason: collision with root package name */
    private c f21270b;

    /* renamed from: c, reason: collision with root package name */
    private d f21271c;

    /* renamed from: d, reason: collision with root package name */
    private b f21272d;

    /* renamed from: e, reason: collision with root package name */
    private e f21273e;

    /* renamed from: f, reason: collision with root package name */
    private Set<String> f21274f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f21275g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f21276h;

    /* renamed from: i, reason: collision with root package name */
    private List<String> f21277i;

    /* renamed from: j, reason: collision with root package name */
    private List<String> f21278j;

    @x0(api = 23)
    public static class PermissionActivity extends Activity {

        /* renamed from: o, reason: collision with root package name */
        private static final String f21279o = ProtectedSandApp.s("㔔");

        /* renamed from: p, reason: collision with root package name */
        public static final int f21280p = 1;

        /* renamed from: q, reason: collision with root package name */
        public static final int f21281q = 2;

        /* renamed from: r, reason: collision with root package name */
        public static final int f21282r = 3;

        public static void a(final Context context, int type) {
            Intent intent = new Intent(context, (Class<?>) PermissionActivity.class);
            intent.addFlags(268435456);
            intent.putExtra(ProtectedSandApp.s("㔒"), type);
            context.startActivity(intent);
        }

        @Override // android.app.Activity, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent ev) {
            finish();
            return true;
        }

        @Override // android.app.Activity
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == 2) {
                if (XPermission.f21267m == null) {
                    return;
                }
                if (XPermission.f21266l.x()) {
                    XPermission.f21267m.a();
                } else {
                    XPermission.f21267m.b();
                }
                d unused = XPermission.f21267m = null;
            } else if (requestCode == 3) {
                if (XPermission.f21268n == null) {
                    return;
                }
                if (XPermission.f21266l.w()) {
                    XPermission.f21268n.a();
                } else {
                    XPermission.f21268n.b();
                }
                d unused2 = XPermission.f21268n = null;
            }
            finish();
        }

        @Override // android.app.Activity
        protected void onCreate(@q0 Bundle savedInstanceState) {
            getWindow().addFlags(262672);
            getWindow().getAttributes().alpha = 0.0f;
            int intExtra = getIntent().getIntExtra(ProtectedSandApp.s("㔓"), 1);
            if (intExtra != 1) {
                if (intExtra == 2) {
                    super.onCreate(savedInstanceState);
                    XPermission.f21266l.L(this, 2);
                    return;
                } else {
                    if (intExtra == 3) {
                        super.onCreate(savedInstanceState);
                        XPermission.f21266l.J(this, 3);
                        return;
                    }
                    return;
                }
            }
            if (XPermission.f21266l == null) {
                super.onCreate(savedInstanceState);
                finish();
                return;
            }
            if (XPermission.f21266l.f21273e != null) {
                XPermission.f21266l.f21273e.a(this);
            }
            super.onCreate(savedInstanceState);
            if (XPermission.f21266l.D(this)) {
                finish();
                return;
            }
            if (XPermission.f21266l.f21275g != null) {
                int size = XPermission.f21266l.f21275g.size();
                if (size <= 0) {
                    finish();
                } else {
                    requestPermissions((String[]) XPermission.f21266l.f21275g.toArray(new String[size]), 1);
                }
            }
        }

        @Override // android.app.Activity
        public void onRequestPermissionsResult(int requestCode, @o0 String[] permissions, @o0 int[] grantResults) {
            XPermission.f21266l.A(this);
            finish();
        }
    }

    class a implements c.a {
        a() {
        }

        @Override // com.lxj.xpopup.util.XPermission.c.a
        public void a(boolean again) {
            if (again) {
                XPermission.this.K();
            } else {
                XPermission.this.G();
            }
        }
    }

    public interface b {
        void a(List<String> permissionsGranted);

        void b(List<String> permissionsDeniedForever, List<String> permissionsDenied);
    }

    public interface c {

        public interface a {
            void a(boolean again);
        }

        void a(a shouldRequest);
    }

    public interface d {
        void a();

        void b();
    }

    public interface e {
        void a(Activity activity);
    }

    private XPermission(Context ctx, final String... permissions) {
        f21266l = this;
        this.f21269a = ctx;
        B(permissions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(final Activity activity) {
        t(activity);
        G();
    }

    private void B(final String... permissions) {
        this.f21274f = new LinkedHashSet();
        f21265k = r();
        if (permissions == null) {
            return;
        }
        for (String str : permissions) {
            for (String str2 : com.lxj.xpopup.util.c.a(str)) {
                if (f21265k.contains(str2)) {
                    this.f21274f.add(str2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x0(api = 23)
    public boolean D(final Activity activity) {
        boolean z5 = false;
        if (this.f21270b != null) {
            Iterator<String> it = this.f21275g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (activity.shouldShowRequestPermissionRationale(it.next())) {
                    t(activity);
                    this.f21270b.a(new a());
                    z5 = true;
                    break;
                }
            }
            this.f21270b = null;
        }
        return z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.f21271c != null) {
            if (this.f21275g.size() == 0 || this.f21274f.size() == this.f21276h.size()) {
                this.f21271c.a();
            } else if (!this.f21277i.isEmpty()) {
                this.f21271c.b();
            }
            this.f21271c = null;
        }
        if (this.f21272d != null) {
            if (this.f21275g.size() == 0 || this.f21274f.size() == this.f21276h.size()) {
                this.f21272d.a(this.f21276h);
            } else if (!this.f21277i.isEmpty()) {
                this.f21272d.b(this.f21278j, this.f21277i);
            }
            this.f21272d = null;
        }
        this.f21270b = null;
        this.f21273e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public void J(final Activity activity, final int requestCode) {
        Intent intent = new Intent(ProtectedSandApp.s("㔕"));
        intent.setData(Uri.parse(ProtectedSandApp.s("㔖") + this.f21269a.getPackageName()));
        if (y(intent)) {
            activity.startActivityForResult(intent, requestCode);
        } else {
            z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x0(api = 23)
    public void K() {
        this.f21277i = new ArrayList();
        this.f21278j = new ArrayList();
        PermissionActivity.a(this.f21269a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public void L(final Activity activity, final int requestCode) {
        Intent intent = new Intent(ProtectedSandApp.s("㔗"));
        intent.setData(Uri.parse(ProtectedSandApp.s("㔘") + this.f21269a.getPackageName()));
        if (y(intent)) {
            activity.startActivityForResult(intent, requestCode);
        } else {
            z();
        }
    }

    public static XPermission p(Context context, final String... permissions) {
        XPermission xPermission = f21266l;
        if (xPermission == null) {
            return new XPermission(context, permissions);
        }
        xPermission.f21269a = context;
        xPermission.B(permissions);
        return f21266l;
    }

    public static XPermission q() {
        return f21266l;
    }

    private void t(final Activity activity) {
        for (String str : this.f21275g) {
            if (u(str)) {
                this.f21276h.add(str);
            } else {
                this.f21277i.add(str);
                if (!activity.shouldShowRequestPermissionRationale(str)) {
                    this.f21278j.add(str);
                }
            }
        }
    }

    private boolean u(final String permission) {
        return androidx.core.content.d.a(this.f21269a, permission) == 0;
    }

    private boolean y(final Intent intent) {
        return this.f21269a.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public XPermission C(final c listener) {
        this.f21270b = listener;
        return this;
    }

    public void E() {
        this.f21269a = null;
    }

    public void F() {
        this.f21276h = new ArrayList();
        this.f21275g = new ArrayList();
        for (String str : this.f21274f) {
            if (u(str)) {
                this.f21276h.add(str);
            } else {
                this.f21275g.add(str);
            }
        }
        if (this.f21275g.isEmpty()) {
            G();
        } else {
            K();
        }
    }

    @x0(api = 23)
    public void H(final d callback) {
        if (!w()) {
            f21268n = callback;
            PermissionActivity.a(this.f21269a, 3);
        } else if (callback != null) {
            callback.a();
        }
    }

    @x0(api = 23)
    public void I(final d callback) {
        if (!x()) {
            f21267m = callback;
            PermissionActivity.a(this.f21269a, 2);
        } else if (callback != null) {
            callback.a();
        }
    }

    public XPermission n(final b callback) {
        this.f21272d = callback;
        return this;
    }

    public XPermission o(final d callback) {
        this.f21271c = callback;
        return this;
    }

    public List<String> r() {
        return s(this.f21269a.getPackageName());
    }

    public List<String> s(final String packageName) {
        try {
            String[] strArr = this.f21269a.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
            return strArr == null ? Collections.emptyList() : Arrays.asList(strArr);
        } catch (PackageManager.NameNotFoundException e6) {
            e6.printStackTrace();
            return Collections.emptyList();
        }
    }

    public boolean v(final String... permissions) {
        for (String str : permissions) {
            if (!u(str)) {
                return false;
            }
        }
        return true;
    }

    public boolean w() {
        return Settings.canDrawOverlays(this.f21269a);
    }

    @x0(api = 23)
    public boolean x() {
        return Settings.System.canWrite(this.f21269a);
    }

    public void z() {
        Intent intent = new Intent(ProtectedSandApp.s("㔙"));
        intent.setData(Uri.parse(ProtectedSandApp.s("㔚") + this.f21269a.getPackageName()));
        if (y(intent)) {
            this.f21269a.startActivity(intent.addFlags(268435456));
        }
    }
}
