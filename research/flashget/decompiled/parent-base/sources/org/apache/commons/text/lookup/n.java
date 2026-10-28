package org.apache.commons.text.lookup;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: InterpolatorStringLookup.java */
/* loaded from: classes3.dex */
class n extends a {

    /* renamed from: e, reason: collision with root package name */
    static final a f86527e = new n((Map) null);

    /* renamed from: f, reason: collision with root package name */
    private static final char f86528f = ':';

    /* renamed from: c, reason: collision with root package name */
    private final t f86529c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, t> f86530d;

    n(Map<String, t> map, t tVar, boolean z4) {
        this.f86529c = tVar;
        this.f86530d = new HashMap(map.size());
        for (Map.Entry<String, t> entry : map.entrySet()) {
            this.f86530d.put(entry.getKey().toLowerCase(Locale.ROOT), entry.getValue());
        }
        if (z4) {
            b0.f86488a.d(this.f86530d);
        }
    }

    static String h(String str) {
        return str.toLowerCase(Locale.ROOT);
    }

    public Map<String, t> g() {
        return this.f86530d;
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            String lowerCase = str.substring(0, indexOf).toLowerCase(Locale.ROOT);
            int i4 = indexOf + 1;
            String substring = str.substring(i4);
            t tVar = this.f86530d.get(lowerCase);
            String lookup = tVar != null ? tVar.lookup(substring) : null;
            if (lookup != null) {
                return lookup;
            }
            str = str.substring(i4);
        }
        t tVar2 = this.f86529c;
        if (tVar2 != null) {
            return tVar2.lookup(str);
        }
        return null;
    }

    public String toString() {
        return super.toString() + " [stringLookupMap=" + this.f86530d + ", defaultStringLookup=" + this.f86529c + "]";
    }

    n() {
        this((Map) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    <V> n(java.util.Map<java.lang.String, V> r2) {
        /*
            r1 = this;
            org.apache.commons.text.lookup.b0 r0 = org.apache.commons.text.lookup.b0.f86488a
            if (r2 != 0) goto L9
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
        L9:
            r0.getClass()
            org.apache.commons.text.lookup.k r2 = org.apache.commons.text.lookup.k.g(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.text.lookup.n.<init>(java.util.Map):void");
    }

    n(t tVar) {
        this(new HashMap(), tVar, true);
    }
}
