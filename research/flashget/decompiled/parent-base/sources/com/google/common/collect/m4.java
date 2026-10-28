package com.google.common.collect;

import java.util.Map;

/* compiled from: MapDifference.java */
@w0
@d9.b
@f9.f("Use Maps.difference")
/* loaded from: classes6.dex */
public interface m4<K, V> {

    /* compiled from: MapDifference.java */
    @f9.f("Use Maps.difference")
    public interface a<V> {
        @f5
        V a();

        @f5
        V b();

        boolean equals(@zc.a Object obj);

        int hashCode();
    }

    Map<K, V> a();

    Map<K, V> b();

    Map<K, a<V>> c();

    Map<K, V> d();

    boolean e();

    boolean equals(@zc.a Object obj);

    int hashCode();
}
