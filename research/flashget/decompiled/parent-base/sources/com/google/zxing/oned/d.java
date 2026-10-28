package com.google.zxing.oned;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: Code128Writer.java */
/* loaded from: classes6.dex */
public final class d extends s {

    /* renamed from: b, reason: collision with root package name */
    private static final int f63002b = 103;

    /* renamed from: c, reason: collision with root package name */
    private static final int f63003c = 104;

    /* renamed from: d, reason: collision with root package name */
    private static final int f63004d = 105;

    /* renamed from: e, reason: collision with root package name */
    private static final int f63005e = 101;

    /* renamed from: f, reason: collision with root package name */
    private static final int f63006f = 100;

    /* renamed from: g, reason: collision with root package name */
    private static final int f63007g = 99;

    /* renamed from: h, reason: collision with root package name */
    private static final int f63008h = 106;

    /* renamed from: i, reason: collision with root package name */
    private static final char f63009i = 241;

    /* renamed from: j, reason: collision with root package name */
    private static final char f63010j = 242;

    /* renamed from: k, reason: collision with root package name */
    private static final char f63011k = 243;

    /* renamed from: l, reason: collision with root package name */
    private static final char f63012l = 244;

    /* renamed from: m, reason: collision with root package name */
    private static final int f63013m = 102;

    /* renamed from: n, reason: collision with root package name */
    private static final int f63014n = 97;

    /* renamed from: o, reason: collision with root package name */
    private static final int f63015o = 96;

    /* renamed from: p, reason: collision with root package name */
    private static final int f63016p = 101;

    /* renamed from: q, reason: collision with root package name */
    private static final int f63017q = 100;

    /* compiled from: Code128Writer.java */
    private enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int i(CharSequence charSequence, int i4, int i5) {
        a j4;
        a j5;
        char charAt;
        a j6 = j(charSequence, i4);
        a aVar = a.ONE_DIGIT;
        if (j6 == aVar) {
            return i5 == 101 ? 101 : 100;
        }
        a aVar2 = a.UNCODABLE;
        if (j6 == aVar2) {
            return (i4 >= charSequence.length() || ((charAt = charSequence.charAt(i4)) >= ' ' && (i5 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) ? 100 : 101;
        }
        if (i5 == 101 && j6 == a.FNC_1) {
            return 101;
        }
        if (i5 == 99) {
            return 99;
        }
        if (i5 != 100) {
            if (j6 == a.FNC_1) {
                j6 = j(charSequence, i4 + 1);
            }
            return j6 == a.TWO_DIGITS ? 99 : 100;
        }
        a aVar3 = a.FNC_1;
        if (j6 == aVar3 || (j4 = j(charSequence, i4 + 2)) == aVar2 || j4 == aVar) {
            return 100;
        }
        if (j4 == aVar3) {
            return j(charSequence, i4 + 3) == a.TWO_DIGITS ? 99 : 100;
        }
        int i6 = i4 + 4;
        while (true) {
            j5 = j(charSequence, i6);
            if (j5 != a.TWO_DIGITS) {
                break;
            }
            i6 += 2;
        }
        return j5 == a.ONE_DIGIT ? 100 : 99;
    }

    private static a j(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        if (i4 >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i4);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i5 = i4 + 1;
        if (i5 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i5);
        return (charAt2 < '0' || charAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // com.google.zxing.oned.s
    public boolean[] e(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException(ProtectedSandApp.s("૨\u0001").concat(String.valueOf(length)));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt > 127) {
                        throw new IllegalArgumentException(ProtectedSandApp.s("૧\u0001").concat(String.valueOf(charAt)));
                    }
                    break;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        int i7 = 0;
        int i10 = 0;
        int i11 = 1;
        while (true) {
            int i12 = 103;
            if (i6 >= length) {
                int[][] iArr = c.f62986a;
                arrayList.add(iArr[i7 % 103]);
                arrayList.add(iArr[106]);
                Iterator it = arrayList.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    for (int i14 : (int[]) it.next()) {
                        i13 += i14;
                    }
                }
                boolean[] zArr = new boolean[i13];
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    i4 += s.c(zArr, i4, (int[]) it2.next(), true);
                }
                return zArr;
            }
            int i15 = i(str, i6, i10);
            int i16 = 100;
            if (i15 == i10) {
                switch (str.charAt(i6)) {
                    case 241:
                        i16 = 102;
                        break;
                    case 242:
                        i16 = 97;
                        break;
                    case 243:
                        i16 = 96;
                        break;
                    case 244:
                        if (i10 == 101) {
                            i16 = 101;
                            break;
                        }
                        break;
                    default:
                        if (i10 != 100) {
                            if (i10 != 101) {
                                i16 = Integer.parseInt(str.substring(i6, i6 + 2));
                                i6++;
                                break;
                            } else {
                                char charAt2 = str.charAt(i6);
                                i16 = charAt2 - ' ';
                                if (i16 < 0) {
                                    i16 = charAt2 + '@';
                                    break;
                                }
                            }
                        } else {
                            i16 = str.charAt(i6) - ' ';
                            break;
                        }
                        break;
                }
                i6++;
            } else {
                if (i10 != 0) {
                    i12 = i15;
                } else if (i15 == 100) {
                    i12 = 104;
                } else if (i15 != 101) {
                    i12 = 105;
                }
                i16 = i12;
                i10 = i15;
            }
            arrayList.add(c.f62986a[i16]);
            i7 += i16 * i11;
            if (i6 != 0) {
                i11++;
            }
        }
    }

    @Override // com.google.zxing.oned.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.CODE_128);
    }
}
