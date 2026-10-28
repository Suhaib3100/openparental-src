package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.work.f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.w;
import java.util.Iterator;
import java.util.List;

/* compiled from: EnqueueRunnable.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    private static final String f36446d = androidx.work.s.f("EnqueueRunnable");

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.g f36447b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.work.impl.c f36448c = new androidx.work.impl.c();

    public b(@o0 androidx.work.impl.g workContinuation) {
        this.f36447b = workContinuation;
    }

    private static boolean b(@o0 androidx.work.impl.g workContinuation) {
        boolean c5 = c(workContinuation.n(), workContinuation.m(), (String[]) androidx.work.impl.g.s(workContinuation).toArray(new String[0]), workContinuation.k(), workContinuation.i());
        workContinuation.r();
        return c5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(androidx.work.impl.j r16, @androidx.annotation.o0 java.util.List<? extends androidx.work.i0> r17, java.lang.String[] r18, java.lang.String r19, androidx.work.k r20) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.b.c(androidx.work.impl.j, java.util.List, java.lang.String[], java.lang.String, androidx.work.k):boolean");
    }

    private static boolean e(@o0 androidx.work.impl.g workContinuation) {
        List<androidx.work.impl.g> l4 = workContinuation.l();
        boolean z4 = false;
        if (l4 != null) {
            boolean z5 = false;
            for (androidx.work.impl.g gVar : l4) {
                if (gVar.q()) {
                    androidx.work.s.c().h(f36446d, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar.j())), new Throwable[0]);
                } else {
                    z5 |= e(gVar);
                }
            }
            z4 = z5;
        }
        return b(workContinuation) | z4;
    }

    private static void g(androidx.work.impl.model.r workSpec) {
        androidx.work.d dVar = workSpec.f36355j;
        String str = workSpec.f36348c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (dVar.f() || dVar.i()) {
            f.a aVar = new f.a();
            aVar.c(workSpec.f36350e).q("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            workSpec.f36348c = ConstraintTrackingWorker.class.getName();
            workSpec.f36350e = aVar.a();
        }
    }

    private static boolean h(@o0 androidx.work.impl.j workManager, @o0 String className) {
        try {
            Class<?> cls = Class.forName(className);
            Iterator<androidx.work.impl.e> it = workManager.L().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    @m1
    public boolean a() {
        WorkDatabase M = this.f36447b.n().M();
        M.beginTransaction();
        try {
            boolean e4 = e(this.f36447b);
            M.setTransactionSuccessful();
            return e4;
        } finally {
            M.endTransaction();
        }
    }

    @o0
    public androidx.work.w d() {
        return this.f36448c;
    }

    @m1
    public void f() {
        androidx.work.impl.j n4 = this.f36447b.n();
        androidx.work.impl.f.b(n4.F(), n4.M(), n4.L());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f36447b.o()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f36447b));
            }
            if (a()) {
                h.c(this.f36447b.n().E(), RescheduleReceiver.class, true);
                f();
            }
            this.f36448c.b(androidx.work.w.f36614a);
        } catch (Throwable th) {
            this.f36448c.b(new w.b.a(th));
        }
    }
}
