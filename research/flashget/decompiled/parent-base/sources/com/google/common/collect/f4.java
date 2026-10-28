package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: LexicographicalOrdering.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class f4<T> extends e5<Iterable<T>> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f55736e = 0;

    /* renamed from: d, reason: collision with root package name */
    final Comparator<? super T> f55737d;

    f4(Comparator<? super T> comparator) {
        this.f55737d = comparator;
    }

    @Override // java.util.Comparator
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f4) {
            return this.f55737d.equals(((f4) obj).f55737d);
        }
        return false;
    }

    public int hashCode() {
        return this.f55737d.hashCode() ^ 2075626741;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f55737d);
        return com.google.common.base.i.a(valueOf.length() + 18, valueOf, ProtectedSandApp.s("\uf4bc"));
    }

    @Override // com.google.common.collect.e5, java.util.Comparator
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int compare = this.f55737d.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }
}
