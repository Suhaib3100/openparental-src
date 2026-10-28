package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.constraints.c;
import androidx.work.impl.constraints.d;
import androidx.work.impl.j;
import androidx.work.impl.model.r;
import androidx.work.s;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: g, reason: collision with root package name */
    private WorkerParameters f36568g;

    /* renamed from: h, reason: collision with root package name */
    final Object f36569h;

    /* renamed from: i, reason: collision with root package name */
    volatile boolean f36570i;

    /* renamed from: j, reason: collision with root package name */
    androidx.work.impl.utils.futures.c<ListenableWorker.a> f36571j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private ListenableWorker f36572k;

    /* renamed from: m, reason: collision with root package name */
    public static final String f36567m = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";

    /* renamed from: l, reason: collision with root package name */
    private static final String f36566l = s.f("ConstraintTrkngWrkr");

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.C();
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ListenableFuture f36574b;

        b(final ListenableFuture val$innerFuture) {
            this.f36574b = val$innerFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f36569h) {
                try {
                    if (ConstraintTrackingWorker.this.f36570i) {
                        ConstraintTrackingWorker.this.B();
                    } else {
                        ConstraintTrackingWorker.this.f36571j.r(this.f36574b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ConstraintTrackingWorker(@o0 Context appContext, @o0 WorkerParameters workerParams) {
        super(appContext, workerParams);
        this.f36568g = workerParams;
        this.f36569h = new Object();
        this.f36570i = false;
        this.f36571j = androidx.work.impl.utils.futures.c.u();
    }

    void A() {
        this.f36571j.p(new ListenableWorker.a.C0638a());
    }

    void B() {
        this.f36571j.p(new ListenableWorker.a.b());
    }

    void C() {
        String A = g().A("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(A)) {
            s.c().b(f36566l, "No worker to delegate to.", new Throwable[0]);
            A();
            return;
        }
        ListenableWorker b5 = n().b(a(), A, this.f36568g);
        this.f36572k = b5;
        if (b5 == null) {
            s.c().a(f36566l, "No worker to delegate to.", new Throwable[0]);
            A();
            return;
        }
        r k4 = z().k().k(e().toString());
        if (k4 == null) {
            A();
            return;
        }
        d dVar = new d(a(), k(), this);
        dVar.d(Collections.singletonList(k4));
        if (!dVar.c(e().toString())) {
            s.c().a(f36566l, String.format("Constraints not met for delegate %s. Requesting retry.", A), new Throwable[0]);
            B();
            return;
        }
        s.c().a(f36566l, String.format("Constraints met for delegate %s", A), new Throwable[0]);
        try {
            ListenableFuture<ListenableWorker.a> w4 = this.f36572k.w();
            w4.n2(new b(w4), c());
        } catch (Throwable th) {
            s c5 = s.c();
            String str = f36566l;
            c5.a(str, String.format("Delegated worker %s threw exception in startWork.", A), th);
            synchronized (this.f36569h) {
                try {
                    if (this.f36570i) {
                        s.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        B();
                    } else {
                        A();
                    }
                } finally {
                }
            }
        }
    }

    @Override // androidx.work.impl.constraints.c
    public void b(@o0 List<String> workSpecIds) {
        s.c().a(f36566l, String.format("Constraints changed for %s", workSpecIds), new Throwable[0]);
        synchronized (this.f36569h) {
            this.f36570i = true;
        }
    }

    @Override // androidx.work.impl.constraints.c
    public void f(@o0 List<String> workSpecIds) {
    }

    @Override // androidx.work.ListenableWorker
    @c1({c1.a.LIBRARY_GROUP})
    @o0
    @m1
    public androidx.work.impl.utils.taskexecutor.a k() {
        return j.H(a()).O();
    }

    @Override // androidx.work.ListenableWorker
    public boolean o() {
        ListenableWorker listenableWorker = this.f36572k;
        return listenableWorker != null && listenableWorker.o();
    }

    @Override // androidx.work.ListenableWorker
    public void r() {
        ListenableWorker listenableWorker = this.f36572k;
        if (listenableWorker == null || listenableWorker.p()) {
            return;
        }
        this.f36572k.x();
    }

    @Override // androidx.work.ListenableWorker
    @o0
    public ListenableFuture<ListenableWorker.a> w() {
        c().execute(new a());
        return this.f36571j;
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP})
    @m1
    public ListenableWorker y() {
        return this.f36572k;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    @m1
    public WorkDatabase z() {
        return j.H(a()).M();
    }
}
