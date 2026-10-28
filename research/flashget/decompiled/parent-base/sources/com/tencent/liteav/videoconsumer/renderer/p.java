package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes7.dex */
final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final j f72481a;

    private p(j jVar) {
        this.f72481a = jVar;
    }

    public static Runnable a(j jVar) {
        return new p(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.a(this.f72481a);
    }
}
