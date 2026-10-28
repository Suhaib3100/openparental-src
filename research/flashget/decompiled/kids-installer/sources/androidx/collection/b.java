package androidx.collection;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    @q0
    private static Object[] A = null;
    private static int B = 0;

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f1483s = false;

    /* renamed from: t, reason: collision with root package name */
    private static final String f1484t = "ArraySet";

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f1485u = new int[0];

    /* renamed from: v, reason: collision with root package name */
    private static final Object[] f1486v = new Object[0];

    /* renamed from: w, reason: collision with root package name */
    private static final int f1487w = 4;

    /* renamed from: x, reason: collision with root package name */
    private static final int f1488x = 10;

    /* renamed from: y, reason: collision with root package name */
    @q0
    private static Object[] f1489y;

    /* renamed from: z, reason: collision with root package name */
    private static int f1490z;

    /* renamed from: o, reason: collision with root package name */
    private int[] f1491o;

    /* renamed from: p, reason: collision with root package name */
    Object[] f1492p;

    /* renamed from: q, reason: collision with root package name */
    int f1493q;

    /* renamed from: r, reason: collision with root package name */
    private h<E, E> f1494r;

    /* compiled from: ArraySet.java */
    /* loaded from: classes2.dex */
    class a extends h<E, E> {
        a() {
        }

        @Override // androidx.collection.h
        protected void a() {
            b.this.clear();
        }

        @Override // androidx.collection.h
        protected Object b(int i5, int i6) {
            return b.this.f1492p[i5];
        }

        @Override // androidx.collection.h
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.h
        protected int d() {
            return b.this.f1493q;
        }

        @Override // androidx.collection.h
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.h
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.h
        protected void g(E e6, E e7) {
            b.this.add(e6);
        }

        @Override // androidx.collection.h
        protected void h(int i5) {
            b.this.r(i5);
        }

        @Override // androidx.collection.h
        protected E i(int i5, E e6) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void f(int i5) {
        if (i5 == 8) {
            synchronized (b.class) {
                Object[] objArr = A;
                if (objArr != null) {
                    this.f1492p = objArr;
                    A = (Object[]) objArr[0];
                    this.f1491o = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    B--;
                    return;
                }
            }
        } else if (i5 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f1489y;
                if (objArr2 != null) {
                    this.f1492p = objArr2;
                    f1489y = (Object[]) objArr2[0];
                    this.f1491o = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1490z--;
                    return;
                }
            }
        }
        this.f1491o = new int[i5];
        this.f1492p = new Object[i5];
    }

    private static void h(int[] iArr, Object[] objArr, int i5) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (B < 10) {
                    objArr[0] = A;
                    objArr[1] = iArr;
                    for (int i6 = i5 - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    A = objArr;
                    B++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f1490z < 10) {
                    objArr[0] = f1489y;
                    objArr[1] = iArr;
                    for (int i7 = i5 - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    f1489y = objArr;
                    f1490z++;
                }
            }
        }
    }

    private h<E, E> i() {
        if (this.f1494r == null) {
            this.f1494r = new a();
        }
        return this.f1494r;
    }

    private int o(Object obj, int i5) {
        int i6 = this.f1493q;
        if (i6 == 0) {
            return -1;
        }
        int a6 = e.a(this.f1491o, i6, i5);
        if (a6 < 0) {
            return a6;
        }
        if (obj.equals(this.f1492p[a6])) {
            return a6;
        }
        int i7 = a6 + 1;
        while (i7 < i6 && this.f1491o[i7] == i5) {
            if (obj.equals(this.f1492p[i7])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = a6 - 1; i8 >= 0 && this.f1491o[i8] == i5; i8--) {
            if (obj.equals(this.f1492p[i8])) {
                return i8;
            }
        }
        return ~i7;
    }

    private int p() {
        int i5 = this.f1493q;
        if (i5 == 0) {
            return -1;
        }
        int a6 = e.a(this.f1491o, i5, 0);
        if (a6 < 0) {
            return a6;
        }
        if (this.f1492p[a6] == null) {
            return a6;
        }
        int i6 = a6 + 1;
        while (i6 < i5 && this.f1491o[i6] == 0) {
            if (this.f1492p[i6] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = a6 - 1; i7 >= 0 && this.f1491o[i7] == 0; i7--) {
            if (this.f1492p[i7] == null) {
                return i7;
            }
        }
        return ~i6;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@q0 E e6) {
        int i5;
        int o5;
        if (e6 == null) {
            o5 = p();
            i5 = 0;
        } else {
            int hashCode = e6.hashCode();
            i5 = hashCode;
            o5 = o(e6, hashCode);
        }
        if (o5 >= 0) {
            return false;
        }
        int i6 = ~o5;
        int i7 = this.f1493q;
        int[] iArr = this.f1491o;
        if (i7 >= iArr.length) {
            int i8 = 8;
            if (i7 >= 8) {
                i8 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i8 = 4;
            }
            Object[] objArr = this.f1492p;
            f(i8);
            int[] iArr2 = this.f1491o;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1492p, 0, objArr.length);
            }
            h(iArr, objArr, this.f1493q);
        }
        int i9 = this.f1493q;
        if (i6 < i9) {
            int[] iArr3 = this.f1491o;
            int i10 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i10, i9 - i6);
            Object[] objArr2 = this.f1492p;
            System.arraycopy(objArr2, i6, objArr2, i10, this.f1493q - i6);
        }
        this.f1491o[i6] = i5;
        this.f1492p[i6] = e6;
        this.f1493q++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@o0 Collection<? extends E> collection) {
        g(collection.size() + this.f1493q);
        Iterator<? extends E> it = collection.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= add(it.next());
        }
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(@o0 b<? extends E> bVar) {
        int i5 = bVar.f1493q;
        g(this.f1493q + i5);
        if (this.f1493q != 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                add(bVar.f1492p[i6]);
            }
        } else if (i5 > 0) {
            System.arraycopy(bVar.f1491o, 0, this.f1491o, 0, i5);
            System.arraycopy(bVar.f1492p, 0, this.f1492p, 0, i5);
            this.f1493q = i5;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i5 = this.f1493q;
        if (i5 != 0) {
            h(this.f1491o, this.f1492p, i5);
            this.f1491o = f1485u;
            this.f1492p = f1486v;
            this.f1493q = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@q0 Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@o0 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f1493q != set.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f1493q; i5++) {
                try {
                    if (!set.contains(this.f1492p[i5])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public void g(int i5) {
        int[] iArr = this.f1491o;
        if (iArr.length < i5) {
            Object[] objArr = this.f1492p;
            f(i5);
            int i6 = this.f1493q;
            if (i6 > 0) {
                System.arraycopy(iArr, 0, this.f1491o, 0, i6);
                System.arraycopy(objArr, 0, this.f1492p, 0, this.f1493q);
            }
            h(iArr, objArr, this.f1493q);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1491o;
        int i5 = this.f1493q;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += iArr[i7];
        }
        return i6;
    }

    public int indexOf(@q0 Object obj) {
        return obj == null ? p() : o(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1493q <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return i().m().iterator();
    }

    public boolean q(@o0 b<? extends E> bVar) {
        int i5 = bVar.f1493q;
        int i6 = this.f1493q;
        for (int i7 = 0; i7 < i5; i7++) {
            remove(bVar.f1492p[i7]);
        }
        return i6 != this.f1493q;
    }

    public E r(int i5) {
        Object[] objArr = this.f1492p;
        E e6 = (E) objArr[i5];
        int i6 = this.f1493q;
        if (i6 <= 1) {
            h(this.f1491o, objArr, i6);
            this.f1491o = f1485u;
            this.f1492p = f1486v;
            this.f1493q = 0;
        } else {
            int[] iArr = this.f1491o;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                int i7 = i6 - 1;
                this.f1493q = i7;
                if (i5 < i7) {
                    int i8 = i5 + 1;
                    System.arraycopy(iArr, i8, iArr, i5, i7 - i5);
                    Object[] objArr2 = this.f1492p;
                    System.arraycopy(objArr2, i8, objArr2, i5, this.f1493q - i5);
                }
                this.f1492p[this.f1493q] = null;
            } else {
                f(i6 > 8 ? i6 + (i6 >> 1) : 8);
                this.f1493q--;
                if (i5 > 0) {
                    System.arraycopy(iArr, 0, this.f1491o, 0, i5);
                    System.arraycopy(objArr, 0, this.f1492p, 0, i5);
                }
                int i9 = this.f1493q;
                if (i5 < i9) {
                    int i10 = i5 + 1;
                    System.arraycopy(iArr, i10, this.f1491o, i5, i9 - i5);
                    System.arraycopy(objArr, i10, this.f1492p, i5, this.f1493q - i5);
                }
            }
        }
        return e6;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@q0 Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        r(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@o0 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= remove(it.next());
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@o0 Collection<?> collection) {
        boolean z5 = false;
        for (int i5 = this.f1493q - 1; i5 >= 0; i5--) {
            if (!collection.contains(this.f1492p[i5])) {
                r(i5);
                z5 = true;
            }
        }
        return z5;
    }

    @q0
    public E s(int i5) {
        return (E) this.f1492p[i5];
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1493q;
    }

    @Override // java.util.Collection, java.util.Set
    @o0
    public Object[] toArray() {
        int i5 = this.f1493q;
        Object[] objArr = new Object[i5];
        System.arraycopy(this.f1492p, 0, objArr, 0, i5);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1493q * 14);
        sb.append('{');
        for (int i5 = 0; i5 < this.f1493q; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1492p[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i5) {
        if (i5 == 0) {
            this.f1491o = f1485u;
            this.f1492p = f1486v;
        } else {
            f(i5);
        }
        this.f1493q = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @o0
    public <T> T[] toArray(@o0 T[] tArr) {
        if (tArr.length < this.f1493q) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1493q));
        }
        System.arraycopy(this.f1492p, 0, tArr, 0, this.f1493q);
        int length = tArr.length;
        int i5 = this.f1493q;
        if (length > i5) {
            tArr[i5] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@q0 b<E> bVar) {
        this();
        if (bVar != 0) {
            b(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@q0 Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }
}
