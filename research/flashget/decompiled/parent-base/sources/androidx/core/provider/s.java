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
/* loaded from: classes3.dex */
public class s {

    /* renamed from: i, reason: collision with root package name */
    private static final int f26640i = 1;

    /* renamed from: j, reason: collision with root package name */
    private static final int f26641j = 0;

    /* renamed from: b, reason: collision with root package name */
    @b0("mLock")
    private HandlerThread f26643b;

    /* renamed from: c, reason: collision with root package name */
    @b0("mLock")
    private Handler f26644c;

    /* renamed from: f, reason: collision with root package name */
    private final int f26647f;

    /* renamed from: g, reason: collision with root package name */
    private final int f26648g;

    /* renamed from: h, reason: collision with root package name */
    private final String f26649h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f26642a = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Handler.Callback f26646e = new a();

    /* renamed from: d, reason: collision with root package name */
    @b0("mLock")
    private int f26645d = 0;

    /* compiled from: SelfDestructiveThread.java */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 0) {
                s.this.c();
                return true;
            }
            if (i4 != 1) {
                return true;
            }
            s.this.d((Runnable) message.obj);
            return true;
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f26651b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Handler f26652c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f26653d;

        /* compiled from: SelfDestructiveThread.java */
        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f26655b;

            a(Object obj) {
                this.f26655b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f26653d.a(this.f26655b);
            }
        }

        b(Callable callable, Handler handler, d dVar) {
            this.f26651b = callable;
            this.f26652c = handler;
            this.f26653d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f26651b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f26652c.post(new a(obj));
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f26657b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callable f26658c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReentrantLock f26659d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f26660e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Condition f26661f;

        c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f26657b = atomicReference;
            this.f26658c = callable;
            this.f26659d = reentrantLock;
            this.f26660e = atomicBoolean;
            this.f26661f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f26657b.set(this.f26658c.call());
            } catch (Exception unused) {
            }
            this.f26659d.lock();
            try {
                this.f26660e.set(false);
                this.f26661f.signal();
            } finally {
                this.f26659d.unlock();
            }
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    public interface d<T> {
        void a(T t4);
    }

    public s(String str, int i4, int i5) {
        this.f26649h = str;
        this.f26648g = i4;
        this.f26647f = i5;
    }

    private void e(Runnable runnable) {
        synchronized (this.f26642a) {
            try {
                if (this.f26643b == null) {
                    HandlerThread handlerThread = new HandlerThread(this.f26649h, this.f26648g);
                    this.f26643b = handlerThread;
                    handlerThread.start();
                    this.f26644c = new Handler(this.f26643b.getLooper(), this.f26646e);
                    this.f26645d++;
                }
                this.f26644c.removeMessages(0);
                Handler handler = this.f26644c;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @m1
    public int a() {
        int i4;
        synchronized (this.f26642a) {
            i4 = this.f26645d;
        }
        return i4;
    }

    @m1
    public boolean b() {
        boolean z4;
        synchronized (this.f26642a) {
            z4 = this.f26643b != null;
        }
        return z4;
    }

    void c() {
        synchronized (this.f26642a) {
            try {
                if (this.f26644c.hasMessages(1)) {
                    return;
                }
                this.f26643b.quit();
                this.f26643b = null;
                this.f26644c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(Runnable runnable) {
        runnable.run();
        synchronized (this.f26642a) {
            this.f26644c.removeMessages(0);
            Handler handler = this.f26644c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f26647f);
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, androidx.core.provider.b.a(), dVar));
    }

    public <T> T g(Callable<T> callable, int i4) throws InterruptedException {
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
            long nanos = TimeUnit.MILLISECONDS.toNanos(i4);
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
