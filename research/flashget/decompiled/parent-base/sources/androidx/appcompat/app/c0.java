package androidx.appcompat.app;

/* compiled from: TwilightCalculator.java */
/* loaded from: classes.dex */
class c0 {

    /* renamed from: d, reason: collision with root package name */
    private static c0 f857d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final int f858e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f859f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final float f860g = 0.017453292f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f861h = 9.0E-4f;

    /* renamed from: i, reason: collision with root package name */
    private static final float f862i = -0.10471976f;

    /* renamed from: j, reason: collision with root package name */
    private static final float f863j = 0.0334196f;

    /* renamed from: k, reason: collision with root package name */
    private static final float f864k = 3.49066E-4f;

    /* renamed from: l, reason: collision with root package name */
    private static final float f865l = 5.236E-6f;

    /* renamed from: m, reason: collision with root package name */
    private static final float f866m = 0.4092797f;

    /* renamed from: n, reason: collision with root package name */
    private static final long f867n = 946728000000L;

    /* renamed from: a, reason: collision with root package name */
    public long f868a;

    /* renamed from: b, reason: collision with root package name */
    public long f869b;

    /* renamed from: c, reason: collision with root package name */
    public int f870c;

    c0() {
    }

    static c0 b() {
        if (f857d == null) {
            f857d = new c0();
        }
        return f857d;
    }

    public void a(long j4, double d5, double d6) {
        double d7 = (0.01720197f * ((j4 - f867n) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + b0.a(2.0f * r4, 3.4906598739326E-4d, b0.a(d7, 0.03341960161924362d, d7)) + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + b0.a(d7, 0.0053d, Math.round((r3 - f861h) - r4) + f861h + ((-d6) / 360.0d));
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d10 = 0.01745329238474369d * d5;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d10))) / (Math.cos(asin) * Math.cos(d10));
        if (sin3 >= 1.0d) {
            this.f870c = 1;
            this.f868a = -1L;
            this.f869b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f870c = 0;
                this.f868a = -1L;
                this.f869b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f868a = Math.round((sin2 + acos) * 8.64E7d) + f867n;
            long round = Math.round((sin2 - acos) * 8.64E7d) + f867n;
            this.f869b = round;
            if (round >= j4 || this.f868a <= j4) {
                this.f870c = 1;
            } else {
                this.f870c = 0;
            }
        }
    }
}
