package com.google.android.datatransport.runtime.dagger.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AbstractMapFactory.java */
/* loaded from: classes3.dex */
abstract class a<K, V, V2> implements g<Map<K, V2>> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, h3.c<V>> f12468a;

    /* compiled from: AbstractMapFactory.java */
    /* renamed from: com.google.android.datatransport.runtime.dagger.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0162a<K, V, V2> {

        /* renamed from: a, reason: collision with root package name */
        final LinkedHashMap<K, h3.c<V>> f12469a;

        AbstractC0162a(int i5) {
            this.f12469a = d.d(i5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        AbstractC0162a<K, V, V2> a(K k5, h3.c<V> cVar) {
            this.f12469a.put(p.c(k5, ProtectedSandApp.s("ध")), p.c(cVar, ProtectedSandApp.s("न")));
            return this;
        }

        AbstractC0162a<K, V, V2> b(h3.c<Map<K, V2>> cVar) {
            if (cVar instanceof e) {
                return b(((e) cVar).a());
            }
            this.f12469a.putAll(((a) cVar).f12468a);
            return this;
        }
    }

    a(Map<K, h3.c<V>> map) {
        this.f12468a = Collections.unmodifiableMap(map);
    }

    final Map<K, h3.c<V>> b() {
        return this.f12468a;
    }
}
