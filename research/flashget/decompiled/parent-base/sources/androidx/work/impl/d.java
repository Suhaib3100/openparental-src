package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.WorkerParameters;
import androidx.work.impl.l;
import androidx.work.s;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: Processor.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class d implements b, androidx.work.impl.foreground.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f36155c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.work.b f36156d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.work.impl.utils.taskexecutor.a f36157e;

    /* renamed from: f, reason: collision with root package name */
    private WorkDatabase f36158f;

    /* renamed from: i, reason: collision with root package name */
    private List<e> f36161i;

    /* renamed from: n, reason: collision with root package name */
    private static final String f36153n = "ProcessorForegroundLck";

    /* renamed from: m, reason: collision with root package name */
    private static final String f36152m = s.f("Processor");

    /* renamed from: h, reason: collision with root package name */
    private Map<String, l> f36160h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private Map<String, l> f36159g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private Set<String> f36162j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private final List<b> f36163k = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @q0
    private PowerManager.WakeLock f36154b = null;

    /* renamed from: l, reason: collision with root package name */
    private final Object f36164l = new Object();

    /* compiled from: Processor.java */
    private static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @o0
        private b f36165b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        private String f36166c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        private ListenableFuture<Boolean> f36167d;

        a(@o0 b executionListener, @o0 String workSpecId, @o0 ListenableFuture<Boolean> future) {
            this.f36165b = executionListener;
            this.f36166c = workSpecId;
            this.f36167d = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            try {
                z4 = this.f36167d.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z4 = true;
            }
            this.f36165b.e(this.f36166c, z4);
        }
    }

    public d(@o0 Context appContext, @o0 androidx.work.b configuration, @o0 androidx.work.impl.utils.taskexecutor.a workTaskExecutor, @o0 WorkDatabase workDatabase, @o0 List<e> schedulers) {
        this.f36155c = appContext;
        this.f36156d = configuration;
        this.f36157e = workTaskExecutor;
        this.f36158f = workDatabase;
        this.f36161i = schedulers;
    }

    private static boolean f(@o0 String id2, @q0 l wrapper) {
        if (wrapper == null) {
            s.c().a(f36152m, String.format("WorkerWrapper could not be found for %s", id2), new Throwable[0]);
            return false;
        }
        wrapper.d();
        s.c().a(f36152m, String.format("WorkerWrapper interrupted for %s", id2), new Throwable[0]);
        return true;
    }

    private void n() {
        synchronized (this.f36164l) {
            try {
                if (this.f36159g.isEmpty()) {
                    try {
                        this.f36155c.startService(androidx.work.impl.foreground.b.g(this.f36155c));
                    } catch (Throwable th) {
                        s.c().b(f36152m, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f36154b;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f36154b = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void a(@o0 String workSpecId) {
        synchronized (this.f36164l) {
            this.f36159g.remove(workSpecId);
            n();
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void b(@o0 String workSpecId, @o0 androidx.work.l foregroundInfo) {
        synchronized (this.f36164l) {
            try {
                s.c().d(f36152m, String.format("Moving WorkSpec (%s) to the foreground", workSpecId), new Throwable[0]);
                l remove = this.f36160h.remove(workSpecId);
                if (remove != null) {
                    if (this.f36154b == null) {
                        PowerManager.WakeLock b5 = androidx.work.impl.utils.s.b(this.f36155c, "ProcessorForegroundLck");
                        this.f36154b = b5;
                        b5.acquire();
                    }
                    this.f36159g.put(workSpecId, remove);
                    androidx.core.content.d.startForegroundService(this.f36155c, androidx.work.impl.foreground.b.d(this.f36155c, workSpecId, foregroundInfo));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(@o0 b executionListener) {
        synchronized (this.f36164l) {
            this.f36163k.add(executionListener);
        }
    }

    public boolean d() {
        boolean z4;
        synchronized (this.f36164l) {
            try {
                z4 = (this.f36160h.isEmpty() && this.f36159g.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z4;
    }

    @Override // androidx.work.impl.b
    public void e(@o0 final String workSpecId, boolean needsReschedule) {
        synchronized (this.f36164l) {
            try {
                this.f36160h.remove(workSpecId);
                s.c().a(f36152m, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), workSpecId, Boolean.valueOf(needsReschedule)), new Throwable[0]);
                Iterator<b> it = this.f36163k.iterator();
                while (it.hasNext()) {
                    it.next().e(workSpecId, needsReschedule);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean g(@o0 String id2) {
        boolean contains;
        synchronized (this.f36164l) {
            contains = this.f36162j.contains(id2);
        }
        return contains;
    }

    public boolean h(@o0 String workSpecId) {
        boolean z4;
        synchronized (this.f36164l) {
            try {
                z4 = this.f36160h.containsKey(workSpecId) || this.f36159g.containsKey(workSpecId);
            } finally {
            }
        }
        return z4;
    }

    public boolean i(@o0 String workSpecId) {
        boolean containsKey;
        synchronized (this.f36164l) {
            containsKey = this.f36159g.containsKey(workSpecId);
        }
        return containsKey;
    }

    public void j(@o0 b executionListener) {
        synchronized (this.f36164l) {
            this.f36163k.remove(executionListener);
        }
    }

    public boolean k(@o0 String id2) {
        return l(id2, null);
    }

    public boolean l(@o0 String id2, @q0 WorkerParameters.a runtimeExtras) {
        synchronized (this.f36164l) {
            try {
                if (h(id2)) {
                    s.c().a(f36152m, String.format("Work %s is already enqueued for processing", id2), new Throwable[0]);
                    return false;
                }
                l.c cVar = new l.c(this.f36155c, this.f36156d, this.f36157e, this, this.f36158f, id2);
                cVar.f36305h = this.f36161i;
                if (runtimeExtras != null) {
                    cVar.f36306i = runtimeExtras;
                }
                l lVar = new l(cVar);
                androidx.work.impl.utils.futures.c<Boolean> cVar2 = lVar.f36289r;
                cVar2.n2(new a(this, id2, cVar2), this.f36157e.a());
                this.f36160h.put(id2, lVar);
                this.f36157e.d().execute(lVar);
                s.c().a(f36152m, String.format("%s: processing %s", getClass().getSimpleName(), id2), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean m(@o0 String id2) {
        boolean f4;
        synchronized (this.f36164l) {
            try {
                s.c().a(f36152m, String.format("Processor cancelling %s", id2), new Throwable[0]);
                this.f36162j.add(id2);
                l remove = this.f36159g.remove(id2);
                boolean z4 = remove != null;
                if (remove == null) {
                    remove = this.f36160h.remove(id2);
                }
                f4 = f(id2, remove);
                if (z4) {
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4;
    }

    public boolean o(@o0 String id2) {
        boolean f4;
        synchronized (this.f36164l) {
            s.c().a(f36152m, String.format("Processor stopping foreground work %s", id2), new Throwable[0]);
            f4 = f(id2, this.f36159g.remove(id2));
        }
        return f4;
    }

    public boolean p(@o0 String id2) {
        boolean f4;
        synchronized (this.f36164l) {
            s.c().a(f36152m, String.format("Processor stopping background work %s", id2), new Throwable[0]);
            f4 = f(id2, this.f36160h.remove(id2));
        }
        return f4;
    }
}
