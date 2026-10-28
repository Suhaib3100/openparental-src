package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes6.dex */
public class c0 {

    /* renamed from: s, reason: collision with root package name */
    static final int f58636s = 1024;

    /* renamed from: t, reason: collision with root package name */
    static final int f58637t = 10;

    /* renamed from: v, reason: collision with root package name */
    static final boolean f58639v = true;

    /* renamed from: w, reason: collision with root package name */
    static final int f58640w = 3;

    /* renamed from: a, reason: collision with root package name */
    private final Context f58644a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.g f58645b;

    /* renamed from: c, reason: collision with root package name */
    private final i0 f58646c;

    /* renamed from: f, reason: collision with root package name */
    private d0 f58649f;

    /* renamed from: g, reason: collision with root package name */
    private d0 f58650g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f58651h;

    /* renamed from: i, reason: collision with root package name */
    private p f58652i;

    /* renamed from: j, reason: collision with root package name */
    private final n0 f58653j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f58654k;

    /* renamed from: l, reason: collision with root package name */
    @m1
    public final m9.b f58655l;

    /* renamed from: m, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.analytics.a f58656m;

    /* renamed from: n, reason: collision with root package name */
    private final m f58657n;

    /* renamed from: o, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.a f58658o;

    /* renamed from: p, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.l f58659p;

    /* renamed from: q, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.concurrency.k f58660q;
    static final String A = ProtectedSandApp.s("ﯩ");

    /* renamed from: r, reason: collision with root package name */
    private static final String f58635r = ProtectedSandApp.s("ﯮ");

    /* renamed from: u, reason: collision with root package name */
    static final String f58638u = ProtectedSandApp.s("ﯨ");

    /* renamed from: x, reason: collision with root package name */
    private static final String f58641x = ProtectedSandApp.s("ﯘ");

    /* renamed from: y, reason: collision with root package name */
    private static final String f58642y = ProtectedSandApp.s("ﯙ");

    /* renamed from: z, reason: collision with root package name */
    private static final String f58643z = ProtectedSandApp.s("ﯪ");

    /* renamed from: e, reason: collision with root package name */
    private final long f58648e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final s0 f58647d = new s0();

    public c0(com.google.firebase.g gVar, n0 n0Var, com.google.firebase.crashlytics.internal.a aVar, i0 i0Var, m9.b bVar, com.google.firebase.crashlytics.internal.analytics.a aVar2, com.google.firebase.crashlytics.internal.persistence.g gVar2, m mVar, com.google.firebase.crashlytics.internal.l lVar, com.google.firebase.crashlytics.internal.concurrency.k kVar) {
        this.f58645b = gVar;
        this.f58646c = i0Var;
        this.f58644a = gVar.n();
        this.f58653j = n0Var;
        this.f58658o = aVar;
        this.f58655l = bVar;
        this.f58656m = aVar2;
        this.f58654k = gVar2;
        this.f58657n = mVar;
        this.f58659p = lVar;
        this.f58660q = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(long j4, String str) {
        this.f58652i.g0(j4, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(final long j4, final String str) {
        this.f58660q.diskWrite.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.z
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.A(j4, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Throwable th) {
        this.f58652i.f0(Thread.currentThread(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Throwable th) {
        this.f58652i.a0(ProtectedSandApp.s("ﯘ"), Integer.toString(this.f58647d.b()));
        this.f58652i.a0(ProtectedSandApp.s("ﯙ"), Integer.toString(this.f58647d.a()));
        this.f58652i.R(Thread.currentThread(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(String str, String str2) {
        this.f58652i.Y(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(Map map) {
        this.f58652i.Z(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(String str, String str2) {
        this.f58652i.a0(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(String str) {
        this.f58652i.b0(str);
    }

    private void l() {
        try {
            this.f58651h = Boolean.TRUE.equals((Boolean) this.f58660q.common.i().submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.a0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean x4;
                    x4 = c0.this.x();
                    return x4;
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f58651h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void z(com.google.firebase.crashlytics.internal.settings.k kVar) {
        String s4 = ProtectedSandApp.s("ﯚ");
        com.google.firebase.crashlytics.internal.concurrency.k.c();
        M();
        try {
            try {
                this.f58655l.a(new m9.a() { // from class: com.google.firebase.crashlytics.internal.common.u
                    @Override // m9.a
                    public final void a(String str) {
                        c0.this.I(str);
                    }
                });
                this.f58652i.W();
            } catch (Exception e4) {
                com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﯜ"), e4);
            }
            if (!kVar.b().f59495b.f59502a) {
                com.google.firebase.crashlytics.internal.g.f().b(s4);
                throw new RuntimeException(s4);
            }
            if (!this.f58652i.A(kVar)) {
                com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﯛ"));
            }
            this.f58652i.c0(kVar.a());
            L();
        } catch (Throwable th) {
            L();
            throw th;
        }
    }

    private void s(final com.google.firebase.crashlytics.internal.settings.k kVar) {
        Future<?> submit = this.f58660q.common.i().submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.s
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.z(kVar);
            }
        });
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﯝ"));
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﯠ"), e4);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e5) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﯟ"), e5);
        } catch (TimeoutException e6) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﯞ"), e6);
        }
    }

    public static String u() {
        return ProtectedSandApp.s("ﯡ");
    }

    static boolean v(String str, boolean z4) {
        if (z4) {
            return !TextUtils.isEmpty(str);
        }
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﯢ"));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean x() throws Exception {
        return Boolean.valueOf(this.f58652i.t());
    }

    public void I(final String str) {
        final long currentTimeMillis = System.currentTimeMillis() - this.f58648e;
        this.f58660q.common.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.b0
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.B(currentTimeMillis, str);
            }
        });
    }

    public void J(@androidx.annotation.o0 final Throwable th) {
        this.f58660q.common.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.t
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.C(th);
            }
        });
    }

    public void K(final Throwable th) {
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﯣ") + this.f58647d.b());
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﯤ") + this.f58647d.a());
        this.f58660q.common.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.v
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.D(th);
            }
        });
    }

    void L() {
        com.google.firebase.crashlytics.internal.concurrency.k.c();
        try {
            if (this.f58649f.d()) {
                return;
            }
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﯥ"));
        } catch (Exception e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﯦ"), e4);
        }
    }

    void M() {
        com.google.firebase.crashlytics.internal.concurrency.k.c();
        this.f58649f.a();
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﯧ"));
    }

    public boolean N(a aVar, com.google.firebase.crashlytics.internal.settings.k kVar) {
        if (!v(aVar.f58618b, i.i(this.f58644a, ProtectedSandApp.s("ﯨ"), true))) {
            throw new IllegalStateException(ProtectedSandApp.s("ﯮ"));
        }
        String c5 = new h().c();
        try {
            this.f58650g = new d0(ProtectedSandApp.s("ﯩ"), this.f58654k);
            this.f58649f = new d0(ProtectedSandApp.s("ﯪ"), this.f58654k);
            com.google.firebase.crashlytics.internal.metadata.o oVar = new com.google.firebase.crashlytics.internal.metadata.o(c5, this.f58654k, this.f58660q);
            com.google.firebase.crashlytics.internal.metadata.e eVar = new com.google.firebase.crashlytics.internal.metadata.e(this.f58654k);
            o9.a aVar2 = new o9.a(1024, new o9.c(10));
            this.f58659p.c(oVar);
            this.f58652i = new p(this.f58644a, this.f58653j, this.f58646c, this.f58654k, this.f58650g, aVar, oVar, eVar, f1.j(this.f58644a, this.f58653j, this.f58654k, aVar, eVar, oVar, aVar2, kVar, this.f58647d, this.f58657n, this.f58660q), this.f58658o, this.f58656m, this.f58657n, this.f58660q);
            boolean p4 = p();
            l();
            this.f58652i.y(c5, Thread.getDefaultUncaughtExceptionHandler(), kVar);
            if (!p4 || !i.d(this.f58644a)) {
                com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﯬ"));
                return true;
            }
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﯫ"));
            s(kVar);
            return false;
        } catch (Exception e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﯭ"), e4);
            this.f58652i = null;
            return false;
        }
    }

    public Task<Void> O() {
        return this.f58652i.X();
    }

    public void P(@androidx.annotation.q0 Boolean bool) {
        this.f58646c.h(bool);
    }

    public void Q(final String str, final String str2) {
        this.f58660q.common.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.x
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.E(str, str2);
            }
        });
    }

    public void R(final Map<String, String> map) {
        this.f58660q.common.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.r
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.F(map);
            }
        });
    }

    public void S(final String str, final String str2) {
        this.f58660q.common.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.y
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.G(str, str2);
            }
        });
    }

    public void T(final String str) {
        this.f58660q.common.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.w
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.H(str);
            }
        });
    }

    @androidx.annotation.o0
    public Task<Boolean> m() {
        return this.f58652i.n();
    }

    public Task<Void> n() {
        return this.f58652i.s();
    }

    public boolean o() {
        return this.f58651h;
    }

    boolean p() {
        return this.f58649f.c();
    }

    @f9.a
    public Task<Void> r(final com.google.firebase.crashlytics.internal.settings.k kVar) {
        return this.f58660q.common.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.q
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.z(kVar);
            }
        });
    }

    p t() {
        return this.f58652i;
    }

    public boolean w() {
        return this.f58646c.d();
    }
}
