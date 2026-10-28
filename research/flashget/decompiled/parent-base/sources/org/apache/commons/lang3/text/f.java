package org.apache.commons.lang3.text;

import java.util.Map;

/* compiled from: StrLookup.java */
@Deprecated
/* loaded from: classes6.dex */
public abstract class f<V> {

    /* renamed from: a, reason: collision with root package name */
    private static final f<String> f86162a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final f<String> f86163b = new c();

    /* compiled from: StrLookup.java */
    static class b<V> extends f<V> {

        /* renamed from: c, reason: collision with root package name */
        private final Map<String, V> f86164c;

        b(Map<String, V> map) {
            this.f86164c = map;
        }

        @Override // org.apache.commons.lang3.text.f
        public String a(String str) {
            V v4;
            Map<String, V> map = this.f86164c;
            if (map == null || (v4 = map.get(str)) == null) {
                return null;
            }
            return v4.toString();
        }
    }

    /* compiled from: StrLookup.java */
    private static class c extends f<String> {
        private c() {
        }

        @Override // org.apache.commons.lang3.text.f
        public String a(String str) {
            if (str.isEmpty()) {
                return null;
            }
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        }

        c(a aVar) {
        }
    }

    protected f() {
    }

    public static <V> f<V> b(Map<String, V> map) {
        return new b(map);
    }

    public static f<?> c() {
        return f86162a;
    }

    public static f<String> d() {
        return f86163b;
    }

    public abstract String a(String str);
}
