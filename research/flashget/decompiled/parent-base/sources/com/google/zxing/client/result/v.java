package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: SMSMMSResultParser.java */
/* loaded from: classes6.dex */
public final class v extends u {
    private static void q(Collection<String> collection, Collection<String> collection2, String str) {
        int indexOf = str.indexOf(59);
        if (indexOf < 0) {
            collection.add(str);
            collection2.add(null);
        } else {
            collection.add(str.substring(0, indexOf));
            String substring = str.substring(indexOf + 1);
            collection2.add(substring.startsWith(ProtectedSandApp.s("\u0a0b\u0001")) ? substring.substring(4) : null);
        }
    }

    @Override // com.google.zxing.client.result.u
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public w k(com.google.zxing.n nVar) {
        boolean z4;
        String str;
        String c5 = u.c(nVar);
        String str2 = null;
        if (!c5.startsWith(ProtectedSandApp.s("\u0a0c\u0001")) && !c5.startsWith(ProtectedSandApp.s("\u0a0d\u0001")) && !c5.startsWith(ProtectedSandApp.s("\u0a0e\u0001")) && !c5.startsWith(ProtectedSandApp.s("ਏ\u0001"))) {
            return null;
        }
        Map<String, String> m4 = u.m(c5);
        if (m4 == null || m4.isEmpty()) {
            z4 = false;
            str = null;
        } else {
            str2 = m4.get(ProtectedSandApp.s("ਐ\u0001"));
            str = m4.get(ProtectedSandApp.s("\u0a11\u0001"));
            z4 = true;
        }
        int indexOf = c5.indexOf(63, 4);
        String substring = (indexOf < 0 || !z4) ? c5.substring(4) : c5.substring(4, indexOf);
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            int indexOf2 = substring.indexOf(44, i5);
            if (indexOf2 <= i4) {
                q(arrayList, arrayList2, substring.substring(i5));
                String[] strArr = u.f62753f;
                return new w((String[]) arrayList.toArray(strArr), (String[]) arrayList2.toArray(strArr), str2, str);
            }
            q(arrayList, arrayList2, substring.substring(i5, indexOf2));
            i4 = indexOf2;
        }
    }
}
