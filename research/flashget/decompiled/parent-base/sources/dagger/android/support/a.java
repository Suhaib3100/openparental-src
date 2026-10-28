package dagger.android.support;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.flashget.parentalcontrol.ProtectedSandApp;
import dagger.android.m;
import dagger.internal.s;

/* compiled from: AndroidSupportInjection.java */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f73664a = ProtectedSandApp.s("彫\u0001");

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static m a(Fragment fragment) {
        Fragment fragment2 = fragment;
        do {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 == 0) {
                FragmentActivity activity = fragment.getActivity();
                if (activity instanceof m) {
                    return (m) activity;
                }
                if (activity.getApplication() instanceof m) {
                    return (m) activity.getApplication();
                }
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("彩\u0001"), fragment.getClass().getCanonicalName()));
            }
        } while (!(fragment2 instanceof m));
        return (m) fragment2;
    }

    public static void b(Fragment fragment) {
        s.c(fragment, ProtectedSandApp.s("彪\u0001"));
        m a5 = a(fragment);
        if (Log.isLoggable(ProtectedSandApp.s("彫\u0001"), 3)) {
            String.format(ProtectedSandApp.s("彬\u0001"), fragment.getClass().getCanonicalName(), a5.getClass().getCanonicalName());
        }
        c(fragment, a5);
    }

    private static void c(Object target, m hasAndroidInjector) {
        dagger.android.d<Object> h4 = hasAndroidInjector.h();
        s.d(h4, ProtectedSandApp.s("彭\u0001"), hasAndroidInjector.getClass());
        h4.i(target);
    }
}
