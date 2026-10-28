package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.e;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.h0;
import okio.o0;

/* compiled from: OkHttpCall.java */
/* loaded from: classes6.dex */
final class m<T> implements retrofit2.b<T> {

    /* renamed from: o, reason: collision with root package name */
    private final u f33027o;

    /* renamed from: p, reason: collision with root package name */
    private final Object[] f33028p;

    /* renamed from: q, reason: collision with root package name */
    private final e.a f33029q;

    /* renamed from: r, reason: collision with root package name */
    private final f<h0, T> f33030r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f33031s;

    /* renamed from: t, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    private okhttp3.e f33032t;

    /* renamed from: u, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    private Throwable f33033u;

    /* renamed from: v, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f33034v;

    /* compiled from: OkHttpCall.java */
    class a implements okhttp3.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f33035a;

        a(d dVar) {
            this.f33035a = dVar;
        }

        private void c(Throwable th) {
            try {
                this.f33035a.a(m.this, th);
            } catch (Throwable th2) {
                a0.s(th2);
                th2.printStackTrace();
            }
        }

        @Override // okhttp3.f
        public void a(okhttp3.e eVar, g0 g0Var) {
            try {
                try {
                    this.f33035a.b(m.this, m.this.c(g0Var));
                } catch (Throwable th) {
                    a0.s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                a0.s(th2);
                c(th2);
            }
        }

        @Override // okhttp3.f
        public void b(okhttp3.e eVar, IOException iOException) {
            c(iOException);
        }
    }

    /* compiled from: OkHttpCall.java */
    static final class b extends h0 {

        /* renamed from: q, reason: collision with root package name */
        private final h0 f33037q;

        /* renamed from: r, reason: collision with root package name */
        private final okio.o f33038r;

        /* renamed from: s, reason: collision with root package name */
        @Nullable
        IOException f33039s;

        /* compiled from: OkHttpCall.java */
        class a extends okio.s {
            a(o0 o0Var) {
                super(o0Var);
            }

            @Override // okio.s, okio.o0
            public long X0(okio.m mVar, long j5) throws IOException {
                try {
                    return super.X0(mVar, j5);
                } catch (IOException e6) {
                    b.this.f33039s = e6;
                    throw e6;
                }
            }
        }

        b(h0 h0Var) {
            this.f33037q = h0Var;
            this.f33038r = okio.a0.d(new a(h0Var.getBodySource()));
        }

        @Override // okhttp3.h0
        /* renamed from: B */
        public okio.o getBodySource() {
            return this.f33038r;
        }

        void F() throws IOException {
            IOException iOException = this.f33039s;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.h0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f33037q.close();
        }

        @Override // okhttp3.h0
        /* renamed from: j */
        public long getContentLength() {
            return this.f33037q.getContentLength();
        }

        @Override // okhttp3.h0
        /* renamed from: k */
        public okhttp3.y getF30637r() {
            return this.f33037q.getF30637r();
        }
    }

    /* compiled from: OkHttpCall.java */
    static final class c extends h0 {

        /* renamed from: q, reason: collision with root package name */
        @Nullable
        private final okhttp3.y f33041q;

        /* renamed from: r, reason: collision with root package name */
        private final long f33042r;

        c(@Nullable okhttp3.y yVar, long j5) {
            this.f33041q = yVar;
            this.f33042r = j5;
        }

        @Override // okhttp3.h0
        /* renamed from: B */
        public okio.o getBodySource() {
            throw new IllegalStateException(ProtectedSandApp.s("鐫"));
        }

        @Override // okhttp3.h0
        /* renamed from: j */
        public long getContentLength() {
            return this.f33042r;
        }

        @Override // okhttp3.h0
        /* renamed from: k */
        public okhttp3.y getF30637r() {
            return this.f33041q;
        }
    }

    m(u uVar, Object[] objArr, e.a aVar, f<h0, T> fVar) {
        this.f33027o = uVar;
        this.f33028p = objArr;
        this.f33029q = aVar;
        this.f33030r = fVar;
    }

    private okhttp3.e b() throws IOException {
        okhttp3.e a6 = this.f33029q.a(this.f33027o.a(this.f33028p));
        if (a6 != null) {
            return a6;
        }
        throw new NullPointerException(ProtectedSandApp.s("鐬"));
    }

    @Override // retrofit2.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public m<T> clone() {
        return new m<>(this.f33027o, this.f33028p, this.f33029q, this.f33030r);
    }

    v<T> c(g0 g0Var) throws IOException {
        h0 t5 = g0Var.t();
        g0 c6 = new g0.a(g0Var).b(new c(t5.getF30637r(), t5.getContentLength())).c();
        int code = c6.getCode();
        if (code < 200 || code >= 300) {
            try {
                return v.d(a0.a(t5), c6);
            } finally {
                t5.close();
            }
        }
        if (code == 204 || code == 205) {
            t5.close();
            return v.m(null, c6);
        }
        b bVar = new b(t5);
        try {
            return v.m(this.f33030r.a(bVar), c6);
        } catch (RuntimeException e6) {
            bVar.F();
            throw e6;
        }
    }

    @Override // retrofit2.b
    public void cancel() {
        okhttp3.e eVar;
        this.f33031s = true;
        synchronized (this) {
            eVar = this.f33032t;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // retrofit2.b
    public v<T> execute() throws IOException {
        okhttp3.e eVar;
        synchronized (this) {
            if (this.f33034v) {
                throw new IllegalStateException(ProtectedSandApp.s("鐭"));
            }
            this.f33034v = true;
            Throwable th = this.f33033u;
            if (th != null) {
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            eVar = this.f33032t;
            if (eVar == null) {
                try {
                    eVar = b();
                    this.f33032t = eVar;
                } catch (IOException | Error | RuntimeException e6) {
                    a0.s(e6);
                    this.f33033u = e6;
                    throw e6;
                }
            }
        }
        if (this.f33031s) {
            eVar.cancel();
        }
        return c(eVar.execute());
    }

    @Override // retrofit2.b
    public synchronized e0 g() {
        okhttp3.e eVar = this.f33032t;
        if (eVar != null) {
            return eVar.getOriginalRequest();
        }
        Throwable th = this.f33033u;
        if (th != null) {
            if (th instanceof IOException) {
                throw new RuntimeException(ProtectedSandApp.s("鐮"), this.f33033u);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            okhttp3.e b6 = b();
            this.f33032t = b6;
            return b6.getOriginalRequest();
        } catch (IOException e6) {
            this.f33033u = e6;
            throw new RuntimeException(ProtectedSandApp.s("鐯"), e6);
        } catch (Error e7) {
            e = e7;
            a0.s(e);
            this.f33033u = e;
            throw e;
        } catch (RuntimeException e8) {
            e = e8;
            a0.s(e);
            this.f33033u = e;
            throw e;
        }
    }

    @Override // retrofit2.b
    public synchronized boolean r() {
        return this.f33034v;
    }

    @Override // retrofit2.b
    public boolean t() {
        boolean z5 = true;
        if (this.f33031s) {
            return true;
        }
        synchronized (this) {
            okhttp3.e eVar = this.f33032t;
            if (eVar == null || !eVar.getCanceled()) {
                z5 = false;
            }
        }
        return z5;
    }

    @Override // retrofit2.b
    public void y0(d<T> dVar) {
        okhttp3.e eVar;
        Throwable th;
        Objects.requireNonNull(dVar, ProtectedSandApp.s("鐰"));
        synchronized (this) {
            if (this.f33034v) {
                throw new IllegalStateException(ProtectedSandApp.s("鐱"));
            }
            this.f33034v = true;
            eVar = this.f33032t;
            th = this.f33033u;
            if (eVar == null && th == null) {
                try {
                    okhttp3.e b6 = b();
                    this.f33032t = b6;
                    eVar = b6;
                } catch (Throwable th2) {
                    th = th2;
                    a0.s(th);
                    this.f33033u = th;
                }
            }
        }
        if (th != null) {
            dVar.a(this, th);
            return;
        }
        if (this.f33031s) {
            eVar.cancel();
        }
        eVar.R(new a(dVar));
    }
}
