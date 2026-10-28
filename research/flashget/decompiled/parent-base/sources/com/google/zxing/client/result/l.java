package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import kotlin.text.m0;

/* compiled from: ExpandedProductResultParser.java */
/* loaded from: classes6.dex */
public final class l extends u {
    private static String q(int i4, String str) {
        if (str.charAt(i4) != '(') {
            return null;
        }
        String substring = str.substring(i4 + 1);
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < substring.length(); i5++) {
            char charAt = substring.charAt(i5);
            if (charAt == ')') {
                return sb.toString();
            }
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    private static String r(int i4, String str) {
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(i4);
        for (int i5 = 0; i5 < substring.length(); i5++) {
            char charAt = substring.charAt(i5);
            if (charAt != '(') {
                sb.append(charAt);
            } else {
                if (q(i5, substring) != null) {
                    break;
                }
                sb.append('(');
            }
        }
        return sb.toString();
    }

    @Override // com.google.zxing.client.result.u
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public k k(com.google.zxing.n nVar) {
        int i4 = 2;
        if (nVar.b() != com.google.zxing.a.RSS_EXPANDED) {
            return null;
        }
        String c5 = u.c(nVar);
        HashMap hashMap = new HashMap();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        int i5 = 0;
        while (i5 < c5.length()) {
            String q4 = q(i5, c5);
            if (q4 == null) {
                return null;
            }
            int a5 = com.google.android.gms.common.stats.a.a(q4, i4, i5);
            String r4 = r(a5, c5);
            i5 = r4.length() + a5;
            char c6 = 65535;
            switch (q4.hashCode()) {
                case 1536:
                    if (q4.equals(ProtectedSandApp.s("৶\u0001"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 1537:
                    if (q4.equals(ProtectedSandApp.s("৵\u0001"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 1567:
                    if (q4.equals(ProtectedSandApp.s("৴\u0001"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 1568:
                    if (q4.equals(ProtectedSandApp.s("৳\u0001"))) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 1570:
                    if (q4.equals(ProtectedSandApp.s("৲\u0001"))) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 1572:
                    if (q4.equals(ProtectedSandApp.s("ৱ\u0001"))) {
                        c6 = 5;
                        break;
                    }
                    break;
                case 1574:
                    if (q4.equals(ProtectedSandApp.s("ৰ\u0001"))) {
                        c6 = 6;
                        break;
                    }
                    break;
                case 1567966:
                    if (q4.equals(ProtectedSandApp.s("৯\u0001"))) {
                        c6 = 7;
                        break;
                    }
                    break;
                case 1567967:
                    if (q4.equals(ProtectedSandApp.s("৮\u0001"))) {
                        c6 = '\b';
                        break;
                    }
                    break;
                case 1567968:
                    if (q4.equals(ProtectedSandApp.s("৭\u0001"))) {
                        c6 = '\t';
                        break;
                    }
                    break;
                case 1567969:
                    if (q4.equals(ProtectedSandApp.s("৬\u0001"))) {
                        c6 = '\n';
                        break;
                    }
                    break;
                case 1567970:
                    if (q4.equals(ProtectedSandApp.s("৫\u0001"))) {
                        c6 = 11;
                        break;
                    }
                    break;
                case 1567971:
                    if (q4.equals(ProtectedSandApp.s("৪\u0001"))) {
                        c6 = '\f';
                        break;
                    }
                    break;
                case 1567972:
                    if (q4.equals(ProtectedSandApp.s("৩\u0001"))) {
                        c6 = org.apache.commons.lang3.m.f86065d;
                        break;
                    }
                    break;
                case 1567973:
                    if (q4.equals(ProtectedSandApp.s("২\u0001"))) {
                        c6 = 14;
                        break;
                    }
                    break;
                case 1567974:
                    if (q4.equals(ProtectedSandApp.s("১\u0001"))) {
                        c6 = 15;
                        break;
                    }
                    break;
                case 1567975:
                    if (q4.equals(ProtectedSandApp.s("০\u0001"))) {
                        c6 = 16;
                        break;
                    }
                    break;
                case 1568927:
                    if (q4.equals(ProtectedSandApp.s("\u09e5\u0001"))) {
                        c6 = 17;
                        break;
                    }
                    break;
                case 1568928:
                    if (q4.equals(ProtectedSandApp.s("\u09e4\u0001"))) {
                        c6 = 18;
                        break;
                    }
                    break;
                case 1568929:
                    if (q4.equals(ProtectedSandApp.s("ৣ\u0001"))) {
                        c6 = 19;
                        break;
                    }
                    break;
                case 1568930:
                    if (q4.equals(ProtectedSandApp.s("ৢ\u0001"))) {
                        c6 = 20;
                        break;
                    }
                    break;
                case 1568931:
                    if (q4.equals(ProtectedSandApp.s("ৡ\u0001"))) {
                        c6 = 21;
                        break;
                    }
                    break;
                case 1568932:
                    if (q4.equals(ProtectedSandApp.s("ৠ\u0001"))) {
                        c6 = 22;
                        break;
                    }
                    break;
                case 1568933:
                    if (q4.equals(ProtectedSandApp.s("য়\u0001"))) {
                        c6 = 23;
                        break;
                    }
                    break;
                case 1568934:
                    if (q4.equals(ProtectedSandApp.s("\u09de\u0001"))) {
                        c6 = 24;
                        break;
                    }
                    break;
                case 1568935:
                    if (q4.equals(ProtectedSandApp.s("ঢ়\u0001"))) {
                        c6 = 25;
                        break;
                    }
                    break;
                case 1568936:
                    if (q4.equals(ProtectedSandApp.s("ড়\u0001"))) {
                        c6 = 26;
                        break;
                    }
                    break;
                case 1575716:
                    if (q4.equals(ProtectedSandApp.s("\u09db\u0001"))) {
                        c6 = 27;
                        break;
                    }
                    break;
                case 1575717:
                    if (q4.equals(ProtectedSandApp.s("\u09da\u0001"))) {
                        c6 = 28;
                        break;
                    }
                    break;
                case 1575718:
                    if (q4.equals(ProtectedSandApp.s("\u09d9\u0001"))) {
                        c6 = 29;
                        break;
                    }
                    break;
                case 1575719:
                    if (q4.equals(ProtectedSandApp.s("\u09d8\u0001"))) {
                        c6 = 30;
                        break;
                    }
                    break;
                case 1575747:
                    if (q4.equals(ProtectedSandApp.s("ৗ\u0001"))) {
                        c6 = 31;
                        break;
                    }
                    break;
                case 1575748:
                    if (q4.equals(ProtectedSandApp.s("\u09d6\u0001"))) {
                        c6 = ' ';
                        break;
                    }
                    break;
                case 1575749:
                    if (q4.equals(ProtectedSandApp.s("\u09d5\u0001"))) {
                        c6 = '!';
                        break;
                    }
                    break;
                case 1575750:
                    if (q4.equals(ProtectedSandApp.s("\u09d4\u0001"))) {
                        c6 = m0.quote;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    str2 = r4;
                    continue;
                    i4 = 2;
                case 1:
                    str = r4;
                    continue;
                    i4 = 2;
                case 2:
                    str3 = r4;
                    continue;
                    i4 = 2;
                case 3:
                    str4 = r4;
                    continue;
                    i4 = 2;
                case 4:
                    str5 = r4;
                    continue;
                    i4 = 2;
                case 5:
                    str6 = r4;
                    continue;
                    i4 = 2;
                case 6:
                    str7 = r4;
                    continue;
                    i4 = 2;
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                    str10 = q4.substring(3);
                    str9 = ProtectedSandApp.s("৸\u0001");
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str10 = q4.substring(3);
                    str9 = ProtectedSandApp.s("৷\u0001");
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                    str12 = q4.substring(3);
                    str11 = r4;
                    continue;
                    i4 = 2;
                case 31:
                case ' ':
                case '!':
                case '\"':
                    if (r4.length() < 4) {
                        return null;
                    }
                    str11 = r4.substring(3);
                    str13 = r4.substring(0, 3);
                    str12 = q4.substring(3);
                    continue;
                    i4 = 2;
                default:
                    hashMap.put(q4, r4);
                    continue;
                    i4 = 2;
            }
            str8 = r4;
            i4 = 2;
        }
        return new k(c5, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, hashMap);
    }
}
