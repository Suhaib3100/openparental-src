package com.tencent.rtmp.ui;

/* loaded from: classes7.dex */
final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TXCloudVideoView f72710a;

    private a(TXCloudVideoView tXCloudVideoView) {
        this.f72710a = tXCloudVideoView;
    }

    public static Runnable a(TXCloudVideoView tXCloudVideoView) {
        return new a(tXCloudVideoView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72710a.hideIndicatorView();
    }
}
