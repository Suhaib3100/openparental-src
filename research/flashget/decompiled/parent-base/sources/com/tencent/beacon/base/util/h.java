package com.tencent.beacon.base.util;

import android.text.TextUtils;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: StrictMode.java */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static AtomicBoolean f71372a = new AtomicBoolean(false);

    public static void a(String str) {
        c.b(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("㇋\u0001"), str), new Object[0]);
        if (f71372a.get()) {
            throw new IllegalStateException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("㇌\u0001"), str));
        }
    }

    public static void a(Map map) {
        if (!f71372a.get() || map == null) {
            return;
        }
        for (Object obj : map.keySet()) {
            if (!(obj instanceof String)) {
                a(ProtectedSandApp.s("㇍\u0001"));
            }
            if (!(map.get(obj) instanceof String)) {
                a(ProtectedSandApp.s("㇎\u0001"));
            }
        }
    }

    private static boolean a() {
        return f71372a.get() || com.tencent.beacon.a.c.b.d(com.tencent.beacon.a.c.c.c().b());
    }

    public static boolean a(String str, Object obj) {
        boolean z4;
        if (obj instanceof String) {
            z4 = TextUtils.isEmpty((String) obj);
        } else {
            z4 = obj == null;
        }
        c.a(android.support.v4.media.c.a(androidx.constraintlayout.core.e.a(str, ProtectedSandApp.s("㇏\u0001")), obj == null ? ProtectedSandApp.s("㇐\u0001") : ProtectedSandApp.s("㇑\u0001"), ProtectedSandApp.s("㇒\u0001")), new Object[0]);
        if (z4 && a()) {
            throw new NullPointerException(j.a(str, ProtectedSandApp.s("㇓\u0001")));
        }
        return z4;
    }
}
