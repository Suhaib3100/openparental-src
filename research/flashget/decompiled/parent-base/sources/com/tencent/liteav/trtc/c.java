package com.tencent.liteav.trtc;

/* loaded from: classes7.dex */
final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TrtcCloudJni f72115a;

    private c(TrtcCloudJni trtcCloudJni) {
        this.f72115a = trtcCloudJni;
    }

    public static Runnable a(TrtcCloudJni trtcCloudJni) {
        return new c(trtcCloudJni);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72115a.hideFloatingWindow();
    }
}
