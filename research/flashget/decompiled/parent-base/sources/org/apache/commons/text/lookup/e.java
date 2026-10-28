package org.apache.commons.text.lookup;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ConstantStringLookup.java */
/* loaded from: classes3.dex */
class e extends a {

    /* renamed from: d, reason: collision with root package name */
    private static final char f86515d = '.';

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f86514c = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    static final e f86516e = new e();

    e() {
    }

    static void g() {
        f86514c.clear();
    }

    protected Class<?> h(String str) throws ClassNotFoundException {
        return org.apache.commons.lang3.s.q(str);
    }

    protected Object i(String str, String str2) throws Exception {
        Class<?> h4 = h(str);
        if (h4 == null) {
            return null;
        }
        return h4.getField(str2).get(null);
    }

    @Override // org.apache.commons.text.lookup.t
    public synchronized String lookup(String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f86514c;
        String str2 = concurrentHashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return null;
        }
        try {
            Object i4 = i(str.substring(0, lastIndexOf), str.substring(lastIndexOf + 1));
            if (i4 != null) {
                str2 = Objects.toString(i4, null);
                concurrentHashMap.put(str, str2);
            }
            return str2;
        } catch (Exception unused) {
            return null;
        }
    }
}
