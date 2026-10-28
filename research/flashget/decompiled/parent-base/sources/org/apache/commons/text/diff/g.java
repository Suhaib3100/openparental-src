package org.apache.commons.text.diff;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ReplacementsFinder.java */
/* loaded from: classes3.dex */
public class g<T> implements a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final List<T> f86432a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<T> f86433b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private int f86434c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final h<T> f86435d;

    public g(h<T> hVar) {
        this.f86435d = hVar;
    }

    @Override // org.apache.commons.text.diff.a
    public void a(T t4) {
        this.f86432a.add(t4);
    }

    @Override // org.apache.commons.text.diff.a
    public void b(T t4) {
        this.f86433b.add(t4);
    }

    @Override // org.apache.commons.text.diff.a
    public void c(T t4) {
        if (this.f86433b.isEmpty() && this.f86432a.isEmpty()) {
            this.f86434c++;
            return;
        }
        this.f86435d.a(this.f86434c, this.f86433b, this.f86432a);
        this.f86433b.clear();
        this.f86432a.clear();
        this.f86434c = 1;
    }
}
