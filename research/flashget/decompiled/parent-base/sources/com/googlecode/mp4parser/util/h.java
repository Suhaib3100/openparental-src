package com.googlecode.mp4parser.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: LazyList.java */
/* loaded from: classes6.dex */
public class h<E> extends AbstractList<E> {

    /* renamed from: d, reason: collision with root package name */
    private static final i f64094d = i.a(h.class);

    /* renamed from: b, reason: collision with root package name */
    List<E> f64095b;

    /* renamed from: c, reason: collision with root package name */
    Iterator<E> f64096c;

    /* compiled from: LazyList.java */
    class a implements Iterator<E> {

        /* renamed from: b, reason: collision with root package name */
        int f64097b = 0;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64097b < h.this.f64095b.size() || h.this.f64096c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f64097b >= h.this.f64095b.size()) {
                h hVar = h.this;
                hVar.f64095b.add(hVar.f64096c.next());
                return (E) next();
            }
            List<E> list = h.this.f64095b;
            int i4 = this.f64097b;
            this.f64097b = i4 + 1;
            return list.get(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public h(List<E> list, Iterator<E> it) {
        this.f64095b = list;
        this.f64096c = it;
    }

    private void b() {
        f64094d.b(ProtectedSandApp.s("ᑋ\u0001"));
        while (this.f64096c.hasNext()) {
            this.f64095b.add(this.f64096c.next());
        }
    }

    public List<E> c() {
        return this.f64095b;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i4) {
        if (this.f64095b.size() > i4) {
            return this.f64095b.get(i4);
        }
        if (!this.f64096c.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f64095b.add(this.f64096c.next());
        return get(i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        f64094d.b(ProtectedSandApp.s("ᑌ\u0001"));
        b();
        return this.f64095b.size();
    }
}
