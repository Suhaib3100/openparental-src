package dagger.android;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.ContentProvider;
import android.content.Context;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import dagger.internal.s;

/* compiled from: AndroidInjection.java */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f73654a = ProtectedSandApp.s("形\u0001");

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static m a(Fragment fragment) {
        Fragment fragment2 = fragment;
        do {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 == 0) {
                Activity activity = fragment.getActivity();
                if (activity instanceof m) {
                    return (m) activity;
                }
                if (activity.getApplication() instanceof m) {
                    return (m) activity.getApplication();
                }
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("彞\u0001"), fragment.getClass().getCanonicalName()));
            }
        } while (!(fragment2 instanceof m));
        return (m) fragment2;
    }

    public static void b(Activity activity) {
        s.c(activity, ProtectedSandApp.s("彟\u0001"));
        ComponentCallbacks2 application = activity.getApplication();
        if (application instanceof m) {
            g(activity, (m) application);
        } else {
            throw new RuntimeException(String.format(ProtectedSandApp.s("彠\u0001"), application.getClass().getCanonicalName(), m.class.getCanonicalName()));
        }
    }

    public static void c(Fragment fragment) {
        s.c(fragment, ProtectedSandApp.s("彡\u0001"));
        m a5 = a(fragment);
        if (Log.isLoggable(ProtectedSandApp.s("形\u0001"), 3)) {
            String.format(ProtectedSandApp.s("彣\u0001"), fragment.getClass().getCanonicalName(), a5.getClass().getCanonicalName());
        }
        g(fragment, a5);
    }

    public static void d(Service service) {
        s.c(service, ProtectedSandApp.s("彤\u0001"));
        ComponentCallbacks2 application = service.getApplication();
        if (application instanceof m) {
            g(service, (m) application);
        } else {
            throw new RuntimeException(String.format(ProtectedSandApp.s("彠\u0001"), application.getClass().getCanonicalName(), m.class.getCanonicalName()));
        }
    }

    public static void e(BroadcastReceiver broadcastReceiver, Context context) {
        s.c(broadcastReceiver, ProtectedSandApp.s("彥\u0001"));
        s.c(context, ProtectedSandApp.s("彦\u0001"));
        ComponentCallbacks2 componentCallbacks2 = (Application) context.getApplicationContext();
        if (componentCallbacks2 instanceof m) {
            g(broadcastReceiver, (m) componentCallbacks2);
        } else {
            throw new RuntimeException(String.format(ProtectedSandApp.s("彠\u0001"), componentCallbacks2.getClass().getCanonicalName(), m.class.getCanonicalName()));
        }
    }

    public static void f(ContentProvider contentProvider) {
        s.c(contentProvider, ProtectedSandApp.s("彧\u0001"));
        ComponentCallbacks2 componentCallbacks2 = (Application) contentProvider.getContext().getApplicationContext();
        if (componentCallbacks2 instanceof m) {
            g(contentProvider, (m) componentCallbacks2);
        } else {
            throw new RuntimeException(String.format(ProtectedSandApp.s("彠\u0001"), componentCallbacks2.getClass().getCanonicalName(), m.class.getCanonicalName()));
        }
    }

    private static void g(Object target, m hasAndroidInjector) {
        d<Object> h4 = hasAndroidInjector.h();
        s.d(h4, ProtectedSandApp.s("彨\u0001"), hasAndroidInjector.getClass());
        h4.i(target);
    }
}
