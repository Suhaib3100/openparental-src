package com.google.android.gms.auth;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.material3.z3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    @o0
    public static String getCookieUrl(@o0 String str, @q0 Boolean bool) {
        Preconditions.checkNotEmpty(str);
        return z3.a(true != zza(bool) ? ProtectedSandApp.s("윁") : ProtectedSandApp.s("윂"), ProtectedSandApp.s("윃"), str);
    }

    @o0
    public static String getCookieValue(@q0 String str, @q0 String str2, @q0 String str3, @q0 String str4, @q0 Boolean bool, @q0 Boolean bool2, @q0 Long l4) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (zza(bool)) {
            sb.append(ProtectedSandApp.s("위"));
        }
        if (zza(bool2)) {
            sb.append(ProtectedSandApp.s("윅"));
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(ProtectedSandApp.s("윆"));
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(ProtectedSandApp.s("윇"));
            sb.append(str4);
        }
        if (l4 != null && l4.longValue() > 0) {
            sb.append(ProtectedSandApp.s("윈"));
            sb.append(l4);
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append(ProtectedSandApp.s("윉"));
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append(ProtectedSandApp.s("윊"));
        }
        if (zza(null)) {
            sb.append(ProtectedSandApp.s("윋"));
        }
        return sb.toString();
    }

    private static boolean zza(@q0 Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
