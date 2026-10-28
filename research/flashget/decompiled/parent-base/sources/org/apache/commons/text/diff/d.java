package org.apache.commons.text.diff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: EditScript.java */
/* loaded from: classes3.dex */
public class d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final List<c<T>> f86429a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f86430b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f86431c = 0;

    public void a(b<T> bVar) {
        this.f86429a.add(bVar);
        this.f86431c++;
    }

    public void b(e<T> eVar) {
        this.f86429a.add(eVar);
        this.f86431c++;
    }

    public void c(f<T> fVar) {
        this.f86429a.add(fVar);
        this.f86430b++;
    }

    public int d() {
        return this.f86430b;
    }

    public int e() {
        return this.f86431c;
    }

    public void f(a<T> aVar) {
        Iterator<c<T>> it = this.f86429a.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
    }
}
