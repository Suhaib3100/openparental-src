package android.content.preferences.protobuf;

import android.content.preferences.protobuf.o1;
import androidx.core.app.x;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* loaded from: classes3.dex */
final class c0 extends c<Double> implements o1.b, RandomAccess, a3 {

    /* renamed from: s, reason: collision with root package name */
    private static final c0 f7189s;

    /* renamed from: q, reason: collision with root package name */
    private double[] f7190q;

    /* renamed from: r, reason: collision with root package name */
    private int f7191r;

    static {
        c0 c0Var = new c0(new double[0], 0);
        f7189s = c0Var;
        c0Var.w();
    }

    c0() {
        this(new double[10], 0);
    }

    private void h(int i5, double d6) {
        int i6;
        b();
        if (i5 < 0 || i5 > (i6 = this.f7191r)) {
            throw new IndexOutOfBoundsException(q(i5));
        }
        double[] dArr = this.f7190q;
        if (i6 < dArr.length) {
            System.arraycopy(dArr, i5, dArr, i5 + 1, i6 - i5);
        } else {
            double[] dArr2 = new double[q.a(i6, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i5);
            System.arraycopy(this.f7190q, i5, dArr2, i5 + 1, this.f7191r - i5);
            this.f7190q = dArr2;
        }
        this.f7190q[i5] = d6;
        this.f7191r++;
        ((AbstractList) this).modCount++;
    }

    public static c0 i() {
        return f7189s;
    }

    private void o(int i5) {
        if (i5 < 0 || i5 >= this.f7191r) {
            throw new IndexOutOfBoundsException(q(i5));
        }
    }

    private String q(int i5) {
        StringBuilder a6 = x.a("Index:", i5, ", Size:");
        a6.append(this.f7191r);
        return a6.toString();
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        b();
        o1.d(collection);
        if (!(collection instanceof c0)) {
            return super.addAll(collection);
        }
        c0 c0Var = (c0) collection;
        int i5 = c0Var.f7191r;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.f7191r;
        if (Integer.MAX_VALUE - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        double[] dArr = this.f7190q;
        if (i7 > dArr.length) {
            this.f7190q = Arrays.copyOf(dArr, i7);
        }
        System.arraycopy(c0Var.f7190q, 0, this.f7190q, this.f7191r, c0Var.f7191r);
        this.f7191r = i7;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        if (this.f7191r != c0Var.f7191r) {
            return false;
        }
        double[] dArr = c0Var.f7190q;
        for (int i5 = 0; i5 < this.f7191r; i5++) {
            if (Double.doubleToLongBits(this.f7190q[i5]) != Double.doubleToLongBits(dArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i5, Double d6) {
        h(i5, d6.doubleValue());
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d6) {
        o0(d6.doubleValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.b
    public double getDouble(int i5) {
        o(i5);
        return this.f7190q[i5];
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.f7191r; i6++) {
            i5 = (i5 * 31) + o1.s(Double.doubleToLongBits(this.f7190q[i6]));
        }
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.b
    public void o0(double d6) {
        b();
        int i5 = this.f7191r;
        double[] dArr = this.f7190q;
        if (i5 == dArr.length) {
            double[] dArr2 = new double[q.a(i5, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i5);
            this.f7190q = dArr2;
        }
        double[] dArr3 = this.f7190q;
        int i6 = this.f7191r;
        this.f7191r = i6 + 1;
        dArr3[i6] = d6;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Double get(int i5) {
        return Double.valueOf(getDouble(i5));
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Double remove(int i5) {
        b();
        o(i5);
        double[] dArr = this.f7190q;
        double d6 = dArr[i5];
        if (i5 < this.f7191r - 1) {
            System.arraycopy(dArr, i5 + 1, dArr, i5, (r3 - i5) - 1);
        }
        this.f7191r--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d6);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i5, int i6) {
        b();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f7190q;
        System.arraycopy(dArr, i6, dArr, i5, this.f7191r - i6);
        this.f7191r -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Double set(int i5, Double d6) {
        return Double.valueOf(setDouble(i5, d6.doubleValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.o1.b
    public double setDouble(int i5, double d6) {
        b();
        o(i5);
        double[] dArr = this.f7190q;
        double d7 = dArr[i5];
        dArr[i5] = d6;
        return d7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7191r;
    }

    private c0(double[] dArr, int i5) {
        this.f7190q = dArr;
        this.f7191r = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.k, androidx.datastore.preferences.protobuf.o1.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o1.k<Double> a2(int i5) {
        if (i5 >= this.f7191r) {
            return new c0(Arrays.copyOf(this.f7190q, i5), this.f7191r);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i5 = 0; i5 < this.f7191r; i5++) {
            if (obj.equals(Double.valueOf(this.f7190q[i5]))) {
                double[] dArr = this.f7190q;
                System.arraycopy(dArr, i5 + 1, dArr, i5, (this.f7191r - i5) - 1);
                this.f7191r--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
