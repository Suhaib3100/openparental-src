package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: TopicsSubscriber.java */
/* loaded from: classes6.dex */
class k1 {

    /* renamed from: k, reason: collision with root package name */
    private static final long f60198k = 30;

    /* renamed from: l, reason: collision with root package name */
    private static final long f60199l = 30;

    /* renamed from: a, reason: collision with root package name */
    private final Context f60201a;

    /* renamed from: b, reason: collision with root package name */
    private final p0 f60202b;

    /* renamed from: c, reason: collision with root package name */
    private final j0 f60203c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f60204d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f60206f;

    /* renamed from: h, reason: collision with root package name */
    private final i1 f60208h;

    /* renamed from: i, reason: collision with root package name */
    static final String f60196i = ProtectedSandApp.s("ɳ\u0001");

    /* renamed from: j, reason: collision with root package name */
    static final String f60197j = ProtectedSandApp.s("ɴ\u0001");

    /* renamed from: m, reason: collision with root package name */
    private static final long f60200m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("pendingOperations")
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f60205e = new androidx.collection.a();

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f60207g = false;

    private k1(FirebaseMessaging firebaseMessaging, p0 p0Var, i1 i1Var, j0 j0Var, Context context, @androidx.annotation.o0 ScheduledExecutorService scheduledExecutorService) {
        this.f60204d = firebaseMessaging;
        this.f60202b = p0Var;
        this.f60208h = i1Var;
        this.f60203c = j0Var;
        this.f60201a = context;
        this.f60206f = scheduledExecutorService;
    }

    private void b(h1 h1Var, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.f60205e) {
            try {
                String e4 = h1Var.e();
                if (this.f60205e.containsKey(e4)) {
                    arrayDeque = this.f60205e.get(e4);
                } else {
                    ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                    this.f60205e.put(e4, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.n1
    private static <T> void c(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e4) {
            e = e4;
            throw new IOException(ProtectedSandApp.s("ɴ\u0001"), e);
        } catch (ExecutionException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e5);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e6) {
            e = e6;
            throw new IOException(ProtectedSandApp.s("ɴ\u0001"), e);
        }
    }

    @androidx.annotation.n1
    private void d(String str) throws IOException {
        c(this.f60203c.n(this.f60204d.r(), str));
    }

    @androidx.annotation.n1
    private void e(String str) throws IOException {
        c(this.f60203c.o(this.f60204d.r(), str));
    }

    @androidx.annotation.m1
    static Task<k1> f(final FirebaseMessaging firebaseMessaging, final p0 p0Var, final j0 j0Var, final Context context, @androidx.annotation.o0 final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.j1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                k1 k4;
                k4 = k1.k(context, scheduledExecutorService, firebaseMessaging, p0Var, j0Var);
                return k4;
            }
        });
    }

    static boolean i() {
        return Log.isLoggable(ProtectedSandApp.s("ɵ\u0001"), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k1 k(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, p0 p0Var, j0 j0Var) throws Exception {
        return new k1(firebaseMessaging, p0Var, i1.d(context, scheduledExecutorService), j0Var, context, scheduledExecutorService);
    }

    private void l(h1 h1Var) {
        synchronized (this.f60205e) {
            try {
                String e4 = h1Var.e();
                if (this.f60205e.containsKey(e4)) {
                    ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f60205e.get(e4);
                    TaskCompletionSource<Void> poll = arrayDeque.poll();
                    if (poll != null) {
                        poll.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f60205e.remove(e4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void q() {
        if (j()) {
            return;
        }
        u(0L);
    }

    @androidx.annotation.m1
    i1 g() {
        return this.f60208h;
    }

    boolean h() {
        return this.f60208h.e() != null;
    }

    synchronized boolean j() {
        return this.f60207g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[Catch: IOException -> 0x0021, TryCatch #0 {IOException -> 0x0021, blocks: (B:3:0x0001, B:11:0x0036, B:14:0x003a, B:16:0x0047, B:17:0x004b, B:19:0x0058, B:20:0x0013, B:23:0x0023), top: B:2:0x0001 }] */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m(com.google.firebase.messaging.h1 r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r6.b()     // Catch: java.io.IOException -> L21
            int r2 = r1.hashCode()     // Catch: java.io.IOException -> L21
            r3 = 83
            r4 = 1
            if (r2 == r3) goto L23
            r3 = 85
            if (r2 == r3) goto L13
            goto L31
        L13:
            java.lang.String r2 = "ɶ\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.io.IOException -> L21
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L21
            if (r1 == 0) goto L31
            r1 = r4
            goto L32
        L21:
            r6 = move-exception
            goto L5c
        L23:
            java.lang.String r2 = "ɷ\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.io.IOException -> L21
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L21
            if (r1 == 0) goto L31
            r1 = r0
            goto L32
        L31:
            r1 = -1
        L32:
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L3a
            i()     // Catch: java.io.IOException -> L21
            goto L5b
        L3a:
            java.lang.String r1 = r6.c()     // Catch: java.io.IOException -> L21
            r5.e(r1)     // Catch: java.io.IOException -> L21
            boolean r1 = i()     // Catch: java.io.IOException -> L21
            if (r1 == 0) goto L5b
            r6.c()     // Catch: java.io.IOException -> L21
            goto L5b
        L4b:
            java.lang.String r1 = r6.c()     // Catch: java.io.IOException -> L21
            r5.d(r1)     // Catch: java.io.IOException -> L21
            boolean r1 = i()     // Catch: java.io.IOException -> L21
            if (r1 == 0) goto L5b
            r6.c()     // Catch: java.io.IOException -> L21
        L5b:
            return r4
        L5c:
            java.lang.String r1 = "ɴ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.String r2 = r6.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L95
            java.lang.String r1 = "ɳ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.String r2 = r6.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L95
            java.lang.String r1 = "ɸ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.String r2 = r6.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8d
            goto L95
        L8d:
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto L94
            return r0
        L94:
            throw r6
        L95:
            r6.getMessage()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.k1.m(com.google.firebase.messaging.h1):boolean");
    }

    void n(Runnable runnable, long j4) {
        this.f60206f.schedule(runnable, j4, TimeUnit.SECONDS);
    }

    @androidx.annotation.m1
    Task<Void> o(h1 h1Var) {
        this.f60208h.a(h1Var);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        b(h1Var, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    synchronized void p(boolean z4) {
        this.f60207g = z4;
    }

    void r() {
        if (h()) {
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> s(String str) {
        Task<Void> o4 = o(h1.f(str));
        r();
        return o4;
    }

    @androidx.annotation.n1
    boolean t() throws IOException {
        while (true) {
            synchronized (this) {
                try {
                    h1 e4 = this.f60208h.e();
                    if (e4 == null) {
                        i();
                        return true;
                    }
                    if (!m(e4)) {
                        return false;
                    }
                    this.f60208h.i(e4);
                    l(e4);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    void u(long j4) {
        n(new l1(this, this.f60201a, this.f60202b, Math.min(Math.max(30L, 2 * j4), f60200m)), j4);
        p(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> v(String str) {
        Task<Void> o4 = o(h1.g(str));
        r();
        return o4;
    }
}
