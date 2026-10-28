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
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* loaded from: classes6.dex */
public final class XPermission {

    /* renamed from: k, reason: collision with root package name */
    private static List<String> f69742k;

    /* renamed from: l, reason: collision with root package name */
    private static XPermission f69743l;

    /* renamed from: m, reason: collision with root package name */
    private static d f69744m;

    /* renamed from: n, reason: collision with root package name */
    private static d f69745n;

    /* renamed from: a, reason: collision with root package name */
    private Context f69746a;

    /* renamed from: b, reason: collision with root package name */
    private c f69747b;

    /* renamed from: c, reason: collision with root package name */
    private d f69748c;

    /* renamed from: d, reason: collision with root package name */
    private b f69749d;

    /* renamed from: e, reason: collision with root package name */
    private e f69750e;

    /* renamed from: f, reason: collision with root package name */
    private Set<String> f69751f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f69752g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f69753h;

    /* renamed from: i, reason: collision with root package name */
    private List<String> f69754i;

    /* renamed from: j, reason: collision with root package name */
    private List<String> f69755j;

    @x0(api = 23)
    public static class PermissionActivity extends Activity {

        /* renamed from: b, reason: collision with root package name */
        private static final String f69756b = ProtectedSandApp.s("ឧ\u0001");

        /* renamed from: c, reason: collision with root package name */
        public static final int f69757c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f69758d = 2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f69759e = 3;

        public static void a(final Context context, int type) {
            Intent intent = new Intent(context, (Class<?>) PermissionActivity.class);
            intent.addFlags(ClientDefaults.MAX_MSG_SIZE);
            intent.putExtra(ProtectedSandApp.s("ឧ\u0001"), type);
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
                if (XPermission.f69744m == null) {
                    return;
                }
                if (XPermission.f69743l.x()) {
                    XPermission.f69744m.onGranted();
                } else {
                    XPermission.f69744m.onDenied();
                }
                d unused = XPermission.f69744m = null;
            } else if (requestCode == 3) {
                if (XPermission.f69745n == null) {
                    return;
                }
                if (XPermission.f69743l.w()) {
                    XPermission.f69745n.onGranted();
                } else {
                    XPermission.f69745n.onDenied();
                }
                d unused2 = XPermission.f69745n = null;
            }
            finish();
        }

        @Override // android.app.Activity
        protected void onCreate(@q0 Bundle savedInstanceState) {
            getWindow().addFlags(262672);
            getWindow().getAttributes().alpha = 0.0f;
            int intExtra = getIntent().getIntExtra(ProtectedSandApp.s("ឧ\u0001"), 1);
            if (intExtra != 1) {
                if (intExtra == 2) {
                    super.onCreate(savedInstanceState);
                    XPermission.f69743l.L(this, 2);
                    return;
                } else {
                    if (intExtra == 3) {
                        super.onCreate(savedInstanceState);
                        XPermission.f69743l.J(this, 3);
                        return;
                    }
                    return;
                }
            }
            if (XPermission.f69743l == null) {
                super.onCreate(savedInstanceState);
                finish();
                return;
            }
            if (XPermission.f69743l.f69750e != null) {
                XPermission.f69743l.f69750e.a(this);
            }
            super.onCreate(savedInstanceState);
            if (XPermission.f69743l.D(this)) {
                finish();
                return;
            }
            if (XPermission.f69743l.f69752g != null) {
                int size = XPermission.f69743l.f69752g.size();
                if (size <= 0) {
                    finish();
                } else {
                    requestPermissions((String[]) XPermission.f69743l.f69752g.toArray(new String[size]), 1);
                }
            }
        }

        @Override // android.app.Activity
        public void onRequestPermissionsResult(int requestCode, @o0 String[] permissions2, @o0 int[] grantResults) {
            XPermission.f69743l.A(this);
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
        void onDenied();

        void onGranted();
    }

    public interface e {
        void a(Activity activity);
    }

    private XPermission(Context ctx, final String... permissions2) {
        f69743l = this;
        this.f69746a = ctx;
        B(permissions2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(final Activity activity) {
        t(activity);
        G();
    }

    private void B(final String... permissions2) {
        this.f69751f = new LinkedHashSet();
        f69742k = r();
        if (permissions2 == null) {
            return;
        }
        for (String str : permissions2) {
            for (String str2 : com.lxj.xpopup.util.c.a(str)) {
                if (f69742k.contains(str2)) {
                    this.f69751f.add(str2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x0(api = 23)
    public boolean D(final Activity activity) {
        boolean z4 = false;
        if (this.f69747b != null) {
            Iterator<String> it = this.f69752g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (activity.shouldShowRequestPermissionRationale(it.next())) {
                    t(activity);
                    this.f69747b.a(new a());
                    z4 = true;
                    break;
                }
            }
            this.f69747b = null;
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.f69748c != null) {
            if (this.f69752g.size() == 0 || this.f69751f.size() == this.f69753h.size()) {
                this.f69748c.onGranted();
            } else if (!this.f69754i.isEmpty()) {
                this.f69748c.onDenied();
            }
            this.f69748c = null;
        }
        if (this.f69749d != null) {
            if (this.f69752g.size() == 0 || this.f69751f.size() == this.f69753h.size()) {
                this.f69749d.a(this.f69753h);
            } else if (!this.f69754i.isEmpty()) {
                this.f69749d.b(this.f69755j, this.f69754i);
            }
            this.f69749d = null;
        }
        this.f69747b = null;
        this.f69750e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public void J(final Activity activity, final int requestCode) {
        Intent intent = new Intent(ProtectedSandApp.s("ឨ\u0001"));
        intent.setData(Uri.parse(ProtectedSandApp.s("ឩ\u0001") + this.f69746a.getPackageName()));
        if (y(intent)) {
            activity.startActivityForResult(intent, requestCode);
        } else {
            z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x0(api = 23)
    public void K() {
        this.f69754i = new ArrayList();
        this.f69755j = new ArrayList();
        PermissionActivity.a(this.f69746a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public void L(final Activity activity, final int requestCode) {
        Intent intent = new Intent(ProtectedSandApp.s("ឪ\u0001"));
        intent.setData(Uri.parse(ProtectedSandApp.s("ឩ\u0001") + this.f69746a.getPackageName()));
        if (y(intent)) {
            activity.startActivityForResult(intent, requestCode);
        } else {
            z();
        }
    }

    public static XPermission p(Context context, final String... permissions2) {
        XPermission xPermission = f69743l;
        if (xPermission == null) {
            return new XPermission(context, permissions2);
        }
        xPermission.f69746a = context;
        xPermission.B(permissions2);
        return f69743l;
    }

    public static XPermission q() {
        return f69743l;
    }

    private void t(final Activity activity) {
        for (String str : this.f69752g) {
            if (u(str)) {
                this.f69753h.add(str);
            } else {
                this.f69754i.add(str);
                if (!activity.shouldShowRequestPermissionRationale(str)) {
                    this.f69755j.add(str);
                }
            }
        }
    }

    private boolean u(final String permission) {
        return androidx.core.content.d.checkSelfPermission(this.f69746a, permission) == 0;
    }

    private boolean y(final Intent intent) {
        return this.f69746a.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public XPermission C(final c listener) {
        this.f69747b = listener;
        return this;
    }

    public void E() {
        this.f69746a = null;
    }

    public void F() {
        this.f69753h = new ArrayList();
        this.f69752g = new ArrayList();
        for (String str : this.f69751f) {
            if (u(str)) {
                this.f69753h.add(str);
            } else {
                this.f69752g.add(str);
            }
        }
        if (this.f69752g.isEmpty()) {
            G();
        } else {
            K();
        }
    }

    @x0(api = 23)
    public void H(final d callback) {
        if (!Settings.canDrawOverlays(this.f69746a)) {
            f69745n = callback;
            PermissionActivity.a(this.f69746a, 3);
        } else if (callback != null) {
            callback.onGranted();
        }
    }

    @x0(api = 23)
    public void I(final d callback) {
        if (!Settings.System.canWrite(this.f69746a)) {
            f69744m = callback;
            PermissionActivity.a(this.f69746a, 2);
        } else if (callback != null) {
            callback.onGranted();
        }
    }

    public XPermission n(final b callback) {
        this.f69749d = callback;
        return this;
    }

    public XPermission o(final d callback) {
        this.f69748c = callback;
        return this;
    }

    public List<String> r() {
        return s(this.f69746a.getPackageName());
    }

    public List<String> s(final String packageName) {
        try {
            String[] strArr = this.f69746a.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
            return strArr == null ? Collections.emptyList() : Arrays.asList(strArr);
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return Collections.emptyList();
        }
    }

    public boolean v(final String... permissions2) {
        for (String str : permissions2) {
            if (!u(str)) {
                return false;
            }
        }
        return true;
    }

    public boolean w() {
        return Settings.canDrawOverlays(this.f69746a);
    }

    @x0(api = 23)
    public boolean x() {
        return Settings.System.canWrite(this.f69746a);
    }

    public void z() {
        Intent intent = new Intent(ProtectedSandApp.s("ឫ\u0001"));
        intent.setData(Uri.parse(ProtectedSandApp.s("ឩ\u0001") + this.f69746a.getPackageName()));
        if (y(intent)) {
            this.f69746a.startActivity(intent.addFlags(ClientDefaults.MAX_MSG_SIZE));
        }
    }
}
