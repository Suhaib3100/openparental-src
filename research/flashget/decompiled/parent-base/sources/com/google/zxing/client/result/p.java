package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ISBNResultParser.java */
/* loaded from: classes6.dex */
public final class p extends u {
    @Override // com.google.zxing.client.result.u
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public o k(com.google.zxing.n nVar) {
        if (nVar.b() != com.google.zxing.a.EAN_13) {
            return null;
        }
        String c5 = u.c(nVar);
        if (c5.length() != 13) {
            return null;
        }
        if (c5.startsWith(ProtectedSandApp.s("৽\u0001")) || c5.startsWith(ProtectedSandApp.s("৾\u0001"))) {
            return new o(c5);
        }
        return null;
    }
}
