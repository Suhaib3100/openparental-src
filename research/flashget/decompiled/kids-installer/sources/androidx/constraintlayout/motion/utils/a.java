package androidx.constraintlayout.motion.utils;

import com.google.firebase.remoteconfig.p;
import java.util.Arrays;

/* compiled from: ArcCurveFit.java */
/* loaded from: classes2.dex */
class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final int f1583f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f1584g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f1585h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final int f1586i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static final int f1587j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f1588k = 2;

    /* renamed from: l, reason: collision with root package name */
    private static final int f1589l = 3;

    /* renamed from: d, reason: collision with root package name */
    private final double[] f1590d;

    /* renamed from: e, reason: collision with root package name */
    C0017a[] f1591e;

    /* compiled from: ArcCurveFit.java */
    /* renamed from: androidx.constraintlayout.motion.utils.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0017a {

        /* renamed from: s, reason: collision with root package name */
        private static final String f1592s = "Arc";

        /* renamed from: t, reason: collision with root package name */
        private static double[] f1593t = new double[91];

        /* renamed from: u, reason: collision with root package name */
        private static final double f1594u = 0.001d;

        /* renamed from: a, reason: collision with root package name */
        double[] f1595a;

        /* renamed from: b, reason: collision with root package name */
        double f1596b;

        /* renamed from: c, reason: collision with root package name */
        double f1597c;

        /* renamed from: d, reason: collision with root package name */
        double f1598d;

        /* renamed from: e, reason: collision with root package name */
        double f1599e;

        /* renamed from: f, reason: collision with root package name */
        double f1600f;

        /* renamed from: g, reason: collision with root package name */
        double f1601g;

        /* renamed from: h, reason: collision with root package name */
        double f1602h;

        /* renamed from: i, reason: collision with root package name */
        double f1603i;

        /* renamed from: j, reason: collision with root package name */
        double f1604j;

        /* renamed from: k, reason: collision with root package name */
        double f1605k;

        /* renamed from: l, reason: collision with root package name */
        double f1606l;

        /* renamed from: m, reason: collision with root package name */
        double f1607m;

        /* renamed from: n, reason: collision with root package name */
        double f1608n;

        /* renamed from: o, reason: collision with root package name */
        double f1609o;

        /* renamed from: p, reason: collision with root package name */
        double f1610p;

        /* renamed from: q, reason: collision with root package name */
        boolean f1611q;

        /* renamed from: r, reason: collision with root package name */
        boolean f1612r;

        C0017a(int i5, double d6, double d7, double d8, double d9, double d10, double d11) {
            this.f1612r = false;
            this.f1611q = i5 == 1;
            this.f1597c = d6;
            this.f1598d = d7;
            this.f1603i = 1.0d / (d7 - d6);
            if (3 == i5) {
                this.f1612r = true;
            }
            double d12 = d10 - d8;
            double d13 = d11 - d9;
            if (!this.f1612r && Math.abs(d12) >= f1594u && Math.abs(d13) >= f1594u) {
                this.f1595a = new double[101];
                boolean z5 = this.f1611q;
                this.f1604j = d12 * (z5 ? -1 : 1);
                this.f1605k = d13 * (z5 ? 1 : -1);
                this.f1606l = z5 ? d10 : d8;
                this.f1607m = z5 ? d9 : d11;
                a(d8, d9, d10, d11);
                this.f1608n = this.f1596b * this.f1603i;
                return;
            }
            this.f1612r = true;
            this.f1599e = d8;
            this.f1600f = d10;
            this.f1601g = d9;
            this.f1602h = d11;
            double hypot = Math.hypot(d13, d12);
            this.f1596b = hypot;
            this.f1608n = hypot * this.f1603i;
            double d14 = this.f1598d;
            double d15 = this.f1597c;
            this.f1606l = d12 / (d14 - d15);
            this.f1607m = d13 / (d14 - d15);
        }

        private void a(double d6, double d7, double d8, double d9) {
            double d10;
            double d11 = d8 - d6;
            double d12 = d7 - d9;
            int i5 = 0;
            double d13 = p.f18289o;
            double d14 = p.f18289o;
            double d15 = p.f18289o;
            while (true) {
                if (i5 >= f1593t.length) {
                    break;
                }
                double d16 = d13;
                double radians = Math.toRadians((i5 * 90.0d) / (r15.length - 1));
                double sin = Math.sin(radians) * d11;
                double cos = Math.cos(radians) * d12;
                if (i5 > 0) {
                    d10 = Math.hypot(sin - d14, cos - d15) + d16;
                    f1593t[i5] = d10;
                } else {
                    d10 = d16;
                }
                i5++;
                d15 = cos;
                d13 = d10;
                d14 = sin;
            }
            double d17 = d13;
            this.f1596b = d17;
            int i6 = 0;
            while (true) {
                double[] dArr = f1593t;
                if (i6 >= dArr.length) {
                    break;
                }
                dArr[i6] = dArr[i6] / d17;
                i6++;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= this.f1595a.length) {
                    return;
                }
                double length = i7 / (r1.length - 1);
                int binarySearch = Arrays.binarySearch(f1593t, length);
                if (binarySearch >= 0) {
                    this.f1595a[i7] = binarySearch / (f1593t.length - 1);
                } else if (binarySearch == -1) {
                    this.f1595a[i7] = 0.0d;
                } else {
                    int i8 = -binarySearch;
                    int i9 = i8 - 2;
                    double[] dArr2 = f1593t;
                    double d18 = dArr2[i9];
                    this.f1595a[i7] = (((length - d18) / (dArr2[i8 - 1] - d18)) + i9) / (dArr2.length - 1);
                }
                i7++;
            }
        }

        double b() {
            double d6 = this.f1604j * this.f1610p;
            double hypot = this.f1608n / Math.hypot(d6, (-this.f1605k) * this.f1609o);
            if (this.f1611q) {
                d6 = -d6;
            }
            return d6 * hypot;
        }

        double c() {
            double d6 = this.f1604j * this.f1610p;
            double d7 = (-this.f1605k) * this.f1609o;
            double hypot = this.f1608n / Math.hypot(d6, d7);
            return this.f1611q ? (-d7) * hypot : d7 * hypot;
        }

        public double d(double d6) {
            return this.f1606l;
        }

        public double e(double d6) {
            return this.f1607m;
        }

        public double f(double d6) {
            double d7 = (d6 - this.f1597c) * this.f1603i;
            double d8 = this.f1599e;
            return ((this.f1600f - d8) * d7) + d8;
        }

        public double g(double d6) {
            double d7 = (d6 - this.f1597c) * this.f1603i;
            double d8 = this.f1601g;
            return ((this.f1602h - d8) * d7) + d8;
        }

        double h() {
            return (this.f1604j * this.f1609o) + this.f1606l;
        }

        double i() {
            return (this.f1605k * this.f1610p) + this.f1607m;
        }

        double j(double d6) {
            if (d6 <= p.f18289o) {
                return p.f18289o;
            }
            if (d6 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f1595a;
            double length = d6 * (dArr.length - 1);
            int i5 = (int) length;
            double d7 = length - i5;
            double d8 = dArr[i5];
            return ((dArr[i5 + 1] - d8) * d7) + d8;
        }

        void k(double d6) {
            double j5 = j((this.f1611q ? this.f1598d - d6 : d6 - this.f1597c) * this.f1603i) * 1.5707963267948966d;
            this.f1609o = Math.sin(j5);
            this.f1610p = Math.cos(j5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r5 == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.f1590d = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            androidx.constraintlayout.motion.utils.a$a[] r2 = new androidx.constraintlayout.motion.utils.a.C0017a[r2]
            r0.f1591e = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L14:
            androidx.constraintlayout.motion.utils.a$a[] r7 = r0.f1591e
            int r8 = r7.length
            if (r4 >= r8) goto L4d
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L2d
            if (r8 == r3) goto L2a
            r10 = 2
            if (r8 == r10) goto L28
            if (r8 == r9) goto L26
            goto L2e
        L26:
            if (r5 != r3) goto L2a
        L28:
            r5 = r10
            goto L2b
        L2a:
            r5 = r3
        L2b:
            r6 = r5
            goto L2e
        L2d:
            r6 = r9
        L2e:
            androidx.constraintlayout.motion.utils.a$a r22 = new androidx.constraintlayout.motion.utils.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r2]
            r16 = r8[r3]
            r8 = r27[r23]
            r18 = r8[r2]
            r20 = r8[r3]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L14
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.utils.a.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.motion.utils.b
    public double c(double d6, int i5) {
        C0017a[] c0017aArr = this.f1591e;
        int i6 = 0;
        double d7 = c0017aArr[0].f1597c;
        if (d6 < d7) {
            d6 = d7;
        } else if (d6 > c0017aArr[c0017aArr.length - 1].f1598d) {
            d6 = c0017aArr[c0017aArr.length - 1].f1598d;
        }
        while (true) {
            C0017a[] c0017aArr2 = this.f1591e;
            if (i6 >= c0017aArr2.length) {
                return Double.NaN;
            }
            C0017a c0017a = c0017aArr2[i6];
            if (d6 <= c0017a.f1598d) {
                if (c0017a.f1612r) {
                    return i5 == 0 ? c0017a.f(d6) : c0017a.g(d6);
                }
                c0017a.k(d6);
                return i5 == 0 ? this.f1591e[i6].h() : this.f1591e[i6].i();
            }
            i6++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.b
    public void d(double d6, double[] dArr) {
        C0017a[] c0017aArr = this.f1591e;
        double d7 = c0017aArr[0].f1597c;
        if (d6 < d7) {
            d6 = d7;
        }
        if (d6 > c0017aArr[c0017aArr.length - 1].f1598d) {
            d6 = c0017aArr[c0017aArr.length - 1].f1598d;
        }
        int i5 = 0;
        while (true) {
            C0017a[] c0017aArr2 = this.f1591e;
            if (i5 >= c0017aArr2.length) {
                return;
            }
            C0017a c0017a = c0017aArr2[i5];
            if (d6 <= c0017a.f1598d) {
                if (c0017a.f1612r) {
                    dArr[0] = c0017a.f(d6);
                    dArr[1] = this.f1591e[i5].g(d6);
                    return;
                } else {
                    c0017a.k(d6);
                    dArr[0] = this.f1591e[i5].h();
                    dArr[1] = this.f1591e[i5].i();
                    return;
                }
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.b
    public void e(double d6, float[] fArr) {
        C0017a[] c0017aArr = this.f1591e;
        double d7 = c0017aArr[0].f1597c;
        if (d6 < d7) {
            d6 = d7;
        } else if (d6 > c0017aArr[c0017aArr.length - 1].f1598d) {
            d6 = c0017aArr[c0017aArr.length - 1].f1598d;
        }
        int i5 = 0;
        while (true) {
            C0017a[] c0017aArr2 = this.f1591e;
            if (i5 >= c0017aArr2.length) {
                return;
            }
            C0017a c0017a = c0017aArr2[i5];
            if (d6 <= c0017a.f1598d) {
                if (c0017a.f1612r) {
                    fArr[0] = (float) c0017a.f(d6);
                    fArr[1] = (float) this.f1591e[i5].g(d6);
                    return;
                } else {
                    c0017a.k(d6);
                    fArr[0] = (float) this.f1591e[i5].h();
                    fArr[1] = (float) this.f1591e[i5].i();
                    return;
                }
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.b
    public double f(double d6, int i5) {
        C0017a[] c0017aArr = this.f1591e;
        int i6 = 0;
        double d7 = c0017aArr[0].f1597c;
        if (d6 < d7) {
            d6 = d7;
        }
        if (d6 > c0017aArr[c0017aArr.length - 1].f1598d) {
            d6 = c0017aArr[c0017aArr.length - 1].f1598d;
        }
        while (true) {
            C0017a[] c0017aArr2 = this.f1591e;
            if (i6 >= c0017aArr2.length) {
                return Double.NaN;
            }
            C0017a c0017a = c0017aArr2[i6];
            if (d6 <= c0017a.f1598d) {
                if (c0017a.f1612r) {
                    return i5 == 0 ? c0017a.d(d6) : c0017a.e(d6);
                }
                c0017a.k(d6);
                return i5 == 0 ? this.f1591e[i6].b() : this.f1591e[i6].c();
            }
            i6++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.b
    public void g(double d6, double[] dArr) {
        C0017a[] c0017aArr = this.f1591e;
        double d7 = c0017aArr[0].f1597c;
        if (d6 < d7) {
            d6 = d7;
        } else if (d6 > c0017aArr[c0017aArr.length - 1].f1598d) {
            d6 = c0017aArr[c0017aArr.length - 1].f1598d;
        }
        int i5 = 0;
        while (true) {
            C0017a[] c0017aArr2 = this.f1591e;
            if (i5 >= c0017aArr2.length) {
                return;
            }
            C0017a c0017a = c0017aArr2[i5];
            if (d6 <= c0017a.f1598d) {
                if (c0017a.f1612r) {
                    dArr[0] = c0017a.d(d6);
                    dArr[1] = this.f1591e[i5].e(d6);
                    return;
                } else {
                    c0017a.k(d6);
                    dArr[0] = this.f1591e[i5].b();
                    dArr[1] = this.f1591e[i5].c();
                    return;
                }
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.b
    public double[] h() {
        return this.f1590d;
    }
}
