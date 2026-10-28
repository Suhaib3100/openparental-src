package com.google.zxing.datamatrix.decoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.text.m0;
import org.apache.commons.lang3.m;

/* compiled from: DecodedBitStreamParser.java */
/* loaded from: classes6.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f62836a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f62837b;

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f62838c;

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f62839d;

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f62840e;

    /* compiled from: DecodedBitStreamParser.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62841a;

        static {
            int[] iArr = new int[b.values().length];
            f62841a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62841a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62841a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62841a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62841a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: DecodedBitStreamParser.java */
    private enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', m0.quote, '#', '$', '%', m0.amp, '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', m0.less, '=', m0.greater, '?', '@', '[', '\\', ']', '^', '_'};
        f62837b = cArr;
        f62838c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        f62839d = cArr;
        f62840e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', com.google.common.base.c.N};
    }

    private c() {
    }

    static com.google.zxing.common.e a(byte[] bArr) throws FormatException {
        com.google.zxing.common.c cVar = new com.google.zxing.common.c(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b bVar = b.ASCII_ENCODE;
        do {
            b bVar2 = b.ASCII_ENCODE;
            if (bVar == bVar2) {
                bVar = c(cVar, sb, sb2);
            } else {
                int i4 = a.f62841a[bVar.ordinal()];
                if (i4 == 1) {
                    e(cVar, sb);
                } else if (i4 == 2) {
                    g(cVar, sb);
                } else if (i4 == 3) {
                    b(cVar, sb);
                } else if (i4 == 4) {
                    f(cVar, sb);
                } else {
                    if (i4 != 5) {
                        throw FormatException.a();
                    }
                    d(cVar, sb, arrayList);
                }
                bVar = bVar2;
            }
            if (bVar == b.PAD_ENCODE) {
                break;
            }
        } while (cVar.a() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String sb3 = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new com.google.zxing.common.e(bArr, sb3, arrayList, null);
    }

    private static void b(com.google.zxing.common.c cVar, StringBuilder sb) throws FormatException {
        int d5;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (d5 = cVar.d(8)) != 254) {
            h(d5, cVar.d(8), iArr);
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = iArr[i4];
                if (i5 == 0) {
                    sb.append(m.f86065d);
                } else if (i5 == 1) {
                    sb.append('*');
                } else if (i5 == 2) {
                    sb.append(m0.greater);
                } else if (i5 == 3) {
                    sb.append(' ');
                } else if (i5 < 14) {
                    sb.append((char) (i5 + 44));
                } else {
                    if (i5 >= 40) {
                        throw FormatException.a();
                    }
                    sb.append((char) (i5 + 51));
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static b c(com.google.zxing.common.c cVar, StringBuilder sb, StringBuilder sb2) throws FormatException {
        boolean z4 = false;
        do {
            int d5 = cVar.d(8);
            if (d5 == 0) {
                throw FormatException.a();
            }
            if (d5 > 128) {
                if (d5 != 129) {
                    if (d5 > 229) {
                        String s4 = ProtectedSandApp.s("ઇ\u0001");
                        switch (d5) {
                            case 230:
                                return b.C40_ENCODE;
                            case 231:
                                return b.BASE256_ENCODE;
                            case 232:
                                sb.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z4 = true;
                                break;
                            case 236:
                                sb.append(ProtectedSandApp.s("ઉ\u0001"));
                                sb2.insert(0, s4);
                                break;
                            case 237:
                                sb.append(ProtectedSandApp.s("ઈ\u0001"));
                                sb2.insert(0, s4);
                                break;
                            case 238:
                                return b.ANSIX12_ENCODE;
                            case 239:
                                return b.TEXT_ENCODE;
                            case 240:
                                return b.EDIFACT_ENCODE;
                            default:
                                if (d5 != 254 || cVar.a() != 0) {
                                    throw FormatException.a();
                                }
                                break;
                        }
                    } else {
                        int i4 = d5 - 130;
                        if (i4 < 10) {
                            sb.append('0');
                        }
                        sb.append(i4);
                    }
                } else {
                    return b.PAD_ENCODE;
                }
            } else {
                if (z4) {
                    d5 += 128;
                }
                sb.append((char) (d5 - 1));
                return b.ASCII_ENCODE;
            }
        } while (cVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    private static void d(com.google.zxing.common.c cVar, StringBuilder sb, Collection<byte[]> collection) throws FormatException {
        int c5 = cVar.c();
        int i4 = c5 + 2;
        int i5 = i(cVar.d(8), c5 + 1);
        if (i5 == 0) {
            i5 = cVar.a() / 8;
        } else if (i5 >= 250) {
            i5 = ((i5 - 249) * 250) + i(cVar.d(8), i4);
            i4 = c5 + 3;
        }
        if (i5 < 0) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i5];
        int i6 = 0;
        while (i6 < i5) {
            if (cVar.a() < 8) {
                throw FormatException.a();
            }
            bArr[i6] = (byte) i(cVar.d(8), i4);
            i6++;
            i4++;
        }
        collection.add(bArr);
        try {
            sb.append(new String(bArr, ProtectedSandApp.s("ઊ\u0001")));
        } catch (UnsupportedEncodingException e4) {
            throw new IllegalStateException(ProtectedSandApp.s("ઋ\u0001").concat(String.valueOf(e4)));
        }
    }

    private static void e(com.google.zxing.common.c cVar, StringBuilder sb) throws FormatException {
        int d5;
        int[] iArr = new int[3];
        boolean z4 = false;
        int i4 = 0;
        while (cVar.a() != 8 && (d5 = cVar.d(8)) != 254) {
            h(d5, cVar.d(8), iArr);
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr[i5];
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            char[] cArr = f62837b;
                            if (i6 < cArr.length) {
                                char c5 = cArr[i6];
                                if (z4) {
                                    sb.append((char) (c5 + 128));
                                    z4 = false;
                                } else {
                                    sb.append(c5);
                                }
                            } else if (i6 == 27) {
                                sb.append((char) 29);
                            } else {
                                if (i6 != 30) {
                                    throw FormatException.a();
                                }
                                z4 = true;
                            }
                            i4 = 0;
                        } else {
                            if (i4 != 3) {
                                throw FormatException.a();
                            }
                            if (z4) {
                                sb.append((char) (i6 + 224));
                                z4 = false;
                                i4 = 0;
                            } else {
                                sb.append((char) (i6 + 96));
                                i4 = 0;
                            }
                        }
                    } else if (z4) {
                        sb.append((char) (i6 + 128));
                        z4 = false;
                        i4 = 0;
                    } else {
                        sb.append((char) i6);
                        i4 = 0;
                    }
                } else if (i6 < 3) {
                    i4 = i6 + 1;
                } else {
                    char[] cArr2 = f62836a;
                    if (i6 >= cArr2.length) {
                        throw FormatException.a();
                    }
                    char c6 = cArr2[i6];
                    if (z4) {
                        sb.append((char) (c6 + 128));
                        z4 = false;
                    } else {
                        sb.append(c6);
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void f(com.google.zxing.common.c cVar, StringBuilder sb) {
        while (cVar.a() > 16) {
            for (int i4 = 0; i4 < 4; i4++) {
                int d5 = cVar.d(6);
                if (d5 == 31) {
                    int b5 = 8 - cVar.b();
                    if (b5 != 8) {
                        cVar.d(b5);
                        return;
                    }
                    return;
                }
                if ((d5 & 32) == 0) {
                    d5 |= 64;
                }
                sb.append((char) d5);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void g(com.google.zxing.common.c cVar, StringBuilder sb) throws FormatException {
        int d5;
        int[] iArr = new int[3];
        boolean z4 = false;
        int i4 = 0;
        while (cVar.a() != 8 && (d5 = cVar.d(8)) != 254) {
            h(d5, cVar.d(8), iArr);
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr[i5];
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            char[] cArr = f62839d;
                            if (i6 < cArr.length) {
                                char c5 = cArr[i6];
                                if (z4) {
                                    sb.append((char) (c5 + 128));
                                    z4 = false;
                                } else {
                                    sb.append(c5);
                                }
                            } else if (i6 == 27) {
                                sb.append((char) 29);
                            } else {
                                if (i6 != 30) {
                                    throw FormatException.a();
                                }
                                z4 = true;
                            }
                            i4 = 0;
                        } else {
                            if (i4 != 3) {
                                throw FormatException.a();
                            }
                            char[] cArr2 = f62840e;
                            if (i6 >= cArr2.length) {
                                throw FormatException.a();
                            }
                            char c6 = cArr2[i6];
                            if (z4) {
                                sb.append((char) (c6 + 128));
                                z4 = false;
                                i4 = 0;
                            } else {
                                sb.append(c6);
                                i4 = 0;
                            }
                        }
                    } else if (z4) {
                        sb.append((char) (i6 + 128));
                        z4 = false;
                        i4 = 0;
                    } else {
                        sb.append((char) i6);
                        i4 = 0;
                    }
                } else if (i6 < 3) {
                    i4 = i6 + 1;
                } else {
                    char[] cArr3 = f62838c;
                    if (i6 >= cArr3.length) {
                        throw FormatException.a();
                    }
                    char c7 = cArr3[i6];
                    if (z4) {
                        sb.append((char) (c7 + 128));
                        z4 = false;
                    } else {
                        sb.append(c7);
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void h(int i4, int i5, int[] iArr) {
        int i6 = ((i4 << 8) + i5) - 1;
        int i7 = i6 / 1600;
        iArr[0] = i7;
        int i10 = i6 - (i7 * 1600);
        int i11 = i10 / 40;
        iArr[1] = i11;
        iArr[2] = i10 - (i11 * 40);
    }

    private static int i(int i4, int i5) {
        int i6 = i4 - (((i5 * 149) % 255) + 1);
        return i6 >= 0 ? i6 : i6 + 256;
    }
}
