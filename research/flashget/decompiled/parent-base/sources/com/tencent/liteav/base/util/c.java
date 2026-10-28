package com.tencent.liteav.base.util;

import android.os.MessageQueue;

/* loaded from: classes7.dex */
final /* synthetic */ class c implements MessageQueue.IdleHandler {

    /* renamed from: a, reason: collision with root package name */
    private final CustomHandler f71927a;

    private c(CustomHandler customHandler) {
        this.f71927a = customHandler;
    }

    public static MessageQueue.IdleHandler a(CustomHandler customHandler) {
        return new c(customHandler);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        return CustomHandler.lambda$quitLooper$2(this.f71927a);
    }
}
