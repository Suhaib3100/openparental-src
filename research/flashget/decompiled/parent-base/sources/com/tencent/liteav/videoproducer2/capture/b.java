package com.tencent.liteav.videoproducer2.capture;

/* loaded from: classes7.dex */
final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCameraCaptureListener f72651a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72652b;

    private b(NativeCameraCaptureListener nativeCameraCaptureListener, int i4) {
        this.f72651a = nativeCameraCaptureListener;
        this.f72652b = i4;
    }

    public static Runnable a(NativeCameraCaptureListener nativeCameraCaptureListener, int i4) {
        return new b(nativeCameraCaptureListener, i4);
    }

    @Override // java.lang.Runnable
    public final void run() {
        r0.runInNative(e.a(this.f72651a, this.f72652b));
    }
}
