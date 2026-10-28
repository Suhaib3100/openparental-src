package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzja implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    final /* synthetic */ zzjz zzf;

    zzja(zzjz zzjzVar, String str, String str2, zzq zzqVar, boolean z5, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzjzVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = z5;
        this.zze = zzcfVar;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00c2: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:187), block:B:44:0x00c1 */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e6;
        Bundle bundle2;
        zzej zzejVar;
        Bundle bundle3 = new Bundle();
        try {
            try {
                zzjz zzjzVar = this.zzf;
                zzejVar = zzjzVar.zzb;
                if (zzejVar == null) {
                    zzjzVar.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("ᅉ"), this.zza, this.zzb);
                    this.zzf.zzt.zzv().zzS(this.zze, bundle3);
                    return;
                }
                Preconditions.checkNotNull(this.zzc);
                List<zzlk> zzh = zzejVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
                bundle = new Bundle();
                if (zzh != null) {
                    for (zzlk zzlkVar : zzh) {
                        String str = zzlkVar.zze;
                        if (str != null) {
                            bundle.putString(zzlkVar.zzb, str);
                        } else {
                            Long l5 = zzlkVar.zzd;
                            if (l5 != null) {
                                bundle.putLong(zzlkVar.zzb, l5.longValue());
                            } else {
                                Double d6 = zzlkVar.zzg;
                                if (d6 != null) {
                                    bundle.putDouble(zzlkVar.zzb, d6.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.zzf.zzQ();
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                } catch (RemoteException e7) {
                    e6 = e7;
                    this.zzf.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("ᅊ"), this.zza, e6);
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle3 = bundle2;
                this.zzf.zzt.zzv().zzS(this.zze, bundle3);
                throw th;
            }
        } catch (RemoteException e8) {
            bundle = bundle3;
            e6 = e8;
        } catch (Throwable th2) {
            th = th2;
            this.zzf.zzt.zzv().zzS(this.zze, bundle3);
            throw th;
        }
    }
}
