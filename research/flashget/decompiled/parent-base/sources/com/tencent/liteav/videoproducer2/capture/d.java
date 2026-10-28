package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;

/* loaded from: classes7.dex */
final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCameraCaptureListener f72655a;

    /* renamed from: b, reason: collision with root package name */
    private final SurfaceTexture f72656b;

    private d(NativeCameraCaptureListener nativeCameraCaptureListener, SurfaceTexture surfaceTexture) {
        this.f72655a = nativeCameraCaptureListener;
        this.f72656b = surfaceTexture;
    }

    public static Runnable a(NativeCameraCaptureListener nativeCameraCaptureListener, SurfaceTexture surfaceTexture) {
        return new d(nativeCameraCaptureListener, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCameraCaptureListener.nativeOnFrameAvailable(this.f72655a.mNativeHandle, this.f72656b);
    }
}
