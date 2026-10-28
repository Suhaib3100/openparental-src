package org.apache.commons.text.similarity;

/* compiled from: LongestCommonSubsequenceDistance.java */
/* loaded from: classes3.dex */
public class r implements d<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private final q f86666a = new q();

    @Override // org.apache.commons.text.similarity.d, org.apache.commons.text.similarity.t
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Inputs must not be null");
        }
        return Integer.valueOf((charSequence2.length() + charSequence.length()) - (this.f86666a.a(charSequence, charSequence2).intValue() * 2));
    }
}
