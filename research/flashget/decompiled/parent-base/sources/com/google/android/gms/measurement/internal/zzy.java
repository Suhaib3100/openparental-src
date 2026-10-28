package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzy {
    private zzfy.zzf zza;
    private Long zzb;
    private long zzc;
    private final /* synthetic */ zzt zzd;

    final zzfy.zzf zza(String str, zzfy.zzf zzfVar) {
        Object obj;
        String zzg = zzfVar.zzg();
        List<zzfy.zzh> zzh = zzfVar.zzh();
        this.zzd.g_();
        String s4 = ProtectedSandApp.s("\ue4c2");
        Long l4 = (Long) zzoo.zzb(zzfVar, s4);
        boolean z4 = l4 != null;
        if (z4 && zzg.equals(ProtectedSandApp.s("\ue4c3"))) {
            Preconditions.checkNotNull(l4);
            this.zzd.g_();
            zzg = (String) zzoo.zzb(zzfVar, ProtectedSandApp.s("\ue4c4"));
            if (TextUtils.isEmpty(zzg)) {
                this.zzd.zzj().zzn().zza(ProtectedSandApp.s("\ue4c5"), l4);
                return null;
            }
            if (this.zza == null || this.zzb == null || l4.longValue() != this.zzb.longValue()) {
                Pair<zzfy.zzf, Long> zza = this.zzd.zzh().zza(str, l4);
                if (zza == null || (obj = zza.first) == null) {
                    this.zzd.zzj().zzn().zza(ProtectedSandApp.s("\ue4ca"), zzg, l4);
                    return null;
                }
                this.zza = (zzfy.zzf) obj;
                this.zzc = ((Long) zza.second).longValue();
                this.zzd.g_();
                this.zzb = (Long) zzoo.zzb(this.zza, s4);
            }
            long j4 = this.zzc - 1;
            this.zzc = j4;
            if (j4 <= 0) {
                zzal zzh2 = this.zzd.zzh();
                zzh2.zzt();
                zzh2.zzj().zzp().zza(ProtectedSandApp.s("\ue4c6"), str);
                try {
                    zzh2.e_().execSQL(ProtectedSandApp.s("\ue4c7"), new String[]{str});
                } catch (SQLiteException e4) {
                    zzh2.zzj().zzg().zza(ProtectedSandApp.s("\ue4c8"), e4);
                }
            } else {
                this.zzd.zzh().zza(str, l4, this.zzc, this.zza);
            }
            ArrayList arrayList = new ArrayList();
            for (zzfy.zzh zzhVar : this.zza.zzh()) {
                this.zzd.g_();
                if (zzoo.zza(zzfVar, zzhVar.zzg()) == null) {
                    arrayList.add(zzhVar);
                }
            }
            if (arrayList.isEmpty()) {
                this.zzd.zzj().zzn().zza(ProtectedSandApp.s("\ue4c9"), zzg);
            } else {
                arrayList.addAll(zzh);
                zzh = arrayList;
            }
        } else if (z4) {
            this.zzb = l4;
            this.zza = zzfVar;
            this.zzd.g_();
            long longValue = ((Long) zzoo.zza(zzfVar, ProtectedSandApp.s("\ue4cb"), (Object) 0L)).longValue();
            this.zzc = longValue;
            if (longValue <= 0) {
                this.zzd.zzj().zzn().zza(ProtectedSandApp.s("\ue4cc"), zzg);
            } else {
                this.zzd.zzh().zza(str, (Long) Preconditions.checkNotNull(l4), this.zzc, zzfVar);
            }
        }
        return (zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) zzfVar.zzcd().zza(zzg).zzd().zza(zzh).zzai());
    }

    private zzy(zzt zztVar) {
        this.zzd = zztVar;
    }
}
