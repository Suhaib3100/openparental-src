package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.w;
import androidx.constraintlayout.core.state.r;
import java.util.Set;

/* compiled from: MotionWidget.java */
/* loaded from: classes.dex */
public class f implements w {
    public static final int A = 0;
    public static final int B = 0;
    public static final int C = -1;
    public static final int D = -1;
    public static final int E = -2;
    public static final int F = Integer.MIN_VALUE;
    public static final int G = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f22053m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f22054n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f22055o = -1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f22056p = -2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f22057q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f22058r = 4;

    /* renamed from: s, reason: collision with root package name */
    private static final int f22059s = -3;

    /* renamed from: t, reason: collision with root package name */
    private static final int f22060t = -4;

    /* renamed from: u, reason: collision with root package name */
    public static final int f22061u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f22062v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f22063w = 2;

    /* renamed from: x, reason: collision with root package name */
    public static final int f22064x = 3;

    /* renamed from: y, reason: collision with root package name */
    public static final int f22065y = 4;

    /* renamed from: z, reason: collision with root package name */
    public static final int f22066z = -1;

    /* renamed from: h, reason: collision with root package name */
    r f22067h;

    /* renamed from: i, reason: collision with root package name */
    a f22068i;

    /* renamed from: j, reason: collision with root package name */
    b f22069j;

    /* renamed from: k, reason: collision with root package name */
    private float f22070k;

    /* renamed from: l, reason: collision with root package name */
    float f22071l;

    /* compiled from: MotionWidget.java */
    public static class a {

        /* renamed from: n, reason: collision with root package name */
        private static final int f22072n = -2;

        /* renamed from: o, reason: collision with root package name */
        private static final int f22073o = -1;

        /* renamed from: p, reason: collision with root package name */
        private static final int f22074p = -3;

        /* renamed from: a, reason: collision with root package name */
        public int f22075a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f22076b = 0;

        /* renamed from: c, reason: collision with root package name */
        public String f22077c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f22078d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f22079e = 0;

        /* renamed from: f, reason: collision with root package name */
        public float f22080f = Float.NaN;

        /* renamed from: g, reason: collision with root package name */
        public int f22081g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f22082h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f22083i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public int f22084j = -1;

        /* renamed from: k, reason: collision with root package name */
        public String f22085k = null;

        /* renamed from: l, reason: collision with root package name */
        public int f22086l = -3;

        /* renamed from: m, reason: collision with root package name */
        public int f22087m = -1;
    }

    /* compiled from: MotionWidget.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f22088a = 4;

        /* renamed from: b, reason: collision with root package name */
        public int f22089b = 0;

        /* renamed from: c, reason: collision with root package name */
        public float f22090c = 1.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f22091d = Float.NaN;
    }

    public f() {
        this.f22067h = new r();
        this.f22068i = new a();
        this.f22069j = new b();
    }

    public float A(int i4) {
        switch (i4) {
            case 303:
                return this.f22067h.f22766p;
            case 304:
                return this.f22067h.f22761k;
            case 305:
                return this.f22067h.f22762l;
            case 306:
                return this.f22067h.f22763m;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.f22067h.f22758h;
            case 309:
                return this.f22067h.f22759i;
            case 310:
                return this.f22067h.f22760j;
            case 311:
                return this.f22067h.f22764n;
            case 312:
                return this.f22067h.f22765o;
            case 313:
                return this.f22067h.f22756f;
            case 314:
                return this.f22067h.f22757g;
            case 315:
                return this.f22070k;
            case w.a.f22419q /* 316 */:
                return this.f22071l;
        }
    }

    public int B() {
        return this.f22069j.f22088a;
    }

    public r C() {
        return this.f22067h;
    }

    public int D() {
        r rVar = this.f22067h;
        return rVar.f22754d - rVar.f22752b;
    }

    public int E() {
        return this.f22067h.f22752b;
    }

    public int F() {
        return this.f22067h.f22753c;
    }

    public void G(int i4, int i5, int i6, int i7) {
        H(i4, i5, i6, i7);
    }

    public void H(int i4, int i5, int i6, int i7) {
        if (this.f22067h == null) {
            this.f22067h = new r((androidx.constraintlayout.core.widgets.e) null);
        }
        r rVar = this.f22067h;
        rVar.f22753c = i5;
        rVar.f22752b = i4;
        rVar.f22754d = i6;
        rVar.f22755e = i7;
    }

    public void I(String str, int i4, float f4) {
        this.f22067h.v(str, i4, f4);
    }

    public void J(String str, int i4, int i5) {
        this.f22067h.w(str, i4, i5);
    }

    public void K(String str, int i4, String str2) {
        this.f22067h.x(str, i4, str2);
    }

    public void L(String str, int i4, boolean z4) {
        this.f22067h.y(str, i4, z4);
    }

    public void M(androidx.constraintlayout.core.motion.a aVar, float[] fArr) {
        this.f22067h.v(aVar.f21947b, w.b.f22439k, fArr[0]);
    }

    public void N(float f4) {
        this.f22067h.f22756f = f4;
    }

    public void O(float f4) {
        this.f22067h.f22757g = f4;
    }

    public void P(float f4) {
        this.f22067h.f22758h = f4;
    }

    public void Q(float f4) {
        this.f22067h.f22759i = f4;
    }

    public void R(float f4) {
        this.f22067h.f22760j = f4;
    }

    public void S(float f4) {
        this.f22067h.f22764n = f4;
    }

    public void T(float f4) {
        this.f22067h.f22765o = f4;
    }

    public void U(float f4) {
        this.f22067h.f22761k = f4;
    }

    public void V(float f4) {
        this.f22067h.f22762l = f4;
    }

    public void W(float f4) {
        this.f22067h.f22763m = f4;
    }

    public boolean X(int i4, float f4) {
        switch (i4) {
            case 303:
                this.f22067h.f22766p = f4;
                return true;
            case 304:
                this.f22067h.f22761k = f4;
                return true;
            case 305:
                this.f22067h.f22762l = f4;
                return true;
            case 306:
                this.f22067h.f22763m = f4;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.f22067h.f22758h = f4;
                return true;
            case 309:
                this.f22067h.f22759i = f4;
                return true;
            case 310:
                this.f22067h.f22760j = f4;
                return true;
            case 311:
                this.f22067h.f22764n = f4;
                return true;
            case 312:
                this.f22067h.f22765o = f4;
                return true;
            case 313:
                this.f22067h.f22756f = f4;
                return true;
            case 314:
                this.f22067h.f22757g = f4;
                return true;
            case 315:
                this.f22070k = f4;
                return true;
            case w.a.f22419q /* 316 */:
                this.f22071l = f4;
                return true;
        }
    }

    public boolean Y(int i4, float f4) {
        switch (i4) {
            case 600:
                this.f22068i.f22080f = f4;
                return true;
            case 601:
                this.f22068i.f22082h = f4;
                return true;
            case w.e.f22494r /* 602 */:
                this.f22068i.f22083i = f4;
                return true;
            default:
                return false;
        }
    }

    public boolean Z(int i4, int i5) {
        switch (i4) {
            case w.e.f22497u /* 605 */:
                this.f22068i.f22075a = i5;
                return true;
            case w.e.f22498v /* 606 */:
                this.f22068i.f22076b = i5;
                return true;
            case w.e.f22499w /* 607 */:
                this.f22068i.f22078d = i5;
                return true;
            case w.e.f22500x /* 608 */:
                this.f22068i.f22079e = i5;
                return true;
            case w.e.f22501y /* 609 */:
                this.f22068i.f22081g = i5;
                return true;
            case w.e.f22502z /* 610 */:
                this.f22068i.f22084j = i5;
                return true;
            case w.e.A /* 611 */:
                this.f22068i.f22086l = i5;
                return true;
            case w.e.B /* 612 */:
                this.f22068i.f22087m = i5;
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public int a(String str) {
        int a5 = w.a.a(str);
        return a5 != -1 ? a5 : w.e.a(str);
    }

    public boolean a0(int i4, String str) {
        if (i4 == 603) {
            this.f22068i.f22077c = str;
            return true;
        }
        if (i4 != 604) {
            return false;
        }
        this.f22068i.f22085k = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i4, int i5) {
        return X(i4, i5);
    }

    public void b0(int i4) {
        this.f22069j.f22088a = i4;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i4, float f4) {
        if (X(i4, f4)) {
            return true;
        }
        return Y(i4, f4);
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean d(int i4, boolean z4) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean e(int i4, String str) {
        return a0(i4, str);
    }

    public f f(int i4) {
        return null;
    }

    public float g() {
        return this.f22069j.f22090c;
    }

    public int h() {
        return this.f22067h.f22755e;
    }

    public androidx.constraintlayout.core.motion.b i(String str) {
        return this.f22067h.g(str);
    }

    public Set<String> j() {
        return this.f22067h.h();
    }

    public int k() {
        r rVar = this.f22067h;
        return rVar.f22755e - rVar.f22753c;
    }

    public int l() {
        return this.f22067h.f22752b;
    }

    public String m() {
        return this.f22067h.k();
    }

    public f n() {
        return null;
    }

    public float o() {
        return this.f22067h.f22756f;
    }

    public float p() {
        return this.f22067h.f22757g;
    }

    public int q() {
        return this.f22067h.f22754d;
    }

    public float r() {
        return this.f22067h.f22758h;
    }

    public float s() {
        return this.f22067h.f22759i;
    }

    public float t() {
        return this.f22067h.f22760j;
    }

    public String toString() {
        return this.f22067h.f22752b + ", " + this.f22067h.f22753c + ", " + this.f22067h.f22754d + ", " + this.f22067h.f22755e;
    }

    public float u() {
        return this.f22067h.f22764n;
    }

    public float v() {
        return this.f22067h.f22765o;
    }

    public int w() {
        return this.f22067h.f22753c;
    }

    public float x() {
        return this.f22067h.f22761k;
    }

    public float y() {
        return this.f22067h.f22762l;
    }

    public float z() {
        return this.f22067h.f22763m;
    }

    public f(r rVar) {
        this.f22067h = new r();
        this.f22068i = new a();
        this.f22069j = new b();
        this.f22067h = rVar;
    }
}
