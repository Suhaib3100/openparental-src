package org.apache.commons.lang3.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;
import org.apache.commons.lang3.k1;

/* compiled from: TypeLiteral.java */
/* loaded from: classes6.dex */
public abstract class g<T> implements j<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final TypeVariable<Class<g>> f86083c = g.class.getTypeParameters()[0];

    /* renamed from: a, reason: collision with root package name */
    public final Type f86084a;

    /* renamed from: b, reason: collision with root package name */
    private final String f86085b;

    protected g() {
        Map<TypeVariable<?>, Type> D = i.D(getClass(), g.class);
        TypeVariable<Class<g>> typeVariable = f86083c;
        Type type = (Type) k1.b0(D.get(typeVariable), "%s does not assign type parameter %s", getClass(), i.X(typeVariable));
        this.f86084a = type;
        this.f86085b = String.format("%s<%s>", g.class.getSimpleName(), i.Z(type));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return i.m(this.f86084a, ((g) obj).f86084a);
        }
        return false;
    }

    @Override // org.apache.commons.lang3.reflect.j
    public Type getType() {
        return this.f86084a;
    }

    public int hashCode() {
        return this.f86084a.hashCode() | 592;
    }

    public String toString() {
        return this.f86085b;
    }
}
