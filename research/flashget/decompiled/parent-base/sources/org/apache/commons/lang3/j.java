package org.apache.commons.lang3;

/* compiled from: CharSequenceUtils.java */
/* loaded from: classes6.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final int f86023a = -1;

    /* renamed from: b, reason: collision with root package name */
    static final int f86024b = 16;

    private static boolean a(CharSequence charSequence, CharSequence charSequence2, int i4, int i5) {
        int i6 = 1;
        for (int i7 = i4 - 1; i6 <= i7; i7--) {
            if (charSequence.charAt(i5 + i6) != charSequence2.charAt(i6) || charSequence.charAt(i5 + i7) != charSequence2.charAt(i7)) {
                return false;
            }
            i6++;
        }
        return true;
    }

    static int b(CharSequence charSequence, int i4, int i5) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(i4, i5);
        }
        int length = charSequence.length();
        if (i5 < 0) {
            i5 = 0;
        }
        if (i4 < 65536) {
            for (int i6 = i5; i6 < length; i6++) {
                if (charSequence.charAt(i6) == i4) {
                    return i6;
                }
            }
        }
        if (i4 > 1114111) {
            return -1;
        }
        char[] chars = Character.toChars(i4);
        while (i5 < length - 1) {
            char charAt = charSequence.charAt(i5);
            int i7 = i5 + 1;
            char charAt2 = charSequence.charAt(i7);
            if (charAt == chars[0] && charAt2 == chars[1]) {
                return i5;
            }
            i5 = i7;
        }
        return -1;
    }

    static int c(CharSequence charSequence, CharSequence charSequence2, int i4) {
        return charSequence instanceof String ? ((String) charSequence).indexOf(charSequence2.toString(), i4) : charSequence instanceof StringBuilder ? ((StringBuilder) charSequence).indexOf(charSequence2.toString(), i4) : charSequence instanceof StringBuffer ? ((StringBuffer) charSequence).indexOf(charSequence2.toString(), i4) : charSequence.toString().indexOf(charSequence2.toString(), i4);
    }

    static int d(CharSequence charSequence, int i4, int i5) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(i4, i5);
        }
        int length = charSequence.length();
        if (i5 < 0) {
            return -1;
        }
        if (i5 >= length) {
            i5 = length - 1;
        }
        if (i4 < 65536) {
            for (int i6 = i5; i6 >= 0; i6--) {
                if (charSequence.charAt(i6) == i4) {
                    return i6;
                }
            }
        }
        if (i4 <= 1114111) {
            char[] chars = Character.toChars(i4);
            if (i5 == length - 1) {
                return -1;
            }
            while (i5 >= 0) {
                char charAt = charSequence.charAt(i5);
                char charAt2 = charSequence.charAt(i5 + 1);
                if (chars[0] == charAt && chars[1] == charAt2) {
                    return i5;
                }
                i5--;
            }
        }
        return -1;
    }

    static int e(CharSequence charSequence, CharSequence charSequence2, int i4) {
        if (charSequence2 instanceof String) {
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf((String) charSequence2, i4);
            }
            if (charSequence instanceof StringBuilder) {
                return ((StringBuilder) charSequence).lastIndexOf((String) charSequence2, i4);
            }
            if (charSequence instanceof StringBuffer) {
                return ((StringBuffer) charSequence).lastIndexOf((String) charSequence2, i4);
            }
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (i4 > length) {
            i4 = length;
        }
        if (i4 >= 0 && length2 >= 0 && length2 <= length) {
            if (length2 == 0) {
                return i4;
            }
            if (length2 <= 16) {
                if (charSequence instanceof String) {
                    return ((String) charSequence).lastIndexOf(charSequence2.toString(), i4);
                }
                if (charSequence instanceof StringBuilder) {
                    return ((StringBuilder) charSequence).lastIndexOf(charSequence2.toString(), i4);
                }
                if (charSequence instanceof StringBuffer) {
                    return ((StringBuffer) charSequence).lastIndexOf(charSequence2.toString(), i4);
                }
            }
            if (i4 + length2 > length) {
                i4 = length - length2;
            }
            char charAt = charSequence2.charAt(0);
            while (true) {
                if (charSequence.charAt(i4) != charAt) {
                    i4--;
                    if (i4 < 0) {
                        return -1;
                    }
                } else {
                    if (a(charSequence, charSequence2, length2, i4)) {
                        return i4;
                    }
                    i4--;
                    if (i4 < 0) {
                        break;
                    }
                }
            }
        }
        return -1;
    }

    static boolean f(CharSequence charSequence, boolean z4, int i4, CharSequence charSequence2, int i5, int i6) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z4, i4, (String) charSequence2, i5, i6);
        }
        int length = charSequence.length() - i4;
        int length2 = charSequence2.length() - i5;
        if (i4 < 0 || i5 < 0 || i6 < 0 || length < i6 || length2 < i6) {
            return false;
        }
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0) {
                return true;
            }
            int i10 = i4 + 1;
            char charAt = charSequence.charAt(i4);
            int i11 = i5 + 1;
            char charAt2 = charSequence2.charAt(i5);
            if (charAt != charAt2) {
                if (!z4) {
                    return false;
                }
                char upperCase = Character.toUpperCase(charAt);
                char upperCase2 = Character.toUpperCase(charAt2);
                if (upperCase != upperCase2 && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                    return false;
                }
            }
            i4 = i10;
            i6 = i7;
            i5 = i11;
        }
    }

    public static CharSequence g(CharSequence charSequence, int i4) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.subSequence(i4, charSequence.length());
    }

    public static char[] h(CharSequence charSequence) {
        int B1 = b1.B1(charSequence);
        if (B1 == 0) {
            return e.f85953e;
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).toCharArray();
        }
        char[] cArr = new char[B1];
        for (int i4 = 0; i4 < B1; i4++) {
            cArr[i4] = charSequence.charAt(i4);
        }
        return cArr;
    }
}
