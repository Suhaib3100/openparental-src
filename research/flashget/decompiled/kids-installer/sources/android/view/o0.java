package android.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.q0;
import android.view.t;
import androidx.annotation.m1;
import androidx.annotation.x0;

/* compiled from: ProcessLifecycleOwner.java */
/* loaded from: classes3.dex */
public class o0 implements a0 {

    /* renamed from: w, reason: collision with root package name */
    @m1
    static final long f8632w = 700;

    /* renamed from: x, reason: collision with root package name */
    private static final o0 f8633x = new o0();

    /* renamed from: s, reason: collision with root package name */
    private Handler f8638s;

    /* renamed from: o, reason: collision with root package name */
    private int f8634o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f8635p = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8636q = true;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8637r = true;

    /* renamed from: t, reason: collision with root package name */
    private final c0 f8639t = new c0(this);

    /* renamed from: u, reason: collision with root package name */
    private Runnable f8640u = new a();

    /* renamed from: v, reason: collision with root package name */
    q0.a f8641v = new b();

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0.this.f();
            o0.this.h();
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    class b implements q0.a {
        b() {
        }

        @Override // androidx.lifecycle.q0.a
        public void a() {
        }

        @Override // androidx.lifecycle.q0.a
        public void onResume() {
            o0.this.b();
        }

        @Override // androidx.lifecycle.q0.a
        public void onStart() {
            o0.this.c();
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    class c extends m {

        /* compiled from: ProcessLifecycleOwner.java */
        class a extends m {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@androidx.annotation.o0 Activity activity) {
                o0.this.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@androidx.annotation.o0 Activity activity) {
                o0.this.c();
            }
        }

        c() {
        }

        @Override // android.view.m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                q0.f(activity).h(o0.this.f8641v);
            }
        }

        @Override // android.view.m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            o0.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @x0(29)
        public void onActivityPreCreated(@androidx.annotation.o0 Activity activity, @androidx.annotation.q0 Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.view.m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            o0.this.d();
        }
    }

    private o0() {
    }

    @androidx.annotation.o0
    public static a0 i() {
        return f8633x;
    }

    static void j(Context context) {
        f8633x.e(context);
    }

    void a() {
        int i5 = this.f8635p - 1;
        this.f8635p = i5;
        if (i5 == 0) {
            this.f8638s.postDelayed(this.f8640u, f8632w);
        }
    }

    void b() {
        int i5 = this.f8635p + 1;
        this.f8635p = i5;
        if (i5 == 1) {
            if (!this.f8636q) {
                this.f8638s.removeCallbacks(this.f8640u);
            } else {
                this.f8639t.j(t.b.ON_RESUME);
                this.f8636q = false;
            }
        }
    }

    void c() {
        int i5 = this.f8634o + 1;
        this.f8634o = i5;
        if (i5 == 1 && this.f8637r) {
            this.f8639t.j(t.b.ON_START);
            this.f8637r = false;
        }
    }

    void d() {
        this.f8634o--;
        h();
    }

    void e(Context context) {
        this.f8638s = new Handler();
        this.f8639t.j(t.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void f() {
        if (this.f8635p == 0) {
            this.f8636q = true;
            this.f8639t.j(t.b.ON_PAUSE);
        }
    }

    @Override // android.view.a0
    @androidx.annotation.o0
    public t getLifecycle() {
        return this.f8639t;
    }

    void h() {
        if (this.f8634o == 0 && this.f8636q) {
            this.f8639t.j(t.b.ON_STOP);
            this.f8637r = true;
        }
    }
}
