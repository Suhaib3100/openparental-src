package com.tencent.beacon.a.b;

import android.os.Handler;
import androidx.annotation.o0;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: AbsAsyncTask.java */
/* loaded from: classes6.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected static volatile b f71023a;

    /* renamed from: b, reason: collision with root package name */
    protected int f71024b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f71025c = false;

    /* compiled from: AbsAsyncTask.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final b f71026a = new l();
    }

    public static b b() {
        return a.f71026a;
    }

    public abstract Handler a(int i4);

    public abstract void a(int i4, long j4, int i5);

    public abstract void a(int i4, long j4, long j5, @o0 Runnable runnable);

    public abstract void a(int i4, boolean z4, int i5);

    public abstract void a(long j4, int i4);

    public abstract void a(long j4, @o0 Runnable runnable);

    public abstract void a(@o0 Runnable runnable);

    public abstract void a(boolean z4, int i4);

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            try {
                if (f71023a == null) {
                    f71023a = new l();
                }
                bVar = f71023a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public synchronized void b(int i4) {
        if (this.f71025c) {
            return;
        }
        a(true, 1);
        a(i4, new com.tencent.beacon.a.b.a(this));
        this.f71025c = true;
    }

    public static synchronized void a(@o0 ScheduledExecutorService scheduledExecutorService) {
        synchronized (b.class) {
            if (f71023a == null) {
                f71023a = new l(scheduledExecutorService);
            }
        }
    }
}
