package android.view;

import android.os.Handler;
import android.view.t;
import androidx.annotation.o0;

/* compiled from: ServiceLifecycleDispatcher.java */
/* loaded from: classes.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    private final c0 f8690a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f8691b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    private a f8692c;

    /* compiled from: ServiceLifecycleDispatcher.java */
    static class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final c0 f8693o;

        /* renamed from: p, reason: collision with root package name */
        final t.b f8694p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f8695q = false;

        a(@o0 c0 c0Var, t.b bVar) {
            this.f8693o = c0Var;
            this.f8694p = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8695q) {
                return;
            }
            this.f8693o.j(this.f8694p);
            this.f8695q = true;
        }
    }

    public y0(@o0 a0 a0Var) {
        this.f8690a = new c0(a0Var);
    }

    private void f(t.b bVar) {
        a aVar = this.f8692c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f8690a, bVar);
        this.f8692c = aVar2;
        this.f8691b.postAtFrontOfQueue(aVar2);
    }

    @o0
    public t a() {
        return this.f8690a;
    }

    public void b() {
        f(t.b.ON_START);
    }

    public void c() {
        f(t.b.ON_CREATE);
    }

    public void d() {
        f(t.b.ON_STOP);
        f(t.b.ON_DESTROY);
    }

    public void e() {
        f(t.b.ON_START);
    }
}
