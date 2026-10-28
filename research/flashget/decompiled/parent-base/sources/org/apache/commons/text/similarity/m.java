package org.apache.commons.text.similarity;

import java.util.Arrays;
import org.apache.commons.lang3.b1;

/* compiled from: JaroWinklerSimilarity.java */
/* loaded from: classes3.dex */
public class m implements t<Double> {
    protected static int[] c(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence.length() > charSequence2.length()) {
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int max = Math.max((charSequence4.length() / 2) - 1, 0);
        int[] iArr = new int[charSequence3.length()];
        Arrays.fill(iArr, -1);
        boolean[] zArr = new boolean[charSequence4.length()];
        int i4 = 0;
        for (int i5 = 0; i5 < charSequence3.length(); i5++) {
            char charAt = charSequence3.charAt(i5);
            int max2 = Math.max(i5 - max, 0);
            int min = Math.min(i5 + max + 1, charSequence4.length());
            while (true) {
                if (max2 >= min) {
                    break;
                }
                if (!zArr[max2] && charAt == charSequence4.charAt(max2)) {
                    iArr[i5] = max2;
                    zArr[max2] = true;
                    i4++;
                    break;
                }
                max2++;
            }
        }
        char[] cArr = new char[i4];
        char[] cArr2 = new char[i4];
        int i6 = 0;
        for (int i7 = 0; i7 < charSequence3.length(); i7++) {
            if (iArr[i7] != -1) {
                cArr[i6] = charSequence3.charAt(i7);
                i6++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence4.length(); i11++) {
            if (zArr[i11]) {
                cArr2[i10] = charSequence4.charAt(i11);
                i10++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i4; i13++) {
            if (cArr[i13] != cArr2[i13]) {
                i12++;
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < Math.min(4, charSequence3.length()) && charSequence.charAt(i15) == charSequence2.charAt(i15); i15++) {
            i14++;
        }
        return new int[]{i4, i12, i14};
    }

    @Override // org.apache.commons.text.similarity.t
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("CharSequences must not be null");
        }
        if (b1.R(charSequence, charSequence2)) {
            return Double.valueOf(1.0d);
        }
        double d5 = c(charSequence, charSequence2)[0];
        if (d5 == com.google.firebase.remoteconfig.p.f60679p) {
            return Double.valueOf(com.google.firebase.remoteconfig.p.f60679p);
        }
        double length = (((d5 - (r0[1] / 2.0d)) / d5) + ((d5 / charSequence2.length()) + (d5 / charSequence.length()))) / 3.0d;
        if (length >= 0.7d) {
            length = androidx.constraintlayout.core.motion.utils.a.a(1.0d, length, r0[2] * 0.1d, length);
        }
        return Double.valueOf(length);
    }
}
