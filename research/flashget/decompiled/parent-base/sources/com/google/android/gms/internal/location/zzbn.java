package com.google.android.gms.internal.location;

import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public final class zzbn {
    public static String zza(@NullableDecl String str, @NullableDecl Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                sb = ProtectedSandApp.s("텵");
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e4) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger(ProtectedSandApp.s("텶"));
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb3);
                    int length3 = valueOf.length();
                    String s4 = ProtectedSandApp.s("텷");
                    logger.logp(level, ProtectedSandApp.s("텶"), ProtectedSandApp.s("텸"), length3 != 0 ? s4.concat(valueOf) : new String(s4), (Throwable) e4);
                    String name2 = e4.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 9 + name2.length());
                    l0.a(sb4, ProtectedSandApp.s("텹"), sb3, ProtectedSandApp.s("텺"), name2);
                    sb4.append(ProtectedSandApp.s("텻"));
                    sb = sb4.toString();
                }
            }
            objArr[i5] = sb;
            i5++;
        }
        StringBuilder sb5 = new StringBuilder((length * 16) + str.length());
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf(ProtectedSandApp.s("텼"), i6)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i6, indexOf);
            sb5.append(objArr[i4]);
            i6 = indexOf + 2;
            i4++;
        }
        sb5.append((CharSequence) str, i6, str.length());
        if (i4 < length2) {
            sb5.append(ProtectedSandApp.s("텽"));
            sb5.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb5.append(ProtectedSandApp.s("텾"));
                sb5.append(objArr[i7]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }
}
