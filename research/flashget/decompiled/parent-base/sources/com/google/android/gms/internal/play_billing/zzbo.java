package com.google.android.gms.internal.play_billing;

import androidx.compose.material3.z3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzbo {
    public static String zza(String str) {
        if (zzbk.zza(str)) {
            return null;
        }
        return str;
    }

    public static String zzb(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i4 >= length || (indexOf = str.indexOf(ProtectedSandApp.s("횣"), i5)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i5, indexOf);
            sb.append(zze(objArr[i4]));
            i5 = indexOf + 2;
            i4++;
        }
        sb.append((CharSequence) str, i5, str.length());
        if (i4 < length) {
            String s4 = ProtectedSandApp.s("횤");
            while (i4 < objArr.length) {
                sb.append(s4);
                sb.append(zze(objArr[i4]));
                i4++;
                s4 = ProtectedSandApp.s("횥");
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String zzc(String str) {
        return str == null ? "" : str;
    }

    public static boolean zzd(String str) {
        return zzbk.zza(str);
    }

    private static String zze(Object obj) {
        if (obj == null) {
            return ProtectedSandApp.s("횦");
        }
        try {
            return obj.toString();
        } catch (Exception e4) {
            String a5 = z3.a(obj.getClass().getName(), ProtectedSandApp.s("횧"), Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger(ProtectedSandApp.s("효")).logp(Level.WARNING, ProtectedSandApp.s("효"), ProtectedSandApp.s("횩"), ProtectedSandApp.s("횪").concat(a5), (Throwable) e4);
            return androidx.core.database.c.a(ProtectedSandApp.s("횫"), a5, ProtectedSandApp.s("횬"), e4.getClass().getName(), ProtectedSandApp.s("횭"));
        }
    }
}
