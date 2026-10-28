package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.apache.commons.lang3.k1;

/* compiled from: CallableBackgroundInitializer.java */
/* loaded from: classes6.dex */
public class f<T> extends d<T> {

    /* renamed from: d, reason: collision with root package name */
    private final Callable<T> f85896d;

    public f(Callable<T> callable) {
        k(callable);
        this.f85896d = callable;
    }

    private void k(Callable<T> callable) {
        k1.b0(callable, "Callable must not be null!", new Object[0]);
    }

    @Override // org.apache.commons.lang3.concurrent.d
    protected T g() throws Exception {
        return this.f85896d.call();
    }

    public f(Callable<T> callable, ExecutorService executorService) {
        super(executorService);
        k(callable);
        this.f85896d = callable;
    }
}
