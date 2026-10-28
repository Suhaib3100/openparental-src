package androidx.content.preferences.protobuf;

import androidx.collection.s;
import androidx.content.preferences.protobuf.p1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList.java */
/* loaded from: classes3.dex */
final class n1 extends c<Integer> implements p1.g, RandomAccess, d3 {

    /* renamed from: f, reason: collision with root package name */
    private static final n1 f28772f;

    /* renamed from: d, reason: collision with root package name */
    private int[] f28773d;

    /* renamed from: e, reason: collision with root package name */
    private int f28774e;

    static {
        n1 n1Var = new n1(new int[0], 0);
        f28772f = n1Var;
        n1Var.c0();
    }

    n1() {
        this(new int[10], 0);
    }

    private void h(int i4, int i5) {
        int i6;
        b();
        if (i4 < 0 || i4 > (i6 = this.f28774e)) {
            throw new IndexOutOfBoundsException(m(i4));
        }
        int[] iArr = this.f28773d;
        if (i6 < iArr.length) {
            System.arraycopy(iArr, i4, iArr, i4 + 1, i6 - i4);
        } else {
            int[] iArr2 = new int[r.a(i6, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            System.arraycopy(this.f28773d, i4, iArr2, i4 + 1, this.f28774e - i4);
            this.f28773d = iArr2;
        }
        this.f28773d[i4] = i5;
        this.f28774e++;
        ((AbstractList) this).modCount++;
    }

    public static n1 i() {
        return f28772f;
    }

    private void j(int i4) {
        if (i4 < 0 || i4 >= this.f28774e) {
            throw new IndexOutOfBoundsException(m(i4));
        }
    }

    private String m(int i4) {
        StringBuilder a5 = s.a("Index:", i4, ", Size:");
        a5.append(this.f28774e);
        return a5.toString();
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        b();
        p1.d(collection);
        if (!(collection instanceof n1)) {
            return super.addAll(collection);
        }
        n1 n1Var = (n1) collection;
        int i4 = n1Var.f28774e;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f28774e;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        int[] iArr = this.f28773d;
        if (i6 > iArr.length) {
            this.f28773d = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(n1Var.f28773d, 0, this.f28773d, this.f28774e, n1Var.f28774e);
        this.f28774e = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i4, Integer num) {
        h(i4, num.intValue());
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return super.equals(obj);
        }
        n1 n1Var = (n1) obj;
        if (this.f28774e != n1Var.f28774e) {
            return false;
        }
        int[] iArr = n1Var.f28773d;
        for (int i4 = 0; i4 < this.f28774e; i4++) {
            if (this.f28773d[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        o2(num.intValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.g
    public int getInt(int i4) {
        j(i4);
        return this.f28773d[i4];
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f28774e; i5++) {
            i4 = (i4 * 31) + this.f28773d[i5];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer get(int i4) {
        return Integer.valueOf(getInt(i4));
    }

    @Override // androidx.datastore.preferences.protobuf.p1.g
    public void o2(int i4) {
        b();
        int i5 = this.f28774e;
        int[] iArr = this.f28773d;
        if (i5 == iArr.length) {
            int[] iArr2 = new int[r.a(i5, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.f28773d = iArr2;
        }
        int[] iArr3 = this.f28773d;
        int i6 = this.f28774e;
        this.f28774e = i6 + 1;
        iArr3[i6] = i4;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i4) {
        b();
        j(i4);
        int[] iArr = this.f28773d;
        int i5 = iArr[i4];
        if (i4 < this.f28774e - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.f28774e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i5);
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Integer set(int i4, Integer num) {
        return Integer.valueOf(t(i4, num.intValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i4, int i5) {
        b();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f28773d;
        System.arraycopy(iArr, i5, iArr, i4, this.f28774e - i5);
        this.f28774e -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28774e;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.g
    public int t(int i4, int i5) {
        b();
        j(i4);
        int[] iArr = this.f28773d;
        int i6 = iArr[i4];
        iArr[i4] = i5;
        return i6;
    }

    private n1(int[] iArr, int i4) {
        this.f28773d = iArr;
        this.f28774e = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.k, androidx.datastore.preferences.protobuf.p1.b
    /* renamed from: e */
    public p1.k<Integer> e2(int i4) {
        if (i4 >= this.f28774e) {
            return new n1(Arrays.copyOf(this.f28773d, i4), this.f28774e);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i4 = 0; i4 < this.f28774e; i4++) {
            if (obj.equals(Integer.valueOf(this.f28773d[i4]))) {
                int[] iArr = this.f28773d;
                System.arraycopy(iArr, i4 + 1, iArr, i4, (this.f28774e - i4) - 1);
                this.f28774e--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
