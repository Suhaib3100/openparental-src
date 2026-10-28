package androidx.arch.core.executor;

import androidx.annotation.c1;
import androidx.annotation.o0;

/* compiled from: TaskExecutor.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class d {
    public abstract void a(@o0 Runnable runnable);

    public void b(@o0 Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public abstract boolean c();

    public abstract void d(@o0 Runnable runnable);
}
