package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.f0;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: WorkForegroundUpdater.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class u implements androidx.work.m {

    /* renamed from: d, reason: collision with root package name */
    private static final String f36539d = androidx.work.s.f("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.utils.taskexecutor.a f36540a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.work.impl.foreground.a f36541b;

    /* renamed from: c, reason: collision with root package name */
    final androidx.work.impl.model.s f36542c;

    /* compiled from: WorkForegroundUpdater.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f36543b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f36544c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.work.l f36545d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f36546e;

        a(final androidx.work.impl.utils.futures.c val$future, final UUID val$id, final androidx.work.l val$foregroundInfo, final Context val$context) {
            this.f36543b = val$future;
            this.f36544c = val$id;
            this.f36545d = val$foregroundInfo;
            this.f36546e = val$context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f36543b.isCancelled()) {
                    String uuid = this.f36544c.toString();
                    f0.a j4 = u.this.f36542c.j(uuid);
                    if (j4 == null || j4.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    u.this.f36541b.b(uuid, this.f36545d);
                    this.f36546e.startService(androidx.work.impl.foreground.b.c(this.f36546e, uuid, this.f36545d));
                }
                this.f36543b.p(null);
            } catch (Throwable th) {
                this.f36543b.q(th);
            }
        }
    }

    public u(@o0 WorkDatabase workDatabase, @o0 androidx.work.impl.foreground.a foregroundProcessor, @o0 androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        this.f36541b = foregroundProcessor;
        this.f36540a = taskExecutor;
        this.f36542c = workDatabase.k();
    }

    @Override // androidx.work.m
    @o0
    public ListenableFuture<Void> a(@o0 final Context context, @o0 final UUID id2, @o0 final androidx.work.l foregroundInfo) {
        androidx.work.impl.utils.futures.c u4 = androidx.work.impl.utils.futures.c.u();
        this.f36540a.b(new a(u4, id2, foregroundInfo, context));
        return u4;
    }
}
