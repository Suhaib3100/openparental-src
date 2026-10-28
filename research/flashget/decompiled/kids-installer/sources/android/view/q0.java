package android.view;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.view.t;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: ReportFragment.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class q0 extends Fragment {

    /* renamed from: p, reason: collision with root package name */
    private static final String f8644p = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    /* renamed from: o, reason: collision with root package name */
    private a f8645o;

    /* compiled from: ReportFragment.java */
    interface a {
        void a();

        void onResume();

        void onStart();
    }

    /* compiled from: ReportFragment.java */
    @x0(29)
    static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@o0 Activity activity, @androidx.annotation.q0 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@o0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@o0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@o0 Activity activity, @androidx.annotation.q0 Bundle bundle) {
            q0.a(activity, t.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@o0 Activity activity) {
            q0.a(activity, t.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@o0 Activity activity) {
            q0.a(activity, t.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@o0 Activity activity) {
            q0.a(activity, t.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@o0 Activity activity) {
            q0.a(activity, t.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@o0 Activity activity) {
            q0.a(activity, t.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@o0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@o0 Activity activity, @o0 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@o0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@o0 Activity activity) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void a(@o0 Activity activity, @o0 t.b bVar) {
        if (activity instanceof d0) {
            ((d0) activity).getLifecycle().j(bVar);
        } else if (activity instanceof a0) {
            t lifecycle = ((a0) activity).getLifecycle();
            if (lifecycle instanceof c0) {
                ((c0) lifecycle).j(bVar);
            }
        }
    }

    private void b(@o0 t.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    static q0 f(Activity activity) {
        return (q0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public static void g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new q0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    void h(a aVar) {
        this.f8645o = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f8645o);
        b(t.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b(t.b.ON_DESTROY);
        this.f8645o = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        b(t.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.f8645o);
        b(t.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.f8645o);
        b(t.b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        b(t.b.ON_STOP);
    }
}
