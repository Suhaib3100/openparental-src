package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzb extends zze {
    private final Map<String, Long> zza;
    private final Map<String, Integer> zzb;
    private long zzc;

    public zzb(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzb = new androidx.collection.a();
        this.zza = new androidx.collection.a();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgf zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzjq zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzlj zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzls zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zznb zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    static /* synthetic */ void zzb(zzb zzbVar, String str, long j4) {
        zzbVar.zzt();
        Preconditions.checkNotEmpty(str);
        Integer num = zzbVar.zzb.get(str);
        if (num == null) {
            zzbVar.zzj().zzg().zza(ProtectedSandApp.s("\udd73"), str);
            return;
        }
        zzlk zza = zzbVar.zzn().zza(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            zzbVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzbVar.zzb.remove(str);
        Long l4 = zzbVar.zza.get(str);
        if (l4 == null) {
            zzbVar.zzj().zzg().zza(ProtectedSandApp.s("\udd71"));
        } else {
            long longValue = j4 - l4.longValue();
            zzbVar.zza.remove(str);
            zzbVar.zza(str, longValue, zza);
        }
        if (zzbVar.zzb.isEmpty()) {
            long j5 = zzbVar.zzc;
            if (j5 == 0) {
                zzbVar.zzj().zzg().zza(ProtectedSandApp.s("\udd72"));
            } else {
                zzbVar.zza(j4 - j5, zza);
                zzbVar.zzc = 0L;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    static /* synthetic */ void zza(zzb zzbVar, String str, long j4) {
        zzbVar.zzt();
        Preconditions.checkNotEmpty(str);
        if (zzbVar.zzb.isEmpty()) {
            zzbVar.zzc = j4;
        }
        Integer num = zzbVar.zzb.get(str);
        if (num != null) {
            zzbVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzbVar.zzb.size() >= 100) {
            zzbVar.zzj().zzu().zza(ProtectedSandApp.s("\udd6c"));
        } else {
            zzbVar.zzb.put(str, 1);
            zzbVar.zza.put(str, Long.valueOf(j4));
        }
    }

    public final void zza(String str, long j4) {
        if (str != null && str.length() != 0) {
            zzl().zzb(new zza(this, str, j4));
        } else {
            zzj().zzg().zza(ProtectedSandApp.s("\udd74"));
        }
    }

    @n1
    private final void zza(long j4, zzlk zzlkVar) {
        if (zzlkVar == null) {
            zzj().zzp().zza(ProtectedSandApp.s("\udd67"));
            return;
        }
        if (j4 < 1000) {
            zzj().zzp().zza(ProtectedSandApp.s("\udd68"), Long.valueOf(j4));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong(ProtectedSandApp.s("\udd69"), j4);
            zzos.zza(zzlkVar, bundle, true);
            zzm().zzc(ProtectedSandApp.s("\udd6a"), ProtectedSandApp.s("\udd6b"), bundle);
        }
    }

    public final void zzb(String str, long j4) {
        if (str != null && str.length() != 0) {
            zzl().zzb(new zzd(this, str, j4));
        } else {
            zzj().zzg().zza(ProtectedSandApp.s("\udd74"));
        }
    }

    @n1
    private final void zza(String str, long j4, zzlk zzlkVar) {
        if (zzlkVar == null) {
            zzj().zzp().zza(ProtectedSandApp.s("\udd6d"));
            return;
        }
        if (j4 < 1000) {
            zzj().zzp().zza(ProtectedSandApp.s("\udd6e"), Long.valueOf(j4));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(ProtectedSandApp.s("\udd6f"), str);
            bundle.putLong(ProtectedSandApp.s("\udd69"), j4);
            zzos.zza(zzlkVar, bundle, true);
            zzm().zzc(ProtectedSandApp.s("\udd6a"), ProtectedSandApp.s("\udd70"), bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zzb(long j4) {
        Iterator<String> it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put(it.next(), Long.valueOf(j4));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j4;
    }

    @n1
    public final void zza(long j4) {
        zzlk zza = zzn().zza(false);
        for (String str : this.zza.keySet()) {
            zza(str, j4 - this.zza.get(str).longValue(), zza);
        }
        if (!this.zza.isEmpty()) {
            zza(j4 - this.zzc, zza);
        }
        zzb(j4);
    }
}
