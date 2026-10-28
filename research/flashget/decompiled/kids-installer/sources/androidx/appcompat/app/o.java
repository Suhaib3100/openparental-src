package androidx.appcompat.app;

/* compiled from: TwilightCalculator.java */
/* loaded from: classes.dex */
class o {

    /* renamed from: d, reason: collision with root package name */
    private static o f400d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final int f401e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f402f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final float f403g = 0.017453292f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f404h = 9.0E-4f;

    /* renamed from: i, reason: collision with root package name */
    private static final float f405i = -0.10471976f;

    /* renamed from: j, reason: collision with root package name */
    private static final float f406j = 0.0334196f;

    /* renamed from: k, reason: collision with root package name */
    private static final float f407k = 3.49066E-4f;

    /* renamed from: l, reason: collision with root package name */
    private static final float f408l = 5.236E-6f;

    /* renamed from: m, reason: collision with root package name */
    private static final float f409m = 0.4092797f;

    /* renamed from: n, reason: collision with root package name */
    private static final long f410n = 946728000000L;

    /* renamed from: a, reason: collision with root package name */
    public long f411a;

    /* renamed from: b, reason: collision with root package name */
    public long f412b;

    /* renamed from: c, reason: collision with root package name */
    public int f413c;

    o() {
    }

    static o b() {
        if (f400d == null) {
            f400d = new o();
        }
        return f400d;
    }

    public void a(long j5, double d6, double d7) {
        double d8 = (0.01720197f * ((j5 - f410n) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d8) * 0.03341960161924362d) + d8 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d8) * 0.0053d) + Math.round((r3 - f404h) - r7) + f404h + ((-d7) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d9 = 0.01745329238474369d * d6;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d9))) / (Math.cos(asin) * Math.cos(d9));
        if (sin3 >= 1.0d) {
            this.f413c = 1;
            this.f411a = -1L;
            this.f412b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f413c = 0;
                this.f411a = -1L;
                this.f412b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f411a = Math.round((sin2 + acos) * 8.64E7d) + f410n;
            long round = Math.round((sin2 - acos) * 8.64E7d) + f410n;
            this.f412b = round;
            if (round >= j5 || this.f411a <= j5) {
                this.f413c = 1;
            } else {
                this.f413c = 0;
            }
        }
    }
}
