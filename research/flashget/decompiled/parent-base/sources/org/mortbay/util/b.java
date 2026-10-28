package org.mortbay.util;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: SingletonList.java */
/* loaded from: classes9.dex */
public class b extends AbstractList {

    /* renamed from: b, reason: collision with root package name */
    private Object f87583b;

    /* compiled from: SingletonList.java */
    private class a implements ListIterator {

        /* renamed from: b, reason: collision with root package name */
        int f87584b;

        a() {
            this.f87584b = 0;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("SingletonList.add()");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f87584b == 0;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f87584b == 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            int i4 = this.f87584b;
            if (i4 != 0) {
                throw new NoSuchElementException();
            }
            this.f87584b = i4 + 1;
            return b.this.f87583b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f87584b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i4 = this.f87584b;
            if (i4 != 1) {
                throw new NoSuchElementException();
            }
            this.f87584b = i4 - 1;
            return b.this.f87583b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f87584b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("SingletonList.remove()");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("SingletonList.add()");
        }

        a(int i4) {
            if (i4 < 0 || i4 > 1) {
                throw new IndexOutOfBoundsException(android.support.v4.media.a.a("index ", i4));
            }
            this.f87584b = i4;
        }
    }

    private b(Object obj) {
        this.f87583b = obj;
    }

    public static b c(Object obj) {
        return new b(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i4) {
        if (i4 == 0) {
            return this.f87583b;
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.a("index ", i4));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i4) {
        return new a(i4);
    }
}
