package org.eclipse.paho.client.mqttv3.util;

/* loaded from: classes5.dex */
public final class Strings {
    private static final int INDEX_NOT_FOUND = -1;

    private Strings() {
    }

    public static boolean containsAny(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return containsAny(charSequence, toCharArray(charSequence2));
    }

    public static int countMatches(CharSequence charSequence, CharSequence charSequence2) {
        int i4 = 0;
        if (isEmpty(charSequence) || isEmpty(charSequence2)) {
            return 0;
        }
        int i5 = 0;
        while (true) {
            int indexOf = indexOf(charSequence, charSequence2, i4);
            if (indexOf == -1) {
                return i5;
            }
            i5++;
            i4 = indexOf + charSequence2.length();
        }
    }

    public static boolean equalsAny(CharSequence charSequence, CharSequence[] charSequenceArr) {
        boolean z4 = charSequence == null && charSequenceArr == null;
        if (charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                z4 = z4 || charSequence2.equals(charSequence);
            }
        }
        return z4;
    }

    private static int indexOf(CharSequence charSequence, CharSequence charSequence2, int i4) {
        return charSequence.toString().indexOf(charSequence2.toString(), i4);
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    private static char[] toCharArray(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).toCharArray();
        }
        int length = charSequence.length();
        char[] cArr = new char[charSequence.length()];
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i4] = charSequence.charAt(i4);
        }
        return cArr;
    }

    public static boolean containsAny(CharSequence charSequence, char[] cArr) {
        if (isEmpty(charSequence) || isEmpty(cArr)) {
            return false;
        }
        int length = charSequence.length();
        int length2 = cArr.length;
        int i4 = length - 1;
        int i5 = length2 - 1;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = charSequence.charAt(i6);
            for (int i7 = 0; i7 < length2; i7++) {
                if (cArr[i7] == charAt) {
                    if (!Character.isHighSurrogate(charAt) || i7 == i5) {
                        return true;
                    }
                    if (i6 < i4 && cArr[i7 + 1] == charSequence.charAt(i6 + 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isEmpty(char[] cArr) {
        return cArr == null || cArr.length == 0;
    }
}
