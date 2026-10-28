package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes7.dex */
final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final j f72477a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f72478b;

    private m(j jVar, boolean z4) {
        this.f72477a = jVar;
        this.f72478b = z4;
    }

    public static Runnable a(j jVar, boolean z4) {
        return new m(jVar, z4);
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.a(this.f72477a, this.f72478b);
    }
}
