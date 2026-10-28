package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;

/* loaded from: classes7.dex */
final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final NativeScreenCaptureListener f72659a;

    /* renamed from: b, reason: collision with root package name */
    private final SurfaceTexture f72660b;

    private f(NativeScreenCaptureListener nativeScreenCaptureListener, SurfaceTexture surfaceTexture) {
        this.f72659a = nativeScreenCaptureListener;
        this.f72660b = surfaceTexture;
    }

    public static Runnable a(NativeScreenCaptureListener nativeScreenCaptureListener, SurfaceTexture surfaceTexture) {
        return new f(nativeScreenCaptureListener, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72659a.notifyFrameAvailable(this.f72660b);
    }
}
