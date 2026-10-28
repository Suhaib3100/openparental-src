package com.tencent.liteav.videoproducer2.capture;

import android.media.projection.MediaProjection;
import android.view.Surface;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.VirtualDisplayListener;
import com.tencent.rtmp.video.VirtualDisplayWrapper;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: g, reason: collision with root package name */
    private static BaseBridge.BaseBridgeCallback f72666g;

    /* renamed from: a, reason: collision with root package name */
    Surface f72667a;

    /* renamed from: b, reason: collision with root package name */
    MediaProjection f72668b;

    /* renamed from: c, reason: collision with root package name */
    int f72669c;

    /* renamed from: d, reason: collision with root package name */
    int f72670d;

    /* renamed from: e, reason: collision with root package name */
    VirtualDisplayWrapper f72671e;

    /* renamed from: f, reason: collision with root package name */
    VirtualDisplayListener f72672f = new VirtualDisplayListener() { // from class: com.tencent.liteav.videoproducer2.capture.j.1
        @Override // com.tencent.rtmp.video.VirtualDisplayListener
        public final void onCaptureError() {
            if (j.this.f72673h != null) {
                j.this.f72673h.onCaptureError();
            }
        }

        @Override // com.tencent.rtmp.video.VirtualDisplayListener
        public final void onStartFinish(boolean z4, boolean z5) {
            if (j.this.f72673h != null) {
                j.this.f72673h.onStartFinish(z4, z5);
            }
        }

        @Override // com.tencent.rtmp.video.VirtualDisplayListener
        public final void onVirtualDisplayCreate(VirtualDisplayWrapper virtualDisplayWrapper) {
            j.this.f72671e = virtualDisplayWrapper;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private NativeScreenCaptureListener f72673h;

    static {
        a aVar = new a();
        f72666g = aVar;
        BaseBridge.setBaseBridgeCallback(aVar);
    }

    public j(Surface surface, int i4, int i5, MediaProjection mediaProjection, NativeScreenCaptureListener nativeScreenCaptureListener) {
        this.f72667a = surface;
        this.f72668b = mediaProjection;
        this.f72673h = nativeScreenCaptureListener;
        this.f72669c = i4;
        this.f72670d = i5;
    }
}
