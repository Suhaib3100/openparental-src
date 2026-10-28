package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zziy implements Callable<List<zzno>> {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ Bundle zzb;
    private final /* synthetic */ zzic zzc;

    zziy(zzic zzicVar, zzo zzoVar, Bundle bundle) {
        this.zza = zzoVar;
        this.zzb = bundle;
        this.zzc = zzicVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzno> call() throws Exception {
        zznv zznvVar;
        zznv zznvVar2;
        zznvVar = this.zzc.zza;
        zznvVar.zzr();
        zznvVar2 = this.zzc.zza;
        zzo zzoVar = this.zza;
        Bundle bundle = this.zzb;
        zznvVar2.zzl().zzt();
        if (!zzpn.zza() || !zznvVar2.zze().zze(zzoVar.zza, zzbh.zzch) || zzoVar.zza == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray(ProtectedSandApp.s("\udf83"));
            long[] longArray = bundle.getLongArray(ProtectedSandApp.s("\udf84"));
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zznvVar2.zzj().zzg().zza(ProtectedSandApp.s("\udf8a"));
                } else {
                    for (int i4 = 0; i4 < intArray.length; i4++) {
                        zzal zzf = zznvVar2.zzf();
                        String str = zzoVar.zza;
                        int i5 = intArray[i4];
                        long j4 = longArray[i4];
                        Preconditions.checkNotEmpty(str);
                        zzf.zzt();
                        zzf.zzal();
                        try {
                            int delete = zzf.e_().delete(ProtectedSandApp.s("\udf85"), ProtectedSandApp.s("\udf86"), new String[]{str, String.valueOf(i5), String.valueOf(j4)});
                            zzf.zzj().zzp().zza(ProtectedSandApp.s("\udf87") + delete + ProtectedSandApp.s("\udf88"), str, Integer.valueOf(i5), Long.valueOf(j4));
                        } catch (SQLiteException e4) {
                            zzf.zzj().zzg().zza(ProtectedSandApp.s("\udf89"), zzgo.zza(str), e4);
                        }
                    }
                }
            }
        }
        return zznvVar2.zzf().zzk(zzoVar.zza);
    }
}
