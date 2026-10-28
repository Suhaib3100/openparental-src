package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* compiled from: ArcCurveFit.java */
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: g, reason: collision with root package name */
    public static final int f22154g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f22155h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f22156i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f22157j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static final int f22158k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f22159l = 2;

    /* renamed from: m, reason: collision with root package name */
    private static final int f22160m = 3;

    /* renamed from: d, reason: collision with root package name */
    private final double[] f22161d;

    /* renamed from: e, reason: collision with root package name */
    a[] f22162e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22163f = true;

    /* compiled from: ArcCurveFit.java */
    private static class a {

        /* renamed from: s, reason: collision with root package name */
        private static final String f22164s = "Arc";

        /* renamed from: t, reason: collision with root package name */
        private static double[] f22165t = new double[91];

        /* renamed from: u, reason: collision with root package name */
        private static final double f22166u = 0.001d;

        /* renamed from: a, reason: collision with root package name */
        double[] f22167a;

        /* renamed from: b, reason: collision with root package name */
        double f22168b;

        /* renamed from: c, reason: collision with root package name */
        double f22169c;

        /* renamed from: d, reason: collision with root package name */
        double f22170d;

        /* renamed from: e, reason: collision with root package name */
        double f22171e;

        /* renamed from: f, reason: collision with root package name */
        double f22172f;

        /* renamed from: g, reason: collision with root package name */
        double f22173g;

        /* renamed from: h, reason: collision with root package name */
        double f22174h;

        /* renamed from: i, reason: collision with root package name */
        double f22175i;

        /* renamed from: j, reason: collision with root package name */
        double f22176j;

        /* renamed from: k, reason: collision with root package name */
        double f22177k;

        /* renamed from: l, reason: collision with root package name */
        double f22178l;

        /* renamed from: m, reason: collision with root package name */
        double f22179m;

        /* renamed from: n, reason: collision with root package name */
        double f22180n;

        /* renamed from: o, reason: collision with root package name */
        double f22181o;

        /* renamed from: p, reason: collision with root package name */
        double f22182p;

        /* renamed from: q, reason: collision with root package name */
        boolean f22183q;

        /* renamed from: r, reason: collision with root package name */
        boolean f22184r;

        a(int i4, double d5, double d6, double d7, double d10, double d11, double d12) {
            this.f22184r = false;
            this.f22183q = i4 == 1;
            this.f22169c = d5;
            this.f22170d = d6;
            this.f22175i = 1.0d / (d6 - d5);
            if (3 == i4) {
                this.f22184r = true;
            }
            double d13 = d11 - d7;
            double d14 = d12 - d10;
            if (!this.f22184r && Math.abs(d13) >= f22166u && Math.abs(d14) >= f22166u) {
                this.f22167a = new double[101];
                boolean z4 = this.f22183q;
                this.f22176j = d13 * (z4 ? -1 : 1);
                this.f22177k = d14 * (z4 ? 1 : -1);
                this.f22178l = z4 ? d11 : d7;
                this.f22179m = z4 ? d10 : d12;
                a(d7, d10, d11, d12);
                this.f22180n = this.f22168b * this.f22175i;
                return;
            }
            this.f22184r = true;
            this.f22171e = d7;
            this.f22172f = d11;
            this.f22173g = d10;
            this.f22174h = d12;
            double hypot = Math.hypot(d14, d13);
            this.f22168b = hypot;
            this.f22180n = hypot * this.f22175i;
            double d15 = this.f22170d;
            double d16 = this.f22169c;
            this.f22178l = d13 / (d15 - d16);
            this.f22179m = d14 / (d15 - d16);
        }

        private void a(double d5, double d6, double d7, double d10) {
            double d11;
            double d12 = d7 - d5;
            double d13 = d6 - d10;
            int i4 = 0;
            double d14 = com.google.firebase.remoteconfig.p.f60679p;
            double d15 = com.google.firebase.remoteconfig.p.f60679p;
            double d16 = com.google.firebase.remoteconfig.p.f60679p;
            while (true) {
                if (i4 >= f22165t.length) {
                    break;
                }
                double d17 = d14;
                double radians = Math.toRadians((i4 * 90.0d) / (r15.length - 1));
                double sin = Math.sin(radians) * d12;
                double cos = Math.cos(radians) * d13;
                if (i4 > 0) {
                    d11 = Math.hypot(sin - d15, cos - d16) + d17;
                    f22165t[i4] = d11;
                } else {
                    d11 = d17;
                }
                i4++;
                d16 = cos;
                d14 = d11;
                d15 = sin;
            }
            double d18 = d14;
            this.f22168b = d18;
            int i5 = 0;
            while (true) {
                double[] dArr = f22165t;
                if (i5 >= dArr.length) {
                    break;
                }
                dArr[i5] = dArr[i5] / d18;
                i5++;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= this.f22167a.length) {
                    return;
                }
                double length = i6 / (r1.length - 1);
                int binarySearch = Arrays.binarySearch(f22165t, length);
                if (binarySearch >= 0) {
                    this.f22167a[i6] = binarySearch / (f22165t.length - 1);
                } else if (binarySearch == -1) {
                    this.f22167a[i6] = 0.0d;
                } else {
                    int i7 = -binarySearch;
                    int i10 = i7 - 2;
                    double[] dArr2 = f22165t;
                    double d19 = dArr2[i10];
                    this.f22167a[i6] = (((length - d19) / (dArr2[i7 - 1] - d19)) + i10) / (dArr2.length - 1);
                }
                i6++;
            }
        }

        double b() {
            double d5 = this.f22176j * this.f22182p;
            double hypot = this.f22180n / Math.hypot(d5, (-this.f22177k) * this.f22181o);
            if (this.f22183q) {
                d5 = -d5;
            }
            return d5 * hypot;
        }

        double c() {
            double d5 = this.f22176j * this.f22182p;
            double d6 = (-this.f22177k) * this.f22181o;
            double hypot = this.f22180n / Math.hypot(d5, d6);
            return this.f22183q ? (-d6) * hypot : d6 * hypot;
        }

        public double d(double d5) {
            return this.f22178l;
        }

        public double e(double d5) {
            return this.f22179m;
        }

        public double f(double d5) {
            double d6 = (d5 - this.f22169c) * this.f22175i;
            double d7 = this.f22171e;
            return androidx.constraintlayout.core.motion.utils.a.a(this.f22172f, d7, d6, d7);
        }

        public double g(double d5) {
            double d6 = (d5 - this.f22169c) * this.f22175i;
            double d7 = this.f22173g;
            return androidx.constraintlayout.core.motion.utils.a.a(this.f22174h, d7, d6, d7);
        }

        double h() {
            return (this.f22176j * this.f22181o) + this.f22178l;
        }

        double i() {
            return (this.f22177k * this.f22182p) + this.f22179m;
        }

        double j(double d5) {
            if (d5 <= com.google.firebase.remoteconfig.p.f60679p) {
                return com.google.firebase.remoteconfig.p.f60679p;
            }
            if (d5 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f22167a;
            double length = d5 * (dArr.length - 1);
            int i4 = (int) length;
            double d6 = length - i4;
            double d7 = dArr[i4];
            return androidx.constraintlayout.core.motion.utils.a.a(dArr[i4 + 1], d7, d6, d7);
        }

        void k(double d5) {
            double j4 = j((this.f22183q ? this.f22170d - d5 : d5 - this.f22169c) * this.f22175i) * 1.5707963267948966d;
            this.f22181o = Math.sin(j4);
            this.f22182p = Math.cos(j4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r5 == 1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.f22163f = r2
            r0.f22161d = r1
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.constraintlayout.core.motion.utils.b$a[] r3 = new androidx.constraintlayout.core.motion.utils.b.a[r3]
            r0.f22162e = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            androidx.constraintlayout.core.motion.utils.b$a[] r7 = r0.f22162e
            int r8 = r7.length
            if (r4 >= r8) goto L51
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L31
            if (r8 == r2) goto L2f
            r10 = 2
            if (r8 == r10) goto L2d
            if (r8 == r9) goto L28
            goto L32
        L28:
            if (r5 != r2) goto L2f
            goto L2d
        L2b:
            r6 = r5
            goto L32
        L2d:
            r5 = r10
            goto L2b
        L2f:
            r5 = r2
            goto L2b
        L31:
            r6 = r9
        L32:
            androidx.constraintlayout.core.motion.utils.b$a r22 = new androidx.constraintlayout.core.motion.utils.b$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L16
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.b.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double c(double d5, int i4) {
        int i5 = 0;
        if (this.f22163f) {
            a[] aVarArr = this.f22162e;
            a aVar = aVarArr[0];
            double d6 = aVar.f22169c;
            if (d5 < d6) {
                double d7 = d5 - d6;
                if (aVar.f22184r) {
                    if (i4 == 0) {
                        return (d7 * this.f22162e[0].d(d6)) + aVar.f(d6);
                    }
                    return (d7 * this.f22162e[0].e(d6)) + aVar.g(d6);
                }
                aVar.k(d6);
                if (i4 == 0) {
                    return (d7 * this.f22162e[0].b()) + this.f22162e[0].h();
                }
                return (d7 * this.f22162e[0].c()) + this.f22162e[0].i();
            }
            if (d5 > aVarArr[aVarArr.length - 1].f22170d) {
                double d10 = aVarArr[aVarArr.length - 1].f22170d;
                double d11 = d5 - d10;
                int length = aVarArr.length - 1;
                if (i4 == 0) {
                    return (d11 * this.f22162e[length].d(d10)) + aVarArr[length].f(d10);
                }
                return (d11 * this.f22162e[length].e(d10)) + aVarArr[length].g(d10);
            }
        } else {
            a[] aVarArr2 = this.f22162e;
            double d12 = aVarArr2[0].f22169c;
            if (d5 < d12) {
                d5 = d12;
            } else if (d5 > aVarArr2[aVarArr2.length - 1].f22170d) {
                d5 = aVarArr2[aVarArr2.length - 1].f22170d;
            }
        }
        while (true) {
            a[] aVarArr3 = this.f22162e;
            if (i5 >= aVarArr3.length) {
                return Double.NaN;
            }
            a aVar2 = aVarArr3[i5];
            if (d5 <= aVar2.f22170d) {
                if (aVar2.f22184r) {
                    return i4 == 0 ? aVar2.f(d5) : aVar2.g(d5);
                }
                aVar2.k(d5);
                return i4 == 0 ? this.f22162e[i5].h() : this.f22162e[i5].i();
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public void d(double d5, double[] dArr) {
        if (this.f22163f) {
            a[] aVarArr = this.f22162e;
            a aVar = aVarArr[0];
            double d6 = aVar.f22169c;
            if (d5 < d6) {
                double d7 = d5 - d6;
                if (aVar.f22184r) {
                    dArr[0] = (this.f22162e[0].d(d6) * d7) + aVar.f(d6);
                    dArr[1] = (d7 * this.f22162e[0].e(d6)) + this.f22162e[0].g(d6);
                    return;
                }
                aVar.k(d6);
                dArr[0] = (this.f22162e[0].b() * d7) + this.f22162e[0].h();
                dArr[1] = (d7 * this.f22162e[0].c()) + this.f22162e[0].i();
                return;
            }
            if (d5 > aVarArr[aVarArr.length - 1].f22170d) {
                double d10 = aVarArr[aVarArr.length - 1].f22170d;
                double d11 = d5 - d10;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.f22184r) {
                    dArr[0] = (this.f22162e[length].d(d10) * d11) + aVar2.f(d10);
                    dArr[1] = (d11 * this.f22162e[length].e(d10)) + this.f22162e[length].g(d10);
                    return;
                }
                aVar2.k(d5);
                dArr[0] = (this.f22162e[length].b() * d11) + this.f22162e[length].h();
                dArr[1] = (d11 * this.f22162e[length].c()) + this.f22162e[length].i();
                return;
            }
        } else {
            a[] aVarArr2 = this.f22162e;
            double d12 = aVarArr2[0].f22169c;
            if (d5 < d12) {
                d5 = d12;
            }
            if (d5 > aVarArr2[aVarArr2.length - 1].f22170d) {
                d5 = aVarArr2[aVarArr2.length - 1].f22170d;
            }
        }
        int i4 = 0;
        while (true) {
            a[] aVarArr3 = this.f22162e;
            if (i4 >= aVarArr3.length) {
                return;
            }
            a aVar3 = aVarArr3[i4];
            if (d5 <= aVar3.f22170d) {
                if (aVar3.f22184r) {
                    dArr[0] = aVar3.f(d5);
                    dArr[1] = this.f22162e[i4].g(d5);
                    return;
                } else {
                    aVar3.k(d5);
                    dArr[0] = this.f22162e[i4].h();
                    dArr[1] = this.f22162e[i4].i();
                    return;
                }
            }
            i4++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public void e(double d5, float[] fArr) {
        if (this.f22163f) {
            a[] aVarArr = this.f22162e;
            a aVar = aVarArr[0];
            double d6 = aVar.f22169c;
            if (d5 < d6) {
                double d7 = d5 - d6;
                if (aVar.f22184r) {
                    fArr[0] = (float) ((this.f22162e[0].d(d6) * d7) + aVar.f(d6));
                    fArr[1] = (float) ((d7 * this.f22162e[0].e(d6)) + this.f22162e[0].g(d6));
                    return;
                }
                aVar.k(d6);
                fArr[0] = (float) ((this.f22162e[0].b() * d7) + this.f22162e[0].h());
                fArr[1] = (float) ((d7 * this.f22162e[0].c()) + this.f22162e[0].i());
                return;
            }
            if (d5 > aVarArr[aVarArr.length - 1].f22170d) {
                double d10 = aVarArr[aVarArr.length - 1].f22170d;
                double d11 = d5 - d10;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (!aVar2.f22184r) {
                    aVar2.k(d5);
                    fArr[0] = (float) this.f22162e[length].h();
                    fArr[1] = (float) this.f22162e[length].i();
                    return;
                } else {
                    fArr[0] = (float) ((this.f22162e[length].d(d10) * d11) + aVar2.f(d10));
                    fArr[1] = (float) ((d11 * this.f22162e[length].e(d10)) + this.f22162e[length].g(d10));
                    return;
                }
            }
        } else {
            a[] aVarArr2 = this.f22162e;
            double d12 = aVarArr2[0].f22169c;
            if (d5 < d12) {
                d5 = d12;
            } else if (d5 > aVarArr2[aVarArr2.length - 1].f22170d) {
                d5 = aVarArr2[aVarArr2.length - 1].f22170d;
            }
        }
        int i4 = 0;
        while (true) {
            a[] aVarArr3 = this.f22162e;
            if (i4 >= aVarArr3.length) {
                return;
            }
            a aVar3 = aVarArr3[i4];
            if (d5 <= aVar3.f22170d) {
                if (aVar3.f22184r) {
                    fArr[0] = (float) aVar3.f(d5);
                    fArr[1] = (float) this.f22162e[i4].g(d5);
                    return;
                } else {
                    aVar3.k(d5);
                    fArr[0] = (float) this.f22162e[i4].h();
                    fArr[1] = (float) this.f22162e[i4].i();
                    return;
                }
            }
            i4++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double f(double d5, int i4) {
        a[] aVarArr = this.f22162e;
        int i5 = 0;
        double d6 = aVarArr[0].f22169c;
        if (d5 < d6) {
            d5 = d6;
        }
        if (d5 > aVarArr[aVarArr.length - 1].f22170d) {
            d5 = aVarArr[aVarArr.length - 1].f22170d;
        }
        while (true) {
            a[] aVarArr2 = this.f22162e;
            if (i5 >= aVarArr2.length) {
                return Double.NaN;
            }
            a aVar = aVarArr2[i5];
            if (d5 <= aVar.f22170d) {
                if (aVar.f22184r) {
                    return i4 == 0 ? aVar.d(d5) : aVar.e(d5);
                }
                aVar.k(d5);
                return i4 == 0 ? this.f22162e[i5].b() : this.f22162e[i5].c();
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public void g(double d5, double[] dArr) {
        a[] aVarArr = this.f22162e;
        double d6 = aVarArr[0].f22169c;
        if (d5 < d6) {
            d5 = d6;
        } else if (d5 > aVarArr[aVarArr.length - 1].f22170d) {
            d5 = aVarArr[aVarArr.length - 1].f22170d;
        }
        int i4 = 0;
        while (true) {
            a[] aVarArr2 = this.f22162e;
            if (i4 >= aVarArr2.length) {
                return;
            }
            a aVar = aVarArr2[i4];
            if (d5 <= aVar.f22170d) {
                if (aVar.f22184r) {
                    dArr[0] = aVar.d(d5);
                    dArr[1] = this.f22162e[i4].e(d5);
                    return;
                } else {
                    aVar.k(d5);
                    dArr[0] = this.f22162e[i4].b();
                    dArr[1] = this.f22162e[i4].c();
                    return;
                }
            }
            i4++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double[] h() {
        return this.f22161d;
    }
}
