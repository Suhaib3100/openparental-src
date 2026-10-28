package com.tencent.liteav.trtc;

import com.tencent.trtc.TRTCCloudDef;

/* loaded from: classes7.dex */
final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TrtcCloudJni f72113a;

    /* renamed from: b, reason: collision with root package name */
    private final TRTCCloudDef.TRTCScreenShareParams f72114b;

    private b(TrtcCloudJni trtcCloudJni, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f72113a = trtcCloudJni;
        this.f72114b = tRTCScreenShareParams;
    }

    public static Runnable a(TrtcCloudJni trtcCloudJni, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        return new b(trtcCloudJni, tRTCScreenShareParams);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72113a.showFloatingWindow(this.f72114b.floatingView);
    }
}
