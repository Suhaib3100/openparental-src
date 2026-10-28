package androidx.constraintlayout.motion.utils;

import com.google.firebase.remoteconfig.p;

/* compiled from: CurveFit.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1613a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f1614b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1615c = 2;

    /* compiled from: CurveFit.java */
    /* loaded from: classes2.dex */
    static class a extends b {

        /* renamed from: d, reason: collision with root package name */
        double f1616d;

        /* renamed from: e, reason: collision with root package name */
        double[] f1617e;

        a(double d6, double[] dArr) {
            this.f1616d = d6;
            this.f1617e = dArr;
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public double c(double d6, int i5) {
            return this.f1617e[i5];
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void d(double d6, double[] dArr) {
            double[] dArr2 = this.f1617e;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void e(double d6, float[] fArr) {
            int i5 = 0;
            while (true) {
                double[] dArr = this.f1617e;
                if (i5 >= dArr.length) {
                    return;
                }
                fArr[i5] = (float) dArr[i5];
                i5++;
            }
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public double f(double d6, int i5) {
            return p.f18289o;
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void g(double d6, double[] dArr) {
            for (int i5 = 0; i5 < this.f1617e.length; i5++) {
                dArr[i5] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public double[] h() {
            return new double[]{this.f1616d};
        }
    }

    public static b a(int i5, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i5 = 2;
        }
        return i5 != 0 ? i5 != 2 ? new e(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new f(dArr, dArr2);
    }

    public static b b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new androidx.constraintlayout.motion.utils.a(iArr, dArr, dArr2);
    }

    public abstract double c(double d6, int i5);

    public abstract void d(double d6, double[] dArr);

    public abstract void e(double d6, float[] fArr);

    public abstract double f(double d6, int i5);

    public abstract void g(double d6, double[] dArr);

    public abstract double[] h();
}
