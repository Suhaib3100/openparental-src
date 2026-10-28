package com.tencent.liteav.videoproducer2.capture;

/* loaded from: classes7.dex */
final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final NativeScreenCaptureListener f72661a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f72662b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f72663c;

    private g(NativeScreenCaptureListener nativeScreenCaptureListener, boolean z4, boolean z5) {
        this.f72661a = nativeScreenCaptureListener;
        this.f72662b = z4;
        this.f72663c = z5;
    }

    public static Runnable a(NativeScreenCaptureListener nativeScreenCaptureListener, boolean z4, boolean z5) {
        return new g(nativeScreenCaptureListener, z4, z5);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72661a.notifyStartFinish(this.f72662b, this.f72663c);
    }
}
