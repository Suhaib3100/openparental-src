package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

@b0
@f9.f("Use the methods in Futures (like immediateFuture) or SettableFuture")
/* loaded from: classes6.dex */
public interface ListenableFuture<V> extends Future<V> {
    void n2(Runnable runnable, Executor executor);
}
