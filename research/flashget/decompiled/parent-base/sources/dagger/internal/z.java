package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: SetFactory.java */
/* loaded from: classes7.dex */
public final class z<T> implements h<Set<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final h<Set<Object>> f73697c = l.a(Collections.emptySet());

    /* renamed from: a, reason: collision with root package name */
    private final List<t<T>> f73698a;

    /* renamed from: b, reason: collision with root package name */
    private final List<t<Collection<T>>> f73699b;

    /* compiled from: SetFactory.java */
    public static final class b<T> {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f73700c = false;

        /* renamed from: a, reason: collision with root package name */
        private final List<t<T>> f73701a;

        /* renamed from: b, reason: collision with root package name */
        private final List<t<Collection<T>>> f73702b;

        @Deprecated
        public b<T> a(cd.c<? extends Collection<? extends T>> cVar) {
            this.f73702b.add(v.a(cVar));
            return this;
        }

        public b<T> b(t<? extends Collection<? extends T>> tVar) {
            this.f73702b.add(tVar);
            return this;
        }

        @Deprecated
        public b<T> c(cd.c<? extends T> cVar) {
            this.f73701a.add(v.a(cVar));
            return this;
        }

        public b<T> d(t<? extends T> tVar) {
            this.f73701a.add(tVar);
            return this;
        }

        public z<T> e() {
            return new z<>(this.f73701a, this.f73702b);
        }

        private b(int i4, int i5) {
            this.f73701a = d.e(i4);
            this.f73702b = d.e(i5);
        }
    }

    public static <T> b<T> a(int i4, int i5) {
        return new b<>(i4, i5);
    }

    public static <T> h<Set<T>> b() {
        return (h<Set<T>>) f73697c;
    }

    @Override // cd.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        int size = this.f73698a.size();
        ArrayList arrayList = new ArrayList(this.f73699b.size());
        int size2 = this.f73699b.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Collection<T> collection = this.f73699b.get(i4).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet c5 = d.c(size);
        int size3 = this.f73698a.size();
        for (int i5 = 0; i5 < size3; i5++) {
            T t4 = this.f73698a.get(i5).get();
            t4.getClass();
            c5.add(t4);
        }
        int size4 = arrayList.size();
        for (int i6 = 0; i6 < size4; i6++) {
            for (Object obj : (Collection) arrayList.get(i6)) {
                obj.getClass();
                c5.add(obj);
            }
        }
        return Collections.unmodifiableSet(c5);
    }

    private z(List<t<T>> list, List<t<Collection<T>>> list2) {
        this.f73698a = list;
        this.f73699b = list2;
    }
}
