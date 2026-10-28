package com.google.common.collect;

import com.google.common.collect.h3;
import java.io.Serializable;
import java.util.Map;

/* compiled from: ImmutableClassToInstanceMap.java */
@w0
@f9.j(containerOf = {"B"})
@d9.c
/* loaded from: classes6.dex */
public final class a3<B> extends b2<Class<? extends B>, B> implements a0<B>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final a3<Object> f55344c = new a3<>(h3.t());

    /* renamed from: b, reason: collision with root package name */
    private final h3<Class<? extends B>, B> f55345b;

    /* compiled from: ImmutableClassToInstanceMap.java */
    public static final class b<B> {

        /* renamed from: a, reason: collision with root package name */
        private final h3.b<Class<? extends B>, B> f55346a = h3.c();

        private static <B, T extends B> T b(Class<T> cls, B b5) {
            return (T) com.google.common.primitives.r.f(cls).cast(b5);
        }

        public a3<B> a() {
            h3<Class<? extends B>, B> d5 = this.f55346a.d();
            return d5.isEmpty() ? a3.T3() : new a3<>(d5);
        }

        @f9.a
        public <T extends B> b<B> c(Class<T> cls, T t4) {
            this.f55346a.i(cls, t4);
            return this;
        }

        @f9.a
        public <T extends B> b<B> d(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class<? extends T> key = entry.getKey();
                this.f55346a.i(key, b(key, entry.getValue()));
            }
            return this;
        }
    }

    public static <B> b<B> R3() {
        return new b<>();
    }

    public static <B, S extends B> a3<B> S3(Map<? extends Class<? extends S>, ? extends S> map) {
        return map instanceof a3 ? (a3) map : new b().d(map).a();
    }

    public static <B> a3<B> T3() {
        return (a3<B>) f55344c;
    }

    public static <B, T extends B> a3<B> U3(Class<T> cls, T t4) {
        return new a3<>(h3.u(cls, t4));
    }

    @Override // com.google.common.collect.a0
    @zc.a
    public <T extends B> T G(Class<T> cls) {
        h3<Class<? extends B>, B> h3Var = this.f55345b;
        cls.getClass();
        return h3Var.get(cls);
    }

    Object V3() {
        return isEmpty() ? f55344c : this;
    }

    @Override // com.google.common.collect.a0
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public <T extends B> T s(Class<T> cls, T t4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b2, com.google.common.collect.h2
    protected Object u3() {
        return this.f55345b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.b2
    /* renamed from: v3 */
    public Map<Class<? extends B>, B> u3() {
        return this.f55345b;
    }

    private a3(h3<Class<? extends B>, B> h3Var) {
        this.f55345b = h3Var;
    }
}
