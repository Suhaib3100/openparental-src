package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.b1;
import com.google.firebase.messaging.f1;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x9.a;

/* loaded from: classes6.dex */
public class FirebaseMessaging {

    /* renamed from: r, reason: collision with root package name */
    private static final long f59887r = 30;

    /* renamed from: u, reason: collision with root package name */
    @androidx.annotation.b0("FirebaseMessaging.class")
    private static f1 f59890u;

    /* renamed from: w, reason: collision with root package name */
    @androidx.annotation.b0("FirebaseMessaging.class")
    @androidx.annotation.m1
    static ScheduledExecutorService f59892w;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.g f59893a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private final x9.a f59894b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f59895c;

    /* renamed from: d, reason: collision with root package name */
    private final j0 f59896d;

    /* renamed from: e, reason: collision with root package name */
    private final b1 f59897e;

    /* renamed from: f, reason: collision with root package name */
    private final a f59898f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f59899g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f59900h;

    /* renamed from: i, reason: collision with root package name */
    private final Task<k1> f59901i;

    /* renamed from: j, reason: collision with root package name */
    private final p0 f59902j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f59903k;

    /* renamed from: l, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f59904l;

    /* renamed from: p, reason: collision with root package name */
    private static final String f59885p = ProtectedSandApp.s("ň\u0001");

    /* renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final String f59886q = ProtectedSandApp.s("ŉ\u0001");

    /* renamed from: t, reason: collision with root package name */
    private static final String f59889t = "";

    /* renamed from: m, reason: collision with root package name */
    static final String f59882m = ProtectedSandApp.s("Ŋ\u0001");

    /* renamed from: n, reason: collision with root package name */
    static final String f59883n = ProtectedSandApp.s("ŋ\u0001");

    /* renamed from: o, reason: collision with root package name */
    private static final String f59884o = ProtectedSandApp.s("Ō\u0001");

    /* renamed from: s, reason: collision with root package name */
    private static final long f59888s = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: v, reason: collision with root package name */
    @androidx.annotation.m1
    static y9.b<com.google.android.datatransport.m> f59891v = new y();

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: f, reason: collision with root package name */
        private static final String f59905f = ProtectedSandApp.s("Ņ\u0001");

        /* renamed from: g, reason: collision with root package name */
        private static final String f59906g = ProtectedSandApp.s("ņ\u0001");

        /* renamed from: h, reason: collision with root package name */
        private static final String f59907h = ProtectedSandApp.s("Ň\u0001");

        /* renamed from: a, reason: collision with root package name */
        private final v9.d f59908a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.b0("this")
        private boolean f59909b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        @androidx.annotation.b0("this")
        private v9.b<com.google.firebase.c> f59910c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        @androidx.annotation.b0("this")
        private Boolean f59911d;

        a(v9.d dVar) {
            this.f59908a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(v9.a aVar) {
            if (c()) {
                FirebaseMessaging.this.h0();
            }
        }

        @androidx.annotation.q0
        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            String s4 = ProtectedSandApp.s("Ņ\u0001");
            Context n4 = FirebaseMessaging.this.f59893a.n();
            SharedPreferences sharedPreferences = n4.getSharedPreferences(ProtectedSandApp.s("ņ\u0001"), 0);
            String s5 = ProtectedSandApp.s("Ň\u0001");
            if (sharedPreferences.contains(s5)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(s5, false));
            }
            try {
                PackageManager packageManager = n4.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(n4.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(s4)) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(s4));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f59909b) {
                    return;
                }
                Boolean e4 = e();
                this.f59911d = e4;
                if (e4 == null) {
                    v9.b<com.google.firebase.c> bVar = new v9.b() { // from class: com.google.firebase.messaging.g0
                        @Override // v9.b
                        public final void a(v9.a aVar) {
                            FirebaseMessaging.a.this.d(aVar);
                        }
                    };
                    this.f59910c = bVar;
                    this.f59908a.a(com.google.firebase.c.class, bVar);
                }
                this.f59909b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f59911d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f59893a.A();
        }

        synchronized void f(boolean z4) {
            try {
                b();
                v9.b<com.google.firebase.c> bVar = this.f59910c;
                if (bVar != null) {
                    this.f59908a.c(com.google.firebase.c.class, bVar);
                    this.f59910c = null;
                }
                SharedPreferences.Editor edit = FirebaseMessaging.this.f59893a.n().getSharedPreferences(ProtectedSandApp.s("ņ\u0001"), 0).edit();
                edit.putBoolean(ProtectedSandApp.s("Ň\u0001"), z4);
                edit.apply();
                if (z4) {
                    FirebaseMessaging.this.h0();
                }
                this.f59911d = Boolean.valueOf(z4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    FirebaseMessaging(com.google.firebase.g gVar, @androidx.annotation.q0 x9.a aVar, y9.b<com.google.firebase.platforminfo.i> bVar, y9.b<com.google.firebase.heartbeatinfo.k> bVar2, com.google.firebase.installations.k kVar, y9.b<com.google.android.datatransport.m> bVar3, v9.d dVar) {
        this(gVar, aVar, bVar, bVar2, kVar, bVar3, dVar, new p0(gVar.n()));
    }

    private String A() {
        return ProtectedSandApp.s("ō\u0001").equals(this.f59893a.r()) ? "" : this.f59893a.t();
    }

    @androidx.annotation.q0
    public static com.google.android.datatransport.m E() {
        return f59891v.get();
    }

    private void F() {
        this.f59896d.f().addOnSuccessListener(this.f59899g, new OnSuccessListener() { // from class: com.google.firebase.messaging.c0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.R((CloudMessage) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void V() {
        v0.c(this.f59895c);
        x0.g(this.f59895c, this.f59896d, f0());
        if (f0()) {
            F();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void S(String str) {
        if (ProtectedSandApp.s("ō\u0001").equals(this.f59893a.r())) {
            if (Log.isLoggable(ProtectedSandApp.s("Ŋ\u0001"), 3)) {
                this.f59893a.r();
            }
            Intent intent = new Intent(ProtectedSandApp.s("Ŏ\u0001"));
            intent.putExtra(ProtectedSandApp.s("ŏ\u0001"), str);
            new n(this.f59895c).k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task L(String str, f1.a aVar, String str2) throws Exception {
        z(this.f59895c).g(A(), str, str2, this.f59902j.a());
        if (aVar == null || !str2.equals(aVar.f60127a)) {
            S(str2);
        }
        return Tasks.forResult(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task M(final String str, final f1.a aVar) {
        return this.f59896d.g().onSuccessTask(this.f59900h, new SuccessContinuation() { // from class: com.google.firebase.messaging.z
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task L;
                L = FirebaseMessaging.this.L(str, aVar, (String) obj);
                return L;
            }
        });
    }

    private static /* synthetic */ com.google.android.datatransport.m N() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(TaskCompletionSource taskCompletionSource) {
        try {
            this.f59894b.c(p0.c(this.f59893a), ProtectedSandApp.s("ŉ\u0001"));
            taskCompletionSource.setResult(null);
        } catch (Exception e4) {
            taskCompletionSource.setException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.f59896d.c());
            z(this.f59895c).d(A(), p0.c(this.f59893a));
            taskCompletionSource.setResult(null);
        } catch (Exception e4) {
            taskCompletionSource.setException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(r());
        } catch (Exception e4) {
            taskCompletionSource.setException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(CloudMessage cloudMessage) {
        if (cloudMessage != null) {
            n0.y(cloudMessage.getIntent());
            F();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        if (I()) {
            h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(k1 k1Var) {
        if (I()) {
            k1Var.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(Void r32) {
        x0.g(this.f59895c, this.f59896d, f0());
    }

    private static /* synthetic */ com.google.android.datatransport.m X() {
        return null;
    }

    private boolean f0() {
        v0.c(this.f59895c);
        if (!v0.d(this.f59895c)) {
            return false;
        }
        if (this.f59893a.l(com.google.firebase.analytics.connector.a.class) != null) {
            return true;
        }
        return n0.a() && f59891v != null;
    }

    private synchronized void g0() {
        if (!this.f59903k) {
            j0(0L);
        }
    }

    @Keep
    @androidx.annotation.o0
    static synchronized FirebaseMessaging getInstance(@androidx.annotation.o0 com.google.firebase.g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.l(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, ProtectedSandApp.s("Ő\u0001"));
        }
        return firebaseMessaging;
    }

    public static /* synthetic */ com.google.android.datatransport.m h() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        x9.a aVar = this.f59894b;
        if (aVar != null) {
            aVar.b();
        } else if (k0(C())) {
            g0();
        }
    }

    public static /* synthetic */ com.google.android.datatransport.m k() {
        return null;
    }

    @androidx.annotation.m1
    static synchronized void s() {
        synchronized (FirebaseMessaging.class) {
            f59890u = null;
        }
    }

    static void t() {
        f59891v = new x();
    }

    @androidx.annotation.o0
    public static synchronized FirebaseMessaging y() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(com.google.firebase.g.p());
        }
        return firebaseMessaging;
    }

    @androidx.annotation.o0
    private static synchronized f1 z(Context context) {
        f1 f1Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f59890u == null) {
                    f59890u = new f1(context);
                }
                f1Var = f59890u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1Var;
    }

    @androidx.annotation.o0
    public Task<String> B() {
        x9.a aVar = this.f59894b;
        if (aVar != null) {
            return aVar.d();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f59899g.execute(new Runnable() { // from class: com.google.firebase.messaging.b0
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.Q(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @androidx.annotation.q0
    @androidx.annotation.m1
    f1.a C() {
        return z(this.f59895c).e(A(), p0.c(this.f59893a));
    }

    Task<k1> D() {
        return this.f59901i;
    }

    public boolean I() {
        return this.f59898f.c();
    }

    @androidx.annotation.m1
    boolean J() {
        return this.f59902j.g();
    }

    public boolean K() {
        return v0.d(this.f59895c);
    }

    @Deprecated
    public void a0(@androidx.annotation.o0 RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.getTo())) {
            throw new IllegalArgumentException(ProtectedSandApp.s("œ\u0001"));
        }
        Intent intent = new Intent(ProtectedSandApp.s("Ō\u0001"));
        Intent intent2 = new Intent();
        intent2.setPackage(ProtectedSandApp.s("ő\u0001"));
        intent.putExtra(ProtectedSandApp.s("ň\u0001"), PendingIntent.getBroadcast(this.f59895c, 0, intent2, androidx.core.view.accessibility.b.f26943s));
        intent.setPackage(ProtectedSandApp.s("ŋ\u0001"));
        remoteMessage.f(intent);
        this.f59895c.sendOrderedBroadcast(intent, ProtectedSandApp.s("Œ\u0001"));
    }

    public void b0(boolean z4) {
        this.f59898f.f(z4);
    }

    public void c0(boolean z4) {
        n0.B(z4);
        x0.g(this.f59895c, this.f59896d, f0());
    }

    @androidx.annotation.o0
    public Task<Void> d0(boolean z4) {
        return v0.f(this.f59899g, this.f59895c, z4).addOnSuccessListener(new androidx.credentials.k(), new OnSuccessListener() { // from class: com.google.firebase.messaging.a0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.W((Void) obj);
            }
        });
    }

    synchronized void e0(boolean z4) {
        this.f59903k = z4;
    }

    @androidx.annotation.o0
    @SuppressLint({"TaskMainThread"})
    public Task<Void> i0(@androidx.annotation.o0 final String str) {
        return this.f59901i.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.r
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task s4;
                s4 = ((k1) obj).s(str);
                return s4;
            }
        });
    }

    synchronized void j0(long j4) {
        w(new g1(this, Math.min(Math.max(f59887r, 2 * j4), f59888s)), j4);
        this.f59903k = true;
    }

    @androidx.annotation.m1
    boolean k0(@androidx.annotation.q0 f1.a aVar) {
        return aVar == null || aVar.b(this.f59902j.a());
    }

    @androidx.annotation.o0
    @SuppressLint({"TaskMainThread"})
    public Task<Void> l0(@androidx.annotation.o0 final String str) {
        return this.f59901i.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.d0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task v4;
                v4 = ((k1) obj).v(str);
                return v4;
            }
        });
    }

    String r() throws IOException {
        x9.a aVar = this.f59894b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.d());
            } catch (InterruptedException | ExecutionException e4) {
                throw new IOException(e4);
            }
        }
        final f1.a C = C();
        if (!k0(C)) {
            return C.f60127a;
        }
        final String c5 = p0.c(this.f59893a);
        try {
            return (String) Tasks.await(this.f59897e.b(c5, new b1.a() { // from class: com.google.firebase.messaging.e0
                @Override // com.google.firebase.messaging.b1.a
                public final Task start() {
                    Task M;
                    M = FirebaseMessaging.this.M(c5, C);
                    return M;
                }
            }));
        } catch (InterruptedException | ExecutionException e5) {
            throw new IOException(e5);
        }
    }

    @androidx.annotation.o0
    public Task<Void> u() {
        if (this.f59894b != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f59899g.execute(new Runnable() { // from class: com.google.firebase.messaging.f0
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.O(taskCompletionSource);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (C() == null) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        o.f().execute(new Runnable() { // from class: com.google.firebase.messaging.s
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.P(taskCompletionSource2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @androidx.annotation.o0
    public boolean v() {
        return n0.a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    void w(Runnable runnable, long j4) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f59892w == null) {
                    f59892w = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(ProtectedSandApp.s("Ŕ\u0001")));
                }
                f59892w.schedule(runnable, j4, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    Context x() {
        return this.f59895c;
    }

    FirebaseMessaging(com.google.firebase.g gVar, @androidx.annotation.q0 x9.a aVar, y9.b<com.google.firebase.platforminfo.i> bVar, y9.b<com.google.firebase.heartbeatinfo.k> bVar2, com.google.firebase.installations.k kVar, y9.b<com.google.android.datatransport.m> bVar3, v9.d dVar, p0 p0Var) {
        this(gVar, aVar, bVar3, dVar, p0Var, new j0(gVar, p0Var, bVar, bVar2, kVar), o.h(), o.d(), o.c());
    }

    FirebaseMessaging(com.google.firebase.g gVar, @androidx.annotation.q0 x9.a aVar, y9.b<com.google.android.datatransport.m> bVar, v9.d dVar, p0 p0Var, j0 j0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f59903k = false;
        f59891v = bVar;
        this.f59893a = gVar;
        this.f59894b = aVar;
        this.f59898f = new a(dVar);
        Context n4 = gVar.n();
        this.f59895c = n4;
        q qVar = new q();
        this.f59904l = qVar;
        this.f59902j = p0Var;
        this.f59896d = j0Var;
        this.f59897e = new b1(executor);
        this.f59899g = executor2;
        this.f59900h = executor3;
        Context n5 = gVar.n();
        if (n5 instanceof Application) {
            ((Application) n5).registerActivityLifecycleCallbacks(qVar);
        } else {
            Objects.toString(n5);
        }
        if (aVar != null) {
            aVar.e(new a.InterfaceC1405a() { // from class: com.google.firebase.messaging.t
                @Override // x9.a.InterfaceC1405a
                public final void a(String str) {
                    FirebaseMessaging.this.S(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.T();
            }
        });
        Task<k1> f4 = k1.f(this, p0Var, j0Var, n4, o.i());
        this.f59901i = f4;
        f4.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.v
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.U((k1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.V();
            }
        });
    }
}
