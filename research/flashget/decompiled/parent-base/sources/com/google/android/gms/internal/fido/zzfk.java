package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzfk {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(ProtectedSandApp.s("큩")));
    }

    public static String zzb(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("크"));
        }
        if (!zzc(str.charAt(0))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("큫").concat(str));
        }
        for (int i4 = 1; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (!zzc(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                throw new IllegalArgumentException(ProtectedSandApp.s("큪").concat(str));
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
