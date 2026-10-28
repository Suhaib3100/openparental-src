package org.apache.commons.text.similarity;

import org.apache.commons.lang3.k1;

/* compiled from: SimilarityScoreFrom.java */
/* loaded from: classes3.dex */
public class u<R> {

    /* renamed from: a, reason: collision with root package name */
    private final t<R> f86668a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f86669b;

    public u(t<R> tVar, CharSequence charSequence) {
        k1.B(tVar != null, "The edit distance may not be null.", new Object[0]);
        this.f86668a = tVar;
        this.f86669b = charSequence;
    }

    public R a(CharSequence charSequence) {
        return this.f86668a.a(this.f86669b, charSequence);
    }

    public CharSequence b() {
        return this.f86669b;
    }

    public t<R> c() {
        return this.f86668a;
    }
}
