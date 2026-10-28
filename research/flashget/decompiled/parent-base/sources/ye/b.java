package ye;

import org.apache.commons.lang3.k1;

/* compiled from: IEEE754rUtils.java */
/* loaded from: classes6.dex */
public class b {
    public static double a(double d5, double d6) {
        return Double.isNaN(d5) ? d6 : Double.isNaN(d6) ? d5 : Math.max(d5, d6);
    }

    public static double b(double d5, double d6, double d7) {
        return a(a(d5, d6), d7);
    }

    public static double c(double... dArr) {
        k1.b0(dArr, "The Array must not be null", new Object[0]);
        k1.B(dArr.length != 0, "Array cannot be empty.", new Object[0]);
        double d5 = dArr[0];
        for (int i4 = 1; i4 < dArr.length; i4++) {
            d5 = a(dArr[i4], d5);
        }
        return d5;
    }

    public static float d(float f4, float f5) {
        return Float.isNaN(f4) ? f5 : Float.isNaN(f5) ? f4 : Math.max(f4, f5);
    }

    public static float e(float f4, float f5, float f6) {
        return d(d(f4, f5), f6);
    }

    public static float f(float... fArr) {
        k1.b0(fArr, "The Array must not be null", new Object[0]);
        k1.B(fArr.length != 0, "Array cannot be empty.", new Object[0]);
        float f4 = fArr[0];
        for (int i4 = 1; i4 < fArr.length; i4++) {
            f4 = d(fArr[i4], f4);
        }
        return f4;
    }

    public static double g(double d5, double d6) {
        return Double.isNaN(d5) ? d6 : Double.isNaN(d6) ? d5 : Math.min(d5, d6);
    }

    public static double h(double d5, double d6, double d7) {
        return g(g(d5, d6), d7);
    }

    public static double i(double... dArr) {
        k1.b0(dArr, "The Array must not be null", new Object[0]);
        k1.B(dArr.length != 0, "Array cannot be empty.", new Object[0]);
        double d5 = dArr[0];
        for (int i4 = 1; i4 < dArr.length; i4++) {
            d5 = g(dArr[i4], d5);
        }
        return d5;
    }

    public static float j(float f4, float f5) {
        return Float.isNaN(f4) ? f5 : Float.isNaN(f5) ? f4 : Math.min(f4, f5);
    }

    public static float k(float f4, float f5, float f6) {
        return j(j(f4, f5), f6);
    }

    public static float l(float... fArr) {
        k1.b0(fArr, "The Array must not be null", new Object[0]);
        k1.B(fArr.length != 0, "Array cannot be empty.", new Object[0]);
        float f4 = fArr[0];
        for (int i4 = 1; i4 < fArr.length; i4++) {
            f4 = j(fArr[i4], f4);
        }
        return f4;
    }
}
