package android.content.preferences.protobuf;

import android.content.preferences.protobuf.o1;
import androidx.core.app.x;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList.java */
/* loaded from: classes3.dex */
final class y1 extends c<Long> implements o1.i, RandomAccess, a3 {

    /* renamed from: s, reason: collision with root package name */
    private static final y1 f7611s;

    /* renamed from: q, reason: collision with root package name */
    private long[] f7612q;

    /* renamed from: r, reason: collision with root package name */
    private int f7613r;

    static {
        y1 y1Var = new y1(new long[0], 0);
        f7611s = y1Var;
        y1Var.w();
    }

    y1() {
        this(new long[10], 0);
    }

    private void h(int i5, long j5) {
        int i6;
        b();
        if (i5 < 0 || i5 > (i6 = this.f7613r)) {
            throw new IndexOutOfBoundsException(q(i5));
        }
        long[] jArr = this.f7612q;
        if (i6 < jArr.length) {
            System.arraycopy(jArr, i5, jArr, i5 + 1, i6 - i5);
        } else {
            long[] jArr2 = new long[q.a(i6, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i5);
            System.arraycopy(this.f7612q, i5, jArr2, i5 + 1, this.f7613r - i5);
            this.f7612q = jArr2;
        }
        this.f7612q[i5] = j5;
        this.f7613r++;
        ((AbstractList) this).modCount++;
    }

    public static y1 i() {
        return f7611s;
    }

    private void o(int i5) {
        if (i5 < 0 || i5 >= this.f7613r) {
            throw new IndexOutOfBoundsException(q(i5));
        }
    }

    private String q(int i5) {
        StringBuilder a6 = x.a("Index:", i5, ", Size:");
        a6.append(this.f7613r);
        return a6.toString();
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        b();
        o1.d(collection);
        if (!(collection instanceof y1)) {
            return super.addAll(collection);
        }
        y1 y1Var = (y1) collection;
        int i5 = y1Var.f7613r;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.f7613r;
        if (Integer.MAX_VALUE - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        long[] jArr = this.f7612q;
        if (i7 > jArr.length) {
            this.f7612q = Arrays.copyOf(jArr, i7);
        }
        System.arraycopy(y1Var.f7612q, 0, this.f7612q, this.f7613r, y1Var.f7613r);
        this.f7613r = i7;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.i
    public void e0(long j5) {
        b();
        int i5 = this.f7613r;
        long[] jArr = this.f7612q;
        if (i5 == jArr.length) {
            long[] jArr2 = new long[q.a(i5, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i5);
            this.f7612q = jArr2;
        }
        long[] jArr3 = this.f7612q;
        int i6 = this.f7613r;
        this.f7613r = i6 + 1;
        jArr3[i6] = j5;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return super.equals(obj);
        }
        y1 y1Var = (y1) obj;
        if (this.f7613r != y1Var.f7613r) {
            return false;
        }
        long[] jArr = y1Var.f7612q;
        for (int i5 = 0; i5 < this.f7613r; i5++) {
            if (this.f7612q[i5] != jArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i5, Long l5) {
        h(i5, l5.longValue());
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l5) {
        e0(l5.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.i
    public long getLong(int i5) {
        o(i5);
        return this.f7612q[i5];
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.f7613r; i6++) {
            i5 = (i5 * 31) + o1.s(this.f7612q[i6]);
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long get(int i5) {
        return Long.valueOf(getLong(i5));
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long remove(int i5) {
        b();
        o(i5);
        long[] jArr = this.f7612q;
        long j5 = jArr[i5];
        if (i5 < this.f7613r - 1) {
            System.arraycopy(jArr, i5 + 1, jArr, i5, (r3 - i5) - 1);
        }
        this.f7613r--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j5);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i5, int i6) {
        b();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f7612q;
        System.arraycopy(jArr, i6, jArr, i5, this.f7613r - i6);
        this.f7613r -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Long set(int i5, Long l5) {
        return Long.valueOf(setLong(i5, l5.longValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.o1.i
    public long setLong(int i5, long j5) {
        b();
        o(i5);
        long[] jArr = this.f7612q;
        long j6 = jArr[i5];
        jArr[i5] = j5;
        return j6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7613r;
    }

    private y1(long[] jArr, int i5) {
        this.f7612q = jArr;
        this.f7613r = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.k, androidx.datastore.preferences.protobuf.o1.b
    /* renamed from: a */
    public o1.k<Long> a2(int i5) {
        if (i5 >= this.f7613r) {
            return new y1(Arrays.copyOf(this.f7612q, i5), this.f7613r);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i5 = 0; i5 < this.f7613r; i5++) {
            if (obj.equals(Long.valueOf(this.f7612q[i5]))) {
                long[] jArr = this.f7612q;
                System.arraycopy(jArr, i5 + 1, jArr, i5, (this.f7613r - i5) - 1);
                this.f7613r--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
