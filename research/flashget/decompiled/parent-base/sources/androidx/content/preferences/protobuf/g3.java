package androidx.content.preferences.protobuf;

import androidx.collection.s;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList.java */
/* loaded from: classes3.dex */
final class g3<E> extends c<E> implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private static final g3<Object> f28686f;

    /* renamed from: d, reason: collision with root package name */
    private E[] f28687d;

    /* renamed from: e, reason: collision with root package name */
    private int f28688e;

    static {
        g3<Object> g3Var = new g3<>(new Object[0], 0);
        f28686f = g3Var;
        g3Var.c0();
    }

    g3() {
        this(new Object[10], 0);
    }

    private static <E> E[] c(int i4) {
        return (E[]) new Object[i4];
    }

    public static <E> g3<E> f() {
        return (g3<E>) f28686f;
    }

    private void h(int i4) {
        if (i4 < 0 || i4 >= this.f28688e) {
            throw new IndexOutOfBoundsException(i(i4));
        }
    }

    private String i(int i4) {
        StringBuilder a5 = s.a("Index:", i4, ", Size:");
        a5.append(this.f28688e);
        return a5.toString();
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e4) {
        b();
        int i4 = this.f28688e;
        E[] eArr = this.f28687d;
        if (i4 == eArr.length) {
            this.f28687d = (E[]) Arrays.copyOf(eArr, ((i4 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f28687d;
        int i5 = this.f28688e;
        this.f28688e = i5 + 1;
        eArr2[i5] = e4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i4) {
        h(i4);
        return this.f28687d[i4];
    }

    @Override // androidx.datastore.preferences.protobuf.p1.k, androidx.datastore.preferences.protobuf.p1.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public g3<E> e(int i4) {
        if (i4 >= this.f28688e) {
            return new g3<>(Arrays.copyOf(this.f28687d, i4), this.f28688e);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i4) {
        b();
        h(i4);
        E[] eArr = this.f28687d;
        E e4 = eArr[i4];
        if (i4 < this.f28688e - 1) {
            System.arraycopy(eArr, i4 + 1, eArr, i4, (r2 - i4) - 1);
        }
        this.f28688e--;
        ((AbstractList) this).modCount++;
        return e4;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E set(int i4, E e4) {
        b();
        h(i4);
        E[] eArr = this.f28687d;
        E e5 = eArr[i4];
        eArr[i4] = e4;
        ((AbstractList) this).modCount++;
        return e5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28688e;
    }

    private g3(E[] eArr, int i4) {
        this.f28687d = eArr;
        this.f28688e = i4;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public void add(int i4, E e4) {
        int i5;
        b();
        if (i4 >= 0 && i4 <= (i5 = this.f28688e)) {
            E[] eArr = this.f28687d;
            if (i5 < eArr.length) {
                System.arraycopy(eArr, i4, eArr, i4 + 1, i5 - i4);
            } else {
                E[] eArr2 = (E[]) new Object[r.a(i5, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i4);
                System.arraycopy(this.f28687d, i4, eArr2, i4 + 1, this.f28688e - i4);
                this.f28687d = eArr2;
            }
            this.f28687d[i4] = e4;
            this.f28688e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i4));
    }
}
