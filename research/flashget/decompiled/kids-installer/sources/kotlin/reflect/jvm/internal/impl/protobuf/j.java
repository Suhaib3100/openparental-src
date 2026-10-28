package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* loaded from: classes5.dex */
public class j extends k {

    /* renamed from: e, reason: collision with root package name */
    private final o f25747e;

    /* compiled from: LazyField.java */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: o, reason: collision with root package name */
        private Map.Entry<K, j> f25748o;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f25748o.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            j value = this.f25748o.getValue();
            if (value == null) {
                return null;
            }
            return value.e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof o) {
                return this.f25748o.getValue().d((o) obj);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("何"));
        }

        private b(Map.Entry<K, j> entry) {
            this.f25748o = entry;
        }
    }

    /* compiled from: LazyField.java */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: o, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f25749o;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f25749o = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f25749o.next();
            return next.getValue() instanceof j ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25749o.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f25749o.remove();
        }
    }

    public o e() {
        return c(this.f25747e);
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
