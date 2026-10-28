package androidx.concurrent.futures;

import androidx.annotation.c1;
import androidx.annotation.q0;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: ResolvableFuture.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class f<V> extends b<V> {
    private f() {
    }

    public static <V> f<V> u() {
        return new f<>();
    }

    @Override // androidx.concurrent.futures.b
    public boolean p(@q0 V v4) {
        return super.p(v4);
    }

    @Override // androidx.concurrent.futures.b
    public boolean q(Throwable th) {
        return super.q(th);
    }

    @Override // androidx.concurrent.futures.b
    public boolean r(ListenableFuture<? extends V> listenableFuture) {
        return super.r(listenableFuture);
    }
}
