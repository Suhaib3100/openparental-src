package com.tencent.liteav.audio2;

/* loaded from: classes7.dex */
final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final e f71761a;

    private g(e eVar) {
        this.f71761a = eVar;
    }

    public static Runnable a(e eVar) {
        return new g(eVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f71761a.d();
    }
}
