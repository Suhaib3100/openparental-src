package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.e;

/* compiled from: Dimension.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f22666i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f22667j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f22668k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f22669l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static final Object f22670m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f22671n = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final int f22672a;

    /* renamed from: b, reason: collision with root package name */
    int f22673b;

    /* renamed from: c, reason: collision with root package name */
    int f22674c;

    /* renamed from: d, reason: collision with root package name */
    float f22675d;

    /* renamed from: e, reason: collision with root package name */
    int f22676e;

    /* renamed from: f, reason: collision with root package name */
    String f22677f;

    /* renamed from: g, reason: collision with root package name */
    Object f22678g;

    /* renamed from: h, reason: collision with root package name */
    boolean f22679h;

    /* compiled from: Dimension.java */
    public enum a {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    private b() {
        this.f22672a = -2;
        this.f22673b = 0;
        this.f22674c = Integer.MAX_VALUE;
        this.f22675d = 1.0f;
        this.f22676e = 0;
        this.f22677f = null;
        this.f22678g = f22667j;
        this.f22679h = false;
    }

    public static b a(int i4) {
        b bVar = new b(f22666i);
        bVar.l(i4);
        return bVar;
    }

    public static b b(Object obj) {
        b bVar = new b(f22666i);
        bVar.m(obj);
        return bVar;
    }

    public static b c() {
        return new b(f22669l);
    }

    public static b d(Object obj, float f4) {
        b bVar = new b(f22670m);
        bVar.f22675d = f4;
        return bVar;
    }

    public static b e(String str) {
        b bVar = new b(f22671n);
        bVar.f22677f = str;
        return bVar;
    }

    public static b f() {
        return new b(f22668k);
    }

    public static b g(int i4) {
        b bVar = new b();
        bVar.v(i4);
        return bVar;
    }

    public static b h(Object obj) {
        b bVar = new b();
        bVar.w(obj);
        return bVar;
    }

    public static b i() {
        return new b(f22667j);
    }

    public void j(h hVar, androidx.constraintlayout.core.widgets.e eVar, int i4) {
        String str = this.f22677f;
        if (str != null) {
            eVar.n1(str);
        }
        int i5 = 2;
        if (i4 == 0) {
            if (this.f22679h) {
                eVar.D1(e.b.MATCH_CONSTRAINT);
                Object obj = this.f22678g;
                if (obj == f22667j) {
                    i5 = 1;
                } else if (obj != f22670m) {
                    i5 = 0;
                }
                eVar.E1(i5, this.f22673b, this.f22674c, this.f22675d);
                return;
            }
            int i6 = this.f22673b;
            if (i6 > 0) {
                eVar.P1(i6);
            }
            int i7 = this.f22674c;
            if (i7 < Integer.MAX_VALUE) {
                eVar.M1(i7);
            }
            Object obj2 = this.f22678g;
            if (obj2 == f22667j) {
                eVar.D1(e.b.WRAP_CONTENT);
                return;
            }
            if (obj2 == f22669l) {
                eVar.D1(e.b.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    eVar.D1(e.b.FIXED);
                    eVar.c2(this.f22676e);
                    return;
                }
                return;
            }
        }
        if (this.f22679h) {
            eVar.Y1(e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f22678g;
            if (obj3 == f22667j) {
                i5 = 1;
            } else if (obj3 != f22670m) {
                i5 = 0;
            }
            eVar.Z1(i5, this.f22673b, this.f22674c, this.f22675d);
            return;
        }
        int i10 = this.f22673b;
        if (i10 > 0) {
            eVar.O1(i10);
        }
        int i11 = this.f22674c;
        if (i11 < Integer.MAX_VALUE) {
            eVar.L1(i11);
        }
        Object obj4 = this.f22678g;
        if (obj4 == f22667j) {
            eVar.Y1(e.b.WRAP_CONTENT);
            return;
        }
        if (obj4 == f22669l) {
            eVar.Y1(e.b.MATCH_PARENT);
        } else if (obj4 == null) {
            eVar.Y1(e.b.FIXED);
            eVar.y1(this.f22676e);
        }
    }

    public boolean k(int i4) {
        return this.f22678g == null && this.f22676e == i4;
    }

    public b l(int i4) {
        this.f22678g = null;
        this.f22676e = i4;
        return this;
    }

    public b m(Object obj) {
        this.f22678g = obj;
        if (obj instanceof Integer) {
            this.f22676e = ((Integer) obj).intValue();
            this.f22678g = null;
        }
        return this;
    }

    int n() {
        return this.f22676e;
    }

    public b o(int i4) {
        if (this.f22674c >= 0) {
            this.f22674c = i4;
        }
        return this;
    }

    public b p(Object obj) {
        Object obj2 = f22667j;
        if (obj == obj2 && this.f22679h) {
            this.f22678g = obj2;
            this.f22674c = Integer.MAX_VALUE;
        }
        return this;
    }

    public b q(int i4) {
        if (i4 >= 0) {
            this.f22673b = i4;
        }
        return this;
    }

    public b r(Object obj) {
        if (obj == f22667j) {
            this.f22673b = -2;
        }
        return this;
    }

    public b s(Object obj, float f4) {
        this.f22675d = f4;
        return this;
    }

    public b t(String str) {
        this.f22677f = str;
        return this;
    }

    void u(int i4) {
        this.f22679h = false;
        this.f22678g = null;
        this.f22676e = i4;
    }

    public b v(int i4) {
        this.f22679h = true;
        if (i4 >= 0) {
            this.f22674c = i4;
        }
        return this;
    }

    public b w(Object obj) {
        this.f22678g = obj;
        this.f22679h = true;
        return this;
    }

    private b(Object obj) {
        this.f22672a = -2;
        this.f22673b = 0;
        this.f22674c = Integer.MAX_VALUE;
        this.f22675d = 1.0f;
        this.f22676e = 0;
        this.f22677f = null;
        this.f22679h = false;
        this.f22678g = obj;
    }
}
