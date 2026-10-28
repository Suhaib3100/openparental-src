package androidx.collection;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.java */
/* loaded from: classes.dex */
public class i<K, V> {

    /* renamed from: r, reason: collision with root package name */
    private static final boolean f1527r = false;

    /* renamed from: s, reason: collision with root package name */
    private static final String f1528s = "ArrayMap";

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f1529t = true;

    /* renamed from: u, reason: collision with root package name */
    private static final int f1530u = 4;

    /* renamed from: v, reason: collision with root package name */
    private static final int f1531v = 10;

    /* renamed from: w, reason: collision with root package name */
    @q0
    static Object[] f1532w;

    /* renamed from: x, reason: collision with root package name */
    static int f1533x;

    /* renamed from: y, reason: collision with root package name */
    @q0
    static Object[] f1534y;

    /* renamed from: z, reason: collision with root package name */
    static int f1535z;

    /* renamed from: o, reason: collision with root package name */
    int[] f1536o;

    /* renamed from: p, reason: collision with root package name */
    Object[] f1537p;

    /* renamed from: q, reason: collision with root package name */
    int f1538q;

    public i() {
        this.f1536o = e.f1504a;
        this.f1537p = e.f1506c;
        this.f1538q = 0;
    }

    private void c(int i5) {
        if (i5 == 8) {
            synchronized (i.class) {
                Object[] objArr = f1534y;
                if (objArr != null) {
                    this.f1537p = objArr;
                    f1534y = (Object[]) objArr[0];
                    this.f1536o = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1535z--;
                    return;
                }
            }
        } else if (i5 == 4) {
            synchronized (i.class) {
                Object[] objArr2 = f1532w;
                if (objArr2 != null) {
                    this.f1537p = objArr2;
                    f1532w = (Object[]) objArr2[0];
                    this.f1536o = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1533x--;
                    return;
                }
            }
        }
        this.f1536o = new int[i5];
        this.f1537p = new Object[i5 << 1];
    }

    private static int d(int[] iArr, int i5, int i6) {
        try {
            return e.a(iArr, i5, i6);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void f(int[] iArr, Object[] objArr, int i5) {
        if (iArr.length == 8) {
            synchronized (i.class) {
                if (f1535z < 10) {
                    objArr[0] = f1534y;
                    objArr[1] = iArr;
                    for (int i6 = (i5 << 1) - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    f1534y = objArr;
                    f1535z++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (i.class) {
                if (f1533x < 10) {
                    objArr[0] = f1532w;
                    objArr[1] = iArr;
                    for (int i7 = (i5 << 1) - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    f1532w = objArr;
                    f1533x++;
                }
            }
        }
    }

    public void clear() {
        int i5 = this.f1538q;
        if (i5 > 0) {
            int[] iArr = this.f1536o;
            Object[] objArr = this.f1537p;
            this.f1536o = e.f1504a;
            this.f1537p = e.f1506c;
            this.f1538q = 0;
            f(iArr, objArr, i5);
        }
        if (this.f1538q > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@q0 Object obj) {
        if (h(obj) >= 0) {
            return f1529t;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (k(obj) >= 0) {
            return f1529t;
        }
        return false;
    }

    public void e(int i5) {
        int i6 = this.f1538q;
        int[] iArr = this.f1536o;
        if (iArr.length < i5) {
            Object[] objArr = this.f1537p;
            c(i5);
            if (this.f1538q > 0) {
                System.arraycopy(iArr, 0, this.f1536o, 0, i6);
                System.arraycopy(objArr, 0, this.f1537p, 0, i6 << 1);
            }
            f(iArr, objArr, i6);
        }
        if (this.f1538q != i6) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return f1529t;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (size() != iVar.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f1538q; i5++) {
                try {
                    K l5 = l(i5);
                    V q5 = q(i5);
                    Object obj2 = iVar.get(l5);
                    if (q5 == null) {
                        if (obj2 != null || !iVar.containsKey(l5)) {
                            return false;
                        }
                    } else if (!q5.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return f1529t;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i6 = 0; i6 < this.f1538q; i6++) {
                try {
                    K l6 = l(i6);
                    V q6 = q(i6);
                    Object obj3 = map.get(l6);
                    if (q6 == null) {
                        if (obj3 != null || !map.containsKey(l6)) {
                            return false;
                        }
                    } else if (!q6.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return f1529t;
        }
        return false;
    }

    int g(Object obj, int i5) {
        int i6 = this.f1538q;
        if (i6 == 0) {
            return -1;
        }
        int d6 = d(this.f1536o, i6, i5);
        if (d6 < 0) {
            return d6;
        }
        if (obj.equals(this.f1537p[d6 << 1])) {
            return d6;
        }
        int i7 = d6 + 1;
        while (i7 < i6 && this.f1536o[i7] == i5) {
            if (obj.equals(this.f1537p[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = d6 - 1; i8 >= 0 && this.f1536o[i8] == i5; i8--) {
            if (obj.equals(this.f1537p[i8 << 1])) {
                return i8;
            }
        }
        return ~i7;
    }

    @q0
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v5) {
        int h5 = h(obj);
        return h5 >= 0 ? (V) this.f1537p[(h5 << 1) + 1] : v5;
    }

    public int h(@q0 Object obj) {
        return obj == null ? j() : g(obj, obj.hashCode());
    }

    public int hashCode() {
        int[] iArr = this.f1536o;
        Object[] objArr = this.f1537p;
        int i5 = this.f1538q;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            Object obj = objArr[i6];
            i8 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i7];
            i7++;
            i6 += 2;
        }
        return i8;
    }

    public boolean isEmpty() {
        if (this.f1538q <= 0) {
            return f1529t;
        }
        return false;
    }

    int j() {
        int i5 = this.f1538q;
        if (i5 == 0) {
            return -1;
        }
        int d6 = d(this.f1536o, i5, 0);
        if (d6 < 0) {
            return d6;
        }
        if (this.f1537p[d6 << 1] == null) {
            return d6;
        }
        int i6 = d6 + 1;
        while (i6 < i5 && this.f1536o[i6] == 0) {
            if (this.f1537p[i6 << 1] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = d6 - 1; i7 >= 0 && this.f1536o[i7] == 0; i7--) {
            if (this.f1537p[i7 << 1] == null) {
                return i7;
            }
        }
        return ~i6;
    }

    int k(Object obj) {
        int i5 = this.f1538q * 2;
        Object[] objArr = this.f1537p;
        if (obj == null) {
            for (int i6 = 1; i6 < i5; i6 += 2) {
                if (objArr[i6] == null) {
                    return i6 >> 1;
                }
            }
            return -1;
        }
        for (int i7 = 1; i7 < i5; i7 += 2) {
            if (obj.equals(objArr[i7])) {
                return i7 >> 1;
            }
        }
        return -1;
    }

    public K l(int i5) {
        return (K) this.f1537p[i5 << 1];
    }

    public void m(@o0 i<? extends K, ? extends V> iVar) {
        int i5 = iVar.f1538q;
        e(this.f1538q + i5);
        if (this.f1538q != 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                put(iVar.l(i6), iVar.q(i6));
            }
        } else if (i5 > 0) {
            System.arraycopy(iVar.f1536o, 0, this.f1536o, 0, i5);
            System.arraycopy(iVar.f1537p, 0, this.f1537p, 0, i5 << 1);
            this.f1538q = i5;
        }
    }

    public V n(int i5) {
        Object[] objArr = this.f1537p;
        int i6 = i5 << 1;
        V v5 = (V) objArr[i6 + 1];
        int i7 = this.f1538q;
        int i8 = 0;
        if (i7 <= 1) {
            f(this.f1536o, objArr, i7);
            this.f1536o = e.f1504a;
            this.f1537p = e.f1506c;
        } else {
            int i9 = i7 - 1;
            int[] iArr = this.f1536o;
            if (iArr.length <= 8 || i7 >= iArr.length / 3) {
                if (i5 < i9) {
                    int i10 = i5 + 1;
                    int i11 = i9 - i5;
                    System.arraycopy(iArr, i10, iArr, i5, i11);
                    Object[] objArr2 = this.f1537p;
                    System.arraycopy(objArr2, i10 << 1, objArr2, i6, i11 << 1);
                }
                Object[] objArr3 = this.f1537p;
                int i12 = i9 << 1;
                objArr3[i12] = null;
                objArr3[i12 + 1] = null;
            } else {
                c(i7 > 8 ? i7 + (i7 >> 1) : 8);
                if (i7 != this.f1538q) {
                    throw new ConcurrentModificationException();
                }
                if (i5 > 0) {
                    System.arraycopy(iArr, 0, this.f1536o, 0, i5);
                    System.arraycopy(objArr, 0, this.f1537p, 0, i6);
                }
                if (i5 < i9) {
                    int i13 = i5 + 1;
                    int i14 = i9 - i5;
                    System.arraycopy(iArr, i13, this.f1536o, i5, i14);
                    System.arraycopy(objArr, i13 << 1, this.f1537p, i6, i14 << 1);
                }
            }
            i8 = i9;
        }
        if (i7 != this.f1538q) {
            throw new ConcurrentModificationException();
        }
        this.f1538q = i8;
        return v5;
    }

    public V p(int i5, V v5) {
        int i6 = (i5 << 1) + 1;
        Object[] objArr = this.f1537p;
        V v6 = (V) objArr[i6];
        objArr[i6] = v5;
        return v6;
    }

    @q0
    public V put(K k5, V v5) {
        int i5;
        int g5;
        int i6 = this.f1538q;
        if (k5 == null) {
            g5 = j();
            i5 = 0;
        } else {
            int hashCode = k5.hashCode();
            i5 = hashCode;
            g5 = g(k5, hashCode);
        }
        if (g5 >= 0) {
            int i7 = (g5 << 1) + 1;
            Object[] objArr = this.f1537p;
            V v6 = (V) objArr[i7];
            objArr[i7] = v5;
            return v6;
        }
        int i8 = ~g5;
        int[] iArr = this.f1536o;
        if (i6 >= iArr.length) {
            int i9 = 8;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i9 = 4;
            }
            Object[] objArr2 = this.f1537p;
            c(i9);
            if (i6 != this.f1538q) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1536o;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1537p, 0, objArr2.length);
            }
            f(iArr, objArr2, i6);
        }
        if (i8 < i6) {
            int[] iArr3 = this.f1536o;
            int i10 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i10, i6 - i8);
            Object[] objArr3 = this.f1537p;
            System.arraycopy(objArr3, i8 << 1, objArr3, i10 << 1, (this.f1538q - i8) << 1);
        }
        int i11 = this.f1538q;
        if (i6 == i11) {
            int[] iArr4 = this.f1536o;
            if (i8 < iArr4.length) {
                iArr4[i8] = i5;
                Object[] objArr4 = this.f1537p;
                int i12 = i8 << 1;
                objArr4[i12] = k5;
                objArr4[i12 + 1] = v5;
                this.f1538q = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @q0
    public V putIfAbsent(K k5, V v5) {
        V v6 = get(k5);
        return v6 == null ? put(k5, v5) : v6;
    }

    public V q(int i5) {
        return (V) this.f1537p[(i5 << 1) + 1];
    }

    @q0
    public V remove(Object obj) {
        int h5 = h(obj);
        if (h5 >= 0) {
            return n(h5);
        }
        return null;
    }

    @q0
    public V replace(K k5, V v5) {
        int h5 = h(k5);
        if (h5 >= 0) {
            return p(h5, v5);
        }
        return null;
    }

    public int size() {
        return this.f1538q;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1538q * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.f1538q; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            K l5 = l(i5);
            if (l5 != this) {
                sb.append(l5);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V q5 = q(i5);
            if (q5 != this) {
                sb.append(q5);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int h5 = h(obj);
        if (h5 < 0) {
            return false;
        }
        V q5 = q(h5);
        if (obj2 != q5 && (obj2 == null || !obj2.equals(q5))) {
            return false;
        }
        n(h5);
        return f1529t;
    }

    public boolean replace(K k5, V v5, V v6) {
        int h5 = h(k5);
        if (h5 < 0) {
            return false;
        }
        V q5 = q(h5);
        if (q5 != v5 && (v5 == null || !v5.equals(q5))) {
            return false;
        }
        p(h5, v6);
        return f1529t;
    }

    public i(int i5) {
        if (i5 == 0) {
            this.f1536o = e.f1504a;
            this.f1537p = e.f1506c;
        } else {
            c(i5);
        }
        this.f1538q = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(i<K, V> iVar) {
        this();
        if (iVar != 0) {
            m(iVar);
        }
    }
}
