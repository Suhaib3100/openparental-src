package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Objects;
import okhttp3.e;
import okhttp3.f0;
import okhttp3.g0;
import okio.o0;

/* compiled from: OkHttpCall.java */
/* loaded from: classes9.dex */
final class m<T> implements retrofit2.b<T> {

    /* renamed from: b, reason: collision with root package name */
    private final w f89943b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f89944c;

    /* renamed from: d, reason: collision with root package name */
    private final e.a f89945d;

    /* renamed from: e, reason: collision with root package name */
    private final f<g0, T> f89946e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f89947f;

    /* renamed from: g, reason: collision with root package name */
    @zc.h
    @ad.a("this")
    private okhttp3.e f89948g;

    /* renamed from: h, reason: collision with root package name */
    @zc.h
    @ad.a("this")
    private Throwable f89949h;

    /* renamed from: i, reason: collision with root package name */
    @ad.a("this")
    private boolean f89950i;

    /* compiled from: OkHttpCall.java */
    class a implements okhttp3.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f89951a;

        a(d dVar) {
            this.f89951a = dVar;
        }

        private void c(Throwable th) {
            try {
                this.f89951a.a(m.this, th);
            } catch (Throwable th2) {
                c0.s(th2);
                th2.printStackTrace();
            }
        }

        @Override // okhttp3.f
        public void a(okhttp3.e eVar, IOException iOException) {
            c(iOException);
        }

        @Override // okhttp3.f
        public void b(okhttp3.e eVar, f0 f0Var) {
            try {
                try {
                    this.f89951a.b(m.this, m.this.d(f0Var));
                } catch (Throwable th) {
                    c0.s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                c0.s(th2);
                c(th2);
            }
        }
    }

    /* compiled from: OkHttpCall.java */
    static final class b extends g0 {

        /* renamed from: d, reason: collision with root package name */
        private final g0 f89953d;

        /* renamed from: e, reason: collision with root package name */
        private final okio.o f89954e;

        /* renamed from: f, reason: collision with root package name */
        @zc.h
        IOException f89955f;

        /* compiled from: OkHttpCall.java */
        class a extends okio.s {
            a(o0 o0Var) {
                super(o0Var);
            }

            @Override // okio.s, okio.o0
            public long w3(okio.m mVar, long j4) throws IOException {
                try {
                    return super.w3(mVar, j4);
                } catch (IOException e4) {
                    b.this.f89955f = e4;
                    throw e4;
                }
            }
        }

        b(g0 g0Var) {
            this.f89953d = g0Var;
            this.f89954e = okio.a0.d(new a(g0Var.getSource()));
        }

        @Override // okhttp3.g0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f89953d.close();
        }

        @Override // okhttp3.g0
        /* renamed from: g */
        public long getContentLength() {
            return this.f89953d.getContentLength();
        }

        @Override // okhttp3.g0
        /* renamed from: h */
        public okhttp3.x getF84143e() {
            return this.f89953d.getF84143e();
        }

        @Override // okhttp3.g0
        /* renamed from: t */
        public okio.o getSource() {
            return this.f89954e;
        }

        void x() throws IOException {
            IOException iOException = this.f89955f;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* compiled from: OkHttpCall.java */
    static final class c extends g0 {

        /* renamed from: d, reason: collision with root package name */
        @zc.h
        private final okhttp3.x f89957d;

        /* renamed from: e, reason: collision with root package name */
        private final long f89958e;

        c(@zc.h okhttp3.x xVar, long j4) {
            this.f89957d = xVar;
            this.f89958e = j4;
        }

        @Override // okhttp3.g0
        /* renamed from: g */
        public long getContentLength() {
            return this.f89958e;
        }

        @Override // okhttp3.g0
        /* renamed from: h */
        public okhttp3.x getF84143e() {
            return this.f89957d;
        }

        @Override // okhttp3.g0
        /* renamed from: t */
        public okio.o getSource() {
            throw new IllegalStateException(ProtectedSandApp.s("ꗗ\u0001"));
        }
    }

    m(w wVar, Object[] objArr, e.a aVar, f<g0, T> fVar) {
        this.f89943b = wVar;
        this.f89944c = objArr;
        this.f89945d = aVar;
        this.f89946e = fVar;
    }

    private okhttp3.e c() throws IOException {
        okhttp3.e b5 = this.f89945d.b(this.f89943b.a(this.f89944c));
        if (b5 != null) {
            return b5;
        }
        throw new NullPointerException(ProtectedSandApp.s("ꗘ\u0001"));
    }

    @Override // retrofit2.b
    public boolean L() {
        boolean z4 = true;
        if (this.f89947f) {
            return true;
        }
        synchronized (this) {
            try {
                okhttp3.e eVar = this.f89948g;
                if (eVar == null || !eVar.getCanceled()) {
                    z4 = false;
                }
            } finally {
            }
        }
        return z4;
    }

    @Override // retrofit2.b
    public void O0(d<T> dVar) {
        okhttp3.e eVar;
        Throwable th;
        Objects.requireNonNull(dVar, ProtectedSandApp.s("ꗙ\u0001"));
        synchronized (this) {
            try {
                if (this.f89950i) {
                    throw new IllegalStateException(ProtectedSandApp.s("ꗚ\u0001"));
                }
                this.f89950i = true;
                eVar = this.f89948g;
                th = this.f89949h;
                if (eVar == null && th == null) {
                    try {
                        okhttp3.e c5 = c();
                        this.f89948g = c5;
                        eVar = c5;
                    } catch (Throwable th2) {
                        th = th2;
                        c0.s(th);
                        this.f89949h = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            dVar.a(this, th);
            return;
        }
        if (this.f89947f) {
            eVar.cancel();
        }
        eVar.n2(new a(dVar));
    }

    @Override // retrofit2.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public m<T> clone() {
        return new m<>(this.f89943b, this.f89944c, this.f89945d, this.f89946e);
    }

    @Override // retrofit2.b
    public void cancel() {
        okhttp3.e eVar;
        this.f89947f = true;
        synchronized (this) {
            eVar = this.f89948g;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    x<T> d(f0 f0Var) throws IOException {
        g0 o4 = f0Var.o();
        f0 c5 = new f0.a(f0Var).b(new c(o4.getF84143e(), o4.getContentLength())).c();
        int u4 = c5.u();
        if (u4 < 200 || u4 >= 300) {
            try {
                return x.d(c0.a(o4), c5);
            } finally {
                o4.close();
            }
        }
        if (u4 == 204 || u4 == 205) {
            o4.close();
            return x.m(null, c5);
        }
        b bVar = new b(o4);
        try {
            return x.m(this.f89946e.a(bVar), c5);
        } catch (RuntimeException e4) {
            IOException iOException = bVar.f89955f;
            if (iOException == null) {
                throw e4;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.b
    public synchronized okhttp3.d0 h() {
        okhttp3.e eVar = this.f89948g;
        if (eVar != null) {
            return eVar.getOriginalRequest();
        }
        Throwable th = this.f89949h;
        if (th != null) {
            if (th instanceof IOException) {
                throw new RuntimeException(ProtectedSandApp.s("ꗛ\u0001"), this.f89949h);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            okhttp3.e c5 = c();
            this.f89948g = c5;
            return c5.getOriginalRequest();
        } catch (IOException e4) {
            this.f89949h = e4;
            throw new RuntimeException(ProtectedSandApp.s("ꗛ\u0001"), e4);
        } catch (Error e5) {
            e = e5;
            c0.s(e);
            this.f89949h = e;
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            c0.s(e);
            this.f89949h = e;
            throw e;
        }
    }

    @Override // retrofit2.b
    public x<T> j() throws IOException {
        okhttp3.e eVar;
        synchronized (this) {
            try {
                if (this.f89950i) {
                    throw new IllegalStateException(ProtectedSandApp.s("ꗚ\u0001"));
                }
                this.f89950i = true;
                Throwable th = this.f89949h;
                if (th != null) {
                    if (th instanceof IOException) {
                        throw ((IOException) th);
                    }
                    if (th instanceof RuntimeException) {
                        throw ((RuntimeException) th);
                    }
                    throw ((Error) th);
                }
                eVar = this.f89948g;
                if (eVar == null) {
                    try {
                        eVar = c();
                        this.f89948g = eVar;
                    } catch (IOException | Error | RuntimeException e4) {
                        c0.s(e4);
                        this.f89949h = e4;
                        throw e4;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f89947f) {
            eVar.cancel();
        }
        return d(eVar.j());
    }

    @Override // retrofit2.b
    public synchronized boolean x() {
        return this.f89950i;
    }
}
