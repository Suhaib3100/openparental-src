package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.b0;
import androidx.work.f0;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: WorkProgressUpdater.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class v implements b0 {

    /* renamed from: c, reason: collision with root package name */
    static final String f36548c = androidx.work.s.f("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    final WorkDatabase f36549a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.work.impl.utils.taskexecutor.a f36550b;

    /* compiled from: WorkProgressUpdater.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UUID f36551b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.f f36552c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f36553d;

        a(final UUID val$id, final androidx.work.f val$data, final androidx.work.impl.utils.futures.c val$future) {
            this.f36551b = val$id;
            this.f36552c = val$data;
            this.f36553d = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.work.impl.model.r k4;
            String uuid = this.f36551b.toString();
            androidx.work.s c5 = androidx.work.s.c();
            String str = v.f36548c;
            c5.a(str, String.format("Updating progress for %s (%s)", this.f36551b, this.f36552c), new Throwable[0]);
            v.this.f36549a.beginTransaction();
            try {
                k4 = v.this.f36549a.k().k(uuid);
            } finally {
                try {
                } finally {
                }
            }
            if (k4 == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (k4.f36347b == f0.a.RUNNING) {
                v.this.f36549a.j().d(new androidx.work.impl.model.o(uuid, this.f36552c));
            } else {
                androidx.work.s.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
            }
            this.f36553d.p(null);
            v.this.f36549a.setTransactionSuccessful();
        }
    }

    public v(@o0 WorkDatabase workDatabase, @o0 androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        this.f36549a = workDatabase;
        this.f36550b = taskExecutor;
    }

    @Override // androidx.work.b0
    @o0
    public ListenableFuture<Void> a(@o0 final Context context, @o0 final UUID id2, @o0 final androidx.work.f data) {
        androidx.work.impl.utils.futures.c u4 = androidx.work.impl.utils.futures.c.u();
        this.f36550b.b(new a(id2, data, u4));
        return u4;
    }
}
