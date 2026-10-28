package com.google.common.reflect;

import com.google.common.collect.b2;
import com.google.common.collect.h3;
import java.util.Map;

/* compiled from: ImmutableTypeToInstanceMap.java */
@d
/* loaded from: classes6.dex */
public final class e<B> extends b2<p<? extends B>, B> implements o<B> {

    /* renamed from: b, reason: collision with root package name */
    private final h3<p<? extends B>, B> f57571b;

    /* compiled from: ImmutableTypeToInstanceMap.java */
    public static final class b<B> {

        /* renamed from: a, reason: collision with root package name */
        private final h3.b<p<? extends B>, B> f57572a;

        public e<B> a() {
            return new e<>(this.f57572a.d());
        }

        @f9.a
        public <T extends B> b<B> b(p<T> pVar, T t4) {
            this.f57572a.i(pVar.U(), t4);
            return this;
        }

        @f9.a
        public <T extends B> b<B> c(Class<T> cls, T t4) {
            this.f57572a.i(p.S(cls), t4);
            return this;
        }

        private b() {
            this.f57572a = h3.c();
        }
    }

    public static <B> b<B> R3() {
        return new b<>();
    }

    public static <B> e<B> S3() {
        return new e<>(h3.t());
    }

    @zc.a
    private <T extends B> T U3(p<T> pVar) {
        return this.f57571b.get(pVar);
    }

    @Override // com.google.common.reflect.o
    @zc.a
    public <T extends B> T G(Class<T> cls) {
        return this.f57571b.get(p.S(cls));
    }

    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public B T3(p<? extends B> pVar, B b5) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.o
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public <T extends B> T l2(p<T> pVar, T t4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends p<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.o
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public <T extends B> T s(Class<T> cls, T t4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b2, com.google.common.collect.h2
    protected Object u3() {
        return this.f57571b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.b2
    /* renamed from: v3 */
    public Map<p<? extends B>, B> u3() {
        return this.f57571b;
    }

    @Override // com.google.common.reflect.o
    @zc.a
    public <T extends B> T y1(p<T> pVar) {
        return this.f57571b.get(pVar.U());
    }

    private e(h3<p<? extends B>, B> h3Var) {
        this.f57571b = h3Var;
    }
}
