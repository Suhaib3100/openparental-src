package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes7.dex */
final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final j f72479a;

    private n(j jVar) {
        this.f72479a = jVar;
    }

    public static Runnable a(j jVar) {
        return new n(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.c(this.f72479a);
    }
}
