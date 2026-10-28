package com.google.common.collect;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MutableClassToInstanceMap.java */
@w0
@d9.c
/* loaded from: classes6.dex */
public final class w4<B> extends b2<Class<? extends B>, B> implements a0<B>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<? extends B>, B> f56620b;

    /* compiled from: MutableClassToInstanceMap.java */
    class a extends c2<Class<? extends B>, B> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map.Entry f56621b;

        a(Map.Entry entry) {
            this.f56621b = entry;
        }

        @Override // com.google.common.collect.c2, java.util.Map.Entry
        public B setValue(B b5) {
            return (B) super.setValue(w4.S3(getKey(), b5));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c2, com.google.common.collect.h2
        /* renamed from: v3 */
        public Map.Entry<Class<? extends B>, B> u3() {
            return this.f56621b;
        }
    }

    /* compiled from: MutableClassToInstanceMap.java */
    class b extends j2<Map.Entry<Class<? extends B>, B>> {

        /* compiled from: MutableClassToInstanceMap.java */
        class a extends v6<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            a(b bVar, Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.v6
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Class<? extends B>, B> a(Map.Entry<Class<? extends B>, B> entry) {
                return new a(entry);
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: T3 */
        public Set<Map.Entry<Class<? extends B>, B>> u3() {
            return w4.this.u3().entrySet();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new a(u3().iterator());
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return Q3();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) R3(tArr);
        }
    }

    /* compiled from: MutableClassToInstanceMap.java */
    private static final class c<B> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f56623c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final Map<Class<? extends B>, B> f56624b;

        c(Map<Class<? extends B>, B> map) {
            this.f56624b = map;
        }

        Object a() {
            return w4.V3(this.f56624b);
        }
    }

    private w4(Map<Class<? extends B>, B> map) {
        map.getClass();
        this.f56620b = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @zc.a
    @f9.a
    public static <B, T extends B> T S3(Class<T> cls, @zc.a B b5) {
        return (T) com.google.common.primitives.r.f(cls).cast(b5);
    }

    static <B> Map.Entry<Class<? extends B>, B> T3(Map.Entry<Class<? extends B>, B> entry) {
        return new a(entry);
    }

    public static <B> w4<B> U3() {
        return new w4<>(new HashMap());
    }

    public static <B> w4<B> V3(Map<Class<? extends B>, B> map) {
        return new w4<>(map);
    }

    private Object X3() {
        return new c(this.f56620b);
    }

    @Override // com.google.common.collect.a0
    @zc.a
    public <T extends B> T G(Class<T> cls) {
        return (T) S3(cls, get(cls));
    }

    @Override // com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    @zc.a
    @f9.a
    /* renamed from: W3, reason: merged with bridge method [inline-methods] */
    public B put(Class<? extends B> cls, B b5) {
        return (B) super.put(cls, S3(cls, b5));
    }

    @Override // com.google.common.collect.b2, java.util.Map
    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new b();
    }

    @Override // com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            S3((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.a0
    @zc.a
    @f9.a
    public <T extends B> T s(Class<T> cls, T t4) {
        return (T) S3(cls, put(cls, t4));
    }

    @Override // com.google.common.collect.b2, com.google.common.collect.h2
    protected Object u3() {
        return this.f56620b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.b2
    /* renamed from: v3 */
    public Map<Class<? extends B>, B> u3() {
        return this.f56620b;
    }
}
