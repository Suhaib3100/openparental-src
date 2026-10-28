package com.tencent.rtmp.video.a;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes7.dex */
final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f72730a;

    /* renamed from: b, reason: collision with root package name */
    private final CountDownLatch f72731b;

    private c(Runnable runnable, CountDownLatch countDownLatch) {
        this.f72730a = runnable;
        this.f72731b = countDownLatch;
    }

    public static Runnable a(Runnable runnable, CountDownLatch countDownLatch) {
        return new c(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f72730a;
        CountDownLatch countDownLatch = this.f72731b;
        runnable.run();
        countDownLatch.countDown();
    }
}
