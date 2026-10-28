package com.tencent.liteav.videobase.utils;

import android.graphics.SurfaceTexture;

/* loaded from: classes7.dex */
final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final SurfaceTextureHolder f72319a;

    /* renamed from: b, reason: collision with root package name */
    private final SurfaceTexture f72320b;

    private f(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        this.f72319a = surfaceTextureHolder;
        this.f72320b = surfaceTexture;
    }

    public static Runnable a(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        return new f(surfaceTextureHolder, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTextureHolder.lambda$onFrameAvailable$0(this.f72319a, this.f72320b);
    }
}
