package android.content.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes3.dex */
public class l4 extends AbstractList<String> implements u1, RandomAccess {

    /* renamed from: o, reason: collision with root package name */
    private final u1 f7332o;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes.dex */
    class a implements ListIterator<String> {

        /* renamed from: o, reason: collision with root package name */
        ListIterator<String> f7333o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f7334p;

        a(int i5) {
            this.f7334p = i5;
            this.f7333o = l4.this.f7332o.listIterator(i5);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f7333o.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f7333o.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f7333o.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f7333o.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f7333o.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f7333o.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes.dex */
    class b implements Iterator<String> {

        /* renamed from: o, reason: collision with root package name */
        Iterator<String> f7336o;

        b() {
            this.f7336o = l4.this.f7332o.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f7336o.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7336o.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public l4(u1 u1Var) {
        this.f7332o = u1Var;
    }

    @Override // android.content.preferences.protobuf.u1
    public void B0(u1 u1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.preferences.protobuf.u1
    public void F(w wVar) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.preferences.protobuf.u1
    public byte[] G(int i5) {
        return this.f7332o.G(i5);
    }

    @Override // android.content.preferences.protobuf.f3
    public List<w> R0() {
        return Collections.unmodifiableList(this.f7332o.R0());
    }

    @Override // android.content.preferences.protobuf.u1
    public void b0(int i5, w wVar) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.preferences.protobuf.u1
    public Object b1(int i5) {
        return this.f7332o.b1(i5);
    }

    @Override // android.content.preferences.protobuf.u1
    public void d(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.preferences.protobuf.u1
    public boolean d0(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i5) {
        return this.f7332o.get(i5);
    }

    @Override // android.content.preferences.protobuf.u1
    public void g0(int i5, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // android.content.preferences.protobuf.u1
    public List<?> j() {
        return this.f7332o.j();
    }

    @Override // android.content.preferences.protobuf.u1
    public w k(int i5) {
        return this.f7332o.k(i5);
    }

    @Override // android.content.preferences.protobuf.u1
    public List<byte[]> k0() {
        return Collections.unmodifiableList(this.f7332o.k0());
    }

    @Override // android.content.preferences.protobuf.u1
    public u1 l() {
        return this;
    }

    @Override // android.content.preferences.protobuf.u1
    public boolean l0(Collection<? extends w> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i5) {
        return new a(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7332o.size();
    }
}
