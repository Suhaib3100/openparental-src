package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.c1;
import androidx.work.impl.utils.n;
import java.util.concurrent.Executor;

/* compiled from: TaskExecutor.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface a {
    Executor a();

    void b(Runnable runnable);

    void c(Runnable runnable);

    n d();
}
