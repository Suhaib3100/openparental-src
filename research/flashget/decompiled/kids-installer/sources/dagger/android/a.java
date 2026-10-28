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
import com.flashget.kidsdownloader.ProtectedSandApp;
import dagger.internal.s;

/* compiled from: AndroidInjection.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22341a = ProtectedSandApp.s("㚸");

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
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("㚪"), fragment.getClass().getCanonicalName()));
            }
        } while (!(fragment2 instanceof m));
        return (m) fragment2;
    }

    public static void b(Activity activity) {
        s.c(activity, ProtectedSandApp.s("㚫"));
        ComponentCallbacks2 application = activity.getApplication();
        if (!(application instanceof m)) {
            throw new RuntimeException(String.format(ProtectedSandApp.s("㚬"), application.getClass().getCanonicalName(), m.class.getCanonicalName()));
        }
        g(activity, (m) application);
    }

    public static void c(Fragment fragment) {
        s.c(fragment, ProtectedSandApp.s("㚭"));
        m a6 = a(fragment);
        if (Log.isLoggable(ProtectedSandApp.s("㚮"), 3)) {
            String.format(ProtectedSandApp.s("㚯"), fragment.getClass().getCanonicalName(), a6.getClass().getCanonicalName());
        }
        g(fragment, a6);
    }

    public static void d(Service service) {
        s.c(service, ProtectedSandApp.s("㚰"));
        ComponentCallbacks2 application = service.getApplication();
        if (!(application instanceof m)) {
            throw new RuntimeException(String.format(ProtectedSandApp.s("㚱"), application.getClass().getCanonicalName(), m.class.getCanonicalName()));
        }
        g(service, (m) application);
    }

    public static void e(BroadcastReceiver broadcastReceiver, Context context) {
        s.c(broadcastReceiver, ProtectedSandApp.s("㚲"));
        s.c(context, ProtectedSandApp.s("㚳"));
        ComponentCallbacks2 componentCallbacks2 = (Application) context.getApplicationContext();
        if (!(componentCallbacks2 instanceof m)) {
            throw new RuntimeException(String.format(ProtectedSandApp.s("㚴"), componentCallbacks2.getClass().getCanonicalName(), m.class.getCanonicalName()));
        }
        g(broadcastReceiver, (m) componentCallbacks2);
    }

    public static void f(ContentProvider contentProvider) {
        s.c(contentProvider, ProtectedSandApp.s("㚵"));
        ComponentCallbacks2 componentCallbacks2 = (Application) contentProvider.getContext().getApplicationContext();
        if (!(componentCallbacks2 instanceof m)) {
            throw new RuntimeException(String.format(ProtectedSandApp.s("㚶"), componentCallbacks2.getClass().getCanonicalName(), m.class.getCanonicalName()));
        }
        g(contentProvider, (m) componentCallbacks2);
    }

    private static void g(Object target, m hasAndroidInjector) {
        d<Object> c6 = hasAndroidInjector.c();
        s.d(c6, ProtectedSandApp.s("㚷"), hasAndroidInjector.getClass());
        c6.b(target);
    }
}
