package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: Collections2.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public final class c0 {

    /* compiled from: Collections2.java */
    static class a<E> extends AbstractCollection<E> {

        /* renamed from: b, reason: collision with root package name */
        final Collection<E> f55407b;

        /* renamed from: c, reason: collision with root package name */
        final com.google.common.base.m0<? super E> f55408c;

        a(Collection<E> collection, com.google.common.base.m0<? super E> m0Var) {
            this.f55407b = collection;
            this.f55408c = m0Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@f5 E e4) {
            com.google.common.base.l0.d(this.f55408c.apply(e4));
            return this.f55407b.add(e4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                com.google.common.base.l0.d(this.f55408c.apply(it.next()));
            }
            return this.f55407b.addAll(collection);
        }

        a<E> b(com.google.common.base.m0<? super E> m0Var) {
            return new a<>(this.f55407b, com.google.common.base.n0.d(this.f55408c, m0Var));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c4.J(this.f55407b, this.f55408c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            if (c0.j(this.f55407b, obj)) {
                return this.f55408c.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return c0.b(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !c4.c(this.f55407b, this.f55408c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return d4.x(this.f55407b.iterator(), this.f55408c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@zc.a Object obj) {
            return contains(obj) && this.f55407b.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f55407b.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f55408c.apply(next) && collection.contains(next)) {
                    it.remove();
                    z4 = true;
                }
            }
            return z4;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f55407b.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f55408c.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z4 = true;
                }
            }
            return z4;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f55407b.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                if (this.f55408c.apply(it.next())) {
                    i4++;
                }
            }
            return i4;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return l4.s(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) l4.s(iterator()).toArray(tArr);
        }
    }

    /* compiled from: Collections2.java */
    private static final class b<E> extends AbstractCollection<List<E>> {

        /* renamed from: b, reason: collision with root package name */
        final f3<E> f55409b;

        /* renamed from: c, reason: collision with root package name */
        final Comparator<? super E> f55410c;

        /* renamed from: d, reason: collision with root package name */
        final int f55411d;

        b(Iterable<E> iterable, Comparator<? super E> comparator) {
            f3<E> b02 = f3.b0(comparator, iterable);
            this.f55409b = b02;
            this.f55410c = comparator;
            this.f55411d = b(b02, comparator);
        }

        private static <E> int b(List<E> list, Comparator<? super E> comparator) {
            int i4 = 1;
            int i5 = 1;
            int i6 = 1;
            while (i4 < list.size()) {
                if (comparator.compare(list.get(i4 - 1), list.get(i4)) < 0) {
                    i5 = com.google.common.math.f.u(i5, com.google.common.math.f.a(i4, i6));
                    if (i5 == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    i6 = 0;
                }
                i4++;
                i6++;
            }
            return com.google.common.math.f.u(i5, com.google.common.math.f.a(i4, i6));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return c0.e(this.f55409b, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new c(this.f55409b, this.f55410c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f55411d;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String valueOf = String.valueOf(this.f55409b);
            return com.google.common.base.h.a(valueOf.length() + 30, ProtectedSandApp.s("\uf467"), valueOf, ProtectedSandApp.s("\uf468"));
        }
    }

    /* compiled from: Collections2.java */
    private static final class c<E> extends com.google.common.collect.c<List<E>> {

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        List<E> f55412d;

        /* renamed from: e, reason: collision with root package name */
        final Comparator<? super E> f55413e;

        c(List<E> list, Comparator<? super E> comparator) {
            this.f55412d = l4.r(list);
            this.f55413e = comparator;
        }

        void d() {
            int f4 = f();
            if (f4 == -1) {
                this.f55412d = null;
                return;
            }
            Objects.requireNonNull(this.f55412d);
            Collections.swap(this.f55412d, f4, g(f4));
            Collections.reverse(this.f55412d.subList(f4 + 1, this.f55412d.size()));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c
        @zc.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<E> a() {
            List<E> list = this.f55412d;
            if (list == null) {
                return b();
            }
            f3 x4 = f3.x(list);
            d();
            return x4;
        }

        int f() {
            Objects.requireNonNull(this.f55412d);
            for (int size = this.f55412d.size() - 2; size >= 0; size--) {
                if (this.f55413e.compare(this.f55412d.get(size), this.f55412d.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        int g(int i4) {
            Objects.requireNonNull(this.f55412d);
            E e4 = this.f55412d.get(i4);
            for (int size = this.f55412d.size() - 1; size > i4; size--) {
                if (this.f55413e.compare(e4, this.f55412d.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError(ProtectedSandApp.s("\uf469"));
        }
    }

    /* compiled from: Collections2.java */
    private static final class d<E> extends AbstractCollection<List<E>> {

        /* renamed from: b, reason: collision with root package name */
        final f3<E> f55414b;

        d(f3<E> f3Var) {
            this.f55414b = f3Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return c0.e(this.f55414b, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new e(this.f55414b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return com.google.common.math.f.h(this.f55414b.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String valueOf = String.valueOf(this.f55414b);
            return com.google.common.base.h.a(valueOf.length() + 14, ProtectedSandApp.s("\uf46a"), valueOf, ProtectedSandApp.s("\uf46b"));
        }
    }

    /* compiled from: Collections2.java */
    private static class e<E> extends com.google.common.collect.c<List<E>> {

        /* renamed from: d, reason: collision with root package name */
        final List<E> f55415d;

        /* renamed from: e, reason: collision with root package name */
        final int[] f55416e;

        /* renamed from: f, reason: collision with root package name */
        final int[] f55417f;

        /* renamed from: g, reason: collision with root package name */
        int f55418g;

        e(List<E> list) {
            this.f55415d = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f55416e = iArr;
            int[] iArr2 = new int[size];
            this.f55417f = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f55418g = Integer.MAX_VALUE;
        }

        void d() {
            int size = this.f55415d.size() - 1;
            this.f55418g = size;
            if (size == -1) {
                return;
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.f55416e;
                int i5 = this.f55418g;
                int i6 = iArr[i5];
                int i7 = this.f55417f[i5] + i6;
                if (i7 < 0) {
                    f();
                } else if (i7 != i5 + 1) {
                    Collections.swap(this.f55415d, (i5 - i6) + i4, (i5 - i7) + i4);
                    this.f55416e[this.f55418g] = i7;
                    return;
                } else {
                    if (i5 == 0) {
                        return;
                    }
                    i4++;
                    f();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c
        @zc.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<E> a() {
            if (this.f55418g <= 0) {
                return b();
            }
            f3 x4 = f3.x(this.f55415d);
            d();
            return x4;
        }

        void f() {
            int[] iArr = this.f55417f;
            int i4 = this.f55418g;
            iArr[i4] = -iArr[i4];
            this.f55418g = i4 - 1;
        }
    }

    /* compiled from: Collections2.java */
    static class f<F, T> extends AbstractCollection<T> {

        /* renamed from: b, reason: collision with root package name */
        final Collection<F> f55419b;

        /* renamed from: c, reason: collision with root package name */
        final com.google.common.base.x<? super F, ? extends T> f55420c;

        f(Collection<F> collection, com.google.common.base.x<? super F, ? extends T> xVar) {
            collection.getClass();
            this.f55419b = collection;
            xVar.getClass();
            this.f55420c = xVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f55419b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f55419b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return d4.c0(this.f55419b.iterator(), this.f55420c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f55419b.size();
        }
    }

    private c0() {
    }

    static boolean b(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <E> c5<E> c(Collection<E> collection) {
        c5<E> c5Var = new c5<>();
        for (E e4 : collection) {
            c5Var.v(e4, c5Var.g(e4) + 1);
        }
        return c5Var;
    }

    public static <E> Collection<E> d(Collection<E> collection, com.google.common.base.m0<? super E> m0Var) {
        if (collection instanceof a) {
            return ((a) collection).b(m0Var);
        }
        collection.getClass();
        m0Var.getClass();
        return new a(collection, m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(List<?> list, List<?> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        c5 c5 = c(list);
        c5 c6 = c(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (c5.l(i4) != c6.g(c5.j(i4))) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder f(int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf46c"));
        return new StringBuilder((int) Math.min(i4 * 8, 1073741824L));
    }

    @d9.a
    public static <E extends Comparable<? super E>> Collection<List<E>> g(Iterable<E> iterable) {
        return new b(iterable, x4.f56632f);
    }

    @d9.a
    public static <E> Collection<List<E>> h(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new b(iterable, comparator);
    }

    @d9.a
    public static <E> Collection<List<E>> i(Collection<E> collection) {
        return new d(f3.x(collection));
    }

    static boolean j(Collection<?> collection, @zc.a Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static boolean k(Collection<?> collection, @zc.a Object obj) {
        collection.getClass();
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static String l(Collection<?> collection) {
        StringBuilder f4 = f(collection.size());
        f4.append('[');
        boolean z4 = true;
        for (Object obj : collection) {
            if (!z4) {
                f4.append(ProtectedSandApp.s("\uf46d"));
            }
            if (obj == collection) {
                f4.append(ProtectedSandApp.s("\uf46e"));
            } else {
                f4.append(obj);
            }
            z4 = false;
        }
        f4.append(']');
        return f4.toString();
    }

    public static <F, T> Collection<T> m(Collection<F> collection, com.google.common.base.x<? super F, T> xVar) {
        return new f(collection, xVar);
    }
}
