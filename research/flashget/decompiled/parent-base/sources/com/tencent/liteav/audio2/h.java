package com.tencent.liteav.audio2;

import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
final /* synthetic */ class h implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final e f71762a;

    private h(e eVar) {
        this.f71762a = eVar;
    }

    public static Executor a(e eVar) {
        return new h(eVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f71762a.f71755f.a(runnable);
    }
}
