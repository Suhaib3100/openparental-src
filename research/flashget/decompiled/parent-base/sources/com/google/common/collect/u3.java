package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.f3;
import com.google.common.collect.m3;
import com.google.common.collect.u4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: ImmutableSortedMultiset.java */
@w0
@d9.c
/* loaded from: classes6.dex */
public abstract class u3<E> extends v3<E> implements k6<E> {

    /* renamed from: e, reason: collision with root package name */
    @g9.b
    @zc.a
    transient u3<E> f56544e;

    /* compiled from: ImmutableSortedMultiset.java */
    public static class a<E> extends m3.b<E> {

        /* renamed from: e, reason: collision with root package name */
        private final Comparator<? super E> f56545e;

        /* renamed from: f, reason: collision with root package name */
        @d9.d
        E[] f56546f;

        /* renamed from: g, reason: collision with root package name */
        private int[] f56547g;

        /* renamed from: h, reason: collision with root package name */
        private int f56548h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f56549i;

        public a(Comparator<? super E> comparator) {
            super(true);
            comparator.getClass();
            this.f56545e = comparator;
            this.f56546f = (E[]) new Object[4];
            this.f56547g = new int[4];
        }

        private void u(boolean z4) {
            int i4 = this.f56548h;
            if (i4 == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f56546f, i4);
            Arrays.sort(objArr, this.f56545e);
            int i5 = 1;
            for (int i6 = 1; i6 < objArr.length; i6++) {
                if (this.f56545e.compare((Object) objArr[i5 - 1], (Object) objArr[i6]) < 0) {
                    objArr[i5] = objArr[i6];
                    i5++;
                }
            }
            Arrays.fill(objArr, i5, this.f56548h, (Object) null);
            if (z4) {
                int i7 = i5 * 4;
                int i10 = this.f56548h;
                if (i7 > i10 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, com.google.common.math.f.t(i10, (i10 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i11 = 0; i11 < this.f56548h; i11++) {
                int binarySearch = Arrays.binarySearch(objArr, 0, i5, this.f56546f[i11], this.f56545e);
                int i12 = this.f56547g[i11];
                if (i12 >= 0) {
                    iArr[binarySearch] = iArr[binarySearch] + i12;
                } else {
                    iArr[binarySearch] = ~i12;
                }
            }
            this.f56546f = (E[]) objArr;
            this.f56547g = iArr;
            this.f56548h = i5;
        }

        private void v() {
            u(false);
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = this.f56548h;
                if (i4 >= i6) {
                    Arrays.fill(this.f56546f, i5, i6, (Object) null);
                    Arrays.fill(this.f56547g, i5, this.f56548h, 0);
                    this.f56548h = i5;
                    return;
                }
                int[] iArr = this.f56547g;
                int i7 = iArr[i4];
                if (i7 > 0) {
                    E[] eArr = this.f56546f;
                    eArr[i5] = eArr[i4];
                    iArr[i5] = i7;
                    i5++;
                }
                i4++;
            }
        }

        private void w() {
            int i4 = this.f56548h;
            E[] eArr = this.f56546f;
            if (i4 == eArr.length) {
                u(true);
            } else if (this.f56549i) {
                this.f56546f = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.f56549i = false;
        }

        @Override // com.google.common.collect.m3.b
        @f9.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e4) {
            return k(e4, 1);
        }

        @Override // com.google.common.collect.m3.b
        @f9.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... eArr) {
            for (E e4 : eArr) {
                a(e4);
            }
            return this;
        }

        @Override // com.google.common.collect.m3.b
        @f9.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> iterable) {
            if (iterable instanceof u4) {
                for (u4.a<E> aVar : ((u4) iterable).entrySet()) {
                    k(aVar.getElement(), aVar.getCount());
                }
            } else {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.m3.b
        @f9.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> it) {
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.m3.b
        @f9.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<E> k(E e4, int i4) {
            e4.getClass();
            b0.b(i4, ProtectedSandApp.s("\uf55f"));
            if (i4 == 0) {
                return this;
            }
            w();
            E[] eArr = this.f56546f;
            int i5 = this.f56548h;
            eArr[i5] = e4;
            this.f56547g[i5] = i4;
            this.f56548h = i5 + 1;
            return this;
        }

        @Override // com.google.common.collect.m3.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public u3<E> e() {
            v();
            int i4 = this.f56548h;
            if (i4 == 0) {
                return u3.j0(this.f56545e);
            }
            v5 v5Var = (v5) w3.e0(this.f56545e, i4, this.f56546f);
            long[] jArr = new long[this.f56548h + 1];
            int i5 = 0;
            while (i5 < this.f56548h) {
                int i6 = i5 + 1;
                jArr[i6] = jArr[i5] + this.f56547g[i5];
                i5 = i6;
            }
            this.f56549i = true;
            return new u5(v5Var, jArr, 0, this.f56548h);
        }

        @Override // com.google.common.collect.m3.b
        @f9.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public a<E> m(E e4, int i4) {
            e4.getClass();
            b0.b(i4, ProtectedSandApp.s("\uf560"));
            w();
            E[] eArr = this.f56546f;
            int i5 = this.f56548h;
            eArr[i5] = e4;
            this.f56547g[i5] = ~i4;
            this.f56548h = i5 + 1;
            return this;
        }
    }

    /* compiled from: ImmutableSortedMultiset.java */
    private static final class b<E> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        final Comparator<? super E> f56550b;

        /* renamed from: c, reason: collision with root package name */
        final E[] f56551c;

        /* renamed from: d, reason: collision with root package name */
        final int[] f56552d;

        b(k6<E> k6Var) {
            this.f56550b = k6Var.comparator();
            int size = k6Var.entrySet().size();
            this.f56551c = (E[]) new Object[size];
            this.f56552d = new int[size];
            int i4 = 0;
            for (u4.a<E> aVar : k6Var.entrySet()) {
                this.f56551c[i4] = aVar.getElement();
                this.f56552d[i4] = aVar.getCount();
                i4++;
            }
        }

        Object a() {
            int length = this.f56551c.length;
            a aVar = new a(this.f56550b);
            for (int i4 = 0; i4 < length; i4++) {
                aVar.k(this.f56551c[i4], this.f56552d[i4]);
            }
            return aVar.e();
        }
    }

    u3() {
    }

    public static <E> u3<E> Z(Iterable<? extends E> iterable) {
        return a0(x4.f56632f, iterable);
    }

    public static <E> u3<E> a0(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof u3) {
            u3<E> u3Var = (u3) iterable;
            if (comparator.equals(u3Var.comparator())) {
                return u3Var.j() ? g0(comparator, u3Var.entrySet().b()) : u3Var;
            }
        }
        return new a(comparator).c(iterable).e();
    }

    public static <E> u3<E> b0(Comparator<? super E> comparator, Iterator<? extends E> it) {
        comparator.getClass();
        return new a(comparator).d(it).e();
    }

    public static <E> u3<E> d0(Iterator<? extends E> it) {
        return b0(x4.f56632f, it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/u3<TE;>; */
    public static u3 e0(Comparable[] comparableArr) {
        return a0(x4.f56632f, Arrays.asList(comparableArr));
    }

    public static <E> u3<E> f0(k6<E> k6Var) {
        return g0(k6Var.comparator(), l4.r(k6Var.entrySet()));
    }

    private static <E> u3<E> g0(Comparator<? super E> comparator, Collection<u4.a<E>> collection) {
        if (collection.isEmpty()) {
            return j0(comparator);
        }
        f3.a aVar = new f3.a(collection.size());
        long[] jArr = new long[collection.size() + 1];
        Iterator<u4.a<E>> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            aVar.j(it.next().getElement());
            int i5 = i4 + 1;
            jArr[i5] = jArr[i4] + r5.getCount();
            i4 = i5;
        }
        return new u5(new v5(aVar.e(), comparator), jArr, 0, collection.size());
    }

    static <E> u3<E> j0(Comparator<? super E> comparator) {
        return x4.f56632f.equals(comparator) ? (u3<E>) u5.f56554k : new u5(comparator);
    }

    public static <E extends Comparable<?>> a<E> l0() {
        return new a<>(x4.f56632f);
    }

    public static <E> u3<E> m0() {
        return (u3<E>) u5.f56554k;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/u3<TE;>; */
    public static u3 n0(Comparable comparable) {
        return new u5((v5) w3.x0(comparable), new long[]{0, 1}, 0, 1);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/u3<TE;>; */
    public static u3 p0(Comparable comparable, Comparable comparable2) {
        return a0(x4.f56632f, Arrays.asList(comparable, comparable2));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/u3<TE;>; */
    public static u3 q0(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return a0(x4.f56632f, Arrays.asList(comparable, comparable2, comparable3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/u3<TE;>; */
    public static u3 r0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return a0(x4.f56632f, Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/u3<TE;>; */
    public static u3 s0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return a0(x4.f56632f, Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/u3<TE;>; */
    public static u3 t0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        ArrayList u4 = l4.u(comparableArr.length + 6);
        Collections.addAll(u4, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        Collections.addAll(u4, comparableArr);
        return a0(x4.f56632f, u4);
    }

    public static <E> a<E> u0(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    public static <E extends Comparable<?>> a<E> v0() {
        x4.f56632f.getClass();
        return new a<>(y5.f56654d);
    }

    @Override // com.google.common.collect.k6, com.google.common.collect.g6
    public final Comparator<? super E> comparator() {
        return d().comparator();
    }

    @Override // com.google.common.collect.k6
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public u3<E> m2() {
        u3<E> u3Var = this.f56544e;
        if (u3Var == null) {
            u3Var = isEmpty() ? j0(e5.u(comparator()).v0()) : new s0<>(this);
            this.f56544e = u3Var;
        }
        return u3Var;
    }

    @Override // com.google.common.collect.m3, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    /* renamed from: i0 */
    public abstract w3<E> d();

    @Override // com.google.common.collect.k6
    /* renamed from: k0 */
    public abstract u3<E> N2(E e4, x xVar);

    @Override // com.google.common.collect.m3, com.google.common.collect.b3
    Object m() {
        return new b(this);
    }

    @Override // com.google.common.collect.k6
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public final u4.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k6
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public final u4.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.k6
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public u3<E> M1(E e4, x xVar, E e5, x xVar2) {
        com.google.common.base.l0.y(comparator().compare(e4, e5) <= 0, ProtectedSandApp.s("\uf53b"), e4, e5);
        return d3(e4, xVar).N2(e5, xVar2);
    }

    @Override // com.google.common.collect.k6
    /* renamed from: x0 */
    public abstract u3<E> d3(E e4, x xVar);
}
