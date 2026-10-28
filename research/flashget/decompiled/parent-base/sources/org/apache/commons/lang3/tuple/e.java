package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* compiled from: Pair.java */
/* loaded from: classes6.dex */
public abstract class e<L, R> implements Map.Entry<L, R>, Comparable<e<L, R>>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final long f86399b = 4954918890077093841L;

    /* renamed from: c, reason: collision with root package name */
    public static final e<?, ?>[] f86400c = new a[0];

    /* compiled from: Pair.java */
    private static final class a<L, R> extends e<L, R> {

        /* renamed from: d, reason: collision with root package name */
        private static final long f86401d = 1;

        private a() {
        }

        @Override // org.apache.commons.lang3.tuple.e
        public L c() {
            return null;
        }

        @Override // org.apache.commons.lang3.tuple.e, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((e) obj);
        }

        @Override // org.apache.commons.lang3.tuple.e
        public R d() {
            return null;
        }

        @Override // java.util.Map.Entry
        public R setValue(R r4) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, R> e<L, R>[] b() {
        return (e<L, R>[]) f86400c;
    }

    public static <L, R> e<L, R> e(L l4, R r4) {
        return org.apache.commons.lang3.tuple.a.k(l4, r4);
    }

    public static <L, R> e<L, R> f(Map.Entry<L, R> entry) {
        return org.apache.commons.lang3.tuple.a.l(entry);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e<L, R> eVar) {
        return new org.apache.commons.lang3.builder.b().i(c(), eVar.c(), null).h(d(), eVar.d()).E();
    }

    public abstract L c();

    public abstract R d();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Objects.equals(c(), entry.getKey()) && Objects.equals(getValue(), entry.getValue());
    }

    public String g(String str) {
        return String.format(str, c(), d());
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return c();
    }

    @Override // java.util.Map.Entry
    public R getValue() {
        return d();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return Objects.hashCode(c()) ^ Objects.hashCode(getValue());
    }

    public String toString() {
        return "(" + c() + ',' + d() + ')';
    }
}
