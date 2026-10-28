package androidx.concurrent.futures;

import androidx.annotation.c1;
import androidx.annotation.q0;

/* compiled from: ResolvableFuture.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class g<V> extends c<V> {
    private g() {
    }

    public static <V> g<V> F() {
        return new g<>();
    }

    @Override // androidx.concurrent.futures.c
    public boolean A(@q0 V v5) {
        return super.A(v5);
    }

    @Override // androidx.concurrent.futures.c
    public boolean B(Throwable th) {
        return super.B(th);
    }

    @Override // androidx.concurrent.futures.c
    public boolean C(w1.a<? extends V> aVar) {
        return super.C(aVar);
    }
}
