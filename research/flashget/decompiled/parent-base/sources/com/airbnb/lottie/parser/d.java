package com.airbnb.lottie.parser;

import java.io.IOException;
import java.util.List;

/* compiled from: AnimatableValueParser.java */
/* loaded from: classes3.dex */
public class d {
    private d() {
    }

    private static <T> List<com.airbnb.lottie.value.a<T>> a(com.airbnb.lottie.parser.moshi.c cVar, float f4, com.airbnb.lottie.k kVar, n0<T> n0Var) throws IOException {
        return u.a(cVar, kVar, f4, n0Var, false);
    }

    private static <T> List<com.airbnb.lottie.value.a<T>> b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, n0<T> n0Var) throws IOException {
        return u.a(cVar, kVar, 1.0f, n0Var, false);
    }

    static com.airbnb.lottie.model.animatable.a c(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.a(b(cVar, kVar, g.f39213a));
    }

    static com.airbnb.lottie.model.animatable.j d(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.j(b(cVar, kVar, i.f39218a));
    }

    public static com.airbnb.lottie.model.animatable.b e(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return f(cVar, kVar, true);
    }

    public static com.airbnb.lottie.model.animatable.b f(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, boolean z4) throws IOException {
        return new com.airbnb.lottie.model.animatable.b(u.a(cVar, kVar, z4 ? com.airbnb.lottie.utils.j.e() : 1.0f, l.f39235a, false));
    }

    static com.airbnb.lottie.model.animatable.c g(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, int i4) throws IOException {
        return new com.airbnb.lottie.model.animatable.c(b(cVar, kVar, new o(i4)));
    }

    static com.airbnb.lottie.model.animatable.d h(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.d(b(cVar, kVar, r.f39315a));
    }

    static com.airbnb.lottie.model.animatable.f i(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.f(u.a(cVar, kVar, com.airbnb.lottie.utils.j.e(), b0.f39203a, true));
    }

    static com.airbnb.lottie.model.animatable.g j(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.g((List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.k>>) b(cVar, kVar, g0.f39214a));
    }

    static com.airbnb.lottie.model.animatable.h k(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.h(u.a(cVar, kVar, com.airbnb.lottie.utils.j.e(), h0.f39216a, false));
    }
}
