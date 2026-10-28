package androidx.constraintlayout.core.motion.utils;

/* compiled from: LinearCurveFit.java */
/* loaded from: classes.dex */
public class k extends c {

    /* renamed from: i, reason: collision with root package name */
    private static final String f22274i = "LinearCurveFit";

    /* renamed from: d, reason: collision with root package name */
    private double[] f22275d;

    /* renamed from: e, reason: collision with root package name */
    private double[][] f22276e;

    /* renamed from: f, reason: collision with root package name */
    private double f22277f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22278g = true;

    /* renamed from: h, reason: collision with root package name */
    double[] f22279h;

    public k(double[] dArr, double[][] dArr2) {
        this.f22277f = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f22279h = new double[length2];
        this.f22275d = dArr;
        this.f22276e = dArr2;
        if (length2 <= 2) {
            return;
        }
        int i4 = 0;
        double d5 = 0.0d;
        while (true) {
            double d6 = d5;
            if (i4 >= dArr.length) {
                this.f22277f = com.google.firebase.remoteconfig.p.f60679p;
                return;
            }
            double d7 = dArr2[i4][0];
            if (i4 > 0) {
                Math.hypot(d7 - d5, d7 - d6);
            }
            i4++;
            d5 = d7;
        }
    }

    private double i(double d5) {
        if (Double.isNaN(this.f22277f)) {
            return com.google.firebase.remoteconfig.p.f60679p;
        }
        double[] dArr = this.f22275d;
        int length = dArr.length;
        if (d5 <= dArr[0]) {
            return com.google.firebase.remoteconfig.p.f60679p;
        }
        int i4 = length - 1;
        if (d5 >= dArr[i4]) {
            return this.f22277f;
        }
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d10 = 0.0d;
        int i5 = 0;
        while (i5 < i4) {
            double[] dArr2 = this.f22276e[i5];
            double d11 = dArr2[0];
            double d12 = dArr2[1];
            if (i5 > 0) {
                d6 += Math.hypot(d11 - d7, d12 - d10);
            }
            double[] dArr3 = this.f22275d;
            double d13 = dArr3[i5];
            if (d5 == d13) {
                return d6;
            }
            int i6 = i5 + 1;
            double d14 = dArr3[i6];
            if (d5 < d14) {
                double d15 = (d5 - d13) / (d14 - d13);
                double[][] dArr4 = this.f22276e;
                double[] dArr5 = dArr4[i5];
                double d16 = dArr5[0];
                double[] dArr6 = dArr4[i6];
                double d17 = dArr6[0];
                double d18 = 1.0d - d15;
                return Math.hypot(d12 - ((dArr6[1] * d15) + (dArr5[1] * d18)), d11 - ((d17 * d15) + (d16 * d18))) + d6;
            }
            i5 = i6;
            d7 = d11;
            d10 = d12;
        }
        return com.google.firebase.remoteconfig.p.f60679p;
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double c(double d5, int i4) {
        double d6;
        double d7;
        double f4;
        double[] dArr = this.f22275d;
        int length = dArr.length;
        int i5 = 0;
        if (this.f22278g) {
            double d10 = dArr[0];
            if (d5 <= d10) {
                d6 = this.f22276e[0][i4];
                d7 = d5 - d10;
                f4 = f(d10, i4);
            } else {
                int i6 = length - 1;
                double d11 = dArr[i6];
                if (d5 >= d11) {
                    d6 = this.f22276e[i6][i4];
                    d7 = d5 - d11;
                    f4 = f(d11, i4);
                }
            }
            return (f4 * d7) + d6;
        }
        if (d5 <= dArr[0]) {
            return this.f22276e[0][i4];
        }
        int i7 = length - 1;
        if (d5 >= dArr[i7]) {
            return this.f22276e[i7][i4];
        }
        while (i5 < length - 1) {
            double[] dArr2 = this.f22275d;
            double d12 = dArr2[i5];
            if (d5 == d12) {
                return this.f22276e[i5][i4];
            }
            int i10 = i5 + 1;
            double d13 = dArr2[i10];
            if (d5 < d13) {
                double d14 = (d5 - d12) / (d13 - d12);
                double[][] dArr3 = this.f22276e;
                return (dArr3[i10][i4] * d14) + ((1.0d - d14) * dArr3[i5][i4]);
            }
            i5 = i10;
        }
        return com.google.firebase.remoteconfig.p.f60679p;
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public void d(double d5, double[] dArr) {
        double[] dArr2 = this.f22275d;
        int length = dArr2.length;
        int i4 = 0;
        int length2 = this.f22276e[0].length;
        if (this.f22278g) {
            double d6 = dArr2[0];
            if (d5 <= d6) {
                g(d6, this.f22279h);
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = ((d5 - this.f22275d[0]) * this.f22279h[i5]) + this.f22276e[0][i5];
                }
                return;
            }
            int i6 = length - 1;
            double d7 = dArr2[i6];
            if (d5 >= d7) {
                g(d7, this.f22279h);
                while (i4 < length2) {
                    dArr[i4] = ((d5 - this.f22275d[i6]) * this.f22279h[i4]) + this.f22276e[i6][i4];
                    i4++;
                }
                return;
            }
        } else {
            if (d5 <= dArr2[0]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f22276e[0][i7];
                }
                return;
            }
            int i10 = length - 1;
            if (d5 >= dArr2[i10]) {
                while (i4 < length2) {
                    dArr[i4] = this.f22276e[i10][i4];
                    i4++;
                }
                return;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            if (d5 == this.f22275d[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f22276e[i11][i12];
                }
            }
            double[] dArr3 = this.f22275d;
            int i13 = i11 + 1;
            double d10 = dArr3[i13];
            if (d5 < d10) {
                double d11 = dArr3[i11];
                double d12 = (d5 - d11) / (d10 - d11);
                while (i4 < length2) {
                    double[][] dArr4 = this.f22276e;
                    dArr[i4] = (dArr4[i13][i4] * d12) + ((1.0d - d12) * dArr4[i11][i4]);
                    i4++;
                }
                return;
            }
            i11 = i13;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public void e(double d5, float[] fArr) {
        double[] dArr = this.f22275d;
        int length = dArr.length;
        int i4 = 0;
        int length2 = this.f22276e[0].length;
        if (this.f22278g) {
            double d6 = dArr[0];
            if (d5 <= d6) {
                g(d6, this.f22279h);
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) (((d5 - this.f22275d[0]) * this.f22279h[i5]) + this.f22276e[0][i5]);
                }
                return;
            }
            int i6 = length - 1;
            double d7 = dArr[i6];
            if (d5 >= d7) {
                g(d7, this.f22279h);
                while (i4 < length2) {
                    fArr[i4] = (float) (((d5 - this.f22275d[i6]) * this.f22279h[i4]) + this.f22276e[i6][i4]);
                    i4++;
                }
                return;
            }
        } else {
            if (d5 <= dArr[0]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f22276e[0][i7];
                }
                return;
            }
            int i10 = length - 1;
            if (d5 >= dArr[i10]) {
                while (i4 < length2) {
                    fArr[i4] = (float) this.f22276e[i10][i4];
                    i4++;
                }
                return;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            if (d5 == this.f22275d[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) this.f22276e[i11][i12];
                }
            }
            double[] dArr2 = this.f22275d;
            int i13 = i11 + 1;
            double d10 = dArr2[i13];
            if (d5 < d10) {
                double d11 = dArr2[i11];
                double d12 = (d5 - d11) / (d10 - d11);
                while (i4 < length2) {
                    double[][] dArr3 = this.f22276e;
                    fArr[i4] = (float) ((dArr3[i13][i4] * d12) + ((1.0d - d12) * dArr3[i11][i4]));
                    i4++;
                }
                return;
            }
            i11 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0012, code lost:
    
        if (r8 >= r3) goto L4;
     */
    @Override // androidx.constraintlayout.core.motion.utils.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double f(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.f22275d
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto La
        L15:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L35
            double[] r0 = r7.f22275d
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f22276e
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L33:
            r2 = r3
            goto L15
        L35:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.k.f(double, int):double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
    
        if (r13 >= r4) goto L4;
     */
    @Override // androidx.constraintlayout.core.motion.utils.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.f22275d
            int r1 = r0.length
            double[][] r2 = r12.f22276e
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r13 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = r3
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L41
            double[] r4 = r12.f22275d
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r13 = r4[r0]
            double r6 = r6 - r13
        L2c:
            if (r3 >= r2) goto L41
            double[][] r13 = r12.f22276e
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2c
        L3f:
            r0 = r5
            goto L1b
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.k.g(double, double[]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double[] h() {
        return this.f22275d;
    }
}
