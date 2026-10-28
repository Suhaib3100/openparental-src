package org.apache.commons.lang3.concurrent;

/* compiled from: LazyInitializer.java */
/* loaded from: classes6.dex */
public abstract class m<T> implements i<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f85916b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile T f85917a = (T) f85916b;

    protected abstract T a() throws ConcurrentException;

    @Override // org.apache.commons.lang3.concurrent.i
    public T get() throws ConcurrentException {
        T t4 = this.f85917a;
        Object obj = f85916b;
        if (t4 == obj) {
            synchronized (this) {
                try {
                    t4 = this.f85917a;
                    if (t4 == obj) {
                        t4 = a();
                        this.f85917a = t4;
                    }
                } finally {
                }
            }
        }
        return t4;
    }
}
