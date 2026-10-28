package org.apache.commons.lang3.concurrent;

import androidx.compose.animation.core.k1;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AtomicSafeInitializer.java */
/* loaded from: classes6.dex */
public abstract class c<T> implements i<T> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<c<T>> f85878a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<T> f85879b = new AtomicReference<>();

    protected abstract T a() throws ConcurrentException;

    @Override // org.apache.commons.lang3.concurrent.i
    public final T get() throws ConcurrentException {
        while (true) {
            T t4 = this.f85879b.get();
            if (t4 != null) {
                return t4;
            }
            if (k1.a(this.f85878a, null, this)) {
                this.f85879b.set(a());
            }
        }
    }
}
