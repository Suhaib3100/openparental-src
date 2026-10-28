package com.google.android.datatransport.cct;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: StringMerger.java */
/* loaded from: classes2.dex */
public final class e {
    static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ࣥ"));
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i5 = 0; i5 < str.length(); i5++) {
            sb.append(str.charAt(i5));
            if (str2.length() > i5) {
                sb.append(str2.charAt(i5));
            }
        }
        return sb.toString();
    }
}
