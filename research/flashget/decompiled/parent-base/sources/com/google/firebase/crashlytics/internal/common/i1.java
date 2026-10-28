package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Utils.java */
/* loaded from: classes6.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f58739a = 4000;

    /* renamed from: b, reason: collision with root package name */
    private static final int f58740b = 3000;

    /* renamed from: c, reason: collision with root package name */
    private static final ExecutorService f58741c = k0.d(ProtectedSandApp.s("ﰳ"));

    private i1() {
    }

    public static /* synthetic */ Object a(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    @Deprecated
    public static <T> T b(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f58741c, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.h1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return i1.a(countDownLatch, task2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException(ProtectedSandApp.s("ﰴ"));
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    @f9.a
    public static boolean c(CountDownLatch countDownLatch, long j4, TimeUnit timeUnit) {
        boolean z4 = false;
        try {
            long nanos = timeUnit.toNanos(j4);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private static /* synthetic */ Object d(CountDownLatch countDownLatch, Task task) throws Exception {
        countDownLatch.countDown();
        return null;
    }
}
