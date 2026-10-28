package z8;

/* compiled from: MathUtils.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f93818a = 1.0E-4f;

    private a() {
    }

    public static float a(float f4, float f5, float f6, float f7) {
        return (float) Math.hypot(f6 - f4, f7 - f5);
    }

    public static float b(float f4, float f5, float f6, float f7, float f10, float f11) {
        return g(a(f4, f5, f6, f7), a(f4, f5, f10, f7), a(f4, f5, f10, f11), a(f4, f5, f6, f11));
    }

    public static float c(float f4, int i4) {
        float f5 = i4;
        int i5 = (int) (f4 / f5);
        if (Math.signum(f4) * f5 < 0.0f && i5 * i4 != f4) {
            i5--;
        }
        return f4 - (i5 * i4);
    }

    public static int d(int i4, int i5) {
        int i6 = i4 / i5;
        if ((i4 ^ i5) < 0 && i6 * i5 != i4) {
            i6--;
        }
        return i4 - (i6 * i5);
    }

    public static boolean e(float f4, float f5, float f6) {
        return f4 + f6 >= f5;
    }

    public static float f(float f4, float f5, float f6) {
        return (f6 * f5) + ((1.0f - f6) * f4);
    }

    private static float g(float f4, float f5, float f6, float f7) {
        return (f4 <= f5 || f4 <= f6 || f4 <= f7) ? (f5 <= f6 || f5 <= f7) ? f6 > f7 ? f6 : f7 : f5 : f4;
    }
}
