package androidx.work.impl.utils.futures;

import androidx.annotation.c1;
import java.util.concurrent.Executor;

/* compiled from: DirectExecutor.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
enum b implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
