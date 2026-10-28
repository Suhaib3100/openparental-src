package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes7.dex */
final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f71923a;

    /* renamed from: b, reason: collision with root package name */
    private final CountDownLatch f71924b;

    private a(Runnable runnable, CountDownLatch countDownLatch) {
        this.f71923a = runnable;
        this.f71924b = countDownLatch;
    }

    public static Runnable a(Runnable runnable, CountDownLatch countDownLatch) {
        return new a(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        CustomHandler.lambda$runAndWaitDone$0(this.f71923a, this.f71924b);
    }
}
