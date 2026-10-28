package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AddressBookDoCoMoResultParser.java */
/* loaded from: classes6.dex */
public final class c extends a {
    private static String t(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1) + ' ' + str.substring(0, indexOf);
    }

    @Override // com.google.zxing.client.result.u
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public d k(com.google.zxing.n nVar) {
        String[] q4;
        String c5 = u.c(nVar);
        if (!c5.startsWith(ProtectedSandApp.s("॓\u0001")) || (q4 = a.q(ProtectedSandApp.s("॔\u0001"), c5)) == null) {
            return null;
        }
        String t4 = t(q4[0]);
        String g4 = u.g(ProtectedSandApp.s("ॕ\u0001"), c5, ';', true);
        String[] q5 = a.q(ProtectedSandApp.s("ॖ\u0001"), c5);
        String[] q6 = a.q(ProtectedSandApp.s("ॗ\u0001"), c5);
        String g5 = u.g(ProtectedSandApp.s("क़\u0001"), c5, ';', false);
        String[] q7 = a.q(ProtectedSandApp.s("ख़\u0001"), c5);
        String g6 = u.g(ProtectedSandApp.s("ग़\u0001"), c5, ';', true);
        return new d(u.j(t4), null, g4, q5, null, q6, null, null, g5, q7, null, u.g(ProtectedSandApp.s("ड़\u0001"), c5, ';', true), !u.d(g6, 8) ? null : g6, null, a.q(ProtectedSandApp.s("ज़\u0001"), c5), null);
    }
}
