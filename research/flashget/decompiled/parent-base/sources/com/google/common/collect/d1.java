package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: EvictingQueue.java */
@w0
@d9.a
@d9.b
/* loaded from: classes6.dex */
public final class d1<E> extends i2<E> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final long f55533d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Queue<E> f55534b;

    /* renamed from: c, reason: collision with root package name */
    @d9.d
    final int f55535c;

    private d1(int i4) {
        com.google.common.base.l0.k(i4 >= 0, ProtectedSandApp.s("\uf483"), i4);
        this.f55534b = new ArrayDeque(i4);
        this.f55535c = i4;
    }

    public static <E> d1<E> X3(int i4) {
        return new d1<>(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.i2
    /* renamed from: T3 */
    public Queue<E> u3() {
        return this.f55534b;
    }

    @Override // com.google.common.collect.q1, java.util.Collection, java.util.Queue
    @f9.a
    public boolean add(E e4) {
        e4.getClass();
        if (this.f55535c == 0) {
            return true;
        }
        if (size() == this.f55535c) {
            this.f55534b.remove();
        }
        this.f55534b.add(e4);
        return true;
    }

    @Override // com.google.common.collect.q1, java.util.Collection
    @f9.a
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.f55535c) {
            return A3(collection);
        }
        clear();
        return c4.a(this, c4.N(collection, size - this.f55535c));
    }

    @Override // com.google.common.collect.i2, java.util.Queue
    @f9.a
    public boolean offer(E e4) {
        return add(e4);
    }

    public int remainingCapacity() {
        return this.f55535c - size();
    }

    @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return super.toArray();
    }

    @Override // com.google.common.collect.i2, com.google.common.collect.q1, com.google.common.collect.h2
    protected Object u3() {
        return this.f55534b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.i2, com.google.common.collect.q1
    /* renamed from: v3 */
    public Collection u3() {
        return this.f55534b;
    }
}
