package androidx.constraintlayout.motion.widget;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet.java */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: k, reason: collision with root package name */
    private static final String f2076k = "SplineSet";

    /* renamed from: l, reason: collision with root package name */
    private static final int f2077l = 0;

    /* renamed from: m, reason: collision with root package name */
    private static final int f2078m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f2079n = 2;

    /* renamed from: o, reason: collision with root package name */
    private static float f2080o = 6.2831855f;

    /* renamed from: a, reason: collision with root package name */
    protected androidx.constraintlayout.motion.utils.b f2081a;

    /* renamed from: e, reason: collision with root package name */
    private int f2085e;

    /* renamed from: f, reason: collision with root package name */
    private String f2086f;

    /* renamed from: i, reason: collision with root package name */
    long f2089i;

    /* renamed from: b, reason: collision with root package name */
    protected int f2082b = 0;

    /* renamed from: c, reason: collision with root package name */
    protected int[] f2083c = new int[10];

    /* renamed from: d, reason: collision with root package name */
    protected float[][] f2084d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g, reason: collision with root package name */
    private float[] f2087g = new float[3];

    /* renamed from: h, reason: collision with root package name */
    protected boolean f2088h = false;

    /* renamed from: j, reason: collision with root package name */
    float f2090j = Float.NaN;

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class a extends y {
        a() {
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            view.setAlpha(b(f6, j5, view, iVar));
            return this.f2088h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class b extends y {

        /* renamed from: p, reason: collision with root package name */
        String f2091p;

        /* renamed from: q, reason: collision with root package name */
        SparseArray<androidx.constraintlayout.widget.a> f2092q;

        /* renamed from: r, reason: collision with root package name */
        SparseArray<float[]> f2093r = new SparseArray<>();

        /* renamed from: s, reason: collision with root package name */
        float[] f2094s;

        /* renamed from: t, reason: collision with root package name */
        float[] f2095t;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f2091p = str.split(",")[1];
            this.f2092q = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public void f(int i5, float f6, float f7, int i6, float f8) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            this.f2081a.e(f6, this.f2094s);
            float[] fArr = this.f2094s;
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            long j6 = j5 - this.f2089i;
            if (Float.isNaN(this.f2090j)) {
                float a6 = iVar.a(view, this.f2091p, 0);
                this.f2090j = a6;
                if (Float.isNaN(a6)) {
                    this.f2090j = 0.0f;
                }
            }
            float f9 = (float) ((((j6 * 1.0E-9d) * f7) + this.f2090j) % 1.0d);
            this.f2090j = f9;
            this.f2089i = j5;
            float a7 = a(f9);
            this.f2088h = false;
            int i5 = 0;
            while (true) {
                float[] fArr2 = this.f2095t;
                if (i5 >= fArr2.length) {
                    break;
                }
                boolean z5 = this.f2088h;
                float f10 = this.f2094s[i5];
                this.f2088h = z5 | (((double) f10) != com.google.firebase.remoteconfig.p.f18289o);
                fArr2[i5] = (f10 * a7) + f8;
                i5++;
            }
            this.f2092q.valueAt(0).m(view, this.f2095t);
            if (f7 != 0.0f) {
                this.f2088h = true;
            }
            return this.f2088h;
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public void j(int i5) {
            int size = this.f2092q.size();
            int g5 = this.f2092q.valueAt(0).g();
            double[] dArr = new double[size];
            int i6 = g5 + 2;
            this.f2094s = new float[i6];
            this.f2095t = new float[g5];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i6);
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f2092q.keyAt(i7);
                androidx.constraintlayout.widget.a valueAt = this.f2092q.valueAt(i7);
                float[] valueAt2 = this.f2093r.valueAt(i7);
                dArr[i7] = keyAt * 0.01d;
                valueAt.f(this.f2094s);
                int i8 = 0;
                while (true) {
                    if (i8 < this.f2094s.length) {
                        dArr2[i7][i8] = r8[i8];
                        i8++;
                    }
                }
                double[] dArr3 = dArr2[i7];
                dArr3[g5] = valueAt2[0];
                dArr3[g5 + 1] = valueAt2[1];
            }
            this.f2081a = androidx.constraintlayout.motion.utils.b.a(i5, dArr, dArr2);
        }

        public void k(int i5, androidx.constraintlayout.widget.a aVar, float f6, int i6, float f7) {
            this.f2092q.append(i5, aVar);
            this.f2093r.append(i5, new float[]{f6, f7});
            this.f2082b = Math.max(this.f2082b, i6);
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class c extends y {
        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            view.setElevation(b(f6, j5, view, iVar));
            return this.f2088h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class d extends y {
        d() {
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            return this.f2088h;
        }

        public boolean k(View view, androidx.constraintlayout.motion.widget.i iVar, float f6, long j5, double d6, double d7) {
            view.setRotation(b(f6, j5, view, iVar) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
            return this.f2088h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class e extends y {

        /* renamed from: p, reason: collision with root package name */
        boolean f2096p = false;

        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).l1(b(f6, j5, view, iVar));
            } else {
                if (this.f2096p) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f2096p = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(b(f6, j5, view, iVar)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f2088h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class f extends y {
        f() {
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            view.setRotation(b(f6, j5, view, iVar));
            return this.f2088h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class g extends y {
        g() {
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            view.setRotationX(b(f6, j5, view, iVar));
            return this.f2088h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class h extends y {
        h() {
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            view.setRotationY(b(f6, j5, view, iVar));
            return this.f2088h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class i extends y {
        i() {
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            view.setScaleX(b(f6, j5, view, iVar));
            return this.f2088h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class j extends y {
        j() {
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            view.setScaleY(b(f6, j5, view, iVar));
            return this.f2088h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    private static class k {
        private k() {
        }

        static void a(int[] iArr, float[][] fArr, int i5, int i6) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i6;
            iArr2[1] = i5;
            int i7 = 2;
            while (i7 > 0) {
                int i8 = i7 - 1;
                int i9 = iArr2[i8];
                i7 = i8 - 1;
                int i10 = iArr2[i7];
                if (i9 < i10) {
                    int b6 = b(iArr, fArr, i9, i10);
                    int i11 = i7 + 1;
                    iArr2[i7] = b6 - 1;
                    int i12 = i11 + 1;
                    iArr2[i11] = i9;
                    int i13 = i12 + 1;
                    iArr2[i12] = i10;
                    i7 = i13 + 1;
                    iArr2[i13] = b6 + 1;
                }
            }
        }

        private static int b(int[] iArr, float[][] fArr, int i5, int i6) {
            int i7 = iArr[i6];
            int i8 = i5;
            while (i5 < i6) {
                if (iArr[i5] <= i7) {
                    c(iArr, fArr, i8, i5);
                    i8++;
                }
                i5++;
            }
            c(iArr, fArr, i8, i6);
            return i8;
        }

        private static void c(int[] iArr, float[][] fArr, int i5, int i6) {
            int i7 = iArr[i5];
            iArr[i5] = iArr[i6];
            iArr[i6] = i7;
            float[] fArr2 = fArr[i5];
            fArr[i5] = fArr[i6];
            fArr[i6] = fArr2;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class l extends y {
        l() {
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            view.setTranslationX(b(f6, j5, view, iVar));
            return this.f2088h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class m extends y {
        m() {
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            view.setTranslationY(b(f6, j5, view, iVar));
            return this.f2088h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes2.dex */
    static class n extends y {
        n() {
        }

        @Override // androidx.constraintlayout.motion.widget.y
        public boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar) {
            view.setTranslationZ(b(f6, j5, view, iVar));
            return this.f2088h;
        }
    }

    static y d(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    static y e(String str, long j5) {
        y gVar;
        str.getClass();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new l();
                break;
            case "translationY":
                gVar = new m();
                break;
            case "translationZ":
                gVar = new n();
                break;
            case "progress":
                gVar = new e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.h(j5);
        return gVar;
    }

    protected float a(float f6) {
        float abs;
        switch (this.f2082b) {
            case 1:
                return Math.signum(f6 * f2080o);
            case 2:
                abs = Math.abs(f6);
                break;
            case 3:
                return (((f6 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f6 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f6 * f2080o);
            case 6:
                float abs2 = 1.0f - Math.abs(((f6 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f6 * f2080o);
        }
        return 1.0f - abs;
    }

    public float b(float f6, long j5, View view, androidx.constraintlayout.motion.widget.i iVar) {
        this.f2081a.e(f6, this.f2087g);
        float[] fArr = this.f2087g;
        float f7 = fArr[1];
        if (f7 == 0.0f) {
            this.f2088h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f2090j)) {
            float a6 = iVar.a(view, this.f2086f, 0);
            this.f2090j = a6;
            if (Float.isNaN(a6)) {
                this.f2090j = 0.0f;
            }
        }
        float f8 = (float) (((((j5 - this.f2089i) * 1.0E-9d) * f7) + this.f2090j) % 1.0d);
        this.f2090j = f8;
        iVar.b(view, this.f2086f, 0, f8);
        this.f2089i = j5;
        float f9 = this.f2087g[0];
        float a7 = (a(this.f2090j) * f9) + this.f2087g[2];
        this.f2088h = (f9 == 0.0f && f7 == 0.0f) ? false : true;
        return a7;
    }

    public androidx.constraintlayout.motion.utils.b c() {
        return this.f2081a;
    }

    public void f(int i5, float f6, float f7, int i6, float f8) {
        int[] iArr = this.f2083c;
        int i7 = this.f2085e;
        iArr[i7] = i5;
        float[] fArr = this.f2084d[i7];
        fArr[0] = f6;
        fArr[1] = f7;
        fArr[2] = f8;
        this.f2082b = Math.max(this.f2082b, i6);
        this.f2085e++;
    }

    public abstract boolean g(View view, float f6, long j5, androidx.constraintlayout.motion.widget.i iVar);

    protected void h(long j5) {
        this.f2089i = j5;
    }

    public void i(String str) {
        this.f2086f = str;
    }

    public void j(int i5) {
        int i6;
        int i7 = this.f2085e;
        if (i7 == 0) {
            return;
        }
        k.a(this.f2083c, this.f2084d, 0, i7 - 1);
        int i8 = 1;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f2083c;
            if (i8 >= iArr.length) {
                break;
            }
            if (iArr[i8] != iArr[i8 - 1]) {
                i9++;
            }
            i8++;
        }
        if (i9 == 0) {
            i9 = 1;
        }
        double[] dArr = new double[i9];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i9, 3);
        int i10 = 0;
        for (0; i6 < this.f2085e; i6 + 1) {
            if (i6 > 0) {
                int[] iArr2 = this.f2083c;
                i6 = iArr2[i6] == iArr2[i6 - 1] ? i6 + 1 : 0;
            }
            dArr[i10] = this.f2083c[i6] * 0.01d;
            double[] dArr3 = dArr2[i10];
            float[] fArr = this.f2084d[i6];
            dArr3[0] = fArr[0];
            dArr3[1] = fArr[1];
            dArr3[2] = fArr[2];
            i10++;
        }
        this.f2081a = androidx.constraintlayout.motion.utils.b.a(i5, dArr, dArr2);
    }

    public String toString() {
        String str = this.f2086f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i5 = 0; i5 < this.f2085e; i5++) {
            StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(str, "[");
            a6.append(this.f2083c[i5]);
            a6.append(" , ");
            a6.append(decimalFormat.format(this.f2084d[i5]));
            a6.append("] ");
            str = a6.toString();
        }
        return str;
    }
}
