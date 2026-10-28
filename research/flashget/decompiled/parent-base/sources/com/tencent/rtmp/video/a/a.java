package com.tencent.rtmp.video.a;

import android.os.Handler;
import android.os.Looper;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final ThreadPoolExecutor f72721a;

    /* renamed from: b, reason: collision with root package name */
    final Handler f72722b;

    /* renamed from: c, reason: collision with root package name */
    final List<C1008a> f72723c;

    /* renamed from: com.tencent.rtmp.video.a.a$a, reason: collision with other inner class name */
    class C1008a {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f72724a;

        /* renamed from: b, reason: collision with root package name */
        final Runnable f72725b;

        /* renamed from: c, reason: collision with root package name */
        final Runnable f72726c = e.a(this);

        /* renamed from: d, reason: collision with root package name */
        final long f72727d;

        public C1008a(Runnable runnable, long j4) {
            this.f72724a = runnable;
            this.f72725b = d.a(this, runnable);
            this.f72727d = j4;
        }
    }

    public a() {
        this((byte) 0);
    }

    public final void a(Runnable runnable) {
        this.f72721a.execute(runnable);
    }

    public final void b(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f72721a.execute(c.a(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void c(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.f72721a.remove(runnable);
        synchronized (this) {
            try {
                Iterator<C1008a> it = this.f72723c.iterator();
                while (it.hasNext()) {
                    C1008a next = it.next();
                    if (next != null && runnable == next.f72724a) {
                        a.this.f72722b.removeCallbacks(next.f72726c);
                        a.this.f72721a.remove(next.f72725b);
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private a(byte b5) {
        this(ProtectedSandApp.s("屄\u0001"));
    }

    public final void a(Runnable runnable, long j4) {
        C1008a c1008a = new C1008a(runnable, j4);
        synchronized (this) {
            this.f72723c.add(c1008a);
        }
        a.this.f72722b.postDelayed(c1008a.f72726c, c1008a.f72727d);
    }

    private a(String str) {
        this.f72721a = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), b.a(str));
        this.f72722b = new Handler(Looper.getMainLooper());
        this.f72723c = new ArrayList();
    }
}
