package com.tencent.liteav.videoproducer.capture.b;

/* loaded from: classes7.dex */
final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final a f72557a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72558b;

    private b(a aVar, int i4) {
        this.f72557a = aVar;
        this.f72558b = i4;
    }

    public static Runnable a(a aVar, int i4) {
        return new b(aVar, i4);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.a(this.f72557a, this.f72558b);
    }
}
