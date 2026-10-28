package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class w2 implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f40750b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f40751c;

    w2(m mVar) {
        Objects.requireNonNull(mVar);
        this.f40750b = Executors.defaultThreadFactory();
        this.f40751c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f40751c;
        Thread newThread = this.f40750b.newThread(runnable);
        newThread.setName(ProtectedSandApp.s("׳") + atomicInteger.getAndIncrement());
        return newThread;
    }
}
