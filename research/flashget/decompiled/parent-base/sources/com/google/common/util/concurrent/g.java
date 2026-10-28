package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.c1;
import com.google.common.util.concurrent.f1;
import com.google.common.util.concurrent.p1;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: AbstractService.java */
@b0
@d9.c
/* loaded from: classes6.dex */
public abstract class g implements p1 {

    /* renamed from: h, reason: collision with root package name */
    private static final c1.a<p1.a> f57816h = new a();

    /* renamed from: i, reason: collision with root package name */
    private static final c1.a<p1.a> f57817i = new b();

    /* renamed from: j, reason: collision with root package name */
    private static final c1.a<p1.a> f57818j;

    /* renamed from: k, reason: collision with root package name */
    private static final c1.a<p1.a> f57819k;

    /* renamed from: l, reason: collision with root package name */
    private static final c1.a<p1.a> f57820l;

    /* renamed from: m, reason: collision with root package name */
    private static final c1.a<p1.a> f57821m;

    /* renamed from: n, reason: collision with root package name */
    private static final c1.a<p1.a> f57822n;

    /* renamed from: o, reason: collision with root package name */
    private static final c1.a<p1.a> f57823o;

    /* renamed from: a, reason: collision with root package name */
    private final f1 f57824a = new f1();

    /* renamed from: b, reason: collision with root package name */
    private final f1.a f57825b = new h();

    /* renamed from: c, reason: collision with root package name */
    private final f1.a f57826c = new i();

    /* renamed from: d, reason: collision with root package name */
    private final f1.a f57827d = new C0891g();

    /* renamed from: e, reason: collision with root package name */
    private final f1.a f57828e = new j();

    /* renamed from: f, reason: collision with root package name */
    private final c1<p1.a> f57829f = new c1<>();

    /* renamed from: g, reason: collision with root package name */
    private volatile k f57830g = new k(p1.b.NEW);

    /* compiled from: AbstractService.java */
    class a implements c1.a<p1.a> {
        a() {
        }

        @Override // com.google.common.util.concurrent.c1.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p1.a aVar) {
            aVar.c();
        }

        public String toString() {
            return ProtectedSandApp.s("料");
        }
    }

    /* compiled from: AbstractService.java */
    class b implements c1.a<p1.a> {
        b() {
        }

        @Override // com.google.common.util.concurrent.c1.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p1.a aVar) {
            aVar.b();
        }

        public String toString() {
            return ProtectedSandApp.s("樂");
        }
    }

    /* compiled from: AbstractService.java */
    class c implements c1.a<p1.a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p1.b f57831a;

        c(p1.b bVar) {
            this.f57831a = bVar;
        }

        @Override // com.google.common.util.concurrent.c1.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p1.a aVar) {
            aVar.e(this.f57831a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f57831a);
            return com.google.common.base.h.a(valueOf.length() + 21, ProtectedSandApp.s("燎"), valueOf, ProtectedSandApp.s("療"));
        }
    }

    /* compiled from: AbstractService.java */
    class d implements c1.a<p1.a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p1.b f57832a;

        d(p1.b bVar) {
            this.f57832a = bVar;
        }

        @Override // com.google.common.util.concurrent.c1.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p1.a aVar) {
            aVar.d(this.f57832a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f57832a);
            return com.google.common.base.h.a(valueOf.length() + 19, ProtectedSandApp.s("蓼"), valueOf, ProtectedSandApp.s("遼"));
        }
    }

    /* compiled from: AbstractService.java */
    class e implements c1.a<p1.a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p1.b f57833a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f57834b;

        e(g gVar, p1.b bVar, Throwable th) {
            this.f57833a = bVar;
            this.f57834b = th;
        }

        @Override // com.google.common.util.concurrent.c1.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p1.a aVar) {
            aVar.a(this.f57833a, this.f57834b);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f57833a);
            String valueOf2 = String.valueOf(this.f57834b);
            StringBuilder a5 = com.google.common.base.g.a(valueOf2.length() + valueOf.length() + 27, ProtectedSandApp.s("龍"), valueOf, ProtectedSandApp.s("暈"), valueOf2);
            a5.append(ProtectedSandApp.s("阮"));
            return a5.toString();
        }
    }

    /* compiled from: AbstractService.java */
    static /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57835a;

        static {
            int[] iArr = new int[p1.b.values().length];
            f57835a = iArr;
            try {
                iArr[p1.b.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57835a[p1.b.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57835a[p1.b.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57835a[p1.b.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57835a[p1.b.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57835a[p1.b.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: AbstractService.java */
    /* renamed from: com.google.common.util.concurrent.g$g, reason: collision with other inner class name */
    private final class C0891g extends f1.a {
        C0891g() {
            super(g.this.f57824a);
        }

        @Override // com.google.common.util.concurrent.f1.a
        public boolean a() {
            return g.this.state().compareTo(p1.b.RUNNING) >= 0;
        }
    }

    /* compiled from: AbstractService.java */
    private final class h extends f1.a {
        h() {
            super(g.this.f57824a);
        }

        @Override // com.google.common.util.concurrent.f1.a
        public boolean a() {
            return g.this.state() == p1.b.NEW;
        }
    }

    /* compiled from: AbstractService.java */
    private final class i extends f1.a {
        i() {
            super(g.this.f57824a);
        }

        @Override // com.google.common.util.concurrent.f1.a
        public boolean a() {
            return g.this.state().compareTo(p1.b.RUNNING) <= 0;
        }
    }

    /* compiled from: AbstractService.java */
    private final class j extends f1.a {
        j() {
            super(g.this.f57824a);
        }

        @Override // com.google.common.util.concurrent.f1.a
        public boolean a() {
            return g.this.state().compareTo(p1.b.TERMINATED) >= 0;
        }
    }

    /* compiled from: AbstractService.java */
    private static final class k {

        /* renamed from: a, reason: collision with root package name */
        final p1.b f57840a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f57841b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        final Throwable f57842c;

        k(p1.b bVar) {
            this(bVar, false, null);
        }

        p1.b a() {
            return (this.f57841b && this.f57840a == p1.b.STARTING) ? p1.b.STOPPING : this.f57840a;
        }

        Throwable b() {
            p1.b bVar = this.f57840a;
            com.google.common.base.l0.x0(bVar == p1.b.FAILED, ProtectedSandApp.s("柳"), bVar);
            Throwable th = this.f57842c;
            Objects.requireNonNull(th);
            return th;
        }

        k(p1.b bVar, boolean z4, @zc.a Throwable th) {
            com.google.common.base.l0.u(!z4 || bVar == p1.b.STARTING, ProtectedSandApp.s("劉"), bVar);
            com.google.common.base.l0.y((th != null) == (bVar == p1.b.FAILED), ProtectedSandApp.s("杻"), bVar, th);
            this.f57840a = bVar;
            this.f57841b = z4;
            this.f57842c = th;
        }
    }

    static {
        p1.b bVar = p1.b.STARTING;
        f57818j = new d(bVar);
        p1.b bVar2 = p1.b.RUNNING;
        f57819k = new d(bVar2);
        f57820l = new c(p1.b.NEW);
        f57821m = new c(bVar);
        f57822n = new c(bVar2);
        f57823o = new c(p1.b.STOPPING);
    }

    protected g() {
    }

    @g9.a("monitor")
    private void j(p1.b bVar) {
        p1.b a5 = this.f57830g.a();
        if (a5 != bVar) {
            p1.b bVar2 = p1.b.FAILED;
            String s4 = ProtectedSandApp.s("黎");
            String s5 = ProtectedSandApp.s("力");
            if (a5 == bVar2) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(bVar);
                StringBuilder a6 = com.google.common.base.g.a(valueOf2.length() + valueOf.length() + 56, s5, valueOf, s4, valueOf2);
                a6.append(ProtectedSandApp.s("曆"));
                throw new IllegalStateException(a6.toString(), this.f57830g.b());
            }
            String valueOf3 = String.valueOf(this);
            String valueOf4 = String.valueOf(bVar);
            String valueOf5 = String.valueOf(a5);
            throw new IllegalStateException(android.support.v4.media.c.a(com.google.common.base.g.a(valueOf5.length() + valueOf4.length() + valueOf3.length() + 38, s5, valueOf3, s4, valueOf4), ProtectedSandApp.s("歷"), valueOf5));
        }
    }

    private void k() {
        if (this.f57824a.B()) {
            return;
        }
        this.f57829f.c();
    }

    private void o(p1.b bVar, Throwable th) {
        this.f57829f.d(new e(this, bVar, th));
    }

    private void p() {
        this.f57829f.d(f57817i);
    }

    private void q() {
        this.f57829f.d(f57816h);
    }

    private void r(p1.b bVar) {
        if (bVar == p1.b.STARTING) {
            this.f57829f.d(f57818j);
        } else {
            if (bVar != p1.b.RUNNING) {
                throw new AssertionError();
            }
            this.f57829f.d(f57819k);
        }
    }

    private void s(p1.b bVar) {
        switch (f.f57835a[bVar.ordinal()]) {
            case 1:
                this.f57829f.d(f57820l);
                return;
            case 2:
                this.f57829f.d(f57821m);
                return;
            case 3:
                this.f57829f.d(f57822n);
                return;
            case 4:
                this.f57829f.d(f57823o);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    private static c1.a<p1.a> w(p1.b bVar) {
        return new d(bVar);
    }

    private static c1.a<p1.a> x(p1.b bVar) {
        return new c(bVar);
    }

    @Override // com.google.common.util.concurrent.p1
    public final void a(p1.a aVar, Executor executor) {
        this.f57829f.b(aVar, executor);
    }

    @Override // com.google.common.util.concurrent.p1
    public final void b(long j4, TimeUnit timeUnit) throws TimeoutException {
        if (!this.f57824a.r(this.f57827d, j4, timeUnit)) {
            String valueOf = String.valueOf(this);
            throw new TimeoutException(com.google.common.base.h.a(valueOf.length() + 50, ProtectedSandApp.s("轢"), valueOf, ProtectedSandApp.s("年")));
        }
        try {
            j(p1.b.RUNNING);
        } finally {
            this.f57824a.D();
        }
    }

    @Override // com.google.common.util.concurrent.p1
    public final void c(long j4, TimeUnit timeUnit) throws TimeoutException {
        if (this.f57824a.r(this.f57828e, j4, timeUnit)) {
            try {
                j(p1.b.TERMINATED);
            } finally {
                this.f57824a.D();
            }
        } else {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(this.f57830g.a());
            throw new TimeoutException(com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 65, ProtectedSandApp.s("轢"), valueOf, ProtectedSandApp.s("憐"), valueOf2));
        }
    }

    @Override // com.google.common.util.concurrent.p1
    public final void d() {
        this.f57824a.q(this.f57828e);
        try {
            j(p1.b.TERMINATED);
        } finally {
            this.f57824a.D();
        }
    }

    @Override // com.google.common.util.concurrent.p1
    @f9.a
    public final p1 e() {
        if (!this.f57824a.i(this.f57825b)) {
            String valueOf = String.valueOf(this);
            throw new IllegalStateException(com.google.common.base.h.a(valueOf.length() + 33, ProtectedSandApp.s("戀"), valueOf, ProtectedSandApp.s("撚")));
        }
        try {
            this.f57830g = new k(p1.b.STARTING);
            q();
            m();
        } finally {
            try {
                return this;
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.common.util.concurrent.p1
    public final void f() {
        this.f57824a.q(this.f57827d);
        try {
            j(p1.b.RUNNING);
        } finally {
            this.f57824a.D();
        }
    }

    @Override // com.google.common.util.concurrent.p1
    public final Throwable g() {
        return this.f57830g.b();
    }

    @Override // com.google.common.util.concurrent.p1
    @f9.a
    public final p1 h() {
        if (this.f57824a.i(this.f57826c)) {
            try {
                p1.b a5 = this.f57830g.a();
                switch (f.f57835a[a5.ordinal()]) {
                    case 1:
                        this.f57830g = new k(p1.b.TERMINATED);
                        s(p1.b.NEW);
                        break;
                    case 2:
                        p1.b bVar = p1.b.STARTING;
                        this.f57830g = new k(bVar, true, null);
                        r(bVar);
                        l();
                        break;
                    case 3:
                        this.f57830g = new k(p1.b.STOPPING);
                        r(p1.b.RUNNING);
                        n();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        String valueOf = String.valueOf(a5);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 45);
                        sb.append(ProtectedSandApp.s("漣"));
                        sb.append(valueOf);
                        throw new AssertionError(sb.toString());
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return this;
    }

    @Override // com.google.common.util.concurrent.p1
    public final boolean isRunning() {
        return this.f57830g.a() == p1.b.RUNNING;
    }

    @d9.a
    @f9.g
    protected void l() {
    }

    @f9.g
    protected abstract void m();

    @f9.g
    protected abstract void n();

    @Override // com.google.common.util.concurrent.p1
    public final p1.b state() {
        return this.f57830g.a();
    }

    protected final void t(Throwable th) {
        th.getClass();
        this.f57824a.g();
        try {
            p1.b a5 = this.f57830g.a();
            int i4 = f.f57835a[a5.ordinal()];
            if (i4 != 1) {
                if (i4 == 2 || i4 == 3 || i4 == 4) {
                    this.f57830g = new k(p1.b.FAILED, false, th);
                    o(a5, th);
                } else if (i4 != 5) {
                }
                return;
            }
            String valueOf = String.valueOf(a5);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append(ProtectedSandApp.s("煉"));
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString(), th);
        } finally {
            this.f57824a.D();
            k();
        }
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(this.f57830g.a());
        return com.google.common.base.e.a(valueOf.length() + simpleName.length() + 3, simpleName, ProtectedSandApp.s("璉"), valueOf, ProtectedSandApp.s("秊"));
    }

    protected final void u() {
        this.f57824a.g();
        try {
            if (this.f57830g.f57840a != p1.b.STARTING) {
                String valueOf = String.valueOf(this.f57830g.f57840a);
                StringBuilder sb = new StringBuilder(valueOf.length() + 43);
                sb.append(ProtectedSandApp.s("練"));
                sb.append(valueOf);
                IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
                t(illegalStateException);
                throw illegalStateException;
            }
            if (this.f57830g.f57841b) {
                this.f57830g = new k(p1.b.STOPPING);
                n();
            } else {
                this.f57830g = new k(p1.b.RUNNING);
                p();
            }
            this.f57824a.D();
            k();
        } catch (Throwable th) {
            this.f57824a.D();
            k();
            throw th;
        }
    }

    protected final void v() {
        this.f57824a.g();
        try {
            p1.b a5 = this.f57830g.a();
            switch (f.f57835a[a5.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    String valueOf = String.valueOf(a5);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 43);
                    sb.append(ProtectedSandApp.s("聯"));
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                case 2:
                case 3:
                case 4:
                    this.f57830g = new k(p1.b.TERMINATED);
                    s(a5);
                    break;
            }
        } finally {
            this.f57824a.D();
            k();
        }
    }
}
