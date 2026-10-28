package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: Triple.java */
/* loaded from: classes6.dex */
public abstract class f<L, M, R> implements Comparable<f<L, M, R>>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final long f86402b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final f<?, ?, ?>[] f86403c = new a[0];

    /* compiled from: Triple.java */
    private static final class a<L, M, R> extends f<L, M, R> {

        /* renamed from: d, reason: collision with root package name */
        private static final long f86404d = 1;

        private a() {
        }

        @Override // org.apache.commons.lang3.tuple.f
        public L c() {
            return null;
        }

        @Override // org.apache.commons.lang3.tuple.f, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((f) obj);
        }

        @Override // org.apache.commons.lang3.tuple.f
        public M d() {
            return null;
        }

        @Override // org.apache.commons.lang3.tuple.f
        public R e() {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, M, R> f<L, M, R>[] b() {
        return (f<L, M, R>[]) f86403c;
    }

    public static <L, M, R> f<L, M, R> f(L l4, M m4, R r4) {
        return new b(l4, m4, r4);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f<L, M, R> fVar) {
        return new org.apache.commons.lang3.builder.b().i(c(), fVar.c(), null).h(d(), fVar.d()).h(e(), fVar.e()).E();
    }

    public abstract L c();

    public abstract M d();

    public abstract R e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(c(), fVar.c()) && Objects.equals(d(), fVar.d()) && Objects.equals(e(), fVar.e());
    }

    public String g(String str) {
        return String.format(str, c(), d(), e());
    }

    public int hashCode() {
        return (Objects.hashCode(c()) ^ Objects.hashCode(d())) ^ Objects.hashCode(e());
    }

    public String toString() {
        return "(" + c() + "," + d() + "," + e() + ")";
    }
}
