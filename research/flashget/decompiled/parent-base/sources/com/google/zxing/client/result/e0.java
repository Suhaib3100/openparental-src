package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: URLTOResultParser.java */
/* loaded from: classes6.dex */
public final class e0 extends u {
    @Override // com.google.zxing.client.result.u
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public c0 k(com.google.zxing.n nVar) {
        int indexOf;
        String c5 = u.c(nVar);
        if ((c5.startsWith(ProtectedSandApp.s("१\u0001")) || c5.startsWith(ProtectedSandApp.s("२\u0001"))) && (indexOf = c5.indexOf(58, 6)) >= 0) {
            return new c0(c5.substring(indexOf + 1), indexOf > 6 ? c5.substring(6, indexOf) : null);
        }
        return null;
    }
}
