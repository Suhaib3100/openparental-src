package com.google.android.gms.internal.fido;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.ui.input.pointer.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzhq {
    static final zzhp zza(InputStream inputStream, zzhs zzhsVar) throws zzhj {
        try {
            return zzb(inputStream, zzhsVar);
        } finally {
            try {
                zzhsVar.close();
            } catch (IOException unused) {
            }
        }
    }

    private static final zzhp zzb(InputStream inputStream, zzhs zzhsVar) throws zzhj {
        String s4 = ProtectedSandApp.s("탢");
        String s5 = ProtectedSandApp.s("탣");
        try {
            zzhr zzd = zzhsVar.zzd();
            if (zzd == null) {
                throw new zzhj(ProtectedSandApp.s("탩"));
            }
            try {
                byte zza = zzd.zza();
                byte zzb = zzd.zzb();
                int i4 = 0;
                if (zzb == Byte.MIN_VALUE) {
                    long zza2 = zzhsVar.zza();
                    if (zza2 > 1000) {
                        throw new zzhj(ProtectedSandApp.s("탨"));
                    }
                    zzc(zza, zza2, inputStream, zzhsVar);
                    zzhp[] zzhpVarArr = new zzhp[(int) zza2];
                    while (i4 < zza2) {
                        zzhpVarArr[i4] = zzb(inputStream, zzhsVar);
                        i4++;
                    }
                    return new zzhg(zzcc.zzi(zzhpVarArr));
                }
                if (zzb != -96) {
                    if (zzb == -64) {
                        throw new zzhj(ProtectedSandApp.s("탤"));
                    }
                    if (zzb == -32) {
                        return new zzhh(zzhsVar.zzf());
                    }
                    if (zzb == 0 || zzb == 32) {
                        long zzb2 = zzhsVar.zzb();
                        zzc(zza, zzb2 > 0 ? zzb2 : ~zzb2, inputStream, zzhsVar);
                        return new zzhk(zzb2);
                    }
                    if (zzb == 64) {
                        byte[] zzg = zzhsVar.zzg();
                        int length = zzg.length;
                        zzc(zza, length, inputStream, zzhsVar);
                        return new zzhi(zzgx.zzl(zzg, 0, length));
                    }
                    if (zzb == 96) {
                        String zze = zzhsVar.zze();
                        zzc(zza, zze.length(), inputStream, zzhsVar);
                        return new zzhn(zze);
                    }
                    throw new zzhj(s5 + zzd.zzc());
                }
                long zzc = zzhsVar.zzc();
                if (zzc > 1000) {
                    throw new zzhj(ProtectedSandApp.s("탧"));
                }
                zzc(zza, zzc, inputStream, zzhsVar);
                int i5 = (int) zzc;
                zzhl[] zzhlVarArr = new zzhl[i5];
                zzhp zzhpVar = null;
                int i6 = 0;
                while (i6 < zzc) {
                    zzhp zzb3 = zzb(inputStream, zzhsVar);
                    if (zzhpVar != null && zzb3.compareTo(zzhpVar) <= 0) {
                        throw new zzhf(String.format(ProtectedSandApp.s("탥"), zzhpVar.toString(), zzb3.toString()));
                    }
                    zzhlVarArr[i6] = new zzhl(zzb3, zzb(inputStream, zzhsVar));
                    i6++;
                    zzhpVar = zzb3;
                }
                TreeMap treeMap = new TreeMap();
                while (i4 < i5) {
                    zzhl zzhlVar = zzhlVarArr[i4];
                    if (treeMap.containsKey(zzhlVar.zza())) {
                        throw new zzhf(ProtectedSandApp.s("탦"));
                    }
                    treeMap.put(zzhlVar.zza(), zzhlVar.zzb());
                    i4++;
                }
                return new zzhm(zzcj.zzf(treeMap));
            } catch (IOException e4) {
                e = e4;
                throw new zzhj(s4, e);
            } catch (RuntimeException e5) {
                e = e5;
                throw new zzhj(s4, e);
            }
        } catch (IOException e6) {
            throw new zzhj(s4, e6);
        }
    }

    private static final void zzc(byte b5, long j4, InputStream inputStream, zzhs zzhsVar) throws IOException {
        String s4 = ProtectedSandApp.s("탪");
        switch (b5) {
            case 24:
                if (j4 < 24) {
                    throw new zzhf(s.a(s4, j4, ProtectedSandApp.s("탮")));
                }
                return;
            case 25:
                if (j4 < 256) {
                    throw new zzhf(s.a(s4, j4, ProtectedSandApp.s("탭")));
                }
                return;
            case 26:
                if (j4 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    throw new zzhf(s.a(s4, j4, ProtectedSandApp.s("탬")));
                }
                return;
            case 27:
                if (j4 < 4294967296L) {
                    throw new zzhf(s.a(s4, j4, ProtectedSandApp.s("탫")));
                }
                return;
            default:
                return;
        }
    }
}
