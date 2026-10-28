package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.x0;
import androidx.collection.a3;
import java.util.ArrayList;

/* compiled from: AnimationHandler.java */
/* loaded from: classes3.dex */
class a {

    /* renamed from: g, reason: collision with root package name */
    private static final long f29187g = 10;

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<a> f29188h = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    private c f29192d;

    /* renamed from: a, reason: collision with root package name */
    private final a3<b, Long> f29189a = new a3<>();

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f29190b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final C0474a f29191c = new C0474a();

    /* renamed from: e, reason: collision with root package name */
    long f29193e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29194f = false;

    /* compiled from: AnimationHandler.java */
    /* renamed from: androidx.dynamicanimation.animation.a$a, reason: collision with other inner class name */
    class C0474a {
        C0474a() {
        }

        void a() {
            a.this.f29193e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f29193e);
            if (a.this.f29190b.size() > 0) {
                a.this.f().a();
            }
        }
    }

    /* compiled from: AnimationHandler.java */
    interface b {
        boolean a(long j4);
    }

    /* compiled from: AnimationHandler.java */
    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final C0474a f29196a;

        c(C0474a c0474a) {
            this.f29196a = c0474a;
        }

        abstract void a();
    }

    /* compiled from: AnimationHandler.java */
    private static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f29197b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f29198c;

        /* renamed from: d, reason: collision with root package name */
        long f29199d;

        /* compiled from: AnimationHandler.java */
        /* renamed from: androidx.dynamicanimation.animation.a$d$a, reason: collision with other inner class name */
        class RunnableC0475a implements Runnable {
            RunnableC0475a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f29199d = SystemClock.uptimeMillis();
                d.this.f29196a.a();
            }
        }

        d(C0474a c0474a) {
            super(c0474a);
            this.f29199d = -1L;
            this.f29197b = new RunnableC0475a();
            this.f29198c = new Handler(Looper.myLooper());
        }

        @Override // androidx.dynamicanimation.animation.a.c
        void a() {
            this.f29198c.postDelayed(this.f29197b, Math.max(a.f29187g - (SystemClock.uptimeMillis() - this.f29199d), 0L));
        }
    }

    /* compiled from: AnimationHandler.java */
    @x0(16)
    private static class e extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Choreographer f29201b;

        /* renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f29202c;

        /* compiled from: AnimationHandler.java */
        /* renamed from: androidx.dynamicanimation.animation.a$e$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0476a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0476a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j4) {
                e.this.f29196a.a();
            }
        }

        e(C0474a c0474a) {
            super(c0474a);
            this.f29201b = Choreographer.getInstance();
            this.f29202c = new ChoreographerFrameCallbackC0476a();
        }

        @Override // androidx.dynamicanimation.animation.a.c
        void a() {
            this.f29201b.postFrameCallback(this.f29202c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f29194f) {
            for (int size = this.f29190b.size() - 1; size >= 0; size--) {
                if (this.f29190b.get(size) == null) {
                    this.f29190b.remove(size);
                }
            }
            this.f29194f = false;
        }
    }

    public static long d() {
        ThreadLocal<a> threadLocal = f29188h;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f29193e;
    }

    public static a e() {
        ThreadLocal<a> threadLocal = f29188h;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean g(b bVar, long j4) {
        Long l4 = this.f29189a.get(bVar);
        if (l4 == null) {
            return true;
        }
        if (l4.longValue() >= j4) {
            return false;
        }
        this.f29189a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j4) {
        if (this.f29190b.size() == 0) {
            f().a();
        }
        if (!this.f29190b.contains(bVar)) {
            this.f29190b.add(bVar);
        }
        if (j4 > 0) {
            this.f29189a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j4));
        }
    }

    void c(long j4) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i4 = 0; i4 < this.f29190b.size(); i4++) {
            b bVar = this.f29190b.get(i4);
            if (bVar != null && g(bVar, uptimeMillis)) {
                bVar.a(j4);
            }
        }
        b();
    }

    c f() {
        if (this.f29192d == null) {
            this.f29192d = new e(this.f29191c);
        }
        return this.f29192d;
    }

    public void h(b bVar) {
        this.f29189a.remove(bVar);
        int indexOf = this.f29190b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f29190b.set(indexOf, null);
            this.f29194f = true;
        }
    }

    public void i(c cVar) {
        this.f29192d = cVar;
    }
}
