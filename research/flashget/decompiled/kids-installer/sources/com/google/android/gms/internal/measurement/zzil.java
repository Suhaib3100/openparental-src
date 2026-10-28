package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzil {
    public static String zza(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            length = objArr.length;
            if (i6 >= length) {
                break;
            }
            Object obj = objArr[i6];
            if (obj == null) {
                str2 = ProtectedSandApp.s("ම");
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e6) {
                    String str3 = obj.getClass().getName() + ProtectedSandApp.s("ඹ") + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger(ProtectedSandApp.s("ය")).logp(Level.WARNING, ProtectedSandApp.s("ර"), ProtectedSandApp.s("\u0dbc"), ProtectedSandApp.s("ල").concat(str3), (Throwable) e6);
                    str2 = ProtectedSandApp.s("\u0dbe") + str3 + ProtectedSandApp.s("\u0dbf") + e6.getClass().getName() + ProtectedSandApp.s("ව");
                }
            }
            objArr[i6] = str2;
            i6++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i7 = 0;
        while (true) {
            length2 = objArr.length;
            if (i5 >= length2 || (indexOf = str.indexOf(ProtectedSandApp.s("ශ"), i7)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i7, indexOf);
            sb.append(objArr[i5]);
            i7 = indexOf + 2;
            i5++;
        }
        sb.append((CharSequence) str, i7, str.length());
        if (i5 < length2) {
            sb.append(ProtectedSandApp.s("ෂ"));
            sb.append(objArr[i5]);
            for (int i8 = i5 + 1; i8 < objArr.length; i8++) {
                sb.append(ProtectedSandApp.s("ස"));
                sb.append(objArr[i8]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
