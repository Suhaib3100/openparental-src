package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: CharSet.java */
/* loaded from: classes6.dex */
public class k implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final long f86030c = 5947847346149275958L;

    /* renamed from: d, reason: collision with root package name */
    public static final k f86031d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f86032e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f86033f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f86034g;

    /* renamed from: h, reason: collision with root package name */
    public static final k f86035h;

    /* renamed from: i, reason: collision with root package name */
    protected static final Map<String, k> f86036i;

    /* renamed from: b, reason: collision with root package name */
    private final Set<i> f86037b = Collections.synchronizedSet(new HashSet());

    static {
        k kVar = new k(null);
        f86031d = kVar;
        k kVar2 = new k("a-zA-Z");
        f86032e = kVar2;
        k kVar3 = new k("a-z");
        f86033f = kVar3;
        k kVar4 = new k("A-Z");
        f86034g = kVar4;
        k kVar5 = new k("0-9");
        f86035h = kVar5;
        Map<String, k> synchronizedMap = Collections.synchronizedMap(new HashMap());
        f86036i = synchronizedMap;
        synchronizedMap.put(null, kVar);
        synchronizedMap.put("", kVar);
        synchronizedMap.put("a-zA-Z", kVar2);
        synchronizedMap.put("A-Za-z", kVar2);
        synchronizedMap.put("a-z", kVar3);
        synchronizedMap.put("A-Z", kVar4);
        synchronizedMap.put("0-9", kVar5);
    }

    protected k(String... strArr) {
        for (String str : strArr) {
            a(str);
        }
    }

    public static k d(String... strArr) {
        k kVar;
        if (strArr == null) {
            return null;
        }
        return (strArr.length != 1 || (kVar = f86036i.get(strArr[0])) == null) ? new k(strArr) : kVar;
    }

    protected void a(String str) {
        if (str == null) {
            return;
        }
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int i5 = length - i4;
            if (i5 >= 4 && str.charAt(i4) == '^' && str.charAt(i4 + 2) == '-') {
                this.f86037b.add(i.s(str.charAt(i4 + 1), str.charAt(i4 + 3)));
                i4 += 4;
            } else if (i5 >= 3 && str.charAt(i4 + 1) == '-') {
                this.f86037b.add(i.p(str.charAt(i4), str.charAt(i4 + 2)));
                i4 += 3;
            } else if (i5 < 2 || str.charAt(i4) != '^') {
                this.f86037b.add(i.m(str.charAt(i4)));
                i4++;
            } else {
                this.f86037b.add(i.r(str.charAt(i4 + 1)));
                i4 += 2;
            }
        }
    }

    public boolean b(char c5) {
        synchronized (this.f86037b) {
            try {
                Iterator<i> it = this.f86037b.iterator();
                while (it.hasNext()) {
                    if (it.next().h(c5)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    i[] c() {
        return (i[]) this.f86037b.toArray(new i[0]);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return this.f86037b.equals(((k) obj).f86037b);
        }
        return false;
    }

    public int hashCode() {
        return this.f86037b.hashCode() + 89;
    }

    public String toString() {
        return this.f86037b.toString();
    }
}
