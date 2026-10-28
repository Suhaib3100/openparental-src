package com.tencent.beacon.c;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.module.ModuleName;
import com.tencent.beacon.module.StatModule;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FragmentTime.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Long> f71373a = new HashMap();

    public static void a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        f71373a.put(str, Long.valueOf(currentTimeMillis));
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("\u31e7\u0001"), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public static void b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, Long> map = f71373a;
        String s4 = ProtectedSandApp.s("\u31e8\u0001");
        if (map == null) {
            com.tencent.beacon.base.util.c.e(s4, new Object[0]);
            return;
        }
        Long l4 = map.get(str);
        if (l4 == null) {
            com.tencent.beacon.base.util.c.e(s4, new Object[0]);
            return;
        }
        ((StatModule) com.tencent.beacon.a.c.c.c().a(ModuleName.STAT)).a(str, currentTimeMillis - l4.longValue(), currentTimeMillis);
        f71373a.remove(str);
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("\u31e9\u0001"), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
