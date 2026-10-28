package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.x0;
import androidx.collection.i;
import java.util.ArrayList;

/* compiled from: AnimationHandler.java */
/* loaded from: classes.dex */
class a {

    /* renamed from: g, reason: collision with root package name */
    private static final long f7735g = 10;

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<a> f7736h = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    private c f7740d;

    /* renamed from: a, reason: collision with root package name */
    private final i<b, Long> f7737a = new i<>();

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f7738b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final C0085a f7739c = new C0085a();

    /* renamed from: e, reason: collision with root package name */
    long f7741e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7742f = false;

    /* compiled from: AnimationHandler.java */
    /* renamed from: androidx.dynamicanimation.animation.a$a, reason: collision with other inner class name */
    class C0085a {
        C0085a() {
        }

        void a() {
            a.this.f7741e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f7741e);
            if (a.this.f7738b.size() > 0) {
                a.this.f().a();
            }
        }
    }

    /* compiled from: AnimationHandler.java */
    interface b {
        boolean a(long j5);
    }

    /* compiled from: AnimationHandler.java */
    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final C0085a f7744a;

        c(C0085a c0085a) {
            this.f7744a = c0085a;
        }

        abstract void a();
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes3.dex */
    private static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f7745b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f7746c;

        /* renamed from: d, reason: collision with root package name */
        long f7747d;

        /* compiled from: AnimationHandler.java */
        /* renamed from: androidx.dynamicanimation.animation.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0086a implements Runnable {
            RunnableC0086a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f7747d = SystemClock.uptimeMillis();
                d.this.f7744a.a();
            }
        }

        d(C0085a c0085a) {
            super(c0085a);
            this.f7747d = -1L;
            this.f7745b = new RunnableC0086a();
            this.f7746c = new Handler(Looper.myLooper());
        }

        @Override // androidx.dynamicanimation.animation.a.c
        void a() {
            this.f7746c.postDelayed(this.f7745b, Math.max(a.f7735g - (SystemClock.uptimeMillis() - this.f7747d), 0L));
        }
    }

    /* compiled from: AnimationHandler.java */
    @x0(16)
    /* loaded from: classes3.dex */
    private static class e extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Choreographer f7749b;

        /* renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f7750c;

        /* compiled from: AnimationHandler.java */
        /* renamed from: androidx.dynamicanimation.animation.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class ChoreographerFrameCallbackC0087a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0087a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j5) {
                e.this.f7744a.a();
            }
        }

        e(C0085a c0085a) {
            super(c0085a);
            this.f7749b = Choreographer.getInstance();
            this.f7750c = new ChoreographerFrameCallbackC0087a();
        }

        @Override // androidx.dynamicanimation.animation.a.c
        void a() {
            this.f7749b.postFrameCallback(this.f7750c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f7742f) {
            for (int size = this.f7738b.size() - 1; size >= 0; size--) {
                if (this.f7738b.get(size) == null) {
                    this.f7738b.remove(size);
                }
            }
            this.f7742f = false;
        }
    }

    public static long d() {
        ThreadLocal<a> threadLocal = f7736h;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f7741e;
    }

    public static a e() {
        ThreadLocal<a> threadLocal = f7736h;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean g(b bVar, long j5) {
        Long l5 = this.f7737a.get(bVar);
        if (l5 == null) {
            return true;
        }
        if (l5.longValue() >= j5) {
            return false;
        }
        this.f7737a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j5) {
        if (this.f7738b.size() == 0) {
            f().a();
        }
        if (!this.f7738b.contains(bVar)) {
            this.f7738b.add(bVar);
        }
        if (j5 > 0) {
            this.f7737a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j5));
        }
    }

    void c(long j5) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i5 = 0; i5 < this.f7738b.size(); i5++) {
            b bVar = this.f7738b.get(i5);
            if (bVar != null && g(bVar, uptimeMillis)) {
                bVar.a(j5);
            }
        }
        b();
    }

    c f() {
        if (this.f7740d == null) {
            this.f7740d = new e(this.f7739c);
        }
        return this.f7740d;
    }

    public void h(b bVar) {
        this.f7737a.remove(bVar);
        int indexOf = this.f7738b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f7738b.set(indexOf, null);
            this.f7742f = true;
        }
    }

    public void i(c cVar) {
        this.f7740d = cVar;
    }
}
