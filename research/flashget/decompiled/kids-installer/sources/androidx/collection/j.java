package androidx.collection;

import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: SparseArrayCompat.java */
/* loaded from: classes.dex */
public class j<E> implements Cloneable {

    /* renamed from: s, reason: collision with root package name */
    private static final Object f1539s = new Object();

    /* renamed from: o, reason: collision with root package name */
    private boolean f1540o;

    /* renamed from: p, reason: collision with root package name */
    private int[] f1541p;

    /* renamed from: q, reason: collision with root package name */
    private Object[] f1542q;

    /* renamed from: r, reason: collision with root package name */
    private int f1543r;

    public j() {
        this(10);
    }

    private void i() {
        int i5 = this.f1543r;
        int[] iArr = this.f1541p;
        Object[] objArr = this.f1542q;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (obj != f1539s) {
                if (i7 != i6) {
                    iArr[i6] = iArr[i7];
                    objArr[i6] = obj;
                    objArr[i7] = null;
                }
                i6++;
            }
        }
        this.f1540o = false;
        this.f1543r = i6;
    }

    public void A(int i5, E e6) {
        if (this.f1540o) {
            i();
        }
        this.f1542q[i5] = e6;
    }

    public int B() {
        if (this.f1540o) {
            i();
        }
        return this.f1543r;
    }

    public E C(int i5) {
        if (this.f1540o) {
            i();
        }
        return (E) this.f1542q[i5];
    }

    public void a(int i5, E e6) {
        int i6 = this.f1543r;
        if (i6 != 0 && i5 <= this.f1541p[i6 - 1]) {
            p(i5, e6);
            return;
        }
        if (this.f1540o && i6 >= this.f1541p.length) {
            i();
        }
        int i7 = this.f1543r;
        if (i7 >= this.f1541p.length) {
            int e7 = e.e(i7 + 1);
            int[] iArr = new int[e7];
            Object[] objArr = new Object[e7];
            int[] iArr2 = this.f1541p;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1542q;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1541p = iArr;
            this.f1542q = objArr;
        }
        this.f1541p[i7] = i5;
        this.f1542q[i7] = e6;
        this.f1543r = i7 + 1;
    }

    public void b() {
        int i5 = this.f1543r;
        Object[] objArr = this.f1542q;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        this.f1543r = 0;
        this.f1540o = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j<E> clone() {
        try {
            j<E> jVar = (j) super.clone();
            jVar.f1541p = (int[]) this.f1541p.clone();
            jVar.f1542q = (Object[]) this.f1542q.clone();
            return jVar;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public boolean d(int i5) {
        return l(i5) >= 0;
    }

    public boolean e(E e6) {
        return m(e6) >= 0;
    }

    @Deprecated
    public void f(int i5) {
        u(i5);
    }

    @q0
    public E j(int i5) {
        return k(i5, null);
    }

    public E k(int i5, E e6) {
        E e7;
        int a6 = e.a(this.f1541p, this.f1543r, i5);
        return (a6 < 0 || (e7 = (E) this.f1542q[a6]) == f1539s) ? e6 : e7;
    }

    public int l(int i5) {
        if (this.f1540o) {
            i();
        }
        return e.a(this.f1541p, this.f1543r, i5);
    }

    public int m(E e6) {
        if (this.f1540o) {
            i();
        }
        for (int i5 = 0; i5 < this.f1543r; i5++) {
            if (this.f1542q[i5] == e6) {
                return i5;
            }
        }
        return -1;
    }

    public boolean n() {
        return B() == 0;
    }

    public int o(int i5) {
        if (this.f1540o) {
            i();
        }
        return this.f1541p[i5];
    }

    public void p(int i5, E e6) {
        int a6 = e.a(this.f1541p, this.f1543r, i5);
        if (a6 >= 0) {
            this.f1542q[a6] = e6;
            return;
        }
        int i6 = ~a6;
        int i7 = this.f1543r;
        if (i6 < i7) {
            Object[] objArr = this.f1542q;
            if (objArr[i6] == f1539s) {
                this.f1541p[i6] = i5;
                objArr[i6] = e6;
                return;
            }
        }
        if (this.f1540o && i7 >= this.f1541p.length) {
            i();
            i6 = ~e.a(this.f1541p, this.f1543r, i5);
        }
        int i8 = this.f1543r;
        if (i8 >= this.f1541p.length) {
            int e7 = e.e(i8 + 1);
            int[] iArr = new int[e7];
            Object[] objArr2 = new Object[e7];
            int[] iArr2 = this.f1541p;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1542q;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1541p = iArr;
            this.f1542q = objArr2;
        }
        int i9 = this.f1543r;
        if (i9 - i6 != 0) {
            int[] iArr3 = this.f1541p;
            int i10 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i10, i9 - i6);
            Object[] objArr4 = this.f1542q;
            System.arraycopy(objArr4, i6, objArr4, i10, this.f1543r - i6);
        }
        this.f1541p[i6] = i5;
        this.f1542q[i6] = e6;
        this.f1543r++;
    }

    public void q(@o0 j<? extends E> jVar) {
        int B = jVar.B();
        for (int i5 = 0; i5 < B; i5++) {
            p(jVar.o(i5), jVar.C(i5));
        }
    }

    @q0
    public E s(int i5, E e6) {
        E j5 = j(i5);
        if (j5 == null) {
            p(i5, e6);
        }
        return j5;
    }

    public String toString() {
        if (B() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1543r * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.f1543r; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(o(i5));
            sb.append('=');
            E C = C(i5);
            if (C != this) {
                sb.append(C);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void u(int i5) {
        int a6 = e.a(this.f1541p, this.f1543r, i5);
        if (a6 >= 0) {
            Object[] objArr = this.f1542q;
            Object obj = objArr[a6];
            Object obj2 = f1539s;
            if (obj != obj2) {
                objArr[a6] = obj2;
                this.f1540o = true;
            }
        }
    }

    public boolean v(int i5, Object obj) {
        int l5 = l(i5);
        if (l5 < 0) {
            return false;
        }
        E C = C(l5);
        if (obj != C && (obj == null || !obj.equals(C))) {
            return false;
        }
        w(l5);
        return true;
    }

    public void w(int i5) {
        Object[] objArr = this.f1542q;
        Object obj = objArr[i5];
        Object obj2 = f1539s;
        if (obj != obj2) {
            objArr[i5] = obj2;
            this.f1540o = true;
        }
    }

    public void x(int i5, int i6) {
        int min = Math.min(this.f1543r, i6 + i5);
        while (i5 < min) {
            w(i5);
            i5++;
        }
    }

    @q0
    public E y(int i5, E e6) {
        int l5 = l(i5);
        if (l5 < 0) {
            return null;
        }
        Object[] objArr = this.f1542q;
        E e7 = (E) objArr[l5];
        objArr[l5] = e6;
        return e7;
    }

    public boolean z(int i5, E e6, E e7) {
        int l5 = l(i5);
        if (l5 < 0) {
            return false;
        }
        Object obj = this.f1542q[l5];
        if (obj != e6 && (e6 == null || !e6.equals(obj))) {
            return false;
        }
        this.f1542q[l5] = e7;
        return true;
    }

    public j(int i5) {
        this.f1540o = false;
        if (i5 == 0) {
            this.f1541p = e.f1504a;
            this.f1542q = e.f1506c;
        } else {
            int e6 = e.e(i5);
            this.f1541p = new int[e6];
            this.f1542q = new Object[e6];
        }
    }
}
