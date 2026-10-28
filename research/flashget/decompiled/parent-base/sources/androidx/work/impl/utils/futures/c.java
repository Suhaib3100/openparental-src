package androidx.work.impl.utils.futures;

import androidx.annotation.c1;
import androidx.annotation.q0;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: SettableFuture.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class c<V> extends a<V> {
    private c() {
    }

    public static <V> c<V> u() {
        return new c<>();
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean p(@q0 V value) {
        return super.p(value);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean q(Throwable throwable) {
        return super.q(throwable);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean r(ListenableFuture<? extends V> future) {
        return super.r(future);
    }
}
