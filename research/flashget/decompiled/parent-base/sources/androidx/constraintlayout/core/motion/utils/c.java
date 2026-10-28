package androidx.constraintlayout.core.motion.utils;

/* compiled from: CurveFit.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22185a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f22186b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f22187c = 2;

    /* compiled from: CurveFit.java */
    static class a extends c {

        /* renamed from: d, reason: collision with root package name */
        double f22188d;

        /* renamed from: e, reason: collision with root package name */
        double[] f22189e;

        a(double d5, double[] dArr) {
            this.f22188d = d5;
            this.f22189e = dArr;
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public double c(double d5, int i4) {
            return this.f22189e[i4];
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public void d(double d5, double[] dArr) {
            double[] dArr2 = this.f22189e;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public void e(double d5, float[] fArr) {
            int i4 = 0;
            while (true) {
                double[] dArr = this.f22189e;
                if (i4 >= dArr.length) {
                    return;
                }
                fArr[i4] = (float) dArr[i4];
                i4++;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public double f(double d5, int i4) {
            return com.google.firebase.remoteconfig.p.f60679p;
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public void g(double d5, double[] dArr) {
            for (int i4 = 0; i4 < this.f22189e.length; i4++) {
                dArr[i4] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public double[] h() {
            return new double[]{this.f22188d};
        }
    }

    public static c a(int i4, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i4 = 2;
        }
        return i4 != 0 ? i4 != 2 ? new k(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new l(dArr, dArr2);
    }

    public static c b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new b(iArr, dArr, dArr2);
    }

    public abstract double c(double d5, int i4);

    public abstract void d(double d5, double[] dArr);

    public abstract void e(double d5, float[] fArr);

    public abstract double f(double d5, int i4);

    public abstract void g(double d5, double[] dArr);

    public abstract double[] h();
}
