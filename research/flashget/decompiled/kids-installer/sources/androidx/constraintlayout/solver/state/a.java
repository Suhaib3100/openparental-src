package androidx.constraintlayout.solver.state;

import androidx.constraintlayout.solver.state.e;
import androidx.constraintlayout.solver.widgets.d;
import java.util.ArrayList;

/* compiled from: ConstraintReference.java */
/* loaded from: classes2.dex */
public class a implements d {
    androidx.constraintlayout.solver.state.b G;
    androidx.constraintlayout.solver.state.b H;
    private Object I;
    private androidx.constraintlayout.solver.widgets.e J;

    /* renamed from: a, reason: collision with root package name */
    private Object f2264a;

    /* renamed from: b, reason: collision with root package name */
    final e f2265b;

    /* renamed from: c, reason: collision with root package name */
    int f2266c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f2267d = 0;

    /* renamed from: e, reason: collision with root package name */
    float f2268e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    float f2269f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    int f2270g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f2271h = 0;

    /* renamed from: i, reason: collision with root package name */
    int f2272i = 0;

    /* renamed from: j, reason: collision with root package name */
    int f2273j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f2274k = 0;

    /* renamed from: l, reason: collision with root package name */
    int f2275l = 0;

    /* renamed from: m, reason: collision with root package name */
    int f2276m = 0;

    /* renamed from: n, reason: collision with root package name */
    int f2277n = 0;

    /* renamed from: o, reason: collision with root package name */
    int f2278o = 0;

    /* renamed from: p, reason: collision with root package name */
    int f2279p = 0;

    /* renamed from: q, reason: collision with root package name */
    int f2280q = 0;

    /* renamed from: r, reason: collision with root package name */
    int f2281r = 0;

    /* renamed from: s, reason: collision with root package name */
    Object f2282s = null;

    /* renamed from: t, reason: collision with root package name */
    Object f2283t = null;

    /* renamed from: u, reason: collision with root package name */
    Object f2284u = null;

    /* renamed from: v, reason: collision with root package name */
    Object f2285v = null;

    /* renamed from: w, reason: collision with root package name */
    Object f2286w = null;

    /* renamed from: x, reason: collision with root package name */
    Object f2287x = null;

    /* renamed from: y, reason: collision with root package name */
    Object f2288y = null;

    /* renamed from: z, reason: collision with root package name */
    Object f2289z = null;
    Object A = null;
    Object B = null;
    Object C = null;
    Object D = null;
    Object E = null;
    e.c F = null;

    /* compiled from: ConstraintReference.java */
    /* renamed from: androidx.constraintlayout.solver.state.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0019a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2290a;

        static {
            int[] iArr = new int[e.c.values().length];
            f2290a = iArr;
            try {
                iArr[e.c.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2290a[e.c.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2290a[e.c.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2290a[e.c.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2290a[e.c.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2290a[e.c.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2290a[e.c.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2290a[e.c.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2290a[e.c.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2290a[e.c.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2290a[e.c.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2290a[e.c.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2290a[e.c.BASELINE_TO_BASELINE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2290a[e.c.CENTER_HORIZONTALLY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2290a[e.c.CENTER_VERTICALLY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* compiled from: ConstraintReference.java */
    /* loaded from: classes.dex */
    public interface b {
        a a(e eVar);
    }

    /* compiled from: ConstraintReference.java */
    /* loaded from: classes.dex */
    class c extends Exception {

        /* renamed from: o, reason: collision with root package name */
        private final ArrayList<String> f2291o;

        public c(ArrayList<String> arrayList) {
            this.f2291o = arrayList;
        }

        public ArrayList<String> a() {
            return this.f2291o;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.f2291o.toString();
        }
    }

    public a(e eVar) {
        Object obj = androidx.constraintlayout.solver.state.b.f2294j;
        this.G = androidx.constraintlayout.solver.state.b.b(obj);
        this.H = androidx.constraintlayout.solver.state.b.b(obj);
        this.f2265b = eVar;
    }

    private void d(androidx.constraintlayout.solver.widgets.e eVar, Object obj, e.c cVar) {
        androidx.constraintlayout.solver.widgets.e x5 = x(obj);
        if (x5 == null) {
        }
        int[] iArr = C0019a.f2290a;
        int i5 = iArr[cVar.ordinal()];
        switch (iArr[cVar.ordinal()]) {
            case 1:
                d.b bVar = d.b.LEFT;
                eVar.r(bVar).b(x5.r(bVar), this.f2270g, this.f2276m, false);
                break;
            case 2:
                eVar.r(d.b.LEFT).b(x5.r(d.b.RIGHT), this.f2270g, this.f2276m, false);
                break;
            case 3:
                eVar.r(d.b.RIGHT).b(x5.r(d.b.LEFT), this.f2271h, this.f2277n, false);
                break;
            case 4:
                d.b bVar2 = d.b.RIGHT;
                eVar.r(bVar2).b(x5.r(bVar2), this.f2271h, this.f2277n, false);
                break;
            case 5:
                d.b bVar3 = d.b.LEFT;
                eVar.r(bVar3).b(x5.r(bVar3), this.f2272i, this.f2278o, false);
                break;
            case 6:
                eVar.r(d.b.LEFT).b(x5.r(d.b.RIGHT), this.f2272i, this.f2278o, false);
                break;
            case 7:
                eVar.r(d.b.RIGHT).b(x5.r(d.b.LEFT), this.f2273j, this.f2279p, false);
                break;
            case 8:
                d.b bVar4 = d.b.RIGHT;
                eVar.r(bVar4).b(x5.r(bVar4), this.f2273j, this.f2279p, false);
                break;
            case 9:
                d.b bVar5 = d.b.TOP;
                eVar.r(bVar5).b(x5.r(bVar5), this.f2274k, this.f2280q, false);
                break;
            case 10:
                eVar.r(d.b.TOP).b(x5.r(d.b.BOTTOM), this.f2274k, this.f2280q, false);
                break;
            case 11:
                eVar.r(d.b.BOTTOM).b(x5.r(d.b.TOP), this.f2275l, this.f2281r, false);
                break;
            case 12:
                d.b bVar6 = d.b.BOTTOM;
                eVar.r(bVar6).b(x5.r(bVar6), this.f2275l, this.f2281r, false);
                break;
            case 13:
                d.b bVar7 = d.b.BASELINE;
                eVar.p0(bVar7, x5, bVar7, 0, 0);
                break;
        }
    }

    private void q() {
        this.f2282s = u(this.f2282s);
        this.f2283t = u(this.f2283t);
        this.f2284u = u(this.f2284u);
        this.f2285v = u(this.f2285v);
        this.f2286w = u(this.f2286w);
        this.f2287x = u(this.f2287x);
        this.f2288y = u(this.f2288y);
        this.f2289z = u(this.f2289z);
        this.A = u(this.A);
        this.B = u(this.B);
        this.C = u(this.C);
        this.D = u(this.D);
        this.E = u(this.E);
    }

    private Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.f2265b.p(obj) : obj;
    }

    private androidx.constraintlayout.solver.widgets.e x(Object obj) {
        if (obj instanceof d) {
            return ((d) obj).b();
        }
        return null;
    }

    public androidx.constraintlayout.solver.state.b A() {
        return this.G;
    }

    public a B(androidx.constraintlayout.solver.state.b bVar) {
        return M(bVar);
    }

    public a C(float f6) {
        this.f2268e = f6;
        return this;
    }

    public a D() {
        if (this.f2282s != null) {
            this.F = e.c.LEFT_TO_LEFT;
        } else {
            this.F = e.c.LEFT_TO_RIGHT;
        }
        return this;
    }

    public a E(Object obj) {
        this.F = e.c.LEFT_TO_LEFT;
        this.f2282s = obj;
        return this;
    }

    public a F(Object obj) {
        this.F = e.c.LEFT_TO_RIGHT;
        this.f2283t = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a G(int i5) {
        e.c cVar = this.F;
        if (cVar != null) {
            switch (C0019a.f2290a[cVar.ordinal()]) {
                case 1:
                case 2:
                    this.f2270g = i5;
                    break;
                case 3:
                case 4:
                    this.f2271h = i5;
                    break;
                case 5:
                case 6:
                    this.f2272i = i5;
                    break;
                case 7:
                case 8:
                    this.f2273j = i5;
                    break;
                case 9:
                case 10:
                    this.f2274k = i5;
                    break;
                case 11:
                case 12:
                    this.f2275l = i5;
                    break;
            }
        } else {
            this.f2270g = i5;
            this.f2271h = i5;
            this.f2272i = i5;
            this.f2273j = i5;
            this.f2274k = i5;
            this.f2275l = i5;
        }
        return this;
    }

    public a H(Object obj) {
        return G(this.f2265b.f(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a I(int i5) {
        e.c cVar = this.F;
        if (cVar != null) {
            switch (C0019a.f2290a[cVar.ordinal()]) {
                case 1:
                case 2:
                    this.f2276m = i5;
                    break;
                case 3:
                case 4:
                    this.f2277n = i5;
                    break;
                case 5:
                case 6:
                    this.f2278o = i5;
                    break;
                case 7:
                case 8:
                    this.f2279p = i5;
                    break;
                case 9:
                case 10:
                    this.f2280q = i5;
                    break;
                case 11:
                case 12:
                    this.f2281r = i5;
                    break;
            }
        } else {
            this.f2276m = i5;
            this.f2277n = i5;
            this.f2278o = i5;
            this.f2279p = i5;
            this.f2280q = i5;
            this.f2281r = i5;
        }
        return this;
    }

    public a J() {
        if (this.f2284u != null) {
            this.F = e.c.RIGHT_TO_LEFT;
        } else {
            this.F = e.c.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public a K(Object obj) {
        this.F = e.c.RIGHT_TO_LEFT;
        this.f2284u = obj;
        return this;
    }

    public a L(Object obj) {
        this.F = e.c.RIGHT_TO_RIGHT;
        this.f2285v = obj;
        return this;
    }

    public a M(androidx.constraintlayout.solver.state.b bVar) {
        this.H = bVar;
        return this;
    }

    public void N(int i5) {
        this.f2266c = i5;
    }

    public void O(int i5) {
        this.f2267d = i5;
    }

    public void P(Object obj) {
        this.I = obj;
        androidx.constraintlayout.solver.widgets.e eVar = this.J;
        if (eVar != null) {
            eVar.M0(obj);
        }
    }

    public a Q(androidx.constraintlayout.solver.state.b bVar) {
        this.G = bVar;
        return this;
    }

    public a R() {
        if (this.f2286w != null) {
            this.F = e.c.START_TO_START;
        } else {
            this.F = e.c.START_TO_END;
        }
        return this;
    }

    public a S(Object obj) {
        this.F = e.c.START_TO_END;
        this.f2287x = obj;
        return this;
    }

    public a T(Object obj) {
        this.F = e.c.START_TO_START;
        this.f2286w = obj;
        return this;
    }

    public a U() {
        if (this.A != null) {
            this.F = e.c.TOP_TO_TOP;
        } else {
            this.F = e.c.TOP_TO_BOTTOM;
        }
        return this;
    }

    public a V(Object obj) {
        this.F = e.c.TOP_TO_BOTTOM;
        this.B = obj;
        return this;
    }

    public a W(Object obj) {
        this.F = e.c.TOP_TO_TOP;
        this.A = obj;
        return this;
    }

    public void X() throws c {
        ArrayList arrayList = new ArrayList();
        if (this.f2282s != null && this.f2283t != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.f2284u != null && this.f2285v != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.f2286w != null && this.f2287x != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.f2288y != null && this.f2289z != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.f2282s != null || this.f2283t != null || this.f2284u != null || this.f2285v != null) && (this.f2286w != null || this.f2287x != null || this.f2288y != null || this.f2289z != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new c(arrayList);
        }
    }

    public a Y(float f6) {
        this.f2269f = f6;
        return this;
    }

    public a Z(androidx.constraintlayout.solver.state.b bVar) {
        return Q(bVar);
    }

    @Override // androidx.constraintlayout.solver.state.d
    public void a(Object obj) {
        this.f2264a = obj;
    }

    @Override // androidx.constraintlayout.solver.state.d
    public void apply() {
        androidx.constraintlayout.solver.widgets.e eVar = this.J;
        if (eVar == null) {
            return;
        }
        this.G.i(this.f2265b, eVar, 0);
        this.H.i(this.f2265b, this.J, 1);
        q();
        d(this.J, this.f2282s, e.c.LEFT_TO_LEFT);
        d(this.J, this.f2283t, e.c.LEFT_TO_RIGHT);
        d(this.J, this.f2284u, e.c.RIGHT_TO_LEFT);
        d(this.J, this.f2285v, e.c.RIGHT_TO_RIGHT);
        d(this.J, this.f2286w, e.c.START_TO_START);
        d(this.J, this.f2287x, e.c.START_TO_END);
        d(this.J, this.f2288y, e.c.END_TO_START);
        d(this.J, this.f2289z, e.c.END_TO_END);
        d(this.J, this.A, e.c.TOP_TO_TOP);
        d(this.J, this.B, e.c.TOP_TO_BOTTOM);
        d(this.J, this.C, e.c.BOTTOM_TO_TOP);
        d(this.J, this.D, e.c.BOTTOM_TO_BOTTOM);
        d(this.J, this.E, e.c.BASELINE_TO_BASELINE);
        int i5 = this.f2266c;
        if (i5 != 0) {
            this.J.g1(i5);
        }
        int i6 = this.f2267d;
        if (i6 != 0) {
            this.J.B1(i6);
        }
        this.J.f1(this.f2268e);
        this.J.A1(this.f2269f);
    }

    @Override // androidx.constraintlayout.solver.state.d
    public androidx.constraintlayout.solver.widgets.e b() {
        if (this.J == null) {
            androidx.constraintlayout.solver.widgets.e p5 = p();
            this.J = p5;
            p5.M0(this.I);
        }
        return this.J;
    }

    @Override // androidx.constraintlayout.solver.state.d
    public void c(androidx.constraintlayout.solver.widgets.e eVar) {
        if (eVar == null) {
            return;
        }
        this.J = eVar;
        eVar.M0(this.I);
    }

    public a e() {
        this.F = e.c.BASELINE_TO_BASELINE;
        return this;
    }

    public a f(Object obj) {
        this.F = e.c.BASELINE_TO_BASELINE;
        this.E = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.constraintlayout.solver.state.a g(float r3) {
        /*
            r2 = this;
            androidx.constraintlayout.solver.state.e$c r0 = r2.F
            if (r0 != 0) goto L5
            return r2
        L5:
            int[] r1 = androidx.constraintlayout.solver.state.a.C0019a.f2290a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L14;
                case 2: goto L14;
                case 3: goto L14;
                case 4: goto L14;
                case 5: goto L14;
                case 6: goto L14;
                case 7: goto L14;
                case 8: goto L14;
                case 9: goto L11;
                case 10: goto L11;
                case 11: goto L11;
                case 12: goto L11;
                case 13: goto L10;
                case 14: goto L14;
                case 15: goto L11;
                default: goto L10;
            }
        L10:
            goto L16
        L11:
            r2.f2269f = r3
            goto L16
        L14:
            r2.f2268e = r3
        L16:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.state.a.g(float):androidx.constraintlayout.solver.state.a");
    }

    @Override // androidx.constraintlayout.solver.state.d
    public Object getKey() {
        return this.f2264a;
    }

    public a h() {
        if (this.C != null) {
            this.F = e.c.BOTTOM_TO_TOP;
        } else {
            this.F = e.c.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public a i(Object obj) {
        this.F = e.c.BOTTOM_TO_BOTTOM;
        this.D = obj;
        return this;
    }

    public a j(Object obj) {
        this.F = e.c.BOTTOM_TO_TOP;
        this.C = obj;
        return this;
    }

    public a k(Object obj) {
        Object u5 = u(obj);
        this.f2286w = u5;
        this.f2289z = u5;
        this.F = e.c.CENTER_HORIZONTALLY;
        this.f2268e = 0.5f;
        return this;
    }

    public a l(Object obj) {
        Object u5 = u(obj);
        this.A = u5;
        this.D = u5;
        this.F = e.c.CENTER_VERTICALLY;
        this.f2269f = 0.5f;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a m() {
        e.c cVar = this.F;
        if (cVar != null) {
            switch (C0019a.f2290a[cVar.ordinal()]) {
                case 1:
                case 2:
                    this.f2282s = null;
                    this.f2283t = null;
                    this.f2270g = 0;
                    this.f2276m = 0;
                    break;
                case 3:
                case 4:
                    this.f2284u = null;
                    this.f2285v = null;
                    this.f2271h = 0;
                    this.f2277n = 0;
                    break;
                case 5:
                case 6:
                    this.f2286w = null;
                    this.f2287x = null;
                    this.f2272i = 0;
                    this.f2278o = 0;
                    break;
                case 7:
                case 8:
                    this.f2288y = null;
                    this.f2289z = null;
                    this.f2273j = 0;
                    this.f2279p = 0;
                    break;
                case 9:
                case 10:
                    this.A = null;
                    this.B = null;
                    this.f2274k = 0;
                    this.f2280q = 0;
                    break;
                case 11:
                case 12:
                    this.C = null;
                    this.D = null;
                    this.f2275l = 0;
                    this.f2281r = 0;
                    break;
                case 13:
                    this.E = null;
                    break;
            }
        } else {
            this.f2282s = null;
            this.f2283t = null;
            this.f2270g = 0;
            this.f2284u = null;
            this.f2285v = null;
            this.f2271h = 0;
            this.f2286w = null;
            this.f2287x = null;
            this.f2272i = 0;
            this.f2288y = null;
            this.f2289z = null;
            this.f2273j = 0;
            this.A = null;
            this.B = null;
            this.f2274k = 0;
            this.C = null;
            this.D = null;
            this.f2275l = 0;
            this.E = null;
            this.f2268e = 0.5f;
            this.f2269f = 0.5f;
            this.f2276m = 0;
            this.f2277n = 0;
            this.f2278o = 0;
            this.f2279p = 0;
            this.f2280q = 0;
            this.f2281r = 0;
        }
        return this;
    }

    public a n() {
        R().m();
        r().m();
        D().m();
        J().m();
        return this;
    }

    public a o() {
        U().m();
        e().m();
        h().m();
        return this;
    }

    public androidx.constraintlayout.solver.widgets.e p() {
        return new androidx.constraintlayout.solver.widgets.e(0, 0, A().m(), v().m());
    }

    public a r() {
        if (this.f2288y != null) {
            this.F = e.c.END_TO_START;
        } else {
            this.F = e.c.END_TO_END;
        }
        return this;
    }

    public a s(Object obj) {
        this.F = e.c.END_TO_END;
        this.f2289z = obj;
        return this;
    }

    public a t(Object obj) {
        this.F = e.c.END_TO_START;
        this.f2288y = obj;
        return this;
    }

    public androidx.constraintlayout.solver.state.b v() {
        return this.H;
    }

    public int w() {
        return this.f2266c;
    }

    public int y(int i5) {
        return this.f2267d;
    }

    public Object z() {
        return this.I;
    }
}
