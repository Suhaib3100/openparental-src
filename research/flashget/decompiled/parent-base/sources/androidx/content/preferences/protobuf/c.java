package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.p1;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: AbstractProtobufList.java */
/* loaded from: classes3.dex */
abstract class c<E> extends AbstractList<E> implements p1.k<E> {

    /* renamed from: c, reason: collision with root package name */
    protected static final int f28645c = 10;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28646b = true;

    c() {
    }

    @Override // androidx.datastore.preferences.protobuf.p1.k
    public boolean S1() {
        return this.f28646b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e4) {
        b();
        return super.add(e4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        b();
        return super.addAll(collection);
    }

    protected void b() {
        if (!this.f28646b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1.k
    public final void c0() {
        this.f28646b = false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (!get(i4).equals(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = (i4 * 31) + get(i5).hashCode();
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i4) {
        b();
        return (E) super.remove(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        b();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i4, E e4) {
        b();
        return (E) super.set(i4, e4);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i4, E e4) {
        b();
        super.add(i4, e4);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i4, Collection<? extends E> collection) {
        b();
        return super.addAll(i4, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        return super.remove(obj);
    }
}
