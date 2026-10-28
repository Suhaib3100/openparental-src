package com.tencent.rtmp.video.a;

import com.tencent.rtmp.video.a.a;

/* loaded from: classes7.dex */
final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final a.C1008a f72732a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f72733b;

    private d(a.C1008a c1008a, Runnable runnable) {
        this.f72732a = c1008a;
        this.f72733b = runnable;
    }

    public static Runnable a(a.C1008a c1008a, Runnable runnable) {
        return new d(c1008a, runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.C1008a c1008a = this.f72732a;
        this.f72733b.run();
        synchronized (a.this) {
            a.this.f72723c.remove(c1008a);
        }
    }
}
