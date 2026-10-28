package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: BookmarkDoCoMoResultParser.java */
/* loaded from: classes6.dex */
public final class f extends a {
    @Override // com.google.zxing.client.result.u
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public c0 k(com.google.zxing.n nVar) {
        String g4 = nVar.g();
        if (!g4.startsWith(ProtectedSandApp.s("ঔ\u0001"))) {
            return null;
        }
        String g5 = u.g(ProtectedSandApp.s("ক\u0001"), g4, ';', true);
        String[] q4 = a.q(ProtectedSandApp.s("খ\u0001"), g4);
        if (q4 == null) {
            return null;
        }
        String str = q4[0];
        if (d0.q(str)) {
            return new c0(str, g5);
        }
        return null;
    }
}
