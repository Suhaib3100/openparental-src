package androidx.collection;

/* compiled from: CircularArray.java */
/* loaded from: classes.dex */
public final class c<E> {

    /* renamed from: a, reason: collision with root package name */
    private E[] f1496a;

    /* renamed from: b, reason: collision with root package name */
    private int f1497b;

    /* renamed from: c, reason: collision with root package name */
    private int f1498c;

    /* renamed from: d, reason: collision with root package name */
    private int f1499d;

    public c() {
        this(8);
    }

    private void d() {
        E[] eArr = this.f1496a;
        int length = eArr.length;
        int i5 = this.f1497b;
        int i6 = length - i5;
        int i7 = length << 1;
        if (i7 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i7];
        System.arraycopy(eArr, i5, eArr2, 0, i6);
        System.arraycopy(this.f1496a, 0, eArr2, i6, this.f1497b);
        this.f1496a = eArr2;
        this.f1497b = 0;
        this.f1498c = length;
        this.f1499d = i7 - 1;
    }

    public void a(E e6) {
        int i5 = (this.f1497b - 1) & this.f1499d;
        this.f1497b = i5;
        this.f1496a[i5] = e6;
        if (i5 == this.f1498c) {
            d();
        }
    }

    public void b(E e6) {
        E[] eArr = this.f1496a;
        int i5 = this.f1498c;
        eArr[i5] = e6;
        int i6 = this.f1499d & (i5 + 1);
        this.f1498c = i6;
        if (i6 == this.f1497b) {
            d();
        }
    }

    public void c() {
        l(m());
    }

    public E e(int i5) {
        if (i5 < 0 || i5 >= m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f1496a[this.f1499d & (this.f1497b + i5)];
    }

    public E f() {
        int i5 = this.f1497b;
        if (i5 != this.f1498c) {
            return this.f1496a[i5];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E g() {
        int i5 = this.f1497b;
        int i6 = this.f1498c;
        if (i5 != i6) {
            return this.f1496a[(i6 - 1) & this.f1499d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        return this.f1497b == this.f1498c;
    }

    public E i() {
        int i5 = this.f1497b;
        if (i5 == this.f1498c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.f1496a;
        E e6 = eArr[i5];
        eArr[i5] = null;
        this.f1497b = (i5 + 1) & this.f1499d;
        return e6;
    }

    public E j() {
        int i5 = this.f1497b;
        int i6 = this.f1498c;
        if (i5 == i6) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i7 = this.f1499d & (i6 - 1);
        E[] eArr = this.f1496a;
        E e6 = eArr[i7];
        eArr[i7] = null;
        this.f1498c = i7;
        return e6;
    }

    public void k(int i5) {
        int i6;
        if (i5 <= 0) {
            return;
        }
        if (i5 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i7 = this.f1498c;
        int i8 = i5 < i7 ? i7 - i5 : 0;
        int i9 = i8;
        while (true) {
            i6 = this.f1498c;
            if (i9 >= i6) {
                break;
            }
            this.f1496a[i9] = null;
            i9++;
        }
        int i10 = i6 - i8;
        int i11 = i5 - i10;
        this.f1498c = i6 - i10;
        if (i11 > 0) {
            int length = this.f1496a.length;
            this.f1498c = length;
            int i12 = length - i11;
            for (int i13 = i12; i13 < this.f1498c; i13++) {
                this.f1496a[i13] = null;
            }
            this.f1498c = i12;
        }
    }

    public void l(int i5) {
        if (i5 <= 0) {
            return;
        }
        if (i5 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f1496a.length;
        int i6 = this.f1497b;
        if (i5 < length - i6) {
            length = i6 + i5;
        }
        while (i6 < length) {
            this.f1496a[i6] = null;
            i6++;
        }
        int i7 = this.f1497b;
        int i8 = length - i7;
        int i9 = i5 - i8;
        this.f1497b = this.f1499d & (i7 + i8);
        if (i9 > 0) {
            for (int i10 = 0; i10 < i9; i10++) {
                this.f1496a[i10] = null;
            }
            this.f1497b = i9;
        }
    }

    public int m() {
        return (this.f1498c - this.f1497b) & this.f1499d;
    }

    public c(int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i5 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i5 = Integer.bitCount(i5) != 1 ? Integer.highestOneBit(i5 - 1) << 1 : i5;
        this.f1499d = i5 - 1;
        this.f1496a = (E[]) new Object[i5];
    }
}
