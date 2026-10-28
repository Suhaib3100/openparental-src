package androidx.work.impl.utils;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.f0;
import androidx.work.impl.WorkDatabase;

/* compiled from: StopWorkRunnable.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class q implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final String f36518e = androidx.work.s.f("StopWorkRunnable");

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.j f36519b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36520c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f36521d;

    public q(@o0 androidx.work.impl.j workManagerImpl, @o0 String workSpecId, boolean stopInForeground) {
        this.f36519b = workManagerImpl;
        this.f36520c = workSpecId;
        this.f36521d = stopInForeground;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean p4;
        WorkDatabase M = this.f36519b.M();
        androidx.work.impl.d J = this.f36519b.J();
        androidx.work.impl.model.s k4 = M.k();
        M.beginTransaction();
        try {
            boolean i4 = J.i(this.f36520c);
            if (this.f36521d) {
                p4 = this.f36519b.J().o(this.f36520c);
            } else {
                if (!i4 && k4.j(this.f36520c) == f0.a.RUNNING) {
                    k4.b(f0.a.ENQUEUED, this.f36520c);
                }
                p4 = this.f36519b.J().p(this.f36520c);
            }
            androidx.work.s.c().a(f36518e, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f36520c, Boolean.valueOf(p4)), new Throwable[0]);
            M.setTransactionSuccessful();
            M.endTransaction();
        } catch (Throwable th) {
            M.endTransaction();
            throw th;
        }
    }
}
