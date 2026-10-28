package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Lists.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class l4 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Lists.java */
    class a<E> extends g<E> {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55913c = 0;

        a(List list) {
            super(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i4) {
            return this.f55915b.listIterator(i4);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Lists.java */
    class b<E> extends c<E> {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55914c = 0;

        b(List list) {
            super(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i4) {
            return this.f55915b.listIterator(i4);
        }
    }

    /* compiled from: Lists.java */
    private static class c<E> extends AbstractList<E> {

        /* renamed from: b, reason: collision with root package name */
        final List<E> f55915b;

        c(List<E> list) {
            list.getClass();
            this.f55915b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i4, @f5 E e4) {
            this.f55915b.add(i4, e4);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i4, Collection<? extends E> collection) {
            return this.f55915b.addAll(i4, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zc.a Object obj) {
            return this.f55915b.contains(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        @f5
        public E get(int i4) {
            return this.f55915b.get(i4);
        }

        @Override // java.util.AbstractList, java.util.List
        @f5
        public E remove(int i4) {
            return this.f55915b.remove(i4);
        }

        @Override // java.util.AbstractList, java.util.List
        @f5
        public E set(int i4, @f5 E e4) {
            return this.f55915b.set(i4, e4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55915b.size();
        }
    }

    /* compiled from: Lists.java */
    private static final class d extends AbstractList<Character> {

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f55916b;

        d(CharSequence charSequence) {
            this.f55916b = charSequence;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Character get(int i4) {
            com.google.common.base.l0.C(i4, this.f55916b.length());
            return Character.valueOf(this.f55916b.charAt(i4));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55916b.length();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Lists.java */
    static class e<E> extends AbstractList<E> implements Serializable, RandomAccess {

        /* renamed from: d, reason: collision with root package name */
        private static final long f55917d = 0;

        /* renamed from: b, reason: collision with root package name */
        @f5
        final E f55918b;

        /* renamed from: c, reason: collision with root package name */
        final E[] f55919c;

        e(@f5 E e4, E[] eArr) {
            this.f55918b = e4;
            eArr.getClass();
            this.f55919c = eArr;
        }

        @Override // java.util.AbstractList, java.util.List
        @f5
        public E get(int i4) {
            com.google.common.base.l0.C(i4, size());
            return i4 == 0 ? this.f55918b : this.f55919c[i4 - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.f.t(this.f55919c.length, 1);
        }
    }

    /* compiled from: Lists.java */
    private static class f<T> extends AbstractList<List<T>> {

        /* renamed from: b, reason: collision with root package name */
        final List<T> f55920b;

        /* renamed from: c, reason: collision with root package name */
        final int f55921c;

        f(List<T> list, int i4) {
            this.f55920b = list;
            this.f55921c = i4;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> get(int i4) {
            com.google.common.base.l0.C(i4, size());
            int i5 = this.f55921c;
            int i6 = i4 * i5;
            return this.f55920b.subList(i6, Math.min(i5 + i6, this.f55920b.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f55920b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.f.g(this.f55920b.size(), this.f55921c, RoundingMode.CEILING);
        }
    }

    /* compiled from: Lists.java */
    private static class g<E> extends c<E> implements RandomAccess {
        g(List<E> list) {
            super(list);
        }
    }

    /* compiled from: Lists.java */
    private static class h<T> extends f<T> implements RandomAccess {
        h(List<T> list, int i4) {
            super(list, i4);
        }
    }

    /* compiled from: Lists.java */
    private static class i<T> extends j<T> implements RandomAccess {
        i(List<T> list) {
            super(list);
        }
    }

    /* compiled from: Lists.java */
    private static class j<T> extends AbstractList<T> {

        /* renamed from: b, reason: collision with root package name */
        private final List<T> f55922b;

        /* compiled from: Lists.java */
        class a implements ListIterator<T> {

            /* renamed from: b, reason: collision with root package name */
            boolean f55923b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ListIterator f55924c;

            a(ListIterator listIterator) {
                this.f55924c = listIterator;
            }

            @Override // java.util.ListIterator
            public void add(@f5 T t4) {
                this.f55924c.add(t4);
                this.f55924c.previous();
                this.f55923b = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f55924c.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f55924c.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            @f5
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f55923b = true;
                return (T) this.f55924c.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return j.this.h(this.f55924c.nextIndex());
            }

            @Override // java.util.ListIterator
            @f5
            public T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f55923b = true;
                return (T) this.f55924c.next();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b0.e(this.f55923b);
                this.f55924c.remove();
                this.f55923b = false;
            }

            @Override // java.util.ListIterator
            public void set(@f5 T t4) {
                com.google.common.base.l0.g0(this.f55923b);
                this.f55924c.set(t4);
            }
        }

        j(List<T> list) {
            list.getClass();
            this.f55922b = list;
        }

        private int f(int i4) {
            int size = size();
            com.google.common.base.l0.C(i4, size);
            return (size - 1) - i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h(int i4) {
            int size = size();
            com.google.common.base.l0.d0(i4, size);
            return size - i4;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i4, @f5 T t4) {
            this.f55922b.add(h(i4), t4);
        }

        List<T> c() {
            return this.f55922b;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f55922b.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @f5
        public T get(int i4) {
            return this.f55922b.get(f(i4));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i4) {
            return new a(this.f55922b.listIterator(h(i4)));
        }

        @Override // java.util.AbstractList, java.util.List
        @f5
        public T remove(int i4) {
            return this.f55922b.remove(f(i4));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i4, int i5) {
            subList(i4, i5).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @f5
        public T set(int i4, @f5 T t4) {
            return this.f55922b.set(f(i4), t4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55922b.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i4, int i5) {
            com.google.common.base.l0.f0(i4, i5, size());
            return l4.B(this.f55922b.subList(h(i5), h(i4)));
        }
    }

    /* compiled from: Lists.java */
    private static final class k extends f3<Character> {

        /* renamed from: d, reason: collision with root package name */
        private final String f55926d;

        k(String str) {
            this.f55926d = str;
        }

        @Override // com.google.common.collect.f3, java.util.List
        /* renamed from: d0 */
        public f3<Character> subList(int i4, int i5) {
            com.google.common.base.l0.f0(i4, i5, this.f55926d.length());
            return l4.g(this.f55926d.substring(i4, i5));
        }

        @Override // java.util.List
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public Character get(int i4) {
            com.google.common.base.l0.C(i4, this.f55926d.length());
            return Character.valueOf(this.f55926d.charAt(i4));
        }

        @Override // com.google.common.collect.f3, java.util.List
        public int indexOf(@zc.a Object obj) {
            if (obj instanceof Character) {
                return this.f55926d.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return false;
        }

        @Override // com.google.common.collect.f3, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            if (obj instanceof Character) {
                return this.f55926d.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55926d.length();
        }
    }

    /* compiled from: Lists.java */
    private static class l<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f55927d = 0;

        /* renamed from: b, reason: collision with root package name */
        final List<F> f55928b;

        /* renamed from: c, reason: collision with root package name */
        final com.google.common.base.x<? super F, ? extends T> f55929c;

        /* compiled from: Lists.java */
        class a extends w6<F, T> {
            a(ListIterator listIterator) {
                super((Iterator) listIterator);
            }

            @Override // com.google.common.collect.v6
            T a(F f4) {
                return l.this.f55929c.apply(f4);
            }
        }

        l(List<F> list, com.google.common.base.x<? super F, ? extends T> xVar) {
            list.getClass();
            this.f55928b = list;
            xVar.getClass();
            this.f55929c = xVar;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f55928b.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @f5
        public T get(int i4) {
            return this.f55929c.apply(this.f55928b.get(i4));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f55928b.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i4) {
            return new a(this.f55928b.listIterator(i4));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i4) {
            return this.f55929c.apply(this.f55928b.remove(i4));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55928b.size();
        }
    }

    /* compiled from: Lists.java */
    private static class m<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f55931d = 0;

        /* renamed from: b, reason: collision with root package name */
        final List<F> f55932b;

        /* renamed from: c, reason: collision with root package name */
        final com.google.common.base.x<? super F, ? extends T> f55933c;

        /* compiled from: Lists.java */
        class a extends w6<F, T> {
            a(ListIterator listIterator) {
                super((Iterator) listIterator);
            }

            @Override // com.google.common.collect.v6
            @f5
            T a(@f5 F f4) {
                return m.this.f55933c.apply(f4);
            }
        }

        m(List<F> list, com.google.common.base.x<? super F, ? extends T> xVar) {
            list.getClass();
            this.f55932b = list;
            xVar.getClass();
            this.f55933c = xVar;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f55932b.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i4) {
            return new a(this.f55932b.listIterator(i4));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55932b.size();
        }
    }

    /* compiled from: Lists.java */
    private static class n<E> extends AbstractList<E> implements Serializable, RandomAccess {

        /* renamed from: e, reason: collision with root package name */
        private static final long f55935e = 0;

        /* renamed from: b, reason: collision with root package name */
        @f5
        final E f55936b;

        /* renamed from: c, reason: collision with root package name */
        @f5
        final E f55937c;

        /* renamed from: d, reason: collision with root package name */
        final E[] f55938d;

        n(@f5 E e4, @f5 E e5, E[] eArr) {
            this.f55936b = e4;
            this.f55937c = e5;
            eArr.getClass();
            this.f55938d = eArr;
        }

        @Override // java.util.AbstractList, java.util.List
        @f5
        public E get(int i4) {
            if (i4 == 0) {
                return this.f55936b;
            }
            if (i4 == 1) {
                return this.f55937c;
            }
            com.google.common.base.l0.C(i4, size());
            return this.f55938d[i4 - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.f.t(this.f55938d.length, 2);
        }
    }

    private l4() {
    }

    public static <T> List<List<T>> A(List<T> list, int i4) {
        list.getClass();
        com.google.common.base.l0.d(i4 > 0);
        return list instanceof RandomAccess ? new h(list, i4) : new f(list, i4);
    }

    public static <T> List<T> B(List<T> list) {
        return list instanceof f3 ? ((f3) list).Z() : list instanceof j ? ((j) list).c() : list instanceof RandomAccess ? new i(list) : new j(list);
    }

    static <E> List<E> C(List<E> list, int i4, int i5) {
        return (list instanceof RandomAccess ? new a(list) : new b(list)).subList(i4, i5);
    }

    public static <F, T> List<T> D(List<F> list, com.google.common.base.x<? super F, ? extends T> xVar) {
        return list instanceof RandomAccess ? new l(list, xVar) : new m(list, xVar);
    }

    static <E> boolean a(List<E> list, int i4, Iterable<? extends E> iterable) {
        ListIterator<E> listIterator = list.listIterator(i4);
        Iterator<? extends E> it = iterable.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z4 = true;
        }
        return z4;
    }

    public static <E> List<E> b(@f5 E e4, @f5 E e5, E[] eArr) {
        return new n(e4, e5, eArr);
    }

    public static <E> List<E> c(@f5 E e4, E[] eArr) {
        return new e(e4, eArr);
    }

    public static <B> List<List<B>> d(List<? extends List<? extends B>> list) {
        return z.f(list);
    }

    @SafeVarargs
    public static <B> List<List<B>> e(List<? extends B>... listArr) {
        return z.f(Arrays.asList(listArr));
    }

    static <T> List<T> f(Iterable<T> iterable) {
        return (List) iterable;
    }

    public static f3<Character> g(String str) {
        str.getClass();
        return new k(str);
    }

    @d9.a
    public static List<Character> h(CharSequence charSequence) {
        charSequence.getClass();
        return new d(charSequence);
    }

    @d9.d
    static int i(int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf4ec"));
        return com.google.common.primitives.l.x(i4 + 5 + (i4 / 10));
    }

    static boolean j(List<?> list, @zc.a Object obj) {
        list.getClass();
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return d4.t(list.iterator(), list2.iterator());
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (!com.google.common.base.f0.a(list.get(i4), list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    static int k(List<?> list) {
        Iterator<?> it = list.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i4 = ~(~((i4 * 31) + (next == null ? 0 : next.hashCode())));
        }
        return i4;
    }

    static int l(List<?> list, @zc.a Object obj) {
        if (list instanceof RandomAccess) {
            return m(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (com.google.common.base.f0.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int m(List<?> list, @zc.a Object obj) {
        int size = list.size();
        int i4 = 0;
        if (obj == null) {
            while (i4 < size) {
                if (list.get(i4) == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        while (i4 < size) {
            if (obj.equals(list.get(i4))) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    static int n(List<?> list, @zc.a Object obj) {
        if (list instanceof RandomAccess) {
            return o(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (com.google.common.base.f0.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int o(List<?> list, @zc.a Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    static <E> ListIterator<E> p(List<E> list, int i4) {
        return new c(list).listIterator(i4);
    }

    @d9.b(serializable = true)
    public static <E> ArrayList<E> q() {
        return new ArrayList<>();
    }

    @d9.b(serializable = true)
    public static <E> ArrayList<E> r(Iterable<? extends E> iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? new ArrayList<>((Collection) iterable) : s(iterable.iterator());
    }

    @d9.b(serializable = true)
    public static <E> ArrayList<E> s(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        d4.a(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    @d9.b(serializable = true)
    public static <E> ArrayList<E> t(E... eArr) {
        eArr.getClass();
        ArrayList<E> arrayList = new ArrayList<>(i(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @d9.b(serializable = true)
    public static <E> ArrayList<E> u(int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf4ed"));
        return new ArrayList<>(i4);
    }

    @d9.b(serializable = true)
    public static <E> ArrayList<E> v(int i4) {
        return new ArrayList<>(i(i4));
    }

    @d9.c
    public static <E> CopyOnWriteArrayList<E> w() {
        return new CopyOnWriteArrayList<>();
    }

    @d9.c
    public static <E> CopyOnWriteArrayList<E> x(Iterable<? extends E> iterable) {
        return new CopyOnWriteArrayList<>(iterable instanceof Collection ? (Collection) iterable : r(iterable));
    }

    @d9.b(serializable = true)
    public static <E> LinkedList<E> y() {
        return new LinkedList<>();
    }

    @d9.b(serializable = true)
    public static <E> LinkedList<E> z(Iterable<? extends E> iterable) {
        LinkedList<E> linkedList = new LinkedList<>();
        c4.a(linkedList, iterable);
        return linkedList;
    }
}
