package com.google.zxing.aztec.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Encoder.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f62620a = 33;

    /* renamed from: b, reason: collision with root package name */
    public static final int f62621b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f62622c = 32;

    /* renamed from: d, reason: collision with root package name */
    private static final int f62623d = 4;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f62624e = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private c() {
    }

    private static int[] a(com.google.zxing.common.a aVar, int i4, int i5) {
        int[] iArr = new int[i5];
        int o4 = aVar.o() / i4;
        for (int i6 = 0; i6 < o4; i6++) {
            int i7 = 0;
            for (int i10 = 0; i10 < i4; i10++) {
                i7 |= aVar.k((i6 * i4) + i10) ? 1 << ((i4 - i10) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        return iArr;
    }

    private static void b(com.google.zxing.common.b bVar, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6 += 2) {
            int i7 = i4 - i6;
            int i10 = i7;
            while (true) {
                int i11 = i4 + i6;
                if (i10 <= i11) {
                    bVar.s(i10, i7);
                    bVar.s(i10, i11);
                    bVar.s(i7, i10);
                    bVar.s(i11, i10);
                    i10++;
                }
            }
        }
        int i12 = i4 - i5;
        bVar.s(i12, i12);
        int i13 = i12 + 1;
        bVar.s(i13, i12);
        bVar.s(i12, i13);
        int i14 = i4 + i5;
        bVar.s(i14, i12);
        bVar.s(i14, i13);
        bVar.s(i14, i14 - 1);
    }

    private static void c(com.google.zxing.common.b bVar, boolean z4, int i4, com.google.zxing.common.a aVar) {
        int i5 = i4 / 2;
        int i6 = 0;
        if (z4) {
            while (i6 < 7) {
                int i7 = (i5 - 3) + i6;
                if (aVar.k(i6)) {
                    bVar.s(i7, i5 - 5);
                }
                if (aVar.k(i6 + 7)) {
                    bVar.s(i5 + 5, i7);
                }
                if (aVar.k(20 - i6)) {
                    bVar.s(i7, i5 + 5);
                }
                if (aVar.k(27 - i6)) {
                    bVar.s(i5 - 5, i7);
                }
                i6++;
            }
            return;
        }
        while (i6 < 10) {
            int i10 = (i6 / 5) + (i5 - 5) + i6;
            if (aVar.k(i6)) {
                bVar.s(i10, i5 - 7);
            }
            if (aVar.k(i6 + 10)) {
                bVar.s(i5 + 7, i10);
            }
            if (aVar.k(29 - i6)) {
                bVar.s(i10, i5 + 7);
            }
            if (aVar.k(39 - i6)) {
                bVar.s(i5 - 7, i10);
            }
            i6++;
        }
    }

    public static a d(byte[] bArr) {
        return e(bArr, 33, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a e(byte[] bArr, int i4, int i5) {
        com.google.zxing.common.a aVar;
        int i6;
        boolean z4;
        int i7;
        int i10;
        int i11;
        com.google.zxing.common.a a5 = new d(bArr).a();
        int o4 = ((a5.o() * i4) / 100) + 11;
        int o5 = a5.o() + o4;
        int i12 = 1;
        if (i5 == 0) {
            com.google.zxing.common.a aVar2 = null;
            int i13 = 0;
            int i14 = 0;
            while (i13 <= 32) {
                boolean z5 = i13 <= 3 ? i12 : 0;
                int i15 = z5 != 0 ? i13 + 1 : i13;
                int j4 = j(i15, z5);
                if (o5 <= j4) {
                    if (aVar2 == null || i14 != f62624e[i15]) {
                        int i16 = f62624e[i15];
                        i14 = i16;
                        aVar2 = i(a5, i16);
                    }
                    int i17 = j4 - (j4 % i14);
                    if ((z5 == 0 || aVar2.o() <= (i14 << 6)) && aVar2.o() + o4 <= i17) {
                        aVar = aVar2;
                        i6 = i14;
                        z4 = z5;
                        i7 = i15;
                        i10 = j4;
                    }
                }
                i13++;
                i12 = i12;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ह\u0001"));
        }
        z4 = i5 < 0;
        i7 = Math.abs(i5);
        if (i7 > (z4 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("स\u0001"), Integer.valueOf(i5)));
        }
        i10 = j(i7, z4);
        i6 = f62624e[i7];
        int i18 = i10 - (i10 % i6);
        aVar = i(a5, i6);
        int o6 = aVar.o() + o4;
        String s4 = ProtectedSandApp.s("ष\u0001");
        if (o6 > i18) {
            throw new IllegalArgumentException(s4);
        }
        if (z4 && aVar.o() > (i6 << 6)) {
            throw new IllegalArgumentException(s4);
        }
        com.google.zxing.common.a f4 = f(aVar, i10, i6);
        int o7 = aVar.o() / i6;
        com.google.zxing.common.a g4 = g(z4, i7, o7);
        int i19 = (z4 ? 11 : 14) + (i7 << 2);
        int[] iArr = new int[i19];
        int i20 = 2;
        if (z4) {
            for (int i21 = 0; i21 < i19; i21++) {
                iArr[i21] = i21;
            }
            i11 = i19;
        } else {
            int i22 = i19 / 2;
            i11 = (((i22 - 1) / 15) * 2) + i19 + 1;
            int i23 = i11 / 2;
            for (int i24 = 0; i24 < i22; i24++) {
                iArr[(i22 - i24) - i12] = (i23 - r14) - 1;
                iArr[i22 + i24] = (i24 / 15) + i24 + i23 + i12;
            }
        }
        com.google.zxing.common.b bVar = new com.google.zxing.common.b(i11, i11);
        int i25 = 0;
        int i26 = 0;
        while (i25 < i7) {
            int i27 = ((i7 - i25) << i20) + (z4 ? 9 : 12);
            int i28 = 0;
            while (i28 < i27) {
                int i29 = i28 << 1;
                int i30 = 0;
                while (i30 < i20) {
                    if (f4.k(i26 + i29 + i30)) {
                        int i31 = i25 << 1;
                        bVar.s(iArr[i31 + i30], iArr[i31 + i28]);
                    }
                    if (f4.k((i27 << 1) + i26 + i29 + i30)) {
                        int i32 = i25 << 1;
                        bVar.s(iArr[i32 + i28], iArr[((i19 - 1) - i32) - i30]);
                    }
                    if (f4.k((i27 << 2) + i26 + i29 + i30)) {
                        int i33 = (i19 - 1) - (i25 << 1);
                        bVar.s(iArr[i33 - i30], iArr[i33 - i28]);
                    }
                    if (f4.k((i27 * 6) + i26 + i29 + i30)) {
                        int i34 = i25 << 1;
                        bVar.s(iArr[((i19 - 1) - i34) - i28], iArr[i34 + i30]);
                    }
                    i30++;
                    i20 = 2;
                }
                i28++;
                i20 = 2;
            }
            i26 += i27 << 3;
            i25++;
            i20 = 2;
        }
        c(bVar, z4, i11, g4);
        if (z4) {
            b(bVar, i11 / 2, 5);
        } else {
            int i35 = i11 / 2;
            b(bVar, i35, 7);
            int i36 = 0;
            int i37 = 0;
            while (i37 < (i19 / 2) - 1) {
                for (int i38 = i35 & 1; i38 < i11; i38 += 2) {
                    int i39 = i35 - i36;
                    bVar.s(i39, i38);
                    int i40 = i35 + i36;
                    bVar.s(i40, i38);
                    bVar.s(i38, i39);
                    bVar.s(i38, i40);
                }
                i37 += 15;
                i36 += 16;
            }
        }
        a aVar3 = new a();
        aVar3.g(z4);
        aVar3.j(i11);
        aVar3.h(i7);
        aVar3.f(o7);
        aVar3.i(bVar);
        return aVar3;
    }

    private static com.google.zxing.common.a f(com.google.zxing.common.a aVar, int i4, int i5) {
        int o4 = aVar.o() / i5;
        com.google.zxing.common.reedsolomon.d dVar = new com.google.zxing.common.reedsolomon.d(h(i5));
        int i6 = i4 / i5;
        int[] a5 = a(aVar, i5, i6);
        dVar.b(a5, i6 - o4);
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        aVar2.d(0, i4 % i5);
        for (int i7 : a5) {
            aVar2.d(i7, i5);
        }
        return aVar2;
    }

    static com.google.zxing.common.a g(boolean z4, int i4, int i5) {
        com.google.zxing.common.a aVar = new com.google.zxing.common.a();
        if (z4) {
            aVar.d(i4 - 1, 2);
            aVar.d(i5 - 1, 6);
            return f(aVar, 28, 4);
        }
        aVar.d(i4 - 1, 5);
        aVar.d(i5 - 1, 11);
        return f(aVar, 40, 4);
    }

    private static com.google.zxing.common.reedsolomon.a h(int i4) {
        if (i4 == 4) {
            return com.google.zxing.common.reedsolomon.a.f62814k;
        }
        if (i4 == 6) {
            return com.google.zxing.common.reedsolomon.a.f62813j;
        }
        if (i4 == 8) {
            return com.google.zxing.common.reedsolomon.a.f62817n;
        }
        if (i4 == 10) {
            return com.google.zxing.common.reedsolomon.a.f62812i;
        }
        if (i4 == 12) {
            return com.google.zxing.common.reedsolomon.a.f62811h;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ऺ\u0001").concat(String.valueOf(i4)));
    }

    static com.google.zxing.common.a i(com.google.zxing.common.a aVar, int i4) {
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        int o4 = aVar.o();
        int i5 = (1 << i4) - 2;
        int i6 = 0;
        while (i6 < o4) {
            int i7 = 0;
            for (int i10 = 0; i10 < i4; i10++) {
                int i11 = i6 + i10;
                if (i11 >= o4 || aVar.k(i11)) {
                    i7 |= 1 << ((i4 - 1) - i10);
                }
            }
            int i12 = i7 & i5;
            if (i12 == i5) {
                aVar2.d(i12, i4);
            } else if (i12 == 0) {
                aVar2.d(i7 | 1, i4);
            } else {
                aVar2.d(i7, i4);
                i6 += i4;
            }
            i6--;
            i6 += i4;
        }
        return aVar2;
    }

    private static int j(int i4, boolean z4) {
        return ((z4 ? 88 : 112) + (i4 << 4)) * i4;
    }
}
