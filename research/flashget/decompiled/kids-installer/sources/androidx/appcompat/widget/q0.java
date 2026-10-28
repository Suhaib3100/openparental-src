package androidx.appcompat.widget;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
class q0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f1292i = Integer.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    private int f1293a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f1294b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f1295c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f1296d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f1297e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f1298f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1299g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1300h = false;

    q0() {
    }

    public int a() {
        return this.f1299g ? this.f1293a : this.f1294b;
    }

    public int b() {
        return this.f1293a;
    }

    public int c() {
        return this.f1294b;
    }

    public int d() {
        return this.f1299g ? this.f1294b : this.f1293a;
    }

    public void e(int i5, int i6) {
        this.f1300h = false;
        if (i5 != Integer.MIN_VALUE) {
            this.f1297e = i5;
            this.f1293a = i5;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f1298f = i6;
            this.f1294b = i6;
        }
    }

    public void f(boolean z5) {
        if (z5 == this.f1299g) {
            return;
        }
        this.f1299g = z5;
        if (!this.f1300h) {
            this.f1293a = this.f1297e;
            this.f1294b = this.f1298f;
            return;
        }
        if (z5) {
            int i5 = this.f1296d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = this.f1297e;
            }
            this.f1293a = i5;
            int i6 = this.f1295c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = this.f1298f;
            }
            this.f1294b = i6;
            return;
        }
        int i7 = this.f1295c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = this.f1297e;
        }
        this.f1293a = i7;
        int i8 = this.f1296d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = this.f1298f;
        }
        this.f1294b = i8;
    }

    public void g(int i5, int i6) {
        this.f1295c = i5;
        this.f1296d = i6;
        this.f1300h = true;
        if (this.f1299g) {
            if (i6 != Integer.MIN_VALUE) {
                this.f1293a = i6;
            }
            if (i5 != Integer.MIN_VALUE) {
                this.f1294b = i5;
                return;
            }
            return;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f1293a = i5;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f1294b = i6;
        }
    }
}
