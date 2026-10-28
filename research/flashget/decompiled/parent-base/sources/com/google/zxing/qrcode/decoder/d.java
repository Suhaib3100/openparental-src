package com.google.zxing.qrcode.decoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import com.google.zxing.common.l;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: DecodedBitStreamParser.java */
/* loaded from: classes6.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f63292a = ProtectedSandApp.s("\u0c3a\u0001").toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private static final int f63293b = 1;

    /* compiled from: DecodedBitStreamParser.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63294a;

        static {
            int[] iArr = new int[h.values().length];
            f63294a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63294a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63294a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63294a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63294a[h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63294a[h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63294a[h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f63294a[h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f63294a[h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f63294a[h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private d() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.google.zxing.common.e a(byte[] bArr, j jVar, f fVar, Map<com.google.zxing.d, ?> map) throws FormatException {
        h hVar;
        com.google.zxing.common.c cVar = new com.google.zxing.common.c(bArr);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i4 = -1;
        int i5 = -1;
        boolean z4 = false;
        com.google.zxing.common.d dVar = null;
        do {
            try {
                h forBits = cVar.a() < 4 ? h.TERMINATOR : h.forBits(cVar.d(4));
                int[] iArr = a.f63294a;
                switch (iArr[forBits.ordinal()]) {
                    case 5:
                        hVar = forBits;
                        break;
                    case 6:
                    case 7:
                        hVar = forBits;
                        z4 = true;
                        break;
                    case 8:
                        hVar = forBits;
                        if (cVar.a() < 16) {
                            throw FormatException.a();
                        }
                        int d5 = cVar.d(8);
                        i5 = cVar.d(8);
                        i4 = d5;
                        break;
                    case 9:
                        hVar = forBits;
                        dVar = com.google.zxing.common.d.getCharacterSetECIByValue(g(cVar));
                        if (dVar == null) {
                            throw FormatException.a();
                        }
                        break;
                    case 10:
                        hVar = forBits;
                        int d6 = cVar.d(4);
                        int d7 = cVar.d(hVar.getCharacterCountBits(jVar));
                        if (d6 == 1) {
                            d(cVar, sb, d7);
                        }
                        break;
                    default:
                        int d10 = cVar.d(forBits.getCharacterCountBits(jVar));
                        int i6 = iArr[forBits.ordinal()];
                        if (i6 == 1) {
                            hVar = forBits;
                            f(cVar, sb, d10);
                        } else if (i6 == 2) {
                            hVar = forBits;
                            b(cVar, sb, d10, z4);
                        } else if (i6 == 3) {
                            hVar = forBits;
                            c(cVar, sb, d10, dVar, arrayList, map);
                        } else {
                            if (i6 != 4) {
                                throw FormatException.a();
                            }
                            e(cVar, sb, d10);
                            hVar = forBits;
                        }
                        break;
                }
            } catch (IllegalArgumentException unused) {
                throw FormatException.a();
            }
        } while (hVar != h.TERMINATOR);
        return new com.google.zxing.common.e(bArr, sb.toString(), arrayList.isEmpty() ? null : arrayList, fVar == null ? null : fVar.toString(), i4, i5);
    }

    private static void b(com.google.zxing.common.c cVar, StringBuilder sb, int i4, boolean z4) throws FormatException {
        while (i4 > 1) {
            if (cVar.a() < 11) {
                throw FormatException.a();
            }
            int d5 = cVar.d(11);
            sb.append(h(d5 / 45));
            sb.append(h(d5 % 45));
            i4 -= 2;
        }
        if (i4 == 1) {
            if (cVar.a() < 6) {
                throw FormatException.a();
            }
            sb.append(h(cVar.d(6)));
        }
        if (z4) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i5 = length + 1;
                        if (sb.charAt(i5) == '%') {
                            sb.deleteCharAt(i5);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    private static void c(com.google.zxing.common.c cVar, StringBuilder sb, int i4, com.google.zxing.common.d dVar, Collection<byte[]> collection, Map<com.google.zxing.d, ?> map) throws FormatException {
        if ((i4 << 3) > cVar.a()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) cVar.d(8);
        }
        try {
            sb.append(new String(bArr, dVar == null ? l.a(bArr, map) : dVar.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.a();
        }
    }

    private static void d(com.google.zxing.common.c cVar, StringBuilder sb, int i4) throws FormatException {
        if (i4 * 13 > cVar.a()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i4 * 2];
        int i5 = 0;
        while (i4 > 0) {
            int d5 = cVar.d(13);
            int i6 = (d5 % 96) | ((d5 / 96) << 8);
            int i7 = i6 + (i6 < 2560 ? 41377 : 42657);
            bArr[i5] = (byte) (i7 >> 8);
            bArr[i5 + 1] = (byte) i7;
            i5 += 2;
            i4--;
        }
        try {
            sb.append(new String(bArr, ProtectedSandApp.s("\u0c3b\u0001")));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.a();
        }
    }

    private static void e(com.google.zxing.common.c cVar, StringBuilder sb, int i4) throws FormatException {
        if (i4 * 13 > cVar.a()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i4 * 2];
        int i5 = 0;
        while (i4 > 0) {
            int d5 = cVar.d(13);
            int i6 = (d5 % 192) | ((d5 / 192) << 8);
            int i7 = i6 + (i6 < 7936 ? 33088 : 49472);
            bArr[i5] = (byte) (i7 >> 8);
            bArr[i5 + 1] = (byte) i7;
            i5 += 2;
            i4--;
        }
        try {
            sb.append(new String(bArr, ProtectedSandApp.s("఼\u0001")));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.a();
        }
    }

    private static void f(com.google.zxing.common.c cVar, StringBuilder sb, int i4) throws FormatException {
        while (i4 >= 3) {
            if (cVar.a() < 10) {
                throw FormatException.a();
            }
            int d5 = cVar.d(10);
            if (d5 >= 1000) {
                throw FormatException.a();
            }
            sb.append(h(d5 / 100));
            sb.append(h((d5 / 10) % 10));
            sb.append(h(d5 % 10));
            i4 -= 3;
        }
        if (i4 == 2) {
            if (cVar.a() < 7) {
                throw FormatException.a();
            }
            int d6 = cVar.d(7);
            if (d6 >= 100) {
                throw FormatException.a();
            }
            sb.append(h(d6 / 10));
            sb.append(h(d6 % 10));
            return;
        }
        if (i4 == 1) {
            if (cVar.a() < 4) {
                throw FormatException.a();
            }
            int d7 = cVar.d(4);
            if (d7 >= 10) {
                throw FormatException.a();
            }
            sb.append(h(d7));
        }
    }

    private static int g(com.google.zxing.common.c cVar) throws FormatException {
        int d5 = cVar.d(8);
        if ((d5 & 128) == 0) {
            return d5 & 127;
        }
        if ((d5 & 192) == 128) {
            return cVar.d(8) | ((d5 & 63) << 8);
        }
        if ((d5 & 224) == 192) {
            return cVar.d(16) | ((d5 & 31) << 16);
        }
        throw FormatException.a();
    }

    private static char h(int i4) throws FormatException {
        char[] cArr = f63292a;
        if (i4 < cArr.length) {
            return cArr[i4];
        }
        throw FormatException.a();
    }
}
