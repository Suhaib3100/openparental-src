package com.tencent.beacon.a.b;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BeaconThreadFactory.java */
/* loaded from: classes6.dex */
public final class m implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f71065a = new AtomicInteger(1);

    public String a() {
        return ProtectedSandApp.s("〧\u0001") + this.f71065a.getAndIncrement();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@o0 Runnable runnable) {
        try {
            return new Thread(runnable, a());
        } catch (Exception e4) {
            com.tencent.beacon.base.util.c.a(e4);
            return null;
        } catch (OutOfMemoryError unused) {
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("〨\u0001"), new Object[0]);
            return null;
        }
    }
}
