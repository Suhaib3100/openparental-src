package com.tencent.liteav.videoproducer.capture.b;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import com.tencent.liteav.videoproducer.capture.b.a;

/* loaded from: classes7.dex */
final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final a.AnonymousClass4 f72559a;

    /* renamed from: b, reason: collision with root package name */
    private final TotalCaptureResult f72560b;

    /* renamed from: c, reason: collision with root package name */
    private final CaptureRequest f72561c;

    private c(a.AnonymousClass4 anonymousClass4, TotalCaptureResult totalCaptureResult, CaptureRequest captureRequest) {
        this.f72559a = anonymousClass4;
        this.f72560b = totalCaptureResult;
        this.f72561c = captureRequest;
    }

    public static Runnable a(a.AnonymousClass4 anonymousClass4, TotalCaptureResult totalCaptureResult, CaptureRequest captureRequest) {
        return new c(anonymousClass4, totalCaptureResult, captureRequest);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.AnonymousClass4.a(this.f72559a, this.f72560b, this.f72561c);
    }
}
