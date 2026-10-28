package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: KeyCycle.java */
/* loaded from: classes2.dex */
public class j extends f {
    private static final String Q = "KeyCycle";
    static final String R = "KeyCycle";
    public static final int S = 4;

    /* renamed from: y, reason: collision with root package name */
    private String f1849y = null;

    /* renamed from: z, reason: collision with root package name */
    private int f1850z = 0;
    private int A = -1;
    private float B = Float.NaN;
    private float C = 0.0f;
    private float D = Float.NaN;
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

    /* compiled from: KeyCycle.java */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f1851a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f1852b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f1853c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final int f1854d = 4;

        /* renamed from: e, reason: collision with root package name */
        private static final int f1855e = 5;

        /* renamed from: f, reason: collision with root package name */
        private static final int f1856f = 6;

        /* renamed from: g, reason: collision with root package name */
        private static final int f1857g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f1858h = 8;

        /* renamed from: i, reason: collision with root package name */
        private static final int f1859i = 9;

        /* renamed from: j, reason: collision with root package name */
        private static final int f1860j = 10;

        /* renamed from: k, reason: collision with root package name */
        private static final int f1861k = 11;

        /* renamed from: l, reason: collision with root package name */
        private static final int f1862l = 12;

        /* renamed from: m, reason: collision with root package name */
        private static final int f1863m = 13;

        /* renamed from: n, reason: collision with root package name */
        private static final int f1864n = 14;

        /* renamed from: o, reason: collision with root package name */
        private static final int f1865o = 15;

        /* renamed from: p, reason: collision with root package name */
        private static final int f1866p = 16;

        /* renamed from: q, reason: collision with root package name */
        private static final int f1867q = 17;

        /* renamed from: r, reason: collision with root package name */
        private static final int f1868r = 18;

        /* renamed from: s, reason: collision with root package name */
        private static final int f1869s = 19;

        /* renamed from: t, reason: collision with root package name */
        private static final int f1870t = 20;

        /* renamed from: u, reason: collision with root package name */
        private static SparseIntArray f1871u;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1871u = sparseIntArray;
            sparseIntArray.append(f.m.Pb, 1);
            f1871u.append(f.m.Nb, 2);
            f1871u.append(f.m.Qb, 3);
            f1871u.append(f.m.Mb, 4);
            f1871u.append(f.m.Ub, 5);
            f1871u.append(f.m.Tb, 6);
            f1871u.append(f.m.Sb, 7);
            f1871u.append(f.m.Vb, 8);
            f1871u.append(f.m.Cb, 9);
            f1871u.append(f.m.Lb, 10);
            f1871u.append(f.m.Hb, 11);
            f1871u.append(f.m.Ib, 12);
            f1871u.append(f.m.Jb, 13);
            f1871u.append(f.m.Rb, 14);
            f1871u.append(f.m.Fb, 15);
            f1871u.append(f.m.Gb, 16);
            f1871u.append(f.m.Db, 17);
            f1871u.append(f.m.Eb, 18);
            f1871u.append(f.m.Kb, 19);
            f1871u.append(f.m.Ob, 20);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(j jVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArray.getIndex(i5);
                switch (f1871u.get(index)) {
                    case 1:
                        if (MotionLayout.f1701s1) {
                            int resourceId = typedArray.getResourceId(index, jVar.f1823b);
                            jVar.f1823b = resourceId;
                            if (resourceId == -1) {
                                jVar.f1824c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            jVar.f1824c = typedArray.getString(index);
                            break;
                        } else {
                            jVar.f1823b = typedArray.getResourceId(index, jVar.f1823b);
                            break;
                        }
                    case 2:
                        jVar.f1822a = typedArray.getInt(index, jVar.f1822a);
                        break;
                    case 3:
                        jVar.f1849y = typedArray.getString(index);
                        break;
                    case 4:
                        jVar.f1850z = typedArray.getInteger(index, jVar.f1850z);
                        break;
                    case 5:
                        jVar.A = typedArray.getInt(index, jVar.A);
                        break;
                    case 6:
                        jVar.B = typedArray.getFloat(index, jVar.B);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            jVar.C = typedArray.getDimension(index, jVar.C);
                            break;
                        } else {
                            jVar.C = typedArray.getFloat(index, jVar.C);
                            break;
                        }
                    case 8:
                        jVar.E = typedArray.getInt(index, jVar.E);
                        break;
                    case 9:
                        jVar.F = typedArray.getFloat(index, jVar.F);
                        break;
                    case 10:
                        jVar.G = typedArray.getDimension(index, jVar.G);
                        break;
                    case 11:
                        jVar.H = typedArray.getFloat(index, jVar.H);
                        break;
                    case 12:
                        jVar.J = typedArray.getFloat(index, jVar.J);
                        break;
                    case 13:
                        jVar.K = typedArray.getFloat(index, jVar.K);
                        break;
                    case 14:
                        jVar.I = typedArray.getFloat(index, jVar.I);
                        break;
                    case 15:
                        jVar.L = typedArray.getFloat(index, jVar.L);
                        break;
                    case 16:
                        jVar.M = typedArray.getFloat(index, jVar.M);
                        break;
                    case 17:
                        jVar.N = typedArray.getDimension(index, jVar.N);
                        break;
                    case 18:
                        jVar.O = typedArray.getDimension(index, jVar.O);
                        break;
                    case 19:
                        jVar.P = typedArray.getDimension(index, jVar.P);
                        break;
                    case 20:
                        jVar.D = typedArray.getFloat(index, jVar.D);
                        break;
                    default:
                        Integer.toHexString(index);
                        f1871u.get(index);
                        break;
                }
            }
        }
    }

    public j() {
        this.f1825d = 4;
        this.f1826e = new HashMap<>();
    }

    public void S(HashMap<String, k> hashMap) {
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = this.f1826e.get(str.substring(7));
                if (aVar != null && aVar.d() == a.b.FLOAT_TYPE) {
                    hashMap.get(str).f(this.f1822a, this.A, this.E, this.B, this.C, aVar.e(), aVar);
                }
            } else {
                float T = T(str);
                if (!Float.isNaN(T)) {
                    hashMap.get(str).e(this.f1822a, this.A, this.E, this.B, this.C, T);
                }
            }
        }
    }

    public float T(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return this.J;
            case "rotationY":
                return this.K;
            case "translationX":
                return this.N;
            case "translationY":
                return this.O;
            case "translationZ":
                return this.P;
            case "progress":
                return this.D;
            case "scaleX":
                return this.L;
            case "scaleY":
                return this.M;
            case "rotation":
                return this.H;
            case "elevation":
                return this.G;
            case "transitionPathRotate":
                return this.I;
            case "alpha":
                return this.F;
            case "waveOffset":
                return this.C;
            default:
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, x> hashMap) {
        x xVar;
        d.m("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            xVar = hashMap.get(str);
            str.getClass();
            switch (str) {
                case "rotationX":
                    xVar.f(this.f1822a, this.J);
                    break;
                case "rotationY":
                    xVar.f(this.f1822a, this.K);
                    break;
                case "translationX":
                    xVar.f(this.f1822a, this.N);
                    break;
                case "translationY":
                    xVar.f(this.f1822a, this.O);
                    break;
                case "translationZ":
                    xVar.f(this.f1822a, this.P);
                    break;
                case "progress":
                    xVar.f(this.f1822a, this.D);
                    break;
                case "scaleX":
                    xVar.f(this.f1822a, this.L);
                    break;
                case "scaleY":
                    xVar.f(this.f1822a, this.M);
                    break;
                case "rotation":
                    xVar.f(this.f1822a, this.H);
                    break;
                case "elevation":
                    xVar.f(this.f1822a, this.G);
                    break;
                case "transitionPathRotate":
                    xVar.f(this.f1822a, this.I);
                    break;
                case "alpha":
                    xVar.f(this.f1822a, this.F);
                    break;
                case "waveOffset":
                    xVar.f(this.f1822a, this.C);
                    break;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.F)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("translationZ");
        }
        if (this.f1826e.size() > 0) {
            Iterator<String> it = this.f1826e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void c(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, f.m.Bb));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "transitionEasing":
                this.f1849y = obj.toString();
                break;
            case "rotationX":
                this.J = h(obj);
                break;
            case "rotationY":
                this.K = h(obj);
                break;
            case "translationX":
                this.N = h(obj);
                break;
            case "translationY":
                this.O = h(obj);
                break;
            case "progress":
                this.D = h(obj);
                break;
            case "scaleX":
                this.L = h(obj);
                break;
            case "scaleY":
                this.M = h(obj);
                break;
            case "rotation":
                this.H = h(obj);
                break;
            case "elevation":
                this.G = h(obj);
                break;
            case "transitionPathRotate":
                this.I = h(obj);
                break;
            case "alpha":
                this.F = h(obj);
                break;
            case "waveOffset":
                this.C = h(obj);
                break;
            case "wavePeriod":
                this.B = h(obj);
                break;
            case "curveFit":
                this.f1850z = i(obj);
                break;
            case "mTranslationZ":
                this.P = h(obj);
                break;
        }
    }
}
