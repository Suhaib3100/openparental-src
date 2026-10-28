package w1;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture.java */
/* loaded from: classes2.dex */
public interface a<V> extends Future<V> {
    void g(Runnable runnable, Executor executor);
}
