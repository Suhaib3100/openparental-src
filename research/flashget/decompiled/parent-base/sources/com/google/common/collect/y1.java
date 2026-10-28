package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: ForwardingList.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class y1<E> extends q1<E> implements List<E> {
    protected y1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.q1
    /* renamed from: T3, reason: merged with bridge method [inline-methods] */
    public abstract List<E> u3();

    protected boolean U3(@f5 E e4) {
        add(size(), e4);
        return true;
    }

    protected boolean V3(int i4, Iterable<? extends E> iterable) {
        return l4.a(this, i4, iterable);
    }

    @d9.a
    protected boolean W3(@zc.a Object obj) {
        return l4.j(this, obj);
    }

    @d9.a
    protected int X3() {
        return l4.k(this);
    }

    protected int Y3(@zc.a Object obj) {
        return l4.l(this, obj);
    }

    protected Iterator<E> Z3() {
        return listIterator();
    }

    protected int a4(@zc.a Object obj) {
        return l4.n(this, obj);
    }

    public void add(int i4, @f5 E e4) {
        u3().add(i4, e4);
    }

    @f9.a
    public boolean addAll(int i4, Collection<? extends E> collection) {
        return u3().addAll(i4, collection);
    }

    protected ListIterator<E> b4() {
        return listIterator(0);
    }

    @d9.a
    protected ListIterator<E> c4(int i4) {
        return l4.p(this, i4);
    }

    @d9.a
    protected List<E> d4(int i4, int i5) {
        return l4.C(this, i4, i5);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@zc.a Object obj) {
        return obj == this || u3().equals(obj);
    }

    @Override // java.util.List
    @f5
    public E get(int i4) {
        return u3().get(i4);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return u3().hashCode();
    }

    @Override // java.util.List
    public int indexOf(@zc.a Object obj) {
        return u3().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@zc.a Object obj) {
        return u3().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return u3().listIterator();
    }

    @Override // java.util.List
    @f5
    @f9.a
    public E remove(int i4) {
        return u3().remove(i4);
    }

    @Override // java.util.List
    @f5
    @f9.a
    public E set(int i4, @f5 E e4) {
        return u3().set(i4, e4);
    }

    @Override // java.util.List
    public List<E> subList(int i4, int i5) {
        return u3().subList(i4, i5);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i4) {
        return u3().listIterator(i4);
    }
}
