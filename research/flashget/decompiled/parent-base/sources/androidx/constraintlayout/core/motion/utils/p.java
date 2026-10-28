package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.j;
import androidx.constraintlayout.core.motion.utils.w;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: SplineSet.java */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: f, reason: collision with root package name */
    private static final String f22311f = "SplineSet";

    /* renamed from: a, reason: collision with root package name */
    protected androidx.constraintlayout.core.motion.utils.c f22312a;

    /* renamed from: b, reason: collision with root package name */
    protected int[] f22313b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    protected float[] f22314c = new float[10];

    /* renamed from: d, reason: collision with root package name */
    private int f22315d;

    /* renamed from: e, reason: collision with root package name */
    private String f22316e;

    /* compiled from: SplineSet.java */
    private static class a extends p {

        /* renamed from: g, reason: collision with root package name */
        String f22317g;

        /* renamed from: h, reason: collision with root package name */
        long f22318h;

        public a(String str, long j4) {
            this.f22317g = str;
            this.f22318h = j4;
        }

        @Override // androidx.constraintlayout.core.motion.utils.p
        public void h(w wVar, float f4) {
            wVar.c(wVar.a(this.f22317g), a(f4));
        }
    }

    /* compiled from: SplineSet.java */
    public static class b extends p {

        /* renamed from: g, reason: collision with root package name */
        String f22319g;

        /* renamed from: h, reason: collision with root package name */
        j.a f22320h;

        /* renamed from: i, reason: collision with root package name */
        float[] f22321i;

        public b(String str, j.a aVar) {
            this.f22319g = str.split(",")[1];
            this.f22320h = aVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.p
        public void g(int i4, float f4) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.p
        public void j(int i4) {
            int f4 = this.f22320h.f();
            int h4 = this.f22320h.g(0).h();
            double[] dArr = new double[f4];
            this.f22321i = new float[h4];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, f4, h4);
            for (int i5 = 0; i5 < f4; i5++) {
                int d5 = this.f22320h.d(i5);
                androidx.constraintlayout.core.motion.a g4 = this.f22320h.g(i5);
                dArr[i5] = d5 * 0.01d;
                g4.e(this.f22321i);
                int i6 = 0;
                while (true) {
                    if (i6 < this.f22321i.length) {
                        dArr2[i5][i6] = r6[i6];
                        i6++;
                    }
                }
            }
            this.f22312a = androidx.constraintlayout.core.motion.utils.c.a(i4, dArr, dArr2);
        }

        public void k(int i4, androidx.constraintlayout.core.motion.a aVar) {
            this.f22320h.a(i4, aVar);
        }

        public void l(androidx.constraintlayout.core.state.r rVar, float f4) {
            this.f22312a.e(f4, this.f22321i);
            rVar.z(this.f22320h.g(0), this.f22321i);
        }
    }

    /* compiled from: SplineSet.java */
    public static class c extends p {

        /* renamed from: g, reason: collision with root package name */
        String f22322g;

        /* renamed from: h, reason: collision with root package name */
        j.b f22323h;

        /* renamed from: i, reason: collision with root package name */
        float[] f22324i;

        public c(String str, j.b bVar) {
            this.f22322g = str.split(",")[1];
            this.f22323h = bVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.p
        public void g(int i4, float f4) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.p
        public void h(w wVar, float f4) {
            l((androidx.constraintlayout.core.motion.f) wVar, f4);
        }

        @Override // androidx.constraintlayout.core.motion.utils.p
        public void j(int i4) {
            int f4 = this.f22323h.f();
            int r4 = this.f22323h.g(0).r();
            double[] dArr = new double[f4];
            this.f22324i = new float[r4];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, f4, r4);
            for (int i5 = 0; i5 < f4; i5++) {
                int d5 = this.f22323h.d(i5);
                androidx.constraintlayout.core.motion.b g4 = this.f22323h.g(i5);
                dArr[i5] = d5 * 0.01d;
                g4.o(this.f22324i);
                int i6 = 0;
                while (true) {
                    if (i6 < this.f22324i.length) {
                        dArr2[i5][i6] = r6[i6];
                        i6++;
                    }
                }
            }
            this.f22312a = androidx.constraintlayout.core.motion.utils.c.a(i4, dArr, dArr2);
        }

        public void k(int i4, androidx.constraintlayout.core.motion.b bVar) {
            this.f22323h.a(i4, bVar);
        }

        public void l(androidx.constraintlayout.core.motion.f fVar, float f4) {
            this.f22312a.e(f4, this.f22324i);
            this.f22323h.g(0).w(fVar, this.f22324i);
        }
    }

    /* compiled from: SplineSet.java */
    private static class d {
        private d() {
        }

        static void a(int[] iArr, float[] fArr, int i4, int i5) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i5;
            iArr2[1] = i4;
            int i6 = 2;
            while (i6 > 0) {
                int i7 = iArr2[i6 - 1];
                int i10 = i6 - 2;
                int i11 = iArr2[i10];
                if (i7 < i11) {
                    int b5 = b(iArr, fArr, i7, i11);
                    iArr2[i10] = b5 - 1;
                    iArr2[i6 - 1] = i7;
                    int i12 = i6 + 1;
                    iArr2[i6] = i11;
                    i6 += 2;
                    iArr2[i12] = b5 + 1;
                } else {
                    i6 = i10;
                }
            }
        }

        private static int b(int[] iArr, float[] fArr, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    c(iArr, fArr, i7, i4);
                    i7++;
                }
                i4++;
            }
            c(iArr, fArr, i7, i5);
            return i7;
        }

        private static void c(int[] iArr, float[] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float f4 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f4;
        }
    }

    public static p d(String str, j.a aVar) {
        return new b(str, aVar);
    }

    public static p e(String str, j.b bVar) {
        return new c(str, bVar);
    }

    public static p f(String str, long j4) {
        return new a(str, j4);
    }

    public float a(float f4) {
        return (float) this.f22312a.c(f4, 0);
    }

    public androidx.constraintlayout.core.motion.utils.c b() {
        return this.f22312a;
    }

    public float c(float f4) {
        return (float) this.f22312a.f(f4, 0);
    }

    public void g(int i4, float f4) {
        int[] iArr = this.f22313b;
        if (iArr.length < this.f22315d + 1) {
            this.f22313b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f22314c;
            this.f22314c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f22313b;
        int i5 = this.f22315d;
        iArr2[i5] = i4;
        this.f22314c[i5] = f4;
        this.f22315d = i5 + 1;
    }

    public void h(w wVar, float f4) {
        wVar.c(w.a.a(this.f22316e), a(f4));
    }

    public void i(String str) {
        this.f22316e = str;
    }

    public void j(int i4) {
        int i5;
        int i6 = this.f22315d;
        if (i6 == 0) {
            return;
        }
        d.a(this.f22313b, this.f22314c, 0, i6 - 1);
        int i7 = 1;
        for (int i10 = 1; i10 < this.f22315d; i10++) {
            int[] iArr = this.f22313b;
            if (iArr[i10 - 1] != iArr[i10]) {
                i7++;
            }
        }
        double[] dArr = new double[i7];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i7, 1);
        int i11 = 0;
        for (0; i5 < this.f22315d; i5 + 1) {
            if (i5 > 0) {
                int[] iArr2 = this.f22313b;
                i5 = iArr2[i5] == iArr2[i5 - 1] ? i5 + 1 : 0;
            }
            dArr[i11] = this.f22313b[i5] * 0.01d;
            dArr2[i11][0] = this.f22314c[i5];
            i11++;
        }
        this.f22312a = androidx.constraintlayout.core.motion.utils.c.a(i4, dArr, dArr2);
    }

    public String toString() {
        String str = this.f22316e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i4 = 0; i4 < this.f22315d; i4++) {
            StringBuilder a5 = androidx.constraintlayout.core.e.a(str, "[");
            a5.append(this.f22313b[i4]);
            a5.append(" , ");
            a5.append(decimalFormat.format(this.f22314c[i4]));
            a5.append("] ");
            str = a5.toString();
        }
        return str;
    }
}
