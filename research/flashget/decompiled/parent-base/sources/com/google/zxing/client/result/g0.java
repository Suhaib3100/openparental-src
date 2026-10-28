package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: VEventResultParser.java */
/* loaded from: classes6.dex */
public final class g0 extends u {
    private static String q(CharSequence charSequence, String str) {
        List<String> t4 = f0.t(charSequence, str, true, false);
        if (t4 == null || t4.isEmpty()) {
            return null;
        }
        return t4.get(0);
    }

    private static String[] r(CharSequence charSequence, String str) {
        List<List<String>> u4 = f0.u(charSequence, str, true, false);
        if (u4 == null || u4.isEmpty()) {
            return null;
        }
        int size = u4.size();
        String[] strArr = new String[size];
        for (int i4 = 0; i4 < size; i4++) {
            strArr[i4] = u4.get(i4).get(0);
        }
        return strArr;
    }

    private static String t(String str) {
        return str != null ? (str.startsWith(ProtectedSandApp.s("গ\u0001")) || str.startsWith(ProtectedSandApp.s("ঘ\u0001"))) ? str.substring(7) : str : str;
    }

    @Override // com.google.zxing.client.result.u
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public g k(com.google.zxing.n nVar) {
        double parseDouble;
        double parseDouble2;
        String c5 = u.c(nVar);
        if (c5.indexOf(ProtectedSandApp.s("ঙ\u0001")) < 0) {
            return null;
        }
        String q4 = q(ProtectedSandApp.s("চ\u0001"), c5);
        String q5 = q(ProtectedSandApp.s("ছ\u0001"), c5);
        if (q5 == null) {
            return null;
        }
        String q6 = q(ProtectedSandApp.s("জ\u0001"), c5);
        String q7 = q(ProtectedSandApp.s("ঝ\u0001"), c5);
        String q10 = q(ProtectedSandApp.s("ঞ\u0001"), c5);
        String t4 = t(q(ProtectedSandApp.s("ট\u0001"), c5));
        String[] r4 = r(ProtectedSandApp.s("ঠ\u0001"), c5);
        if (r4 != null) {
            for (int i4 = 0; i4 < r4.length; i4++) {
                r4[i4] = t(r4[i4]);
            }
        }
        String q11 = q(ProtectedSandApp.s("ড\u0001"), c5);
        String q12 = q(ProtectedSandApp.s("ঢ\u0001"), c5);
        if (q12 == null) {
            parseDouble = Double.NaN;
            parseDouble2 = Double.NaN;
        } else {
            int indexOf = q12.indexOf(59);
            if (indexOf < 0) {
                return null;
            }
            try {
                parseDouble = Double.parseDouble(q12.substring(0, indexOf));
                parseDouble2 = Double.parseDouble(q12.substring(indexOf + 1));
            } catch (NumberFormatException | IllegalArgumentException unused) {
                return null;
            }
        }
        return new g(q4, q5, q6, q7, q10, t4, r4, q11, parseDouble, parseDouble2);
    }
}
