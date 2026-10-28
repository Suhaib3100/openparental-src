package com.google.android.gms.measurement.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzz extends zzaa {
    private zzfo.zze zzg;
    private final /* synthetic */ zzt zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzz(zzt zztVar, String str, int i4, zzfo.zze zzeVar) {
        super(str, i4);
        this.zzh = zztVar;
        this.zzg = zzeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaa
    final int zza() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzaa
    final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzaa
    final boolean zzc() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean zza(Long l4, Long l5, zzfy.zzo zzoVar, boolean z4) {
        Object[] objArr = com.google.android.gms.internal.measurement.zzoe.zza() && this.zzh.zze().zzf(this.zza, zzbh.zzbn);
        boolean zzf = this.zzg.zzf();
        boolean zzg = this.zzg.zzg();
        boolean zzh = this.zzg.zzh();
        Object[] objArr2 = zzf || zzg || zzh;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z4 && objArr2 != true) {
            this.zzh.zzj().zzp().zza(ProtectedSandApp.s("\ue4cd"), Integer.valueOf(this.zzb), this.zzg.zzi() ? Integer.valueOf(this.zzg.zza()) : null);
            return true;
        }
        zzfo.zzc zzb = this.zzg.zzb();
        boolean zzf2 = zzb.zzf();
        if (zzoVar.zzk()) {
            if (zzb.zzh()) {
                bool = zzaa.zza(zzaa.zza(zzoVar.zzc(), zzb.zzc()), zzf2);
            } else {
                this.zzh.zzj().zzu().zza(ProtectedSandApp.s("\ue4ce"), this.zzh.zzi().zzc(zzoVar.zzg()));
            }
        } else if (zzoVar.zzi()) {
            if (zzb.zzh()) {
                bool = zzaa.zza(zzaa.zza(zzoVar.zza(), zzb.zzc()), zzf2);
            } else {
                this.zzh.zzj().zzu().zza(ProtectedSandApp.s("\ue4cf"), this.zzh.zzi().zzc(zzoVar.zzg()));
            }
        } else if (!zzoVar.zzm()) {
            this.zzh.zzj().zzu().zza(ProtectedSandApp.s("\ue4d2"), this.zzh.zzi().zzc(zzoVar.zzg()));
        } else if (zzb.zzj()) {
            bool = zzaa.zza(zzaa.zza(zzoVar.zzh(), zzb.zzd(), this.zzh.zzj()), zzf2);
        } else if (!zzb.zzh()) {
            this.zzh.zzj().zzu().zza(ProtectedSandApp.s("\ue4d0"), this.zzh.zzi().zzc(zzoVar.zzg()));
        } else if (zzoo.zzb(zzoVar.zzh())) {
            bool = zzaa.zza(zzaa.zza(zzoVar.zzh(), zzb.zzc()), zzf2);
        } else {
            this.zzh.zzj().zzu().zza(ProtectedSandApp.s("\ue4d1"), this.zzh.zzi().zzc(zzoVar.zzg()), zzoVar.zzh());
        }
        this.zzh.zzj().zzp().zza(ProtectedSandApp.s("\ue4d4"), bool == null ? ProtectedSandApp.s("\ue4d3") : bool);
        if (bool == null) {
            return false;
        }
        this.zzc = Boolean.TRUE;
        if (zzh && !bool.booleanValue()) {
            return true;
        }
        if (!z4 || this.zzg.zzf()) {
            this.zzd = bool;
        }
        if (bool.booleanValue() && objArr2 != false && zzoVar.zzl()) {
            long zzd = zzoVar.zzd();
            if (l4 != null) {
                zzd = l4.longValue();
            }
            if (objArr != false && this.zzg.zzf() && !this.zzg.zzg() && l5 != null) {
                zzd = l5.longValue();
            }
            if (this.zzg.zzg()) {
                this.zzf = Long.valueOf(zzd);
            } else {
                this.zze = Long.valueOf(zzd);
            }
        }
        return true;
    }
}
