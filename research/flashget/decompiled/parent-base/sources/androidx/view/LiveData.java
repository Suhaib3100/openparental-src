package androidx.view;

import android.support.v4.media.d;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.view.AbstractC1450w;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class LiveData<T> {

    /* renamed from: k, reason: collision with root package name */
    static final int f30163k = -1;

    /* renamed from: l, reason: collision with root package name */
    static final Object f30164l = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f30165a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.arch.core.internal.b<p0<? super T>, LiveData<T>.c> f30166b;

    /* renamed from: c, reason: collision with root package name */
    int f30167c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30168d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f30169e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f30170f;

    /* renamed from: g, reason: collision with root package name */
    private int f30171g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f30172h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30173i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f30174j;

    class LifecycleBoundObserver extends LiveData<T>.c implements InterfaceC1416b0 {

        /* renamed from: f, reason: collision with root package name */
        @o0
        final InterfaceC1423e0 f30175f;

        LifecycleBoundObserver(@o0 InterfaceC1423e0 interfaceC1423e0, p0<? super T> p0Var) {
            super(p0Var);
            this.f30175f = interfaceC1423e0;
        }

        @Override // androidx.lifecycle.LiveData.c
        void b() {
            this.f30175f.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean d(InterfaceC1423e0 interfaceC1423e0) {
            return this.f30175f == interfaceC1423e0;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean e() {
            return this.f30175f.getLifecycle().b().isAtLeast(AbstractC1450w.b.STARTED);
        }

        @Override // androidx.view.InterfaceC1416b0
        public void f(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 AbstractC1450w.a aVar) {
            AbstractC1450w.b b5 = this.f30175f.getLifecycle().b();
            if (b5 == AbstractC1450w.b.DESTROYED) {
                LiveData.this.p(this.f30179b);
                return;
            }
            AbstractC1450w.b bVar = null;
            while (bVar != b5) {
                a(e());
                bVar = b5;
                b5 = this.f30175f.getLifecycle().b();
            }
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f30165a) {
                obj = LiveData.this.f30170f;
                LiveData.this.f30170f = LiveData.f30164l;
            }
            LiveData.this.r(obj);
        }
    }

    private class b extends LiveData<T>.c {
        b(p0<? super T> p0Var) {
            super(p0Var);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean e() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: b, reason: collision with root package name */
        final p0<? super T> f30179b;

        /* renamed from: c, reason: collision with root package name */
        boolean f30180c;

        /* renamed from: d, reason: collision with root package name */
        int f30181d = -1;

        c(p0<? super T> p0Var) {
            this.f30179b = p0Var;
        }

        void a(boolean z4) {
            if (z4 == this.f30180c) {
                return;
            }
            this.f30180c = z4;
            LiveData.this.c(z4 ? 1 : -1);
            if (this.f30180c) {
                LiveData.this.e(this);
            }
        }

        void b() {
        }

        boolean d(InterfaceC1423e0 interfaceC1423e0) {
            return false;
        }

        abstract boolean e();
    }

    public LiveData(T t4) {
        this.f30165a = new Object();
        this.f30166b = new androidx.arch.core.internal.b<>();
        this.f30167c = 0;
        this.f30170f = f30164l;
        this.f30174j = new a();
        this.f30169e = t4;
        this.f30171g = 0;
    }

    static void b(String str) {
        if (!androidx.arch.core.executor.c.h().c()) {
            throw new IllegalStateException(d.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void d(LiveData<T>.c cVar) {
        if (cVar.f30180c) {
            if (!cVar.e()) {
                cVar.a(false);
                return;
            }
            int i4 = cVar.f30181d;
            int i5 = this.f30171g;
            if (i4 >= i5) {
                return;
            }
            cVar.f30181d = i5;
            cVar.f30179b.onChanged((Object) this.f30169e);
        }
    }

    @l0
    void c(int i4) {
        int i5 = this.f30167c;
        this.f30167c = i4 + i5;
        if (this.f30168d) {
            return;
        }
        this.f30168d = true;
        while (true) {
            try {
                int i6 = this.f30167c;
                if (i5 == i6) {
                    this.f30168d = false;
                    return;
                }
                boolean z4 = i5 == 0 && i6 > 0;
                boolean z5 = i5 > 0 && i6 == 0;
                if (z4) {
                    m();
                } else if (z5) {
                    n();
                }
                i5 = i6;
            } catch (Throwable th) {
                this.f30168d = false;
                throw th;
            }
        }
    }

    void e(@q0 LiveData<T>.c cVar) {
        if (this.f30172h) {
            this.f30173i = true;
            return;
        }
        this.f30172h = true;
        do {
            this.f30173i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                androidx.arch.core.internal.b<p0<? super T>, LiveData<T>.c>.d f4 = this.f30166b.f();
                while (f4.hasNext()) {
                    d((c) f4.next().getValue());
                    if (this.f30173i) {
                        break;
                    }
                }
            }
        } while (this.f30173i);
        this.f30172h = false;
    }

    @q0
    public T f() {
        T t4 = (T) this.f30169e;
        if (t4 != f30164l) {
            return t4;
        }
        return null;
    }

    int g() {
        return this.f30171g;
    }

    public boolean h() {
        return this.f30167c > 0;
    }

    public boolean i() {
        return this.f30166b.size() > 0;
    }

    public boolean j() {
        return this.f30169e != f30164l;
    }

    @l0
    public void k(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 p0<? super T> p0Var) {
        b("observe");
        if (interfaceC1423e0.getLifecycle().b() == AbstractC1450w.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC1423e0, p0Var);
        LiveData<T>.c j4 = this.f30166b.j(p0Var, lifecycleBoundObserver);
        if (j4 != null && !j4.d(interfaceC1423e0)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (j4 != null) {
            return;
        }
        interfaceC1423e0.getLifecycle().a(lifecycleBoundObserver);
    }

    @l0
    public void l(@o0 p0<? super T> p0Var) {
        b("observeForever");
        b bVar = new b(p0Var);
        LiveData<T>.c j4 = this.f30166b.j(p0Var, bVar);
        if (j4 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (j4 != null) {
            return;
        }
        bVar.a(true);
    }

    protected void m() {
    }

    protected void n() {
    }

    protected void o(T t4) {
        boolean z4;
        synchronized (this.f30165a) {
            z4 = this.f30170f == f30164l;
            this.f30170f = t4;
        }
        if (z4) {
            androidx.arch.core.executor.c.h().d(this.f30174j);
        }
    }

    @l0
    public void p(@o0 p0<? super T> p0Var) {
        b("removeObserver");
        LiveData<T>.c l4 = this.f30166b.l(p0Var);
        if (l4 == null) {
            return;
        }
        l4.b();
        l4.a(false);
    }

    @l0
    public void q(@o0 InterfaceC1423e0 interfaceC1423e0) {
        b("removeObservers");
        Iterator<Map.Entry<p0<? super T>, LiveData<T>.c>> it = this.f30166b.iterator();
        while (it.hasNext()) {
            Map.Entry<p0<? super T>, LiveData<T>.c> next = it.next();
            if (next.getValue().d(interfaceC1423e0)) {
                p(next.getKey());
            }
        }
    }

    @l0
    protected void r(T t4) {
        b("setValue");
        this.f30171g++;
        this.f30169e = t4;
        e(null);
    }

    public LiveData() {
        this.f30165a = new Object();
        this.f30166b = new androidx.arch.core.internal.b<>();
        this.f30167c = 0;
        Object obj = f30164l;
        this.f30170f = obj;
        this.f30174j = new a();
        this.f30169e = obj;
        this.f30171g = -1;
    }
}
