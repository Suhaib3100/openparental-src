package com.google.zxing.pdf417.decoder;

import androidx.core.graphics.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

/* compiled from: PDF417ScanningDecoder.java */
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final int f63233a = 2;

    /* renamed from: b, reason: collision with root package name */
    private static final int f63234b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static final int f63235c = 512;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.zxing.pdf417.decoder.ec.a f63236d = new com.google.zxing.pdf417.decoder.ec.a();

    private j() {
    }

    private static c a(h hVar) throws NotFoundException {
        int[] j4;
        if (hVar == null || (j4 = hVar.j()) == null) {
            return null;
        }
        int p4 = p(j4);
        int i4 = 0;
        int i5 = 0;
        for (int i6 : j4) {
            i5 += p4 - i6;
            if (i6 > 0) {
                break;
            }
        }
        d[] d5 = hVar.d();
        for (int i7 = 0; i5 > 0 && d5[i7] == null; i7++) {
            i5--;
        }
        for (int length = j4.length - 1; length >= 0; length--) {
            int i10 = j4[length];
            i4 += p4 - i10;
            if (i10 > 0) {
                break;
            }
        }
        for (int length2 = d5.length - 1; i4 > 0 && d5[length2] == null; length2--) {
            i4--;
        }
        return hVar.a().a(i5, i4, hVar.k());
    }

    private static void b(f fVar, b[][] bVarArr) throws NotFoundException {
        b bVar = bVarArr[0][1];
        int[] b5 = bVar.b();
        int j4 = (fVar.j() * fVar.l()) - (2 << fVar.k());
        if (b5.length == 0) {
            if (j4 <= 0 || j4 > 928) {
                throw NotFoundException.a();
            }
            bVar.c(j4);
            return;
        }
        if (b5[0] == j4 || j4 <= 0 || j4 > 928) {
            return;
        }
        bVar.c(j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int c(com.google.zxing.common.b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.f(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.j.c(com.google.zxing.common.b, int, int, boolean, int, int):int");
    }

    private static boolean d(int i4, int i5, int i6) {
        return i5 + (-2) <= i4 && i4 <= i6 + 2;
    }

    private static int e(int[] iArr, int[] iArr2, int i4) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i4 / 2) + 3) && i4 >= 0 && i4 <= 512) {
            return f63236d.a(iArr, i4, iArr2);
        }
        throw ChecksumException.a();
    }

    private static b[][] f(f fVar) {
        int c5;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, fVar.l(), fVar.j() + 2);
        for (b[] bVarArr2 : bVarArr) {
            int i4 = 0;
            while (true) {
                if (i4 < bVarArr2.length) {
                    bVarArr2[i4] = new b();
                    i4++;
                }
            }
        }
        int i5 = 0;
        for (g gVar : fVar.o()) {
            if (gVar != null) {
                for (d dVar : gVar.d()) {
                    if (dVar != null && (c5 = dVar.c()) >= 0 && c5 < bVarArr.length) {
                        bVarArr[c5][i5].c(dVar.e());
                    }
                }
            }
            i5++;
        }
        return bVarArr;
    }

    private static com.google.zxing.common.e g(f fVar) throws FormatException, ChecksumException, NotFoundException {
        b[][] f4 = f(fVar);
        b(fVar, f4);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[fVar.l() * fVar.j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < fVar.l(); i4++) {
            int i5 = 0;
            while (i5 < fVar.j()) {
                int i6 = i5 + 1;
                int[] b5 = f4[i4][i6].b();
                int j4 = (fVar.j() * i4) + i5;
                if (b5.length == 0) {
                    arrayList.add(Integer.valueOf(j4));
                } else if (b5.length == 1) {
                    iArr[j4] = b5[0];
                } else {
                    arrayList3.add(Integer.valueOf(j4));
                    arrayList2.add(b5);
                }
                i5 = i6;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i7 = 0; i7 < size; i7++) {
            iArr2[i7] = (int[]) arrayList2.get(i7);
        }
        return h(fVar.k(), iArr, ta.a.c(arrayList), ta.a.c(arrayList3), iArr2);
    }

    private static com.google.zxing.common.e h(int i4, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws FormatException, ChecksumException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i5 = 100;
        while (true) {
            int i6 = i5 - 1;
            if (i5 <= 0) {
                throw ChecksumException.a();
            }
            for (int i7 = 0; i7 < length; i7++) {
                iArr[iArr3[i7]] = iArr4[i7][iArr5[i7]];
            }
            try {
                return j(iArr, i4, iArr2);
            } catch (ChecksumException unused) {
                if (length == 0) {
                    throw ChecksumException.a();
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    int i11 = iArr5[i10];
                    if (i11 < iArr4[i10].length - 1) {
                        iArr5[i10] = i11 + 1;
                        break;
                    }
                    iArr5[i10] = 0;
                    if (i10 == length - 1) {
                        throw ChecksumException.a();
                    }
                    i10++;
                }
                i5 = i6;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        r2 = r26;
        r6 = r27;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r7 > r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r0 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r3.n(r8) != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r8 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r8 != r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        r10 = new com.google.zxing.pdf417.decoder.g(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        r15 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        r3.q(r8, r15);
        r14 = -1;
        r13 = r9.g();
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r13 > r9.e()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        r10 = t(r3, r8, r13, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        if (r10 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r10 <= r9.d()) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        r19 = r12;
        r22 = r13;
        r20 = r14;
        r1 = r15;
        r10 = k(r21, r9.f(), r9.d(), r0, r18, r22, r2, r6);
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dd, code lost:
    
        if (r10 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        r1.f(r11, r10);
        r2 = java.lang.Math.min(r2, r10.f());
        r6 = java.lang.Math.max(r6, r10.f());
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
    
        r13 = r11 + 1;
        r15 = r1;
        r14 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        r12 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        if (r12 == r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        r18 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:
    
        r19 = r12;
        r11 = r13;
        r20 = r14;
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r7 = r7 + 1;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        if (r8 != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0090, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
    
        r10 = new com.google.zxing.pdf417.decoder.h(r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0092, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0078, code lost:
    
        r8 = r5 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010d, code lost:
    
        return g(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x006c, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.zxing.common.e i(com.google.zxing.common.b r21, com.google.zxing.p r22, com.google.zxing.p r23, com.google.zxing.p r24, com.google.zxing.p r25, int r26, int r27) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.j.i(com.google.zxing.common.b, com.google.zxing.p, com.google.zxing.p, com.google.zxing.p, com.google.zxing.p, int, int):com.google.zxing.common.e");
    }

    private static com.google.zxing.common.e j(int[] iArr, int i4, int[] iArr2) throws FormatException, ChecksumException {
        if (iArr.length == 0) {
            throw FormatException.a();
        }
        int i5 = 1 << (i4 + 1);
        int e4 = e(iArr, iArr2, i5);
        x(iArr, i5);
        com.google.zxing.common.e b5 = e.b(iArr, String.valueOf(i4));
        b5.m(Integer.valueOf(e4));
        b5.l(Integer.valueOf(iArr2.length));
        return b5;
    }

    private static d k(com.google.zxing.common.b bVar, int i4, int i5, boolean z4, int i6, int i7, int i10, int i11) {
        int i12;
        int d5;
        int b5;
        int c5 = c(bVar, i4, i5, z4, i6, i7);
        int[] q4 = q(bVar, i4, i5, z4, c5, i7);
        if (q4 == null) {
            return null;
        }
        int d6 = pa.a.d(q4);
        if (z4) {
            i12 = c5 + d6;
        } else {
            for (int i13 = 0; i13 < q4.length / 2; i13++) {
                int i14 = q4[i13];
                q4[i13] = q4[(q4.length - 1) - i13];
                q4[(q4.length - 1) - i13] = i14;
            }
            c5 -= d6;
            i12 = c5;
        }
        if (d(d6, i10, i11) && (b5 = ta.a.b((d5 = i.d(q4)))) != -1) {
            return new d(c5, i12, n(d5), b5);
        }
        return null;
    }

    private static a l(h hVar, h hVar2) {
        a i4;
        a i5;
        if (hVar == null || (i4 = hVar.i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.i();
        }
        if (hVar2 == null || (i5 = hVar2.i()) == null || i4.a() == i5.a() || i4.b() == i5.b() || i4.c() == i5.c()) {
            return i4;
        }
        return null;
    }

    private static int[] m(int i4) {
        int[] iArr = new int[8];
        int i5 = 0;
        int i6 = 7;
        while (true) {
            int i7 = i4 & 1;
            if (i7 != i5) {
                i6--;
                if (i6 < 0) {
                    return iArr;
                }
                i5 = i7;
            }
            iArr[i6] = iArr[i6] + 1;
            i4 >>= 1;
        }
    }

    private static int n(int i4) {
        return o(m(i4));
    }

    private static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int p(int[] iArr) {
        int i4 = -1;
        for (int i5 : iArr) {
            i4 = Math.max(i4, i5);
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[EDGE_INSN: B:17:0x0027->B:18:0x0027 BREAK  A[LOOP:0: B:5:0x000c->B:13:0x000c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[] q(com.google.zxing.common.b r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = r2
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.f(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.j.q(com.google.zxing.common.b, int, int, boolean, int, int):int[]");
    }

    private static int r(int i4) {
        return 2 << i4;
    }

    private static h s(com.google.zxing.common.b bVar, c cVar, p pVar, boolean z4, int i4, int i5) {
        h hVar = new h(cVar, z4);
        int i6 = 0;
        while (i6 < 2) {
            int i7 = i6 == 0 ? 1 : -1;
            int c5 = (int) pVar.c();
            for (int d5 = (int) pVar.d(); d5 <= cVar.e() && d5 >= cVar.g(); d5 += i7) {
                d k4 = k(bVar, 0, bVar.o(), z4, c5, d5, i4, i5);
                if (k4 != null) {
                    hVar.f(d5, k4);
                    c5 = z4 ? k4.d() : k4.b();
                }
            }
            i6++;
        }
        return hVar;
    }

    private static int t(f fVar, int i4, int i5, boolean z4) {
        int i6 = z4 ? 1 : -1;
        int i7 = i4 - i6;
        d b5 = u(fVar, i7) ? fVar.n(i7).b(i5) : null;
        if (b5 != null) {
            return z4 ? b5.b() : b5.d();
        }
        d c5 = fVar.n(i4).c(i5);
        if (c5 != null) {
            return z4 ? c5.d() : c5.b();
        }
        if (u(fVar, i7)) {
            c5 = fVar.n(i7).c(i5);
        }
        if (c5 != null) {
            return z4 ? c5.b() : c5.d();
        }
        int i10 = 0;
        while (true) {
            i4 -= i6;
            if (!u(fVar, i4)) {
                c m4 = fVar.m();
                return z4 ? m4.f() : m4.d();
            }
            for (d dVar : fVar.n(i4).d()) {
                if (dVar != null) {
                    return y.a(dVar.b(), dVar.d(), i6 * i10, z4 ? dVar.b() : dVar.d());
                }
            }
            i10++;
        }
    }

    private static boolean u(f fVar, int i4) {
        return i4 >= 0 && i4 <= fVar.j() + 1;
    }

    private static f v(h hVar, h hVar2) throws NotFoundException {
        a l4;
        if ((hVar == null && hVar2 == null) || (l4 = l(hVar, hVar2)) == null) {
            return null;
        }
        return new f(l4, c.j(a(hVar), a(hVar2)));
    }

    public static String w(b[][] bVarArr) {
        Formatter formatter = new Formatter();
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            try {
                formatter.format(ProtectedSandApp.s("ఝ\u0001"), Integer.valueOf(i4));
                int i5 = 0;
                while (true) {
                    b[] bVarArr2 = bVarArr[i4];
                    if (i5 < bVarArr2.length) {
                        b bVar = bVarArr2[i5];
                        if (bVar.b().length == 0) {
                            formatter.format(ProtectedSandApp.s("ఞ\u0001"), null);
                        } else {
                            formatter.format(ProtectedSandApp.s("ట\u0001"), Integer.valueOf(bVar.b()[0]), bVar.a(bVar.b()[0]));
                        }
                        i5++;
                    }
                }
                formatter.format(ProtectedSandApp.s("ఠ\u0001"), new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }

    private static void x(int[] iArr, int i4) throws FormatException {
        if (iArr.length < 4) {
            throw FormatException.a();
        }
        int i5 = iArr[0];
        if (i5 > iArr.length) {
            throw FormatException.a();
        }
        if (i5 == 0) {
            if (i4 >= iArr.length) {
                throw FormatException.a();
            }
            iArr[0] = iArr.length - i4;
        }
    }
}
