package com.tencent.rtmp.ui;

import android.graphics.Color;

/* loaded from: classes7.dex */
final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TXCloudVideoView f72711a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72712b;

    /* renamed from: c, reason: collision with root package name */
    private final int f72713c;

    /* renamed from: d, reason: collision with root package name */
    private final int f72714d;

    /* renamed from: e, reason: collision with root package name */
    private final int f72715e;

    private b(TXCloudVideoView tXCloudVideoView, int i4, int i5, int i6, int i7) {
        this.f72711a = tXCloudVideoView;
        this.f72712b = i4;
        this.f72713c = i5;
        this.f72714d = i6;
        this.f72715e = i7;
    }

    public static Runnable a(TXCloudVideoView tXCloudVideoView, int i4, int i5, int i6, int i7) {
        return new b(tXCloudVideoView, i4, i5, i6, i7);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72711a.setBackgroundColor(Color.argb(this.f72712b, this.f72713c, this.f72714d, this.f72715e));
    }
}
