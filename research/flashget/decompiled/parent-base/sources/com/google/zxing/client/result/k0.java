package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: WifiResultParser.java */
/* loaded from: classes6.dex */
public final class k0 extends u {
    @Override // com.google.zxing.client.result.u
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public j0 k(com.google.zxing.n nVar) {
        String substring;
        String g4;
        String str;
        boolean z4;
        String c5 = u.c(nVar);
        if (!c5.startsWith(ProtectedSandApp.s("\u09c6\u0001")) || (g4 = u.g(ProtectedSandApp.s("ে\u0001"), (substring = c5.substring(5)), ';', false)) == null || g4.isEmpty()) {
            return null;
        }
        String g5 = u.g(ProtectedSandApp.s("ৈ\u0001"), substring, ';', false);
        String g6 = u.g(ProtectedSandApp.s("\u09c9\u0001"), substring, ';', false);
        if (g6 == null) {
            g6 = ProtectedSandApp.s("\u09ca\u0001");
        }
        String str2 = g6;
        String g7 = u.g(ProtectedSandApp.s("ো\u0001"), substring, ';', false);
        String g10 = u.g(ProtectedSandApp.s("ৌ\u0001"), substring, ';', false);
        if (g10 == null) {
            str = g7;
        } else {
            if (g7 != null || ProtectedSandApp.s("্\u0001").equalsIgnoreCase(g10) || ProtectedSandApp.s("ৎ\u0001").equalsIgnoreCase(g10)) {
                str = g7;
                z4 = Boolean.parseBoolean(g10);
                return new j0(str2, g4, g5, z4, u.g(ProtectedSandApp.s("\u09cf\u0001"), substring, ';', false), u.g(ProtectedSandApp.s("\u09d0\u0001"), substring, ';', false), u.g(ProtectedSandApp.s("\u09d1\u0001"), substring, ';', false), str);
            }
            str = g10;
        }
        z4 = false;
        return new j0(str2, g4, g5, z4, u.g(ProtectedSandApp.s("\u09cf\u0001"), substring, ';', false), u.g(ProtectedSandApp.s("\u09d0\u0001"), substring, ';', false), u.g(ProtectedSandApp.s("\u09d1\u0001"), substring, ';', false), str);
    }
}
