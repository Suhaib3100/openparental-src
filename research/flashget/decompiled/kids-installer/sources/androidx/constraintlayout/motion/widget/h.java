package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: KeyAttributes.java */
/* loaded from: classes2.dex */
public class h extends f {
    static final String P = "KeyAttribute";
    private static final String Q = "KeyAttribute";
    public static final int R = 1;

    /* renamed from: y, reason: collision with root package name */
    private String f1827y;

    /* renamed from: z, reason: collision with root package name */
    private int f1828z = -1;
    private boolean A = false;
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
    private float M = Float.NaN;
    private float N = Float.NaN;
    private float O = Float.NaN;

    /* compiled from: KeyAttributes.java */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f1829a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f1830b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f1831c = 4;

        /* renamed from: d, reason: collision with root package name */
        private static final int f1832d = 5;

        /* renamed from: e, reason: collision with root package name */
        private static final int f1833e = 6;

        /* renamed from: f, reason: collision with root package name */
        private static final int f1834f = 8;

        /* renamed from: g, reason: collision with root package name */
        private static final int f1835g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f1836h = 9;

        /* renamed from: i, reason: collision with root package name */
        private static final int f1837i = 10;

        /* renamed from: j, reason: collision with root package name */
        private static final int f1838j = 12;

        /* renamed from: k, reason: collision with root package name */
        private static final int f1839k = 13;

        /* renamed from: l, reason: collision with root package name */
        private static final int f1840l = 14;

        /* renamed from: m, reason: collision with root package name */
        private static final int f1841m = 15;

        /* renamed from: n, reason: collision with root package name */
        private static final int f1842n = 16;

        /* renamed from: o, reason: collision with root package name */
        private static final int f1843o = 17;

        /* renamed from: p, reason: collision with root package name */
        private static final int f1844p = 18;

        /* renamed from: q, reason: collision with root package name */
        private static final int f1845q = 19;

        /* renamed from: r, reason: collision with root package name */
        private static final int f1846r = 20;

        /* renamed from: s, reason: collision with root package name */
        private static SparseIntArray f1847s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1847s = sparseIntArray;
            sparseIntArray.append(f.m.jb, 1);
            f1847s.append(f.m.ub, 2);
            f1847s.append(f.m.qb, 4);
            f1847s.append(f.m.rb, 5);
            f1847s.append(f.m.sb, 6);
            f1847s.append(f.m.kb, 19);
            f1847s.append(f.m.lb, 20);
            f1847s.append(f.m.ob, 7);
            f1847s.append(f.m.Ab, 8);
            f1847s.append(f.m.zb, 9);
            f1847s.append(f.m.yb, 10);
            f1847s.append(f.m.wb, 12);
            f1847s.append(f.m.vb, 13);
            f1847s.append(f.m.pb, 14);
            f1847s.append(f.m.mb, 15);
            f1847s.append(f.m.nb, 16);
            f1847s.append(f.m.tb, 17);
            f1847s.append(f.m.xb, 18);
        }

        private a() {
        }

        public static void a(h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArray.getIndex(i5);
                switch (f1847s.get(index)) {
                    case 1:
                        hVar.B = typedArray.getFloat(index, hVar.B);
                        break;
                    case 2:
                        hVar.C = typedArray.getDimension(index, hVar.C);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        f1847s.get(index);
                        break;
                    case 4:
                        hVar.D = typedArray.getFloat(index, hVar.D);
                        break;
                    case 5:
                        hVar.E = typedArray.getFloat(index, hVar.E);
                        break;
                    case 6:
                        hVar.F = typedArray.getFloat(index, hVar.F);
                        break;
                    case 7:
                        hVar.J = typedArray.getFloat(index, hVar.J);
                        break;
                    case 8:
                        hVar.I = typedArray.getFloat(index, hVar.I);
                        break;
                    case 9:
                        hVar.f1827y = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f1701s1) {
                            int resourceId = typedArray.getResourceId(index, hVar.f1823b);
                            hVar.f1823b = resourceId;
                            if (resourceId == -1) {
                                hVar.f1824c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            hVar.f1824c = typedArray.getString(index);
                            break;
                        } else {
                            hVar.f1823b = typedArray.getResourceId(index, hVar.f1823b);
                            break;
                        }
                    case 12:
                        hVar.f1822a = typedArray.getInt(index, hVar.f1822a);
                        break;
                    case 13:
                        hVar.f1828z = typedArray.getInteger(index, hVar.f1828z);
                        break;
                    case 14:
                        hVar.K = typedArray.getFloat(index, hVar.K);
                        break;
                    case 15:
                        hVar.L = typedArray.getDimension(index, hVar.L);
                        break;
                    case 16:
                        hVar.M = typedArray.getDimension(index, hVar.M);
                        break;
                    case 17:
                        hVar.N = typedArray.getDimension(index, hVar.N);
                        break;
                    case 18:
                        hVar.O = typedArray.getFloat(index, hVar.O);
                        break;
                    case 19:
                        hVar.G = typedArray.getDimension(index, hVar.G);
                        break;
                    case 20:
                        hVar.H = typedArray.getDimension(index, hVar.H);
                        break;
                }
            }
        }
    }

    public h() {
        this.f1825d = 1;
        this.f1826e = new HashMap<>();
    }

    int O() {
        return this.f1828z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0097, code lost:
    
        if (r1.equals("scaleY") == false) goto L12;
     */
    @Override // androidx.constraintlayout.motion.widget.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.x> r7) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.h.a(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.B)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.O)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, f.m.ib));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void e(HashMap<String, Integer> hashMap) {
        if (this.f1828z == -1) {
            return;
        }
        if (!Float.isNaN(this.B)) {
            hashMap.put("alpha", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.C)) {
            hashMap.put("elevation", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.D)) {
            hashMap.put("rotation", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.E)) {
            hashMap.put("rotationX", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.F)) {
            hashMap.put("rotationY", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.G)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.H)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.L)) {
            hashMap.put("translationX", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.M)) {
            hashMap.put("translationY", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.N)) {
            hashMap.put("translationZ", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.I)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.J)) {
            hashMap.put("scaleX", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.K)) {
            hashMap.put("scaleY", Integer.valueOf(this.f1828z));
        }
        if (!Float.isNaN(this.O)) {
            hashMap.put("progress", Integer.valueOf(this.f1828z));
        }
        if (this.f1826e.size() > 0) {
            Iterator<String> it = this.f1826e.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(g.a("CUSTOM,", it.next()), Integer.valueOf(this.f1828z));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "motionProgress":
                this.O = h(obj);
                break;
            case "transitionEasing":
                this.f1827y = obj.toString();
                break;
            case "rotationX":
                this.E = h(obj);
                break;
            case "rotationY":
                this.F = h(obj);
                break;
            case "translationX":
                this.L = h(obj);
                break;
            case "translationY":
                this.M = h(obj);
                break;
            case "pivotX":
                this.G = h(obj);
                break;
            case "pivotY":
                this.H = h(obj);
                break;
            case "scaleX":
                this.J = h(obj);
                break;
            case "scaleY":
                this.K = h(obj);
                break;
            case "rotation":
                this.D = h(obj);
                break;
            case "elevation":
                this.C = h(obj);
                break;
            case "transitionPathRotate":
                this.I = h(obj);
                break;
            case "alpha":
                this.B = h(obj);
                break;
            case "curveFit":
                this.f1828z = i(obj);
                break;
            case "mTranslationZ":
                this.N = h(obj);
                break;
            case "visibility":
                this.A = g(obj);
                break;
        }
    }
}
