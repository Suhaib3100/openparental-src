package android.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.m1;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher.java */
/* loaded from: classes.dex */
class v {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicBoolean f8681a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.java */
    @m1
    /* loaded from: classes3.dex */
    static class a extends m {
        a() {
        }

        @Override // android.view.m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            q0.g(activity);
        }

        @Override // android.view.m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.view.m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    private v() {
    }

    static void a(Context context) {
        if (f8681a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
    }
}
