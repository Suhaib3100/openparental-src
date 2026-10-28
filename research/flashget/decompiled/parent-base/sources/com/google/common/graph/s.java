package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.d0;
import com.google.common.collect.e5;
import com.google.common.collect.p4;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: ElementOrder.java */
@f9.j
@d9.a
@t
/* loaded from: classes6.dex */
public final class s<T> {

    /* renamed from: a, reason: collision with root package name */
    private final b f56875a;

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    private final Comparator<T> f56876b;

    /* compiled from: ElementOrder.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56877a;

        static {
            int[] iArr = new int[b.values().length];
            f56877a = iArr;
            try {
                iArr[b.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56877a[b.INSERTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56877a[b.STABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56877a[b.SORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: ElementOrder.java */
    public enum b {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    private s(b bVar, @zc.a Comparator<T> comparator) {
        bVar.getClass();
        this.f56875a = bVar;
        this.f56876b = comparator;
        com.google.common.base.l0.g0((bVar == b.SORTED) == (comparator != null));
    }

    public static <S> s<S> d() {
        return new s<>(b.INSERTION, null);
    }

    public static <S extends Comparable<? super S>> s<S> e() {
        return new s<>(b.SORTED, e5.c0());
    }

    public static <S> s<S> f(Comparator<S> comparator) {
        b bVar = b.SORTED;
        comparator.getClass();
        return new s<>(bVar, comparator);
    }

    public static <S> s<S> g() {
        return new s<>(b.STABLE, null);
    }

    public static <S> s<S> i() {
        return new s<>(b.UNORDERED, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T1 extends T> s<T1> a() {
        return this;
    }

    public Comparator<T> b() {
        Comparator<T> comparator = this.f56876b;
        if (comparator != null) {
            return comparator;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("\uf5d3"));
    }

    <K extends T, V> Map<K, V> c(int i4) {
        int i5 = a.f56877a[this.f56875a.ordinal()];
        if (i5 == 1) {
            return p4.a0(i4);
        }
        if (i5 == 2 || i5 == 3) {
            return p4.e0(i4);
        }
        if (i5 == 4) {
            return new TreeMap(b());
        }
        throw new AssertionError();
    }

    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f56875a == sVar.f56875a && com.google.common.base.f0.a(this.f56876b, sVar.f56876b);
    }

    public b h() {
        return this.f56875a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56875a, this.f56876b});
    }

    public String toString() {
        d0.b f4 = com.google.common.base.d0.c(this).f(ProtectedSandApp.s("\uf5d4"), this.f56875a);
        Comparator<T> comparator = this.f56876b;
        if (comparator != null) {
            f4.f(ProtectedSandApp.s("\uf5d5"), comparator);
        }
        return f4.toString();
    }
}
