package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: CompactHashSet.java */
@w0
@d9.c
/* loaded from: classes6.dex */
class e0<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    @d9.d
    static final double f55665g = 0.001d;

    /* renamed from: h, reason: collision with root package name */
    private static final int f55666h = 9;

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    private transient Object f55667b;

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    private transient int[] f55668c;

    /* renamed from: d, reason: collision with root package name */
    @d9.d
    @zc.a
    transient Object[] f55669d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f55670e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f55671f;

    /* compiled from: CompactHashSet.java */
    class a implements Iterator<E> {

        /* renamed from: b, reason: collision with root package name */
        int f55672b;

        /* renamed from: c, reason: collision with root package name */
        int f55673c;

        /* renamed from: d, reason: collision with root package name */
        int f55674d = -1;

        a() {
            this.f55672b = e0.this.f55670e;
            this.f55673c = e0.this.w();
        }

        private void a() {
            if (e0.this.f55670e != this.f55672b) {
                throw new ConcurrentModificationException();
            }
        }

        void b() {
            this.f55672b += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55673c >= 0;
        }

        @Override // java.util.Iterator
        @f5
        public E next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i4 = this.f55673c;
            this.f55674d = i4;
            E e4 = (E) e0.c(e0.this, i4);
            this.f55673c = e0.this.x(this.f55673c);
            return e4;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            b0.e(this.f55674d >= 0);
            b();
            e0 e0Var = e0.this;
            e0Var.remove(e0.c(e0Var, this.f55674d));
            this.f55673c = e0.this.f(this.f55673c, this.f55674d);
            this.f55674d = -1;
        }
    }

    e0() {
        F(3);
    }

    private int A() {
        return (1 << (this.f55670e & 31)) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void L(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(com.google.android.gms.internal.location.a.a(25, ProtectedSandApp.s("\uf4ab"), readInt));
        }
        F(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            add(objectInputStream.readObject());
        }
    }

    private Object[] O() {
        Object[] objArr = this.f55669d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] P() {
        int[] iArr = this.f55668c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object Q() {
        Object obj = this.f55667b;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void S(int i4) {
        int min;
        int length = P().length;
        if (i4 <= length || (min = Math.min(kotlinx.coroutines.internal.a0.f80730j, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        R(min);
    }

    @f9.a
    private int T(int i4, int i5, int i6, int i7) {
        Object a5 = f0.a(i5);
        int i10 = i5 - 1;
        if (i7 != 0) {
            f0.i(a5, i6 & i10, i7 + 1);
        }
        Object obj = this.f55667b;
        Objects.requireNonNull(obj);
        int[] P = P();
        for (int i11 = 0; i11 <= i4; i11++) {
            int h4 = f0.h(obj, i11);
            while (h4 != 0) {
                int i12 = h4 - 1;
                int i13 = P[i12];
                int i14 = ((~i4) & i13) | i11;
                int i15 = i14 & i10;
                int h5 = f0.h(a5, i15);
                f0.i(a5, i15, h4);
                P[i12] = f0.d(i14, h5, i10);
                h4 = i13 & i4;
            }
        }
        this.f55667b = a5;
        W(i10);
        return i10;
    }

    private void U(int i4, E e4) {
        O()[i4] = e4;
    }

    private void V(int i4, int i5) {
        P()[i4] = i5;
    }

    private void W(int i4) {
        this.f55670e = f0.d(this.f55670e, 32 - Integer.numberOfLeadingZeros(i4), 31);
    }

    private void Z(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    static Object c(e0 e0Var, int i4) {
        return e0Var.O()[i4];
    }

    public static <E> e0<E> j() {
        return new e0<>();
    }

    public static <E> e0<E> l(Collection<? extends E> collection) {
        e0<E> e0Var = new e0<>(collection.size());
        e0Var.addAll(collection);
        return e0Var;
    }

    @SafeVarargs
    public static <E> e0<E> m(E... eArr) {
        e0<E> e0Var = new e0<>(eArr.length);
        Collections.addAll(e0Var, eArr);
        return e0Var;
    }

    private Set<E> p(int i4) {
        return new LinkedHashSet(i4, 1.0f);
    }

    public static <E> e0<E> q(int i4) {
        return new e0<>(i4);
    }

    private E s(int i4) {
        return (E) O()[i4];
    }

    private int v(int i4) {
        return P()[i4];
    }

    void D() {
        this.f55670e += 32;
    }

    void F(int i4) {
        com.google.common.base.l0.e(i4 >= 0, ProtectedSandApp.s("\uf4ac"));
        this.f55670e = com.google.common.primitives.l.g(i4, 1, kotlinx.coroutines.internal.a0.f80730j);
    }

    void G(int i4, @f5 E e4, int i5, int i6) {
        V(i4, f0.d(i5, 0, i6));
        U(i4, e4);
    }

    @d9.d
    boolean H() {
        return r() != null;
    }

    void I(int i4, int i5) {
        Object obj = this.f55667b;
        Objects.requireNonNull(obj);
        int[] P = P();
        Object[] O = O();
        int size = size();
        int i6 = size - 1;
        if (i4 >= i6) {
            O[i4] = null;
            P[i4] = 0;
            return;
        }
        Object obj2 = O[i6];
        O[i4] = obj2;
        O[i6] = null;
        P[i4] = P[i6];
        P[i6] = 0;
        int d5 = x2.d(obj2) & i5;
        int h4 = f0.h(obj, d5);
        if (h4 == size) {
            f0.i(obj, d5, i4 + 1);
            return;
        }
        while (true) {
            int i7 = h4 - 1;
            int i10 = P[i7];
            int i11 = i10 & i5;
            if (i11 == size) {
                P[i7] = f0.d(i10, i4 + 1, i5);
                return;
            }
            h4 = i11;
        }
    }

    @d9.d
    boolean K() {
        return this.f55667b == null;
    }

    void R(int i4) {
        this.f55668c = Arrays.copyOf(P(), i4);
        this.f55669d = Arrays.copyOf(O(), i4);
    }

    public void X() {
        if (K()) {
            return;
        }
        Set<E> r4 = r();
        if (r4 != null) {
            Set<E> p4 = p(size());
            p4.addAll(r4);
            this.f55667b = p4;
            return;
        }
        int i4 = this.f55671f;
        if (i4 < P().length) {
            R(i4);
        }
        int j4 = f0.j(i4);
        int A = A();
        if (j4 < A) {
            T(A, j4, 0, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @f9.a
    public boolean add(@f5 E e4) {
        if (K()) {
            h();
        }
        Set<E> r4 = r();
        if (r4 != null) {
            return r4.add(e4);
        }
        int[] P = P();
        Object[] O = O();
        int i4 = this.f55671f;
        int i5 = i4 + 1;
        int d5 = x2.d(e4);
        int A = A();
        int i6 = d5 & A;
        Object obj = this.f55667b;
        Objects.requireNonNull(obj);
        int h4 = f0.h(obj, i6);
        if (h4 != 0) {
            int i7 = ~A;
            int i10 = d5 & i7;
            int i11 = 0;
            while (true) {
                int i12 = h4 - 1;
                int i13 = P[i12];
                if ((i13 & i7) == i10 && com.google.common.base.f0.a(e4, O[i12])) {
                    return false;
                }
                int i14 = i13 & A;
                i11++;
                if (i14 != 0) {
                    h4 = i14;
                } else {
                    if (i11 >= 9) {
                        return i().add(e4);
                    }
                    if (i5 > A) {
                        A = T(A, f0.e(A), d5, i4);
                    } else {
                        P[i12] = f0.d(i13, i5, A);
                    }
                }
            }
        } else if (i5 > A) {
            A = T(A, f0.e(A), d5, i4);
        } else {
            Object obj2 = this.f55667b;
            Objects.requireNonNull(obj2);
            f0.i(obj2, i6, i5);
        }
        S(i5);
        G(i4, e4, d5, A);
        this.f55671f = i5;
        D();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (K()) {
            return;
        }
        D();
        Set<E> r4 = r();
        if (r4 != null) {
            this.f55670e = com.google.common.primitives.l.g(size(), 3, kotlinx.coroutines.internal.a0.f80730j);
            r4.clear();
            this.f55667b = null;
            this.f55671f = 0;
            return;
        }
        Arrays.fill(O(), 0, this.f55671f, (Object) null);
        Object obj = this.f55667b;
        Objects.requireNonNull(obj);
        f0.g(obj);
        Arrays.fill(P(), 0, this.f55671f, 0);
        this.f55671f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@zc.a Object obj) {
        if (K()) {
            return false;
        }
        Set<E> r4 = r();
        if (r4 != null) {
            return r4.contains(obj);
        }
        int d5 = x2.d(obj);
        int A = A();
        Object obj2 = this.f55667b;
        Objects.requireNonNull(obj2);
        int h4 = f0.h(obj2, d5 & A);
        if (h4 == 0) {
            return false;
        }
        int i4 = ~A;
        int i5 = d5 & i4;
        do {
            int i6 = h4 - 1;
            int i7 = P()[i6];
            if ((i7 & i4) == i5 && com.google.common.base.f0.a(obj, O()[i6])) {
                return true;
            }
            h4 = i7 & A;
        } while (h4 != 0);
        return false;
    }

    int f(int i4, int i5) {
        return i4 - 1;
    }

    @f9.a
    int h() {
        com.google.common.base.l0.h0(K(), ProtectedSandApp.s("\uf4ad"));
        int i4 = this.f55670e;
        int j4 = f0.j(i4);
        this.f55667b = f0.a(j4);
        W(j4 - 1);
        this.f55668c = new int[i4];
        this.f55669d = new Object[i4];
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d9.d
    @f9.a
    Set<E> i() {
        Set<E> p4 = p(A() + 1);
        int w4 = w();
        while (w4 >= 0) {
            p4.add(O()[w4]);
            w4 = x(w4);
        }
        this.f55667b = p4;
        this.f55668c = null;
        this.f55669d = null;
        D();
        return p4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> r4 = r();
        return r4 != null ? r4.iterator() : new a();
    }

    @d9.d
    @zc.a
    Set<E> r() {
        Object obj = this.f55667b;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @f9.a
    public boolean remove(@zc.a Object obj) {
        if (K()) {
            return false;
        }
        Set<E> r4 = r();
        if (r4 != null) {
            return r4.remove(obj);
        }
        int A = A();
        Object obj2 = this.f55667b;
        Objects.requireNonNull(obj2);
        int f4 = f0.f(obj, null, A, obj2, P(), O(), null);
        if (f4 == -1) {
            return false;
        }
        I(f4, A);
        this.f55671f--;
        D();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> r4 = r();
        return r4 != null ? r4.size() : this.f55671f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (K()) {
            return new Object[0];
        }
        Set<E> r4 = r();
        return r4 != null ? r4.toArray() : Arrays.copyOf(O(), this.f55671f);
    }

    int w() {
        return isEmpty() ? -1 : 0;
    }

    int x(int i4) {
        int i5 = i4 + 1;
        if (i5 < this.f55671f) {
            return i5;
        }
        return -1;
    }

    e0(int i4) {
        F(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @f9.a
    public <T> T[] toArray(T[] tArr) {
        if (K()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> r4 = r();
        if (r4 != null) {
            return (T[]) r4.toArray(tArr);
        }
        return (T[]) b5.n(O(), 0, this.f55671f, tArr);
    }
}
