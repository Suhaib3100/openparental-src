package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.oned.r;

/* compiled from: AbstractRSSReader.java */
/* loaded from: classes6.dex */
public abstract class a extends r {

    /* renamed from: g, reason: collision with root package name */
    private static final float f63057g = 0.2f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f63058h = 0.45f;

    /* renamed from: i, reason: collision with root package name */
    private static final float f63059i = 0.7916667f;

    /* renamed from: j, reason: collision with root package name */
    private static final float f63060j = 0.89285713f;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f63062b;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f63065e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f63066f;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f63061a = new int[4];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f63063c = new float[4];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f63064d = new float[4];

    protected a() {
        int[] iArr = new int[8];
        this.f63062b = iArr;
        this.f63065e = new int[iArr.length / 2];
        this.f63066f = new int[iArr.length / 2];
    }

    @Deprecated
    protected static int h(int[] iArr) {
        return pa.a.d(iArr);
    }

    protected static void i(int[] iArr, float[] fArr) {
        int i4 = 0;
        float f4 = fArr[0];
        for (int i5 = 1; i5 < iArr.length; i5++) {
            float f5 = fArr[i5];
            if (f5 < f4) {
                i4 = i5;
                f4 = f5;
            }
        }
        iArr[i4] = iArr[i4] - 1;
    }

    protected static void p(int[] iArr, float[] fArr) {
        int i4 = 0;
        float f4 = fArr[0];
        for (int i5 = 1; i5 < iArr.length; i5++) {
            float f5 = fArr[i5];
            if (f5 > f4) {
                i4 = i5;
                f4 = f5;
            }
        }
        iArr[i4] = iArr[i4] + 1;
    }

    protected static boolean q(int[] iArr) {
        float f4 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f4 >= f63059i && f4 <= f63060j) {
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            for (int i6 : iArr) {
                if (i6 > i5) {
                    i5 = i6;
                }
                if (i6 < i4) {
                    i4 = i6;
                }
            }
            if (i5 < i4 * 10) {
                return true;
            }
        }
        return false;
    }

    protected static int r(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            if (r.e(iArr, iArr2[i4], f63058h) < 0.2f) {
                return i4;
            }
        }
        throw NotFoundException.a();
    }

    protected final int[] j() {
        return this.f63062b;
    }

    protected final int[] k() {
        return this.f63061a;
    }

    protected final int[] l() {
        return this.f63066f;
    }

    protected final float[] m() {
        return this.f63064d;
    }

    protected final int[] n() {
        return this.f63065e;
    }

    protected final float[] o() {
        return this.f63063c;
    }
}
