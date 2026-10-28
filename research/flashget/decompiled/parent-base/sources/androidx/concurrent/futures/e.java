package androidx.concurrent.futures;

import androidx.annotation.c1;
import java.util.concurrent.Executor;

/* compiled from: DirectExecutor.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public enum e implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
