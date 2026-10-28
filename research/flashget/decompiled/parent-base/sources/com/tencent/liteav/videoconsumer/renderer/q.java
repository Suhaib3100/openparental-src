package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes7.dex */
final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final j f72482a;

    private q(j jVar) {
        this.f72482a = jVar;
    }

    public static Runnable a(j jVar) {
        return new q(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.f(this.f72482a);
    }
}
