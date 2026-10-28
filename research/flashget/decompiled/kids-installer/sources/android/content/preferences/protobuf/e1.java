package android.content.preferences.protobuf;

import android.content.preferences.protobuf.o1;
import androidx.core.app.x;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList.java */
/* loaded from: classes3.dex */
final class e1 extends c<Float> implements o1.f, RandomAccess, a3 {

    /* renamed from: s, reason: collision with root package name */
    private static final e1 f7219s;

    /* renamed from: q, reason: collision with root package name */
    private float[] f7220q;

    /* renamed from: r, reason: collision with root package name */
    private int f7221r;

    static {
        e1 e1Var = new e1(new float[0], 0);
        f7219s = e1Var;
        e1Var.w();
    }

    e1() {
        this(new float[10], 0);
    }

    private void h(int i5, float f6) {
        int i6;
        b();
        if (i5 < 0 || i5 > (i6 = this.f7221r)) {
            throw new IndexOutOfBoundsException(q(i5));
        }
        float[] fArr = this.f7220q;
        if (i6 < fArr.length) {
            System.arraycopy(fArr, i5, fArr, i5 + 1, i6 - i5);
        } else {
            float[] fArr2 = new float[q.a(i6, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i5);
            System.arraycopy(this.f7220q, i5, fArr2, i5 + 1, this.f7221r - i5);
            this.f7220q = fArr2;
        }
        this.f7220q[i5] = f6;
        this.f7221r++;
        ((AbstractList) this).modCount++;
    }

    public static e1 i() {
        return f7219s;
    }

    private void o(int i5) {
        if (i5 < 0 || i5 >= this.f7221r) {
            throw new IndexOutOfBoundsException(q(i5));
        }
    }

    private String q(int i5) {
        StringBuilder a6 = x.a("Index:", i5, ", Size:");
        a6.append(this.f7221r);
        return a6.toString();
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        b();
        o1.d(collection);
        if (!(collection instanceof e1)) {
            return super.addAll(collection);
        }
        e1 e1Var = (e1) collection;
        int i5 = e1Var.f7221r;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.f7221r;
        if (Integer.MAX_VALUE - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        float[] fArr = this.f7220q;
        if (i7 > fArr.length) {
            this.f7220q = Arrays.copyOf(fArr, i7);
        }
        System.arraycopy(e1Var.f7220q, 0, this.f7220q, this.f7221r, e1Var.f7221r);
        this.f7221r = i7;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return super.equals(obj);
        }
        e1 e1Var = (e1) obj;
        if (this.f7221r != e1Var.f7221r) {
            return false;
        }
        float[] fArr = e1Var.f7220q;
        for (int i5 = 0; i5 < this.f7221r; i5++) {
            if (Float.floatToIntBits(this.f7220q[i5]) != Float.floatToIntBits(fArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i5, Float f6) {
        h(i5, f6.floatValue());
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f6) {
        m(f6.floatValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.f
    public float getFloat(int i5) {
        o(i5);
        return this.f7220q[i5];
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.f7221r; i6++) {
            i5 = (i5 * 31) + Float.floatToIntBits(this.f7220q[i6]);
        }
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.f
    public void m(float f6) {
        b();
        int i5 = this.f7221r;
        float[] fArr = this.f7220q;
        if (i5 == fArr.length) {
            float[] fArr2 = new float[q.a(i5, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i5);
            this.f7220q = fArr2;
        }
        float[] fArr3 = this.f7220q;
        int i6 = this.f7221r;
        this.f7221r = i6 + 1;
        fArr3[i6] = f6;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Float get(int i5) {
        return Float.valueOf(getFloat(i5));
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float remove(int i5) {
        b();
        o(i5);
        float[] fArr = this.f7220q;
        float f6 = fArr[i5];
        if (i5 < this.f7221r - 1) {
            System.arraycopy(fArr, i5 + 1, fArr, i5, (r2 - i5) - 1);
        }
        this.f7221r--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f6);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i5, int i6) {
        b();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f7220q;
        System.arraycopy(fArr, i6, fArr, i5, this.f7221r - i6);
        this.f7221r -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float set(int i5, Float f6) {
        return Float.valueOf(setFloat(i5, f6.floatValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.o1.f
    public float setFloat(int i5, float f6) {
        b();
        o(i5);
        float[] fArr = this.f7220q;
        float f7 = fArr[i5];
        fArr[i5] = f6;
        return f7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7221r;
    }

    private e1(float[] fArr, int i5) {
        this.f7220q = fArr;
        this.f7221r = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.k, androidx.datastore.preferences.protobuf.o1.b
    /* renamed from: a */
    public o1.k<Float> a2(int i5) {
        if (i5 >= this.f7221r) {
            return new e1(Arrays.copyOf(this.f7220q, i5), this.f7221r);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i5 = 0; i5 < this.f7221r; i5++) {
            if (obj.equals(Float.valueOf(this.f7220q[i5]))) {
                float[] fArr = this.f7220q;
                System.arraycopy(fArr, i5 + 1, fArr, i5, (this.f7221r - i5) - 1);
                this.f7221r--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
