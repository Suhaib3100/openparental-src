package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d6;
import com.google.common.collect.t4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: LinkedListMultimap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public class j4<K, V> extends com.google.common.collect.h<K, V> implements k4<K, V>, Serializable {

    /* renamed from: l, reason: collision with root package name */
    @d9.c
    private static final long f55832l = 0;

    /* renamed from: g, reason: collision with root package name */
    @zc.a
    private transient g<K, V> f55833g;

    /* renamed from: h, reason: collision with root package name */
    @zc.a
    private transient g<K, V> f55834h;

    /* renamed from: i, reason: collision with root package name */
    private transient Map<K, f<K, V>> f55835i;

    /* renamed from: j, reason: collision with root package name */
    private transient int f55836j;

    /* renamed from: k, reason: collision with root package name */
    private transient int f55837k;

    /* compiled from: LinkedListMultimap.java */
    class a extends AbstractSequentialList<V> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f55838b;

        a(Object obj) {
            this.f55838b = obj;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i4) {
            return new i(this.f55838b, i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            f fVar = (f) j4.this.f55835i.get(this.f55838b);
            if (fVar == null) {
                return 0;
            }
            return fVar.f55851c;
        }
    }

    /* compiled from: LinkedListMultimap.java */
    class b extends AbstractSequentialList<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Map.Entry<K, V>> listIterator(int i4) {
            return new h(i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return j4.this.f55836j;
        }
    }

    /* compiled from: LinkedListMultimap.java */
    class c extends d6.k<K> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return j4.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new e(j4.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            return !j4.this.b(obj).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j4.this.f55835i.size();
        }
    }

    /* compiled from: LinkedListMultimap.java */
    class d extends AbstractSequentialList<V> {

        /* compiled from: LinkedListMultimap.java */
        class a extends w6<Map.Entry<K, V>, V> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f55843c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, ListIterator listIterator, h hVar) {
                super((Iterator) listIterator);
                this.f55843c = hVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.v6
            @f5
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public V a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }

            @Override // com.google.common.collect.w6, java.util.ListIterator
            public void set(@f5 V v4) {
                this.f55843c.f(v4);
            }
        }

        d() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i4) {
            h hVar = new h(i4);
            return new a(this, hVar, hVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return j4.this.f55836j;
        }
    }

    /* compiled from: LinkedListMultimap.java */
    private static class f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        g<K, V> f55849a;

        /* renamed from: b, reason: collision with root package name */
        g<K, V> f55850b;

        /* renamed from: c, reason: collision with root package name */
        int f55851c;

        f(g<K, V> gVar) {
            this.f55849a = gVar;
            this.f55850b = gVar;
            gVar.f55857g = null;
            gVar.f55856f = null;
            this.f55851c = 1;
        }
    }

    /* compiled from: LinkedListMultimap.java */
    private static final class g<K, V> extends com.google.common.collect.g<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @f5
        final K f55852b;

        /* renamed from: c, reason: collision with root package name */
        @f5
        V f55853c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        g<K, V> f55854d;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        g<K, V> f55855e;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        g<K, V> f55856f;

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        g<K, V> f55857g;

        g(@f5 K k4, @f5 V v4) {
            this.f55852b = k4;
            this.f55853c = v4;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public K getKey() {
            return this.f55852b;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public V getValue() {
            return this.f55853c;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public V setValue(@f5 V v4) {
            V v5 = this.f55853c;
            this.f55853c = v4;
            return v5;
        }
    }

    /* compiled from: LinkedListMultimap.java */
    private class h implements ListIterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        int f55858b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        g<K, V> f55859c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        g<K, V> f55860d;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        g<K, V> f55861e;

        /* renamed from: f, reason: collision with root package name */
        int f55862f;

        h(int i4) {
            this.f55862f = j4.this.f55837k;
            int size = j4.this.size();
            com.google.common.base.l0.d0(i4, size);
            if (i4 < size / 2) {
                this.f55859c = j4.this.f55833g;
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0) {
                        break;
                    }
                    next();
                    i4 = i5;
                }
            } else {
                this.f55861e = j4.this.f55834h;
                this.f55858b = size;
                while (true) {
                    int i6 = i4 + 1;
                    if (i4 >= size) {
                        break;
                    }
                    previous();
                    i4 = i6;
                }
            }
            this.f55860d = null;
        }

        private void b() {
            if (j4.this.f55837k != this.f55862f) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @f9.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g<K, V> next() {
            b();
            g<K, V> gVar = this.f55859c;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f55860d = gVar;
            this.f55861e = gVar;
            this.f55859c = gVar.f55854d;
            this.f55858b++;
            return gVar;
        }

        @Override // java.util.ListIterator
        @f9.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public g<K, V> previous() {
            b();
            g<K, V> gVar = this.f55861e;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f55860d = gVar;
            this.f55859c = gVar;
            this.f55861e = gVar.f55855e;
            this.f55858b--;
            return gVar;
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        void f(@f5 V v4) {
            com.google.common.base.l0.g0(this.f55860d != null);
            this.f55860d.f55853c = v4;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f55859c != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            b();
            return this.f55861e != null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f55858b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f55858b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            com.google.common.base.l0.h0(this.f55860d != null, ProtectedSandApp.s("\uf4e0"));
            g<K, V> gVar = this.f55860d;
            if (gVar != this.f55859c) {
                this.f55861e = gVar.f55855e;
                this.f55858b--;
            } else {
                this.f55859c = gVar.f55854d;
            }
            j4.this.E(gVar);
            this.f55860d = null;
            this.f55862f = j4.this.f55837k;
        }
    }

    j4() {
        this(12);
    }

    private List<V> B(@f5 K k4) {
        return Collections.unmodifiableList(l4.s(new i(k4)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d9.c
    private void C(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f55835i = g0.h0();
        int readInt = objectInputStream.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(@f5 K k4) {
        d4.h(new i(k4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f55855e;
        if (gVar2 != null) {
            gVar2.f55854d = gVar.f55854d;
        } else {
            this.f55833g = gVar.f55854d;
        }
        g<K, V> gVar3 = gVar.f55854d;
        if (gVar3 != null) {
            gVar3.f55855e = gVar2;
        } else {
            this.f55834h = gVar2;
        }
        if (gVar.f55857g == null && gVar.f55856f == null) {
            f<K, V> remove = this.f55835i.remove(gVar.f55852b);
            Objects.requireNonNull(remove);
            remove.f55851c = 0;
            this.f55837k++;
        } else {
            f<K, V> fVar = this.f55835i.get(gVar.f55852b);
            Objects.requireNonNull(fVar);
            fVar.f55851c--;
            g<K, V> gVar4 = gVar.f55857g;
            if (gVar4 == null) {
                g<K, V> gVar5 = gVar.f55856f;
                Objects.requireNonNull(gVar5);
                fVar.f55849a = gVar5;
            } else {
                gVar4.f55856f = gVar.f55856f;
            }
            g<K, V> gVar6 = gVar.f55856f;
            if (gVar6 == null) {
                g<K, V> gVar7 = gVar.f55857g;
                Objects.requireNonNull(gVar7);
                fVar.f55850b = gVar7;
            } else {
                gVar6.f55857g = gVar.f55857g;
            }
        }
        this.f55836j--;
    }

    @d9.c
    private void G(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : t()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @f9.a
    public g<K, V> u(@f5 K k4, @f5 V v4, @zc.a g<K, V> gVar) {
        g<K, V> gVar2 = new g<>(k4, v4);
        if (this.f55833g == null) {
            this.f55834h = gVar2;
            this.f55833g = gVar2;
            this.f55835i.put(k4, new f<>(gVar2));
            this.f55837k++;
        } else if (gVar == null) {
            g<K, V> gVar3 = this.f55834h;
            Objects.requireNonNull(gVar3);
            gVar3.f55854d = gVar2;
            gVar2.f55855e = this.f55834h;
            this.f55834h = gVar2;
            f<K, V> fVar = this.f55835i.get(k4);
            if (fVar == null) {
                this.f55835i.put(k4, new f<>(gVar2));
                this.f55837k++;
            } else {
                fVar.f55851c++;
                g<K, V> gVar4 = fVar.f55850b;
                gVar4.f55856f = gVar2;
                gVar2.f55857g = gVar4;
                fVar.f55850b = gVar2;
            }
        } else {
            f<K, V> fVar2 = this.f55835i.get(k4);
            Objects.requireNonNull(fVar2);
            fVar2.f55851c++;
            gVar2.f55855e = gVar.f55855e;
            gVar2.f55857g = gVar.f55857g;
            gVar2.f55854d = gVar;
            gVar2.f55856f = gVar;
            g<K, V> gVar5 = gVar.f55857g;
            if (gVar5 == null) {
                fVar2.f55849a = gVar2;
            } else {
                gVar5.f55856f = gVar2;
            }
            g<K, V> gVar6 = gVar.f55855e;
            if (gVar6 == null) {
                this.f55833g = gVar2;
            } else {
                gVar6.f55854d = gVar2;
            }
            gVar.f55855e = gVar2;
            gVar.f55857g = gVar2;
        }
        this.f55836j++;
        return gVar2;
    }

    public static <K, V> j4<K, V> v() {
        return new j4<>();
    }

    public static <K, V> j4<K, V> w(int i4) {
        return new j4<>(i4);
    }

    public static <K, V> j4<K, V> x(r4<? extends K, ? extends V> r4Var) {
        return new j4<>(r4Var);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public List<Map.Entry<K, V>> t() {
        return (List) super.t();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public List<V> values() {
        return (List) super.values();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean T2(@zc.a Object obj, @zc.a Object obj2) {
        return super.T2(obj, obj2);
    }

    @Override // com.google.common.collect.h
    Map<K, Collection<V>> a() {
        return new t4.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ Collection c(@f5 Object obj, Iterable iterable) {
        return c((j4<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.r4
    public void clear() {
        this.f55833g = null;
        this.f55834h = null;
        this.f55835i.clear();
        this.f55836j = 0;
        this.f55837k++;
    }

    @Override // com.google.common.collect.r4
    public boolean containsKey(@zc.a Object obj) {
        return this.f55835i.containsKey(obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public boolean containsValue(@zc.a Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.h
    Set<K> e() {
        return new c();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public boolean equals(@zc.a Object obj) {
        return t4.g(this, obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ Map f() {
        return super.f();
    }

    @Override // com.google.common.collect.h
    u4<K> g() {
        return new t4.g(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public /* bridge */ /* synthetic */ Collection v(@f5 Object obj) {
        return v((j4<K, V>) obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public boolean isEmpty() {
        return this.f55833g == null;
    }

    @Override // com.google.common.collect.h
    Iterator<Map.Entry<K, V>> j() {
        throw new AssertionError(ProtectedSandApp.s("\uf4e2"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public /* bridge */ /* synthetic */ boolean k1(@f5 Object obj, Iterable iterable) {
        return super.k1(obj, iterable);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ u4 keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public /* bridge */ /* synthetic */ boolean n0(r4 r4Var) {
        return super.n0(r4Var);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public boolean put(@f5 K k4, @f5 V v4) {
        u(k4, v4, null);
        return true;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public /* bridge */ /* synthetic */ boolean remove(@zc.a Object obj, @zc.a Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.r4
    public int size() {
        return this.f55836j;
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public List<Map.Entry<K, V>> d() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public List<V> i() {
        return new d();
    }

    private j4(int i4) {
        this.f55835i = d0.z(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public List<V> b(Object obj) {
        List<V> B = B(obj);
        D(obj);
        return B;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public List<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        List<V> B = B(k4);
        i iVar = new i(k4);
        Iterator<? extends V> it = iterable.iterator();
        while (iVar.hasNext() && it.hasNext()) {
            iVar.next();
            iVar.set(it.next());
        }
        while (iVar.hasNext()) {
            iVar.next();
            iVar.remove();
        }
        while (it.hasNext()) {
            iVar.add(it.next());
        }
        return B;
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public List<V> v(@f5 K k4) {
        return new a(k4);
    }

    /* compiled from: LinkedListMultimap.java */
    private class e implements Iterator<K> {

        /* renamed from: b, reason: collision with root package name */
        final Set<K> f55844b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        g<K, V> f55845c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        g<K, V> f55846d;

        /* renamed from: e, reason: collision with root package name */
        int f55847e;

        private e() {
            this.f55844b = d6.y(j4.this.keySet().size());
            this.f55845c = j4.this.f55833g;
            this.f55847e = j4.this.f55837k;
        }

        private void a() {
            if (j4.this.f55837k != this.f55847e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f55845c != null;
        }

        @Override // java.util.Iterator
        @f5
        public K next() {
            g<K, V> gVar;
            a();
            g<K, V> gVar2 = this.f55845c;
            if (gVar2 == null) {
                throw new NoSuchElementException();
            }
            this.f55846d = gVar2;
            this.f55844b.add(gVar2.f55852b);
            do {
                gVar = this.f55845c.f55854d;
                this.f55845c = gVar;
                if (gVar == null) {
                    break;
                }
            } while (!this.f55844b.add(gVar.f55852b));
            return this.f55846d.f55852b;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            com.google.common.base.l0.h0(this.f55846d != null, ProtectedSandApp.s("\uf4df"));
            j4.this.D(this.f55846d.f55852b);
            this.f55846d = null;
            this.f55847e = j4.this.f55837k;
        }

        /* synthetic */ e(j4 j4Var, a aVar) {
            this();
        }
    }

    /* compiled from: LinkedListMultimap.java */
    private class i implements ListIterator<V> {

        /* renamed from: b, reason: collision with root package name */
        @f5
        final K f55864b;

        /* renamed from: c, reason: collision with root package name */
        int f55865c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        g<K, V> f55866d;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        g<K, V> f55867e;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        g<K, V> f55868f;

        i(@f5 K k4) {
            this.f55864b = k4;
            f fVar = (f) j4.this.f55835i.get(k4);
            this.f55866d = fVar == null ? null : fVar.f55849a;
        }

        @Override // java.util.ListIterator
        public void add(@f5 V v4) {
            this.f55868f = j4.this.u(this.f55864b, v4, this.f55866d);
            this.f55865c++;
            this.f55867e = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f55866d != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f55868f != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @f5
        @f9.a
        public V next() {
            g<K, V> gVar = this.f55866d;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f55867e = gVar;
            this.f55868f = gVar;
            this.f55866d = gVar.f55856f;
            this.f55865c++;
            return gVar.f55853c;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f55865c;
        }

        @Override // java.util.ListIterator
        @f5
        @f9.a
        public V previous() {
            g<K, V> gVar = this.f55868f;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f55867e = gVar;
            this.f55866d = gVar;
            this.f55868f = gVar.f55857g;
            this.f55865c--;
            return gVar.f55853c;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f55865c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            com.google.common.base.l0.h0(this.f55867e != null, ProtectedSandApp.s("\uf4e1"));
            g<K, V> gVar = this.f55867e;
            if (gVar != this.f55866d) {
                this.f55868f = gVar.f55857g;
                this.f55865c--;
            } else {
                this.f55866d = gVar.f55856f;
            }
            j4.this.E(gVar);
            this.f55867e = null;
        }

        @Override // java.util.ListIterator
        public void set(@f5 V v4) {
            com.google.common.base.l0.g0(this.f55867e != null);
            this.f55867e.f55853c = v4;
        }

        public i(@f5 K k4, int i4) {
            f fVar = (f) j4.this.f55835i.get(k4);
            int i5 = fVar == null ? 0 : fVar.f55851c;
            com.google.common.base.l0.d0(i4, i5);
            if (i4 >= i5 / 2) {
                this.f55868f = fVar == null ? null : fVar.f55850b;
                this.f55865c = i5;
                while (true) {
                    int i6 = i4 + 1;
                    if (i4 >= i5) {
                        break;
                    }
                    previous();
                    i4 = i6;
                }
            } else {
                this.f55866d = fVar == null ? null : fVar.f55849a;
                while (true) {
                    int i7 = i4 - 1;
                    if (i4 <= 0) {
                        break;
                    }
                    next();
                    i4 = i7;
                }
            }
            this.f55864b = k4;
            this.f55867e = null;
        }
    }

    private j4(r4<? extends K, ? extends V> r4Var) {
        this(r4Var.keySet().size());
        n0(r4Var);
    }
}
