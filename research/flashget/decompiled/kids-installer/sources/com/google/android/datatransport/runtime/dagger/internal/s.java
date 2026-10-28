package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: SetFactory.java */
/* loaded from: classes3.dex */
public final class s<T> implements g<Set<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final g<Set<Object>> f12484c = j.a(Collections.emptySet());

    /* renamed from: a, reason: collision with root package name */
    private final List<h3.c<T>> f12485a;

    /* renamed from: b, reason: collision with root package name */
    private final List<h3.c<Collection<T>>> f12486b;

    /* compiled from: SetFactory.java */
    /* loaded from: classes2.dex */
    public static final class b<T> {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f12487c = false;

        /* renamed from: a, reason: collision with root package name */
        private final List<h3.c<T>> f12488a;

        /* renamed from: b, reason: collision with root package name */
        private final List<h3.c<Collection<T>>> f12489b;

        public b<T> a(h3.c<? extends Collection<? extends T>> cVar) {
            this.f12489b.add(cVar);
            return this;
        }

        public b<T> b(h3.c<? extends T> cVar) {
            this.f12488a.add(cVar);
            return this;
        }

        public s<T> c() {
            return new s<>(this.f12488a, this.f12489b);
        }

        private b(int i5, int i6) {
            this.f12488a = d.e(i5);
            this.f12489b = d.e(i6);
        }
    }

    public static <T> b<T> a(int i5, int i6) {
        return new b<>(i5, i6);
    }

    public static <T> g<Set<T>> b() {
        return (g<Set<T>>) f12484c;
    }

    @Override // h3.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        int size = this.f12485a.size();
        ArrayList arrayList = new ArrayList(this.f12486b.size());
        int size2 = this.f12486b.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Collection<T> collection = this.f12486b.get(i5).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet c6 = d.c(size);
        int size3 = this.f12485a.size();
        for (int i6 = 0; i6 < size3; i6++) {
            T t5 = this.f12485a.get(i6).get();
            t5.getClass();
            c6.add(t5);
        }
        int size4 = arrayList.size();
        for (int i7 = 0; i7 < size4; i7++) {
            for (Object obj : (Collection) arrayList.get(i7)) {
                obj.getClass();
                c6.add(obj);
            }
        }
        return Collections.unmodifiableSet(c6);
    }

    private s(List<h3.c<T>> list, List<h3.c<Collection<T>>> list2) {
        this.f12485a = list;
        this.f12486b = list2;
    }
}
