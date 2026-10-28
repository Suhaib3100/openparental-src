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
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
final class f {

    /* renamed from: b, reason: collision with root package name */
    protected static final Class<?> f25697b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f25698c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Field f25699d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f25700e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f25701f;

    /* renamed from: g, reason: collision with root package name */
    protected static final Method f25702g;

    /* renamed from: a, reason: collision with root package name */
    private static final String f25696a = "ActivityRecreator";

    /* renamed from: h, reason: collision with root package name */
    private static final Handler f25703h = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f25704b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f25705c;

        a(d dVar, Object obj) {
            this.f25704b = dVar;
            this.f25705c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25704b.f25710b = this.f25705c;
        }
    }

    /* compiled from: ActivityRecreator.java */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f25706b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f25707c;

        b(Application application, d dVar) {
            this.f25706b = application;
            this.f25707c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25706b.unregisterActivityLifecycleCallbacks(this.f25707c);
        }
    }

    /* compiled from: ActivityRecreator.java */
    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f25708b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f25709c;

        c(Object obj, Object obj2) {
            this.f25708b = obj;
            this.f25709c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = f.f25700e;
                if (method != null) {
                    method.invoke(this.f25708b, this.f25709c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    f.f25701f.invoke(this.f25708b, this.f25709c, Boolean.FALSE);
                }
            } catch (RuntimeException e4) {
                if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                    throw e4;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: ActivityRecreator.java */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b, reason: collision with root package name */
        Object f25710b;

        /* renamed from: c, reason: collision with root package name */
        private Activity f25711c;

        /* renamed from: d, reason: collision with root package name */
        private final int f25712d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f25713e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f25714f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f25715g = false;

        d(@androidx.annotation.o0 Activity activity) {
            this.f25711c = activity;
            this.f25712d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f25711c == activity) {
                this.f25711c = null;
                this.f25714f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f25714f || this.f25715g || this.f25713e || !f.h(this.f25710b, this.f25712d, activity)) {
                return;
            }
            this.f25715g = true;
            this.f25710b = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f25711c == activity) {
                this.f25713e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a5 = a();
        f25697b = a5;
        f25698c = b();
        f25699d = f();
        f25700e = d(a5);
        f25701f = c(a5);
        f25702g = e(a5);
    }

    private f() {
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
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
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
        int i4 = Build.VERSION.SDK_INT;
        return i4 == 26 || i4 == 27;
    }

    protected static boolean h(Object obj, int i4, Activity activity) {
        try {
            Object obj2 = f25699d.get(activity);
            if (obj2 == obj && activity.hashCode() == i4) {
                f25703h.postAtFrontOfQueue(new c(f25698c.get(activity), obj2));
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
        if (g() && f25702g == null) {
            return false;
        }
        if (f25701f == null && f25700e == null) {
            return false;
        }
        try {
            Object obj2 = f25699d.get(activity);
            if (obj2 == null || (obj = f25698c.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f25703h;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f25702g;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f25703h.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
