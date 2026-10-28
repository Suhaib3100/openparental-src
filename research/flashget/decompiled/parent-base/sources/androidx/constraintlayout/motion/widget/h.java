package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: KeyCycle.java */
/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: d0, reason: collision with root package name */
    public static final int f23356d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f23357e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f23358f0 = 2;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f23359g0 = 3;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f23360h0 = 4;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f23361i0 = 5;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f23362j0 = 6;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f23363k0 = 4;
    private String D = null;
    private int E = 0;
    private int F = -1;
    private String G = null;
    private float H = Float.NaN;
    private float I = 0.0f;
    private float J = 0.0f;
    private float K = Float.NaN;
    private int L = -1;
    private float M = Float.NaN;
    private float N = Float.NaN;
    private float O = Float.NaN;
    private float P = Float.NaN;
    private float Q = Float.NaN;
    private float R = Float.NaN;
    private float S = Float.NaN;
    private float T = Float.NaN;
    private float U = Float.NaN;
    private float V = Float.NaN;
    private float W = Float.NaN;
    private static final String X = "KeyCycle";
    static final String Y = "KeyCycle";
    public static final String Z = "wavePeriod";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f23355c0 = "waveShape";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f23354b0 = "wavePhase";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f23353a0 = "waveOffset";

    /* compiled from: KeyCycle.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f23364a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f23365b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f23366c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final int f23367d = 4;

        /* renamed from: e, reason: collision with root package name */
        private static final int f23368e = 5;

        /* renamed from: f, reason: collision with root package name */
        private static final int f23369f = 6;

        /* renamed from: g, reason: collision with root package name */
        private static final int f23370g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f23371h = 8;

        /* renamed from: i, reason: collision with root package name */
        private static final int f23372i = 9;

        /* renamed from: j, reason: collision with root package name */
        private static final int f23373j = 10;

        /* renamed from: k, reason: collision with root package name */
        private static final int f23374k = 11;

        /* renamed from: l, reason: collision with root package name */
        private static final int f23375l = 12;

        /* renamed from: m, reason: collision with root package name */
        private static final int f23376m = 13;

        /* renamed from: n, reason: collision with root package name */
        private static final int f23377n = 14;

        /* renamed from: o, reason: collision with root package name */
        private static final int f23378o = 15;

        /* renamed from: p, reason: collision with root package name */
        private static final int f23379p = 16;

        /* renamed from: q, reason: collision with root package name */
        private static final int f23380q = 17;

        /* renamed from: r, reason: collision with root package name */
        private static final int f23381r = 18;

        /* renamed from: s, reason: collision with root package name */
        private static final int f23382s = 19;

        /* renamed from: t, reason: collision with root package name */
        private static final int f23383t = 20;

        /* renamed from: u, reason: collision with root package name */
        private static final int f23384u = 21;

        /* renamed from: v, reason: collision with root package name */
        private static SparseIntArray f23385v;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f23385v = sparseIntArray;
            sparseIntArray.append(g.m.f25180rf, 1);
            f23385v.append(g.m.f25153pf, 2);
            f23385v.append(g.m.f25193sf, 3);
            f23385v.append(g.m.f25139of, 4);
            f23385v.append(g.m.f25253xf, 5);
            f23385v.append(g.m.f25229vf, 6);
            f23385v.append(g.m.f25217uf, 7);
            f23385v.append(g.m.f25265yf, 8);
            f23385v.append(g.m.f25007ef, 9);
            f23385v.append(g.m.f25125nf, 10);
            f23385v.append(g.m.f25072jf, 11);
            f23385v.append(g.m.f25085kf, 12);
            f23385v.append(g.m.f25098lf, 13);
            f23385v.append(g.m.f25205tf, 14);
            f23385v.append(g.m.f25046hf, 15);
            f23385v.append(g.m.f0if, 16);
            f23385v.append(g.m.f25020ff, 17);
            f23385v.append(g.m.f25033gf, 18);
            f23385v.append(g.m.f25111mf, 19);
            f23385v.append(g.m.f25167qf, 20);
            f23385v.append(g.m.f25241wf, 21);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(h c5, TypedArray a5) {
            int indexCount = a5.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = a5.getIndex(i4);
                switch (f23385v.get(index)) {
                    case 1:
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
                    case 2:
                        c5.f23329a = a5.getInt(index, c5.f23329a);
                        break;
                    case 3:
                        c5.D = a5.getString(index);
                        break;
                    case 4:
                        c5.E = a5.getInteger(index, c5.E);
                        break;
                    case 5:
                        if (a5.peekValue(index).type == 3) {
                            c5.G = a5.getString(index);
                            c5.F = 7;
                            break;
                        } else {
                            c5.F = a5.getInt(index, c5.F);
                            break;
                        }
                    case 6:
                        c5.H = a5.getFloat(index, c5.H);
                        break;
                    case 7:
                        if (a5.peekValue(index).type == 5) {
                            c5.I = a5.getDimension(index, c5.I);
                            break;
                        } else {
                            c5.I = a5.getFloat(index, c5.I);
                            break;
                        }
                    case 8:
                        c5.L = a5.getInt(index, c5.L);
                        break;
                    case 9:
                        c5.M = a5.getFloat(index, c5.M);
                        break;
                    case 10:
                        c5.N = a5.getDimension(index, c5.N);
                        break;
                    case 11:
                        c5.O = a5.getFloat(index, c5.O);
                        break;
                    case 12:
                        c5.Q = a5.getFloat(index, c5.Q);
                        break;
                    case 13:
                        c5.R = a5.getFloat(index, c5.R);
                        break;
                    case 14:
                        c5.P = a5.getFloat(index, c5.P);
                        break;
                    case 15:
                        c5.S = a5.getFloat(index, c5.S);
                        break;
                    case 16:
                        c5.T = a5.getFloat(index, c5.T);
                        break;
                    case 17:
                        c5.U = a5.getDimension(index, c5.U);
                        break;
                    case 18:
                        c5.V = a5.getDimension(index, c5.V);
                        break;
                    case 19:
                        c5.W = a5.getDimension(index, c5.W);
                        break;
                    case 20:
                        c5.K = a5.getFloat(index, c5.K);
                        break;
                    case 21:
                        c5.J = a5.getFloat(index, c5.J) / 360.0f;
                        break;
                    default:
                        Integer.toHexString(index);
                        f23385v.get(index);
                        break;
                }
            }
        }
    }

    public h() {
        this.f23332d = 4;
        this.f23333e = new HashMap<>();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> splines) {
        c.n("KeyCycle", "add " + splines.size() + " values", 2);
        for (String str : splines.keySet()) {
            androidx.constraintlayout.motion.utils.d dVar = splines.get(str);
            if (dVar != null) {
                str.getClass();
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
                    case -40300674:
                        if (str.equals("rotation")) {
                            c5 = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c5 = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c5 = '\n';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c5 = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c5 = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c5 = org.apache.commons.lang3.m.f86065d;
                            break;
                        }
                        break;
                }
                switch (c5) {
                    case 0:
                        dVar.g(this.f23329a, this.Q);
                        break;
                    case 1:
                        dVar.g(this.f23329a, this.R);
                        break;
                    case 2:
                        dVar.g(this.f23329a, this.U);
                        break;
                    case 3:
                        dVar.g(this.f23329a, this.V);
                        break;
                    case 4:
                        dVar.g(this.f23329a, this.W);
                        break;
                    case 5:
                        dVar.g(this.f23329a, this.K);
                        break;
                    case 6:
                        dVar.g(this.f23329a, this.S);
                        break;
                    case 7:
                        dVar.g(this.f23329a, this.T);
                        break;
                    case '\b':
                        dVar.g(this.f23329a, this.O);
                        break;
                    case '\t':
                        dVar.g(this.f23329a, this.N);
                        break;
                    case '\n':
                        dVar.g(this.f23329a, this.P);
                        break;
                    case 11:
                        dVar.g(this.f23329a, this.M);
                        break;
                    case '\f':
                        dVar.g(this.f23329a, this.I);
                        break;
                    case '\r':
                        dVar.g(this.f23329a, this.J);
                        break;
                    default:
                        str.startsWith("CUSTOM");
                        break;
                }
            }
        }
    }

    public void a0(HashMap<String, androidx.constraintlayout.motion.utils.c> oscSet) {
        androidx.constraintlayout.motion.utils.c cVar;
        androidx.constraintlayout.motion.utils.c cVar2;
        for (String str : oscSet.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = this.f23333e.get(str.substring(7));
                if (aVar != null && aVar.j() == a.b.FLOAT_TYPE && (cVar = oscSet.get(str)) != null) {
                    cVar.g(this.f23329a, this.F, this.G, this.L, this.H, this.I, this.J, aVar.k(), aVar);
                }
            } else {
                float b02 = b0(str);
                if (!Float.isNaN(b02) && (cVar2 = oscSet.get(str)) != null) {
                    cVar2.f(this.f23329a, this.F, this.G, this.L, this.H, this.I, this.J, b02);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* renamed from: b */
    public f clone() {
        return new h().c(this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public float b0(String key) {
        key.getClass();
        char c5 = 65535;
        switch (key.hashCode()) {
            case -1249320806:
                if (key.equals("rotationX")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (key.equals("rotationY")) {
                    c5 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (key.equals("translationX")) {
                    c5 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (key.equals("translationY")) {
                    c5 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (key.equals("translationZ")) {
                    c5 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (key.equals("progress")) {
                    c5 = 5;
                    break;
                }
                break;
            case -908189618:
                if (key.equals("scaleX")) {
                    c5 = 6;
                    break;
                }
                break;
            case -908189617:
                if (key.equals("scaleY")) {
                    c5 = 7;
                    break;
                }
                break;
            case -40300674:
                if (key.equals("rotation")) {
                    c5 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (key.equals("elevation")) {
                    c5 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (key.equals("transitionPathRotate")) {
                    c5 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (key.equals("alpha")) {
                    c5 = 11;
                    break;
                }
                break;
            case 156108012:
                if (key.equals("waveOffset")) {
                    c5 = '\f';
                    break;
                }
                break;
            case 1530034690:
                if (key.equals("wavePhase")) {
                    c5 = org.apache.commons.lang3.m.f86065d;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                return this.Q;
            case 1:
                return this.R;
            case 2:
                return this.U;
            case 3:
                return this.V;
            case 4:
                return this.W;
            case 5:
                return this.K;
            case 6:
                return this.S;
            case 7:
                return this.T;
            case '\b':
                return this.O;
            case '\t':
                return this.N;
            case '\n':
                return this.P;
            case 11:
                return this.M;
            case '\f':
                return this.I;
            case '\r':
                return this.J;
            default:
                key.startsWith("CUSTOM");
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f src) {
        super.c(src);
        h hVar = (h) src;
        this.D = hVar.D;
        this.E = hVar.E;
        this.F = hVar.F;
        this.G = hVar.G;
        this.H = hVar.H;
        this.I = hVar.I;
        this.J = hVar.J;
        this.K = hVar.K;
        this.L = hVar.L;
        this.M = hVar.M;
        this.N = hVar.N;
        this.O = hVar.O;
        this.P = hVar.P;
        this.Q = hVar.Q;
        this.R = hVar.R;
        this.S = hVar.S;
        this.T = hVar.T;
        this.U = hVar.U;
        this.V = hVar.V;
        this.W = hVar.W;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> attributes) {
        if (!Float.isNaN(this.M)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.N)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.O)) {
            attributes.add("rotation");
        }
        if (!Float.isNaN(this.Q)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.R)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.S)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.T)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.P)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.U)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.V)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.W)) {
            attributes.add("translationZ");
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
        a.b(this, context.obtainStyledAttributes(attrs, g.m.f24994df));
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
            case 1530034690:
                if (tag.equals("wavePhase")) {
                    c5 = 16;
                    break;
                }
                break;
            case 1532805160:
                if (tag.equals("waveShape")) {
                    c5 = 17;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                this.K = m(value);
                break;
            case 1:
                this.D = value.toString();
                break;
            case 2:
                this.Q = m(value);
                break;
            case 3:
                this.R = m(value);
                break;
            case 4:
                this.U = m(value);
                break;
            case 5:
                this.V = m(value);
                break;
            case 6:
                this.W = m(value);
                break;
            case 7:
                this.S = m(value);
                break;
            case '\b':
                this.T = m(value);
                break;
            case '\t':
                this.O = m(value);
                break;
            case '\n':
                this.N = m(value);
                break;
            case 11:
                this.P = m(value);
                break;
            case '\f':
                this.M = m(value);
                break;
            case '\r':
                this.I = m(value);
                break;
            case 14:
                this.H = m(value);
                break;
            case 15:
                this.E = n(value);
                break;
            case 16:
                this.J = m(value);
                break;
            case 17:
                if (!(value instanceof Integer)) {
                    this.F = 7;
                    this.G = value.toString();
                    break;
                } else {
                    this.F = n(value);
                    break;
                }
        }
    }
}
