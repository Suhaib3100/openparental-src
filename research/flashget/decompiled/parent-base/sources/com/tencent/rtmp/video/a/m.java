package com.tencent.rtmp.video.a;

import com.tencent.rtmp.video.a.f;

/* loaded from: classes7.dex */
final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final f f72767a;

    private m(f fVar) {
        this.f72767a = fVar;
    }

    public static Runnable a(f fVar) {
        return new m(fVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.AnonymousClass1.a(this.f72767a);
    }
}
