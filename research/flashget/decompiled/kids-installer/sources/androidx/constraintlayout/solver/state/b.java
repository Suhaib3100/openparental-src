package androidx.constraintlayout.solver.state;

import androidx.constraintlayout.solver.widgets.e;

/* compiled from: Dimension.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f2293i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f2294j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f2295k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f2296l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static final Object f2297m = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final int f2298a;

    /* renamed from: b, reason: collision with root package name */
    int f2299b;

    /* renamed from: c, reason: collision with root package name */
    int f2300c;

    /* renamed from: d, reason: collision with root package name */
    float f2301d;

    /* renamed from: e, reason: collision with root package name */
    int f2302e;

    /* renamed from: f, reason: collision with root package name */
    float f2303f;

    /* renamed from: g, reason: collision with root package name */
    Object f2304g;

    /* renamed from: h, reason: collision with root package name */
    boolean f2305h;

    /* compiled from: Dimension.java */
    public enum a {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    private b() {
        this.f2298a = -2;
        this.f2299b = 0;
        this.f2300c = Integer.MAX_VALUE;
        this.f2301d = 1.0f;
        this.f2302e = 0;
        this.f2303f = 1.0f;
        this.f2304g = f2294j;
        this.f2305h = false;
    }

    public static b a(int i5) {
        b bVar = new b(f2293i);
        bVar.j(i5);
        return bVar;
    }

    public static b b(Object obj) {
        b bVar = new b(f2293i);
        bVar.k(obj);
        return bVar;
    }

    public static b c() {
        return new b(f2296l);
    }

    public static b d(Object obj, float f6) {
        b bVar = new b(f2297m);
        bVar.f2301d = f6;
        return bVar;
    }

    public static b e() {
        return new b(f2295k);
    }

    public static b f(int i5) {
        b bVar = new b();
        bVar.f2305h = true;
        return bVar;
    }

    public static b g(Object obj) {
        b bVar = new b();
        bVar.w(obj);
        return bVar;
    }

    public static b h() {
        return new b(f2294j);
    }

    public void i(e eVar, androidx.constraintlayout.solver.widgets.e eVar2, int i5) {
        int i6 = 2;
        if (i5 == 0) {
            if (this.f2305h) {
                eVar2.i1(e.b.MATCH_CONSTRAINT);
                Object obj = this.f2304g;
                if (obj == f2294j) {
                    i6 = 1;
                } else if (obj != f2297m) {
                    i6 = 0;
                }
                eVar2.j1(i6, this.f2299b, this.f2300c, this.f2301d);
                return;
            }
            int i7 = this.f2299b;
            if (i7 > 0) {
                eVar2.u1(i7);
            }
            int i8 = this.f2300c;
            if (i8 < Integer.MAX_VALUE) {
                eVar2.r1(i8);
            }
            Object obj2 = this.f2304g;
            if (obj2 == f2294j) {
                eVar2.i1(e.b.WRAP_CONTENT);
                return;
            }
            if (obj2 == f2296l) {
                eVar2.i1(e.b.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    eVar2.i1(e.b.FIXED);
                    eVar2.H1(this.f2302e);
                    return;
                }
                return;
            }
        }
        if (this.f2305h) {
            eVar2.D1(e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f2304g;
            if (obj3 == f2294j) {
                i6 = 1;
            } else if (obj3 != f2297m) {
                i6 = 0;
            }
            eVar2.E1(i6, this.f2299b, this.f2300c, this.f2301d);
            return;
        }
        int i9 = this.f2299b;
        if (i9 > 0) {
            eVar2.t1(i9);
        }
        int i10 = this.f2300c;
        if (i10 < Integer.MAX_VALUE) {
            eVar2.q1(i10);
        }
        Object obj4 = this.f2304g;
        if (obj4 == f2294j) {
            eVar2.D1(e.b.WRAP_CONTENT);
            return;
        }
        if (obj4 == f2296l) {
            eVar2.D1(e.b.MATCH_PARENT);
        } else if (obj4 == null) {
            eVar2.D1(e.b.FIXED);
            eVar2.d1(this.f2302e);
        }
    }

    public b j(int i5) {
        this.f2304g = null;
        this.f2302e = i5;
        return this;
    }

    public b k(Object obj) {
        this.f2304g = obj;
        if (obj instanceof Integer) {
            this.f2302e = ((Integer) obj).intValue();
            this.f2304g = null;
        }
        return this;
    }

    float l() {
        return this.f2303f;
    }

    int m() {
        return this.f2302e;
    }

    public b n(int i5) {
        if (this.f2300c >= 0) {
            this.f2300c = i5;
        }
        return this;
    }

    public b o(Object obj) {
        Object obj2 = f2294j;
        if (obj == obj2 && this.f2305h) {
            this.f2304g = obj2;
            this.f2300c = Integer.MAX_VALUE;
        }
        return this;
    }

    public b p(int i5) {
        if (i5 >= 0) {
            this.f2299b = i5;
        }
        return this;
    }

    public b q(Object obj) {
        if (obj == f2294j) {
            this.f2299b = -2;
        }
        return this;
    }

    public b r(Object obj, float f6) {
        this.f2301d = f6;
        return this;
    }

    public b s(float f6) {
        return this;
    }

    void t(float f6) {
        this.f2303f = f6;
    }

    void u(int i5) {
        this.f2305h = false;
        this.f2304g = null;
        this.f2302e = i5;
    }

    public b v(int i5) {
        this.f2305h = true;
        return this;
    }

    public b w(Object obj) {
        this.f2304g = obj;
        this.f2305h = true;
        return this;
    }

    private b(Object obj) {
        this.f2298a = -2;
        this.f2299b = 0;
        this.f2300c = Integer.MAX_VALUE;
        this.f2301d = 1.0f;
        this.f2302e = 0;
        this.f2303f = 1.0f;
        this.f2305h = false;
        this.f2304g = obj;
    }
}
