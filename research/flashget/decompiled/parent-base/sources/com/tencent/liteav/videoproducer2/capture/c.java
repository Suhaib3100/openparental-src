package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;

/* loaded from: classes7.dex */
final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCameraCaptureListener f72653a;

    /* renamed from: b, reason: collision with root package name */
    private final SurfaceTexture f72654b;

    private c(NativeCameraCaptureListener nativeCameraCaptureListener, SurfaceTexture surfaceTexture) {
        this.f72653a = nativeCameraCaptureListener;
        this.f72654b = surfaceTexture;
    }

    public static Runnable a(NativeCameraCaptureListener nativeCameraCaptureListener, SurfaceTexture surfaceTexture) {
        return new c(nativeCameraCaptureListener, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        r0.runInNative(d.a(this.f72653a, this.f72654b));
    }
}
