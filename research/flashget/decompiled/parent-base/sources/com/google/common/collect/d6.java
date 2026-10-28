package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.c0;
import com.google.common.collect.f3;
import com.google.common.collect.q3;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Sets.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class d6 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Sets.java */
    class a<E> extends m<E> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f55573b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f55574c;

        /* compiled from: Sets.java */
        /* renamed from: com.google.common.collect.d6$a$a, reason: collision with other inner class name */
        class C0842a extends com.google.common.collect.c<E> {

            /* renamed from: d, reason: collision with root package name */
            final Iterator<? extends E> f55575d;

            /* renamed from: e, reason: collision with root package name */
            final Iterator<? extends E> f55576e;

            C0842a() {
                this.f55575d = a.this.f55573b.iterator();
                this.f55576e = a.this.f55574c.iterator();
            }

            @Override // com.google.common.collect.c
            @zc.a
            protected E a() {
                if (this.f55575d.hasNext()) {
                    return this.f55575d.next();
                }
                while (this.f55576e.hasNext()) {
                    E next = this.f55576e.next();
                    if (!a.this.f55573b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        a(Set set, Set set2) {
            this.f55573b = set;
            this.f55574c = set2;
        }

        @Override // com.google.common.collect.d6.m
        public <S extends Set<E>> S b(S s4) {
            s4.addAll(this.f55573b);
            s4.addAll(this.f55574c);
            return s4;
        }

        @Override // com.google.common.collect.d6.m
        public q3<E> c() {
            return new q3.a(4).c(this.f55573b).c(this.f55574c).e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return this.f55573b.contains(obj) || this.f55574c.contains(obj);
        }

        @Override // com.google.common.collect.d6.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public e7<E> iterator() {
            return new C0842a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f55573b.isEmpty() && this.f55574c.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f55573b.size();
            Iterator<E> it = this.f55574c.iterator();
            while (it.hasNext()) {
                if (!this.f55573b.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Sets.java */
    class b<E> extends m<E> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f55578b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f55579c;

        /* compiled from: Sets.java */
        class a extends com.google.common.collect.c<E> {

            /* renamed from: d, reason: collision with root package name */
            final Iterator<E> f55580d;

            a() {
                this.f55580d = b.this.f55578b.iterator();
            }

            @Override // com.google.common.collect.c
            @zc.a
            protected E a() {
                while (this.f55580d.hasNext()) {
                    E next = this.f55580d.next();
                    if (b.this.f55579c.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        b(Set set, Set set2) {
            this.f55578b = set;
            this.f55579c = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return this.f55578b.contains(obj) && this.f55579c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f55578b.containsAll(collection) && this.f55579c.containsAll(collection);
        }

        @Override // com.google.common.collect.d6.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: f */
        public e7<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f55579c, this.f55578b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f55578b.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                if (this.f55579c.contains(it.next())) {
                    i4++;
                }
            }
            return i4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Sets.java */
    class c<E> extends m<E> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f55582b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f55583c;

        /* compiled from: Sets.java */
        class a extends com.google.common.collect.c<E> {

            /* renamed from: d, reason: collision with root package name */
            final Iterator<E> f55584d;

            a() {
                this.f55584d = c.this.f55582b.iterator();
            }

            @Override // com.google.common.collect.c
            @zc.a
            protected E a() {
                while (this.f55584d.hasNext()) {
                    E next = this.f55584d.next();
                    if (!c.this.f55583c.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        c(Set set, Set set2) {
            this.f55582b = set;
            this.f55583c = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return this.f55582b.contains(obj) && !this.f55583c.contains(obj);
        }

        @Override // com.google.common.collect.d6.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: f */
        public e7<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f55583c.containsAll(this.f55582b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f55582b.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                if (!this.f55583c.contains(it.next())) {
                    i4++;
                }
            }
            return i4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Sets.java */
    class d<E> extends m<E> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f55586b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f55587c;

        /* compiled from: Sets.java */
        class a extends com.google.common.collect.c<E> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f55588d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Iterator f55589e;

            a(Iterator it, Iterator it2) {
                this.f55588d = it;
                this.f55589e = it2;
            }

            @Override // com.google.common.collect.c
            @zc.a
            public E a() {
                while (this.f55588d.hasNext()) {
                    E e4 = (E) this.f55588d.next();
                    if (!d.this.f55587c.contains(e4)) {
                        return e4;
                    }
                }
                while (this.f55589e.hasNext()) {
                    E e5 = (E) this.f55589e.next();
                    if (!d.this.f55586b.contains(e5)) {
                        return e5;
                    }
                }
                return b();
            }
        }

        d(Set set, Set set2) {
            this.f55586b = set;
            this.f55587c = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return this.f55587c.contains(obj) ^ this.f55586b.contains(obj);
        }

        @Override // com.google.common.collect.d6.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: f */
        public e7<E> iterator() {
            return new a(this.f55586b.iterator(), this.f55587c.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f55586b.equals(this.f55587c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f55586b.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                if (!this.f55587c.contains(it.next())) {
                    i4++;
                }
            }
            Iterator<E> it2 = this.f55587c.iterator();
            while (it2.hasNext()) {
                if (!this.f55586b.contains(it2.next())) {
                    i4++;
                }
            }
            return i4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Sets.java */
    class e<E> extends AbstractSet<Set<E>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f55591b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h3 f55592c;

        /* compiled from: Sets.java */
        class a extends com.google.common.collect.c<Set<E>> {

            /* renamed from: d, reason: collision with root package name */
            final BitSet f55593d;

            /* compiled from: Sets.java */
            /* renamed from: com.google.common.collect.d6$e$a$a, reason: collision with other inner class name */
            class C0843a extends AbstractSet<E> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ BitSet f55595b;

                /* compiled from: Sets.java */
                /* renamed from: com.google.common.collect.d6$e$a$a$a, reason: collision with other inner class name */
                class C0844a extends com.google.common.collect.c<E> {

                    /* renamed from: d, reason: collision with root package name */
                    int f55597d = -1;

                    C0844a() {
                    }

                    @Override // com.google.common.collect.c
                    @zc.a
                    protected E a() {
                        int nextSetBit = C0843a.this.f55595b.nextSetBit(this.f55597d + 1);
                        this.f55597d = nextSetBit;
                        return nextSetBit == -1 ? b() : e.this.f55592c.keySet().b().get(this.f55597d);
                    }
                }

                C0843a(BitSet bitSet) {
                    this.f55595b = bitSet;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(@zc.a Object obj) {
                    Integer num = (Integer) e.this.f55592c.get(obj);
                    return num != null && this.f55595b.get(num.intValue());
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                    return new C0844a();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return e.this.f55591b;
                }
            }

            a() {
                this.f55593d = new BitSet(e.this.f55592c.size());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Set<E> a() {
                if (this.f55593d.isEmpty()) {
                    this.f55593d.set(0, e.this.f55591b);
                } else {
                    int nextSetBit = this.f55593d.nextSetBit(0);
                    int nextClearBit = this.f55593d.nextClearBit(nextSetBit);
                    if (nextClearBit == e.this.f55592c.size()) {
                        return b();
                    }
                    int i4 = (nextClearBit - nextSetBit) - 1;
                    this.f55593d.set(0, i4);
                    this.f55593d.clear(i4, nextClearBit);
                    this.f55593d.set(nextClearBit);
                }
                return new C0843a((BitSet) this.f55593d.clone());
            }
        }

        e(int i4, h3 h3Var) {
            this.f55591b = i4;
            this.f55592c = h3Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            return set.size() == this.f55591b && this.f55592c.keySet().containsAll(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.math.f.a(this.f55592c.size(), this.f55591b);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String valueOf = String.valueOf(this.f55592c.keySet());
            int i4 = this.f55591b;
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append(ProtectedSandApp.s("\uf499"));
            sb.append(valueOf);
            sb.append(ProtectedSandApp.s("\uf49a"));
            sb.append(i4);
            sb.append(ProtectedSandApp.s("\uf49b"));
            return sb.toString();
        }
    }

    /* compiled from: Sets.java */
    private static final class f<E> extends q1<List<E>> implements Set<List<E>> {

        /* renamed from: b, reason: collision with root package name */
        private final transient f3<q3<E>> f55599b;

        /* renamed from: c, reason: collision with root package name */
        private final transient z<E> f55600c;

        /* compiled from: Sets.java */
        class a extends f3<List<E>> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ f3 f55601d;

            a(f3 f3Var) {
                this.f55601d = f3Var;
            }

            @Override // java.util.List
            /* renamed from: f0, reason: merged with bridge method [inline-methods] */
            public List<E> get(int i4) {
                return ((q3) this.f55601d.get(i4)).b();
            }

            @Override // com.google.common.collect.b3
            boolean j() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.f55601d.size();
            }
        }

        private f(f3<q3<E>> f3Var, z<E> zVar) {
            this.f55599b = f3Var;
            this.f55600c = zVar;
        }

        static <E> Set<List<E>> T3(List<? extends Set<? extends E>> list) {
            f3.a aVar = new f3.a(list.size());
            Iterator<? extends Set<? extends E>> it = list.iterator();
            while (it.hasNext()) {
                q3 A = q3.A(it.next());
                if (A.isEmpty()) {
                    return t5.f56492m;
                }
                aVar.j(A);
            }
            f3<E> e4 = aVar.e();
            return new f(e4, new z(new a(e4)));
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (list.size() != this.f55599b.size()) {
                return false;
            }
            Iterator<E> it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                if (!this.f55599b.get(i4).contains(it.next())) {
                    return false;
                }
                i4++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@zc.a Object obj) {
            return obj instanceof f ? this.f55599b.equals(((f) obj).f55599b) : super.equals(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i4 = 1;
            int size = size() - 1;
            for (int i5 = 0; i5 < this.f55599b.size(); i5++) {
                size = ~(~(size * 31));
            }
            e7<q3<E>> it = this.f55599b.iterator();
            while (it.hasNext()) {
                q3<E> next = it.next();
                i4 = ~(~((next.hashCode() * (size() / next.size())) + (i4 * 31)));
            }
            return ~(~(i4 + size));
        }

        @Override // com.google.common.collect.q1, com.google.common.collect.h2
        protected Object u3() {
            return this.f55600c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.q1
        /* renamed from: v3 */
        public Collection<List<E>> u3() {
            return this.f55600c;
        }
    }

    /* compiled from: Sets.java */
    @d9.c
    static class g<E> extends g2<E> {

        /* renamed from: b, reason: collision with root package name */
        private final NavigableSet<E> f55602b;

        g(NavigableSet<E> navigableSet) {
            this.f55602b = navigableSet;
        }

        private static <T> e5<T> k4(Comparator<T> comparator) {
            return e5.u(comparator).v0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.g2, com.google.common.collect.n2, com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: Y3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> u3() {
            return this.f55602b;
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        @zc.a
        public E ceiling(@f5 E e4) {
            return this.f55602b.floor(e4);
        }

        @Override // com.google.common.collect.n2, java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator = this.f55602b.comparator();
            if (comparator != null) {
                return k4(comparator);
            }
            x4.f56632f.getClass();
            return y5.f56654d;
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return this.f55602b.iterator();
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return this.f55602b;
        }

        @Override // com.google.common.collect.n2, java.util.SortedSet
        @f5
        public E first() {
            return this.f55602b.last();
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        @zc.a
        public E floor(@f5 E e4) {
            return this.f55602b.ceiling(e4);
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        public NavigableSet<E> headSet(@f5 E e4, boolean z4) {
            return this.f55602b.tailSet(e4, z4).descendingSet();
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        @zc.a
        public E higher(@f5 E e4) {
            return this.f55602b.lower(e4);
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.f55602b.descendingIterator();
        }

        @Override // com.google.common.collect.n2, java.util.SortedSet
        @f5
        public E last() {
            return this.f55602b.first();
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        @zc.a
        public E lower(@f5 E e4) {
            return this.f55602b.higher(e4);
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        @zc.a
        public E pollFirst() {
            return this.f55602b.pollLast();
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        @zc.a
        public E pollLast() {
            return this.f55602b.pollFirst();
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        public NavigableSet<E> subSet(@f5 E e4, boolean z4, @f5 E e5, boolean z5) {
            return this.f55602b.subSet(e5, z5, e4, z4).descendingSet();
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        public NavigableSet<E> tailSet(@f5 E e4, boolean z4) {
            return this.f55602b.headSet(e4, z4).descendingSet();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return Q3();
        }

        @Override // com.google.common.collect.h2
        public String toString() {
            return S3();
        }

        @Override // com.google.common.collect.n2, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(@f5 E e4) {
            return c4(e4);
        }

        @Override // com.google.common.collect.n2, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(@f5 E e4, @f5 E e5) {
            return X3(e4, e5);
        }

        @Override // com.google.common.collect.n2, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(@f5 E e4) {
            return j4(e4);
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) R3(tArr);
        }
    }

    /* compiled from: Sets.java */
    @d9.c
    private static class h<E> extends j<E> implements NavigableSet<E> {
        h(NavigableSet<E> navigableSet, com.google.common.base.m0<? super E> m0Var) {
            super((Collection) navigableSet, (com.google.common.base.m0) m0Var);
        }

        NavigableSet<E> c() {
            return (NavigableSet) this.f55407b;
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E ceiling(@f5 E e4) {
            return (E) c4.r(c().tailSet(e4, true), this.f55408c, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return d4.x(c().descendingIterator(), this.f55408c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return d6.h(c().descendingSet(), this.f55408c);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E floor(@f5 E e4) {
            return (E) d4.A(c().headSet(e4, true).descendingIterator(), this.f55408c, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@f5 E e4, boolean z4) {
            return d6.h(c().headSet(e4, z4), this.f55408c);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E higher(@f5 E e4) {
            return (E) c4.r(c().tailSet(e4, false), this.f55408c, null);
        }

        @Override // com.google.common.collect.d6.j, java.util.SortedSet
        @f5
        public E last() {
            return (E) d4.z(c().descendingIterator(), this.f55408c);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E lower(@f5 E e4) {
            return (E) d4.A(c().headSet(e4, false).descendingIterator(), this.f55408c, null);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E pollFirst() {
            return (E) c4.I(c(), this.f55408c);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E pollLast() {
            return (E) c4.I(c().descendingSet(), this.f55408c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@f5 E e4, boolean z4, @f5 E e5, boolean z5) {
            return d6.h(c().subSet(e4, z4, e5, z5), this.f55408c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@f5 E e4, boolean z4) {
            return d6.h(c().tailSet(e4, z4), this.f55408c);
        }
    }

    /* compiled from: Sets.java */
    private static class i<E> extends c0.a<E> implements Set<E> {
        i(Set<E> set, com.google.common.base.m0<? super E> m0Var) {
            super(set, m0Var);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@zc.a Object obj) {
            return d6.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return d6.k(this);
        }
    }

    /* compiled from: Sets.java */
    private static class j<E> extends i<E> implements SortedSet<E> {
        j(SortedSet<E> sortedSet, com.google.common.base.m0<? super E> m0Var) {
            super((Collection) sortedSet, (com.google.common.base.m0) m0Var);
        }

        @Override // java.util.SortedSet
        @zc.a
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f55407b).comparator();
        }

        @Override // java.util.SortedSet
        @f5
        public E first() {
            return (E) d4.z(this.f55407b.iterator(), this.f55408c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@f5 E e4) {
            return new j((Collection) ((SortedSet) this.f55407b).headSet(e4), (com.google.common.base.m0) this.f55408c);
        }

        @f5
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f55407b;
            while (true) {
                E e4 = (Object) sortedSet.last();
                if (this.f55408c.apply(e4)) {
                    return e4;
                }
                sortedSet = sortedSet.headSet(e4);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@f5 E e4, @f5 E e5) {
            return new j((Collection) ((SortedSet) this.f55407b).subSet(e4, e5), (com.google.common.base.m0) this.f55408c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@f5 E e4) {
            return new j((Collection) ((SortedSet) this.f55407b).tailSet(e4), (com.google.common.base.m0) this.f55408c);
        }
    }

    /* compiled from: Sets.java */
    static abstract class k<E> extends AbstractSet<E> {
        k() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return d6.I(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* compiled from: Sets.java */
    private static final class l<E> extends AbstractSet<Set<E>> {

        /* renamed from: b, reason: collision with root package name */
        final h3<E, Integer> f55603b;

        /* compiled from: Sets.java */
        class a extends com.google.common.collect.b<Set<E>> {
            a(int i4) {
                super(i4, 0);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Set<E> a(int i4) {
                return new n(l.this.f55603b, i4);
            }
        }

        l(Set<E> set) {
            com.google.common.base.l0.k(set.size() <= 30, ProtectedSandApp.s("\uf49f"), set.size());
            this.f55603b = p4.Q(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.f55603b.keySet().containsAll((Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@zc.a Object obj) {
            return obj instanceof l ? this.f55603b.keySet().equals(((l) obj).f55603b.keySet()) : super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f55603b.keySet().hashCode() << (this.f55603b.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a(size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.f55603b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String valueOf = String.valueOf(this.f55603b);
            return com.google.common.base.h.a(valueOf.length() + 10, ProtectedSandApp.s("\uf4a0"), valueOf, ProtectedSandApp.s("\uf4a1"));
        }
    }

    /* compiled from: Sets.java */
    public static abstract class m<E> extends AbstractSet<E> {
        private m() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @f9.a
        @f9.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean add(@f5 E e4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @f9.a
        @f9.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @f9.a
        public <S extends Set<E>> S b(S s4) {
            s4.addAll(this);
            return s4;
        }

        public q3<E> c() {
            return q3.A(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @f9.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: f */
        public abstract e7<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @f9.a
        @f9.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(@zc.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @f9.a
        @f9.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @f9.a
        @f9.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        m(a aVar) {
        }
    }

    /* compiled from: Sets.java */
    private static final class n<E> extends AbstractSet<E> {

        /* renamed from: b, reason: collision with root package name */
        private final h3<E, Integer> f55605b;

        /* renamed from: c, reason: collision with root package name */
        private final int f55606c;

        /* compiled from: Sets.java */
        class a extends e7<E> {

            /* renamed from: b, reason: collision with root package name */
            final f3<E> f55607b;

            /* renamed from: c, reason: collision with root package name */
            int f55608c;

            a() {
                this.f55607b = n.this.f55605b.keySet().b();
                this.f55608c = n.this.f55606c;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f55608c != 0;
            }

            @Override // java.util.Iterator
            public E next() {
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f55608c);
                if (numberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.f55608c &= ~(1 << numberOfTrailingZeros);
                return this.f55607b.get(numberOfTrailingZeros);
            }
        }

        n(h3<E, Integer> h3Var, int i4) {
            this.f55605b = h3Var;
            this.f55606c = i4;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            Integer num = this.f55605b.get(obj);
            if (num != null) {
                if (((1 << num.intValue()) & this.f55606c) != 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.f55606c);
        }
    }

    /* compiled from: Sets.java */
    static final class o<E> extends n2<E> implements NavigableSet<E>, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f55610e = 0;

        /* renamed from: b, reason: collision with root package name */
        private final NavigableSet<E> f55611b;

        /* renamed from: c, reason: collision with root package name */
        private final SortedSet<E> f55612c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        private transient o<E> f55613d;

        o(NavigableSet<E> navigableSet) {
            navigableSet.getClass();
            this.f55611b = navigableSet;
            this.f55612c = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // com.google.common.collect.n2, com.google.common.collect.j2
        /* renamed from: T3 */
        protected Set u3() {
            return this.f55612c;
        }

        @Override // com.google.common.collect.n2
        /* renamed from: W3 */
        protected SortedSet<E> u3() {
            return this.f55612c;
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E ceiling(@f5 E e4) {
            return this.f55611b.ceiling(e4);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return d4.f0(this.f55611b.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            o<E> oVar = this.f55613d;
            if (oVar != null) {
                return oVar;
            }
            o<E> oVar2 = new o<>(this.f55611b.descendingSet());
            this.f55613d = oVar2;
            oVar2.f55613d = this;
            return oVar2;
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E floor(@f5 E e4) {
            return this.f55611b.floor(e4);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@f5 E e4, boolean z4) {
            return d6.O(this.f55611b.headSet(e4, z4));
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E higher(@f5 E e4) {
            return this.f55611b.higher(e4);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E lower(@f5 E e4) {
            return this.f55611b.lower(e4);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@f5 E e4, boolean z4, @f5 E e5, boolean z5) {
            return d6.O(this.f55611b.subSet(e4, z4, e5, z5));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@f5 E e4, boolean z4) {
            return d6.O(this.f55611b.tailSet(e4, z4));
        }

        @Override // com.google.common.collect.n2, com.google.common.collect.j2, com.google.common.collect.q1, com.google.common.collect.h2
        protected Object u3() {
            return this.f55612c;
        }

        @Override // com.google.common.collect.n2, com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: v3 */
        protected Collection u3() {
            return this.f55612c;
        }
    }

    private d6() {
    }

    public static <E> LinkedHashSet<E> A() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> B(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> linkedHashSet = new LinkedHashSet<>();
        c4.a(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static <E> LinkedHashSet<E> C(int i4) {
        return new LinkedHashSet<>(p4.o(i4));
    }

    @Deprecated
    public static <E> Set<E> D(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> E() {
        return new TreeSet<>();
    }

    public static <E extends Comparable> TreeSet<E> F(Iterable<? extends E> iterable) {
        TreeSet<E> treeSet = new TreeSet<>();
        c4.a(treeSet, iterable);
        return treeSet;
    }

    public static <E> TreeSet<E> G(Comparator<? super E> comparator) {
        comparator.getClass();
        return new TreeSet<>(comparator);
    }

    @d9.b(serializable = false)
    public static <E> Set<Set<E>> H(Set<E> set) {
        return new l(set);
    }

    static boolean I(Set<?> set, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof u4) {
            collection = ((u4) collection).d();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? J(set, collection.iterator()) : d4.V(set.iterator(), collection);
    }

    static boolean J(Set<?> set, Iterator<?> it) {
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= set.remove(it.next());
        }
        return z4;
    }

    @d9.a
    @d9.c
    public static <K extends Comparable<? super K>> NavigableSet<K> K(NavigableSet<K> navigableSet, j5<K> j5Var) {
        if (navigableSet.comparator() != null && navigableSet.comparator() != x4.f56632f && j5Var.q() && j5Var.r()) {
            com.google.common.base.l0.e(navigableSet.comparator().compare(j5Var.f55872b.i(), j5Var.f55873c.i()) <= 0, ProtectedSandApp.s("\uf4a2"));
        }
        if (j5Var.q() && j5Var.r()) {
            K i4 = j5Var.f55872b.i();
            x m4 = j5Var.f55872b.m();
            x xVar = x.CLOSED;
            return navigableSet.subSet(i4, m4 == xVar, j5Var.f55873c.i(), j5Var.f55873c.n() == xVar);
        }
        if (j5Var.q()) {
            return navigableSet.tailSet(j5Var.f55872b.i(), j5Var.f55872b.m() == x.CLOSED);
        }
        if (j5Var.r()) {
            return navigableSet.headSet(j5Var.f55873c.i(), j5Var.f55873c.n() == x.CLOSED);
        }
        return navigableSet;
    }

    public static <E> m<E> L(Set<? extends E> set, Set<? extends E> set2) {
        com.google.common.base.l0.F(set, ProtectedSandApp.s("\uf4a3"));
        com.google.common.base.l0.F(set2, ProtectedSandApp.s("\uf4a4"));
        return new d(set, set2);
    }

    @d9.c
    public static <E> NavigableSet<E> M(NavigableSet<E> navigableSet) {
        return r6.q(navigableSet);
    }

    public static <E> m<E> N(Set<? extends E> set, Set<? extends E> set2) {
        com.google.common.base.l0.F(set, ProtectedSandApp.s("\uf4a3"));
        com.google.common.base.l0.F(set2, ProtectedSandApp.s("\uf4a4"));
        return new a(set, set2);
    }

    public static <E> NavigableSet<E> O(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof b3) || (navigableSet instanceof o)) ? navigableSet : new o(navigableSet);
    }

    public static <B> Set<List<B>> a(List<? extends Set<? extends B>> list) {
        return f.T3(list);
    }

    @SafeVarargs
    public static <B> Set<List<B>> b(Set<? extends B>... setArr) {
        return f.T3(Arrays.asList(setArr));
    }

    @d9.a
    public static <E> Set<Set<E>> c(Set<E> set, int i4) {
        h3 Q = p4.Q(set);
        b0.b(i4, ProtectedSandApp.s("\uf4a5"));
        com.google.common.base.l0.m(i4 <= Q.size(), ProtectedSandApp.s("\uf4a6"), i4, Q.size());
        return i4 == 0 ? new e6(q3.I()) : i4 == Q.size() ? q3.K(Q.keySet()) : new e(i4, Q);
    }

    public static <E extends Enum<E>> EnumSet<E> d(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        com.google.common.base.l0.e(!collection.isEmpty(), ProtectedSandApp.s("\uf4a7"));
        return o(collection, collection.iterator().next().getDeclaringClass());
    }

    public static <E extends Enum<E>> EnumSet<E> e(Collection<E> collection, Class<E> cls) {
        collection.getClass();
        return collection instanceof EnumSet ? EnumSet.complementOf((EnumSet) collection) : o(collection, cls);
    }

    public static <E> m<E> f(Set<E> set, Set<?> set2) {
        com.google.common.base.l0.F(set, ProtectedSandApp.s("\uf4a3"));
        com.google.common.base.l0.F(set2, ProtectedSandApp.s("\uf4a4"));
        return new c(set, set2);
    }

    static boolean g(Set<?> set, @zc.a Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d9.c
    public static <E> NavigableSet<E> h(NavigableSet<E> navigableSet, com.google.common.base.m0<? super E> m0Var) {
        if (navigableSet instanceof i) {
            return new h(r1.f55407b, com.google.common.base.n0.d(((i) navigableSet).f55408c, m0Var));
        }
        navigableSet.getClass();
        m0Var.getClass();
        return new h((Collection) navigableSet, (com.google.common.base.m0) m0Var);
    }

    public static <E> Set<E> i(Set<E> set, com.google.common.base.m0<? super E> m0Var) {
        if (set instanceof SortedSet) {
            return j((SortedSet) set, m0Var);
        }
        if (set instanceof i) {
            return new i(r1.f55407b, com.google.common.base.n0.d(((i) set).f55408c, m0Var));
        }
        set.getClass();
        m0Var.getClass();
        return new i((Collection) set, (com.google.common.base.m0) m0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> j(SortedSet<E> sortedSet, com.google.common.base.m0<? super E> m0Var) {
        if (sortedSet instanceof i) {
            return new j(r1.f55407b, com.google.common.base.n0.d(((i) sortedSet).f55408c, m0Var));
        }
        sortedSet.getClass();
        m0Var.getClass();
        return new j((Collection) sortedSet, (com.google.common.base.m0) m0Var);
    }

    static int k(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4 = ~(~(i4 + (next != null ? next.hashCode() : 0)));
        }
        return i4;
    }

    @d9.b(serializable = true)
    public static <E extends Enum<E>> q3<E> l(E e4, E... eArr) {
        return e3.T(EnumSet.of((Enum) e4, (Enum[]) eArr));
    }

    @d9.b(serializable = true)
    public static <E extends Enum<E>> q3<E> m(Iterable<E> iterable) {
        if (iterable instanceof e3) {
            return (e3) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return collection.isEmpty() ? q3.I() : e3.T(EnumSet.copyOf(collection));
        }
        Iterator<E> it = iterable.iterator();
        if (!it.hasNext()) {
            return q3.I();
        }
        EnumSet of2 = EnumSet.of((Enum) it.next());
        d4.a(of2, it);
        return e3.T(of2);
    }

    public static <E> m<E> n(Set<E> set, Set<?> set2) {
        com.google.common.base.l0.F(set, ProtectedSandApp.s("\uf4a3"));
        com.google.common.base.l0.F(set2, ProtectedSandApp.s("\uf4a4"));
        return new b(set, set2);
    }

    private static <E extends Enum<E>> EnumSet<E> o(Collection<E> collection, Class<E> cls) {
        EnumSet<E> allOf = EnumSet.allOf(cls);
        allOf.removeAll(collection);
        return allOf;
    }

    public static <E> Set<E> p() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> Set<E> q(Iterable<? extends E> iterable) {
        Set<E> p4 = p();
        c4.a(p4, iterable);
        return p4;
    }

    @d9.c
    public static <E> CopyOnWriteArraySet<E> r() {
        return new CopyOnWriteArraySet<>();
    }

    @d9.c
    public static <E> CopyOnWriteArraySet<E> s(Iterable<? extends E> iterable) {
        return new CopyOnWriteArraySet<>(iterable instanceof Collection ? (Collection) iterable : l4.r(iterable));
    }

    public static <E extends Enum<E>> EnumSet<E> t(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> noneOf = EnumSet.noneOf(cls);
        c4.a(noneOf, iterable);
        return noneOf;
    }

    public static <E> HashSet<E> u() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> v(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? new HashSet<>((Collection) iterable) : w(iterable.iterator());
    }

    public static <E> HashSet<E> w(Iterator<? extends E> it) {
        HashSet<E> hashSet = new HashSet<>();
        d4.a(hashSet, it);
        return hashSet;
    }

    public static <E> HashSet<E> x(E... eArr) {
        HashSet<E> y4 = y(eArr.length);
        Collections.addAll(y4, eArr);
        return y4;
    }

    public static <E> HashSet<E> y(int i4) {
        return new HashSet<>(p4.o(i4));
    }

    public static <E> Set<E> z() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }
}
