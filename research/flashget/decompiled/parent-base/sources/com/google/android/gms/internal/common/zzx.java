package com.google.android.gms.internal.common;

import androidx.fragment.app.k0;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzx {
    public static String zza(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i4 >= length || (indexOf = str.indexOf(ProtectedSandApp.s("쿭"), i5)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i5, indexOf);
            sb.append(zzb(objArr[i4]));
            i5 = indexOf + 2;
            i4++;
        }
        sb.append((CharSequence) str, i5, str.length());
        if (i4 < length) {
            String s4 = ProtectedSandApp.s("쿮");
            while (i4 < objArr.length) {
                sb.append(s4);
                sb.append(zzb(objArr[i4]));
                i4++;
                s4 = ProtectedSandApp.s("쿯");
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String zzb(Object obj) {
        if (obj == null) {
            return ProtectedSandApp.s("쿰");
        }
        try {
            return obj.toString();
        } catch (Exception e4) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String a5 = k0.a(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, ProtectedSandApp.s("쿱"), hexString);
            Logger.getLogger(ProtectedSandApp.s("쿲")).logp(Level.WARNING, ProtectedSandApp.s("쿲"), ProtectedSandApp.s("쿳"), ProtectedSandApp.s("쿴").concat(a5), (Throwable) e4);
            String name2 = e4.getClass().getName();
            StringBuilder sb = new StringBuilder(a5.length() + 8 + name2.length() + 1);
            l0.a(sb, ProtectedSandApp.s("쿵"), a5, ProtectedSandApp.s("쿶"), name2);
            sb.append(ProtectedSandApp.s("쿷"));
            return sb.toString();
        }
    }
}
