package android.content.preferences.protobuf;

import android.content.preferences.protobuf.o1;
import androidx.core.app.x;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList.java */
/* loaded from: classes3.dex */
final class r extends c<Boolean> implements o1.a, RandomAccess, a3 {

    /* renamed from: s, reason: collision with root package name */
    private static final r f7491s;

    /* renamed from: q, reason: collision with root package name */
    private boolean[] f7492q;

    /* renamed from: r, reason: collision with root package name */
    private int f7493r;

    static {
        r rVar = new r(new boolean[0], 0);
        f7491s = rVar;
        rVar.w();
    }

    r() {
        this(new boolean[10], 0);
    }

    private void h(int i5, boolean z5) {
        int i6;
        b();
        if (i5 < 0 || i5 > (i6 = this.f7493r)) {
            throw new IndexOutOfBoundsException(q(i5));
        }
        boolean[] zArr = this.f7492q;
        if (i6 < zArr.length) {
            System.arraycopy(zArr, i5, zArr, i5 + 1, i6 - i5);
        } else {
            boolean[] zArr2 = new boolean[q.a(i6, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i5);
            System.arraycopy(this.f7492q, i5, zArr2, i5 + 1, this.f7493r - i5);
            this.f7492q = zArr2;
        }
        this.f7492q[i5] = z5;
        this.f7493r++;
        ((AbstractList) this).modCount++;
    }

    public static r i() {
        return f7491s;
    }

    private void o(int i5) {
        if (i5 < 0 || i5 >= this.f7493r) {
            throw new IndexOutOfBoundsException(q(i5));
        }
    }

    private String q(int i5) {
        StringBuilder a6 = x.a("Index:", i5, ", Size:");
        a6.append(this.f7493r);
        return a6.toString();
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        b();
        o1.d(collection);
        if (!(collection instanceof r)) {
            return super.addAll(collection);
        }
        r rVar = (r) collection;
        int i5 = rVar.f7493r;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.f7493r;
        if (Integer.MAX_VALUE - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        boolean[] zArr = this.f7492q;
        if (i7 > zArr.length) {
            this.f7492q = Arrays.copyOf(zArr, i7);
        }
        System.arraycopy(rVar.f7492q, 0, this.f7492q, this.f7493r, rVar.f7493r);
        this.f7493r = i7;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return super.equals(obj);
        }
        r rVar = (r) obj;
        if (this.f7493r != rVar.f7493r) {
            return false;
        }
        boolean[] zArr = rVar.f7492q;
        for (int i5 = 0; i5 < this.f7493r; i5++) {
            if (this.f7492q[i5] != zArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i5, Boolean bool) {
        h(i5, bool.booleanValue());
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        i0(bool.booleanValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.a
    public boolean getBoolean(int i5) {
        o(i5);
        return this.f7492q[i5];
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.f7493r; i6++) {
            i5 = (i5 * 31) + o1.k(this.f7492q[i6]);
        }
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.a
    public void i0(boolean z5) {
        b();
        int i5 = this.f7493r;
        boolean[] zArr = this.f7492q;
        if (i5 == zArr.length) {
            boolean[] zArr2 = new boolean[q.a(i5, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i5);
            this.f7492q = zArr2;
        }
        boolean[] zArr3 = this.f7492q;
        int i6 = this.f7493r;
        this.f7493r = i6 + 1;
        zArr3[i6] = z5;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i5) {
        return Boolean.valueOf(getBoolean(i5));
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i5) {
        b();
        o(i5);
        boolean[] zArr = this.f7492q;
        boolean z5 = zArr[i5];
        if (i5 < this.f7493r - 1) {
            System.arraycopy(zArr, i5 + 1, zArr, i5, (r2 - i5) - 1);
        }
        this.f7493r--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z5);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i5, int i6) {
        b();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f7492q;
        System.arraycopy(zArr, i6, zArr, i5, this.f7493r - i6);
        this.f7493r -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i5, Boolean bool) {
        return Boolean.valueOf(setBoolean(i5, bool.booleanValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.o1.a
    public boolean setBoolean(int i5, boolean z5) {
        b();
        o(i5);
        boolean[] zArr = this.f7492q;
        boolean z6 = zArr[i5];
        zArr[i5] = z5;
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7493r;
    }

    private r(boolean[] zArr, int i5) {
        this.f7492q = zArr;
        this.f7493r = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.k, androidx.datastore.preferences.protobuf.o1.b
    /* renamed from: a */
    public o1.k<Boolean> a2(int i5) {
        if (i5 >= this.f7493r) {
            return new r(Arrays.copyOf(this.f7492q, i5), this.f7493r);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i5 = 0; i5 < this.f7493r; i5++) {
            if (obj.equals(Boolean.valueOf(this.f7492q[i5]))) {
                boolean[] zArr = this.f7492q;
                System.arraycopy(zArr, i5 + 1, zArr, i5, (this.f7493r - i5) - 1);
                this.f7493r--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
