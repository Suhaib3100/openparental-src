package org.apache.commons.lang3.concurrent;

import java.util.Objects;

/* compiled from: ConstantInitializer.java */
/* loaded from: classes6.dex */
public class k<T> implements i<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f85898b = "ConstantInitializer@%d [ object = %s ]";

    /* renamed from: a, reason: collision with root package name */
    private final T f85899a;

    public k(T t4) {
        this.f85899a = t4;
    }

    public final T a() {
        return this.f85899a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return Objects.equals(this.f85899a, ((k) obj).f85899a);
        }
        return false;
    }

    @Override // org.apache.commons.lang3.concurrent.i
    public T get() throws ConcurrentException {
        return this.f85899a;
    }

    public int hashCode() {
        T t4 = this.f85899a;
        if (t4 != null) {
            return t4.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.format("ConstantInitializer@%d [ object = %s ]", Integer.valueOf(System.identityHashCode(this)), String.valueOf(this.f85899a));
    }
}
