package org.apache.commons.text.similarity;

/* compiled from: CosineDistance.java */
/* loaded from: classes3.dex */
public class a implements d<Double> {

    /* renamed from: a, reason: collision with root package name */
    private final v<CharSequence> f86644a = new s();

    /* renamed from: b, reason: collision with root package name */
    private final b f86645b = new b();

    @Override // org.apache.commons.text.similarity.d, org.apache.commons.text.similarity.t
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double a(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence[] a5 = this.f86644a.a(charSequence);
        CharSequence[] a6 = this.f86644a.a(charSequence2);
        return Double.valueOf(1.0d - this.f86645b.a(c.a(a5), c.a(a6)).doubleValue());
    }
}
