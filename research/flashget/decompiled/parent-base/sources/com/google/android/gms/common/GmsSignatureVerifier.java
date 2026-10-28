package com.google.android.gms.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzah;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class GmsSignatureVerifier {
    private static final zzab zza;
    private static final zzab zzb;
    private static final HashMap zzc;

    static {
        zzaa zzaaVar = new zzaa();
        zzaaVar.zza(ProtectedSandApp.s("쥐"));
        zzaaVar.zzb(204200000L);
        zzm zzmVar = zzo.zzf;
        zzaaVar.zzc(zzah.zzm(zzmVar.zzc(), zzo.zzd.zzc(), zzo.zzb.zzc()));
        zzm zzmVar2 = zzo.zze;
        byte[] zzc2 = zzmVar2.zzc();
        zzm zzmVar3 = zzo.zzc;
        zzaaVar.zzd(zzah.zzm(zzc2, zzmVar3.zzc(), zzo.zza.zzc()));
        zza = zzaaVar.zze();
        zzaa zzaaVar2 = new zzaa();
        zzaaVar2.zza(ProtectedSandApp.s("쥑"));
        zzaaVar2.zzb(82240000L);
        zzaaVar2.zzc(zzah.zzk(zzmVar.zzc()));
        zzaaVar2.zzd(zzah.zzl(zzmVar2.zzc(), zzmVar3.zzc()));
        zzb = zzaaVar2.zze();
        zzc = new HashMap();
    }
}
