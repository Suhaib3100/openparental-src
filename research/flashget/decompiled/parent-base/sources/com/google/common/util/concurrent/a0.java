package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executor;

/* compiled from: DirectExecutor.java */
@b0
@d9.b
/* loaded from: classes6.dex */
enum a0 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return ProtectedSandApp.s("驪");
    }
}
