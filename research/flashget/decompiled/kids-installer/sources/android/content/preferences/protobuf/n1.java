package android.content.preferences.protobuf;

import android.content.preferences.protobuf.o1;
import androidx.core.app.x;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList.java */
/* loaded from: classes3.dex */
final class n1 extends c<Integer> implements o1.g, RandomAccess, a3 {

    /* renamed from: s, reason: collision with root package name */
    private static final n1 f7428s;

    /* renamed from: q, reason: collision with root package name */
    private int[] f7429q;

    /* renamed from: r, reason: collision with root package name */
    private int f7430r;

    static {
        n1 n1Var = new n1(new int[0], 0);
        f7428s = n1Var;
        n1Var.w();
    }

    n1() {
        this(new int[10], 0);
    }

    private void h(int i5, int i6) {
        int i7;
        b();
        if (i5 < 0 || i5 > (i7 = this.f7430r)) {
            throw new IndexOutOfBoundsException(q(i5));
        }
        int[] iArr = this.f7429q;
        if (i7 < iArr.length) {
            System.arraycopy(iArr, i5, iArr, i5 + 1, i7 - i5);
        } else {
            int[] iArr2 = new int[q.a(i7, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            System.arraycopy(this.f7429q, i5, iArr2, i5 + 1, this.f7430r - i5);
            this.f7429q = iArr2;
        }
        this.f7429q[i5] = i6;
        this.f7430r++;
        ((AbstractList) this).modCount++;
    }

    public static n1 i() {
        return f7428s;
    }

    private void o(int i5) {
        if (i5 < 0 || i5 >= this.f7430r) {
            throw new IndexOutOfBoundsException(q(i5));
        }
    }

    private String q(int i5) {
        StringBuilder a6 = x.a("Index:", i5, ", Size:");
        a6.append(this.f7430r);
        return a6.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.o1.g
    public void D(int i5) {
        b();
        int i6 = this.f7430r;
        int[] iArr = this.f7429q;
        if (i6 == iArr.length) {
            int[] iArr2 = new int[q.a(i6, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i6);
            this.f7429q = iArr2;
        }
        int[] iArr3 = this.f7429q;
        int i7 = this.f7430r;
        this.f7430r = i7 + 1;
        iArr3[i7] = i5;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        b();
        o1.d(collection);
        if (!(collection instanceof n1)) {
            return super.addAll(collection);
        }
        n1 n1Var = (n1) collection;
        int i5 = n1Var.f7430r;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.f7430r;
        if (Integer.MAX_VALUE - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        int[] iArr = this.f7429q;
        if (i7 > iArr.length) {
            this.f7429q = Arrays.copyOf(iArr, i7);
        }
        System.arraycopy(n1Var.f7429q, 0, this.f7429q, this.f7430r, n1Var.f7430r);
        this.f7430r = i7;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return super.equals(obj);
        }
        n1 n1Var = (n1) obj;
        if (this.f7430r != n1Var.f7430r) {
            return false;
        }
        int[] iArr = n1Var.f7429q;
        for (int i5 = 0; i5 < this.f7430r; i5++) {
            if (this.f7429q[i5] != iArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i5, Integer num) {
        h(i5, num.intValue());
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        D(num.intValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.g
    public int getInt(int i5) {
        o(i5);
        return this.f7429q[i5];
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.f7430r; i6++) {
            i5 = (i5 * 31) + this.f7429q[i6];
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer get(int i5) {
        return Integer.valueOf(getInt(i5));
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i5) {
        b();
        o(i5);
        int[] iArr = this.f7429q;
        int i6 = iArr[i5];
        if (i5 < this.f7430r - 1) {
            System.arraycopy(iArr, i5 + 1, iArr, i5, (r2 - i5) - 1);
        }
        this.f7430r--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i5, int i6) {
        b();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f7429q;
        System.arraycopy(iArr, i6, iArr, i5, this.f7430r - i6);
        this.f7430r -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer set(int i5, Integer num) {
        return Integer.valueOf(setInt(i5, num.intValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.o1.g
    public int setInt(int i5, int i6) {
        b();
        o(i5);
        int[] iArr = this.f7429q;
        int i7 = iArr[i5];
        iArr[i5] = i6;
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7430r;
    }

    private n1(int[] iArr, int i5) {
        this.f7429q = iArr;
        this.f7430r = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.k, androidx.datastore.preferences.protobuf.o1.b
    /* renamed from: a */
    public o1.k<Integer> a2(int i5) {
        if (i5 >= this.f7430r) {
            return new n1(Arrays.copyOf(this.f7429q, i5), this.f7430r);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i5 = 0; i5 < this.f7430r; i5++) {
            if (obj.equals(Integer.valueOf(this.f7429q[i5]))) {
                int[] iArr = this.f7429q;
                System.arraycopy(iArr, i5 + 1, iArr, i5, (this.f7430r - i5) - 1);
                this.f7430r--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
