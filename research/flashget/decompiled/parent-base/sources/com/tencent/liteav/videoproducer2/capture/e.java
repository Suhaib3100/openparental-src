package com.tencent.liteav.videoproducer2.capture;

/* loaded from: classes7.dex */
final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCameraCaptureListener f72657a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72658b;

    private e(NativeCameraCaptureListener nativeCameraCaptureListener, int i4) {
        this.f72657a = nativeCameraCaptureListener;
        this.f72658b = i4;
    }

    public static Runnable a(NativeCameraCaptureListener nativeCameraCaptureListener, int i4) {
        return new e(nativeCameraCaptureListener, i4);
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCameraCaptureListener.nativeOnCameraError(this.f72657a.mNativeHandle, this.f72658b);
    }
}
