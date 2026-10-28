package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.u4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractMapBasedMultiset.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
abstract class f<E> extends i<E> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    @d9.c
    private static final long f55692f = 0;

    /* renamed from: d, reason: collision with root package name */
    transient c5<E> f55693d;

    /* renamed from: e, reason: collision with root package name */
    transient long f55694e;

    /* compiled from: AbstractMapBasedMultiset.java */
    class a extends f<E>.c<E> {
        a() {
            super();
        }

        @Override // com.google.common.collect.f.c
        @f5
        E b(int i4) {
            return f.this.f55693d.j(i4);
        }
    }

    /* compiled from: AbstractMapBasedMultiset.java */
    class b extends f<E>.c<u4.a<E>> {
        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.f.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public u4.a<E> b(int i4) {
            return f.this.f55693d.h(i4);
        }
    }

    /* compiled from: AbstractMapBasedMultiset.java */
    abstract class c<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        int f55697b;

        /* renamed from: c, reason: collision with root package name */
        int f55698c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f55699d;

        c() {
            this.f55697b = f.this.f55693d.f();
            this.f55699d = f.this.f55693d.f55465d;
        }

        private void a() {
            if (f.this.f55693d.f55465d != this.f55699d) {
                throw new ConcurrentModificationException();
            }
        }

        @f5
        abstract T b(int i4);

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f55697b >= 0;
        }

        @Override // java.util.Iterator
        @f5
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T b5 = b(this.f55697b);
            int i4 = this.f55697b;
            this.f55698c = i4;
            this.f55697b = f.this.f55693d.t(i4);
            return b5;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            b0.e(this.f55698c != -1);
            f.this.f55694e -= r0.f55693d.y(this.f55698c);
            this.f55697b = f.this.f55693d.u(this.f55697b, this.f55698c);
            this.f55698c = -1;
            this.f55699d = f.this.f55693d.f55465d;
        }
    }

    f(int i4) {
        this.f55693d = l(i4);
    }

    @d9.c
    private void m(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.f55693d = l(3);
        b6.g(this, objectInputStream, readInt);
    }

    @d9.c
    private void p(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        b6.k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public final int W1(@zc.a Object obj, int i4) {
        if (i4 == 0) {
            return this.f55693d.g(obj);
        }
        com.google.common.base.l0.k(i4 > 0, ProtectedSandApp.s("\uf4c1"), i4);
        int n4 = this.f55693d.n(obj);
        if (n4 == -1) {
            return 0;
        }
        int l4 = this.f55693d.l(n4);
        if (l4 > i4) {
            this.f55693d.C(n4, l4 - i4);
        } else {
            this.f55693d.y(n4);
            i4 = l4;
        }
        this.f55694e -= i4;
        return l4;
    }

    @Override // com.google.common.collect.u4
    public final int W2(@zc.a Object obj) {
        return this.f55693d.g(obj);
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f55693d.a();
        this.f55694e = 0L;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public final int d2(@f5 E e4, int i4) {
        if (i4 == 0) {
            return this.f55693d.g(e4);
        }
        com.google.common.base.l0.k(i4 > 0, ProtectedSandApp.s("\uf4c1"), i4);
        int n4 = this.f55693d.n(e4);
        if (n4 == -1) {
            this.f55693d.v(e4, i4);
            this.f55694e += i4;
            return 0;
        }
        int l4 = this.f55693d.l(n4);
        long j4 = i4;
        long j5 = l4 + j4;
        com.google.common.base.l0.p(j5 <= 2147483647L, ProtectedSandApp.s("\uf4c2"), j5);
        this.f55693d.C(n4, (int) j5);
        this.f55694e += j4;
        return l4;
    }

    @Override // com.google.common.collect.i
    final int f() {
        return this.f55693d.D();
    }

    @Override // com.google.common.collect.i
    final Iterator<E> h() {
        return new a();
    }

    @Override // com.google.common.collect.i
    final Iterator<u4.a<E>> i() {
        return new b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.g6
    public final Iterator<E> iterator() {
        return v4.n(this);
    }

    void j(u4<? super E> u4Var) {
        u4Var.getClass();
        int f4 = this.f55693d.f();
        while (f4 >= 0) {
            u4Var.d2(this.f55693d.j(f4), this.f55693d.l(f4));
            f4 = this.f55693d.t(f4);
        }
    }

    abstract c5<E> l(int i4);

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public final int o0(@f5 E e4, int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf4c3"));
        c5<E> c5Var = this.f55693d;
        int w4 = i4 == 0 ? c5Var.w(e4) : c5Var.v(e4, i4);
        this.f55694e += i4 - w4;
        return w4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    public final int size() {
        return com.google.common.primitives.l.x(this.f55694e);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    public final boolean x2(@f5 E e4, int i4, int i5) {
        b0.b(i4, ProtectedSandApp.s("\uf4c4"));
        b0.b(i5, ProtectedSandApp.s("\uf4c5"));
        int n4 = this.f55693d.n(e4);
        if (n4 == -1) {
            if (i4 != 0) {
                return false;
            }
            if (i5 > 0) {
                this.f55693d.v(e4, i5);
                this.f55694e += i5;
            }
            return true;
        }
        if (this.f55693d.l(n4) != i4) {
            return false;
        }
        if (i5 == 0) {
            this.f55693d.y(n4);
            this.f55694e -= i4;
        } else {
            this.f55693d.C(n4, i5);
            this.f55694e += i5 - i4;
        }
        return true;
    }
}
