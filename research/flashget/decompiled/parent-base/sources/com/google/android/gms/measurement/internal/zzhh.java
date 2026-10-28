package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzov;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzhh implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzbz zza;
    private final /* synthetic */ ServiceConnection zzb;
    private final /* synthetic */ zzhi zzc;

    zzhh(zzhi zzhiVar, com.google.android.gms.internal.measurement.zzbz zzbzVar, ServiceConnection serviceConnection) {
        this.zza = zzbzVar;
        this.zzb = serviceConnection;
        this.zzc = zzhiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzhi zzhiVar = this.zzc;
        zzhf zzhfVar = zzhiVar.zza;
        str = zzhiVar.zzb;
        com.google.android.gms.internal.measurement.zzbz zzbzVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        Bundle zza = zzhfVar.zza(str, zzbzVar);
        zzhfVar.zza.zzl().zzt();
        zzhfVar.zza.zzy();
        if (zza != null) {
            long j4 = zza.getLong(ProtectedSandApp.s("\udecc"), 0L) * 1000;
            if (j4 == 0) {
                zzhfVar.zza.zzj().zzu().zza(ProtectedSandApp.s("\udecd"));
            } else {
                String string = zza.getString(ProtectedSandApp.s("\udece"));
                if (string == null || string.isEmpty()) {
                    zzhfVar.zza.zzj().zzg().zza(ProtectedSandApp.s("\udee1"));
                } else {
                    zzhfVar.zza.zzj().zzp().zza(ProtectedSandApp.s("\udecf"), string);
                    boolean z4 = zzov.zza() && zzhfVar.zza.zzf().zza(zzbh.zzcu);
                    Bundle zza2 = zzhfVar.zza.zzt().zza(Uri.parse(ProtectedSandApp.s("\uded0").concat(string)), z4);
                    if (zza2 == null) {
                        zzhfVar.zza.zzj().zzg().zza(ProtectedSandApp.s("\uded1"));
                    } else {
                        String s4 = ProtectedSandApp.s("\uded2");
                        if (!z4) {
                            String string2 = zza2.getString(ProtectedSandApp.s("\uded6"));
                            if (string2 != null && !ProtectedSandApp.s("\uded7").equalsIgnoreCase(string2) && !ProtectedSandApp.s("\uded8").equalsIgnoreCase(string2)) {
                                long j5 = zza.getLong(ProtectedSandApp.s("\uded9"), 0L) * 1000;
                                if (j5 == 0) {
                                    zzhfVar.zza.zzj().zzg().zza(ProtectedSandApp.s("\udeda"));
                                } else {
                                    zza2.putLong(s4, j5);
                                }
                            }
                        } else if (zza2.containsKey(ProtectedSandApp.s("\uded3")) || zza2.containsKey(ProtectedSandApp.s("\uded4"))) {
                            long j6 = zza.getLong(ProtectedSandApp.s("\uded5"), 0L) * 1000;
                            if (j6 > 0) {
                                zza2.putLong(s4, j6);
                            }
                        }
                        if (j4 == zzhfVar.zza.zzn().zzd.zza()) {
                            zzhfVar.zza.zzj().zzp().zza(ProtectedSandApp.s("\udedb"));
                        }
                        if (zzhfVar.zza.zzac()) {
                            zzhfVar.zza.zzn().zzd.zza(j4);
                            zzgq zzp = zzhfVar.zza.zzj().zzp();
                            String s5 = ProtectedSandApp.s("\udedc");
                            String s6 = ProtectedSandApp.s("\udedd");
                            zzp.zza(s5, s6);
                            zza2.putString(ProtectedSandApp.s("\udede"), s6);
                            zzhfVar.zza.zzp().zza(ProtectedSandApp.s("\udedf"), ProtectedSandApp.s("\udee0"), zza2, str);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(zzhfVar.zza.zza(), serviceConnection);
        }
    }
}
