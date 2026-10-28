package org.apache.commons.text.similarity;

import java.util.Arrays;

/* compiled from: LevenshteinDistance.java */
/* loaded from: classes3.dex */
public class o implements d<Integer> {

    /* renamed from: b, reason: collision with root package name */
    private static final o f86660b = new o(null);

    /* renamed from: a, reason: collision with root package name */
    private final Integer f86661a;

    public o() {
        this(null);
    }

    public static o c() {
        return f86660b;
    }

    private static int e(CharSequence charSequence, CharSequence charSequence2, int i4) {
        int i5;
        int i6;
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("CharSequences must not be null");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0) {
            if (length2 <= i4) {
                return length2;
            }
            return -1;
        }
        if (length2 == 0) {
            if (length <= i4) {
                return length;
            }
            return -1;
        }
        if (length > length2) {
            i6 = charSequence.length();
            i5 = length2;
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            i5 = length;
            i6 = length2;
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        if (i6 - i5 > i4) {
            return -1;
        }
        int i7 = i5 + 1;
        int[] iArr = new int[i7];
        int[] iArr2 = new int[i7];
        int min = Math.min(i5, i4) + 1;
        char c5 = 0;
        for (int i10 = 0; i10 < min; i10++) {
            iArr[i10] = i10;
        }
        int i11 = Integer.MAX_VALUE;
        Arrays.fill(iArr, min, i7, Integer.MAX_VALUE);
        Arrays.fill(iArr2, Integer.MAX_VALUE);
        int i12 = 1;
        while (i12 <= i6) {
            char charAt = charSequence4.charAt(i12 - 1);
            iArr2[c5] = i12;
            int max = Math.max(1, i12 - i4);
            int min2 = i12 > i11 - i4 ? i5 : Math.min(i5, i12 + i4);
            if (max > 1) {
                iArr2[max - 1] = i11;
            }
            while (max <= min2) {
                int i13 = max - 1;
                if (charSequence3.charAt(i13) == charAt) {
                    iArr2[max] = iArr[i13];
                } else {
                    iArr2[max] = Math.min(Math.min(iArr2[i13], iArr[max]), iArr[i13]) + 1;
                }
                max++;
            }
            i12++;
            c5 = 0;
            i11 = Integer.MAX_VALUE;
            int[] iArr3 = iArr2;
            iArr2 = iArr;
            iArr = iArr3;
        }
        int i14 = iArr[i5];
        if (i14 <= i4) {
            return i14;
        }
        return -1;
    }

    private static int f(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("CharSequences must not be null");
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0) {
            return length2;
        }
        if (length2 == 0) {
            return length;
        }
        if (length > length2) {
            length2 = charSequence.length();
            length = length2;
        } else {
            charSequence2 = charSequence;
            charSequence = charSequence2;
        }
        int[] iArr = new int[length + 1];
        for (int i4 = 0; i4 <= length; i4++) {
            iArr[i4] = i4;
        }
        for (int i5 = 1; i5 <= length2; i5++) {
            int i6 = iArr[0];
            char charAt = charSequence.charAt(i5 - 1);
            iArr[0] = i5;
            int i7 = 1;
            while (i7 <= length) {
                int i10 = iArr[i7];
                int i11 = i7 - 1;
                iArr[i7] = Math.min(Math.min(iArr[i11] + 1, iArr[i7] + 1), i6 + (charSequence2.charAt(i11) == charAt ? 0 : 1));
                i7++;
                i6 = i10;
            }
        }
        return iArr[length];
    }

    @Override // org.apache.commons.text.similarity.d, org.apache.commons.text.similarity.t
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(CharSequence charSequence, CharSequence charSequence2) {
        Integer num = this.f86661a;
        return num != null ? Integer.valueOf(e(charSequence, charSequence2, num.intValue())) : Integer.valueOf(f(charSequence, charSequence2));
    }

    public Integer d() {
        return this.f86661a;
    }

    public o(Integer num) {
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        this.f86661a = num;
    }
}
