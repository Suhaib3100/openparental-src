package net.time4j.tz.spi;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.i18n.e;
import net.time4j.tz.s;

/* compiled from: ZoneNameProviderSPI.java */
/* loaded from: classes7.dex */
public class d implements s {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<Locale, Map<String, Map<net.time4j.tz.d, String>>> f83665a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f83666b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Set<String>> f83667c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, String> f83668d;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(ProtectedSandApp.s("鷍\u0001"));
        hashSet.add(ProtectedSandApp.s("鷎\u0001"));
        hashSet.add(ProtectedSandApp.s("鷏\u0001"));
        hashSet.add(ProtectedSandApp.s("鷐\u0001"));
        hashSet.add(ProtectedSandApp.s("鷑\u0001"));
        hashSet.add(ProtectedSandApp.s("鷒\u0001"));
        hashSet.add(ProtectedSandApp.s("鷓\u0001"));
        hashSet.add(ProtectedSandApp.s("鷔\u0001"));
        hashSet.add(ProtectedSandApp.s("鷕\u0001"));
        f83666b = Collections.unmodifiableSet(hashSet);
        HashMap hashMap = new HashMap();
        g(hashMap, ProtectedSandApp.s("鷖\u0001"));
        f83667c = Collections.unmodifiableMap(hashMap);
        HashMap a5 = com.coremedia.iso.boxes.d.a(ProtectedSandApp.s("鷗\u0001"), ProtectedSandApp.s("鷘\u0001"), ProtectedSandApp.s("鷙\u0001"), ProtectedSandApp.s("鷚\u0001"));
        a5.put(ProtectedSandApp.s("鷛\u0001"), ProtectedSandApp.s("鷜\u0001"));
        a5.put(ProtectedSandApp.s("鷝\u0001"), ProtectedSandApp.s("鷞\u0001"));
        a5.put(ProtectedSandApp.s("鷟\u0001"), ProtectedSandApp.s("鷠\u0001"));
        a5.put(ProtectedSandApp.s("鷡\u0001"), ProtectedSandApp.s("鷢\u0001"));
        a5.put(ProtectedSandApp.s("鷣\u0001"), ProtectedSandApp.s("鷤\u0001"));
        a5.put(ProtectedSandApp.s("鷥\u0001"), ProtectedSandApp.s("鷦\u0001"));
        a5.put(ProtectedSandApp.s("鷧\u0001"), ProtectedSandApp.s("鷨\u0001"));
        a5.put(ProtectedSandApp.s("鷩\u0001"), ProtectedSandApp.s("鷪\u0001"));
        a5.put(ProtectedSandApp.s("鷫\u0001"), ProtectedSandApp.s("鷬\u0001"));
        f83668d = Collections.unmodifiableMap(a5);
    }

    private static void a(Map<String, String> map, String str, String str2) {
        map.put(str, str2);
    }

    private static void c(Map<String, Set<String>> map, String str, String str2) {
        Set<String> set = map.get(str);
        if (set == null) {
            set = new LinkedHashSet<>();
            map.put(str, set);
        }
        set.add(str2);
    }

    private static e f(Locale locale) {
        return e.i(ProtectedSandApp.s("鷭\u0001"), locale);
    }

    static void g(Map<String, Set<String>> map, String str) {
        InputStream e4 = net.time4j.base.d.c().e(net.time4j.base.d.c().f(ProtectedSandApp.s("鷮\u0001"), d.class, str), true);
        if (e4 == null) {
            e4 = ProtectedSandApp.a(d.class.getClassLoader(), str);
        }
        try {
            if (e4 == null) {
                System.err.println(ProtectedSandApp.s("鷳\u0001") + str + ProtectedSandApp.s("鷴\u0001"));
                return;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e4, ProtectedSandApp.s("鷯\u0001")));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            e4.close();
                            return;
                        } catch (IOException e5) {
                            e5.printStackTrace(System.err);
                            return;
                        }
                    }
                    if (!readLine.startsWith(ProtectedSandApp.s("鷰\u0001")) && !readLine.isEmpty()) {
                        String[] split = readLine.split(ProtectedSandApp.s("鷱\u0001"));
                        if (split.length >= 3) {
                            for (String str2 : split[0].split(ProtectedSandApp.s("鷲\u0001"))) {
                                c(map, str2, split[2]);
                            }
                        }
                    }
                }
            } catch (UnsupportedEncodingException e6) {
                throw new AssertionError(e6);
            } catch (IOException e7) {
                throw new IllegalStateException(e7);
            }
        } catch (Throwable th) {
            try {
                e4.close();
            } catch (IOException e10) {
                e10.printStackTrace(System.err);
            }
            throw th;
        }
    }

    @Override // net.time4j.tz.s
    public Set<String> b(Locale locale, boolean z4) {
        String country = locale.getCountry();
        if (z4) {
            if (country.equals(ProtectedSandApp.s("鷵\u0001"))) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(ProtectedSandApp.s("鷶\u0001"));
                linkedHashSet.add(ProtectedSandApp.s("鷷\u0001"));
                linkedHashSet.add(ProtectedSandApp.s("鷸\u0001"));
                linkedHashSet.add(ProtectedSandApp.s("鷹\u0001"));
                linkedHashSet.add(ProtectedSandApp.s("鷺\u0001"));
                linkedHashSet.add(ProtectedSandApp.s("鷻\u0001"));
                return Collections.unmodifiableSet(linkedHashSet);
            }
            String str = f83668d.get(country);
            if (str != null) {
                return Collections.singleton(str);
            }
        }
        Set<String> set = f83667c.get(country);
        return set == null ? Collections.emptySet() : set;
    }

    @Override // net.time4j.tz.s
    public String d(boolean z4, Locale locale) {
        return e.i(ProtectedSandApp.s("鷭\u0001"), locale).g(z4 ? ProtectedSandApp.s("鷼\u0001") : ProtectedSandApp.s("鷽\u0001"));
    }

    @Override // net.time4j.tz.s
    public String e(String str, net.time4j.tz.d dVar, Locale locale) {
        if (f83666b.contains(str)) {
            return "";
        }
        Map<String, Map<net.time4j.tz.d, String>> map = f83665a.get(locale);
        if (map == null) {
            String[][] zoneStrings = DateFormatSymbols.getInstance(locale).getZoneStrings();
            HashMap hashMap = new HashMap();
            for (String[] strArr : zoneStrings) {
                EnumMap enumMap = new EnumMap(net.time4j.tz.d.class);
                enumMap.put((EnumMap) net.time4j.tz.d.LONG_STANDARD_TIME, (net.time4j.tz.d) strArr[1]);
                enumMap.put((EnumMap) net.time4j.tz.d.SHORT_STANDARD_TIME, (net.time4j.tz.d) strArr[2]);
                enumMap.put((EnumMap) net.time4j.tz.d.LONG_DAYLIGHT_TIME, (net.time4j.tz.d) strArr[3]);
                enumMap.put((EnumMap) net.time4j.tz.d.SHORT_DAYLIGHT_TIME, (net.time4j.tz.d) strArr[4]);
                hashMap.put(strArr[0], enumMap);
            }
            map = f83665a.putIfAbsent(locale, hashMap);
            if (map == null) {
                map = hashMap;
            }
        }
        Map<net.time4j.tz.d, String> map2 = map.get(str);
        return map2 != null ? map2.get(dVar) : "";
    }
}
