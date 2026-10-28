package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* compiled from: CustomThreadFactory.java */
/* loaded from: classes2.dex */
class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f15422e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f15423a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private final String f15424b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15425c;

    /* renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f15426d;

    b(String str, int i5, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.f15424b = str;
        this.f15425c = i5;
        this.f15426d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f15425c);
        StrictMode.ThreadPolicy threadPolicy = this.f15426d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f15422e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, ProtectedSandApp.s("Ꭼ"), this.f15424b, Long.valueOf(this.f15423a.getAndIncrement())));
        return newThread;
    }
}
