package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: ImmutableLongArray.java */
@f
@f9.j
@d9.b
@d9.a
/* loaded from: classes6.dex */
public final class k implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final k f57504e = new k(new long[0]);

    /* renamed from: b, reason: collision with root package name */
    private final long[] f57505b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f57506c;

    /* renamed from: d, reason: collision with root package name */
    private final int f57507d;

    /* compiled from: ImmutableLongArray.java */
    static class b extends AbstractList<Long> implements RandomAccess, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final k f57508b;

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long get(int i4) {
            return Long.valueOf(this.f57508b.k(i4));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zc.a Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof b) {
                return this.f57508b.equals(((b) obj).f57508b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i4 = this.f57508b.f57506c;
            for (Object obj2 : list) {
                if (obj2 instanceof Long) {
                    int i5 = i4 + 1;
                    if (this.f57508b.f57505b[i4] == ((Long) obj2).longValue()) {
                        i4 = i5;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f57508b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zc.a Object obj) {
            if (obj instanceof Long) {
                return this.f57508b.l(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            if (obj instanceof Long) {
                return this.f57508b.o(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57508b.p();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i4, int i5) {
            return this.f57508b.z(i4, i5).d();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f57508b.toString();
        }

        private b(k kVar) {
            this.f57508b = kVar;
        }
    }

    /* compiled from: ImmutableLongArray.java */
    @f9.a
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private long[] f57509a;

        /* renamed from: b, reason: collision with root package name */
        private int f57510b = 0;

        c(int i4) {
            this.f57509a = new long[i4];
        }

        private void g(int i4) {
            int i5 = this.f57510b + i4;
            long[] jArr = this.f57509a;
            if (i5 > jArr.length) {
                this.f57509a = Arrays.copyOf(jArr, h(jArr.length, i5));
            }
        }

        private static int h(int i4, int i5) {
            if (i5 < 0) {
                throw new AssertionError(ProtectedSandApp.s("\uf8b6"));
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

        public c a(long j4) {
            g(1);
            long[] jArr = this.f57509a;
            int i4 = this.f57510b;
            jArr[i4] = j4;
            this.f57510b = i4 + 1;
            return this;
        }

        public c b(k kVar) {
            g(kVar.p());
            System.arraycopy(kVar.f57505b, kVar.f57506c, this.f57509a, this.f57510b, kVar.p());
            this.f57510b = kVar.p() + this.f57510b;
            return this;
        }

        public c c(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                return d((Collection) iterable);
            }
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next().longValue());
            }
            return this;
        }

        public c d(Collection<Long> collection) {
            g(collection.size());
            for (Long l4 : collection) {
                long[] jArr = this.f57509a;
                int i4 = this.f57510b;
                this.f57510b = i4 + 1;
                jArr[i4] = l4.longValue();
            }
            return this;
        }

        public c e(long[] jArr) {
            g(jArr.length);
            System.arraycopy(jArr, 0, this.f57509a, this.f57510b, jArr.length);
            this.f57510b += jArr.length;
            return this;
        }

        @f9.b
        public k f() {
            if (this.f57510b == 0) {
                return k.f57504e;
            }
            return new k(this.f57509a, 0, this.f57510b);
        }
    }

    public static c e() {
        return new c(10);
    }

    public static c f(int i4) {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf8b7"), i4);
        return new c(i4);
    }

    public static k h(Iterable<Long> iterable) {
        return iterable instanceof Collection ? i((Collection) iterable) : e().c(iterable).f();
    }

    public static k i(Collection<Long> collection) {
        return collection.isEmpty() ? f57504e : new k(n.z(collection));
    }

    public static k j(long[] jArr) {
        return jArr.length == 0 ? f57504e : new k(Arrays.copyOf(jArr, jArr.length));
    }

    private boolean n() {
        return this.f57506c > 0 || this.f57507d < this.f57505b.length;
    }

    public static k q() {
        return f57504e;
    }

    public static k r(long j4) {
        return new k(new long[]{j4});
    }

    public static k s(long j4, long j5) {
        return new k(new long[]{j4, j5});
    }

    public static k t(long j4, long j5, long j6) {
        return new k(new long[]{j4, j5, j6});
    }

    public static k u(long j4, long j5, long j6, long j7) {
        return new k(new long[]{j4, j5, j6, j7});
    }

    public static k v(long j4, long j5, long j6, long j7, long j10) {
        return new k(new long[]{j4, j5, j6, j7, j10});
    }

    public static k w(long j4, long j5, long j6, long j7, long j10, long j11) {
        return new k(new long[]{j4, j5, j6, j7, j10, j11});
    }

    public static k x(long j4, long... jArr) {
        l0.e(jArr.length <= 2147483646, ProtectedSandApp.s("\uf8b8"));
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j4;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new k(jArr2);
    }

    public long[] A() {
        return Arrays.copyOfRange(this.f57505b, this.f57506c, this.f57507d);
    }

    public k B() {
        return n() ? new k(A()) : this;
    }

    Object C() {
        return B();
    }

    public List<Long> d() {
        return new b();
    }

    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (p() != kVar.p()) {
            return false;
        }
        for (int i4 = 0; i4 < p(); i4++) {
            if (k(i4) != kVar.k(i4)) {
                return false;
            }
        }
        return true;
    }

    public boolean g(long j4) {
        return l(j4) >= 0;
    }

    public int hashCode() {
        int i4 = 1;
        for (int i5 = this.f57506c; i5 < this.f57507d; i5++) {
            i4 = (i4 * 31) + n.k(this.f57505b[i5]);
        }
        return i4;
    }

    public long k(int i4) {
        l0.C(i4, p());
        return this.f57505b[this.f57506c + i4];
    }

    public int l(long j4) {
        for (int i4 = this.f57506c; i4 < this.f57507d; i4++) {
            if (this.f57505b[i4] == j4) {
                return i4 - this.f57506c;
            }
        }
        return -1;
    }

    public boolean m() {
        return this.f57507d == this.f57506c;
    }

    public int o(long j4) {
        int i4;
        int i5 = this.f57507d;
        do {
            i5--;
            i4 = this.f57506c;
            if (i5 < i4) {
                return -1;
            }
        } while (this.f57505b[i5] != j4);
        return i5 - i4;
    }

    public int p() {
        return this.f57507d - this.f57506c;
    }

    public String toString() {
        if (m()) {
            return ProtectedSandApp.s("\uf8b9");
        }
        StringBuilder sb = new StringBuilder(p() * 5);
        sb.append('[');
        sb.append(this.f57505b[this.f57506c]);
        int i4 = this.f57506c;
        while (true) {
            i4++;
            if (i4 >= this.f57507d) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(ProtectedSandApp.s("\uf8ba"));
            sb.append(this.f57505b[i4]);
        }
    }

    Object y() {
        return m() ? f57504e : this;
    }

    public k z(int i4, int i5) {
        l0.f0(i4, i5, p());
        if (i4 == i5) {
            return f57504e;
        }
        long[] jArr = this.f57505b;
        int i6 = this.f57506c;
        return new k(jArr, i4 + i6, i6 + i5);
    }

    private k(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    private k(long[] jArr, int i4, int i5) {
        this.f57505b = jArr;
        this.f57506c = i4;
        this.f57507d = i5;
    }
}
