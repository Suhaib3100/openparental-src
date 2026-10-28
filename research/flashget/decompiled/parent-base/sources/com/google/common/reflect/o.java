package com.google.common.reflect;

import java.util.Map;

/* compiled from: TypeToInstanceMap.java */
@f9.f("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
@d
/* loaded from: classes6.dex */
public interface o<B> extends Map<p<? extends B>, B> {
    @zc.a
    <T extends B> T G(Class<T> cls);

    @zc.a
    @f9.a
    <T extends B> T l2(p<T> pVar, T t4);

    @zc.a
    @f9.a
    <T extends B> T s(Class<T> cls, T t4);

    @zc.a
    <T extends B> T y1(p<T> pVar);
}
