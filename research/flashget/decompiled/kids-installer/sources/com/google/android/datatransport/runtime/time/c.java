package com.google.android.datatransport.runtime.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: TestClock.java */
/* loaded from: classes3.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f12760a;

    public c(long j5) {
        this.f12760a = new AtomicLong(j5);
    }

    @Override // com.google.android.datatransport.runtime.time.a
    public long a() {
        return this.f12760a.get();
    }

    public void b(long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u20fa"));
        }
        this.f12760a.addAndGet(j5);
    }

    public void c() {
        b(1L);
    }
}
