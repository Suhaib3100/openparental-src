package com.tencent.rtmp.video.a;

/* loaded from: classes7.dex */
final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final f f72751a;

    private h(f fVar) {
        this.f72751a = fVar;
    }

    public static Runnable a(f fVar) {
        return new h(fVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72751a.c();
    }
}
