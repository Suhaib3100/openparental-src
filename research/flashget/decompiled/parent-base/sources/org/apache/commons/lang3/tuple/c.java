package org.apache.commons.lang3.tuple;

import java.util.Map;

/* compiled from: MutablePair.java */
/* loaded from: classes6.dex */
public class c<L, R> extends e<L, R> {

    /* renamed from: f, reason: collision with root package name */
    public static final c<?, ?>[] f86390f = new c[0];

    /* renamed from: g, reason: collision with root package name */
    private static final long f86391g = 4954918890077093841L;

    /* renamed from: d, reason: collision with root package name */
    public L f86392d;

    /* renamed from: e, reason: collision with root package name */
    public R f86393e;

    public c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, R> c<L, R>[] h() {
        return (c<L, R>[]) f86390f;
    }

    public static <L, R> c<L, R> i(L l4, R r4) {
        return new c<>(l4, r4);
    }

    public static <L, R> c<L, R> j(Map.Entry<L, R> entry) {
        L l4;
        R r4;
        if (entry != null) {
            l4 = entry.getKey();
            r4 = entry.getValue();
        } else {
            l4 = null;
            r4 = null;
        }
        return new c<>(l4, r4);
    }

    @Override // org.apache.commons.lang3.tuple.e
    public L c() {
        return this.f86392d;
    }

    @Override // org.apache.commons.lang3.tuple.e
    public R d() {
        return this.f86393e;
    }

    public void k(L l4) {
        this.f86392d = l4;
    }

    public void l(R r4) {
        this.f86393e = r4;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r4) {
        R d5 = d();
        l(r4);
        return d5;
    }

    public c(L l4, R r4) {
        this.f86392d = l4;
        this.f86393e = r4;
    }
}
