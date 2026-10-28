package com.google.common.collect;

import com.google.common.collect.m3;
import com.google.common.collect.u4;
import java.io.Serializable;

/* compiled from: RegularImmutableMultiset.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
class s5<E> extends m3<E> {

    /* renamed from: h, reason: collision with root package name */
    static final s5<Object> f56414h = new s5<>(new c5());

    /* renamed from: e, reason: collision with root package name */
    final transient c5<E> f56415e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f56416f;

    /* renamed from: g, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient q3<E> f56417g;

    /* compiled from: RegularImmutableMultiset.java */
    private final class b extends z3<E> {
        private b() {
        }

        @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            return s5.this.contains(obj);
        }

        @Override // com.google.common.collect.z3
        E get(int i4) {
            return s5.this.f56415e.j(i4);
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s5.this.f56415e.D();
        }
    }

    /* compiled from: RegularImmutableMultiset.java */
    @d9.c
    private static class c implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f56419d = 0;

        /* renamed from: b, reason: collision with root package name */
        final Object[] f56420b;

        /* renamed from: c, reason: collision with root package name */
        final int[] f56421c;

        c(u4<? extends Object> u4Var) {
            int size = u4Var.entrySet().size();
            this.f56420b = new Object[size];
            this.f56421c = new int[size];
            int i4 = 0;
            for (u4.a<? extends Object> aVar : u4Var.entrySet()) {
                this.f56420b[i4] = aVar.getElement();
                this.f56421c[i4] = aVar.getCount();
                i4++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object a() {
            m3.b bVar = new m3.b(this.f56420b.length);
            int i4 = 0;
            while (true) {
                Object[] objArr = this.f56420b;
                if (i4 >= objArr.length) {
                    return bVar.e();
                }
                bVar.k(objArr[i4], this.f56421c[i4]);
                i4++;
            }
        }
    }

    s5(c5<E> c5Var) {
        this.f56415e = c5Var;
        long j4 = 0;
        for (int i4 = 0; i4 < c5Var.D(); i4++) {
            j4 += c5Var.l(i4);
        }
        this.f56416f = com.google.common.primitives.l.x(j4);
    }

    @Override // com.google.common.collect.m3, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public q3<E> d() {
        q3<E> q3Var = this.f56417g;
        if (q3Var != null) {
            return q3Var;
        }
        b bVar = new b();
        this.f56417g = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.m3
    u4.a<E> F(int i4) {
        return this.f56415e.h(i4);
    }

    @Override // com.google.common.collect.u4
    public int W2(@zc.a Object obj) {
        return this.f56415e.g(obj);
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return false;
    }

    @Override // com.google.common.collect.m3, com.google.common.collect.b3
    @d9.c
    Object m() {
        return new c(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    public int size() {
        return this.f56416f;
    }
}
