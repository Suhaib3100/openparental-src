package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.a0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: AsyncTaskLoader.java */
/* loaded from: classes3.dex */
public abstract class a<D> extends c<D> {

    /* renamed from: p, reason: collision with root package name */
    static final String f8720p = "AsyncTaskLoader";

    /* renamed from: q, reason: collision with root package name */
    static final boolean f8721q = false;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f8722j;

    /* renamed from: k, reason: collision with root package name */
    volatile a<D>.RunnableC0102a f8723k;

    /* renamed from: l, reason: collision with root package name */
    volatile a<D>.RunnableC0102a f8724l;

    /* renamed from: m, reason: collision with root package name */
    long f8725m;

    /* renamed from: n, reason: collision with root package name */
    long f8726n;

    /* renamed from: o, reason: collision with root package name */
    Handler f8727o;

    /* compiled from: AsyncTaskLoader.java */
    /* renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    final class RunnableC0102a extends d<Void, Void, D> implements Runnable {
        private final CountDownLatch E = new CountDownLatch(1);
        boolean F;

        RunnableC0102a() {
        }

        @Override // androidx.loader.content.d
        protected void m(D d6) {
            try {
                a.this.E(this, d6);
            } finally {
                this.E.countDown();
            }
        }

        @Override // androidx.loader.content.d
        protected void n(D d6) {
            try {
                a.this.F(this, d6);
            } finally {
                this.E.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.F = false;
            a.this.G();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.loader.content.d
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.K();
            } catch (OperationCanceledException e6) {
                if (k()) {
                    return null;
                }
                throw e6;
            }
        }

        public void v() {
            try {
                this.E.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public a(@o0 Context context) {
        this(context, d.f8752z);
    }

    public void D() {
    }

    void E(a<D>.RunnableC0102a runnableC0102a, D d6) {
        J(d6);
        if (this.f8724l == runnableC0102a) {
            x();
            this.f8726n = SystemClock.uptimeMillis();
            this.f8724l = null;
            e();
            G();
        }
    }

    void F(a<D>.RunnableC0102a runnableC0102a, D d6) {
        if (this.f8723k != runnableC0102a) {
            E(runnableC0102a, d6);
            return;
        }
        if (k()) {
            J(d6);
            return;
        }
        c();
        this.f8726n = SystemClock.uptimeMillis();
        this.f8723k = null;
        f(d6);
    }

    void G() {
        if (this.f8724l != null || this.f8723k == null) {
            return;
        }
        if (this.f8723k.F) {
            this.f8723k.F = false;
            this.f8727o.removeCallbacks(this.f8723k);
        }
        if (this.f8725m <= 0 || SystemClock.uptimeMillis() >= this.f8726n + this.f8725m) {
            this.f8723k.e(this.f8722j, null);
        } else {
            this.f8723k.F = true;
            this.f8727o.postAtTime(this.f8723k, this.f8726n + this.f8725m);
        }
    }

    public boolean H() {
        return this.f8724l != null;
    }

    @q0
    public abstract D I();

    public void J(@q0 D d6) {
    }

    @q0
    protected D K() {
        return I();
    }

    public void L(long j5) {
        this.f8725m = j5;
        if (j5 != 0) {
            this.f8727o = new Handler();
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void M() {
        a<D>.RunnableC0102a runnableC0102a = this.f8723k;
        if (runnableC0102a != null) {
            runnableC0102a.v();
        }
    }

    @Override // androidx.loader.content.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f8723k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f8723k);
            printWriter.print(" waiting=");
            printWriter.println(this.f8723k.F);
        }
        if (this.f8724l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f8724l);
            printWriter.print(" waiting=");
            printWriter.println(this.f8724l.F);
        }
        if (this.f8725m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            a0.c(this.f8725m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            a0.b(this.f8726n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // androidx.loader.content.c
    protected boolean o() {
        if (this.f8723k == null) {
            return false;
        }
        if (!this.f8740e) {
            this.f8743h = true;
        }
        if (this.f8724l != null) {
            if (this.f8723k.F) {
                this.f8723k.F = false;
                this.f8727o.removeCallbacks(this.f8723k);
            }
            this.f8723k = null;
            return false;
        }
        if (this.f8723k.F) {
            this.f8723k.F = false;
            this.f8727o.removeCallbacks(this.f8723k);
            this.f8723k = null;
            return false;
        }
        boolean a6 = this.f8723k.a(false);
        if (a6) {
            this.f8724l = this.f8723k;
            D();
        }
        this.f8723k = null;
        return a6;
    }

    @Override // androidx.loader.content.c
    protected void q() {
        b();
        this.f8723k = new RunnableC0102a();
        G();
    }

    private a(@o0 Context context, @o0 Executor executor) {
        super(context);
        this.f8726n = -10000L;
        this.f8722j = executor;
    }
}
