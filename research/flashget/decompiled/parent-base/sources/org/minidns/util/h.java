package org.minidns.util;

/* compiled from: NameUtil.java */
/* loaded from: classes9.dex */
public final class h {
    public static boolean a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2) || org.minidns.dnsname.a.h(str).compareTo(org.minidns.dnsname.a.h(str2)) == 0;
    }
}
