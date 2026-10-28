package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;

/* compiled from: AddressBookAUResultParser.java */
/* loaded from: classes6.dex */
public final class b extends u {
    private static String[] q(String str, String str2) {
        ArrayList arrayList = null;
        for (int i4 = 1; i4 <= 3; i4++) {
            String g4 = u.g(str + i4 + ':', str2, org.apache.commons.lang3.m.f86065d, true);
            if (g4 == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(3);
            }
            arrayList.add(g4);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(u.f62753f);
    }

    @Override // com.google.zxing.client.result.u
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public d k(com.google.zxing.n nVar) {
        String c5 = u.c(nVar);
        if (!c5.contains(ProtectedSandApp.s("ॊ\u0001")) || !c5.contains(ProtectedSandApp.s("ो\u0001"))) {
            return null;
        }
        String g4 = u.g(ProtectedSandApp.s("ौ\u0001"), c5, org.apache.commons.lang3.m.f86065d, true);
        String g5 = u.g(ProtectedSandApp.s("्\u0001"), c5, org.apache.commons.lang3.m.f86065d, true);
        String[] q4 = q(ProtectedSandApp.s("ॎ\u0001"), c5);
        String[] q5 = q(ProtectedSandApp.s("ॏ\u0001"), c5);
        String g6 = u.g(ProtectedSandApp.s("ॐ\u0001"), c5, org.apache.commons.lang3.m.f86065d, false);
        String g7 = u.g(ProtectedSandApp.s("॑\u0001"), c5, org.apache.commons.lang3.m.f86065d, true);
        return new d(u.j(g4), null, g5, q4, null, q5, null, null, g6, g7 != null ? new String[]{g7} : null, null, null, null, null, null, null);
    }
}
