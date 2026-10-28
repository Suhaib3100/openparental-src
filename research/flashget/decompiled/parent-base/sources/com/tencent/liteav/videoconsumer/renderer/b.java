package com.tencent.liteav.videoconsumer.renderer;

import android.view.Surface;

/* loaded from: classes7.dex */
final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final a f72436a;

    /* renamed from: b, reason: collision with root package name */
    private final Surface f72437b;

    private b(a aVar, Surface surface) {
        this.f72436a = aVar;
        this.f72437b = surface;
    }

    public static Runnable a(a aVar, Surface surface) {
        return new b(aVar, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.a(this.f72436a, this.f72437b);
    }
}
