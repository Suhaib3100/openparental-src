package org.apache.commons.lang3.tuple;

/* compiled from: ImmutableTriple.java */
/* loaded from: classes6.dex */
public final class b<L, M, R> extends f<L, M, R> {

    /* renamed from: g, reason: collision with root package name */
    public static final b<?, ?, ?>[] f86384g = new b[0];

    /* renamed from: h, reason: collision with root package name */
    private static final b f86385h = new b(null, null, null);

    /* renamed from: i, reason: collision with root package name */
    private static final long f86386i = 1;

    /* renamed from: d, reason: collision with root package name */
    public final L f86387d;

    /* renamed from: e, reason: collision with root package name */
    public final M f86388e;

    /* renamed from: f, reason: collision with root package name */
    public final R f86389f;

    public b(L l4, M m4, R r4) {
        this.f86387d = l4;
        this.f86388e = m4;
        this.f86389f = r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, M, R> b<L, M, R>[] h() {
        return (b<L, M, R>[]) f86384g;
    }

    public static <L, M, R> b<L, M, R> i() {
        return f86385h;
    }

    public static <L, M, R> b<L, M, R> j(L l4, M m4, R r4) {
        return new b<>(l4, m4, r4);
    }

    @Override // org.apache.commons.lang3.tuple.f
    public L c() {
        return this.f86387d;
    }

    @Override // org.apache.commons.lang3.tuple.f
    public M d() {
        return this.f86388e;
    }

    @Override // org.apache.commons.lang3.tuple.f
    public R e() {
        return this.f86389f;
    }
}
