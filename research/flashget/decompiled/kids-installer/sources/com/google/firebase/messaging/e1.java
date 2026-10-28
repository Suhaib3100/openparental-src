package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes2.dex */
class e1 {

    /* renamed from: k, reason: collision with root package name */
    private static final long f17240k = 30;

    /* renamed from: l, reason: collision with root package name */
    private static final long f17241l = 30;

    /* renamed from: a, reason: collision with root package name */
    private final Context f17243a;

    /* renamed from: b, reason: collision with root package name */
    private final k0 f17244b;

    /* renamed from: c, reason: collision with root package name */
    private final f0 f17245c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f17246d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f17248f;

    /* renamed from: h, reason: collision with root package name */
    private final c1 f17250h;

    /* renamed from: i, reason: collision with root package name */
    static final String f17238i = ProtectedSandApp.s("ា");

    /* renamed from: j, reason: collision with root package name */
    static final String f17239j = ProtectedSandApp.s("ិ");

    /* renamed from: m, reason: collision with root package name */
    private static final long f17242m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("pendingOperations")
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f17247e = new androidx.collection.a();

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f17249g = false;

    private e1(FirebaseMessaging firebaseMessaging, k0 k0Var, c1 c1Var, f0 f0Var, Context context, @androidx.annotation.o0 ScheduledExecutorService scheduledExecutorService) {
        this.f17246d = firebaseMessaging;
        this.f17244b = k0Var;
        this.f17250h = c1Var;
        this.f17245c = f0Var;
        this.f17243a = context;
        this.f17248f = scheduledExecutorService;
    }

    private void b(b1 b1Var, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.f17247e) {
            String e6 = b1Var.e();
            if (this.f17247e.containsKey(e6)) {
                arrayDeque = this.f17247e.get(e6);
            } else {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                this.f17247e.put(e6, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    @n1
    private static <T> void c(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e6) {
            e = e6;
            throw new IOException(ProtectedSandApp.s("ី"), e);
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e7);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e8) {
            e = e8;
            throw new IOException(ProtectedSandApp.s("ី"), e);
        }
    }

    @n1
    private void d(String str) throws IOException {
        c(this.f17245c.l(this.f17246d.n(), str));
    }

    @n1
    private void e(String str) throws IOException {
        c(this.f17245c.m(this.f17246d.n(), str));
    }

    @androidx.annotation.m1
    static Task<e1> f(final FirebaseMessaging firebaseMessaging, final k0 k0Var, final f0 f0Var, final Context context, @androidx.annotation.o0 final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.d1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                e1 k5;
                k5 = e1.k(context, scheduledExecutorService, firebaseMessaging, k0Var, f0Var);
                return k5;
            }
        });
    }

    static boolean i() {
        return Log.isLoggable(ProtectedSandApp.s("ឹ"), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e1 k(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, k0 k0Var, f0 f0Var) throws Exception {
        return new e1(firebaseMessaging, k0Var, c1.d(context, scheduledExecutorService), f0Var, context, scheduledExecutorService);
    }

    private void l(b1 b1Var) {
        synchronized (this.f17247e) {
            String e6 = b1Var.e();
            if (this.f17247e.containsKey(e6)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f17247e.get(e6);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f17247e.remove(e6);
                }
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
    c1 g() {
        return this.f17250h;
    }

    boolean h() {
        return this.f17250h.e() != null;
    }

    synchronized boolean j() {
        return this.f17249g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[Catch: IOException -> 0x005a, TryCatch #0 {IOException -> 0x005a, blocks: (B:3:0x0001, B:11:0x0034, B:14:0x0038, B:16:0x0045, B:17:0x0049, B:19:0x0056, B:20:0x0013, B:23:0x0021), top: B:2:0x0001 }] */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m(com.google.firebase.messaging.b1 r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r6.b()     // Catch: java.io.IOException -> L5a
            int r2 = r1.hashCode()     // Catch: java.io.IOException -> L5a
            r3 = 83
            r4 = 1
            if (r2 == r3) goto L21
            r3 = 85
            if (r2 == r3) goto L13
            goto L2f
        L13:
            java.lang.String r2 = "ឺ"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.io.IOException -> L5a
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L5a
            if (r1 == 0) goto L2f
            r1 = r4
            goto L30
        L21:
            java.lang.String r2 = "ុ"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.io.IOException -> L5a
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L5a
            if (r1 == 0) goto L2f
            r1 = r0
            goto L30
        L2f:
            r1 = -1
        L30:
            if (r1 == 0) goto L49
            if (r1 == r4) goto L38
            i()     // Catch: java.io.IOException -> L5a
            goto L59
        L38:
            java.lang.String r1 = r6.c()     // Catch: java.io.IOException -> L5a
            r5.e(r1)     // Catch: java.io.IOException -> L5a
            boolean r1 = i()     // Catch: java.io.IOException -> L5a
            if (r1 == 0) goto L59
            r6.c()     // Catch: java.io.IOException -> L5a
            goto L59
        L49:
            java.lang.String r1 = r6.c()     // Catch: java.io.IOException -> L5a
            r5.d(r1)     // Catch: java.io.IOException -> L5a
            boolean r1 = i()     // Catch: java.io.IOException -> L5a
            if (r1 == 0) goto L59
            r6.c()     // Catch: java.io.IOException -> L5a
        L59:
            return r4
        L5a:
            r6 = move-exception
            java.lang.String r1 = "ូ"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            java.lang.String r2 = r6.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L84
            java.lang.String r1 = "ួ"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            java.lang.String r2 = r6.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7c
            goto L84
        L7c:
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto L83
            return r0
        L83:
            throw r6
        L84:
            r6.getMessage()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.e1.m(com.google.firebase.messaging.b1):boolean");
    }

    void n(Runnable runnable, long j5) {
        this.f17248f.schedule(runnable, j5, TimeUnit.SECONDS);
    }

    @androidx.annotation.m1
    Task<Void> o(b1 b1Var) {
        this.f17250h.a(b1Var);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        b(b1Var, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    synchronized void p(boolean z5) {
        this.f17249g = z5;
    }

    void r() {
        if (h()) {
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> s(String str) {
        Task<Void> o5 = o(b1.f(str));
        r();
        return o5;
    }

    @n1
    boolean t() throws IOException {
        while (true) {
            synchronized (this) {
                b1 e6 = this.f17250h.e();
                if (e6 == null) {
                    i();
                    return true;
                }
                if (!m(e6)) {
                    return false;
                }
                this.f17250h.i(e6);
                l(e6);
            }
        }
    }

    void u(long j5) {
        n(new f1(this, this.f17243a, this.f17244b, Math.min(Math.max(30L, 2 * j5), f17242m)), j5);
        p(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> v(String str) {
        Task<Void> o5 = o(b1.g(str));
        r();
        return o5;
    }
}
