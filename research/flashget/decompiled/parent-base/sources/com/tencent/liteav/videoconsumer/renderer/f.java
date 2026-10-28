package com.tencent.liteav.videoconsumer.renderer;

import android.view.SurfaceView;

/* loaded from: classes7.dex */
final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final e f72453a;

    /* renamed from: b, reason: collision with root package name */
    private final SurfaceView f72454b;

    private f(e eVar, SurfaceView surfaceView) {
        this.f72453a = eVar;
        this.f72454b = surfaceView;
    }

    public static Runnable a(e eVar, SurfaceView surfaceView) {
        return new f(eVar, surfaceView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.a(this.f72453a, this.f72454b);
    }
}
