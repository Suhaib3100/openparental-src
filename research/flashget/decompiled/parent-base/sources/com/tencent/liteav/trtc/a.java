package com.tencent.liteav.trtc;

/* loaded from: classes7.dex */
final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TrtcCloudJni f72112a;

    private a(TrtcCloudJni trtcCloudJni) {
        this.f72112a = trtcCloudJni;
    }

    public static Runnable a(TrtcCloudJni trtcCloudJni) {
        return new a(trtcCloudJni);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TrtcCloudJni.lambda$enterRoom$0(this.f72112a);
    }
}
