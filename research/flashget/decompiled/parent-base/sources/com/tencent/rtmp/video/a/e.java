package com.tencent.rtmp.video.a;

import com.tencent.rtmp.video.a.a;

/* loaded from: classes7.dex */
final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final a.C1008a f72734a;

    private e(a.C1008a c1008a) {
        this.f72734a = c1008a;
    }

    public static Runnable a(a.C1008a c1008a) {
        return new e(c1008a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.C1008a c1008a = this.f72734a;
        a.this.f72721a.execute(c1008a.f72725b);
    }
}
