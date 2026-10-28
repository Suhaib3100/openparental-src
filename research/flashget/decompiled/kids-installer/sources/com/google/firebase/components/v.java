package com.google.firebase.components;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LazySet.java */
/* loaded from: classes3.dex */
class v<T> implements o2.b<Set<T>> {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set<T> f15407b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set<o2.b<T>> f15406a = Collections.newSetFromMap(new ConcurrentHashMap());

    v(Collection<o2.b<T>> collection) {
        this.f15406a.addAll(collection);
    }

    static v<?> b(Collection<o2.b<?>> collection) {
        return new v<>((Set) collection);
    }

    private synchronized void d() {
        Iterator<o2.b<T>> it = this.f15406a.iterator();
        while (it.hasNext()) {
            this.f15407b.add(it.next().get());
        }
        this.f15406a = null;
    }

    synchronized void a(o2.b<T> bVar) {
        if (this.f15407b == null) {
            this.f15406a.add(bVar);
        } else {
            this.f15407b.add(bVar.get());
        }
    }

    @Override // o2.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f15407b == null) {
            synchronized (this) {
                if (this.f15407b == null) {
                    this.f15407b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f15407b);
    }
}
