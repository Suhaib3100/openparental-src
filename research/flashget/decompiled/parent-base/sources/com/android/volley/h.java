package com.android.volley;

import android.os.Handler;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executor;

/* compiled from: ExecutorDelivery.java */
/* loaded from: classes3.dex */
public class h implements r {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f40886a;

    /* compiled from: ExecutorDelivery.java */
    class a implements Executor {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f40887b;

        a(Handler handler) {
            this.f40887b = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f40887b.post(runnable);
        }
    }

    /* compiled from: ExecutorDelivery.java */
    private static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final n f40889b;

        /* renamed from: c, reason: collision with root package name */
        private final q f40890c;

        /* renamed from: d, reason: collision with root package name */
        private final Runnable f40891d;

        public b(n nVar, q qVar, Runnable runnable) {
            this.f40889b = nVar;
            this.f40890c = qVar;
            this.f40891d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40889b.isCanceled()) {
                this.f40889b.finish(ProtectedSandApp.s("څ"));
                return;
            }
            if (this.f40890c.b()) {
                this.f40889b.deliverResponse(this.f40890c.f40938a);
            } else {
                this.f40889b.deliverError(this.f40890c.f40940c);
            }
            if (this.f40890c.f40941d) {
                this.f40889b.addMarker(ProtectedSandApp.s("چ"));
            } else {
                this.f40889b.finish(ProtectedSandApp.s("ڇ"));
            }
            Runnable runnable = this.f40891d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public h(Handler handler) {
        this.f40886a = new a(handler);
    }

    @Override // com.android.volley.r
    public void a(n<?> nVar, q<?> qVar) {
        b(nVar, qVar, null);
    }

    @Override // com.android.volley.r
    public void b(n<?> nVar, q<?> qVar, Runnable runnable) {
        nVar.markDelivered();
        nVar.addMarker(ProtectedSandApp.s("ڈ"));
        this.f40886a.execute(new b(nVar, qVar, runnable));
    }

    @Override // com.android.volley.r
    public void c(n<?> nVar, VolleyError volleyError) {
        nVar.addMarker(ProtectedSandApp.s("ډ"));
        this.f40886a.execute(new b(nVar, q.a(volleyError), null));
    }

    public h(Executor executor) {
        this.f40886a = executor;
    }
}
