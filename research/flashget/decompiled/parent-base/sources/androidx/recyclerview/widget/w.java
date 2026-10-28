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
        static final int f33441f = 1;

        /* renamed from: g, reason: collision with root package name */
        static final int f33442g = 2;

        /* renamed from: h, reason: collision with root package name */
        static final int f33443h = 3;

        /* renamed from: a, reason: collision with root package name */
        final c f33444a = new c();

        /* renamed from: b, reason: collision with root package name */
        private final Handler f33445b = new Handler(Looper.getMainLooper());

        /* renamed from: c, reason: collision with root package name */
        private Runnable f33446c = new RunnableC0598a();

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i0.b f33447d;

        /* compiled from: MessageThreadUtil.java */
        /* renamed from: androidx.recyclerview.widget.w$a$a, reason: collision with other inner class name */
        class RunnableC0598a implements Runnable {
            RunnableC0598a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d a5 = a.this.f33444a.a();
                while (a5 != null) {
                    int i4 = a5.f33466b;
                    if (i4 == 1) {
                        a.this.f33447d.c(a5.f33467c, a5.f33468d);
                    } else if (i4 == 2) {
                        a.this.f33447d.b(a5.f33467c, (j0.a) a5.f33472h);
                    } else if (i4 == 3) {
                        a.this.f33447d.a(a5.f33467c, a5.f33468d);
                    }
                    a5 = a.this.f33444a.a();
                }
            }
        }

        a(i0.b bVar) {
            this.f33447d = bVar;
        }

        private void d(d dVar) {
            this.f33444a.c(dVar);
            this.f33445b.post(this.f33446c);
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void a(int i4, int i5) {
            d(d.a(3, i4, i5));
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void b(int i4, j0.a<T> aVar) {
            d(d.c(2, i4, aVar));
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void c(int i4, int i5) {
            d(d.a(1, i4, i5));
        }
    }

    /* compiled from: MessageThreadUtil.java */
    class b implements i0.a<T> {

        /* renamed from: g, reason: collision with root package name */
        static final int f33450g = 1;

        /* renamed from: h, reason: collision with root package name */
        static final int f33451h = 2;

        /* renamed from: i, reason: collision with root package name */
        static final int f33452i = 3;

        /* renamed from: j, reason: collision with root package name */
        static final int f33453j = 4;

        /* renamed from: a, reason: collision with root package name */
        final c f33454a = new c();

        /* renamed from: b, reason: collision with root package name */
        private final Executor f33455b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: c, reason: collision with root package name */
        AtomicBoolean f33456c = new AtomicBoolean(false);

        /* renamed from: d, reason: collision with root package name */
        private Runnable f33457d = new a();

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i0.a f33458e;

        /* compiled from: MessageThreadUtil.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    d a5 = b.this.f33454a.a();
                    if (a5 == null) {
                        b.this.f33456c.set(false);
                        return;
                    }
                    int i4 = a5.f33466b;
                    if (i4 == 1) {
                        b.this.f33454a.b(1);
                        b.this.f33458e.c(a5.f33467c);
                    } else if (i4 == 2) {
                        b.this.f33454a.b(2);
                        b.this.f33454a.b(3);
                        b.this.f33458e.a(a5.f33467c, a5.f33468d, a5.f33469e, a5.f33470f, a5.f33471g);
                    } else if (i4 == 3) {
                        b.this.f33458e.b(a5.f33467c, a5.f33468d);
                    } else if (i4 == 4) {
                        b.this.f33458e.d((j0.a) a5.f33472h);
                    }
                }
            }
        }

        b(i0.a aVar) {
            this.f33458e = aVar;
        }

        private void e() {
            if (this.f33456c.compareAndSet(false, true)) {
                this.f33455b.execute(this.f33457d);
            }
        }

        private void f(d dVar) {
            this.f33454a.c(dVar);
            e();
        }

        private void g(d dVar) {
            this.f33454a.d(dVar);
            e();
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void a(int i4, int i5, int i6, int i7, int i10) {
            g(d.b(2, i4, i5, i6, i7, i10, null));
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void b(int i4, int i5) {
            f(d.a(3, i4, i5));
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void c(int i4) {
            g(d.c(1, i4, null));
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void d(j0.a<T> aVar) {
            f(d.c(4, 0, aVar));
        }
    }

    /* compiled from: MessageThreadUtil.java */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        private d f33461a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f33462b = new Object();

        c() {
        }

        d a() {
            synchronized (this.f33462b) {
                try {
                    d dVar = this.f33461a;
                    if (dVar == null) {
                        return null;
                    }
                    this.f33461a = dVar.f33465a;
                    return dVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void b(int i4) {
            d dVar;
            synchronized (this.f33462b) {
                while (true) {
                    try {
                        dVar = this.f33461a;
                        if (dVar == null || dVar.f33466b != i4) {
                            break;
                        }
                        this.f33461a = dVar.f33465a;
                        dVar.d();
                    } finally {
                    }
                }
                if (dVar != null) {
                    d dVar2 = dVar.f33465a;
                    while (dVar2 != null) {
                        d dVar3 = dVar2.f33465a;
                        if (dVar2.f33466b == i4) {
                            dVar.f33465a = dVar3;
                            dVar2.d();
                        } else {
                            dVar = dVar2;
                        }
                        dVar2 = dVar3;
                    }
                }
            }
        }

        void c(d dVar) {
            synchronized (this.f33462b) {
                try {
                    d dVar2 = this.f33461a;
                    if (dVar2 == null) {
                        this.f33461a = dVar;
                        return;
                    }
                    while (true) {
                        d dVar3 = dVar2.f33465a;
                        if (dVar3 == null) {
                            dVar2.f33465a = dVar;
                            return;
                        }
                        dVar2 = dVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void d(d dVar) {
            synchronized (this.f33462b) {
                dVar.f33465a = this.f33461a;
                this.f33461a = dVar;
            }
        }
    }

    /* compiled from: MessageThreadUtil.java */
    static class d {

        /* renamed from: i, reason: collision with root package name */
        private static d f33463i;

        /* renamed from: j, reason: collision with root package name */
        private static final Object f33464j = new Object();

        /* renamed from: a, reason: collision with root package name */
        d f33465a;

        /* renamed from: b, reason: collision with root package name */
        public int f33466b;

        /* renamed from: c, reason: collision with root package name */
        public int f33467c;

        /* renamed from: d, reason: collision with root package name */
        public int f33468d;

        /* renamed from: e, reason: collision with root package name */
        public int f33469e;

        /* renamed from: f, reason: collision with root package name */
        public int f33470f;

        /* renamed from: g, reason: collision with root package name */
        public int f33471g;

        /* renamed from: h, reason: collision with root package name */
        public Object f33472h;

        d() {
        }

        static d a(int i4, int i5, int i6) {
            return b(i4, i5, i6, 0, 0, 0, null);
        }

        static d b(int i4, int i5, int i6, int i7, int i10, int i11, Object obj) {
            d dVar;
            synchronized (f33464j) {
                try {
                    dVar = f33463i;
                    if (dVar == null) {
                        dVar = new d();
                    } else {
                        f33463i = dVar.f33465a;
                        dVar.f33465a = null;
                    }
                    dVar.f33466b = i4;
                    dVar.f33467c = i5;
                    dVar.f33468d = i6;
                    dVar.f33469e = i7;
                    dVar.f33470f = i10;
                    dVar.f33471g = i11;
                    dVar.f33472h = obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar;
        }

        static d c(int i4, int i5, Object obj) {
            return b(i4, i5, 0, 0, 0, 0, obj);
        }

        void d() {
            this.f33465a = null;
            this.f33471g = 0;
            this.f33470f = 0;
            this.f33469e = 0;
            this.f33468d = 0;
            this.f33467c = 0;
            this.f33466b = 0;
            this.f33472h = null;
            synchronized (f33464j) {
                try {
                    d dVar = f33463i;
                    if (dVar != null) {
                        this.f33465a = dVar;
                    }
                    f33463i = this;
                } catch (Throwable th) {
                    throw th;
                }
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
