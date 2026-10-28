package com.tencent.qcloud.core.task;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.o0;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
final class UIThreadExecutor implements Executor {
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    UIThreadExecutor() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@o0 Runnable runnable) {
        this.mHandler.post(runnable);
    }
}
