package androidx.content.preferences.protobuf;

import androidx.collection.s;
import androidx.content.preferences.protobuf.p1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList.java */
/* loaded from: classes3.dex */
final class z1 extends c<Long> implements p1.i, RandomAccess, d3 {

    /* renamed from: f, reason: collision with root package name */
    private static final z1 f29125f;

    /* renamed from: d, reason: collision with root package name */
    private long[] f29126d;

    /* renamed from: e, reason: collision with root package name */
    private int f29127e;

    static {
        z1 z1Var = new z1(new long[0], 0);
        f29125f = z1Var;
        z1Var.c0();
    }

    z1() {
        this(new long[10], 0);
    }

    private void h(int i4, long j4) {
        int i5;
        b();
        if (i4 < 0 || i4 > (i5 = this.f29127e)) {
            throw new IndexOutOfBoundsException(m(i4));
        }
        long[] jArr = this.f29126d;
        if (i5 < jArr.length) {
            System.arraycopy(jArr, i4, jArr, i4 + 1, i5 - i4);
        } else {
            long[] jArr2 = new long[r.a(i5, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i4);
            System.arraycopy(this.f29126d, i4, jArr2, i4 + 1, this.f29127e - i4);
            this.f29126d = jArr2;
        }
        this.f29126d[i4] = j4;
        this.f29127e++;
        ((AbstractList) this).modCount++;
    }

    public static z1 i() {
        return f29125f;
    }

    private void j(int i4) {
        if (i4 < 0 || i4 >= this.f29127e) {
            throw new IndexOutOfBoundsException(m(i4));
        }
    }

    private String m(int i4) {
        StringBuilder a5 = s.a("Index:", i4, ", Size:");
        a5.append(this.f29127e);
        return a5.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.p1.i
    public void D2(long j4) {
        b();
        int i4 = this.f29127e;
        long[] jArr = this.f29126d;
        if (i4 == jArr.length) {
            long[] jArr2 = new long[r.a(i4, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i4);
            this.f29126d = jArr2;
        }
        long[] jArr3 = this.f29126d;
        int i5 = this.f29127e;
        this.f29127e = i5 + 1;
        jArr3[i5] = j4;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.i
    public long M(int i4, long j4) {
        b();
        j(i4);
        long[] jArr = this.f29126d;
        long j5 = jArr[i4];
        jArr[i4] = j4;
        return j5;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        b();
        p1.d(collection);
        if (!(collection instanceof z1)) {
            return super.addAll(collection);
        }
        z1 z1Var = (z1) collection;
        int i4 = z1Var.f29127e;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f29127e;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        long[] jArr = this.f29126d;
        if (i6 > jArr.length) {
            this.f29126d = Arrays.copyOf(jArr, i6);
        }
        System.arraycopy(z1Var.f29126d, 0, this.f29126d, this.f29127e, z1Var.f29127e);
        this.f29127e = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i4, Long l4) {
        h(i4, l4.longValue());
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return super.equals(obj);
        }
        z1 z1Var = (z1) obj;
        if (this.f29127e != z1Var.f29127e) {
            return false;
        }
        long[] jArr = z1Var.f29126d;
        for (int i4 = 0; i4 < this.f29127e; i4++) {
            if (this.f29126d[i4] != jArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l4) {
        D2(l4.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.i
    public long getLong(int i4) {
        j(i4);
        return this.f29126d[i4];
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f29127e; i5++) {
            i4 = (i4 * 31) + p1.s(this.f29126d[i5]);
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long get(int i4) {
        return Long.valueOf(getLong(i4));
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long remove(int i4) {
        b();
        j(i4);
        long[] jArr = this.f29126d;
        long j4 = jArr[i4];
        if (i4 < this.f29127e - 1) {
            System.arraycopy(jArr, i4 + 1, jArr, i4, (r3 - i4) - 1);
        }
        this.f29127e--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j4);
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long set(int i4, Long l4) {
        return Long.valueOf(M(i4, l4.longValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i4, int i5) {
        b();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f29126d;
        System.arraycopy(jArr, i5, jArr, i4, this.f29127e - i5);
        this.f29127e -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f29127e;
    }

    private z1(long[] jArr, int i4) {
        this.f29126d = jArr;
        this.f29127e = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.k, androidx.datastore.preferences.protobuf.p1.b
    /* renamed from: e */
    public p1.k<Long> e2(int i4) {
        if (i4 >= this.f29127e) {
            return new z1(Arrays.copyOf(this.f29126d, i4), this.f29127e);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i4 = 0; i4 < this.f29127e; i4++) {
            if (obj.equals(Long.valueOf(this.f29126d[i4]))) {
                long[] jArr = this.f29126d;
                System.arraycopy(jArr, i4 + 1, jArr, i4, (this.f29127e - i4) - 1);
                this.f29127e--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
