package com.tencent.beacon.base.net.b;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.q0;
import com.cby.txliteav.live.impl.tx.f;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.d.h;
import com.tencent.beacon.pack.RequestPackage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.m;

/* compiled from: NetUtils.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f71310a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f71311b;

    static {
        HashMap hashMap = new HashMap(8);
        f71310a = hashMap;
        HashMap hashMap2 = new HashMap(7);
        f71311b = hashMap2;
        hashMap.put(ProtectedSandApp.s("ㄩ\u0001"), ProtectedSandApp.s("ㄪ\u0001"));
        hashMap.put(ProtectedSandApp.s("ㄫ\u0001"), String.valueOf(2));
        hashMap.put(ProtectedSandApp.s("ㄬ\u0001"), ProtectedSandApp.s("ㄭ\u0001"));
        hashMap.put(ProtectedSandApp.s("ㄮ\u0001"), ProtectedSandApp.s("ㄯ\u0001"));
        hashMap.put(ProtectedSandApp.s("\u3130\u0001"), String.valueOf(com.tencent.beacon.d.b.b().a()));
        hashMap2.putAll(hashMap);
    }

    public static void a(Map<String, List<String>> map) {
        List<String> list;
        String s4 = ProtectedSandApp.s("ㅉ\u0001");
        String s5 = ProtectedSandApp.s("ㅊ\u0001");
        if (map == null) {
            return;
        }
        try {
            if (map.containsKey(s5) && (list = map.get(s5)) != null) {
                c(String.valueOf(list.get(0)));
            }
            if (map.containsKey(s4)) {
                for (String str : map.get(s4)) {
                    if (str.contains(ProtectedSandApp.s("ㅋ\u0001"))) {
                        b(str.substring(0, str.indexOf(59)));
                    }
                }
            }
        } catch (Throwable th) {
            String a5 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("ㅌ\u0001")));
            com.tencent.beacon.base.util.c.b(a5, new Object[0]);
            j.e().a(ProtectedSandApp.s("ㅍ\u0001"), a5);
        }
    }

    private static void b(String str) {
        if (str == null) {
            return;
        }
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㅈ\u0001"), ProtectedSandApp.s("ㅏ\u0001"), str);
        h.d().c(str);
    }

    public static void c(Map<String, String> map) {
        String s4 = ProtectedSandApp.s("ㅊ\u0001");
        if (map == null) {
            return;
        }
        try {
            if (map.containsKey(s4)) {
                c(String.valueOf(map.get(s4)));
            }
        } catch (Throwable th) {
            String a5 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("ㅓ\u0001")));
            com.tencent.beacon.base.util.c.b(a5, new Object[0]);
            j.e().a(ProtectedSandApp.s("ㅔ\u0001"), a5);
        }
    }

    public static boolean d() {
        NetworkInfo b5 = b();
        return b5 != null && b5.isConnected();
    }

    public static synchronized Map<String, String> e() {
        Map<String, String> map;
        synchronized (d.class) {
            map = f71311b;
            map.put(ProtectedSandApp.s("ㅕ\u0001"), ProtectedSandApp.s("ㅖ\u0001"));
            map.put(ProtectedSandApp.s("ㅗ\u0001"), ProtectedSandApp.s("ㅘ\u0001"));
            map.put(ProtectedSandApp.s("\u3130\u0001"), String.valueOf(2));
        }
        return map;
    }

    private static void f() {
        h d5 = h.d();
        if (d5 == null) {
            return;
        }
        String b5 = d5.b();
        if (b5 != null) {
            f71310a.put(ProtectedSandApp.s("ㅙ\u0001"), b5);
            return;
        }
        String s4 = ProtectedSandApp.s("ㅚ\u0001");
        com.tencent.beacon.base.util.c.a(s4, new Object[0]);
        j.e().a(ProtectedSandApp.s("ㅛ\u0001"), s4);
    }

    @b1("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkInfo b() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) com.tencent.beacon.a.c.c.c().b().getSystemService(ProtectedSandApp.s("ㅎ\u0001"));
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th) {
            com.tencent.beacon.base.util.c.a(th);
            return null;
        }
    }

    public static String b(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.trim().length() > 0 && a(key)) {
                String trim = key.trim();
                String s4 = ProtectedSandApp.s("ㄼ\u0001");
                sb.append(s4);
                String s5 = ProtectedSandApp.s("ㄺ\u0001");
                String s6 = ProtectedSandApp.s("ㄻ\u0001");
                String replace = trim.replace(s5, s6);
                String s7 = ProtectedSandApp.s("ㄽ\u0001");
                String replace2 = replace.replace(s4, s7);
                String s10 = ProtectedSandApp.s("ㄾ\u0001");
                String s11 = ProtectedSandApp.s("ㄿ\u0001");
                sb.append(replace2.replace(s10, s11));
                sb.append(s10);
                String value = entry.getValue();
                if (value != null) {
                    sb.append(value.trim().replace('\n', ' ').replace(m.f86065d, ' ').replace(s5, s6).replace(s4, s7).replace(s10, s11));
                }
            } else {
                com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("ㅂ\u0001"), key);
            }
        }
        return sb.length() > 0 ? sb.substring(1) : "";
    }

    private static void c(String str) {
        if (str == null) {
            return;
        }
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㅈ\u0001"), ProtectedSandApp.s("ㅒ\u0001"), str);
        h.d().b(str);
    }

    public static String c() {
        NetworkInfo b5 = b();
        if (b5 == null) {
            return ProtectedSandApp.s("ㅐ\u0001");
        }
        if (b5.getType() == 1) {
            return ProtectedSandApp.s("ㅑ\u0001");
        }
        String extraInfo = b5.getExtraInfo();
        if (extraInfo != null && extraInfo.length() > 64) {
            extraInfo = extraInfo.substring(0, 64);
        }
        return androidx.constraintlayout.core.motion.key.c.a("", extraInfo);
    }

    public static RequestPackage a(int i4, byte[] bArr, Map<String, String> map, String str) {
        com.tencent.beacon.a.c.c c5 = com.tencent.beacon.a.c.c.c();
        com.tencent.beacon.a.c.e l4 = com.tencent.beacon.a.c.e.l();
        RequestPackage requestPackage = new RequestPackage();
        requestPackage.model = g.e().h();
        requestPackage.osVersion = l4.t();
        requestPackage.platformId = c5.g();
        requestPackage.appkey = str;
        requestPackage.appVersion = com.tencent.beacon.a.c.b.a();
        requestPackage.sdkId = c5.h();
        requestPackage.sdkVersion = c5.i();
        requestPackage.cmd = i4;
        requestPackage.encryType = (byte) 3;
        requestPackage.zipType = (byte) 2;
        requestPackage.sBuffer = bArr;
        requestPackage.reserved = b(map);
        return requestPackage;
    }

    @q0
    public static Map<String, String> a(String str, Map<String, String> map) {
        String s4;
        int i4;
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            s4 = ProtectedSandApp.s("ㄵ\u0001");
            if (!hasNext) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            if (next.getKey() == null) {
                com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("ㄶ\u0001"), new Object[i5]);
                i4 = i5;
            } else {
                String valueOf = String.valueOf(next.getKey());
                int length = valueOf.trim().length();
                String s5 = ProtectedSandApp.s("ㄷ\u0001");
                String s6 = ProtectedSandApp.s("ㄸ\u0001");
                if (length > 0 && a(valueOf)) {
                    String trim = valueOf.trim();
                    if (length > 64) {
                        trim = trim.substring(i5, 64);
                        String a5 = androidx.core.database.c.a(s4, str, s6, trim, ProtectedSandApp.s("ㄹ\u0001"));
                        j.e().a(s5, a5);
                        com.tencent.beacon.base.util.h.a(a5);
                    }
                    String s7 = ProtectedSandApp.s("ㄺ\u0001");
                    String s10 = ProtectedSandApp.s("ㄻ\u0001");
                    String replace = trim.replace(s7, s10);
                    String s11 = ProtectedSandApp.s("ㄼ\u0001");
                    String s12 = ProtectedSandApp.s("ㄽ\u0001");
                    String replace2 = replace.replace(s11, s12);
                    String s13 = ProtectedSandApp.s("ㄾ\u0001");
                    String s14 = ProtectedSandApp.s("ㄿ\u0001");
                    String replace3 = replace2.replace(s13, s14);
                    String trim2 = next.getValue() == null ? "" : String.valueOf(next.getValue()).trim();
                    if (trim2.length() > 20480) {
                        String a6 = androidx.core.database.c.a(s4, str, s6, replace3, ProtectedSandApp.s("ㅀ\u0001"));
                        j.e().a(ProtectedSandApp.s("ㅁ\u0001"), a6);
                        com.tencent.beacon.base.util.h.a(a6);
                        i4 = 0;
                        trim2 = trim2.substring(0, 20480);
                    } else {
                        i4 = 0;
                    }
                    String replace4 = trim2.replace('\n', ' ').replace(m.f86065d, ' ').replace(s7, s10).replace(s11, s12).replace(s13, s14);
                    hashMap.put(replace3, replace4);
                    i6 = com.google.android.gms.common.stats.a.a(replace4, replace3.length(), i6);
                } else {
                    i4 = i5;
                    com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("ㅂ\u0001"), valueOf);
                    j.e().a(s5, androidx.core.database.c.a(s4, str, s6, valueOf, ProtectedSandApp.s("ㅃ\u0001")));
                }
            }
            i5 = i4;
        }
        if (i6 <= 46080) {
            return hashMap;
        }
        String a7 = android.support.v4.media.d.a(s4, str, ProtectedSandApp.s("ㅄ\u0001"));
        j.e().a(ProtectedSandApp.s("ㅅ\u0001"), a7);
        com.tencent.beacon.base.util.h.a(a7);
        return null;
    }

    public static boolean a(String str) {
        int length = str.length();
        boolean z4 = true;
        while (true) {
            length--;
            if (length < 0) {
                return z4;
            }
            char charAt = str.charAt(length);
            if (charAt < ' ' || charAt >= 127) {
                z4 = false;
            }
        }
    }

    public static synchronized Map<String, String> a() {
        Map<String, String> map;
        synchronized (d.class) {
            try {
                h d5 = h.d();
                if (TextUtils.isEmpty(d5.f())) {
                    com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㄱ\u0001"), new Object[0]);
                    d5.g();
                }
                map = f71310a;
                map.put(ProtectedSandApp.s("ㄲ\u0001"), d5.f());
                if (com.tencent.beacon.d.b.b().j() == 1) {
                    map.put(ProtectedSandApp.s("ㄳ\u0001"), ProtectedSandApp.s("ㄴ\u0001"));
                }
                if (!com.tencent.beacon.d.b.b().v()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public static void a(long j4, long j5, String str) {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㅈ\u0001"), f.a(ProtectedSandApp.s("ㅆ\u0001"), j5, ProtectedSandApp.s("ㅇ\u0001"), str), new Object[0]);
        com.tencent.beacon.a.c.c c5 = com.tencent.beacon.a.c.c.c();
        c5.b(str);
        c5.a(j5 - ((com.tencent.beacon.base.util.b.c() + j4) / 2));
    }
}
