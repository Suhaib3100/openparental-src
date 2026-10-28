package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SMSTOMMSTOResultParser.java */
/* loaded from: classes6.dex */
public final class x extends u {
    @Override // com.google.zxing.client.result.u
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public w k(com.google.zxing.n nVar) {
        String str;
        String c5 = u.c(nVar);
        if (!c5.startsWith(ProtectedSandApp.s("ਖ\u0001")) && !c5.startsWith(ProtectedSandApp.s("ਗ\u0001")) && !c5.startsWith(ProtectedSandApp.s("ਘ\u0001")) && !c5.startsWith(ProtectedSandApp.s("ਙ\u0001"))) {
            return null;
        }
        String substring = c5.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str = null;
        }
        return new w(substring, (String) null, (String) null, str);
    }
}
