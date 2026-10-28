package com.thetransactioncompany.jsonrpc2.util;

/* compiled from: ParamsRetriever.java */
/* loaded from: classes7.dex */
public abstract class b {
    protected static <T extends Enum<T>> T a(String str, Class<T> cls, boolean z4) {
        for (T t4 : cls.getEnumConstants()) {
            if (z4) {
                if (t4.toString().equalsIgnoreCase(str)) {
                    return t4;
                }
            } else if (t4.toString().equals(str)) {
                return t4;
            }
        }
        return null;
    }

    protected static String b(String str, String[] strArr, boolean z4) {
        for (String str2 : strArr) {
            if (z4) {
                if (str2.equalsIgnoreCase(str)) {
                    return str2;
                }
            } else if (str2.equals(str)) {
                return str2;
            }
        }
        return null;
    }

    public abstract int c();
}
