package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.p1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList.java */
/* loaded from: classes3.dex */
final class s extends c<Boolean> implements p1.a, RandomAccess, d3 {

    /* renamed from: f, reason: collision with root package name */
    private static final s f28935f;

    /* renamed from: d, reason: collision with root package name */
    private boolean[] f28936d;

    /* renamed from: e, reason: collision with root package name */
    private int f28937e;

    static {
        s sVar = new s(new boolean[0], 0);
        f28935f = sVar;
        sVar.c0();
    }

    s() {
        this(new boolean[10], 0);
    }

    private void h(int i4, boolean z4) {
        int i5;
        b();
        if (i4 < 0 || i4 > (i5 = this.f28937e)) {
            throw new IndexOutOfBoundsException(m(i4));
        }
        boolean[] zArr = this.f28936d;
        if (i5 < zArr.length) {
            System.arraycopy(zArr, i4, zArr, i4 + 1, i5 - i4);
        } else {
            boolean[] zArr2 = new boolean[r.a(i5, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i4);
            System.arraycopy(this.f28936d, i4, zArr2, i4 + 1, this.f28937e - i4);
            this.f28936d = zArr2;
        }
        this.f28936d[i4] = z4;
        this.f28937e++;
        ((AbstractList) this).modCount++;
    }

    public static s i() {
        return f28935f;
    }

    private void j(int i4) {
        if (i4 < 0 || i4 >= this.f28937e) {
            throw new IndexOutOfBoundsException(m(i4));
        }
    }

    private String m(int i4) {
        StringBuilder a5 = androidx.collection.s.a("Index:", i4, ", Size:");
        a5.append(this.f28937e);
        return a5.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.p1.a
    public boolean C(int i4, boolean z4) {
        b();
        j(i4);
        boolean[] zArr = this.f28936d;
        boolean z5 = zArr[i4];
        zArr[i4] = z4;
        return z5;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.a
    public boolean J(int i4) {
        j(i4);
        return this.f28936d[i4];
    }

    @Override // androidx.datastore.preferences.protobuf.p1.a
    public void N0(boolean z4) {
        b();
        int i4 = this.f28937e;
        boolean[] zArr = this.f28936d;
        if (i4 == zArr.length) {
            boolean[] zArr2 = new boolean[r.a(i4, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i4);
            this.f28936d = zArr2;
        }
        boolean[] zArr3 = this.f28936d;
        int i5 = this.f28937e;
        this.f28937e = i5 + 1;
        zArr3[i5] = z4;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        b();
        p1.d(collection);
        if (!(collection instanceof s)) {
            return super.addAll(collection);
        }
        s sVar = (s) collection;
        int i4 = sVar.f28937e;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f28937e;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        boolean[] zArr = this.f28936d;
        if (i6 > zArr.length) {
            this.f28936d = Arrays.copyOf(zArr, i6);
        }
        System.arraycopy(sVar.f28936d, 0, this.f28936d, this.f28937e, sVar.f28937e);
        this.f28937e = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i4, Boolean bool) {
        h(i4, bool.booleanValue());
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return super.equals(obj);
        }
        s sVar = (s) obj;
        if (this.f28937e != sVar.f28937e) {
            return false;
        }
        boolean[] zArr = sVar.f28936d;
        for (int i4 = 0; i4 < this.f28937e; i4++) {
            if (this.f28936d[i4] != zArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        N0(bool.booleanValue());
        return true;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f28937e; i5++) {
            i4 = (i4 * 31) + p1.k(this.f28936d[i5]);
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i4) {
        return Boolean.valueOf(J(i4));
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i4) {
        b();
        j(i4);
        boolean[] zArr = this.f28936d;
        boolean z4 = zArr[i4];
        if (i4 < this.f28937e - 1) {
            System.arraycopy(zArr, i4 + 1, zArr, i4, (r2 - i4) - 1);
        }
        this.f28937e--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z4);
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i4, Boolean bool) {
        return Boolean.valueOf(C(i4, bool.booleanValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i4, int i5) {
        b();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f28936d;
        System.arraycopy(zArr, i5, zArr, i4, this.f28937e - i5);
        this.f28937e -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28937e;
    }

    private s(boolean[] zArr, int i4) {
        this.f28936d = zArr;
        this.f28937e = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.k, androidx.datastore.preferences.protobuf.p1.b
    /* renamed from: e */
    public p1.k<Boolean> e2(int i4) {
        if (i4 >= this.f28937e) {
            return new s(Arrays.copyOf(this.f28936d, i4), this.f28937e);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i4 = 0; i4 < this.f28937e; i4++) {
            if (obj.equals(Boolean.valueOf(this.f28936d[i4]))) {
                boolean[] zArr = this.f28936d;
                System.arraycopy(zArr, i4 + 1, zArr, i4, (this.f28937e - i4) - 1);
                this.f28937e--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
