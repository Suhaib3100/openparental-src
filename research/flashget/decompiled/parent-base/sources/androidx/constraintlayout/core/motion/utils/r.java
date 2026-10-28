package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: StepCurve.java */
/* loaded from: classes.dex */
public class r extends e {

    /* renamed from: q, reason: collision with root package name */
    private static final boolean f22337q = false;

    /* renamed from: p, reason: collision with root package name */
    l f22338p;

    r(String str) {
        this.f22204a = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i4 = 0;
        while (indexOf2 != -1) {
            dArr[i4] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i4++;
        }
        dArr[i4] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.f22338p = e(Arrays.copyOf(dArr, i4 + 1));
    }

    private static l d(String str) {
        String[] split = str.split("\\s+");
        int length = split.length;
        double[] dArr = new double[length];
        for (int i4 = 0; i4 < length; i4++) {
            dArr[i4] = Double.parseDouble(split[i4]);
        }
        return e(dArr);
    }

    private static l e(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d5 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            double d6 = dArr[i4];
            int i5 = i4 + length2;
            dArr2[i5][0] = d6;
            double d7 = i4 * d5;
            dArr3[i5] = d7;
            if (i4 > 0) {
                int i6 = (length2 * 2) + i4;
                dArr2[i6][0] = d6 + 1.0d;
                dArr3[i6] = d7 + 1.0d;
                int i7 = i4 - 1;
                dArr2[i7][0] = (d6 - 1.0d) - d5;
                dArr3[i7] = (d7 - 1.0d) - d5;
            }
        }
        l lVar = new l(dArr3, dArr2);
        PrintStream printStream = System.out;
        printStream.println(" 0 " + lVar.c(com.google.firebase.remoteconfig.p.f60679p, 0));
        printStream.println(" 1 " + lVar.c(1.0d, 0));
        return lVar;
    }

    @Override // androidx.constraintlayout.core.motion.utils.e
    public double a(double d5) {
        return this.f22338p.c(d5, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.e
    public double b(double d5) {
        return this.f22338p.f(d5, 0);
    }
}
