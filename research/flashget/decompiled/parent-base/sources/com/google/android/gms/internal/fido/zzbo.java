package com.google.android.gms.internal.fido;

import androidx.compose.material3.z3;
import androidx.core.database.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.logging.Level;
import java.util.logging.Logger;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzbo {
    public static String zza(@a String str, @a Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String a5;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                a5 = ProtectedSandApp.s("퀎");
            } else {
                try {
                    a5 = obj.toString();
                } catch (Exception e4) {
                    String a6 = z3.a(obj.getClass().getName(), ProtectedSandApp.s("퀏"), Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger(ProtectedSandApp.s("퀐")).logp(Level.WARNING, ProtectedSandApp.s("퀐"), ProtectedSandApp.s("퀑"), ProtectedSandApp.s("퀒").concat(a6), (Throwable) e4);
                    a5 = c.a(ProtectedSandApp.s("퀓"), a6, ProtectedSandApp.s("퀔"), e4.getClass().getName(), ProtectedSandApp.s("퀕"));
                }
            }
            objArr[i5] = a5;
            i5++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf(ProtectedSandApp.s("퀖"), i6)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i6, indexOf);
            sb.append(objArr[i4]);
            i6 = indexOf + 2;
            i4++;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i4 < length2) {
            sb.append(ProtectedSandApp.s("퀗"));
            sb.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb.append(ProtectedSandApp.s("퀘"));
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
