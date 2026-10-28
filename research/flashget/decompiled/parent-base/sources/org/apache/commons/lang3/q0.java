package org.apache.commons.lang3;

import androidx.collection.q2;
import androidx.collection.r2;
import java.util.Random;
import org.apache.commons.text.j;

/* compiled from: RandomStringUtils.java */
/* loaded from: classes6.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Random f86075a = new Random();

    public static String a(int i4) {
        return b(i4, 0, 0, false, false);
    }

    public static String b(int i4, int i5, int i6, boolean z4, boolean z5) {
        return d(i4, i5, i6, z4, z5, null, f86075a);
    }

    public static String c(int i4, int i5, int i6, boolean z4, boolean z5, char... cArr) {
        return d(i4, i5, i6, z4, z5, cArr, f86075a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String d(int i4, int i5, int i6, boolean z4, boolean z5, char[] cArr, Random random) {
        char c5;
        if (i4 == 0) {
            return "";
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(r2.a("Requested random string length ", i4, " is less than 0."));
        }
        if (cArr != 0 && cArr.length == 0) {
            throw new IllegalArgumentException("The chars array must not be empty");
        }
        if (i5 == 0 && i6 == 0) {
            if (cArr != 0) {
                i6 = cArr.length;
            } else if (z4 || z5) {
                i6 = 123;
                i5 = 32;
            } else {
                i6 = j.b.f86462g;
            }
        } else if (i6 <= i5) {
            throw new IllegalArgumentException(q2.a("Parameter end (", i6, ") must be greater than start (", i5, ")"));
        }
        if (cArr == 0 && ((z5 && i6 <= 48) || (z4 && i6 <= 65))) {
            throw new IllegalArgumentException(r2.a("Parameter end (", i6, ") must be greater then (48) for generating digits or greater then (65) for generating letters."));
        }
        StringBuilder sb = new StringBuilder(i4);
        int i7 = i6 - i5;
        while (true) {
            int i10 = i4 - 1;
            if (i4 == 0) {
                return sb.toString();
            }
            if (cArr == 0) {
                c5 = random.nextInt(i7) + i5;
                int type = Character.getType(c5);
                if (type != 0 && type != 18 && type != 19) {
                }
            } else {
                c5 = cArr[random.nextInt(i7) + i5];
            }
            int charCount = Character.charCount(c5);
            if (i10 != 0 || charCount <= 1) {
                if ((z4 && Character.isLetter(c5)) || ((z5 && Character.isDigit(c5)) || (!z4 && !z5))) {
                    sb.appendCodePoint(c5);
                    i4 = charCount == 2 ? i4 - 2 : i10;
                }
            }
        }
    }

    public static String e(int i4, String str) {
        return str == null ? d(i4, 0, 0, false, false, null, f86075a) : g(i4, str.toCharArray());
    }

    public static String f(int i4, boolean z4, boolean z5) {
        return b(i4, 0, 0, z4, z5);
    }

    public static String g(int i4, char... cArr) {
        return cArr == null ? d(i4, 0, 0, false, false, null, f86075a) : d(i4, 0, cArr.length, false, false, cArr, f86075a);
    }

    public static String h(int i4) {
        return b(i4, 0, 0, true, false);
    }

    public static String i(int i4, int i5) {
        return b(r0.h(i4, i5), 0, 0, true, false);
    }

    public static String j(int i4) {
        return b(i4, 0, 0, true, true);
    }

    public static String k(int i4, int i5) {
        return b(r0.h(i4, i5), 0, 0, true, true);
    }

    public static String l(int i4) {
        return b(i4, 32, 127, false, false);
    }

    public static String m(int i4, int i5) {
        return l(r0.h(i4, i5));
    }

    public static String n(int i4) {
        return b(i4, 33, 126, false, false);
    }

    public static String o(int i4, int i5) {
        return n(r0.h(i4, i5));
    }

    public static String p(int i4) {
        return b(i4, 0, 0, false, true);
    }

    public static String q(int i4, int i5) {
        return b(r0.h(i4, i5), 0, 0, false, true);
    }

    public static String r(int i4) {
        return b(i4, 32, 126, false, false);
    }

    public static String s(int i4, int i5) {
        return r(r0.h(i4, i5));
    }
}
