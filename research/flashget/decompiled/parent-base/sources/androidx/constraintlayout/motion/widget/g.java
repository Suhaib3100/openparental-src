package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.d;
import androidx.constraintlayout.widget.g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: KeyAttributes.java */
/* loaded from: classes.dex */
public class g extends f {
    static final String U = "KeyAttribute";
    private static final String V = "KeyAttributes";
    private static final boolean W = false;
    public static final int X = 1;
    private String D;
    private int E = -1;
    private boolean F = false;
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
    private float R = Float.NaN;
    private float S = Float.NaN;
    private float T = Float.NaN;

    /* compiled from: KeyAttributes.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f23334a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f23335b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f23336c = 4;

        /* renamed from: d, reason: collision with root package name */
        private static final int f23337d = 5;

        /* renamed from: e, reason: collision with root package name */
        private static final int f23338e = 6;

        /* renamed from: f, reason: collision with root package name */
        private static final int f23339f = 8;

        /* renamed from: g, reason: collision with root package name */
        private static final int f23340g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f23341h = 9;

        /* renamed from: i, reason: collision with root package name */
        private static final int f23342i = 10;

        /* renamed from: j, reason: collision with root package name */
        private static final int f23343j = 12;

        /* renamed from: k, reason: collision with root package name */
        private static final int f23344k = 13;

        /* renamed from: l, reason: collision with root package name */
        private static final int f23345l = 14;

        /* renamed from: m, reason: collision with root package name */
        private static final int f23346m = 15;

        /* renamed from: n, reason: collision with root package name */
        private static final int f23347n = 16;

        /* renamed from: o, reason: collision with root package name */
        private static final int f23348o = 17;

        /* renamed from: p, reason: collision with root package name */
        private static final int f23349p = 18;

        /* renamed from: q, reason: collision with root package name */
        private static final int f23350q = 19;

        /* renamed from: r, reason: collision with root package name */
        private static final int f23351r = 20;

        /* renamed from: s, reason: collision with root package name */
        private static SparseIntArray f23352s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f23352s = sparseIntArray;
            sparseIntArray.append(g.m.Ke, 1);
            f23352s.append(g.m.Ve, 2);
            f23352s.append(g.m.Re, 4);
            f23352s.append(g.m.Se, 5);
            f23352s.append(g.m.Te, 6);
            f23352s.append(g.m.Le, 19);
            f23352s.append(g.m.Me, 20);
            f23352s.append(g.m.Pe, 7);
            f23352s.append(g.m.f24980cf, 8);
            f23352s.append(g.m.f24966bf, 9);
            f23352s.append(g.m.Ze, 10);
            f23352s.append(g.m.Xe, 12);
            f23352s.append(g.m.We, 13);
            f23352s.append(g.m.Qe, 14);
            f23352s.append(g.m.Ne, 15);
            f23352s.append(g.m.Oe, 16);
            f23352s.append(g.m.Ue, 17);
            f23352s.append(g.m.Ye, 18);
        }

        private a() {
        }

        public static void a(g c5, TypedArray a5) {
            int indexCount = a5.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = a5.getIndex(i4);
                switch (f23352s.get(index)) {
                    case 1:
                        c5.G = a5.getFloat(index, c5.G);
                        break;
                    case 2:
                        c5.H = a5.getDimension(index, c5.H);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        f23352s.get(index);
                        break;
                    case 4:
                        c5.I = a5.getFloat(index, c5.I);
                        break;
                    case 5:
                        c5.J = a5.getFloat(index, c5.J);
                        break;
                    case 6:
                        c5.K = a5.getFloat(index, c5.K);
                        break;
                    case 7:
                        c5.O = a5.getFloat(index, c5.O);
                        break;
                    case 8:
                        c5.N = a5.getFloat(index, c5.N);
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
                        c5.P = a5.getFloat(index, c5.P);
                        break;
                    case 15:
                        c5.Q = a5.getDimension(index, c5.Q);
                        break;
                    case 16:
                        c5.R = a5.getDimension(index, c5.R);
                        break;
                    case 17:
                        c5.S = a5.getDimension(index, c5.S);
                        break;
                    case 18:
                        c5.T = a5.getFloat(index, c5.T);
                        break;
                    case 19:
                        c5.L = a5.getDimension(index, c5.L);
                        break;
                    case 20:
                        c5.M = a5.getDimension(index, c5.M);
                        break;
                }
            }
        }
    }

    public g() {
        this.f23332d = 1;
        this.f23333e = new HashMap<>();
    }

    int T() {
        return this.E;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> splines) {
        for (String str : splines.keySet()) {
            androidx.constraintlayout.motion.utils.d dVar = splines.get(str);
            if (dVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    char c5 = 65535;
                    switch (str.hashCode()) {
                        case -1249320806:
                            if (str.equals("rotationX")) {
                                c5 = 0;
                                break;
                            }
                            break;
                        case -1249320805:
                            if (str.equals("rotationY")) {
                                c5 = 1;
                                break;
                            }
                            break;
                        case -1225497657:
                            if (str.equals("translationX")) {
                                c5 = 2;
                                break;
                            }
                            break;
                        case -1225497656:
                            if (str.equals("translationY")) {
                                c5 = 3;
                                break;
                            }
                            break;
                        case -1225497655:
                            if (str.equals("translationZ")) {
                                c5 = 4;
                                break;
                            }
                            break;
                        case -1001078227:
                            if (str.equals("progress")) {
                                c5 = 5;
                                break;
                            }
                            break;
                        case -908189618:
                            if (str.equals("scaleX")) {
                                c5 = 6;
                                break;
                            }
                            break;
                        case -908189617:
                            if (str.equals("scaleY")) {
                                c5 = 7;
                                break;
                            }
                            break;
                        case -760884510:
                            if (str.equals("transformPivotX")) {
                                c5 = '\b';
                                break;
                            }
                            break;
                        case -760884509:
                            if (str.equals("transformPivotY")) {
                                c5 = '\t';
                                break;
                            }
                            break;
                        case -40300674:
                            if (str.equals("rotation")) {
                                c5 = '\n';
                                break;
                            }
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                c5 = 11;
                                break;
                            }
                            break;
                        case 37232917:
                            if (str.equals("transitionPathRotate")) {
                                c5 = '\f';
                                break;
                            }
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                c5 = org.apache.commons.lang3.m.f86065d;
                                break;
                            }
                            break;
                    }
                    switch (c5) {
                        case 0:
                            if (Float.isNaN(this.J)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.J);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.K);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.Q)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.Q);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.R)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.R);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.S)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.S);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.T)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.T);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.O)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.O);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.P)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.P);
                                break;
                            }
                        case '\b':
                            if (Float.isNaN(this.J)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.L);
                                break;
                            }
                        case '\t':
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.M);
                                break;
                            }
                        case '\n':
                            if (Float.isNaN(this.I)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.I);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.H)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.H);
                                break;
                            }
                        case '\f':
                            if (Float.isNaN(this.N)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.N);
                                break;
                            }
                        case '\r':
                            if (Float.isNaN(this.G)) {
                                break;
                            } else {
                                dVar.g(this.f23329a, this.G);
                                break;
                            }
                    }
                } else {
                    androidx.constraintlayout.widget.a aVar = this.f23333e.get(str.substring(7));
                    if (aVar != null) {
                        ((d.b) dVar).n(this.f23329a, aVar);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* renamed from: b */
    public f clone() {
        return new g().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f src) {
        super.c(src);
        g gVar = (g) src;
        this.E = gVar.E;
        this.F = gVar.F;
        this.G = gVar.G;
        this.H = gVar.H;
        this.I = gVar.I;
        this.J = gVar.J;
        this.K = gVar.K;
        this.L = gVar.L;
        this.M = gVar.M;
        this.N = gVar.N;
        this.O = gVar.O;
        this.P = gVar.P;
        this.Q = gVar.Q;
        this.R = gVar.R;
        this.S = gVar.S;
        this.T = gVar.T;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> attributes) {
        if (!Float.isNaN(this.G)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            attributes.add("rotation");
        }
        if (!Float.isNaN(this.J)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.K)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.L)) {
            attributes.add("transformPivotX");
        }
        if (!Float.isNaN(this.M)) {
            attributes.add("transformPivotY");
        }
        if (!Float.isNaN(this.Q)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.R)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.S)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.N)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.O)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.P)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.T)) {
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
        a.a(this, context.obtainStyledAttributes(attrs, g.m.Je));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void i(HashMap<String, Integer> interpolation) {
        if (this.E == -1) {
            return;
        }
        if (!Float.isNaN(this.G)) {
            interpolation.put("alpha", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.H)) {
            interpolation.put("elevation", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.I)) {
            interpolation.put("rotation", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.J)) {
            interpolation.put("rotationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.K)) {
            interpolation.put("rotationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.L)) {
            interpolation.put("transformPivotX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.M)) {
            interpolation.put("transformPivotY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.Q)) {
            interpolation.put("translationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.R)) {
            interpolation.put("translationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.S)) {
            interpolation.put("translationZ", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.N)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.O)) {
            interpolation.put("scaleX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.P)) {
            interpolation.put("scaleY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.T)) {
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
            case -760884510:
                if (tag.equals("transformPivotX")) {
                    c5 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (tag.equals("transformPivotY")) {
                    c5 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (tag.equals("rotation")) {
                    c5 = 11;
                    break;
                }
                break;
            case -4379043:
                if (tag.equals("elevation")) {
                    c5 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (tag.equals("transitionPathRotate")) {
                    c5 = org.apache.commons.lang3.m.f86065d;
                    break;
                }
                break;
            case 92909918:
                if (tag.equals("alpha")) {
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
            case 1941332754:
                if (tag.equals("visibility")) {
                    c5 = 16;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                this.T = m(value);
                break;
            case 1:
                this.D = value.toString();
                break;
            case 2:
                this.J = m(value);
                break;
            case 3:
                this.K = m(value);
                break;
            case 4:
                this.Q = m(value);
                break;
            case 5:
                this.R = m(value);
                break;
            case 6:
                this.S = m(value);
                break;
            case 7:
                this.O = m(value);
                break;
            case '\b':
                this.P = m(value);
                break;
            case '\t':
                this.L = m(value);
                break;
            case '\n':
                this.M = m(value);
                break;
            case 11:
                this.I = m(value);
                break;
            case '\f':
                this.H = m(value);
                break;
            case '\r':
                this.N = m(value);
                break;
            case 14:
                this.G = m(value);
                break;
            case 15:
                this.E = n(value);
                break;
            case 16:
                this.F = l(value);
                break;
        }
    }
}
