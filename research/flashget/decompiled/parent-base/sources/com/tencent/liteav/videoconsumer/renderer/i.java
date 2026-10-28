package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes7.dex */
final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final e f72457a;

    private i(e eVar) {
        this.f72457a = eVar;
    }

    public static Runnable a(e eVar) {
        return new i(eVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72457a.b();
    }
}
