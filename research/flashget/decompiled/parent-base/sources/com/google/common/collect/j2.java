package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* compiled from: ForwardingSet.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class j2<E> extends q1<E> implements Set<E> {
    protected j2() {
    }

    @Override // com.google.common.collect.q1
    protected boolean O3(Collection<?> collection) {
        collection.getClass();
        return d6.I(this, collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.q1
    /* renamed from: T3 */
    public abstract Set<E> u3();

    protected boolean U3(@zc.a Object obj) {
        return d6.g(this, obj);
    }

    protected int V3() {
        return d6.k(this);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@zc.a Object obj) {
        return obj == this || u3().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return u3().hashCode();
    }
}
