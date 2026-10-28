package com.google.firebase.components;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LazySet.java */
/* loaded from: classes6.dex */
class v<T> implements y9.b<Set<T>> {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set<T> f58484b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set<y9.b<T>> f58483a = Collections.newSetFromMap(new ConcurrentHashMap());

    v(Collection<y9.b<T>> collection) {
        this.f58483a.addAll(collection);
    }

    static v<?> b(Collection<y9.b<?>> collection) {
        return new v<>((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator<y9.b<T>> it = this.f58483a.iterator();
            while (it.hasNext()) {
                this.f58484b.add(it.next().get());
            }
            this.f58483a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(y9.b<T> bVar) {
        try {
            if (this.f58484b == null) {
                this.f58483a.add(bVar);
            } else {
                this.f58484b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // y9.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f58484b == null) {
            synchronized (this) {
                try {
                    if (this.f58484b == null) {
                        this.f58484b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f58484b);
    }
}
