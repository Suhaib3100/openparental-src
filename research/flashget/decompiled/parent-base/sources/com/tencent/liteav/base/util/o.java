package com.tencent.liteav.base.util;

import com.tencent.liteav.base.util.l;

/* loaded from: classes7.dex */
final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final l.a f71956a;

    private o(l.a aVar) {
        this.f71956a = aVar;
    }

    public static Runnable a(l.a aVar) {
        return new o(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.a aVar = this.f71956a;
        l.this.f71945a.execute(aVar.f71948a);
    }
}
