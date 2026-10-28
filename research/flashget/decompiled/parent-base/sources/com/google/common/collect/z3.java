package com.google.common.collect;

/* compiled from: IndexedImmutableSet.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
abstract class z3<E> extends q3<E> {

    /* compiled from: IndexedImmutableSet.java */
    class a extends f3<E> {
        a() {
        }

        @Override // java.util.List
        public E get(int i4) {
            return (E) z3.this.get(i4);
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return z3.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return z3.this.size();
        }
    }

    z3() {
    }

    @Override // com.google.common.collect.q3
    f3<E> G() {
        return new a();
    }

    @Override // com.google.common.collect.b3
    @d9.c
    int c(Object[] objArr, int i4) {
        return b().c(objArr, i4);
    }

    abstract E get(int i4);

    @Override // com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public e7<E> iterator() {
        return b().iterator();
    }
}
