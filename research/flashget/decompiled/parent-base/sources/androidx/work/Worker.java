package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: g, reason: collision with root package name */
    androidx.work.impl.utils.futures.c<ListenableWorker.a> f35902g;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f35902g.p(Worker.this.y());
            } catch (Throwable th) {
                Worker.this.f35902g.q(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@o0 Context context, @o0 WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @Override // androidx.work.ListenableWorker
    @o0
    public final ListenableFuture<ListenableWorker.a> w() {
        this.f35902g = androidx.work.impl.utils.futures.c.u();
        c().execute(new a());
        return this.f35902g;
    }

    @n1
    @o0
    public abstract ListenableWorker.a y();
}
