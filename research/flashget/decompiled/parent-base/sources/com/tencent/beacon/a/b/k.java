package com.tencent.beacon.a.b;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BeaconAsyncTask.java */
/* loaded from: classes6.dex */
class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f71050a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f71051b;

    k(l lVar, Runnable runnable) {
        this.f71051b = lVar;
        this.f71050a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicInteger atomicInteger;
        try {
            this.f71050a.run();
        } catch (Throwable th) {
            atomicInteger = l.f71054f;
            if (atomicInteger.addAndGet(1) < 100) {
                j.e().a(ProtectedSandApp.s("〠\u0001"), ProtectedSandApp.s("〡\u0001"), th);
            }
            com.tencent.beacon.base.util.h.a(th.getMessage());
            com.tencent.beacon.base.util.c.a(th);
        }
    }
}
