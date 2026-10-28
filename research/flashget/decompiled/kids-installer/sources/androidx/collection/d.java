package androidx.collection;

/* compiled from: CircularIntArray.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private int[] f1500a;

    /* renamed from: b, reason: collision with root package name */
    private int f1501b;

    /* renamed from: c, reason: collision with root package name */
    private int f1502c;

    /* renamed from: d, reason: collision with root package name */
    private int f1503d;

    public d() {
        this(8);
    }

    private void d() {
        int[] iArr = this.f1500a;
        int length = iArr.length;
        int i5 = this.f1501b;
        int i6 = length - i5;
        int i7 = length << 1;
        if (i7 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i7];
        System.arraycopy(iArr, i5, iArr2, 0, i6);
        System.arraycopy(this.f1500a, 0, iArr2, i6, this.f1501b);
        this.f1500a = iArr2;
        this.f1501b = 0;
        this.f1502c = length;
        this.f1503d = i7 - 1;
    }

    public void a(int i5) {
        int i6 = (this.f1501b - 1) & this.f1503d;
        this.f1501b = i6;
        this.f1500a[i6] = i5;
        if (i6 == this.f1502c) {
            d();
        }
    }

    public void b(int i5) {
        int[] iArr = this.f1500a;
        int i6 = this.f1502c;
        iArr[i6] = i5;
        int i7 = this.f1503d & (i6 + 1);
        this.f1502c = i7;
        if (i7 == this.f1501b) {
            d();
        }
    }

    public void c() {
        this.f1502c = this.f1501b;
    }

    public int e(int i5) {
        if (i5 < 0 || i5 >= m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f1500a[this.f1503d & (this.f1501b + i5)];
    }

    public int f() {
        int i5 = this.f1501b;
        if (i5 != this.f1502c) {
            return this.f1500a[i5];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int g() {
        int i5 = this.f1501b;
        int i6 = this.f1502c;
        if (i5 != i6) {
            return this.f1500a[(i6 - 1) & this.f1503d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        return this.f1501b == this.f1502c;
    }

    public int i() {
        int i5 = this.f1501b;
        if (i5 == this.f1502c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = this.f1500a[i5];
        this.f1501b = (i5 + 1) & this.f1503d;
        return i6;
    }

    public int j() {
        int i5 = this.f1501b;
        int i6 = this.f1502c;
        if (i5 == i6) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i7 = this.f1503d & (i6 - 1);
        int i8 = this.f1500a[i7];
        this.f1502c = i7;
        return i8;
    }

    public void k(int i5) {
        if (i5 <= 0) {
            return;
        }
        if (i5 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f1502c = this.f1503d & (this.f1502c - i5);
    }

    public void l(int i5) {
        if (i5 <= 0) {
            return;
        }
        if (i5 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f1501b = this.f1503d & (this.f1501b + i5);
    }

    public int m() {
        return (this.f1502c - this.f1501b) & this.f1503d;
    }

    public d(int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i5 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i5 = Integer.bitCount(i5) != 1 ? Integer.highestOneBit(i5 - 1) << 1 : i5;
        this.f1503d = i5 - 1;
        this.f1500a = new int[i5];
    }
}
