package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: SetFactory.java */
/* loaded from: classes6.dex */
public final class z<T> implements h<Set<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final h<Set<Object>> f22383c = l.a(Collections.emptySet());

    /* renamed from: a, reason: collision with root package name */
    private final List<t<T>> f22384a;

    /* renamed from: b, reason: collision with root package name */
    private final List<t<Collection<T>>> f22385b;

    /* compiled from: SetFactory.java */
    /* loaded from: classes5.dex */
    public static final class b<T> {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f22386c = false;

        /* renamed from: a, reason: collision with root package name */
        private final List<t<T>> f22387a;

        /* renamed from: b, reason: collision with root package name */
        private final List<t<Collection<T>>> f22388b;

        public b<T> a(t<? extends Collection<? extends T>> tVar) {
            this.f22388b.add(tVar);
            return this;
        }

        @Deprecated
        public b<T> b(h3.c<? extends Collection<? extends T>> cVar) {
            this.f22388b.add(v.a(cVar));
            return this;
        }

        public b<T> c(t<? extends T> tVar) {
            this.f22387a.add(tVar);
            return this;
        }

        @Deprecated
        public b<T> d(h3.c<? extends T> cVar) {
            this.f22387a.add(v.a(cVar));
            return this;
        }

        public z<T> e() {
            return new z<>(this.f22387a, this.f22388b);
        }

        private b(int i5, int i6) {
            this.f22387a = d.e(i5);
            this.f22388b = d.e(i6);
        }
    }

    public static <T> b<T> a(int i5, int i6) {
        return new b<>(i5, i6);
    }

    public static <T> h<Set<T>> b() {
        return (h<Set<T>>) f22383c;
    }

    @Override // h3.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        int size = this.f22384a.size();
        ArrayList arrayList = new ArrayList(this.f22385b.size());
        int size2 = this.f22385b.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Collection<T> collection = this.f22385b.get(i5).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet c6 = d.c(size);
        int size3 = this.f22384a.size();
        for (int i6 = 0; i6 < size3; i6++) {
            T t5 = this.f22384a.get(i6).get();
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

    private z(List<t<T>> list, List<t<Collection<T>>> list2) {
        this.f22384a = list;
        this.f22385b = list2;
    }
}
