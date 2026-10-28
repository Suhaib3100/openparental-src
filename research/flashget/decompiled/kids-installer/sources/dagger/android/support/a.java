package dagger.android.support;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.flashget.kidsdownloader.ProtectedSandApp;
import dagger.android.m;
import dagger.internal.s;

/* compiled from: AndroidSupportInjection.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22350a = ProtectedSandApp.s("㚾");

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
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("㚹"), fragment.getClass().getCanonicalName()));
            }
        } while (!(fragment2 instanceof m));
        return (m) fragment2;
    }

    public static void b(Fragment fragment) {
        s.c(fragment, ProtectedSandApp.s("㚺"));
        m a6 = a(fragment);
        if (Log.isLoggable(ProtectedSandApp.s("㚻"), 3)) {
            String.format(ProtectedSandApp.s("㚼"), fragment.getClass().getCanonicalName(), a6.getClass().getCanonicalName());
        }
        c(fragment, a6);
    }

    private static void c(Object target, m hasAndroidInjector) {
        dagger.android.d<Object> c6 = hasAndroidInjector.c();
        s.d(c6, ProtectedSandApp.s("㚽"), hasAndroidInjector.getClass());
        c6.b(target);
    }
}
