package com.tencent.liteav.base.util;

import android.os.MessageQueue;

/* loaded from: classes7.dex */
final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final CustomHandler f71928a;

    /* renamed from: b, reason: collision with root package name */
    private final MessageQueue.IdleHandler f71929b;

    private d(CustomHandler customHandler, MessageQueue.IdleHandler idleHandler) {
        this.f71928a = customHandler;
        this.f71929b = idleHandler;
    }

    public static Runnable a(CustomHandler customHandler, MessageQueue.IdleHandler idleHandler) {
        return new d(customHandler, idleHandler);
    }

    @Override // java.lang.Runnable
    public final void run() {
        CustomHandler.lambda$quitLooper$3(this.f71928a, this.f71929b);
    }
}
