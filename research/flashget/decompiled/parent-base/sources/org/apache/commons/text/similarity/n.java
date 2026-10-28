package org.apache.commons.text.similarity;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: LevenshteinDetailedDistance.java */
/* loaded from: classes3.dex */
public class n implements d<p> {

    /* renamed from: b, reason: collision with root package name */
    private static final n f86658b = new n(null);

    /* renamed from: a, reason: collision with root package name */
    private final Integer f86659a;

    public n() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r18 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        r4 = r4 + 1;
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        r3 = r3 + 1;
        r6 = true;
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0082, code lost:
    
        if (r18 != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.apache.commons.text.similarity.p c(java.lang.CharSequence r15, java.lang.CharSequence r16, int[][] r17, boolean r18) {
        /*
            int r0 = r16.length()
            int r1 = r15.length()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        Lc:
            if (r0 < 0) goto L8e
            if (r1 < 0) goto L8e
            r6 = -1
            if (r1 != 0) goto L15
            r7 = r6
            goto L1b
        L15:
            r7 = r17[r0]
            int r8 = r1 + (-1)
            r7 = r7[r8]
        L1b:
            if (r0 != 0) goto L1f
            r8 = r6
            goto L25
        L1f:
            int r8 = r0 + (-1)
            r8 = r17[r8]
            r8 = r8[r1]
        L25:
            if (r0 <= 0) goto L32
            if (r1 <= 0) goto L32
            int r9 = r0 + (-1)
            r9 = r17[r9]
            int r10 = r1 + (-1)
            r9 = r9[r10]
            goto L33
        L32:
            r9 = r6
        L33:
            if (r7 != r6) goto L3b
            if (r8 != r6) goto L3b
            if (r9 != r6) goto L3b
            goto L8e
        L3b:
            r10 = r17[r0]
            r10 = r10[r1]
            if (r1 <= 0) goto L59
            if (r0 <= 0) goto L59
            int r11 = r1 + (-1)
            r12 = r15
            char r11 = r15.charAt(r11)
            int r13 = r0 + (-1)
            r14 = r16
            char r13 = r14.charAt(r13)
            if (r11 != r13) goto L5c
        L54:
            int r1 = r1 + (-1)
            int r0 = r0 + (-1)
            goto Lc
        L59:
            r12 = r15
            r14 = r16
        L5c:
            int r11 = r10 + (-1)
            r13 = 1
            if (r11 != r7) goto L65
            if (r10 > r9) goto L65
            if (r10 <= r8) goto L69
        L65:
            if (r9 != r6) goto L76
            if (r8 != r6) goto L76
        L69:
            int r1 = r1 + (-1)
            if (r18 == 0) goto L71
        L6d:
            int r4 = r4 + 1
            r6 = r2
            goto L87
        L71:
            int r3 = r3 + 1
            r6 = r13
            r13 = r2
            goto L87
        L76:
            if (r11 != r8) goto L7c
            if (r10 > r9) goto L7c
            if (r10 <= r7) goto L80
        L7c:
            if (r9 != r6) goto L85
            if (r7 != r6) goto L85
        L80:
            int r0 = r0 + (-1)
            if (r18 == 0) goto L6d
            goto L71
        L85:
            r6 = r2
            r13 = r6
        L87:
            if (r13 != 0) goto Lc
            if (r6 != 0) goto Lc
            int r5 = r5 + 1
            goto L54
        L8e:
            org.apache.commons.text.similarity.p r0 = new org.apache.commons.text.similarity.p
            int r1 = r4 + r3
            int r1 = r1 + r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.<init>(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.text.similarity.n.c(java.lang.CharSequence, java.lang.CharSequence, int[][], boolean):org.apache.commons.text.similarity.p");
    }

    public static n d() {
        return f86658b;
    }

    private static p f(CharSequence charSequence, CharSequence charSequence2, int i4) {
        int i5;
        int i6;
        boolean z4;
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
        int i7 = -1;
        int i10 = 0;
        if (length == 0) {
            return length2 <= i4 ? new p(Integer.valueOf(length2), Integer.valueOf(length2), 0, 0) : new p(-1, 0, 0, 0);
        }
        if (length2 == 0) {
            return length <= i4 ? new p(Integer.valueOf(length), 0, Integer.valueOf(length), 0) : new p(-1, 0, 0, 0);
        }
        int i11 = 1;
        if (length > length2) {
            i6 = charSequence.length();
            i5 = length2;
            z4 = true;
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            i5 = length;
            i6 = length2;
            z4 = false;
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int i12 = i5 + 1;
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i6 + 1, i12);
        for (int i13 = 0; i13 <= i5; i13++) {
            iArr3[0][i13] = i13;
        }
        for (int i14 = 0; i14 <= i6; i14++) {
            iArr3[i14][0] = i14;
        }
        int min = Math.min(i5, i4) + 1;
        for (int i15 = 0; i15 < min; i15++) {
            iArr[i15] = i15;
        }
        int i16 = Integer.MAX_VALUE;
        Arrays.fill(iArr, min, i12, Integer.MAX_VALUE);
        Arrays.fill(iArr2, Integer.MAX_VALUE);
        int i17 = 1;
        while (i17 <= i6) {
            char charAt = charSequence4.charAt(i17 - 1);
            iArr2[i10] = i17;
            int max = Math.max(i11, i17 - i4);
            int min2 = i17 > i16 - i4 ? i5 : Math.min(i5, i17 + i4);
            if (max > min2) {
                return new p(Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i10), Integer.valueOf(i10));
            }
            if (max > 1) {
                iArr2[max - 1] = i16;
            }
            while (max <= min2) {
                int i18 = max - 1;
                if (charSequence3.charAt(i18) == charAt) {
                    iArr2[max] = iArr[i18];
                } else {
                    iArr2[max] = Math.min(Math.min(iArr2[i18], iArr[max]), iArr[i18]) + 1;
                }
                iArr3[i17][max] = iArr2[max];
                max++;
            }
            i17++;
            i11 = 1;
            i7 = -1;
            i10 = 0;
            i16 = Integer.MAX_VALUE;
            int[] iArr4 = iArr2;
            iArr2 = iArr;
            iArr = iArr4;
        }
        return iArr[i5] <= i4 ? c(charSequence3, charSequence4, iArr3, z4) : new p(-1, 0, 0, 0);
    }

    private static p g(CharSequence charSequence, CharSequence charSequence2) {
        int i4;
        int i5;
        boolean z4;
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("CharSequences must not be null");
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i6 = 0;
        if (length == 0) {
            return new p(Integer.valueOf(length2), Integer.valueOf(length2), 0, 0);
        }
        if (length2 == 0) {
            return new p(Integer.valueOf(length), 0, Integer.valueOf(length), 0);
        }
        if (length > length2) {
            i5 = charSequence.length();
            i4 = length2;
            z4 = true;
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            i4 = length;
            i5 = length2;
            z4 = false;
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int i7 = i4 + 1;
        int[] iArr = new int[i7];
        int[] iArr2 = new int[i7];
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i5 + 1, i7);
        for (int i10 = 0; i10 <= i4; i10++) {
            iArr3[0][i10] = i10;
        }
        for (int i11 = 0; i11 <= i5; i11++) {
            iArr3[i11][0] = i11;
        }
        for (int i12 = 0; i12 <= i4; i12++) {
            iArr[i12] = i12;
        }
        int i13 = 1;
        while (true) {
            int[] iArr4 = iArr2;
            iArr2 = iArr;
            iArr = iArr4;
            if (i13 > i5) {
                return c(charSequence3, charSequence4, iArr3, z4);
            }
            char charAt = charSequence4.charAt(i13 - 1);
            iArr[i6] = i13;
            int i14 = 1;
            while (i14 <= i4) {
                int i15 = i14 - 1;
                int min = Math.min(Math.min(iArr[i15] + 1, iArr2[i14] + 1), iArr2[i15] + (charSequence3.charAt(i15) == charAt ? i6 : 1));
                iArr[i14] = min;
                iArr3[i13][i14] = min;
                i14++;
                i6 = 0;
            }
            i13++;
            i6 = 0;
        }
    }

    @Override // org.apache.commons.text.similarity.d, org.apache.commons.text.similarity.t
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p a(CharSequence charSequence, CharSequence charSequence2) {
        Integer num = this.f86659a;
        return num != null ? f(charSequence, charSequence2, num.intValue()) : g(charSequence, charSequence2);
    }

    public Integer e() {
        return this.f86659a;
    }

    public n(Integer num) {
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        this.f86659a = num;
    }
}
