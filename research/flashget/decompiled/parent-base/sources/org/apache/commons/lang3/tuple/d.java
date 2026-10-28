package org.apache.commons.lang3.tuple;

/* compiled from: MutableTriple.java */
/* loaded from: classes6.dex */
public class d<L, M, R> extends f<L, M, R> {

    /* renamed from: g, reason: collision with root package name */
    public static final d<?, ?, ?>[] f86394g = new d[0];

    /* renamed from: h, reason: collision with root package name */
    private static final long f86395h = 1;

    /* renamed from: d, reason: collision with root package name */
    public L f86396d;

    /* renamed from: e, reason: collision with root package name */
    public M f86397e;

    /* renamed from: f, reason: collision with root package name */
    public R f86398f;

    public d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, M, R> d<L, M, R>[] h() {
        return (d<L, M, R>[]) f86394g;
    }

    public static <L, M, R> d<L, M, R> i(L l4, M m4, R r4) {
        return new d<>(l4, m4, r4);
    }

    @Override // org.apache.commons.lang3.tuple.f
    public L c() {
        return this.f86396d;
    }

    @Override // org.apache.commons.lang3.tuple.f
    public M d() {
        return this.f86397e;
    }

    @Override // org.apache.commons.lang3.tuple.f
    public R e() {
        return this.f86398f;
    }

    public void j(L l4) {
        this.f86396d = l4;
    }

    public void k(M m4) {
        this.f86397e = m4;
    }

    public void l(R r4) {
        this.f86398f = r4;
    }

    public d(L l4, M m4, R r4) {
        this.f86396d = l4;
        this.f86397e = m4;
        this.f86398f = r4;
    }
}
