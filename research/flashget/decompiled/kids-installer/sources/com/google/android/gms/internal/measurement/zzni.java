package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import org.apache.commons.io.n;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zzni {
    static String zza(zzka zzkaVar) {
        StringBuilder sb = new StringBuilder(zzkaVar.zzd());
        for (int i5 = 0; i5 < zzkaVar.zzd(); i5++) {
            byte zza = zzkaVar.zza(i5);
            if (zza == 34) {
                sb.append(ProtectedSandApp.s("ใ"));
            } else if (zza == 39) {
                sb.append(ProtectedSandApp.s("โ"));
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb.append(ProtectedSandApp.s("เ"));
                        break;
                    case 8:
                        sb.append(ProtectedSandApp.s("฿"));
                        break;
                    case 9:
                        sb.append(ProtectedSandApp.s("\u0e3e"));
                        break;
                    case 10:
                        sb.append(ProtectedSandApp.s("\u0e3d"));
                        break;
                    case 11:
                        sb.append(ProtectedSandApp.s("\u0e3c"));
                        break;
                    case 12:
                        sb.append(ProtectedSandApp.s("\u0e3b"));
                        break;
                    case 13:
                        sb.append(ProtectedSandApp.s("ฺ"));
                        break;
                    default:
                        if (zza < 32 || zza > 126) {
                            sb.append(n.f32061c);
                            sb.append((char) (((zza >>> 6) & 3) + 48));
                            sb.append((char) (((zza >>> 3) & 7) + 48));
                            sb.append((char) ((zza & 7) + 48));
                            break;
                        } else {
                            sb.append((char) zza);
                            break;
                        }
                }
            } else {
                sb.append(ProtectedSandApp.s("แ"));
            }
        }
        return sb.toString();
    }
}
