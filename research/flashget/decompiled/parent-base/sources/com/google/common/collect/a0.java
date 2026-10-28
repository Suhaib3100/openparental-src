package com.google.common.collect;

import java.util.Map;

/* compiled from: ClassToInstanceMap.java */
@w0
@f9.f("Use ImmutableClassToInstanceMap or MutableClassToInstanceMap")
@d9.b
/* loaded from: classes6.dex */
public interface a0<B> extends Map<Class<? extends B>, B> {
    @zc.a
    <T extends B> T G(Class<T> cls);

    @zc.a
    @f9.a
    <T extends B> T s(Class<T> cls, T t4);
}
