package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: EmailAddressResultParser.java */
/* loaded from: classes6.dex */
public final class i extends u {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f62710g = Pattern.compile(ProtectedSandApp.s("হ\u0001"));

    @Override // com.google.zxing.client.result.u
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public h k(com.google.zxing.n nVar) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str;
        String str2;
        String str3;
        String c5 = u.c(nVar);
        if (!c5.startsWith(ProtectedSandApp.s("\u09ba\u0001")) && !c5.startsWith(ProtectedSandApp.s("\u09bb\u0001"))) {
            if (j.s(c5)) {
                return new h(c5);
            }
            return null;
        }
        String substring = c5.substring(7);
        int indexOf = substring.indexOf(63);
        if (indexOf >= 0) {
            substring = substring.substring(0, indexOf);
        }
        try {
            String p4 = u.p(substring);
            String[] split = !p4.isEmpty() ? f62710g.split(p4) : null;
            Map<String, String> m4 = u.m(c5);
            if (m4 != null) {
                if (split == null && (str3 = m4.get(ProtectedSandApp.s("়\u0001"))) != null) {
                    split = f62710g.split(str3);
                }
                String str4 = m4.get(ProtectedSandApp.s("ঽ\u0001"));
                String[] split2 = str4 != null ? f62710g.split(str4) : null;
                String str5 = m4.get(ProtectedSandApp.s("া\u0001"));
                String[] split3 = str5 != null ? f62710g.split(str5) : null;
                String str6 = m4.get(ProtectedSandApp.s("ি\u0001"));
                str2 = m4.get(ProtectedSandApp.s("ী\u0001"));
                strArr = split;
                strArr3 = split3;
                strArr2 = split2;
                str = str6;
            } else {
                strArr = split;
                strArr2 = null;
                strArr3 = null;
                str = null;
                str2 = null;
            }
            return new h(strArr, strArr2, strArr3, str, str2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
