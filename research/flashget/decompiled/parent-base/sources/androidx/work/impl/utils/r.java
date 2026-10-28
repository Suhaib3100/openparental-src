package androidx.work.impl.utils;

import androidx.annotation.c1;
import androidx.annotation.o0;
import java.util.concurrent.Executor;

/* compiled from: SynchronousExecutor.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class r implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(@o0 Runnable command) {
        command.run();
    }
}
