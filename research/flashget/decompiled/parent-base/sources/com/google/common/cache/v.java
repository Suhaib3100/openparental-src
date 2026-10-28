package com.google.common.cache;

import java.util.AbstractMap;

/* compiled from: RemovalNotification.java */
@g
@d9.b
/* loaded from: classes6.dex */
public final class v<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {

    /* renamed from: c, reason: collision with root package name */
    private static final long f55295c = 0;

    /* renamed from: b, reason: collision with root package name */
    private final q f55296b;

    private v(@zc.a K k4, @zc.a V v4, q qVar) {
        super(k4, v4);
        qVar.getClass();
        this.f55296b = qVar;
    }

    public static <K, V> v<K, V> a(@zc.a K k4, @zc.a V v4, q qVar) {
        return new v<>(k4, v4, qVar);
    }

    public q b() {
        return this.f55296b;
    }

    public boolean c() {
        return this.f55296b.wasEvicted();
    }
}
