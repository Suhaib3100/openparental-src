package org.apache.commons.text.lookup;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;

/* compiled from: BiFunctionStringLookup.java */
/* loaded from: classes3.dex */
final class c<P, R> implements d<P> {

    /* renamed from: a, reason: collision with root package name */
    private final BiFunction<String, P, R> f86511a;

    private c(BiFunction<String, P, R> biFunction) {
        this.f86511a = biFunction;
    }

    static <U, T> c<U, T> d(final Map<String, T> map) {
        return new c<>(new BiFunction() { // from class: org.apache.commons.text.lookup.b
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return map.get((String) obj);
            }
        });
    }

    static <U, T> c<U, T> e(BiFunction<String, U, T> biFunction) {
        return new c<>(biFunction);
    }

    @Override // org.apache.commons.text.lookup.d
    public String a(String str, P p4) {
        BiFunction<String, P, R> biFunction = this.f86511a;
        if (biFunction == null) {
            return null;
        }
        try {
            return Objects.toString(biFunction.apply(str, p4), null);
        } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
            return null;
        }
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        return a(str, null);
    }

    public String toString() {
        return super.toString() + " [function=" + this.f86511a + "]";
    }
}
