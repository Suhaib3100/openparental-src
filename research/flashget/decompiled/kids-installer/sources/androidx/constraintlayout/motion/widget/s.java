package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.k;
import androidx.constraintlayout.motion.widget.x;
import androidx.constraintlayout.motion.widget.y;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: MotionController.java */
/* loaded from: classes.dex */
public class s {
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int N = 4;
    public static final int O = 5;
    public static final int P = 6;
    private static final String Q = "MotionController";
    private static final boolean R = false;
    private static final boolean S = false;
    private p[] A;
    String[] C;

    /* renamed from: a, reason: collision with root package name */
    View f1968a;

    /* renamed from: b, reason: collision with root package name */
    int f1969b;

    /* renamed from: c, reason: collision with root package name */
    String f1970c;

    /* renamed from: i, reason: collision with root package name */
    private androidx.constraintlayout.motion.utils.b[] f1976i;

    /* renamed from: j, reason: collision with root package name */
    private androidx.constraintlayout.motion.utils.b f1977j;

    /* renamed from: n, reason: collision with root package name */
    private int[] f1981n;

    /* renamed from: o, reason: collision with root package name */
    private double[] f1982o;

    /* renamed from: p, reason: collision with root package name */
    private double[] f1983p;

    /* renamed from: q, reason: collision with root package name */
    private String[] f1984q;

    /* renamed from: r, reason: collision with root package name */
    private int[] f1985r;

    /* renamed from: x, reason: collision with root package name */
    private HashMap<String, y> f1991x;

    /* renamed from: y, reason: collision with root package name */
    private HashMap<String, x> f1992y;

    /* renamed from: z, reason: collision with root package name */
    private HashMap<String, k> f1993z;

    /* renamed from: d, reason: collision with root package name */
    private int f1971d = -1;

    /* renamed from: e, reason: collision with root package name */
    private u f1972e = new u();

    /* renamed from: f, reason: collision with root package name */
    private u f1973f = new u();

    /* renamed from: g, reason: collision with root package name */
    private q f1974g = new q();

    /* renamed from: h, reason: collision with root package name */
    private q f1975h = new q();

    /* renamed from: k, reason: collision with root package name */
    float f1978k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    float f1979l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    float f1980m = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    private int f1986s = 4;

    /* renamed from: t, reason: collision with root package name */
    private float[] f1987t = new float[4];

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<u> f1988u = new ArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    private float[] f1989v = new float[1];

    /* renamed from: w, reason: collision with root package name */
    private ArrayList<f> f1990w = new ArrayList<>();
    private int B = f.f1803f;

    s(View view) {
        H(view);
    }

    private void B(u uVar) {
        uVar.y((int) this.f1968a.getX(), (int) this.f1968a.getY(), this.f1968a.getWidth(), this.f1968a.getHeight());
    }

    private float i(float f6, float[] fArr) {
        float f7 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f8 = this.f1980m;
            if (f8 != 1.0d) {
                float f9 = this.f1979l;
                if (f6 < f9) {
                    f6 = 0.0f;
                }
                if (f6 > f9 && f6 < 1.0d) {
                    f6 = (f6 - f9) * f8;
                }
            }
        }
        androidx.constraintlayout.motion.utils.c cVar = this.f1972e.f1994o;
        Iterator<u> it = this.f1988u.iterator();
        float f10 = Float.NaN;
        while (it.hasNext()) {
            u next = it.next();
            androidx.constraintlayout.motion.utils.c cVar2 = next.f1994o;
            if (cVar2 != null) {
                float f11 = next.f1996q;
                if (f11 < f6) {
                    cVar = cVar2;
                    f7 = f11;
                } else if (Float.isNaN(f10)) {
                    f10 = next.f1996q;
                }
            }
        }
        if (cVar != null) {
            float f12 = (Float.isNaN(f10) ? 1.0f : f10) - f7;
            double d6 = (f6 - f7) / f12;
            f6 = (((float) cVar.a(d6)) * f12) + f7;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d6);
            }
        }
        return f6;
    }

    private float t() {
        float[] fArr = new float[2];
        float f6 = 1.0f / 99;
        double d6 = com.google.firebase.remoteconfig.p.f18289o;
        double d7 = 0.0d;
        int i5 = 0;
        float f7 = 0.0f;
        while (i5 < 100) {
            float f8 = i5 * f6;
            double d8 = f8;
            androidx.constraintlayout.motion.utils.c cVar = this.f1972e.f1994o;
            Iterator<u> it = this.f1988u.iterator();
            float f9 = Float.NaN;
            float f10 = 0.0f;
            while (it.hasNext()) {
                u next = it.next();
                androidx.constraintlayout.motion.utils.c cVar2 = next.f1994o;
                float f11 = f6;
                if (cVar2 != null) {
                    float f12 = next.f1996q;
                    if (f12 < f8) {
                        f10 = f12;
                        cVar = cVar2;
                    } else if (Float.isNaN(f9)) {
                        f9 = next.f1996q;
                    }
                }
                f6 = f11;
            }
            float f13 = f6;
            if (cVar != null) {
                if (Float.isNaN(f9)) {
                    f9 = 1.0f;
                }
                d8 = (((float) cVar.a((f8 - f10) / r16)) * (f9 - f10)) + f10;
            }
            this.f1976i[0].d(d8, this.f1982o);
            this.f1972e.q(this.f1981n, this.f1982o, fArr, 0);
            if (i5 > 0) {
                f7 = (float) (Math.hypot(d7 - fArr[1], d6 - fArr[0]) + f7);
            }
            d6 = fArr[0];
            d7 = fArr[1];
            i5++;
            f6 = f13;
        }
        return f7;
    }

    private void x(u uVar) {
        if (Collections.binarySearch(this.f1988u, uVar) == 0) {
            float f6 = uVar.f1997r;
        }
        this.f1988u.add((-r0) - 1, uVar);
    }

    void A(View view, n nVar, float f6, float f7, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        u uVar = this.f1972e;
        float f8 = uVar.f1998s;
        rectF.left = f8;
        float f9 = uVar.f1999t;
        rectF.top = f9;
        rectF.right = f8 + uVar.f2000u;
        rectF.bottom = f9 + uVar.f2001v;
        RectF rectF2 = new RectF();
        u uVar2 = this.f1973f;
        float f10 = uVar2.f1998s;
        rectF2.left = f10;
        float f11 = uVar2.f1999t;
        rectF2.top = f11;
        rectF2.right = f10 + uVar2.f2000u;
        rectF2.bottom = f11 + uVar2.f2001v;
        nVar.n(view, rectF, rectF2, f6, f7, strArr, fArr);
    }

    public void C(int i5) {
        this.f1972e.f1995p = i5;
    }

    void D(androidx.constraintlayout.solver.widgets.e eVar, androidx.constraintlayout.widget.d dVar) {
        u uVar = this.f1973f;
        uVar.f1996q = 1.0f;
        uVar.f1997r = 1.0f;
        B(uVar);
        this.f1973f.y(eVar.k0(), eVar.l0(), eVar.j0(), eVar.D());
        this.f1973f.g(dVar.h0(this.f1969b));
        this.f1975h.x(eVar, dVar, this.f1969b);
    }

    public void E(int i5) {
        this.B = i5;
    }

    void F(View view) {
        u uVar = this.f1972e;
        uVar.f1996q = 0.0f;
        uVar.f1997r = 0.0f;
        uVar.y(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f1974g.w(view);
    }

    void G(androidx.constraintlayout.solver.widgets.e eVar, androidx.constraintlayout.widget.d dVar) {
        u uVar = this.f1972e;
        uVar.f1996q = 0.0f;
        uVar.f1997r = 0.0f;
        B(uVar);
        this.f1972e.y(eVar.k0(), eVar.l0(), eVar.j0(), eVar.D());
        d.a h02 = dVar.h0(this.f1969b);
        this.f1972e.g(h02);
        this.f1978k = h02.f2925c.f3004f;
        this.f1974g.x(eVar, dVar, this.f1969b);
    }

    public void H(View view) {
        this.f1968a = view;
        this.f1969b = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f1970c = ((ConstraintLayout.LayoutParams) layoutParams).a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    public void I(int i5, int i6, float f6, long j5) {
        ArrayList arrayList;
        String[] strArr;
        y e6;
        androidx.constraintlayout.widget.a aVar;
        x e7;
        androidx.constraintlayout.widget.a aVar2;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i7 = this.B;
        if (i7 != f.f1803f) {
            this.f1972e.f2004y = i7;
        }
        this.f1974g.p(this.f1975h, hashSet2);
        ArrayList<f> arrayList2 = this.f1990w;
        if (arrayList2 != null) {
            Iterator<f> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                f next = it.next();
                if (next instanceof m) {
                    m mVar = (m) next;
                    x(new u(i5, i6, mVar, this.f1972e, this.f1973f));
                    int i8 = mVar.f1920y;
                    if (i8 != f.f1803f) {
                        this.f1971d = i8;
                    }
                } else if (next instanceof j) {
                    next.b(hashSet3);
                } else if (next instanceof o) {
                    next.b(hashSet);
                } else if (next instanceof p) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((p) next);
                } else {
                    next.e(hashMap);
                    next.b(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i9 = 0;
        if (arrayList != null) {
            this.A = (p[]) arrayList.toArray(new p[0]);
        }
        boolean z5 = true;
        if (!hashSet2.isEmpty()) {
            this.f1992y = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<f> it3 = this.f1990w.iterator();
                    while (it3.hasNext()) {
                        f next3 = it3.next();
                        HashMap<String, androidx.constraintlayout.widget.a> hashMap2 = next3.f1826e;
                        if (hashMap2 != null && (aVar2 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.f1822a, aVar2);
                        }
                    }
                    e7 = new x.b(next2, sparseArray);
                } else {
                    e7 = x.e(next2);
                }
                if (e7 != null) {
                    e7.h(next2);
                    this.f1992y.put(next2, e7);
                }
            }
            ArrayList<f> arrayList3 = this.f1990w;
            if (arrayList3 != null) {
                Iterator<f> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    f next4 = it4.next();
                    if (next4 instanceof h) {
                        next4.a(this.f1992y);
                    }
                }
            }
            this.f1974g.g(this.f1992y, 0);
            this.f1975h.g(this.f1992y, 100);
            for (String str2 : this.f1992y.keySet()) {
                this.f1992y.get(str2).i(hashMap.containsKey(str2) ? hashMap.get(str2).intValue() : 0);
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f1991x == null) {
                this.f1991x = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.f1991x.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<f> it6 = this.f1990w.iterator();
                        while (it6.hasNext()) {
                            f next6 = it6.next();
                            HashMap<String, androidx.constraintlayout.widget.a> hashMap3 = next6.f1826e;
                            if (hashMap3 != null && (aVar = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.f1822a, aVar);
                            }
                        }
                        e6 = y.d(next5, sparseArray2);
                    } else {
                        e6 = y.e(next5, j5);
                    }
                    if (e6 != null) {
                        e6.i(next5);
                        this.f1991x.put(next5, e6);
                    }
                }
            }
            ArrayList<f> arrayList4 = this.f1990w;
            if (arrayList4 != null) {
                Iterator<f> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    f next7 = it7.next();
                    if (next7 instanceof o) {
                        ((o) next7).Q(this.f1991x);
                    }
                }
            }
            for (String str4 : this.f1991x.keySet()) {
                this.f1991x.get(str4).j(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int i10 = 2;
        int size = this.f1988u.size() + 2;
        u[] uVarArr = new u[size];
        uVarArr[0] = this.f1972e;
        uVarArr[size - 1] = this.f1973f;
        if (this.f1988u.size() > 0 && this.f1971d == -1) {
            this.f1971d = 0;
        }
        Iterator<u> it8 = this.f1988u.iterator();
        int i11 = 1;
        while (it8.hasNext()) {
            uVarArr[i11] = it8.next();
            i11++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.f1973f.f2005z.keySet()) {
            if (this.f1972e.f2005z.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f1984q = strArr2;
        this.f1985r = new int[strArr2.length];
        int i12 = 0;
        while (true) {
            strArr = this.f1984q;
            if (i12 >= strArr.length) {
                break;
            }
            String str6 = strArr[i12];
            this.f1985r[i12] = 0;
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    break;
                }
                if (uVarArr[i13].f2005z.containsKey(str6)) {
                    int[] iArr = this.f1985r;
                    iArr[i12] = uVarArr[i13].f2005z.get(str6).g() + iArr[i12];
                    break;
                }
                i13++;
            }
            i12++;
        }
        boolean z6 = uVarArr[0].f2004y != f.f1803f;
        int length = strArr.length + 18;
        boolean[] zArr = new boolean[length];
        for (int i14 = 1; i14 < size; i14++) {
            uVarArr[i14].l(uVarArr[i14 - 1], zArr, this.f1984q, z6);
        }
        int i15 = 0;
        for (int i16 = 1; i16 < length; i16++) {
            if (zArr[i16]) {
                i15++;
            }
        }
        int[] iArr2 = new int[i15];
        this.f1981n = iArr2;
        this.f1982o = new double[iArr2.length];
        this.f1983p = new double[iArr2.length];
        int i17 = 0;
        for (int i18 = 1; i18 < length; i18++) {
            if (zArr[i18]) {
                this.f1981n[i17] = i18;
                i17++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, this.f1981n.length);
        double[] dArr2 = new double[size];
        for (int i19 = 0; i19 < size; i19++) {
            uVarArr[i19].o(dArr[i19], this.f1981n);
            dArr2[i19] = uVarArr[i19].f1996q;
        }
        int i20 = 0;
        while (true) {
            int[] iArr3 = this.f1981n;
            if (i20 >= iArr3.length) {
                break;
            }
            if (iArr3[i20] < u.P.length) {
                String a6 = androidx.concurrent.futures.a.a(new StringBuilder(), u.P[this.f1981n[i20]], " [");
                for (int i21 = 0; i21 < size; i21++) {
                    StringBuilder a7 = r.a(a6);
                    a7.append(dArr[i21][i20]);
                    a6 = a7.toString();
                }
            }
            i20++;
        }
        this.f1976i = new androidx.constraintlayout.motion.utils.b[this.f1984q.length + 1];
        int i22 = 0;
        while (true) {
            String[] strArr3 = this.f1984q;
            if (i9 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i9];
            double[] dArr3 = null;
            double[][] dArr4 = null;
            int i23 = i22;
            ?? r12 = z5;
            int i24 = i23;
            while (i22 < size) {
                if (uVarArr[i22].u(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr4 = new int[i10];
                        iArr4[r12] = uVarArr[i22].s(str7);
                        iArr4[i23] = size;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr4);
                    }
                    u uVar = uVarArr[i22];
                    dArr3[i24] = uVar.f1996q;
                    uVar.r(str7, dArr4[i24], 0);
                    i24++;
                }
                i22++;
                i10 = 2;
                i23 = 0;
                r12 = 1;
            }
            i9++;
            this.f1976i[i9] = androidx.constraintlayout.motion.utils.b.a(this.f1971d, Arrays.copyOf(dArr3, i24), (double[][]) Arrays.copyOf(dArr4, i24));
            i10 = 2;
            i22 = 0;
            z5 = true;
        }
        this.f1976i[0] = androidx.constraintlayout.motion.utils.b.a(this.f1971d, dArr2, dArr);
        if (uVarArr[0].f2004y != f.f1803f) {
            int[] iArr5 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
            for (int i25 = 0; i25 < size; i25++) {
                iArr5[i25] = uVarArr[i25].f2004y;
                dArr5[i25] = r8.f1996q;
                double[] dArr7 = dArr6[i25];
                dArr7[0] = r8.f1998s;
                dArr7[1] = r8.f1999t;
            }
            this.f1977j = androidx.constraintlayout.motion.utils.b.b(iArr5, dArr5, dArr6);
        }
        this.f1993z = new HashMap<>();
        if (this.f1990w != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f7 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                k d6 = k.d(next8);
                if (d6 != null) {
                    if (d6.j() && Float.isNaN(f7)) {
                        f7 = t();
                    }
                    d6.h(next8);
                    this.f1993z.put(next8, d6);
                }
            }
            Iterator<f> it10 = this.f1990w.iterator();
            while (it10.hasNext()) {
                f next9 = it10.next();
                if (next9 instanceof j) {
                    ((j) next9).S(this.f1993z);
                }
            }
            Iterator<k> it11 = this.f1993z.values().iterator();
            while (it11.hasNext()) {
                it11.next().i(f7);
            }
        }
    }

    void a(f fVar) {
        this.f1990w.add(fVar);
    }

    void b(ArrayList<f> arrayList) {
        this.f1990w.addAll(arrayList);
    }

    void c(float[] fArr, int i5) {
        float f6 = 1.0f / (i5 - 1);
        HashMap<String, x> hashMap = this.f1992y;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, x> hashMap2 = this.f1992y;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, k> hashMap3 = this.f1993z;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, k> hashMap4 = this.f1993z;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            float f7 = i6 * f6;
            float f8 = this.f1980m;
            float f9 = 0.0f;
            if (f8 != 1.0f) {
                float f10 = this.f1979l;
                if (f7 < f10) {
                    f7 = 0.0f;
                }
                if (f7 > f10 && f7 < 1.0d) {
                    f7 = (f7 - f10) * f8;
                }
            }
            double d6 = f7;
            androidx.constraintlayout.motion.utils.c cVar = this.f1972e.f1994o;
            Iterator<u> it = this.f1988u.iterator();
            float f11 = Float.NaN;
            while (it.hasNext()) {
                u next = it.next();
                androidx.constraintlayout.motion.utils.c cVar2 = next.f1994o;
                if (cVar2 != null) {
                    float f12 = next.f1996q;
                    if (f12 < f7) {
                        cVar = cVar2;
                        f9 = f12;
                    } else if (Float.isNaN(f11)) {
                        f11 = next.f1996q;
                    }
                }
            }
            if (cVar != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                d6 = (((float) cVar.a((f7 - f9) / r12)) * (f11 - f9)) + f9;
            }
            this.f1976i[0].d(d6, this.f1982o);
            androidx.constraintlayout.motion.utils.b bVar = this.f1977j;
            if (bVar != null) {
                double[] dArr = this.f1982o;
                if (dArr.length > 0) {
                    bVar.d(d6, dArr);
                }
            }
            this.f1972e.p(this.f1981n, this.f1982o, fArr, i6 * 2);
        }
    }

    int d(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h5 = this.f1976i[0].h();
        if (iArr != null) {
            Iterator<u> it = this.f1988u.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                iArr[i5] = it.next().A;
                i5++;
            }
        }
        int i6 = 0;
        for (double d6 : h5) {
            this.f1976i[0].d(d6, this.f1982o);
            this.f1972e.p(this.f1981n, this.f1982o, fArr, i6);
            i6 += 2;
        }
        return i6 / 2;
    }

    int e(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h5 = this.f1976i[0].h();
        if (iArr != null) {
            Iterator<u> it = this.f1988u.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                iArr[i5] = it.next().A;
                i5++;
            }
        }
        int i6 = 0;
        for (double d6 : h5) {
            this.f1976i[0].d(d6, this.f1982o);
            this.f1972e.q(this.f1981n, this.f1982o, fArr, i6);
            i6 += 2;
        }
        return i6 / 2;
    }

    void f(float[] fArr, int i5) {
        int i6 = i5;
        float f6 = 1.0f;
        float f7 = 1.0f / (i6 - 1);
        HashMap<String, x> hashMap = this.f1992y;
        x xVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, x> hashMap2 = this.f1992y;
        x xVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, k> hashMap3 = this.f1993z;
        k kVar = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, k> hashMap4 = this.f1993z;
        k kVar2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i7 = 0;
        while (i7 < i6) {
            float f8 = i7 * f7;
            float f9 = this.f1980m;
            if (f9 != f6) {
                float f10 = this.f1979l;
                if (f8 < f10) {
                    f8 = 0.0f;
                }
                if (f8 > f10 && f8 < 1.0d) {
                    f8 = (f8 - f10) * f9;
                }
            }
            double d6 = f8;
            androidx.constraintlayout.motion.utils.c cVar = this.f1972e.f1994o;
            Iterator<u> it = this.f1988u.iterator();
            float f11 = Float.NaN;
            float f12 = 0.0f;
            while (it.hasNext()) {
                u next = it.next();
                androidx.constraintlayout.motion.utils.c cVar2 = next.f1994o;
                if (cVar2 != null) {
                    float f13 = next.f1996q;
                    if (f13 < f8) {
                        f12 = f13;
                        cVar = cVar2;
                    } else if (Float.isNaN(f11)) {
                        f11 = next.f1996q;
                    }
                }
            }
            if (cVar != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                d6 = (((float) cVar.a((f8 - f12) / r17)) * (f11 - f12)) + f12;
            }
            this.f1976i[0].d(d6, this.f1982o);
            androidx.constraintlayout.motion.utils.b bVar = this.f1977j;
            if (bVar != null) {
                double[] dArr = this.f1982o;
                if (dArr.length > 0) {
                    bVar.d(d6, dArr);
                }
            }
            int i8 = i7 * 2;
            this.f1972e.q(this.f1981n, this.f1982o, fArr, i8);
            if (kVar != null) {
                fArr[i8] = kVar.a(f8) + fArr[i8];
            } else if (xVar != null) {
                fArr[i8] = xVar.a(f8) + fArr[i8];
            }
            if (kVar2 != null) {
                int i9 = i8 + 1;
                fArr[i9] = kVar2.a(f8) + fArr[i9];
            } else if (xVar2 != null) {
                int i10 = i8 + 1;
                fArr[i10] = xVar2.a(f8) + fArr[i10];
            }
            i7++;
            i6 = i5;
            f6 = 1.0f;
        }
    }

    void g(float f6, float[] fArr, int i5) {
        this.f1976i[0].d(i(f6, null), this.f1982o);
        this.f1972e.t(this.f1981n, this.f1982o, fArr, i5);
    }

    void h(float[] fArr, int i5) {
        float f6 = 1.0f / (i5 - 1);
        for (int i6 = 0; i6 < i5; i6++) {
            this.f1976i[0].d(i(i6 * f6, null), this.f1982o);
            this.f1972e.t(this.f1981n, this.f1982o, fArr, i6 * 8);
        }
    }

    int j(String str, float[] fArr, int i5) {
        x xVar = this.f1992y.get(str);
        if (xVar == null) {
            return -1;
        }
        for (int i6 = 0; i6 < fArr.length; i6++) {
            fArr[i6] = xVar.a(i6 / (fArr.length - 1));
        }
        return fArr.length;
    }

    void k(float f6, float f7, float f8, float[] fArr) {
        double[] dArr;
        float i5 = i(f6, this.f1989v);
        androidx.constraintlayout.motion.utils.b[] bVarArr = this.f1976i;
        int i6 = 0;
        if (bVarArr == null) {
            u uVar = this.f1973f;
            float f9 = uVar.f1998s;
            u uVar2 = this.f1972e;
            float f10 = f9 - uVar2.f1998s;
            float f11 = uVar.f1999t - uVar2.f1999t;
            float f12 = uVar.f2000u - uVar2.f2000u;
            float f13 = (uVar.f2001v - uVar2.f2001v) + f11;
            fArr[0] = ((f12 + f10) * f7) + ((1.0f - f7) * f10);
            fArr[1] = (f13 * f8) + ((1.0f - f8) * f11);
            return;
        }
        double d6 = i5;
        bVarArr[0].g(d6, this.f1983p);
        this.f1976i[0].d(d6, this.f1982o);
        float f14 = this.f1989v[0];
        while (true) {
            dArr = this.f1983p;
            if (i6 >= dArr.length) {
                break;
            }
            dArr[i6] = dArr[i6] * f14;
            i6++;
        }
        androidx.constraintlayout.motion.utils.b bVar = this.f1977j;
        if (bVar == null) {
            this.f1972e.z(f7, f8, fArr, this.f1981n, dArr, this.f1982o);
            return;
        }
        double[] dArr2 = this.f1982o;
        if (dArr2.length > 0) {
            bVar.d(d6, dArr2);
            this.f1977j.g(d6, this.f1983p);
            this.f1972e.z(f7, f8, fArr, this.f1981n, this.f1983p, this.f1982o);
        }
    }

    public int l() {
        int i5 = this.f1972e.f1995p;
        Iterator<u> it = this.f1988u.iterator();
        while (it.hasNext()) {
            i5 = Math.max(i5, it.next().f1995p);
        }
        return Math.max(i5, this.f1973f.f1995p);
    }

    float m() {
        return this.f1973f.f1998s;
    }

    float n() {
        return this.f1973f.f1999t;
    }

    u o(int i5) {
        return this.f1988u.get(i5);
    }

    public int p(int i5, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<f> it = this.f1990w.iterator();
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            f next = it.next();
            int i8 = next.f1825d;
            if (i8 == i5 || i5 != -1) {
                iArr[i7] = 0;
                int i9 = i7 + 1;
                iArr[i9] = i8;
                int i10 = i9 + 1;
                iArr[i10] = next.f1822a;
                this.f1976i[0].d(r8 / 100.0f, this.f1982o);
                this.f1972e.q(this.f1981n, this.f1982o, fArr, 0);
                int i11 = i10 + 1;
                iArr[i11] = Float.floatToIntBits(fArr[0]);
                int i12 = i11 + 1;
                iArr[i12] = Float.floatToIntBits(fArr[1]);
                if (next instanceof m) {
                    m mVar = (m) next;
                    int i13 = i12 + 1;
                    iArr[i13] = mVar.J;
                    int i14 = i13 + 1;
                    iArr[i14] = Float.floatToIntBits(mVar.F);
                    i12 = i14 + 1;
                    iArr[i12] = Float.floatToIntBits(mVar.G);
                }
                int i15 = i12 + 1;
                iArr[i7] = i15 - i7;
                i6++;
                i7 = i15;
            }
        }
        return i6;
    }

    float q(int i5, float f6, float f7) {
        u uVar = this.f1973f;
        float f8 = uVar.f1998s;
        u uVar2 = this.f1972e;
        float f9 = uVar2.f1998s;
        float f10 = f8 - f9;
        float f11 = uVar.f1999t;
        float f12 = uVar2.f1999t;
        float f13 = f11 - f12;
        float f14 = (uVar2.f2000u / 2.0f) + f9;
        float f15 = (uVar2.f2001v / 2.0f) + f12;
        float hypot = (float) Math.hypot(f10, f13);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f16 = f6 - f14;
        float f17 = f7 - f15;
        if (((float) Math.hypot(f16, f17)) == 0.0f) {
            return 0.0f;
        }
        float f18 = (f17 * f13) + (f16 * f10);
        if (i5 == 0) {
            return f18 / hypot;
        }
        if (i5 == 1) {
            return (float) Math.sqrt((hypot * hypot) - (f18 * f18));
        }
        if (i5 == 2) {
            return f16 / f10;
        }
        if (i5 == 3) {
            return f17 / f10;
        }
        if (i5 == 4) {
            return f16 / f13;
        }
        if (i5 != 5) {
            return 0.0f;
        }
        return f17 / f13;
    }

    n r(int i5, int i6, float f6, float f7) {
        RectF rectF = new RectF();
        u uVar = this.f1972e;
        float f8 = uVar.f1998s;
        rectF.left = f8;
        float f9 = uVar.f1999t;
        rectF.top = f9;
        rectF.right = f8 + uVar.f2000u;
        rectF.bottom = f9 + uVar.f2001v;
        RectF rectF2 = new RectF();
        u uVar2 = this.f1973f;
        float f10 = uVar2.f1998s;
        rectF2.left = f10;
        float f11 = uVar2.f1999t;
        rectF2.top = f11;
        rectF2.right = f10 + uVar2.f2000u;
        rectF2.bottom = f11 + uVar2.f2001v;
        Iterator<f> it = this.f1990w.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next instanceof n) {
                n nVar = (n) next;
                if (nVar.m(i5, i6, rectF, rectF2, f6, f7)) {
                    return nVar;
                }
            }
        }
        return null;
    }

    void s(float f6, int i5, int i6, float f7, float f8, float[] fArr) {
        float i7 = i(f6, this.f1989v);
        HashMap<String, x> hashMap = this.f1992y;
        x xVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, x> hashMap2 = this.f1992y;
        x xVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, x> hashMap3 = this.f1992y;
        x xVar3 = hashMap3 == null ? null : hashMap3.get("rotation");
        HashMap<String, x> hashMap4 = this.f1992y;
        x xVar4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, x> hashMap5 = this.f1992y;
        x xVar5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, k> hashMap6 = this.f1993z;
        k kVar = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, k> hashMap7 = this.f1993z;
        k kVar2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, k> hashMap8 = this.f1993z;
        k kVar3 = hashMap8 == null ? null : hashMap8.get("rotation");
        HashMap<String, k> hashMap9 = this.f1993z;
        k kVar4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, k> hashMap10 = this.f1993z;
        k kVar5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        androidx.constraintlayout.motion.utils.i iVar = new androidx.constraintlayout.motion.utils.i();
        iVar.b();
        iVar.d(xVar3, i7);
        iVar.h(xVar, xVar2, i7);
        iVar.f(xVar4, xVar5, i7);
        iVar.c(kVar3, i7);
        iVar.g(kVar, kVar2, i7);
        iVar.e(kVar4, kVar5, i7);
        androidx.constraintlayout.motion.utils.b bVar = this.f1977j;
        if (bVar != null) {
            double[] dArr = this.f1982o;
            if (dArr.length > 0) {
                double d6 = i7;
                bVar.d(d6, dArr);
                this.f1977j.g(d6, this.f1983p);
                this.f1972e.z(f7, f8, fArr, this.f1981n, this.f1983p, this.f1982o);
            }
            iVar.a(f7, f8, i5, i6, fArr);
            return;
        }
        int i8 = 0;
        if (this.f1976i == null) {
            u uVar = this.f1973f;
            float f9 = uVar.f1998s;
            u uVar2 = this.f1972e;
            float f10 = f9 - uVar2.f1998s;
            k kVar6 = kVar5;
            float f11 = uVar.f1999t - uVar2.f1999t;
            k kVar7 = kVar4;
            float f12 = uVar.f2000u - uVar2.f2000u;
            float f13 = (uVar.f2001v - uVar2.f2001v) + f11;
            fArr[0] = ((f12 + f10) * f7) + ((1.0f - f7) * f10);
            fArr[1] = (f13 * f8) + ((1.0f - f8) * f11);
            iVar.b();
            iVar.d(xVar3, i7);
            iVar.h(xVar, xVar2, i7);
            iVar.f(xVar4, xVar5, i7);
            iVar.c(kVar3, i7);
            iVar.g(kVar, kVar2, i7);
            iVar.e(kVar7, kVar6, i7);
            iVar.a(f7, f8, i5, i6, fArr);
            return;
        }
        double i9 = i(i7, this.f1989v);
        this.f1976i[0].g(i9, this.f1983p);
        this.f1976i[0].d(i9, this.f1982o);
        float f14 = this.f1989v[0];
        while (true) {
            double[] dArr2 = this.f1983p;
            if (i8 >= dArr2.length) {
                this.f1972e.z(f7, f8, fArr, this.f1981n, dArr2, this.f1982o);
                iVar.a(f7, f8, i5, i6, fArr);
                return;
            } else {
                dArr2[i8] = dArr2[i8] * f14;
                i8++;
            }
        }
    }

    public String toString() {
        return " start: x: " + this.f1972e.f1998s + " y: " + this.f1972e.f1999t + " end: x: " + this.f1973f.f1998s + " y: " + this.f1973f.f1999t;
    }

    float u() {
        return this.f1972e.f1998s;
    }

    float v() {
        return this.f1972e.f1999t;
    }

    public int w(int[] iArr, float[] fArr) {
        Iterator<f> it = this.f1990w.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            f next = it.next();
            iArr[i5] = (next.f1825d * 1000) + next.f1822a;
            this.f1976i[0].d(r6 / 100.0f, this.f1982o);
            this.f1972e.q(this.f1981n, this.f1982o, fArr, i6);
            i6 += 2;
            i5++;
        }
        return i5;
    }

    boolean y(View view, float f6, long j5, i iVar) {
        y.d dVar;
        boolean z5;
        double d6;
        float i5 = i(f6, null);
        HashMap<String, x> hashMap = this.f1992y;
        if (hashMap != null) {
            Iterator<x> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().g(view, i5);
            }
        }
        HashMap<String, y> hashMap2 = this.f1991x;
        if (hashMap2 != null) {
            dVar = null;
            boolean z6 = false;
            for (y yVar : hashMap2.values()) {
                if (yVar instanceof y.d) {
                    dVar = (y.d) yVar;
                } else {
                    z6 |= yVar.g(view, i5, j5, iVar);
                }
            }
            z5 = z6;
        } else {
            dVar = null;
            z5 = false;
        }
        androidx.constraintlayout.motion.utils.b[] bVarArr = this.f1976i;
        if (bVarArr != null) {
            double d7 = i5;
            bVarArr[0].d(d7, this.f1982o);
            this.f1976i[0].g(d7, this.f1983p);
            androidx.constraintlayout.motion.utils.b bVar = this.f1977j;
            if (bVar != null) {
                double[] dArr = this.f1982o;
                if (dArr.length > 0) {
                    bVar.d(d7, dArr);
                    this.f1977j.g(d7, this.f1983p);
                }
            }
            this.f1972e.A(view, this.f1981n, this.f1982o, this.f1983p, null);
            HashMap<String, x> hashMap3 = this.f1992y;
            if (hashMap3 != null) {
                for (x xVar : hashMap3.values()) {
                    if (xVar instanceof x.d) {
                        double[] dArr2 = this.f1983p;
                        ((x.d) xVar).j(view, i5, dArr2[0], dArr2[1]);
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.f1983p;
                d6 = d7;
                z5 = dVar.k(view, iVar, i5, j5, dArr3[0], dArr3[1]) | z5;
            } else {
                d6 = d7;
            }
            int i6 = 1;
            while (true) {
                androidx.constraintlayout.motion.utils.b[] bVarArr2 = this.f1976i;
                if (i6 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i6].e(d6, this.f1987t);
                this.f1972e.f2005z.get(this.f1984q[i6 - 1]).m(view, this.f1987t);
                i6++;
            }
            q qVar = this.f1974g;
            if (qVar.f1957p == 0) {
                if (i5 <= 0.0f) {
                    view.setVisibility(qVar.f1958q);
                } else if (i5 >= 1.0f) {
                    view.setVisibility(this.f1975h.f1958q);
                } else if (this.f1975h.f1958q != qVar.f1958q) {
                    view.setVisibility(0);
                }
            }
            if (this.A != null) {
                int i7 = 0;
                while (true) {
                    p[] pVarArr = this.A;
                    if (i7 >= pVarArr.length) {
                        break;
                    }
                    pVarArr[i7].v(i5, view);
                    i7++;
                }
            }
        } else {
            u uVar = this.f1972e;
            float f7 = uVar.f1998s;
            u uVar2 = this.f1973f;
            float a6 = androidx.appcompat.graphics.drawable.d.a(uVar2.f1998s, f7, i5, f7);
            float f8 = uVar.f1999t;
            float a7 = androidx.appcompat.graphics.drawable.d.a(uVar2.f1999t, f8, i5, f8);
            float f9 = uVar.f2000u;
            float f10 = uVar2.f2000u;
            float a8 = androidx.appcompat.graphics.drawable.d.a(f10, f9, i5, f9);
            float f11 = uVar.f2001v;
            float f12 = uVar2.f2001v;
            float f13 = a6 + 0.5f;
            int i8 = (int) f13;
            float f14 = a7 + 0.5f;
            int i9 = (int) f14;
            int i10 = (int) (f13 + a8);
            int a9 = (int) (f14 + androidx.appcompat.graphics.drawable.d.a(f12, f11, i5, f11));
            int i11 = i10 - i8;
            int i12 = a9 - i9;
            if (f10 != f9 || f12 != f11) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), View.MeasureSpec.makeMeasureSpec(i12, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
            }
            view.layout(i8, i9, i10, a9);
        }
        HashMap<String, k> hashMap4 = this.f1993z;
        if (hashMap4 != null) {
            for (k kVar : hashMap4.values()) {
                if (kVar instanceof k.h) {
                    double[] dArr4 = this.f1983p;
                    ((k.h) kVar).k(view, i5, dArr4[0], dArr4[1]);
                } else {
                    kVar.g(view, i5);
                }
            }
        }
        return z5;
    }

    String z() {
        return this.f1968a.getContext().getResources().getResourceEntryName(this.f1968a.getId());
    }
}
