package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes7.dex */
final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final a f72439a;

    private d(a aVar) {
        this.f72439a = aVar;
    }

    public static Runnable a(a aVar) {
        return new d(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.a(this.f72439a);
    }
}
