package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.e5;
import java.io.Serializable;
import java.util.List;

/* compiled from: ExplicitOrdering.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class e1<T> extends e5<T> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f55676e = 0;

    /* renamed from: d, reason: collision with root package name */
    final h3<T, Integer> f55677d;

    e1(List<T> list) {
        this(p4.Q(list));
    }

    private int y0(T t4) {
        Integer num = this.f55677d.get(t4);
        if (num != null) {
            return num.intValue();
        }
        throw new e5.c(t4);
    }

    @Override // com.google.common.collect.e5, java.util.Comparator
    public int compare(T t4, T t5) {
        return y0(t4) - y0(t5);
    }

    @Override // java.util.Comparator
    public boolean equals(@zc.a Object obj) {
        if (obj instanceof e1) {
            return this.f55677d.equals(((e1) obj).f55677d);
        }
        return false;
    }

    public int hashCode() {
        return this.f55677d.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f55677d.keySet());
        return com.google.common.base.h.a(valueOf.length() + 19, ProtectedSandApp.s("\uf4ae"), valueOf, ProtectedSandApp.s("\uf4af"));
    }

    e1(h3<T, Integer> h3Var) {
        this.f55677d = h3Var;
    }
}
