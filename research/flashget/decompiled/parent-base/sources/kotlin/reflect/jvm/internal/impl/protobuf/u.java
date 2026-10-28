package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes7.dex */
public class u extends AbstractList<String> implements RandomAccess, m {

    /* renamed from: b, reason: collision with root package name */
    private final m f77779b;

    /* compiled from: UnmodifiableLazyStringList.java */
    class a implements ListIterator<String> {

        /* renamed from: b, reason: collision with root package name */
        ListIterator<String> f77780b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f77781c;

        a(int i4) {
            this.f77781c = i4;
            this.f77780b = u.this.f77779b.listIterator(i4);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f77780b.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f77780b.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f77780b.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f77780b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f77780b.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f77780b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    class b implements Iterator<String> {

        /* renamed from: b, reason: collision with root package name */
        Iterator<String> f77783b;

        b() {
            this.f77783b = u.this.f77779b.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f77783b.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f77783b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public u(m mVar) {
        this.f77779b = mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public d B(int i4) {
        return this.f77779b.B(i4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public void L1(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public m N() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get(int i4) {
        return this.f77779b.get(i4);
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
        return this.f77779b.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public List<?> y() {
        return this.f77779b.y();
    }
}
