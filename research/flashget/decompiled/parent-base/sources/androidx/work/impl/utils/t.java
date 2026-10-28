package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: WorkForegroundRunnable.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class t implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    static final String f36524h = androidx.work.s.f("WorkForegroundRunnable");

    /* renamed from: b, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c<Void> f36525b = androidx.work.impl.utils.futures.c.u();

    /* renamed from: c, reason: collision with root package name */
    final Context f36526c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.work.impl.model.r f36527d;

    /* renamed from: e, reason: collision with root package name */
    final ListenableWorker f36528e;

    /* renamed from: f, reason: collision with root package name */
    final androidx.work.m f36529f;

    /* renamed from: g, reason: collision with root package name */
    final androidx.work.impl.utils.taskexecutor.a f36530g;

    /* compiled from: WorkForegroundRunnable.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f36531b;

        a(final androidx.work.impl.utils.futures.c val$foregroundFuture) {
            this.f36531b = val$foregroundFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36531b.r(t.this.f36528e.d());
        }
    }

    /* compiled from: WorkForegroundRunnable.java */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f36533b;

        b(final androidx.work.impl.utils.futures.c val$foregroundFuture) {
            this.f36533b = val$foregroundFuture;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.work.l lVar = (androidx.work.l) this.f36533b.get();
                if (lVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", t.this.f36527d.f36348c));
                }
                androidx.work.s.c().a(t.f36524h, String.format("Updating notification for %s", t.this.f36527d.f36348c), new Throwable[0]);
                t.this.f36528e.u(true);
                t tVar = t.this;
                tVar.f36525b.r(tVar.f36529f.a(tVar.f36526c, tVar.f36528e.e(), lVar));
            } catch (Throwable th) {
                t.this.f36525b.q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public t(@o0 Context context, @o0 androidx.work.impl.model.r workSpec, @o0 ListenableWorker worker, @o0 androidx.work.m foregroundUpdater, @o0 androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        this.f36526c = context;
        this.f36527d = workSpec;
        this.f36528e = worker;
        this.f36529f = foregroundUpdater;
        this.f36530g = taskExecutor;
    }

    @o0
    public ListenableFuture<Void> a() {
        return this.f36525b;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f36527d.f36362q || androidx.core.os.b.i()) {
            this.f36525b.p(null);
            return;
        }
        androidx.work.impl.utils.futures.c u4 = androidx.work.impl.utils.futures.c.u();
        this.f36530g.a().execute(new a(u4));
        u4.n2(new b(u4), this.f36530g.a());
    }
}
