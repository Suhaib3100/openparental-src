package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: EnumMultiset.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class c1<E extends Enum<E>> extends i<E> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    @d9.c
    private static final long f55421i = 0;

    /* renamed from: d, reason: collision with root package name */
    private transient Class<E> f55422d;

    /* renamed from: e, reason: collision with root package name */
    private transient E[] f55423e;

    /* renamed from: f, reason: collision with root package name */
    private transient int[] f55424f;

    /* renamed from: g, reason: collision with root package name */
    private transient int f55425g;

    /* renamed from: h, reason: collision with root package name */
    private transient long f55426h;

    /* compiled from: EnumMultiset.java */
    class a extends c1<E>.c<E> {
        a() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.c1.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(int i4) {
            return (E) c1.this.f55423e[i4];
        }
    }

    /* compiled from: EnumMultiset.java */
    class b extends c1<E>.c<u4.a<E>> {

        /* compiled from: EnumMultiset.java */
        class a extends v4.f<E> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f55429b;

            a(int i4) {
                this.f55429b = i4;
            }

            @Override // com.google.common.collect.u4.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public E getElement() {
                return (E) c1.this.f55423e[this.f55429b];
            }

            @Override // com.google.common.collect.u4.a
            public int getCount() {
                return c1.this.f55424f[this.f55429b];
            }
        }

        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.c1.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u4.a<E> a(int i4) {
            return new a(i4);
        }
    }

    /* compiled from: EnumMultiset.java */
    abstract class c<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        int f55431b = 0;

        /* renamed from: c, reason: collision with root package name */
        int f55432c = -1;

        c() {
        }

        abstract T a(int i4);

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f55431b < c1.this.f55423e.length) {
                int[] iArr = c1.this.f55424f;
                int i4 = this.f55431b;
                if (iArr[i4] > 0) {
                    return true;
                }
                this.f55431b = i4 + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T a5 = a(this.f55431b);
            int i4 = this.f55431b;
            this.f55432c = i4;
            this.f55431b = i4 + 1;
            return a5;
        }

        @Override // java.util.Iterator
        public void remove() {
            b0.e(this.f55432c >= 0);
            if (c1.this.f55424f[this.f55432c] > 0) {
                c1.m(c1.this);
                c1.p(c1.this, r0.f55424f[this.f55432c]);
                c1.this.f55424f[this.f55432c] = 0;
            }
            this.f55432c = -1;
        }
    }

    private c1(Class<E> cls) {
        this.f55422d = cls;
        com.google.common.base.l0.d(cls.isEnum());
        E[] enumConstants = cls.getEnumConstants();
        this.f55423e = enumConstants;
        this.f55424f = new int[enumConstants.length];
    }

    @d9.c
    private void A(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.f55422d = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.f55423e = enumConstants;
        this.f55424f = new int[enumConstants.length];
        b6.f(this, objectInputStream);
    }

    @d9.c
    private void F(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f55422d);
        b6.k(this, objectOutputStream);
    }

    static /* synthetic */ int m(c1 c1Var) {
        int i4 = c1Var.f55425g;
        c1Var.f55425g = i4 - 1;
        return i4;
    }

    static /* synthetic */ long p(c1 c1Var, long j4) {
        long j5 = c1Var.f55426h - j4;
        c1Var.f55426h = j5;
        return j5;
    }

    private void r(Object obj) {
        obj.getClass();
        if (x(obj)) {
            return;
        }
        String valueOf = String.valueOf(this.f55422d);
        String valueOf2 = String.valueOf(obj);
        throw new ClassCastException(com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 21, ProtectedSandApp.s("\uf46f"), valueOf, ProtectedSandApp.s("\uf470"), valueOf2));
    }

    public static <E extends Enum<E>> c1<E> s(Class<E> cls) {
        return new c1<>(cls);
    }

    public static <E extends Enum<E>> c1<E> v(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        com.google.common.base.l0.e(it.hasNext(), ProtectedSandApp.s("\uf471"));
        c1<E> c1Var = new c1<>(it.next().getDeclaringClass());
        c4.a(c1Var, iterable);
        return c1Var;
    }

    public static <E extends Enum<E>> c1<E> w(Iterable<E> iterable, Class<E> cls) {
        c1<E> c1Var = new c1<>(cls);
        c4.a(c1Var, iterable);
        return c1Var;
    }

    private boolean x(@zc.a Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        int ordinal = r5.ordinal();
        E[] eArr = this.f55423e;
        return ordinal < eArr.length && eArr[ordinal] == r5;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public int o0(E e4, int i4) {
        r(e4);
        b0.b(i4, ProtectedSandApp.s("\uf472"));
        int ordinal = e4.ordinal();
        int[] iArr = this.f55424f;
        int i5 = iArr[ordinal];
        iArr[ordinal] = i4;
        this.f55426h += i4 - i5;
        if (i5 == 0 && i4 > 0) {
            this.f55425g++;
        } else if (i5 > 0 && i4 == 0) {
            this.f55425g--;
        }
        return i5;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public int W1(@zc.a Object obj, int i4) {
        if (obj == null || !x(obj)) {
            return 0;
        }
        Enum r12 = (Enum) obj;
        b0.b(i4, ProtectedSandApp.s("\uf473"));
        if (i4 == 0) {
            return W2(obj);
        }
        int ordinal = r12.ordinal();
        int[] iArr = this.f55424f;
        int i5 = iArr[ordinal];
        if (i5 == 0) {
            return 0;
        }
        if (i5 <= i4) {
            iArr[ordinal] = 0;
            this.f55425g--;
            this.f55426h -= i5;
        } else {
            iArr[ordinal] = i5 - i4;
            this.f55426h -= i4;
        }
        return i5;
    }

    @Override // com.google.common.collect.u4
    public int W2(@zc.a Object obj) {
        if (obj == null || !x(obj)) {
            return 0;
        }
        return this.f55424f[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.f55424f, 0);
        this.f55426h = 0L;
        this.f55425g = 0;
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    public /* bridge */ /* synthetic */ boolean contains(@zc.a Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    public /* bridge */ /* synthetic */ Set d() {
        return super.d();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4, com.google.common.collect.k6
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.i
    int f() {
        return this.f55425g;
    }

    @Override // com.google.common.collect.i
    Iterator<E> h() {
        return new a();
    }

    @Override // com.google.common.collect.i
    Iterator<u4.a<E>> i() {
        return new b();
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.g6
    public Iterator<E> iterator() {
        return v4.n(this);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int d2(E e4, int i4) {
        r(e4);
        b0.b(i4, ProtectedSandApp.s("\uf473"));
        if (i4 == 0) {
            return W2(e4);
        }
        int ordinal = e4.ordinal();
        int i5 = this.f55424f[ordinal];
        long j4 = i4;
        long j5 = i5 + j4;
        com.google.common.base.l0.p(j5 <= 2147483647L, ProtectedSandApp.s("\uf474"), j5);
        this.f55424f[ordinal] = (int) j5;
        if (i5 == 0) {
            this.f55425g++;
        }
        this.f55426h += j4;
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    public int size() {
        return com.google.common.primitives.l.x(this.f55426h);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public boolean x2(@f5 Object obj, int i4, int i5) {
        return v4.w(this, obj, i4, i5);
    }
}
