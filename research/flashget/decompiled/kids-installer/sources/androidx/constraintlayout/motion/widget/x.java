package androidx.constraintlayout.motion.widget;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: SplineSet.java */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: f, reason: collision with root package name */
    private static final String f2066f = "SplineSet";

    /* renamed from: a, reason: collision with root package name */
    protected androidx.constraintlayout.motion.utils.b f2067a;

    /* renamed from: b, reason: collision with root package name */
    protected int[] f2068b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    protected float[] f2069c = new float[10];

    /* renamed from: d, reason: collision with root package name */
    private int f2070d;

    /* renamed from: e, reason: collision with root package name */
    private String f2071e;

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class a extends x {
        a() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            view.setAlpha(a(f6));
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class b extends x {

        /* renamed from: g, reason: collision with root package name */
        String f2072g;

        /* renamed from: h, reason: collision with root package name */
        SparseArray<androidx.constraintlayout.widget.a> f2073h;

        /* renamed from: i, reason: collision with root package name */
        float[] f2074i;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f2072g = str.split(",")[1];
            this.f2073h = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void f(int i5, float f6) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            this.f2067a.e(f6, this.f2074i);
            this.f2073h.valueAt(0).m(view, this.f2074i);
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void i(int i5) {
            int size = this.f2073h.size();
            int g5 = this.f2073h.valueAt(0).g();
            double[] dArr = new double[size];
            this.f2074i = new float[g5];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, g5);
            for (int i6 = 0; i6 < size; i6++) {
                int keyAt = this.f2073h.keyAt(i6);
                androidx.constraintlayout.widget.a valueAt = this.f2073h.valueAt(i6);
                dArr[i6] = keyAt * 0.01d;
                valueAt.f(this.f2074i);
                int i7 = 0;
                while (true) {
                    if (i7 < this.f2074i.length) {
                        dArr2[i6][i7] = r6[i7];
                        i7++;
                    }
                }
            }
            this.f2067a = androidx.constraintlayout.motion.utils.b.a(i5, dArr, dArr2);
        }

        public void j(int i5, androidx.constraintlayout.widget.a aVar) {
            this.f2073h.append(i5, aVar);
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class c extends x {
        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            view.setElevation(a(f6));
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class d extends x {
        d() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
        }

        public void j(View view, float f6, double d6, double d7) {
            view.setRotation(a(f6) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class e extends x {
        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            view.setPivotX(a(f6));
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class f extends x {
        f() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            view.setPivotY(a(f6));
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class g extends x {

        /* renamed from: g, reason: collision with root package name */
        boolean f2075g = false;

        g() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).l1(a(f6));
                return;
            }
            if (this.f2075g) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f2075g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f6)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class h extends x {
        h() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            view.setRotation(a(f6));
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class i extends x {
        i() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            view.setRotationX(a(f6));
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class j extends x {
        j() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            view.setRotationY(a(f6));
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class k extends x {
        k() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            view.setScaleX(a(f6));
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class l extends x {
        l() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            view.setScaleY(a(f6));
        }
    }

    /* compiled from: SplineSet.java */
    private static class m {
        private m() {
        }

        static void a(int[] iArr, float[] fArr, int i5, int i6) {
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

        private static int b(int[] iArr, float[] fArr, int i5, int i6) {
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

        private static void c(int[] iArr, float[] fArr, int i5, int i6) {
            int i7 = iArr[i5];
            iArr[i5] = iArr[i6];
            iArr[i6] = i7;
            float f6 = fArr[i5];
            fArr[i5] = fArr[i6];
            fArr[i6] = f6;
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class n extends x {
        n() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            view.setTranslationX(a(f6));
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class o extends x {
        o() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            view.setTranslationY(a(f6));
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes2.dex */
    static class p extends x {
        p() {
        }

        @Override // androidx.constraintlayout.motion.widget.x
        public void g(View view, float f6) {
            view.setTranslationZ(a(f6));
        }
    }

    static x d(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    static x e(String str) {
        str.getClass();
        switch (str) {
        }
        return new a();
    }

    public float a(float f6) {
        return (float) this.f2067a.c(f6, 0);
    }

    public androidx.constraintlayout.motion.utils.b b() {
        return this.f2067a;
    }

    public float c(float f6) {
        return (float) this.f2067a.f(f6, 0);
    }

    public void f(int i5, float f6) {
        int[] iArr = this.f2068b;
        if (iArr.length < this.f2070d + 1) {
            this.f2068b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f2069c;
            this.f2069c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f2068b;
        int i6 = this.f2070d;
        iArr2[i6] = i5;
        this.f2069c[i6] = f6;
        this.f2070d = i6 + 1;
    }

    public abstract void g(View view, float f6);

    public void h(String str) {
        this.f2071e = str;
    }

    public void i(int i5) {
        int i6;
        int i7 = this.f2070d;
        if (i7 == 0) {
            return;
        }
        m.a(this.f2068b, this.f2069c, 0, i7 - 1);
        int i8 = 1;
        for (int i9 = 1; i9 < this.f2070d; i9++) {
            int[] iArr = this.f2068b;
            if (iArr[i9 - 1] != iArr[i9]) {
                i8++;
            }
        }
        double[] dArr = new double[i8];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i8, 1);
        int i10 = 0;
        for (0; i6 < this.f2070d; i6 + 1) {
            if (i6 > 0) {
                int[] iArr2 = this.f2068b;
                i6 = iArr2[i6] == iArr2[i6 - 1] ? i6 + 1 : 0;
            }
            dArr[i10] = this.f2068b[i6] * 0.01d;
            dArr2[i10][0] = this.f2069c[i6];
            i10++;
        }
        this.f2067a = androidx.constraintlayout.motion.utils.b.a(i5, dArr, dArr2);
    }

    public String toString() {
        String str = this.f2071e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i5 = 0; i5 < this.f2070d; i5++) {
            StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(str, "[");
            a6.append(this.f2068b[i5]);
            a6.append(" , ");
            a6.append(decimalFormat.format(this.f2069c[i5]));
            a6.append("] ");
            str = a6.toString();
        }
        return str;
    }
}
