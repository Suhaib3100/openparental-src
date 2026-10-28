package bolts;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: CancellationTokenSource.java */
/* loaded from: classes3.dex */
public class e implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private final Object f36869b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List<d> f36870c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f36871d = b.d();

    /* renamed from: e, reason: collision with root package name */
    private ScheduledFuture<?> f36872e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f36873f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36874g;

    /* compiled from: CancellationTokenSource.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e.this.f36869b) {
                e.this.f36872e = null;
            }
            e.this.c();
        }
    }

    private void e(long j4, TimeUnit timeUnit) {
        if (j4 < -1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ü"));
        }
        if (j4 == 0) {
            c();
            return;
        }
        synchronized (this.f36869b) {
            try {
                if (this.f36873f) {
                    return;
                }
                f();
                if (j4 != -1) {
                    this.f36872e = this.f36871d.schedule(new a(), j4, timeUnit);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void f() {
        ScheduledFuture<?> scheduledFuture = this.f36872e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f36872e = null;
        }
    }

    private void i(List<d> list) {
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void m() {
        if (this.f36874g) {
            throw new IllegalStateException(ProtectedSandApp.s("Ý"));
        }
    }

    public void c() {
        synchronized (this.f36869b) {
            try {
                m();
                if (this.f36873f) {
                    return;
                }
                f();
                this.f36873f = true;
                i(new ArrayList(this.f36870c));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f36869b) {
            try {
                if (this.f36874g) {
                    return;
                }
                f();
                Iterator<d> it = this.f36870c.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                this.f36870c.clear();
                this.f36874g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(long j4) {
        e(j4, TimeUnit.MILLISECONDS);
    }

    public c g() {
        c cVar;
        synchronized (this.f36869b) {
            m();
            cVar = new c(this);
        }
        return cVar;
    }

    public boolean h() {
        boolean z4;
        synchronized (this.f36869b) {
            m();
            z4 = this.f36873f;
        }
        return z4;
    }

    d k(Runnable runnable) {
        d dVar;
        synchronized (this.f36869b) {
            try {
                m();
                dVar = new d(this, runnable);
                if (this.f36873f) {
                    dVar.a();
                } else {
                    this.f36870c.add(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    void l() throws CancellationException {
        synchronized (this.f36869b) {
            try {
                m();
                if (this.f36873f) {
                    throw new CancellationException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void n(d dVar) {
        synchronized (this.f36869b) {
            m();
            this.f36870c.remove(dVar);
        }
    }

    public String toString() {
        return String.format(Locale.US, ProtectedSandApp.s("Þ"), getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(h()));
    }
}
