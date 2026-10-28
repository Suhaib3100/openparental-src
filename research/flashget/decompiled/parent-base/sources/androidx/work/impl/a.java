package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.work.d0;

/* compiled from: DefaultRunnableScheduler.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class a implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36013a;

    public a() {
        this.f36013a = androidx.core.os.k.a(Looper.getMainLooper());
    }

    @Override // androidx.work.d0
    public void a(@o0 Runnable runnable) {
        this.f36013a.removeCallbacks(runnable);
    }

    @Override // androidx.work.d0
    public void b(long delayInMillis, @o0 Runnable runnable) {
        this.f36013a.postDelayed(runnable, delayInMillis);
    }

    @o0
    public Handler c() {
        return this.f36013a;
    }

    @m1
    public a(@o0 Handler handler) {
        this.f36013a = handler;
    }
}
