package com.tencent.rtmp.ui;

/* loaded from: classes7.dex */
final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TXCloudVideoView f72716a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72717b;

    /* renamed from: c, reason: collision with root package name */
    private final int f72718c;

    /* renamed from: d, reason: collision with root package name */
    private final int f72719d;

    /* renamed from: e, reason: collision with root package name */
    private final int f72720e;

    private c(TXCloudVideoView tXCloudVideoView, int i4, int i5, int i6, int i7) {
        this.f72716a = tXCloudVideoView;
        this.f72717b = i4;
        this.f72718c = i5;
        this.f72719d = i6;
        this.f72720e = i7;
    }

    public static Runnable a(TXCloudVideoView tXCloudVideoView, int i4, int i5, int i6, int i7) {
        return new c(tXCloudVideoView, i4, i5, i6, i7);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72716a.showFocusViewInternal(this.f72717b, this.f72718c, this.f72719d, this.f72720e);
    }
}
