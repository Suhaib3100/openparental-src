package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes7.dex */
final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final j f72480a;

    private o(j jVar) {
        this.f72480a = jVar;
    }

    public static Runnable a(j jVar) {
        return new o(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.b(this.f72480a);
    }
}
