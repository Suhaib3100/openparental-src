package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.g0;
import com.google.firebase.crashlytics.internal.model.g0;
import com.google.firebase.crashlytics.internal.model.h0;
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
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes6.dex */
class p {

    /* renamed from: y, reason: collision with root package name */
    static final int f58787y = 1;

    /* renamed from: a, reason: collision with root package name */
    private final Context f58789a;

    /* renamed from: b, reason: collision with root package name */
    private final i0 f58790b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f58791c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.metadata.o f58792d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.concurrency.k f58793e;

    /* renamed from: f, reason: collision with root package name */
    private final n0 f58794f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f58795g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.common.a f58796h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.metadata.e f58797i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.a f58798j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.analytics.a f58799k;

    /* renamed from: l, reason: collision with root package name */
    private final m f58800l;

    /* renamed from: m, reason: collision with root package name */
    private final f1 f58801m;

    /* renamed from: n, reason: collision with root package name */
    private g0 f58802n;

    /* renamed from: o, reason: collision with root package name */
    private com.google.firebase.crashlytics.internal.settings.k f58803o = null;

    /* renamed from: p, reason: collision with root package name */
    final TaskCompletionSource<Boolean> f58804p = new TaskCompletionSource<>();

    /* renamed from: q, reason: collision with root package name */
    final TaskCompletionSource<Boolean> f58805q = new TaskCompletionSource<>();

    /* renamed from: r, reason: collision with root package name */
    final TaskCompletionSource<Void> f58806r = new TaskCompletionSource<>();

    /* renamed from: s, reason: collision with root package name */
    final AtomicBoolean f58807s = new AtomicBoolean(false);
    private static final String A = ProtectedSandApp.s("ﱻ");
    private static final String B = ProtectedSandApp.s("ﱼ");
    private static final String C = ProtectedSandApp.s("ﱽ");

    /* renamed from: t, reason: collision with root package name */
    static final String f58782t = ProtectedSandApp.s("ﱾ");

    /* renamed from: u, reason: collision with root package name */
    static final String f58783u = ProtectedSandApp.s("ﱿ");

    /* renamed from: v, reason: collision with root package name */
    static final String f58784v = ProtectedSandApp.s("ﲀ");

    /* renamed from: w, reason: collision with root package name */
    static final String f58785w = ProtectedSandApp.s("ﲁ");

    /* renamed from: z, reason: collision with root package name */
    private static final String f58788z = ProtectedSandApp.s("ﲂ");

    /* renamed from: x, reason: collision with root package name */
    static final FilenameFilter f58786x = new o();

    /* compiled from: CrashlyticsController.java */
    class a implements g0.a {
        a() {
        }

        @Override // com.google.firebase.crashlytics.internal.common.g0.a
        public void a(@androidx.annotation.o0 com.google.firebase.crashlytics.internal.settings.k kVar, @androidx.annotation.o0 Thread thread, @androidx.annotation.o0 Throwable th) {
            p.this.J(kVar, thread, th);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class b implements Callable<Task<Void>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f58809a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f58810b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f58811c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.k f58812d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f58813e;

        /* compiled from: CrashlyticsController.java */
        class a implements SuccessContinuation<com.google.firebase.crashlytics.internal.settings.d, Void> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f58815a;

            a(String str) {
                this.f58815a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            @androidx.annotation.o0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> then(@androidx.annotation.q0 com.google.firebase.crashlytics.internal.settings.d dVar) throws Exception {
                if (dVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{p.this.Q(), p.this.f58801m.B(p.this.f58793e.common, b.this.f58813e ? this.f58815a : null)});
                }
                com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﱳ"));
                return Tasks.forResult(null);
            }
        }

        b(long j4, Throwable th, Thread thread, com.google.firebase.crashlytics.internal.settings.k kVar, boolean z4) {
            this.f58809a = j4;
            this.f58810b = th;
            this.f58811c = thread;
            this.f58812d = kVar;
            this.f58813e = z4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            long c5 = p.c(this.f58809a);
            String C = p.this.C();
            if (C == null) {
                com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ﱴ"));
                return Tasks.forResult(null);
            }
            p.this.f58791c.a();
            p.this.f58801m.w(this.f58810b, this.f58811c, C, c5);
            p.this.x(this.f58809a);
            p.this.u(this.f58812d);
            p.this.w(new h().c(), Boolean.valueOf(this.f58813e));
            return !p.this.f58790b.d() ? Tasks.forResult(null) : this.f58812d.a().onSuccessTask(p.this.f58793e.common, new a(C));
        }
    }

    /* compiled from: CrashlyticsController.java */
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
    class d implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f58818a;

        /* compiled from: CrashlyticsController.java */
        class a implements SuccessContinuation<com.google.firebase.crashlytics.internal.settings.d, Void> {
            a() {
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            @androidx.annotation.o0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> then(@androidx.annotation.q0 com.google.firebase.crashlytics.internal.settings.d dVar) throws Exception {
                if (dVar == null) {
                    com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﱵ"));
                    return Tasks.forResult(null);
                }
                p.this.Q();
                p.this.f58801m.A(p.this.f58793e.common);
                p.this.f58806r.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        d(Task task) {
            this.f58818a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @androidx.annotation.o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(@androidx.annotation.q0 Boolean bool) throws Exception {
            if (bool.booleanValue()) {
                com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﱷ"));
                p.this.f58790b.c(bool.booleanValue());
                return this.f58818a.onSuccessTask(p.this.f58793e.common, new a());
            }
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﱶ"));
            p.r(p.this.O());
            p.this.f58801m.z();
            p.this.f58806r.trySetResult(null);
            return Tasks.forResult(null);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class e implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f58821a;

        e(long j4) {
            this.f58821a = j4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt(ProtectedSandApp.s("ﱸ"), 1);
            bundle.putLong(ProtectedSandApp.s("ﱹ"), this.f58821a);
            p.this.f58799k.a(ProtectedSandApp.s("ﱺ"), bundle);
            return null;
        }
    }

    p(Context context, n0 n0Var, i0 i0Var, com.google.firebase.crashlytics.internal.persistence.g gVar, d0 d0Var, com.google.firebase.crashlytics.internal.common.a aVar, com.google.firebase.crashlytics.internal.metadata.o oVar, com.google.firebase.crashlytics.internal.metadata.e eVar, f1 f1Var, com.google.firebase.crashlytics.internal.a aVar2, com.google.firebase.crashlytics.internal.analytics.a aVar3, m mVar, com.google.firebase.crashlytics.internal.concurrency.k kVar) {
        this.f58789a = context;
        this.f58794f = n0Var;
        this.f58790b = i0Var;
        this.f58795g = gVar;
        this.f58791c = d0Var;
        this.f58796h = aVar;
        this.f58792d = oVar;
        this.f58797i = eVar;
        this.f58798j = aVar2;
        this.f58799k = aVar3;
        this.f58800l = mVar;
        this.f58801m = f1Var;
        this.f58793e = kVar;
    }

    private static boolean B() {
        try {
            Class.forName(ProtectedSandApp.s("ﲃ"));
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.q0
    public String C() {
        SortedSet<String> s4 = this.f58801m.s();
        if (s4.isEmpty()) {
            return null;
        }
        return s4.first();
    }

    private static long D() {
        return System.currentTimeMillis() / 1000;
    }

    @androidx.annotation.o0
    static List<q0> E(com.google.firebase.crashlytics.internal.h hVar, String str, com.google.firebase.crashlytics.internal.persistence.g gVar, byte[] bArr) {
        File r4 = gVar.r(str, ProtectedSandApp.s("ﲄ"));
        String s4 = ProtectedSandApp.s("ﲅ");
        File r5 = gVar.r(str, s4);
        File r6 = gVar.r(str, ProtectedSandApp.s("ﲆ"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g(ProtectedSandApp.s("ﲇ"), ProtectedSandApp.s("ﲈ"), bArr));
        arrayList.add(new l0(ProtectedSandApp.s("ﲉ"), ProtectedSandApp.s("ﲊ"), hVar.e()));
        arrayList.add(new l0(ProtectedSandApp.s("ﲌ"), ProtectedSandApp.s("ﲋ"), hVar.h()));
        arrayList.add(new l0(ProtectedSandApp.s("ﲎ"), ProtectedSandApp.s("ﲍ"), hVar.f()));
        arrayList.add(new l0(ProtectedSandApp.s("ﲐ"), ProtectedSandApp.s("ﲏ"), hVar.a()));
        arrayList.add(new l0(ProtectedSandApp.s("ﲒ"), ProtectedSandApp.s("ﲑ"), hVar.g()));
        arrayList.add(T(hVar));
        arrayList.add(new l0(ProtectedSandApp.s("ﲓ"), ProtectedSandApp.s("ﲔ"), r4));
        arrayList.add(new l0(ProtectedSandApp.s("ﲕ"), s4, r5));
        arrayList.add(new l0(ProtectedSandApp.s("ﲖ"), ProtectedSandApp.s("ﲗ"), r6));
        return arrayList;
    }

    private InputStream F(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﲘ"));
            return null;
        }
        InputStream a5 = ProtectedSandApp.a(classLoader, str);
        if (a5 != null) {
            return a5;
        }
        com.google.firebase.crashlytics.internal.g.f().g(ProtectedSandApp.s("ﲙ"));
        return null;
    }

    private static long G(long j4) {
        return j4 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(String str) {
        w(str, Boolean.FALSE);
    }

    private Task<Void> P(long j4) {
        if (B()) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﲚ"));
            return Tasks.forResult(null);
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﲛ"));
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new e(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> Q() {
        ArrayList arrayList = new ArrayList();
        for (File file : O()) {
            try {
                arrayList.add(P(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﲜ") + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean S(String str, File file, g0.a aVar) {
        if (file == null || !file.exists()) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﲝ") + str);
        }
        if (aVar == null) {
            com.google.firebase.crashlytics.internal.g.f().g(ProtectedSandApp.s("ﲞ") + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static q0 T(com.google.firebase.crashlytics.internal.h hVar) {
        File d5 = hVar.d();
        String s4 = ProtectedSandApp.s("ﲟ");
        String s5 = ProtectedSandApp.s("ﲠ");
        return (d5 == null || !d5.exists()) ? new g(s5, s4, new byte[]{0}) : new l0(s5, s4, d5);
    }

    private static byte[] V(InputStream inputStream) throws IOException {
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

    static long c(long j4) {
        return j4 / 1000;
    }

    private Task<Boolean> d0() {
        if (this.f58790b.d()) {
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﲡ"));
            this.f58804p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﲢ"));
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﲣ"));
        this.f58804p.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> onSuccessTask = this.f58790b.j().onSuccessTask(new c());
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﲤ"));
        return com.google.firebase.crashlytics.internal.concurrency.b.c(onSuccessTask, this.f58805q.getTask());
    }

    private void e0(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﲧ") + i4);
            return;
        }
        historicalProcessExitReasons = ((ActivityManager) this.f58789a.getSystemService(ProtectedSandApp.s("ﲥ"))).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f58801m.y(str, historicalProcessExitReasons, new com.google.firebase.crashlytics.internal.metadata.e(this.f58795g, str), com.google.firebase.crashlytics.internal.metadata.o.m(str, this.f58795g, this.f58793e));
        } else {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﲦ") + str);
        }
    }

    private static h0.a o(n0 n0Var, com.google.firebase.crashlytics.internal.common.a aVar) {
        return h0.a.b(n0Var.f(), aVar.f58622f, aVar.f58623g, n0Var.a().c(), j0.determineFrom(aVar.f58620d).getId(), aVar.f58624h);
    }

    private static h0.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return h0.b.c(i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), i.b(context), statFs.getBlockCount() * statFs.getBlockSize(), i.x(), i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static h0.c q() {
        return h0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, i.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void v(boolean z4, com.google.firebase.crashlytics.internal.settings.k kVar, boolean z5) {
        String str;
        com.google.firebase.crashlytics.internal.concurrency.k.c();
        ArrayList arrayList = new ArrayList(this.f58801m.s());
        if (arrayList.size() <= z4) {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﲨ"));
            return;
        }
        String str2 = (String) arrayList.get(z4 ? 1 : 0);
        if (z5 && kVar.b().f59495b.f59503b) {
            e0(str2);
        } else {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﲩ"));
        }
        if (z5 && this.f58798j.d(str2)) {
            z(str2);
        }
        if (z4 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f58800l.e(null);
            str = null;
        }
        this.f58801m.m(D(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str, Boolean bool) {
        long D = D();
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﲪ") + str);
        this.f58798j.c(str, String.format(Locale.US, ProtectedSandApp.s("ﲂ"), ProtectedSandApp.s("ﲫ")), D, com.google.firebase.crashlytics.internal.model.h0.b(o(this.f58794f, this.f58796h), q(), p(this.f58789a)));
        if (bool.booleanValue() && str != null) {
            this.f58792d.s(str);
        }
        this.f58797i.e(str);
        this.f58800l.e(str);
        this.f58801m.t(str, D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(long j4) {
        String s4 = ProtectedSandApp.s("ﲁ");
        try {
            if (this.f58795g.h(s4 + j4).createNewFile()) {
            } else {
                throw new IOException(ProtectedSandApp.s("ﲬ"));
            }
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﲭ"), e4);
        }
    }

    private void z(String str) {
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﲮ") + str);
        com.google.firebase.crashlytics.internal.h a5 = this.f58798j.a(str);
        File d5 = a5.d();
        g0.a b5 = a5.b();
        if (S(str, d5, b5)) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﲯ"));
            return;
        }
        long lastModified = d5.lastModified();
        com.google.firebase.crashlytics.internal.metadata.e eVar = new com.google.firebase.crashlytics.internal.metadata.e(this.f58795g, str);
        File l4 = this.f58795g.l(str);
        if (!l4.isDirectory()) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﲰ"));
            return;
        }
        x(lastModified);
        List<q0> E = E(a5, str, this.f58795g, eVar.b());
        r0.b(l4, E);
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﲱ"));
        this.f58801m.l(str, E, b5);
        eVar.a();
    }

    boolean A(com.google.firebase.crashlytics.internal.settings.k kVar) {
        com.google.firebase.crashlytics.internal.concurrency.k.c();
        if (L()) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﲲ"));
            return false;
        }
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﲳ"));
        try {
            v(true, kVar, true);
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﲴ"));
            return true;
        } catch (Exception e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﲵ"), e4);
            return false;
        }
    }

    com.google.firebase.crashlytics.internal.metadata.o H() {
        return this.f58792d;
    }

    String I() throws IOException {
        InputStream F = F(ProtectedSandApp.s("ﲶ"));
        if (F == null) {
            return null;
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﲷ"));
        return Base64.encodeToString(V(F), 0);
    }

    void J(@androidx.annotation.o0 com.google.firebase.crashlytics.internal.settings.k kVar, @androidx.annotation.o0 Thread thread, @androidx.annotation.o0 Throwable th) {
        K(kVar, thread, th, false);
    }

    synchronized void K(@androidx.annotation.o0 com.google.firebase.crashlytics.internal.settings.k kVar, @androidx.annotation.o0 Thread thread, @androidx.annotation.o0 Throwable th, boolean z4) {
        String s4 = ProtectedSandApp.s("ﲸ");
        synchronized (this) {
            com.google.firebase.crashlytics.internal.g.f().b(s4 + th + ProtectedSandApp.s("ﲹ") + thread.getName());
            Task s5 = this.f58793e.common.s(new b(System.currentTimeMillis(), th, thread, kVar, z4));
            if (!z4) {
                try {
                    i1.b(s5);
                } catch (TimeoutException unused) {
                    com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ﲻ"));
                } catch (Exception e4) {
                    com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﲺ"), e4);
                }
            }
        }
    }

    boolean L() {
        g0 g0Var = this.f58802n;
        return g0Var != null && g0Var.a();
    }

    List<File> O() {
        return this.f58795g.i(f58786x);
    }

    void R(Thread thread, Throwable th) {
        com.google.firebase.crashlytics.internal.settings.k kVar = this.f58803o;
        if (kVar == null) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﲼ"));
        } else {
            K(kVar, thread, th, true);
        }
    }

    void U(final String str) {
        this.f58793e.common.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.n
            @Override // java.lang.Runnable
            public final void run() {
                p.this.M(str);
            }
        });
    }

    void W() {
        try {
            String I = I();
            if (I != null) {
                a0(ProtectedSandApp.s("ﱻ"), I);
                com.google.firebase.crashlytics.internal.g.f().g(ProtectedSandApp.s("ﲽ"));
            }
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﲾ"), e4);
        }
    }

    Task<Void> X() {
        this.f58805q.trySetResult(Boolean.TRUE);
        return this.f58806r.getTask();
    }

    void Y(String str, String str2) {
        try {
            this.f58792d.p(str, str2);
        } catch (IllegalArgumentException e4) {
            Context context = this.f58789a;
            if (context != null && i.v(context)) {
                throw e4;
            }
            com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ﲿ"));
        }
    }

    void Z(Map<String, String> map) {
        this.f58792d.q(map);
    }

    void a0(String str, String str2) {
        try {
            this.f58792d.r(str, str2);
        } catch (IllegalArgumentException e4) {
            Context context = this.f58789a;
            if (context != null && i.v(context)) {
                throw e4;
            }
            com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ﲿ"));
        }
    }

    void b0(String str) {
        this.f58792d.t(str);
    }

    void c0(Task<com.google.firebase.crashlytics.internal.settings.d> task) {
        if (this.f58801m.p()) {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﳁ"));
            d0().onSuccessTask(this.f58793e.common, new d(task));
        } else {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﳀ"));
            this.f58804p.trySetResult(Boolean.FALSE);
        }
    }

    void f0(@androidx.annotation.o0 Thread thread, @androidx.annotation.o0 Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        if (L()) {
            return;
        }
        long j4 = currentTimeMillis / 1000;
        String C2 = C();
        if (C2 == null) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﳂ"));
        } else {
            this.f58801m.x(th, thread, C2, j4);
        }
    }

    void g0(long j4, String str) {
        if (L()) {
            return;
        }
        this.f58797i.g(j4, str);
    }

    @androidx.annotation.o0
    Task<Boolean> n() {
        if (this.f58807s.compareAndSet(false, true)) {
            return this.f58804p.getTask();
        }
        com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﳃ"));
        return Tasks.forResult(Boolean.FALSE);
    }

    Task<Void> s() {
        this.f58805q.trySetResult(Boolean.FALSE);
        return this.f58806r.getTask();
    }

    boolean t() {
        com.google.firebase.crashlytics.internal.concurrency.k.c();
        if (!this.f58791c.c()) {
            String C2 = C();
            return C2 != null && this.f58798j.d(C2);
        }
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﳄ"));
        this.f58791c.d();
        return true;
    }

    void u(com.google.firebase.crashlytics.internal.settings.k kVar) {
        v(false, kVar, false);
    }

    void y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.settings.k kVar) {
        this.f58803o = kVar;
        U(str);
        g0 g0Var = new g0(new a(), kVar, uncaughtExceptionHandler, this.f58798j);
        this.f58802n = g0Var;
        Thread.setDefaultUncaughtExceptionHandler(g0Var);
    }
}
