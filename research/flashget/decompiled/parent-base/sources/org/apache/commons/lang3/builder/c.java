package org.apache.commons.lang3.builder;

import java.lang.reflect.Type;
import org.apache.commons.lang3.p0;

/* compiled from: Diff.java */
/* loaded from: classes6.dex */
public abstract class c<T> extends org.apache.commons.lang3.tuple.e<T, T> {

    /* renamed from: f, reason: collision with root package name */
    private static final long f85667f = 1;

    /* renamed from: d, reason: collision with root package name */
    private final Type f85668d = (Type) p0.t(org.apache.commons.lang3.reflect.i.D(getClass(), c.class).get(c.class.getTypeParameters()[0]), Object.class);

    /* renamed from: e, reason: collision with root package name */
    private final String f85669e;

    protected c(String str) {
        this.f85669e = str;
    }

    public final String h() {
        return this.f85669e;
    }

    public final Type i() {
        return this.f85668d;
    }

    @Override // java.util.Map.Entry
    public final T setValue(T t4) {
        throw new UnsupportedOperationException("Cannot alter Diff object.");
    }

    @Override // org.apache.commons.lang3.tuple.e
    public final String toString() {
        return String.format("[%s: %s, %s]", this.f85669e, c(), d());
    }
}
