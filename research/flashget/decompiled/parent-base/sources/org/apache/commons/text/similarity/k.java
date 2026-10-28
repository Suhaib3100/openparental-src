package org.apache.commons.text.similarity;

import java.util.HashSet;

/* compiled from: JaccardSimilarity.java */
/* loaded from: classes3.dex */
public class k implements t<Double> {
    private Double c(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0 || length2 == 0) {
            return Double.valueOf(com.google.firebase.remoteconfig.p.f60679p);
        }
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(Character.valueOf(charSequence.charAt(i4)));
        }
        HashSet hashSet2 = new HashSet();
        for (int i5 = 0; i5 < length2; i5++) {
            hashSet2.add(Character.valueOf(charSequence2.charAt(i5)));
        }
        new HashSet(hashSet).addAll(hashSet2);
        return Double.valueOf((((hashSet2.size() + hashSet.size()) - r8.size()) * 1.0d) / r8.size());
    }

    @Override // org.apache.commons.text.similarity.t
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return c(charSequence, charSequence2);
    }
}
