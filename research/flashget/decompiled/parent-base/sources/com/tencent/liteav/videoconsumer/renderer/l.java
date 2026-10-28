package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes7.dex */
final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final j f72476a;

    private l(j jVar) {
        this.f72476a = jVar;
    }

    public static Runnable a(j jVar) {
        return new l(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72476a.a();
    }
}
