package android.content.preferences.protobuf;

import androidx.core.app.x;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList.java */
/* loaded from: classes3.dex */
final class d3<E> extends c<E> implements RandomAccess {

    /* renamed from: s, reason: collision with root package name */
    private static final d3<Object> f7214s;

    /* renamed from: q, reason: collision with root package name */
    private E[] f7215q;

    /* renamed from: r, reason: collision with root package name */
    private int f7216r;

    static {
        d3<Object> d3Var = new d3<>(new Object[0], 0);
        f7214s = d3Var;
        d3Var.w();
    }

    d3() {
        this(new Object[10], 0);
    }

    private static <E> E[] f(int i5) {
        return (E[]) new Object[i5];
    }

    public static <E> d3<E> g() {
        return (d3<E>) f7214s;
    }

    private void h(int i5) {
        if (i5 < 0 || i5 >= this.f7216r) {
            throw new IndexOutOfBoundsException(i(i5));
        }
    }

    private String i(int i5) {
        StringBuilder a6 = x.a("Index:", i5, ", Size:");
        a6.append(this.f7216r);
        return a6.toString();
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e6) {
        b();
        int i5 = this.f7216r;
        E[] eArr = this.f7215q;
        if (i5 == eArr.length) {
            this.f7215q = (E[]) Arrays.copyOf(eArr, ((i5 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f7215q;
        int i6 = this.f7216r;
        this.f7216r = i6 + 1;
        eArr2[i6] = e6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i5) {
        h(i5);
        return this.f7215q[i5];
    }

    @Override // androidx.datastore.preferences.protobuf.o1.k, androidx.datastore.preferences.protobuf.o1.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public d3<E> a(int i5) {
        if (i5 >= this.f7216r) {
            return new d3<>(Arrays.copyOf(this.f7215q, i5), this.f7216r);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i5) {
        b();
        h(i5);
        E[] eArr = this.f7215q;
        E e6 = eArr[i5];
        if (i5 < this.f7216r - 1) {
            System.arraycopy(eArr, i5 + 1, eArr, i5, (r2 - i5) - 1);
        }
        this.f7216r--;
        ((AbstractList) this).modCount++;
        return e6;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E set(int i5, E e6) {
        b();
        h(i5);
        E[] eArr = this.f7215q;
        E e7 = eArr[i5];
        eArr[i5] = e6;
        ((AbstractList) this).modCount++;
        return e7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7216r;
    }

    private d3(E[] eArr, int i5) {
        this.f7215q = eArr;
        this.f7216r = i5;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public void add(int i5, E e6) {
        int i6;
        b();
        if (i5 >= 0 && i5 <= (i6 = this.f7216r)) {
            E[] eArr = this.f7215q;
            if (i6 < eArr.length) {
                System.arraycopy(eArr, i5, eArr, i5 + 1, i6 - i5);
            } else {
                E[] eArr2 = (E[]) new Object[q.a(i6, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i5);
                System.arraycopy(this.f7215q, i5, eArr2, i5 + 1, this.f7216r - i5);
                this.f7215q = eArr2;
            }
            this.f7215q[i5] = e6;
            this.f7216r++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i5));
    }
}
