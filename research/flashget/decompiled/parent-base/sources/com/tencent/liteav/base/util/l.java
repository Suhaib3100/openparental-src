package com.tencent.liteav.base.util;

import android.os.Looper;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class l implements q {

    /* renamed from: a, reason: collision with root package name */
    final ThreadPoolExecutor f71945a;

    /* renamed from: b, reason: collision with root package name */
    final CustomHandler f71946b;

    /* renamed from: c, reason: collision with root package name */
    final List<a> f71947c;

    class a {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f71948a;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f71950c;

        /* renamed from: d, reason: collision with root package name */
        private final Runnable f71951d = o.a(this);

        /* renamed from: e, reason: collision with root package name */
        private final long f71952e;

        public a(Runnable runnable, long j4) {
            this.f71950c = runnable;
            this.f71948a = n.a(this, runnable);
            this.f71952e = j4;
        }

        public final void a() {
            l.this.f71946b.postDelayed(this.f71951d, this.f71952e);
        }
    }

    public l() {
        this((byte) 0);
    }

    @Override // com.tencent.liteav.base.util.q
    public final void a(Runnable runnable) {
        this.f71945a.execute(runnable);
    }

    private l(byte b5) {
        this(ProtectedSandApp.s("叀\u0001"));
    }

    public final void a(Runnable runnable, long j4) {
        a aVar = new a(runnable, j4);
        synchronized (this) {
            this.f71947c.add(aVar);
        }
        aVar.a();
    }

    public l(String str) {
        this.f71945a = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), m.a(str));
        this.f71946b = new CustomHandler(Looper.getMainLooper());
        this.f71947c = new ArrayList();
    }
}
