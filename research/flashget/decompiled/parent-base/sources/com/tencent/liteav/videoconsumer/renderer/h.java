package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes7.dex */
final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final e f72456a;

    private h(e eVar) {
        this.f72456a = eVar;
    }

    public static Runnable a(e eVar) {
        return new h(eVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.b(this.f72456a);
    }
}
