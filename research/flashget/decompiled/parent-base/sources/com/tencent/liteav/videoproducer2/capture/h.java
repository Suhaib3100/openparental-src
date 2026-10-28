package com.tencent.liteav.videoproducer2.capture;

/* loaded from: classes7.dex */
final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final NativeScreenCaptureListener f72664a;

    private h(NativeScreenCaptureListener nativeScreenCaptureListener) {
        this.f72664a = nativeScreenCaptureListener;
    }

    public static Runnable a(NativeScreenCaptureListener nativeScreenCaptureListener) {
        return new h(nativeScreenCaptureListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72664a.notifyCaptureError();
    }
}
