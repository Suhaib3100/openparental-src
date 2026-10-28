package com.google.firebase.components;

import java.util.Set;

/* compiled from: ComponentContainer.java */
/* loaded from: classes2.dex */
public interface d {
    default <T> T a(Class<T> cls) {
        return (T) h(b0.b(cls));
    }

    <T> o2.b<T> b(b0<T> b0Var);

    default <T> o2.b<T> c(Class<T> cls) {
        return b(b0.b(cls));
    }

    default <T> o2.b<Set<T>> e(Class<T> cls) {
        return g(b0.b(cls));
    }

    default <T> Set<T> f(b0<T> b0Var) {
        return g(b0Var).get();
    }

    <T> o2.b<Set<T>> g(b0<T> b0Var);

    default <T> T h(b0<T> b0Var) {
        o2.b<T> b6 = b(b0Var);
        if (b6 == null) {
            return null;
        }
        return b6.get();
    }

    default <T> Set<T> i(Class<T> cls) {
        return f(b0.b(cls));
    }

    <T> o2.a<T> j(b0<T> b0Var);

    default <T> o2.a<T> k(Class<T> cls) {
        return j(b0.b(cls));
    }
}
