package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.x;
import com.google.firebase.crashlytics.internal.model.f0;
import com.google.firebase.crashlytics.internal.model.g0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
class q {

    /* renamed from: z, reason: collision with root package name */
    static final int f15647z = 1;

    /* renamed from: a, reason: collision with root package name */
    private final Context f15648a;

    /* renamed from: b, reason: collision with root package name */
    private final z f15649b;

    /* renamed from: c, reason: collision with root package name */
    private final t f15650c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.metadata.n f15651d;

    /* renamed from: e, reason: collision with root package name */
    private final n f15652e;

    /* renamed from: f, reason: collision with root package name */
    private final d0 f15653f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.f f15654g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.common.a f15655h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.metadata.e f15656i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.a f15657j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.analytics.a f15658k;

    /* renamed from: l, reason: collision with root package name */
    private final m f15659l;

    /* renamed from: m, reason: collision with root package name */
    private final v0 f15660m;

    /* renamed from: n, reason: collision with root package name */
    private x f15661n;

    /* renamed from: o, reason: collision with root package name */
    private com.google.firebase.crashlytics.internal.settings.j f15662o = null;

    /* renamed from: p, reason: collision with root package name */
    final TaskCompletionSource<Boolean> f15663p = new TaskCompletionSource<>();

    /* renamed from: q, reason: collision with root package name */
    final TaskCompletionSource<Boolean> f15664q = new TaskCompletionSource<>();

    /* renamed from: r, reason: collision with root package name */
    final TaskCompletionSource<Void> f15665r = new TaskCompletionSource<>();

    /* renamed from: s, reason: collision with root package name */
    final AtomicBoolean f15666s = new AtomicBoolean(false);
    private static final String A = ProtectedSandApp.s("ᐦ");
    private static final String B = ProtectedSandApp.s("ᐧ");
    private static final String C = ProtectedSandApp.s("ᐨ");
    private static final String D = ProtectedSandApp.s("ᐩ");

    /* renamed from: t, reason: collision with root package name */
    static final String f15641t = ProtectedSandApp.s("ᐪ");

    /* renamed from: u, reason: collision with root package name */
    static final String f15642u = ProtectedSandApp.s("ᐫ");

    /* renamed from: v, reason: collision with root package name */
    static final String f15643v = ProtectedSandApp.s("ᐬ");

    /* renamed from: w, reason: collision with root package name */
    static final String f15644w = ProtectedSandApp.s("ᐭ");

    /* renamed from: y, reason: collision with root package name */
    static final String f15646y = ProtectedSandApp.s("ᐮ");

    /* renamed from: x, reason: collision with root package name */
    static final FilenameFilter f15645x = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.p
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean O;
            O = q.O(file, str);
            return O;
        }
    };

    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    class a implements x.a {
        a() {
        }

        @Override // com.google.firebase.crashlytics.internal.common.x.a
        public void a(@androidx.annotation.o0 com.google.firebase.crashlytics.internal.settings.j jVar, @androidx.annotation.o0 Thread thread, @androidx.annotation.o0 Throwable th) {
            q.this.L(jVar, thread, th);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class b implements Callable<Task<Void>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f15668a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f15669b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f15670c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.j f15671d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15672e;

        /* compiled from: CrashlyticsController.java */
        /* loaded from: classes3.dex */
        class a implements SuccessContinuation<com.google.firebase.crashlytics.internal.settings.d, Void> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Executor f15674a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f15675b;

            a(Executor executor, String str) {
                this.f15674a = executor;
                this.f15675b = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            @androidx.annotation.o0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> then(@androidx.annotation.q0 com.google.firebase.crashlytics.internal.settings.d dVar) throws Exception {
                if (dVar == null) {
                    com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("⠧"));
                    return Tasks.forResult(null);
                }
                Task[] taskArr = new Task[2];
                taskArr[0] = q.this.R();
                taskArr[1] = q.this.f15660m.C(this.f15674a, b.this.f15672e ? this.f15675b : null);
                return Tasks.whenAll((Task<?>[]) taskArr);
            }
        }

        b(long j5, Throwable th, Thread thread, com.google.firebase.crashlytics.internal.settings.j jVar, boolean z5) {
            this.f15668a = j5;
            this.f15669b = th;
            this.f15670c = thread;
            this.f15671d = jVar;
            this.f15672e = z5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            long b6 = q.b(this.f15668a);
            String E = q.this.E();
            if (E == null) {
                com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ᐟ"));
                return Tasks.forResult(null);
            }
            q.this.f15650c.a();
            q.this.f15660m.x(this.f15669b, this.f15670c, E, b6);
            q.this.y(this.f15668a);
            q.this.v(this.f15671d);
            q.this.x(new com.google.firebase.crashlytics.internal.common.h(q.this.f15653f).toString(), Boolean.valueOf(this.f15672e));
            if (!q.this.f15649b.d()) {
                return Tasks.forResult(null);
            }
            Executor c6 = q.this.f15652e.c();
            return this.f15671d.a().onSuccessTask(c6, new a(c6, E));
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    class c implements SuccessContinuation<Void, Boolean> {
        c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @androidx.annotation.o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Boolean> then(@androidx.annotation.q0 Void r12) throws Exception {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    class d implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f15678a;

        /* compiled from: CrashlyticsController.java */
        /* loaded from: classes2.dex */
        class a implements Callable<Task<Void>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Boolean f15680a;

            /* compiled from: CrashlyticsController.java */
            /* renamed from: com.google.firebase.crashlytics.internal.common.q$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            class C0194a implements SuccessContinuation<com.google.firebase.crashlytics.internal.settings.d, Void> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Executor f15682a;

                C0194a(Executor executor) {
                    this.f15682a = executor;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                @androidx.annotation.o0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Task<Void> then(@androidx.annotation.q0 com.google.firebase.crashlytics.internal.settings.d dVar) throws Exception {
                    if (dVar == null) {
                        com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("⠨"));
                        return Tasks.forResult(null);
                    }
                    q.this.R();
                    q.this.f15660m.B(this.f15682a);
                    q.this.f15665r.trySetResult(null);
                    return Tasks.forResult(null);
                }
            }

            a(Boolean bool) {
                this.f15680a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> call() throws Exception {
                if (this.f15680a.booleanValue()) {
                    com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᐡ"));
                    q.this.f15649b.c(this.f15680a.booleanValue());
                    Executor c6 = q.this.f15652e.c();
                    return d.this.f15678a.onSuccessTask(c6, new C0194a(c6));
                }
                com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᐠ"));
                q.s(q.this.P());
                q.this.f15660m.A();
                q.this.f15665r.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        d(Task task) {
            this.f15678a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @androidx.annotation.o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(@androidx.annotation.q0 Boolean bool) throws Exception {
            return q.this.f15652e.i(new a(bool));
        }
    }

    /* compiled from: CrashlyticsController.java */
    class e implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f15684a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15685b;

        e(long j5, String str) {
            this.f15684a = j5;
            this.f15685b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (q.this.N()) {
                return null;
            }
            q.this.f15656i.g(this.f15684a, this.f15685b);
            return null;
        }
    }

    /* compiled from: CrashlyticsController.java */
    class f implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f15687o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Throwable f15688p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Thread f15689q;

        f(long j5, Throwable th, Thread thread) {
            this.f15687o = j5;
            this.f15688p = th;
            this.f15689q = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (q.this.N()) {
                return;
            }
            long j5 = this.f15687o / 1000;
            String E = q.this.E();
            if (E == null) {
                com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᐢ"));
            } else {
                q.this.f15660m.y(this.f15688p, this.f15689q, E, j5);
            }
        }
    }

    /* compiled from: CrashlyticsController.java */
    class g implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15691a;

        g(String str) {
            this.f15691a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            q.this.x(this.f15691a, Boolean.FALSE);
            return null;
        }
    }

    /* compiled from: CrashlyticsController.java */
    class h implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f15693a;

        h(long j5) {
            this.f15693a = j5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt(ProtectedSandApp.s("ᐣ"), 1);
            bundle.putLong(ProtectedSandApp.s("ᐤ"), this.f15693a);
            q.this.f15658k.a(ProtectedSandApp.s("ᐥ"), bundle);
            return null;
        }
    }

    q(Context context, n nVar, d0 d0Var, z zVar, com.google.firebase.crashlytics.internal.persistence.f fVar, t tVar, com.google.firebase.crashlytics.internal.common.a aVar, com.google.firebase.crashlytics.internal.metadata.n nVar2, com.google.firebase.crashlytics.internal.metadata.e eVar, v0 v0Var, com.google.firebase.crashlytics.internal.a aVar2, com.google.firebase.crashlytics.internal.analytics.a aVar3, m mVar) {
        this.f15648a = context;
        this.f15652e = nVar;
        this.f15653f = d0Var;
        this.f15649b = zVar;
        this.f15654g = fVar;
        this.f15650c = tVar;
        this.f15655h = aVar;
        this.f15651d = nVar2;
        this.f15656i = eVar;
        this.f15657j = aVar2;
        this.f15658k = aVar3;
        this.f15659l = mVar;
        this.f15660m = v0Var;
    }

    private void A(String str) {
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᐯ") + str);
        com.google.firebase.crashlytics.internal.h a6 = this.f15657j.a(str);
        File f6 = a6.f();
        f0.a d6 = a6.d();
        if (T(str, f6, d6)) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᐰ"));
            return;
        }
        long lastModified = f6.lastModified();
        com.google.firebase.crashlytics.internal.metadata.e eVar = new com.google.firebase.crashlytics.internal.metadata.e(this.f15654g, str);
        File j5 = this.f15654g.j(str);
        if (!j5.isDirectory()) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᐱ"));
            return;
        }
        y(lastModified);
        List<g0> G = G(a6, str, this.f15654g, eVar.b());
        h0.b(j5, G);
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᐲ"));
        this.f15660m.o(str, G, d6);
        eVar.a();
    }

    private static boolean C() {
        try {
            Class.forName(ProtectedSandApp.s("ᐳ"));
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context D() {
        return this.f15648a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.q0
    public String E() {
        SortedSet<String> u5 = this.f15660m.u();
        if (u5.isEmpty()) {
            return null;
        }
        return u5.first();
    }

    private static long F() {
        return System.currentTimeMillis() / 1000;
    }

    @androidx.annotation.o0
    static List<g0> G(com.google.firebase.crashlytics.internal.h hVar, String str, com.google.firebase.crashlytics.internal.persistence.f fVar, byte[] bArr) {
        File p5 = fVar.p(str, ProtectedSandApp.s("ᐴ"));
        String s5 = ProtectedSandApp.s("ᐵ");
        File p6 = fVar.p(str, s5);
        File p7 = fVar.p(str, ProtectedSandApp.s("ᐶ"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.firebase.crashlytics.internal.common.g(ProtectedSandApp.s("ᐷ"), ProtectedSandApp.s("ᐸ"), bArr));
        arrayList.add(new c0(ProtectedSandApp.s("ᐹ"), ProtectedSandApp.s("ᐺ"), hVar.h()));
        arrayList.add(new c0(ProtectedSandApp.s("ᐼ"), ProtectedSandApp.s("ᐻ"), hVar.g()));
        arrayList.add(new c0(ProtectedSandApp.s("ᐾ"), ProtectedSandApp.s("ᐽ"), hVar.a()));
        arrayList.add(new c0(ProtectedSandApp.s("ᑀ"), ProtectedSandApp.s("ᐿ"), hVar.c()));
        arrayList.add(new c0(ProtectedSandApp.s("ᑂ"), ProtectedSandApp.s("ᑁ"), hVar.b()));
        arrayList.add(U(hVar));
        arrayList.add(new c0(ProtectedSandApp.s("ᑃ"), ProtectedSandApp.s("ᑄ"), p5));
        arrayList.add(new c0(ProtectedSandApp.s("ᑅ"), s5, p6));
        arrayList.add(new c0(ProtectedSandApp.s("ᑆ"), ProtectedSandApp.s("ᑇ"), p7));
        return arrayList;
    }

    private InputStream H(String str) {
        if (getClass().getClassLoader() == null) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᑈ"));
            return null;
        }
        InputStream CAasmrtiA = ProtectedSandApp.CAasmrtiA(str);
        if (CAasmrtiA != null) {
            return CAasmrtiA;
        }
        com.google.firebase.crashlytics.internal.g.f().g(ProtectedSandApp.s("ᑉ"));
        return null;
    }

    private static long I(long j5) {
        return j5 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean O(File file, String str) {
        return str.startsWith(ProtectedSandApp.s("ᑊ"));
    }

    private Task<Void> Q(long j5) {
        if (C()) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᑋ"));
            return Tasks.forResult(null);
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᑌ"));
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new h(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> R() {
        ArrayList arrayList = new ArrayList();
        for (File file : P()) {
            try {
                arrayList.add(Q(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᑍ") + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean T(String str, File file, f0.a aVar) {
        if (file == null || !file.exists()) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᑎ") + str);
        }
        if (aVar == null) {
            com.google.firebase.crashlytics.internal.g.f().g(ProtectedSandApp.s("ᑏ") + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static g0 U(com.google.firebase.crashlytics.internal.h hVar) {
        File f6 = hVar.f();
        String s5 = ProtectedSandApp.s("ᑐ");
        String s6 = ProtectedSandApp.s("ᑑ");
        return (f6 == null || !f6.exists()) ? new com.google.firebase.crashlytics.internal.common.g(s6, s5, new byte[]{0}) : new c0(s6, s5, f6);
    }

    private static byte[] W(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    static long b(long j5) {
        return j5 / 1000;
    }

    private Task<Boolean> e0() {
        if (this.f15649b.d()) {
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᑒ"));
            this.f15663p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᑓ"));
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᑔ"));
        this.f15663p.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> onSuccessTask = this.f15649b.j().onSuccessTask(new c());
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᑕ"));
        return c1.n(onSuccessTask, this.f15664q.getTask());
    }

    private void f0(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30) {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᑘ") + i5);
            return;
        }
        historicalProcessExitReasons = ((ActivityManager) this.f15648a.getSystemService(ProtectedSandApp.s("ᑖ"))).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f15660m.z(str, historicalProcessExitReasons, new com.google.firebase.crashlytics.internal.metadata.e(this.f15654g, str), com.google.firebase.crashlytics.internal.metadata.n.l(str, this.f15654g, this.f15652e));
        } else {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᑗ") + str);
        }
    }

    private static g0.a p(d0 d0Var, com.google.firebase.crashlytics.internal.common.a aVar) {
        return g0.a.b(d0Var.f(), aVar.f15546f, aVar.f15547g, d0Var.a().c(), a0.determineFrom(aVar.f15544d).getId(), aVar.f15548h);
    }

    private static g0.b q(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return g0.b.c(i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), i.b(context), statFs.getBlockCount() * statFs.getBlockSize(), i.x(), i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static g0.c r() {
        return g0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, i.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void w(boolean z5, com.google.firebase.crashlytics.internal.settings.j jVar) {
        String str;
        ArrayList arrayList = new ArrayList(this.f15660m.u());
        if (arrayList.size() <= z5) {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᑙ"));
            return;
        }
        String str2 = (String) arrayList.get(z5 ? 1 : 0);
        if (jVar.b().f16369b.f16377b) {
            f0(str2);
        } else {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᑚ"));
        }
        if (this.f15657j.d(str2)) {
            A(str2);
        }
        if (z5 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f15659l.e(null);
            str = null;
        }
        this.f15660m.p(F(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(String str, Boolean bool) {
        long F = F();
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᑛ") + str);
        this.f15657j.c(str, String.format(Locale.US, ProtectedSandApp.s("ᑝ"), ProtectedSandApp.s("ᑜ")), F, com.google.firebase.crashlytics.internal.model.g0.b(p(this.f15653f, this.f15655h), r(), q(this.f15648a)));
        if (bool.booleanValue() && str != null) {
            this.f15651d.r(str);
        }
        this.f15656i.e(str);
        this.f15659l.e(str);
        this.f15660m.b(str, F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(long j5) {
        String s5 = ProtectedSandApp.s("ᑞ");
        try {
            if (this.f15654g.f(s5 + j5).createNewFile()) {
            } else {
                throw new IOException(ProtectedSandApp.s("ᑟ"));
            }
        } catch (IOException e6) {
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ᑠ"), e6);
        }
    }

    boolean B(com.google.firebase.crashlytics.internal.settings.j jVar) {
        this.f15652e.b();
        if (N()) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᑡ"));
            return false;
        }
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᑢ"));
        try {
            w(true, jVar);
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᑣ"));
            return true;
        } catch (Exception e6) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᑤ"), e6);
            return false;
        }
    }

    com.google.firebase.crashlytics.internal.metadata.n J() {
        return this.f15651d;
    }

    String K() throws IOException {
        InputStream H = H(ProtectedSandApp.s("ᑥ"));
        if (H == null) {
            return null;
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᑦ"));
        return Base64.encodeToString(W(H), 0);
    }

    void L(@androidx.annotation.o0 com.google.firebase.crashlytics.internal.settings.j jVar, @androidx.annotation.o0 Thread thread, @androidx.annotation.o0 Throwable th) {
        M(jVar, thread, th, false);
    }

    synchronized void M(@androidx.annotation.o0 com.google.firebase.crashlytics.internal.settings.j jVar, @androidx.annotation.o0 Thread thread, @androidx.annotation.o0 Throwable th, boolean z5) {
        String s5 = ProtectedSandApp.s("ᑧ");
        synchronized (this) {
            com.google.firebase.crashlytics.internal.g.f().b(s5 + th + ProtectedSandApp.s("ᑨ") + thread.getName());
            try {
                try {
                    c1.f(this.f15652e.i(new b(System.currentTimeMillis(), th, thread, jVar, z5)));
                } catch (TimeoutException unused) {
                    com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ᑪ"));
                }
            } catch (Exception e6) {
                com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᑩ"), e6);
            }
        }
    }

    boolean N() {
        x xVar = this.f15661n;
        return xVar != null && xVar.a();
    }

    List<File> P() {
        return this.f15654g.g(f15645x);
    }

    void S(Thread thread, Throwable th) {
        com.google.firebase.crashlytics.internal.settings.j jVar = this.f15662o;
        if (jVar == null) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᑫ"));
        } else {
            M(jVar, thread, th, true);
        }
    }

    void V(String str) {
        this.f15652e.h(new g(str));
    }

    void X() {
        try {
            String K = K();
            if (K != null) {
                b0(ProtectedSandApp.s("ᑬ"), K);
                com.google.firebase.crashlytics.internal.g.f().g(ProtectedSandApp.s("ᑭ"));
            }
        } catch (IOException e6) {
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ᑮ"), e6);
        }
    }

    Task<Void> Y() {
        this.f15664q.trySetResult(Boolean.TRUE);
        return this.f15665r.getTask();
    }

    void Z(String str, String str2) {
        try {
            this.f15651d.o(str, str2);
        } catch (IllegalArgumentException e6) {
            Context context = this.f15648a;
            if (context != null && i.v(context)) {
                throw e6;
            }
            com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ᑯ"));
        }
    }

    void a0(Map<String, String> map) {
        this.f15651d.p(map);
    }

    void b0(String str, String str2) {
        try {
            this.f15651d.q(str, str2);
        } catch (IllegalArgumentException e6) {
            Context context = this.f15648a;
            if (context != null && i.v(context)) {
                throw e6;
            }
            com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ᑰ"));
        }
    }

    void c0(String str) {
        this.f15651d.s(str);
    }

    @SuppressLint({"TaskMainThread"})
    Task<Void> d0(Task<com.google.firebase.crashlytics.internal.settings.d> task) {
        if (this.f15660m.s()) {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᑲ"));
            return e0().onSuccessTask(new d(task));
        }
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᑱ"));
        this.f15663p.trySetResult(Boolean.FALSE);
        return Tasks.forResult(null);
    }

    void g0(@androidx.annotation.o0 Thread thread, @androidx.annotation.o0 Throwable th) {
        this.f15652e.g(new f(System.currentTimeMillis(), th, thread));
    }

    void h0(long j5, String str) {
        this.f15652e.h(new e(j5, str));
    }

    @androidx.annotation.o0
    Task<Boolean> o() {
        if (this.f15666s.compareAndSet(false, true)) {
            return this.f15663p.getTask();
        }
        com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᑳ"));
        return Tasks.forResult(Boolean.FALSE);
    }

    Task<Void> t() {
        this.f15664q.trySetResult(Boolean.FALSE);
        return this.f15665r.getTask();
    }

    boolean u() {
        if (!this.f15650c.c()) {
            String E = E();
            return E != null && this.f15657j.d(E);
        }
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᑴ"));
        this.f15650c.d();
        return true;
    }

    void v(com.google.firebase.crashlytics.internal.settings.j jVar) {
        w(false, jVar);
    }

    void z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.settings.j jVar) {
        this.f15662o = jVar;
        V(str);
        x xVar = new x(new a(), jVar, uncaughtExceptionHandler, this.f15657j);
        this.f15661n = xVar;
        Thread.setDefaultUncaughtExceptionHandler(xVar);
    }
}
