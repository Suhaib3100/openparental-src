package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.n;
import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.core.motion.utils.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* compiled from: MotionConstrainedPoint.java */
/* loaded from: classes.dex */
class d implements Comparable<d> {
    public static final boolean F = false;
    static final int G = 1;
    static final int H = 2;

    /* renamed from: d, reason: collision with root package name */
    int f22005d;

    /* renamed from: q, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.e f22018q;

    /* renamed from: s, reason: collision with root package name */
    private float f22020s;

    /* renamed from: t, reason: collision with root package name */
    private float f22021t;

    /* renamed from: u, reason: collision with root package name */
    private float f22022u;

    /* renamed from: v, reason: collision with root package name */
    private float f22023v;

    /* renamed from: w, reason: collision with root package name */
    private float f22024w;
    public static final String E = "MotionPaths";
    static String[] I = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: b, reason: collision with root package name */
    private float f22003b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    int f22004c = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f22006e = false;

    /* renamed from: f, reason: collision with root package name */
    private float f22007f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private float f22008g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f22009h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f22010i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    private float f22011j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    private float f22012k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private float f22013l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    private float f22014m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    private float f22015n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    private float f22016o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    private float f22017p = 0.0f;

    /* renamed from: r, reason: collision with root package name */
    private int f22019r = 0;

    /* renamed from: x, reason: collision with root package name */
    private float f22025x = Float.NaN;

    /* renamed from: y, reason: collision with root package name */
    private float f22026y = Float.NaN;

    /* renamed from: z, reason: collision with root package name */
    private int f22027z = -1;
    LinkedHashMap<String, b> A = new LinkedHashMap<>();
    int B = 0;
    double[] C = new double[18];
    double[] D = new double[18];

    private boolean d(float f4, float f5) {
        return (Float.isNaN(f4) || Float.isNaN(f5)) ? Float.isNaN(f4) != Float.isNaN(f5) : Math.abs(f4 - f5) > 1.0E-6f;
    }

    public void a(HashMap<String, p> hashMap, int i4) {
        p pVar;
        for (String str : hashMap.keySet()) {
            pVar = hashMap.get(str);
            str.getClass();
            switch (str) {
                case "rotationX":
                    pVar.g(i4, Float.isNaN(this.f22009h) ? 0.0f : this.f22009h);
                    break;
                case "rotationY":
                    pVar.g(i4, Float.isNaN(this.f22010i) ? 0.0f : this.f22010i);
                    break;
                case "rotationZ":
                    pVar.g(i4, Float.isNaN(this.f22008g) ? 0.0f : this.f22008g);
                    break;
                case "translationX":
                    pVar.g(i4, Float.isNaN(this.f22015n) ? 0.0f : this.f22015n);
                    break;
                case "translationY":
                    pVar.g(i4, Float.isNaN(this.f22016o) ? 0.0f : this.f22016o);
                    break;
                case "translationZ":
                    pVar.g(i4, Float.isNaN(this.f22017p) ? 0.0f : this.f22017p);
                    break;
                case "progress":
                    pVar.g(i4, Float.isNaN(this.f22026y) ? 0.0f : this.f22026y);
                    break;
                case "pivotX":
                    pVar.g(i4, Float.isNaN(this.f22013l) ? 0.0f : this.f22013l);
                    break;
                case "pivotY":
                    pVar.g(i4, Float.isNaN(this.f22014m) ? 0.0f : this.f22014m);
                    break;
                case "scaleX":
                    pVar.g(i4, Float.isNaN(this.f22011j) ? 1.0f : this.f22011j);
                    break;
                case "scaleY":
                    pVar.g(i4, Float.isNaN(this.f22012k) ? 1.0f : this.f22012k);
                    break;
                case "alpha":
                    pVar.g(i4, Float.isNaN(this.f22003b) ? 1.0f : this.f22003b);
                    break;
                case "pathRotate":
                    pVar.g(i4, Float.isNaN(this.f22025x) ? 0.0f : this.f22025x);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.A.containsKey(str2)) {
                            b bVar = this.A.get(str2);
                            if (pVar instanceof p.c) {
                                ((p.c) pVar).k(i4, bVar);
                                break;
                            } else {
                                x.f("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i4 + ", value" + bVar.n() + pVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        x.f("MotionPaths", "UNKNOWN spline ".concat(str));
                        break;
                    }
            }
        }
    }

    public void b(f fVar) {
        this.f22005d = fVar.B();
        this.f22003b = fVar.B() != 4 ? 0.0f : fVar.g();
        this.f22006e = false;
        this.f22008g = fVar.t();
        this.f22009h = fVar.r();
        this.f22010i = fVar.s();
        this.f22011j = fVar.u();
        this.f22012k = fVar.v();
        this.f22013l = fVar.o();
        this.f22014m = fVar.p();
        this.f22015n = fVar.x();
        this.f22016o = fVar.y();
        this.f22017p = fVar.z();
        for (String str : fVar.j()) {
            b i4 = fVar.i(str);
            if (i4 != null && i4.q()) {
                this.A.put(str, i4);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return Float.compare(this.f22020s, dVar.f22020s);
    }

    void e(d dVar, HashSet<String> hashSet) {
        if (d(this.f22003b, dVar.f22003b)) {
            hashSet.add("alpha");
        }
        if (d(this.f22007f, dVar.f22007f)) {
            hashSet.add("translationZ");
        }
        int i4 = this.f22005d;
        int i5 = dVar.f22005d;
        if (i4 != i5 && this.f22004c == 0 && (i4 == 4 || i5 == 4)) {
            hashSet.add("alpha");
        }
        if (d(this.f22008g, dVar.f22008g)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f22025x) || !Float.isNaN(dVar.f22025x)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f22026y) || !Float.isNaN(dVar.f22026y)) {
            hashSet.add("progress");
        }
        if (d(this.f22009h, dVar.f22009h)) {
            hashSet.add("rotationX");
        }
        if (d(this.f22010i, dVar.f22010i)) {
            hashSet.add("rotationY");
        }
        if (d(this.f22013l, dVar.f22013l)) {
            hashSet.add("pivotX");
        }
        if (d(this.f22014m, dVar.f22014m)) {
            hashSet.add("pivotY");
        }
        if (d(this.f22011j, dVar.f22011j)) {
            hashSet.add("scaleX");
        }
        if (d(this.f22012k, dVar.f22012k)) {
            hashSet.add("scaleY");
        }
        if (d(this.f22015n, dVar.f22015n)) {
            hashSet.add("translationX");
        }
        if (d(this.f22016o, dVar.f22016o)) {
            hashSet.add("translationY");
        }
        if (d(this.f22017p, dVar.f22017p)) {
            hashSet.add("translationZ");
        }
        if (d(this.f22007f, dVar.f22007f)) {
            hashSet.add("elevation");
        }
    }

    void f(d dVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | d(this.f22020s, dVar.f22020s);
        zArr[1] = zArr[1] | d(this.f22021t, dVar.f22021t);
        zArr[2] = zArr[2] | d(this.f22022u, dVar.f22022u);
        zArr[3] = zArr[3] | d(this.f22023v, dVar.f22023v);
        zArr[4] = d(this.f22024w, dVar.f22024w) | zArr[4];
    }

    void g(double[] dArr, int[] iArr) {
        int i4 = 0;
        float[] fArr = {this.f22020s, this.f22021t, this.f22022u, this.f22023v, this.f22024w, this.f22003b, this.f22007f, this.f22008g, this.f22009h, this.f22010i, this.f22011j, this.f22012k, this.f22013l, this.f22014m, this.f22015n, this.f22016o, this.f22017p, this.f22025x};
        for (int i5 : iArr) {
            if (i5 < 18) {
                dArr[i4] = fArr[r5];
                i4++;
            }
        }
    }

    int h(String str, double[] dArr, int i4) {
        b bVar = this.A.get(str);
        if (bVar.r() == 1) {
            dArr[i4] = bVar.n();
            return 1;
        }
        int r4 = bVar.r();
        bVar.o(new float[r4]);
        int i5 = 0;
        while (i5 < r4) {
            dArr[i4] = r1[i5];
            i5++;
            i4++;
        }
        return r4;
    }

    int i(String str) {
        return this.A.get(str).r();
    }

    boolean j(String str) {
        return this.A.containsKey(str);
    }

    void k(float f4, float f5, float f6, float f7) {
        this.f22021t = f4;
        this.f22022u = f5;
        this.f22023v = f6;
        this.f22024w = f7;
    }

    public void l(f fVar) {
        k(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        b(fVar);
    }

    public void m(n nVar, f fVar, int i4, float f4) {
        k(nVar.f22304b, nVar.f22306d, nVar.b(), nVar.a());
        b(fVar);
        this.f22013l = Float.NaN;
        this.f22014m = Float.NaN;
        if (i4 == 1) {
            this.f22008g = f4 - 90.0f;
        } else {
            if (i4 != 2) {
                return;
            }
            this.f22008g = f4 + 90.0f;
        }
    }
}
