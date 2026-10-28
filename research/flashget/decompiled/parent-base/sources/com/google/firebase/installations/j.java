package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class j implements k {

    /* renamed from: p, reason: collision with root package name */
    private static final int f59720p = 0;

    /* renamed from: q, reason: collision with root package name */
    private static final int f59721q = 1;

    /* renamed from: r, reason: collision with root package name */
    private static final long f59722r = 30;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.g f59728a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.installations.remote.c f59729b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.installations.local.c f59730c;

    /* renamed from: d, reason: collision with root package name */
    private final t f59731d;

    /* renamed from: e, reason: collision with root package name */
    private final u<com.google.firebase.installations.local.b> f59732e;

    /* renamed from: f, reason: collision with root package name */
    private final r f59733f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f59734g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f59735h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f59736i;

    /* renamed from: j, reason: collision with root package name */
    @b0("this")
    private String f59737j;

    /* renamed from: k, reason: collision with root package name */
    @b0("FirebaseInstallations.this")
    private Set<z9.a> f59738k;

    /* renamed from: l, reason: collision with root package name */
    @b0("lock")
    private final List<s> f59739l;

    /* renamed from: t, reason: collision with root package name */
    private static final String f59724t = ProtectedSandApp.s("\u009d\u0001");

    /* renamed from: u, reason: collision with root package name */
    private static final String f59725u = ProtectedSandApp.s("\u009e\u0001");

    /* renamed from: v, reason: collision with root package name */
    private static final String f59726v = ProtectedSandApp.s("\u009f\u0001");

    /* renamed from: w, reason: collision with root package name */
    private static final String f59727w = ProtectedSandApp.s(" \u0001");

    /* renamed from: n, reason: collision with root package name */
    private static final String f59718n = ProtectedSandApp.s("¡\u0001");

    /* renamed from: o, reason: collision with root package name */
    private static final String f59719o = ProtectedSandApp.s("¢\u0001");

    /* renamed from: m, reason: collision with root package name */
    private static final Object f59717m = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static final ThreadFactory f59723s = new a();

    /* compiled from: FirebaseInstallations.java */
    class a implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f59740b = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format(ProtectedSandApp.s("\u009c\u0001"), Integer.valueOf(this.f59740b.getAndIncrement())));
        }
    }

    /* compiled from: FirebaseInstallations.java */
    class b implements z9.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z9.a f59741a;

        b(z9.a aVar) {
            this.f59741a = aVar;
        }

        @Override // z9.b
        public void a() {
            synchronized (j.this) {
                j.this.f59738k.remove(this.f59741a);
            }
        }
    }

    /* compiled from: FirebaseInstallations.java */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59743a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f59744b;

        static {
            int[] iArr = new int[f.b.values().length];
            f59744b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59744b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59744b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f59743a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59743a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    j(final com.google.firebase.g gVar, @o0 y9.b<com.google.firebase.heartbeatinfo.j> bVar, @o0 ExecutorService executorService, @o0 Executor executor) {
        this(executorService, executor, gVar, new com.google.firebase.installations.remote.c(gVar.n(), bVar), new com.google.firebase.installations.local.c(gVar), t.c(), new u(new y9.b() { // from class: com.google.firebase.installations.e
            @Override // y9.b
            public final Object get() {
                return j.i(com.google.firebase.g.this);
            }
        }), new r());
    }

    /* JADX WARN: Finally extract failed */
    private void B(com.google.firebase.installations.local.d dVar) {
        synchronized (f59717m) {
            try {
                d a5 = d.a(this.f59728a.n(), ProtectedSandApp.s("¡\u0001"));
                try {
                    this.f59730c.c(dVar);
                    if (a5 != null) {
                        a5.b();
                    }
                } catch (Throwable th) {
                    if (a5 != null) {
                        a5.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private /* synthetic */ void D() {
        E(false);
    }

    private static /* synthetic */ com.google.firebase.installations.local.b F(com.google.firebase.g gVar) {
        return new com.google.firebase.installations.local.b(gVar);
    }

    private void G() {
        String s4 = s();
        String s5 = ProtectedSandApp.s("\u009e\u0001");
        Preconditions.checkNotEmpty(s4, s5);
        Preconditions.checkNotEmpty(A(), ProtectedSandApp.s("\u009f\u0001"));
        String r4 = r();
        String s6 = ProtectedSandApp.s("\u009d\u0001");
        Preconditions.checkNotEmpty(r4, s6);
        Preconditions.checkArgument(t.h(s()), s5);
        Preconditions.checkArgument(t.g(r()), s6);
    }

    private String H(com.google.firebase.installations.local.d dVar) {
        if ((!this.f59728a.r().equals(ProtectedSandApp.s("¢\u0001")) && !this.f59728a.B()) || !dVar.m()) {
            return this.f59733f.a();
        }
        String f4 = u().f();
        return TextUtils.isEmpty(f4) ? this.f59733f.a() : f4;
    }

    private com.google.firebase.installations.local.d I(com.google.firebase.installations.local.d dVar) throws FirebaseInstallationsException {
        com.google.firebase.installations.remote.d d5 = this.f59729b.d(r(), dVar.d(), A(), s(), (dVar.d() == null || dVar.d().length() != 11) ? null : u().i());
        int i4 = c.f59743a[d5.e().ordinal()];
        if (i4 == 1) {
            return dVar.s(d5.c(), d5.d(), this.f59731d.b(), d5.b().c(), d5.b().d());
        }
        if (i4 == 2) {
            return dVar.q(ProtectedSandApp.s("£\u0001"));
        }
        throw new FirebaseInstallationsException(ProtectedSandApp.s("¤\u0001"), FirebaseInstallationsException.a.UNAVAILABLE);
    }

    private void J(Exception exc) {
        synchronized (this.f59734g) {
            try {
                Iterator<s> it = this.f59739l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void K(com.google.firebase.installations.local.d dVar) {
        synchronized (this.f59734g) {
            try {
                Iterator<s> it = this.f59739l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void L(String str) {
        this.f59737j = str;
    }

    private synchronized void M(com.google.firebase.installations.local.d dVar, com.google.firebase.installations.local.d dVar2) {
        if (this.f59738k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<z9.a> it = this.f59738k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    public static /* synthetic */ com.google.firebase.installations.local.b i(com.google.firebase.g gVar) {
        return new com.google.firebase.installations.local.b(gVar);
    }

    private Task<o> k() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m(new m(this.f59731d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> l() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m(new n(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void m(s sVar) {
        synchronized (this.f59734g) {
            this.f59739l.add(sVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void n() throws FirebaseInstallationsException {
        L(null);
        com.google.firebase.installations.local.d x4 = x();
        if (x4.k()) {
            this.f59729b.e(r(), x4.d(), A(), x4.f());
        }
        B(x4.r());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.local.d r0 = r2.x()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            com.google.firebase.installations.t r3 = r2.f59731d     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L65
        L1f:
            com.google.firebase.installations.local.d r3 = r2.q(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            goto L28
        L24:
            com.google.firebase.installations.local.d r3 = r2.I(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
        L28:
            r2.B(r3)
            r2.M(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.d()
            r2.L(r0)
        L3b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4c
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r0 = com.google.firebase.installations.FirebaseInstallationsException.a.BAD_CONFIG
            r3.<init>(r0)
            r2.J(r3)
            goto L64
        L4c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L61
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = " \u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r3.<init>(r0)
            r2.J(r3)
            goto L64
        L61:
            r2.K(r3)
        L64:
            return
        L65:
            r2.J(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.j.C(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void E(final boolean z4) {
        com.google.firebase.installations.local.d z5 = z();
        if (z4) {
            z5 = z5.p();
        }
        K(z5);
        this.f59736i.execute(new Runnable() { // from class: com.google.firebase.installations.f
            @Override // java.lang.Runnable
            public final void run() {
                j.this.C(z4);
            }
        });
    }

    private com.google.firebase.installations.local.d q(@o0 com.google.firebase.installations.local.d dVar) throws FirebaseInstallationsException {
        com.google.firebase.installations.remote.f f4 = this.f59729b.f(r(), dVar.d(), A(), dVar.f());
        int i4 = c.f59744b[f4.b().ordinal()];
        if (i4 == 1) {
            return dVar.o(f4.c(), f4.d(), this.f59731d.b());
        }
        if (i4 == 2) {
            return dVar.q(ProtectedSandApp.s("£\u0001"));
        }
        if (i4 != 3) {
            throw new FirebaseInstallationsException(ProtectedSandApp.s("¤\u0001"), FirebaseInstallationsException.a.UNAVAILABLE);
        }
        L(null);
        return dVar.r();
    }

    private synchronized String t() {
        return this.f59737j;
    }

    private com.google.firebase.installations.local.b u() {
        return this.f59732e.get();
    }

    @o0
    public static j v() {
        return w(com.google.firebase.g.p());
    }

    @o0
    public static j w(@o0 com.google.firebase.g gVar) {
        Preconditions.checkArgument(gVar != null, ProtectedSandApp.s("¥\u0001"));
        return (j) gVar.l(k.class);
    }

    /* JADX WARN: Finally extract failed */
    private com.google.firebase.installations.local.d x() {
        com.google.firebase.installations.local.d e4;
        synchronized (f59717m) {
            try {
                d a5 = d.a(this.f59728a.n(), ProtectedSandApp.s("¡\u0001"));
                try {
                    e4 = this.f59730c.e();
                    if (a5 != null) {
                        a5.b();
                    }
                } catch (Throwable th) {
                    if (a5 != null) {
                        a5.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e4;
    }

    /* JADX WARN: Finally extract failed */
    private com.google.firebase.installations.local.d z() {
        com.google.firebase.installations.local.d e4;
        synchronized (f59717m) {
            try {
                d a5 = d.a(this.f59728a.n(), ProtectedSandApp.s("¡\u0001"));
                try {
                    e4 = this.f59730c.e();
                    if (e4.j()) {
                        e4 = this.f59730c.c(e4.t(H(e4)));
                    }
                    if (a5 != null) {
                        a5.b();
                    }
                } catch (Throwable th) {
                    if (a5 != null) {
                        a5.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e4;
    }

    @q0
    String A() {
        return this.f59728a.s().n();
    }

    @Override // com.google.firebase.installations.k
    @o0
    public Task<String> a() {
        G();
        String t4 = t();
        if (t4 != null) {
            return Tasks.forResult(t4);
        }
        Task<String> l4 = l();
        this.f59735h.execute(new Runnable() { // from class: com.google.firebase.installations.g
            @Override // java.lang.Runnable
            public final void run() {
                j.this.E(false);
            }
        });
        return l4;
    }

    @Override // com.google.firebase.installations.k
    @o0
    public synchronized z9.b b(@o0 z9.a aVar) {
        this.f59738k.add(aVar);
        return new b(aVar);
    }

    @Override // com.google.firebase.installations.k
    @o0
    public Task<o> c(final boolean z4) {
        G();
        Task<o> k4 = k();
        this.f59735h.execute(new Runnable() { // from class: com.google.firebase.installations.i
            @Override // java.lang.Runnable
            public final void run() {
                j.this.E(z4);
            }
        });
        return k4;
    }

    @Override // com.google.firebase.installations.k
    @o0
    public Task<Void> d() {
        return Tasks.call(this.f59735h, new Callable() { // from class: com.google.firebase.installations.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void n4;
                n4 = j.this.n();
                return n4;
            }
        });
    }

    @q0
    String r() {
        return this.f59728a.s().i();
    }

    @m1
    String s() {
        return this.f59728a.s().j();
    }

    @m1
    String y() {
        return this.f59728a.r();
    }

    @SuppressLint({"ThreadPoolCreation"})
    j(ExecutorService executorService, Executor executor, com.google.firebase.g gVar, com.google.firebase.installations.remote.c cVar, com.google.firebase.installations.local.c cVar2, t tVar, u<com.google.firebase.installations.local.b> uVar, r rVar) {
        this.f59734g = new Object();
        this.f59738k = new HashSet();
        this.f59739l = new ArrayList();
        this.f59728a = gVar;
        this.f59729b = cVar;
        this.f59730c = cVar2;
        this.f59731d = tVar;
        this.f59732e = uVar;
        this.f59733f = rVar;
        this.f59735h = executorService;
        this.f59736i = executor;
    }
}
