package org.apache.commons.text.similarity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: IntersectionSimilarity.java */
/* loaded from: classes3.dex */
public class i<T> implements t<h> {

    /* renamed from: a, reason: collision with root package name */
    private final Function<CharSequence, Collection<T>> f86652a;

    /* compiled from: IntersectionSimilarity.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        int f86653a;

        private b() {
            this.f86653a = 1;
        }
    }

    /* compiled from: IntersectionSimilarity.java */
    private class c {

        /* renamed from: a, reason: collision with root package name */
        private final Map<T, b> f86654a;

        c(int i4) {
            this.f86654a = new HashMap(i4);
        }

        void a(T t4) {
            b bVar = this.f86654a.get(t4);
            if (bVar == null) {
                this.f86654a.put(t4, new b());
            } else {
                bVar.f86653a++;
            }
        }

        Set<Map.Entry<T, b>> b() {
            return this.f86654a.entrySet();
        }

        int c(Object obj) {
            b bVar = this.f86654a.get(obj);
            if (bVar != null) {
                return bVar.f86653a;
            }
            return 0;
        }

        int d() {
            return this.f86654a.size();
        }
    }

    public i(Function<CharSequence, Collection<T>> function) {
        if (function == null) {
            throw new IllegalArgumentException("Converter must not be null");
        }
        this.f86652a = function;
    }

    private static <T> int c(Set<T> set, Set<T> set2) {
        Iterator<T> it = set.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (set2.contains(it.next())) {
                i4++;
            }
        }
        return i4;
    }

    private int d(i<T>.c cVar, i<T>.c cVar2) {
        int i4 = 0;
        for (Map.Entry<T, b> entry : cVar.b()) {
            i4 += Math.min(entry.getValue().f86653a, cVar2.c(entry.getKey()));
        }
        return i4;
    }

    private i<T>.c e(Collection<T> collection) {
        i<T>.c cVar = new c(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            cVar.a(it.next());
        }
        return cVar;
    }

    @Override // org.apache.commons.text.similarity.t
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h a(CharSequence charSequence, CharSequence charSequence2) {
        int d5;
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        Collection<T> apply = this.f86652a.apply(charSequence);
        Collection<T> apply2 = this.f86652a.apply(charSequence2);
        int size = apply.size();
        int size2 = apply2.size();
        if (Math.min(size, size2) == 0) {
            return new h(size, size2, 0);
        }
        if ((apply instanceof Set) && (apply2 instanceof Set)) {
            d5 = size < size2 ? c((Set) apply, (Set) apply2) : c((Set) apply2, (Set) apply);
        } else {
            i<T>.c e4 = e(apply);
            i<T>.c e5 = e(apply2);
            d5 = e4.d() < e5.d() ? d(e4, e5) : d(e5, e4);
        }
        return new h(size, size2, d5);
    }
}
