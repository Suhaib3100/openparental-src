package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes2.dex */
public class s {

    /* renamed from: t, reason: collision with root package name */
    static final int f15697t = 1024;

    /* renamed from: u, reason: collision with root package name */
    static final int f15698u = 10;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f15700w = true;

    /* renamed from: x, reason: collision with root package name */
    static final int f15701x = 3;

    /* renamed from: a, reason: collision with root package name */
    private final Context f15704a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.g f15705b;

    /* renamed from: c, reason: collision with root package name */
    private final z f15706c;

    /* renamed from: f, reason: collision with root package name */
    private t f15709f;

    /* renamed from: g, reason: collision with root package name */
    private t f15710g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15711h;

    /* renamed from: i, reason: collision with root package name */
    private q f15712i;

    /* renamed from: j, reason: collision with root package name */
    private final d0 f15713j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.f f15714k;

    /* renamed from: l, reason: collision with root package name */
    @m1
    public final c2.b f15715l;

    /* renamed from: m, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.analytics.a f15716m;

    /* renamed from: n, reason: collision with root package name */
    private final ExecutorService f15717n;

    /* renamed from: o, reason: collision with root package name */
    private final n f15718o;

    /* renamed from: p, reason: collision with root package name */
    private final m f15719p;

    /* renamed from: q, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.a f15720q;

    /* renamed from: r, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.l f15721r;
    private static final String A = ProtectedSandApp.s("ᒌ");
    static final String B = ProtectedSandApp.s("ᒍ");

    /* renamed from: s, reason: collision with root package name */
    private static final String f15696s = ProtectedSandApp.s("ᒎ");

    /* renamed from: v, reason: collision with root package name */
    static final String f15699v = ProtectedSandApp.s("ᒏ");

    /* renamed from: y, reason: collision with root package name */
    private static final String f15702y = ProtectedSandApp.s("ᒐ");

    /* renamed from: z, reason: collision with root package name */
    private static final String f15703z = ProtectedSandApp.s("ᒑ");

    /* renamed from: e, reason: collision with root package name */
    private final long f15708e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final i0 f15707d = new i0();

    /* compiled from: CrashlyticsCore.java */
    class a implements Callable<Task<Void>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.j f15722a;

        a(com.google.firebase.crashlytics.internal.settings.j jVar) {
            this.f15722a = jVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            return s.this.i(this.f15722a);
        }
    }

    /* compiled from: CrashlyticsCore.java */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.j f15724o;

        b(com.google.firebase.crashlytics.internal.settings.j jVar) {
            this.f15724o = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.i(this.f15724o);
        }
    }

    /* compiled from: CrashlyticsCore.java */
    class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            try {
                boolean d6 = s.this.f15709f.d();
                if (!d6) {
                    com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᑵ"));
                }
                return Boolean.valueOf(d6);
            } catch (Exception e6) {
                com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᑶ"), e6);
                return Boolean.FALSE;
            }
        }
    }

    /* compiled from: CrashlyticsCore.java */
    class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            return Boolean.valueOf(s.this.f15712i.u());
        }
    }

    public s(com.google.firebase.g gVar, d0 d0Var, com.google.firebase.crashlytics.internal.a aVar, z zVar, c2.b bVar, com.google.firebase.crashlytics.internal.analytics.a aVar2, com.google.firebase.crashlytics.internal.persistence.f fVar, ExecutorService executorService, m mVar, com.google.firebase.crashlytics.internal.l lVar) {
        this.f15705b = gVar;
        this.f15706c = zVar;
        this.f15704a = gVar.n();
        this.f15713j = d0Var;
        this.f15720q = aVar;
        this.f15715l = bVar;
        this.f15716m = aVar2;
        this.f15717n = executorService;
        this.f15714k = fVar;
        this.f15718o = new n(executorService);
        this.f15719p = mVar;
        this.f15721r = lVar;
    }

    private void d() {
        try {
            this.f15711h = Boolean.TRUE.equals((Boolean) c1.f(this.f15718o.h(new d())));
        } catch (Exception unused) {
            this.f15711h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> i(com.google.firebase.crashlytics.internal.settings.j jVar) {
        String s5 = ProtectedSandApp.s("ᑷ");
        s();
        try {
            this.f15715l.a(new c2.a() { // from class: com.google.firebase.crashlytics.internal.common.r
                @Override // c2.a
                public final void a(String str) {
                    s.this.o(str);
                }
            });
            this.f15712i.X();
            if (!jVar.b().f16369b.f16376a) {
                com.google.firebase.crashlytics.internal.g.f().b(s5);
                return Tasks.forException(new RuntimeException(s5));
            }
            if (!this.f15712i.B(jVar)) {
                com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᑸ"));
            }
            return this.f15712i.d0(jVar.a());
        } catch (Exception e6) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᑹ"), e6);
            return Tasks.forException(e6);
        } finally {
            r();
        }
    }

    private void k(com.google.firebase.crashlytics.internal.settings.j jVar) {
        Future<?> submit = this.f15717n.submit(new b(jVar));
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᑺ"));
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e6) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᑽ"), e6);
        } catch (ExecutionException e7) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᑼ"), e7);
        } catch (TimeoutException e8) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᑻ"), e8);
        }
    }

    public static String m() {
        return ProtectedSandApp.s("ᑾ");
    }

    static boolean n(String str, boolean z5) {
        if (!z5) {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᑿ"));
            return f15700w;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f15700w;
    }

    @androidx.annotation.o0
    public Task<Boolean> e() {
        return this.f15712i.o();
    }

    public Task<Void> f() {
        return this.f15712i.t();
    }

    public boolean g() {
        return this.f15711h;
    }

    boolean h() {
        return this.f15709f.c();
    }

    public Task<Void> j(com.google.firebase.crashlytics.internal.settings.j jVar) {
        return c1.h(this.f15717n, new a(jVar));
    }

    q l() {
        return this.f15712i;
    }

    public void o(String str) {
        this.f15712i.h0(System.currentTimeMillis() - this.f15708e, str);
    }

    public void p(@androidx.annotation.o0 Throwable th) {
        this.f15712i.g0(Thread.currentThread(), th);
    }

    public void q(Throwable th) {
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᒀ") + this.f15707d.b());
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᒁ") + this.f15707d.a());
        this.f15712i.b0(ProtectedSandApp.s("ᒂ"), Integer.toString(this.f15707d.b()));
        this.f15712i.b0(ProtectedSandApp.s("ᒃ"), Integer.toString(this.f15707d.a()));
        this.f15712i.S(Thread.currentThread(), th);
    }

    void r() {
        this.f15718o.h(new c());
    }

    void s() {
        this.f15718o.b();
        this.f15709f.a();
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᒄ"));
    }

    public boolean t(com.google.firebase.crashlytics.internal.common.a aVar, com.google.firebase.crashlytics.internal.settings.j jVar) {
        if (!n(aVar.f15542b, i.i(this.f15704a, ProtectedSandApp.s("ᒅ"), f15700w))) {
            throw new IllegalStateException(ProtectedSandApp.s("ᒋ"));
        }
        String hVar = new h(this.f15713j).toString();
        try {
            this.f15710g = new t(ProtectedSandApp.s("ᒆ"), this.f15714k);
            this.f15709f = new t(ProtectedSandApp.s("ᒇ"), this.f15714k);
            com.google.firebase.crashlytics.internal.metadata.n nVar = new com.google.firebase.crashlytics.internal.metadata.n(hVar, this.f15714k, this.f15718o);
            com.google.firebase.crashlytics.internal.metadata.e eVar = new com.google.firebase.crashlytics.internal.metadata.e(this.f15714k);
            e2.a aVar2 = new e2.a(1024, new e2.c(10));
            this.f15721r.c(nVar);
            this.f15712i = new q(this.f15704a, this.f15718o, this.f15713j, this.f15706c, this.f15714k, this.f15710g, aVar, nVar, eVar, v0.m(this.f15704a, this.f15713j, this.f15714k, aVar, eVar, nVar, aVar2, jVar, this.f15707d, this.f15719p), this.f15720q, this.f15716m, this.f15719p);
            boolean h5 = h();
            d();
            this.f15712i.z(hVar, Thread.getDefaultUncaughtExceptionHandler(), jVar);
            if (!h5 || !i.d(this.f15704a)) {
                com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᒉ"));
                return f15700w;
            }
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᒈ"));
            k(jVar);
            return false;
        } catch (Exception e6) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᒊ"), e6);
            this.f15712i = null;
            return false;
        }
    }

    public Task<Void> u() {
        return this.f15712i.Y();
    }

    public void v(@androidx.annotation.q0 Boolean bool) {
        this.f15706c.h(bool);
    }

    public void w(String str, String str2) {
        this.f15712i.Z(str, str2);
    }

    public void x(Map<String, String> map) {
        this.f15712i.a0(map);
    }

    public void y(String str, String str2) {
        this.f15712i.b0(str, str2);
    }

    public void z(String str) {
        this.f15712i.c0(str);
    }
}
