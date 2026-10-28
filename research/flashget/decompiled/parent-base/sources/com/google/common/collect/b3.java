package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.f3;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ImmutableCollection.java */
@w0
@d9.b(emulated = true)
@f9.f("Use ImmutableList.of or another implementation")
/* loaded from: classes6.dex */
public abstract class b3<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final Object[] f55377b = new Object[0];

    /* compiled from: ImmutableCollection.java */
    static abstract class a<E> extends b<E> {

        /* renamed from: b, reason: collision with root package name */
        Object[] f55378b;

        /* renamed from: c, reason: collision with root package name */
        int f55379c;

        /* renamed from: d, reason: collision with root package name */
        boolean f55380d;

        a(int i4) {
            b0.b(i4, ProtectedSandApp.s("\uf45b"));
            this.f55378b = new Object[i4];
            this.f55379c = 0;
        }

        private void i(int i4) {
            Object[] objArr = this.f55378b;
            if (objArr.length < i4) {
                this.f55378b = Arrays.copyOf(objArr, b.f(objArr.length, i4));
                this.f55380d = false;
            } else if (this.f55380d) {
                this.f55378b = (Object[]) objArr.clone();
                this.f55380d = false;
            }
        }

        @Override // com.google.common.collect.b3.b
        @f9.a
        public b<E> b(E... eArr) {
            h(eArr, eArr.length);
            return this;
        }

        @Override // com.google.common.collect.b3.b
        @f9.a
        public b<E> c(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                i(collection.size() + this.f55379c);
                if (collection instanceof b3) {
                    this.f55379c = ((b3) collection).c(this.f55378b, this.f55379c);
                    return this;
                }
            }
            super.c(iterable);
            return this;
        }

        @Override // com.google.common.collect.b3.b
        @f9.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e4) {
            e4.getClass();
            i(this.f55379c + 1);
            Object[] objArr = this.f55378b;
            int i4 = this.f55379c;
            this.f55379c = i4 + 1;
            objArr[i4] = e4;
            return this;
        }

        final void h(Object[] objArr, int i4) {
            b5.c(objArr, i4);
            i(this.f55379c + i4);
            System.arraycopy(objArr, 0, this.f55378b, this.f55379c, i4);
            this.f55379c += i4;
        }
    }

    /* compiled from: ImmutableCollection.java */
    @f9.f
    public static abstract class b<E> {

        /* renamed from: a, reason: collision with root package name */
        static final int f55381a = 4;

        b() {
        }

        static int f(int i4, int i5) {
            if (i5 < 0) {
                throw new AssertionError(ProtectedSandApp.s("\uf45a"));
            }
            int i6 = i4 + (i4 >> 1) + 1;
            if (i6 < i5) {
                i6 = Integer.highestOneBit(i5 - 1) << 1;
            }
            if (i6 < 0) {
                return Integer.MAX_VALUE;
            }
            return i6;
        }

        @f9.a
        public abstract b<E> a(E e4);

        @f9.a
        public b<E> b(E... eArr) {
            for (E e4 : eArr) {
                a(e4);
            }
            return this;
        }

        @f9.a
        public b<E> c(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        @f9.a
        public b<E> d(Iterator<? extends E> it) {
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public abstract b3<E> e();
    }

    b3() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public f3<E> b() {
        return isEmpty() ? f3.H() : f3.p(toArray(f55377b));
    }

    @f9.a
    int c(Object[] objArr, int i4) {
        e7<E> it = iterator();
        while (it.hasNext()) {
            objArr[i4] = it.next();
            i4++;
        }
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@zc.a Object obj);

    @zc.a
    Object[] f() {
        return null;
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    int i() {
        throw new UnsupportedOperationException();
    }

    abstract boolean j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public abstract e7<E> iterator();

    Object m() {
        return new f3.d(toArray(f55377b));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@zc.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f55377b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @f9.a
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] f4 = f();
            if (f4 != null) {
                return (T[]) h5.b(f4, i(), h(), tArr);
            }
            tArr = (T[]) h5.c(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        c(tArr, 0);
        return tArr;
    }
}
