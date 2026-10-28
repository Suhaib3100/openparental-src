package com.tencent.liteav.base.util;

import com.tencent.liteav.base.util.l;

/* loaded from: classes7.dex */
final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final l.a f71954a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f71955b;

    private n(l.a aVar, Runnable runnable) {
        this.f71954a = aVar;
        this.f71955b = runnable;
    }

    public static Runnable a(l.a aVar, Runnable runnable) {
        return new n(aVar, runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.a aVar = this.f71954a;
        this.f71955b.run();
        synchronized (l.this) {
            l.this.f71947c.remove(aVar);
        }
    }
}
