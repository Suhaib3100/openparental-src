package com.tencent.beacon.c.a;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.SparseArray;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.module.StatModule;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LifecycleCallbacks.java */
/* loaded from: classes6.dex */
public class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray<WeakReference<Activity>> f71377a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private boolean f71378b = false;

    /* renamed from: c, reason: collision with root package name */
    private long f71379c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f71380d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f71381e = 20000;

    /* renamed from: f, reason: collision with root package name */
    private String f71382f = "";

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f71383g;

    /* renamed from: h, reason: collision with root package name */
    private StatModule f71384h;

    public c(StatModule statModule) {
        this.f71384h = statModule;
        HashMap hashMap = new HashMap(6);
        this.f71383g = hashMap;
        hashMap.put(ProtectedSandApp.s("㇛\u0001"), ProtectedSandApp.s("㇜\u0001"));
        this.f71383g.put(ProtectedSandApp.s("㇝\u0001"), ProtectedSandApp.s("㇞\u0001"));
    }

    private boolean c() {
        String e4 = com.tencent.beacon.base.util.b.e();
        boolean equals = "".equals(this.f71382f);
        String s4 = ProtectedSandApp.s("\u31e5\u0001");
        if (equals) {
            this.f71382f = com.tencent.beacon.a.d.a.a().getString(s4, "");
        }
        boolean z4 = false;
        if (!e4.equals(this.f71382f)) {
            a.SharedPreferencesEditorC0995a edit = com.tencent.beacon.a.d.a.a().edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                edit.putString(s4, e4);
            }
            if (!"".equals(this.f71382f)) {
                com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("\u31e6\u0001"), new Object[0]);
                z4 = true;
            }
            this.f71382f = e4;
        }
        return z4;
    }

    private void d() {
        com.tencent.beacon.a.b.b.a().a(new a(this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        a(activity);
        a(true, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(activity);
        a(false, activity);
    }

    public static SparseArray<WeakReference<Activity>> a() {
        return f71377a;
    }

    private static void b(Activity activity) {
        if (activity == null || f71377a == null) {
            return;
        }
        int hashCode = activity.hashCode();
        if (f71377a.get(hashCode) == null) {
            f71377a.put(hashCode, new WeakReference<>(activity));
        }
    }

    private void a(boolean z4, Activity activity) {
        if (z4) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f71379c > 0) {
                long j4 = this.f71380d;
                if (j4 > 0 && j4 + b() <= currentTimeMillis) {
                    com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㇠\u0001"), new Object[0]);
                    d();
                    StatModule statModule = this.f71384h;
                    if (statModule != null) {
                        statModule.a();
                    }
                }
            }
            this.f71379c = currentTimeMillis;
            this.f71380d = 0L;
            return;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        this.f71380d = currentTimeMillis2;
        long j5 = this.f71379c;
        if (800 + j5 > currentTimeMillis2) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㇡\u0001"), new Object[0]);
            this.f71379c = 0L;
        } else {
            if (j5 == 0) {
                this.f71379c = currentTimeMillis2;
            }
            StatModule statModule2 = this.f71384h;
            if (statModule2 != null) {
                statModule2.b();
            }
        }
    }

    private long b() {
        if (this.f71381e <= 20000) {
            String a5 = com.tencent.beacon.d.a.a().a(ProtectedSandApp.s("㇢\u0001"));
            if (a5 != null) {
                try {
                    this.f71381e = Long.valueOf(a5).longValue();
                    com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㇣\u0001"), a5);
                } catch (NumberFormatException unused) {
                    com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("\u31e4\u0001"), new Object[0]);
                }
            }
            this.f71381e++;
        }
        return this.f71381e;
    }

    private void a(Activity activity) {
        com.tencent.beacon.a.c.b.f71072d = true;
        b(activity);
        try {
            WeakReference<Activity> weakReference = a().get(activity.hashCode());
            if (!this.f71378b) {
                com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㇟\u0001"), new Object[0]);
                com.tencent.beacon.a.b.b.a().a(new b(this, weakReference));
                this.f71378b = true;
            }
        } catch (NullPointerException e4) {
            e4.getMessage();
        }
        if (c()) {
            d();
        }
    }
}
