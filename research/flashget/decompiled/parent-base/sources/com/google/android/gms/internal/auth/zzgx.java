package com.google.android.gms.internal.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzgx {
    static String zza(zzef zzefVar) {
        StringBuilder sb = new StringBuilder(zzefVar.zzd());
        for (int i4 = 0; i4 < zzefVar.zzd(); i4++) {
            byte zza = zzefVar.zza(i4);
            if (zza == 34) {
                sb.append(ProtectedSandApp.s("콿"));
            } else if (zza == 39) {
                sb.append(ProtectedSandApp.s("콾"));
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb.append(ProtectedSandApp.s("콼"));
                        break;
                    case 8:
                        sb.append(ProtectedSandApp.s("콻"));
                        break;
                    case 9:
                        sb.append(ProtectedSandApp.s("콺"));
                        break;
                    case 10:
                        sb.append(ProtectedSandApp.s("콹"));
                        break;
                    case 11:
                        sb.append(ProtectedSandApp.s("콸"));
                        break;
                    case 12:
                        sb.append(ProtectedSandApp.s("콷"));
                        break;
                    case 13:
                        sb.append(ProtectedSandApp.s("콶"));
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
                sb.append(ProtectedSandApp.s("콽"));
            }
        }
        return sb.toString();
    }
}
