package androidx.constraintlayout.core.motion.utils;

/* compiled from: SpringStopEngine.java */
/* loaded from: classes.dex */
public class q implements s {

    /* renamed from: l, reason: collision with root package name */
    private static final double f22325l = Double.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private double f22328c;

    /* renamed from: d, reason: collision with root package name */
    private double f22329d;

    /* renamed from: e, reason: collision with root package name */
    private double f22330e;

    /* renamed from: f, reason: collision with root package name */
    private float f22331f;

    /* renamed from: g, reason: collision with root package name */
    private float f22332g;

    /* renamed from: h, reason: collision with root package name */
    private float f22333h;

    /* renamed from: i, reason: collision with root package name */
    private float f22334i;

    /* renamed from: j, reason: collision with root package name */
    private float f22335j;

    /* renamed from: a, reason: collision with root package name */
    double f22326a = 0.5d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22327b = false;

    /* renamed from: k, reason: collision with root package name */
    private int f22336k = 0;

    private void b(double d5) {
        double d6 = this.f22328c;
        double d7 = this.f22326a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d6 / this.f22334i) * d5) * 4.0d)) + 1.0d);
        double d10 = d5 / sqrt;
        int i4 = 0;
        while (i4 < sqrt) {
            float f4 = this.f22332g;
            double d11 = this.f22329d;
            float f5 = this.f22333h;
            double d12 = d6;
            double d13 = ((-d6) * (f4 - d11)) - (f5 * d7);
            float f6 = this.f22334i;
            double d14 = d7;
            double d15 = (((d13 / f6) * d10) / 2.0d) + f5;
            double d16 = ((((-((((d10 * d15) / 2.0d) + f4) - d11)) * d12) - (d15 * d14)) / f6) * d10;
            float f7 = (float) (f5 + d16);
            this.f22333h = f7;
            float f10 = (float) ((((d16 / 2.0d) + f5) * d10) + f4);
            this.f22332g = f10;
            int i5 = this.f22336k;
            if (i5 > 0) {
                if (f10 < 0.0f && (i5 & 1) == 1) {
                    this.f22332g = -f10;
                    this.f22333h = -f7;
                }
                float f11 = this.f22332g;
                if (f11 > 1.0f && (i5 & 2) == 2) {
                    this.f22332g = 2.0f - f11;
                    this.f22333h = -this.f22333h;
                }
            }
            i4++;
            d6 = d12;
            d7 = d14;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public boolean K() {
        double d5 = this.f22332g - this.f22329d;
        double d6 = this.f22328c;
        double d7 = this.f22333h;
        return Math.sqrt((((d6 * d5) * d5) + ((d7 * d7) * ((double) this.f22334i))) / d6) <= ((double) this.f22335j);
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public float L(float f4) {
        return this.f22333h;
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public String M(String str, float f4) {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public float a() {
        return 0.0f;
    }

    public float c() {
        return ((float) (((-this.f22328c) * (this.f22332g - this.f22329d)) - (this.f22326a * this.f22333h))) / this.f22334i;
    }

    void d(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    public void e(float f4, float f5, float f6, float f7, float f10, float f11, float f12, int i4) {
        this.f22329d = f5;
        this.f22326a = f11;
        this.f22327b = false;
        this.f22332g = f4;
        this.f22330e = f6;
        this.f22328c = f10;
        this.f22334i = f7;
        this.f22335j = f12;
        this.f22336k = i4;
        this.f22331f = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public float getInterpolation(float f4) {
        b(f4 - this.f22331f);
        this.f22331f = f4;
        return this.f22332g;
    }
}
