package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.u;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.d;
import com.google.firebase.installations.remote.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes3.dex */
public class j implements k {

    /* renamed from: p, reason: collision with root package name */
    private static final int f16699p = 0;

    /* renamed from: q, reason: collision with root package name */
    private static final int f16700q = 1;

    /* renamed from: r, reason: collision with root package name */
    private static final long f16701r = 30;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.g f16707a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.installations.remote.c f16708b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.installations.local.c f16709c;

    /* renamed from: d, reason: collision with root package name */
    private final t f16710d;

    /* renamed from: e, reason: collision with root package name */
    private final u<com.google.firebase.installations.local.b> f16711e;

    /* renamed from: f, reason: collision with root package name */
    private final r f16712f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f16713g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f16714h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f16715i;

    /* renamed from: j, reason: collision with root package name */
    @b0("this")
    private String f16716j;

    /* renamed from: k, reason: collision with root package name */
    @b0("FirebaseInstallations.this")
    private Set<p2.a> f16717k;

    /* renamed from: l, reason: collision with root package name */
    @b0("lock")
    private final List<s> f16718l;

    /* renamed from: t, reason: collision with root package name */
    private static final String f16703t = ProtectedSandApp.s("⪟");

    /* renamed from: u, reason: collision with root package name */
    private static final String f16704u = ProtectedSandApp.s("⪠");

    /* renamed from: v, reason: collision with root package name */
    private static final String f16705v = ProtectedSandApp.s("⪡");

    /* renamed from: w, reason: collision with root package name */
    private static final String f16706w = ProtectedSandApp.s("⪢");

    /* renamed from: n, reason: collision with root package name */
    private static final String f16697n = ProtectedSandApp.s("⪣");

    /* renamed from: o, reason: collision with root package name */
    private static final String f16698o = ProtectedSandApp.s("⪤");

    /* renamed from: m, reason: collision with root package name */
    private static final Object f16696m = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static final ThreadFactory f16702s = new a();

    /* compiled from: FirebaseInstallations.java */
    /* loaded from: classes2.dex */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f16719a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format(ProtectedSandApp.s("ᘾ"), Integer.valueOf(this.f16719a.getAndIncrement())));
        }
    }

    /* compiled from: FirebaseInstallations.java */
    class b implements p2.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p2.a f16720a;

        b(p2.a aVar) {
            this.f16720a = aVar;
        }

        @Override // p2.b
        public void a() {
            synchronized (j.this) {
                j.this.f16717k.remove(this.f16720a);
            }
        }
    }

    /* compiled from: FirebaseInstallations.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16722a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f16723b;

        static {
            int[] iArr = new int[f.b.values().length];
            f16723b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16723b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16723b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f16722a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16722a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    j(final com.google.firebase.g gVar, @o0 o2.b<com.google.firebase.heartbeatinfo.j> bVar, @o0 ExecutorService executorService, @o0 Executor executor) {
        this(executorService, executor, gVar, new com.google.firebase.installations.remote.c(gVar.n(), bVar), new com.google.firebase.installations.local.c(gVar), t.c(), new u(new o2.b() { // from class: com.google.firebase.installations.i
            @Override // o2.b
            public final Object get() {
                return j.d(com.google.firebase.g.this);
            }
        }), new r());
    }

    private void A(com.google.firebase.installations.local.d dVar) {
        synchronized (f16696m) {
            d a6 = d.a(this.f16707a.n(), ProtectedSandApp.s("⪥"));
            try {
                this.f16709c.c(dVar);
            } finally {
                if (a6 != null) {
                    a6.b();
                }
            }
        }
    }

    private /* synthetic */ void C() {
        D(false);
    }

    private static /* synthetic */ com.google.firebase.installations.local.b E(com.google.firebase.g gVar) {
        return new com.google.firebase.installations.local.b(gVar);
    }

    private void F() {
        String r5 = r();
        String s5 = ProtectedSandApp.s("⪦");
        Preconditions.checkNotEmpty(r5, s5);
        Preconditions.checkNotEmpty(z(), ProtectedSandApp.s("⪧"));
        String q5 = q();
        String s6 = ProtectedSandApp.s("⪨");
        Preconditions.checkNotEmpty(q5, s6);
        Preconditions.checkArgument(t.h(r()), s5);
        Preconditions.checkArgument(t.g(q()), s6);
    }

    private String G(com.google.firebase.installations.local.d dVar) {
        if ((!this.f16707a.r().equals(ProtectedSandApp.s("⪩")) && !this.f16707a.B()) || !dVar.m()) {
            return this.f16712f.a();
        }
        String f6 = t().f();
        return TextUtils.isEmpty(f6) ? this.f16712f.a() : f6;
    }

    private com.google.firebase.installations.local.d H(com.google.firebase.installations.local.d dVar) throws FirebaseInstallationsException {
        com.google.firebase.installations.remote.d d6 = this.f16708b.d(q(), dVar.d(), z(), r(), (dVar.d() == null || dVar.d().length() != 11) ? null : t().i());
        int i5 = c.f16722a[d6.e().ordinal()];
        if (i5 == 1) {
            return dVar.s(d6.c(), d6.d(), this.f16710d.b(), d6.b().c(), d6.b().d());
        }
        if (i5 == 2) {
            return dVar.q(ProtectedSandApp.s("⪪"));
        }
        throw new FirebaseInstallationsException(ProtectedSandApp.s("⪫"), FirebaseInstallationsException.a.UNAVAILABLE);
    }

    private void I(Exception exc) {
        synchronized (this.f16713g) {
            Iterator<s> it = this.f16718l.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void J(com.google.firebase.installations.local.d dVar) {
        synchronized (this.f16713g) {
            Iterator<s> it = this.f16718l.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void K(String str) {
        this.f16716j = str;
    }

    private synchronized void L(com.google.firebase.installations.local.d dVar, com.google.firebase.installations.local.d dVar2) {
        if (this.f16717k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<p2.a> it = this.f16717k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    public static /* synthetic */ com.google.firebase.installations.local.b d(com.google.firebase.g gVar) {
        return new com.google.firebase.installations.local.b(gVar);
    }

    private Task<o> j() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        l(new m(this.f16710d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> k() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        l(new n(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void l(s sVar) {
        synchronized (this.f16713g) {
            this.f16718l.add(sVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void m() throws FirebaseInstallationsException {
        K(null);
        com.google.firebase.installations.local.d w5 = w();
        if (w5.k()) {
            this.f16708b.e(q(), w5.d(), z(), w5.f());
        }
        A(w5.r());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.local.d r0 = r2.w()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L63
            if (r1 != 0) goto L22
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L63
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.t r3 = r2.f16710d     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L63
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L63
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            com.google.firebase.installations.local.d r3 = r2.p(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L63
            goto L26
        L22:
            com.google.firebase.installations.local.d r3 = r2.H(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L63
        L26:
            r2.A(r3)
            r2.L(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.d()
            r2.K(r0)
        L39:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r0 = com.google.firebase.installations.FirebaseInstallationsException.a.BAD_CONFIG
            r3.<init>(r0)
            r2.I(r3)
            goto L62
        L4a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5f
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "⪬"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r3.<init>(r0)
            r2.I(r3)
            goto L62
        L5f:
            r2.J(r3)
        L62:
            return
        L63:
            r3 = move-exception
            r2.I(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.j.B(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void D(final boolean z5) {
        com.google.firebase.installations.local.d y5 = y();
        if (z5) {
            y5 = y5.p();
        }
        J(y5);
        this.f16715i.execute(new Runnable() { // from class: com.google.firebase.installations.e
            @Override // java.lang.Runnable
            public final void run() {
                j.this.B(z5);
            }
        });
    }

    private com.google.firebase.installations.local.d p(@o0 com.google.firebase.installations.local.d dVar) throws FirebaseInstallationsException {
        com.google.firebase.installations.remote.f f6 = this.f16708b.f(q(), dVar.d(), z(), dVar.f());
        int i5 = c.f16723b[f6.b().ordinal()];
        if (i5 == 1) {
            return dVar.o(f6.c(), f6.d(), this.f16710d.b());
        }
        if (i5 == 2) {
            return dVar.q(ProtectedSandApp.s("⪮"));
        }
        if (i5 != 3) {
            throw new FirebaseInstallationsException(ProtectedSandApp.s("⪭"), FirebaseInstallationsException.a.UNAVAILABLE);
        }
        K(null);
        return dVar.r();
    }

    private synchronized String s() {
        return this.f16716j;
    }

    private com.google.firebase.installations.local.b t() {
        return this.f16711e.get();
    }

    @o0
    public static j u() {
        return v(com.google.firebase.g.p());
    }

    @o0
    public static j v(@o0 com.google.firebase.g gVar) {
        Preconditions.checkArgument(gVar != null, ProtectedSandApp.s("⪯"));
        return (j) gVar.l(k.class);
    }

    private com.google.firebase.installations.local.d w() {
        com.google.firebase.installations.local.d e6;
        synchronized (f16696m) {
            d a6 = d.a(this.f16707a.n(), ProtectedSandApp.s("⪰"));
            try {
                e6 = this.f16709c.e();
            } finally {
                if (a6 != null) {
                    a6.b();
                }
            }
        }
        return e6;
    }

    private com.google.firebase.installations.local.d y() {
        com.google.firebase.installations.local.d e6;
        synchronized (f16696m) {
            d a6 = d.a(this.f16707a.n(), ProtectedSandApp.s("⪱"));
            try {
                e6 = this.f16709c.e();
                if (e6.j()) {
                    e6 = this.f16709c.c(e6.t(G(e6)));
                }
            } finally {
                if (a6 != null) {
                    a6.b();
                }
            }
        }
        return e6;
    }

    @Override // com.google.firebase.installations.k
    @o0
    public Task<o> a(final boolean z5) {
        F();
        Task<o> j5 = j();
        this.f16714h.execute(new Runnable() { // from class: com.google.firebase.installations.g
            @Override // java.lang.Runnable
            public final void run() {
                j.this.D(z5);
            }
        });
        return j5;
    }

    @Override // com.google.firebase.installations.k
    @o0
    public synchronized p2.b b(@o0 p2.a aVar) {
        this.f16717k.add(aVar);
        return new b(aVar);
    }

    @Override // com.google.firebase.installations.k
    @o0
    public Task<Void> c() {
        return Tasks.call(this.f16714h, new Callable() { // from class: com.google.firebase.installations.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m5;
                m5 = j.this.m();
                return m5;
            }
        });
    }

    @Override // com.google.firebase.installations.k
    @o0
    public Task<String> getId() {
        F();
        String s5 = s();
        if (s5 != null) {
            return Tasks.forResult(s5);
        }
        Task<String> k5 = k();
        this.f16714h.execute(new Runnable() { // from class: com.google.firebase.installations.h
            @Override // java.lang.Runnable
            public final void run() {
                j.this.D(false);
            }
        });
        return k5;
    }

    @q0
    String q() {
        return this.f16707a.s().i();
    }

    @m1
    String r() {
        return this.f16707a.s().j();
    }

    @m1
    String x() {
        return this.f16707a.r();
    }

    @q0
    String z() {
        return this.f16707a.s().n();
    }

    @SuppressLint({"ThreadPoolCreation"})
    j(ExecutorService executorService, Executor executor, com.google.firebase.g gVar, com.google.firebase.installations.remote.c cVar, com.google.firebase.installations.local.c cVar2, t tVar, u<com.google.firebase.installations.local.b> uVar, r rVar) {
        this.f16713g = new Object();
        this.f16717k = new HashSet();
        this.f16718l = new ArrayList();
        this.f16707a = gVar;
        this.f16708b = cVar;
        this.f16709c = cVar2;
        this.f16710d = tVar;
        this.f16711e = uVar;
        this.f16712f = rVar;
        this.f16714h = executorService;
        this.f16715i = executor;
    }
}
