package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzdv {
    private static final zzdz zza = new zzds();
    private static final zzdy zzb = new zzdt();
    private final zzdz zze;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdy zzf = null;

    public final zzdv zza(zzdy zzdyVar) {
        this.zzf = zzdyVar;
        return this;
    }

    public final zzea zzd() {
        return new zzdx(this, null);
    }

    final void zzg(zzdk zzdkVar) {
        String s4 = ProtectedSandApp.s("큐");
        zzfk.zza(zzdkVar, s4);
        if (!zzdkVar.zzb()) {
            zzdz zzdzVar = zza;
            zzfk.zza(zzdkVar, s4);
            this.zzd.remove(zzdkVar);
            this.zzc.put(zzdkVar, zzdzVar);
            return;
        }
        zzdy zzdyVar = zzb;
        zzfk.zza(zzdkVar, s4);
        if (!zzdkVar.zzb()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("큑"));
        }
        this.zzc.remove(zzdkVar);
        this.zzd.put(zzdkVar, zzdyVar);
    }
}
