package com.google.common.collect;

import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: ImmutableEnumSet.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
final class e3<E extends Enum<E>> extends q3<E> {

    /* renamed from: g, reason: collision with root package name */
    private final transient EnumSet<E> f55679g;

    /* renamed from: h, reason: collision with root package name */
    @g9.b
    private transient int f55680h;

    /* compiled from: ImmutableEnumSet.java */
    private static class b<E extends Enum<E>> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55681c = 0;

        /* renamed from: b, reason: collision with root package name */
        final EnumSet<E> f55682b;

        b(EnumSet<E> enumSet) {
            this.f55682b = enumSet;
        }

        Object a() {
            return new e3(this.f55682b.clone());
        }
    }

    static q3 T(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new e3(enumSet) : new e6(c4.z(enumSet)) : t5.f56492m;
    }

    @Override // com.google.common.collect.q3
    boolean H() {
        return true;
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        return this.f55679g.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof e3) {
            collection = ((e3) collection).f55679g;
        }
        return this.f55679g.containsAll(collection);
    }

    @Override // com.google.common.collect.q3, java.util.Collection, java.util.Set
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e3) {
            obj = ((e3) obj).f55679g;
        }
        return this.f55679g.equals(obj);
    }

    @Override // com.google.common.collect.q3, java.util.Collection, java.util.Set
    public int hashCode() {
        int i4 = this.f55680h;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = this.f55679g.hashCode();
        this.f55680h = hashCode;
        return hashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f55679g.isEmpty();
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return false;
    }

    @Override // com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public e7<E> iterator() {
        return d4.f0(this.f55679g.iterator());
    }

    @Override // com.google.common.collect.q3, com.google.common.collect.b3
    Object m() {
        return new b(this.f55679g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f55679g.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f55679g.toString();
    }

    private e3(EnumSet<E> enumSet) {
        this.f55679g = enumSet;
    }
}
