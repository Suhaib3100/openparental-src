package androidx.collection;

import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public class f<E> implements Cloneable {

    /* renamed from: s, reason: collision with root package name */
    private static final Object f1507s = new Object();

    /* renamed from: o, reason: collision with root package name */
    private boolean f1508o;

    /* renamed from: p, reason: collision with root package name */
    private long[] f1509p;

    /* renamed from: q, reason: collision with root package name */
    private Object[] f1510q;

    /* renamed from: r, reason: collision with root package name */
    private int f1511r;

    public f() {
        this(10);
    }

    private void i() {
        int i5 = this.f1511r;
        long[] jArr = this.f1509p;
        Object[] objArr = this.f1510q;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (obj != f1507s) {
                if (i7 != i6) {
                    jArr[i6] = jArr[i7];
                    objArr[i6] = obj;
                    objArr[i7] = null;
                }
                i6++;
            }
        }
        this.f1508o = false;
        this.f1511r = i6;
    }

    public int A() {
        if (this.f1508o) {
            i();
        }
        return this.f1511r;
    }

    public E B(int i5) {
        if (this.f1508o) {
            i();
        }
        return (E) this.f1510q[i5];
    }

    public void a(long j5, E e6) {
        int i5 = this.f1511r;
        if (i5 != 0 && j5 <= this.f1509p[i5 - 1]) {
            p(j5, e6);
            return;
        }
        if (this.f1508o && i5 >= this.f1509p.length) {
            i();
        }
        int i6 = this.f1511r;
        if (i6 >= this.f1509p.length) {
            int f6 = e.f(i6 + 1);
            long[] jArr = new long[f6];
            Object[] objArr = new Object[f6];
            long[] jArr2 = this.f1509p;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1510q;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1509p = jArr;
            this.f1510q = objArr;
        }
        this.f1509p[i6] = j5;
        this.f1510q[i6] = e6;
        this.f1511r = i6 + 1;
    }

    public void b() {
        int i5 = this.f1511r;
        Object[] objArr = this.f1510q;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        this.f1511r = 0;
        this.f1508o = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f1509p = (long[]) this.f1509p.clone();
            fVar.f1510q = (Object[]) this.f1510q.clone();
            return fVar;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public boolean d(long j5) {
        return l(j5) >= 0;
    }

    public boolean e(E e6) {
        return m(e6) >= 0;
    }

    @Deprecated
    public void f(long j5) {
        u(j5);
    }

    @q0
    public E j(long j5) {
        return k(j5, null);
    }

    public E k(long j5, E e6) {
        E e7;
        int b6 = e.b(this.f1509p, this.f1511r, j5);
        return (b6 < 0 || (e7 = (E) this.f1510q[b6]) == f1507s) ? e6 : e7;
    }

    public int l(long j5) {
        if (this.f1508o) {
            i();
        }
        return e.b(this.f1509p, this.f1511r, j5);
    }

    public int m(E e6) {
        if (this.f1508o) {
            i();
        }
        for (int i5 = 0; i5 < this.f1511r; i5++) {
            if (this.f1510q[i5] == e6) {
                return i5;
            }
        }
        return -1;
    }

    public boolean n() {
        return A() == 0;
    }

    public long o(int i5) {
        if (this.f1508o) {
            i();
        }
        return this.f1509p[i5];
    }

    public void p(long j5, E e6) {
        int b6 = e.b(this.f1509p, this.f1511r, j5);
        if (b6 >= 0) {
            this.f1510q[b6] = e6;
            return;
        }
        int i5 = ~b6;
        int i6 = this.f1511r;
        if (i5 < i6) {
            Object[] objArr = this.f1510q;
            if (objArr[i5] == f1507s) {
                this.f1509p[i5] = j5;
                objArr[i5] = e6;
                return;
            }
        }
        if (this.f1508o && i6 >= this.f1509p.length) {
            i();
            i5 = ~e.b(this.f1509p, this.f1511r, j5);
        }
        int i7 = this.f1511r;
        if (i7 >= this.f1509p.length) {
            int f6 = e.f(i7 + 1);
            long[] jArr = new long[f6];
            Object[] objArr2 = new Object[f6];
            long[] jArr2 = this.f1509p;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1510q;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1509p = jArr;
            this.f1510q = objArr2;
        }
        int i8 = this.f1511r;
        if (i8 - i5 != 0) {
            long[] jArr3 = this.f1509p;
            int i9 = i5 + 1;
            System.arraycopy(jArr3, i5, jArr3, i9, i8 - i5);
            Object[] objArr4 = this.f1510q;
            System.arraycopy(objArr4, i5, objArr4, i9, this.f1511r - i5);
        }
        this.f1509p[i5] = j5;
        this.f1510q[i5] = e6;
        this.f1511r++;
    }

    public void q(@o0 f<? extends E> fVar) {
        int A = fVar.A();
        for (int i5 = 0; i5 < A; i5++) {
            p(fVar.o(i5), fVar.B(i5));
        }
    }

    @q0
    public E s(long j5, E e6) {
        E j6 = j(j5);
        if (j6 == null) {
            p(j5, e6);
        }
        return j6;
    }

    public String toString() {
        if (A() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1511r * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.f1511r; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(o(i5));
            sb.append('=');
            E B = B(i5);
            if (B != this) {
                sb.append(B);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void u(long j5) {
        int b6 = e.b(this.f1509p, this.f1511r, j5);
        if (b6 >= 0) {
            Object[] objArr = this.f1510q;
            Object obj = objArr[b6];
            Object obj2 = f1507s;
            if (obj != obj2) {
                objArr[b6] = obj2;
                this.f1508o = true;
            }
        }
    }

    public boolean v(long j5, Object obj) {
        int l5 = l(j5);
        if (l5 < 0) {
            return false;
        }
        E B = B(l5);
        if (obj != B && (obj == null || !obj.equals(B))) {
            return false;
        }
        w(l5);
        return true;
    }

    public void w(int i5) {
        Object[] objArr = this.f1510q;
        Object obj = objArr[i5];
        Object obj2 = f1507s;
        if (obj != obj2) {
            objArr[i5] = obj2;
            this.f1508o = true;
        }
    }

    @q0
    public E x(long j5, E e6) {
        int l5 = l(j5);
        if (l5 < 0) {
            return null;
        }
        Object[] objArr = this.f1510q;
        E e7 = (E) objArr[l5];
        objArr[l5] = e6;
        return e7;
    }

    public boolean y(long j5, E e6, E e7) {
        int l5 = l(j5);
        if (l5 < 0) {
            return false;
        }
        Object obj = this.f1510q[l5];
        if (obj != e6 && (e6 == null || !e6.equals(obj))) {
            return false;
        }
        this.f1510q[l5] = e7;
        return true;
    }

    public void z(int i5, E e6) {
        if (this.f1508o) {
            i();
        }
        this.f1510q[i5] = e6;
    }

    public f(int i5) {
        this.f1508o = false;
        if (i5 == 0) {
            this.f1509p = e.f1505b;
            this.f1510q = e.f1506c;
        } else {
            int f6 = e.f(i5);
            this.f1509p = new long[f6];
            this.f1510q = new Object[f6];
        }
    }
}
