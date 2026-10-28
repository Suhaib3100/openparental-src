package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: ForwardingCollection.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class q1<E> extends h2 implements Collection<E> {
    protected q1() {
    }

    protected boolean A3(Collection<? extends E> collection) {
        return d4.a(this, collection.iterator());
    }

    protected void E3() {
        d4.h(iterator());
    }

    protected boolean F3(@zc.a Object obj) {
        return d4.q(iterator(), obj);
    }

    protected boolean L3(Collection<?> collection) {
        return c0.b(this, collection);
    }

    protected boolean M3() {
        return !iterator().hasNext();
    }

    protected boolean N3(@zc.a Object obj) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (com.google.common.base.f0.a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    protected boolean O3(Collection<?> collection) {
        return d4.V(iterator(), collection);
    }

    protected boolean P3(Collection<?> collection) {
        return d4.X(iterator(), collection);
    }

    protected Object[] Q3() {
        return toArray(new Object[size()]);
    }

    protected <T> T[] R3(T[] tArr) {
        return (T[]) b5.m(this, tArr);
    }

    protected String S3() {
        return c0.l(this);
    }

    @f9.a
    public boolean add(@f5 E e4) {
        return u3().add(e4);
    }

    @f9.a
    public boolean addAll(Collection<? extends E> collection) {
        return u3().addAll(collection);
    }

    public void clear() {
        u3().clear();
    }

    public boolean contains(@zc.a Object obj) {
        return u3().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return u3().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return u3().isEmpty();
    }

    public Iterator<E> iterator() {
        return u3().iterator();
    }

    @f9.a
    public boolean remove(@zc.a Object obj) {
        return u3().remove(obj);
    }

    @f9.a
    public boolean removeAll(Collection<?> collection) {
        return u3().removeAll(collection);
    }

    @f9.a
    public boolean retainAll(Collection<?> collection) {
        return u3().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return u3().size();
    }

    public Object[] toArray() {
        return u3().toArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.h2
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public abstract Collection<E> u3();

    @f9.a
    public <T> T[] toArray(T[] tArr) {
        return (T[]) u3().toArray(tArr);
    }
}
