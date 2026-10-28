package org.apache.commons.text.similarity;

/* compiled from: JaccardDistance.java */
/* loaded from: classes3.dex */
public class j implements d<Double> {

    /* renamed from: a, reason: collision with root package name */
    private final k f86656a = new k();

    @Override // org.apache.commons.text.similarity.d, org.apache.commons.text.similarity.t
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return Double.valueOf(1.0d - this.f86656a.a(charSequence, charSequence2).doubleValue());
    }
}
