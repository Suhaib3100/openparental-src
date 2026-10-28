package com.google.android.gms.tasks;

import androidx.annotation.o0;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes2.dex */
final class zzt implements Executor {
    zzt() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@o0 Runnable runnable) {
        runnable.run();
    }
}
