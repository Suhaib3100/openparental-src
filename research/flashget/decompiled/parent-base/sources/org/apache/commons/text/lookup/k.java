package org.apache.commons.text.lookup;

import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/* compiled from: FunctionStringLookup.java */
/* loaded from: classes3.dex */
final class k<V> extends a {

    /* renamed from: c, reason: collision with root package name */
    private final Function<String, V> f86523c;

    private k(Function<String, V> function) {
        this.f86523c = function;
    }

    static <V> k<V> g(final Map<String, V> map) {
        map.getClass();
        return new k<>(new Function() { // from class: org.apache.commons.text.lookup.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return map.get((String) obj);
            }
        });
    }

    static <R> k<R> h(Function<String, R> function) {
        return new k<>(function);
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        Function<String, V> function = this.f86523c;
        if (function == null) {
            return null;
        }
        try {
            return Objects.toString(function.apply(str), null);
        } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public String toString() {
        return super.toString() + " [function=" + this.f86523c + "]";
    }
}
