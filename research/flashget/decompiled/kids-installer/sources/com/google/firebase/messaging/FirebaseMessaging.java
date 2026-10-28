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
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.v0;
import com.google.firebase.messaging.z0;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n2.a;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: t, reason: collision with root package name */
    private static final long f17012t = 30;

    /* renamed from: w, reason: collision with root package name */
    @androidx.annotation.b0("FirebaseMessaging.class")
    private static z0 f17015w;

    /* renamed from: x, reason: collision with root package name */
    @androidx.annotation.q0
    @SuppressLint({"FirebaseUnknownNullness"})
    @androidx.annotation.m1
    static com.google.android.datatransport.i f17016x;

    /* renamed from: y, reason: collision with root package name */
    @androidx.annotation.b0("FirebaseMessaging.class")
    @androidx.annotation.m1
    static ScheduledExecutorService f17017y;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.g f17018a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private final n2.a f17019b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.installations.k f17020c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f17021d;

    /* renamed from: e, reason: collision with root package name */
    private final f0 f17022e;

    /* renamed from: f, reason: collision with root package name */
    private final v0 f17023f;

    /* renamed from: g, reason: collision with root package name */
    private final a f17024g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f17025h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f17026i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f17027j;

    /* renamed from: k, reason: collision with root package name */
    private final Task<e1> f17028k;

    /* renamed from: l, reason: collision with root package name */
    private final k0 f17029l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f17030m;

    /* renamed from: n, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f17031n;

    /* renamed from: p, reason: collision with root package name */
    static final String f17008p = ProtectedSandApp.s("ᛞ");

    /* renamed from: q, reason: collision with root package name */
    private static final String f17009q = ProtectedSandApp.s("ᛟ");

    /* renamed from: r, reason: collision with root package name */
    private static final String f17010r = ProtectedSandApp.s("ᛠ");

    /* renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final String f17011s = ProtectedSandApp.s("ᛡ");

    /* renamed from: v, reason: collision with root package name */
    private static final String f17014v = "";

    /* renamed from: o, reason: collision with root package name */
    static final String f17007o = ProtectedSandApp.s("ᛢ");

    /* renamed from: u, reason: collision with root package name */
    private static final long f17013u = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: f, reason: collision with root package name */
        private static final String f17032f = ProtectedSandApp.s("ᛛ");

        /* renamed from: g, reason: collision with root package name */
        private static final String f17033g = ProtectedSandApp.s("ᛜ");

        /* renamed from: h, reason: collision with root package name */
        private static final String f17034h = ProtectedSandApp.s("ᛝ");

        /* renamed from: a, reason: collision with root package name */
        private final l2.d f17035a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.b0("this")
        private boolean f17036b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        @androidx.annotation.b0("this")
        private l2.b<com.google.firebase.c> f17037c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        @androidx.annotation.b0("this")
        private Boolean f17038d;

        a(l2.d dVar) {
            this.f17035a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(l2.a aVar) {
            if (c()) {
                FirebaseMessaging.this.W();
            }
        }

        @androidx.annotation.q0
        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            String s5 = ProtectedSandApp.s("ᛖ");
            Context n5 = FirebaseMessaging.this.f17018a.n();
            SharedPreferences sharedPreferences = n5.getSharedPreferences(ProtectedSandApp.s("ᛗ"), 0);
            String s6 = ProtectedSandApp.s("ᛘ");
            if (sharedPreferences.contains(s6)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(s6, false));
            }
            try {
                PackageManager packageManager = n5.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(n5.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(s5)) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(s5));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            if (this.f17036b) {
                return;
            }
            Boolean e6 = e();
            this.f17038d = e6;
            if (e6 == null) {
                l2.b<com.google.firebase.c> bVar = new l2.b() { // from class: com.google.firebase.messaging.c0
                    @Override // l2.b
                    public final void a(l2.a aVar) {
                        FirebaseMessaging.a.this.d(aVar);
                    }
                };
                this.f17037c = bVar;
                this.f17035a.a(com.google.firebase.c.class, bVar);
            }
            this.f17036b = true;
        }

        synchronized boolean c() {
            Boolean bool;
            b();
            bool = this.f17038d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f17018a.A();
        }

        synchronized void f(boolean z5) {
            b();
            l2.b<com.google.firebase.c> bVar = this.f17037c;
            if (bVar != null) {
                this.f17035a.d(com.google.firebase.c.class, bVar);
                this.f17037c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.f17018a.n().getSharedPreferences(ProtectedSandApp.s("ᛙ"), 0).edit();
            edit.putBoolean(ProtectedSandApp.s("ᛚ"), z5);
            edit.apply();
            if (z5) {
                FirebaseMessaging.this.W();
            }
            this.f17038d = Boolean.valueOf(z5);
        }
    }

    FirebaseMessaging(com.google.firebase.g gVar, @androidx.annotation.q0 n2.a aVar, o2.b<com.google.firebase.platforminfo.i> bVar, o2.b<com.google.firebase.heartbeatinfo.k> bVar2, com.google.firebase.installations.k kVar, @androidx.annotation.q0 com.google.android.datatransport.i iVar, l2.d dVar) {
        this(gVar, aVar, bVar, bVar2, kVar, iVar, dVar, new k0(gVar.n()));
    }

    @androidx.annotation.q0
    public static com.google.android.datatransport.i A() {
        return f17016x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void K(String str) {
        if (ProtectedSandApp.s("ᛣ").equals(this.f17018a.r())) {
            if (Log.isLoggable(ProtectedSandApp.s("ᛤ"), 3)) {
                this.f17018a.r();
            }
            Intent intent = new Intent(ProtectedSandApp.s("ᛥ"));
            intent.putExtra(ProtectedSandApp.s("ᛦ"), str);
            new n(this.f17021d).k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task F(final String str, final z0.a aVar) {
        return this.f17022e.f().onSuccessTask(this.f17027j, new SuccessContinuation() { // from class: com.google.firebase.messaging.s
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task G;
                G = FirebaseMessaging.this.G(str, aVar, (String) obj);
                return G;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task G(String str, z0.a aVar, String str2) throws Exception {
        v(this.f17021d).g(w(), str, str2, this.f17029l.a());
        if (aVar == null || !str2.equals(aVar.f17669a)) {
            K(str2);
        }
        return Tasks.forResult(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(TaskCompletionSource taskCompletionSource) {
        try {
            this.f17019b.a(k0.c(this.f17018a), ProtectedSandApp.s("ᛧ"));
            taskCompletionSource.setResult(null);
        } catch (Exception e6) {
            taskCompletionSource.setException(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.f17022e.c());
            v(this.f17021d).d(w(), k0.c(this.f17018a));
            taskCompletionSource.setResult(null);
        } catch (Exception e6) {
            taskCompletionSource.setException(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(n());
        } catch (Exception e6) {
            taskCompletionSource.setException(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        if (C()) {
            W();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(e1 e1Var) {
        if (C()) {
            e1Var.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        q0.c(this.f17021d);
    }

    private synchronized void V() {
        if (!this.f17030m) {
            Y(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        n2.a aVar = this.f17019b;
        if (aVar != null) {
            aVar.d();
        } else if (Z(y())) {
            V();
        }
    }

    @Keep
    @androidx.annotation.o0
    static synchronized FirebaseMessaging getInstance(@androidx.annotation.o0 com.google.firebase.g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.l(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, ProtectedSandApp.s("ᛨ"));
        }
        return firebaseMessaging;
    }

    @androidx.annotation.m1
    static synchronized void o() {
        synchronized (FirebaseMessaging.class) {
            f17015w = null;
        }
    }

    static void p() {
        f17016x = null;
    }

    @androidx.annotation.o0
    public static synchronized FirebaseMessaging u() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(com.google.firebase.g.p());
        }
        return firebaseMessaging;
    }

    @androidx.annotation.o0
    private static synchronized z0 v(Context context) {
        z0 z0Var;
        synchronized (FirebaseMessaging.class) {
            if (f17015w == null) {
                f17015w = new z0(context);
            }
            z0Var = f17015w;
        }
        return z0Var;
    }

    private String w() {
        return ProtectedSandApp.s("ᛩ").equals(this.f17018a.r()) ? "" : this.f17018a.t();
    }

    public boolean C() {
        return this.f17024g.c();
    }

    @androidx.annotation.m1
    boolean D() {
        return this.f17029l.g();
    }

    public boolean E() {
        return q0.d(this.f17021d);
    }

    @Deprecated
    public void Q(@androidx.annotation.o0 RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.getTo())) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᛯ"));
        }
        Intent intent = new Intent(ProtectedSandApp.s("ᛪ"));
        Intent intent2 = new Intent();
        intent2.setPackage(ProtectedSandApp.s("᛫"));
        intent.putExtra(ProtectedSandApp.s("᛬"), PendingIntent.getBroadcast(this.f17021d, 0, intent2, 67108864));
        intent.setPackage(ProtectedSandApp.s("᛭"));
        remoteMessage.r(intent);
        this.f17021d.sendOrderedBroadcast(intent, ProtectedSandApp.s("ᛮ"));
    }

    public void R(boolean z5) {
        this.f17024g.f(z5);
    }

    public void S(boolean z5) {
        j0.B(z5);
    }

    @androidx.annotation.o0
    public Task<Void> T(boolean z5) {
        return q0.f(this.f17025h, this.f17021d, z5);
    }

    synchronized void U(boolean z5) {
        this.f17030m = z5;
    }

    @androidx.annotation.o0
    @SuppressLint({"TaskMainThread"})
    public Task<Void> X(@androidx.annotation.o0 final String str) {
        return this.f17028k.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.x
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task s5;
                s5 = ((e1) obj).s(str);
                return s5;
            }
        });
    }

    synchronized void Y(long j5) {
        s(new a1(this, Math.min(Math.max(f17012t, 2 * j5), f17013u)), j5);
        this.f17030m = true;
    }

    @androidx.annotation.m1
    boolean Z(@androidx.annotation.q0 z0.a aVar) {
        return aVar == null || aVar.b(this.f17029l.a());
    }

    @androidx.annotation.o0
    @SuppressLint({"TaskMainThread"})
    public Task<Void> a0(@androidx.annotation.o0 final String str) {
        return this.f17028k.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.r
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task v5;
                v5 = ((e1) obj).v(str);
                return v5;
            }
        });
    }

    String n() throws IOException {
        n2.a aVar = this.f17019b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.c());
            } catch (InterruptedException | ExecutionException e6) {
                throw new IOException(e6);
            }
        }
        final z0.a y5 = y();
        if (!Z(y5)) {
            return y5.f17669a;
        }
        final String c6 = k0.c(this.f17018a);
        try {
            return (String) Tasks.await(this.f17023f.b(c6, new v0.a() { // from class: com.google.firebase.messaging.y
                @Override // com.google.firebase.messaging.v0.a
                public final Task start() {
                    Task F;
                    F = FirebaseMessaging.this.F(c6, y5);
                    return F;
                }
            }));
        } catch (InterruptedException | ExecutionException e7) {
            throw new IOException(e7);
        }
    }

    @androidx.annotation.o0
    public Task<Void> q() {
        if (this.f17019b != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f17025h.execute(new Runnable() { // from class: com.google.firebase.messaging.z
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.H(taskCompletionSource);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (y() == null) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        o.f().execute(new Runnable() { // from class: com.google.firebase.messaging.a0
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.I(taskCompletionSource2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @androidx.annotation.o0
    public boolean r() {
        return j0.a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    void s(Runnable runnable, long j5) {
        synchronized (FirebaseMessaging.class) {
            if (f17017y == null) {
                f17017y = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(ProtectedSandApp.s("ᛰ")));
            }
            f17017y.schedule(runnable, j5, TimeUnit.SECONDS);
        }
    }

    Context t() {
        return this.f17021d;
    }

    @androidx.annotation.o0
    public Task<String> x() {
        n2.a aVar = this.f17019b;
        if (aVar != null) {
            return aVar.c();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f17025h.execute(new Runnable() { // from class: com.google.firebase.messaging.b0
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.J(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @androidx.annotation.q0
    @androidx.annotation.m1
    z0.a y() {
        return v(this.f17021d).e(w(), k0.c(this.f17018a));
    }

    Task<e1> z() {
        return this.f17028k;
    }

    FirebaseMessaging(com.google.firebase.g gVar, @androidx.annotation.q0 n2.a aVar, o2.b<com.google.firebase.platforminfo.i> bVar, o2.b<com.google.firebase.heartbeatinfo.k> bVar2, com.google.firebase.installations.k kVar, @androidx.annotation.q0 com.google.android.datatransport.i iVar, l2.d dVar, k0 k0Var) {
        this(gVar, aVar, kVar, iVar, dVar, k0Var, new f0(gVar, k0Var, bVar, bVar2, kVar), o.h(), o.d(), o.c());
    }

    FirebaseMessaging(com.google.firebase.g gVar, @androidx.annotation.q0 n2.a aVar, com.google.firebase.installations.k kVar, @androidx.annotation.q0 com.google.android.datatransport.i iVar, l2.d dVar, k0 k0Var, f0 f0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f17030m = false;
        f17016x = iVar;
        this.f17018a = gVar;
        this.f17019b = aVar;
        this.f17020c = kVar;
        this.f17024g = new a(dVar);
        Context n5 = gVar.n();
        this.f17021d = n5;
        q qVar = new q();
        this.f17031n = qVar;
        this.f17029l = k0Var;
        this.f17026i = executor;
        this.f17022e = f0Var;
        this.f17023f = new v0(executor);
        this.f17025h = executor2;
        this.f17027j = executor3;
        Context n6 = gVar.n();
        if (n6 instanceof Application) {
            ((Application) n6).registerActivityLifecycleCallbacks(qVar);
        } else {
            Objects.toString(n6);
        }
        if (aVar != null) {
            aVar.b(new a.InterfaceC0462a() { // from class: com.google.firebase.messaging.t
                @Override // n2.a.InterfaceC0462a
                public final void a(String str) {
                    FirebaseMessaging.this.K(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.L();
            }
        });
        Task<e1> f6 = e1.f(this, k0Var, f0Var, n5, o.i());
        this.f17028k = f6;
        f6.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.v
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.M((e1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.N();
            }
        });
    }
}
