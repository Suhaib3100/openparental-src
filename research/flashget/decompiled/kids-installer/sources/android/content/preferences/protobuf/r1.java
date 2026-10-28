package android.content.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* loaded from: classes3.dex */
public class r1 extends s1 {

    /* renamed from: f, reason: collision with root package name */
    private final h2 f7496f;

    /* compiled from: LazyField.java */
    /* loaded from: classes.dex */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: o, reason: collision with root package name */
        private Map.Entry<K, r1> f7497o;

        public r1 a() {
            return this.f7497o.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f7497o.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            r1 value = this.f7497o.getValue();
            if (value == null) {
                return null;
            }
            return value.p();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof h2) {
                return this.f7497o.getValue().m((h2) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, r1> entry) {
            this.f7497o = entry;
        }
    }

    /* compiled from: LazyField.java */
    /* loaded from: classes.dex */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: o, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f7498o;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f7498o = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f7498o.next();
            return next.getValue() instanceof r1 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7498o.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f7498o.remove();
        }
    }

    public r1(h2 h2Var, s0 s0Var, w wVar) {
        super(s0Var, wVar);
        this.f7496f = h2Var;
    }

    @Override // android.content.preferences.protobuf.s1
    public boolean c() {
        return super.c() || this.f7512c == this.f7496f;
    }

    @Override // android.content.preferences.protobuf.s1
    public boolean equals(Object obj) {
        return p().equals(obj);
    }

    @Override // android.content.preferences.protobuf.s1
    public int hashCode() {
        return p().hashCode();
    }

    public h2 p() {
        return g(this.f7496f);
    }

    public String toString() {
        return p().toString();
    }
}
