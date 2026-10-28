package com.google.common.util.concurrent;

import com.google.common.util.concurrent.c;

/* compiled from: SettableFuture.java */
@b0
@d9.b
/* loaded from: classes6.dex */
public final class s1<V> extends c.j<V> {
    private s1() {
    }

    public static <V> s1<V> F() {
        return new s1<>();
    }

    @Override // com.google.common.util.concurrent.c
    @f9.a
    public boolean B(@j1 V v4) {
        return super.B(v4);
    }

    @Override // com.google.common.util.concurrent.c
    @f9.a
    public boolean C(Throwable th) {
        return super.C(th);
    }

    @Override // com.google.common.util.concurrent.c
    @f9.a
    public boolean D(ListenableFuture<? extends V> listenableFuture) {
        return super.D(listenableFuture);
    }
}
