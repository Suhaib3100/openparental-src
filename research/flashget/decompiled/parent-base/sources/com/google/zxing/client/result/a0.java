package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: TelResultParser.java */
/* loaded from: classes6.dex */
public final class a0 extends u {
    @Override // com.google.zxing.client.result.u
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public z k(com.google.zxing.n nVar) {
        String str;
        String c5 = u.c(nVar);
        String s4 = ProtectedSandApp.s("ै\u0001");
        boolean startsWith = c5.startsWith(s4);
        String s5 = ProtectedSandApp.s("ॉ\u0001");
        if (!startsWith && !c5.startsWith(s5)) {
            return null;
        }
        if (c5.startsWith(s5)) {
            str = s4 + c5.substring(4);
        } else {
            str = c5;
        }
        int indexOf = c5.indexOf(63, 4);
        return new z(indexOf < 0 ? c5.substring(4) : c5.substring(4, indexOf), str, null);
    }
}
