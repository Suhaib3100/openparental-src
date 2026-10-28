package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: ComparatorOrdering.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class i0<T> extends e5<T> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f55817e = 0;

    /* renamed from: d, reason: collision with root package name */
    final Comparator<T> f55818d;

    i0(Comparator<T> comparator) {
        comparator.getClass();
        this.f55818d = comparator;
    }

    @Override // com.google.common.collect.e5, java.util.Comparator
    public int compare(@f5 T t4, @f5 T t5) {
        return this.f55818d.compare(t4, t5);
    }

    @Override // java.util.Comparator
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            return this.f55818d.equals(((i0) obj).f55818d);
        }
        return false;
    }

    public int hashCode() {
        return this.f55818d.hashCode();
    }

    public String toString() {
        return this.f55818d.toString();
    }
}
