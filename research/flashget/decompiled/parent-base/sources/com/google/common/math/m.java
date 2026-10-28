package com.google.common.math;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Quantiles.java */
@e
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class m {

    /* compiled from: Quantiles.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f57236a;

        public c a(int i4) {
            return new c(this.f57236a, i4);
        }

        public d b(Collection<Integer> collection) {
            return new d(this.f57236a, com.google.common.primitives.l.B(collection));
        }

        public d c(int... iArr) {
            return new d(this.f57236a, (int[]) iArr.clone());
        }

        private b(int i4) {
            l0.e(i4 > 0, ProtectedSandApp.s("\uf71c"));
            this.f57236a = i4;
        }
    }

    /* compiled from: Quantiles.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f57237a;

        /* renamed from: b, reason: collision with root package name */
        private final int f57238b;

        public double a(Collection<? extends Number> collection) {
            return e(com.google.common.primitives.d.z(collection));
        }

        public double b(double... dArr) {
            return e((double[]) dArr.clone());
        }

        public double c(int... iArr) {
            return e(m.l(iArr));
        }

        public double d(long... jArr) {
            return e(m.m(jArr));
        }

        public double e(double... dArr) {
            l0.e(dArr.length > 0, ProtectedSandApp.s("\uf71d"));
            if (m.j(dArr)) {
                return Double.NaN;
            }
            long length = this.f57238b * (dArr.length - 1);
            int g4 = (int) h.g(length, this.f57237a, RoundingMode.DOWN);
            int i4 = (int) (length - (g4 * this.f57237a));
            m.u(g4, dArr, 0, dArr.length - 1);
            if (i4 == 0) {
                return dArr[g4];
            }
            int i5 = g4 + 1;
            m.u(i5, dArr, i5, dArr.length - 1);
            return m.k(dArr[g4], dArr[i5], i4, this.f57237a);
        }

        private c(int i4, int i5) {
            m.h(i5, i4);
            this.f57237a = i4;
            this.f57238b = i5;
        }
    }

    /* compiled from: Quantiles.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f57239a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f57240b;

        public Map<Integer, Double> a(Collection<? extends Number> collection) {
            return e(com.google.common.primitives.d.z(collection));
        }

        public Map<Integer, Double> b(double... dArr) {
            return e((double[]) dArr.clone());
        }

        public Map<Integer, Double> c(int... iArr) {
            return e(m.l(iArr));
        }

        public Map<Integer, Double> d(long... jArr) {
            return e(m.m(jArr));
        }

        public Map<Integer, Double> e(double... dArr) {
            int i4 = 0;
            l0.e(dArr.length > 0, ProtectedSandApp.s("\uf71f"));
            if (m.j(dArr)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int[] iArr = this.f57240b;
                int length = iArr.length;
                while (i4 < length) {
                    linkedHashMap.put(Integer.valueOf(iArr[i4]), Double.valueOf(Double.NaN));
                    i4++;
                }
                return Collections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr2 = this.f57240b;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i5 >= this.f57240b.length) {
                    break;
                }
                long length2 = r5[i5] * (dArr.length - 1);
                int g4 = (int) h.g(length2, this.f57239a, RoundingMode.DOWN);
                int i7 = (int) (length2 - (g4 * this.f57239a));
                iArr3[i5] = g4;
                iArr4[i5] = i7;
                iArr5[i6] = g4;
                int i10 = i6 + 1;
                if (i7 != 0) {
                    iArr5[i10] = g4 + 1;
                    i6 += 2;
                } else {
                    i6 = i10;
                }
                i5++;
            }
            Arrays.sort(iArr5, 0, i6);
            m.t(iArr5, 0, i6 - 1, dArr, 0, dArr.length - 1);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (true) {
                int[] iArr6 = this.f57240b;
                if (i4 >= iArr6.length) {
                    return Collections.unmodifiableMap(linkedHashMap2);
                }
                int i11 = iArr3[i4];
                int i12 = iArr4[i4];
                if (i12 == 0) {
                    linkedHashMap2.put(Integer.valueOf(iArr6[i4]), Double.valueOf(dArr[i11]));
                } else {
                    linkedHashMap2.put(Integer.valueOf(iArr6[i4]), Double.valueOf(m.k(dArr[i11], dArr[i11 + 1], i12, this.f57239a)));
                }
                i4++;
            }
        }

        private d(int i4, int[] iArr) {
            for (int i5 : iArr) {
                m.h(i5, i4);
            }
            l0.e(iArr.length > 0, ProtectedSandApp.s("\uf71e"));
            this.f57239a = i4;
            this.f57240b = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(int i4, int i5) {
        if (i4 < 0 || i4 > i5) {
            throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(70, ProtectedSandApp.s("\uf720"), i5));
        }
    }

    private static int i(int[] iArr, int i4, int i5, int i6, int i7) {
        if (i4 == i5) {
            return i4;
        }
        int i10 = i6 + i7;
        int i11 = i10 >>> 1;
        while (i5 > i4 + 1) {
            int i12 = (i4 + i5) >>> 1;
            int i13 = iArr[i12];
            if (i13 > i11) {
                i5 = i12;
            } else {
                if (i13 >= i11) {
                    return i12;
                }
                i4 = i12;
            }
        }
        return (i10 - iArr[i4]) - iArr[i5] > 0 ? i5 : i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(double... dArr) {
        for (double d5 : dArr) {
            if (Double.isNaN(d5)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double k(double d5, double d6, double d7, double d10) {
        if (d5 == Double.NEGATIVE_INFINITY) {
            return d6 == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (d6 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return (((d6 - d5) * d7) / d10) + d5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] l(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i4 = 0; i4 < length; i4++) {
            dArr[i4] = iArr[i4];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] m(long[] jArr) {
        int length = jArr.length;
        double[] dArr = new double[length];
        for (int i4 = 0; i4 < length; i4++) {
            dArr[i4] = jArr[i4];
        }
        return dArr;
    }

    public static c n() {
        return s(2).a(1);
    }

    private static void o(double[] dArr, int i4, int i5) {
        int i6 = (i4 + i5) >>> 1;
        double d5 = dArr[i5];
        double d6 = dArr[i6];
        boolean z4 = d5 < d6;
        double d7 = dArr[i4];
        boolean z5 = d6 < d7;
        boolean z6 = d5 < d7;
        if (z4 == z5) {
            v(dArr, i6, i4);
        } else if (z4 != z6) {
            v(dArr, i4, i5);
        }
    }

    private static int p(double[] dArr, int i4, int i5) {
        o(dArr, i4, i5);
        double d5 = dArr[i4];
        int i6 = i5;
        while (i5 > i4) {
            if (dArr[i5] > d5) {
                v(dArr, i6, i5);
                i6--;
            }
            i5--;
        }
        v(dArr, i4, i6);
        return i6;
    }

    public static b q() {
        return s(100);
    }

    public static b r() {
        return s(4);
    }

    public static b s(int i4) {
        return new b(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(int[] iArr, int i4, int i5, double[] dArr, int i6, int i7) {
        int i10 = i(iArr, i4, i5, i6, i7);
        int i11 = iArr[i10];
        u(i11, dArr, i6, i7);
        int i12 = i10 - 1;
        while (i12 >= i4 && iArr[i12] == i11) {
            i12--;
        }
        if (i12 >= i4) {
            t(iArr, i4, i12, dArr, i6, i11 - 1);
        }
        int i13 = i10 + 1;
        while (i13 <= i5 && iArr[i13] == i11) {
            i13++;
        }
        if (i13 <= i5) {
            t(iArr, i13, i5, dArr, i11 + 1, i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(int i4, double[] dArr, int i5, int i6) {
        if (i4 != i5) {
            while (i6 > i5) {
                int p4 = p(dArr, i5, i6);
                if (p4 >= i4) {
                    i6 = p4 - 1;
                }
                if (p4 <= i4) {
                    i5 = p4 + 1;
                }
            }
            return;
        }
        int i7 = i5;
        for (int i10 = i5 + 1; i10 <= i6; i10++) {
            if (dArr[i7] > dArr[i10]) {
                i7 = i10;
            }
        }
        if (i7 != i5) {
            v(dArr, i7, i5);
        }
    }

    private static void v(double[] dArr, int i4, int i5) {
        double d5 = dArr[i4];
        dArr[i4] = dArr[i5];
        dArr[i5] = d5;
    }
}
