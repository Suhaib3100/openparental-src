package com.google.android.gms.measurement.internal;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzhr implements com.google.android.gms.internal.measurement.zzv {
    private final /* synthetic */ zzhl zza;

    zzhr(zzhl zzhlVar) {
        this.zza = zzhlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(com.google.android.gms.internal.measurement.zzs zzsVar, String str, List<String> list, boolean z4, boolean z5) {
        int i4 = zzht.zza[zzsVar.ordinal()];
        zzgq zzo = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? this.zza.zzj().zzo() : this.zza.zzj().zzp() : z4 ? this.zza.zzj().zzw() : !z5 ? this.zza.zzj().zzv() : this.zza.zzj().zzu() : z4 ? this.zza.zzj().zzn() : !z5 ? this.zza.zzj().zzm() : this.zza.zzj().zzg() : this.zza.zzj().zzc();
        int size = list.size();
        if (size == 1) {
            zzo.zza(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzo.zza(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzo.zza(str);
        } else {
            zzo.zza(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
