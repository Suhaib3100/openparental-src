package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;

/* compiled from: BizcardResultParser.java */
/* loaded from: classes6.dex */
public final class e extends a {
    private static String s(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + ' ' + str2;
    }

    private static String[] t(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    @Override // com.google.zxing.client.result.u
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public d k(com.google.zxing.n nVar) {
        String c5 = u.c(nVar);
        if (!c5.startsWith(ProtectedSandApp.s("३\u0001"))) {
            return null;
        }
        String s4 = s(u.g(ProtectedSandApp.s("४\u0001"), c5, ';', true), u.g(ProtectedSandApp.s("५\u0001"), c5, ';', true));
        String g4 = u.g(ProtectedSandApp.s("६\u0001"), c5, ';', true);
        String g5 = u.g(ProtectedSandApp.s("७\u0001"), c5, ';', true);
        return new d(u.j(s4), null, null, t(u.g(ProtectedSandApp.s("९\u0001"), c5, ';', true), u.g(ProtectedSandApp.s("॰\u0001"), c5, ';', true), u.g(ProtectedSandApp.s("ॱ\u0001"), c5, ';', true)), null, u.j(u.g(ProtectedSandApp.s("ॲ\u0001"), c5, ';', true)), null, null, null, a.q(ProtectedSandApp.s("८\u0001"), c5), null, g5, null, g4, null, null);
    }
}
