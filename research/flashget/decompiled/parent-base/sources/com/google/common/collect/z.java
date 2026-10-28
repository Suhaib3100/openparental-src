package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.f3;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: CartesianList.java */
@w0
@d9.b
/* loaded from: classes6.dex */
final class z<E> extends AbstractList<List<E>> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private final transient f3<List<E>> f56667b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int[] f56668c;

    /* compiled from: CartesianList.java */
    class a extends f3<E> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f56669d;

        a(int i4) {
            this.f56669d = i4;
        }

        @Override // java.util.List
        public E get(int i4) {
            com.google.common.base.l0.C(i4, size());
            return (E) ((List) z.this.f56667b.get(i4)).get(z.this.i(this.f56669d, i4));
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return z.this.f56667b.size();
        }
    }

    z(f3<List<E>> f3Var) {
        this.f56667b = f3Var;
        int[] iArr = new int[f3Var.size() + 1];
        iArr[f3Var.size()] = 1;
        try {
            for (int size = f3Var.size() - 1; size >= 0; size--) {
                iArr[size] = com.google.common.math.f.d(iArr[size + 1], f3Var.get(size).size());
            }
            this.f56668c = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf58a"));
        }
    }

    static <E> List<List<E>> f(List<? extends List<? extends E>> list) {
        f3.a aVar = new f3.a(list.size());
        Iterator<? extends List<? extends E>> it = list.iterator();
        while (it.hasNext()) {
            f3 x4 = f3.x(it.next());
            if (x4.isEmpty()) {
                return q5.f56234f;
            }
            aVar.j(x4);
        }
        return new z(aVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(int i4, int i5) {
        return (i4 / this.f56668c[i5 + 1]) % this.f56667b.get(i5).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@zc.a Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.size() != this.f56667b.size()) {
            return false;
        }
        Iterator<E> it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (!this.f56667b.get(i4).contains(it.next())) {
                return false;
            }
            i4++;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public f3<E> get(int i4) {
        com.google.common.base.l0.C(i4, this.f56668c[0]);
        return new a(i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(@zc.a Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f56667b.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i4 = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int indexOf = this.f56667b.get(nextIndex).indexOf(listIterator.next());
            if (indexOf == -1) {
                return -1;
            }
            i4 += indexOf * this.f56668c[nextIndex + 1];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(@zc.a Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f56667b.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i4 = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int lastIndexOf = this.f56667b.get(nextIndex).lastIndexOf(listIterator.next());
            if (lastIndexOf == -1) {
                return -1;
            }
            i4 += lastIndexOf * this.f56668c[nextIndex + 1];
        }
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f56668c[0];
    }
}
