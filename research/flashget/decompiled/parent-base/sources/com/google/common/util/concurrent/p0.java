package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: ForwardingListeningExecutorService.java */
@b0
@d9.c
@f9.a
/* loaded from: classes6.dex */
public abstract class p0 extends l0 implements d1 {
    protected p0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.l0
    /* renamed from: A3, reason: merged with bridge method [inline-methods] */
    public abstract d1 u3();

    @Override // com.google.common.util.concurrent.l0, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, @j1 Object obj) {
        return submit(runnable, (Runnable) obj);
    }

    @Override // com.google.common.util.concurrent.l0, java.util.concurrent.ExecutorService
    public <T> ListenableFuture<T> submit(Callable<T> callable) {
        return u3().submit((Callable) callable);
    }

    @Override // com.google.common.util.concurrent.l0, java.util.concurrent.ExecutorService
    public ListenableFuture<?> submit(Runnable runnable) {
        return u3().submit(runnable);
    }

    @Override // com.google.common.util.concurrent.l0, java.util.concurrent.ExecutorService
    public <T> ListenableFuture<T> submit(Runnable runnable, @j1 T t4) {
        return u3().submit(runnable, (Runnable) t4);
    }
}
