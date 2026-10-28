package androidx.content.preferences.protobuf;

import androidx.collection.s;
import androidx.content.preferences.protobuf.p1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* loaded from: classes3.dex */
final class c0 extends c<Double> implements p1.b, RandomAccess, d3 {

    /* renamed from: f, reason: collision with root package name */
    private static final c0 f28647f;

    /* renamed from: d, reason: collision with root package name */
    private double[] f28648d;

    /* renamed from: e, reason: collision with root package name */
    private int f28649e;

    static {
        c0 c0Var = new c0(new double[0], 0);
        f28647f = c0Var;
        c0Var.c0();
    }

    c0() {
        this(new double[10], 0);
    }

    private void h(int i4, double d5) {
        int i5;
        b();
        if (i4 < 0 || i4 > (i5 = this.f28649e)) {
            throw new IndexOutOfBoundsException(m(i4));
        }
        double[] dArr = this.f28648d;
        if (i5 < dArr.length) {
            System.arraycopy(dArr, i4, dArr, i4 + 1, i5 - i4);
        } else {
            double[] dArr2 = new double[r.a(i5, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i4);
            System.arraycopy(this.f28648d, i4, dArr2, i4 + 1, this.f28649e - i4);
            this.f28648d = dArr2;
        }
        this.f28648d[i4] = d5;
        this.f28649e++;
        ((AbstractList) this).modCount++;
    }

    public static c0 i() {
        return f28647f;
    }

    private void j(int i4) {
        if (i4 < 0 || i4 >= this.f28649e) {
            throw new IndexOutOfBoundsException(m(i4));
        }
    }

    private String m(int i4) {
        StringBuilder a5 = s.a("Index:", i4, ", Size:");
        a5.append(this.f28649e);
        return a5.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.p1.b
    public double E(int i4, double d5) {
        b();
        j(i4);
        double[] dArr = this.f28648d;
        double d6 = dArr[i4];
        dArr[i4] = d5;
        return d6;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.b
    public void V2(double d5) {
        b();
        int i4 = this.f28649e;
        double[] dArr = this.f28648d;
        if (i4 == dArr.length) {
            double[] dArr2 = new double[r.a(i4, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i4);
            this.f28648d = dArr2;
        }
        double[] dArr3 = this.f28648d;
        int i5 = this.f28649e;
        this.f28649e = i5 + 1;
        dArr3[i5] = d5;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        b();
        p1.d(collection);
        if (!(collection instanceof c0)) {
            return super.addAll(collection);
        }
        c0 c0Var = (c0) collection;
        int i4 = c0Var.f28649e;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f28649e;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        double[] dArr = this.f28648d;
        if (i6 > dArr.length) {
            this.f28648d = Arrays.copyOf(dArr, i6);
        }
        System.arraycopy(c0Var.f28648d, 0, this.f28648d, this.f28649e, c0Var.f28649e);
        this.f28649e = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i4, Double d5) {
        h(i4, d5.doubleValue());
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        if (this.f28649e != c0Var.f28649e) {
            return false;
        }
        double[] dArr = c0Var.f28648d;
        for (int i4 = 0; i4 < this.f28649e; i4++) {
            if (Double.doubleToLongBits(this.f28648d[i4]) != Double.doubleToLongBits(dArr[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d5) {
        V2(d5.doubleValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.b
    public double getDouble(int i4) {
        j(i4);
        return this.f28648d[i4];
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f28649e; i5++) {
            i4 = (i4 * 31) + p1.s(Double.doubleToLongBits(this.f28648d[i5]));
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Double get(int i4) {
        return Double.valueOf(getDouble(i4));
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Double remove(int i4) {
        b();
        j(i4);
        double[] dArr = this.f28648d;
        double d5 = dArr[i4];
        if (i4 < this.f28649e - 1) {
            System.arraycopy(dArr, i4 + 1, dArr, i4, (r3 - i4) - 1);
        }
        this.f28649e--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double set(int i4, Double d5) {
        return Double.valueOf(E(i4, d5.doubleValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i4, int i5) {
        b();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f28648d;
        System.arraycopy(dArr, i5, dArr, i4, this.f28649e - i5);
        this.f28649e -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28649e;
    }

    private c0(double[] dArr, int i4) {
        this.f28648d = dArr;
        this.f28649e = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.k, androidx.datastore.preferences.protobuf.p1.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public p1.k<Double> e2(int i4) {
        if (i4 >= this.f28649e) {
            return new c0(Arrays.copyOf(this.f28648d, i4), this.f28649e);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i4 = 0; i4 < this.f28649e; i4++) {
            if (obj.equals(Double.valueOf(this.f28648d[i4]))) {
                double[] dArr = this.f28648d;
                System.arraycopy(dArr, i4 + 1, dArr, i4, (this.f28649e - i4) - 1);
                this.f28649e--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
