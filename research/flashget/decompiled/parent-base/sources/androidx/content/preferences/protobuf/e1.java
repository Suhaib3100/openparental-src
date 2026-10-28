package androidx.content.preferences.protobuf;

import androidx.collection.s;
import androidx.content.preferences.protobuf.p1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList.java */
/* loaded from: classes3.dex */
final class e1 extends c<Float> implements p1.f, RandomAccess, d3 {

    /* renamed from: f, reason: collision with root package name */
    private static final e1 f28674f;

    /* renamed from: d, reason: collision with root package name */
    private float[] f28675d;

    /* renamed from: e, reason: collision with root package name */
    private int f28676e;

    static {
        e1 e1Var = new e1(new float[0], 0);
        f28674f = e1Var;
        e1Var.c0();
    }

    e1() {
        this(new float[10], 0);
    }

    private void h(int i4, float f4) {
        int i5;
        b();
        if (i4 < 0 || i4 > (i5 = this.f28676e)) {
            throw new IndexOutOfBoundsException(m(i4));
        }
        float[] fArr = this.f28675d;
        if (i5 < fArr.length) {
            System.arraycopy(fArr, i4, fArr, i4 + 1, i5 - i4);
        } else {
            float[] fArr2 = new float[r.a(i5, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i4);
            System.arraycopy(this.f28675d, i4, fArr2, i4 + 1, this.f28676e - i4);
            this.f28675d = fArr2;
        }
        this.f28675d[i4] = f4;
        this.f28676e++;
        ((AbstractList) this).modCount++;
    }

    public static e1 i() {
        return f28674f;
    }

    private void j(int i4) {
        if (i4 < 0 || i4 >= this.f28676e) {
            throw new IndexOutOfBoundsException(m(i4));
        }
    }

    private String m(int i4) {
        StringBuilder a5 = s.a("Index:", i4, ", Size:");
        a5.append(this.f28676e);
        return a5.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.p1.f
    public void Y(float f4) {
        b();
        int i4 = this.f28676e;
        float[] fArr = this.f28675d;
        if (i4 == fArr.length) {
            float[] fArr2 = new float[r.a(i4, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i4);
            this.f28675d = fArr2;
        }
        float[] fArr3 = this.f28675d;
        int i5 = this.f28676e;
        this.f28676e = i5 + 1;
        fArr3[i5] = f4;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        b();
        p1.d(collection);
        if (!(collection instanceof e1)) {
            return super.addAll(collection);
        }
        e1 e1Var = (e1) collection;
        int i4 = e1Var.f28676e;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f28676e;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        float[] fArr = this.f28675d;
        if (i6 > fArr.length) {
            this.f28675d = Arrays.copyOf(fArr, i6);
        }
        System.arraycopy(e1Var.f28675d, 0, this.f28675d, this.f28676e, e1Var.f28676e);
        this.f28676e = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i4, Float f4) {
        h(i4, f4.floatValue());
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return super.equals(obj);
        }
        e1 e1Var = (e1) obj;
        if (this.f28676e != e1Var.f28676e) {
            return false;
        }
        float[] fArr = e1Var.f28675d;
        for (int i4 = 0; i4 < this.f28676e; i4++) {
            if (Float.floatToIntBits(this.f28675d[i4]) != Float.floatToIntBits(fArr[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f4) {
        Y(f4.floatValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.f
    public float getFloat(int i4) {
        j(i4);
        return this.f28675d[i4];
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f28676e; i5++) {
            i4 = (i4 * 31) + Float.floatToIntBits(this.f28675d[i5]);
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Float get(int i4) {
        return Float.valueOf(getFloat(i4));
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Float remove(int i4) {
        b();
        j(i4);
        float[] fArr = this.f28675d;
        float f4 = fArr[i4];
        if (i4 < this.f28676e - 1) {
            System.arraycopy(fArr, i4 + 1, fArr, i4, (r2 - i4) - 1);
        }
        this.f28676e--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f4);
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Float set(int i4, Float f4) {
        return Float.valueOf(z(i4, f4.floatValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i4, int i5) {
        b();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f28675d;
        System.arraycopy(fArr, i5, fArr, i4, this.f28676e - i5);
        this.f28676e -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28676e;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.f
    public float z(int i4, float f4) {
        b();
        j(i4);
        float[] fArr = this.f28675d;
        float f5 = fArr[i4];
        fArr[i4] = f4;
        return f5;
    }

    private e1(float[] fArr, int i4) {
        this.f28675d = fArr;
        this.f28676e = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.k, androidx.datastore.preferences.protobuf.p1.b
    /* renamed from: e */
    public p1.k<Float> e2(int i4) {
        if (i4 >= this.f28676e) {
            return new e1(Arrays.copyOf(this.f28675d, i4), this.f28676e);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i4 = 0; i4 < this.f28676e; i4++) {
            if (obj.equals(Float.valueOf(this.f28675d[i4]))) {
                float[] fArr = this.f28675d;
                System.arraycopy(fArr, i4 + 1, fArr, i4, (this.f28676e - i4) - 1);
                this.f28676e--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
