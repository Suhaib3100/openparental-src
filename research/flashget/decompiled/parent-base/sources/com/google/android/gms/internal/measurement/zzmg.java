package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzmg {
    static String zza(zzik zzikVar) {
        zzmf zzmfVar = new zzmf(zzikVar);
        StringBuilder sb = new StringBuilder(zzmfVar.zza());
        for (int i4 = 0; i4 < zzmfVar.zza(); i4++) {
            byte zza = zzmfVar.zza(i4);
            if (zza == 34) {
                sb.append(ProtectedSandApp.s("핑"));
            } else if (zza == 39) {
                sb.append(ProtectedSandApp.s("핐"));
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb.append(ProtectedSandApp.s("핎"));
                        break;
                    case 8:
                        sb.append(ProtectedSandApp.s("핍"));
                        break;
                    case 9:
                        sb.append(ProtectedSandApp.s("핌"));
                        break;
                    case 10:
                        sb.append(ProtectedSandApp.s("핋"));
                        break;
                    case 11:
                        sb.append(ProtectedSandApp.s("핊"));
                        break;
                    case 12:
                        sb.append(ProtectedSandApp.s("핉"));
                        break;
                    case 13:
                        sb.append(ProtectedSandApp.s("핈"));
                        break;
                    default:
                        if (zza < 32 || zza > 126) {
                            sb.append('\\');
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
                sb.append(ProtectedSandApp.s("핏"));
            }
        }
        return sb.toString();
    }
}
