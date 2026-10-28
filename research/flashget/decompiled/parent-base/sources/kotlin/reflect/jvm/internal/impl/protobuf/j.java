package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* loaded from: classes7.dex */
public class j extends k {

    /* renamed from: e, reason: collision with root package name */
    private final o f77729e;

    /* compiled from: LazyField.java */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: b, reason: collision with root package name */
        private Map.Entry<K, j> f77730b;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f77730b.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            j value = this.f77730b.getValue();
            if (value == null) {
                return null;
            }
            return value.e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof o) {
                return this.f77730b.getValue().d((o) obj);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("盜\u0001"));
        }

        private b(Map.Entry<K, j> entry) {
            this.f77730b = entry;
        }
    }

    /* compiled from: LazyField.java */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f77731b;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f77731b = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f77731b.next();
            return next.getValue() instanceof j ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f77731b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f77731b.remove();
        }
    }

    public o e() {
        return c(this.f77729e);
    }

    public boolean equals(Object obj) {
        return e().equals(obj);
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString();
    }
}
