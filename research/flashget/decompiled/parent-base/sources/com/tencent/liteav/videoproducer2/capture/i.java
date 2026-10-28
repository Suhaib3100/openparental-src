package com.tencent.liteav.videoproducer2.capture;

/* loaded from: classes7.dex */
final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final NativeScreenCaptureListener f72665a;

    private i(NativeScreenCaptureListener nativeScreenCaptureListener) {
        this.f72665a = nativeScreenCaptureListener;
    }

    public static Runnable a(NativeScreenCaptureListener nativeScreenCaptureListener) {
        return new i(nativeScreenCaptureListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72665a.notifyClassNotFound();
    }
}
