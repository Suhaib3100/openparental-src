package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes6.dex */
public class u extends AbstractList<String> implements RandomAccess, m {

    /* renamed from: o, reason: collision with root package name */
    private final m f25797o;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes5.dex */
    class a implements ListIterator<String> {

        /* renamed from: o, reason: collision with root package name */
        ListIterator<String> f25798o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f25799p;

        a(int i5) {
            this.f25799p = i5;
            this.f25798o = u.this.f25797o.listIterator(i5);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f25798o.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f25798o.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f25798o.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f25798o.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f25798o.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f25798o.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes5.dex */
    class b implements Iterator<String> {

        /* renamed from: o, reason: collision with root package name */
        Iterator<String> f25801o;

        b() {
            this.f25801o = u.this.f25797o.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f25801o.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25801o.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public u(m mVar) {
        this.f25797o = mVar;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i5) {
        return this.f25797o.get(i5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public void i1(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public List<?> j() {
        return this.f25797o.j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public d k(int i5) {
        return this.f25797o.k(i5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public m l() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i5) {
        return new a(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f25797o.size();
    }
}
