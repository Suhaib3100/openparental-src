package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzno implements zznp {
    private static final zzhj<Boolean> zza;
    private static final zzhj<Boolean> zzb;
    private static final zzhj<Boolean> zzc;
    private static final zzhj<Boolean> zzd;

    static {
        zzhr zza2 = new zzhr(zzhk.zza(ProtectedSandApp.s("헧"))).zzb().zza();
        zza = zza2.zza(ProtectedSandApp.s("헨"), true);
        zzb = zza2.zza(ProtectedSandApp.s("헩"), true);
        zzc = zza2.zza(ProtectedSandApp.s("헪"), true);
        zzd = zza2.zza(ProtectedSandApp.s("헫"), true);
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final boolean zze() {
        return zzd.zza().booleanValue();
    }
}
