package com.android.volley.toolbox;

import androidx.annotation.c1;
import androidx.annotation.q0;
import com.android.volley.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: HttpHeaderParser.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    public static final String f41037a = ProtectedSandApp.s("ۛ");

    /* renamed from: b, reason: collision with root package name */
    private static final String f41038b = ProtectedSandApp.s("ۚ");

    /* renamed from: c, reason: collision with root package name */
    private static final String f41039c = ProtectedSandApp.s("۟");

    /* renamed from: d, reason: collision with root package name */
    private static final String f41040d = ProtectedSandApp.s("ۊ");

    static List<com.android.volley.i> a(List<com.android.volley.i> list, e.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<com.android.volley.i> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.android.volley.i> list2 = aVar.f40869h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.android.volley.i iVar : aVar.f40869h) {
                    if (!treeSet.contains(iVar.a())) {
                        arrayList.add(iVar);
                    }
                }
            }
        } else if (!aVar.f40868g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f40868g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.android.volley.i(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    static String b(long j4) {
        return d(ProtectedSandApp.s("ۊ")).format(new Date(j4));
    }

    static Map<String, String> c(e.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = aVar.f40863b;
        if (str != null) {
            hashMap.put(ProtectedSandApp.s("ۋ"), str);
        }
        long j4 = aVar.f40865d;
        if (j4 > 0) {
            hashMap.put(ProtectedSandApp.s("ی"), b(j4));
        }
        return hashMap;
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(ProtectedSandApp.s("ۍ")));
        return simpleDateFormat;
    }

    @q0
    public static e.a e(com.android.volley.l lVar) {
        boolean z4;
        long j4;
        long j5;
        long j6;
        long j7;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = lVar.f40901c;
        if (map == null) {
            return null;
        }
        String str = map.get(ProtectedSandApp.s("ێ"));
        long h4 = str != null ? h(str) : 0L;
        String str2 = map.get(ProtectedSandApp.s("ۏ"));
        int i4 = 0;
        if (str2 != null) {
            String[] split = str2.split(ProtectedSandApp.s("ې"), 0);
            z4 = false;
            j4 = 0;
            j5 = 0;
            while (i4 < split.length) {
                String trim = split[i4].trim();
                if (trim.equals(ProtectedSandApp.s("ۑ")) || trim.equals(ProtectedSandApp.s("ے"))) {
                    return null;
                }
                if (trim.startsWith(ProtectedSandApp.s("ۓ"))) {
                    try {
                        j4 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith(ProtectedSandApp.s("۔"))) {
                    j5 = Long.parseLong(trim.substring(23));
                } else if (trim.equals(ProtectedSandApp.s("ە")) || trim.equals(ProtectedSandApp.s("ۖ"))) {
                    z4 = true;
                }
                i4++;
            }
            i4 = 1;
        } else {
            z4 = false;
            j4 = 0;
            j5 = 0;
        }
        String str3 = map.get(ProtectedSandApp.s("ۗ"));
        long h5 = str3 != null ? h(str3) : 0L;
        String str4 = map.get(ProtectedSandApp.s("ۘ"));
        long h6 = str4 != null ? h(str4) : 0L;
        String str5 = map.get(ProtectedSandApp.s("ۙ"));
        if (i4 != 0) {
            j7 = currentTimeMillis + (j4 * 1000);
            j6 = z4 ? j7 : (j5 * 1000) + j7;
        } else {
            j6 = 0;
            if (h4 <= 0 || h5 < h4) {
                j7 = 0;
            } else {
                j7 = currentTimeMillis + (h5 - h4);
                j6 = j7;
            }
        }
        e.a aVar = new e.a();
        aVar.f40862a = lVar.f40900b;
        aVar.f40863b = str5;
        aVar.f40867f = j7;
        aVar.f40866e = j6;
        aVar.f40864c = h4;
        aVar.f40865d = h6;
        aVar.f40868g = map;
        aVar.f40869h = lVar.f40902d;
        return aVar;
    }

    public static String f(@q0 Map<String, String> map) {
        return g(map, ProtectedSandApp.s("ۚ"));
    }

    public static String g(@q0 Map<String, String> map, String str) {
        if (map == null) {
            return str;
        }
        String str2 = map.get(ProtectedSandApp.s("ۛ"));
        if (str2 != null) {
            String[] split = str2.split(ProtectedSandApp.s("ۜ"), 0);
            for (int i4 = 1; i4 < split.length; i4++) {
                String[] split2 = split[i4].trim().split(ProtectedSandApp.s("\u06dd"), 0);
                if (split2.length == 2 && split2[0].equals(ProtectedSandApp.s("۞"))) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static long h(String str) {
        try {
            return d(ProtectedSandApp.s("۟")).parse(str).getTime();
        } catch (ParseException e4) {
            boolean equals = ProtectedSandApp.s("۠").equals(str);
            String s4 = ProtectedSandApp.s("ۡ");
            if (equals || ProtectedSandApp.s("ۢ").equals(str)) {
                com.android.volley.t.f(s4, str);
                return 0L;
            }
            com.android.volley.t.d(e4, s4, str);
            return 0L;
        }
    }

    static List<com.android.volley.i> i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new com.android.volley.i(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    static Map<String, String> j(List<com.android.volley.i> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.android.volley.i iVar : list) {
            treeMap.put(iVar.a(), iVar.b());
        }
        return treeMap;
    }
}
