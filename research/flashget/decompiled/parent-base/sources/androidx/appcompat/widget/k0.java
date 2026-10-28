package androidx.appcompat.widget;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
class k0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f1891i = Integer.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    private int f1892a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f1893b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f1894c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f1895d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f1896e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f1897f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1898g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1899h = false;

    k0() {
    }

    public int a() {
        return this.f1898g ? this.f1892a : this.f1893b;
    }

    public int b() {
        return this.f1892a;
    }

    public int c() {
        return this.f1893b;
    }

    public int d() {
        return this.f1898g ? this.f1893b : this.f1892a;
    }

    public void e(int i4, int i5) {
        this.f1899h = false;
        if (i4 != Integer.MIN_VALUE) {
            this.f1896e = i4;
            this.f1892a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f1897f = i5;
            this.f1893b = i5;
        }
    }

    public void f(boolean z4) {
        if (z4 == this.f1898g) {
            return;
        }
        this.f1898g = z4;
        if (!this.f1899h) {
            this.f1892a = this.f1896e;
            this.f1893b = this.f1897f;
            return;
        }
        if (z4) {
            int i4 = this.f1895d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f1896e;
            }
            this.f1892a = i4;
            int i5 = this.f1894c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = this.f1897f;
            }
            this.f1893b = i5;
            return;
        }
        int i6 = this.f1894c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = this.f1896e;
        }
        this.f1892a = i6;
        int i7 = this.f1895d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = this.f1897f;
        }
        this.f1893b = i7;
    }

    public void g(int i4, int i5) {
        this.f1894c = i4;
        this.f1895d = i5;
        this.f1899h = true;
        if (this.f1898g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f1892a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f1893b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f1892a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f1893b = i5;
        }
    }
}
