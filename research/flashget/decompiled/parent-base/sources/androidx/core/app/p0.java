package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.c1;
import androidx.core.app.p0;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

/* compiled from: PendingIntentCompat.java */
/* loaded from: classes3.dex */
public final class p0 {

    /* compiled from: PendingIntentCompat.java */
    @androidx.annotation.x0(23)
    private static class a {
        private a() {
        }

        public static void a(@androidx.annotation.o0 PendingIntent pendingIntent, @androidx.annotation.o0 Context context, int i4, @androidx.annotation.o0 Intent intent, @androidx.annotation.q0 PendingIntent.OnFinished onFinished, @androidx.annotation.q0 Handler handler, @androidx.annotation.q0 String str, @androidx.annotation.q0 Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i4, intent, onFinished, handler, str, bundle);
        }
    }

    /* compiled from: PendingIntentCompat.java */
    @androidx.annotation.x0(26)
    private static class b {
        private b() {
        }

        public static PendingIntent a(Context context, int i4, Intent intent, int i5) {
            return PendingIntent.getForegroundService(context, i4, intent, i5);
        }
    }

    /* compiled from: PendingIntentCompat.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PendingIntentCompat.java */
    static class d implements Closeable {

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        private PendingIntent.OnFinished f25856c;

        /* renamed from: b, reason: collision with root package name */
        private final CountDownLatch f25855b = new CountDownLatch(1);

        /* renamed from: d, reason: collision with root package name */
        private boolean f25857d = false;

        d(@androidx.annotation.q0 PendingIntent.OnFinished onFinished) {
            this.f25856c = onFinished;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(PendingIntent pendingIntent, Intent intent, int i4, String str, Bundle bundle) {
            boolean z4 = false;
            while (true) {
                try {
                    this.f25855b.await();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.f25856c;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i4, str, bundle);
                this.f25856c = null;
            }
        }

        public void b() {
            this.f25857d = true;
        }

        @androidx.annotation.q0
        public PendingIntent.OnFinished c() {
            if (this.f25856c == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: androidx.core.app.q0
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i4, String str, Bundle bundle) {
                    p0.d.this.d(pendingIntent, intent, i4, str, bundle);
                }
            };
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f25857d) {
                this.f25856c = null;
            }
            this.f25855b.countDown();
        }
    }

    private p0() {
    }

    private static int a(boolean z4, int i4) {
        int i5;
        if (!z4) {
            i5 = androidx.core.view.accessibility.b.f26943s;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i4;
            }
            i5 = 33554432;
        }
        return i4 | i5;
    }

    @androidx.annotation.o0
    public static PendingIntent b(@androidx.annotation.o0 Context context, int i4, @androidx.annotation.o0 @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i5, @androidx.annotation.q0 Bundle bundle, boolean z4) {
        return PendingIntent.getActivities(context, i4, intentArr, a(z4, i5), bundle);
    }

    @androidx.annotation.o0
    public static PendingIntent c(@androidx.annotation.o0 Context context, int i4, @androidx.annotation.o0 @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i5, boolean z4) {
        return PendingIntent.getActivities(context, i4, intentArr, a(z4, i5));
    }

    @androidx.annotation.q0
    public static PendingIntent d(@androidx.annotation.o0 Context context, int i4, @androidx.annotation.o0 Intent intent, int i5, @androidx.annotation.q0 Bundle bundle, boolean z4) {
        return PendingIntent.getActivity(context, i4, intent, a(z4, i5), bundle);
    }

    @androidx.annotation.q0
    public static PendingIntent e(@androidx.annotation.o0 Context context, int i4, @androidx.annotation.o0 Intent intent, int i5, boolean z4) {
        return PendingIntent.getActivity(context, i4, intent, a(z4, i5));
    }

    @androidx.annotation.q0
    public static PendingIntent f(@androidx.annotation.o0 Context context, int i4, @androidx.annotation.o0 Intent intent, int i5, boolean z4) {
        return PendingIntent.getBroadcast(context, i4, intent, a(z4, i5));
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public static PendingIntent g(@androidx.annotation.o0 Context context, int i4, @androidx.annotation.o0 Intent intent, int i5, boolean z4) {
        return b.a(context, i4, intent, a(z4, i5));
    }

    @androidx.annotation.q0
    public static PendingIntent h(@androidx.annotation.o0 Context context, int i4, @androidx.annotation.o0 Intent intent, int i5, boolean z4) {
        return PendingIntent.getService(context, i4, intent, a(z4, i5));
    }

    @SuppressLint({"LambdaLast"})
    public static void i(@androidx.annotation.o0 PendingIntent pendingIntent, int i4, @androidx.annotation.q0 PendingIntent.OnFinished onFinished, @androidx.annotation.q0 Handler handler) throws PendingIntent.CanceledException {
        d dVar = new d(onFinished);
        try {
            pendingIntent.send(i4, dVar.c(), handler);
            dVar.b();
            dVar.close();
        } catch (Throwable th) {
            try {
                dVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @SuppressLint({"LambdaLast"})
    public static void j(@androidx.annotation.o0 PendingIntent pendingIntent, @androidx.annotation.o0 @SuppressLint({"ContextFirst"}) Context context, int i4, @androidx.annotation.o0 Intent intent, @androidx.annotation.q0 PendingIntent.OnFinished onFinished, @androidx.annotation.q0 Handler handler) throws PendingIntent.CanceledException {
        k(pendingIntent, context, i4, intent, onFinished, handler, null, null);
    }

    @SuppressLint({"LambdaLast"})
    public static void k(@androidx.annotation.o0 PendingIntent pendingIntent, @androidx.annotation.o0 @SuppressLint({"ContextFirst"}) Context context, int i4, @androidx.annotation.o0 Intent intent, @androidx.annotation.q0 PendingIntent.OnFinished onFinished, @androidx.annotation.q0 Handler handler, @androidx.annotation.q0 String str, @androidx.annotation.q0 Bundle bundle) throws PendingIntent.CanceledException {
        d dVar = new d(onFinished);
        try {
            pendingIntent.send(context, i4, intent, onFinished, handler, str, bundle);
            dVar.b();
            dVar.close();
        } catch (Throwable th) {
            try {
                dVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
