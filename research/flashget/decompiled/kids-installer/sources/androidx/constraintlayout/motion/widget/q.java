package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.motion.widget.x;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: MotionConstrainedPoint.java */
/* loaded from: classes.dex */
class q implements Comparable<q> {
    public static final boolean R = false;
    static final int S = 1;
    static final int T = 2;
    private androidx.constraintlayout.motion.utils.c D;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;

    /* renamed from: q, reason: collision with root package name */
    int f1958q;
    public static final String Q = "MotionPaths";
    static String[] U = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: o, reason: collision with root package name */
    private float f1956o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    int f1957p = 0;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1959r = false;

    /* renamed from: s, reason: collision with root package name */
    private float f1960s = 0.0f;

    /* renamed from: t, reason: collision with root package name */
    private float f1961t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    private float f1962u = 0.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f1963v = 0.0f;

    /* renamed from: w, reason: collision with root package name */
    private float f1964w = 1.0f;

    /* renamed from: x, reason: collision with root package name */
    private float f1965x = 1.0f;

    /* renamed from: y, reason: collision with root package name */
    private float f1966y = Float.NaN;

    /* renamed from: z, reason: collision with root package name */
    private float f1967z = Float.NaN;
    private float A = 0.0f;
    private float B = 0.0f;
    private float C = 0.0f;
    private int E = 0;
    private float K = Float.NaN;
    private float L = Float.NaN;
    LinkedHashMap<String, androidx.constraintlayout.widget.a> M = new LinkedHashMap<>();
    int N = 0;
    double[] O = new double[18];
    double[] P = new double[18];

    private boolean o(float f6, float f7) {
        return (Float.isNaN(f6) || Float.isNaN(f7)) ? Float.isNaN(f6) != Float.isNaN(f7) : Math.abs(f6 - f7) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void g(HashMap<String, x> hashMap, int i5) {
        for (String str : hashMap.keySet()) {
            x xVar = hashMap.get(str);
            str.getClass();
            char c6 = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c6 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c6 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c6 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c6 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c6 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c6 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c6 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c6 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c6 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c6 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c6 = '\r';
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    xVar.f(i5, Float.isNaN(this.f1962u) ? 0.0f : this.f1962u);
                    break;
                case 1:
                    xVar.f(i5, Float.isNaN(this.f1963v) ? 0.0f : this.f1963v);
                    break;
                case 2:
                    xVar.f(i5, Float.isNaN(this.A) ? 0.0f : this.A);
                    break;
                case 3:
                    xVar.f(i5, Float.isNaN(this.B) ? 0.0f : this.B);
                    break;
                case 4:
                    xVar.f(i5, Float.isNaN(this.C) ? 0.0f : this.C);
                    break;
                case 5:
                    xVar.f(i5, Float.isNaN(this.L) ? 0.0f : this.L);
                    break;
                case 6:
                    xVar.f(i5, Float.isNaN(this.f1964w) ? 1.0f : this.f1964w);
                    break;
                case 7:
                    xVar.f(i5, Float.isNaN(this.f1965x) ? 1.0f : this.f1965x);
                    break;
                case '\b':
                    xVar.f(i5, Float.isNaN(this.f1966y) ? 0.0f : this.f1966y);
                    break;
                case '\t':
                    xVar.f(i5, Float.isNaN(this.f1967z) ? 0.0f : this.f1967z);
                    break;
                case '\n':
                    xVar.f(i5, Float.isNaN(this.f1961t) ? 0.0f : this.f1961t);
                    break;
                case 11:
                    xVar.f(i5, Float.isNaN(this.f1960s) ? 0.0f : this.f1960s);
                    break;
                case '\f':
                    xVar.f(i5, Float.isNaN(this.K) ? 0.0f : this.K);
                    break;
                case '\r':
                    xVar.f(i5, Float.isNaN(this.f1956o) ? 1.0f : this.f1956o);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.M.containsKey(str2)) {
                            androidx.constraintlayout.widget.a aVar = this.M.get(str2);
                            if (xVar instanceof x.b) {
                                ((x.b) xVar).j(i5, aVar);
                                break;
                            } else {
                                aVar.e();
                                Objects.toString(xVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
            }
        }
    }

    public void h(View view) {
        this.f1958q = view.getVisibility();
        this.f1956o = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f1959r = false;
        this.f1960s = view.getElevation();
        this.f1961t = view.getRotation();
        this.f1962u = view.getRotationX();
        this.f1963v = view.getRotationY();
        this.f1964w = view.getScaleX();
        this.f1965x = view.getScaleY();
        this.f1966y = view.getPivotX();
        this.f1967z = view.getPivotY();
        this.A = view.getTranslationX();
        this.B = view.getTranslationY();
        this.C = view.getTranslationZ();
    }

    public void j(d.a aVar) {
        d.C0024d c0024d = aVar.f2924b;
        int i5 = c0024d.f3008c;
        this.f1957p = i5;
        int i6 = c0024d.f3007b;
        this.f1958q = i6;
        this.f1956o = (i6 == 0 || i5 != 0) ? c0024d.f3009d : 0.0f;
        d.e eVar = aVar.f2927e;
        this.f1959r = eVar.f3034l;
        this.f1960s = eVar.f3035m;
        this.f1961t = eVar.f3024b;
        this.f1962u = eVar.f3025c;
        this.f1963v = eVar.f3026d;
        this.f1964w = eVar.f3027e;
        this.f1965x = eVar.f3028f;
        this.f1966y = eVar.f3029g;
        this.f1967z = eVar.f3030h;
        this.A = eVar.f3031i;
        this.B = eVar.f3032j;
        this.C = eVar.f3033k;
        this.D = androidx.constraintlayout.motion.utils.c.c(aVar.f2925c.f3001c);
        d.c cVar = aVar.f2925c;
        this.K = cVar.f3005g;
        this.E = cVar.f3003e;
        this.L = aVar.f2924b.f3010e;
        for (String str : aVar.f2928f.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.f2928f.get(str);
            if (aVar2.d() != a.b.STRING_TYPE) {
                this.M.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(q qVar) {
        return Float.compare(this.F, qVar.F);
    }

    void p(q qVar, HashSet<String> hashSet) {
        if (o(this.f1956o, qVar.f1956o)) {
            hashSet.add("alpha");
        }
        if (o(this.f1960s, qVar.f1960s)) {
            hashSet.add("elevation");
        }
        int i5 = this.f1958q;
        int i6 = qVar.f1958q;
        if (i5 != i6 && this.f1957p == 0 && (i5 == 0 || i6 == 0)) {
            hashSet.add("alpha");
        }
        if (o(this.f1961t, qVar.f1961t)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.K) || !Float.isNaN(qVar.K)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.L) || !Float.isNaN(qVar.L)) {
            hashSet.add("progress");
        }
        if (o(this.f1962u, qVar.f1962u)) {
            hashSet.add("rotationX");
        }
        if (o(this.f1963v, qVar.f1963v)) {
            hashSet.add("rotationY");
        }
        if (o(this.f1966y, qVar.f1966y)) {
            hashSet.add("transformPivotX");
        }
        if (o(this.f1967z, qVar.f1967z)) {
            hashSet.add("transformPivotY");
        }
        if (o(this.f1964w, qVar.f1964w)) {
            hashSet.add("scaleX");
        }
        if (o(this.f1965x, qVar.f1965x)) {
            hashSet.add("scaleY");
        }
        if (o(this.A, qVar.A)) {
            hashSet.add("translationX");
        }
        if (o(this.B, qVar.B)) {
            hashSet.add("translationY");
        }
        if (o(this.C, qVar.C)) {
            hashSet.add("translationZ");
        }
    }

    void q(q qVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | o(this.F, qVar.F);
        zArr[1] = zArr[1] | o(this.G, qVar.G);
        zArr[2] = zArr[2] | o(this.H, qVar.H);
        zArr[3] = zArr[3] | o(this.I, qVar.I);
        zArr[4] = o(this.J, qVar.J) | zArr[4];
    }

    void r(double[] dArr, int[] iArr) {
        float[] fArr = {this.F, this.G, this.H, this.I, this.J, this.f1956o, this.f1960s, this.f1961t, this.f1962u, this.f1963v, this.f1964w, this.f1965x, this.f1966y, this.f1967z, this.A, this.B, this.C, this.K};
        int i5 = 0;
        for (int i6 : iArr) {
            if (i6 < 18) {
                dArr[i5] = fArr[r4];
                i5++;
            }
        }
    }

    int s(String str, double[] dArr, int i5) {
        androidx.constraintlayout.widget.a aVar = this.M.get(str);
        if (aVar.g() == 1) {
            dArr[i5] = aVar.e();
            return 1;
        }
        int g5 = aVar.g();
        aVar.f(new float[g5]);
        int i6 = 0;
        while (i6 < g5) {
            dArr[i5] = r1[i6];
            i6++;
            i5++;
        }
        return g5;
    }

    int t(String str) {
        return this.M.get(str).g();
    }

    boolean u(String str) {
        return this.M.containsKey(str);
    }

    void v(float f6, float f7, float f8, float f9) {
        this.G = f6;
        this.H = f7;
        this.I = f8;
        this.J = f9;
    }

    public void w(View view) {
        v(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        h(view);
    }

    public void x(androidx.constraintlayout.solver.widgets.e eVar, androidx.constraintlayout.widget.d dVar, int i5) {
        v(eVar.k0(), eVar.l0(), eVar.j0(), eVar.D());
        j(dVar.h0(i5));
    }
}
