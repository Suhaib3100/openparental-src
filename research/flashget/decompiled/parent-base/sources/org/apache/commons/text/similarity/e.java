package org.apache.commons.text.similarity;

import org.apache.commons.lang3.k1;

/* compiled from: EditDistanceFrom.java */
/* loaded from: classes3.dex */
public class e<R> {

    /* renamed from: a, reason: collision with root package name */
    private final d<R> f86646a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f86647b;

    public e(d<R> dVar, CharSequence charSequence) {
        k1.B(dVar != null, "The edit distance may not be null.", new Object[0]);
        this.f86646a = dVar;
        this.f86647b = charSequence;
    }

    public R a(CharSequence charSequence) {
        return this.f86646a.a(this.f86647b, charSequence);
    }

    public d<R> b() {
        return this.f86646a;
    }

    public CharSequence c() {
        return this.f86647b;
    }
}
