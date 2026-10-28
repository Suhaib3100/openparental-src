package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.c1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ActivityRecreator.java */
@androidx.annotation.c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
final class j {

    /* renamed from: b, reason: collision with root package name */
    protected static final Class<?> f4113b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f4114c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Field f4115d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f4116e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f4117f;

    /* renamed from: g, reason: collision with root package name */
    protected static final Method f4118g;

    /* renamed from: a, reason: collision with root package name */
    private static final String f4112a = "ActivityRecreator";

    /* renamed from: h, reason: collision with root package name */
    private static final Handler f4119h = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator.java */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ d f4120o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Object f4121p;

        a(d dVar, Object obj) {
            this.f4120o = dVar;
            this.f4121p = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4120o.f4126o = this.f4121p;
        }
    }

    /* compiled from: ActivityRecreator.java */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Application f4122o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ d f4123p;

        b(Application application, d dVar) {
            this.f4122o = application;
            this.f4123p = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4122o.unregisterActivityLifecycleCallbacks(this.f4123p);
        }
    }

    /* compiled from: ActivityRecreator.java */
    class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object f4124o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Object f4125p;

        c(Object obj, Object obj2) {
            this.f4124o = obj;
            this.f4125p = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = j.f4116e;
                if (method != null) {
                    method.invoke(this.f4124o, this.f4125p, Boolean.FALSE, "AppCompat recreation");
                } else {
                    j.f4117f.invoke(this.f4124o, this.f4125p, Boolean.FALSE);
                }
            } catch (RuntimeException e6) {
                if (e6.getClass() == RuntimeException.class && e6.getMessage() != null && e6.getMessage().startsWith("Unable to stop")) {
                    throw e6;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: ActivityRecreator.java */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: o, reason: collision with root package name */
        Object f4126o;

        /* renamed from: p, reason: collision with root package name */
        private Activity f4127p;

        /* renamed from: q, reason: collision with root package name */
        private final int f4128q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f4129r = false;

        /* renamed from: s, reason: collision with root package name */
        private boolean f4130s = false;

        /* renamed from: t, reason: collision with root package name */
        private boolean f4131t = false;

        d(@androidx.annotation.o0 Activity activity) {
            this.f4127p = activity;
            this.f4128q = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f4127p == activity) {
                this.f4127p = null;
                this.f4130s = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f4130s || this.f4131t || this.f4129r || !j.h(this.f4126o, this.f4128q, activity)) {
                return;
            }
            this.f4131t = true;
            this.f4126o = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f4127p == activity) {
                this.f4129r = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a6 = a();
        f4113b = a6;
        f4114c = b();
        f4115d = f();
        f4116e = d(a6);
        f4117f = c(a6);
        f4118g = e(a6);
    }

    private j() {
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 == 26 || i5 == 27;
    }

    protected static boolean h(Object obj, int i5, Activity activity) {
        try {
            Object obj2 = f4115d.get(activity);
            if (obj2 == obj && activity.hashCode() == i5) {
                f4119h.postAtFrontOfQueue(new c(f4114c.get(activity), obj2));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static boolean i(@androidx.annotation.o0 Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f4118g == null) {
            return false;
        }
        if (f4117f == null && f4116e == null) {
            return false;
        }
        try {
            Object obj2 = f4115d.get(activity);
            if (obj2 == null || (obj = f4114c.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f4119h;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f4118g;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f4119h.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
