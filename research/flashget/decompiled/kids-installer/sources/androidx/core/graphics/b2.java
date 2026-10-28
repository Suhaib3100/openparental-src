package androidx.core.graphics;

import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: PathParser.java */
/* loaded from: classes.dex */
public class b2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4688a = "PathParser";

    /* compiled from: PathParser.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f4689a;

        /* renamed from: b, reason: collision with root package name */
        boolean f4690b;

        a() {
        }
    }

    private b2() {
    }

    private static void a(ArrayList<b> arrayList, char c6, float[] fArr) {
        arrayList.add(new b(c6, fArr));
    }

    public static boolean b(@androidx.annotation.q0 b[] bVarArr, @androidx.annotation.q0 b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i5 = 0; i5 < bVarArr.length; i5++) {
            b bVar = bVarArr[i5];
            char c6 = bVar.f4691a;
            b bVar2 = bVarArr2[i5];
            if (c6 != bVar2.f4691a || bVar.f4692b.length != bVar2.f4692b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i5, int i6) {
        if (i5 > i6) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i5 < 0 || i5 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i7 = i6 - i5;
        int min = Math.min(i7, length - i5);
        float[] fArr2 = new float[i7];
        System.arraycopy(fArr, i5, fArr2, 0, min);
        return fArr2;
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = 1;
        int i6 = 0;
        while (i5 < str.length()) {
            int j5 = j(str, i5);
            String trim = str.substring(i6, j5).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), h(trim));
            }
            i6 = j5;
            i5 = j5 + 1;
        }
        if (i5 - i6 == 1 && i6 < str.length()) {
            a(arrayList, str.charAt(i6), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] d6 = d(str);
        if (d6 == null) {
            return null;
        }
        try {
            b.e(d6, path);
            return path;
        } catch (RuntimeException e6) {
            throw new RuntimeException(androidx.constraintlayout.motion.widget.g.a("Error in parsing ", str), e6);
        }
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i5 = 0; i5 < bVarArr.length; i5++) {
            bVarArr2[i5] = new b(bVarArr[i5]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[LOOP:0: B:2:0x0007->B:14:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(java.lang.String r8, int r9, androidx.core.graphics.b2.a r10) {
        /*
            r0 = 0
            r10.f4690b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L37
        L27:
            r10.f4690b = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.f4690b = r7
            goto L35
        L31:
            r2 = r0
            goto L37
        L33:
            r2 = r7
            goto L37
        L35:
            r2 = r0
            r4 = r7
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.f4689a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.b2.g(java.lang.String, int, androidx.core.graphics.b2$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i5 = 1;
            int i6 = 0;
            while (i5 < length) {
                g(str, i5, aVar);
                int i7 = aVar.f4689a;
                if (i5 < i7) {
                    fArr[i6] = Float.parseFloat(str.substring(i5, i7));
                    i6++;
                }
                i5 = aVar.f4690b ? i7 : i7 + 1;
            }
            return c(fArr, 0, i6);
        } catch (NumberFormatException e6) {
            throw new RuntimeException(androidx.constraintlayout.solver.widgets.analyzer.e.a("error in parsing \"", str, "\""), e6);
        }
    }

    public static boolean i(b[] bVarArr, b[] bVarArr2, b[] bVarArr3, float f6) {
        if (bVarArr == null || bVarArr2 == null || bVarArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (bVarArr.length != bVarArr2.length || bVarArr2.length != bVarArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!b(bVarArr2, bVarArr3)) {
            return false;
        }
        for (int i5 = 0; i5 < bVarArr.length; i5++) {
            bVarArr[i5].d(bVarArr2[i5], bVarArr3[i5], f6);
        }
        return true;
    }

    private static int j(String str, int i5) {
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            if ((charAt - 'Z') * (charAt - 'A') > 0) {
                if ((charAt - 'z') * (charAt - 'a') > 0) {
                    continue;
                    i5++;
                }
            }
            if (charAt != 'e' && charAt != 'E') {
                return i5;
            }
            i5++;
        }
        return i5;
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int i5 = 0; i5 < bVarArr2.length; i5++) {
            bVarArr[i5].f4691a = bVarArr2[i5].f4691a;
            int i6 = 0;
            while (true) {
                float[] fArr = bVarArr2[i5].f4692b;
                if (i6 < fArr.length) {
                    bVarArr[i5].f4692b[i6] = fArr[i6];
                    i6++;
                }
            }
        }
    }

    /* compiled from: PathParser.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public char f4691a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f4692b;

        b(char c6, float[] fArr) {
            this.f4691a = c6;
            this.f4692b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c6, char c7, float[] fArr2) {
            int i5;
            int i6;
            int i7;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            char c8 = c7;
            boolean z5 = false;
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[2];
            float f17 = fArr[3];
            float f18 = fArr[4];
            float f19 = fArr[5];
            switch (c8) {
                case 'A':
                case 'a':
                    i5 = 7;
                    i6 = i5;
                    break;
                case 'C':
                case 'c':
                    i5 = 6;
                    i6 = i5;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i6 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i6 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i6 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f18, f19);
                    f14 = f18;
                    f16 = f14;
                    f15 = f19;
                    f17 = f15;
                    i6 = 2;
                    break;
            }
            float f20 = f14;
            float f21 = f15;
            float f22 = f18;
            float f23 = f19;
            int i8 = 0;
            char c9 = c6;
            while (i8 < fArr2.length) {
                if (c8 != 'A') {
                    if (c8 == 'C') {
                        i7 = i8;
                        int i9 = i7 + 2;
                        int i10 = i7 + 3;
                        int i11 = i7 + 4;
                        int i12 = i7 + 5;
                        path.cubicTo(fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i9], fArr2[i10], fArr2[i11], fArr2[i12]);
                        f20 = fArr2[i11];
                        float f24 = fArr2[i12];
                        float f25 = fArr2[i9];
                        float f26 = fArr2[i10];
                        f21 = f24;
                        f17 = f26;
                        f16 = f25;
                    } else if (c8 == 'H') {
                        i7 = i8;
                        int i13 = i7 + 0;
                        path.lineTo(fArr2[i13], f21);
                        f20 = fArr2[i13];
                    } else if (c8 == 'Q') {
                        i7 = i8;
                        int i14 = i7 + 0;
                        int i15 = i7 + 1;
                        int i16 = i7 + 2;
                        int i17 = i7 + 3;
                        path.quadTo(fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                        float f27 = fArr2[i14];
                        float f28 = fArr2[i15];
                        f20 = fArr2[i16];
                        f21 = fArr2[i17];
                        f16 = f27;
                        f17 = f28;
                    } else if (c8 == 'V') {
                        i7 = i8;
                        int i18 = i7 + 0;
                        path.lineTo(f20, fArr2[i18]);
                        f21 = fArr2[i18];
                    } else if (c8 != 'a') {
                        if (c8 != 'c') {
                            if (c8 == 'h') {
                                int i19 = i8 + 0;
                                path.rLineTo(fArr2[i19], 0.0f);
                                f20 += fArr2[i19];
                            } else if (c8 != 'q') {
                                if (c8 == 'v') {
                                    int i20 = i8 + 0;
                                    path.rLineTo(0.0f, fArr2[i20]);
                                    f9 = fArr2[i20];
                                } else if (c8 == 'L') {
                                    int i21 = i8 + 0;
                                    int i22 = i8 + 1;
                                    path.lineTo(fArr2[i21], fArr2[i22]);
                                    f20 = fArr2[i21];
                                    f21 = fArr2[i22];
                                } else if (c8 == 'M') {
                                    f20 = fArr2[i8 + 0];
                                    f21 = fArr2[i8 + 1];
                                    if (i8 > 0) {
                                        path.lineTo(f20, f21);
                                    } else {
                                        path.moveTo(f20, f21);
                                        i7 = i8;
                                        f23 = f21;
                                        f22 = f20;
                                    }
                                } else if (c8 == 'S') {
                                    if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                        f20 = (f20 * 2.0f) - f16;
                                        f21 = (f21 * 2.0f) - f17;
                                    }
                                    float f29 = f21;
                                    int i23 = i8 + 0;
                                    int i24 = i8 + 1;
                                    int i25 = i8 + 2;
                                    int i26 = i8 + 3;
                                    path.cubicTo(f20, f29, fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                                    f6 = fArr2[i23];
                                    f7 = fArr2[i24];
                                    f20 = fArr2[i25];
                                    f21 = fArr2[i26];
                                    f16 = f6;
                                    f17 = f7;
                                } else if (c8 == 'T') {
                                    if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                        f20 = (f20 * 2.0f) - f16;
                                        f21 = (f21 * 2.0f) - f17;
                                    }
                                    int i27 = i8 + 0;
                                    int i28 = i8 + 1;
                                    path.quadTo(f20, f21, fArr2[i27], fArr2[i28]);
                                    float f30 = fArr2[i27];
                                    float f31 = fArr2[i28];
                                    i7 = i8;
                                    f17 = f21;
                                    f16 = f20;
                                    f20 = f30;
                                    f21 = f31;
                                } else if (c8 == 'l') {
                                    int i29 = i8 + 0;
                                    int i30 = i8 + 1;
                                    path.rLineTo(fArr2[i29], fArr2[i30]);
                                    f20 += fArr2[i29];
                                    f9 = fArr2[i30];
                                } else if (c8 == 'm') {
                                    float f32 = fArr2[i8 + 0];
                                    f20 += f32;
                                    float f33 = fArr2[i8 + 1];
                                    f21 += f33;
                                    if (i8 > 0) {
                                        path.rLineTo(f32, f33);
                                    } else {
                                        path.rMoveTo(f32, f33);
                                        i7 = i8;
                                        f23 = f21;
                                        f22 = f20;
                                    }
                                } else if (c8 == 's') {
                                    if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                        float f34 = f20 - f16;
                                        f10 = f21 - f17;
                                        f11 = f34;
                                    } else {
                                        f11 = 0.0f;
                                        f10 = 0.0f;
                                    }
                                    int i31 = i8 + 0;
                                    int i32 = i8 + 1;
                                    int i33 = i8 + 2;
                                    int i34 = i8 + 3;
                                    path.rCubicTo(f11, f10, fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                                    f6 = fArr2[i31] + f20;
                                    f7 = fArr2[i32] + f21;
                                    f20 += fArr2[i33];
                                    f8 = fArr2[i34];
                                } else if (c8 == 't') {
                                    if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                        f12 = f20 - f16;
                                        f13 = f21 - f17;
                                    } else {
                                        f13 = 0.0f;
                                        f12 = 0.0f;
                                    }
                                    int i35 = i8 + 0;
                                    int i36 = i8 + 1;
                                    path.rQuadTo(f12, f13, fArr2[i35], fArr2[i36]);
                                    float f35 = f12 + f20;
                                    float f36 = f13 + f21;
                                    f20 += fArr2[i35];
                                    f21 += fArr2[i36];
                                    f17 = f36;
                                    f16 = f35;
                                }
                                f21 += f9;
                            } else {
                                int i37 = i8 + 0;
                                int i38 = i8 + 1;
                                int i39 = i8 + 2;
                                int i40 = i8 + 3;
                                path.rQuadTo(fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                                f6 = fArr2[i37] + f20;
                                f7 = fArr2[i38] + f21;
                                f20 += fArr2[i39];
                                f8 = fArr2[i40];
                            }
                            i7 = i8;
                        } else {
                            int i41 = i8 + 2;
                            int i42 = i8 + 3;
                            int i43 = i8 + 4;
                            int i44 = i8 + 5;
                            path.rCubicTo(fArr2[i8 + 0], fArr2[i8 + 1], fArr2[i41], fArr2[i42], fArr2[i43], fArr2[i44]);
                            f6 = fArr2[i41] + f20;
                            f7 = fArr2[i42] + f21;
                            f20 += fArr2[i43];
                            f8 = fArr2[i44];
                        }
                        f21 += f8;
                        f16 = f6;
                        f17 = f7;
                        i7 = i8;
                    } else {
                        int i45 = i8 + 5;
                        int i46 = i8 + 6;
                        i7 = i8;
                        c(path, f20, f21, fArr2[i45] + f20, fArr2[i46] + f21, fArr2[i8 + 0], fArr2[i8 + 1], fArr2[i8 + 2], fArr2[i8 + 3] != 0.0f, fArr2[i8 + 4] != 0.0f);
                        f20 += fArr2[i45];
                        f21 += fArr2[i46];
                    }
                    i8 = i7 + i6;
                    c9 = c7;
                    c8 = c9;
                    z5 = false;
                } else {
                    i7 = i8;
                    int i47 = i7 + 5;
                    int i48 = i7 + 6;
                    c(path, f20, f21, fArr2[i47], fArr2[i48], fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i7 + 2], fArr2[i7 + 3] != 0.0f, fArr2[i7 + 4] != 0.0f);
                    f20 = fArr2[i47];
                    f21 = fArr2[i48];
                }
                f17 = f21;
                f16 = f20;
                i8 = i7 + i6;
                c9 = c7;
                c8 = c9;
                z5 = false;
            }
            fArr[z5 ? 1 : 0] = f20;
            fArr[1] = f21;
            fArr[2] = f16;
            fArr[3] = f17;
            fArr[4] = f22;
            fArr[5] = f23;
        }

        private static void b(Path path, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
            double d15 = d8;
            int ceil = (int) Math.ceil(Math.abs((d14 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d12);
            double sin = Math.sin(d12);
            double cos2 = Math.cos(d13);
            double sin2 = Math.sin(d13);
            double d16 = -d15;
            double d17 = d16 * cos;
            double d18 = d9 * sin;
            double d19 = (d17 * sin2) - (d18 * cos2);
            double d20 = d16 * sin;
            double d21 = d9 * cos;
            double d22 = (cos2 * d21) + (sin2 * d20);
            double d23 = d14 / ceil;
            double d24 = d22;
            double d25 = d19;
            int i5 = 0;
            double d26 = d10;
            double d27 = d11;
            double d28 = d13;
            while (i5 < ceil) {
                double d29 = d28 + d23;
                double sin3 = Math.sin(d29);
                double cos3 = Math.cos(d29);
                double d30 = (((d15 * cos) * cos3) + d6) - (d18 * sin3);
                double d31 = (d21 * sin3) + (d15 * sin * cos3) + d7;
                double d32 = (d17 * sin3) - (d18 * cos3);
                double d33 = (cos3 * d21) + (sin3 * d20);
                double d34 = d29 - d28;
                double tan = Math.tan(d34 / 2.0d);
                double sqrt = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d34)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d25 * sqrt) + d26), (float) ((d24 * sqrt) + d27), (float) (d30 - (sqrt * d32)), (float) (d31 - (sqrt * d33)), (float) d30, (float) d31);
                i5++;
                d23 = d23;
                sin = sin;
                d26 = d30;
                d20 = d20;
                cos = cos;
                d28 = d29;
                d24 = d33;
                d25 = d32;
                ceil = ceil;
                d27 = d31;
                d15 = d8;
            }
        }

        private static void c(Path path, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z5, boolean z6) {
            double d6;
            double d7;
            double radians = Math.toRadians(f12);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d8 = f6;
            double d9 = d8 * cos;
            double d10 = f7;
            double d11 = f10;
            double d12 = ((d10 * sin) + d9) / d11;
            double d13 = f11;
            double d14 = ((d10 * cos) + ((-f6) * sin)) / d13;
            double d15 = f9;
            double d16 = ((d15 * sin) + (f8 * cos)) / d11;
            double d17 = ((d15 * cos) + ((-f8) * sin)) / d13;
            double d18 = d12 - d16;
            double d19 = d14 - d17;
            double d20 = (d12 + d16) / 2.0d;
            double d21 = (d14 + d17) / 2.0d;
            double d22 = (d19 * d19) + (d18 * d18);
            if (d22 == com.google.firebase.remoteconfig.p.f18289o) {
                return;
            }
            double d23 = (1.0d / d22) - 0.25d;
            if (d23 < com.google.firebase.remoteconfig.p.f18289o) {
                float sqrt = (float) (Math.sqrt(d22) / 1.99999d);
                c(path, f6, f7, f8, f9, f10 * sqrt, f11 * sqrt, f12, z5, z6);
                return;
            }
            double sqrt2 = Math.sqrt(d23);
            double d24 = d18 * sqrt2;
            double d25 = sqrt2 * d19;
            if (z5 == z6) {
                d6 = d20 - d25;
                d7 = d21 + d24;
            } else {
                d6 = d20 + d25;
                d7 = d21 - d24;
            }
            double atan2 = Math.atan2(d14 - d7, d12 - d6);
            double atan22 = Math.atan2(d17 - d7, d16 - d6) - atan2;
            if (z6 != (atan22 >= com.google.firebase.remoteconfig.p.f18289o)) {
                atan22 = atan22 > com.google.firebase.remoteconfig.p.f18289o ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d26 = d6 * d11;
            double d27 = d7 * d13;
            b(path, (d26 * cos) - (d27 * sin), (d27 * cos) + (d26 * sin), d11, d13, d8, d10, radians, atan2, atan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c6 = 'm';
            for (int i5 = 0; i5 < bVarArr.length; i5++) {
                b bVar = bVarArr[i5];
                a(path, fArr, c6, bVar.f4691a, bVar.f4692b);
                c6 = bVarArr[i5].f4691a;
            }
        }

        public void d(b bVar, b bVar2, float f6) {
            this.f4691a = bVar.f4691a;
            int i5 = 0;
            while (true) {
                float[] fArr = bVar.f4692b;
                if (i5 >= fArr.length) {
                    return;
                }
                this.f4692b[i5] = (bVar2.f4692b[i5] * f6) + ((1.0f - f6) * fArr[i5]);
                i5++;
            }
        }

        b(b bVar) {
            this.f4691a = bVar.f4691a;
            float[] fArr = bVar.f4692b;
            this.f4692b = b2.c(fArr, 0, fArr.length);
        }
    }
}
