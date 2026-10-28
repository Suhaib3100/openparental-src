package androidx.content.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes3.dex */
public class o4 extends AbstractList<String> implements v1, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private final v1 f28840b;

    /* compiled from: UnmodifiableLazyStringList.java */
    class a implements ListIterator<String> {

        /* renamed from: b, reason: collision with root package name */
        ListIterator<String> f28841b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28842c;

        a(int i4) {
            this.f28842c = i4;
            this.f28841b = o4.this.f28840b.listIterator(i4);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f28841b.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f28841b.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f28841b.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f28841b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f28841b.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f28841b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    class b implements Iterator<String> {

        /* renamed from: b, reason: collision with root package name */
        Iterator<String> f28844b;

        b() {
            this.f28844b = o4.this.f28840b.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f28844b.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28844b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o4(v1 v1Var) {
        this.f28840b = v1Var;
    }

    @Override // androidx.content.preferences.protobuf.v1
    public byte[] A0(int i4) {
        return this.f28840b.A0(i4);
    }

    @Override // androidx.content.preferences.protobuf.v1
    public w B(int i4) {
        return this.f28840b.B(i4);
    }

    @Override // androidx.content.preferences.protobuf.v1
    public void C0(int i4, w wVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.v1
    public Object D3(int i4) {
        return this.f28840b.D3(i4);
    }

    @Override // androidx.content.preferences.protobuf.v1
    public void G2(int i4, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.v1
    public boolean H0(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.v1
    public v1 N() {
        return this;
    }

    @Override // androidx.content.preferences.protobuf.v1
    public boolean R2(Collection<? extends w> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.v1
    public List<byte[]> S0() {
        return Collections.unmodifiableList(this.f28840b.S0());
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get(int i4) {
        return this.f28840b.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.v1
    public void g1(v1 v1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i4) {
        return new a(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28840b.size();
    }

    @Override // androidx.content.preferences.protobuf.i3
    public List<w> t1() {
        return Collections.unmodifiableList(this.f28840b.t1());
    }

    @Override // androidx.content.preferences.protobuf.v1
    public void u(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.v1
    public void w2(w wVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.v1
    public List<?> y() {
        return this.f28840b.y();
    }
}
