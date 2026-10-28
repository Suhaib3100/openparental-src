package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzhe {
    static String zza(zzgx zzgxVar) {
        StringBuilder sb = new StringBuilder(zzgxVar.zzd());
        for (int i4 = 0; i4 < zzgxVar.zzd(); i4++) {
            byte zza = zzgxVar.zza(i4);
            if (zza == 34) {
                sb.append(ProtectedSandApp.s("탌"));
            } else if (zza == 39) {
                sb.append(ProtectedSandApp.s("탋"));
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb.append(ProtectedSandApp.s("탉"));
                        break;
                    case 8:
                        sb.append(ProtectedSandApp.s("탈"));
                        break;
                    case 9:
                        sb.append(ProtectedSandApp.s("탇"));
                        break;
                    case 10:
                        sb.append(ProtectedSandApp.s("탆"));
                        break;
                    case 11:
                        sb.append(ProtectedSandApp.s("탅"));
                        break;
                    case 12:
                        sb.append(ProtectedSandApp.s("탄"));
                        break;
                    case 13:
                        sb.append(ProtectedSandApp.s("탃"));
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
                sb.append(ProtectedSandApp.s("탊"));
            }
        }
        return sb.toString();
    }
}
