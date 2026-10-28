package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.b0;
import androidx.annotation.c1;
import androidx.annotation.m1;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: SelfDestructiveThread.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes.dex */
public class j {

    /* renamed from: i, reason: collision with root package name */
    private static final int f5077i = 1;

    /* renamed from: j, reason: collision with root package name */
    private static final int f5078j = 0;

    /* renamed from: b, reason: collision with root package name */
    @b0("mLock")
    private HandlerThread f5080b;

    /* renamed from: c, reason: collision with root package name */
    @b0("mLock")
    private Handler f5081c;

    /* renamed from: f, reason: collision with root package name */
    private final int f5084f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5085g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5086h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f5079a = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Handler.Callback f5083e = new a();

    /* renamed from: d, reason: collision with root package name */
    @b0("mLock")
    private int f5082d = 0;

    /* compiled from: SelfDestructiveThread.java */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i5 = message.what;
            if (i5 == 0) {
                j.this.c();
                return true;
            }
            if (i5 != 1) {
                return true;
            }
            j.this.d((Runnable) message.obj);
            return true;
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Callable f5088o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Handler f5089p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ d f5090q;

        /* compiled from: SelfDestructiveThread.java */
        class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Object f5092o;

            a(Object obj) {
                this.f5092o = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f5090q.a(this.f5092o);
            }
        }

        b(Callable callable, Handler handler, d dVar) {
            this.f5088o = callable;
            this.f5089p = handler;
            this.f5090q = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f5088o.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f5089p.post(new a(obj));
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ AtomicReference f5094o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Callable f5095p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ReentrantLock f5096q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f5097r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Condition f5098s;

        c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f5094o = atomicReference;
            this.f5095p = callable;
            this.f5096q = reentrantLock;
            this.f5097r = atomicBoolean;
            this.f5098s = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5094o.set(this.f5095p.call());
            } catch (Exception unused) {
            }
            this.f5096q.lock();
            try {
                this.f5097r.set(false);
                this.f5098s.signal();
            } finally {
                this.f5096q.unlock();
            }
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    public interface d<T> {
        void a(T t5);
    }

    public j(String str, int i5, int i6) {
        this.f5086h = str;
        this.f5085g = i5;
        this.f5084f = i6;
    }

    private void e(Runnable runnable) {
        synchronized (this.f5079a) {
            if (this.f5080b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f5086h, this.f5085g);
                this.f5080b = handlerThread;
                handlerThread.start();
                this.f5081c = new Handler(this.f5080b.getLooper(), this.f5083e);
                this.f5082d++;
            }
            this.f5081c.removeMessages(0);
            Handler handler = this.f5081c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    @m1
    public int a() {
        int i5;
        synchronized (this.f5079a) {
            i5 = this.f5082d;
        }
        return i5;
    }

    @m1
    public boolean b() {
        boolean z5;
        synchronized (this.f5079a) {
            z5 = this.f5080b != null;
        }
        return z5;
    }

    void c() {
        synchronized (this.f5079a) {
            if (this.f5081c.hasMessages(1)) {
                return;
            }
            this.f5080b.quit();
            this.f5080b = null;
            this.f5081c = null;
        }
    }

    void d(Runnable runnable) {
        runnable.run();
        synchronized (this.f5079a) {
            this.f5081c.removeMessages(0);
            Handler handler = this.f5081c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f5084f);
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, androidx.core.provider.b.a(), dVar));
    }

    public <T> T g(Callable<T> callable, int i5) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        e(new c(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i5);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
