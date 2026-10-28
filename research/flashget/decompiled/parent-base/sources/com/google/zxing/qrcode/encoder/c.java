package com.google.zxing.qrcode.encoder;

import androidx.collection.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.h;
import com.google.zxing.qrcode.decoder.j;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Encoder.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    static final String f63343b = ProtectedSandApp.s("\u0c4e\u0001");

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f63342a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* compiled from: Encoder.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63344a;

        static {
            int[] iArr = new int[h.values().length];
            f63344a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63344a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63344a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63344a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private c() {
    }

    static void a(String str, com.google.zxing.common.a aVar, String str2) throws WriterException {
        try {
            for (byte b5 : str.getBytes(str2)) {
                aVar.d(b5, 8);
            }
        } catch (UnsupportedEncodingException e4) {
            throw new WriterException(e4);
        }
    }

    static void b(CharSequence charSequence, com.google.zxing.common.a aVar) throws WriterException {
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length) {
            int r4 = r(charSequence.charAt(i4));
            if (r4 == -1) {
                throw new WriterException();
            }
            int i5 = i4 + 1;
            if (i5 < length) {
                int r5 = r(charSequence.charAt(i5));
                if (r5 == -1) {
                    throw new WriterException();
                }
                aVar.d((r4 * 45) + r5, 11);
                i4 += 2;
            } else {
                aVar.d(r4, 6);
                i4 = i5;
            }
        }
    }

    static void c(String str, h hVar, com.google.zxing.common.a aVar, String str2) throws WriterException {
        int i4 = a.f63344a[hVar.ordinal()];
        if (i4 == 1) {
            h(str, aVar);
            return;
        }
        if (i4 == 2) {
            b(str, aVar);
            return;
        }
        if (i4 == 3) {
            a(str, aVar, str2);
        } else if (i4 == 4) {
            e(str, aVar);
        } else {
            throw new WriterException(ProtectedSandApp.s("\u0c4f\u0001").concat(String.valueOf(hVar)));
        }
    }

    private static void d(com.google.zxing.common.d dVar, com.google.zxing.common.a aVar) {
        aVar.d(h.ECI.getBits(), 4);
        aVar.d(dVar.getValue(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[LOOP:0: B:6:0x0013->B:13:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void e(java.lang.String r6, com.google.zxing.common.a r7) throws com.google.zxing.WriterException {
        /*
            java.lang.String r0 = "\u0c50\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.io.UnsupportedEncodingException -> L68
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L68
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 != 0) goto L5c
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = 0
        L13:
            if (r1 >= r0) goto L5b
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L2f
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L2f
        L2d:
            int r2 = r2 - r3
            goto L3e
        L2f:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L3d
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L3d
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L2d
        L3d:
            r2 = r4
        L3e:
            if (r2 == r4) goto L4f
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.d(r3, r2)
            int r1 = r1 + 2
            goto L13
        L4f:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "\u0c51\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L5b:
            return
        L5c:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "\u0c52\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L68:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.c.e(java.lang.String, com.google.zxing.common.a):void");
    }

    static void f(int i4, j jVar, h hVar, com.google.zxing.common.a aVar) throws WriterException {
        int characterCountBits = hVar.getCharacterCountBits(jVar);
        int i5 = 1 << characterCountBits;
        if (i4 < i5) {
            aVar.d(i4, characterCountBits);
            return;
        }
        throw new WriterException(i4 + ProtectedSandApp.s("\u0c53\u0001") + (i5 - 1));
    }

    static void g(h hVar, com.google.zxing.common.a aVar) {
        aVar.d(hVar.getBits(), 4);
    }

    static void h(CharSequence charSequence, com.google.zxing.common.a aVar) {
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length) {
            int charAt = charSequence.charAt(i4) - '0';
            int i5 = i4 + 2;
            if (i5 < length) {
                aVar.d(((charSequence.charAt(i4 + 1) - '0') * 10) + (charAt * 100) + (charSequence.charAt(i5) - '0'), 10);
                i4 += 3;
            } else {
                i4++;
                if (i4 < length) {
                    aVar.d((charAt * 10) + (charSequence.charAt(i4) - '0'), 7);
                    i4 = i5;
                } else {
                    aVar.d(charAt, 4);
                }
            }
        }
    }

    private static int i(h hVar, com.google.zxing.common.a aVar, com.google.zxing.common.a aVar2, j jVar) {
        return aVar2.o() + hVar.getCharacterCountBits(jVar) + aVar.o();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(com.google.zxing.common.a aVar, com.google.zxing.qrcode.decoder.f fVar, j jVar, b bVar) throws WriterException {
        int i4 = Integer.MAX_VALUE;
        int i5 = -1;
        for (int i6 = 0; i6 < 8; i6++) {
            e.a(aVar, fVar, jVar, i6, bVar);
            int j4 = j(bVar);
            if (j4 < i4) {
                i5 = i6;
                i4 = j4;
            }
        }
        return i5;
    }

    public static h l(String str) {
        return m(str, null);
    }

    private static h m(String str, String str2) {
        if (ProtectedSandApp.s("\u0c50\u0001").equals(str2) && u(str)) {
            return h.KANJI;
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (charAt >= '0' && charAt <= '9') {
                z5 = true;
            } else {
                if (r(charAt) == -1) {
                    return h.BYTE;
                }
                z4 = true;
            }
        }
        return z4 ? h.ALPHANUMERIC : z5 ? h.NUMERIC : h.BYTE;
    }

    private static j n(int i4, com.google.zxing.qrcode.decoder.f fVar) throws WriterException {
        for (int i5 = 1; i5 <= 40; i5++) {
            j i6 = j.i(i5);
            if (x(i4, i6, fVar)) {
                return i6;
            }
        }
        throw new WriterException(ProtectedSandApp.s("\u0c54\u0001"));
    }

    public static f o(String str, com.google.zxing.qrcode.decoder.f fVar) throws WriterException {
        return p(str, fVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
    
        if (com.google.zxing.qrcode.encoder.f.f(r8) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.zxing.qrcode.encoder.f p(java.lang.String r6, com.google.zxing.qrcode.decoder.f r7, java.util.Map<com.google.zxing.f, ?> r8) throws com.google.zxing.WriterException {
        /*
            if (r8 == 0) goto Lc
            com.google.zxing.f r0 = com.google.zxing.f.CHARACTER_SET
            boolean r0 = r8.containsKey(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L1a
            com.google.zxing.f r1 = com.google.zxing.f.CHARACTER_SET
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            goto L20
        L1a:
            java.lang.String r1 = "\u0c4e\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
        L20:
            com.google.zxing.qrcode.decoder.h r2 = m(r6, r1)
            com.google.zxing.common.a r3 = new com.google.zxing.common.a
            r3.<init>()
            com.google.zxing.qrcode.decoder.h r4 = com.google.zxing.qrcode.decoder.h.BYTE
            if (r2 != r4) goto L38
            if (r0 == 0) goto L38
            com.google.zxing.common.d r0 = com.google.zxing.common.d.getCharacterSetECIByName(r1)
            if (r0 == 0) goto L38
            d(r0, r3)
        L38:
            if (r8 == 0) goto L55
            com.google.zxing.f r0 = com.google.zxing.f.GS1_FORMAT
            boolean r5 = r8.containsKey(r0)
            if (r5 == 0) goto L55
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L55
            com.google.zxing.qrcode.decoder.h r0 = com.google.zxing.qrcode.decoder.h.FNC1_FIRST_POSITION
            g(r0, r3)
        L55:
            g(r2, r3)
            com.google.zxing.common.a r0 = new com.google.zxing.common.a
            r0.<init>()
            c(r6, r2, r0, r1)
            if (r8 == 0) goto L91
            com.google.zxing.f r1 = com.google.zxing.f.QR_VERSION
            boolean r5 = r8.containsKey(r1)
            if (r5 == 0) goto L91
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            com.google.zxing.qrcode.decoder.j r1 = com.google.zxing.qrcode.decoder.j.i(r1)
            int r5 = i(r2, r3, r0, r1)
            boolean r5 = x(r5, r1, r7)
            if (r5 == 0) goto L85
            goto L95
        L85:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "ౕ\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L91:
            com.google.zxing.qrcode.decoder.j r1 = v(r7, r2, r3, r0)
        L95:
            com.google.zxing.common.a r5 = new com.google.zxing.common.a
            r5.<init>()
            r5.c(r3)
            if (r2 != r4) goto La4
            int r6 = r0.p()
            goto La8
        La4:
            int r6 = r6.length()
        La8:
            f(r6, r1, r2, r5)
            r5.c(r0)
            com.google.zxing.qrcode.decoder.j$b r6 = r1.f(r7)
            int r0 = r1.h()
            int r3 = r6.d()
            int r0 = r0 - r3
            w(r0, r5)
            int r3 = r1.h()
            int r6 = r6.c()
            com.google.zxing.common.a r6 = t(r5, r3, r0, r6)
            com.google.zxing.qrcode.encoder.f r0 = new com.google.zxing.qrcode.encoder.f
            r0.<init>()
            r0.g(r7)
            r0.j(r2)
            r0.k(r1)
            int r2 = r1.e()
            com.google.zxing.qrcode.encoder.b r3 = new com.google.zxing.qrcode.encoder.b
            r3.<init>(r2, r2)
            r2 = -1
            if (r8 == 0) goto Lff
            com.google.zxing.f r4 = com.google.zxing.f.QR_MASK_PATTERN
            boolean r5 = r8.containsKey(r4)
            if (r5 == 0) goto Lff
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = r8.toString()
            int r8 = java.lang.Integer.parseInt(r8)
            boolean r4 = com.google.zxing.qrcode.encoder.f.f(r8)
            if (r4 == 0) goto Lff
            goto L100
        Lff:
            r8 = r2
        L100:
            if (r8 != r2) goto L106
            int r8 = k(r6, r7, r1, r3)
        L106:
            r0.h(r8)
            com.google.zxing.qrcode.encoder.e.a(r6, r7, r1, r8, r3)
            r0.i(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.c.p(java.lang.String, com.google.zxing.qrcode.decoder.f, java.util.Map):com.google.zxing.qrcode.encoder.f");
    }

    static byte[] q(byte[] bArr, int i4) {
        int length = bArr.length;
        int[] iArr = new int[length + i4];
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = bArr[i5] & 255;
        }
        new com.google.zxing.common.reedsolomon.d(com.google.zxing.common.reedsolomon.a.f62815l).b(iArr, i4);
        byte[] bArr2 = new byte[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            bArr2[i6] = (byte) iArr[length + i6];
        }
        return bArr2;
    }

    static int r(int i4) {
        int[] iArr = f63342a;
        if (i4 < iArr.length) {
            return iArr[i4];
        }
        return -1;
    }

    static void s(int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2) throws WriterException {
        if (i7 >= i6) {
            throw new WriterException(ProtectedSandApp.s("ౙ\u0001"));
        }
        int i10 = i4 % i6;
        int i11 = i6 - i10;
        int i12 = i4 / i6;
        int i13 = i12 + 1;
        int i14 = i5 / i6;
        int i15 = i14 + 1;
        int i16 = i12 - i14;
        int i17 = i13 - i15;
        if (i16 != i17) {
            throw new WriterException(ProtectedSandApp.s("ౘ\u0001"));
        }
        if (i6 != i11 + i10) {
            throw new WriterException(ProtectedSandApp.s("\u0c57\u0001"));
        }
        if (i4 != ((i15 + i17) * i10) + ((i14 + i16) * i11)) {
            throw new WriterException(ProtectedSandApp.s("ౖ\u0001"));
        }
        if (i7 < i11) {
            iArr[0] = i14;
            iArr2[0] = i16;
        } else {
            iArr[0] = i15;
            iArr2[0] = i17;
        }
    }

    static com.google.zxing.common.a t(com.google.zxing.common.a aVar, int i4, int i5, int i6) throws WriterException {
        if (aVar.p() != i5) {
            throw new WriterException(ProtectedSandApp.s("\u0c5e\u0001"));
        }
        ArrayList arrayList = new ArrayList(i6);
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i6; i12++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            s(i4, i5, i6, i12, iArr, iArr2);
            int i13 = iArr[0];
            byte[] bArr = new byte[i13];
            aVar.w(i7 << 3, bArr, 0, i13);
            byte[] q4 = q(bArr, iArr2[0]);
            arrayList.add(new com.google.zxing.qrcode.encoder.a(bArr, q4));
            i10 = Math.max(i10, i13);
            i11 = Math.max(i11, q4.length);
            i7 += iArr[0];
        }
        if (i5 != i7) {
            throw new WriterException(ProtectedSandApp.s("ౝ\u0001"));
        }
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        for (int i14 = 0; i14 < i10; i14++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] a5 = ((com.google.zxing.qrcode.encoder.a) it.next()).a();
                if (i14 < a5.length) {
                    aVar2.d(a5[i14], 8);
                }
            }
        }
        for (int i15 = 0; i15 < i11; i15++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] b5 = ((com.google.zxing.qrcode.encoder.a) it2.next()).b();
                if (i15 < b5.length) {
                    aVar2.d(b5[i15], 8);
                }
            }
        }
        if (i4 == aVar2.p()) {
            return aVar2;
        }
        StringBuilder a6 = s.a(ProtectedSandApp.s("ౚ\u0001"), i4, ProtectedSandApp.s("\u0c5b\u0001"));
        a6.append(aVar2.p());
        a6.append(ProtectedSandApp.s("\u0c5c\u0001"));
        throw new WriterException(a6.toString());
    }

    private static boolean u(String str) {
        try {
            byte[] bytes = str.getBytes(ProtectedSandApp.s("\u0c50\u0001"));
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i4 = 0; i4 < length; i4 += 2) {
                int i5 = bytes[i4] & 255;
                if ((i5 < 129 || i5 > 159) && (i5 < 224 || i5 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static j v(com.google.zxing.qrcode.decoder.f fVar, h hVar, com.google.zxing.common.a aVar, com.google.zxing.common.a aVar2) throws WriterException {
        return n(i(hVar, aVar, aVar2, n(i(hVar, aVar, aVar2, j.i(1)), fVar)), fVar);
    }

    static void w(int i4, com.google.zxing.common.a aVar) throws WriterException {
        int i5 = i4 << 3;
        if (aVar.o() > i5) {
            throw new WriterException(ProtectedSandApp.s("ౠ\u0001") + aVar.o() + ProtectedSandApp.s("ౡ\u0001") + i5);
        }
        for (int i6 = 0; i6 < 4 && aVar.o() < i5; i6++) {
            aVar.b(false);
        }
        int o4 = aVar.o() & 7;
        if (o4 > 0) {
            while (o4 < 8) {
                aVar.b(false);
                o4++;
            }
        }
        int p4 = i4 - aVar.p();
        for (int i7 = 0; i7 < p4; i7++) {
            aVar.d((i7 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.o() != i5) {
            throw new WriterException(ProtectedSandApp.s("\u0c5f\u0001"));
        }
    }

    private static boolean x(int i4, j jVar, com.google.zxing.qrcode.decoder.f fVar) {
        return jVar.h() - jVar.f(fVar).d() >= (i4 + 7) / 8;
    }
}
