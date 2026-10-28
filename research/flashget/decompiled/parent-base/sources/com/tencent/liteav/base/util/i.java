package com.tencent.liteav.base.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public final class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    private static final p<Boolean> f71930b = new p<>(j.a());

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f71931a;

    /* renamed from: c, reason: collision with root package name */
    private volatile WeakReference<Activity> f71932c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Boolean f71933d;

    /* renamed from: e, reason: collision with root package name */
    private volatile a f71934e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Integer> f71935f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<Integer> f71936g;

    public interface a {
        void a(boolean z4);
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final i f71937a = new i(0);
    }

    /* synthetic */ i(byte b5) {
        this();
    }

    public static void a(boolean z4) {
        f71930b.a(Boolean.valueOf(z4));
    }

    public final synchronized boolean b() {
        try {
            if (this.f71933d == null) {
                this.f71933d = f71930b.a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f71933d.booleanValue();
    }

    public final Activity c() {
        WeakReference<Activity> weakReference = this.f71932c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
        try {
            if (this.f71931a) {
                String s4 = ProtectedSandApp.s("厰\u0001");
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("厸\u0001"));
                sb.append(activity);
                sb.append(ProtectedSandApp.s("厹\u0001"));
                sb.append(this.f71932c != null ? this.f71932c.get() : ProtectedSandApp.s("厺\u0001"));
                Log.i(s4, sb.toString(), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        this.f71936g.add(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.f71931a) {
                String s4 = ProtectedSandApp.s("厰\u0001");
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("去\u0001"));
                sb.append(activity);
                sb.append(ProtectedSandApp.s("厹\u0001"));
                sb.append(this.f71932c != null ? this.f71932c.get() : ProtectedSandApp.s("厺\u0001"));
                Log.i(s4, sb.toString(), new Object[0]);
            }
            int hashCode = activity.hashCode();
            if (this.f71935f.contains(Integer.valueOf(hashCode))) {
                this.f71935f.remove(Integer.valueOf(hashCode));
                b(this.f71935f.size() == 0);
                if (this.f71932c != null && this.f71932c.get() == activity) {
                    this.f71932c = null;
                }
            } else if (this.f71935f.size() != 0) {
                b(false);
            } else if (this.f71936g.contains(Integer.valueOf(hashCode))) {
                b(true);
            }
            this.f71936g.remove(Integer.valueOf(hashCode));
        } catch (Throwable th) {
            throw th;
        }
    }

    private i() {
        this.f71932c = null;
        this.f71933d = null;
        this.f71935f = new HashSet();
        this.f71936g = new HashSet();
        this.f71931a = false;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext != null) {
            ((Application) applicationContext.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        } else {
            Log.e(ProtectedSandApp.s("厰\u0001"), ProtectedSandApp.s("厯\u0001"), new Object[0]);
        }
    }

    public static i a() {
        return b.f71937a;
    }

    public final synchronized void a(Activity activity) {
        if (activity == null) {
            return;
        }
        if (c() != null) {
            Log.i(ProtectedSandApp.s("厰\u0001"), ProtectedSandApp.s("厶\u0001"), new Object[0]);
            return;
        }
        this.f71932c = new WeakReference<>(activity);
        Log.i(ProtectedSandApp.s("厰\u0001"), ProtectedSandApp.s("厵\u0001") + activity + ProtectedSandApp.s("厷\u0001"), new Object[0]);
    }

    private synchronized void b(boolean z4) {
        try {
            if (this.f71933d != null) {
                if (this.f71933d.booleanValue() != z4) {
                }
            }
            this.f71933d = Boolean.valueOf(z4);
            f71930b.a(Boolean.valueOf(z4));
            if (this.f71934e != null && this.f71931a) {
                this.f71934e.a(this.f71933d.booleanValue());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(Activity activity) {
        this.f71935f.add(Integer.valueOf(activity.hashCode()));
        this.f71932c = new WeakReference<>(activity);
        b(false);
        if (this.f71931a) {
            String valueOf = String.valueOf(activity);
            Log.i(ProtectedSandApp.s("厰\u0001"), ProtectedSandApp.s("厵\u0001").concat(valueOf), new Object[0]);
        }
    }

    public final synchronized void a(a aVar) {
        this.f71934e = aVar;
    }

    private static boolean a(Context context) {
        String s4 = ProtectedSandApp.s("厰\u0001");
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ProtectedSandApp.s("厱\u0001"));
            if (activityManager == null) {
                Log.e(s4, ProtectedSandApp.s("厲\u0001"), new Object[0]);
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                Log.e(s4, ProtectedSandApp.s("厳\u0001"), new Object[0]);
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && context.getPackageName().equals(runningAppProcessInfo.processName)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e4) {
            Log.e(s4, ProtectedSandApp.s("厴\u0001").concat(String.valueOf(e4)), new Object[0]);
            return false;
        }
    }
}
