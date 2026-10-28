package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.f;
import androidx.constraintlayout.widget.g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: KeyTimeCycle.java */
/* loaded from: classes.dex */
public class l extends f {
    static final String V = "KeyTimeCycle";
    private static final String W = "KeyTimeCycle";
    public static final String X = "wavePeriod";
    public static final String Y = "waveOffset";
    public static final String Z = "waveShape";

    /* renamed from: a0, reason: collision with root package name */
    public static final int f23409a0 = 0;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f23410b0 = 1;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f23411c0 = 2;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f23412d0 = 3;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f23413e0 = 4;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f23414f0 = 5;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f23415g0 = 6;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f23416h0 = 3;
    private String D;
    private int E = -1;
    private float F = Float.NaN;
    private float G = Float.NaN;
    private float H = Float.NaN;
    private float I = Float.NaN;
    private float J = Float.NaN;
    private float K = Float.NaN;
    private float L = Float.NaN;
    private float M = Float.NaN;
    private float N = Float.NaN;
    private float O = Float.NaN;
    private float P = Float.NaN;
    private float Q = Float.NaN;
    private int R = 0;
    private String S = null;
    private float T = Float.NaN;
    private float U = 0.0f;

    /* compiled from: KeyTimeCycle.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f23417a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f23418b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f23419c = 4;

        /* renamed from: d, reason: collision with root package name */
        private static final int f23420d = 5;

        /* renamed from: e, reason: collision with root package name */
        private static final int f23421e = 6;

        /* renamed from: f, reason: collision with root package name */
        private static final int f23422f = 8;

        /* renamed from: g, reason: collision with root package name */
        private static final int f23423g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f23424h = 9;

        /* renamed from: i, reason: collision with root package name */
        private static final int f23425i = 10;

        /* renamed from: j, reason: collision with root package name */
        private static final int f23426j = 12;

        /* renamed from: k, reason: collision with root package name */
        private static final int f23427k = 13;

        /* renamed from: l, reason: collision with root package name */
        private static final int f23428l = 14;

        /* renamed from: m, reason: collision with root package name */
        private static final int f23429m = 15;

        /* renamed from: n, reason: collision with root package name */
        private static final int f23430n = 16;

        /* renamed from: o, reason: collision with root package name */
        private static final int f23431o = 17;

        /* renamed from: p, reason: collision with root package name */
        private static final int f23432p = 18;

        /* renamed from: q, reason: collision with root package name */
        private static final int f23433q = 19;

        /* renamed from: r, reason: collision with root package name */
        private static final int f23434r = 20;

        /* renamed from: s, reason: collision with root package name */
        private static final int f23435s = 21;

        /* renamed from: t, reason: collision with root package name */
        private static SparseIntArray f23436t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f23436t = sparseIntArray;
            sparseIntArray.append(g.m.Qf, 1);
            f23436t.append(g.m.Zf, 2);
            f23436t.append(g.m.Vf, 4);
            f23436t.append(g.m.Wf, 5);
            f23436t.append(g.m.Xf, 6);
            f23436t.append(g.m.Tf, 7);
            f23436t.append(g.m.f25021fg, 8);
            f23436t.append(g.m.f25008eg, 9);
            f23436t.append(g.m.f24995dg, 10);
            f23436t.append(g.m.f24967bg, 12);
            f23436t.append(g.m.f24953ag, 13);
            f23436t.append(g.m.Uf, 14);
            f23436t.append(g.m.Rf, 15);
            f23436t.append(g.m.Sf, 16);
            f23436t.append(g.m.Yf, 17);
            f23436t.append(g.m.f24981cg, 18);
            f23436t.append(g.m.f25059ig, 20);
            f23436t.append(g.m.f25047hg, 21);
            f23436t.append(g.m.f25086kg, 19);
        }

        private a() {
        }

        public static void a(l c5, TypedArray a5) {
            int indexCount = a5.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = a5.getIndex(i4);
                switch (f23436t.get(index)) {
                    case 1:
                        c5.F = a5.getFloat(index, c5.F);
                        break;
                    case 2:
                        c5.G = a5.getDimension(index, c5.G);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        f23436t.get(index);
                        break;
                    case 4:
                        c5.H = a5.getFloat(index, c5.H);
                        break;
                    case 5:
                        c5.I = a5.getFloat(index, c5.I);
                        break;
                    case 6:
                        c5.J = a5.getFloat(index, c5.J);
                        break;
                    case 7:
                        c5.L = a5.getFloat(index, c5.L);
                        break;
                    case 8:
                        c5.K = a5.getFloat(index, c5.K);
                        break;
                    case 9:
                        c5.D = a5.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.l4) {
                            int resourceId = a5.getResourceId(index, c5.f23330b);
                            c5.f23330b = resourceId;
                            if (resourceId == -1) {
                                c5.f23331c = a5.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (a5.peekValue(index).type == 3) {
                            c5.f23331c = a5.getString(index);
                            break;
                        } else {
                            c5.f23330b = a5.getResourceId(index, c5.f23330b);
                            break;
                        }
                    case 12:
                        c5.f23329a = a5.getInt(index, c5.f23329a);
                        break;
                    case 13:
                        c5.E = a5.getInteger(index, c5.E);
                        break;
                    case 14:
                        c5.M = a5.getFloat(index, c5.M);
                        break;
                    case 15:
                        c5.N = a5.getDimension(index, c5.N);
                        break;
                    case 16:
                        c5.O = a5.getDimension(index, c5.O);
                        break;
                    case 17:
                        c5.P = a5.getDimension(index, c5.P);
                        break;
                    case 18:
                        c5.Q = a5.getFloat(index, c5.Q);
                        break;
                    case 19:
                        if (a5.peekValue(index).type == 3) {
                            c5.S = a5.getString(index);
                            c5.R = 7;
                            break;
                        } else {
                            c5.R = a5.getInt(index, c5.R);
                            break;
                        }
                    case 20:
                        c5.T = a5.getFloat(index, c5.T);
                        break;
                    case 21:
                        if (a5.peekValue(index).type == 5) {
                            c5.U = a5.getDimension(index, c5.U);
                            break;
                        } else {
                            c5.U = a5.getFloat(index, c5.U);
                            break;
                        }
                }
            }
        }
    }

    public l() {
        this.f23332d = 3;
        this.f23333e = new HashMap<>();
    }

    public void W(HashMap<String, androidx.constraintlayout.motion.utils.f> splines) {
        for (String str : splines.keySet()) {
            androidx.constraintlayout.motion.utils.f fVar = splines.get(str);
            if (fVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.I)) {
                                break;
                            } else {
                                fVar.c(this.f23329a, this.I, this.T, this.R, this.U);
                                break;
                            }
                        case "rotationY":
                            if (Float.isNaN(this.J)) {
                                break;
                            } else {
                                fVar.c(this.f23329a, this.J, this.T, this.R, this.U);
                                break;
                            }
                        case "translationX":
                            if (Float.isNaN(this.N)) {
                                break;
                            } else {
                                fVar.c(this.f23329a, this.N, this.T, this.R, this.U);
                                break;
                            }
                        case "translationY":
                            if (Float.isNaN(this.O)) {
                                break;
                            } else {
                                fVar.c(this.f23329a, this.O, this.T, this.R, this.U);
                                break;
                            }
                        case "translationZ":
                            if (Float.isNaN(this.P)) {
                                break;
                            } else {
                                fVar.c(this.f23329a, this.P, this.T, this.R, this.U);
                                break;
                            }
                        case "progress":
                            if (Float.isNaN(this.Q)) {
                                break;
                            } else {
                                fVar.c(this.f23329a, this.Q, this.T, this.R, this.U);
                                break;
                            }
                        case "scaleX":
                            if (Float.isNaN(this.L)) {
                                break;
                            } else {
                                fVar.c(this.f23329a, this.L, this.T, this.R, this.U);
                                break;
                            }
                        case "scaleY":
                            if (Float.isNaN(this.M)) {
                                break;
                            } else {
                                fVar.c(this.f23329a, this.M, this.T, this.R, this.U);
                                break;
                            }
                        case "rotation":
                            if (Float.isNaN(this.H)) {
                                break;
                            } else {
                                fVar.c(this.f23329a, this.H, this.T, this.R, this.U);
                                break;
                            }
                        case "elevation":
                            if (Float.isNaN(this.G)) {
                                break;
                            } else {
                                fVar.c(this.f23329a, this.G, this.T, this.R, this.U);
                                break;
                            }
                        case "transitionPathRotate":
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                fVar.c(this.f23329a, this.K, this.T, this.R, this.U);
                                break;
                            }
                        case "alpha":
                            if (Float.isNaN(this.F)) {
                                break;
                            } else {
                                fVar.c(this.f23329a, this.F, this.T, this.R, this.U);
                                break;
                            }
                    }
                } else {
                    androidx.constraintlayout.widget.a aVar = this.f23333e.get(str.substring(7));
                    if (aVar != null) {
                        ((f.b) fVar).k(this.f23329a, aVar, this.T, this.R, this.U);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> splines) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* renamed from: b */
    public f clone() {
        return new l().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f src) {
        super.c(src);
        l lVar = (l) src;
        this.D = lVar.D;
        this.E = lVar.E;
        this.R = lVar.R;
        this.T = lVar.T;
        this.U = lVar.U;
        this.Q = lVar.Q;
        this.F = lVar.F;
        this.G = lVar.G;
        this.H = lVar.H;
        this.K = lVar.K;
        this.I = lVar.I;
        this.J = lVar.J;
        this.L = lVar.L;
        this.M = lVar.M;
        this.N = lVar.N;
        this.O = lVar.O;
        this.P = lVar.P;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> attributes) {
        if (!Float.isNaN(this.F)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.G)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.H)) {
            attributes.add("rotation");
        }
        if (!Float.isNaN(this.I)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.J)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.N)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.O)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.P)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.K)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.L)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.M)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.Q)) {
            attributes.add("progress");
        }
        if (this.f23333e.size() > 0) {
            Iterator<String> it = this.f23333e.keySet().iterator();
            while (it.hasNext()) {
                attributes.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attrs) {
        a.a(this, context.obtainStyledAttributes(attrs, g.m.Pf));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void i(HashMap<String, Integer> interpolation) {
        if (this.E == -1) {
            return;
        }
        if (!Float.isNaN(this.F)) {
            interpolation.put("alpha", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.G)) {
            interpolation.put("elevation", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.H)) {
            interpolation.put("rotation", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.I)) {
            interpolation.put("rotationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.J)) {
            interpolation.put("rotationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.N)) {
            interpolation.put("translationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.O)) {
            interpolation.put("translationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.P)) {
            interpolation.put("translationZ", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.K)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.L)) {
            interpolation.put("scaleX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.L)) {
            interpolation.put("scaleY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.Q)) {
            interpolation.put("progress", Integer.valueOf(this.E));
        }
        if (this.f23333e.size() > 0) {
            Iterator<String> it = this.f23333e.keySet().iterator();
            while (it.hasNext()) {
                interpolation.put(androidx.constraintlayout.core.motion.key.c.a("CUSTOM,", it.next()), Integer.valueOf(this.E));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String tag, Object value) {
        tag.getClass();
        char c5 = 65535;
        switch (tag.hashCode()) {
            case -1913008125:
                if (tag.equals("motionProgress")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1812823328:
                if (tag.equals("transitionEasing")) {
                    c5 = 1;
                    break;
                }
                break;
            case -1249320806:
                if (tag.equals("rotationX")) {
                    c5 = 2;
                    break;
                }
                break;
            case -1249320805:
                if (tag.equals("rotationY")) {
                    c5 = 3;
                    break;
                }
                break;
            case -1225497657:
                if (tag.equals("translationX")) {
                    c5 = 4;
                    break;
                }
                break;
            case -1225497656:
                if (tag.equals("translationY")) {
                    c5 = 5;
                    break;
                }
                break;
            case -1225497655:
                if (tag.equals("translationZ")) {
                    c5 = 6;
                    break;
                }
                break;
            case -908189618:
                if (tag.equals("scaleX")) {
                    c5 = 7;
                    break;
                }
                break;
            case -908189617:
                if (tag.equals("scaleY")) {
                    c5 = '\b';
                    break;
                }
                break;
            case -40300674:
                if (tag.equals("rotation")) {
                    c5 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (tag.equals("elevation")) {
                    c5 = '\n';
                    break;
                }
                break;
            case 37232917:
                if (tag.equals("transitionPathRotate")) {
                    c5 = 11;
                    break;
                }
                break;
            case 92909918:
                if (tag.equals("alpha")) {
                    c5 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (tag.equals("waveOffset")) {
                    c5 = org.apache.commons.lang3.m.f86065d;
                    break;
                }
                break;
            case 184161818:
                if (tag.equals("wavePeriod")) {
                    c5 = 14;
                    break;
                }
                break;
            case 579057826:
                if (tag.equals("curveFit")) {
                    c5 = 15;
                    break;
                }
                break;
            case 1532805160:
                if (tag.equals("waveShape")) {
                    c5 = 16;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                this.Q = m(value);
                break;
            case 1:
                this.D = value.toString();
                break;
            case 2:
                this.I = m(value);
                break;
            case 3:
                this.J = m(value);
                break;
            case 4:
                this.N = m(value);
                break;
            case 5:
                this.O = m(value);
                break;
            case 6:
                this.P = m(value);
                break;
            case 7:
                this.L = m(value);
                break;
            case '\b':
                this.M = m(value);
                break;
            case '\t':
                this.H = m(value);
                break;
            case '\n':
                this.G = m(value);
                break;
            case 11:
                this.K = m(value);
                break;
            case '\f':
                this.F = m(value);
                break;
            case '\r':
                this.U = m(value);
                break;
            case 14:
                this.T = m(value);
                break;
            case 15:
                this.E = n(value);
                break;
            case 16:
                if (!(value instanceof Integer)) {
                    this.R = 7;
                    this.S = value.toString();
                    break;
                } else {
                    this.R = n(value);
                    break;
                }
        }
    }
}
