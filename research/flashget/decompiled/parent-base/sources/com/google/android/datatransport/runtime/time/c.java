package com.google.android.datatransport.runtime.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: TestClock.java */
/* loaded from: classes5.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f52303a;

    public c(long j4) {
        this.f52303a = new AtomicLong(j4);
    }

    @Override // com.google.android.datatransport.runtime.time.a
    public long a() {
        return this.f52303a.get();
    }

    public void b(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("욨"));
        }
        this.f52303a.addAndGet(j4);
    }

    public void c() {
        b(1L);
    }
}
