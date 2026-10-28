package org.apache.commons.text.similarity;

import java.lang.reflect.Array;

/* compiled from: LongestCommonSubsequence.java */
/* loaded from: classes3.dex */
public class q implements t<Integer> {
    @Override // org.apache.commons.text.similarity.t
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Inputs must not be null");
        }
        return Integer.valueOf(d(charSequence, charSequence2).length());
    }

    @Deprecated
    public CharSequence c(CharSequence charSequence, CharSequence charSequence2) {
        return d(charSequence, charSequence2);
    }

    public CharSequence d(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Inputs must not be null");
        }
        StringBuilder sb = new StringBuilder(Math.max(charSequence.length(), charSequence2.length()));
        int[][] e4 = e(charSequence, charSequence2);
        int length = charSequence.length() - 1;
        int length2 = charSequence2.length() - 1;
        int i4 = e4[charSequence.length()][charSequence2.length()];
        while (true) {
            i4--;
            while (i4 >= 0) {
                if (charSequence.charAt(length) == charSequence2.charAt(length2)) {
                    break;
                }
                if (e4[length + 1][length2] < e4[length][length2 + 1]) {
                    length--;
                } else {
                    length2--;
                }
            }
            return sb.reverse().toString();
            sb.append(charSequence.charAt(length));
            length--;
            length2--;
        }
    }

    public int[][] e(CharSequence charSequence, CharSequence charSequence2) {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, charSequence.length() + 1, charSequence2.length() + 1);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            for (int i5 = 0; i5 < charSequence2.length(); i5++) {
                if (i4 == 0) {
                    iArr[i4][i5] = 0;
                }
                if (i5 == 0) {
                    iArr[i4][i5] = 0;
                }
                if (charSequence.charAt(i4) == charSequence2.charAt(i5)) {
                    iArr[i4 + 1][i5 + 1] = iArr[i4][i5] + 1;
                } else {
                    int[] iArr2 = iArr[i4 + 1];
                    int i6 = i5 + 1;
                    iArr2[i6] = Math.max(iArr2[i5], iArr[i4][i6]);
                }
            }
        }
        return iArr;
    }
}
