package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: ImmutableAsList.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
abstract class y2<E> extends f3<E> {

    /* compiled from: ImmutableAsList.java */
    @d9.c
    static class a implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f56643c = 0;

        /* renamed from: b, reason: collision with root package name */
        final b3<?> f56644b;

        a(b3<?> b3Var) {
            this.f56644b = b3Var;
        }

        Object a() {
            return this.f56644b.b();
        }
    }

    y2() {
    }

    @d9.c
    private void X(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(ProtectedSandApp.s("\uf503"));
    }

    @Override // com.google.common.collect.f3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        return f0().contains(obj);
    }

    abstract b3<E> f0();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return f0().isEmpty();
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return f0().j();
    }

    @Override // com.google.common.collect.f3, com.google.common.collect.b3
    @d9.c
    Object m() {
        return new a(f0());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return f0().size();
    }
}
