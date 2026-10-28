package com.google.android.libraries.places.internal;

import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzhf {
    public static String zza(@zc.a String str, @zc.a Object... objArr) {
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
                sb = ProtectedSandApp.s("\ue9c3");
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
                    Logger logger = Logger.getLogger(ProtectedSandApp.s("\ue9c4"));
                    Level level = Level.WARNING;
                    int length3 = sb3.length();
                    String s4 = ProtectedSandApp.s("\ue9c5");
                    logger.logp(level, ProtectedSandApp.s("\ue9c4"), ProtectedSandApp.s("\ue9c6"), length3 != 0 ? s4.concat(sb3) : new String(s4), (Throwable) e4);
                    String name2 = e4.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(com.google.android.gms.common.stats.a.a(sb3, 9, name2.length()));
                    l0.a(sb4, ProtectedSandApp.s("\ue9c7"), sb3, ProtectedSandApp.s("\ue9c8"), name2);
                    sb4.append(ProtectedSandApp.s("\ue9c9"));
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
            if (i4 >= length2 || (indexOf = str.indexOf(ProtectedSandApp.s("\ue9ca"), i6)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i6, indexOf);
            sb5.append(objArr[i4]);
            i6 = indexOf + 2;
            i4++;
        }
        sb5.append((CharSequence) str, i6, str.length());
        if (i4 < length2) {
            sb5.append(ProtectedSandApp.s("\ue9cb"));
            sb5.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb5.append(ProtectedSandApp.s("\ue9cc"));
                sb5.append(objArr[i7]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static String zzb(@zc.a String str) {
        return zzgz.zza(str);
    }
}
