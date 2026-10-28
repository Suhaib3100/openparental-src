package net.time4j.tz.spi;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.m;
import net.time4j.tz.r;
import net.time4j.tz.s;

/* compiled from: WinZoneProviderSPI.java */
/* loaded from: classes7.dex */
public class c implements r, s {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Map<String, String>> f83660a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, Set<String>> f83661b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map<String, Map<String, Set<k>>> f83662c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f83663d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f83664e = ProtectedSandApp.s("鷄\u0001");

    static {
        Map<String, Map<String, String>> m4 = m();
        String s4 = ProtectedSandApp.s("鷄\u0001");
        f83663d = m4.get(s4).keySet().iterator().next();
        m4.remove(s4);
        f83660a = Collections.unmodifiableMap(m4);
        f83661b = o();
        f83662c = n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T h(Object obj) {
        return obj;
    }

    private static Set<Map.Entry<String, String>> i() {
        return l(ProtectedSandApp.s("鷅\u0001")).entrySet();
    }

    private static Set<String> j(String str) {
        Set<String> set = f83661b.get(str);
        return set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
    }

    private static Set<String> k(String str, boolean z4) {
        return z4 ? j(str) : l(str).keySet();
    }

    private static Map<String, String> l(String str) {
        Map<String, String> map = f83660a.get(str);
        return map == null ? Collections.emptyMap() : Collections.unmodifiableMap(map);
    }

    private static Map<String, Map<String, String>> m() {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                String s4 = ProtectedSandApp.s("鷆\u0001");
                InputStream e4 = net.time4j.base.d.c().e(net.time4j.base.d.c().f(ProtectedSandApp.s("鷇\u0001"), c.class, s4), true);
                if (e4 == null) {
                    e4 = ProtectedSandApp.a(c.class.getClassLoader(), s4);
                }
                objectInputStream = new ObjectInputStream(e4);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e5) {
            e = e5;
        } catch (ClassNotFoundException e6) {
            e = e6;
        }
        try {
            String readUTF = objectInputStream.readUTF();
            HashMap hashMap = new HashMap((Map) objectInputStream.readObject());
            hashMap.put(ProtectedSandApp.s("鷄\u0001"), Collections.singletonMap(readUTF, readUTF));
            try {
                objectInputStream.close();
            } catch (IOException unused) {
            }
            return hashMap;
        } catch (IOException e7) {
            e = e7;
            throw new IllegalStateException(e);
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new IllegalStateException(e);
        } catch (Throwable th2) {
            objectInputStream2 = objectInputStream;
            th = th2;
            if (objectInputStream2 != null) {
                try {
                    objectInputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    private static Map<String, Map<String, Set<k>>> n() {
        HashMap hashMap = new HashMap();
        for (String str : f83660a.keySet()) {
            for (Map.Entry<String, String> entry : f83660a.get(str).entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Map map = (Map) hashMap.get(value);
                if (map == null) {
                    map = new HashMap();
                    hashMap.put(value, map);
                }
                Set set = (Set) map.get(str);
                if (set == null) {
                    set = new HashSet();
                    map.put(str, set);
                }
                set.add(new b(key));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    private static Map<String, Set<String>> o() {
        HashMap hashMap = new HashMap();
        for (String str : f83660a.keySet()) {
            Map<String, String> l4 = l(str);
            ?? keySet = l4.keySet();
            if (keySet.size() >= 2) {
                keySet = new HashSet();
                Iterator it = new HashSet(l4.values()).iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    for (Map.Entry<String, String> entry : i()) {
                        if (entry.getValue().equals(str2)) {
                            keySet.add(entry.getKey());
                        }
                    }
                }
            }
            hashMap.put(str, keySet);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // net.time4j.tz.r
    public s a() {
        return this;
    }

    @Override // net.time4j.tz.s
    public Set<String> b(Locale locale, boolean z4) {
        return k(locale.getCountry(), z4);
    }

    @Override // net.time4j.tz.r
    public Map<String, String> c() {
        return Collections.emptyMap();
    }

    @Override // net.time4j.tz.s
    public String d(boolean z4, Locale locale) {
        return z4 ? ProtectedSandApp.s("鷈\u0001") : ProtectedSandApp.s("鷉\u0001");
    }

    @Override // net.time4j.tz.s
    public String e(String str, net.time4j.tz.d dVar, Locale locale) {
        String str2;
        return (str.isEmpty() || (str2 = l(locale.getCountry()).get(ProtectedSandApp.s("鷊\u0001").concat(str))) == null) ? "" : str2;
    }

    @Override // net.time4j.tz.r
    public Set<String> f() {
        HashSet hashSet = new HashSet();
        Iterator<k> it = l.A(ProtectedSandApp.s("鷋\u0001")).iterator();
        while (it.hasNext()) {
            hashSet.add(ProtectedSandApp.s("鷊\u0001") + it.next().canonical());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // net.time4j.tz.r
    public String g() {
        return ProtectedSandApp.s("鷋\u0001");
    }

    @Override // net.time4j.tz.r
    public String getLocation() {
        return "";
    }

    @Override // net.time4j.tz.r
    public String getName() {
        return ProtectedSandApp.s("鷌\u0001");
    }

    @Override // net.time4j.tz.r
    public String getVersion() {
        return "";
    }

    @Override // net.time4j.tz.r
    public m load(String str) {
        return null;
    }
}
