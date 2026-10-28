package org.apache.commons.lang3.tuple;

import java.util.Map;

/* compiled from: ImmutablePair.java */
/* loaded from: classes6.dex */
public final class a<L, R> extends e<L, R> {

    /* renamed from: f, reason: collision with root package name */
    public static final a<?, ?>[] f86379f = new a[0];

    /* renamed from: g, reason: collision with root package name */
    private static final a f86380g = new a(null, null);

    /* renamed from: h, reason: collision with root package name */
    private static final long f86381h = 4954918890077093841L;

    /* renamed from: d, reason: collision with root package name */
    public final L f86382d;

    /* renamed from: e, reason: collision with root package name */
    public final R f86383e;

    public a(L l4, R r4) {
        this.f86382d = l4;
        this.f86383e = r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, R> a<L, R>[] h() {
        return (a<L, R>[]) f86379f;
    }

    public static <L, R> e<L, R> i(L l4) {
        return new a(l4, null);
    }

    public static <L, R> a<L, R> j() {
        return f86380g;
    }

    public static <L, R> a<L, R> k(L l4, R r4) {
        return new a<>(l4, r4);
    }

    public static <L, R> a<L, R> l(Map.Entry<L, R> entry) {
        L l4;
        R r4;
        if (entry != null) {
            l4 = entry.getKey();
            r4 = entry.getValue();
        } else {
            l4 = null;
            r4 = null;
        }
        return new a<>(l4, r4);
    }

    public static <L, R> e<L, R> m(R r4) {
        return new a(null, r4);
    }

    @Override // org.apache.commons.lang3.tuple.e
    public L c() {
        return this.f86382d;
    }

    @Override // org.apache.commons.lang3.tuple.e
    public R d() {
        return this.f86383e;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r4) {
        throw new UnsupportedOperationException();
    }
}
