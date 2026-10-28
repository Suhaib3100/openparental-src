package org.apache.commons.text;

import java.util.Map;
import java.util.ResourceBundle;

/* compiled from: StrLookup.java */
@Deprecated
/* loaded from: classes3.dex */
public abstract class l<V> implements org.apache.commons.text.lookup.t {

    /* renamed from: a, reason: collision with root package name */
    private static final l<String> f86481a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final l<String> f86482b = new d();

    /* compiled from: StrLookup.java */
    static class b<V> extends l<V> {

        /* renamed from: c, reason: collision with root package name */
        private final Map<String, V> f86483c;

        b(Map<String, V> map) {
            this.f86483c = map;
        }

        @Override // org.apache.commons.text.lookup.t
        public String lookup(String str) {
            V v4;
            Map<String, V> map = this.f86483c;
            if (map == null || (v4 = map.get(str)) == null) {
                return null;
            }
            return v4.toString();
        }

        public String toString() {
            return super.toString() + " [map=" + this.f86483c + "]";
        }
    }

    /* compiled from: StrLookup.java */
    private static final class c extends l<String> {

        /* renamed from: c, reason: collision with root package name */
        private final ResourceBundle f86484c;

        @Override // org.apache.commons.text.lookup.t
        public String lookup(String str) {
            ResourceBundle resourceBundle = this.f86484c;
            if (resourceBundle == null || str == null || !resourceBundle.containsKey(str)) {
                return null;
            }
            return this.f86484c.getString(str);
        }

        public String toString() {
            return super.toString() + " [resourceBundle=" + this.f86484c + "]";
        }

        private c(ResourceBundle resourceBundle) {
            this.f86484c = resourceBundle;
        }
    }

    /* compiled from: StrLookup.java */
    private static final class d extends l<String> {
        private d() {
        }

        @Override // org.apache.commons.text.lookup.t
        public String lookup(String str) {
            if (str.length() > 0) {
                try {
                    return System.getProperty(str);
                } catch (SecurityException unused) {
                }
            }
            return null;
        }

        d(a aVar) {
        }
    }

    protected l() {
    }

    public static <V> l<V> b(Map<String, V> map) {
        return new b(map);
    }

    public static l<?> c() {
        return f86481a;
    }

    public static l<String> d(ResourceBundle resourceBundle) {
        return new c(resourceBundle);
    }

    public static l<String> e() {
        return f86482b;
    }
}
