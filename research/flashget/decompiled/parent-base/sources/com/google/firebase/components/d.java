package com.google.firebase.components;

import java.util.Set;

/* compiled from: ComponentContainer.java */
/* loaded from: classes6.dex */
public interface d {
    default <T> T a(Class<T> cls) {
        return (T) g(b0.b(cls));
    }

    <T> y9.b<T> b(b0<T> b0Var);

    default <T> y9.b<Set<T>> d(Class<T> cls) {
        return f(b0.b(cls));
    }

    default <T> Set<T> e(b0<T> b0Var) {
        return f(b0Var).get();
    }

    <T> y9.b<Set<T>> f(b0<T> b0Var);

    default <T> T g(b0<T> b0Var) {
        y9.b<T> b5 = b(b0Var);
        if (b5 == null) {
            return null;
        }
        return b5.get();
    }

    default <T> Set<T> h(Class<T> cls) {
        return e(b0.b(cls));
    }

    default <T> y9.b<T> i(Class<T> cls) {
        return b(b0.b(cls));
    }

    <T> y9.a<T> j(b0<T> b0Var);

    default <T> y9.a<T> k(Class<T> cls) {
        return j(b0.b(cls));
    }
}
