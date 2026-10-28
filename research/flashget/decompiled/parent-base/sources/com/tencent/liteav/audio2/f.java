package com.tencent.liteav.audio2;

/* loaded from: classes7.dex */
final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final e f71760a;

    private f(e eVar) {
        this.f71760a = eVar;
    }

    public static Runnable a(e eVar) {
        return new f(eVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f71760a.d();
    }
}
