package androidx.content.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* loaded from: classes3.dex */
public class s1 extends t1 {

    /* renamed from: f, reason: collision with root package name */
    private final i2 f28947f;

    /* compiled from: LazyField.java */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: b, reason: collision with root package name */
        private Map.Entry<K, s1> f28948b;

        public s1 a() {
            return this.f28948b.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f28948b.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            s1 value = this.f28948b.getValue();
            if (value == null) {
                return null;
            }
            return value.p();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof i2) {
                return this.f28948b.getValue().m((i2) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, s1> entry) {
            this.f28948b = entry;
        }
    }

    /* compiled from: LazyField.java */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f28949b;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f28949b = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f28949b.next();
            return next.getValue() instanceof s1 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28949b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f28949b.remove();
        }
    }

    public s1(i2 i2Var, s0 s0Var, w wVar) {
        super(s0Var, wVar);
        this.f28947f = i2Var;
    }

    @Override // androidx.content.preferences.protobuf.t1
    public boolean c() {
        return super.c() || this.f28954c == this.f28947f;
    }

    @Override // androidx.content.preferences.protobuf.t1
    public boolean equals(Object obj) {
        return p().equals(obj);
    }

    @Override // androidx.content.preferences.protobuf.t1
    public int hashCode() {
        return p().hashCode();
    }

    public i2 p() {
        return g(this.f28947f);
    }

    public String toString() {
        return p().toString();
    }
}
