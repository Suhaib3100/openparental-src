package android.view;

import android.view.t;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.solver.widgets.analyzer.e;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k, reason: collision with root package name */
    static final int f8415k = -1;

    /* renamed from: l, reason: collision with root package name */
    static final Object f8416l = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f8417a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.arch.core.internal.b<k0<? super T>, LiveData<T>.c> f8418b;

    /* renamed from: c, reason: collision with root package name */
    int f8419c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8420d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f8421e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f8422f;

    /* renamed from: g, reason: collision with root package name */
    private int f8423g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8424h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8425i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f8426j;

    /* loaded from: classes3.dex */
    class LifecycleBoundObserver extends LiveData<T>.c implements w {

        /* renamed from: s, reason: collision with root package name */
        @o0
        final a0 f8427s;

        LifecycleBoundObserver(@o0 a0 a0Var, k0<? super T> k0Var) {
            super(k0Var);
            this.f8427s = a0Var;
        }

        @Override // android.view.w
        public void h(@o0 a0 a0Var, @o0 t.b bVar) {
            t.c b6 = this.f8427s.getLifecycle().b();
            if (b6 == t.c.DESTROYED) {
                LiveData.this.o(this.f8431o);
                return;
            }
            t.c cVar = null;
            while (cVar != b6) {
                g(k());
                cVar = b6;
                b6 = this.f8427s.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        void i() {
            this.f8427s.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean j(a0 a0Var) {
            return this.f8427s == a0Var;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return this.f8427s.getLifecycle().b().isAtLeast(t.c.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f8417a) {
                obj = LiveData.this.f8422f;
                LiveData.this.f8422f = LiveData.f8416l;
            }
            LiveData.this.q(obj);
        }
    }

    /* loaded from: classes3.dex */
    private class b extends LiveData<T>.c {
        b(k0<? super T> k0Var) {
            super(k0Var);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: o, reason: collision with root package name */
        final k0<? super T> f8431o;

        /* renamed from: p, reason: collision with root package name */
        boolean f8432p;

        /* renamed from: q, reason: collision with root package name */
        int f8433q = -1;

        c(k0<? super T> k0Var) {
            this.f8431o = k0Var;
        }

        void g(boolean z5) {
            if (z5 == this.f8432p) {
                return;
            }
            this.f8432p = z5;
            LiveData.this.c(z5 ? 1 : -1);
            if (this.f8432p) {
                LiveData.this.e(this);
            }
        }

        void i() {
        }

        boolean j(a0 a0Var) {
            return false;
        }

        abstract boolean k();
    }

    public LiveData(T t5) {
        this.f8417a = new Object();
        this.f8418b = new androidx.arch.core.internal.b<>();
        this.f8419c = 0;
        this.f8422f = f8416l;
        this.f8426j = new a();
        this.f8421e = t5;
        this.f8423g = 0;
    }

    static void b(String str) {
        if (!androidx.arch.core.executor.a.f().c()) {
            throw new IllegalStateException(e.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void d(LiveData<T>.c cVar) {
        if (cVar.f8432p) {
            if (!cVar.k()) {
                cVar.g(false);
                return;
            }
            int i5 = cVar.f8433q;
            int i6 = this.f8423g;
            if (i5 >= i6) {
                return;
            }
            cVar.f8433q = i6;
            cVar.f8431o.a((Object) this.f8421e);
        }
    }

    @l0
    void c(int i5) {
        int i6 = this.f8419c;
        this.f8419c = i5 + i6;
        if (this.f8420d) {
            return;
        }
        this.f8420d = true;
        while (true) {
            try {
                int i7 = this.f8419c;
                if (i6 == i7) {
                    return;
                }
                boolean z5 = i6 == 0 && i7 > 0;
                boolean z6 = i6 > 0 && i7 == 0;
                if (z5) {
                    l();
                } else if (z6) {
                    m();
                }
                i6 = i7;
            } finally {
                this.f8420d = false;
            }
        }
    }

    void e(@q0 LiveData<T>.c cVar) {
        if (this.f8424h) {
            this.f8425i = true;
            return;
        }
        this.f8424h = true;
        do {
            this.f8425i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                androidx.arch.core.internal.b<k0<? super T>, LiveData<T>.c>.d g5 = this.f8418b.g();
                while (g5.hasNext()) {
                    d((c) g5.next().getValue());
                    if (this.f8425i) {
                        break;
                    }
                }
            }
        } while (this.f8425i);
        this.f8424h = false;
    }

    @q0
    public T f() {
        T t5 = (T) this.f8421e;
        if (t5 != f8416l) {
            return t5;
        }
        return null;
    }

    int g() {
        return this.f8423g;
    }

    public boolean h() {
        return this.f8419c > 0;
    }

    public boolean i() {
        return this.f8418b.size() > 0;
    }

    @l0
    public void j(@o0 a0 a0Var, @o0 k0<? super T> k0Var) {
        b("observe");
        if (a0Var.getLifecycle().b() == t.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(a0Var, k0Var);
        LiveData<T>.c o5 = this.f8418b.o(k0Var, lifecycleBoundObserver);
        if (o5 != null && !o5.j(a0Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (o5 != null) {
            return;
        }
        a0Var.getLifecycle().a(lifecycleBoundObserver);
    }

    @l0
    public void k(@o0 k0<? super T> k0Var) {
        b("observeForever");
        b bVar = new b(k0Var);
        LiveData<T>.c o5 = this.f8418b.o(k0Var, bVar);
        if (o5 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (o5 != null) {
            return;
        }
        bVar.g(true);
    }

    protected void l() {
    }

    protected void m() {
    }

    protected void n(T t5) {
        boolean z5;
        synchronized (this.f8417a) {
            z5 = this.f8422f == f8416l;
            this.f8422f = t5;
        }
        if (z5) {
            androidx.arch.core.executor.a.f().d(this.f8426j);
        }
    }

    @l0
    public void o(@o0 k0<? super T> k0Var) {
        b("removeObserver");
        LiveData<T>.c p5 = this.f8418b.p(k0Var);
        if (p5 == null) {
            return;
        }
        p5.i();
        p5.g(false);
    }

    @l0
    public void p(@o0 a0 a0Var) {
        b("removeObservers");
        Iterator<Map.Entry<k0<? super T>, LiveData<T>.c>> it = this.f8418b.iterator();
        while (it.hasNext()) {
            Map.Entry<k0<? super T>, LiveData<T>.c> next = it.next();
            if (next.getValue().j(a0Var)) {
                o(next.getKey());
            }
        }
    }

    @l0
    protected void q(T t5) {
        b("setValue");
        this.f8423g++;
        this.f8421e = t5;
        e(null);
    }

    public LiveData() {
        this.f8417a = new Object();
        this.f8418b = new androidx.arch.core.internal.b<>();
        this.f8419c = 0;
        Object obj = f8416l;
        this.f8422f = obj;
        this.f8426j = new a();
        this.f8421e = obj;
        this.f8423g = -1;
    }
}
