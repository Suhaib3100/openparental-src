package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CustomThreadFactory.java */
/* loaded from: classes6.dex */
class b implements ThreadFactory {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f58499f = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f58500b = new AtomicLong();

    /* renamed from: c, reason: collision with root package name */
    private final String f58501c;

    /* renamed from: d, reason: collision with root package name */
    private final int f58502d;

    /* renamed from: e, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f58503e;

    b(String str, int i4, @zc.h StrictMode.ThreadPolicy threadPolicy) {
        this.f58501c = str;
        this.f58502d = i4;
        this.f58503e = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f58502d);
        StrictMode.ThreadPolicy threadPolicy = this.f58503e;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f58499f.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, ProtectedSandApp.s("ﮔ"), this.f58501c, Long.valueOf(this.f58500b.getAndIncrement())));
        return newThread;
    }
}
