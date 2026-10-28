package com.google.common.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b2;
import com.google.common.collect.c2;
import com.google.common.collect.d4;
import com.google.common.collect.j2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: MutableTypeToInstanceMap.java */
@d
/* loaded from: classes6.dex */
public final class h<B> extends b2<p<? extends B>, B> implements o<B> {

    /* renamed from: b, reason: collision with root package name */
    private final Map<p<? extends B>, B> f57577b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MutableTypeToInstanceMap.java */
    static final class a<K, V> extends c2<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private final Map.Entry<K, V> f57578b;

        /* compiled from: MutableTypeToInstanceMap.java */
        /* renamed from: com.google.common.reflect.h$a$a, reason: collision with other inner class name */
        class C0881a extends j2<Map.Entry<K, V>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Set f57579b;

            C0881a(Set set) {
                this.f57579b = set;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.j2, com.google.common.collect.q1
            /* renamed from: T3 */
            public Set<Map.Entry<K, V>> u3() {
                return this.f57579b;
            }

            @Override // com.google.common.collect.q1, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return a.N3(super.iterator());
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

        private a(Map.Entry<K, V> entry) {
            entry.getClass();
            this.f57578b = entry;
        }

        public static /* synthetic */ a L3(Map.Entry entry) {
            return new a(entry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <K, V> Iterator<Map.Entry<K, V>> N3(Iterator<Map.Entry<K, V>> it) {
            return d4.c0(it, new g());
        }

        static <K, V> Set<Map.Entry<K, V>> O3(Set<Map.Entry<K, V>> set) {
            return new C0881a(set);
        }

        @Override // com.google.common.collect.c2, java.util.Map.Entry
        public V setValue(V v4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.c2, com.google.common.collect.h2
        protected Object u3() {
            return this.f57578b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c2
        /* renamed from: v3 */
        public Map.Entry<K, V> u3() {
            return this.f57578b;
        }
    }

    @zc.a
    private <T extends B> T S3(p<T> pVar) {
        return this.f57577b.get(pVar);
    }

    @zc.a
    private <T extends B> T T3(p<T> pVar, T t4) {
        return this.f57577b.put(pVar, t4);
    }

    @Override // com.google.common.reflect.o
    @zc.a
    public <T extends B> T G(Class<T> cls) {
        return this.f57577b.get(p.S(cls));
    }

    @Override // com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    /* renamed from: R3, reason: merged with bridge method [inline-methods] */
    public B put(p<? extends B> pVar, B b5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("螺"));
    }

    @Override // com.google.common.collect.b2, java.util.Map
    public Set<Map.Entry<p<? extends B>, B>> entrySet() {
        return new a.C0881a(super.entrySet());
    }

    @Override // com.google.common.reflect.o
    @zc.a
    @f9.a
    public <T extends B> T l2(p<T> pVar, T t4) {
        return this.f57577b.put(pVar.U(), t4);
    }

    @Override // com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends p<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("螺"));
    }

    @Override // com.google.common.reflect.o
    @zc.a
    @f9.a
    public <T extends B> T s(Class<T> cls, T t4) {
        return this.f57577b.put(p.S(cls), t4);
    }

    @Override // com.google.common.collect.b2, com.google.common.collect.h2
    protected Object u3() {
        return this.f57577b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.b2
    /* renamed from: v3 */
    public Map<p<? extends B>, B> u3() {
        return this.f57577b;
    }

    @Override // com.google.common.reflect.o
    @zc.a
    public <T extends B> T y1(p<T> pVar) {
        return this.f57577b.get(pVar.U());
    }
}
