package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.j0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MessageThreadUtil.java */
/* loaded from: classes3.dex */
class w<T> implements i0<T> {

    /* compiled from: MessageThreadUtil.java */
    class a implements i0.b<T> {

        /* renamed from: f, reason: collision with root package name */
        static final int f9575f = 1;

        /* renamed from: g, reason: collision with root package name */
        static final int f9576g = 2;

        /* renamed from: h, reason: collision with root package name */
        static final int f9577h = 3;

        /* renamed from: a, reason: collision with root package name */
        final c f9578a = new c();

        /* renamed from: b, reason: collision with root package name */
        private final Handler f9579b = new Handler(Looper.getMainLooper());

        /* renamed from: c, reason: collision with root package name */
        private Runnable f9580c = new RunnableC0115a();

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i0.b f9581d;

        /* compiled from: MessageThreadUtil.java */
        /* renamed from: androidx.recyclerview.widget.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0115a implements Runnable {
            RunnableC0115a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d a6 = a.this.f9578a.a();
                while (a6 != null) {
                    int i5 = a6.f9599b;
                    if (i5 == 1) {
                        a.this.f9581d.c(a6.f9600c, a6.f9601d);
                    } else if (i5 == 2) {
                        a.this.f9581d.a(a6.f9600c, (j0.a) a6.f9605h);
                    } else if (i5 == 3) {
                        a.this.f9581d.b(a6.f9600c, a6.f9601d);
                    }
                    a6 = a.this.f9578a.a();
                }
            }
        }

        a(i0.b bVar) {
            this.f9581d = bVar;
        }

        private void d(d dVar) {
            this.f9578a.c(dVar);
            this.f9579b.post(this.f9580c);
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void a(int i5, j0.a<T> aVar) {
            d(d.c(2, i5, aVar));
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void b(int i5, int i6) {
            d(d.a(3, i5, i6));
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void c(int i5, int i6) {
            d(d.a(1, i5, i6));
        }
    }

    /* compiled from: MessageThreadUtil.java */
    class b implements i0.a<T> {

        /* renamed from: g, reason: collision with root package name */
        static final int f9584g = 1;

        /* renamed from: h, reason: collision with root package name */
        static final int f9585h = 2;

        /* renamed from: i, reason: collision with root package name */
        static final int f9586i = 3;

        /* renamed from: j, reason: collision with root package name */
        static final int f9587j = 4;

        /* renamed from: a, reason: collision with root package name */
        final c f9588a = new c();

        /* renamed from: b, reason: collision with root package name */
        private final Executor f9589b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: c, reason: collision with root package name */
        AtomicBoolean f9590c = new AtomicBoolean(false);

        /* renamed from: d, reason: collision with root package name */
        private Runnable f9591d = new a();

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i0.a f9592e;

        /* compiled from: MessageThreadUtil.java */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    d a6 = b.this.f9588a.a();
                    if (a6 == null) {
                        b.this.f9590c.set(false);
                        return;
                    }
                    int i5 = a6.f9599b;
                    if (i5 == 1) {
                        b.this.f9588a.b(1);
                        b.this.f9592e.d(a6.f9600c);
                    } else if (i5 == 2) {
                        b.this.f9588a.b(2);
                        b.this.f9588a.b(3);
                        b.this.f9592e.a(a6.f9600c, a6.f9601d, a6.f9602e, a6.f9603f, a6.f9604g);
                    } else if (i5 == 3) {
                        b.this.f9592e.c(a6.f9600c, a6.f9601d);
                    } else if (i5 == 4) {
                        b.this.f9592e.b((j0.a) a6.f9605h);
                    }
                }
            }
        }

        b(i0.a aVar) {
            this.f9592e = aVar;
        }

        private void e() {
            if (this.f9590c.compareAndSet(false, true)) {
                this.f9589b.execute(this.f9591d);
            }
        }

        private void f(d dVar) {
            this.f9588a.c(dVar);
            e();
        }

        private void g(d dVar) {
            this.f9588a.d(dVar);
            e();
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void a(int i5, int i6, int i7, int i8, int i9) {
            g(d.b(2, i5, i6, i7, i8, i9, null));
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void b(j0.a<T> aVar) {
            f(d.c(4, 0, aVar));
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void c(int i5, int i6) {
            f(d.a(3, i5, i6));
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void d(int i5) {
            g(d.c(1, i5, null));
        }
    }

    /* compiled from: MessageThreadUtil.java */
    /* loaded from: classes.dex */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        private d f9595a;

        c() {
        }

        synchronized d a() {
            d dVar = this.f9595a;
            if (dVar == null) {
                return null;
            }
            this.f9595a = dVar.f9598a;
            return dVar;
        }

        synchronized void b(int i5) {
            d dVar;
            while (true) {
                dVar = this.f9595a;
                if (dVar == null || dVar.f9599b != i5) {
                    break;
                }
                this.f9595a = dVar.f9598a;
                dVar.d();
            }
            if (dVar != null) {
                d dVar2 = dVar.f9598a;
                while (dVar2 != null) {
                    d dVar3 = dVar2.f9598a;
                    if (dVar2.f9599b == i5) {
                        dVar.f9598a = dVar3;
                        dVar2.d();
                    } else {
                        dVar = dVar2;
                    }
                    dVar2 = dVar3;
                }
            }
        }

        synchronized void c(d dVar) {
            d dVar2 = this.f9595a;
            if (dVar2 == null) {
                this.f9595a = dVar;
                return;
            }
            while (true) {
                d dVar3 = dVar2.f9598a;
                if (dVar3 == null) {
                    dVar2.f9598a = dVar;
                    return;
                }
                dVar2 = dVar3;
            }
        }

        synchronized void d(d dVar) {
            dVar.f9598a = this.f9595a;
            this.f9595a = dVar;
        }
    }

    /* compiled from: MessageThreadUtil.java */
    /* loaded from: classes.dex */
    static class d {

        /* renamed from: i, reason: collision with root package name */
        private static d f9596i;

        /* renamed from: j, reason: collision with root package name */
        private static final Object f9597j = new Object();

        /* renamed from: a, reason: collision with root package name */
        d f9598a;

        /* renamed from: b, reason: collision with root package name */
        public int f9599b;

        /* renamed from: c, reason: collision with root package name */
        public int f9600c;

        /* renamed from: d, reason: collision with root package name */
        public int f9601d;

        /* renamed from: e, reason: collision with root package name */
        public int f9602e;

        /* renamed from: f, reason: collision with root package name */
        public int f9603f;

        /* renamed from: g, reason: collision with root package name */
        public int f9604g;

        /* renamed from: h, reason: collision with root package name */
        public Object f9605h;

        d() {
        }

        static d a(int i5, int i6, int i7) {
            return b(i5, i6, i7, 0, 0, 0, null);
        }

        static d b(int i5, int i6, int i7, int i8, int i9, int i10, Object obj) {
            d dVar;
            synchronized (f9597j) {
                dVar = f9596i;
                if (dVar == null) {
                    dVar = new d();
                } else {
                    f9596i = dVar.f9598a;
                    dVar.f9598a = null;
                }
                dVar.f9599b = i5;
                dVar.f9600c = i6;
                dVar.f9601d = i7;
                dVar.f9602e = i8;
                dVar.f9603f = i9;
                dVar.f9604g = i10;
                dVar.f9605h = obj;
            }
            return dVar;
        }

        static d c(int i5, int i6, Object obj) {
            return b(i5, i6, 0, 0, 0, 0, obj);
        }

        void d() {
            this.f9598a = null;
            this.f9604g = 0;
            this.f9603f = 0;
            this.f9602e = 0;
            this.f9601d = 0;
            this.f9600c = 0;
            this.f9599b = 0;
            this.f9605h = null;
            synchronized (f9597j) {
                d dVar = f9596i;
                if (dVar != null) {
                    this.f9598a = dVar;
                }
                f9596i = this;
            }
        }
    }

    w() {
    }

    @Override // androidx.recyclerview.widget.i0
    public i0.a<T> a(i0.a<T> aVar) {
        return new b(aVar);
    }

    @Override // androidx.recyclerview.widget.i0
    public i0.b<T> b(i0.b<T> bVar) {
        return new a(bVar);
    }
}
