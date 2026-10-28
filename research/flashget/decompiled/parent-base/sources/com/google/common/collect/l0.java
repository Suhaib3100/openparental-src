package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: CompoundOrdering.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class l0<T> extends e5<T> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f55890e = 0;

    /* renamed from: d, reason: collision with root package name */
    final Comparator<? super T>[] f55891d;

    l0(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.f55891d = new Comparator[]{comparator, comparator2};
    }

    @Override // com.google.common.collect.e5, java.util.Comparator
    public int compare(@f5 T t4, @f5 T t5) {
        int i4 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f55891d;
            if (i4 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i4].compare(t4, t5);
            if (compare != 0) {
                return compare;
            }
            i4++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            return Arrays.equals(this.f55891d, ((l0) obj).f55891d);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f55891d);
    }

    public String toString() {
        String arrays = Arrays.toString(this.f55891d);
        return com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(arrays, 19), ProtectedSandApp.s("\uf4e8"), arrays, ProtectedSandApp.s("\uf4e9"));
    }

    l0(Iterable<? extends Comparator<? super T>> iterable) {
        this.f55891d = (Comparator[]) c4.R(iterable, new Comparator[0]);
    }
}
