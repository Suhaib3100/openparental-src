package android.view;

import android.annotation.SuppressLint;
import android.view.t;
import androidx.annotation.l0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.arch.core.internal.b;
import androidx.constraintlayout.solver.widgets.analyzer.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LifecycleRegistry.java */
/* loaded from: classes3.dex */
public class c0 extends t {

    /* renamed from: b, reason: collision with root package name */
    private androidx.arch.core.internal.a<z, a> f8501b;

    /* renamed from: c, reason: collision with root package name */
    private t.c f8502c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<a0> f8503d;

    /* renamed from: e, reason: collision with root package name */
    private int f8504e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8505f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8506g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<t.c> f8507h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8508i;

    /* compiled from: LifecycleRegistry.java */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        t.c f8509a;

        /* renamed from: b, reason: collision with root package name */
        w f8510b;

        a(z zVar, t.c cVar) {
            this.f8510b = Lifecycling.g(zVar);
            this.f8509a = cVar;
        }

        void a(a0 a0Var, t.b bVar) {
            t.c targetState = bVar.getTargetState();
            this.f8509a = c0.m(this.f8509a, targetState);
            this.f8510b.h(a0Var, bVar);
            this.f8509a = targetState;
        }
    }

    public c0(@o0 a0 a0Var) {
        this(a0Var, true);
    }

    private void d(a0 a0Var) {
        Iterator<Map.Entry<z, a>> descendingIterator = this.f8501b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f8506g) {
            Map.Entry<z, a> next = descendingIterator.next();
            a value = next.getValue();
            while (value.f8509a.compareTo(this.f8502c) > 0 && !this.f8506g && this.f8501b.contains(next.getKey())) {
                t.b downFrom = t.b.downFrom(value.f8509a);
                if (downFrom == null) {
                    throw new IllegalStateException("no event down from " + value.f8509a);
                }
                p(downFrom.getTargetState());
                value.a(a0Var, downFrom);
                o();
            }
        }
    }

    private t.c e(z zVar) {
        Map.Entry<z, a> q5 = this.f8501b.q(zVar);
        t.c cVar = null;
        t.c cVar2 = q5 != null ? q5.getValue().f8509a : null;
        if (!this.f8507h.isEmpty()) {
            cVar = this.f8507h.get(r0.size() - 1);
        }
        return m(m(this.f8502c, cVar2), cVar);
    }

    @o0
    @m1
    public static c0 f(@o0 a0 a0Var) {
        return new c0(a0Var, false);
    }

    @SuppressLint({"RestrictedApi"})
    private void g(String str) {
        if (this.f8508i && !androidx.arch.core.executor.a.f().c()) {
            throw new IllegalStateException(e.a("Method ", str, " must be called on the main thread"));
        }
    }

    private void h(a0 a0Var) {
        b<z, a>.d g5 = this.f8501b.g();
        while (g5.hasNext() && !this.f8506g) {
            Map.Entry next = g5.next();
            a aVar = (a) next.getValue();
            while (aVar.f8509a.compareTo(this.f8502c) < 0 && !this.f8506g && this.f8501b.contains((z) next.getKey())) {
                p(aVar.f8509a);
                t.b upFrom = t.b.upFrom(aVar.f8509a);
                if (upFrom == null) {
                    throw new IllegalStateException("no event up from " + aVar.f8509a);
                }
                aVar.a(a0Var, upFrom);
                o();
            }
        }
    }

    private boolean k() {
        if (this.f8501b.size() == 0) {
            return true;
        }
        t.c cVar = this.f8501b.b().getValue().f8509a;
        t.c cVar2 = this.f8501b.h().getValue().f8509a;
        return cVar == cVar2 && this.f8502c == cVar2;
    }

    static t.c m(@o0 t.c cVar, @q0 t.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void n(t.c cVar) {
        t.c cVar2 = this.f8502c;
        if (cVar2 == cVar) {
            return;
        }
        if (cVar2 == t.c.INITIALIZED && cVar == t.c.DESTROYED) {
            throw new IllegalStateException("no event down from " + this.f8502c);
        }
        this.f8502c = cVar;
        if (this.f8505f || this.f8504e != 0) {
            this.f8506g = true;
            return;
        }
        this.f8505f = true;
        r();
        this.f8505f = false;
        if (this.f8502c == t.c.DESTROYED) {
            this.f8501b = new androidx.arch.core.internal.a<>();
        }
    }

    private void o() {
        this.f8507h.remove(r0.size() - 1);
    }

    private void p(t.c cVar) {
        this.f8507h.add(cVar);
    }

    private void r() {
        a0 a0Var = this.f8503d.get();
        if (a0Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (!k()) {
            this.f8506g = false;
            if (this.f8502c.compareTo(this.f8501b.b().getValue().f8509a) < 0) {
                d(a0Var);
            }
            Map.Entry<z, a> h5 = this.f8501b.h();
            if (!this.f8506g && h5 != null && this.f8502c.compareTo(h5.getValue().f8509a) > 0) {
                h(a0Var);
            }
        }
        this.f8506g = false;
    }

    @Override // android.view.t
    public void a(@o0 z zVar) {
        a0 a0Var;
        g("addObserver");
        t.c cVar = this.f8502c;
        t.c cVar2 = t.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = t.c.INITIALIZED;
        }
        a aVar = new a(zVar, cVar2);
        if (this.f8501b.o(zVar, aVar) == null && (a0Var = this.f8503d.get()) != null) {
            boolean z5 = this.f8504e != 0 || this.f8505f;
            t.c e6 = e(zVar);
            this.f8504e++;
            while (aVar.f8509a.compareTo(e6) < 0 && this.f8501b.contains(zVar)) {
                p(aVar.f8509a);
                t.b upFrom = t.b.upFrom(aVar.f8509a);
                if (upFrom == null) {
                    throw new IllegalStateException("no event up from " + aVar.f8509a);
                }
                aVar.a(a0Var, upFrom);
                o();
                e6 = e(zVar);
            }
            if (!z5) {
                r();
            }
            this.f8504e--;
        }
    }

    @Override // android.view.t
    @o0
    public t.c b() {
        return this.f8502c;
    }

    @Override // android.view.t
    public void c(@o0 z zVar) {
        g("removeObserver");
        this.f8501b.p(zVar);
    }

    public int i() {
        g("getObserverCount");
        return this.f8501b.size();
    }

    public void j(@o0 t.b bVar) {
        g("handleLifecycleEvent");
        n(bVar.getTargetState());
    }

    @l0
    @Deprecated
    public void l(@o0 t.c cVar) {
        g("markState");
        q(cVar);
    }

    @l0
    public void q(@o0 t.c cVar) {
        g("setCurrentState");
        n(cVar);
    }

    private c0(@o0 a0 a0Var, boolean z5) {
        this.f8501b = new androidx.arch.core.internal.a<>();
        this.f8504e = 0;
        this.f8505f = false;
        this.f8506g = false;
        this.f8507h = new ArrayList<>();
        this.f8503d = new WeakReference<>(a0Var);
        this.f8502c = t.c.INITIALIZED;
        this.f8508i = z5;
    }
}
