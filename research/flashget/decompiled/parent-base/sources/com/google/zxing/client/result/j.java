package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.regex.Pattern;

/* compiled from: EmailDoCoMoResultParser.java */
/* loaded from: classes6.dex */
public final class j extends a {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f62713g = Pattern.compile(ProtectedSandApp.s("ু\u0001"));

    static boolean s(String str) {
        return str != null && f62713g.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    @Override // com.google.zxing.client.result.u
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public h k(com.google.zxing.n nVar) {
        String[] q4;
        String c5 = u.c(nVar);
        if (!c5.startsWith(ProtectedSandApp.s("ূ\u0001")) || (q4 = a.q(ProtectedSandApp.s("ৃ\u0001"), c5)) == null) {
            return null;
        }
        for (String str : q4) {
            if (!s(str)) {
                return null;
            }
        }
        return new h(q4, null, null, u.g(ProtectedSandApp.s("ৄ\u0001"), c5, ';', false), u.g(ProtectedSandApp.s("\u09c5\u0001"), c5, ';', false));
    }
}
