package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes7.dex */
final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f71925a;

    /* renamed from: b, reason: collision with root package name */
    private final CountDownLatch f71926b;

    private b(Runnable runnable, CountDownLatch countDownLatch) {
        this.f71925a = runnable;
        this.f71926b = countDownLatch;
    }

    public static Runnable a(Runnable runnable, CountDownLatch countDownLatch) {
        return new b(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        CustomHandler.lambda$runAndWaitDone$1(this.f71925a, this.f71926b);
    }
}
