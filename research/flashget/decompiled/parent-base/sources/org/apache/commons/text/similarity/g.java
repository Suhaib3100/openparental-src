package org.apache.commons.text.similarity;

/* compiled from: HammingDistance.java */
/* loaded from: classes3.dex */
public class g implements d<Integer> {
    @Override // org.apache.commons.text.similarity.d, org.apache.commons.text.similarity.t
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("CharSequences must not be null");
        }
        if (charSequence.length() != charSequence2.length()) {
            throw new IllegalArgumentException("CharSequences must have the same length");
        }
        int i4 = 0;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (charSequence.charAt(i5) != charSequence2.charAt(i5)) {
                i4++;
            }
        }
        return Integer.valueOf(i4);
    }
}
