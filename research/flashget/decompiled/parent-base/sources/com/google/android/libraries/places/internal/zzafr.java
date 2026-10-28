package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzafr {
    static String zza(zzacp zzacpVar) {
        StringBuilder sb = new StringBuilder(zzacpVar.zzd());
        for (int i4 = 0; i4 < zzacpVar.zzd(); i4++) {
            byte zza = zzacpVar.zza(i4);
            if (zza == 34) {
                sb.append(ProtectedSandApp.s("\ue7d2"));
            } else if (zza == 39) {
                sb.append(ProtectedSandApp.s("\ue7d1"));
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb.append(ProtectedSandApp.s("\ue7cf"));
                        break;
                    case 8:
                        sb.append(ProtectedSandApp.s("\ue7ce"));
                        break;
                    case 9:
                        sb.append(ProtectedSandApp.s("\ue7cd"));
                        break;
                    case 10:
                        sb.append(ProtectedSandApp.s("\ue7cc"));
                        break;
                    case 11:
                        sb.append(ProtectedSandApp.s("\ue7cb"));
                        break;
                    case 12:
                        sb.append(ProtectedSandApp.s("\ue7ca"));
                        break;
                    case 13:
                        sb.append(ProtectedSandApp.s("\ue7c9"));
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
                sb.append(ProtectedSandApp.s("\ue7d0"));
            }
        }
        return sb.toString();
    }
}
