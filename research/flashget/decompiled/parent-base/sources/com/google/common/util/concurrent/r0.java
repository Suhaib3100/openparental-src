package com.google.common.util.concurrent;

/* compiled from: FutureCallback.java */
@b0
@d9.b
/* loaded from: classes6.dex */
public interface r0<V> {
    void onFailure(Throwable th);

    void onSuccess(@j1 V v4);
}
