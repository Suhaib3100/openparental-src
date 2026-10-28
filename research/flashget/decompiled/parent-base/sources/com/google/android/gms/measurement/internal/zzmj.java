package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzmj implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzbf zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzls zzf;

    zzmj(zzls zzlsVar, boolean z4, zzo zzoVar, boolean z5, zzbf zzbfVar, String str) {
        this.zza = z4;
        this.zzb = zzoVar;
        this.zzc = z5;
        this.zzd = zzbfVar;
        this.zze = str;
        this.zzf = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        long j4;
        long j5;
        long j6;
        zzgbVar = this.zzf.zzb;
        if (zzgbVar == null) {
            this.zzf.zzj().zzg().zza(ProtectedSandApp.s("\ue1c0"));
            return;
        }
        if (this.zza) {
            Preconditions.checkNotNull(this.zzb);
            this.zzf.zza(zzgbVar, this.zzc ? null : this.zzd, this.zzb);
        } else {
            boolean zza = this.zzf.zze().zza(zzbh.zzce);
            try {
                if (TextUtils.isEmpty(this.zze)) {
                    Preconditions.checkNotNull(this.zzb);
                    if (zza) {
                        j6 = this.zzf.zzu.zzb().currentTimeMillis();
                        try {
                            j4 = this.zzf.zzu.zzb().elapsedRealtime();
                        } catch (RemoteException e4) {
                            e = e4;
                            j4 = 0;
                            j5 = j6;
                            this.zzf.zzj().zzg().zza(ProtectedSandApp.s("\ue1c2"), e);
                            if (zza) {
                                zzgm.zza(this.zzf.zzu).zza(36301, 13, j5, this.zzf.zzu.zzb().currentTimeMillis(), (int) (this.zzf.zzu.zzb().elapsedRealtime() - j4));
                            }
                            this.zzf.zzar();
                        }
                    } else {
                        j6 = 0;
                        j4 = 0;
                    }
                    try {
                        zzgbVar.zza(this.zzd, this.zzb);
                        if (zza) {
                            this.zzf.zzj().zzp().zza(ProtectedSandApp.s("\ue1c1"));
                            zzgm.zza(this.zzf.zzu).zza(36301, 0, j6, this.zzf.zzu.zzb().currentTimeMillis(), (int) (this.zzf.zzu.zzb().elapsedRealtime() - j4));
                        }
                    } catch (RemoteException e5) {
                        e = e5;
                        j5 = j6;
                        this.zzf.zzj().zzg().zza(ProtectedSandApp.s("\ue1c2"), e);
                        if (zza && j5 != 0) {
                            zzgm.zza(this.zzf.zzu).zza(36301, 13, j5, this.zzf.zzu.zzb().currentTimeMillis(), (int) (this.zzf.zzu.zzb().elapsedRealtime() - j4));
                        }
                        this.zzf.zzar();
                    }
                } else {
                    zzgbVar.zza(this.zzd, this.zze, this.zzf.zzj().zzx());
                }
            } catch (RemoteException e6) {
                e = e6;
                j4 = 0;
                j5 = 0;
            }
        }
        this.zzf.zzar();
    }
}
