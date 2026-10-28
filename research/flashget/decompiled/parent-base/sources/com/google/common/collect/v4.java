package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d6;
import com.google.common.collect.u4;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: Multisets.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public final class v4 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Multisets.java */
    class a<E> extends n<E> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u4 f56573d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u4 f56574e;

        /* compiled from: Multisets.java */
        /* renamed from: com.google.common.collect.v4$a$a, reason: collision with other inner class name */
        class C0864a extends com.google.common.collect.c<u4.a<E>> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f56575d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Iterator f56576e;

            C0864a(Iterator it, Iterator it2) {
                this.f56575d = it;
                this.f56576e = it2;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public u4.a<E> a() {
                if (this.f56575d.hasNext()) {
                    u4.a aVar = (u4.a) this.f56575d.next();
                    Object element = aVar.getElement();
                    return new k(element, Math.max(aVar.getCount(), a.this.f56574e.W2(element)));
                }
                while (this.f56576e.hasNext()) {
                    u4.a aVar2 = (u4.a) this.f56576e.next();
                    Object element2 = aVar2.getElement();
                    if (!a.this.f56573d.contains(element2)) {
                        return new k(element2, aVar2.getCount());
                    }
                }
                return b();
            }
        }

        a(u4 u4Var, u4 u4Var2) {
            this.f56573d = u4Var;
            this.f56574e = u4Var2;
        }

        @Override // com.google.common.collect.u4
        public int W2(@zc.a Object obj) {
            return Math.max(this.f56573d.W2(obj), this.f56574e.W2(obj));
        }

        @Override // com.google.common.collect.i
        Set<E> b() {
            return d6.N(this.f56573d.d(), this.f56574e.d());
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
        public boolean contains(@zc.a Object obj) {
            return this.f56573d.contains(obj) || this.f56574e.contains(obj);
        }

        @Override // com.google.common.collect.i
        Iterator<E> h() {
            throw new AssertionError(ProtectedSandApp.s("\uf571"));
        }

        @Override // com.google.common.collect.i
        Iterator<u4.a<E>> i() {
            return new C0864a(this.f56573d.entrySet().iterator(), this.f56574e.entrySet().iterator());
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f56573d.isEmpty() && this.f56574e.isEmpty();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Multisets.java */
    class b<E> extends n<E> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u4 f56578d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u4 f56579e;

        /* compiled from: Multisets.java */
        class a extends com.google.common.collect.c<u4.a<E>> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f56580d;

            a(Iterator it) {
                this.f56580d = it;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public u4.a<E> a() {
                while (this.f56580d.hasNext()) {
                    u4.a aVar = (u4.a) this.f56580d.next();
                    Object element = aVar.getElement();
                    int min = Math.min(aVar.getCount(), b.this.f56579e.W2(element));
                    if (min > 0) {
                        return new k(element, min);
                    }
                }
                return b();
            }
        }

        b(u4 u4Var, u4 u4Var2) {
            this.f56578d = u4Var;
            this.f56579e = u4Var2;
        }

        @Override // com.google.common.collect.u4
        public int W2(@zc.a Object obj) {
            int W2 = this.f56578d.W2(obj);
            if (W2 == 0) {
                return 0;
            }
            return Math.min(W2, this.f56579e.W2(obj));
        }

        @Override // com.google.common.collect.i
        Set<E> b() {
            return d6.n(this.f56578d.d(), this.f56579e.d());
        }

        @Override // com.google.common.collect.i
        Iterator<E> h() {
            throw new AssertionError(ProtectedSandApp.s("\uf572"));
        }

        @Override // com.google.common.collect.i
        Iterator<u4.a<E>> i() {
            return new a(this.f56578d.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Multisets.java */
    class c<E> extends n<E> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u4 f56582d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u4 f56583e;

        /* compiled from: Multisets.java */
        class a extends com.google.common.collect.c<u4.a<E>> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f56584d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Iterator f56585e;

            a(Iterator it, Iterator it2) {
                this.f56584d = it;
                this.f56585e = it2;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public u4.a<E> a() {
                if (this.f56584d.hasNext()) {
                    u4.a aVar = (u4.a) this.f56584d.next();
                    Object element = aVar.getElement();
                    return new k(element, c.this.f56583e.W2(element) + aVar.getCount());
                }
                while (this.f56585e.hasNext()) {
                    u4.a aVar2 = (u4.a) this.f56585e.next();
                    Object element2 = aVar2.getElement();
                    if (!c.this.f56582d.contains(element2)) {
                        return new k(element2, aVar2.getCount());
                    }
                }
                return b();
            }
        }

        c(u4 u4Var, u4 u4Var2) {
            this.f56582d = u4Var;
            this.f56583e = u4Var2;
        }

        @Override // com.google.common.collect.u4
        public int W2(@zc.a Object obj) {
            return this.f56583e.W2(obj) + this.f56582d.W2(obj);
        }

        @Override // com.google.common.collect.i
        Set<E> b() {
            return d6.N(this.f56582d.d(), this.f56583e.d());
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
        public boolean contains(@zc.a Object obj) {
            return this.f56582d.contains(obj) || this.f56583e.contains(obj);
        }

        @Override // com.google.common.collect.i
        Iterator<E> h() {
            throw new AssertionError(ProtectedSandApp.s("\uf573"));
        }

        @Override // com.google.common.collect.i
        Iterator<u4.a<E>> i() {
            return new a(this.f56582d.entrySet().iterator(), this.f56583e.entrySet().iterator());
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f56582d.isEmpty() && this.f56583e.isEmpty();
        }

        @Override // com.google.common.collect.v4.n, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
        public int size() {
            return com.google.common.math.f.t(this.f56582d.size(), this.f56583e.size());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Multisets.java */
    class d<E> extends n<E> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u4 f56587d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u4 f56588e;

        /* compiled from: Multisets.java */
        class a extends com.google.common.collect.c<E> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f56589d;

            a(Iterator it) {
                this.f56589d = it;
            }

            @Override // com.google.common.collect.c
            @zc.a
            protected E a() {
                while (this.f56589d.hasNext()) {
                    u4.a aVar = (u4.a) this.f56589d.next();
                    E e4 = (E) aVar.getElement();
                    if (aVar.getCount() > d.this.f56588e.W2(e4)) {
                        return e4;
                    }
                }
                return b();
            }
        }

        /* compiled from: Multisets.java */
        class b extends com.google.common.collect.c<u4.a<E>> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f56591d;

            b(Iterator it) {
                this.f56591d = it;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public u4.a<E> a() {
                while (this.f56591d.hasNext()) {
                    u4.a aVar = (u4.a) this.f56591d.next();
                    Object element = aVar.getElement();
                    int count = aVar.getCount() - d.this.f56588e.W2(element);
                    if (count > 0) {
                        return new k(element, count);
                    }
                }
                return b();
            }
        }

        d(u4 u4Var, u4 u4Var2) {
            this.f56587d = u4Var;
            this.f56588e = u4Var2;
        }

        @Override // com.google.common.collect.u4
        public int W2(@zc.a Object obj) {
            int W2 = this.f56587d.W2(obj);
            if (W2 == 0) {
                return 0;
            }
            return Math.max(0, W2 - this.f56588e.W2(obj));
        }

        @Override // com.google.common.collect.v4.n, com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.v4.n, com.google.common.collect.i
        int f() {
            return d4.Z(i());
        }

        @Override // com.google.common.collect.i
        Iterator<E> h() {
            return new a(this.f56587d.entrySet().iterator());
        }

        @Override // com.google.common.collect.i
        Iterator<u4.a<E>> i() {
            return new b(this.f56587d.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Multisets.java */
    class e<E> extends v6<u4.a<E>, E> {
        e(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v6
        @f5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(u4.a<E> aVar) {
            return aVar.getElement();
        }
    }

    /* compiled from: Multisets.java */
    static abstract class f<E> implements u4.a<E> {
        f() {
        }

        @Override // com.google.common.collect.u4.a
        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof u4.a)) {
                return false;
            }
            u4.a aVar = (u4.a) obj;
            return getCount() == aVar.getCount() && com.google.common.base.f0.a(getElement(), aVar.getElement());
        }

        @Override // com.google.common.collect.u4.a
        public int hashCode() {
            E element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.u4.a
        public String toString() {
            String valueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
            sb.append(valueOf);
            sb.append(ProtectedSandApp.s("\uf447"));
            sb.append(count);
            return sb.toString();
        }
    }

    /* compiled from: Multisets.java */
    private static final class g implements Comparator<u4.a<?>> {

        /* renamed from: b, reason: collision with root package name */
        static final g f56593b = new g();

        private g() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(u4.a<?> aVar, u4.a<?> aVar2) {
            return aVar2.getCount() - aVar.getCount();
        }
    }

    /* compiled from: Multisets.java */
    static abstract class h<E> extends d6.k<E> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return i().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return i().containsAll(collection);
        }

        abstract u4<E> i();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return i().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            return i().W1(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i().entrySet().size();
        }
    }

    /* compiled from: Multisets.java */
    static abstract class i<E> extends d6.k<u4.a<E>> {
        i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof u4.a)) {
                return false;
            }
            u4.a aVar = (u4.a) obj;
            return aVar.getCount() > 0 && i().W2(aVar.getElement()) == aVar.getCount();
        }

        abstract u4<E> i();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            if (obj instanceof u4.a) {
                u4.a aVar = (u4.a) obj;
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    return i().x2(element, count, 0);
                }
            }
            return false;
        }
    }

    /* compiled from: Multisets.java */
    private static final class j<E> extends n<E> {

        /* renamed from: d, reason: collision with root package name */
        final u4<E> f56594d;

        /* renamed from: e, reason: collision with root package name */
        final com.google.common.base.m0<? super E> f56595e;

        /* compiled from: Multisets.java */
        class a implements com.google.common.base.m0<u4.a<E>> {
            a() {
            }

            @Override // com.google.common.base.m0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(u4.a<E> aVar) {
                return j.this.f56595e.apply(aVar.getElement());
            }
        }

        j(u4<E> u4Var, com.google.common.base.m0<? super E> m0Var) {
            u4Var.getClass();
            this.f56594d = u4Var;
            m0Var.getClass();
            this.f56595e = m0Var;
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u4
        public int W1(@zc.a Object obj, int i4) {
            b0.b(i4, ProtectedSandApp.s("\uf574"));
            if (i4 == 0) {
                return W2(obj);
            }
            if (contains(obj)) {
                return this.f56594d.W1(obj, i4);
            }
            return 0;
        }

        @Override // com.google.common.collect.u4
        public int W2(@zc.a Object obj) {
            int W2 = this.f56594d.W2(obj);
            if (W2 <= 0 || !this.f56595e.apply(obj)) {
                return 0;
            }
            return W2;
        }

        @Override // com.google.common.collect.i
        Set<E> b() {
            return d6.i(this.f56594d.d(), this.f56595e);
        }

        @Override // com.google.common.collect.i
        Set<u4.a<E>> c() {
            return d6.i(this.f56594d.entrySet(), new a());
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u4
        public int d2(@f5 E e4, int i4) {
            com.google.common.base.l0.y(this.f56595e.apply(e4), ProtectedSandApp.s("\uf575"), e4, this.f56595e);
            return this.f56594d.d2(e4, i4);
        }

        @Override // com.google.common.collect.i
        Iterator<E> h() {
            throw new AssertionError(ProtectedSandApp.s("\uf576"));
        }

        @Override // com.google.common.collect.i
        Iterator<u4.a<E>> i() {
            throw new AssertionError(ProtectedSandApp.s("\uf576"));
        }

        @Override // com.google.common.collect.v4.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.g6
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public e7<E> iterator() {
            return d4.x(this.f56594d.iterator(), this.f56595e);
        }
    }

    /* compiled from: Multisets.java */
    static class k<E> extends f<E> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f56597d = 0;

        /* renamed from: b, reason: collision with root package name */
        @f5
        private final E f56598b;

        /* renamed from: c, reason: collision with root package name */
        private final int f56599c;

        k(@f5 E e4, int i4) {
            this.f56598b = e4;
            this.f56599c = i4;
            b0.b(i4, ProtectedSandApp.s("\uf577"));
        }

        @zc.a
        public k<E> a() {
            return null;
        }

        @Override // com.google.common.collect.u4.a
        public final int getCount() {
            return this.f56599c;
        }

        @Override // com.google.common.collect.u4.a
        @f5
        public final E getElement() {
            return this.f56598b;
        }
    }

    /* compiled from: Multisets.java */
    static final class l<E> implements Iterator<E> {

        /* renamed from: b, reason: collision with root package name */
        private final u4<E> f56600b;

        /* renamed from: c, reason: collision with root package name */
        private final Iterator<u4.a<E>> f56601c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        private u4.a<E> f56602d;

        /* renamed from: e, reason: collision with root package name */
        private int f56603e;

        /* renamed from: f, reason: collision with root package name */
        private int f56604f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f56605g;

        l(u4<E> u4Var, Iterator<u4.a<E>> it) {
            this.f56600b = u4Var;
            this.f56601c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f56603e > 0 || this.f56601c.hasNext();
        }

        @Override // java.util.Iterator
        @f5
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f56603e == 0) {
                u4.a<E> next = this.f56601c.next();
                this.f56602d = next;
                int count = next.getCount();
                this.f56603e = count;
                this.f56604f = count;
            }
            this.f56603e--;
            this.f56605g = true;
            u4.a<E> aVar = this.f56602d;
            Objects.requireNonNull(aVar);
            return aVar.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            b0.e(this.f56605g);
            if (this.f56604f == 1) {
                this.f56601c.remove();
            } else {
                u4<E> u4Var = this.f56600b;
                u4.a<E> aVar = this.f56602d;
                Objects.requireNonNull(aVar);
                u4Var.remove(aVar.getElement());
            }
            this.f56604f--;
            this.f56605g = false;
        }
    }

    /* compiled from: Multisets.java */
    static class m<E> extends e2<E> implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f56606e = 0;

        /* renamed from: b, reason: collision with root package name */
        final u4<? extends E> f56607b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        transient Set<E> f56608c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        transient Set<u4.a<E>> f56609d;

        m(u4<? extends E> u4Var) {
            this.f56607b = u4Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.e2, com.google.common.collect.q1
        /* renamed from: T3, reason: merged with bridge method [inline-methods] */
        public u4<E> u3() {
            return this.f56607b;
        }

        @Override // com.google.common.collect.e2, com.google.common.collect.u4
        public int W1(@zc.a Object obj, int i4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Queue
        public boolean add(@f5 E e4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q1, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        Set<E> c4() {
            return Collections.unmodifiableSet(this.f56607b.d());
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.e2, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
        public Set<E> d() {
            Set<E> set = this.f56608c;
            if (set != null) {
                return set;
            }
            Set<E> c42 = c4();
            this.f56608c = c42;
            return c42;
        }

        @Override // com.google.common.collect.e2, com.google.common.collect.u4
        public int d2(@f5 E e4, int i4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.e2, com.google.common.collect.u4, com.google.common.collect.k6
        public Set<u4.a<E>> entrySet() {
            Set<u4.a<E>> set = this.f56609d;
            if (set != null) {
                return set;
            }
            Set<u4.a<E>> unmodifiableSet = Collections.unmodifiableSet(this.f56607b.entrySet());
            this.f56609d = unmodifiableSet;
            return unmodifiableSet;
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return d4.f0(this.f56607b.iterator());
        }

        @Override // com.google.common.collect.e2, com.google.common.collect.u4
        public int o0(@f5 E e4, int i4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.e2, com.google.common.collect.u4
        public boolean x2(@f5 E e4, int i4, int i5) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: Multisets.java */
    private static abstract class n<E> extends com.google.common.collect.i<E> {
        private n() {
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d().clear();
        }

        @Override // com.google.common.collect.i
        int f() {
            return d().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.g6
        public Iterator<E> iterator() {
            return v4.n(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
        public int size() {
            return v4.o(this);
        }

        n(a aVar) {
        }
    }

    private v4() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> u4<E> A(u4<? extends E> u4Var) {
        if ((u4Var instanceof m) || (u4Var instanceof m3)) {
            return u4Var;
        }
        u4Var.getClass();
        return new m(u4Var);
    }

    @d9.a
    public static <E> k6<E> B(k6<E> k6Var) {
        k6Var.getClass();
        return new g7((u4) k6Var);
    }

    private static <E> boolean a(u4<E> u4Var, com.google.common.collect.f<? extends E> fVar) {
        if (fVar.isEmpty()) {
            return false;
        }
        fVar.j(u4Var);
        return true;
    }

    private static <E> boolean b(u4<E> u4Var, u4<? extends E> u4Var2) {
        if (u4Var2 instanceof com.google.common.collect.f) {
            return a(u4Var, (com.google.common.collect.f) u4Var2);
        }
        if (u4Var2.isEmpty()) {
            return false;
        }
        for (u4.a<? extends E> aVar : u4Var2.entrySet()) {
            u4Var.d2(aVar.getElement(), aVar.getCount());
        }
        return true;
    }

    static <E> boolean c(u4<E> u4Var, Collection<? extends E> collection) {
        u4Var.getClass();
        collection.getClass();
        if (collection instanceof u4) {
            return b(u4Var, (u4) collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        return d4.a(u4Var, collection.iterator());
    }

    static <T> u4<T> d(Iterable<T> iterable) {
        return (u4) iterable;
    }

    @f9.a
    public static boolean e(u4<?> u4Var, u4<?> u4Var2) {
        u4Var.getClass();
        u4Var2.getClass();
        for (u4.a<?> aVar : u4Var2.entrySet()) {
            if (u4Var.W2(aVar.getElement()) < aVar.getCount()) {
                return false;
            }
        }
        return true;
    }

    @d9.a
    public static <E> m3<E> f(u4<E> u4Var) {
        u4.a[] aVarArr = (u4.a[]) u4Var.entrySet().toArray(new u4.a[0]);
        Arrays.sort(aVarArr, g.f56593b);
        return m3.r(Arrays.asList(aVarArr));
    }

    @d9.a
    public static <E> u4<E> g(u4<E> u4Var, u4<?> u4Var2) {
        u4Var.getClass();
        u4Var2.getClass();
        return new d(u4Var, u4Var2);
    }

    static <E> Iterator<E> h(Iterator<u4.a<E>> it) {
        return new e(it);
    }

    static boolean i(u4<?> u4Var, @zc.a Object obj) {
        if (obj == u4Var) {
            return true;
        }
        if (obj instanceof u4) {
            u4 u4Var2 = (u4) obj;
            if (u4Var.size() == u4Var2.size() && u4Var.entrySet().size() == u4Var2.entrySet().size()) {
                for (u4.a aVar : u4Var2.entrySet()) {
                    if (u4Var.W2(aVar.getElement()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @d9.a
    public static <E> u4<E> j(u4<E> u4Var, com.google.common.base.m0<? super E> m0Var) {
        if (!(u4Var instanceof j)) {
            return new j(u4Var, m0Var);
        }
        j jVar = (j) u4Var;
        return new j(jVar.f56594d, com.google.common.base.n0.d(jVar.f56595e, m0Var));
    }

    public static <E> u4.a<E> k(@f5 E e4, int i4) {
        return new k(e4, i4);
    }

    static int l(Iterable<?> iterable) {
        if (iterable instanceof u4) {
            return ((u4) iterable).d().size();
        }
        return 11;
    }

    public static <E> u4<E> m(u4<E> u4Var, u4<?> u4Var2) {
        u4Var.getClass();
        u4Var2.getClass();
        return new b(u4Var, u4Var2);
    }

    static <E> Iterator<E> n(u4<E> u4Var) {
        return new l(u4Var, u4Var.entrySet().iterator());
    }

    static int o(u4<?> u4Var) {
        long j4 = 0;
        while (u4Var.entrySet().iterator().hasNext()) {
            j4 += r4.next().getCount();
        }
        return com.google.common.primitives.l.x(j4);
    }

    static boolean p(u4<?> u4Var, Collection<?> collection) {
        if (collection instanceof u4) {
            collection = ((u4) collection).d();
        }
        return u4Var.d().removeAll(collection);
    }

    @f9.a
    public static boolean q(u4<?> u4Var, u4<?> u4Var2) {
        u4Var.getClass();
        u4Var2.getClass();
        Iterator<u4.a<?>> it = u4Var.entrySet().iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            u4.a<?> next = it.next();
            int W2 = u4Var2.W2(next.getElement());
            if (W2 >= next.getCount()) {
                it.remove();
            } else if (W2 > 0) {
                u4Var.W1(next.getElement(), W2);
            }
            z4 = true;
        }
        return z4;
    }

    @f9.a
    public static boolean r(u4<?> u4Var, Iterable<?> iterable) {
        if (iterable instanceof u4) {
            return q(u4Var, (u4) iterable);
        }
        u4Var.getClass();
        iterable.getClass();
        Iterator<?> it = iterable.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= u4Var.remove(it.next());
        }
        return z4;
    }

    static boolean s(u4<?> u4Var, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof u4) {
            collection = ((u4) collection).d();
        }
        return u4Var.d().retainAll(collection);
    }

    @f9.a
    public static boolean t(u4<?> u4Var, u4<?> u4Var2) {
        return u(u4Var, u4Var2);
    }

    private static <E> boolean u(u4<E> u4Var, u4<?> u4Var2) {
        u4Var.getClass();
        u4Var2.getClass();
        Iterator<u4.a<E>> it = u4Var.entrySet().iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            u4.a<E> next = it.next();
            int W2 = u4Var2.W2(next.getElement());
            if (W2 == 0) {
                it.remove();
            } else if (W2 < next.getCount()) {
                u4Var.o0(next.getElement(), W2);
            }
            z4 = true;
        }
        return z4;
    }

    static <E> int v(u4<E> u4Var, @f5 E e4, int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf578"));
        int W2 = u4Var.W2(e4);
        int i5 = i4 - W2;
        if (i5 > 0) {
            u4Var.d2(e4, i5);
        } else if (i5 < 0) {
            u4Var.W1(e4, -i5);
        }
        return W2;
    }

    static <E> boolean w(u4<E> u4Var, @f5 E e4, int i4, int i5) {
        b0.b(i4, ProtectedSandApp.s("\uf579"));
        b0.b(i5, ProtectedSandApp.s("\uf57a"));
        if (u4Var.W2(e4) != i4) {
            return false;
        }
        u4Var.o0(e4, i5);
        return true;
    }

    @d9.a
    public static <E> u4<E> x(u4<? extends E> u4Var, u4<? extends E> u4Var2) {
        u4Var.getClass();
        u4Var2.getClass();
        return new c(u4Var, u4Var2);
    }

    @d9.a
    public static <E> u4<E> y(u4<? extends E> u4Var, u4<? extends E> u4Var2) {
        u4Var.getClass();
        u4Var2.getClass();
        return new a(u4Var, u4Var2);
    }

    @Deprecated
    public static <E> u4<E> z(m3<E> m3Var) {
        m3Var.getClass();
        return m3Var;
    }
}
