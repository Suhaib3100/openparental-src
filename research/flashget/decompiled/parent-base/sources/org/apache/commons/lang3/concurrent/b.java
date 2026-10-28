package org.apache.commons.lang3.concurrent;

import androidx.compose.animation.core.k1;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AtomicInitializer.java */
/* loaded from: classes6.dex */
public abstract class b<T> implements i<T> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<T> f85877a = new AtomicReference<>();

    protected abstract T a() throws ConcurrentException;

    @Override // org.apache.commons.lang3.concurrent.i
    public T get() throws ConcurrentException {
        T t4 = this.f85877a.get();
        if (t4 != null) {
            return t4;
        }
        T a5 = a();
        return !k1.a(this.f85877a, null, a5) ? this.f85877a.get() : a5;
    }
}
