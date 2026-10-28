package androidx.core.graphics;

import android.graphics.Path;
import androidx.annotation.c1;
import java.util.ArrayList;

/* compiled from: PathParser.java */
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26271a = "PathParser";

    /* compiled from: PathParser.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f26272a;

        /* renamed from: b, reason: collision with root package name */
        boolean f26273b;

        a() {
        }
    }

    private j0() {
    }

    private static void a(ArrayList<b> arrayList, char c5, float[] fArr) {
        arrayList.add(new b(c5, fArr));
    }

    public static boolean b(@androidx.annotation.q0 b[] bVarArr, @androidx.annotation.q0 b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            if (bVarArr[i4].f26274a != bVarArr2[i4].f26274a || bVarArr[i4].f26275b.length != bVarArr2[i4].f26275b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i4, int i5) {
        if (i4 > i5) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i4 < 0 || i4 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = i5 - i4;
        int min = Math.min(i6, length - i4);
        float[] fArr2 = new float[i6];
        System.arraycopy(fArr, i4, fArr2, 0, min);
        return fArr2;
    }

    @androidx.annotation.o0
    public static b[] d(@androidx.annotation.o0 String str) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 1;
        while (i5 < str.length()) {
            int k4 = k(str, i5);
            String trim = str.substring(i4, k4).trim();
            if (!trim.isEmpty()) {
                a(arrayList, trim.charAt(0), h(trim));
            }
            i4 = k4;
            i5 = k4 + 1;
        }
        if (i5 - i4 == 1 && i4 < str.length()) {
            a(arrayList, str.charAt(i4), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    @androidx.annotation.o0
    public static Path e(@androidx.annotation.o0 String str) {
        Path path = new Path();
        try {
            l(d(str), path);
            return path;
        } catch (RuntimeException e4) {
            throw new RuntimeException(androidx.constraintlayout.core.motion.key.c.a("Error in parsing ", str), e4);
        }
    }

    @androidx.annotation.o0
    public static b[] f(@androidx.annotation.o0 b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            bVarArr2[i4] = new b(bVarArr[i4]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[LOOP:0: B:2:0x0007->B:14:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(java.lang.String r8, int r9, androidx.core.graphics.j0.a r10) {
        /*
            r0 = 0
            r10.f26273b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.f26273b = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.f26273b = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.f26272a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.j0.g(java.lang.String, int, androidx.core.graphics.j0$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i4 = 1;
            int i5 = 0;
            while (i4 < length) {
                g(str, i4, aVar);
                int i6 = aVar.f26272a;
                if (i4 < i6) {
                    fArr[i5] = Float.parseFloat(str.substring(i4, i6));
                    i5++;
                }
                i4 = aVar.f26273b ? i6 : i6 + 1;
            }
            return c(fArr, 0, i5);
        } catch (NumberFormatException e4) {
            throw new RuntimeException(android.support.v4.media.d.a("error in parsing \"", str, "\""), e4);
        }
    }

    public static void i(@androidx.annotation.o0 b[] bVarArr, float f4, @androidx.annotation.o0 b[] bVarArr2, @androidx.annotation.o0 b[] bVarArr3) {
        if (!j(bVarArr, bVarArr2, bVarArr3, f4)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static boolean j(@androidx.annotation.o0 b[] bVarArr, @androidx.annotation.o0 b[] bVarArr2, @androidx.annotation.o0 b[] bVarArr3, float f4) {
        if (bVarArr.length != bVarArr2.length || bVarArr2.length != bVarArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!b(bVarArr2, bVarArr3)) {
            return false;
        }
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            bVarArr[i4].j(bVarArr2[i4], bVarArr3[i4], f4);
        }
        return true;
    }

    private static int k(String str, int i4) {
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            if ((charAt - 'Z') * (charAt - 'A') > 0) {
                if ((charAt - 'z') * (charAt - 'a') > 0) {
                    continue;
                    i4++;
                }
            }
            if (charAt != 'e' && charAt != 'E') {
                return i4;
            }
            i4++;
        }
        return i4;
    }

    public static void l(@androidx.annotation.o0 b[] bVarArr, @androidx.annotation.o0 Path path) {
        float[] fArr = new float[6];
        char c5 = 'm';
        for (b bVar : bVarArr) {
            b.e(path, fArr, c5, bVar.f26274a, bVar.f26275b);
            c5 = bVar.f26274a;
        }
    }

    public static void m(@androidx.annotation.o0 b[] bVarArr, @androidx.annotation.o0 b[] bVarArr2) {
        for (int i4 = 0; i4 < bVarArr2.length; i4++) {
            bVarArr[i4].f26274a = bVarArr2[i4].f26274a;
            for (int i5 = 0; i5 < bVarArr2[i4].f26275b.length; i5++) {
                bVarArr[i4].f26275b[i5] = bVarArr2[i4].f26275b[i5];
            }
        }
    }

    /* compiled from: PathParser.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private char f26274a;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f26275b;

        b(char c5, float[] fArr) {
            this.f26274a = c5;
            this.f26275b = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void e(Path path, float[] fArr, char c5, char c6, float[] fArr2) {
            int i4;
            int i5;
            int i6;
            float f4;
            float f5;
            float f6;
            float f7;
            float f10;
            float f11;
            float f12;
            float f13;
            char c7 = c6;
            boolean z4 = false;
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[2];
            float f17 = fArr[3];
            float f18 = fArr[4];
            float f19 = fArr[5];
            switch (c7) {
                case 'A':
                case 'a':
                    i4 = 7;
                    i5 = i4;
                    break;
                case 'C':
                case 'c':
                    i4 = 6;
                    i5 = i4;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i5 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i5 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i5 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f18, f19);
                    f14 = f18;
                    f16 = f14;
                    f15 = f19;
                    f17 = f15;
                    i5 = 2;
                    break;
            }
            float f20 = f14;
            float f21 = f15;
            float f22 = f18;
            float f23 = f19;
            int i7 = 0;
            char c10 = c5;
            while (i7 < fArr2.length) {
                if (c7 != 'A') {
                    if (c7 == 'C') {
                        i6 = i7;
                        int i10 = i6 + 2;
                        int i11 = i6 + 3;
                        int i12 = i6 + 4;
                        int i13 = i6 + 5;
                        path.cubicTo(fArr2[i6], fArr2[i6 + 1], fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                        f20 = fArr2[i12];
                        float f24 = fArr2[i13];
                        float f25 = fArr2[i10];
                        float f26 = fArr2[i11];
                        f21 = f24;
                        f17 = f26;
                        f16 = f25;
                    } else if (c7 == 'H') {
                        i6 = i7;
                        path.lineTo(fArr2[i6], f21);
                        f20 = fArr2[i6];
                    } else if (c7 == 'Q') {
                        i6 = i7;
                        int i14 = i6 + 1;
                        int i15 = i6 + 2;
                        int i16 = i6 + 3;
                        path.quadTo(fArr2[i6], fArr2[i14], fArr2[i15], fArr2[i16]);
                        float f27 = fArr2[i6];
                        float f28 = fArr2[i14];
                        f20 = fArr2[i15];
                        f21 = fArr2[i16];
                        f16 = f27;
                        f17 = f28;
                    } else if (c7 == 'V') {
                        i6 = i7;
                        path.lineTo(f20, fArr2[i6]);
                        f21 = fArr2[i6];
                    } else if (c7 != 'a') {
                        if (c7 != 'c') {
                            if (c7 == 'h') {
                                path.rLineTo(fArr2[i7], 0.0f);
                                f20 += fArr2[i7];
                            } else if (c7 != 'q') {
                                if (c7 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i7]);
                                    f7 = fArr2[i7];
                                } else if (c7 == 'L') {
                                    int i17 = i7 + 1;
                                    path.lineTo(fArr2[i7], fArr2[i17]);
                                    f20 = fArr2[i7];
                                    f21 = fArr2[i17];
                                } else if (c7 == 'M') {
                                    f20 = fArr2[i7];
                                    f21 = fArr2[i7 + 1];
                                    if (i7 > 0) {
                                        path.lineTo(f20, f21);
                                    } else {
                                        path.moveTo(f20, f21);
                                        i6 = i7;
                                        f23 = f21;
                                        f22 = f20;
                                    }
                                } else if (c7 == 'S') {
                                    if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                        f20 = (f20 * 2.0f) - f16;
                                        f21 = (f21 * 2.0f) - f17;
                                    }
                                    float f29 = f21;
                                    float f30 = f20;
                                    int i18 = i7 + 1;
                                    int i19 = i7 + 2;
                                    int i20 = i7 + 3;
                                    path.cubicTo(f30, f29, fArr2[i7], fArr2[i18], fArr2[i19], fArr2[i20]);
                                    f4 = fArr2[i7];
                                    f5 = fArr2[i18];
                                    f20 = fArr2[i19];
                                    f21 = fArr2[i20];
                                    f16 = f4;
                                    f17 = f5;
                                } else if (c7 == 'T') {
                                    if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                        f20 = (f20 * 2.0f) - f16;
                                        f21 = (f21 * 2.0f) - f17;
                                    }
                                    int i21 = i7 + 1;
                                    path.quadTo(f20, f21, fArr2[i7], fArr2[i21]);
                                    i6 = i7;
                                    f17 = f21;
                                    f16 = f20;
                                    f20 = fArr2[i7];
                                    f21 = fArr2[i21];
                                } else if (c7 == 'l') {
                                    int i22 = i7 + 1;
                                    path.rLineTo(fArr2[i7], fArr2[i22]);
                                    f20 += fArr2[i7];
                                    f7 = fArr2[i22];
                                } else if (c7 == 'm') {
                                    float f31 = fArr2[i7];
                                    f20 += f31;
                                    float f32 = fArr2[i7 + 1];
                                    f21 += f32;
                                    if (i7 > 0) {
                                        path.rLineTo(f31, f32);
                                    } else {
                                        path.rMoveTo(f31, f32);
                                        i6 = i7;
                                        f23 = f21;
                                        f22 = f20;
                                    }
                                } else if (c7 == 's') {
                                    if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                        float f33 = f20 - f16;
                                        f10 = f21 - f17;
                                        f11 = f33;
                                    } else {
                                        f11 = 0.0f;
                                        f10 = 0.0f;
                                    }
                                    int i23 = i7 + 1;
                                    int i24 = i7 + 2;
                                    int i25 = i7 + 3;
                                    path.rCubicTo(f11, f10, fArr2[i7], fArr2[i23], fArr2[i24], fArr2[i25]);
                                    f4 = fArr2[i7] + f20;
                                    f5 = fArr2[i23] + f21;
                                    f20 += fArr2[i24];
                                    f6 = fArr2[i25];
                                } else if (c7 == 't') {
                                    if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                        f12 = f20 - f16;
                                        f13 = f21 - f17;
                                    } else {
                                        f13 = 0.0f;
                                        f12 = 0.0f;
                                    }
                                    int i26 = i7 + 1;
                                    path.rQuadTo(f12, f13, fArr2[i7], fArr2[i26]);
                                    float f34 = f12 + f20;
                                    float f35 = f13 + f21;
                                    f20 += fArr2[i7];
                                    f21 += fArr2[i26];
                                    f17 = f35;
                                    f16 = f34;
                                }
                                f21 += f7;
                            } else {
                                int i27 = i7 + 1;
                                int i28 = i7 + 2;
                                int i29 = i7 + 3;
                                path.rQuadTo(fArr2[i7], fArr2[i27], fArr2[i28], fArr2[i29]);
                                f4 = fArr2[i7] + f20;
                                f5 = fArr2[i27] + f21;
                                f20 += fArr2[i28];
                                f6 = fArr2[i29];
                            }
                            i6 = i7;
                        } else {
                            int i30 = i7 + 2;
                            int i31 = i7 + 3;
                            int i32 = i7 + 4;
                            int i33 = i7 + 5;
                            path.rCubicTo(fArr2[i7], fArr2[i7 + 1], fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                            f4 = fArr2[i30] + f20;
                            f5 = fArr2[i31] + f21;
                            f20 += fArr2[i32];
                            f6 = fArr2[i33];
                        }
                        f21 += f6;
                        f16 = f4;
                        f17 = f5;
                        i6 = i7;
                    } else {
                        int i34 = i7 + 5;
                        int i35 = i7 + 6;
                        i6 = i7;
                        g(path, f20, f21, fArr2[i34] + f20, fArr2[i35] + f21, fArr2[i7], fArr2[i7 + 1], fArr2[i7 + 2], fArr2[i7 + 3] != 0.0f, fArr2[i7 + 4] != 0.0f);
                        f20 += fArr2[i34];
                        f21 += fArr2[i35];
                    }
                    i7 = i6 + i5;
                    c10 = c6;
                    c7 = c10;
                    z4 = false;
                } else {
                    i6 = i7;
                    int i36 = i6 + 5;
                    int i37 = i6 + 6;
                    g(path, f20, f21, fArr2[i36], fArr2[i37], fArr2[i6], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3] != 0.0f, fArr2[i6 + 4] != 0.0f);
                    f20 = fArr2[i36];
                    f21 = fArr2[i37];
                }
                f17 = f21;
                f16 = f20;
                i7 = i6 + i5;
                c10 = c6;
                c7 = c10;
                z4 = false;
            }
            fArr[z4 ? 1 : 0] = f20;
            fArr[1] = f21;
            fArr[2] = f16;
            fArr[3] = f17;
            fArr[4] = f22;
            fArr[5] = f23;
        }

        private static void f(Path path, double d5, double d6, double d7, double d10, double d11, double d12, double d13, double d14, double d15) {
            double d16 = d7;
            int ceil = (int) Math.ceil(Math.abs((d15 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d13);
            double sin = Math.sin(d13);
            double cos2 = Math.cos(d14);
            double sin2 = Math.sin(d14);
            double d17 = -d16;
            double d18 = d17 * cos;
            double d19 = d10 * sin;
            double d20 = (d18 * sin2) - (d19 * cos2);
            double d21 = d17 * sin;
            double d22 = d10 * cos;
            double d23 = (cos2 * d22) + (sin2 * d21);
            double d24 = d15 / ceil;
            double d25 = d23;
            double d26 = d20;
            int i4 = 0;
            double d27 = d11;
            double d28 = d12;
            double d29 = d14;
            while (i4 < ceil) {
                double d30 = d29 + d24;
                double sin3 = Math.sin(d30);
                double cos3 = Math.cos(d30);
                double d31 = (((d16 * cos) * cos3) + d5) - (d19 * sin3);
                double d32 = (d22 * sin3) + (d16 * sin * cos3) + d6;
                double d33 = (d18 * sin3) - (d19 * cos3);
                double d34 = (cos3 * d22) + (sin3 * d21);
                double d35 = d30 - d29;
                double tan = Math.tan(d35 / 2.0d);
                double sqrt = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d35)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d26 * sqrt) + d27), (float) ((d25 * sqrt) + d28), (float) (d31 - (sqrt * d33)), (float) (d32 - (sqrt * d34)), (float) d31, (float) d32);
                i4++;
                d24 = d24;
                sin = sin;
                d27 = d31;
                d21 = d21;
                cos = cos;
                d29 = d30;
                d25 = d34;
                d26 = d33;
                ceil = ceil;
                d28 = d32;
                d16 = d7;
            }
        }

        private static void g(Path path, float f4, float f5, float f6, float f7, float f10, float f11, float f12, boolean z4, boolean z5) {
            double d5;
            double d6;
            double radians = Math.toRadians(f12);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d7 = f4;
            double d10 = d7 * cos;
            double d11 = f5;
            double d12 = f10;
            double d13 = ((d11 * sin) + d10) / d12;
            double d14 = f11;
            double d15 = ((d11 * cos) + ((-f4) * sin)) / d14;
            double d16 = f7;
            double d17 = ((d16 * sin) + (f6 * cos)) / d12;
            double d18 = ((d16 * cos) + ((-f6) * sin)) / d14;
            double d19 = d13 - d17;
            double d20 = d15 - d18;
            double d21 = (d13 + d17) / 2.0d;
            double d22 = (d15 + d18) / 2.0d;
            double d23 = (d20 * d20) + (d19 * d19);
            if (d23 == com.google.firebase.remoteconfig.p.f60679p) {
                return;
            }
            double d24 = (1.0d / d23) - 0.25d;
            if (d24 < com.google.firebase.remoteconfig.p.f60679p) {
                float sqrt = (float) (Math.sqrt(d23) / 1.99999d);
                g(path, f4, f5, f6, f7, f10 * sqrt, f11 * sqrt, f12, z4, z5);
                return;
            }
            double sqrt2 = Math.sqrt(d24);
            double d25 = d19 * sqrt2;
            double d26 = sqrt2 * d20;
            if (z4 == z5) {
                d5 = d21 - d26;
                d6 = d22 + d25;
            } else {
                d5 = d21 + d26;
                d6 = d22 - d25;
            }
            double atan2 = Math.atan2(d15 - d6, d13 - d5);
            double atan22 = Math.atan2(d18 - d6, d17 - d5) - atan2;
            if (z5 != (atan22 >= com.google.firebase.remoteconfig.p.f60679p)) {
                atan22 = atan22 > com.google.firebase.remoteconfig.p.f60679p ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d27 = d5 * d12;
            double d28 = d6 * d14;
            f(path, (d27 * cos) - (d28 * sin), (d28 * cos) + (d27 * sin), d12, d14, d7, d11, radians, atan2, atan22);
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static void k(@androidx.annotation.o0 b[] bVarArr, @androidx.annotation.o0 Path path) {
            j0.l(bVarArr, path);
        }

        @androidx.annotation.o0
        public float[] h() {
            return this.f26275b;
        }

        public char i() {
            return this.f26274a;
        }

        public void j(@androidx.annotation.o0 b bVar, @androidx.annotation.o0 b bVar2, float f4) {
            this.f26274a = bVar.f26274a;
            int i4 = 0;
            while (true) {
                float[] fArr = bVar.f26275b;
                if (i4 >= fArr.length) {
                    return;
                }
                this.f26275b[i4] = (bVar2.f26275b[i4] * f4) + ((1.0f - f4) * fArr[i4]);
                i4++;
            }
        }

        b(b bVar) {
            this.f26274a = bVar.f26274a;
            float[] fArr = bVar.f26275b;
            this.f26275b = j0.c(fArr, 0, fArr.length);
        }
    }
}
