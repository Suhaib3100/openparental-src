package u1;

/* compiled from: MathUtils.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f33570a = 1.0E-4f;

    private a() {
    }

    public static float a(float f6, float f7, float f8, float f9) {
        return (float) Math.hypot(f8 - f6, f9 - f7);
    }

    public static float b(float f6, float f7, float f8, float f9, float f10, float f11) {
        return g(a(f6, f7, f8, f9), a(f6, f7, f10, f9), a(f6, f7, f10, f11), a(f6, f7, f8, f11));
    }

    public static float c(float f6, int i5) {
        float f7 = i5;
        int i6 = (int) (f6 / f7);
        if (Math.signum(f6) * f7 < 0.0f && i6 * i5 != f6) {
            i6--;
        }
        return f6 - (i6 * i5);
    }

    public static int d(int i5, int i6) {
        int i7 = i5 / i6;
        if ((i5 ^ i6) < 0 && i7 * i6 != i5) {
            i7--;
        }
        return i5 - (i7 * i6);
    }

    public static boolean e(float f6, float f7, float f8) {
        return f6 + f8 >= f7;
    }

    public static float f(float f6, float f7, float f8) {
        return (f8 * f7) + ((1.0f - f8) * f6);
    }

    private static float g(float f6, float f7, float f8, float f9) {
        return (f6 <= f7 || f6 <= f8 || f6 <= f9) ? (f7 <= f8 || f7 <= f9) ? f8 > f9 ? f8 : f9 : f7 : f6;
    }
}
