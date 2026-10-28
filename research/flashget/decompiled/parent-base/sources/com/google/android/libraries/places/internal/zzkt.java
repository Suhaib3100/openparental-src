package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzkt {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(ProtectedSandApp.s("\uea1c")));
    }

    public static String zzb(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uea1f"));
        }
        if (!zzc(str.charAt(0))) {
            int length = str.length();
            String s4 = ProtectedSandApp.s("\uea1d");
            throw new IllegalArgumentException(length != 0 ? s4.concat(str) : new String(s4));
        }
        for (int i4 = 1; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (!zzc(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                int length2 = str.length();
                String s5 = ProtectedSandApp.s("\uea1e");
                throw new IllegalArgumentException(length2 != 0 ? s5.concat(str) : new String(s5));
            }
        }
        return str;
    }

    private static boolean zzc(char c5) {
        if (c5 < 'a' || c5 > 'z') {
            return c5 >= 'A' && c5 <= 'Z';
        }
        return true;
    }
}
