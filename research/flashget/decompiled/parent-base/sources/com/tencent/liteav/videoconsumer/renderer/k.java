package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes7.dex */
final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final j f72475a;

    private k(j jVar) {
        this.f72475a = jVar;
    }

    public static Runnable a(j jVar) {
        return new k(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72475a.a();
    }
}
