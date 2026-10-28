package com.google.common.collect;

/* compiled from: RegularImmutableSet.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
final class t5<E> extends q3<E> {

    /* renamed from: l, reason: collision with root package name */
    private static final Object[] f56491l;

    /* renamed from: m, reason: collision with root package name */
    static final t5<Object> f56492m;

    /* renamed from: g, reason: collision with root package name */
    @d9.d
    final transient Object[] f56493g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f56494h;

    /* renamed from: i, reason: collision with root package name */
    @d9.d
    final transient Object[] f56495i;

    /* renamed from: j, reason: collision with root package name */
    private final transient int f56496j;

    /* renamed from: k, reason: collision with root package name */
    private final transient int f56497k;

    static {
        Object[] objArr = new Object[0];
        f56491l = objArr;
        f56492m = new t5<>(objArr, 0, objArr, 0, 0);
    }

    t5(Object[] objArr, int i4, Object[] objArr2, int i5, int i6) {
        this.f56493g = objArr;
        this.f56494h = i4;
        this.f56495i = objArr2;
        this.f56496j = i5;
        this.f56497k = i6;
    }

    @Override // com.google.common.collect.q3
    f3<E> G() {
        return f3.q(this.f56493g, this.f56497k);
    }

    @Override // com.google.common.collect.q3
    boolean H() {
        return true;
    }

    @Override // com.google.common.collect.b3
    int c(Object[] objArr, int i4) {
        System.arraycopy(this.f56493g, 0, objArr, i4, this.f56497k);
        return i4 + this.f56497k;
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        Object[] objArr = this.f56495i;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int d5 = x2.d(obj);
        while (true) {
            int i4 = d5 & this.f56496j;
            Object obj2 = objArr[i4];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            d5 = i4 + 1;
        }
    }

    @Override // com.google.common.collect.b3
    Object[] f() {
        return this.f56493g;
    }

    @Override // com.google.common.collect.b3
    int h() {
        return this.f56497k;
    }

    @Override // com.google.common.collect.q3, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f56494h;
    }

    @Override // com.google.common.collect.b3
    int i() {
        return 0;
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return false;
    }

    @Override // com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public e7<E> iterator() {
        return b().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f56497k;
    }
}
