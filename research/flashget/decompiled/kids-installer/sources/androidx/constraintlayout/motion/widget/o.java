package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: KeyTimeCycle.java */
/* loaded from: classes2.dex */
public class o extends f {
    static final String P = "KeyTimeCycle";
    private static final String Q = "KeyTimeCycle";
    public static final int R = 3;

    /* renamed from: y, reason: collision with root package name */
    private String f1921y;

    /* renamed from: z, reason: collision with root package name */
    private int f1922z = -1;
    private float A = Float.NaN;
    private float B = Float.NaN;
    private float C = Float.NaN;
    private float D = Float.NaN;
    private float E = Float.NaN;
    private float F = Float.NaN;
    private float G = Float.NaN;
    private float H = Float.NaN;
    private float I = Float.NaN;
    private float J = Float.NaN;
    private float K = Float.NaN;
    private float L = Float.NaN;
    private int M = 0;
    private float N = Float.NaN;
    private float O = 0.0f;

    /* compiled from: KeyTimeCycle.java */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f1923a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f1924b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f1925c = 4;

        /* renamed from: d, reason: collision with root package name */
        private static final int f1926d = 5;

        /* renamed from: e, reason: collision with root package name */
        private static final int f1927e = 6;

        /* renamed from: f, reason: collision with root package name */
        private static final int f1928f = 8;

        /* renamed from: g, reason: collision with root package name */
        private static final int f1929g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f1930h = 9;

        /* renamed from: i, reason: collision with root package name */
        private static final int f1931i = 10;

        /* renamed from: j, reason: collision with root package name */
        private static final int f1932j = 12;

        /* renamed from: k, reason: collision with root package name */
        private static final int f1933k = 13;

        /* renamed from: l, reason: collision with root package name */
        private static final int f1934l = 14;

        /* renamed from: m, reason: collision with root package name */
        private static final int f1935m = 15;

        /* renamed from: n, reason: collision with root package name */
        private static final int f1936n = 16;

        /* renamed from: o, reason: collision with root package name */
        private static final int f1937o = 17;

        /* renamed from: p, reason: collision with root package name */
        private static final int f1938p = 18;

        /* renamed from: q, reason: collision with root package name */
        private static final int f1939q = 19;

        /* renamed from: r, reason: collision with root package name */
        private static final int f1940r = 20;

        /* renamed from: s, reason: collision with root package name */
        private static final int f1941s = 21;

        /* renamed from: t, reason: collision with root package name */
        private static SparseIntArray f1942t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1942t = sparseIntArray;
            sparseIntArray.append(f.m.kc, 1);
            f1942t.append(f.m.tc, 2);
            f1942t.append(f.m.pc, 4);
            f1942t.append(f.m.qc, 5);
            f1942t.append(f.m.rc, 6);
            f1942t.append(f.m.nc, 7);
            f1942t.append(f.m.zc, 8);
            f1942t.append(f.m.yc, 9);
            f1942t.append(f.m.xc, 10);
            f1942t.append(f.m.vc, 12);
            f1942t.append(f.m.uc, 13);
            f1942t.append(f.m.oc, 14);
            f1942t.append(f.m.lc, 15);
            f1942t.append(f.m.mc, 16);
            f1942t.append(f.m.sc, 17);
            f1942t.append(f.m.wc, 18);
            f1942t.append(f.m.Cc, 20);
            f1942t.append(f.m.Bc, 21);
            f1942t.append(f.m.Dc, 19);
        }

        private a() {
        }

        public static void a(o oVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArray.getIndex(i5);
                switch (f1942t.get(index)) {
                    case 1:
                        oVar.A = typedArray.getFloat(index, oVar.A);
                        break;
                    case 2:
                        oVar.B = typedArray.getDimension(index, oVar.B);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        f1942t.get(index);
                        break;
                    case 4:
                        oVar.C = typedArray.getFloat(index, oVar.C);
                        break;
                    case 5:
                        oVar.D = typedArray.getFloat(index, oVar.D);
                        break;
                    case 6:
                        oVar.E = typedArray.getFloat(index, oVar.E);
                        break;
                    case 7:
                        oVar.G = typedArray.getFloat(index, oVar.G);
                        break;
                    case 8:
                        oVar.F = typedArray.getFloat(index, oVar.F);
                        break;
                    case 9:
                        oVar.f1921y = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f1701s1) {
                            int resourceId = typedArray.getResourceId(index, oVar.f1823b);
                            oVar.f1823b = resourceId;
                            if (resourceId == -1) {
                                oVar.f1824c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            oVar.f1824c = typedArray.getString(index);
                            break;
                        } else {
                            oVar.f1823b = typedArray.getResourceId(index, oVar.f1823b);
                            break;
                        }
                    case 12:
                        oVar.f1822a = typedArray.getInt(index, oVar.f1822a);
                        break;
                    case 13:
                        oVar.f1922z = typedArray.getInteger(index, oVar.f1922z);
                        break;
                    case 14:
                        oVar.H = typedArray.getFloat(index, oVar.H);
                        break;
                    case 15:
                        oVar.I = typedArray.getDimension(index, oVar.I);
                        break;
                    case 16:
                        oVar.J = typedArray.getDimension(index, oVar.J);
                        break;
                    case 17:
                        oVar.K = typedArray.getDimension(index, oVar.K);
                        break;
                    case 18:
                        oVar.L = typedArray.getFloat(index, oVar.L);
                        break;
                    case 19:
                        oVar.M = typedArray.getInt(index, oVar.M);
                        break;
                    case 20:
                        oVar.N = typedArray.getFloat(index, oVar.N);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            oVar.O = typedArray.getDimension(index, oVar.O);
                            break;
                        } else {
                            oVar.O = typedArray.getFloat(index, oVar.O);
                            break;
                        }
                }
            }
        }
    }

    public o() {
        this.f1825d = 3;
        this.f1826e = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0086, code lost:
    
        if (r1.equals("scaleY") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.y> r11) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.o.Q(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, x> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.A)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.B)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("progress");
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
        a.a(this, context.obtainStyledAttributes(attributeSet, f.m.jc));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void e(HashMap<String, Integer> hashMap) {
        if (this.f1922z == -1) {
            return;
        }
        if (!Float.isNaN(this.A)) {
            hashMap.put("alpha", Integer.valueOf(this.f1922z));
        }
        if (!Float.isNaN(this.B)) {
            hashMap.put("elevation", Integer.valueOf(this.f1922z));
        }
        if (!Float.isNaN(this.C)) {
            hashMap.put("rotation", Integer.valueOf(this.f1922z));
        }
        if (!Float.isNaN(this.D)) {
            hashMap.put("rotationX", Integer.valueOf(this.f1922z));
        }
        if (!Float.isNaN(this.E)) {
            hashMap.put("rotationY", Integer.valueOf(this.f1922z));
        }
        if (!Float.isNaN(this.I)) {
            hashMap.put("translationX", Integer.valueOf(this.f1922z));
        }
        if (!Float.isNaN(this.J)) {
            hashMap.put("translationY", Integer.valueOf(this.f1922z));
        }
        if (!Float.isNaN(this.K)) {
            hashMap.put("translationZ", Integer.valueOf(this.f1922z));
        }
        if (!Float.isNaN(this.F)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f1922z));
        }
        if (!Float.isNaN(this.G)) {
            hashMap.put("scaleX", Integer.valueOf(this.f1922z));
        }
        if (!Float.isNaN(this.G)) {
            hashMap.put("scaleY", Integer.valueOf(this.f1922z));
        }
        if (!Float.isNaN(this.L)) {
            hashMap.put("progress", Integer.valueOf(this.f1922z));
        }
        if (this.f1826e.size() > 0) {
            Iterator<String> it = this.f1826e.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(g.a("CUSTOM,", it.next()), Integer.valueOf(this.f1922z));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "transitionEasing":
                this.f1921y = obj.toString();
                break;
            case "rotationX":
                this.D = h(obj);
                break;
            case "rotationY":
                this.E = h(obj);
                break;
            case "translationX":
                this.I = h(obj);
                break;
            case "translationY":
                this.J = h(obj);
                break;
            case "progress":
                this.L = h(obj);
                break;
            case "scaleX":
                this.G = h(obj);
                break;
            case "scaleY":
                this.H = h(obj);
                break;
            case "rotation":
                this.C = h(obj);
                break;
            case "elevation":
                this.B = h(obj);
                break;
            case "transitionPathRotate":
                this.F = h(obj);
                break;
            case "alpha":
                this.A = h(obj);
                break;
            case "curveFit":
                this.f1922z = i(obj);
                break;
            case "mTranslationZ":
                this.K = h(obj);
                break;
        }
    }
}
